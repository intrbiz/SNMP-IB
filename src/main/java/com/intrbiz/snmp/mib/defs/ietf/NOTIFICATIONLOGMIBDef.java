package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class NOTIFICATIONLOGMIBDef extends MIB
{
    public static final NOTIFICATIONLOGMIBDef NOTIFICATIONLOGMIB = new NOTIFICATIONLOGMIBDef();

    static { MIBs.getInstance().registerMIB(NOTIFICATIONLOGMIBDef.NOTIFICATIONLOGMIB); }

    /** 27 November 2000*/
    public final NotificationLogMIBEnt notificationLogMIB;

    private NOTIFICATIONLOGMIBDef()
    {
        super("NOTIFICATION-LOG-MIB");
        this.notificationLogMIB = new NotificationLogMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.notificationLogMIB
        };
    }

    public static final class NotificationLogMIBEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
    {
        public final NotificationLogMIBObjectsEnt notificationLogMIBObjects;

        /** Conformance*/
        public final NotificationLogMIBConformanceEnt notificationLogMIBConformance;

        private NotificationLogMIBEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
        {
            super(mib, parent, "notificationLogMIB", "1.3.6.1.2.1.92", false, false, false, false);
            this.notificationLogMIBObjects = new NotificationLogMIBObjectsEnt(mib, this);
            this.notificationLogMIBConformance = new NotificationLogMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.notificationLogMIBObjects,
                this.notificationLogMIBConformance
            };
        }
        public static final class NotificationLogMIBObjectsEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
        {
            public final NlmConfigEnt nlmConfig;

            public final NlmStatsEnt nlmStats;

            public final NlmLogEnt nlmLog;

            private NotificationLogMIBObjectsEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
            {
                super(mib, parent, "notificationLogMIBObjects", "1.3.6.1.2.1.92.1", false, false, false, false);
                this.nlmConfig = new NlmConfigEnt(mib, this);
                this.nlmStats = new NlmStatsEnt(mib, this);
                this.nlmLog = new NlmLogEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlmConfig,
                    this.nlmStats,
                    this.nlmLog
                };
            }
            public static final class NlmConfigEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
            {
                /** Configuration Section*/
                public final NlmConfigGlobalEntryLimitEnt nlmConfigGlobalEntryLimit;

                /** 24 hours*/
                public final NlmConfigGlobalAgeOutEnt nlmConfigGlobalAgeOut;

                /** Basic Log Configuration Table*/
                public final NlmConfigLogTableEnt nlmConfigLogTable;

                private NlmConfigEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                {
                    super(mib, parent, "nlmConfig", "1.3.6.1.2.1.92.1.1", false, false, false, false);
                    this.nlmConfigGlobalEntryLimit = new NlmConfigGlobalEntryLimitEnt(mib, this);
                    this.nlmConfigGlobalAgeOut = new NlmConfigGlobalAgeOutEnt(mib, this);
                    this.nlmConfigLogTable = new NlmConfigLogTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlmConfigGlobalEntryLimit,
                        this.nlmConfigGlobalAgeOut,
                        this.nlmConfigLogTable
                    };
                }
                public static final class NlmConfigGlobalEntryLimitEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NlmConfigGlobalEntryLimitEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmConfigGlobalEntryLimit", "1.3.6.1.2.1.92.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlmConfigGlobalAgeOutEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NlmConfigGlobalAgeOutEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmConfigGlobalAgeOut", "1.3.6.1.2.1.92.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlmConfigLogTableEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    public final NlmConfigLogEntryEnt nlmConfigLogEntry;

                    private NlmConfigLogTableEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmConfigLogTable", "1.3.6.1.2.1.92.1.1.3", false, true, false, false);
                        this.nlmConfigLogEntry = new NlmConfigLogEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nlmConfigLogEntry
                        };
                    }
                    public static final class NlmConfigLogEntryEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                    {
                        public final NlmLogNameEnt nlmLogName;

                        public final NlmConfigLogFilterNameEnt nlmConfigLogFilterName;

                        public final NlmConfigLogEntryLimitEnt nlmConfigLogEntryLimit;

                        public final NlmConfigLogAdminStatusEnt nlmConfigLogAdminStatus;

                        public final NlmConfigLogOperStatusEnt nlmConfigLogOperStatus;

                        public final NlmConfigLogStorageTypeEnt nlmConfigLogStorageType;

                        public final NlmConfigLogEntryStatusEnt nlmConfigLogEntryStatus;

                        private NlmConfigLogEntryEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                        {
                            super(mib, parent, "nlmConfigLogEntry", "1.3.6.1.2.1.92.1.1.3.1", false, false, false, true);
                            this.nlmLogName = new NlmLogNameEnt(mib, this);
                            this.nlmConfigLogFilterName = new NlmConfigLogFilterNameEnt(mib, this);
                            this.nlmConfigLogEntryLimit = new NlmConfigLogEntryLimitEnt(mib, this);
                            this.nlmConfigLogAdminStatus = new NlmConfigLogAdminStatusEnt(mib, this);
                            this.nlmConfigLogOperStatus = new NlmConfigLogOperStatusEnt(mib, this);
                            this.nlmConfigLogStorageType = new NlmConfigLogStorageTypeEnt(mib, this);
                            this.nlmConfigLogEntryStatus = new NlmConfigLogEntryStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nlmLogName,
                                this.nlmConfigLogFilterName,
                                this.nlmConfigLogEntryLimit,
                                this.nlmConfigLogAdminStatus,
                                this.nlmConfigLogOperStatus,
                                this.nlmConfigLogStorageType,
                                this.nlmConfigLogEntryStatus
                            };
                        }
                        public static final class NlmLogNameEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogNameEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogName", "1.3.6.1.2.1.92.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmConfigLogFilterNameEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmConfigLogFilterNameEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmConfigLogFilterName", "1.3.6.1.2.1.92.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmConfigLogEntryLimitEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmConfigLogEntryLimitEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmConfigLogEntryLimit", "1.3.6.1.2.1.92.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmConfigLogAdminStatusEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmConfigLogAdminStatusEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmConfigLogAdminStatus", "1.3.6.1.2.1.92.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmConfigLogOperStatusEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmConfigLogOperStatusEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmConfigLogOperStatus", "1.3.6.1.2.1.92.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmConfigLogStorageTypeEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmConfigLogStorageTypeEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmConfigLogStorageType", "1.3.6.1.2.1.92.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmConfigLogEntryStatusEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmConfigLogEntryStatusEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmConfigLogEntryStatus", "1.3.6.1.2.1.92.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class NlmStatsEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
            {
                /** Statistics Section*/
                public final NlmStatsGlobalNotificationsLoggedEnt nlmStatsGlobalNotificationsLogged;

                public final NlmStatsGlobalNotificationsBumpedEnt nlmStatsGlobalNotificationsBumped;

                /** Log Statistics Table*/
                public final NlmStatsLogTableEnt nlmStatsLogTable;

                private NlmStatsEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                {
                    super(mib, parent, "nlmStats", "1.3.6.1.2.1.92.1.2", false, false, false, false);
                    this.nlmStatsGlobalNotificationsLogged = new NlmStatsGlobalNotificationsLoggedEnt(mib, this);
                    this.nlmStatsGlobalNotificationsBumped = new NlmStatsGlobalNotificationsBumpedEnt(mib, this);
                    this.nlmStatsLogTable = new NlmStatsLogTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlmStatsGlobalNotificationsLogged,
                        this.nlmStatsGlobalNotificationsBumped,
                        this.nlmStatsLogTable
                    };
                }
                public static final class NlmStatsGlobalNotificationsLoggedEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NlmStatsGlobalNotificationsLoggedEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmStatsGlobalNotificationsLogged", "1.3.6.1.2.1.92.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlmStatsGlobalNotificationsBumpedEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NlmStatsGlobalNotificationsBumpedEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmStatsGlobalNotificationsBumped", "1.3.6.1.2.1.92.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NlmStatsLogTableEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    public final NlmStatsLogEntryEnt nlmStatsLogEntry;

                    private NlmStatsLogTableEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmStatsLogTable", "1.3.6.1.2.1.92.1.2.3", false, true, false, false);
                        this.nlmStatsLogEntry = new NlmStatsLogEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nlmStatsLogEntry
                        };
                    }
                    public static final class NlmStatsLogEntryEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                    {
                        public final NlmStatsLogNotificationsLoggedEnt nlmStatsLogNotificationsLogged;

                        public final NlmStatsLogNotificationsBumpedEnt nlmStatsLogNotificationsBumped;

                        private NlmStatsLogEntryEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                        {
                            super(mib, parent, "nlmStatsLogEntry", "1.3.6.1.2.1.92.1.2.3.1", false, false, false, true);
                            this.nlmStatsLogNotificationsLogged = new NlmStatsLogNotificationsLoggedEnt(mib, this);
                            this.nlmStatsLogNotificationsBumped = new NlmStatsLogNotificationsBumpedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nlmStatsLogNotificationsLogged,
                                this.nlmStatsLogNotificationsBumped
                            };
                        }
                        public static final class NlmStatsLogNotificationsLoggedEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmStatsLogNotificationsLoggedEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmStatsLogNotificationsLogged", "1.3.6.1.2.1.92.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmStatsLogNotificationsBumpedEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmStatsLogNotificationsBumpedEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmStatsLogNotificationsBumped", "1.3.6.1.2.1.92.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class NlmLogEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
            {
                /** Log Section
Log Table*/
                public final NlmLogTableEnt nlmLogTable;

                /** Log Variable Table*/
                public final NlmLogVariableTableEnt nlmLogVariableTable;

                private NlmLogEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                {
                    super(mib, parent, "nlmLog", "1.3.6.1.2.1.92.1.3", false, false, false, false);
                    this.nlmLogTable = new NlmLogTableEnt(mib, this);
                    this.nlmLogVariableTable = new NlmLogVariableTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nlmLogTable,
                        this.nlmLogVariableTable
                    };
                }
                public static final class NlmLogTableEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    public final NlmLogEntryEnt nlmLogEntry;

                    private NlmLogTableEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmLogTable", "1.3.6.1.2.1.92.1.3.1", false, true, false, false);
                        this.nlmLogEntry = new NlmLogEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nlmLogEntry
                        };
                    }
                    public static final class NlmLogEntryEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                    {
                        public final NlmLogIndexEnt nlmLogIndex;

                        public final NlmLogTimeEnt nlmLogTime;

                        public final NlmLogDateAndTimeEnt nlmLogDateAndTime;

                        public final NlmLogEngineIDEnt nlmLogEngineID;

                        public final NlmLogEngineTAddressEnt nlmLogEngineTAddress;

                        public final NlmLogEngineTDomainEnt nlmLogEngineTDomain;

                        public final NlmLogContextEngineIDEnt nlmLogContextEngineID;

                        public final NlmLogContextNameEnt nlmLogContextName;

                        public final NlmLogNotificationIDEnt nlmLogNotificationID;

                        private NlmLogEntryEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                        {
                            super(mib, parent, "nlmLogEntry", "1.3.6.1.2.1.92.1.3.1.1", false, false, false, true);
                            this.nlmLogIndex = new NlmLogIndexEnt(mib, this);
                            this.nlmLogTime = new NlmLogTimeEnt(mib, this);
                            this.nlmLogDateAndTime = new NlmLogDateAndTimeEnt(mib, this);
                            this.nlmLogEngineID = new NlmLogEngineIDEnt(mib, this);
                            this.nlmLogEngineTAddress = new NlmLogEngineTAddressEnt(mib, this);
                            this.nlmLogEngineTDomain = new NlmLogEngineTDomainEnt(mib, this);
                            this.nlmLogContextEngineID = new NlmLogContextEngineIDEnt(mib, this);
                            this.nlmLogContextName = new NlmLogContextNameEnt(mib, this);
                            this.nlmLogNotificationID = new NlmLogNotificationIDEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nlmLogIndex,
                                this.nlmLogTime,
                                this.nlmLogDateAndTime,
                                this.nlmLogEngineID,
                                this.nlmLogEngineTAddress,
                                this.nlmLogEngineTDomain,
                                this.nlmLogContextEngineID,
                                this.nlmLogContextName,
                                this.nlmLogNotificationID
                            };
                        }
                        public static final class NlmLogIndexEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogIndexEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogIndex", "1.3.6.1.2.1.92.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogTimeEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogTimeEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogTime", "1.3.6.1.2.1.92.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogDateAndTimeEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogDateAndTimeEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogDateAndTime", "1.3.6.1.2.1.92.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogEngineIDEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogEngineIDEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogEngineID", "1.3.6.1.2.1.92.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogEngineTAddressEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogEngineTAddressEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogEngineTAddress", "1.3.6.1.2.1.92.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogEngineTDomainEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogEngineTDomainEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogEngineTDomain", "1.3.6.1.2.1.92.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogContextEngineIDEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogContextEngineIDEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogContextEngineID", "1.3.6.1.2.1.92.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogContextNameEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogContextNameEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogContextName", "1.3.6.1.2.1.92.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogNotificationIDEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogNotificationIDEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogNotificationID", "1.3.6.1.2.1.92.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NlmLogVariableTableEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    public final NlmLogVariableEntryEnt nlmLogVariableEntry;

                    private NlmLogVariableTableEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "nlmLogVariableTable", "1.3.6.1.2.1.92.1.3.2", false, true, false, false);
                        this.nlmLogVariableEntry = new NlmLogVariableEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nlmLogVariableEntry
                        };
                    }
                    public static final class NlmLogVariableEntryEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                    {
                        public final NlmLogVariableIndexEnt nlmLogVariableIndex;

                        public final NlmLogVariableIDEnt nlmLogVariableID;

                        public final NlmLogVariableValueTypeEnt nlmLogVariableValueType;

                        public final NlmLogVariableCounter32ValEnt nlmLogVariableCounter32Val;

                        public final NlmLogVariableUnsigned32ValEnt nlmLogVariableUnsigned32Val;

                        public final NlmLogVariableTimeTicksValEnt nlmLogVariableTimeTicksVal;

                        public final NlmLogVariableInteger32ValEnt nlmLogVariableInteger32Val;

                        public final NlmLogVariableOctetStringValEnt nlmLogVariableOctetStringVal;

                        public final NlmLogVariableIpAddressValEnt nlmLogVariableIpAddressVal;

                        public final NlmLogVariableOidValEnt nlmLogVariableOidVal;

                        public final NlmLogVariableCounter64ValEnt nlmLogVariableCounter64Val;

                        public final NlmLogVariableOpaqueValEnt nlmLogVariableOpaqueVal;

                        private NlmLogVariableEntryEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                        {
                            super(mib, parent, "nlmLogVariableEntry", "1.3.6.1.2.1.92.1.3.2.1", false, false, false, true);
                            this.nlmLogVariableIndex = new NlmLogVariableIndexEnt(mib, this);
                            this.nlmLogVariableID = new NlmLogVariableIDEnt(mib, this);
                            this.nlmLogVariableValueType = new NlmLogVariableValueTypeEnt(mib, this);
                            this.nlmLogVariableCounter32Val = new NlmLogVariableCounter32ValEnt(mib, this);
                            this.nlmLogVariableUnsigned32Val = new NlmLogVariableUnsigned32ValEnt(mib, this);
                            this.nlmLogVariableTimeTicksVal = new NlmLogVariableTimeTicksValEnt(mib, this);
                            this.nlmLogVariableInteger32Val = new NlmLogVariableInteger32ValEnt(mib, this);
                            this.nlmLogVariableOctetStringVal = new NlmLogVariableOctetStringValEnt(mib, this);
                            this.nlmLogVariableIpAddressVal = new NlmLogVariableIpAddressValEnt(mib, this);
                            this.nlmLogVariableOidVal = new NlmLogVariableOidValEnt(mib, this);
                            this.nlmLogVariableCounter64Val = new NlmLogVariableCounter64ValEnt(mib, this);
                            this.nlmLogVariableOpaqueVal = new NlmLogVariableOpaqueValEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nlmLogVariableIndex,
                                this.nlmLogVariableID,
                                this.nlmLogVariableValueType,
                                this.nlmLogVariableCounter32Val,
                                this.nlmLogVariableUnsigned32Val,
                                this.nlmLogVariableTimeTicksVal,
                                this.nlmLogVariableInteger32Val,
                                this.nlmLogVariableOctetStringVal,
                                this.nlmLogVariableIpAddressVal,
                                this.nlmLogVariableOidVal,
                                this.nlmLogVariableCounter64Val,
                                this.nlmLogVariableOpaqueVal
                            };
                        }
                        public static final class NlmLogVariableIndexEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableIndexEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableIndex", "1.3.6.1.2.1.92.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableIDEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableIDEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableID", "1.3.6.1.2.1.92.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableValueTypeEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableValueTypeEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableValueType", "1.3.6.1.2.1.92.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableCounter32ValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableCounter32ValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableCounter32Val", "1.3.6.1.2.1.92.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableUnsigned32ValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableUnsigned32ValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableUnsigned32Val", "1.3.6.1.2.1.92.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableTimeTicksValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableTimeTicksValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableTimeTicksVal", "1.3.6.1.2.1.92.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableInteger32ValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableInteger32ValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableInteger32Val", "1.3.6.1.2.1.92.1.3.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableOctetStringValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableOctetStringValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableOctetStringVal", "1.3.6.1.2.1.92.1.3.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableIpAddressValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableIpAddressValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableIpAddressVal", "1.3.6.1.2.1.92.1.3.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableOidValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableOidValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableOidVal", "1.3.6.1.2.1.92.1.3.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableCounter64ValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableCounter64ValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableCounter64Val", "1.3.6.1.2.1.92.1.3.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NlmLogVariableOpaqueValEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                        {
                            private NlmLogVariableOpaqueValEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                            {
                                super(mib, parent, "nlmLogVariableOpaqueVal", "1.3.6.1.2.1.92.1.3.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class NotificationLogMIBConformanceEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
        {
            public final NotificationLogMIBCompliancesEnt notificationLogMIBCompliances;

            public final NotificationLogMIBGroupsEnt notificationLogMIBGroups;

            private NotificationLogMIBConformanceEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
            {
                super(mib, parent, "notificationLogMIBConformance", "1.3.6.1.2.1.92.3", false, false, false, false);
                this.notificationLogMIBCompliances = new NotificationLogMIBCompliancesEnt(mib, this);
                this.notificationLogMIBGroups = new NotificationLogMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.notificationLogMIBCompliances,
                    this.notificationLogMIBGroups
                };
            }
            public static final class NotificationLogMIBCompliancesEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
            {
                /** Compliance*/
                public final NotificationLogMIBComplianceEnt notificationLogMIBCompliance;

                private NotificationLogMIBCompliancesEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                {
                    super(mib, parent, "notificationLogMIBCompliances", "1.3.6.1.2.1.92.3.1", false, false, false, false);
                    this.notificationLogMIBCompliance = new NotificationLogMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.notificationLogMIBCompliance
                    };
                }
                public static final class NotificationLogMIBComplianceEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NotificationLogMIBComplianceEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "notificationLogMIBCompliance", "1.3.6.1.2.1.92.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class NotificationLogMIBGroupsEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
            {
                /** Units of Conformance*/
                public final NotificationLogConfigGroupEnt notificationLogConfigGroup;

                public final NotificationLogStatsGroupEnt notificationLogStatsGroup;

                public final NotificationLogLogGroupEnt notificationLogLogGroup;

                public final NotificationLogDateGroupEnt notificationLogDateGroup;

                private NotificationLogMIBGroupsEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                {
                    super(mib, parent, "notificationLogMIBGroups", "1.3.6.1.2.1.92.3.2", false, false, false, false);
                    this.notificationLogConfigGroup = new NotificationLogConfigGroupEnt(mib, this);
                    this.notificationLogStatsGroup = new NotificationLogStatsGroupEnt(mib, this);
                    this.notificationLogLogGroup = new NotificationLogLogGroupEnt(mib, this);
                    this.notificationLogDateGroup = new NotificationLogDateGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.notificationLogConfigGroup,
                        this.notificationLogStatsGroup,
                        this.notificationLogLogGroup,
                        this.notificationLogDateGroup
                    };
                }
                public static final class NotificationLogConfigGroupEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NotificationLogConfigGroupEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "notificationLogConfigGroup", "1.3.6.1.2.1.92.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NotificationLogStatsGroupEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NotificationLogStatsGroupEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "notificationLogStatsGroup", "1.3.6.1.2.1.92.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NotificationLogLogGroupEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NotificationLogLogGroupEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "notificationLogLogGroup", "1.3.6.1.2.1.92.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NotificationLogDateGroupEnt extends MIBEntry<NOTIFICATIONLOGMIBDef>
                {
                    private NotificationLogDateGroupEnt(NOTIFICATIONLOGMIBDef mib, MIBEntry<NOTIFICATIONLOGMIBDef> parent)
                    {
                        super(mib, parent, "notificationLogDateGroup", "1.3.6.1.2.1.92.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
