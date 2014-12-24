package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ACCOUNTINGCONTROLMIBDef extends MIB
{
    public static final ACCOUNTINGCONTROLMIBDef ACCOUNTINGCONTROLMIB = new ACCOUNTINGCONTROLMIBDef();

    public final AccountingControlMIBEnt accountingControlMIB;

    private ACCOUNTINGCONTROLMIBDef()
    {
        super("ACCOUNTING-CONTROL-MIB");
        this.accountingControlMIB = new AccountingControlMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.accountingControlMIB
        };
    }

    public static final class AccountingControlMIBEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
    {
        public final AcctngMIBObjectsEnt acctngMIBObjects;

        /** notifications*/
        public final AcctngNotificationsEnt acctngNotifications;

        /** conformance information*/
        public final AcctngConformanceEnt acctngConformance;

        private AccountingControlMIBEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
        {
            super(mib, parent, "accountingControlMIB", "1.3.6.1.2.1.60", false, false, false, false);
            this.acctngMIBObjects = new AcctngMIBObjectsEnt(mib, this);
            this.acctngNotifications = new AcctngNotificationsEnt(mib, this);
            this.acctngConformance = new AcctngConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.acctngMIBObjects,
                this.acctngNotifications,
                this.acctngConformance
            };
        }
        public static final class AcctngMIBObjectsEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
        {
            public final AcctngSelectionControlEnt acctngSelectionControl;

            public final AcctngFileControlEnt acctngFileControl;

            public final AcctngInterfaceControlEnt acctngInterfaceControl;

            public final AcctngTrapControlEnt acctngTrapControl;

            private AcctngMIBObjectsEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
            {
                super(mib, parent, "acctngMIBObjects", "1.3.6.1.2.1.60.1", false, false, false, false);
                this.acctngSelectionControl = new AcctngSelectionControlEnt(mib, this);
                this.acctngFileControl = new AcctngFileControlEnt(mib, this);
                this.acctngInterfaceControl = new AcctngInterfaceControlEnt(mib, this);
                this.acctngTrapControl = new AcctngTrapControlEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.acctngSelectionControl,
                    this.acctngFileControl,
                    this.acctngInterfaceControl,
                    this.acctngTrapControl
                };
            }
            public static final class AcctngSelectionControlEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                /** The Accounting Information Selection table*/
                public final AcctngSelectionTableEnt acctngSelectionTable;

                private AcctngSelectionControlEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngSelectionControl", "1.3.6.1.2.1.60.1.1", false, false, false, false);
                    this.acctngSelectionTable = new AcctngSelectionTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngSelectionTable
                    };
                }
                public static final class AcctngSelectionTableEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    public final AcctngSelectionEntryEnt acctngSelectionEntry;

                    private AcctngSelectionTableEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngSelectionTable", "1.3.6.1.2.1.60.1.1.1", false, true, false, false);
                        this.acctngSelectionEntry = new AcctngSelectionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.acctngSelectionEntry
                        };
                    }
                    public static final class AcctngSelectionEntryEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                    {
                        public final AcctngSelectionIndexEnt acctngSelectionIndex;

                        public final AcctngSelectionSubtreeEnt acctngSelectionSubtree;

                        public final AcctngSelectionListEnt acctngSelectionList;

                        public final AcctngSelectionFileEnt acctngSelectionFile;

                        public final AcctngSelectionTypeEnt acctngSelectionType;

                        public final AcctngSelectionRowStatusEnt acctngSelectionRowStatus;

                        private AcctngSelectionEntryEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "acctngSelectionEntry", "1.3.6.1.2.1.60.1.1.1.1", false, false, false, true);
                            this.acctngSelectionIndex = new AcctngSelectionIndexEnt(mib, this);
                            this.acctngSelectionSubtree = new AcctngSelectionSubtreeEnt(mib, this);
                            this.acctngSelectionList = new AcctngSelectionListEnt(mib, this);
                            this.acctngSelectionFile = new AcctngSelectionFileEnt(mib, this);
                            this.acctngSelectionType = new AcctngSelectionTypeEnt(mib, this);
                            this.acctngSelectionRowStatus = new AcctngSelectionRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.acctngSelectionIndex,
                                this.acctngSelectionSubtree,
                                this.acctngSelectionList,
                                this.acctngSelectionFile,
                                this.acctngSelectionType,
                                this.acctngSelectionRowStatus
                            };
                        }
                        public static final class AcctngSelectionIndexEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngSelectionIndexEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngSelectionIndex", "1.3.6.1.2.1.60.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngSelectionSubtreeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngSelectionSubtreeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngSelectionSubtree", "1.3.6.1.2.1.60.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngSelectionListEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngSelectionListEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngSelectionList", "1.3.6.1.2.1.60.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngSelectionFileEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngSelectionFileEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngSelectionFile", "1.3.6.1.2.1.60.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngSelectionTypeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngSelectionTypeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngSelectionType", "1.3.6.1.2.1.60.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngSelectionRowStatusEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngSelectionRowStatusEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngSelectionRowStatus", "1.3.6.1.2.1.60.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AcctngFileControlEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                /** The Accounting File table*/
                public final AcctngFileTableEnt acctngFileTable;

                private AcctngFileControlEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngFileControl", "1.3.6.1.2.1.60.1.2", false, false, false, false);
                    this.acctngFileTable = new AcctngFileTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngFileTable
                    };
                }
                public static final class AcctngFileTableEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    public final AcctngFileEntryEnt acctngFileEntry;

                    private AcctngFileTableEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngFileTable", "1.3.6.1.2.1.60.1.2.1", false, true, false, false);
                        this.acctngFileEntry = new AcctngFileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.acctngFileEntry
                        };
                    }
                    public static final class AcctngFileEntryEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                    {
                        public final AcctngFileIndexEnt acctngFileIndex;

                        public final AcctngFileNameEnt acctngFileName;

                        public final AcctngFileNameSuffixEnt acctngFileNameSuffix;

                        public final AcctngFileDescriptionEnt acctngFileDescription;

                        public final AcctngFileCommandEnt acctngFileCommand;

                        public final AcctngFileMaximumSizeEnt acctngFileMaximumSize;

                        public final AcctngFileCurrentSizeEnt acctngFileCurrentSize;

                        public final AcctngFileFormatEnt acctngFileFormat;

                        public final AcctngFileCollectModeEnt acctngFileCollectMode;

                        public final AcctngFileCollectFailedAttemptsEnt acctngFileCollectFailedAttempts;

                        public final AcctngFileIntervalEnt acctngFileInterval;

                        public final AcctngFileMinAgeEnt acctngFileMinAge;

                        public final AcctngFileRowStatusEnt acctngFileRowStatus;

                        private AcctngFileEntryEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "acctngFileEntry", "1.3.6.1.2.1.60.1.2.1.1", false, false, false, true);
                            this.acctngFileIndex = new AcctngFileIndexEnt(mib, this);
                            this.acctngFileName = new AcctngFileNameEnt(mib, this);
                            this.acctngFileNameSuffix = new AcctngFileNameSuffixEnt(mib, this);
                            this.acctngFileDescription = new AcctngFileDescriptionEnt(mib, this);
                            this.acctngFileCommand = new AcctngFileCommandEnt(mib, this);
                            this.acctngFileMaximumSize = new AcctngFileMaximumSizeEnt(mib, this);
                            this.acctngFileCurrentSize = new AcctngFileCurrentSizeEnt(mib, this);
                            this.acctngFileFormat = new AcctngFileFormatEnt(mib, this);
                            this.acctngFileCollectMode = new AcctngFileCollectModeEnt(mib, this);
                            this.acctngFileCollectFailedAttempts = new AcctngFileCollectFailedAttemptsEnt(mib, this);
                            this.acctngFileInterval = new AcctngFileIntervalEnt(mib, this);
                            this.acctngFileMinAge = new AcctngFileMinAgeEnt(mib, this);
                            this.acctngFileRowStatus = new AcctngFileRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.acctngFileIndex,
                                this.acctngFileName,
                                this.acctngFileNameSuffix,
                                this.acctngFileDescription,
                                this.acctngFileCommand,
                                this.acctngFileMaximumSize,
                                this.acctngFileCurrentSize,
                                this.acctngFileFormat,
                                this.acctngFileCollectMode,
                                this.acctngFileCollectFailedAttempts,
                                this.acctngFileInterval,
                                this.acctngFileMinAge,
                                this.acctngFileRowStatus
                            };
                        }
                        public static final class AcctngFileIndexEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileIndexEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileIndex", "1.3.6.1.2.1.60.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileNameEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileNameEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileName", "1.3.6.1.2.1.60.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileNameSuffixEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileNameSuffixEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileNameSuffix", "1.3.6.1.2.1.60.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileDescriptionEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileDescriptionEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileDescription", "1.3.6.1.2.1.60.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileCommandEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileCommandEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileCommand", "1.3.6.1.2.1.60.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileMaximumSizeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileMaximumSizeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileMaximumSize", "1.3.6.1.2.1.60.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileCurrentSizeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileCurrentSizeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileCurrentSize", "1.3.6.1.2.1.60.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileFormatEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileFormatEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileFormat", "1.3.6.1.2.1.60.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileCollectModeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileCollectModeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileCollectMode", "1.3.6.1.2.1.60.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileCollectFailedAttemptsEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileCollectFailedAttemptsEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileCollectFailedAttempts", "1.3.6.1.2.1.60.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileIntervalEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileIntervalEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileInterval", "1.3.6.1.2.1.60.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileMinAgeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileMinAgeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileMinAge", "1.3.6.1.2.1.60.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class AcctngFileRowStatusEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngFileRowStatusEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngFileRowStatus", "1.3.6.1.2.1.60.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AcctngInterfaceControlEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                /** Overall Control*/
                public final AcctngAdminStatusEnt acctngAdminStatus;

                public final AcctngOperStatusEnt acctngOperStatus;

                public final AcctngProtectionEnt acctngProtection;

                public final AcctngAgentModeEnt acctngAgentMode;

                /** Per-interface control table*/
                public final AcctngInterfaceTableEnt acctngInterfaceTable;

                private AcctngInterfaceControlEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngInterfaceControl", "1.3.6.1.2.1.60.1.3", false, false, false, false);
                    this.acctngAdminStatus = new AcctngAdminStatusEnt(mib, this);
                    this.acctngOperStatus = new AcctngOperStatusEnt(mib, this);
                    this.acctngProtection = new AcctngProtectionEnt(mib, this);
                    this.acctngAgentMode = new AcctngAgentModeEnt(mib, this);
                    this.acctngInterfaceTable = new AcctngInterfaceTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngAdminStatus,
                        this.acctngOperStatus,
                        this.acctngProtection,
                        this.acctngAgentMode,
                        this.acctngInterfaceTable
                    };
                }
                public static final class AcctngAdminStatusEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngAdminStatusEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngAdminStatus", "1.3.6.1.2.1.60.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngOperStatusEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngOperStatusEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngOperStatus", "1.3.6.1.2.1.60.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngProtectionEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngProtectionEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngProtection", "1.3.6.1.2.1.60.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngAgentModeEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngAgentModeEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngAgentMode", "1.3.6.1.2.1.60.1.3.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngInterfaceTableEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    public final AcctngInterfaceEntryEnt acctngInterfaceEntry;

                    private AcctngInterfaceTableEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngInterfaceTable", "1.3.6.1.2.1.60.1.3.5", false, true, false, false);
                        this.acctngInterfaceEntry = new AcctngInterfaceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.acctngInterfaceEntry
                        };
                    }
                    public static final class AcctngInterfaceEntryEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                    {
                        public final AcctngInterfaceEnableEnt acctngInterfaceEnable;

                        private AcctngInterfaceEntryEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                        {
                            super(mib, parent, "acctngInterfaceEntry", "1.3.6.1.2.1.60.1.3.5.1", false, false, false, true);
                            this.acctngInterfaceEnable = new AcctngInterfaceEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.acctngInterfaceEnable
                            };
                        }
                        public static final class AcctngInterfaceEnableEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                        {
                            private AcctngInterfaceEnableEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                            {
                                super(mib, parent, "acctngInterfaceEnable", "1.3.6.1.2.1.60.1.3.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class AcctngTrapControlEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                /** Objects for controlling the use of Notifications*/
                public final AcctngControlTrapThresholdEnt acctngControlTrapThreshold;

                public final AcctngControlTrapEnableEnt acctngControlTrapEnable;

                private AcctngTrapControlEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngTrapControl", "1.3.6.1.2.1.60.1.4", false, false, false, false);
                    this.acctngControlTrapThreshold = new AcctngControlTrapThresholdEnt(mib, this);
                    this.acctngControlTrapEnable = new AcctngControlTrapEnableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngControlTrapThreshold,
                        this.acctngControlTrapEnable
                    };
                }
                public static final class AcctngControlTrapThresholdEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngControlTrapThresholdEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngControlTrapThreshold", "1.3.6.1.2.1.60.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngControlTrapEnableEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngControlTrapEnableEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngControlTrapEnable", "1.3.6.1.2.1.60.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AcctngNotificationsEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
        {
            public final AcctngNotifyPrefixEnt acctngNotifyPrefix;

            private AcctngNotificationsEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
            {
                super(mib, parent, "acctngNotifications", "1.3.6.1.2.1.60.2", false, false, false, false);
                this.acctngNotifyPrefix = new AcctngNotifyPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.acctngNotifyPrefix
                };
            }
            public static final class AcctngNotifyPrefixEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                public final AcctngFileNearlyFullEnt acctngFileNearlyFull;

                public final AcctngFileFullEnt acctngFileFull;

                private AcctngNotifyPrefixEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngNotifyPrefix", "1.3.6.1.2.1.60.2.0", false, false, false, false);
                    this.acctngFileNearlyFull = new AcctngFileNearlyFullEnt(mib, this);
                    this.acctngFileFull = new AcctngFileFullEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngFileNearlyFull,
                        this.acctngFileFull
                    };
                }
                public static final class AcctngFileNearlyFullEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngFileNearlyFullEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngFileNearlyFull", "1.3.6.1.2.1.60.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngFileFullEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngFileFullEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngFileFull", "1.3.6.1.2.1.60.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class AcctngConformanceEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
        {
            public final AcctngGroupsEnt acctngGroups;

            public final AcctngCompliancesEnt acctngCompliances;

            private AcctngConformanceEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
            {
                super(mib, parent, "acctngConformance", "1.3.6.1.2.1.60.3", false, false, false, false);
                this.acctngGroups = new AcctngGroupsEnt(mib, this);
                this.acctngCompliances = new AcctngCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.acctngGroups,
                    this.acctngCompliances
                };
            }
            public static final class AcctngGroupsEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                /** units of conformance*/
                public final AcctngBasicGroupEnt acctngBasicGroup;

                public final AcctngNotificationsGroupEnt acctngNotificationsGroup;

                private AcctngGroupsEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngGroups", "1.3.6.1.2.1.60.3.1", false, false, false, false);
                    this.acctngBasicGroup = new AcctngBasicGroupEnt(mib, this);
                    this.acctngNotificationsGroup = new AcctngNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngBasicGroup,
                        this.acctngNotificationsGroup
                    };
                }
                public static final class AcctngBasicGroupEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngBasicGroupEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngBasicGroup", "1.3.6.1.2.1.60.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AcctngNotificationsGroupEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngNotificationsGroupEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngNotificationsGroup", "1.3.6.1.2.1.60.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class AcctngCompliancesEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
            {
                public final AcctngComplianceEnt acctngCompliance;

                private AcctngCompliancesEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                {
                    super(mib, parent, "acctngCompliances", "1.3.6.1.2.1.60.3.2", false, false, false, false);
                    this.acctngCompliance = new AcctngComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.acctngCompliance
                    };
                }
                public static final class AcctngComplianceEnt extends MIBEntry<ACCOUNTINGCONTROLMIBDef>
                {
                    private AcctngComplianceEnt(ACCOUNTINGCONTROLMIBDef mib, MIBEntry<ACCOUNTINGCONTROLMIBDef> parent)
                    {
                        super(mib, parent, "acctngCompliance", "1.3.6.1.2.1.60.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
