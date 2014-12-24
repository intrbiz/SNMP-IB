package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SMONMIBDef extends MIB
{
    public static final SMONMIBDef SMONMIB = new SMONMIBDef();

    public final SwitchRMONEnt switchRMON;

    /** The smonCapabilities object describes SMON agent capabilities.*/
    public final SmonCapabilitiesEnt smonCapabilities;

    /** Defined for use as an SmonDataSource. A single integer parameteris appended to the end of this OID when actually encountered inthe dataSourceCapsTable, which represents a positive, non-zeroVLAN identifier value.
Conformance Macros*/
    public final SmonMIBCompliancesEnt smonMIBCompliances;

    public final SmonMIBGroupsEnt smonMIBGroups;

    private SMONMIBDef()
    {
        super("SMON-MIB");
        this.switchRMON = new SwitchRMONEnt(this, null);
        this.smonCapabilities = new SmonCapabilitiesEnt(this, null);
        this.smonMIBCompliances = new SmonMIBCompliancesEnt(this, null);
        this.smonMIBGroups = new SmonMIBGroupsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.switchRMON,
            this.smonCapabilities,
            this.smonMIBCompliances,
            this.smonMIBGroups
        };
    }

    public static final class SwitchRMONEnt extends MIBEntry<SMONMIBDef>
    {
        public final SmonMIBObjectsEnt smonMIBObjects;

        private SwitchRMONEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
        {
            super(mib, parent, "switchRMON", "1.3.6.1.2.1.16.22", false, false, false, false);
            this.smonMIBObjects = new SmonMIBObjectsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.smonMIBObjects
            };
        }
        public static final class SmonMIBObjectsEnt extends MIBEntry<SMONMIBDef>
        {
            public final DataSourceCapsEnt dataSourceCaps;

            public final SmonStatsEnt smonStats;

            public final PortCopyConfigEnt portCopyConfig;

            public final SmonRegistrationPointsEnt smonRegistrationPoints;

            private SmonMIBObjectsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonMIBObjects", "1.3.6.1.2.1.16.22.1", false, false, false, false);
                this.dataSourceCaps = new DataSourceCapsEnt(mib, this);
                this.smonStats = new SmonStatsEnt(mib, this);
                this.portCopyConfig = new PortCopyConfigEnt(mib, this);
                this.smonRegistrationPoints = new SmonRegistrationPointsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dataSourceCaps,
                    this.smonStats,
                    this.portCopyConfig,
                    this.smonRegistrationPoints
                };
            }
            public static final class DataSourceCapsEnt extends MIBEntry<SMONMIBDef>
            {
                /** dataSourceCaps MIB group - defines SMON data source and portcopy capabilities for devices supporting SMON.
A NMS application will check this MIB group and retrieveinformation about the SMON capabilities of the device beforeapplying SMON control operations to the device.

dataSourceCapsTable: defines capabilities of RMON data sources*/
                public final DataSourceCapsTableEnt dataSourceCapsTable;

                private DataSourceCapsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                {
                    super(mib, parent, "dataSourceCaps", "1.3.6.1.2.1.16.22.1.1", false, false, false, false);
                    this.dataSourceCapsTable = new DataSourceCapsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dataSourceCapsTable
                    };
                }
                public static final class DataSourceCapsTableEnt extends MIBEntry<SMONMIBDef>
                {
                    public final DataSourceCapsEntryEnt dataSourceCapsEntry;

                    private DataSourceCapsTableEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "dataSourceCapsTable", "1.3.6.1.2.1.16.22.1.1.1", false, true, false, false);
                        this.dataSourceCapsEntry = new DataSourceCapsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dataSourceCapsEntry
                        };
                    }
                    public static final class DataSourceCapsEntryEnt extends MIBEntry<SMONMIBDef>
                    {
                        public final DataSourceCapsObjectEnt dataSourceCapsObject;

                        public final DataSourceRmonCapsEnt dataSourceRmonCaps;

                        public final DataSourceCopyCapsEnt dataSourceCopyCaps;

                        public final DataSourceCapsIfIndexEnt dataSourceCapsIfIndex;

                        private DataSourceCapsEntryEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                        {
                            super(mib, parent, "dataSourceCapsEntry", "1.3.6.1.2.1.16.22.1.1.1.1", false, false, false, true);
                            this.dataSourceCapsObject = new DataSourceCapsObjectEnt(mib, this);
                            this.dataSourceRmonCaps = new DataSourceRmonCapsEnt(mib, this);
                            this.dataSourceCopyCaps = new DataSourceCopyCapsEnt(mib, this);
                            this.dataSourceCapsIfIndex = new DataSourceCapsIfIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dataSourceCapsObject,
                                this.dataSourceRmonCaps,
                                this.dataSourceCopyCaps,
                                this.dataSourceCapsIfIndex
                            };
                        }
                        public static final class DataSourceCapsObjectEnt extends MIBEntry<SMONMIBDef>
                        {
                            private DataSourceCapsObjectEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "dataSourceCapsObject", "1.3.6.1.2.1.16.22.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DataSourceRmonCapsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private DataSourceRmonCapsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "dataSourceRmonCaps", "1.3.6.1.2.1.16.22.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DataSourceCopyCapsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private DataSourceCopyCapsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "dataSourceCopyCaps", "1.3.6.1.2.1.16.22.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DataSourceCapsIfIndexEnt extends MIBEntry<SMONMIBDef>
                        {
                            private DataSourceCapsIfIndexEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "dataSourceCapsIfIndex", "1.3.6.1.2.1.16.22.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SmonStatsEnt extends MIBEntry<SMONMIBDef>
            {
                /** The SMON Statistics MIB Group
aggregated statistics for IEEE 802.1Q VLAN environments.
VLAN statistics can be gathered by configuring smonVlanIdStatsand/or smonPrioStats collections. These functions allow aVLAN-ID or user priority distributions per dataSource,auto-populated by the agent in a manner similar to the RMONhostTable.
Only good frames are counted in the tables described in thissection.
VLAN ID Stats
smonVlanStatsControlTable allows configuration of VLAN-IDcollections.*/
                public final SmonVlanStatsControlTableEnt smonVlanStatsControlTable;

                /** The VLAN Statistics Table*/
                public final SmonVlanIdStatsTableEnt smonVlanIdStatsTable;

                /** smonPrioStatsControlTable*/
                public final SmonPrioStatsControlTableEnt smonPrioStatsControlTable;

                /** The Priority Statistics Table*/
                public final SmonPrioStatsTableEnt smonPrioStatsTable;

                private SmonStatsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                {
                    super(mib, parent, "smonStats", "1.3.6.1.2.1.16.22.1.2", false, false, false, false);
                    this.smonVlanStatsControlTable = new SmonVlanStatsControlTableEnt(mib, this);
                    this.smonVlanIdStatsTable = new SmonVlanIdStatsTableEnt(mib, this);
                    this.smonPrioStatsControlTable = new SmonPrioStatsControlTableEnt(mib, this);
                    this.smonPrioStatsTable = new SmonPrioStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smonVlanStatsControlTable,
                        this.smonVlanIdStatsTable,
                        this.smonPrioStatsControlTable,
                        this.smonPrioStatsTable
                    };
                }
                public static final class SmonVlanStatsControlTableEnt extends MIBEntry<SMONMIBDef>
                {
                    public final SmonVlanStatsControlEntryEnt smonVlanStatsControlEntry;

                    private SmonVlanStatsControlTableEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "smonVlanStatsControlTable", "1.3.6.1.2.1.16.22.1.2.1", false, true, false, false);
                        this.smonVlanStatsControlEntry = new SmonVlanStatsControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smonVlanStatsControlEntry
                        };
                    }
                    public static final class SmonVlanStatsControlEntryEnt extends MIBEntry<SMONMIBDef>
                    {
                        public final SmonVlanStatsControlIndexEnt smonVlanStatsControlIndex;

                        public final SmonVlanStatsControlDataSourceEnt smonVlanStatsControlDataSource;

                        public final SmonVlanStatsControlCreateTimeEnt smonVlanStatsControlCreateTime;

                        public final SmonVlanStatsControlOwnerEnt smonVlanStatsControlOwner;

                        public final SmonVlanStatsControlStatusEnt smonVlanStatsControlStatus;

                        private SmonVlanStatsControlEntryEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                        {
                            super(mib, parent, "smonVlanStatsControlEntry", "1.3.6.1.2.1.16.22.1.2.1.1", false, false, false, true);
                            this.smonVlanStatsControlIndex = new SmonVlanStatsControlIndexEnt(mib, this);
                            this.smonVlanStatsControlDataSource = new SmonVlanStatsControlDataSourceEnt(mib, this);
                            this.smonVlanStatsControlCreateTime = new SmonVlanStatsControlCreateTimeEnt(mib, this);
                            this.smonVlanStatsControlOwner = new SmonVlanStatsControlOwnerEnt(mib, this);
                            this.smonVlanStatsControlStatus = new SmonVlanStatsControlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smonVlanStatsControlIndex,
                                this.smonVlanStatsControlDataSource,
                                this.smonVlanStatsControlCreateTime,
                                this.smonVlanStatsControlOwner,
                                this.smonVlanStatsControlStatus
                            };
                        }
                        public static final class SmonVlanStatsControlIndexEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanStatsControlIndexEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanStatsControlIndex", "1.3.6.1.2.1.16.22.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanStatsControlDataSourceEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanStatsControlDataSourceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanStatsControlDataSource", "1.3.6.1.2.1.16.22.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanStatsControlCreateTimeEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanStatsControlCreateTimeEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanStatsControlCreateTime", "1.3.6.1.2.1.16.22.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanStatsControlOwnerEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanStatsControlOwnerEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanStatsControlOwner", "1.3.6.1.2.1.16.22.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanStatsControlStatusEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanStatsControlStatusEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanStatsControlStatus", "1.3.6.1.2.1.16.22.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SmonVlanIdStatsTableEnt extends MIBEntry<SMONMIBDef>
                {
                    public final SmonVlanIdStatsEntryEnt smonVlanIdStatsEntry;

                    private SmonVlanIdStatsTableEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "smonVlanIdStatsTable", "1.3.6.1.2.1.16.22.1.2.2", false, true, false, false);
                        this.smonVlanIdStatsEntry = new SmonVlanIdStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smonVlanIdStatsEntry
                        };
                    }
                    public static final class SmonVlanIdStatsEntryEnt extends MIBEntry<SMONMIBDef>
                    {
                        public final SmonVlanIdStatsIdEnt smonVlanIdStatsId;

                        public final SmonVlanIdStatsTotalPktsEnt smonVlanIdStatsTotalPkts;

                        public final SmonVlanIdStatsTotalOverflowPktsEnt smonVlanIdStatsTotalOverflowPkts;

                        public final SmonVlanIdStatsTotalHCPktsEnt smonVlanIdStatsTotalHCPkts;

                        public final SmonVlanIdStatsTotalOctetsEnt smonVlanIdStatsTotalOctets;

                        public final SmonVlanIdStatsTotalOverflowOctetsEnt smonVlanIdStatsTotalOverflowOctets;

                        public final SmonVlanIdStatsTotalHCOctetsEnt smonVlanIdStatsTotalHCOctets;

                        public final SmonVlanIdStatsNUcastPktsEnt smonVlanIdStatsNUcastPkts;

                        public final SmonVlanIdStatsNUcastOverflowPktsEnt smonVlanIdStatsNUcastOverflowPkts;

                        public final SmonVlanIdStatsNUcastHCPktsEnt smonVlanIdStatsNUcastHCPkts;

                        public final SmonVlanIdStatsNUcastOctetsEnt smonVlanIdStatsNUcastOctets;

                        public final SmonVlanIdStatsNUcastOverflowOctetsEnt smonVlanIdStatsNUcastOverflowOctets;

                        public final SmonVlanIdStatsNUcastHCOctetsEnt smonVlanIdStatsNUcastHCOctets;

                        public final SmonVlanIdStatsCreateTimeEnt smonVlanIdStatsCreateTime;

                        private SmonVlanIdStatsEntryEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                        {
                            super(mib, parent, "smonVlanIdStatsEntry", "1.3.6.1.2.1.16.22.1.2.2.1", false, false, false, true);
                            this.smonVlanIdStatsId = new SmonVlanIdStatsIdEnt(mib, this);
                            this.smonVlanIdStatsTotalPkts = new SmonVlanIdStatsTotalPktsEnt(mib, this);
                            this.smonVlanIdStatsTotalOverflowPkts = new SmonVlanIdStatsTotalOverflowPktsEnt(mib, this);
                            this.smonVlanIdStatsTotalHCPkts = new SmonVlanIdStatsTotalHCPktsEnt(mib, this);
                            this.smonVlanIdStatsTotalOctets = new SmonVlanIdStatsTotalOctetsEnt(mib, this);
                            this.smonVlanIdStatsTotalOverflowOctets = new SmonVlanIdStatsTotalOverflowOctetsEnt(mib, this);
                            this.smonVlanIdStatsTotalHCOctets = new SmonVlanIdStatsTotalHCOctetsEnt(mib, this);
                            this.smonVlanIdStatsNUcastPkts = new SmonVlanIdStatsNUcastPktsEnt(mib, this);
                            this.smonVlanIdStatsNUcastOverflowPkts = new SmonVlanIdStatsNUcastOverflowPktsEnt(mib, this);
                            this.smonVlanIdStatsNUcastHCPkts = new SmonVlanIdStatsNUcastHCPktsEnt(mib, this);
                            this.smonVlanIdStatsNUcastOctets = new SmonVlanIdStatsNUcastOctetsEnt(mib, this);
                            this.smonVlanIdStatsNUcastOverflowOctets = new SmonVlanIdStatsNUcastOverflowOctetsEnt(mib, this);
                            this.smonVlanIdStatsNUcastHCOctets = new SmonVlanIdStatsNUcastHCOctetsEnt(mib, this);
                            this.smonVlanIdStatsCreateTime = new SmonVlanIdStatsCreateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smonVlanIdStatsId,
                                this.smonVlanIdStatsTotalPkts,
                                this.smonVlanIdStatsTotalOverflowPkts,
                                this.smonVlanIdStatsTotalHCPkts,
                                this.smonVlanIdStatsTotalOctets,
                                this.smonVlanIdStatsTotalOverflowOctets,
                                this.smonVlanIdStatsTotalHCOctets,
                                this.smonVlanIdStatsNUcastPkts,
                                this.smonVlanIdStatsNUcastOverflowPkts,
                                this.smonVlanIdStatsNUcastHCPkts,
                                this.smonVlanIdStatsNUcastOctets,
                                this.smonVlanIdStatsNUcastOverflowOctets,
                                this.smonVlanIdStatsNUcastHCOctets,
                                this.smonVlanIdStatsCreateTime
                            };
                        }
                        public static final class SmonVlanIdStatsIdEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsIdEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsId", "1.3.6.1.2.1.16.22.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsTotalPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsTotalPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsTotalPkts", "1.3.6.1.2.1.16.22.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsTotalOverflowPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsTotalOverflowPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsTotalOverflowPkts", "1.3.6.1.2.1.16.22.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsTotalHCPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsTotalHCPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsTotalHCPkts", "1.3.6.1.2.1.16.22.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsTotalOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsTotalOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsTotalOctets", "1.3.6.1.2.1.16.22.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsTotalOverflowOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsTotalOverflowOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsTotalOverflowOctets", "1.3.6.1.2.1.16.22.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsTotalHCOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsTotalHCOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsTotalHCOctets", "1.3.6.1.2.1.16.22.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsNUcastPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsNUcastPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsNUcastPkts", "1.3.6.1.2.1.16.22.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsNUcastOverflowPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsNUcastOverflowPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsNUcastOverflowPkts", "1.3.6.1.2.1.16.22.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsNUcastHCPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsNUcastHCPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsNUcastHCPkts", "1.3.6.1.2.1.16.22.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsNUcastOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsNUcastOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsNUcastOctets", "1.3.6.1.2.1.16.22.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsNUcastOverflowOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsNUcastOverflowOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsNUcastOverflowOctets", "1.3.6.1.2.1.16.22.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsNUcastHCOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsNUcastHCOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsNUcastHCOctets", "1.3.6.1.2.1.16.22.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonVlanIdStatsCreateTimeEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonVlanIdStatsCreateTimeEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonVlanIdStatsCreateTime", "1.3.6.1.2.1.16.22.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SmonPrioStatsControlTableEnt extends MIBEntry<SMONMIBDef>
                {
                    public final SmonPrioStatsControlEntryEnt smonPrioStatsControlEntry;

                    private SmonPrioStatsControlTableEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "smonPrioStatsControlTable", "1.3.6.1.2.1.16.22.1.2.3", false, true, false, false);
                        this.smonPrioStatsControlEntry = new SmonPrioStatsControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smonPrioStatsControlEntry
                        };
                    }
                    public static final class SmonPrioStatsControlEntryEnt extends MIBEntry<SMONMIBDef>
                    {
                        public final SmonPrioStatsControlIndexEnt smonPrioStatsControlIndex;

                        public final SmonPrioStatsControlDataSourceEnt smonPrioStatsControlDataSource;

                        public final SmonPrioStatsControlCreateTimeEnt smonPrioStatsControlCreateTime;

                        public final SmonPrioStatsControlOwnerEnt smonPrioStatsControlOwner;

                        public final SmonPrioStatsControlStatusEnt smonPrioStatsControlStatus;

                        private SmonPrioStatsControlEntryEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                        {
                            super(mib, parent, "smonPrioStatsControlEntry", "1.3.6.1.2.1.16.22.1.2.3.1", false, false, false, true);
                            this.smonPrioStatsControlIndex = new SmonPrioStatsControlIndexEnt(mib, this);
                            this.smonPrioStatsControlDataSource = new SmonPrioStatsControlDataSourceEnt(mib, this);
                            this.smonPrioStatsControlCreateTime = new SmonPrioStatsControlCreateTimeEnt(mib, this);
                            this.smonPrioStatsControlOwner = new SmonPrioStatsControlOwnerEnt(mib, this);
                            this.smonPrioStatsControlStatus = new SmonPrioStatsControlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smonPrioStatsControlIndex,
                                this.smonPrioStatsControlDataSource,
                                this.smonPrioStatsControlCreateTime,
                                this.smonPrioStatsControlOwner,
                                this.smonPrioStatsControlStatus
                            };
                        }
                        public static final class SmonPrioStatsControlIndexEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsControlIndexEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsControlIndex", "1.3.6.1.2.1.16.22.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsControlDataSourceEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsControlDataSourceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsControlDataSource", "1.3.6.1.2.1.16.22.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsControlCreateTimeEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsControlCreateTimeEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsControlCreateTime", "1.3.6.1.2.1.16.22.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsControlOwnerEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsControlOwnerEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsControlOwner", "1.3.6.1.2.1.16.22.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsControlStatusEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsControlStatusEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsControlStatus", "1.3.6.1.2.1.16.22.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SmonPrioStatsTableEnt extends MIBEntry<SMONMIBDef>
                {
                    public final SmonPrioStatsEntryEnt smonPrioStatsEntry;

                    private SmonPrioStatsTableEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "smonPrioStatsTable", "1.3.6.1.2.1.16.22.1.2.4", false, true, false, false);
                        this.smonPrioStatsEntry = new SmonPrioStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smonPrioStatsEntry
                        };
                    }
                    public static final class SmonPrioStatsEntryEnt extends MIBEntry<SMONMIBDef>
                    {
                        public final SmonPrioStatsIdEnt smonPrioStatsId;

                        public final SmonPrioStatsPktsEnt smonPrioStatsPkts;

                        public final SmonPrioStatsOverflowPktsEnt smonPrioStatsOverflowPkts;

                        public final SmonPrioStatsHCPktsEnt smonPrioStatsHCPkts;

                        public final SmonPrioStatsOctetsEnt smonPrioStatsOctets;

                        public final SmonPrioStatsOverflowOctetsEnt smonPrioStatsOverflowOctets;

                        public final SmonPrioStatsHCOctetsEnt smonPrioStatsHCOctets;

                        private SmonPrioStatsEntryEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                        {
                            super(mib, parent, "smonPrioStatsEntry", "1.3.6.1.2.1.16.22.1.2.4.1", false, false, false, true);
                            this.smonPrioStatsId = new SmonPrioStatsIdEnt(mib, this);
                            this.smonPrioStatsPkts = new SmonPrioStatsPktsEnt(mib, this);
                            this.smonPrioStatsOverflowPkts = new SmonPrioStatsOverflowPktsEnt(mib, this);
                            this.smonPrioStatsHCPkts = new SmonPrioStatsHCPktsEnt(mib, this);
                            this.smonPrioStatsOctets = new SmonPrioStatsOctetsEnt(mib, this);
                            this.smonPrioStatsOverflowOctets = new SmonPrioStatsOverflowOctetsEnt(mib, this);
                            this.smonPrioStatsHCOctets = new SmonPrioStatsHCOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smonPrioStatsId,
                                this.smonPrioStatsPkts,
                                this.smonPrioStatsOverflowPkts,
                                this.smonPrioStatsHCPkts,
                                this.smonPrioStatsOctets,
                                this.smonPrioStatsOverflowOctets,
                                this.smonPrioStatsHCOctets
                            };
                        }
                        public static final class SmonPrioStatsIdEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsIdEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsId", "1.3.6.1.2.1.16.22.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsPkts", "1.3.6.1.2.1.16.22.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsOverflowPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsOverflowPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsOverflowPkts", "1.3.6.1.2.1.16.22.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsHCPktsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsHCPktsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsHCPkts", "1.3.6.1.2.1.16.22.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsOctets", "1.3.6.1.2.1.16.22.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsOverflowOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsOverflowOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsOverflowOctets", "1.3.6.1.2.1.16.22.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmonPrioStatsHCOctetsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private SmonPrioStatsHCOctetsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "smonPrioStatsHCOctets", "1.3.6.1.2.1.16.22.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PortCopyConfigEnt extends MIBEntry<SMONMIBDef>
            {
                public final PortCopyTableEnt portCopyTable;

                private PortCopyConfigEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                {
                    super(mib, parent, "portCopyConfig", "1.3.6.1.2.1.16.22.1.3", false, false, false, false);
                    this.portCopyTable = new PortCopyTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.portCopyTable
                    };
                }
                public static final class PortCopyTableEnt extends MIBEntry<SMONMIBDef>
                {
                    public final PortCopyEntryEnt portCopyEntry;

                    private PortCopyTableEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "portCopyTable", "1.3.6.1.2.1.16.22.1.3.1", false, true, false, false);
                        this.portCopyEntry = new PortCopyEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.portCopyEntry
                        };
                    }
                    public static final class PortCopyEntryEnt extends MIBEntry<SMONMIBDef>
                    {
                        public final PortCopySourceEnt portCopySource;

                        public final PortCopyDestEnt portCopyDest;

                        public final PortCopyDestDropEventsEnt portCopyDestDropEvents;

                        public final PortCopyDirectionEnt portCopyDirection;

                        public final PortCopyStatusEnt portCopyStatus;

                        private PortCopyEntryEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                        {
                            super(mib, parent, "portCopyEntry", "1.3.6.1.2.1.16.22.1.3.1.1", false, false, false, true);
                            this.portCopySource = new PortCopySourceEnt(mib, this);
                            this.portCopyDest = new PortCopyDestEnt(mib, this);
                            this.portCopyDestDropEvents = new PortCopyDestDropEventsEnt(mib, this);
                            this.portCopyDirection = new PortCopyDirectionEnt(mib, this);
                            this.portCopyStatus = new PortCopyStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.portCopySource,
                                this.portCopyDest,
                                this.portCopyDestDropEvents,
                                this.portCopyDirection,
                                this.portCopyStatus
                            };
                        }
                        public static final class PortCopySourceEnt extends MIBEntry<SMONMIBDef>
                        {
                            private PortCopySourceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "portCopySource", "1.3.6.1.2.1.16.22.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PortCopyDestEnt extends MIBEntry<SMONMIBDef>
                        {
                            private PortCopyDestEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "portCopyDest", "1.3.6.1.2.1.16.22.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PortCopyDestDropEventsEnt extends MIBEntry<SMONMIBDef>
                        {
                            private PortCopyDestDropEventsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "portCopyDestDropEvents", "1.3.6.1.2.1.16.22.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PortCopyDirectionEnt extends MIBEntry<SMONMIBDef>
                        {
                            private PortCopyDirectionEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "portCopyDirection", "1.3.6.1.2.1.16.22.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PortCopyStatusEnt extends MIBEntry<SMONMIBDef>
                        {
                            private PortCopyStatusEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                            {
                                super(mib, parent, "portCopyStatus", "1.3.6.1.2.1.16.22.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SmonRegistrationPointsEnt extends MIBEntry<SMONMIBDef>
            {
                /** smonRegistrationPointsdefines a set of OIDs for registration purposes of entitiessupported by the SMON MIB.*/
                public final SmonVlanDataSourceEnt smonVlanDataSource;

                private SmonRegistrationPointsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                {
                    super(mib, parent, "smonRegistrationPoints", "1.3.6.1.2.1.16.22.1.4", false, false, false, false);
                    this.smonVlanDataSource = new SmonVlanDataSourceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smonVlanDataSource
                    };
                }
                public static final class SmonVlanDataSourceEnt extends MIBEntry<SMONMIBDef>
                {
                    private SmonVlanDataSourceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
                    {
                        super(mib, parent, "smonVlanDataSource", "1.3.6.1.2.1.16.22.1.4.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SmonCapabilitiesEnt extends MIBEntry<SMONMIBDef>
    {
        private SmonCapabilitiesEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
        {
            super(mib, parent, "smonCapabilities", "1.3.6.1.2.1.16.19.15", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SmonMIBCompliancesEnt extends MIBEntry<SMONMIBDef>
    {
        public final SmonMIBComplianceEnt smonMIBCompliance;

        public final SmonMIBVlanStatsComplianceEnt smonMIBVlanStatsCompliance;

        public final SmonMIBPrioStatsComplianceEnt smonMIBPrioStatsCompliance;

        public final PortCopyComplianceEnt portCopyCompliance;

        private SmonMIBCompliancesEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
        {
            super(mib, parent, "smonMIBCompliances", "1.3.6.1.2.1.16.20.3", false, false, false, false);
            this.smonMIBCompliance = new SmonMIBComplianceEnt(mib, this);
            this.smonMIBVlanStatsCompliance = new SmonMIBVlanStatsComplianceEnt(mib, this);
            this.smonMIBPrioStatsCompliance = new SmonMIBPrioStatsComplianceEnt(mib, this);
            this.portCopyCompliance = new PortCopyComplianceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.smonMIBCompliance,
                this.smonMIBVlanStatsCompliance,
                this.smonMIBPrioStatsCompliance,
                this.portCopyCompliance
            };
        }
        public static final class SmonMIBComplianceEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonMIBComplianceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonMIBCompliance", "1.3.6.1.2.1.16.20.3.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonMIBVlanStatsComplianceEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonMIBVlanStatsComplianceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonMIBVlanStatsCompliance", "1.3.6.1.2.1.16.20.3.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonMIBPrioStatsComplianceEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonMIBPrioStatsComplianceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonMIBPrioStatsCompliance", "1.3.6.1.2.1.16.20.3.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PortCopyComplianceEnt extends MIBEntry<SMONMIBDef>
        {
            private PortCopyComplianceEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "portCopyCompliance", "1.3.6.1.2.1.16.20.3.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class SmonMIBGroupsEnt extends MIBEntry<SMONMIBDef>
    {
        public final DataSourceCapsGroupEnt dataSourceCapsGroup;

        public final SmonVlanStatsGroupEnt smonVlanStatsGroup;

        public final SmonPrioStatsGroupEnt smonPrioStatsGroup;

        public final SmonHcTo100mbGroupEnt smonHcTo100mbGroup;

        public final SmonHc100mbPlusGroupEnt smonHc100mbPlusGroup;

        public final HcVlanTo100mbGroupEnt hcVlanTo100mbGroup;

        public final HcVlan100mbPlusGroupEnt hcVlan100mbPlusGroup;

        public final HcPrioTo100mbGroupEnt hcPrioTo100mbGroup;

        public final HcPrio100mbPlusGroupEnt hcPrio100mbPlusGroup;

        public final SmonVlanStatsExtGroupEnt smonVlanStatsExtGroup;

        public final SmonInformationGroupEnt smonInformationGroup;

        public final PortCopyConfigGroupEnt portCopyConfigGroup;

        private SmonMIBGroupsEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
        {
            super(mib, parent, "smonMIBGroups", "1.3.6.1.2.1.16.20.4", false, false, false, false);
            this.dataSourceCapsGroup = new DataSourceCapsGroupEnt(mib, this);
            this.smonVlanStatsGroup = new SmonVlanStatsGroupEnt(mib, this);
            this.smonPrioStatsGroup = new SmonPrioStatsGroupEnt(mib, this);
            this.smonHcTo100mbGroup = new SmonHcTo100mbGroupEnt(mib, this);
            this.smonHc100mbPlusGroup = new SmonHc100mbPlusGroupEnt(mib, this);
            this.hcVlanTo100mbGroup = new HcVlanTo100mbGroupEnt(mib, this);
            this.hcVlan100mbPlusGroup = new HcVlan100mbPlusGroupEnt(mib, this);
            this.hcPrioTo100mbGroup = new HcPrioTo100mbGroupEnt(mib, this);
            this.hcPrio100mbPlusGroup = new HcPrio100mbPlusGroupEnt(mib, this);
            this.smonVlanStatsExtGroup = new SmonVlanStatsExtGroupEnt(mib, this);
            this.smonInformationGroup = new SmonInformationGroupEnt(mib, this);
            this.portCopyConfigGroup = new PortCopyConfigGroupEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dataSourceCapsGroup,
                this.smonVlanStatsGroup,
                this.smonPrioStatsGroup,
                this.smonHcTo100mbGroup,
                this.smonHc100mbPlusGroup,
                this.hcVlanTo100mbGroup,
                this.hcVlan100mbPlusGroup,
                this.hcPrioTo100mbGroup,
                this.hcPrio100mbPlusGroup,
                this.smonVlanStatsExtGroup,
                this.smonInformationGroup,
                this.portCopyConfigGroup
            };
        }
        public static final class DataSourceCapsGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private DataSourceCapsGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "dataSourceCapsGroup", "1.3.6.1.2.1.16.20.4.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonVlanStatsGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonVlanStatsGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonVlanStatsGroup", "1.3.6.1.2.1.16.20.4.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonPrioStatsGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonPrioStatsGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonPrioStatsGroup", "1.3.6.1.2.1.16.20.4.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonHcTo100mbGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonHcTo100mbGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonHcTo100mbGroup", "1.3.6.1.2.1.16.20.4.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonHc100mbPlusGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonHc100mbPlusGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonHc100mbPlusGroup", "1.3.6.1.2.1.16.20.4.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcVlanTo100mbGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private HcVlanTo100mbGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "hcVlanTo100mbGroup", "1.3.6.1.2.1.16.20.4.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcVlan100mbPlusGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private HcVlan100mbPlusGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "hcVlan100mbPlusGroup", "1.3.6.1.2.1.16.20.4.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcPrioTo100mbGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private HcPrioTo100mbGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "hcPrioTo100mbGroup", "1.3.6.1.2.1.16.20.4.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcPrio100mbPlusGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private HcPrio100mbPlusGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "hcPrio100mbPlusGroup", "1.3.6.1.2.1.16.20.4.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonVlanStatsExtGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonVlanStatsExtGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonVlanStatsExtGroup", "1.3.6.1.2.1.16.20.4.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SmonInformationGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private SmonInformationGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "smonInformationGroup", "1.3.6.1.2.1.16.20.4.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PortCopyConfigGroupEnt extends MIBEntry<SMONMIBDef>
        {
            private PortCopyConfigGroupEnt(SMONMIBDef mib, MIBEntry<SMONMIBDef> parent)
            {
                super(mib, parent, "portCopyConfigGroup", "1.3.6.1.2.1.16.20.4.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
