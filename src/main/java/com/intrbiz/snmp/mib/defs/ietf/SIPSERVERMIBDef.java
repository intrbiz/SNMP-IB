package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 2578
RFC 2579
RFC 2580
RFC 3411
RFC 2788*/
public final class SIPSERVERMIBDef extends MIB
{
    public static final SIPSERVERMIBDef SIPSERVERMIB = new SIPSERVERMIBDef();

    static { MIBs.getInstance().registerMIB(SIPSERVERMIBDef.SIPSERVERMIB); }

    /** RFC 4001*/
    public final SipServerMIBEnt sipServerMIB;

    private SIPSERVERMIBDef()
    {
        super("SIP-SERVER-MIB");
        this.sipServerMIB = new SipServerMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sipServerMIB
        };
    }

    public static final class SipServerMIBEnt extends MIBEntry<SIPSERVERMIBDef>
    {
        /** Top-Level Components of this MIB.*/
        public final SipServerMIBObjectsEnt sipServerMIBObjects;

        public final SipServerMIBConformanceEnt sipServerMIBConformance;

        private SipServerMIBEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
        {
            super(mib, parent, "sipServerMIB", "1.3.6.1.2.1.151", false, false, false, false);
            this.sipServerMIBObjects = new SipServerMIBObjectsEnt(mib, this);
            this.sipServerMIBConformance = new SipServerMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sipServerMIBObjects,
                this.sipServerMIBConformance
            };
        }
        public static final class SipServerMIBObjectsEnt extends MIBEntry<SIPSERVERMIBDef>
        {
            /** These groups contain objects common to all SIP servers.*/
            public final SipServerCfgEnt sipServerCfg;

            /** This group contains MIB objectsrelated to SIP Proxy Servers.*/
            public final SipServerProxyCfgEnt sipServerProxyCfg;

            public final SipServerProxyStatsEnt sipServerProxyStats;

            /** This group contains MIB objects related to SIP Registrars.*/
            public final SipServerRegCfgEnt sipServerRegCfg;

            public final SipServerRegStatsEnt sipServerRegStats;

            private SipServerMIBObjectsEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
            {
                super(mib, parent, "sipServerMIBObjects", "1.3.6.1.2.1.151.1", false, false, false, false);
                this.sipServerCfg = new SipServerCfgEnt(mib, this);
                this.sipServerProxyCfg = new SipServerProxyCfgEnt(mib, this);
                this.sipServerProxyStats = new SipServerProxyStatsEnt(mib, this);
                this.sipServerRegCfg = new SipServerRegCfgEnt(mib, this);
                this.sipServerRegStats = new SipServerRegStatsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipServerCfg,
                    this.sipServerProxyCfg,
                    this.sipServerProxyStats,
                    this.sipServerRegCfg,
                    this.sipServerRegStats
                };
            }
            public static final class SipServerCfgEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Common Server Configuration Objects*/
                public final SipServerCfgTableEnt sipServerCfgTable;

                private SipServerCfgEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerCfg", "1.3.6.1.2.1.151.1.1", false, false, false, false);
                    this.sipServerCfgTable = new SipServerCfgTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerCfgTable
                    };
                }
                public static final class SipServerCfgTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerCfgEntryEnt sipServerCfgEntry;

                    private SipServerCfgTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerCfgTable", "1.3.6.1.2.1.151.1.1.1", false, true, false, false);
                        this.sipServerCfgEntry = new SipServerCfgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerCfgEntry
                        };
                    }
                    public static final class SipServerCfgEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerCfgHostAddressTypeEnt sipServerCfgHostAddressType;

                        public final SipServerCfgHostAddressEnt sipServerCfgHostAddress;

                        private SipServerCfgEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerCfgEntry", "1.3.6.1.2.1.151.1.1.1.1", false, false, false, true);
                            this.sipServerCfgHostAddressType = new SipServerCfgHostAddressTypeEnt(mib, this);
                            this.sipServerCfgHostAddress = new SipServerCfgHostAddressEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerCfgHostAddressType,
                                this.sipServerCfgHostAddress
                            };
                        }
                        public static final class SipServerCfgHostAddressTypeEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgHostAddressTypeEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgHostAddressType", "1.3.6.1.2.1.151.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerCfgHostAddressEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgHostAddressEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgHostAddress", "1.3.6.1.2.1.151.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipServerProxyCfgEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Proxy Server Configuration*/
                public final SipServerProxyCfgTableEnt sipServerProxyCfgTable;

                private SipServerProxyCfgEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerProxyCfg", "1.3.6.1.2.1.151.1.3", false, false, false, false);
                    this.sipServerProxyCfgTable = new SipServerProxyCfgTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerProxyCfgTable
                    };
                }
                public static final class SipServerProxyCfgTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerProxyCfgEntryEnt sipServerProxyCfgEntry;

                    private SipServerProxyCfgTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerProxyCfgTable", "1.3.6.1.2.1.151.1.3.1", false, true, false, false);
                        this.sipServerProxyCfgEntry = new SipServerProxyCfgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerProxyCfgEntry
                        };
                    }
                    public static final class SipServerProxyCfgEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerCfgProxyStatefulnessEnt sipServerCfgProxyStatefulness;

                        public final SipServerCfgProxyRecursionEnt sipServerCfgProxyRecursion;

                        public final SipServerCfgProxyRecordRouteEnt sipServerCfgProxyRecordRoute;

                        /** Security*/
                        public final SipServerCfgProxyAuthMethodEnt sipServerCfgProxyAuthMethod;

                        public final SipServerCfgProxyAuthDefaultRealmEnt sipServerCfgProxyAuthDefaultRealm;

                        private SipServerProxyCfgEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerProxyCfgEntry", "1.3.6.1.2.1.151.1.3.1.1", false, false, false, true);
                            this.sipServerCfgProxyStatefulness = new SipServerCfgProxyStatefulnessEnt(mib, this);
                            this.sipServerCfgProxyRecursion = new SipServerCfgProxyRecursionEnt(mib, this);
                            this.sipServerCfgProxyRecordRoute = new SipServerCfgProxyRecordRouteEnt(mib, this);
                            this.sipServerCfgProxyAuthMethod = new SipServerCfgProxyAuthMethodEnt(mib, this);
                            this.sipServerCfgProxyAuthDefaultRealm = new SipServerCfgProxyAuthDefaultRealmEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerCfgProxyStatefulness,
                                this.sipServerCfgProxyRecursion,
                                this.sipServerCfgProxyRecordRoute,
                                this.sipServerCfgProxyAuthMethod,
                                this.sipServerCfgProxyAuthDefaultRealm
                            };
                        }
                        public static final class SipServerCfgProxyStatefulnessEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgProxyStatefulnessEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgProxyStatefulness", "1.3.6.1.2.1.151.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerCfgProxyRecursionEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgProxyRecursionEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgProxyRecursion", "1.3.6.1.2.1.151.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerCfgProxyRecordRouteEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgProxyRecordRouteEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgProxyRecordRoute", "1.3.6.1.2.1.151.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerCfgProxyAuthMethodEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgProxyAuthMethodEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgProxyAuthMethod", "1.3.6.1.2.1.151.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerCfgProxyAuthDefaultRealmEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerCfgProxyAuthDefaultRealmEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerCfgProxyAuthDefaultRealm", "1.3.6.1.2.1.151.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipServerProxyStatsEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Proxy Server Statistics*/
                public final SipServerProxyStatsTableEnt sipServerProxyStatsTable;

                private SipServerProxyStatsEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerProxyStats", "1.3.6.1.2.1.151.1.4", false, false, false, false);
                    this.sipServerProxyStatsTable = new SipServerProxyStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerProxyStatsTable
                    };
                }
                public static final class SipServerProxyStatsTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerProxyStatsEntryEnt sipServerProxyStatsEntry;

                    private SipServerProxyStatsTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerProxyStatsTable", "1.3.6.1.2.1.151.1.4.1", false, true, false, false);
                        this.sipServerProxyStatsEntry = new SipServerProxyStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerProxyStatsEntry
                        };
                    }
                    public static final class SipServerProxyStatsEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerProxyStatProxyReqFailuresEnt sipServerProxyStatProxyReqFailures;

                        public final SipServerProxyStatsDisconTimeEnt sipServerProxyStatsDisconTime;

                        private SipServerProxyStatsEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerProxyStatsEntry", "1.3.6.1.2.1.151.1.4.1.1", false, false, false, true);
                            this.sipServerProxyStatProxyReqFailures = new SipServerProxyStatProxyReqFailuresEnt(mib, this);
                            this.sipServerProxyStatsDisconTime = new SipServerProxyStatsDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerProxyStatProxyReqFailures,
                                this.sipServerProxyStatsDisconTime
                            };
                        }
                        public static final class SipServerProxyStatProxyReqFailuresEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerProxyStatProxyReqFailuresEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerProxyStatProxyReqFailures", "1.3.6.1.2.1.151.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerProxyStatsDisconTimeEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerProxyStatsDisconTimeEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerProxyStatsDisconTime", "1.3.6.1.2.1.151.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipServerRegCfgEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Registrar Configuration*/
                public final SipServerRegCfgTableEnt sipServerRegCfgTable;

                /** Per User Information*/
                public final SipServerRegUserTableEnt sipServerRegUserTable;

                /** Per Contact Information*/
                public final SipServerRegContactTableEnt sipServerRegContactTable;

                private SipServerRegCfgEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerRegCfg", "1.3.6.1.2.1.151.1.5", false, false, false, false);
                    this.sipServerRegCfgTable = new SipServerRegCfgTableEnt(mib, this);
                    this.sipServerRegUserTable = new SipServerRegUserTableEnt(mib, this);
                    this.sipServerRegContactTable = new SipServerRegContactTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerRegCfgTable,
                        this.sipServerRegUserTable,
                        this.sipServerRegContactTable
                    };
                }
                public static final class SipServerRegCfgTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerRegCfgEntryEnt sipServerRegCfgEntry;

                    private SipServerRegCfgTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegCfgTable", "1.3.6.1.2.1.151.1.5.1", false, true, false, false);
                        this.sipServerRegCfgEntry = new SipServerRegCfgEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerRegCfgEntry
                        };
                    }
                    public static final class SipServerRegCfgEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerRegMaxContactExpiryDurationEnt sipServerRegMaxContactExpiryDuration;

                        public final SipServerRegMaxUsersEnt sipServerRegMaxUsers;

                        public final SipServerRegCurrentUsersEnt sipServerRegCurrentUsers;

                        public final SipServerRegDfltRegActiveIntervalEnt sipServerRegDfltRegActiveInterval;

                        private SipServerRegCfgEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerRegCfgEntry", "1.3.6.1.2.1.151.1.5.1.1", false, false, false, true);
                            this.sipServerRegMaxContactExpiryDuration = new SipServerRegMaxContactExpiryDurationEnt(mib, this);
                            this.sipServerRegMaxUsers = new SipServerRegMaxUsersEnt(mib, this);
                            this.sipServerRegCurrentUsers = new SipServerRegCurrentUsersEnt(mib, this);
                            this.sipServerRegDfltRegActiveInterval = new SipServerRegDfltRegActiveIntervalEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerRegMaxContactExpiryDuration,
                                this.sipServerRegMaxUsers,
                                this.sipServerRegCurrentUsers,
                                this.sipServerRegDfltRegActiveInterval
                            };
                        }
                        public static final class SipServerRegMaxContactExpiryDurationEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegMaxContactExpiryDurationEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegMaxContactExpiryDuration", "1.3.6.1.2.1.151.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegMaxUsersEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegMaxUsersEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegMaxUsers", "1.3.6.1.2.1.151.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegCurrentUsersEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegCurrentUsersEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegCurrentUsers", "1.3.6.1.2.1.151.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegDfltRegActiveIntervalEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegDfltRegActiveIntervalEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegDfltRegActiveInterval", "1.3.6.1.2.1.151.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SipServerRegUserTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerRegUserEntryEnt sipServerRegUserEntry;

                    private SipServerRegUserTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegUserTable", "1.3.6.1.2.1.151.1.5.2", false, true, false, false);
                        this.sipServerRegUserEntry = new SipServerRegUserEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerRegUserEntry
                        };
                    }
                    public static final class SipServerRegUserEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerRegUserIndexEnt sipServerRegUserIndex;

                        public final SipServerRegUserUriEnt sipServerRegUserUri;

                        public final SipServerRegUserAuthenticationFailuresEnt sipServerRegUserAuthenticationFailures;

                        public final SipServerRegUserDisconTimeEnt sipServerRegUserDisconTime;

                        private SipServerRegUserEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerRegUserEntry", "1.3.6.1.2.1.151.1.5.2.1", false, false, false, true);
                            this.sipServerRegUserIndex = new SipServerRegUserIndexEnt(mib, this);
                            this.sipServerRegUserUri = new SipServerRegUserUriEnt(mib, this);
                            this.sipServerRegUserAuthenticationFailures = new SipServerRegUserAuthenticationFailuresEnt(mib, this);
                            this.sipServerRegUserDisconTime = new SipServerRegUserDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerRegUserIndex,
                                this.sipServerRegUserUri,
                                this.sipServerRegUserAuthenticationFailures,
                                this.sipServerRegUserDisconTime
                            };
                        }
                        public static final class SipServerRegUserIndexEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegUserIndexEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegUserIndex", "1.3.6.1.2.1.151.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegUserUriEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegUserUriEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegUserUri", "1.3.6.1.2.1.151.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegUserAuthenticationFailuresEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegUserAuthenticationFailuresEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegUserAuthenticationFailures", "1.3.6.1.2.1.151.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegUserDisconTimeEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegUserDisconTimeEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegUserDisconTime", "1.3.6.1.2.1.151.1.5.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SipServerRegContactTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerRegContactEntryEnt sipServerRegContactEntry;

                    private SipServerRegContactTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegContactTable", "1.3.6.1.2.1.151.1.5.3", false, true, false, false);
                        this.sipServerRegContactEntry = new SipServerRegContactEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerRegContactEntry
                        };
                    }
                    public static final class SipServerRegContactEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerRegContactIndexEnt sipServerRegContactIndex;

                        public final SipServerRegContactDisplayNameEnt sipServerRegContactDisplayName;

                        public final SipServerRegContactURIEnt sipServerRegContactURI;

                        public final SipServerRegContactLastUpdatedEnt sipServerRegContactLastUpdated;

                        public final SipServerRegContactExpiryEnt sipServerRegContactExpiry;

                        public final SipServerRegContactPreferenceEnt sipServerRegContactPreference;

                        private SipServerRegContactEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerRegContactEntry", "1.3.6.1.2.1.151.1.5.3.1", false, false, false, true);
                            this.sipServerRegContactIndex = new SipServerRegContactIndexEnt(mib, this);
                            this.sipServerRegContactDisplayName = new SipServerRegContactDisplayNameEnt(mib, this);
                            this.sipServerRegContactURI = new SipServerRegContactURIEnt(mib, this);
                            this.sipServerRegContactLastUpdated = new SipServerRegContactLastUpdatedEnt(mib, this);
                            this.sipServerRegContactExpiry = new SipServerRegContactExpiryEnt(mib, this);
                            this.sipServerRegContactPreference = new SipServerRegContactPreferenceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerRegContactIndex,
                                this.sipServerRegContactDisplayName,
                                this.sipServerRegContactURI,
                                this.sipServerRegContactLastUpdated,
                                this.sipServerRegContactExpiry,
                                this.sipServerRegContactPreference
                            };
                        }
                        public static final class SipServerRegContactIndexEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegContactIndexEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegContactIndex", "1.3.6.1.2.1.151.1.5.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegContactDisplayNameEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegContactDisplayNameEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegContactDisplayName", "1.3.6.1.2.1.151.1.5.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegContactURIEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegContactURIEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegContactURI", "1.3.6.1.2.1.151.1.5.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegContactLastUpdatedEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegContactLastUpdatedEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegContactLastUpdated", "1.3.6.1.2.1.151.1.5.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegContactExpiryEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegContactExpiryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegContactExpiry", "1.3.6.1.2.1.151.1.5.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegContactPreferenceEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegContactPreferenceEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegContactPreference", "1.3.6.1.2.1.151.1.5.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SipServerRegStatsEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Registrar Statistics*/
                public final SipServerRegStatsTableEnt sipServerRegStatsTable;

                private SipServerRegStatsEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerRegStats", "1.3.6.1.2.1.151.1.6", false, false, false, false);
                    this.sipServerRegStatsTable = new SipServerRegStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerRegStatsTable
                    };
                }
                public static final class SipServerRegStatsTableEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    public final SipServerRegStatsEntryEnt sipServerRegStatsEntry;

                    private SipServerRegStatsTableEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegStatsTable", "1.3.6.1.2.1.151.1.6.1", false, true, false, false);
                        this.sipServerRegStatsEntry = new SipServerRegStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipServerRegStatsEntry
                        };
                    }
                    public static final class SipServerRegStatsEntryEnt extends MIBEntry<SIPSERVERMIBDef>
                    {
                        public final SipServerRegStatsAcceptedRegsEnt sipServerRegStatsAcceptedRegs;

                        public final SipServerRegStatsRejectedRegsEnt sipServerRegStatsRejectedRegs;

                        public final SipServerRegStatsDisconTimeEnt sipServerRegStatsDisconTime;

                        private SipServerRegStatsEntryEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                        {
                            super(mib, parent, "sipServerRegStatsEntry", "1.3.6.1.2.1.151.1.6.1.1", false, false, false, true);
                            this.sipServerRegStatsAcceptedRegs = new SipServerRegStatsAcceptedRegsEnt(mib, this);
                            this.sipServerRegStatsRejectedRegs = new SipServerRegStatsRejectedRegsEnt(mib, this);
                            this.sipServerRegStatsDisconTime = new SipServerRegStatsDisconTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipServerRegStatsAcceptedRegs,
                                this.sipServerRegStatsRejectedRegs,
                                this.sipServerRegStatsDisconTime
                            };
                        }
                        public static final class SipServerRegStatsAcceptedRegsEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegStatsAcceptedRegsEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegStatsAcceptedRegs", "1.3.6.1.2.1.151.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegStatsRejectedRegsEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegStatsRejectedRegsEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegStatsRejectedRegs", "1.3.6.1.2.1.151.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipServerRegStatsDisconTimeEnt extends MIBEntry<SIPSERVERMIBDef>
                        {
                            private SipServerRegStatsDisconTimeEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                            {
                                super(mib, parent, "sipServerRegStatsDisconTime", "1.3.6.1.2.1.151.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SipServerMIBConformanceEnt extends MIBEntry<SIPSERVERMIBDef>
        {
            /** Conformance*/
            public final SipServerMIBCompliancesEnt sipServerMIBCompliances;

            public final SipServerMIBGroupsEnt sipServerMIBGroups;

            private SipServerMIBConformanceEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
            {
                super(mib, parent, "sipServerMIBConformance", "1.3.6.1.2.1.151.2", false, false, false, false);
                this.sipServerMIBCompliances = new SipServerMIBCompliancesEnt(mib, this);
                this.sipServerMIBGroups = new SipServerMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipServerMIBCompliances,
                    this.sipServerMIBGroups
                };
            }
            public static final class SipServerMIBCompliancesEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Compliance Statements*/
                public final SipServerProxyServerComplianceEnt sipServerProxyServerCompliance;

                public final SipRedirectServerComplianceEnt sipRedirectServerCompliance;

                public final SipServerRegistrarServerComplianceEnt sipServerRegistrarServerCompliance;

                private SipServerMIBCompliancesEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerMIBCompliances", "1.3.6.1.2.1.151.2.1", false, false, false, false);
                    this.sipServerProxyServerCompliance = new SipServerProxyServerComplianceEnt(mib, this);
                    this.sipRedirectServerCompliance = new SipRedirectServerComplianceEnt(mib, this);
                    this.sipServerRegistrarServerCompliance = new SipServerRegistrarServerComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerProxyServerCompliance,
                        this.sipRedirectServerCompliance,
                        this.sipServerRegistrarServerCompliance
                    };
                }
                public static final class SipServerProxyServerComplianceEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerProxyServerComplianceEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerProxyServerCompliance", "1.3.6.1.2.1.151.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipRedirectServerComplianceEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipRedirectServerComplianceEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipRedirectServerCompliance", "1.3.6.1.2.1.151.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipServerRegistrarServerComplianceEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerRegistrarServerComplianceEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegistrarServerCompliance", "1.3.6.1.2.1.151.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SipServerMIBGroupsEnt extends MIBEntry<SIPSERVERMIBDef>
            {
                /** Units of Conformance*/
                public final SipServerConfigGroupEnt sipServerConfigGroup;

                public final SipServerProxyConfigGroupEnt sipServerProxyConfigGroup;

                public final SipServerProxyStatsGroupEnt sipServerProxyStatsGroup;

                public final SipServerRegistrarConfigGroupEnt sipServerRegistrarConfigGroup;

                public final SipServerRegistrarStatsGroupEnt sipServerRegistrarStatsGroup;

                public final SipServerRegistrarUsersGroupEnt sipServerRegistrarUsersGroup;

                private SipServerMIBGroupsEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                {
                    super(mib, parent, "sipServerMIBGroups", "1.3.6.1.2.1.151.2.2", false, false, false, false);
                    this.sipServerConfigGroup = new SipServerConfigGroupEnt(mib, this);
                    this.sipServerProxyConfigGroup = new SipServerProxyConfigGroupEnt(mib, this);
                    this.sipServerProxyStatsGroup = new SipServerProxyStatsGroupEnt(mib, this);
                    this.sipServerRegistrarConfigGroup = new SipServerRegistrarConfigGroupEnt(mib, this);
                    this.sipServerRegistrarStatsGroup = new SipServerRegistrarStatsGroupEnt(mib, this);
                    this.sipServerRegistrarUsersGroup = new SipServerRegistrarUsersGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipServerConfigGroup,
                        this.sipServerProxyConfigGroup,
                        this.sipServerProxyStatsGroup,
                        this.sipServerRegistrarConfigGroup,
                        this.sipServerRegistrarStatsGroup,
                        this.sipServerRegistrarUsersGroup
                    };
                }
                public static final class SipServerConfigGroupEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerConfigGroupEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerConfigGroup", "1.3.6.1.2.1.151.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipServerProxyConfigGroupEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerProxyConfigGroupEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerProxyConfigGroup", "1.3.6.1.2.1.151.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipServerProxyStatsGroupEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerProxyStatsGroupEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerProxyStatsGroup", "1.3.6.1.2.1.151.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipServerRegistrarConfigGroupEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerRegistrarConfigGroupEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegistrarConfigGroup", "1.3.6.1.2.1.151.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipServerRegistrarStatsGroupEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerRegistrarStatsGroupEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegistrarStatsGroup", "1.3.6.1.2.1.151.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipServerRegistrarUsersGroupEnt extends MIBEntry<SIPSERVERMIBDef>
                {
                    private SipServerRegistrarUsersGroupEnt(SIPSERVERMIBDef mib, MIBEntry<SIPSERVERMIBDef> parent)
                    {
                        super(mib, parent, "sipServerRegistrarUsersGroup", "1.3.6.1.2.1.151.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
