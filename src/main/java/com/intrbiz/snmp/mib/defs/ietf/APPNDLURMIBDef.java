package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**end of conformance statement*/
public final class APPNDLURMIBDef extends MIB
{
    public static final APPNDLURMIBDef APPNDLURMIB = new APPNDLURMIBDef();

    public final DlurMIBEnt dlurMIB;

    private APPNDLURMIBDef()
    {
        super("APPN-DLUR-MIB");
        this.dlurMIB = new DlurMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dlurMIB
        };
    }

    public static final class DlurMIBEnt extends MIBEntry<APPNDLURMIBDef>
    {
        /** snanauMIB ::= { mib-2 34 }
*********************************************************************Textual Convention*********************************************************************SnaControlPointName is imported from the APPN MIB
**********************************************************************/
        public final DlurObjectsEnt dlurObjects;

        /** ***************************************************************Conformance information****************************************************************/
        public final DlurConformanceEnt dlurConformance;

        private DlurMIBEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
        {
            super(mib, parent, "dlurMIB", "1.3.6.1.2.1.34.5", false, false, false, false);
            this.dlurObjects = new DlurObjectsEnt(mib, this);
            this.dlurConformance = new DlurConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dlurObjects,
                this.dlurConformance
            };
        }
        public static final class DlurObjectsEnt extends MIBEntry<APPNDLURMIBDef>
        {
            /** **********************************************************************/
            public final DlurNodeInfoEnt dlurNodeInfo;

            /** *********************************************************************PU InformationThe following table carries information about the PUs that this APPNnode is supporting via DLUR.
**********************************************************************/
            public final DlurPuInfoEnt dlurPuInfo;

            /** *********************************************************************DLUS Control Sessions (CPSVRMGR Pipes)This table contains information about DLUS control sessions, alsoknown as CPSVRMGR pipes.  Although DLUR uses a pair of CPSVRMGRsessions for communication, for the purpose of status, informationabout these two sessions is combined to yield a single status for therequester/server connection.
**********************************************************************/
            public final DlurDlusInfoEnt dlurDlusInfo;

            private DlurObjectsEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
            {
                super(mib, parent, "dlurObjects", "1.3.6.1.2.1.34.5.1", false, false, false, false);
                this.dlurNodeInfo = new DlurNodeInfoEnt(mib, this);
                this.dlurPuInfo = new DlurPuInfoEnt(mib, this);
                this.dlurDlusInfo = new DlurDlusInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dlurNodeInfo,
                    this.dlurPuInfo,
                    this.dlurDlusInfo
                };
            }
            public static final class DlurNodeInfoEnt extends MIBEntry<APPNDLURMIBDef>
            {
                /** *********************************************************************DLUR Capabilities of the nodeThis group represents the capabilities and options of the DLURimplementation.**********************************************************************/
                public final DlurNodeCapabilitiesEnt dlurNodeCapabilities;

                /** *********************************************************************DLUR default defined backup DLUS table**********************************************************************/
                public final DlurDefaultDefBackupDlusTableEnt dlurDefaultDefBackupDlusTable;

                private DlurNodeInfoEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                {
                    super(mib, parent, "dlurNodeInfo", "1.3.6.1.2.1.34.5.1.1", false, false, false, false);
                    this.dlurNodeCapabilities = new DlurNodeCapabilitiesEnt(mib, this);
                    this.dlurDefaultDefBackupDlusTable = new DlurDefaultDefBackupDlusTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlurNodeCapabilities,
                        this.dlurDefaultDefBackupDlusTable
                    };
                }
                public static final class DlurNodeCapabilitiesEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    public final DlurNodeCpNameEnt dlurNodeCpName;

                    public final DlurReleaseLevelEnt dlurReleaseLevel;

                    public final DlurAnsSupportEnt dlurAnsSupport;

                    public final DlurMultiSubnetSupportEnt dlurMultiSubnetSupport;

                    public final DlurDefaultDefPrimDlusNameEnt dlurDefaultDefPrimDlusName;

                    public final DlurNetworkNameForwardingSupportEnt dlurNetworkNameForwardingSupport;

                    public final DlurNondisDlusDlurSessDeactSupEnt dlurNondisDlusDlurSessDeactSup;

                    private DlurNodeCapabilitiesEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurNodeCapabilities", "1.3.6.1.2.1.34.5.1.1.1", false, false, false, false);
                        this.dlurNodeCpName = new DlurNodeCpNameEnt(mib, this);
                        this.dlurReleaseLevel = new DlurReleaseLevelEnt(mib, this);
                        this.dlurAnsSupport = new DlurAnsSupportEnt(mib, this);
                        this.dlurMultiSubnetSupport = new DlurMultiSubnetSupportEnt(mib, this);
                        this.dlurDefaultDefPrimDlusName = new DlurDefaultDefPrimDlusNameEnt(mib, this);
                        this.dlurNetworkNameForwardingSupport = new DlurNetworkNameForwardingSupportEnt(mib, this);
                        this.dlurNondisDlusDlurSessDeactSup = new DlurNondisDlusDlurSessDeactSupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlurNodeCpName,
                            this.dlurReleaseLevel,
                            this.dlurAnsSupport,
                            this.dlurMultiSubnetSupport,
                            this.dlurDefaultDefPrimDlusName,
                            this.dlurNetworkNameForwardingSupport,
                            this.dlurNondisDlusDlurSessDeactSup
                        };
                    }
                    public static final class DlurNodeCpNameEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurNodeCpNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurNodeCpName", "1.3.6.1.2.1.34.5.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlurReleaseLevelEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurReleaseLevelEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurReleaseLevel", "1.3.6.1.2.1.34.5.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlurAnsSupportEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurAnsSupportEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurAnsSupport", "1.3.6.1.2.1.34.5.1.1.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlurMultiSubnetSupportEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurMultiSubnetSupportEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurMultiSubnetSupport", "1.3.6.1.2.1.34.5.1.1.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlurDefaultDefPrimDlusNameEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurDefaultDefPrimDlusNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurDefaultDefPrimDlusName", "1.3.6.1.2.1.34.5.1.1.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlurNetworkNameForwardingSupportEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurNetworkNameForwardingSupportEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurNetworkNameForwardingSupport", "1.3.6.1.2.1.34.5.1.1.1.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DlurNondisDlusDlurSessDeactSupEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        private DlurNondisDlusDlurSessDeactSupEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurNondisDlusDlurSessDeactSup", "1.3.6.1.2.1.34.5.1.1.1.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class DlurDefaultDefBackupDlusTableEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    public final DlurDefaultDefBackupDlusEntryEnt dlurDefaultDefBackupDlusEntry;

                    private DlurDefaultDefBackupDlusTableEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurDefaultDefBackupDlusTable", "1.3.6.1.2.1.34.5.1.1.2", false, true, false, false);
                        this.dlurDefaultDefBackupDlusEntry = new DlurDefaultDefBackupDlusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlurDefaultDefBackupDlusEntry
                        };
                    }
                    public static final class DlurDefaultDefBackupDlusEntryEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        public final DlurDefaultDefBackupDlusIndexEnt dlurDefaultDefBackupDlusIndex;

                        public final DlurDefaultDefBackupDlusNameEnt dlurDefaultDefBackupDlusName;

                        private DlurDefaultDefBackupDlusEntryEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurDefaultDefBackupDlusEntry", "1.3.6.1.2.1.34.5.1.1.2.1", false, false, false, true);
                            this.dlurDefaultDefBackupDlusIndex = new DlurDefaultDefBackupDlusIndexEnt(mib, this);
                            this.dlurDefaultDefBackupDlusName = new DlurDefaultDefBackupDlusNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlurDefaultDefBackupDlusIndex,
                                this.dlurDefaultDefBackupDlusName
                            };
                        }
                        public static final class DlurDefaultDefBackupDlusIndexEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurDefaultDefBackupDlusIndexEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurDefaultDefBackupDlusIndex", "1.3.6.1.2.1.34.5.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurDefaultDefBackupDlusNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurDefaultDefBackupDlusNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurDefaultDefBackupDlusName", "1.3.6.1.2.1.34.5.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DlurPuInfoEnt extends MIBEntry<APPNDLURMIBDef>
            {
                public final DlurPuTableEnt dlurPuTable;

                /** *****************************************Defined backup DLUS table for a PU******************************************/
                public final DlurPuDefBackupDlusTableEnt dlurPuDefBackupDlusTable;

                private DlurPuInfoEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                {
                    super(mib, parent, "dlurPuInfo", "1.3.6.1.2.1.34.5.1.2", false, false, false, false);
                    this.dlurPuTable = new DlurPuTableEnt(mib, this);
                    this.dlurPuDefBackupDlusTable = new DlurPuDefBackupDlusTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlurPuTable,
                        this.dlurPuDefBackupDlusTable
                    };
                }
                public static final class DlurPuTableEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    public final DlurPuEntryEnt dlurPuEntry;

                    private DlurPuTableEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurPuTable", "1.3.6.1.2.1.34.5.1.2.1", false, true, false, false);
                        this.dlurPuEntry = new DlurPuEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlurPuEntry
                        };
                    }
                    public static final class DlurPuEntryEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        public final DlurPuNameEnt dlurPuName;

                        public final DlurPuSscpSuppliedNameEnt dlurPuSscpSuppliedName;

                        public final DlurPuStatusEnt dlurPuStatus;

                        public final DlurPuAnsSupportEnt dlurPuAnsSupport;

                        public final DlurPuLocationEnt dlurPuLocation;

                        public final DlurPuLsNameEnt dlurPuLsName;

                        public final DlurPuDlusSessnStatusEnt dlurPuDlusSessnStatus;

                        public final DlurPuActiveDlusNameEnt dlurPuActiveDlusName;

                        public final DlurPuDefPrimDlusNameEnt dlurPuDefPrimDlusName;

                        private DlurPuEntryEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurPuEntry", "1.3.6.1.2.1.34.5.1.2.1.1", false, false, false, true);
                            this.dlurPuName = new DlurPuNameEnt(mib, this);
                            this.dlurPuSscpSuppliedName = new DlurPuSscpSuppliedNameEnt(mib, this);
                            this.dlurPuStatus = new DlurPuStatusEnt(mib, this);
                            this.dlurPuAnsSupport = new DlurPuAnsSupportEnt(mib, this);
                            this.dlurPuLocation = new DlurPuLocationEnt(mib, this);
                            this.dlurPuLsName = new DlurPuLsNameEnt(mib, this);
                            this.dlurPuDlusSessnStatus = new DlurPuDlusSessnStatusEnt(mib, this);
                            this.dlurPuActiveDlusName = new DlurPuActiveDlusNameEnt(mib, this);
                            this.dlurPuDefPrimDlusName = new DlurPuDefPrimDlusNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlurPuName,
                                this.dlurPuSscpSuppliedName,
                                this.dlurPuStatus,
                                this.dlurPuAnsSupport,
                                this.dlurPuLocation,
                                this.dlurPuLsName,
                                this.dlurPuDlusSessnStatus,
                                this.dlurPuActiveDlusName,
                                this.dlurPuDefPrimDlusName
                            };
                        }
                        public static final class DlurPuNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuName", "1.3.6.1.2.1.34.5.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuSscpSuppliedNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuSscpSuppliedNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuSscpSuppliedName", "1.3.6.1.2.1.34.5.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuStatusEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuStatusEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuStatus", "1.3.6.1.2.1.34.5.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuAnsSupportEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuAnsSupportEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuAnsSupport", "1.3.6.1.2.1.34.5.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuLocationEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuLocationEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuLocation", "1.3.6.1.2.1.34.5.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuLsNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuLsNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuLsName", "1.3.6.1.2.1.34.5.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuDlusSessnStatusEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuDlusSessnStatusEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuDlusSessnStatus", "1.3.6.1.2.1.34.5.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuActiveDlusNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuActiveDlusNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuActiveDlusName", "1.3.6.1.2.1.34.5.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuDefPrimDlusNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuDefPrimDlusNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuDefPrimDlusName", "1.3.6.1.2.1.34.5.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DlurPuDefBackupDlusTableEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    public final DlurPuDefBackupDlusEntryEnt dlurPuDefBackupDlusEntry;

                    private DlurPuDefBackupDlusTableEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurPuDefBackupDlusTable", "1.3.6.1.2.1.34.5.1.2.2", false, true, false, false);
                        this.dlurPuDefBackupDlusEntry = new DlurPuDefBackupDlusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlurPuDefBackupDlusEntry
                        };
                    }
                    public static final class DlurPuDefBackupDlusEntryEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        public final DlurPuDefBackupDlusPuNameEnt dlurPuDefBackupDlusPuName;

                        public final DlurPuDefBackupDlusIndexEnt dlurPuDefBackupDlusIndex;

                        public final DlurPuDefBackupDlusNameEnt dlurPuDefBackupDlusName;

                        private DlurPuDefBackupDlusEntryEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurPuDefBackupDlusEntry", "1.3.6.1.2.1.34.5.1.2.2.1", false, false, false, true);
                            this.dlurPuDefBackupDlusPuName = new DlurPuDefBackupDlusPuNameEnt(mib, this);
                            this.dlurPuDefBackupDlusIndex = new DlurPuDefBackupDlusIndexEnt(mib, this);
                            this.dlurPuDefBackupDlusName = new DlurPuDefBackupDlusNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlurPuDefBackupDlusPuName,
                                this.dlurPuDefBackupDlusIndex,
                                this.dlurPuDefBackupDlusName
                            };
                        }
                        public static final class DlurPuDefBackupDlusPuNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuDefBackupDlusPuNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuDefBackupDlusPuName", "1.3.6.1.2.1.34.5.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuDefBackupDlusIndexEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuDefBackupDlusIndexEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuDefBackupDlusIndex", "1.3.6.1.2.1.34.5.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurPuDefBackupDlusNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurPuDefBackupDlusNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurPuDefBackupDlusName", "1.3.6.1.2.1.34.5.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DlurDlusInfoEnt extends MIBEntry<APPNDLURMIBDef>
            {
                public final DlurDlusTableEnt dlurDlusTable;

                private DlurDlusInfoEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                {
                    super(mib, parent, "dlurDlusInfo", "1.3.6.1.2.1.34.5.1.3", false, false, false, false);
                    this.dlurDlusTable = new DlurDlusTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlurDlusTable
                    };
                }
                public static final class DlurDlusTableEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    public final DlurDlusEntryEnt dlurDlusEntry;

                    private DlurDlusTableEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurDlusTable", "1.3.6.1.2.1.34.5.1.3.1", false, true, false, false);
                        this.dlurDlusEntry = new DlurDlusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dlurDlusEntry
                        };
                    }
                    public static final class DlurDlusEntryEnt extends MIBEntry<APPNDLURMIBDef>
                    {
                        public final DlurDlusNameEnt dlurDlusName;

                        public final DlurDlusSessnStatusEnt dlurDlusSessnStatus;

                        private DlurDlusEntryEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                        {
                            super(mib, parent, "dlurDlusEntry", "1.3.6.1.2.1.34.5.1.3.1.1", false, false, false, true);
                            this.dlurDlusName = new DlurDlusNameEnt(mib, this);
                            this.dlurDlusSessnStatus = new DlurDlusSessnStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dlurDlusName,
                                this.dlurDlusSessnStatus
                            };
                        }
                        public static final class DlurDlusNameEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurDlusNameEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurDlusName", "1.3.6.1.2.1.34.5.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DlurDlusSessnStatusEnt extends MIBEntry<APPNDLURMIBDef>
                        {
                            private DlurDlusSessnStatusEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                            {
                                super(mib, parent, "dlurDlusSessnStatus", "1.3.6.1.2.1.34.5.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DlurConformanceEnt extends MIBEntry<APPNDLURMIBDef>
        {
            public final DlurCompliancesEnt dlurCompliances;

            public final DlurGroupsEnt dlurGroups;

            private DlurConformanceEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
            {
                super(mib, parent, "dlurConformance", "1.3.6.1.2.1.34.5.2", false, false, false, false);
                this.dlurCompliances = new DlurCompliancesEnt(mib, this);
                this.dlurGroups = new DlurGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dlurCompliances,
                    this.dlurGroups
                };
            }
            public static final class DlurCompliancesEnt extends MIBEntry<APPNDLURMIBDef>
            {
                /** Compliance statements*/
                public final DlurComplianceEnt dlurCompliance;

                private DlurCompliancesEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                {
                    super(mib, parent, "dlurCompliances", "1.3.6.1.2.1.34.5.2.1", false, false, false, false);
                    this.dlurCompliance = new DlurComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlurCompliance
                    };
                }
                public static final class DlurComplianceEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    private DlurComplianceEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurCompliance", "1.3.6.1.2.1.34.5.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DlurGroupsEnt extends MIBEntry<APPNDLURMIBDef>
            {
                /** Units of conformance*/
                public final DlurConfGroupEnt dlurConfGroup;

                private DlurGroupsEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                {
                    super(mib, parent, "dlurGroups", "1.3.6.1.2.1.34.5.2.2", false, false, false, false);
                    this.dlurConfGroup = new DlurConfGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dlurConfGroup
                    };
                }
                public static final class DlurConfGroupEnt extends MIBEntry<APPNDLURMIBDef>
                {
                    private DlurConfGroupEnt(APPNDLURMIBDef mib, MIBEntry<APPNDLURMIBDef> parent)
                    {
                        super(mib, parent, "dlurConfGroup", "1.3.6.1.2.1.34.5.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
