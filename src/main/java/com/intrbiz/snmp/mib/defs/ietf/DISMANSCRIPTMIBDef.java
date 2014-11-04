package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DISMANSCRIPTMIBDef extends MIB
{
    public static final DISMANSCRIPTMIBDef DISMANSCRIPTMIB = new DISMANSCRIPTMIBDef();

    static { MIBs.getInstance().registerMIB(DISMANSCRIPTMIBDef.DISMANSCRIPTMIB); }

    public final ScriptMIBEnt scriptMIB;

    private DISMANSCRIPTMIBDef()
    {
        super("DISMAN-SCRIPT-MIB");
        this.scriptMIB = new ScriptMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.scriptMIB
        };
    }

    public static final class ScriptMIBEnt extends MIBEntry<DISMANSCRIPTMIBDef>
    {
        /** The groups defined within this MIB module:*/
        public final SmObjectsEnt smObjects;

        public final SmNotificationsEnt smNotifications;

        public final SmConformanceEnt smConformance;

        private ScriptMIBEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
        {
            super(mib, parent, "scriptMIB", "1.3.6.1.2.1.64", false, false, false, false);
            this.smObjects = new SmObjectsEnt(mib, this);
            this.smNotifications = new SmNotificationsEnt(mib, this);
            this.smConformance = new SmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.smObjects,
                this.smNotifications,
                this.smConformance
            };
        }
        public static final class SmObjectsEnt extends MIBEntry<DISMANSCRIPTMIBDef>
        {
            /** Script language and language extensions.This group defines tables which list the languages and thelanguage extensions supported by a Script MIB implementation.Languages are uniquely identified by object identifier values.*/
            public final SmLangTableEnt smLangTable;

            public final SmExtsnTableEnt smExtsnTable;

            /** Scripts known by the Script MIB implementation.This group defines a table which lists all known scripts.Scripts can be added and removed through manipulation of thesmScriptTable.*/
            public final SmScriptObjectsEnt smScriptObjects;

            /** Script execution.This group defines tables which allow script execution to beinitiated, suspended, resumed, and terminated.  It also providesa mechanism for keeping a history of recent script executionsand their results.*/
            public final SmRunObjectsEnt smRunObjects;

            private SmObjectsEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
            {
                super(mib, parent, "smObjects", "1.3.6.1.2.1.64.1", false, false, false, false);
                this.smLangTable = new SmLangTableEnt(mib, this);
                this.smExtsnTable = new SmExtsnTableEnt(mib, this);
                this.smScriptObjects = new SmScriptObjectsEnt(mib, this);
                this.smRunObjects = new SmRunObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.smLangTable,
                    this.smExtsnTable,
                    this.smScriptObjects,
                    this.smRunObjects
                };
            }
            public static final class SmLangTableEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                public final SmLangEntryEnt smLangEntry;

                private SmLangTableEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smLangTable", "1.3.6.1.2.1.64.1.1", false, true, false, false);
                    this.smLangEntry = new SmLangEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smLangEntry
                    };
                }
                public static final class SmLangEntryEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    public final SmLangIndexEnt smLangIndex;

                    public final SmLangLanguageEnt smLangLanguage;

                    public final SmLangVersionEnt smLangVersion;

                    public final SmLangVendorEnt smLangVendor;

                    public final SmLangRevisionEnt smLangRevision;

                    public final SmLangDescrEnt smLangDescr;

                    private SmLangEntryEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smLangEntry", "1.3.6.1.2.1.64.1.1.1", false, false, false, true);
                        this.smLangIndex = new SmLangIndexEnt(mib, this);
                        this.smLangLanguage = new SmLangLanguageEnt(mib, this);
                        this.smLangVersion = new SmLangVersionEnt(mib, this);
                        this.smLangVendor = new SmLangVendorEnt(mib, this);
                        this.smLangRevision = new SmLangRevisionEnt(mib, this);
                        this.smLangDescr = new SmLangDescrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smLangIndex,
                            this.smLangLanguage,
                            this.smLangVersion,
                            this.smLangVendor,
                            this.smLangRevision,
                            this.smLangDescr
                        };
                    }
                    public static final class SmLangIndexEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmLangIndexEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLangIndex", "1.3.6.1.2.1.64.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmLangLanguageEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmLangLanguageEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLangLanguage", "1.3.6.1.2.1.64.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmLangVersionEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmLangVersionEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLangVersion", "1.3.6.1.2.1.64.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmLangVendorEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmLangVendorEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLangVendor", "1.3.6.1.2.1.64.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmLangRevisionEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmLangRevisionEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLangRevision", "1.3.6.1.2.1.64.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmLangDescrEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmLangDescrEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLangDescr", "1.3.6.1.2.1.64.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SmExtsnTableEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                public final SmExtsnEntryEnt smExtsnEntry;

                private SmExtsnTableEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smExtsnTable", "1.3.6.1.2.1.64.1.2", false, true, false, false);
                    this.smExtsnEntry = new SmExtsnEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smExtsnEntry
                    };
                }
                public static final class SmExtsnEntryEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    public final SmExtsnIndexEnt smExtsnIndex;

                    public final SmExtsnExtensionEnt smExtsnExtension;

                    public final SmExtsnVersionEnt smExtsnVersion;

                    public final SmExtsnVendorEnt smExtsnVendor;

                    public final SmExtsnRevisionEnt smExtsnRevision;

                    public final SmExtsnDescrEnt smExtsnDescr;

                    private SmExtsnEntryEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smExtsnEntry", "1.3.6.1.2.1.64.1.2.1", false, false, false, true);
                        this.smExtsnIndex = new SmExtsnIndexEnt(mib, this);
                        this.smExtsnExtension = new SmExtsnExtensionEnt(mib, this);
                        this.smExtsnVersion = new SmExtsnVersionEnt(mib, this);
                        this.smExtsnVendor = new SmExtsnVendorEnt(mib, this);
                        this.smExtsnRevision = new SmExtsnRevisionEnt(mib, this);
                        this.smExtsnDescr = new SmExtsnDescrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smExtsnIndex,
                            this.smExtsnExtension,
                            this.smExtsnVersion,
                            this.smExtsnVendor,
                            this.smExtsnRevision,
                            this.smExtsnDescr
                        };
                    }
                    public static final class SmExtsnIndexEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmExtsnIndexEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smExtsnIndex", "1.3.6.1.2.1.64.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmExtsnExtensionEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmExtsnExtensionEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smExtsnExtension", "1.3.6.1.2.1.64.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmExtsnVersionEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmExtsnVersionEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smExtsnVersion", "1.3.6.1.2.1.64.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmExtsnVendorEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmExtsnVendorEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smExtsnVendor", "1.3.6.1.2.1.64.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmExtsnRevisionEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmExtsnRevisionEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smExtsnRevision", "1.3.6.1.2.1.64.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SmExtsnDescrEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        private SmExtsnDescrEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smExtsnDescr", "1.3.6.1.2.1.64.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SmScriptObjectsEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                public final SmScriptTableEnt smScriptTable;

                /** Access to script code via SNMPThe smCodeTable allows script code to be read and modifiedvia SNMP.*/
                public final SmCodeTableEnt smCodeTable;

                private SmScriptObjectsEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smScriptObjects", "1.3.6.1.2.1.64.1.3", false, false, false, false);
                    this.smScriptTable = new SmScriptTableEnt(mib, this);
                    this.smCodeTable = new SmCodeTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smScriptTable,
                        this.smCodeTable
                    };
                }
                public static final class SmScriptTableEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    public final SmScriptEntryEnt smScriptEntry;

                    private SmScriptTableEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smScriptTable", "1.3.6.1.2.1.64.1.3.1", false, true, false, false);
                        this.smScriptEntry = new SmScriptEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smScriptEntry
                        };
                    }
                    public static final class SmScriptEntryEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        public final SmScriptOwnerEnt smScriptOwner;

                        public final SmScriptNameEnt smScriptName;

                        public final SmScriptDescrEnt smScriptDescr;

                        public final SmScriptLanguageEnt smScriptLanguage;

                        public final SmScriptSourceEnt smScriptSource;

                        public final SmScriptAdminStatusEnt smScriptAdminStatus;

                        public final SmScriptOperStatusEnt smScriptOperStatus;

                        public final SmScriptStorageTypeEnt smScriptStorageType;

                        public final SmScriptRowStatusEnt smScriptRowStatus;

                        public final SmScriptErrorEnt smScriptError;

                        public final SmScriptLastChangeEnt smScriptLastChange;

                        private SmScriptEntryEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smScriptEntry", "1.3.6.1.2.1.64.1.3.1.1", false, false, false, true);
                            this.smScriptOwner = new SmScriptOwnerEnt(mib, this);
                            this.smScriptName = new SmScriptNameEnt(mib, this);
                            this.smScriptDescr = new SmScriptDescrEnt(mib, this);
                            this.smScriptLanguage = new SmScriptLanguageEnt(mib, this);
                            this.smScriptSource = new SmScriptSourceEnt(mib, this);
                            this.smScriptAdminStatus = new SmScriptAdminStatusEnt(mib, this);
                            this.smScriptOperStatus = new SmScriptOperStatusEnt(mib, this);
                            this.smScriptStorageType = new SmScriptStorageTypeEnt(mib, this);
                            this.smScriptRowStatus = new SmScriptRowStatusEnt(mib, this);
                            this.smScriptError = new SmScriptErrorEnt(mib, this);
                            this.smScriptLastChange = new SmScriptLastChangeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smScriptOwner,
                                this.smScriptName,
                                this.smScriptDescr,
                                this.smScriptLanguage,
                                this.smScriptSource,
                                this.smScriptAdminStatus,
                                this.smScriptOperStatus,
                                this.smScriptStorageType,
                                this.smScriptRowStatus,
                                this.smScriptError,
                                this.smScriptLastChange
                            };
                        }
                        public static final class SmScriptOwnerEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptOwnerEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptOwner", "1.3.6.1.2.1.64.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptNameEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptNameEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptName", "1.3.6.1.2.1.64.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptDescrEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptDescrEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptDescr", "1.3.6.1.2.1.64.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptLanguageEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptLanguageEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptLanguage", "1.3.6.1.2.1.64.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptSourceEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptSourceEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptSource", "1.3.6.1.2.1.64.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptAdminStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptAdminStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptAdminStatus", "1.3.6.1.2.1.64.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptOperStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptOperStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptOperStatus", "1.3.6.1.2.1.64.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptStorageTypeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptStorageTypeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptStorageType", "1.3.6.1.2.1.64.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptRowStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptRowStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptRowStatus", "1.3.6.1.2.1.64.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptErrorEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptErrorEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptError", "1.3.6.1.2.1.64.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmScriptLastChangeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmScriptLastChangeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smScriptLastChange", "1.3.6.1.2.1.64.1.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SmCodeTableEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    public final SmCodeEntryEnt smCodeEntry;

                    private SmCodeTableEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smCodeTable", "1.3.6.1.2.1.64.1.3.2", false, true, false, false);
                        this.smCodeEntry = new SmCodeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smCodeEntry
                        };
                    }
                    public static final class SmCodeEntryEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        public final SmCodeIndexEnt smCodeIndex;

                        public final SmCodeTextEnt smCodeText;

                        public final SmCodeRowStatusEnt smCodeRowStatus;

                        private SmCodeEntryEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smCodeEntry", "1.3.6.1.2.1.64.1.3.2.1", false, false, false, true);
                            this.smCodeIndex = new SmCodeIndexEnt(mib, this);
                            this.smCodeText = new SmCodeTextEnt(mib, this);
                            this.smCodeRowStatus = new SmCodeRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smCodeIndex,
                                this.smCodeText,
                                this.smCodeRowStatus
                            };
                        }
                        public static final class SmCodeIndexEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmCodeIndexEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smCodeIndex", "1.3.6.1.2.1.64.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmCodeTextEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmCodeTextEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smCodeText", "1.3.6.1.2.1.64.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmCodeRowStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmCodeRowStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smCodeRowStatus", "1.3.6.1.2.1.64.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SmRunObjectsEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                public final SmLaunchTableEnt smLaunchTable;

                public final SmRunTableEnt smRunTable;

                private SmRunObjectsEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smRunObjects", "1.3.6.1.2.1.64.1.4", false, false, false, false);
                    this.smLaunchTable = new SmLaunchTableEnt(mib, this);
                    this.smRunTable = new SmRunTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smLaunchTable,
                        this.smRunTable
                    };
                }
                public static final class SmLaunchTableEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    public final SmLaunchEntryEnt smLaunchEntry;

                    private SmLaunchTableEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smLaunchTable", "1.3.6.1.2.1.64.1.4.1", false, true, false, false);
                        this.smLaunchEntry = new SmLaunchEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smLaunchEntry
                        };
                    }
                    public static final class SmLaunchEntryEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        public final SmLaunchOwnerEnt smLaunchOwner;

                        public final SmLaunchNameEnt smLaunchName;

                        public final SmLaunchScriptOwnerEnt smLaunchScriptOwner;

                        public final SmLaunchScriptNameEnt smLaunchScriptName;

                        public final SmLaunchArgumentEnt smLaunchArgument;

                        public final SmLaunchMaxRunningEnt smLaunchMaxRunning;

                        public final SmLaunchMaxCompletedEnt smLaunchMaxCompleted;

                        public final SmLaunchLifeTimeEnt smLaunchLifeTime;

                        public final SmLaunchExpireTimeEnt smLaunchExpireTime;

                        public final SmLaunchStartEnt smLaunchStart;

                        public final SmLaunchControlEnt smLaunchControl;

                        public final SmLaunchAdminStatusEnt smLaunchAdminStatus;

                        public final SmLaunchOperStatusEnt smLaunchOperStatus;

                        public final SmLaunchRunIndexNextEnt smLaunchRunIndexNext;

                        public final SmLaunchStorageTypeEnt smLaunchStorageType;

                        public final SmLaunchRowStatusEnt smLaunchRowStatus;

                        public final SmLaunchErrorEnt smLaunchError;

                        public final SmLaunchLastChangeEnt smLaunchLastChange;

                        public final SmLaunchRowExpireTimeEnt smLaunchRowExpireTime;

                        private SmLaunchEntryEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smLaunchEntry", "1.3.6.1.2.1.64.1.4.1.1", false, false, false, true);
                            this.smLaunchOwner = new SmLaunchOwnerEnt(mib, this);
                            this.smLaunchName = new SmLaunchNameEnt(mib, this);
                            this.smLaunchScriptOwner = new SmLaunchScriptOwnerEnt(mib, this);
                            this.smLaunchScriptName = new SmLaunchScriptNameEnt(mib, this);
                            this.smLaunchArgument = new SmLaunchArgumentEnt(mib, this);
                            this.smLaunchMaxRunning = new SmLaunchMaxRunningEnt(mib, this);
                            this.smLaunchMaxCompleted = new SmLaunchMaxCompletedEnt(mib, this);
                            this.smLaunchLifeTime = new SmLaunchLifeTimeEnt(mib, this);
                            this.smLaunchExpireTime = new SmLaunchExpireTimeEnt(mib, this);
                            this.smLaunchStart = new SmLaunchStartEnt(mib, this);
                            this.smLaunchControl = new SmLaunchControlEnt(mib, this);
                            this.smLaunchAdminStatus = new SmLaunchAdminStatusEnt(mib, this);
                            this.smLaunchOperStatus = new SmLaunchOperStatusEnt(mib, this);
                            this.smLaunchRunIndexNext = new SmLaunchRunIndexNextEnt(mib, this);
                            this.smLaunchStorageType = new SmLaunchStorageTypeEnt(mib, this);
                            this.smLaunchRowStatus = new SmLaunchRowStatusEnt(mib, this);
                            this.smLaunchError = new SmLaunchErrorEnt(mib, this);
                            this.smLaunchLastChange = new SmLaunchLastChangeEnt(mib, this);
                            this.smLaunchRowExpireTime = new SmLaunchRowExpireTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smLaunchOwner,
                                this.smLaunchName,
                                this.smLaunchScriptOwner,
                                this.smLaunchScriptName,
                                this.smLaunchArgument,
                                this.smLaunchMaxRunning,
                                this.smLaunchMaxCompleted,
                                this.smLaunchLifeTime,
                                this.smLaunchExpireTime,
                                this.smLaunchStart,
                                this.smLaunchControl,
                                this.smLaunchAdminStatus,
                                this.smLaunchOperStatus,
                                this.smLaunchRunIndexNext,
                                this.smLaunchStorageType,
                                this.smLaunchRowStatus,
                                this.smLaunchError,
                                this.smLaunchLastChange,
                                this.smLaunchRowExpireTime
                            };
                        }
                        public static final class SmLaunchOwnerEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchOwnerEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchOwner", "1.3.6.1.2.1.64.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchNameEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchNameEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchName", "1.3.6.1.2.1.64.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchScriptOwnerEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchScriptOwnerEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchScriptOwner", "1.3.6.1.2.1.64.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchScriptNameEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchScriptNameEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchScriptName", "1.3.6.1.2.1.64.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchArgumentEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchArgumentEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchArgument", "1.3.6.1.2.1.64.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchMaxRunningEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchMaxRunningEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchMaxRunning", "1.3.6.1.2.1.64.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchMaxCompletedEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchMaxCompletedEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchMaxCompleted", "1.3.6.1.2.1.64.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchLifeTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchLifeTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchLifeTime", "1.3.6.1.2.1.64.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchExpireTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchExpireTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchExpireTime", "1.3.6.1.2.1.64.1.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchStartEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchStartEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchStart", "1.3.6.1.2.1.64.1.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchControlEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchControlEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchControl", "1.3.6.1.2.1.64.1.4.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchAdminStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchAdminStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchAdminStatus", "1.3.6.1.2.1.64.1.4.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchOperStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchOperStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchOperStatus", "1.3.6.1.2.1.64.1.4.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchRunIndexNextEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchRunIndexNextEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchRunIndexNext", "1.3.6.1.2.1.64.1.4.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchStorageTypeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchStorageTypeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchStorageType", "1.3.6.1.2.1.64.1.4.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchRowStatusEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchRowStatusEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchRowStatus", "1.3.6.1.2.1.64.1.4.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchErrorEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchErrorEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchError", "1.3.6.1.2.1.64.1.4.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchLastChangeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchLastChangeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchLastChange", "1.3.6.1.2.1.64.1.4.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmLaunchRowExpireTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmLaunchRowExpireTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smLaunchRowExpireTime", "1.3.6.1.2.1.64.1.4.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SmRunTableEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    public final SmRunEntryEnt smRunEntry;

                    private SmRunTableEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smRunTable", "1.3.6.1.2.1.64.1.4.2", false, true, false, false);
                        this.smRunEntry = new SmRunEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.smRunEntry
                        };
                    }
                    public static final class SmRunEntryEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                    {
                        public final SmRunIndexEnt smRunIndex;

                        public final SmRunArgumentEnt smRunArgument;

                        public final SmRunStartTimeEnt smRunStartTime;

                        public final SmRunEndTimeEnt smRunEndTime;

                        public final SmRunLifeTimeEnt smRunLifeTime;

                        public final SmRunExpireTimeEnt smRunExpireTime;

                        public final SmRunExitCodeEnt smRunExitCode;

                        public final SmRunResultEnt smRunResult;

                        public final SmRunControlEnt smRunControl;

                        public final SmRunStateEnt smRunState;

                        public final SmRunErrorEnt smRunError;

                        public final SmRunResultTimeEnt smRunResultTime;

                        public final SmRunErrorTimeEnt smRunErrorTime;

                        private SmRunEntryEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                        {
                            super(mib, parent, "smRunEntry", "1.3.6.1.2.1.64.1.4.2.1", false, false, false, true);
                            this.smRunIndex = new SmRunIndexEnt(mib, this);
                            this.smRunArgument = new SmRunArgumentEnt(mib, this);
                            this.smRunStartTime = new SmRunStartTimeEnt(mib, this);
                            this.smRunEndTime = new SmRunEndTimeEnt(mib, this);
                            this.smRunLifeTime = new SmRunLifeTimeEnt(mib, this);
                            this.smRunExpireTime = new SmRunExpireTimeEnt(mib, this);
                            this.smRunExitCode = new SmRunExitCodeEnt(mib, this);
                            this.smRunResult = new SmRunResultEnt(mib, this);
                            this.smRunControl = new SmRunControlEnt(mib, this);
                            this.smRunState = new SmRunStateEnt(mib, this);
                            this.smRunError = new SmRunErrorEnt(mib, this);
                            this.smRunResultTime = new SmRunResultTimeEnt(mib, this);
                            this.smRunErrorTime = new SmRunErrorTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.smRunIndex,
                                this.smRunArgument,
                                this.smRunStartTime,
                                this.smRunEndTime,
                                this.smRunLifeTime,
                                this.smRunExpireTime,
                                this.smRunExitCode,
                                this.smRunResult,
                                this.smRunControl,
                                this.smRunState,
                                this.smRunError,
                                this.smRunResultTime,
                                this.smRunErrorTime
                            };
                        }
                        public static final class SmRunIndexEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunIndexEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunIndex", "1.3.6.1.2.1.64.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunArgumentEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunArgumentEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunArgument", "1.3.6.1.2.1.64.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunStartTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunStartTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunStartTime", "1.3.6.1.2.1.64.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunEndTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunEndTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunEndTime", "1.3.6.1.2.1.64.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunLifeTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunLifeTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunLifeTime", "1.3.6.1.2.1.64.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunExpireTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunExpireTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunExpireTime", "1.3.6.1.2.1.64.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunExitCodeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunExitCodeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunExitCode", "1.3.6.1.2.1.64.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunResultEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunResultEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunResult", "1.3.6.1.2.1.64.1.4.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunControlEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunControlEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunControl", "1.3.6.1.2.1.64.1.4.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunStateEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunStateEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunState", "1.3.6.1.2.1.64.1.4.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunErrorEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunErrorEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunError", "1.3.6.1.2.1.64.1.4.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunResultTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunResultTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunResultTime", "1.3.6.1.2.1.64.1.4.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SmRunErrorTimeEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                        {
                            private SmRunErrorTimeEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                            {
                                super(mib, parent, "smRunErrorTime", "1.3.6.1.2.1.64.1.4.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SmNotificationsEnt extends MIBEntry<DISMANSCRIPTMIBDef>
        {
            /** Notifications. The definition of smTraps makes notificationregistrations reversible (see STD 58, RFC 2578).*/
            public final SmTrapsEnt smTraps;

            private SmNotificationsEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
            {
                super(mib, parent, "smNotifications", "1.3.6.1.2.1.64.2", false, false, false, false);
                this.smTraps = new SmTrapsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.smTraps
                };
            }
            public static final class SmTrapsEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                public final SmScriptAbortEnt smScriptAbort;

                public final SmScriptResultEnt smScriptResult;

                public final SmScriptExceptionEnt smScriptException;

                private SmTrapsEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smTraps", "1.3.6.1.2.1.64.2.0", false, false, false, false);
                    this.smScriptAbort = new SmScriptAbortEnt(mib, this);
                    this.smScriptResult = new SmScriptResultEnt(mib, this);
                    this.smScriptException = new SmScriptExceptionEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smScriptAbort,
                        this.smScriptResult,
                        this.smScriptException
                    };
                }
                public static final class SmScriptAbortEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmScriptAbortEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smScriptAbort", "1.3.6.1.2.1.64.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmScriptResultEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmScriptResultEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smScriptResult", "1.3.6.1.2.1.64.2.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmScriptExceptionEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmScriptExceptionEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smScriptException", "1.3.6.1.2.1.64.2.0.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SmConformanceEnt extends MIBEntry<DISMANSCRIPTMIBDef>
        {
            /** conformance information*/
            public final SmCompliancesEnt smCompliances;

            public final SmGroupsEnt smGroups;

            private SmConformanceEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
            {
                super(mib, parent, "smConformance", "1.3.6.1.2.1.64.3", false, false, false, false);
                this.smCompliances = new SmCompliancesEnt(mib, this);
                this.smGroups = new SmGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.smCompliances,
                    this.smGroups
                };
            }
            public static final class SmCompliancesEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                /** compliance statements*/
                public final SmCompliance2Ent smCompliance2;

                /** Deprecated compliance and conformance group definitionsfrom RFC 2592.*/
                public final SmComplianceEnt smCompliance;

                private SmCompliancesEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smCompliances", "1.3.6.1.2.1.64.3.1", false, false, false, false);
                    this.smCompliance2 = new SmCompliance2Ent(mib, this);
                    this.smCompliance = new SmComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smCompliance2,
                        this.smCompliance
                    };
                }
                public static final class SmCompliance2Ent extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmCompliance2Ent(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smCompliance2", "1.3.6.1.2.1.64.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmComplianceEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmComplianceEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smCompliance", "1.3.6.1.2.1.64.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SmGroupsEnt extends MIBEntry<DISMANSCRIPTMIBDef>
            {
                public final SmLanguageGroupEnt smLanguageGroup;

                public final SmScriptGroup2Ent smScriptGroup2;

                public final SmCodeGroupEnt smCodeGroup;

                public final SmLaunchGroup2Ent smLaunchGroup2;

                public final SmRunGroup2Ent smRunGroup2;

                public final SmNotificationsGroup2Ent smNotificationsGroup2;

                public final SmScriptGroupEnt smScriptGroup;

                public final SmLaunchGroupEnt smLaunchGroup;

                public final SmRunGroupEnt smRunGroup;

                public final SmNotificationsGroupEnt smNotificationsGroup;

                private SmGroupsEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                {
                    super(mib, parent, "smGroups", "1.3.6.1.2.1.64.3.2", false, false, false, false);
                    this.smLanguageGroup = new SmLanguageGroupEnt(mib, this);
                    this.smScriptGroup2 = new SmScriptGroup2Ent(mib, this);
                    this.smCodeGroup = new SmCodeGroupEnt(mib, this);
                    this.smLaunchGroup2 = new SmLaunchGroup2Ent(mib, this);
                    this.smRunGroup2 = new SmRunGroup2Ent(mib, this);
                    this.smNotificationsGroup2 = new SmNotificationsGroup2Ent(mib, this);
                    this.smScriptGroup = new SmScriptGroupEnt(mib, this);
                    this.smLaunchGroup = new SmLaunchGroupEnt(mib, this);
                    this.smRunGroup = new SmRunGroupEnt(mib, this);
                    this.smNotificationsGroup = new SmNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smLanguageGroup,
                        this.smScriptGroup2,
                        this.smCodeGroup,
                        this.smLaunchGroup2,
                        this.smRunGroup2,
                        this.smNotificationsGroup2,
                        this.smScriptGroup,
                        this.smLaunchGroup,
                        this.smRunGroup,
                        this.smNotificationsGroup
                    };
                }
                public static final class SmLanguageGroupEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmLanguageGroupEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smLanguageGroup", "1.3.6.1.2.1.64.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmScriptGroup2Ent extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmScriptGroup2Ent(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smScriptGroup2", "1.3.6.1.2.1.64.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmCodeGroupEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmCodeGroupEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smCodeGroup", "1.3.6.1.2.1.64.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmLaunchGroup2Ent extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmLaunchGroup2Ent(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smLaunchGroup2", "1.3.6.1.2.1.64.3.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmRunGroup2Ent extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmRunGroup2Ent(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smRunGroup2", "1.3.6.1.2.1.64.3.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmNotificationsGroup2Ent extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmNotificationsGroup2Ent(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smNotificationsGroup2", "1.3.6.1.2.1.64.3.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmScriptGroupEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmScriptGroupEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smScriptGroup", "1.3.6.1.2.1.64.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmLaunchGroupEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmLaunchGroupEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smLaunchGroup", "1.3.6.1.2.1.64.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmRunGroupEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmRunGroupEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smRunGroup", "1.3.6.1.2.1.64.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SmNotificationsGroupEnt extends MIBEntry<DISMANSCRIPTMIBDef>
                {
                    private SmNotificationsGroupEnt(DISMANSCRIPTMIBDef mib, MIBEntry<DISMANSCRIPTMIBDef> parent)
                    {
                        super(mib, parent, "smNotificationsGroup", "1.3.6.1.2.1.64.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
