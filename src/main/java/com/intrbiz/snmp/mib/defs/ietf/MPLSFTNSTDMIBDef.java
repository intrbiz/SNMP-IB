package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]
[RFC3411]
[RFC3289]
[RFC3291]
[RFC3811]*/
public final class MPLSFTNSTDMIBDef extends MIB
{
    public static final MPLSFTNSTDMIBDef MPLSFTNSTDMIB = new MPLSFTNSTDMIBDef();

    /** June 6, 2004*/
    public final MplsFTNStdMIBEnt mplsFTNStdMIB;

    private MPLSFTNSTDMIBDef()
    {
        super("MPLS-FTN-STD-MIB");
        this.mplsFTNStdMIB = new MplsFTNStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsFTNStdMIB
        };
    }

    public static final class MplsFTNStdMIBEnt extends MIBEntry<MPLSFTNSTDMIBDef>
    {
        /** Top-Level Components of this MIB.*/
        public final MplsFTNNotificationsEnt mplsFTNNotifications;

        public final MplsFTNObjectsEnt mplsFTNObjects;

        public final MplsFTNConformanceEnt mplsFTNConformance;

        private MplsFTNStdMIBEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
        {
            super(mib, parent, "mplsFTNStdMIB", "1.3.6.1.2.1.10.166.8", false, false, false, false);
            this.mplsFTNNotifications = new MplsFTNNotificationsEnt(mib, this);
            this.mplsFTNObjects = new MplsFTNObjectsEnt(mib, this);
            this.mplsFTNConformance = new MplsFTNConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsFTNNotifications,
                this.mplsFTNObjects,
                this.mplsFTNConformance
            };
        }
        public static final class MplsFTNNotificationsEnt extends MIBEntry<MPLSFTNSTDMIBDef>
        {
            private MplsFTNNotificationsEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
            {
                super(mib, parent, "mplsFTNNotifications", "1.3.6.1.2.1.10.166.8.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class MplsFTNObjectsEnt extends MIBEntry<MPLSFTNSTDMIBDef>
        {
            /** Next free index in mplsFTNTable.*/
            public final MplsFTNIndexNextEnt mplsFTNIndexNext;

            /** Last time an object in mplsFTNTable changed.*/
            public final MplsFTNTableLastChangedEnt mplsFTNTableLastChanged;

            /** Table of FTN entries.*/
            public final MplsFTNTableEnt mplsFTNTable;

            /** End of mplsFTNTable.
Last time an object in mplsFTNMapTable changed.*/
            public final MplsFTNMapTableLastChangedEnt mplsFTNMapTableLastChanged;

            /** FTN to interface mapping table.*/
            public final MplsFTNMapTableEnt mplsFTNMapTable;

            /** End of mplsFTNMapTable
FTN entry performance table*/
            public final MplsFTNPerfTableEnt mplsFTNPerfTable;

            private MplsFTNObjectsEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
            {
                super(mib, parent, "mplsFTNObjects", "1.3.6.1.2.1.10.166.8.1", false, false, false, false);
                this.mplsFTNIndexNext = new MplsFTNIndexNextEnt(mib, this);
                this.mplsFTNTableLastChanged = new MplsFTNTableLastChangedEnt(mib, this);
                this.mplsFTNTable = new MplsFTNTableEnt(mib, this);
                this.mplsFTNMapTableLastChanged = new MplsFTNMapTableLastChangedEnt(mib, this);
                this.mplsFTNMapTable = new MplsFTNMapTableEnt(mib, this);
                this.mplsFTNPerfTable = new MplsFTNPerfTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsFTNIndexNext,
                    this.mplsFTNTableLastChanged,
                    this.mplsFTNTable,
                    this.mplsFTNMapTableLastChanged,
                    this.mplsFTNMapTable,
                    this.mplsFTNPerfTable
                };
            }
            public static final class MplsFTNIndexNextEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                private MplsFTNIndexNextEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNIndexNext", "1.3.6.1.2.1.10.166.8.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsFTNTableLastChangedEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                private MplsFTNTableLastChangedEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNTableLastChanged", "1.3.6.1.2.1.10.166.8.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsFTNTableEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                public final MplsFTNEntryEnt mplsFTNEntry;

                private MplsFTNTableEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNTable", "1.3.6.1.2.1.10.166.8.1.3", false, true, false, false);
                    this.mplsFTNEntry = new MplsFTNEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsFTNEntry
                    };
                }
                public static final class MplsFTNEntryEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    public final MplsFTNIndexEnt mplsFTNIndex;

                    public final MplsFTNRowStatusEnt mplsFTNRowStatus;

                    public final MplsFTNDescrEnt mplsFTNDescr;

                    public final MplsFTNMaskEnt mplsFTNMask;

                    public final MplsFTNAddrTypeEnt mplsFTNAddrType;

                    public final MplsFTNSourceAddrMinEnt mplsFTNSourceAddrMin;

                    public final MplsFTNSourceAddrMaxEnt mplsFTNSourceAddrMax;

                    public final MplsFTNDestAddrMinEnt mplsFTNDestAddrMin;

                    public final MplsFTNDestAddrMaxEnt mplsFTNDestAddrMax;

                    public final MplsFTNSourcePortMinEnt mplsFTNSourcePortMin;

                    public final MplsFTNSourcePortMaxEnt mplsFTNSourcePortMax;

                    public final MplsFTNDestPortMinEnt mplsFTNDestPortMin;

                    public final MplsFTNDestPortMaxEnt mplsFTNDestPortMax;

                    public final MplsFTNProtocolEnt mplsFTNProtocol;

                    public final MplsFTNDscpEnt mplsFTNDscp;

                    public final MplsFTNActionTypeEnt mplsFTNActionType;

                    public final MplsFTNActionPointerEnt mplsFTNActionPointer;

                    public final MplsFTNStorageTypeEnt mplsFTNStorageType;

                    private MplsFTNEntryEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNEntry", "1.3.6.1.2.1.10.166.8.1.3.1", false, false, false, true);
                        this.mplsFTNIndex = new MplsFTNIndexEnt(mib, this);
                        this.mplsFTNRowStatus = new MplsFTNRowStatusEnt(mib, this);
                        this.mplsFTNDescr = new MplsFTNDescrEnt(mib, this);
                        this.mplsFTNMask = new MplsFTNMaskEnt(mib, this);
                        this.mplsFTNAddrType = new MplsFTNAddrTypeEnt(mib, this);
                        this.mplsFTNSourceAddrMin = new MplsFTNSourceAddrMinEnt(mib, this);
                        this.mplsFTNSourceAddrMax = new MplsFTNSourceAddrMaxEnt(mib, this);
                        this.mplsFTNDestAddrMin = new MplsFTNDestAddrMinEnt(mib, this);
                        this.mplsFTNDestAddrMax = new MplsFTNDestAddrMaxEnt(mib, this);
                        this.mplsFTNSourcePortMin = new MplsFTNSourcePortMinEnt(mib, this);
                        this.mplsFTNSourcePortMax = new MplsFTNSourcePortMaxEnt(mib, this);
                        this.mplsFTNDestPortMin = new MplsFTNDestPortMinEnt(mib, this);
                        this.mplsFTNDestPortMax = new MplsFTNDestPortMaxEnt(mib, this);
                        this.mplsFTNProtocol = new MplsFTNProtocolEnt(mib, this);
                        this.mplsFTNDscp = new MplsFTNDscpEnt(mib, this);
                        this.mplsFTNActionType = new MplsFTNActionTypeEnt(mib, this);
                        this.mplsFTNActionPointer = new MplsFTNActionPointerEnt(mib, this);
                        this.mplsFTNStorageType = new MplsFTNStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsFTNIndex,
                            this.mplsFTNRowStatus,
                            this.mplsFTNDescr,
                            this.mplsFTNMask,
                            this.mplsFTNAddrType,
                            this.mplsFTNSourceAddrMin,
                            this.mplsFTNSourceAddrMax,
                            this.mplsFTNDestAddrMin,
                            this.mplsFTNDestAddrMax,
                            this.mplsFTNSourcePortMin,
                            this.mplsFTNSourcePortMax,
                            this.mplsFTNDestPortMin,
                            this.mplsFTNDestPortMax,
                            this.mplsFTNProtocol,
                            this.mplsFTNDscp,
                            this.mplsFTNActionType,
                            this.mplsFTNActionPointer,
                            this.mplsFTNStorageType
                        };
                    }
                    public static final class MplsFTNIndexEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNIndexEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNIndex", "1.3.6.1.2.1.10.166.8.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNRowStatusEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNRowStatusEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNRowStatus", "1.3.6.1.2.1.10.166.8.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNDescrEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNDescrEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNDescr", "1.3.6.1.2.1.10.166.8.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNMaskEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNMaskEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNMask", "1.3.6.1.2.1.10.166.8.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNAddrTypeEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNAddrTypeEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNAddrType", "1.3.6.1.2.1.10.166.8.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNSourceAddrMinEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNSourceAddrMinEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNSourceAddrMin", "1.3.6.1.2.1.10.166.8.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNSourceAddrMaxEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNSourceAddrMaxEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNSourceAddrMax", "1.3.6.1.2.1.10.166.8.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNDestAddrMinEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNDestAddrMinEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNDestAddrMin", "1.3.6.1.2.1.10.166.8.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNDestAddrMaxEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNDestAddrMaxEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNDestAddrMax", "1.3.6.1.2.1.10.166.8.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNSourcePortMinEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNSourcePortMinEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNSourcePortMin", "1.3.6.1.2.1.10.166.8.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNSourcePortMaxEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNSourcePortMaxEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNSourcePortMax", "1.3.6.1.2.1.10.166.8.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNDestPortMinEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNDestPortMinEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNDestPortMin", "1.3.6.1.2.1.10.166.8.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNDestPortMaxEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNDestPortMaxEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNDestPortMax", "1.3.6.1.2.1.10.166.8.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNProtocolEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNProtocolEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNProtocol", "1.3.6.1.2.1.10.166.8.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNDscpEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNDscpEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNDscp", "1.3.6.1.2.1.10.166.8.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNActionTypeEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNActionTypeEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNActionType", "1.3.6.1.2.1.10.166.8.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNActionPointerEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNActionPointerEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNActionPointer", "1.3.6.1.2.1.10.166.8.1.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNStorageTypeEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNStorageTypeEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNStorageType", "1.3.6.1.2.1.10.166.8.1.3.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsFTNMapTableLastChangedEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                private MplsFTNMapTableLastChangedEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNMapTableLastChanged", "1.3.6.1.2.1.10.166.8.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsFTNMapTableEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                public final MplsFTNMapEntryEnt mplsFTNMapEntry;

                private MplsFTNMapTableEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNMapTable", "1.3.6.1.2.1.10.166.8.1.5", false, true, false, false);
                    this.mplsFTNMapEntry = new MplsFTNMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsFTNMapEntry
                    };
                }
                public static final class MplsFTNMapEntryEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    public final MplsFTNMapIndexEnt mplsFTNMapIndex;

                    public final MplsFTNMapPrevIndexEnt mplsFTNMapPrevIndex;

                    public final MplsFTNMapCurrIndexEnt mplsFTNMapCurrIndex;

                    public final MplsFTNMapRowStatusEnt mplsFTNMapRowStatus;

                    public final MplsFTNMapStorageTypeEnt mplsFTNMapStorageType;

                    private MplsFTNMapEntryEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNMapEntry", "1.3.6.1.2.1.10.166.8.1.5.1", false, false, false, true);
                        this.mplsFTNMapIndex = new MplsFTNMapIndexEnt(mib, this);
                        this.mplsFTNMapPrevIndex = new MplsFTNMapPrevIndexEnt(mib, this);
                        this.mplsFTNMapCurrIndex = new MplsFTNMapCurrIndexEnt(mib, this);
                        this.mplsFTNMapRowStatus = new MplsFTNMapRowStatusEnt(mib, this);
                        this.mplsFTNMapStorageType = new MplsFTNMapStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsFTNMapIndex,
                            this.mplsFTNMapPrevIndex,
                            this.mplsFTNMapCurrIndex,
                            this.mplsFTNMapRowStatus,
                            this.mplsFTNMapStorageType
                        };
                    }
                    public static final class MplsFTNMapIndexEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNMapIndexEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNMapIndex", "1.3.6.1.2.1.10.166.8.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNMapPrevIndexEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNMapPrevIndexEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNMapPrevIndex", "1.3.6.1.2.1.10.166.8.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNMapCurrIndexEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNMapCurrIndexEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNMapCurrIndex", "1.3.6.1.2.1.10.166.8.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNMapRowStatusEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNMapRowStatusEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNMapRowStatus", "1.3.6.1.2.1.10.166.8.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNMapStorageTypeEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNMapStorageTypeEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNMapStorageType", "1.3.6.1.2.1.10.166.8.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsFTNPerfTableEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                public final MplsFTNPerfEntryEnt mplsFTNPerfEntry;

                private MplsFTNPerfTableEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNPerfTable", "1.3.6.1.2.1.10.166.8.1.6", false, true, false, false);
                    this.mplsFTNPerfEntry = new MplsFTNPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsFTNPerfEntry
                    };
                }
                public static final class MplsFTNPerfEntryEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    public final MplsFTNPerfIndexEnt mplsFTNPerfIndex;

                    public final MplsFTNPerfCurrIndexEnt mplsFTNPerfCurrIndex;

                    public final MplsFTNPerfMatchedPacketsEnt mplsFTNPerfMatchedPackets;

                    public final MplsFTNPerfMatchedOctetsEnt mplsFTNPerfMatchedOctets;

                    public final MplsFTNPerfDiscontinuityTimeEnt mplsFTNPerfDiscontinuityTime;

                    private MplsFTNPerfEntryEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNPerfEntry", "1.3.6.1.2.1.10.166.8.1.6.1", false, false, false, true);
                        this.mplsFTNPerfIndex = new MplsFTNPerfIndexEnt(mib, this);
                        this.mplsFTNPerfCurrIndex = new MplsFTNPerfCurrIndexEnt(mib, this);
                        this.mplsFTNPerfMatchedPackets = new MplsFTNPerfMatchedPacketsEnt(mib, this);
                        this.mplsFTNPerfMatchedOctets = new MplsFTNPerfMatchedOctetsEnt(mib, this);
                        this.mplsFTNPerfDiscontinuityTime = new MplsFTNPerfDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsFTNPerfIndex,
                            this.mplsFTNPerfCurrIndex,
                            this.mplsFTNPerfMatchedPackets,
                            this.mplsFTNPerfMatchedOctets,
                            this.mplsFTNPerfDiscontinuityTime
                        };
                    }
                    public static final class MplsFTNPerfIndexEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNPerfIndexEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNPerfIndex", "1.3.6.1.2.1.10.166.8.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNPerfCurrIndexEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNPerfCurrIndexEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNPerfCurrIndex", "1.3.6.1.2.1.10.166.8.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNPerfMatchedPacketsEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNPerfMatchedPacketsEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNPerfMatchedPackets", "1.3.6.1.2.1.10.166.8.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNPerfMatchedOctetsEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNPerfMatchedOctetsEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNPerfMatchedOctets", "1.3.6.1.2.1.10.166.8.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsFTNPerfDiscontinuityTimeEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                    {
                        private MplsFTNPerfDiscontinuityTimeEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsFTNPerfDiscontinuityTime", "1.3.6.1.2.1.10.166.8.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MplsFTNConformanceEnt extends MIBEntry<MPLSFTNSTDMIBDef>
        {
            /** End of mplsFTNPerfTable
Module compliance.
Top level object IDs.*/
            public final MplsFTNGroupsEnt mplsFTNGroups;

            public final MplsFTNCompliancesEnt mplsFTNCompliances;

            private MplsFTNConformanceEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
            {
                super(mib, parent, "mplsFTNConformance", "1.3.6.1.2.1.10.166.8.2", false, false, false, false);
                this.mplsFTNGroups = new MplsFTNGroupsEnt(mib, this);
                this.mplsFTNCompliances = new MplsFTNCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsFTNGroups,
                    this.mplsFTNCompliances
                };
            }
            public static final class MplsFTNGroupsEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                /** Units of conformance.*/
                public final MplsFTNRuleGroupEnt mplsFTNRuleGroup;

                public final MplsFTNMapGroupEnt mplsFTNMapGroup;

                public final MplsFTNPerfGroupEnt mplsFTNPerfGroup;

                private MplsFTNGroupsEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNGroups", "1.3.6.1.2.1.10.166.8.2.1", false, false, false, false);
                    this.mplsFTNRuleGroup = new MplsFTNRuleGroupEnt(mib, this);
                    this.mplsFTNMapGroup = new MplsFTNMapGroupEnt(mib, this);
                    this.mplsFTNPerfGroup = new MplsFTNPerfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsFTNRuleGroup,
                        this.mplsFTNMapGroup,
                        this.mplsFTNPerfGroup
                    };
                }
                public static final class MplsFTNRuleGroupEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    private MplsFTNRuleGroupEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNRuleGroup", "1.3.6.1.2.1.10.166.8.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsFTNMapGroupEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    private MplsFTNMapGroupEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNMapGroup", "1.3.6.1.2.1.10.166.8.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsFTNPerfGroupEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    private MplsFTNPerfGroupEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNPerfGroup", "1.3.6.1.2.1.10.166.8.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsFTNCompliancesEnt extends MIBEntry<MPLSFTNSTDMIBDef>
            {
                /** Compliance requirement for fully compliant implementations.

The Interfaces Group MIB, RFC 2863.*/
                public final MplsFTNModuleFullComplianceEnt mplsFTNModuleFullCompliance;

                /** Compliance requirement for read-only implementations.

The interfaces Group MIB, RFC 2863*/
                public final MplsFTNModuleReadOnlyComplianceEnt mplsFTNModuleReadOnlyCompliance;

                private MplsFTNCompliancesEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsFTNCompliances", "1.3.6.1.2.1.10.166.8.2.2", false, false, false, false);
                    this.mplsFTNModuleFullCompliance = new MplsFTNModuleFullComplianceEnt(mib, this);
                    this.mplsFTNModuleReadOnlyCompliance = new MplsFTNModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsFTNModuleFullCompliance,
                        this.mplsFTNModuleReadOnlyCompliance
                    };
                }
                public static final class MplsFTNModuleFullComplianceEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    private MplsFTNModuleFullComplianceEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNModuleFullCompliance", "1.3.6.1.2.1.10.166.8.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsFTNModuleReadOnlyComplianceEnt extends MIBEntry<MPLSFTNSTDMIBDef>
                {
                    private MplsFTNModuleReadOnlyComplianceEnt(MPLSFTNSTDMIBDef mib, MIBEntry<MPLSFTNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsFTNModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.8.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
