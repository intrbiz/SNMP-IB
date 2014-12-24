package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DNSRESOLVERMIBDef extends MIB
{
    public static final DNSRESOLVERMIBDef DNSRESOLVERMIB = new DNSRESOLVERMIBDef();

    /** DNS Resolver MIB*/
    public final DnsResMIBEnt dnsResMIB;

    private DNSRESOLVERMIBDef()
    {
        super("DNS-RESOLVER-MIB");
        this.dnsResMIB = new DnsResMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dnsResMIB
        };
    }

    public static final class DnsResMIBEnt extends MIBEntry<DNSRESOLVERMIBDef>
    {
        public final DnsResMIBObjectsEnt dnsResMIBObjects;

        /** SNMPv2 groups.*/
        public final DnsResMIBGroupsEnt dnsResMIBGroups;

        /** Compliances.*/
        public final DnsResMIBCompliancesEnt dnsResMIBCompliances;

        private DnsResMIBEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
        {
            super(mib, parent, "dnsResMIB", "1.3.6.1.2.1.32.2", false, false, false, false);
            this.dnsResMIBObjects = new DnsResMIBObjectsEnt(mib, this);
            this.dnsResMIBGroups = new DnsResMIBGroupsEnt(mib, this);
            this.dnsResMIBCompliances = new DnsResMIBCompliancesEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dnsResMIBObjects,
                this.dnsResMIBGroups,
                this.dnsResMIBCompliances
            };
        }
        public static final class DnsResMIBObjectsEnt extends MIBEntry<DNSRESOLVERMIBDef>
        {
            /** (Old-style) groups in the DNS resolver MIB.*/
            public final DnsResConfigEnt dnsResConfig;

            public final DnsResCounterEnt dnsResCounter;

            public final DnsResLameDelegationEnt dnsResLameDelegation;

            public final DnsResCacheEnt dnsResCache;

            public final DnsResNCacheEnt dnsResNCache;

            public final DnsResOptCounterEnt dnsResOptCounter;

            private DnsResMIBObjectsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
            {
                super(mib, parent, "dnsResMIBObjects", "1.3.6.1.2.1.32.2.1", false, false, false, false);
                this.dnsResConfig = new DnsResConfigEnt(mib, this);
                this.dnsResCounter = new DnsResCounterEnt(mib, this);
                this.dnsResLameDelegation = new DnsResLameDelegationEnt(mib, this);
                this.dnsResCache = new DnsResCacheEnt(mib, this);
                this.dnsResNCache = new DnsResNCacheEnt(mib, this);
                this.dnsResOptCounter = new DnsResOptCounterEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dnsResConfig,
                    this.dnsResCounter,
                    this.dnsResLameDelegation,
                    this.dnsResCache,
                    this.dnsResNCache,
                    this.dnsResOptCounter
                };
            }
            public static final class DnsResConfigEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                /** Resolver Configuration Group*/
                public final DnsResConfigImplementIdentEnt dnsResConfigImplementIdent;

                public final DnsResConfigServiceEnt dnsResConfigService;

                public final DnsResConfigMaxCnamesEnt dnsResConfigMaxCnames;

                /** DNS Resolver Safety Belt Table*/
                public final DnsResConfigSbeltTableEnt dnsResConfigSbeltTable;

                public final DnsResConfigUpTimeEnt dnsResConfigUpTime;

                public final DnsResConfigResetTimeEnt dnsResConfigResetTime;

                public final DnsResConfigResetEnt dnsResConfigReset;

                private DnsResConfigEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResConfig", "1.3.6.1.2.1.32.2.1.1", false, false, false, false);
                    this.dnsResConfigImplementIdent = new DnsResConfigImplementIdentEnt(mib, this);
                    this.dnsResConfigService = new DnsResConfigServiceEnt(mib, this);
                    this.dnsResConfigMaxCnames = new DnsResConfigMaxCnamesEnt(mib, this);
                    this.dnsResConfigSbeltTable = new DnsResConfigSbeltTableEnt(mib, this);
                    this.dnsResConfigUpTime = new DnsResConfigUpTimeEnt(mib, this);
                    this.dnsResConfigResetTime = new DnsResConfigResetTimeEnt(mib, this);
                    this.dnsResConfigReset = new DnsResConfigResetEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsResConfigImplementIdent,
                        this.dnsResConfigService,
                        this.dnsResConfigMaxCnames,
                        this.dnsResConfigSbeltTable,
                        this.dnsResConfigUpTime,
                        this.dnsResConfigResetTime,
                        this.dnsResConfigReset
                    };
                }
                public static final class DnsResConfigImplementIdentEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResConfigImplementIdentEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigImplementIdent", "1.3.6.1.2.1.32.2.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResConfigServiceEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResConfigServiceEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigService", "1.3.6.1.2.1.32.2.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResConfigMaxCnamesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResConfigMaxCnamesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigMaxCnames", "1.3.6.1.2.1.32.2.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResConfigSbeltTableEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    public final DnsResConfigSbeltEntryEnt dnsResConfigSbeltEntry;

                    private DnsResConfigSbeltTableEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigSbeltTable", "1.3.6.1.2.1.32.2.1.1.4", false, true, false, false);
                        this.dnsResConfigSbeltEntry = new DnsResConfigSbeltEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsResConfigSbeltEntry
                        };
                    }
                    public static final class DnsResConfigSbeltEntryEnt extends MIBEntry<DNSRESOLVERMIBDef>
                    {
                        public final DnsResConfigSbeltAddrEnt dnsResConfigSbeltAddr;

                        public final DnsResConfigSbeltNameEnt dnsResConfigSbeltName;

                        public final DnsResConfigSbeltRecursionEnt dnsResConfigSbeltRecursion;

                        public final DnsResConfigSbeltPrefEnt dnsResConfigSbeltPref;

                        public final DnsResConfigSbeltSubTreeEnt dnsResConfigSbeltSubTree;

                        public final DnsResConfigSbeltClassEnt dnsResConfigSbeltClass;

                        public final DnsResConfigSbeltStatusEnt dnsResConfigSbeltStatus;

                        private DnsResConfigSbeltEntryEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsResConfigSbeltEntry", "1.3.6.1.2.1.32.2.1.1.4.1", false, false, false, true);
                            this.dnsResConfigSbeltAddr = new DnsResConfigSbeltAddrEnt(mib, this);
                            this.dnsResConfigSbeltName = new DnsResConfigSbeltNameEnt(mib, this);
                            this.dnsResConfigSbeltRecursion = new DnsResConfigSbeltRecursionEnt(mib, this);
                            this.dnsResConfigSbeltPref = new DnsResConfigSbeltPrefEnt(mib, this);
                            this.dnsResConfigSbeltSubTree = new DnsResConfigSbeltSubTreeEnt(mib, this);
                            this.dnsResConfigSbeltClass = new DnsResConfigSbeltClassEnt(mib, this);
                            this.dnsResConfigSbeltStatus = new DnsResConfigSbeltStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsResConfigSbeltAddr,
                                this.dnsResConfigSbeltName,
                                this.dnsResConfigSbeltRecursion,
                                this.dnsResConfigSbeltPref,
                                this.dnsResConfigSbeltSubTree,
                                this.dnsResConfigSbeltClass,
                                this.dnsResConfigSbeltStatus
                            };
                        }
                        public static final class DnsResConfigSbeltAddrEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltAddrEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltAddr", "1.3.6.1.2.1.32.2.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResConfigSbeltNameEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltNameEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltName", "1.3.6.1.2.1.32.2.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResConfigSbeltRecursionEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltRecursionEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltRecursion", "1.3.6.1.2.1.32.2.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResConfigSbeltPrefEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltPrefEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltPref", "1.3.6.1.2.1.32.2.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResConfigSbeltSubTreeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltSubTreeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltSubTree", "1.3.6.1.2.1.32.2.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResConfigSbeltClassEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltClassEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltClass", "1.3.6.1.2.1.32.2.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResConfigSbeltStatusEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResConfigSbeltStatusEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResConfigSbeltStatus", "1.3.6.1.2.1.32.2.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DnsResConfigUpTimeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResConfigUpTimeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigUpTime", "1.3.6.1.2.1.32.2.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResConfigResetTimeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResConfigResetTimeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigResetTime", "1.3.6.1.2.1.32.2.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResConfigResetEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResConfigResetEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResConfigReset", "1.3.6.1.2.1.32.2.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DnsResCounterEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                /** Resolver Counters Group
Resolver Counter Table*/
                public final DnsResCounterByOpcodeTableEnt dnsResCounterByOpcodeTable;

                /** Resolver Response Code Counter Table*/
                public final DnsResCounterByRcodeTableEnt dnsResCounterByRcodeTable;

                /** Additional DNS Resolver Counter Objects*/
                public final DnsResCounterNonAuthDataRespsEnt dnsResCounterNonAuthDataResps;

                public final DnsResCounterNonAuthNoDataRespsEnt dnsResCounterNonAuthNoDataResps;

                public final DnsResCounterMartiansEnt dnsResCounterMartians;

                public final DnsResCounterRecdResponsesEnt dnsResCounterRecdResponses;

                public final DnsResCounterUnparseRespsEnt dnsResCounterUnparseResps;

                public final DnsResCounterFallbacksEnt dnsResCounterFallbacks;

                private DnsResCounterEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResCounter", "1.3.6.1.2.1.32.2.1.2", false, false, false, false);
                    this.dnsResCounterByOpcodeTable = new DnsResCounterByOpcodeTableEnt(mib, this);
                    this.dnsResCounterByRcodeTable = new DnsResCounterByRcodeTableEnt(mib, this);
                    this.dnsResCounterNonAuthDataResps = new DnsResCounterNonAuthDataRespsEnt(mib, this);
                    this.dnsResCounterNonAuthNoDataResps = new DnsResCounterNonAuthNoDataRespsEnt(mib, this);
                    this.dnsResCounterMartians = new DnsResCounterMartiansEnt(mib, this);
                    this.dnsResCounterRecdResponses = new DnsResCounterRecdResponsesEnt(mib, this);
                    this.dnsResCounterUnparseResps = new DnsResCounterUnparseRespsEnt(mib, this);
                    this.dnsResCounterFallbacks = new DnsResCounterFallbacksEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsResCounterByOpcodeTable,
                        this.dnsResCounterByRcodeTable,
                        this.dnsResCounterNonAuthDataResps,
                        this.dnsResCounterNonAuthNoDataResps,
                        this.dnsResCounterMartians,
                        this.dnsResCounterRecdResponses,
                        this.dnsResCounterUnparseResps,
                        this.dnsResCounterFallbacks
                    };
                }
                public static final class DnsResCounterByOpcodeTableEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    public final DnsResCounterByOpcodeEntryEnt dnsResCounterByOpcodeEntry;

                    private DnsResCounterByOpcodeTableEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterByOpcodeTable", "1.3.6.1.2.1.32.2.1.2.3", false, true, false, false);
                        this.dnsResCounterByOpcodeEntry = new DnsResCounterByOpcodeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsResCounterByOpcodeEntry
                        };
                    }
                    public static final class DnsResCounterByOpcodeEntryEnt extends MIBEntry<DNSRESOLVERMIBDef>
                    {
                        public final DnsResCounterByOpcodeCodeEnt dnsResCounterByOpcodeCode;

                        public final DnsResCounterByOpcodeQueriesEnt dnsResCounterByOpcodeQueries;

                        public final DnsResCounterByOpcodeResponsesEnt dnsResCounterByOpcodeResponses;

                        private DnsResCounterByOpcodeEntryEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsResCounterByOpcodeEntry", "1.3.6.1.2.1.32.2.1.2.3.1", false, false, false, true);
                            this.dnsResCounterByOpcodeCode = new DnsResCounterByOpcodeCodeEnt(mib, this);
                            this.dnsResCounterByOpcodeQueries = new DnsResCounterByOpcodeQueriesEnt(mib, this);
                            this.dnsResCounterByOpcodeResponses = new DnsResCounterByOpcodeResponsesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsResCounterByOpcodeCode,
                                this.dnsResCounterByOpcodeQueries,
                                this.dnsResCounterByOpcodeResponses
                            };
                        }
                        public static final class DnsResCounterByOpcodeCodeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCounterByOpcodeCodeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCounterByOpcodeCode", "1.3.6.1.2.1.32.2.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCounterByOpcodeQueriesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCounterByOpcodeQueriesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCounterByOpcodeQueries", "1.3.6.1.2.1.32.2.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCounterByOpcodeResponsesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCounterByOpcodeResponsesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCounterByOpcodeResponses", "1.3.6.1.2.1.32.2.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DnsResCounterByRcodeTableEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    public final DnsResCounterByRcodeEntryEnt dnsResCounterByRcodeEntry;

                    private DnsResCounterByRcodeTableEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterByRcodeTable", "1.3.6.1.2.1.32.2.1.2.4", false, true, false, false);
                        this.dnsResCounterByRcodeEntry = new DnsResCounterByRcodeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsResCounterByRcodeEntry
                        };
                    }
                    public static final class DnsResCounterByRcodeEntryEnt extends MIBEntry<DNSRESOLVERMIBDef>
                    {
                        public final DnsResCounterByRcodeCodeEnt dnsResCounterByRcodeCode;

                        public final DnsResCounterByRcodeResponsesEnt dnsResCounterByRcodeResponses;

                        private DnsResCounterByRcodeEntryEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsResCounterByRcodeEntry", "1.3.6.1.2.1.32.2.1.2.4.1", false, false, false, true);
                            this.dnsResCounterByRcodeCode = new DnsResCounterByRcodeCodeEnt(mib, this);
                            this.dnsResCounterByRcodeResponses = new DnsResCounterByRcodeResponsesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsResCounterByRcodeCode,
                                this.dnsResCounterByRcodeResponses
                            };
                        }
                        public static final class DnsResCounterByRcodeCodeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCounterByRcodeCodeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCounterByRcodeCode", "1.3.6.1.2.1.32.2.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCounterByRcodeResponsesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCounterByRcodeResponsesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCounterByRcodeResponses", "1.3.6.1.2.1.32.2.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DnsResCounterNonAuthDataRespsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCounterNonAuthDataRespsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterNonAuthDataResps", "1.3.6.1.2.1.32.2.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCounterNonAuthNoDataRespsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCounterNonAuthNoDataRespsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterNonAuthNoDataResps", "1.3.6.1.2.1.32.2.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCounterMartiansEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCounterMartiansEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterMartians", "1.3.6.1.2.1.32.2.1.2.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCounterRecdResponsesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCounterRecdResponsesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterRecdResponses", "1.3.6.1.2.1.32.2.1.2.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCounterUnparseRespsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCounterUnparseRespsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterUnparseResps", "1.3.6.1.2.1.32.2.1.2.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCounterFallbacksEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCounterFallbacksEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCounterFallbacks", "1.3.6.1.2.1.32.2.1.2.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DnsResLameDelegationEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                /** Lame Delegation Group*/
                public final DnsResLameDelegationOverflowsEnt dnsResLameDelegationOverflows;

                /** Lame Delegation Table*/
                public final DnsResLameDelegationTableEnt dnsResLameDelegationTable;

                private DnsResLameDelegationEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResLameDelegation", "1.3.6.1.2.1.32.2.1.3", false, false, false, false);
                    this.dnsResLameDelegationOverflows = new DnsResLameDelegationOverflowsEnt(mib, this);
                    this.dnsResLameDelegationTable = new DnsResLameDelegationTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsResLameDelegationOverflows,
                        this.dnsResLameDelegationTable
                    };
                }
                public static final class DnsResLameDelegationOverflowsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResLameDelegationOverflowsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResLameDelegationOverflows", "1.3.6.1.2.1.32.2.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResLameDelegationTableEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    public final DnsResLameDelegationEntryEnt dnsResLameDelegationEntry;

                    private DnsResLameDelegationTableEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResLameDelegationTable", "1.3.6.1.2.1.32.2.1.3.2", false, true, false, false);
                        this.dnsResLameDelegationEntry = new DnsResLameDelegationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsResLameDelegationEntry
                        };
                    }
                    public static final class DnsResLameDelegationEntryEnt extends MIBEntry<DNSRESOLVERMIBDef>
                    {
                        public final DnsResLameDelegationSourceEnt dnsResLameDelegationSource;

                        public final DnsResLameDelegationNameEnt dnsResLameDelegationName;

                        public final DnsResLameDelegationClassEnt dnsResLameDelegationClass;

                        public final DnsResLameDelegationCountsEnt dnsResLameDelegationCounts;

                        public final DnsResLameDelegationStatusEnt dnsResLameDelegationStatus;

                        private DnsResLameDelegationEntryEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsResLameDelegationEntry", "1.3.6.1.2.1.32.2.1.3.2.1", false, false, false, true);
                            this.dnsResLameDelegationSource = new DnsResLameDelegationSourceEnt(mib, this);
                            this.dnsResLameDelegationName = new DnsResLameDelegationNameEnt(mib, this);
                            this.dnsResLameDelegationClass = new DnsResLameDelegationClassEnt(mib, this);
                            this.dnsResLameDelegationCounts = new DnsResLameDelegationCountsEnt(mib, this);
                            this.dnsResLameDelegationStatus = new DnsResLameDelegationStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsResLameDelegationSource,
                                this.dnsResLameDelegationName,
                                this.dnsResLameDelegationClass,
                                this.dnsResLameDelegationCounts,
                                this.dnsResLameDelegationStatus
                            };
                        }
                        public static final class DnsResLameDelegationSourceEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResLameDelegationSourceEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResLameDelegationSource", "1.3.6.1.2.1.32.2.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResLameDelegationNameEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResLameDelegationNameEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResLameDelegationName", "1.3.6.1.2.1.32.2.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResLameDelegationClassEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResLameDelegationClassEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResLameDelegationClass", "1.3.6.1.2.1.32.2.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResLameDelegationCountsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResLameDelegationCountsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResLameDelegationCounts", "1.3.6.1.2.1.32.2.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResLameDelegationStatusEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResLameDelegationStatusEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResLameDelegationStatus", "1.3.6.1.2.1.32.2.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DnsResCacheEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                /** Resolver Cache Group*/
                public final DnsResCacheStatusEnt dnsResCacheStatus;

                public final DnsResCacheMaxTTLEnt dnsResCacheMaxTTL;

                public final DnsResCacheGoodCachesEnt dnsResCacheGoodCaches;

                public final DnsResCacheBadCachesEnt dnsResCacheBadCaches;

                /** Resolver Cache Table*/
                public final DnsResCacheRRTableEnt dnsResCacheRRTable;

                private DnsResCacheEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResCache", "1.3.6.1.2.1.32.2.1.4", false, false, false, false);
                    this.dnsResCacheStatus = new DnsResCacheStatusEnt(mib, this);
                    this.dnsResCacheMaxTTL = new DnsResCacheMaxTTLEnt(mib, this);
                    this.dnsResCacheGoodCaches = new DnsResCacheGoodCachesEnt(mib, this);
                    this.dnsResCacheBadCaches = new DnsResCacheBadCachesEnt(mib, this);
                    this.dnsResCacheRRTable = new DnsResCacheRRTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsResCacheStatus,
                        this.dnsResCacheMaxTTL,
                        this.dnsResCacheGoodCaches,
                        this.dnsResCacheBadCaches,
                        this.dnsResCacheRRTable
                    };
                }
                public static final class DnsResCacheStatusEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCacheStatusEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCacheStatus", "1.3.6.1.2.1.32.2.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCacheMaxTTLEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCacheMaxTTLEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCacheMaxTTL", "1.3.6.1.2.1.32.2.1.4.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCacheGoodCachesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCacheGoodCachesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCacheGoodCaches", "1.3.6.1.2.1.32.2.1.4.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCacheBadCachesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResCacheBadCachesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCacheBadCaches", "1.3.6.1.2.1.32.2.1.4.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResCacheRRTableEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    public final DnsResCacheRREntryEnt dnsResCacheRREntry;

                    private DnsResCacheRRTableEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResCacheRRTable", "1.3.6.1.2.1.32.2.1.4.5", false, true, false, false);
                        this.dnsResCacheRREntry = new DnsResCacheRREntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsResCacheRREntry
                        };
                    }
                    public static final class DnsResCacheRREntryEnt extends MIBEntry<DNSRESOLVERMIBDef>
                    {
                        public final DnsResCacheRRNameEnt dnsResCacheRRName;

                        public final DnsResCacheRRClassEnt dnsResCacheRRClass;

                        public final DnsResCacheRRTypeEnt dnsResCacheRRType;

                        public final DnsResCacheRRTTLEnt dnsResCacheRRTTL;

                        public final DnsResCacheRRElapsedTTLEnt dnsResCacheRRElapsedTTL;

                        public final DnsResCacheRRSourceEnt dnsResCacheRRSource;

                        public final DnsResCacheRRDataEnt dnsResCacheRRData;

                        public final DnsResCacheRRStatusEnt dnsResCacheRRStatus;

                        public final DnsResCacheRRIndexEnt dnsResCacheRRIndex;

                        public final DnsResCacheRRPrettyNameEnt dnsResCacheRRPrettyName;

                        private DnsResCacheRREntryEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsResCacheRREntry", "1.3.6.1.2.1.32.2.1.4.5.1", false, false, false, true);
                            this.dnsResCacheRRName = new DnsResCacheRRNameEnt(mib, this);
                            this.dnsResCacheRRClass = new DnsResCacheRRClassEnt(mib, this);
                            this.dnsResCacheRRType = new DnsResCacheRRTypeEnt(mib, this);
                            this.dnsResCacheRRTTL = new DnsResCacheRRTTLEnt(mib, this);
                            this.dnsResCacheRRElapsedTTL = new DnsResCacheRRElapsedTTLEnt(mib, this);
                            this.dnsResCacheRRSource = new DnsResCacheRRSourceEnt(mib, this);
                            this.dnsResCacheRRData = new DnsResCacheRRDataEnt(mib, this);
                            this.dnsResCacheRRStatus = new DnsResCacheRRStatusEnt(mib, this);
                            this.dnsResCacheRRIndex = new DnsResCacheRRIndexEnt(mib, this);
                            this.dnsResCacheRRPrettyName = new DnsResCacheRRPrettyNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsResCacheRRName,
                                this.dnsResCacheRRClass,
                                this.dnsResCacheRRType,
                                this.dnsResCacheRRTTL,
                                this.dnsResCacheRRElapsedTTL,
                                this.dnsResCacheRRSource,
                                this.dnsResCacheRRData,
                                this.dnsResCacheRRStatus,
                                this.dnsResCacheRRIndex,
                                this.dnsResCacheRRPrettyName
                            };
                        }
                        public static final class DnsResCacheRRNameEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRNameEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRName", "1.3.6.1.2.1.32.2.1.4.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRClassEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRClassEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRClass", "1.3.6.1.2.1.32.2.1.4.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRTypeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRTypeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRType", "1.3.6.1.2.1.32.2.1.4.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRTTLEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRTTLEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRTTL", "1.3.6.1.2.1.32.2.1.4.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRElapsedTTLEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRElapsedTTLEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRElapsedTTL", "1.3.6.1.2.1.32.2.1.4.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRSourceEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRSourceEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRSource", "1.3.6.1.2.1.32.2.1.4.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRDataEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRDataEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRData", "1.3.6.1.2.1.32.2.1.4.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRStatusEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRStatusEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRStatus", "1.3.6.1.2.1.32.2.1.4.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRIndexEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRIndexEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRIndex", "1.3.6.1.2.1.32.2.1.4.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResCacheRRPrettyNameEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResCacheRRPrettyNameEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResCacheRRPrettyName", "1.3.6.1.2.1.32.2.1.4.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DnsResNCacheEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                /** Resolver Negative Cache Group*/
                public final DnsResNCacheStatusEnt dnsResNCacheStatus;

                public final DnsResNCacheMaxTTLEnt dnsResNCacheMaxTTL;

                public final DnsResNCacheGoodNCachesEnt dnsResNCacheGoodNCaches;

                public final DnsResNCacheBadNCachesEnt dnsResNCacheBadNCaches;

                /** Resolver Negative Cache Table*/
                public final DnsResNCacheErrTableEnt dnsResNCacheErrTable;

                private DnsResNCacheEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResNCache", "1.3.6.1.2.1.32.2.1.5", false, false, false, false);
                    this.dnsResNCacheStatus = new DnsResNCacheStatusEnt(mib, this);
                    this.dnsResNCacheMaxTTL = new DnsResNCacheMaxTTLEnt(mib, this);
                    this.dnsResNCacheGoodNCaches = new DnsResNCacheGoodNCachesEnt(mib, this);
                    this.dnsResNCacheBadNCaches = new DnsResNCacheBadNCachesEnt(mib, this);
                    this.dnsResNCacheErrTable = new DnsResNCacheErrTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsResNCacheStatus,
                        this.dnsResNCacheMaxTTL,
                        this.dnsResNCacheGoodNCaches,
                        this.dnsResNCacheBadNCaches,
                        this.dnsResNCacheErrTable
                    };
                }
                public static final class DnsResNCacheStatusEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResNCacheStatusEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResNCacheStatus", "1.3.6.1.2.1.32.2.1.5.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResNCacheMaxTTLEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResNCacheMaxTTLEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResNCacheMaxTTL", "1.3.6.1.2.1.32.2.1.5.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResNCacheGoodNCachesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResNCacheGoodNCachesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResNCacheGoodNCaches", "1.3.6.1.2.1.32.2.1.5.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResNCacheBadNCachesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResNCacheBadNCachesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResNCacheBadNCaches", "1.3.6.1.2.1.32.2.1.5.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResNCacheErrTableEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    public final DnsResNCacheErrEntryEnt dnsResNCacheErrEntry;

                    private DnsResNCacheErrTableEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResNCacheErrTable", "1.3.6.1.2.1.32.2.1.5.5", false, true, false, false);
                        this.dnsResNCacheErrEntry = new DnsResNCacheErrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsResNCacheErrEntry
                        };
                    }
                    public static final class DnsResNCacheErrEntryEnt extends MIBEntry<DNSRESOLVERMIBDef>
                    {
                        public final DnsResNCacheErrQNameEnt dnsResNCacheErrQName;

                        public final DnsResNCacheErrQClassEnt dnsResNCacheErrQClass;

                        public final DnsResNCacheErrQTypeEnt dnsResNCacheErrQType;

                        public final DnsResNCacheErrTTLEnt dnsResNCacheErrTTL;

                        public final DnsResNCacheErrElapsedTTLEnt dnsResNCacheErrElapsedTTL;

                        public final DnsResNCacheErrSourceEnt dnsResNCacheErrSource;

                        public final DnsResNCacheErrCodeEnt dnsResNCacheErrCode;

                        public final DnsResNCacheErrStatusEnt dnsResNCacheErrStatus;

                        public final DnsResNCacheErrIndexEnt dnsResNCacheErrIndex;

                        public final DnsResNCacheErrPrettyNameEnt dnsResNCacheErrPrettyName;

                        private DnsResNCacheErrEntryEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsResNCacheErrEntry", "1.3.6.1.2.1.32.2.1.5.5.1", false, false, false, true);
                            this.dnsResNCacheErrQName = new DnsResNCacheErrQNameEnt(mib, this);
                            this.dnsResNCacheErrQClass = new DnsResNCacheErrQClassEnt(mib, this);
                            this.dnsResNCacheErrQType = new DnsResNCacheErrQTypeEnt(mib, this);
                            this.dnsResNCacheErrTTL = new DnsResNCacheErrTTLEnt(mib, this);
                            this.dnsResNCacheErrElapsedTTL = new DnsResNCacheErrElapsedTTLEnt(mib, this);
                            this.dnsResNCacheErrSource = new DnsResNCacheErrSourceEnt(mib, this);
                            this.dnsResNCacheErrCode = new DnsResNCacheErrCodeEnt(mib, this);
                            this.dnsResNCacheErrStatus = new DnsResNCacheErrStatusEnt(mib, this);
                            this.dnsResNCacheErrIndex = new DnsResNCacheErrIndexEnt(mib, this);
                            this.dnsResNCacheErrPrettyName = new DnsResNCacheErrPrettyNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsResNCacheErrQName,
                                this.dnsResNCacheErrQClass,
                                this.dnsResNCacheErrQType,
                                this.dnsResNCacheErrTTL,
                                this.dnsResNCacheErrElapsedTTL,
                                this.dnsResNCacheErrSource,
                                this.dnsResNCacheErrCode,
                                this.dnsResNCacheErrStatus,
                                this.dnsResNCacheErrIndex,
                                this.dnsResNCacheErrPrettyName
                            };
                        }
                        public static final class DnsResNCacheErrQNameEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrQNameEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrQName", "1.3.6.1.2.1.32.2.1.5.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrQClassEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrQClassEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrQClass", "1.3.6.1.2.1.32.2.1.5.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrQTypeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrQTypeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrQType", "1.3.6.1.2.1.32.2.1.5.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrTTLEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrTTLEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrTTL", "1.3.6.1.2.1.32.2.1.5.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrElapsedTTLEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrElapsedTTLEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrElapsedTTL", "1.3.6.1.2.1.32.2.1.5.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrSourceEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrSourceEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrSource", "1.3.6.1.2.1.32.2.1.5.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrCodeEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrCodeEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrCode", "1.3.6.1.2.1.32.2.1.5.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrStatusEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrStatusEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrStatus", "1.3.6.1.2.1.32.2.1.5.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrIndexEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrIndexEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrIndex", "1.3.6.1.2.1.32.2.1.5.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DnsResNCacheErrPrettyNameEnt extends MIBEntry<DNSRESOLVERMIBDef>
                        {
                            private DnsResNCacheErrPrettyNameEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsResNCacheErrPrettyName", "1.3.6.1.2.1.32.2.1.5.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DnsResOptCounterEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                /** Resolver Optional Counters Group*/
                public final DnsResOptCounterReferalsEnt dnsResOptCounterReferals;

                public final DnsResOptCounterRetransEnt dnsResOptCounterRetrans;

                public final DnsResOptCounterNoResponsesEnt dnsResOptCounterNoResponses;

                public final DnsResOptCounterRootRetransEnt dnsResOptCounterRootRetrans;

                public final DnsResOptCounterInternalsEnt dnsResOptCounterInternals;

                public final DnsResOptCounterInternalTimeOutsEnt dnsResOptCounterInternalTimeOuts;

                private DnsResOptCounterEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResOptCounter", "1.3.6.1.2.1.32.2.1.6", false, false, false, false);
                    this.dnsResOptCounterReferals = new DnsResOptCounterReferalsEnt(mib, this);
                    this.dnsResOptCounterRetrans = new DnsResOptCounterRetransEnt(mib, this);
                    this.dnsResOptCounterNoResponses = new DnsResOptCounterNoResponsesEnt(mib, this);
                    this.dnsResOptCounterRootRetrans = new DnsResOptCounterRootRetransEnt(mib, this);
                    this.dnsResOptCounterInternals = new DnsResOptCounterInternalsEnt(mib, this);
                    this.dnsResOptCounterInternalTimeOuts = new DnsResOptCounterInternalTimeOutsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsResOptCounterReferals,
                        this.dnsResOptCounterRetrans,
                        this.dnsResOptCounterNoResponses,
                        this.dnsResOptCounterRootRetrans,
                        this.dnsResOptCounterInternals,
                        this.dnsResOptCounterInternalTimeOuts
                    };
                }
                public static final class DnsResOptCounterReferalsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResOptCounterReferalsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResOptCounterReferals", "1.3.6.1.2.1.32.2.1.6.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResOptCounterRetransEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResOptCounterRetransEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResOptCounterRetrans", "1.3.6.1.2.1.32.2.1.6.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResOptCounterNoResponsesEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResOptCounterNoResponsesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResOptCounterNoResponses", "1.3.6.1.2.1.32.2.1.6.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResOptCounterRootRetransEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResOptCounterRootRetransEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResOptCounterRootRetrans", "1.3.6.1.2.1.32.2.1.6.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResOptCounterInternalsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResOptCounterInternalsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResOptCounterInternals", "1.3.6.1.2.1.32.2.1.6.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsResOptCounterInternalTimeOutsEnt extends MIBEntry<DNSRESOLVERMIBDef>
                {
                    private DnsResOptCounterInternalTimeOutsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsResOptCounterInternalTimeOuts", "1.3.6.1.2.1.32.2.1.6.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DnsResMIBGroupsEnt extends MIBEntry<DNSRESOLVERMIBDef>
        {
            public final DnsResConfigGroupEnt dnsResConfigGroup;

            public final DnsResCounterGroupEnt dnsResCounterGroup;

            public final DnsResLameDelegationGroupEnt dnsResLameDelegationGroup;

            public final DnsResCacheGroupEnt dnsResCacheGroup;

            public final DnsResNCacheGroupEnt dnsResNCacheGroup;

            public final DnsResOptCounterGroupEnt dnsResOptCounterGroup;

            private DnsResMIBGroupsEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
            {
                super(mib, parent, "dnsResMIBGroups", "1.3.6.1.2.1.32.2.2", false, false, false, false);
                this.dnsResConfigGroup = new DnsResConfigGroupEnt(mib, this);
                this.dnsResCounterGroup = new DnsResCounterGroupEnt(mib, this);
                this.dnsResLameDelegationGroup = new DnsResLameDelegationGroupEnt(mib, this);
                this.dnsResCacheGroup = new DnsResCacheGroupEnt(mib, this);
                this.dnsResNCacheGroup = new DnsResNCacheGroupEnt(mib, this);
                this.dnsResOptCounterGroup = new DnsResOptCounterGroupEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dnsResConfigGroup,
                    this.dnsResCounterGroup,
                    this.dnsResLameDelegationGroup,
                    this.dnsResCacheGroup,
                    this.dnsResNCacheGroup,
                    this.dnsResOptCounterGroup
                };
            }
            public static final class DnsResConfigGroupEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResConfigGroupEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResConfigGroup", "1.3.6.1.2.1.32.2.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DnsResCounterGroupEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResCounterGroupEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResCounterGroup", "1.3.6.1.2.1.32.2.2.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DnsResLameDelegationGroupEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResLameDelegationGroupEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResLameDelegationGroup", "1.3.6.1.2.1.32.2.2.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DnsResCacheGroupEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResCacheGroupEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResCacheGroup", "1.3.6.1.2.1.32.2.2.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DnsResNCacheGroupEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResNCacheGroupEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResNCacheGroup", "1.3.6.1.2.1.32.2.2.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DnsResOptCounterGroupEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResOptCounterGroupEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResOptCounterGroup", "1.3.6.1.2.1.32.2.2.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class DnsResMIBCompliancesEnt extends MIBEntry<DNSRESOLVERMIBDef>
        {
            public final DnsResMIBComplianceEnt dnsResMIBCompliance;

            private DnsResMIBCompliancesEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
            {
                super(mib, parent, "dnsResMIBCompliances", "1.3.6.1.2.1.32.2.3", false, false, false, false);
                this.dnsResMIBCompliance = new DnsResMIBComplianceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dnsResMIBCompliance
                };
            }
            public static final class DnsResMIBComplianceEnt extends MIBEntry<DNSRESOLVERMIBDef>
            {
                private DnsResMIBComplianceEnt(DNSRESOLVERMIBDef mib, MIBEntry<DNSRESOLVERMIBDef> parent)
                {
                    super(mib, parent, "dnsResMIBCompliance", "1.3.6.1.2.1.32.2.3.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
