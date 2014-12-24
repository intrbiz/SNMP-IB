package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SYSAPPLMIBDef extends MIB
{
    public static final SYSAPPLMIBDef SYSAPPLMIB = new SYSAPPLMIBDef();

    /** System Application MIB*/
    public final SysApplMIBEnt sysApplMIB;

    private SYSAPPLMIBDef()
    {
        super("SYSAPPL-MIB");
        this.sysApplMIB = new SysApplMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sysApplMIB
        };
    }

    public static final class SysApplMIBEnt extends MIBEntry<SYSAPPLMIBDef>
    {
        public final SysApplOBJEnt sysApplOBJ;

        public final SysApplNotificationsEnt sysApplNotifications;

        public final SysApplConformanceEnt sysApplConformance;

        private SysApplMIBEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
        {
            super(mib, parent, "sysApplMIB", "1.3.6.1.2.1.54", false, false, false, false);
            this.sysApplOBJ = new SysApplOBJEnt(mib, this);
            this.sysApplNotifications = new SysApplNotificationsEnt(mib, this);
            this.sysApplConformance = new SysApplConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sysApplOBJ,
                this.sysApplNotifications,
                this.sysApplConformance
            };
        }
        public static final class SysApplOBJEnt extends MIBEntry<SYSAPPLMIBDef>
        {
            public final SysApplInstalledEnt sysApplInstalled;

            public final SysApplRunEnt sysApplRun;

            public final SysApplMapEnt sysApplMap;

            private SysApplOBJEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
            {
                super(mib, parent, "sysApplOBJ", "1.3.6.1.2.1.54.1", false, false, false, false);
                this.sysApplInstalled = new SysApplInstalledEnt(mib, this);
                this.sysApplRun = new SysApplRunEnt(mib, this);
                this.sysApplMap = new SysApplMapEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sysApplInstalled,
                    this.sysApplRun,
                    this.sysApplMap
                };
            }
            public static final class SysApplInstalledEnt extends MIBEntry<SYSAPPLMIBDef>
            {
                /** sysApplInstalled GroupThis group provides information about application packagesthat have been installed on the host computer.  The groupcontains two tables.  The first, the sysApplInstallPkgTable,describes the application packages, the second, thesysApplInstallElmtTable, describes the constituent elements(files and executables) which compose an application package.
In order to appear in this group, an application and itscomponent files must be discoverable by the system itself,possibly through some type of software installation mechanismor registry.
sysApplInstallPkgTableThe system installed application packages table providesinformation on the software packages installed on a system.These packages may consist of many different files includingexecutable and non-executable files.*/
                public final SysApplInstallPkgTableEnt sysApplInstallPkgTable;

                /** sysApplInstallElmtTableThe table describing the individual application packageelements (files and executables) installed on the host computer.*/
                public final SysApplInstallElmtTableEnt sysApplInstallElmtTable;

                private SysApplInstalledEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                {
                    super(mib, parent, "sysApplInstalled", "1.3.6.1.2.1.54.1.1", false, false, false, false);
                    this.sysApplInstallPkgTable = new SysApplInstallPkgTableEnt(mib, this);
                    this.sysApplInstallElmtTable = new SysApplInstallElmtTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sysApplInstallPkgTable,
                        this.sysApplInstallElmtTable
                    };
                }
                public static final class SysApplInstallPkgTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplInstallPkgEntryEnt sysApplInstallPkgEntry;

                    private SysApplInstallPkgTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplInstallPkgTable", "1.3.6.1.2.1.54.1.1.1", false, true, false, false);
                        this.sysApplInstallPkgEntry = new SysApplInstallPkgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplInstallPkgEntry
                        };
                    }
                    public static final class SysApplInstallPkgEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplInstallPkgIndexEnt sysApplInstallPkgIndex;

                        public final SysApplInstallPkgManufacturerEnt sysApplInstallPkgManufacturer;

                        public final SysApplInstallPkgProductNameEnt sysApplInstallPkgProductName;

                        public final SysApplInstallPkgVersionEnt sysApplInstallPkgVersion;

                        public final SysApplInstallPkgSerialNumberEnt sysApplInstallPkgSerialNumber;

                        public final SysApplInstallPkgDateEnt sysApplInstallPkgDate;

                        public final SysApplInstallPkgLocationEnt sysApplInstallPkgLocation;

                        private SysApplInstallPkgEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplInstallPkgEntry", "1.3.6.1.2.1.54.1.1.1.1", false, false, false, true);
                            this.sysApplInstallPkgIndex = new SysApplInstallPkgIndexEnt(mib, this);
                            this.sysApplInstallPkgManufacturer = new SysApplInstallPkgManufacturerEnt(mib, this);
                            this.sysApplInstallPkgProductName = new SysApplInstallPkgProductNameEnt(mib, this);
                            this.sysApplInstallPkgVersion = new SysApplInstallPkgVersionEnt(mib, this);
                            this.sysApplInstallPkgSerialNumber = new SysApplInstallPkgSerialNumberEnt(mib, this);
                            this.sysApplInstallPkgDate = new SysApplInstallPkgDateEnt(mib, this);
                            this.sysApplInstallPkgLocation = new SysApplInstallPkgLocationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplInstallPkgIndex,
                                this.sysApplInstallPkgManufacturer,
                                this.sysApplInstallPkgProductName,
                                this.sysApplInstallPkgVersion,
                                this.sysApplInstallPkgSerialNumber,
                                this.sysApplInstallPkgDate,
                                this.sysApplInstallPkgLocation
                            };
                        }
                        public static final class SysApplInstallPkgIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgIndex", "1.3.6.1.2.1.54.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallPkgManufacturerEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgManufacturerEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgManufacturer", "1.3.6.1.2.1.54.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallPkgProductNameEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgProductNameEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgProductName", "1.3.6.1.2.1.54.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallPkgVersionEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgVersionEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgVersion", "1.3.6.1.2.1.54.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallPkgSerialNumberEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgSerialNumberEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgSerialNumber", "1.3.6.1.2.1.54.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallPkgDateEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgDateEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgDate", "1.3.6.1.2.1.54.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallPkgLocationEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallPkgLocationEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallPkgLocation", "1.3.6.1.2.1.54.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SysApplInstallElmtTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplInstallElmtEntryEnt sysApplInstallElmtEntry;

                    private SysApplInstallElmtTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplInstallElmtTable", "1.3.6.1.2.1.54.1.1.2", false, true, false, false);
                        this.sysApplInstallElmtEntry = new SysApplInstallElmtEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplInstallElmtEntry
                        };
                    }
                    public static final class SysApplInstallElmtEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplInstallElmtIndexEnt sysApplInstallElmtIndex;

                        public final SysApplInstallElmtNameEnt sysApplInstallElmtName;

                        public final SysApplInstallElmtTypeEnt sysApplInstallElmtType;

                        public final SysApplInstallElmtDateEnt sysApplInstallElmtDate;

                        public final SysApplInstallElmtPathEnt sysApplInstallElmtPath;

                        public final SysApplInstallElmtSizeHighEnt sysApplInstallElmtSizeHigh;

                        public final SysApplInstallElmtSizeLowEnt sysApplInstallElmtSizeLow;

                        public final SysApplInstallElmtRoleEnt sysApplInstallElmtRole;

                        public final SysApplInstallElmtModifyDateEnt sysApplInstallElmtModifyDate;

                        public final SysApplInstallElmtCurSizeHighEnt sysApplInstallElmtCurSizeHigh;

                        public final SysApplInstallElmtCurSizeLowEnt sysApplInstallElmtCurSizeLow;

                        private SysApplInstallElmtEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplInstallElmtEntry", "1.3.6.1.2.1.54.1.1.2.1", false, false, false, true);
                            this.sysApplInstallElmtIndex = new SysApplInstallElmtIndexEnt(mib, this);
                            this.sysApplInstallElmtName = new SysApplInstallElmtNameEnt(mib, this);
                            this.sysApplInstallElmtType = new SysApplInstallElmtTypeEnt(mib, this);
                            this.sysApplInstallElmtDate = new SysApplInstallElmtDateEnt(mib, this);
                            this.sysApplInstallElmtPath = new SysApplInstallElmtPathEnt(mib, this);
                            this.sysApplInstallElmtSizeHigh = new SysApplInstallElmtSizeHighEnt(mib, this);
                            this.sysApplInstallElmtSizeLow = new SysApplInstallElmtSizeLowEnt(mib, this);
                            this.sysApplInstallElmtRole = new SysApplInstallElmtRoleEnt(mib, this);
                            this.sysApplInstallElmtModifyDate = new SysApplInstallElmtModifyDateEnt(mib, this);
                            this.sysApplInstallElmtCurSizeHigh = new SysApplInstallElmtCurSizeHighEnt(mib, this);
                            this.sysApplInstallElmtCurSizeLow = new SysApplInstallElmtCurSizeLowEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplInstallElmtIndex,
                                this.sysApplInstallElmtName,
                                this.sysApplInstallElmtType,
                                this.sysApplInstallElmtDate,
                                this.sysApplInstallElmtPath,
                                this.sysApplInstallElmtSizeHigh,
                                this.sysApplInstallElmtSizeLow,
                                this.sysApplInstallElmtRole,
                                this.sysApplInstallElmtModifyDate,
                                this.sysApplInstallElmtCurSizeHigh,
                                this.sysApplInstallElmtCurSizeLow
                            };
                        }
                        public static final class SysApplInstallElmtIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtIndex", "1.3.6.1.2.1.54.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtNameEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtNameEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtName", "1.3.6.1.2.1.54.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtTypeEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtTypeEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtType", "1.3.6.1.2.1.54.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtDateEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtDateEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtDate", "1.3.6.1.2.1.54.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtPathEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtPathEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtPath", "1.3.6.1.2.1.54.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtSizeHighEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtSizeHighEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtSizeHigh", "1.3.6.1.2.1.54.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtSizeLowEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtSizeLowEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtSizeLow", "1.3.6.1.2.1.54.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtRoleEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtRoleEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtRole", "1.3.6.1.2.1.54.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtModifyDateEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtModifyDateEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtModifyDate", "1.3.6.1.2.1.54.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtCurSizeHighEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtCurSizeHighEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtCurSizeHigh", "1.3.6.1.2.1.54.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplInstallElmtCurSizeLowEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplInstallElmtCurSizeLowEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplInstallElmtCurSizeLow", "1.3.6.1.2.1.54.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SysApplRunEnt extends MIBEntry<SYSAPPLMIBDef>
            {
                /** sysApplRun GroupThis group models activity information for applicationsthat have been invoked and are either currently running,or have previously run on the host system.  Likewise,the individual elements of an invoked application arealso modeled to show currently running processes, andprocesses that have run in the past.
sysApplRunTableThe sysApplRunTable contains the application instanceswhich are currently running on the host.  Since a singleapplication might be invoked multiple times, an entry isadded to this table for each INVOCATION of an application.The table is indexed by sysApplInstallPkgIndex, sysApplRunIndexto enable managers to easily locate all invocations ofa particular application package.*/
                public final SysApplRunTableEnt sysApplRunTable;

                /** sysApplPastRunTableThe sysApplPastRunTable provides a history of applicationspreviously run on the host computer. Entries are removed fromthe sysApplRunTable and corresponding entries are added to thistable when an application becomes inactive. Entries remain inthis table until they are aged out when either the table sizereaches a maximum as determined by the sysApplPastRunMaxRows,or when an entry has aged to exceed a time limit as set besysApplPastRunTblTimeLimit.When aging out entries, the oldest entry, as determined by
the value of sysApplPastRunTimeEnded, will be removed first.*/
                public final SysApplPastRunTableEnt sysApplPastRunTable;

                /** sysApplElmtRunTableThe sysApplElmtRunTable contains an entry for each process thatis currently running on the host.  An entry is created inthis table for each process at the time it is started, and willremain in the table until the process terminates.The table is indexed by sysApplElmtRunInstallPkg,sysApplElmtRunInvocID, and sysApplElmtRunIndex to make it easyto locate all running elements of a particular invoked applicationwhich has been installed on the system.*/
                public final SysApplElmtRunTableEnt sysApplElmtRunTable;

                /** sysApplElmtPastRunTableThe sysApplElmtPastRunTable maintains a history ofprocesses which have previously executed onthe host as part of an application. Upon terminationof a process, the entry representing the process is removed fromthe sysApplElmtRunTable and a corresponding entry is created inthis table provided that the process was part of anidentifiable application.  If the process could not be associated
with an invoked application, no corresponding entry is created.Hence, whereas the sysApplElmtRunTable contains an entry forevery process currently executing on the system, thesysApplElmtPastRunTable only contains entries for processesthat previously executed as part of an invoked application.Entries remain in this table until they are aged out wheneither the number of entries in the table reaches amaximum as determined by sysApplElmtPastRunMaxRows, orwhen an entry has aged to exceed a time limit as set bysysApplElmtPastRunTblTimeLimit.  When aging out entries,the oldest entry, as determined by the value ofsysApplElmtPastRunTimeEnded, will be removed first.The table is indexed by sysApplInstallPkgIndex (from thesysApplInstallPkgTable), sysApplElmtPastRunInvocID, andsysApplElmtPastRunIndex to make it easy to locate allpreviously executed processes of a particular invoked applicationthat has been installed on the system.*/
                public final SysApplElmtPastRunTableEnt sysApplElmtPastRunTable;

                /** Additional Scalar objects to control table sizes*/
                public final SysApplPastRunMaxRowsEnt sysApplPastRunMaxRows;

                public final SysApplPastRunTableRemItemsEnt sysApplPastRunTableRemItems;

                public final SysApplPastRunTblTimeLimitEnt sysApplPastRunTblTimeLimit;

                public final SysApplElemPastRunMaxRowsEnt sysApplElemPastRunMaxRows;

                public final SysApplElemPastRunTableRemItemsEnt sysApplElemPastRunTableRemItems;

                public final SysApplElemPastRunTblTimeLimitEnt sysApplElemPastRunTblTimeLimit;

                public final SysApplAgentPollIntervalEnt sysApplAgentPollInterval;

                private SysApplRunEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                {
                    super(mib, parent, "sysApplRun", "1.3.6.1.2.1.54.1.2", false, false, false, false);
                    this.sysApplRunTable = new SysApplRunTableEnt(mib, this);
                    this.sysApplPastRunTable = new SysApplPastRunTableEnt(mib, this);
                    this.sysApplElmtRunTable = new SysApplElmtRunTableEnt(mib, this);
                    this.sysApplElmtPastRunTable = new SysApplElmtPastRunTableEnt(mib, this);
                    this.sysApplPastRunMaxRows = new SysApplPastRunMaxRowsEnt(mib, this);
                    this.sysApplPastRunTableRemItems = new SysApplPastRunTableRemItemsEnt(mib, this);
                    this.sysApplPastRunTblTimeLimit = new SysApplPastRunTblTimeLimitEnt(mib, this);
                    this.sysApplElemPastRunMaxRows = new SysApplElemPastRunMaxRowsEnt(mib, this);
                    this.sysApplElemPastRunTableRemItems = new SysApplElemPastRunTableRemItemsEnt(mib, this);
                    this.sysApplElemPastRunTblTimeLimit = new SysApplElemPastRunTblTimeLimitEnt(mib, this);
                    this.sysApplAgentPollInterval = new SysApplAgentPollIntervalEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sysApplRunTable,
                        this.sysApplPastRunTable,
                        this.sysApplElmtRunTable,
                        this.sysApplElmtPastRunTable,
                        this.sysApplPastRunMaxRows,
                        this.sysApplPastRunTableRemItems,
                        this.sysApplPastRunTblTimeLimit,
                        this.sysApplElemPastRunMaxRows,
                        this.sysApplElemPastRunTableRemItems,
                        this.sysApplElemPastRunTblTimeLimit,
                        this.sysApplAgentPollInterval
                    };
                }
                public static final class SysApplRunTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplRunEntryEnt sysApplRunEntry;

                    private SysApplRunTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplRunTable", "1.3.6.1.2.1.54.1.2.1", false, true, false, false);
                        this.sysApplRunEntry = new SysApplRunEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplRunEntry
                        };
                    }
                    public static final class SysApplRunEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplRunIndexEnt sysApplRunIndex;

                        public final SysApplRunStartedEnt sysApplRunStarted;

                        public final SysApplRunCurrentStateEnt sysApplRunCurrentState;

                        private SysApplRunEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplRunEntry", "1.3.6.1.2.1.54.1.2.1.1", false, false, false, true);
                            this.sysApplRunIndex = new SysApplRunIndexEnt(mib, this);
                            this.sysApplRunStarted = new SysApplRunStartedEnt(mib, this);
                            this.sysApplRunCurrentState = new SysApplRunCurrentStateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplRunIndex,
                                this.sysApplRunStarted,
                                this.sysApplRunCurrentState
                            };
                        }
                        public static final class SysApplRunIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplRunIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplRunIndex", "1.3.6.1.2.1.54.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplRunStartedEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplRunStartedEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplRunStarted", "1.3.6.1.2.1.54.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplRunCurrentStateEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplRunCurrentStateEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplRunCurrentState", "1.3.6.1.2.1.54.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SysApplPastRunTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplPastRunEntryEnt sysApplPastRunEntry;

                    private SysApplPastRunTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplPastRunTable", "1.3.6.1.2.1.54.1.2.2", false, true, false, false);
                        this.sysApplPastRunEntry = new SysApplPastRunEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplPastRunEntry
                        };
                    }
                    public static final class SysApplPastRunEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplPastRunIndexEnt sysApplPastRunIndex;

                        public final SysApplPastRunStartedEnt sysApplPastRunStarted;

                        public final SysApplPastRunExitStateEnt sysApplPastRunExitState;

                        public final SysApplPastRunTimeEndedEnt sysApplPastRunTimeEnded;

                        private SysApplPastRunEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplPastRunEntry", "1.3.6.1.2.1.54.1.2.2.1", false, false, false, true);
                            this.sysApplPastRunIndex = new SysApplPastRunIndexEnt(mib, this);
                            this.sysApplPastRunStarted = new SysApplPastRunStartedEnt(mib, this);
                            this.sysApplPastRunExitState = new SysApplPastRunExitStateEnt(mib, this);
                            this.sysApplPastRunTimeEnded = new SysApplPastRunTimeEndedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplPastRunIndex,
                                this.sysApplPastRunStarted,
                                this.sysApplPastRunExitState,
                                this.sysApplPastRunTimeEnded
                            };
                        }
                        public static final class SysApplPastRunIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplPastRunIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplPastRunIndex", "1.3.6.1.2.1.54.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplPastRunStartedEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplPastRunStartedEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplPastRunStarted", "1.3.6.1.2.1.54.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplPastRunExitStateEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplPastRunExitStateEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplPastRunExitState", "1.3.6.1.2.1.54.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplPastRunTimeEndedEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplPastRunTimeEndedEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplPastRunTimeEnded", "1.3.6.1.2.1.54.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SysApplElmtRunTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplElmtRunEntryEnt sysApplElmtRunEntry;

                    private SysApplElmtRunTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplElmtRunTable", "1.3.6.1.2.1.54.1.2.3", false, true, false, false);
                        this.sysApplElmtRunEntry = new SysApplElmtRunEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplElmtRunEntry
                        };
                    }
                    public static final class SysApplElmtRunEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplElmtRunInstallPkgEnt sysApplElmtRunInstallPkg;

                        public final SysApplElmtRunInvocIDEnt sysApplElmtRunInvocID;

                        public final SysApplElmtRunIndexEnt sysApplElmtRunIndex;

                        public final SysApplElmtRunInstallIDEnt sysApplElmtRunInstallID;

                        public final SysApplElmtRunTimeStartedEnt sysApplElmtRunTimeStarted;

                        public final SysApplElmtRunStateEnt sysApplElmtRunState;

                        public final SysApplElmtRunNameEnt sysApplElmtRunName;

                        public final SysApplElmtRunParametersEnt sysApplElmtRunParameters;

                        public final SysApplElmtRunCPUEnt sysApplElmtRunCPU;

                        public final SysApplElmtRunMemoryEnt sysApplElmtRunMemory;

                        public final SysApplElmtRunNumFilesEnt sysApplElmtRunNumFiles;

                        public final SysApplElmtRunUserEnt sysApplElmtRunUser;

                        private SysApplElmtRunEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplElmtRunEntry", "1.3.6.1.2.1.54.1.2.3.1", false, false, false, true);
                            this.sysApplElmtRunInstallPkg = new SysApplElmtRunInstallPkgEnt(mib, this);
                            this.sysApplElmtRunInvocID = new SysApplElmtRunInvocIDEnt(mib, this);
                            this.sysApplElmtRunIndex = new SysApplElmtRunIndexEnt(mib, this);
                            this.sysApplElmtRunInstallID = new SysApplElmtRunInstallIDEnt(mib, this);
                            this.sysApplElmtRunTimeStarted = new SysApplElmtRunTimeStartedEnt(mib, this);
                            this.sysApplElmtRunState = new SysApplElmtRunStateEnt(mib, this);
                            this.sysApplElmtRunName = new SysApplElmtRunNameEnt(mib, this);
                            this.sysApplElmtRunParameters = new SysApplElmtRunParametersEnt(mib, this);
                            this.sysApplElmtRunCPU = new SysApplElmtRunCPUEnt(mib, this);
                            this.sysApplElmtRunMemory = new SysApplElmtRunMemoryEnt(mib, this);
                            this.sysApplElmtRunNumFiles = new SysApplElmtRunNumFilesEnt(mib, this);
                            this.sysApplElmtRunUser = new SysApplElmtRunUserEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplElmtRunInstallPkg,
                                this.sysApplElmtRunInvocID,
                                this.sysApplElmtRunIndex,
                                this.sysApplElmtRunInstallID,
                                this.sysApplElmtRunTimeStarted,
                                this.sysApplElmtRunState,
                                this.sysApplElmtRunName,
                                this.sysApplElmtRunParameters,
                                this.sysApplElmtRunCPU,
                                this.sysApplElmtRunMemory,
                                this.sysApplElmtRunNumFiles,
                                this.sysApplElmtRunUser
                            };
                        }
                        public static final class SysApplElmtRunInstallPkgEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunInstallPkgEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunInstallPkg", "1.3.6.1.2.1.54.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunInvocIDEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunInvocIDEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunInvocID", "1.3.6.1.2.1.54.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunIndex", "1.3.6.1.2.1.54.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunInstallIDEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunInstallIDEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunInstallID", "1.3.6.1.2.1.54.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunTimeStartedEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunTimeStartedEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunTimeStarted", "1.3.6.1.2.1.54.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunStateEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunStateEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunState", "1.3.6.1.2.1.54.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunNameEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunNameEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunName", "1.3.6.1.2.1.54.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunParametersEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunParametersEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunParameters", "1.3.6.1.2.1.54.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunCPUEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunCPUEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunCPU", "1.3.6.1.2.1.54.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunMemoryEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunMemoryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunMemory", "1.3.6.1.2.1.54.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunNumFilesEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunNumFilesEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunNumFiles", "1.3.6.1.2.1.54.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtRunUserEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtRunUserEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtRunUser", "1.3.6.1.2.1.54.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SysApplElmtPastRunTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplElmtPastRunEntryEnt sysApplElmtPastRunEntry;

                    private SysApplElmtPastRunTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplElmtPastRunTable", "1.3.6.1.2.1.54.1.2.4", false, true, false, false);
                        this.sysApplElmtPastRunEntry = new SysApplElmtPastRunEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplElmtPastRunEntry
                        };
                    }
                    public static final class SysApplElmtPastRunEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplElmtPastRunInvocIDEnt sysApplElmtPastRunInvocID;

                        public final SysApplElmtPastRunIndexEnt sysApplElmtPastRunIndex;

                        public final SysApplElmtPastRunInstallIDEnt sysApplElmtPastRunInstallID;

                        public final SysApplElmtPastRunTimeStartedEnt sysApplElmtPastRunTimeStarted;

                        public final SysApplElmtPastRunTimeEndedEnt sysApplElmtPastRunTimeEnded;

                        public final SysApplElmtPastRunNameEnt sysApplElmtPastRunName;

                        public final SysApplElmtPastRunParametersEnt sysApplElmtPastRunParameters;

                        public final SysApplElmtPastRunCPUEnt sysApplElmtPastRunCPU;

                        public final SysApplElmtPastRunMemoryEnt sysApplElmtPastRunMemory;

                        public final SysApplElmtPastRunNumFilesEnt sysApplElmtPastRunNumFiles;

                        public final SysApplElmtPastRunUserEnt sysApplElmtPastRunUser;

                        private SysApplElmtPastRunEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplElmtPastRunEntry", "1.3.6.1.2.1.54.1.2.4.1", false, false, false, true);
                            this.sysApplElmtPastRunInvocID = new SysApplElmtPastRunInvocIDEnt(mib, this);
                            this.sysApplElmtPastRunIndex = new SysApplElmtPastRunIndexEnt(mib, this);
                            this.sysApplElmtPastRunInstallID = new SysApplElmtPastRunInstallIDEnt(mib, this);
                            this.sysApplElmtPastRunTimeStarted = new SysApplElmtPastRunTimeStartedEnt(mib, this);
                            this.sysApplElmtPastRunTimeEnded = new SysApplElmtPastRunTimeEndedEnt(mib, this);
                            this.sysApplElmtPastRunName = new SysApplElmtPastRunNameEnt(mib, this);
                            this.sysApplElmtPastRunParameters = new SysApplElmtPastRunParametersEnt(mib, this);
                            this.sysApplElmtPastRunCPU = new SysApplElmtPastRunCPUEnt(mib, this);
                            this.sysApplElmtPastRunMemory = new SysApplElmtPastRunMemoryEnt(mib, this);
                            this.sysApplElmtPastRunNumFiles = new SysApplElmtPastRunNumFilesEnt(mib, this);
                            this.sysApplElmtPastRunUser = new SysApplElmtPastRunUserEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplElmtPastRunInvocID,
                                this.sysApplElmtPastRunIndex,
                                this.sysApplElmtPastRunInstallID,
                                this.sysApplElmtPastRunTimeStarted,
                                this.sysApplElmtPastRunTimeEnded,
                                this.sysApplElmtPastRunName,
                                this.sysApplElmtPastRunParameters,
                                this.sysApplElmtPastRunCPU,
                                this.sysApplElmtPastRunMemory,
                                this.sysApplElmtPastRunNumFiles,
                                this.sysApplElmtPastRunUser
                            };
                        }
                        public static final class SysApplElmtPastRunInvocIDEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunInvocIDEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunInvocID", "1.3.6.1.2.1.54.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunIndex", "1.3.6.1.2.1.54.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunInstallIDEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunInstallIDEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunInstallID", "1.3.6.1.2.1.54.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunTimeStartedEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunTimeStartedEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunTimeStarted", "1.3.6.1.2.1.54.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunTimeEndedEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunTimeEndedEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunTimeEnded", "1.3.6.1.2.1.54.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunNameEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunNameEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunName", "1.3.6.1.2.1.54.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunParametersEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunParametersEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunParameters", "1.3.6.1.2.1.54.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunCPUEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunCPUEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunCPU", "1.3.6.1.2.1.54.1.2.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunMemoryEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunMemoryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunMemory", "1.3.6.1.2.1.54.1.2.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunNumFilesEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunNumFilesEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunNumFiles", "1.3.6.1.2.1.54.1.2.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplElmtPastRunUserEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplElmtPastRunUserEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplElmtPastRunUser", "1.3.6.1.2.1.54.1.2.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SysApplPastRunMaxRowsEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplPastRunMaxRowsEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplPastRunMaxRows", "1.3.6.1.2.1.54.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplPastRunTableRemItemsEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplPastRunTableRemItemsEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplPastRunTableRemItems", "1.3.6.1.2.1.54.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplPastRunTblTimeLimitEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplPastRunTblTimeLimitEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplPastRunTblTimeLimit", "1.3.6.1.2.1.54.1.2.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplElemPastRunMaxRowsEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplElemPastRunMaxRowsEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplElemPastRunMaxRows", "1.3.6.1.2.1.54.1.2.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplElemPastRunTableRemItemsEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplElemPastRunTableRemItemsEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplElemPastRunTableRemItems", "1.3.6.1.2.1.54.1.2.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplElemPastRunTblTimeLimitEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplElemPastRunTblTimeLimitEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplElemPastRunTblTimeLimit", "1.3.6.1.2.1.54.1.2.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplAgentPollIntervalEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplAgentPollIntervalEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplAgentPollInterval", "1.3.6.1.2.1.54.1.2.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SysApplMapEnt extends MIBEntry<SYSAPPLMIBDef>
            {
                /** sysApplMap GroupThis group contains a table, the sysApplMapTable,whose sole purpose is to provide a 'backwards'mapping so that, given a known sysApplElmtRunIndex(process identification number), the corresponding invokedapplication (sysApplRunIndex), installed element(sysApplInstallElmtIndex), and installed applicationpackage (sysApplInstallPkgIndex) can be quickly determined.The table will contain one entry for each processcurrently running on the system.A backwards mapping is extremely useful since the tablesin this MIB module are typically indexed with theinstalled application package (sysApplInstallPkgIndex)as the primary key, and on down as required by thespecific table, with the process ID number (sysApplElmtRunIndex)being the least significant key.It is expected that management applications will usethis mapping table by doing a 'GetNext' operation withthe known process ID number (sysApplElmtRunIndex) as the partialinstance identifier.  Assuming that there is an entry forthe process, the result should return a single columnar value,the sysApplMapInstallPkgIndex, with the sysApplElmtRunIndex,sysApplRunIndex, and sysApplInstallElmtIndex contained in theinstance identifier for the returned MIB object value.NOTE: if the process can not be associated back to aninvoked application installed on the system, then thevalue returned for the columnar value sysApplMapInstallPkgIndexwill be '0' and the instance portion of the object-identifierwill be the process ID number (sysApplElmtRunIndex) followed
by 0.0.*/
                public final SysApplMapTableEnt sysApplMapTable;

                private SysApplMapEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                {
                    super(mib, parent, "sysApplMap", "1.3.6.1.2.1.54.1.3", false, false, false, false);
                    this.sysApplMapTable = new SysApplMapTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sysApplMapTable
                    };
                }
                public static final class SysApplMapTableEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    public final SysApplMapEntryEnt sysApplMapEntry;

                    private SysApplMapTableEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplMapTable", "1.3.6.1.2.1.54.1.3.1", false, true, false, false);
                        this.sysApplMapEntry = new SysApplMapEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sysApplMapEntry
                        };
                    }
                    public static final class SysApplMapEntryEnt extends MIBEntry<SYSAPPLMIBDef>
                    {
                        public final SysApplMapInstallElmtIndexEnt sysApplMapInstallElmtIndex;

                        public final SysApplMapInstallPkgIndexEnt sysApplMapInstallPkgIndex;

                        private SysApplMapEntryEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                        {
                            super(mib, parent, "sysApplMapEntry", "1.3.6.1.2.1.54.1.3.1.1", false, false, false, true);
                            this.sysApplMapInstallElmtIndex = new SysApplMapInstallElmtIndexEnt(mib, this);
                            this.sysApplMapInstallPkgIndex = new SysApplMapInstallPkgIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sysApplMapInstallElmtIndex,
                                this.sysApplMapInstallPkgIndex
                            };
                        }
                        public static final class SysApplMapInstallElmtIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplMapInstallElmtIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplMapInstallElmtIndex", "1.3.6.1.2.1.54.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SysApplMapInstallPkgIndexEnt extends MIBEntry<SYSAPPLMIBDef>
                        {
                            private SysApplMapInstallPkgIndexEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                            {
                                super(mib, parent, "sysApplMapInstallPkgIndex", "1.3.6.1.2.1.54.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SysApplNotificationsEnt extends MIBEntry<SYSAPPLMIBDef>
        {
            private SysApplNotificationsEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
            {
                super(mib, parent, "sysApplNotifications", "1.3.6.1.2.1.54.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysApplConformanceEnt extends MIBEntry<SYSAPPLMIBDef>
        {
            /** Conformance Macros*/
            public final SysApplMIBCompliancesEnt sysApplMIBCompliances;

            public final SysApplMIBGroupsEnt sysApplMIBGroups;

            private SysApplConformanceEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
            {
                super(mib, parent, "sysApplConformance", "1.3.6.1.2.1.54.3", false, false, false, false);
                this.sysApplMIBCompliances = new SysApplMIBCompliancesEnt(mib, this);
                this.sysApplMIBGroups = new SysApplMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sysApplMIBCompliances,
                    this.sysApplMIBGroups
                };
            }
            public static final class SysApplMIBCompliancesEnt extends MIBEntry<SYSAPPLMIBDef>
            {
                public final SysApplMIBComplianceEnt sysApplMIBCompliance;

                private SysApplMIBCompliancesEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                {
                    super(mib, parent, "sysApplMIBCompliances", "1.3.6.1.2.1.54.3.1", false, false, false, false);
                    this.sysApplMIBCompliance = new SysApplMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sysApplMIBCompliance
                    };
                }
                public static final class SysApplMIBComplianceEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplMIBComplianceEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplMIBCompliance", "1.3.6.1.2.1.54.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SysApplMIBGroupsEnt extends MIBEntry<SYSAPPLMIBDef>
            {
                public final SysApplInstalledGroupEnt sysApplInstalledGroup;

                public final SysApplRunGroupEnt sysApplRunGroup;

                public final SysApplMapGroupEnt sysApplMapGroup;

                private SysApplMIBGroupsEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                {
                    super(mib, parent, "sysApplMIBGroups", "1.3.6.1.2.1.54.3.2", false, false, false, false);
                    this.sysApplInstalledGroup = new SysApplInstalledGroupEnt(mib, this);
                    this.sysApplRunGroup = new SysApplRunGroupEnt(mib, this);
                    this.sysApplMapGroup = new SysApplMapGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sysApplInstalledGroup,
                        this.sysApplRunGroup,
                        this.sysApplMapGroup
                    };
                }
                public static final class SysApplInstalledGroupEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplInstalledGroupEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplInstalledGroup", "1.3.6.1.2.1.54.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplRunGroupEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplRunGroupEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplRunGroup", "1.3.6.1.2.1.54.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysApplMapGroupEnt extends MIBEntry<SYSAPPLMIBDef>
                {
                    private SysApplMapGroupEnt(SYSAPPLMIBDef mib, MIBEntry<SYSAPPLMIBDef> parent)
                    {
                        super(mib, parent, "sysApplMapGroup", "1.3.6.1.2.1.54.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
