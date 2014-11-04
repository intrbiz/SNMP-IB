package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DSMONMIBDef extends MIB
{
    public static final DSMONMIBDef DSMONMIB = new DSMONMIBDef();

    static { MIBs.getInstance().registerMIB(DSMONMIBDef.DSMONMIB); }

    public final DsmonMIBEnt dsmonMIB;

    private DSMONMIBDef()
    {
        super("DSMON-MIB");
        this.dsmonMIB = new DsmonMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dsmonMIB
        };
    }

    public static final class DsmonMIBEnt extends MIBEntry<DSMONMIBDef>
    {
        public final DsmonObjectsEnt dsmonObjects;

        public final DsmonNotificationsEnt dsmonNotifications;

        public final DsmonConformanceEnt dsmonConformance;

        private DsmonMIBEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
        {
            super(mib, parent, "dsmonMIB", "1.3.6.1.2.1.16.26", false, false, false, false);
            this.dsmonObjects = new DsmonObjectsEnt(mib, this);
            this.dsmonNotifications = new DsmonNotificationsEnt(mib, this);
            this.dsmonConformance = new DsmonConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsmonObjects,
                this.dsmonNotifications,
                this.dsmonConformance
            };
        }
        public static final class DsmonObjectsEnt extends MIBEntry<DSMONMIBDef>
        {
            public final DsmonAggObjectsEnt dsmonAggObjects;

            public final DsmonStatsObjectsEnt dsmonStatsObjects;

            public final DsmonPdistObjectsEnt dsmonPdistObjects;

            public final DsmonHostObjectsEnt dsmonHostObjects;

            public final DsmonCapsObjectsEnt dsmonCapsObjects;

            public final DsmonMatrixObjectsEnt dsmonMatrixObjects;

            private DsmonObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
            {
                super(mib, parent, "dsmonObjects", "1.3.6.1.2.1.16.26.1", false, false, false, false);
                this.dsmonAggObjects = new DsmonAggObjectsEnt(mib, this);
                this.dsmonStatsObjects = new DsmonStatsObjectsEnt(mib, this);
                this.dsmonPdistObjects = new DsmonPdistObjectsEnt(mib, this);
                this.dsmonHostObjects = new DsmonHostObjectsEnt(mib, this);
                this.dsmonCapsObjects = new DsmonCapsObjectsEnt(mib, this);
                this.dsmonMatrixObjects = new DsmonMatrixObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsmonAggObjects,
                    this.dsmonStatsObjects,
                    this.dsmonPdistObjects,
                    this.dsmonHostObjects,
                    this.dsmonCapsObjects,
                    this.dsmonMatrixObjects
                };
            }
            public static final class DsmonAggObjectsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** ************************************************************                                                         **   A G G R E G A T I O N   C O N T R O L   G R O U P S   **                                                         *************************************************************/
                public final DsmonMaxAggGroupsEnt dsmonMaxAggGroups;

                public final DsmonAggControlLockedEnt dsmonAggControlLocked;

                public final DsmonAggControlChangesEnt dsmonAggControlChanges;

                public final DsmonAggControlLastChangeTimeEnt dsmonAggControlLastChangeTime;

                /** Counter Aggregation Control Table*/
                public final DsmonAggControlTableEnt dsmonAggControlTable;

                /** Counter Aggregation Profile Table*/
                public final DsmonAggProfileTableEnt dsmonAggProfileTable;

                /** Counter Aggregation Group Table*/
                public final DsmonAggGroupTableEnt dsmonAggGroupTable;

                private DsmonAggObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonAggObjects", "1.3.6.1.2.1.16.26.1.1", false, false, false, false);
                    this.dsmonMaxAggGroups = new DsmonMaxAggGroupsEnt(mib, this);
                    this.dsmonAggControlLocked = new DsmonAggControlLockedEnt(mib, this);
                    this.dsmonAggControlChanges = new DsmonAggControlChangesEnt(mib, this);
                    this.dsmonAggControlLastChangeTime = new DsmonAggControlLastChangeTimeEnt(mib, this);
                    this.dsmonAggControlTable = new DsmonAggControlTableEnt(mib, this);
                    this.dsmonAggProfileTable = new DsmonAggProfileTableEnt(mib, this);
                    this.dsmonAggGroupTable = new DsmonAggGroupTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonMaxAggGroups,
                        this.dsmonAggControlLocked,
                        this.dsmonAggControlChanges,
                        this.dsmonAggControlLastChangeTime,
                        this.dsmonAggControlTable,
                        this.dsmonAggProfileTable,
                        this.dsmonAggGroupTable
                    };
                }
                public static final class DsmonMaxAggGroupsEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonMaxAggGroupsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMaxAggGroups", "1.3.6.1.2.1.16.26.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonAggControlLockedEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonAggControlLockedEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonAggControlLocked", "1.3.6.1.2.1.16.26.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonAggControlChangesEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonAggControlChangesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonAggControlChanges", "1.3.6.1.2.1.16.26.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonAggControlLastChangeTimeEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonAggControlLastChangeTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonAggControlLastChangeTime", "1.3.6.1.2.1.16.26.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonAggControlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonAggControlEntryEnt dsmonAggControlEntry;

                    private DsmonAggControlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonAggControlTable", "1.3.6.1.2.1.16.26.1.1.5", false, true, false, false);
                        this.dsmonAggControlEntry = new DsmonAggControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonAggControlEntry
                        };
                    }
                    public static final class DsmonAggControlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonAggControlIndexEnt dsmonAggControlIndex;

                        public final DsmonAggControlDescrEnt dsmonAggControlDescr;

                        public final DsmonAggControlOwnerEnt dsmonAggControlOwner;

                        public final DsmonAggControlStatusEnt dsmonAggControlStatus;

                        private DsmonAggControlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonAggControlEntry", "1.3.6.1.2.1.16.26.1.1.5.1", false, false, false, true);
                            this.dsmonAggControlIndex = new DsmonAggControlIndexEnt(mib, this);
                            this.dsmonAggControlDescr = new DsmonAggControlDescrEnt(mib, this);
                            this.dsmonAggControlOwner = new DsmonAggControlOwnerEnt(mib, this);
                            this.dsmonAggControlStatus = new DsmonAggControlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonAggControlIndex,
                                this.dsmonAggControlDescr,
                                this.dsmonAggControlOwner,
                                this.dsmonAggControlStatus
                            };
                        }
                        public static final class DsmonAggControlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggControlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggControlIndex", "1.3.6.1.2.1.16.26.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonAggControlDescrEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggControlDescrEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggControlDescr", "1.3.6.1.2.1.16.26.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonAggControlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggControlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggControlOwner", "1.3.6.1.2.1.16.26.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonAggControlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggControlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggControlStatus", "1.3.6.1.2.1.16.26.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonAggProfileTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonAggProfileEntryEnt dsmonAggProfileEntry;

                    private DsmonAggProfileTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonAggProfileTable", "1.3.6.1.2.1.16.26.1.1.6", false, true, false, false);
                        this.dsmonAggProfileEntry = new DsmonAggProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonAggProfileEntry
                        };
                    }
                    public static final class DsmonAggProfileEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonAggProfileDSCPEnt dsmonAggProfileDSCP;

                        public final DsmonAggGroupIndexEnt dsmonAggGroupIndex;

                        private DsmonAggProfileEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonAggProfileEntry", "1.3.6.1.2.1.16.26.1.1.6.1", false, false, false, true);
                            this.dsmonAggProfileDSCP = new DsmonAggProfileDSCPEnt(mib, this);
                            this.dsmonAggGroupIndex = new DsmonAggGroupIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonAggProfileDSCP,
                                this.dsmonAggGroupIndex
                            };
                        }
                        public static final class DsmonAggProfileDSCPEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggProfileDSCPEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggProfileDSCP", "1.3.6.1.2.1.16.26.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonAggGroupIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggGroupIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggGroupIndex", "1.3.6.1.2.1.16.26.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonAggGroupTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonAggGroupEntryEnt dsmonAggGroupEntry;

                    private DsmonAggGroupTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonAggGroupTable", "1.3.6.1.2.1.16.26.1.1.7", false, true, false, false);
                        this.dsmonAggGroupEntry = new DsmonAggGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonAggGroupEntry
                        };
                    }
                    public static final class DsmonAggGroupEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonAggGroupDescrEnt dsmonAggGroupDescr;

                        public final DsmonAggGroupStatusEnt dsmonAggGroupStatus;

                        private DsmonAggGroupEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonAggGroupEntry", "1.3.6.1.2.1.16.26.1.1.7.1", false, false, false, true);
                            this.dsmonAggGroupDescr = new DsmonAggGroupDescrEnt(mib, this);
                            this.dsmonAggGroupStatus = new DsmonAggGroupStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonAggGroupDescr,
                                this.dsmonAggGroupStatus
                            };
                        }
                        public static final class DsmonAggGroupDescrEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggGroupDescrEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggGroupDescr", "1.3.6.1.2.1.16.26.1.1.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonAggGroupStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonAggGroupStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonAggGroupStatus", "1.3.6.1.2.1.16.26.1.1.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DsmonStatsObjectsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** **************************************************************                                                           **     P E R - D A T A S O U R C E   C O L L E C T I O N S   **                                                           **************************************************************
Per-DataSource Statistics Control Table*/
                public final DsmonStatsControlTableEnt dsmonStatsControlTable;

                /** Per-DataSource Statistics Table*/
                public final DsmonStatsTableEnt dsmonStatsTable;

                private DsmonStatsObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonStatsObjects", "1.3.6.1.2.1.16.26.1.2", false, false, false, false);
                    this.dsmonStatsControlTable = new DsmonStatsControlTableEnt(mib, this);
                    this.dsmonStatsTable = new DsmonStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonStatsControlTable,
                        this.dsmonStatsTable
                    };
                }
                public static final class DsmonStatsControlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonStatsControlEntryEnt dsmonStatsControlEntry;

                    private DsmonStatsControlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonStatsControlTable", "1.3.6.1.2.1.16.26.1.2.1", false, true, false, false);
                        this.dsmonStatsControlEntry = new DsmonStatsControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonStatsControlEntry
                        };
                    }
                    public static final class DsmonStatsControlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonStatsControlIndexEnt dsmonStatsControlIndex;

                        public final DsmonStatsControlDataSourceEnt dsmonStatsControlDataSource;

                        public final DsmonStatsControlAggProfileEnt dsmonStatsControlAggProfile;

                        public final DsmonStatsControlDroppedFramesEnt dsmonStatsControlDroppedFrames;

                        public final DsmonStatsControlCreateTimeEnt dsmonStatsControlCreateTime;

                        public final DsmonStatsControlOwnerEnt dsmonStatsControlOwner;

                        public final DsmonStatsControlStatusEnt dsmonStatsControlStatus;

                        private DsmonStatsControlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonStatsControlEntry", "1.3.6.1.2.1.16.26.1.2.1.1", false, false, false, true);
                            this.dsmonStatsControlIndex = new DsmonStatsControlIndexEnt(mib, this);
                            this.dsmonStatsControlDataSource = new DsmonStatsControlDataSourceEnt(mib, this);
                            this.dsmonStatsControlAggProfile = new DsmonStatsControlAggProfileEnt(mib, this);
                            this.dsmonStatsControlDroppedFrames = new DsmonStatsControlDroppedFramesEnt(mib, this);
                            this.dsmonStatsControlCreateTime = new DsmonStatsControlCreateTimeEnt(mib, this);
                            this.dsmonStatsControlOwner = new DsmonStatsControlOwnerEnt(mib, this);
                            this.dsmonStatsControlStatus = new DsmonStatsControlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonStatsControlIndex,
                                this.dsmonStatsControlDataSource,
                                this.dsmonStatsControlAggProfile,
                                this.dsmonStatsControlDroppedFrames,
                                this.dsmonStatsControlCreateTime,
                                this.dsmonStatsControlOwner,
                                this.dsmonStatsControlStatus
                            };
                        }
                        public static final class DsmonStatsControlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlIndex", "1.3.6.1.2.1.16.26.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsControlDataSourceEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlDataSourceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlDataSource", "1.3.6.1.2.1.16.26.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsControlAggProfileEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlAggProfileEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlAggProfile", "1.3.6.1.2.1.16.26.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsControlDroppedFramesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlDroppedFramesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlDroppedFrames", "1.3.6.1.2.1.16.26.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsControlCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlCreateTime", "1.3.6.1.2.1.16.26.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsControlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlOwner", "1.3.6.1.2.1.16.26.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsControlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsControlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsControlStatus", "1.3.6.1.2.1.16.26.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonStatsTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonStatsEntryEnt dsmonStatsEntry;

                    private DsmonStatsTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonStatsTable", "1.3.6.1.2.1.16.26.1.2.2", false, true, false, false);
                        this.dsmonStatsEntry = new DsmonStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonStatsEntry
                        };
                    }
                    public static final class DsmonStatsEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonStatsInPktsEnt dsmonStatsInPkts;

                        public final DsmonStatsInOctetsEnt dsmonStatsInOctets;

                        public final DsmonStatsInOvflPktsEnt dsmonStatsInOvflPkts;

                        public final DsmonStatsInOvflOctetsEnt dsmonStatsInOvflOctets;

                        public final DsmonStatsInHCPktsEnt dsmonStatsInHCPkts;

                        public final DsmonStatsInHCOctetsEnt dsmonStatsInHCOctets;

                        public final DsmonStatsOutPktsEnt dsmonStatsOutPkts;

                        public final DsmonStatsOutOctetsEnt dsmonStatsOutOctets;

                        public final DsmonStatsOutOvflPktsEnt dsmonStatsOutOvflPkts;

                        public final DsmonStatsOutOvflOctetsEnt dsmonStatsOutOvflOctets;

                        public final DsmonStatsOutHCPktsEnt dsmonStatsOutHCPkts;

                        public final DsmonStatsOutHCOctetsEnt dsmonStatsOutHCOctets;

                        private DsmonStatsEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonStatsEntry", "1.3.6.1.2.1.16.26.1.2.2.1", false, false, false, true);
                            this.dsmonStatsInPkts = new DsmonStatsInPktsEnt(mib, this);
                            this.dsmonStatsInOctets = new DsmonStatsInOctetsEnt(mib, this);
                            this.dsmonStatsInOvflPkts = new DsmonStatsInOvflPktsEnt(mib, this);
                            this.dsmonStatsInOvflOctets = new DsmonStatsInOvflOctetsEnt(mib, this);
                            this.dsmonStatsInHCPkts = new DsmonStatsInHCPktsEnt(mib, this);
                            this.dsmonStatsInHCOctets = new DsmonStatsInHCOctetsEnt(mib, this);
                            this.dsmonStatsOutPkts = new DsmonStatsOutPktsEnt(mib, this);
                            this.dsmonStatsOutOctets = new DsmonStatsOutOctetsEnt(mib, this);
                            this.dsmonStatsOutOvflPkts = new DsmonStatsOutOvflPktsEnt(mib, this);
                            this.dsmonStatsOutOvflOctets = new DsmonStatsOutOvflOctetsEnt(mib, this);
                            this.dsmonStatsOutHCPkts = new DsmonStatsOutHCPktsEnt(mib, this);
                            this.dsmonStatsOutHCOctets = new DsmonStatsOutHCOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonStatsInPkts,
                                this.dsmonStatsInOctets,
                                this.dsmonStatsInOvflPkts,
                                this.dsmonStatsInOvflOctets,
                                this.dsmonStatsInHCPkts,
                                this.dsmonStatsInHCOctets,
                                this.dsmonStatsOutPkts,
                                this.dsmonStatsOutOctets,
                                this.dsmonStatsOutOvflPkts,
                                this.dsmonStatsOutOvflOctets,
                                this.dsmonStatsOutHCPkts,
                                this.dsmonStatsOutHCOctets
                            };
                        }
                        public static final class DsmonStatsInPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsInPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsInPkts", "1.3.6.1.2.1.16.26.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsInOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsInOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsInOctets", "1.3.6.1.2.1.16.26.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsInOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsInOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsInOvflPkts", "1.3.6.1.2.1.16.26.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsInOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsInOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsInOvflOctets", "1.3.6.1.2.1.16.26.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsInHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsInHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsInHCPkts", "1.3.6.1.2.1.16.26.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsInHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsInHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsInHCOctets", "1.3.6.1.2.1.16.26.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsOutPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsOutPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsOutPkts", "1.3.6.1.2.1.16.26.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsOutOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsOutOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsOutOctets", "1.3.6.1.2.1.16.26.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsOutOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsOutOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsOutOvflPkts", "1.3.6.1.2.1.16.26.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsOutOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsOutOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsOutOvflOctets", "1.3.6.1.2.1.16.26.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsOutHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsOutHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsOutHCPkts", "1.3.6.1.2.1.16.26.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonStatsOutHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonStatsOutHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonStatsOutHCOctets", "1.3.6.1.2.1.16.26.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DsmonPdistObjectsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** ************************************************************                                                         **     P E R - P R O T O C O L    C O L L E C T I O N S    **                                                         ************************************************************


DSCP Per-Protocol Statistics Control Table*/
                public final DsmonPdistCtlTableEnt dsmonPdistCtlTable;

                /** Per-Protocol Statistics Table*/
                public final DsmonPdistStatsTableEnt dsmonPdistStatsTable;

                /** Per-Protocol Statistics TopN Control Table*/
                public final DsmonPdistTopNCtlTableEnt dsmonPdistTopNCtlTable;

                /** dsmonPdist TopN Table*/
                public final DsmonPdistTopNTableEnt dsmonPdistTopNTable;

                private DsmonPdistObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonPdistObjects", "1.3.6.1.2.1.16.26.1.3", false, false, false, false);
                    this.dsmonPdistCtlTable = new DsmonPdistCtlTableEnt(mib, this);
                    this.dsmonPdistStatsTable = new DsmonPdistStatsTableEnt(mib, this);
                    this.dsmonPdistTopNCtlTable = new DsmonPdistTopNCtlTableEnt(mib, this);
                    this.dsmonPdistTopNTable = new DsmonPdistTopNTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonPdistCtlTable,
                        this.dsmonPdistStatsTable,
                        this.dsmonPdistTopNCtlTable,
                        this.dsmonPdistTopNTable
                    };
                }
                public static final class DsmonPdistCtlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonPdistCtlEntryEnt dsmonPdistCtlEntry;

                    private DsmonPdistCtlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistCtlTable", "1.3.6.1.2.1.16.26.1.3.1", false, true, false, false);
                        this.dsmonPdistCtlEntry = new DsmonPdistCtlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonPdistCtlEntry
                        };
                    }
                    public static final class DsmonPdistCtlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonPdistCtlIndexEnt dsmonPdistCtlIndex;

                        public final DsmonPdistCtlDataSourceEnt dsmonPdistCtlDataSource;

                        public final DsmonPdistCtlAggProfileEnt dsmonPdistCtlAggProfile;

                        public final DsmonPdistCtlMaxDesiredEntriesEnt dsmonPdistCtlMaxDesiredEntries;

                        public final DsmonPdistCtlDroppedFramesEnt dsmonPdistCtlDroppedFrames;

                        public final DsmonPdistCtlInsertsEnt dsmonPdistCtlInserts;

                        public final DsmonPdistCtlDeletesEnt dsmonPdistCtlDeletes;

                        public final DsmonPdistCtlCreateTimeEnt dsmonPdistCtlCreateTime;

                        public final DsmonPdistCtlOwnerEnt dsmonPdistCtlOwner;

                        public final DsmonPdistCtlStatusEnt dsmonPdistCtlStatus;

                        private DsmonPdistCtlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonPdistCtlEntry", "1.3.6.1.2.1.16.26.1.3.1.1", false, false, false, true);
                            this.dsmonPdistCtlIndex = new DsmonPdistCtlIndexEnt(mib, this);
                            this.dsmonPdistCtlDataSource = new DsmonPdistCtlDataSourceEnt(mib, this);
                            this.dsmonPdistCtlAggProfile = new DsmonPdistCtlAggProfileEnt(mib, this);
                            this.dsmonPdistCtlMaxDesiredEntries = new DsmonPdistCtlMaxDesiredEntriesEnt(mib, this);
                            this.dsmonPdistCtlDroppedFrames = new DsmonPdistCtlDroppedFramesEnt(mib, this);
                            this.dsmonPdistCtlInserts = new DsmonPdistCtlInsertsEnt(mib, this);
                            this.dsmonPdistCtlDeletes = new DsmonPdistCtlDeletesEnt(mib, this);
                            this.dsmonPdistCtlCreateTime = new DsmonPdistCtlCreateTimeEnt(mib, this);
                            this.dsmonPdistCtlOwner = new DsmonPdistCtlOwnerEnt(mib, this);
                            this.dsmonPdistCtlStatus = new DsmonPdistCtlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonPdistCtlIndex,
                                this.dsmonPdistCtlDataSource,
                                this.dsmonPdistCtlAggProfile,
                                this.dsmonPdistCtlMaxDesiredEntries,
                                this.dsmonPdistCtlDroppedFrames,
                                this.dsmonPdistCtlInserts,
                                this.dsmonPdistCtlDeletes,
                                this.dsmonPdistCtlCreateTime,
                                this.dsmonPdistCtlOwner,
                                this.dsmonPdistCtlStatus
                            };
                        }
                        public static final class DsmonPdistCtlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlIndex", "1.3.6.1.2.1.16.26.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlDataSourceEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlDataSourceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlDataSource", "1.3.6.1.2.1.16.26.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlAggProfileEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlAggProfileEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlAggProfile", "1.3.6.1.2.1.16.26.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlMaxDesiredEntriesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlMaxDesiredEntriesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlMaxDesiredEntries", "1.3.6.1.2.1.16.26.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlDroppedFramesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlDroppedFramesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlDroppedFrames", "1.3.6.1.2.1.16.26.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlInsertsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlInsertsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlInserts", "1.3.6.1.2.1.16.26.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlDeletesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlDeletesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlDeletes", "1.3.6.1.2.1.16.26.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlCreateTime", "1.3.6.1.2.1.16.26.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlOwner", "1.3.6.1.2.1.16.26.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistCtlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistCtlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistCtlStatus", "1.3.6.1.2.1.16.26.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonPdistStatsTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonPdistStatsEntryEnt dsmonPdistStatsEntry;

                    private DsmonPdistStatsTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistStatsTable", "1.3.6.1.2.1.16.26.1.3.2", false, true, false, false);
                        this.dsmonPdistStatsEntry = new DsmonPdistStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonPdistStatsEntry
                        };
                    }
                    public static final class DsmonPdistStatsEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonPdistTimeMarkEnt dsmonPdistTimeMark;

                        public final DsmonPdistStatsPktsEnt dsmonPdistStatsPkts;

                        public final DsmonPdistStatsOctetsEnt dsmonPdistStatsOctets;

                        public final DsmonPdistStatsOvflPktsEnt dsmonPdistStatsOvflPkts;

                        public final DsmonPdistStatsOvflOctetsEnt dsmonPdistStatsOvflOctets;

                        public final DsmonPdistStatsHCPktsEnt dsmonPdistStatsHCPkts;

                        public final DsmonPdistStatsHCOctetsEnt dsmonPdistStatsHCOctets;

                        public final DsmonPdistStatsCreateTimeEnt dsmonPdistStatsCreateTime;

                        private DsmonPdistStatsEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonPdistStatsEntry", "1.3.6.1.2.1.16.26.1.3.2.1", false, false, false, true);
                            this.dsmonPdistTimeMark = new DsmonPdistTimeMarkEnt(mib, this);
                            this.dsmonPdistStatsPkts = new DsmonPdistStatsPktsEnt(mib, this);
                            this.dsmonPdistStatsOctets = new DsmonPdistStatsOctetsEnt(mib, this);
                            this.dsmonPdistStatsOvflPkts = new DsmonPdistStatsOvflPktsEnt(mib, this);
                            this.dsmonPdistStatsOvflOctets = new DsmonPdistStatsOvflOctetsEnt(mib, this);
                            this.dsmonPdistStatsHCPkts = new DsmonPdistStatsHCPktsEnt(mib, this);
                            this.dsmonPdistStatsHCOctets = new DsmonPdistStatsHCOctetsEnt(mib, this);
                            this.dsmonPdistStatsCreateTime = new DsmonPdistStatsCreateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonPdistTimeMark,
                                this.dsmonPdistStatsPkts,
                                this.dsmonPdistStatsOctets,
                                this.dsmonPdistStatsOvflPkts,
                                this.dsmonPdistStatsOvflOctets,
                                this.dsmonPdistStatsHCPkts,
                                this.dsmonPdistStatsHCOctets,
                                this.dsmonPdistStatsCreateTime
                            };
                        }
                        public static final class DsmonPdistTimeMarkEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTimeMarkEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTimeMark", "1.3.6.1.2.1.16.26.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsPkts", "1.3.6.1.2.1.16.26.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsOctets", "1.3.6.1.2.1.16.26.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsOvflPkts", "1.3.6.1.2.1.16.26.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsOvflOctets", "1.3.6.1.2.1.16.26.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsHCPkts", "1.3.6.1.2.1.16.26.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsHCOctets", "1.3.6.1.2.1.16.26.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistStatsCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistStatsCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistStatsCreateTime", "1.3.6.1.2.1.16.26.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonPdistTopNCtlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonPdistTopNCtlEntryEnt dsmonPdistTopNCtlEntry;

                    private DsmonPdistTopNCtlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistTopNCtlTable", "1.3.6.1.2.1.16.26.1.3.3", false, true, false, false);
                        this.dsmonPdistTopNCtlEntry = new DsmonPdistTopNCtlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonPdistTopNCtlEntry
                        };
                    }
                    public static final class DsmonPdistTopNCtlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonPdistTopNCtlIndexEnt dsmonPdistTopNCtlIndex;

                        public final DsmonPdistTopNCtlPdistIndexEnt dsmonPdistTopNCtlPdistIndex;

                        public final DsmonPdistTopNCtlRateBaseEnt dsmonPdistTopNCtlRateBase;

                        public final DsmonPdistTopNCtlTimeRemainingEnt dsmonPdistTopNCtlTimeRemaining;

                        public final DsmonPdistTopNCtlGeneratedReprtsEnt dsmonPdistTopNCtlGeneratedReprts;

                        public final DsmonPdistTopNCtlDurationEnt dsmonPdistTopNCtlDuration;

                        public final DsmonPdistTopNCtlRequestedSizeEnt dsmonPdistTopNCtlRequestedSize;

                        public final DsmonPdistTopNCtlGrantedSizeEnt dsmonPdistTopNCtlGrantedSize;

                        public final DsmonPdistTopNCtlStartTimeEnt dsmonPdistTopNCtlStartTime;

                        public final DsmonPdistTopNCtlOwnerEnt dsmonPdistTopNCtlOwner;

                        public final DsmonPdistTopNCtlStatusEnt dsmonPdistTopNCtlStatus;

                        private DsmonPdistTopNCtlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonPdistTopNCtlEntry", "1.3.6.1.2.1.16.26.1.3.3.1", false, false, false, true);
                            this.dsmonPdistTopNCtlIndex = new DsmonPdistTopNCtlIndexEnt(mib, this);
                            this.dsmonPdistTopNCtlPdistIndex = new DsmonPdistTopNCtlPdistIndexEnt(mib, this);
                            this.dsmonPdistTopNCtlRateBase = new DsmonPdistTopNCtlRateBaseEnt(mib, this);
                            this.dsmonPdistTopNCtlTimeRemaining = new DsmonPdistTopNCtlTimeRemainingEnt(mib, this);
                            this.dsmonPdistTopNCtlGeneratedReprts = new DsmonPdistTopNCtlGeneratedReprtsEnt(mib, this);
                            this.dsmonPdistTopNCtlDuration = new DsmonPdistTopNCtlDurationEnt(mib, this);
                            this.dsmonPdistTopNCtlRequestedSize = new DsmonPdistTopNCtlRequestedSizeEnt(mib, this);
                            this.dsmonPdistTopNCtlGrantedSize = new DsmonPdistTopNCtlGrantedSizeEnt(mib, this);
                            this.dsmonPdistTopNCtlStartTime = new DsmonPdistTopNCtlStartTimeEnt(mib, this);
                            this.dsmonPdistTopNCtlOwner = new DsmonPdistTopNCtlOwnerEnt(mib, this);
                            this.dsmonPdistTopNCtlStatus = new DsmonPdistTopNCtlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonPdistTopNCtlIndex,
                                this.dsmonPdistTopNCtlPdistIndex,
                                this.dsmonPdistTopNCtlRateBase,
                                this.dsmonPdistTopNCtlTimeRemaining,
                                this.dsmonPdistTopNCtlGeneratedReprts,
                                this.dsmonPdistTopNCtlDuration,
                                this.dsmonPdistTopNCtlRequestedSize,
                                this.dsmonPdistTopNCtlGrantedSize,
                                this.dsmonPdistTopNCtlStartTime,
                                this.dsmonPdistTopNCtlOwner,
                                this.dsmonPdistTopNCtlStatus
                            };
                        }
                        public static final class DsmonPdistTopNCtlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlIndex", "1.3.6.1.2.1.16.26.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlPdistIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlPdistIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlPdistIndex", "1.3.6.1.2.1.16.26.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlRateBaseEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlRateBaseEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlRateBase", "1.3.6.1.2.1.16.26.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlTimeRemainingEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlTimeRemainingEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlTimeRemaining", "1.3.6.1.2.1.16.26.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlGeneratedReprtsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlGeneratedReprtsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlGeneratedReprts", "1.3.6.1.2.1.16.26.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlDurationEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlDurationEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlDuration", "1.3.6.1.2.1.16.26.1.3.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlRequestedSizeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlRequestedSizeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlRequestedSize", "1.3.6.1.2.1.16.26.1.3.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlGrantedSizeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlGrantedSizeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlGrantedSize", "1.3.6.1.2.1.16.26.1.3.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlStartTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlStartTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlStartTime", "1.3.6.1.2.1.16.26.1.3.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlOwner", "1.3.6.1.2.1.16.26.1.3.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNCtlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNCtlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNCtlStatus", "1.3.6.1.2.1.16.26.1.3.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonPdistTopNTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonPdistTopNEntryEnt dsmonPdistTopNEntry;

                    private DsmonPdistTopNTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistTopNTable", "1.3.6.1.2.1.16.26.1.3.4", false, true, false, false);
                        this.dsmonPdistTopNEntry = new DsmonPdistTopNEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonPdistTopNEntry
                        };
                    }
                    public static final class DsmonPdistTopNEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonPdistTopNIndexEnt dsmonPdistTopNIndex;

                        public final DsmonPdistTopNPDLocalIndexEnt dsmonPdistTopNPDLocalIndex;

                        public final DsmonPdistTopNAggGroupEnt dsmonPdistTopNAggGroup;

                        public final DsmonPdistTopNRateEnt dsmonPdistTopNRate;

                        public final DsmonPdistTopNRateOvflEnt dsmonPdistTopNRateOvfl;

                        public final DsmonPdistTopNHCRateEnt dsmonPdistTopNHCRate;

                        private DsmonPdistTopNEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonPdistTopNEntry", "1.3.6.1.2.1.16.26.1.3.4.1", false, false, false, true);
                            this.dsmonPdistTopNIndex = new DsmonPdistTopNIndexEnt(mib, this);
                            this.dsmonPdistTopNPDLocalIndex = new DsmonPdistTopNPDLocalIndexEnt(mib, this);
                            this.dsmonPdistTopNAggGroup = new DsmonPdistTopNAggGroupEnt(mib, this);
                            this.dsmonPdistTopNRate = new DsmonPdistTopNRateEnt(mib, this);
                            this.dsmonPdistTopNRateOvfl = new DsmonPdistTopNRateOvflEnt(mib, this);
                            this.dsmonPdistTopNHCRate = new DsmonPdistTopNHCRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonPdistTopNIndex,
                                this.dsmonPdistTopNPDLocalIndex,
                                this.dsmonPdistTopNAggGroup,
                                this.dsmonPdistTopNRate,
                                this.dsmonPdistTopNRateOvfl,
                                this.dsmonPdistTopNHCRate
                            };
                        }
                        public static final class DsmonPdistTopNIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNIndex", "1.3.6.1.2.1.16.26.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNPDLocalIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNPDLocalIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNPDLocalIndex", "1.3.6.1.2.1.16.26.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNAggGroupEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNAggGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNAggGroup", "1.3.6.1.2.1.16.26.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNRate", "1.3.6.1.2.1.16.26.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNRateOvflEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNRateOvflEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNRateOvfl", "1.3.6.1.2.1.16.26.1.3.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonPdistTopNHCRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonPdistTopNHCRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonPdistTopNHCRate", "1.3.6.1.2.1.16.26.1.3.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DsmonHostObjectsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** ************************************************************                                                         **      P E R  -  H O S T       C O L L E C T I O N S      **                                                         ************************************************************

NL Host Statistics Control Table*/
                public final DsmonHostCtlTableEnt dsmonHostCtlTable;

                /** NL Host Statistics Table*/
                public final DsmonHostTableEnt dsmonHostTable;

                /** Per-Protocol Per-Host NL Statistics TopN Control Table*/
                public final DsmonHostTopNCtlTableEnt dsmonHostTopNCtlTable;

                /** dsmonHost TopN Table*/
                public final DsmonHostTopNTableEnt dsmonHostTopNTable;

                private DsmonHostObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonHostObjects", "1.3.6.1.2.1.16.26.1.4", false, false, false, false);
                    this.dsmonHostCtlTable = new DsmonHostCtlTableEnt(mib, this);
                    this.dsmonHostTable = new DsmonHostTableEnt(mib, this);
                    this.dsmonHostTopNCtlTable = new DsmonHostTopNCtlTableEnt(mib, this);
                    this.dsmonHostTopNTable = new DsmonHostTopNTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonHostCtlTable,
                        this.dsmonHostTable,
                        this.dsmonHostTopNCtlTable,
                        this.dsmonHostTopNTable
                    };
                }
                public static final class DsmonHostCtlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonHostCtlEntryEnt dsmonHostCtlEntry;

                    private DsmonHostCtlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostCtlTable", "1.3.6.1.2.1.16.26.1.4.1", false, true, false, false);
                        this.dsmonHostCtlEntry = new DsmonHostCtlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonHostCtlEntry
                        };
                    }
                    public static final class DsmonHostCtlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonHostCtlIndexEnt dsmonHostCtlIndex;

                        public final DsmonHostCtlDataSourceEnt dsmonHostCtlDataSource;

                        public final DsmonHostCtlAggProfileEnt dsmonHostCtlAggProfile;

                        public final DsmonHostCtlMaxDesiredEntriesEnt dsmonHostCtlMaxDesiredEntries;

                        public final DsmonHostCtlIPv4PrefixLenEnt dsmonHostCtlIPv4PrefixLen;

                        public final DsmonHostCtlIPv6PrefixLenEnt dsmonHostCtlIPv6PrefixLen;

                        public final DsmonHostCtlDroppedFramesEnt dsmonHostCtlDroppedFrames;

                        public final DsmonHostCtlInsertsEnt dsmonHostCtlInserts;

                        public final DsmonHostCtlDeletesEnt dsmonHostCtlDeletes;

                        public final DsmonHostCtlCreateTimeEnt dsmonHostCtlCreateTime;

                        public final DsmonHostCtlOwnerEnt dsmonHostCtlOwner;

                        public final DsmonHostCtlStatusEnt dsmonHostCtlStatus;

                        private DsmonHostCtlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonHostCtlEntry", "1.3.6.1.2.1.16.26.1.4.1.1", false, false, false, true);
                            this.dsmonHostCtlIndex = new DsmonHostCtlIndexEnt(mib, this);
                            this.dsmonHostCtlDataSource = new DsmonHostCtlDataSourceEnt(mib, this);
                            this.dsmonHostCtlAggProfile = new DsmonHostCtlAggProfileEnt(mib, this);
                            this.dsmonHostCtlMaxDesiredEntries = new DsmonHostCtlMaxDesiredEntriesEnt(mib, this);
                            this.dsmonHostCtlIPv4PrefixLen = new DsmonHostCtlIPv4PrefixLenEnt(mib, this);
                            this.dsmonHostCtlIPv6PrefixLen = new DsmonHostCtlIPv6PrefixLenEnt(mib, this);
                            this.dsmonHostCtlDroppedFrames = new DsmonHostCtlDroppedFramesEnt(mib, this);
                            this.dsmonHostCtlInserts = new DsmonHostCtlInsertsEnt(mib, this);
                            this.dsmonHostCtlDeletes = new DsmonHostCtlDeletesEnt(mib, this);
                            this.dsmonHostCtlCreateTime = new DsmonHostCtlCreateTimeEnt(mib, this);
                            this.dsmonHostCtlOwner = new DsmonHostCtlOwnerEnt(mib, this);
                            this.dsmonHostCtlStatus = new DsmonHostCtlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonHostCtlIndex,
                                this.dsmonHostCtlDataSource,
                                this.dsmonHostCtlAggProfile,
                                this.dsmonHostCtlMaxDesiredEntries,
                                this.dsmonHostCtlIPv4PrefixLen,
                                this.dsmonHostCtlIPv6PrefixLen,
                                this.dsmonHostCtlDroppedFrames,
                                this.dsmonHostCtlInserts,
                                this.dsmonHostCtlDeletes,
                                this.dsmonHostCtlCreateTime,
                                this.dsmonHostCtlOwner,
                                this.dsmonHostCtlStatus
                            };
                        }
                        public static final class DsmonHostCtlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlIndex", "1.3.6.1.2.1.16.26.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlDataSourceEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlDataSourceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlDataSource", "1.3.6.1.2.1.16.26.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlAggProfileEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlAggProfileEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlAggProfile", "1.3.6.1.2.1.16.26.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlMaxDesiredEntriesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlMaxDesiredEntriesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlMaxDesiredEntries", "1.3.6.1.2.1.16.26.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlIPv4PrefixLenEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlIPv4PrefixLenEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlIPv4PrefixLen", "1.3.6.1.2.1.16.26.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlIPv6PrefixLenEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlIPv6PrefixLenEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlIPv6PrefixLen", "1.3.6.1.2.1.16.26.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlDroppedFramesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlDroppedFramesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlDroppedFrames", "1.3.6.1.2.1.16.26.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlInsertsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlInsertsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlInserts", "1.3.6.1.2.1.16.26.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlDeletesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlDeletesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlDeletes", "1.3.6.1.2.1.16.26.1.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlCreateTime", "1.3.6.1.2.1.16.26.1.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlOwner", "1.3.6.1.2.1.16.26.1.4.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCtlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCtlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCtlStatus", "1.3.6.1.2.1.16.26.1.4.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonHostTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonHostEntryEnt dsmonHostEntry;

                    private DsmonHostTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostTable", "1.3.6.1.2.1.16.26.1.4.2", false, true, false, false);
                        this.dsmonHostEntry = new DsmonHostEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonHostEntry
                        };
                    }
                    public static final class DsmonHostEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonHostTimeMarkEnt dsmonHostTimeMark;

                        public final DsmonHostAddressEnt dsmonHostAddress;

                        public final DsmonHostInPktsEnt dsmonHostInPkts;

                        public final DsmonHostInOctetsEnt dsmonHostInOctets;

                        public final DsmonHostInOvflPktsEnt dsmonHostInOvflPkts;

                        public final DsmonHostInOvflOctetsEnt dsmonHostInOvflOctets;

                        public final DsmonHostInHCPktsEnt dsmonHostInHCPkts;

                        public final DsmonHostInHCOctetsEnt dsmonHostInHCOctets;

                        public final DsmonHostOutPktsEnt dsmonHostOutPkts;

                        public final DsmonHostOutOctetsEnt dsmonHostOutOctets;

                        public final DsmonHostOutOvflPktsEnt dsmonHostOutOvflPkts;

                        public final DsmonHostOutOvflOctetsEnt dsmonHostOutOvflOctets;

                        public final DsmonHostOutHCPktsEnt dsmonHostOutHCPkts;

                        public final DsmonHostOutHCOctetsEnt dsmonHostOutHCOctets;

                        public final DsmonHostCreateTimeEnt dsmonHostCreateTime;

                        private DsmonHostEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonHostEntry", "1.3.6.1.2.1.16.26.1.4.2.1", false, false, false, true);
                            this.dsmonHostTimeMark = new DsmonHostTimeMarkEnt(mib, this);
                            this.dsmonHostAddress = new DsmonHostAddressEnt(mib, this);
                            this.dsmonHostInPkts = new DsmonHostInPktsEnt(mib, this);
                            this.dsmonHostInOctets = new DsmonHostInOctetsEnt(mib, this);
                            this.dsmonHostInOvflPkts = new DsmonHostInOvflPktsEnt(mib, this);
                            this.dsmonHostInOvflOctets = new DsmonHostInOvflOctetsEnt(mib, this);
                            this.dsmonHostInHCPkts = new DsmonHostInHCPktsEnt(mib, this);
                            this.dsmonHostInHCOctets = new DsmonHostInHCOctetsEnt(mib, this);
                            this.dsmonHostOutPkts = new DsmonHostOutPktsEnt(mib, this);
                            this.dsmonHostOutOctets = new DsmonHostOutOctetsEnt(mib, this);
                            this.dsmonHostOutOvflPkts = new DsmonHostOutOvflPktsEnt(mib, this);
                            this.dsmonHostOutOvflOctets = new DsmonHostOutOvflOctetsEnt(mib, this);
                            this.dsmonHostOutHCPkts = new DsmonHostOutHCPktsEnt(mib, this);
                            this.dsmonHostOutHCOctets = new DsmonHostOutHCOctetsEnt(mib, this);
                            this.dsmonHostCreateTime = new DsmonHostCreateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonHostTimeMark,
                                this.dsmonHostAddress,
                                this.dsmonHostInPkts,
                                this.dsmonHostInOctets,
                                this.dsmonHostInOvflPkts,
                                this.dsmonHostInOvflOctets,
                                this.dsmonHostInHCPkts,
                                this.dsmonHostInHCOctets,
                                this.dsmonHostOutPkts,
                                this.dsmonHostOutOctets,
                                this.dsmonHostOutOvflPkts,
                                this.dsmonHostOutOvflOctets,
                                this.dsmonHostOutHCPkts,
                                this.dsmonHostOutHCOctets,
                                this.dsmonHostCreateTime
                            };
                        }
                        public static final class DsmonHostTimeMarkEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTimeMarkEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTimeMark", "1.3.6.1.2.1.16.26.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostAddressEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostAddressEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostAddress", "1.3.6.1.2.1.16.26.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostInPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostInPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostInPkts", "1.3.6.1.2.1.16.26.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostInOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostInOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostInOctets", "1.3.6.1.2.1.16.26.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostInOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostInOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostInOvflPkts", "1.3.6.1.2.1.16.26.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostInOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostInOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostInOvflOctets", "1.3.6.1.2.1.16.26.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostInHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostInHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostInHCPkts", "1.3.6.1.2.1.16.26.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostInHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostInHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostInHCOctets", "1.3.6.1.2.1.16.26.1.4.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostOutPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostOutPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostOutPkts", "1.3.6.1.2.1.16.26.1.4.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostOutOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostOutOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostOutOctets", "1.3.6.1.2.1.16.26.1.4.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostOutOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostOutOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostOutOvflPkts", "1.3.6.1.2.1.16.26.1.4.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostOutOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostOutOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostOutOvflOctets", "1.3.6.1.2.1.16.26.1.4.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostOutHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostOutHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostOutHCPkts", "1.3.6.1.2.1.16.26.1.4.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostOutHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostOutHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostOutHCOctets", "1.3.6.1.2.1.16.26.1.4.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostCreateTime", "1.3.6.1.2.1.16.26.1.4.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonHostTopNCtlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonHostTopNCtlEntryEnt dsmonHostTopNCtlEntry;

                    private DsmonHostTopNCtlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostTopNCtlTable", "1.3.6.1.2.1.16.26.1.4.3", false, true, false, false);
                        this.dsmonHostTopNCtlEntry = new DsmonHostTopNCtlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonHostTopNCtlEntry
                        };
                    }
                    public static final class DsmonHostTopNCtlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonHostTopNCtlIndexEnt dsmonHostTopNCtlIndex;

                        public final DsmonHostTopNCtlHostIndexEnt dsmonHostTopNCtlHostIndex;

                        public final DsmonHostTopNCtlRateBaseEnt dsmonHostTopNCtlRateBase;

                        public final DsmonHostTopNCtlTimeRemainingEnt dsmonHostTopNCtlTimeRemaining;

                        public final DsmonHostTopNCtlGeneratedReportsEnt dsmonHostTopNCtlGeneratedReports;

                        public final DsmonHostTopNCtlDurationEnt dsmonHostTopNCtlDuration;

                        public final DsmonHostTopNCtlRequestedSizeEnt dsmonHostTopNCtlRequestedSize;

                        public final DsmonHostTopNCtlGrantedSizeEnt dsmonHostTopNCtlGrantedSize;

                        public final DsmonHostTopNCtlStartTimeEnt dsmonHostTopNCtlStartTime;

                        public final DsmonHostTopNCtlOwnerEnt dsmonHostTopNCtlOwner;

                        public final DsmonHostTopNCtlStatusEnt dsmonHostTopNCtlStatus;

                        private DsmonHostTopNCtlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonHostTopNCtlEntry", "1.3.6.1.2.1.16.26.1.4.3.1", false, false, false, true);
                            this.dsmonHostTopNCtlIndex = new DsmonHostTopNCtlIndexEnt(mib, this);
                            this.dsmonHostTopNCtlHostIndex = new DsmonHostTopNCtlHostIndexEnt(mib, this);
                            this.dsmonHostTopNCtlRateBase = new DsmonHostTopNCtlRateBaseEnt(mib, this);
                            this.dsmonHostTopNCtlTimeRemaining = new DsmonHostTopNCtlTimeRemainingEnt(mib, this);
                            this.dsmonHostTopNCtlGeneratedReports = new DsmonHostTopNCtlGeneratedReportsEnt(mib, this);
                            this.dsmonHostTopNCtlDuration = new DsmonHostTopNCtlDurationEnt(mib, this);
                            this.dsmonHostTopNCtlRequestedSize = new DsmonHostTopNCtlRequestedSizeEnt(mib, this);
                            this.dsmonHostTopNCtlGrantedSize = new DsmonHostTopNCtlGrantedSizeEnt(mib, this);
                            this.dsmonHostTopNCtlStartTime = new DsmonHostTopNCtlStartTimeEnt(mib, this);
                            this.dsmonHostTopNCtlOwner = new DsmonHostTopNCtlOwnerEnt(mib, this);
                            this.dsmonHostTopNCtlStatus = new DsmonHostTopNCtlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonHostTopNCtlIndex,
                                this.dsmonHostTopNCtlHostIndex,
                                this.dsmonHostTopNCtlRateBase,
                                this.dsmonHostTopNCtlTimeRemaining,
                                this.dsmonHostTopNCtlGeneratedReports,
                                this.dsmonHostTopNCtlDuration,
                                this.dsmonHostTopNCtlRequestedSize,
                                this.dsmonHostTopNCtlGrantedSize,
                                this.dsmonHostTopNCtlStartTime,
                                this.dsmonHostTopNCtlOwner,
                                this.dsmonHostTopNCtlStatus
                            };
                        }
                        public static final class DsmonHostTopNCtlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlIndex", "1.3.6.1.2.1.16.26.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlHostIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlHostIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlHostIndex", "1.3.6.1.2.1.16.26.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlRateBaseEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlRateBaseEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlRateBase", "1.3.6.1.2.1.16.26.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlTimeRemainingEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlTimeRemainingEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlTimeRemaining", "1.3.6.1.2.1.16.26.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlGeneratedReportsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlGeneratedReportsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlGeneratedReports", "1.3.6.1.2.1.16.26.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlDurationEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlDurationEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlDuration", "1.3.6.1.2.1.16.26.1.4.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlRequestedSizeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlRequestedSizeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlRequestedSize", "1.3.6.1.2.1.16.26.1.4.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlGrantedSizeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlGrantedSizeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlGrantedSize", "1.3.6.1.2.1.16.26.1.4.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlStartTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlStartTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlStartTime", "1.3.6.1.2.1.16.26.1.4.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlOwner", "1.3.6.1.2.1.16.26.1.4.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNCtlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNCtlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNCtlStatus", "1.3.6.1.2.1.16.26.1.4.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonHostTopNTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonHostTopNEntryEnt dsmonHostTopNEntry;

                    private DsmonHostTopNTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostTopNTable", "1.3.6.1.2.1.16.26.1.4.4", false, true, false, false);
                        this.dsmonHostTopNEntry = new DsmonHostTopNEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonHostTopNEntry
                        };
                    }
                    public static final class DsmonHostTopNEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonHostTopNIndexEnt dsmonHostTopNIndex;

                        public final DsmonHostTopNPDLocalIndexEnt dsmonHostTopNPDLocalIndex;

                        public final DsmonHostTopNAddressEnt dsmonHostTopNAddress;

                        public final DsmonHostTopNAggGroupEnt dsmonHostTopNAggGroup;

                        public final DsmonHostTopNRateEnt dsmonHostTopNRate;

                        public final DsmonHostTopNRateOvflEnt dsmonHostTopNRateOvfl;

                        public final DsmonHostTopNHCRateEnt dsmonHostTopNHCRate;

                        private DsmonHostTopNEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonHostTopNEntry", "1.3.6.1.2.1.16.26.1.4.4.1", false, false, false, true);
                            this.dsmonHostTopNIndex = new DsmonHostTopNIndexEnt(mib, this);
                            this.dsmonHostTopNPDLocalIndex = new DsmonHostTopNPDLocalIndexEnt(mib, this);
                            this.dsmonHostTopNAddress = new DsmonHostTopNAddressEnt(mib, this);
                            this.dsmonHostTopNAggGroup = new DsmonHostTopNAggGroupEnt(mib, this);
                            this.dsmonHostTopNRate = new DsmonHostTopNRateEnt(mib, this);
                            this.dsmonHostTopNRateOvfl = new DsmonHostTopNRateOvflEnt(mib, this);
                            this.dsmonHostTopNHCRate = new DsmonHostTopNHCRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonHostTopNIndex,
                                this.dsmonHostTopNPDLocalIndex,
                                this.dsmonHostTopNAddress,
                                this.dsmonHostTopNAggGroup,
                                this.dsmonHostTopNRate,
                                this.dsmonHostTopNRateOvfl,
                                this.dsmonHostTopNHCRate
                            };
                        }
                        public static final class DsmonHostTopNIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNIndex", "1.3.6.1.2.1.16.26.1.4.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNPDLocalIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNPDLocalIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNPDLocalIndex", "1.3.6.1.2.1.16.26.1.4.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNAddressEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNAddressEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNAddress", "1.3.6.1.2.1.16.26.1.4.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNAggGroupEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNAggGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNAggGroup", "1.3.6.1.2.1.16.26.1.4.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNRate", "1.3.6.1.2.1.16.26.1.4.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNRateOvflEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNRateOvflEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNRateOvfl", "1.3.6.1.2.1.16.26.1.4.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonHostTopNHCRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonHostTopNHCRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonHostTopNHCRate", "1.3.6.1.2.1.16.26.1.4.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DsmonCapsObjectsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** ************************************************************                                                         **           D S M O N    C A P A B I L I T I E S          **                                                         *************************************************************/
                public final DsmonCapabilitiesEnt dsmonCapabilities;

                private DsmonCapsObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonCapsObjects", "1.3.6.1.2.1.16.26.1.5", false, false, false, false);
                    this.dsmonCapabilities = new DsmonCapabilitiesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonCapabilities
                    };
                }
                public static final class DsmonCapabilitiesEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonCapabilitiesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonCapabilities", "1.3.6.1.2.1.16.26.1.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DsmonMatrixObjectsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** ***************************************************************                                                            **   P E R  -  C O N V E R S I O N    C O L L E C T I O N S   **                                                            ***************************************************************
AL Matrix Statistics Control Table*/
                public final DsmonMatrixCtlTableEnt dsmonMatrixCtlTable;

                /** AL Matrix SD Statistics Table*/
                public final DsmonMatrixSDTableEnt dsmonMatrixSDTable;

                /** AL Matrix DS Statistics Table*/
                public final DsmonMatrixDSTableEnt dsmonMatrixDSTable;

                /** Per-Protocol Per-Matrix Statistics TopN Control Table*/
                public final DsmonMatrixTopNCtlTableEnt dsmonMatrixTopNCtlTable;

                /** dsmonMatrix TopN Table*/
                public final DsmonMatrixTopNTableEnt dsmonMatrixTopNTable;

                private DsmonMatrixObjectsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonMatrixObjects", "1.3.6.1.2.1.16.26.1.6", false, false, false, false);
                    this.dsmonMatrixCtlTable = new DsmonMatrixCtlTableEnt(mib, this);
                    this.dsmonMatrixSDTable = new DsmonMatrixSDTableEnt(mib, this);
                    this.dsmonMatrixDSTable = new DsmonMatrixDSTableEnt(mib, this);
                    this.dsmonMatrixTopNCtlTable = new DsmonMatrixTopNCtlTableEnt(mib, this);
                    this.dsmonMatrixTopNTable = new DsmonMatrixTopNTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonMatrixCtlTable,
                        this.dsmonMatrixSDTable,
                        this.dsmonMatrixDSTable,
                        this.dsmonMatrixTopNCtlTable,
                        this.dsmonMatrixTopNTable
                    };
                }
                public static final class DsmonMatrixCtlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonMatrixCtlEntryEnt dsmonMatrixCtlEntry;

                    private DsmonMatrixCtlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixCtlTable", "1.3.6.1.2.1.16.26.1.6.1", false, true, false, false);
                        this.dsmonMatrixCtlEntry = new DsmonMatrixCtlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonMatrixCtlEntry
                        };
                    }
                    public static final class DsmonMatrixCtlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonMatrixCtlIndexEnt dsmonMatrixCtlIndex;

                        public final DsmonMatrixCtlDataSourceEnt dsmonMatrixCtlDataSource;

                        public final DsmonMatrixCtlAggProfileEnt dsmonMatrixCtlAggProfile;

                        public final DsmonMatrixCtlMaxDesiredEntriesEnt dsmonMatrixCtlMaxDesiredEntries;

                        public final DsmonMatrixCtlDroppedFramesEnt dsmonMatrixCtlDroppedFrames;

                        public final DsmonMatrixCtlInsertsEnt dsmonMatrixCtlInserts;

                        public final DsmonMatrixCtlDeletesEnt dsmonMatrixCtlDeletes;

                        public final DsmonMatrixCtlCreateTimeEnt dsmonMatrixCtlCreateTime;

                        public final DsmonMatrixCtlOwnerEnt dsmonMatrixCtlOwner;

                        public final DsmonMatrixCtlStatusEnt dsmonMatrixCtlStatus;

                        private DsmonMatrixCtlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonMatrixCtlEntry", "1.3.6.1.2.1.16.26.1.6.1.1", false, false, false, true);
                            this.dsmonMatrixCtlIndex = new DsmonMatrixCtlIndexEnt(mib, this);
                            this.dsmonMatrixCtlDataSource = new DsmonMatrixCtlDataSourceEnt(mib, this);
                            this.dsmonMatrixCtlAggProfile = new DsmonMatrixCtlAggProfileEnt(mib, this);
                            this.dsmonMatrixCtlMaxDesiredEntries = new DsmonMatrixCtlMaxDesiredEntriesEnt(mib, this);
                            this.dsmonMatrixCtlDroppedFrames = new DsmonMatrixCtlDroppedFramesEnt(mib, this);
                            this.dsmonMatrixCtlInserts = new DsmonMatrixCtlInsertsEnt(mib, this);
                            this.dsmonMatrixCtlDeletes = new DsmonMatrixCtlDeletesEnt(mib, this);
                            this.dsmonMatrixCtlCreateTime = new DsmonMatrixCtlCreateTimeEnt(mib, this);
                            this.dsmonMatrixCtlOwner = new DsmonMatrixCtlOwnerEnt(mib, this);
                            this.dsmonMatrixCtlStatus = new DsmonMatrixCtlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonMatrixCtlIndex,
                                this.dsmonMatrixCtlDataSource,
                                this.dsmonMatrixCtlAggProfile,
                                this.dsmonMatrixCtlMaxDesiredEntries,
                                this.dsmonMatrixCtlDroppedFrames,
                                this.dsmonMatrixCtlInserts,
                                this.dsmonMatrixCtlDeletes,
                                this.dsmonMatrixCtlCreateTime,
                                this.dsmonMatrixCtlOwner,
                                this.dsmonMatrixCtlStatus
                            };
                        }
                        public static final class DsmonMatrixCtlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlIndex", "1.3.6.1.2.1.16.26.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlDataSourceEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlDataSourceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlDataSource", "1.3.6.1.2.1.16.26.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlAggProfileEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlAggProfileEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlAggProfile", "1.3.6.1.2.1.16.26.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlMaxDesiredEntriesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlMaxDesiredEntriesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlMaxDesiredEntries", "1.3.6.1.2.1.16.26.1.6.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlDroppedFramesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlDroppedFramesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlDroppedFrames", "1.3.6.1.2.1.16.26.1.6.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlInsertsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlInsertsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlInserts", "1.3.6.1.2.1.16.26.1.6.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlDeletesEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlDeletesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlDeletes", "1.3.6.1.2.1.16.26.1.6.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlCreateTime", "1.3.6.1.2.1.16.26.1.6.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlOwner", "1.3.6.1.2.1.16.26.1.6.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixCtlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixCtlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixCtlStatus", "1.3.6.1.2.1.16.26.1.6.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonMatrixSDTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonMatrixSDEntryEnt dsmonMatrixSDEntry;

                    private DsmonMatrixSDTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixSDTable", "1.3.6.1.2.1.16.26.1.6.2", false, true, false, false);
                        this.dsmonMatrixSDEntry = new DsmonMatrixSDEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonMatrixSDEntry
                        };
                    }
                    public static final class DsmonMatrixSDEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonMatrixTimeMarkEnt dsmonMatrixTimeMark;

                        public final DsmonMatrixNLIndexEnt dsmonMatrixNLIndex;

                        public final DsmonMatrixSourceAddressEnt dsmonMatrixSourceAddress;

                        public final DsmonMatrixDestAddressEnt dsmonMatrixDestAddress;

                        public final DsmonMatrixALIndexEnt dsmonMatrixALIndex;

                        public final DsmonMatrixSDPktsEnt dsmonMatrixSDPkts;

                        public final DsmonMatrixSDOvflPktsEnt dsmonMatrixSDOvflPkts;

                        public final DsmonMatrixSDHCPktsEnt dsmonMatrixSDHCPkts;

                        public final DsmonMatrixSDOctetsEnt dsmonMatrixSDOctets;

                        public final DsmonMatrixSDOvflOctetsEnt dsmonMatrixSDOvflOctets;

                        public final DsmonMatrixSDHCOctetsEnt dsmonMatrixSDHCOctets;

                        public final DsmonMatrixSDCreateTimeEnt dsmonMatrixSDCreateTime;

                        private DsmonMatrixSDEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonMatrixSDEntry", "1.3.6.1.2.1.16.26.1.6.2.1", false, false, false, true);
                            this.dsmonMatrixTimeMark = new DsmonMatrixTimeMarkEnt(mib, this);
                            this.dsmonMatrixNLIndex = new DsmonMatrixNLIndexEnt(mib, this);
                            this.dsmonMatrixSourceAddress = new DsmonMatrixSourceAddressEnt(mib, this);
                            this.dsmonMatrixDestAddress = new DsmonMatrixDestAddressEnt(mib, this);
                            this.dsmonMatrixALIndex = new DsmonMatrixALIndexEnt(mib, this);
                            this.dsmonMatrixSDPkts = new DsmonMatrixSDPktsEnt(mib, this);
                            this.dsmonMatrixSDOvflPkts = new DsmonMatrixSDOvflPktsEnt(mib, this);
                            this.dsmonMatrixSDHCPkts = new DsmonMatrixSDHCPktsEnt(mib, this);
                            this.dsmonMatrixSDOctets = new DsmonMatrixSDOctetsEnt(mib, this);
                            this.dsmonMatrixSDOvflOctets = new DsmonMatrixSDOvflOctetsEnt(mib, this);
                            this.dsmonMatrixSDHCOctets = new DsmonMatrixSDHCOctetsEnt(mib, this);
                            this.dsmonMatrixSDCreateTime = new DsmonMatrixSDCreateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonMatrixTimeMark,
                                this.dsmonMatrixNLIndex,
                                this.dsmonMatrixSourceAddress,
                                this.dsmonMatrixDestAddress,
                                this.dsmonMatrixALIndex,
                                this.dsmonMatrixSDPkts,
                                this.dsmonMatrixSDOvflPkts,
                                this.dsmonMatrixSDHCPkts,
                                this.dsmonMatrixSDOctets,
                                this.dsmonMatrixSDOvflOctets,
                                this.dsmonMatrixSDHCOctets,
                                this.dsmonMatrixSDCreateTime
                            };
                        }
                        public static final class DsmonMatrixTimeMarkEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTimeMarkEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTimeMark", "1.3.6.1.2.1.16.26.1.6.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixNLIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixNLIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixNLIndex", "1.3.6.1.2.1.16.26.1.6.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSourceAddressEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSourceAddressEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSourceAddress", "1.3.6.1.2.1.16.26.1.6.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDestAddressEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDestAddressEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDestAddress", "1.3.6.1.2.1.16.26.1.6.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixALIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixALIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixALIndex", "1.3.6.1.2.1.16.26.1.6.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDPkts", "1.3.6.1.2.1.16.26.1.6.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDOvflPkts", "1.3.6.1.2.1.16.26.1.6.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDHCPkts", "1.3.6.1.2.1.16.26.1.6.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDOctets", "1.3.6.1.2.1.16.26.1.6.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDOvflOctets", "1.3.6.1.2.1.16.26.1.6.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDHCOctets", "1.3.6.1.2.1.16.26.1.6.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixSDCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixSDCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixSDCreateTime", "1.3.6.1.2.1.16.26.1.6.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonMatrixDSTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonMatrixDSEntryEnt dsmonMatrixDSEntry;

                    private DsmonMatrixDSTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixDSTable", "1.3.6.1.2.1.16.26.1.6.3", false, true, false, false);
                        this.dsmonMatrixDSEntry = new DsmonMatrixDSEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonMatrixDSEntry
                        };
                    }
                    public static final class DsmonMatrixDSEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonMatrixDSPktsEnt dsmonMatrixDSPkts;

                        public final DsmonMatrixDSOvflPktsEnt dsmonMatrixDSOvflPkts;

                        public final DsmonMatrixDSHCPktsEnt dsmonMatrixDSHCPkts;

                        public final DsmonMatrixDSOctetsEnt dsmonMatrixDSOctets;

                        public final DsmonMatrixDSOvflOctetsEnt dsmonMatrixDSOvflOctets;

                        public final DsmonMatrixDSHCOctetsEnt dsmonMatrixDSHCOctets;

                        public final DsmonMatrixDSCreateTimeEnt dsmonMatrixDSCreateTime;

                        private DsmonMatrixDSEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonMatrixDSEntry", "1.3.6.1.2.1.16.26.1.6.3.1", false, false, false, true);
                            this.dsmonMatrixDSPkts = new DsmonMatrixDSPktsEnt(mib, this);
                            this.dsmonMatrixDSOvflPkts = new DsmonMatrixDSOvflPktsEnt(mib, this);
                            this.dsmonMatrixDSHCPkts = new DsmonMatrixDSHCPktsEnt(mib, this);
                            this.dsmonMatrixDSOctets = new DsmonMatrixDSOctetsEnt(mib, this);
                            this.dsmonMatrixDSOvflOctets = new DsmonMatrixDSOvflOctetsEnt(mib, this);
                            this.dsmonMatrixDSHCOctets = new DsmonMatrixDSHCOctetsEnt(mib, this);
                            this.dsmonMatrixDSCreateTime = new DsmonMatrixDSCreateTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonMatrixDSPkts,
                                this.dsmonMatrixDSOvflPkts,
                                this.dsmonMatrixDSHCPkts,
                                this.dsmonMatrixDSOctets,
                                this.dsmonMatrixDSOvflOctets,
                                this.dsmonMatrixDSHCOctets,
                                this.dsmonMatrixDSCreateTime
                            };
                        }
                        public static final class DsmonMatrixDSPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSPkts", "1.3.6.1.2.1.16.26.1.6.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDSOvflPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSOvflPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSOvflPkts", "1.3.6.1.2.1.16.26.1.6.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDSHCPktsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSHCPktsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSHCPkts", "1.3.6.1.2.1.16.26.1.6.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDSOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSOctets", "1.3.6.1.2.1.16.26.1.6.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDSOvflOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSOvflOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSOvflOctets", "1.3.6.1.2.1.16.26.1.6.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDSHCOctetsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSHCOctetsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSHCOctets", "1.3.6.1.2.1.16.26.1.6.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixDSCreateTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixDSCreateTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixDSCreateTime", "1.3.6.1.2.1.16.26.1.6.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonMatrixTopNCtlTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonMatrixTopNCtlEntryEnt dsmonMatrixTopNCtlEntry;

                    private DsmonMatrixTopNCtlTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixTopNCtlTable", "1.3.6.1.2.1.16.26.1.6.4", false, true, false, false);
                        this.dsmonMatrixTopNCtlEntry = new DsmonMatrixTopNCtlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonMatrixTopNCtlEntry
                        };
                    }
                    public static final class DsmonMatrixTopNCtlEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonMatrixTopNCtlIndexEnt dsmonMatrixTopNCtlIndex;

                        public final DsmonMatrixTopNCtlMatrixIndexEnt dsmonMatrixTopNCtlMatrixIndex;

                        public final DsmonMatrixTopNCtlRateBaseEnt dsmonMatrixTopNCtlRateBase;

                        public final DsmonMatrixTopNCtlTimeRemainingEnt dsmonMatrixTopNCtlTimeRemaining;

                        public final DsmonMatrixTopNCtlGeneratedRptsEnt dsmonMatrixTopNCtlGeneratedRpts;

                        public final DsmonMatrixTopNCtlDurationEnt dsmonMatrixTopNCtlDuration;

                        public final DsmonMatrixTopNCtlRequestedSizeEnt dsmonMatrixTopNCtlRequestedSize;

                        public final DsmonMatrixTopNCtlGrantedSizeEnt dsmonMatrixTopNCtlGrantedSize;

                        public final DsmonMatrixTopNCtlStartTimeEnt dsmonMatrixTopNCtlStartTime;

                        public final DsmonMatrixTopNCtlOwnerEnt dsmonMatrixTopNCtlOwner;

                        public final DsmonMatrixTopNCtlStatusEnt dsmonMatrixTopNCtlStatus;

                        private DsmonMatrixTopNCtlEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonMatrixTopNCtlEntry", "1.3.6.1.2.1.16.26.1.6.4.1", false, false, false, true);
                            this.dsmonMatrixTopNCtlIndex = new DsmonMatrixTopNCtlIndexEnt(mib, this);
                            this.dsmonMatrixTopNCtlMatrixIndex = new DsmonMatrixTopNCtlMatrixIndexEnt(mib, this);
                            this.dsmonMatrixTopNCtlRateBase = new DsmonMatrixTopNCtlRateBaseEnt(mib, this);
                            this.dsmonMatrixTopNCtlTimeRemaining = new DsmonMatrixTopNCtlTimeRemainingEnt(mib, this);
                            this.dsmonMatrixTopNCtlGeneratedRpts = new DsmonMatrixTopNCtlGeneratedRptsEnt(mib, this);
                            this.dsmonMatrixTopNCtlDuration = new DsmonMatrixTopNCtlDurationEnt(mib, this);
                            this.dsmonMatrixTopNCtlRequestedSize = new DsmonMatrixTopNCtlRequestedSizeEnt(mib, this);
                            this.dsmonMatrixTopNCtlGrantedSize = new DsmonMatrixTopNCtlGrantedSizeEnt(mib, this);
                            this.dsmonMatrixTopNCtlStartTime = new DsmonMatrixTopNCtlStartTimeEnt(mib, this);
                            this.dsmonMatrixTopNCtlOwner = new DsmonMatrixTopNCtlOwnerEnt(mib, this);
                            this.dsmonMatrixTopNCtlStatus = new DsmonMatrixTopNCtlStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonMatrixTopNCtlIndex,
                                this.dsmonMatrixTopNCtlMatrixIndex,
                                this.dsmonMatrixTopNCtlRateBase,
                                this.dsmonMatrixTopNCtlTimeRemaining,
                                this.dsmonMatrixTopNCtlGeneratedRpts,
                                this.dsmonMatrixTopNCtlDuration,
                                this.dsmonMatrixTopNCtlRequestedSize,
                                this.dsmonMatrixTopNCtlGrantedSize,
                                this.dsmonMatrixTopNCtlStartTime,
                                this.dsmonMatrixTopNCtlOwner,
                                this.dsmonMatrixTopNCtlStatus
                            };
                        }
                        public static final class DsmonMatrixTopNCtlIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlIndex", "1.3.6.1.2.1.16.26.1.6.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlMatrixIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlMatrixIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlMatrixIndex", "1.3.6.1.2.1.16.26.1.6.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlRateBaseEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlRateBaseEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlRateBase", "1.3.6.1.2.1.16.26.1.6.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlTimeRemainingEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlTimeRemainingEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlTimeRemaining", "1.3.6.1.2.1.16.26.1.6.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlGeneratedRptsEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlGeneratedRptsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlGeneratedRpts", "1.3.6.1.2.1.16.26.1.6.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlDurationEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlDurationEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlDuration", "1.3.6.1.2.1.16.26.1.6.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlRequestedSizeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlRequestedSizeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlRequestedSize", "1.3.6.1.2.1.16.26.1.6.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlGrantedSizeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlGrantedSizeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlGrantedSize", "1.3.6.1.2.1.16.26.1.6.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlStartTimeEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlStartTimeEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlStartTime", "1.3.6.1.2.1.16.26.1.6.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlOwnerEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlOwnerEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlOwner", "1.3.6.1.2.1.16.26.1.6.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNCtlStatusEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNCtlStatusEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNCtlStatus", "1.3.6.1.2.1.16.26.1.6.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DsmonMatrixTopNTableEnt extends MIBEntry<DSMONMIBDef>
                {
                    public final DsmonMatrixTopNEntryEnt dsmonMatrixTopNEntry;

                    private DsmonMatrixTopNTableEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixTopNTable", "1.3.6.1.2.1.16.26.1.6.5", false, true, false, false);
                        this.dsmonMatrixTopNEntry = new DsmonMatrixTopNEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dsmonMatrixTopNEntry
                        };
                    }
                    public static final class DsmonMatrixTopNEntryEnt extends MIBEntry<DSMONMIBDef>
                    {
                        public final DsmonMatrixTopNIndexEnt dsmonMatrixTopNIndex;

                        public final DsmonMatrixTopNAggGroupEnt dsmonMatrixTopNAggGroup;

                        public final DsmonMatrixTopNNLIndexEnt dsmonMatrixTopNNLIndex;

                        public final DsmonMatrixTopNSourceAddressEnt dsmonMatrixTopNSourceAddress;

                        public final DsmonMatrixTopNDestAddressEnt dsmonMatrixTopNDestAddress;

                        public final DsmonMatrixTopNALIndexEnt dsmonMatrixTopNALIndex;

                        public final DsmonMatrixTopNPktRateEnt dsmonMatrixTopNPktRate;

                        public final DsmonMatrixTopNPktRateOvflEnt dsmonMatrixTopNPktRateOvfl;

                        public final DsmonMatrixTopNHCPktRateEnt dsmonMatrixTopNHCPktRate;

                        public final DsmonMatrixTopNRevPktRateEnt dsmonMatrixTopNRevPktRate;

                        public final DsmonMatrixTopNRevPktRateOvflEnt dsmonMatrixTopNRevPktRateOvfl;

                        public final DsmonMatrixTopNHCRevPktRateEnt dsmonMatrixTopNHCRevPktRate;

                        public final DsmonMatrixTopNOctetRateEnt dsmonMatrixTopNOctetRate;

                        public final DsmonMatrixTopNOctetRateOvflEnt dsmonMatrixTopNOctetRateOvfl;

                        public final DsmonMatrixTopNHCOctetRateEnt dsmonMatrixTopNHCOctetRate;

                        public final DsmonMatrixTopNRevOctetRateEnt dsmonMatrixTopNRevOctetRate;

                        public final DsmonMatrixTopNRevOctetRateOvflEnt dsmonMatrixTopNRevOctetRateOvfl;

                        public final DsmonMatrixTopNHCRevOctetRateEnt dsmonMatrixTopNHCRevOctetRate;

                        private DsmonMatrixTopNEntryEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                        {
                            super(mib, parent, "dsmonMatrixTopNEntry", "1.3.6.1.2.1.16.26.1.6.5.1", false, false, false, true);
                            this.dsmonMatrixTopNIndex = new DsmonMatrixTopNIndexEnt(mib, this);
                            this.dsmonMatrixTopNAggGroup = new DsmonMatrixTopNAggGroupEnt(mib, this);
                            this.dsmonMatrixTopNNLIndex = new DsmonMatrixTopNNLIndexEnt(mib, this);
                            this.dsmonMatrixTopNSourceAddress = new DsmonMatrixTopNSourceAddressEnt(mib, this);
                            this.dsmonMatrixTopNDestAddress = new DsmonMatrixTopNDestAddressEnt(mib, this);
                            this.dsmonMatrixTopNALIndex = new DsmonMatrixTopNALIndexEnt(mib, this);
                            this.dsmonMatrixTopNPktRate = new DsmonMatrixTopNPktRateEnt(mib, this);
                            this.dsmonMatrixTopNPktRateOvfl = new DsmonMatrixTopNPktRateOvflEnt(mib, this);
                            this.dsmonMatrixTopNHCPktRate = new DsmonMatrixTopNHCPktRateEnt(mib, this);
                            this.dsmonMatrixTopNRevPktRate = new DsmonMatrixTopNRevPktRateEnt(mib, this);
                            this.dsmonMatrixTopNRevPktRateOvfl = new DsmonMatrixTopNRevPktRateOvflEnt(mib, this);
                            this.dsmonMatrixTopNHCRevPktRate = new DsmonMatrixTopNHCRevPktRateEnt(mib, this);
                            this.dsmonMatrixTopNOctetRate = new DsmonMatrixTopNOctetRateEnt(mib, this);
                            this.dsmonMatrixTopNOctetRateOvfl = new DsmonMatrixTopNOctetRateOvflEnt(mib, this);
                            this.dsmonMatrixTopNHCOctetRate = new DsmonMatrixTopNHCOctetRateEnt(mib, this);
                            this.dsmonMatrixTopNRevOctetRate = new DsmonMatrixTopNRevOctetRateEnt(mib, this);
                            this.dsmonMatrixTopNRevOctetRateOvfl = new DsmonMatrixTopNRevOctetRateOvflEnt(mib, this);
                            this.dsmonMatrixTopNHCRevOctetRate = new DsmonMatrixTopNHCRevOctetRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dsmonMatrixTopNIndex,
                                this.dsmonMatrixTopNAggGroup,
                                this.dsmonMatrixTopNNLIndex,
                                this.dsmonMatrixTopNSourceAddress,
                                this.dsmonMatrixTopNDestAddress,
                                this.dsmonMatrixTopNALIndex,
                                this.dsmonMatrixTopNPktRate,
                                this.dsmonMatrixTopNPktRateOvfl,
                                this.dsmonMatrixTopNHCPktRate,
                                this.dsmonMatrixTopNRevPktRate,
                                this.dsmonMatrixTopNRevPktRateOvfl,
                                this.dsmonMatrixTopNHCRevPktRate,
                                this.dsmonMatrixTopNOctetRate,
                                this.dsmonMatrixTopNOctetRateOvfl,
                                this.dsmonMatrixTopNHCOctetRate,
                                this.dsmonMatrixTopNRevOctetRate,
                                this.dsmonMatrixTopNRevOctetRateOvfl,
                                this.dsmonMatrixTopNHCRevOctetRate
                            };
                        }
                        public static final class DsmonMatrixTopNIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNIndex", "1.3.6.1.2.1.16.26.1.6.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNAggGroupEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNAggGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNAggGroup", "1.3.6.1.2.1.16.26.1.6.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNNLIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNNLIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNNLIndex", "1.3.6.1.2.1.16.26.1.6.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNSourceAddressEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNSourceAddressEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNSourceAddress", "1.3.6.1.2.1.16.26.1.6.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNDestAddressEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNDestAddressEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNDestAddress", "1.3.6.1.2.1.16.26.1.6.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNALIndexEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNALIndexEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNALIndex", "1.3.6.1.2.1.16.26.1.6.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNPktRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNPktRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNPktRate", "1.3.6.1.2.1.16.26.1.6.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNPktRateOvflEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNPktRateOvflEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNPktRateOvfl", "1.3.6.1.2.1.16.26.1.6.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNHCPktRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNHCPktRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNHCPktRate", "1.3.6.1.2.1.16.26.1.6.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNRevPktRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNRevPktRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNRevPktRate", "1.3.6.1.2.1.16.26.1.6.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNRevPktRateOvflEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNRevPktRateOvflEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNRevPktRateOvfl", "1.3.6.1.2.1.16.26.1.6.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNHCRevPktRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNHCRevPktRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNHCRevPktRate", "1.3.6.1.2.1.16.26.1.6.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNOctetRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNOctetRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNOctetRate", "1.3.6.1.2.1.16.26.1.6.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNOctetRateOvflEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNOctetRateOvflEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNOctetRateOvfl", "1.3.6.1.2.1.16.26.1.6.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNHCOctetRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNHCOctetRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNHCOctetRate", "1.3.6.1.2.1.16.26.1.6.5.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNRevOctetRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNRevOctetRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNRevOctetRate", "1.3.6.1.2.1.16.26.1.6.5.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNRevOctetRateOvflEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNRevOctetRateOvflEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNRevOctetRateOvfl", "1.3.6.1.2.1.16.26.1.6.5.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DsmonMatrixTopNHCRevOctetRateEnt extends MIBEntry<DSMONMIBDef>
                        {
                            private DsmonMatrixTopNHCRevOctetRateEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                            {
                                super(mib, parent, "dsmonMatrixTopNHCRevOctetRate", "1.3.6.1.2.1.16.26.1.6.5.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DsmonNotificationsEnt extends MIBEntry<DSMONMIBDef>
        {
            private DsmonNotificationsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
            {
                super(mib, parent, "dsmonNotifications", "1.3.6.1.2.1.16.26.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DsmonConformanceEnt extends MIBEntry<DSMONMIBDef>
        {
            /** Conformance Section*/
            public final DsmonCompliancesEnt dsmonCompliances;

            public final DsmonGroupsEnt dsmonGroups;

            private DsmonConformanceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
            {
                super(mib, parent, "dsmonConformance", "1.3.6.1.2.1.16.26.3", false, false, false, false);
                this.dsmonCompliances = new DsmonCompliancesEnt(mib, this);
                this.dsmonGroups = new DsmonGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsmonCompliances,
                    this.dsmonGroups
                };
            }
            public static final class DsmonCompliancesEnt extends MIBEntry<DSMONMIBDef>
            {
                /** Compliance for agents that do not support HC or Counter64*/
                public final DsmonComplianceEnt dsmonCompliance;

                /** Compliance for agents that support HC and Counter64*/
                public final DsmonHCComplianceEnt dsmonHCCompliance;

                /** Compliance for agents that support HC, but not Counter64*/
                public final DsmonHCNoC64ComplianceEnt dsmonHCNoC64Compliance;

                private DsmonCompliancesEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonCompliances", "1.3.6.1.2.1.16.26.3.1", false, false, false, false);
                    this.dsmonCompliance = new DsmonComplianceEnt(mib, this);
                    this.dsmonHCCompliance = new DsmonHCComplianceEnt(mib, this);
                    this.dsmonHCNoC64Compliance = new DsmonHCNoC64ComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonCompliance,
                        this.dsmonHCCompliance,
                        this.dsmonHCNoC64Compliance
                    };
                }
                public static final class DsmonComplianceEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonComplianceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonCompliance", "1.3.6.1.2.1.16.26.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonHCComplianceEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonHCComplianceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHCCompliance", "1.3.6.1.2.1.16.26.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonHCNoC64ComplianceEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonHCNoC64ComplianceEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHCNoC64Compliance", "1.3.6.1.2.1.16.26.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DsmonGroupsEnt extends MIBEntry<DSMONMIBDef>
            {
                /** Object Groups*/
                public final DsmonCounterAggControlGroupEnt dsmonCounterAggControlGroup;

                public final DsmonStatsGroupEnt dsmonStatsGroup;

                public final DsmonStatsOvflGroupEnt dsmonStatsOvflGroup;

                public final DsmonStatsHCGroupEnt dsmonStatsHCGroup;

                public final DsmonPdistGroupEnt dsmonPdistGroup;

                public final DsmonPdistOvflGroupEnt dsmonPdistOvflGroup;

                public final DsmonPdistHCGroupEnt dsmonPdistHCGroup;

                public final DsmonHostGroupEnt dsmonHostGroup;

                public final DsmonHostOvflGroupEnt dsmonHostOvflGroup;

                public final DsmonHostHCGroupEnt dsmonHostHCGroup;

                public final DsmonCapsGroupEnt dsmonCapsGroup;

                public final DsmonMatrixGroupEnt dsmonMatrixGroup;

                public final DsmonMatrixOvflGroupEnt dsmonMatrixOvflGroup;

                public final DsmonMatrixHCGroupEnt dsmonMatrixHCGroup;

                private DsmonGroupsEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                {
                    super(mib, parent, "dsmonGroups", "1.3.6.1.2.1.16.26.3.2", false, false, false, false);
                    this.dsmonCounterAggControlGroup = new DsmonCounterAggControlGroupEnt(mib, this);
                    this.dsmonStatsGroup = new DsmonStatsGroupEnt(mib, this);
                    this.dsmonStatsOvflGroup = new DsmonStatsOvflGroupEnt(mib, this);
                    this.dsmonStatsHCGroup = new DsmonStatsHCGroupEnt(mib, this);
                    this.dsmonPdistGroup = new DsmonPdistGroupEnt(mib, this);
                    this.dsmonPdistOvflGroup = new DsmonPdistOvflGroupEnt(mib, this);
                    this.dsmonPdistHCGroup = new DsmonPdistHCGroupEnt(mib, this);
                    this.dsmonHostGroup = new DsmonHostGroupEnt(mib, this);
                    this.dsmonHostOvflGroup = new DsmonHostOvflGroupEnt(mib, this);
                    this.dsmonHostHCGroup = new DsmonHostHCGroupEnt(mib, this);
                    this.dsmonCapsGroup = new DsmonCapsGroupEnt(mib, this);
                    this.dsmonMatrixGroup = new DsmonMatrixGroupEnt(mib, this);
                    this.dsmonMatrixOvflGroup = new DsmonMatrixOvflGroupEnt(mib, this);
                    this.dsmonMatrixHCGroup = new DsmonMatrixHCGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsmonCounterAggControlGroup,
                        this.dsmonStatsGroup,
                        this.dsmonStatsOvflGroup,
                        this.dsmonStatsHCGroup,
                        this.dsmonPdistGroup,
                        this.dsmonPdistOvflGroup,
                        this.dsmonPdistHCGroup,
                        this.dsmonHostGroup,
                        this.dsmonHostOvflGroup,
                        this.dsmonHostHCGroup,
                        this.dsmonCapsGroup,
                        this.dsmonMatrixGroup,
                        this.dsmonMatrixOvflGroup,
                        this.dsmonMatrixHCGroup
                    };
                }
                public static final class DsmonCounterAggControlGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonCounterAggControlGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonCounterAggControlGroup", "1.3.6.1.2.1.16.26.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonStatsGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonStatsGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonStatsGroup", "1.3.6.1.2.1.16.26.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonStatsOvflGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonStatsOvflGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonStatsOvflGroup", "1.3.6.1.2.1.16.26.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonStatsHCGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonStatsHCGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonStatsHCGroup", "1.3.6.1.2.1.16.26.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonPdistGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonPdistGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistGroup", "1.3.6.1.2.1.16.26.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonPdistOvflGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonPdistOvflGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistOvflGroup", "1.3.6.1.2.1.16.26.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonPdistHCGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonPdistHCGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonPdistHCGroup", "1.3.6.1.2.1.16.26.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonHostGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonHostGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostGroup", "1.3.6.1.2.1.16.26.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonHostOvflGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonHostOvflGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostOvflGroup", "1.3.6.1.2.1.16.26.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonHostHCGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonHostHCGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonHostHCGroup", "1.3.6.1.2.1.16.26.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonCapsGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonCapsGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonCapsGroup", "1.3.6.1.2.1.16.26.3.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonMatrixGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonMatrixGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixGroup", "1.3.6.1.2.1.16.26.3.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonMatrixOvflGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonMatrixOvflGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixOvflGroup", "1.3.6.1.2.1.16.26.3.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsmonMatrixHCGroupEnt extends MIBEntry<DSMONMIBDef>
                {
                    private DsmonMatrixHCGroupEnt(DSMONMIBDef mib, MIBEntry<DSMONMIBDef> parent)
                    {
                        super(mib, parent, "dsmonMatrixHCGroup", "1.3.6.1.2.1.16.26.3.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
