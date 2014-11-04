package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RMON2MIBDef extends MIB
{
    public static final RMON2MIBDef RMON2MIB = new RMON2MIBDef();

    static { MIBs.getInstance().registerMIB(RMON2MIBDef.RMON2MIB); }

    public final RmonEnt rmon;

    /** { rmon 1 } through { rmon 10 } are defined in RMON andthe Token Ring RMON MIB [RFC1513]*/
    public final ProtocolDirEnt protocolDir;

    public final ProtocolDistEnt protocolDist;

    public final AddressMapEnt addressMap;

    public final NlHostEnt nlHost;

    public final NlMatrixEnt nlMatrix;

    public final AlHostEnt alHost;

    public final AlMatrixEnt alMatrix;

    public final UsrHistoryEnt usrHistory;

    public final ProbeConfigEnt probeConfig;

    /** Extensions to the RMON 1 MIB for RMON 2 devicesThese extensions include the standard LastCreateTime TextualConvention for all control tables, as well as an augmentation ofthe filter entry that provides variable-length offsets intopackets.

Each of the following, except for filterDroppedFrames, is aread-only object which, if implemented, automatically appears whenthe RMON1 row it is associated with is created.*/
    public final EtherStats2TableEnt etherStats2Table;

    public final HistoryControl2TableEnt historyControl2Table;

    public final HostControl2TableEnt hostControl2Table;

    public final MatrixControl2TableEnt matrixControl2Table;

    public final Channel2TableEnt channel2Table;

    public final TokenRingMLStats2TableEnt tokenRingMLStats2Table;

    public final TokenRingPStats2TableEnt tokenRingPStats2Table;

    public final RingStationControl2TableEnt ringStationControl2Table;

    public final SourceRoutingStats2TableEnt sourceRoutingStats2Table;

    public final Filter2TableEnt filter2Table;

    /** Conformance Macros*/
    public final Rmon2MIBCompliancesEnt rmon2MIBCompliances;

    public final Rmon2MIBGroupsEnt rmon2MIBGroups;

    private RMON2MIBDef()
    {
        super("RMON2-MIB");
        this.rmon = new RmonEnt(this, null);
        this.protocolDir = new ProtocolDirEnt(this, null);
        this.protocolDist = new ProtocolDistEnt(this, null);
        this.addressMap = new AddressMapEnt(this, null);
        this.nlHost = new NlHostEnt(this, null);
        this.nlMatrix = new NlMatrixEnt(this, null);
        this.alHost = new AlHostEnt(this, null);
        this.alMatrix = new AlMatrixEnt(this, null);
        this.usrHistory = new UsrHistoryEnt(this, null);
        this.probeConfig = new ProbeConfigEnt(this, null);
        this.etherStats2Table = new EtherStats2TableEnt(this, null);
        this.historyControl2Table = new HistoryControl2TableEnt(this, null);
        this.hostControl2Table = new HostControl2TableEnt(this, null);
        this.matrixControl2Table = new MatrixControl2TableEnt(this, null);
        this.channel2Table = new Channel2TableEnt(this, null);
        this.tokenRingMLStats2Table = new TokenRingMLStats2TableEnt(this, null);
        this.tokenRingPStats2Table = new TokenRingPStats2TableEnt(this, null);
        this.ringStationControl2Table = new RingStationControl2TableEnt(this, null);
        this.sourceRoutingStats2Table = new SourceRoutingStats2TableEnt(this, null);
        this.filter2Table = new Filter2TableEnt(this, null);
        this.rmon2MIBCompliances = new Rmon2MIBCompliancesEnt(this, null);
        this.rmon2MIBGroups = new Rmon2MIBGroupsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rmon,
            this.protocolDir,
            this.protocolDist,
            this.addressMap,
            this.nlHost,
            this.nlMatrix,
            this.alHost,
            this.alMatrix,
            this.usrHistory,
            this.probeConfig,
            this.etherStats2Table,
            this.historyControl2Table,
            this.hostControl2Table,
            this.matrixControl2Table,
            this.channel2Table,
            this.tokenRingMLStats2Table,
            this.tokenRingPStats2Table,
            this.ringStationControl2Table,
            this.sourceRoutingStats2Table,
            this.filter2Table,
            this.rmon2MIBCompliances,
            this.rmon2MIBGroups
        };
    }

    public static final class RmonEnt extends MIBEntry<RMON2MIBDef>
    {
        public final RmonConformanceEnt rmonConformance;

        private RmonEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "rmon", "1.3.6.1.2.1.16", false, false, false, false);
            this.rmonConformance = new RmonConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rmonConformance
            };
        }
        public static final class RmonConformanceEnt extends MIBEntry<RMON2MIBDef>
        {
            private RmonConformanceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "rmonConformance", "1.3.6.1.2.1.16.20", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class ProtocolDirEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Protocol Directory GroupLists the inventory of protocols the probe has the capability ofmonitoring and allows the addition, deletion, and configuration ofentries in this list.*/
        public final ProtocolDirLastChangeEnt protocolDirLastChange;

        public final ProtocolDirTableEnt protocolDirTable;

        private ProtocolDirEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "protocolDir", "1.3.6.1.2.1.16.11", false, false, false, false);
            this.protocolDirLastChange = new ProtocolDirLastChangeEnt(mib, this);
            this.protocolDirTable = new ProtocolDirTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.protocolDirLastChange,
                this.protocolDirTable
            };
        }
        public static final class ProtocolDirLastChangeEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProtocolDirLastChangeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "protocolDirLastChange", "1.3.6.1.2.1.16.11.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProtocolDirTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final ProtocolDirEntryEnt protocolDirEntry;

            private ProtocolDirTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "protocolDirTable", "1.3.6.1.2.1.16.11.2", false, true, false, false);
                this.protocolDirEntry = new ProtocolDirEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.protocolDirEntry
                };
            }
            public static final class ProtocolDirEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final ProtocolDirIDEnt protocolDirID;

                public final ProtocolDirParametersEnt protocolDirParameters;

                public final ProtocolDirLocalIndexEnt protocolDirLocalIndex;

                public final ProtocolDirDescrEnt protocolDirDescr;

                public final ProtocolDirTypeEnt protocolDirType;

                public final ProtocolDirAddressMapConfigEnt protocolDirAddressMapConfig;

                public final ProtocolDirHostConfigEnt protocolDirHostConfig;

                public final ProtocolDirMatrixConfigEnt protocolDirMatrixConfig;

                public final ProtocolDirOwnerEnt protocolDirOwner;

                public final ProtocolDirStatusEnt protocolDirStatus;

                private ProtocolDirEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "protocolDirEntry", "1.3.6.1.2.1.16.11.2.1", false, false, false, true);
                    this.protocolDirID = new ProtocolDirIDEnt(mib, this);
                    this.protocolDirParameters = new ProtocolDirParametersEnt(mib, this);
                    this.protocolDirLocalIndex = new ProtocolDirLocalIndexEnt(mib, this);
                    this.protocolDirDescr = new ProtocolDirDescrEnt(mib, this);
                    this.protocolDirType = new ProtocolDirTypeEnt(mib, this);
                    this.protocolDirAddressMapConfig = new ProtocolDirAddressMapConfigEnt(mib, this);
                    this.protocolDirHostConfig = new ProtocolDirHostConfigEnt(mib, this);
                    this.protocolDirMatrixConfig = new ProtocolDirMatrixConfigEnt(mib, this);
                    this.protocolDirOwner = new ProtocolDirOwnerEnt(mib, this);
                    this.protocolDirStatus = new ProtocolDirStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.protocolDirID,
                        this.protocolDirParameters,
                        this.protocolDirLocalIndex,
                        this.protocolDirDescr,
                        this.protocolDirType,
                        this.protocolDirAddressMapConfig,
                        this.protocolDirHostConfig,
                        this.protocolDirMatrixConfig,
                        this.protocolDirOwner,
                        this.protocolDirStatus
                    };
                }
                public static final class ProtocolDirIDEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirIDEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirID", "1.3.6.1.2.1.16.11.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirParametersEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirParametersEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirParameters", "1.3.6.1.2.1.16.11.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirLocalIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirLocalIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirLocalIndex", "1.3.6.1.2.1.16.11.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirDescrEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirDescrEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirDescr", "1.3.6.1.2.1.16.11.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirTypeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirTypeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirType", "1.3.6.1.2.1.16.11.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirAddressMapConfigEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirAddressMapConfigEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirAddressMapConfig", "1.3.6.1.2.1.16.11.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirHostConfigEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirHostConfigEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirHostConfig", "1.3.6.1.2.1.16.11.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirMatrixConfigEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirMatrixConfigEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirMatrixConfig", "1.3.6.1.2.1.16.11.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirOwner", "1.3.6.1.2.1.16.11.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDirStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDirStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDirStatus", "1.3.6.1.2.1.16.11.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class ProtocolDistEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Protocol Distribution Group  (protocolDist)Collects the relative amounts of octets and packets for thedifferent protocols detected on a network segment.protocolDistControlTable,protocolDistStatsTable*/
        public final ProtocolDistControlTableEnt protocolDistControlTable;

        /** per interface protocol distribution statistics table*/
        public final ProtocolDistStatsTableEnt protocolDistStatsTable;

        private ProtocolDistEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "protocolDist", "1.3.6.1.2.1.16.12", false, false, false, false);
            this.protocolDistControlTable = new ProtocolDistControlTableEnt(mib, this);
            this.protocolDistStatsTable = new ProtocolDistStatsTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.protocolDistControlTable,
                this.protocolDistStatsTable
            };
        }
        public static final class ProtocolDistControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final ProtocolDistControlEntryEnt protocolDistControlEntry;

            private ProtocolDistControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "protocolDistControlTable", "1.3.6.1.2.1.16.12.1", false, true, false, false);
                this.protocolDistControlEntry = new ProtocolDistControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.protocolDistControlEntry
                };
            }
            public static final class ProtocolDistControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final ProtocolDistControlIndexEnt protocolDistControlIndex;

                public final ProtocolDistControlDataSourceEnt protocolDistControlDataSource;

                public final ProtocolDistControlDroppedFramesEnt protocolDistControlDroppedFrames;

                public final ProtocolDistControlCreateTimeEnt protocolDistControlCreateTime;

                public final ProtocolDistControlOwnerEnt protocolDistControlOwner;

                public final ProtocolDistControlStatusEnt protocolDistControlStatus;

                private ProtocolDistControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "protocolDistControlEntry", "1.3.6.1.2.1.16.12.1.1", false, false, false, true);
                    this.protocolDistControlIndex = new ProtocolDistControlIndexEnt(mib, this);
                    this.protocolDistControlDataSource = new ProtocolDistControlDataSourceEnt(mib, this);
                    this.protocolDistControlDroppedFrames = new ProtocolDistControlDroppedFramesEnt(mib, this);
                    this.protocolDistControlCreateTime = new ProtocolDistControlCreateTimeEnt(mib, this);
                    this.protocolDistControlOwner = new ProtocolDistControlOwnerEnt(mib, this);
                    this.protocolDistControlStatus = new ProtocolDistControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.protocolDistControlIndex,
                        this.protocolDistControlDataSource,
                        this.protocolDistControlDroppedFrames,
                        this.protocolDistControlCreateTime,
                        this.protocolDistControlOwner,
                        this.protocolDistControlStatus
                    };
                }
                public static final class ProtocolDistControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistControlIndex", "1.3.6.1.2.1.16.12.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDistControlDataSourceEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistControlDataSourceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistControlDataSource", "1.3.6.1.2.1.16.12.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDistControlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistControlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistControlDroppedFrames", "1.3.6.1.2.1.16.12.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDistControlCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistControlCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistControlCreateTime", "1.3.6.1.2.1.16.12.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDistControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistControlOwner", "1.3.6.1.2.1.16.12.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDistControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistControlStatus", "1.3.6.1.2.1.16.12.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class ProtocolDistStatsTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final ProtocolDistStatsEntryEnt protocolDistStatsEntry;

            private ProtocolDistStatsTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "protocolDistStatsTable", "1.3.6.1.2.1.16.12.2", false, true, false, false);
                this.protocolDistStatsEntry = new ProtocolDistStatsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.protocolDistStatsEntry
                };
            }
            public static final class ProtocolDistStatsEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final ProtocolDistStatsPktsEnt protocolDistStatsPkts;

                public final ProtocolDistStatsOctetsEnt protocolDistStatsOctets;

                private ProtocolDistStatsEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "protocolDistStatsEntry", "1.3.6.1.2.1.16.12.2.1", false, false, false, true);
                    this.protocolDistStatsPkts = new ProtocolDistStatsPktsEnt(mib, this);
                    this.protocolDistStatsOctets = new ProtocolDistStatsOctetsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.protocolDistStatsPkts,
                        this.protocolDistStatsOctets
                    };
                }
                public static final class ProtocolDistStatsPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistStatsPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistStatsPkts", "1.3.6.1.2.1.16.12.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ProtocolDistStatsOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private ProtocolDistStatsOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "protocolDistStatsOctets", "1.3.6.1.2.1.16.12.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class AddressMapEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Address Map Group   (addressMap)Lists MAC address to network address bindings discovered by theprobe and what interface they were last seen on.addressMapControlTableaddressMapTable*/
        public final AddressMapInsertsEnt addressMapInserts;

        public final AddressMapDeletesEnt addressMapDeletes;

        public final AddressMapMaxDesiredEntriesEnt addressMapMaxDesiredEntries;

        public final AddressMapControlTableEnt addressMapControlTable;

        public final AddressMapTableEnt addressMapTable;

        private AddressMapEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "addressMap", "1.3.6.1.2.1.16.13", false, false, false, false);
            this.addressMapInserts = new AddressMapInsertsEnt(mib, this);
            this.addressMapDeletes = new AddressMapDeletesEnt(mib, this);
            this.addressMapMaxDesiredEntries = new AddressMapMaxDesiredEntriesEnt(mib, this);
            this.addressMapControlTable = new AddressMapControlTableEnt(mib, this);
            this.addressMapTable = new AddressMapTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.addressMapInserts,
                this.addressMapDeletes,
                this.addressMapMaxDesiredEntries,
                this.addressMapControlTable,
                this.addressMapTable
            };
        }
        public static final class AddressMapInsertsEnt extends MIBEntry<RMON2MIBDef>
        {
            private AddressMapInsertsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "addressMapInserts", "1.3.6.1.2.1.16.13.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AddressMapDeletesEnt extends MIBEntry<RMON2MIBDef>
        {
            private AddressMapDeletesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "addressMapDeletes", "1.3.6.1.2.1.16.13.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AddressMapMaxDesiredEntriesEnt extends MIBEntry<RMON2MIBDef>
        {
            private AddressMapMaxDesiredEntriesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "addressMapMaxDesiredEntries", "1.3.6.1.2.1.16.13.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AddressMapControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AddressMapControlEntryEnt addressMapControlEntry;

            private AddressMapControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "addressMapControlTable", "1.3.6.1.2.1.16.13.4", false, true, false, false);
                this.addressMapControlEntry = new AddressMapControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.addressMapControlEntry
                };
            }
            public static final class AddressMapControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AddressMapControlIndexEnt addressMapControlIndex;

                public final AddressMapControlDataSourceEnt addressMapControlDataSource;

                public final AddressMapControlDroppedFramesEnt addressMapControlDroppedFrames;

                public final AddressMapControlOwnerEnt addressMapControlOwner;

                public final AddressMapControlStatusEnt addressMapControlStatus;

                private AddressMapControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "addressMapControlEntry", "1.3.6.1.2.1.16.13.4.1", false, false, false, true);
                    this.addressMapControlIndex = new AddressMapControlIndexEnt(mib, this);
                    this.addressMapControlDataSource = new AddressMapControlDataSourceEnt(mib, this);
                    this.addressMapControlDroppedFrames = new AddressMapControlDroppedFramesEnt(mib, this);
                    this.addressMapControlOwner = new AddressMapControlOwnerEnt(mib, this);
                    this.addressMapControlStatus = new AddressMapControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.addressMapControlIndex,
                        this.addressMapControlDataSource,
                        this.addressMapControlDroppedFrames,
                        this.addressMapControlOwner,
                        this.addressMapControlStatus
                    };
                }
                public static final class AddressMapControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapControlIndex", "1.3.6.1.2.1.16.13.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapControlDataSourceEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapControlDataSourceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapControlDataSource", "1.3.6.1.2.1.16.13.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapControlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapControlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapControlDroppedFrames", "1.3.6.1.2.1.16.13.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapControlOwner", "1.3.6.1.2.1.16.13.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapControlStatus", "1.3.6.1.2.1.16.13.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AddressMapTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AddressMapEntryEnt addressMapEntry;

            private AddressMapTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "addressMapTable", "1.3.6.1.2.1.16.13.5", false, true, false, false);
                this.addressMapEntry = new AddressMapEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.addressMapEntry
                };
            }
            public static final class AddressMapEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AddressMapTimeMarkEnt addressMapTimeMark;

                public final AddressMapNetworkAddressEnt addressMapNetworkAddress;

                public final AddressMapSourceEnt addressMapSource;

                public final AddressMapPhysicalAddressEnt addressMapPhysicalAddress;

                public final AddressMapLastChangeEnt addressMapLastChange;

                private AddressMapEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "addressMapEntry", "1.3.6.1.2.1.16.13.5.1", false, false, false, true);
                    this.addressMapTimeMark = new AddressMapTimeMarkEnt(mib, this);
                    this.addressMapNetworkAddress = new AddressMapNetworkAddressEnt(mib, this);
                    this.addressMapSource = new AddressMapSourceEnt(mib, this);
                    this.addressMapPhysicalAddress = new AddressMapPhysicalAddressEnt(mib, this);
                    this.addressMapLastChange = new AddressMapLastChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.addressMapTimeMark,
                        this.addressMapNetworkAddress,
                        this.addressMapSource,
                        this.addressMapPhysicalAddress,
                        this.addressMapLastChange
                    };
                }
                public static final class AddressMapTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapTimeMark", "1.3.6.1.2.1.16.13.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapNetworkAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapNetworkAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapNetworkAddress", "1.3.6.1.2.1.16.13.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapSourceEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapSourceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapSource", "1.3.6.1.2.1.16.13.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapPhysicalAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapPhysicalAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapPhysicalAddress", "1.3.6.1.2.1.16.13.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AddressMapLastChangeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AddressMapLastChangeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "addressMapLastChange", "1.3.6.1.2.1.16.13.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class NlHostEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Network Layer Host GroupCounts the amount of traffic sent from and to each network addressdiscovered by the probe.Note that while the hlHostControlTable also has objects thatcontrol an optional alHostTable, implementation of the alHostTable isnot required to fully implement this group.*/
        public final HlHostControlTableEnt hlHostControlTable;

        public final NlHostTableEnt nlHostTable;

        private NlHostEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "nlHost", "1.3.6.1.2.1.16.14", false, false, false, false);
            this.hlHostControlTable = new HlHostControlTableEnt(mib, this);
            this.nlHostTable = new NlHostTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hlHostControlTable,
                this.nlHostTable
            };
        }
        public static final class HlHostControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final HlHostControlEntryEnt hlHostControlEntry;

            private HlHostControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "hlHostControlTable", "1.3.6.1.2.1.16.14.1", false, true, false, false);
                this.hlHostControlEntry = new HlHostControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hlHostControlEntry
                };
            }
            public static final class HlHostControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final HlHostControlIndexEnt hlHostControlIndex;

                public final HlHostControlDataSourceEnt hlHostControlDataSource;

                public final HlHostControlNlDroppedFramesEnt hlHostControlNlDroppedFrames;

                public final HlHostControlNlInsertsEnt hlHostControlNlInserts;

                public final HlHostControlNlDeletesEnt hlHostControlNlDeletes;

                public final HlHostControlNlMaxDesiredEntriesEnt hlHostControlNlMaxDesiredEntries;

                public final HlHostControlAlDroppedFramesEnt hlHostControlAlDroppedFrames;

                public final HlHostControlAlInsertsEnt hlHostControlAlInserts;

                public final HlHostControlAlDeletesEnt hlHostControlAlDeletes;

                public final HlHostControlAlMaxDesiredEntriesEnt hlHostControlAlMaxDesiredEntries;

                public final HlHostControlOwnerEnt hlHostControlOwner;

                public final HlHostControlStatusEnt hlHostControlStatus;

                private HlHostControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "hlHostControlEntry", "1.3.6.1.2.1.16.14.1.1", false, false, false, true);
                    this.hlHostControlIndex = new HlHostControlIndexEnt(mib, this);
                    this.hlHostControlDataSource = new HlHostControlDataSourceEnt(mib, this);
                    this.hlHostControlNlDroppedFrames = new HlHostControlNlDroppedFramesEnt(mib, this);
                    this.hlHostControlNlInserts = new HlHostControlNlInsertsEnt(mib, this);
                    this.hlHostControlNlDeletes = new HlHostControlNlDeletesEnt(mib, this);
                    this.hlHostControlNlMaxDesiredEntries = new HlHostControlNlMaxDesiredEntriesEnt(mib, this);
                    this.hlHostControlAlDroppedFrames = new HlHostControlAlDroppedFramesEnt(mib, this);
                    this.hlHostControlAlInserts = new HlHostControlAlInsertsEnt(mib, this);
                    this.hlHostControlAlDeletes = new HlHostControlAlDeletesEnt(mib, this);
                    this.hlHostControlAlMaxDesiredEntries = new HlHostControlAlMaxDesiredEntriesEnt(mib, this);
                    this.hlHostControlOwner = new HlHostControlOwnerEnt(mib, this);
                    this.hlHostControlStatus = new HlHostControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hlHostControlIndex,
                        this.hlHostControlDataSource,
                        this.hlHostControlNlDroppedFrames,
                        this.hlHostControlNlInserts,
                        this.hlHostControlNlDeletes,
                        this.hlHostControlNlMaxDesiredEntries,
                        this.hlHostControlAlDroppedFrames,
                        this.hlHostControlAlInserts,
                        this.hlHostControlAlDeletes,
                        this.hlHostControlAlMaxDesiredEntries,
                        this.hlHostControlOwner,
                        this.hlHostControlStatus
                    };
                }
                public static final class HlHostControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlIndex", "1.3.6.1.2.1.16.14.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlDataSourceEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlDataSourceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlDataSource", "1.3.6.1.2.1.16.14.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlNlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlNlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlNlDroppedFrames", "1.3.6.1.2.1.16.14.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlNlInsertsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlNlInsertsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlNlInserts", "1.3.6.1.2.1.16.14.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlNlDeletesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlNlDeletesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlNlDeletes", "1.3.6.1.2.1.16.14.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlNlMaxDesiredEntriesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlNlMaxDesiredEntriesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlNlMaxDesiredEntries", "1.3.6.1.2.1.16.14.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlAlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlAlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlAlDroppedFrames", "1.3.6.1.2.1.16.14.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlAlInsertsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlAlInsertsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlAlInserts", "1.3.6.1.2.1.16.14.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlAlDeletesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlAlDeletesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlAlDeletes", "1.3.6.1.2.1.16.14.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlAlMaxDesiredEntriesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlAlMaxDesiredEntriesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlAlMaxDesiredEntries", "1.3.6.1.2.1.16.14.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlOwner", "1.3.6.1.2.1.16.14.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlHostControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlHostControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlHostControlStatus", "1.3.6.1.2.1.16.14.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NlHostTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final NlHostEntryEnt nlHostEntry;

            private NlHostTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlHostTable", "1.3.6.1.2.1.16.14.2", false, true, false, false);
                this.nlHostEntry = new NlHostEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlHostEntry
                };
            }
            public static final class NlHostEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final NlHostTimeMarkEnt nlHostTimeMark;

                public final NlHostAddressEnt nlHostAddress;

                public final NlHostInPktsEnt nlHostInPkts;

                public final NlHostOutPktsEnt nlHostOutPkts;

                public final NlHostInOctetsEnt nlHostInOctets;

                public final NlHostOutOctetsEnt nlHostOutOctets;

                public final NlHostOutMacNonUnicastPktsEnt nlHostOutMacNonUnicastPkts;

                public final NlHostCreateTimeEnt nlHostCreateTime;

                private NlHostEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "nlHostEntry", "1.3.6.1.2.1.16.14.2.1", false, false, false, true);
                    this.nlHostTimeMark = new NlHostTimeMarkEnt(mib, this);
                    this.nlHostAddress = new NlHostAddressEnt(mib, this);
                    this.nlHostInPkts = new NlHostInPktsEnt(mib, this);
                    this.nlHostOutPkts = new NlHostOutPktsEnt(mib, this);
                    this.nlHostInOctets = new NlHostInOctetsEnt(mib, this);
                    this.nlHostOutOctets = new NlHostOutOctetsEnt(mib, this);
                    this.nlHostOutMacNonUnicastPkts = new NlHostOutMacNonUnicastPktsEnt(mib, this);
                    this.nlHostCreateTime = new NlHostCreateTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlHostTimeMark,
                        this.nlHostAddress,
                        this.nlHostInPkts,
                        this.nlHostOutPkts,
                        this.nlHostInOctets,
                        this.nlHostOutOctets,
                        this.nlHostOutMacNonUnicastPkts,
                        this.nlHostCreateTime
                    };
                }
                public static final class NlHostTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostTimeMark", "1.3.6.1.2.1.16.14.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostAddress", "1.3.6.1.2.1.16.14.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostInPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostInPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostInPkts", "1.3.6.1.2.1.16.14.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostOutPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostOutPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostOutPkts", "1.3.6.1.2.1.16.14.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostInOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostInOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostInOctets", "1.3.6.1.2.1.16.14.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostOutOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostOutOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostOutOctets", "1.3.6.1.2.1.16.14.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostOutMacNonUnicastPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostOutMacNonUnicastPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostOutMacNonUnicastPkts", "1.3.6.1.2.1.16.14.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlHostCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlHostCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlHostCreateTime", "1.3.6.1.2.1.16.14.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class NlMatrixEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Network Layer Matrix GroupCounts the amount of traffic sent between each pair of networkaddresses discovered by the probe.Note that while the hlMatrixControlTable also has objects thatcontrol optional alMatrixTables, implementation of thealMatrixTables is not required to fully implement this group.*/
        public final HlMatrixControlTableEnt hlMatrixControlTable;

        public final NlMatrixSDTableEnt nlMatrixSDTable;

        /** Traffic matrix tables from destination to source*/
        public final NlMatrixDSTableEnt nlMatrixDSTable;

        public final NlMatrixTopNControlTableEnt nlMatrixTopNControlTable;

        public final NlMatrixTopNTableEnt nlMatrixTopNTable;

        private NlMatrixEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "nlMatrix", "1.3.6.1.2.1.16.15", false, false, false, false);
            this.hlMatrixControlTable = new HlMatrixControlTableEnt(mib, this);
            this.nlMatrixSDTable = new NlMatrixSDTableEnt(mib, this);
            this.nlMatrixDSTable = new NlMatrixDSTableEnt(mib, this);
            this.nlMatrixTopNControlTable = new NlMatrixTopNControlTableEnt(mib, this);
            this.nlMatrixTopNTable = new NlMatrixTopNTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hlMatrixControlTable,
                this.nlMatrixSDTable,
                this.nlMatrixDSTable,
                this.nlMatrixTopNControlTable,
                this.nlMatrixTopNTable
            };
        }
        public static final class HlMatrixControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final HlMatrixControlEntryEnt hlMatrixControlEntry;

            private HlMatrixControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "hlMatrixControlTable", "1.3.6.1.2.1.16.15.1", false, true, false, false);
                this.hlMatrixControlEntry = new HlMatrixControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hlMatrixControlEntry
                };
            }
            public static final class HlMatrixControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final HlMatrixControlIndexEnt hlMatrixControlIndex;

                public final HlMatrixControlDataSourceEnt hlMatrixControlDataSource;

                public final HlMatrixControlNlDroppedFramesEnt hlMatrixControlNlDroppedFrames;

                public final HlMatrixControlNlInsertsEnt hlMatrixControlNlInserts;

                public final HlMatrixControlNlDeletesEnt hlMatrixControlNlDeletes;

                public final HlMatrixControlNlMaxDesiredEntriesEnt hlMatrixControlNlMaxDesiredEntries;

                public final HlMatrixControlAlDroppedFramesEnt hlMatrixControlAlDroppedFrames;

                public final HlMatrixControlAlInsertsEnt hlMatrixControlAlInserts;

                public final HlMatrixControlAlDeletesEnt hlMatrixControlAlDeletes;

                public final HlMatrixControlAlMaxDesiredEntriesEnt hlMatrixControlAlMaxDesiredEntries;

                public final HlMatrixControlOwnerEnt hlMatrixControlOwner;

                public final HlMatrixControlStatusEnt hlMatrixControlStatus;

                private HlMatrixControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "hlMatrixControlEntry", "1.3.6.1.2.1.16.15.1.1", false, false, false, true);
                    this.hlMatrixControlIndex = new HlMatrixControlIndexEnt(mib, this);
                    this.hlMatrixControlDataSource = new HlMatrixControlDataSourceEnt(mib, this);
                    this.hlMatrixControlNlDroppedFrames = new HlMatrixControlNlDroppedFramesEnt(mib, this);
                    this.hlMatrixControlNlInserts = new HlMatrixControlNlInsertsEnt(mib, this);
                    this.hlMatrixControlNlDeletes = new HlMatrixControlNlDeletesEnt(mib, this);
                    this.hlMatrixControlNlMaxDesiredEntries = new HlMatrixControlNlMaxDesiredEntriesEnt(mib, this);
                    this.hlMatrixControlAlDroppedFrames = new HlMatrixControlAlDroppedFramesEnt(mib, this);
                    this.hlMatrixControlAlInserts = new HlMatrixControlAlInsertsEnt(mib, this);
                    this.hlMatrixControlAlDeletes = new HlMatrixControlAlDeletesEnt(mib, this);
                    this.hlMatrixControlAlMaxDesiredEntries = new HlMatrixControlAlMaxDesiredEntriesEnt(mib, this);
                    this.hlMatrixControlOwner = new HlMatrixControlOwnerEnt(mib, this);
                    this.hlMatrixControlStatus = new HlMatrixControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hlMatrixControlIndex,
                        this.hlMatrixControlDataSource,
                        this.hlMatrixControlNlDroppedFrames,
                        this.hlMatrixControlNlInserts,
                        this.hlMatrixControlNlDeletes,
                        this.hlMatrixControlNlMaxDesiredEntries,
                        this.hlMatrixControlAlDroppedFrames,
                        this.hlMatrixControlAlInserts,
                        this.hlMatrixControlAlDeletes,
                        this.hlMatrixControlAlMaxDesiredEntries,
                        this.hlMatrixControlOwner,
                        this.hlMatrixControlStatus
                    };
                }
                public static final class HlMatrixControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlIndex", "1.3.6.1.2.1.16.15.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlDataSourceEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlDataSourceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlDataSource", "1.3.6.1.2.1.16.15.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlNlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlNlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlNlDroppedFrames", "1.3.6.1.2.1.16.15.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlNlInsertsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlNlInsertsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlNlInserts", "1.3.6.1.2.1.16.15.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlNlDeletesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlNlDeletesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlNlDeletes", "1.3.6.1.2.1.16.15.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlNlMaxDesiredEntriesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlNlMaxDesiredEntriesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlNlMaxDesiredEntries", "1.3.6.1.2.1.16.15.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlAlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlAlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlAlDroppedFrames", "1.3.6.1.2.1.16.15.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlAlInsertsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlAlInsertsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlAlInserts", "1.3.6.1.2.1.16.15.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlAlDeletesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlAlDeletesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlAlDeletes", "1.3.6.1.2.1.16.15.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlAlMaxDesiredEntriesEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlAlMaxDesiredEntriesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlAlMaxDesiredEntries", "1.3.6.1.2.1.16.15.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlOwner", "1.3.6.1.2.1.16.15.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HlMatrixControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private HlMatrixControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "hlMatrixControlStatus", "1.3.6.1.2.1.16.15.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NlMatrixSDTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final NlMatrixSDEntryEnt nlMatrixSDEntry;

            private NlMatrixSDTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlMatrixSDTable", "1.3.6.1.2.1.16.15.2", false, true, false, false);
                this.nlMatrixSDEntry = new NlMatrixSDEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixSDEntry
                };
            }
            public static final class NlMatrixSDEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final NlMatrixSDTimeMarkEnt nlMatrixSDTimeMark;

                public final NlMatrixSDSourceAddressEnt nlMatrixSDSourceAddress;

                public final NlMatrixSDDestAddressEnt nlMatrixSDDestAddress;

                public final NlMatrixSDPktsEnt nlMatrixSDPkts;

                public final NlMatrixSDOctetsEnt nlMatrixSDOctets;

                public final NlMatrixSDCreateTimeEnt nlMatrixSDCreateTime;

                private NlMatrixSDEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "nlMatrixSDEntry", "1.3.6.1.2.1.16.15.2.1", false, false, false, true);
                    this.nlMatrixSDTimeMark = new NlMatrixSDTimeMarkEnt(mib, this);
                    this.nlMatrixSDSourceAddress = new NlMatrixSDSourceAddressEnt(mib, this);
                    this.nlMatrixSDDestAddress = new NlMatrixSDDestAddressEnt(mib, this);
                    this.nlMatrixSDPkts = new NlMatrixSDPktsEnt(mib, this);
                    this.nlMatrixSDOctets = new NlMatrixSDOctetsEnt(mib, this);
                    this.nlMatrixSDCreateTime = new NlMatrixSDCreateTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlMatrixSDTimeMark,
                        this.nlMatrixSDSourceAddress,
                        this.nlMatrixSDDestAddress,
                        this.nlMatrixSDPkts,
                        this.nlMatrixSDOctets,
                        this.nlMatrixSDCreateTime
                    };
                }
                public static final class NlMatrixSDTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixSDTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixSDTimeMark", "1.3.6.1.2.1.16.15.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixSDSourceAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixSDSourceAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixSDSourceAddress", "1.3.6.1.2.1.16.15.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixSDDestAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixSDDestAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixSDDestAddress", "1.3.6.1.2.1.16.15.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixSDPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixSDPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixSDPkts", "1.3.6.1.2.1.16.15.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixSDOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixSDOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixSDOctets", "1.3.6.1.2.1.16.15.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixSDCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixSDCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixSDCreateTime", "1.3.6.1.2.1.16.15.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NlMatrixDSTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final NlMatrixDSEntryEnt nlMatrixDSEntry;

            private NlMatrixDSTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlMatrixDSTable", "1.3.6.1.2.1.16.15.3", false, true, false, false);
                this.nlMatrixDSEntry = new NlMatrixDSEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixDSEntry
                };
            }
            public static final class NlMatrixDSEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final NlMatrixDSTimeMarkEnt nlMatrixDSTimeMark;

                public final NlMatrixDSSourceAddressEnt nlMatrixDSSourceAddress;

                public final NlMatrixDSDestAddressEnt nlMatrixDSDestAddress;

                public final NlMatrixDSPktsEnt nlMatrixDSPkts;

                public final NlMatrixDSOctetsEnt nlMatrixDSOctets;

                public final NlMatrixDSCreateTimeEnt nlMatrixDSCreateTime;

                private NlMatrixDSEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "nlMatrixDSEntry", "1.3.6.1.2.1.16.15.3.1", false, false, false, true);
                    this.nlMatrixDSTimeMark = new NlMatrixDSTimeMarkEnt(mib, this);
                    this.nlMatrixDSSourceAddress = new NlMatrixDSSourceAddressEnt(mib, this);
                    this.nlMatrixDSDestAddress = new NlMatrixDSDestAddressEnt(mib, this);
                    this.nlMatrixDSPkts = new NlMatrixDSPktsEnt(mib, this);
                    this.nlMatrixDSOctets = new NlMatrixDSOctetsEnt(mib, this);
                    this.nlMatrixDSCreateTime = new NlMatrixDSCreateTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlMatrixDSTimeMark,
                        this.nlMatrixDSSourceAddress,
                        this.nlMatrixDSDestAddress,
                        this.nlMatrixDSPkts,
                        this.nlMatrixDSOctets,
                        this.nlMatrixDSCreateTime
                    };
                }
                public static final class NlMatrixDSTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixDSTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixDSTimeMark", "1.3.6.1.2.1.16.15.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixDSSourceAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixDSSourceAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixDSSourceAddress", "1.3.6.1.2.1.16.15.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixDSDestAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixDSDestAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixDSDestAddress", "1.3.6.1.2.1.16.15.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixDSPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixDSPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixDSPkts", "1.3.6.1.2.1.16.15.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixDSOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixDSOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixDSOctets", "1.3.6.1.2.1.16.15.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixDSCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixDSCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixDSCreateTime", "1.3.6.1.2.1.16.15.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NlMatrixTopNControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final NlMatrixTopNControlEntryEnt nlMatrixTopNControlEntry;

            private NlMatrixTopNControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlMatrixTopNControlTable", "1.3.6.1.2.1.16.15.4", false, true, false, false);
                this.nlMatrixTopNControlEntry = new NlMatrixTopNControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixTopNControlEntry
                };
            }
            public static final class NlMatrixTopNControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final NlMatrixTopNControlIndexEnt nlMatrixTopNControlIndex;

                public final NlMatrixTopNControlMatrixIndexEnt nlMatrixTopNControlMatrixIndex;

                public final NlMatrixTopNControlRateBaseEnt nlMatrixTopNControlRateBase;

                public final NlMatrixTopNControlTimeRemainingEnt nlMatrixTopNControlTimeRemaining;

                public final NlMatrixTopNControlGeneratedReportsEnt nlMatrixTopNControlGeneratedReports;

                public final NlMatrixTopNControlDurationEnt nlMatrixTopNControlDuration;

                public final NlMatrixTopNControlRequestedSizeEnt nlMatrixTopNControlRequestedSize;

                public final NlMatrixTopNControlGrantedSizeEnt nlMatrixTopNControlGrantedSize;

                public final NlMatrixTopNControlStartTimeEnt nlMatrixTopNControlStartTime;

                public final NlMatrixTopNControlOwnerEnt nlMatrixTopNControlOwner;

                public final NlMatrixTopNControlStatusEnt nlMatrixTopNControlStatus;

                private NlMatrixTopNControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNControlEntry", "1.3.6.1.2.1.16.15.4.1", false, false, false, true);
                    this.nlMatrixTopNControlIndex = new NlMatrixTopNControlIndexEnt(mib, this);
                    this.nlMatrixTopNControlMatrixIndex = new NlMatrixTopNControlMatrixIndexEnt(mib, this);
                    this.nlMatrixTopNControlRateBase = new NlMatrixTopNControlRateBaseEnt(mib, this);
                    this.nlMatrixTopNControlTimeRemaining = new NlMatrixTopNControlTimeRemainingEnt(mib, this);
                    this.nlMatrixTopNControlGeneratedReports = new NlMatrixTopNControlGeneratedReportsEnt(mib, this);
                    this.nlMatrixTopNControlDuration = new NlMatrixTopNControlDurationEnt(mib, this);
                    this.nlMatrixTopNControlRequestedSize = new NlMatrixTopNControlRequestedSizeEnt(mib, this);
                    this.nlMatrixTopNControlGrantedSize = new NlMatrixTopNControlGrantedSizeEnt(mib, this);
                    this.nlMatrixTopNControlStartTime = new NlMatrixTopNControlStartTimeEnt(mib, this);
                    this.nlMatrixTopNControlOwner = new NlMatrixTopNControlOwnerEnt(mib, this);
                    this.nlMatrixTopNControlStatus = new NlMatrixTopNControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlMatrixTopNControlIndex,
                        this.nlMatrixTopNControlMatrixIndex,
                        this.nlMatrixTopNControlRateBase,
                        this.nlMatrixTopNControlTimeRemaining,
                        this.nlMatrixTopNControlGeneratedReports,
                        this.nlMatrixTopNControlDuration,
                        this.nlMatrixTopNControlRequestedSize,
                        this.nlMatrixTopNControlGrantedSize,
                        this.nlMatrixTopNControlStartTime,
                        this.nlMatrixTopNControlOwner,
                        this.nlMatrixTopNControlStatus
                    };
                }
                public static final class NlMatrixTopNControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlIndex", "1.3.6.1.2.1.16.15.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlMatrixIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlMatrixIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlMatrixIndex", "1.3.6.1.2.1.16.15.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlRateBaseEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlRateBaseEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlRateBase", "1.3.6.1.2.1.16.15.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlTimeRemainingEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlTimeRemainingEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlTimeRemaining", "1.3.6.1.2.1.16.15.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlGeneratedReportsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlGeneratedReportsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlGeneratedReports", "1.3.6.1.2.1.16.15.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlDurationEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlDurationEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlDuration", "1.3.6.1.2.1.16.15.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlRequestedSizeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlRequestedSizeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlRequestedSize", "1.3.6.1.2.1.16.15.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlGrantedSizeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlGrantedSizeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlGrantedSize", "1.3.6.1.2.1.16.15.4.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlStartTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlStartTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlStartTime", "1.3.6.1.2.1.16.15.4.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlOwner", "1.3.6.1.2.1.16.15.4.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNControlStatus", "1.3.6.1.2.1.16.15.4.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NlMatrixTopNTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final NlMatrixTopNEntryEnt nlMatrixTopNEntry;

            private NlMatrixTopNTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlMatrixTopNTable", "1.3.6.1.2.1.16.15.5", false, true, false, false);
                this.nlMatrixTopNEntry = new NlMatrixTopNEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixTopNEntry
                };
            }
            public static final class NlMatrixTopNEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final NlMatrixTopNIndexEnt nlMatrixTopNIndex;

                public final NlMatrixTopNProtocolDirLocalIndexEnt nlMatrixTopNProtocolDirLocalIndex;

                public final NlMatrixTopNSourceAddressEnt nlMatrixTopNSourceAddress;

                public final NlMatrixTopNDestAddressEnt nlMatrixTopNDestAddress;

                public final NlMatrixTopNPktRateEnt nlMatrixTopNPktRate;

                public final NlMatrixTopNReversePktRateEnt nlMatrixTopNReversePktRate;

                public final NlMatrixTopNOctetRateEnt nlMatrixTopNOctetRate;

                public final NlMatrixTopNReverseOctetRateEnt nlMatrixTopNReverseOctetRate;

                private NlMatrixTopNEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNEntry", "1.3.6.1.2.1.16.15.5.1", false, false, false, true);
                    this.nlMatrixTopNIndex = new NlMatrixTopNIndexEnt(mib, this);
                    this.nlMatrixTopNProtocolDirLocalIndex = new NlMatrixTopNProtocolDirLocalIndexEnt(mib, this);
                    this.nlMatrixTopNSourceAddress = new NlMatrixTopNSourceAddressEnt(mib, this);
                    this.nlMatrixTopNDestAddress = new NlMatrixTopNDestAddressEnt(mib, this);
                    this.nlMatrixTopNPktRate = new NlMatrixTopNPktRateEnt(mib, this);
                    this.nlMatrixTopNReversePktRate = new NlMatrixTopNReversePktRateEnt(mib, this);
                    this.nlMatrixTopNOctetRate = new NlMatrixTopNOctetRateEnt(mib, this);
                    this.nlMatrixTopNReverseOctetRate = new NlMatrixTopNReverseOctetRateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlMatrixTopNIndex,
                        this.nlMatrixTopNProtocolDirLocalIndex,
                        this.nlMatrixTopNSourceAddress,
                        this.nlMatrixTopNDestAddress,
                        this.nlMatrixTopNPktRate,
                        this.nlMatrixTopNReversePktRate,
                        this.nlMatrixTopNOctetRate,
                        this.nlMatrixTopNReverseOctetRate
                    };
                }
                public static final class NlMatrixTopNIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNIndex", "1.3.6.1.2.1.16.15.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNProtocolDirLocalIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNProtocolDirLocalIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNProtocolDirLocalIndex", "1.3.6.1.2.1.16.15.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNSourceAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNSourceAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNSourceAddress", "1.3.6.1.2.1.16.15.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNDestAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNDestAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNDestAddress", "1.3.6.1.2.1.16.15.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNPktRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNPktRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNPktRate", "1.3.6.1.2.1.16.15.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNReversePktRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNReversePktRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNReversePktRate", "1.3.6.1.2.1.16.15.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNOctetRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNOctetRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNOctetRate", "1.3.6.1.2.1.16.15.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlMatrixTopNReverseOctetRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NlMatrixTopNReverseOctetRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "nlMatrixTopNReverseOctetRate", "1.3.6.1.2.1.16.15.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class AlHostEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Application Layer FunctionsThe application layer host, matrix, and matrixTopN functions reporton protocol usage at the network layer or higher.  Note that theuse of the term application layer does not imply that onlyapplication-layer protocols are counted, rather it means thatprotocols up to and including the application layer are supported.
Application Layer Host GroupCounts the amount of traffic, by protocol, sent from and to eachnetwork address discovered by the probe.Implementation of this group requires implementation of the NetworkLayer Host Group.*/
        public final AlHostTableEnt alHostTable;

        private AlHostEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "alHost", "1.3.6.1.2.1.16.16", false, false, false, false);
            this.alHostTable = new AlHostTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alHostTable
            };
        }
        public static final class AlHostTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AlHostEntryEnt alHostEntry;

            private AlHostTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alHostTable", "1.3.6.1.2.1.16.16.1", false, true, false, false);
                this.alHostEntry = new AlHostEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alHostEntry
                };
            }
            public static final class AlHostEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AlHostTimeMarkEnt alHostTimeMark;

                public final AlHostInPktsEnt alHostInPkts;

                public final AlHostOutPktsEnt alHostOutPkts;

                public final AlHostInOctetsEnt alHostInOctets;

                public final AlHostOutOctetsEnt alHostOutOctets;

                public final AlHostCreateTimeEnt alHostCreateTime;

                private AlHostEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "alHostEntry", "1.3.6.1.2.1.16.16.1.1", false, false, false, true);
                    this.alHostTimeMark = new AlHostTimeMarkEnt(mib, this);
                    this.alHostInPkts = new AlHostInPktsEnt(mib, this);
                    this.alHostOutPkts = new AlHostOutPktsEnt(mib, this);
                    this.alHostInOctets = new AlHostInOctetsEnt(mib, this);
                    this.alHostOutOctets = new AlHostOutOctetsEnt(mib, this);
                    this.alHostCreateTime = new AlHostCreateTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alHostTimeMark,
                        this.alHostInPkts,
                        this.alHostOutPkts,
                        this.alHostInOctets,
                        this.alHostOutOctets,
                        this.alHostCreateTime
                    };
                }
                public static final class AlHostTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlHostTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alHostTimeMark", "1.3.6.1.2.1.16.16.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlHostInPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlHostInPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alHostInPkts", "1.3.6.1.2.1.16.16.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlHostOutPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlHostOutPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alHostOutPkts", "1.3.6.1.2.1.16.16.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlHostInOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlHostInOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alHostInOctets", "1.3.6.1.2.1.16.16.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlHostOutOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlHostOutOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alHostOutOctets", "1.3.6.1.2.1.16.16.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlHostCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlHostCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alHostCreateTime", "1.3.6.1.2.1.16.16.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class AlMatrixEnt extends MIBEntry<RMON2MIBDef>
    {
        /** Application Layer Matrix GroupCounts the amount of traffic, by protocol, sent between each pairof network addresses discovered by the probe.Implementation of this group requires implementation of the NetworkLayer Matrix Group.*/
        public final AlMatrixSDTableEnt alMatrixSDTable;

        /** Traffic matrix tables from destination to source*/
        public final AlMatrixDSTableEnt alMatrixDSTable;

        public final AlMatrixTopNControlTableEnt alMatrixTopNControlTable;

        public final AlMatrixTopNTableEnt alMatrixTopNTable;

        private AlMatrixEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "alMatrix", "1.3.6.1.2.1.16.17", false, false, false, false);
            this.alMatrixSDTable = new AlMatrixSDTableEnt(mib, this);
            this.alMatrixDSTable = new AlMatrixDSTableEnt(mib, this);
            this.alMatrixTopNControlTable = new AlMatrixTopNControlTableEnt(mib, this);
            this.alMatrixTopNTable = new AlMatrixTopNTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alMatrixSDTable,
                this.alMatrixDSTable,
                this.alMatrixTopNControlTable,
                this.alMatrixTopNTable
            };
        }
        public static final class AlMatrixSDTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AlMatrixSDEntryEnt alMatrixSDEntry;

            private AlMatrixSDTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alMatrixSDTable", "1.3.6.1.2.1.16.17.1", false, true, false, false);
                this.alMatrixSDEntry = new AlMatrixSDEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixSDEntry
                };
            }
            public static final class AlMatrixSDEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AlMatrixSDTimeMarkEnt alMatrixSDTimeMark;

                public final AlMatrixSDPktsEnt alMatrixSDPkts;

                public final AlMatrixSDOctetsEnt alMatrixSDOctets;

                public final AlMatrixSDCreateTimeEnt alMatrixSDCreateTime;

                private AlMatrixSDEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "alMatrixSDEntry", "1.3.6.1.2.1.16.17.1.1", false, false, false, true);
                    this.alMatrixSDTimeMark = new AlMatrixSDTimeMarkEnt(mib, this);
                    this.alMatrixSDPkts = new AlMatrixSDPktsEnt(mib, this);
                    this.alMatrixSDOctets = new AlMatrixSDOctetsEnt(mib, this);
                    this.alMatrixSDCreateTime = new AlMatrixSDCreateTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alMatrixSDTimeMark,
                        this.alMatrixSDPkts,
                        this.alMatrixSDOctets,
                        this.alMatrixSDCreateTime
                    };
                }
                public static final class AlMatrixSDTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixSDTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixSDTimeMark", "1.3.6.1.2.1.16.17.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixSDPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixSDPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixSDPkts", "1.3.6.1.2.1.16.17.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixSDOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixSDOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixSDOctets", "1.3.6.1.2.1.16.17.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixSDCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixSDCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixSDCreateTime", "1.3.6.1.2.1.16.17.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AlMatrixDSTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AlMatrixDSEntryEnt alMatrixDSEntry;

            private AlMatrixDSTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alMatrixDSTable", "1.3.6.1.2.1.16.17.2", false, true, false, false);
                this.alMatrixDSEntry = new AlMatrixDSEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixDSEntry
                };
            }
            public static final class AlMatrixDSEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AlMatrixDSTimeMarkEnt alMatrixDSTimeMark;

                public final AlMatrixDSPktsEnt alMatrixDSPkts;

                public final AlMatrixDSOctetsEnt alMatrixDSOctets;

                public final AlMatrixDSCreateTimeEnt alMatrixDSCreateTime;

                private AlMatrixDSEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "alMatrixDSEntry", "1.3.6.1.2.1.16.17.2.1", false, false, false, true);
                    this.alMatrixDSTimeMark = new AlMatrixDSTimeMarkEnt(mib, this);
                    this.alMatrixDSPkts = new AlMatrixDSPktsEnt(mib, this);
                    this.alMatrixDSOctets = new AlMatrixDSOctetsEnt(mib, this);
                    this.alMatrixDSCreateTime = new AlMatrixDSCreateTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alMatrixDSTimeMark,
                        this.alMatrixDSPkts,
                        this.alMatrixDSOctets,
                        this.alMatrixDSCreateTime
                    };
                }
                public static final class AlMatrixDSTimeMarkEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixDSTimeMarkEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixDSTimeMark", "1.3.6.1.2.1.16.17.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixDSPktsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixDSPktsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixDSPkts", "1.3.6.1.2.1.16.17.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixDSOctetsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixDSOctetsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixDSOctets", "1.3.6.1.2.1.16.17.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixDSCreateTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixDSCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixDSCreateTime", "1.3.6.1.2.1.16.17.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AlMatrixTopNControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AlMatrixTopNControlEntryEnt alMatrixTopNControlEntry;

            private AlMatrixTopNControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alMatrixTopNControlTable", "1.3.6.1.2.1.16.17.3", false, true, false, false);
                this.alMatrixTopNControlEntry = new AlMatrixTopNControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixTopNControlEntry
                };
            }
            public static final class AlMatrixTopNControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AlMatrixTopNControlIndexEnt alMatrixTopNControlIndex;

                public final AlMatrixTopNControlMatrixIndexEnt alMatrixTopNControlMatrixIndex;

                public final AlMatrixTopNControlRateBaseEnt alMatrixTopNControlRateBase;

                public final AlMatrixTopNControlTimeRemainingEnt alMatrixTopNControlTimeRemaining;

                public final AlMatrixTopNControlGeneratedReportsEnt alMatrixTopNControlGeneratedReports;

                public final AlMatrixTopNControlDurationEnt alMatrixTopNControlDuration;

                public final AlMatrixTopNControlRequestedSizeEnt alMatrixTopNControlRequestedSize;

                public final AlMatrixTopNControlGrantedSizeEnt alMatrixTopNControlGrantedSize;

                public final AlMatrixTopNControlStartTimeEnt alMatrixTopNControlStartTime;

                public final AlMatrixTopNControlOwnerEnt alMatrixTopNControlOwner;

                public final AlMatrixTopNControlStatusEnt alMatrixTopNControlStatus;

                private AlMatrixTopNControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNControlEntry", "1.3.6.1.2.1.16.17.3.1", false, false, false, true);
                    this.alMatrixTopNControlIndex = new AlMatrixTopNControlIndexEnt(mib, this);
                    this.alMatrixTopNControlMatrixIndex = new AlMatrixTopNControlMatrixIndexEnt(mib, this);
                    this.alMatrixTopNControlRateBase = new AlMatrixTopNControlRateBaseEnt(mib, this);
                    this.alMatrixTopNControlTimeRemaining = new AlMatrixTopNControlTimeRemainingEnt(mib, this);
                    this.alMatrixTopNControlGeneratedReports = new AlMatrixTopNControlGeneratedReportsEnt(mib, this);
                    this.alMatrixTopNControlDuration = new AlMatrixTopNControlDurationEnt(mib, this);
                    this.alMatrixTopNControlRequestedSize = new AlMatrixTopNControlRequestedSizeEnt(mib, this);
                    this.alMatrixTopNControlGrantedSize = new AlMatrixTopNControlGrantedSizeEnt(mib, this);
                    this.alMatrixTopNControlStartTime = new AlMatrixTopNControlStartTimeEnt(mib, this);
                    this.alMatrixTopNControlOwner = new AlMatrixTopNControlOwnerEnt(mib, this);
                    this.alMatrixTopNControlStatus = new AlMatrixTopNControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alMatrixTopNControlIndex,
                        this.alMatrixTopNControlMatrixIndex,
                        this.alMatrixTopNControlRateBase,
                        this.alMatrixTopNControlTimeRemaining,
                        this.alMatrixTopNControlGeneratedReports,
                        this.alMatrixTopNControlDuration,
                        this.alMatrixTopNControlRequestedSize,
                        this.alMatrixTopNControlGrantedSize,
                        this.alMatrixTopNControlStartTime,
                        this.alMatrixTopNControlOwner,
                        this.alMatrixTopNControlStatus
                    };
                }
                public static final class AlMatrixTopNControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlIndex", "1.3.6.1.2.1.16.17.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlMatrixIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlMatrixIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlMatrixIndex", "1.3.6.1.2.1.16.17.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlRateBaseEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlRateBaseEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlRateBase", "1.3.6.1.2.1.16.17.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlTimeRemainingEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlTimeRemainingEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlTimeRemaining", "1.3.6.1.2.1.16.17.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlGeneratedReportsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlGeneratedReportsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlGeneratedReports", "1.3.6.1.2.1.16.17.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlDurationEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlDurationEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlDuration", "1.3.6.1.2.1.16.17.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlRequestedSizeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlRequestedSizeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlRequestedSize", "1.3.6.1.2.1.16.17.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlGrantedSizeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlGrantedSizeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlGrantedSize", "1.3.6.1.2.1.16.17.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlStartTimeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlStartTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlStartTime", "1.3.6.1.2.1.16.17.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlOwner", "1.3.6.1.2.1.16.17.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNControlStatus", "1.3.6.1.2.1.16.17.3.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AlMatrixTopNTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final AlMatrixTopNEntryEnt alMatrixTopNEntry;

            private AlMatrixTopNTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alMatrixTopNTable", "1.3.6.1.2.1.16.17.4", false, true, false, false);
                this.alMatrixTopNEntry = new AlMatrixTopNEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixTopNEntry
                };
            }
            public static final class AlMatrixTopNEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final AlMatrixTopNIndexEnt alMatrixTopNIndex;

                public final AlMatrixTopNProtocolDirLocalIndexEnt alMatrixTopNProtocolDirLocalIndex;

                public final AlMatrixTopNSourceAddressEnt alMatrixTopNSourceAddress;

                public final AlMatrixTopNDestAddressEnt alMatrixTopNDestAddress;

                public final AlMatrixTopNAppProtocolDirLocalIndexEnt alMatrixTopNAppProtocolDirLocalIndex;

                public final AlMatrixTopNPktRateEnt alMatrixTopNPktRate;

                public final AlMatrixTopNReversePktRateEnt alMatrixTopNReversePktRate;

                public final AlMatrixTopNOctetRateEnt alMatrixTopNOctetRate;

                public final AlMatrixTopNReverseOctetRateEnt alMatrixTopNReverseOctetRate;

                private AlMatrixTopNEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNEntry", "1.3.6.1.2.1.16.17.4.1", false, false, false, true);
                    this.alMatrixTopNIndex = new AlMatrixTopNIndexEnt(mib, this);
                    this.alMatrixTopNProtocolDirLocalIndex = new AlMatrixTopNProtocolDirLocalIndexEnt(mib, this);
                    this.alMatrixTopNSourceAddress = new AlMatrixTopNSourceAddressEnt(mib, this);
                    this.alMatrixTopNDestAddress = new AlMatrixTopNDestAddressEnt(mib, this);
                    this.alMatrixTopNAppProtocolDirLocalIndex = new AlMatrixTopNAppProtocolDirLocalIndexEnt(mib, this);
                    this.alMatrixTopNPktRate = new AlMatrixTopNPktRateEnt(mib, this);
                    this.alMatrixTopNReversePktRate = new AlMatrixTopNReversePktRateEnt(mib, this);
                    this.alMatrixTopNOctetRate = new AlMatrixTopNOctetRateEnt(mib, this);
                    this.alMatrixTopNReverseOctetRate = new AlMatrixTopNReverseOctetRateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.alMatrixTopNIndex,
                        this.alMatrixTopNProtocolDirLocalIndex,
                        this.alMatrixTopNSourceAddress,
                        this.alMatrixTopNDestAddress,
                        this.alMatrixTopNAppProtocolDirLocalIndex,
                        this.alMatrixTopNPktRate,
                        this.alMatrixTopNReversePktRate,
                        this.alMatrixTopNOctetRate,
                        this.alMatrixTopNReverseOctetRate
                    };
                }
                public static final class AlMatrixTopNIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNIndex", "1.3.6.1.2.1.16.17.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNProtocolDirLocalIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNProtocolDirLocalIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNProtocolDirLocalIndex", "1.3.6.1.2.1.16.17.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNSourceAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNSourceAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNSourceAddress", "1.3.6.1.2.1.16.17.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNDestAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNDestAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNDestAddress", "1.3.6.1.2.1.16.17.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNAppProtocolDirLocalIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNAppProtocolDirLocalIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNAppProtocolDirLocalIndex", "1.3.6.1.2.1.16.17.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNPktRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNPktRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNPktRate", "1.3.6.1.2.1.16.17.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNReversePktRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNReversePktRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNReversePktRate", "1.3.6.1.2.1.16.17.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNOctetRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNOctetRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNOctetRate", "1.3.6.1.2.1.16.17.4.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AlMatrixTopNReverseOctetRateEnt extends MIBEntry<RMON2MIBDef>
                {
                    private AlMatrixTopNReverseOctetRateEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "alMatrixTopNReverseOctetRate", "1.3.6.1.2.1.16.17.4.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class UsrHistoryEnt extends MIBEntry<RMON2MIBDef>
    {
        /** User History Collection Group (usrHistory)The usrHistory group combines mechanisms seen in the alarm andhistory groups to provide user-specified history collection,utilizing two additional control tables and one additional datatable.  This function has traditionally been done by NMSapplications, via periodic polling.  The usrHistory group allowsthis task to be offloaded to an RMON probe.Data (an ASN.1 INTEGER based object) is collected in the samemanner as any history data table (e.g., etherHistoryTable) exceptthat the user specifies the MIB instances to be collected.  Objectsare collected in bucket-groups, with the intent that all MIBinstances in the same bucket-group are collected as atomically aspossible by the RMON probe.The usrHistoryControlTable is a one-dimensional read-create table.Each row configures a collection of user history buckets, muchthe same as a historyControlEntry, except that the creation of arow in this table will cause one or more associated instances inthe usrHistoryObjectTable to be created.  The user specifies thenumber of bucket elements (rows in the usrHistoryObjectTable)requested, as well as the number of buckets requested.The usrHistoryObjectTable is a 2-d read-write table.Each row configures a single MIB instance to be collected.All rows with the same major index constitute a bucket-group.The usrHistoryTable is a 3-d read-only table containing


the data of associated usrHistoryControlEntries.  Eachentry represents the value of a single MIB instanceduring a specific sampling interval (or the rate ofchange during the interval).A sample value is stored in two objects - an absolute value anda status object.  This allows numbers from -(2G-1) to +4G to bestored.  The status object also indicates whether a sample isvalid.  This allows data collection to continue if periodicretrieval of a particular instance fails for any reason.Row Creation Order RelationshipsThe static nature of the usrHistoryObjectTable createssome row creation/modification issues.  The rows in thistable need to be set before the associatedusrHistoryControlEntry can be activated.Note that the usrHistoryObject entries associated with aparticular usrHistoryControlEntry are not required tobe active before the control entry is activated.  However,the usrHistory data entries associated with an inactiveusrHistoryObject entry will be inactive (i.e.,usrHistoryValStatus == valueNotAvailable).*/
        public final UsrHistoryControlTableEnt usrHistoryControlTable;

        /** Object table*/
        public final UsrHistoryObjectTableEnt usrHistoryObjectTable;

        /** data table*/
        public final UsrHistoryTableEnt usrHistoryTable;

        private UsrHistoryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "usrHistory", "1.3.6.1.2.1.16.18", false, false, false, false);
            this.usrHistoryControlTable = new UsrHistoryControlTableEnt(mib, this);
            this.usrHistoryObjectTable = new UsrHistoryObjectTableEnt(mib, this);
            this.usrHistoryTable = new UsrHistoryTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.usrHistoryControlTable,
                this.usrHistoryObjectTable,
                this.usrHistoryTable
            };
        }
        public static final class UsrHistoryControlTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final UsrHistoryControlEntryEnt usrHistoryControlEntry;

            private UsrHistoryControlTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "usrHistoryControlTable", "1.3.6.1.2.1.16.18.1", false, true, false, false);
                this.usrHistoryControlEntry = new UsrHistoryControlEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usrHistoryControlEntry
                };
            }
            public static final class UsrHistoryControlEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final UsrHistoryControlIndexEnt usrHistoryControlIndex;

                public final UsrHistoryControlObjectsEnt usrHistoryControlObjects;

                public final UsrHistoryControlBucketsRequestedEnt usrHistoryControlBucketsRequested;

                public final UsrHistoryControlBucketsGrantedEnt usrHistoryControlBucketsGranted;

                public final UsrHistoryControlIntervalEnt usrHistoryControlInterval;

                public final UsrHistoryControlOwnerEnt usrHistoryControlOwner;

                public final UsrHistoryControlStatusEnt usrHistoryControlStatus;

                private UsrHistoryControlEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "usrHistoryControlEntry", "1.3.6.1.2.1.16.18.1.1", false, false, false, true);
                    this.usrHistoryControlIndex = new UsrHistoryControlIndexEnt(mib, this);
                    this.usrHistoryControlObjects = new UsrHistoryControlObjectsEnt(mib, this);
                    this.usrHistoryControlBucketsRequested = new UsrHistoryControlBucketsRequestedEnt(mib, this);
                    this.usrHistoryControlBucketsGranted = new UsrHistoryControlBucketsGrantedEnt(mib, this);
                    this.usrHistoryControlInterval = new UsrHistoryControlIntervalEnt(mib, this);
                    this.usrHistoryControlOwner = new UsrHistoryControlOwnerEnt(mib, this);
                    this.usrHistoryControlStatus = new UsrHistoryControlStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usrHistoryControlIndex,
                        this.usrHistoryControlObjects,
                        this.usrHistoryControlBucketsRequested,
                        this.usrHistoryControlBucketsGranted,
                        this.usrHistoryControlInterval,
                        this.usrHistoryControlOwner,
                        this.usrHistoryControlStatus
                    };
                }
                public static final class UsrHistoryControlIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlIndex", "1.3.6.1.2.1.16.18.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryControlObjectsEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlObjectsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlObjects", "1.3.6.1.2.1.16.18.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryControlBucketsRequestedEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlBucketsRequestedEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlBucketsRequested", "1.3.6.1.2.1.16.18.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryControlBucketsGrantedEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlBucketsGrantedEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlBucketsGranted", "1.3.6.1.2.1.16.18.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryControlIntervalEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlIntervalEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlInterval", "1.3.6.1.2.1.16.18.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryControlOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlOwner", "1.3.6.1.2.1.16.18.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryControlStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryControlStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryControlStatus", "1.3.6.1.2.1.16.18.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class UsrHistoryObjectTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final UsrHistoryObjectEntryEnt usrHistoryObjectEntry;

            private UsrHistoryObjectTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "usrHistoryObjectTable", "1.3.6.1.2.1.16.18.2", false, true, false, false);
                this.usrHistoryObjectEntry = new UsrHistoryObjectEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usrHistoryObjectEntry
                };
            }
            public static final class UsrHistoryObjectEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final UsrHistoryObjectIndexEnt usrHistoryObjectIndex;

                public final UsrHistoryObjectVariableEnt usrHistoryObjectVariable;

                public final UsrHistoryObjectSampleTypeEnt usrHistoryObjectSampleType;

                private UsrHistoryObjectEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "usrHistoryObjectEntry", "1.3.6.1.2.1.16.18.2.1", false, false, false, true);
                    this.usrHistoryObjectIndex = new UsrHistoryObjectIndexEnt(mib, this);
                    this.usrHistoryObjectVariable = new UsrHistoryObjectVariableEnt(mib, this);
                    this.usrHistoryObjectSampleType = new UsrHistoryObjectSampleTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usrHistoryObjectIndex,
                        this.usrHistoryObjectVariable,
                        this.usrHistoryObjectSampleType
                    };
                }
                public static final class UsrHistoryObjectIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryObjectIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryObjectIndex", "1.3.6.1.2.1.16.18.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryObjectVariableEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryObjectVariableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryObjectVariable", "1.3.6.1.2.1.16.18.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryObjectSampleTypeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryObjectSampleTypeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryObjectSampleType", "1.3.6.1.2.1.16.18.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class UsrHistoryTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final UsrHistoryEntryEnt usrHistoryEntry;

            private UsrHistoryTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "usrHistoryTable", "1.3.6.1.2.1.16.18.3", false, true, false, false);
                this.usrHistoryEntry = new UsrHistoryEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usrHistoryEntry
                };
            }
            public static final class UsrHistoryEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final UsrHistorySampleIndexEnt usrHistorySampleIndex;

                public final UsrHistoryIntervalStartEnt usrHistoryIntervalStart;

                public final UsrHistoryIntervalEndEnt usrHistoryIntervalEnd;

                public final UsrHistoryAbsValueEnt usrHistoryAbsValue;

                public final UsrHistoryValStatusEnt usrHistoryValStatus;

                private UsrHistoryEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "usrHistoryEntry", "1.3.6.1.2.1.16.18.3.1", false, false, false, true);
                    this.usrHistorySampleIndex = new UsrHistorySampleIndexEnt(mib, this);
                    this.usrHistoryIntervalStart = new UsrHistoryIntervalStartEnt(mib, this);
                    this.usrHistoryIntervalEnd = new UsrHistoryIntervalEndEnt(mib, this);
                    this.usrHistoryAbsValue = new UsrHistoryAbsValueEnt(mib, this);
                    this.usrHistoryValStatus = new UsrHistoryValStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usrHistorySampleIndex,
                        this.usrHistoryIntervalStart,
                        this.usrHistoryIntervalEnd,
                        this.usrHistoryAbsValue,
                        this.usrHistoryValStatus
                    };
                }
                public static final class UsrHistorySampleIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistorySampleIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistorySampleIndex", "1.3.6.1.2.1.16.18.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryIntervalStartEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryIntervalStartEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryIntervalStart", "1.3.6.1.2.1.16.18.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryIntervalEndEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryIntervalEndEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryIntervalEnd", "1.3.6.1.2.1.16.18.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryAbsValueEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryAbsValueEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryAbsValue", "1.3.6.1.2.1.16.18.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsrHistoryValStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private UsrHistoryValStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "usrHistoryValStatus", "1.3.6.1.2.1.16.18.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class ProbeConfigEnt extends MIBEntry<RMON2MIBDef>
    {
        public final ProbeCapabilitiesEnt probeCapabilities;

        public final ProbeSoftwareRevEnt probeSoftwareRev;

        public final ProbeHardwareRevEnt probeHardwareRev;

        public final ProbeDateTimeEnt probeDateTime;

        public final ProbeResetControlEnt probeResetControl;

        /** The following download objects do not restrict an implementationfrom implementing additional download mechanisms (controlled in animplementation-specific manner).  Further, in the case where the RMONagent shares a processor with other types of systems, theimplementation is not required to download those non-RMON functionswith this mechanism.*/
        public final ProbeDownloadFileEnt probeDownloadFile;

        public final ProbeDownloadTFTPServerEnt probeDownloadTFTPServer;

        public final ProbeDownloadActionEnt probeDownloadAction;

        public final ProbeDownloadStatusEnt probeDownloadStatus;

        public final SerialConfigTableEnt serialConfigTable;

        public final NetConfigTableEnt netConfigTable;

        public final NetDefaultGatewayEnt netDefaultGateway;

        /** Trap Destination TableThis table defines the destination addresses for traps generatedfrom the device.  This table maps a community to one or more trapdestination entries.The same trap will be sent to all destinations specified in theentries that have the same trapDestCommunity as the eventCommunity(as defined by RMON MIB), as long as no access control mechanism(e.g., VACM) prohibits sending to one or more of the destinations.Information in this table will be stored in non-volatile memory.


If the device has gone through a hard restart, this informationwill be reset to its default state.*/
        public final TrapDestTableEnt trapDestTable;

        /** Serial Connection TableThe device may communicate with a management station usingSLIP.  In order for the device to send traps via SLIP, it mustbe able to initiate a connection over the serial interface.  TheserialConnectionTable stores the parameters for such connectioninitiation.*/
        public final SerialConnectionTableEnt serialConnectionTable;

        private ProbeConfigEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "probeConfig", "1.3.6.1.2.1.16.19", false, false, false, false);
            this.probeCapabilities = new ProbeCapabilitiesEnt(mib, this);
            this.probeSoftwareRev = new ProbeSoftwareRevEnt(mib, this);
            this.probeHardwareRev = new ProbeHardwareRevEnt(mib, this);
            this.probeDateTime = new ProbeDateTimeEnt(mib, this);
            this.probeResetControl = new ProbeResetControlEnt(mib, this);
            this.probeDownloadFile = new ProbeDownloadFileEnt(mib, this);
            this.probeDownloadTFTPServer = new ProbeDownloadTFTPServerEnt(mib, this);
            this.probeDownloadAction = new ProbeDownloadActionEnt(mib, this);
            this.probeDownloadStatus = new ProbeDownloadStatusEnt(mib, this);
            this.serialConfigTable = new SerialConfigTableEnt(mib, this);
            this.netConfigTable = new NetConfigTableEnt(mib, this);
            this.netDefaultGateway = new NetDefaultGatewayEnt(mib, this);
            this.trapDestTable = new TrapDestTableEnt(mib, this);
            this.serialConnectionTable = new SerialConnectionTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.probeCapabilities,
                this.probeSoftwareRev,
                this.probeHardwareRev,
                this.probeDateTime,
                this.probeResetControl,
                this.probeDownloadFile,
                this.probeDownloadTFTPServer,
                this.probeDownloadAction,
                this.probeDownloadStatus,
                this.serialConfigTable,
                this.netConfigTable,
                this.netDefaultGateway,
                this.trapDestTable,
                this.serialConnectionTable
            };
        }
        public static final class ProbeCapabilitiesEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeCapabilitiesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeCapabilities", "1.3.6.1.2.1.16.19.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeSoftwareRevEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeSoftwareRevEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeSoftwareRev", "1.3.6.1.2.1.16.19.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeHardwareRevEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeHardwareRevEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeHardwareRev", "1.3.6.1.2.1.16.19.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeDateTimeEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeDateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeDateTime", "1.3.6.1.2.1.16.19.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeResetControlEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeResetControlEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeResetControl", "1.3.6.1.2.1.16.19.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeDownloadFileEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeDownloadFileEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeDownloadFile", "1.3.6.1.2.1.16.19.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeDownloadTFTPServerEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeDownloadTFTPServerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeDownloadTFTPServer", "1.3.6.1.2.1.16.19.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeDownloadActionEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeDownloadActionEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeDownloadAction", "1.3.6.1.2.1.16.19.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeDownloadStatusEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeDownloadStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeDownloadStatus", "1.3.6.1.2.1.16.19.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SerialConfigTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final SerialConfigEntryEnt serialConfigEntry;

            private SerialConfigTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "serialConfigTable", "1.3.6.1.2.1.16.19.10", false, true, false, false);
                this.serialConfigEntry = new SerialConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.serialConfigEntry
                };
            }
            public static final class SerialConfigEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final SerialModeEnt serialMode;

                public final SerialProtocolEnt serialProtocol;

                public final SerialTimeoutEnt serialTimeout;

                public final SerialModemInitStringEnt serialModemInitString;

                public final SerialModemHangUpStringEnt serialModemHangUpString;

                public final SerialModemConnectRespEnt serialModemConnectResp;

                public final SerialModemNoConnectRespEnt serialModemNoConnectResp;

                public final SerialDialoutTimeoutEnt serialDialoutTimeout;

                public final SerialStatusEnt serialStatus;

                private SerialConfigEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "serialConfigEntry", "1.3.6.1.2.1.16.19.10.1", false, false, false, true);
                    this.serialMode = new SerialModeEnt(mib, this);
                    this.serialProtocol = new SerialProtocolEnt(mib, this);
                    this.serialTimeout = new SerialTimeoutEnt(mib, this);
                    this.serialModemInitString = new SerialModemInitStringEnt(mib, this);
                    this.serialModemHangUpString = new SerialModemHangUpStringEnt(mib, this);
                    this.serialModemConnectResp = new SerialModemConnectRespEnt(mib, this);
                    this.serialModemNoConnectResp = new SerialModemNoConnectRespEnt(mib, this);
                    this.serialDialoutTimeout = new SerialDialoutTimeoutEnt(mib, this);
                    this.serialStatus = new SerialStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.serialMode,
                        this.serialProtocol,
                        this.serialTimeout,
                        this.serialModemInitString,
                        this.serialModemHangUpString,
                        this.serialModemConnectResp,
                        this.serialModemNoConnectResp,
                        this.serialDialoutTimeout,
                        this.serialStatus
                    };
                }
                public static final class SerialModeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialModeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialMode", "1.3.6.1.2.1.16.19.10.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialProtocolEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialProtocolEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialProtocol", "1.3.6.1.2.1.16.19.10.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialTimeoutEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialTimeoutEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialTimeout", "1.3.6.1.2.1.16.19.10.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialModemInitStringEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialModemInitStringEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialModemInitString", "1.3.6.1.2.1.16.19.10.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialModemHangUpStringEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialModemHangUpStringEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialModemHangUpString", "1.3.6.1.2.1.16.19.10.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialModemConnectRespEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialModemConnectRespEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialModemConnectResp", "1.3.6.1.2.1.16.19.10.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialModemNoConnectRespEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialModemNoConnectRespEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialModemNoConnectResp", "1.3.6.1.2.1.16.19.10.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialDialoutTimeoutEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialDialoutTimeoutEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialDialoutTimeout", "1.3.6.1.2.1.16.19.10.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialStatus", "1.3.6.1.2.1.16.19.10.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NetConfigTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final NetConfigEntryEnt netConfigEntry;

            private NetConfigTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "netConfigTable", "1.3.6.1.2.1.16.19.11", false, true, false, false);
                this.netConfigEntry = new NetConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.netConfigEntry
                };
            }
            public static final class NetConfigEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final NetConfigIPAddressEnt netConfigIPAddress;

                public final NetConfigSubnetMaskEnt netConfigSubnetMask;

                public final NetConfigStatusEnt netConfigStatus;

                private NetConfigEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "netConfigEntry", "1.3.6.1.2.1.16.19.11.1", false, false, false, true);
                    this.netConfigIPAddress = new NetConfigIPAddressEnt(mib, this);
                    this.netConfigSubnetMask = new NetConfigSubnetMaskEnt(mib, this);
                    this.netConfigStatus = new NetConfigStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.netConfigIPAddress,
                        this.netConfigSubnetMask,
                        this.netConfigStatus
                    };
                }
                public static final class NetConfigIPAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NetConfigIPAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "netConfigIPAddress", "1.3.6.1.2.1.16.19.11.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NetConfigSubnetMaskEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NetConfigSubnetMaskEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "netConfigSubnetMask", "1.3.6.1.2.1.16.19.11.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NetConfigStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private NetConfigStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "netConfigStatus", "1.3.6.1.2.1.16.19.11.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class NetDefaultGatewayEnt extends MIBEntry<RMON2MIBDef>
        {
            private NetDefaultGatewayEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "netDefaultGateway", "1.3.6.1.2.1.16.19.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TrapDestTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final TrapDestEntryEnt trapDestEntry;

            private TrapDestTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "trapDestTable", "1.3.6.1.2.1.16.19.13", false, true, false, false);
                this.trapDestEntry = new TrapDestEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.trapDestEntry
                };
            }
            public static final class TrapDestEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final TrapDestIndexEnt trapDestIndex;

                public final TrapDestCommunityEnt trapDestCommunity;

                public final TrapDestProtocolEnt trapDestProtocol;

                public final TrapDestAddressEnt trapDestAddress;

                public final TrapDestOwnerEnt trapDestOwner;

                public final TrapDestStatusEnt trapDestStatus;

                private TrapDestEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "trapDestEntry", "1.3.6.1.2.1.16.19.13.1", false, false, false, true);
                    this.trapDestIndex = new TrapDestIndexEnt(mib, this);
                    this.trapDestCommunity = new TrapDestCommunityEnt(mib, this);
                    this.trapDestProtocol = new TrapDestProtocolEnt(mib, this);
                    this.trapDestAddress = new TrapDestAddressEnt(mib, this);
                    this.trapDestOwner = new TrapDestOwnerEnt(mib, this);
                    this.trapDestStatus = new TrapDestStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.trapDestIndex,
                        this.trapDestCommunity,
                        this.trapDestProtocol,
                        this.trapDestAddress,
                        this.trapDestOwner,
                        this.trapDestStatus
                    };
                }
                public static final class TrapDestIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private TrapDestIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "trapDestIndex", "1.3.6.1.2.1.16.19.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TrapDestCommunityEnt extends MIBEntry<RMON2MIBDef>
                {
                    private TrapDestCommunityEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "trapDestCommunity", "1.3.6.1.2.1.16.19.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TrapDestProtocolEnt extends MIBEntry<RMON2MIBDef>
                {
                    private TrapDestProtocolEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "trapDestProtocol", "1.3.6.1.2.1.16.19.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TrapDestAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private TrapDestAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "trapDestAddress", "1.3.6.1.2.1.16.19.13.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TrapDestOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private TrapDestOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "trapDestOwner", "1.3.6.1.2.1.16.19.13.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TrapDestStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private TrapDestStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "trapDestStatus", "1.3.6.1.2.1.16.19.13.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SerialConnectionTableEnt extends MIBEntry<RMON2MIBDef>
        {
            public final SerialConnectionEntryEnt serialConnectionEntry;

            private SerialConnectionTableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "serialConnectionTable", "1.3.6.1.2.1.16.19.14", false, true, false, false);
                this.serialConnectionEntry = new SerialConnectionEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.serialConnectionEntry
                };
            }
            public static final class SerialConnectionEntryEnt extends MIBEntry<RMON2MIBDef>
            {
                public final SerialConnectIndexEnt serialConnectIndex;

                public final SerialConnectDestIpAddressEnt serialConnectDestIpAddress;

                public final SerialConnectTypeEnt serialConnectType;

                public final SerialConnectDialStringEnt serialConnectDialString;

                public final SerialConnectSwitchConnectSeqEnt serialConnectSwitchConnectSeq;

                public final SerialConnectSwitchDisconnectSeqEnt serialConnectSwitchDisconnectSeq;

                public final SerialConnectSwitchResetSeqEnt serialConnectSwitchResetSeq;

                public final SerialConnectOwnerEnt serialConnectOwner;

                public final SerialConnectStatusEnt serialConnectStatus;

                private SerialConnectionEntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "serialConnectionEntry", "1.3.6.1.2.1.16.19.14.1", false, false, false, true);
                    this.serialConnectIndex = new SerialConnectIndexEnt(mib, this);
                    this.serialConnectDestIpAddress = new SerialConnectDestIpAddressEnt(mib, this);
                    this.serialConnectType = new SerialConnectTypeEnt(mib, this);
                    this.serialConnectDialString = new SerialConnectDialStringEnt(mib, this);
                    this.serialConnectSwitchConnectSeq = new SerialConnectSwitchConnectSeqEnt(mib, this);
                    this.serialConnectSwitchDisconnectSeq = new SerialConnectSwitchDisconnectSeqEnt(mib, this);
                    this.serialConnectSwitchResetSeq = new SerialConnectSwitchResetSeqEnt(mib, this);
                    this.serialConnectOwner = new SerialConnectOwnerEnt(mib, this);
                    this.serialConnectStatus = new SerialConnectStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.serialConnectIndex,
                        this.serialConnectDestIpAddress,
                        this.serialConnectType,
                        this.serialConnectDialString,
                        this.serialConnectSwitchConnectSeq,
                        this.serialConnectSwitchDisconnectSeq,
                        this.serialConnectSwitchResetSeq,
                        this.serialConnectOwner,
                        this.serialConnectStatus
                    };
                }
                public static final class SerialConnectIndexEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectIndex", "1.3.6.1.2.1.16.19.14.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectDestIpAddressEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectDestIpAddressEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectDestIpAddress", "1.3.6.1.2.1.16.19.14.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectTypeEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectTypeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectType", "1.3.6.1.2.1.16.19.14.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectDialStringEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectDialStringEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectDialString", "1.3.6.1.2.1.16.19.14.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectSwitchConnectSeqEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectSwitchConnectSeqEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectSwitchConnectSeq", "1.3.6.1.2.1.16.19.14.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectSwitchDisconnectSeqEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectSwitchDisconnectSeqEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectSwitchDisconnectSeq", "1.3.6.1.2.1.16.19.14.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectSwitchResetSeqEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectSwitchResetSeqEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectSwitchResetSeq", "1.3.6.1.2.1.16.19.14.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectOwnerEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectOwnerEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectOwner", "1.3.6.1.2.1.16.19.14.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SerialConnectStatusEnt extends MIBEntry<RMON2MIBDef>
                {
                    private SerialConnectStatusEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                    {
                        super(mib, parent, "serialConnectStatus", "1.3.6.1.2.1.16.19.14.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class EtherStats2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final EtherStats2EntryEnt etherStats2Entry;

        private EtherStats2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "etherStats2Table", "1.3.6.1.2.1.16.1.4", false, true, false, false);
            this.etherStats2Entry = new EtherStats2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.etherStats2Entry
            };
        }
        public static final class EtherStats2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final EtherStatsDroppedFramesEnt etherStatsDroppedFrames;

            public final EtherStatsCreateTimeEnt etherStatsCreateTime;

            private EtherStats2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "etherStats2Entry", "1.3.6.1.2.1.16.1.4.1", false, false, false, true);
                this.etherStatsDroppedFrames = new EtherStatsDroppedFramesEnt(mib, this);
                this.etherStatsCreateTime = new EtherStatsCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherStatsDroppedFrames,
                    this.etherStatsCreateTime
                };
            }
            public static final class EtherStatsDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private EtherStatsDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "etherStatsDroppedFrames", "1.3.6.1.2.1.16.1.4.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private EtherStatsCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "etherStatsCreateTime", "1.3.6.1.2.1.16.1.4.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HistoryControl2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final HistoryControl2EntryEnt historyControl2Entry;

        private HistoryControl2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "historyControl2Table", "1.3.6.1.2.1.16.2.5", false, true, false, false);
            this.historyControl2Entry = new HistoryControl2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.historyControl2Entry
            };
        }
        public static final class HistoryControl2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final HistoryControlDroppedFramesEnt historyControlDroppedFrames;

            private HistoryControl2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "historyControl2Entry", "1.3.6.1.2.1.16.2.5.1", false, false, false, true);
                this.historyControlDroppedFrames = new HistoryControlDroppedFramesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.historyControlDroppedFrames
                };
            }
            public static final class HistoryControlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private HistoryControlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "historyControlDroppedFrames", "1.3.6.1.2.1.16.2.5.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HostControl2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final HostControl2EntryEnt hostControl2Entry;

        private HostControl2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "hostControl2Table", "1.3.6.1.2.1.16.4.4", false, true, false, false);
            this.hostControl2Entry = new HostControl2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hostControl2Entry
            };
        }
        public static final class HostControl2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final HostControlDroppedFramesEnt hostControlDroppedFrames;

            public final HostControlCreateTimeEnt hostControlCreateTime;

            private HostControl2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "hostControl2Entry", "1.3.6.1.2.1.16.4.4.1", false, false, false, true);
                this.hostControlDroppedFrames = new HostControlDroppedFramesEnt(mib, this);
                this.hostControlCreateTime = new HostControlCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostControlDroppedFrames,
                    this.hostControlCreateTime
                };
            }
            public static final class HostControlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private HostControlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "hostControlDroppedFrames", "1.3.6.1.2.1.16.4.4.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostControlCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private HostControlCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "hostControlCreateTime", "1.3.6.1.2.1.16.4.4.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class MatrixControl2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final MatrixControl2EntryEnt matrixControl2Entry;

        private MatrixControl2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "matrixControl2Table", "1.3.6.1.2.1.16.6.4", false, true, false, false);
            this.matrixControl2Entry = new MatrixControl2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.matrixControl2Entry
            };
        }
        public static final class MatrixControl2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final MatrixControlDroppedFramesEnt matrixControlDroppedFrames;

            public final MatrixControlCreateTimeEnt matrixControlCreateTime;

            private MatrixControl2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "matrixControl2Entry", "1.3.6.1.2.1.16.6.4.1", false, false, false, true);
                this.matrixControlDroppedFrames = new MatrixControlDroppedFramesEnt(mib, this);
                this.matrixControlCreateTime = new MatrixControlCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.matrixControlDroppedFrames,
                    this.matrixControlCreateTime
                };
            }
            public static final class MatrixControlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private MatrixControlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "matrixControlDroppedFrames", "1.3.6.1.2.1.16.6.4.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixControlCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private MatrixControlCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "matrixControlCreateTime", "1.3.6.1.2.1.16.6.4.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Channel2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final Channel2EntryEnt channel2Entry;

        private Channel2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "channel2Table", "1.3.6.1.2.1.16.7.3", false, true, false, false);
            this.channel2Entry = new Channel2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.channel2Entry
            };
        }
        public static final class Channel2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final ChannelDroppedFramesEnt channelDroppedFrames;

            public final ChannelCreateTimeEnt channelCreateTime;

            private Channel2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "channel2Entry", "1.3.6.1.2.1.16.7.3.1", false, false, false, true);
                this.channelDroppedFrames = new ChannelDroppedFramesEnt(mib, this);
                this.channelCreateTime = new ChannelCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.channelDroppedFrames,
                    this.channelCreateTime
                };
            }
            public static final class ChannelDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private ChannelDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "channelDroppedFrames", "1.3.6.1.2.1.16.7.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ChannelCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private ChannelCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "channelCreateTime", "1.3.6.1.2.1.16.7.3.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class TokenRingMLStats2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final TokenRingMLStats2EntryEnt tokenRingMLStats2Entry;

        private TokenRingMLStats2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "tokenRingMLStats2Table", "1.3.6.1.2.1.16.1.5", false, true, false, false);
            this.tokenRingMLStats2Entry = new TokenRingMLStats2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tokenRingMLStats2Entry
            };
        }
        public static final class TokenRingMLStats2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final TokenRingMLStatsDroppedFramesEnt tokenRingMLStatsDroppedFrames;

            public final TokenRingMLStatsCreateTimeEnt tokenRingMLStatsCreateTime;

            private TokenRingMLStats2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "tokenRingMLStats2Entry", "1.3.6.1.2.1.16.1.5.1", false, false, false, true);
                this.tokenRingMLStatsDroppedFrames = new TokenRingMLStatsDroppedFramesEnt(mib, this);
                this.tokenRingMLStatsCreateTime = new TokenRingMLStatsCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tokenRingMLStatsDroppedFrames,
                    this.tokenRingMLStatsCreateTime
                };
            }
            public static final class TokenRingMLStatsDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private TokenRingMLStatsDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsDroppedFrames", "1.3.6.1.2.1.16.1.5.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingMLStatsCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private TokenRingMLStatsCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "tokenRingMLStatsCreateTime", "1.3.6.1.2.1.16.1.5.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class TokenRingPStats2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final TokenRingPStats2EntryEnt tokenRingPStats2Entry;

        private TokenRingPStats2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "tokenRingPStats2Table", "1.3.6.1.2.1.16.1.6", false, true, false, false);
            this.tokenRingPStats2Entry = new TokenRingPStats2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tokenRingPStats2Entry
            };
        }
        public static final class TokenRingPStats2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final TokenRingPStatsDroppedFramesEnt tokenRingPStatsDroppedFrames;

            public final TokenRingPStatsCreateTimeEnt tokenRingPStatsCreateTime;

            private TokenRingPStats2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "tokenRingPStats2Entry", "1.3.6.1.2.1.16.1.6.1", false, false, false, true);
                this.tokenRingPStatsDroppedFrames = new TokenRingPStatsDroppedFramesEnt(mib, this);
                this.tokenRingPStatsCreateTime = new TokenRingPStatsCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tokenRingPStatsDroppedFrames,
                    this.tokenRingPStatsCreateTime
                };
            }
            public static final class TokenRingPStatsDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private TokenRingPStatsDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsDroppedFrames", "1.3.6.1.2.1.16.1.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TokenRingPStatsCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private TokenRingPStatsCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "tokenRingPStatsCreateTime", "1.3.6.1.2.1.16.1.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class RingStationControl2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final RingStationControl2EntryEnt ringStationControl2Entry;

        private RingStationControl2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "ringStationControl2Table", "1.3.6.1.2.1.16.10.7", false, true, false, false);
            this.ringStationControl2Entry = new RingStationControl2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ringStationControl2Entry
            };
        }
        public static final class RingStationControl2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final RingStationControlDroppedFramesEnt ringStationControlDroppedFrames;

            public final RingStationControlCreateTimeEnt ringStationControlCreateTime;

            private RingStationControl2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "ringStationControl2Entry", "1.3.6.1.2.1.16.10.7.1", false, false, false, true);
                this.ringStationControlDroppedFrames = new RingStationControlDroppedFramesEnt(mib, this);
                this.ringStationControlCreateTime = new RingStationControlCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ringStationControlDroppedFrames,
                    this.ringStationControlCreateTime
                };
            }
            public static final class RingStationControlDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private RingStationControlDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "ringStationControlDroppedFrames", "1.3.6.1.2.1.16.10.7.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RingStationControlCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private RingStationControlCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "ringStationControlCreateTime", "1.3.6.1.2.1.16.10.7.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class SourceRoutingStats2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final SourceRoutingStats2EntryEnt sourceRoutingStats2Entry;

        private SourceRoutingStats2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "sourceRoutingStats2Table", "1.3.6.1.2.1.16.10.8", false, true, false, false);
            this.sourceRoutingStats2Entry = new SourceRoutingStats2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sourceRoutingStats2Entry
            };
        }
        public static final class SourceRoutingStats2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final SourceRoutingStatsDroppedFramesEnt sourceRoutingStatsDroppedFrames;

            public final SourceRoutingStatsCreateTimeEnt sourceRoutingStatsCreateTime;

            private SourceRoutingStats2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "sourceRoutingStats2Entry", "1.3.6.1.2.1.16.10.8.1", false, false, false, true);
                this.sourceRoutingStatsDroppedFrames = new SourceRoutingStatsDroppedFramesEnt(mib, this);
                this.sourceRoutingStatsCreateTime = new SourceRoutingStatsCreateTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sourceRoutingStatsDroppedFrames,
                    this.sourceRoutingStatsCreateTime
                };
            }
            public static final class SourceRoutingStatsDroppedFramesEnt extends MIBEntry<RMON2MIBDef>
            {
                private SourceRoutingStatsDroppedFramesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "sourceRoutingStatsDroppedFrames", "1.3.6.1.2.1.16.10.8.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SourceRoutingStatsCreateTimeEnt extends MIBEntry<RMON2MIBDef>
            {
                private SourceRoutingStatsCreateTimeEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "sourceRoutingStatsCreateTime", "1.3.6.1.2.1.16.10.8.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Filter2TableEnt extends MIBEntry<RMON2MIBDef>
    {
        public final Filter2EntryEnt filter2Entry;

        private Filter2TableEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "filter2Table", "1.3.6.1.2.1.16.7.4", false, true, false, false);
            this.filter2Entry = new Filter2EntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.filter2Entry
            };
        }
        public static final class Filter2EntryEnt extends MIBEntry<RMON2MIBDef>
        {
            public final FilterProtocolDirDataLocalIndexEnt filterProtocolDirDataLocalIndex;

            public final FilterProtocolDirLocalIndexEnt filterProtocolDirLocalIndex;

            private Filter2EntryEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "filter2Entry", "1.3.6.1.2.1.16.7.4.1", false, false, false, true);
                this.filterProtocolDirDataLocalIndex = new FilterProtocolDirDataLocalIndexEnt(mib, this);
                this.filterProtocolDirLocalIndex = new FilterProtocolDirLocalIndexEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.filterProtocolDirDataLocalIndex,
                    this.filterProtocolDirLocalIndex
                };
            }
            public static final class FilterProtocolDirDataLocalIndexEnt extends MIBEntry<RMON2MIBDef>
            {
                private FilterProtocolDirDataLocalIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "filterProtocolDirDataLocalIndex", "1.3.6.1.2.1.16.7.4.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FilterProtocolDirLocalIndexEnt extends MIBEntry<RMON2MIBDef>
            {
                private FilterProtocolDirLocalIndexEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
                {
                    super(mib, parent, "filterProtocolDirLocalIndex", "1.3.6.1.2.1.16.7.4.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Rmon2MIBCompliancesEnt extends MIBEntry<RMON2MIBDef>
    {
        public final Rmon2MIBComplianceEnt rmon2MIBCompliance;

        public final Rmon2MIBApplicationLayerComplianceEnt rmon2MIBApplicationLayerCompliance;

        private Rmon2MIBCompliancesEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "rmon2MIBCompliances", "1.3.6.1.2.1.16.20.1", false, false, false, false);
            this.rmon2MIBCompliance = new Rmon2MIBComplianceEnt(mib, this);
            this.rmon2MIBApplicationLayerCompliance = new Rmon2MIBApplicationLayerComplianceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rmon2MIBCompliance,
                this.rmon2MIBApplicationLayerCompliance
            };
        }
        public static final class Rmon2MIBComplianceEnt extends MIBEntry<RMON2MIBDef>
        {
            private Rmon2MIBComplianceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "rmon2MIBCompliance", "1.3.6.1.2.1.16.20.1.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Rmon2MIBApplicationLayerComplianceEnt extends MIBEntry<RMON2MIBDef>
        {
            private Rmon2MIBApplicationLayerComplianceEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "rmon2MIBApplicationLayerCompliance", "1.3.6.1.2.1.16.20.1.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class Rmon2MIBGroupsEnt extends MIBEntry<RMON2MIBDef>
    {
        public final ProtocolDirectoryGroupEnt protocolDirectoryGroup;

        public final ProtocolDistributionGroupEnt protocolDistributionGroup;

        public final AddressMapGroupEnt addressMapGroup;

        public final NlHostGroupEnt nlHostGroup;

        public final NlMatrixGroupEnt nlMatrixGroup;

        public final AlHostGroupEnt alHostGroup;

        public final AlMatrixGroupEnt alMatrixGroup;

        public final UsrHistoryGroupEnt usrHistoryGroup;

        public final ProbeInformationGroupEnt probeInformationGroup;

        public final ProbeConfigurationGroupEnt probeConfigurationGroup;

        public final Rmon1EnhancementGroupEnt rmon1EnhancementGroup;

        public final Rmon1EthernetEnhancementGroupEnt rmon1EthernetEnhancementGroup;

        public final Rmon1TokenRingEnhancementGroupEnt rmon1TokenRingEnhancementGroup;

        private Rmon2MIBGroupsEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
        {
            super(mib, parent, "rmon2MIBGroups", "1.3.6.1.2.1.16.20.2", false, false, false, false);
            this.protocolDirectoryGroup = new ProtocolDirectoryGroupEnt(mib, this);
            this.protocolDistributionGroup = new ProtocolDistributionGroupEnt(mib, this);
            this.addressMapGroup = new AddressMapGroupEnt(mib, this);
            this.nlHostGroup = new NlHostGroupEnt(mib, this);
            this.nlMatrixGroup = new NlMatrixGroupEnt(mib, this);
            this.alHostGroup = new AlHostGroupEnt(mib, this);
            this.alMatrixGroup = new AlMatrixGroupEnt(mib, this);
            this.usrHistoryGroup = new UsrHistoryGroupEnt(mib, this);
            this.probeInformationGroup = new ProbeInformationGroupEnt(mib, this);
            this.probeConfigurationGroup = new ProbeConfigurationGroupEnt(mib, this);
            this.rmon1EnhancementGroup = new Rmon1EnhancementGroupEnt(mib, this);
            this.rmon1EthernetEnhancementGroup = new Rmon1EthernetEnhancementGroupEnt(mib, this);
            this.rmon1TokenRingEnhancementGroup = new Rmon1TokenRingEnhancementGroupEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.protocolDirectoryGroup,
                this.protocolDistributionGroup,
                this.addressMapGroup,
                this.nlHostGroup,
                this.nlMatrixGroup,
                this.alHostGroup,
                this.alMatrixGroup,
                this.usrHistoryGroup,
                this.probeInformationGroup,
                this.probeConfigurationGroup,
                this.rmon1EnhancementGroup,
                this.rmon1EthernetEnhancementGroup,
                this.rmon1TokenRingEnhancementGroup
            };
        }
        public static final class ProtocolDirectoryGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProtocolDirectoryGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "protocolDirectoryGroup", "1.3.6.1.2.1.16.20.2.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProtocolDistributionGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProtocolDistributionGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "protocolDistributionGroup", "1.3.6.1.2.1.16.20.2.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AddressMapGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private AddressMapGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "addressMapGroup", "1.3.6.1.2.1.16.20.2.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class NlHostGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private NlHostGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlHostGroup", "1.3.6.1.2.1.16.20.2.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class NlMatrixGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private NlMatrixGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "nlMatrixGroup", "1.3.6.1.2.1.16.20.2.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AlHostGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private AlHostGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alHostGroup", "1.3.6.1.2.1.16.20.2.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AlMatrixGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private AlMatrixGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "alMatrixGroup", "1.3.6.1.2.1.16.20.2.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UsrHistoryGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private UsrHistoryGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "usrHistoryGroup", "1.3.6.1.2.1.16.20.2.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeInformationGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeInformationGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeInformationGroup", "1.3.6.1.2.1.16.20.2.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProbeConfigurationGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private ProbeConfigurationGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "probeConfigurationGroup", "1.3.6.1.2.1.16.20.2.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Rmon1EnhancementGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private Rmon1EnhancementGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "rmon1EnhancementGroup", "1.3.6.1.2.1.16.20.2.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Rmon1EthernetEnhancementGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private Rmon1EthernetEnhancementGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "rmon1EthernetEnhancementGroup", "1.3.6.1.2.1.16.20.2.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Rmon1TokenRingEnhancementGroupEnt extends MIBEntry<RMON2MIBDef>
        {
            private Rmon1TokenRingEnhancementGroupEnt(RMON2MIBDef mib, MIBEntry<RMON2MIBDef> parent)
            {
                super(mib, parent, "rmon1TokenRingEnhancementGroup", "1.3.6.1.2.1.16.20.2.13", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
