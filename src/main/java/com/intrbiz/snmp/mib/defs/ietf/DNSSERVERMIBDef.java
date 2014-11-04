package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class DNSSERVERMIBDef extends MIB
{
    public static final DNSSERVERMIBDef DNSSERVERMIB = new DNSSERVERMIBDef();

    static { MIBs.getInstance().registerMIB(DNSSERVERMIBDef.DNSSERVERMIB); }

    public final DnsEnt dns;

    private DNSSERVERMIBDef()
    {
        super("DNS-SERVER-MIB");
        this.dns = new DnsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dns
        };
    }

    public static final class DnsEnt extends MIBEntry<DNSSERVERMIBDef>
    {
        public final DnsServMIBEnt dnsServMIB;

        private DnsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
        {
            super(mib, parent, "dns", "1.3.6.1.2.1.32", false, false, false, false);
            this.dnsServMIB = new DnsServMIBEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dnsServMIB
            };
        }
        public static final class DnsServMIBEnt extends MIBEntry<DNSSERVERMIBDef>
        {
            public final DnsServMIBObjectsEnt dnsServMIBObjects;

            /** SNMPv2 groups.*/
            public final DnsServMIBGroupsEnt dnsServMIBGroups;

            /** Compliances.*/
            public final DnsServMIBCompliancesEnt dnsServMIBCompliances;

            private DnsServMIBEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
            {
                super(mib, parent, "dnsServMIB", "1.3.6.1.2.1.32.1", false, false, false, false);
                this.dnsServMIBObjects = new DnsServMIBObjectsEnt(mib, this);
                this.dnsServMIBGroups = new DnsServMIBGroupsEnt(mib, this);
                this.dnsServMIBCompliances = new DnsServMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dnsServMIBObjects,
                    this.dnsServMIBGroups,
                    this.dnsServMIBCompliances
                };
            }
            public static final class DnsServMIBObjectsEnt extends MIBEntry<DNSSERVERMIBDef>
            {
                /** (Old-style) groups in the DNS server MIB.*/
                public final DnsServConfigEnt dnsServConfig;

                public final DnsServCounterEnt dnsServCounter;

                public final DnsServOptCounterEnt dnsServOptCounter;

                public final DnsServZoneEnt dnsServZone;

                private DnsServMIBObjectsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                {
                    super(mib, parent, "dnsServMIBObjects", "1.3.6.1.2.1.32.1.1", false, false, false, false);
                    this.dnsServConfig = new DnsServConfigEnt(mib, this);
                    this.dnsServCounter = new DnsServCounterEnt(mib, this);
                    this.dnsServOptCounter = new DnsServOptCounterEnt(mib, this);
                    this.dnsServZone = new DnsServZoneEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsServConfig,
                        this.dnsServCounter,
                        this.dnsServOptCounter,
                        this.dnsServZone
                    };
                }
                public static final class DnsServConfigEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    /** Server Configuration Group*/
                    public final DnsServConfigImplementIdentEnt dnsServConfigImplementIdent;

                    public final DnsServConfigRecursEnt dnsServConfigRecurs;

                    public final DnsServConfigUpTimeEnt dnsServConfigUpTime;

                    public final DnsServConfigResetTimeEnt dnsServConfigResetTime;

                    public final DnsServConfigResetEnt dnsServConfigReset;

                    private DnsServConfigEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServConfig", "1.3.6.1.2.1.32.1.1.1", false, false, false, false);
                        this.dnsServConfigImplementIdent = new DnsServConfigImplementIdentEnt(mib, this);
                        this.dnsServConfigRecurs = new DnsServConfigRecursEnt(mib, this);
                        this.dnsServConfigUpTime = new DnsServConfigUpTimeEnt(mib, this);
                        this.dnsServConfigResetTime = new DnsServConfigResetTimeEnt(mib, this);
                        this.dnsServConfigReset = new DnsServConfigResetEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsServConfigImplementIdent,
                            this.dnsServConfigRecurs,
                            this.dnsServConfigUpTime,
                            this.dnsServConfigResetTime,
                            this.dnsServConfigReset
                        };
                    }
                    public static final class DnsServConfigImplementIdentEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServConfigImplementIdentEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServConfigImplementIdent", "1.3.6.1.2.1.32.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServConfigRecursEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServConfigRecursEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServConfigRecurs", "1.3.6.1.2.1.32.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServConfigUpTimeEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServConfigUpTimeEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServConfigUpTime", "1.3.6.1.2.1.32.1.1.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServConfigResetTimeEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServConfigResetTimeEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServConfigResetTime", "1.3.6.1.2.1.32.1.1.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServConfigResetEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServConfigResetEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServConfigReset", "1.3.6.1.2.1.32.1.1.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class DnsServCounterEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    /** Server Counter Group*/
                    public final DnsServCounterAuthAnsEnt dnsServCounterAuthAns;

                    public final DnsServCounterAuthNoNamesEnt dnsServCounterAuthNoNames;

                    public final DnsServCounterAuthNoDataRespsEnt dnsServCounterAuthNoDataResps;

                    public final DnsServCounterNonAuthDatasEnt dnsServCounterNonAuthDatas;

                    public final DnsServCounterNonAuthNoDatasEnt dnsServCounterNonAuthNoDatas;

                    public final DnsServCounterReferralsEnt dnsServCounterReferrals;

                    public final DnsServCounterErrorsEnt dnsServCounterErrors;

                    public final DnsServCounterRelNamesEnt dnsServCounterRelNames;

                    public final DnsServCounterReqRefusalsEnt dnsServCounterReqRefusals;

                    public final DnsServCounterReqUnparsesEnt dnsServCounterReqUnparses;

                    public final DnsServCounterOtherErrorsEnt dnsServCounterOtherErrors;

                    /** DNS Server Counter Table*/
                    public final DnsServCounterTableEnt dnsServCounterTable;

                    private DnsServCounterEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServCounter", "1.3.6.1.2.1.32.1.1.2", false, false, false, false);
                        this.dnsServCounterAuthAns = new DnsServCounterAuthAnsEnt(mib, this);
                        this.dnsServCounterAuthNoNames = new DnsServCounterAuthNoNamesEnt(mib, this);
                        this.dnsServCounterAuthNoDataResps = new DnsServCounterAuthNoDataRespsEnt(mib, this);
                        this.dnsServCounterNonAuthDatas = new DnsServCounterNonAuthDatasEnt(mib, this);
                        this.dnsServCounterNonAuthNoDatas = new DnsServCounterNonAuthNoDatasEnt(mib, this);
                        this.dnsServCounterReferrals = new DnsServCounterReferralsEnt(mib, this);
                        this.dnsServCounterErrors = new DnsServCounterErrorsEnt(mib, this);
                        this.dnsServCounterRelNames = new DnsServCounterRelNamesEnt(mib, this);
                        this.dnsServCounterReqRefusals = new DnsServCounterReqRefusalsEnt(mib, this);
                        this.dnsServCounterReqUnparses = new DnsServCounterReqUnparsesEnt(mib, this);
                        this.dnsServCounterOtherErrors = new DnsServCounterOtherErrorsEnt(mib, this);
                        this.dnsServCounterTable = new DnsServCounterTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsServCounterAuthAns,
                            this.dnsServCounterAuthNoNames,
                            this.dnsServCounterAuthNoDataResps,
                            this.dnsServCounterNonAuthDatas,
                            this.dnsServCounterNonAuthNoDatas,
                            this.dnsServCounterReferrals,
                            this.dnsServCounterErrors,
                            this.dnsServCounterRelNames,
                            this.dnsServCounterReqRefusals,
                            this.dnsServCounterReqUnparses,
                            this.dnsServCounterOtherErrors,
                            this.dnsServCounterTable
                        };
                    }
                    public static final class DnsServCounterAuthAnsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterAuthAnsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterAuthAns", "1.3.6.1.2.1.32.1.1.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterAuthNoNamesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterAuthNoNamesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterAuthNoNames", "1.3.6.1.2.1.32.1.1.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterAuthNoDataRespsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterAuthNoDataRespsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterAuthNoDataResps", "1.3.6.1.2.1.32.1.1.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterNonAuthDatasEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterNonAuthDatasEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterNonAuthDatas", "1.3.6.1.2.1.32.1.1.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterNonAuthNoDatasEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterNonAuthNoDatasEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterNonAuthNoDatas", "1.3.6.1.2.1.32.1.1.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterReferralsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterReferralsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterReferrals", "1.3.6.1.2.1.32.1.1.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterErrorsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterErrorsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterErrors", "1.3.6.1.2.1.32.1.1.2.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterRelNamesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterRelNamesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterRelNames", "1.3.6.1.2.1.32.1.1.2.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterReqRefusalsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterReqRefusalsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterReqRefusals", "1.3.6.1.2.1.32.1.1.2.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterReqUnparsesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterReqUnparsesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterReqUnparses", "1.3.6.1.2.1.32.1.1.2.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterOtherErrorsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServCounterOtherErrorsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterOtherErrors", "1.3.6.1.2.1.32.1.1.2.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServCounterTableEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        public final DnsServCounterEntryEnt dnsServCounterEntry;

                        private DnsServCounterTableEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServCounterTable", "1.3.6.1.2.1.32.1.1.2.13", false, true, false, false);
                            this.dnsServCounterEntry = new DnsServCounterEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsServCounterEntry
                            };
                        }
                        public static final class DnsServCounterEntryEnt extends MIBEntry<DNSSERVERMIBDef>
                        {
                            public final DnsServCounterOpCodeEnt dnsServCounterOpCode;

                            public final DnsServCounterQClassEnt dnsServCounterQClass;

                            public final DnsServCounterQTypeEnt dnsServCounterQType;

                            public final DnsServCounterTransportEnt dnsServCounterTransport;

                            public final DnsServCounterRequestsEnt dnsServCounterRequests;

                            public final DnsServCounterResponsesEnt dnsServCounterResponses;

                            private DnsServCounterEntryEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsServCounterEntry", "1.3.6.1.2.1.32.1.1.2.13.1", false, false, false, true);
                                this.dnsServCounterOpCode = new DnsServCounterOpCodeEnt(mib, this);
                                this.dnsServCounterQClass = new DnsServCounterQClassEnt(mib, this);
                                this.dnsServCounterQType = new DnsServCounterQTypeEnt(mib, this);
                                this.dnsServCounterTransport = new DnsServCounterTransportEnt(mib, this);
                                this.dnsServCounterRequests = new DnsServCounterRequestsEnt(mib, this);
                                this.dnsServCounterResponses = new DnsServCounterResponsesEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dnsServCounterOpCode,
                                    this.dnsServCounterQClass,
                                    this.dnsServCounterQType,
                                    this.dnsServCounterTransport,
                                    this.dnsServCounterRequests,
                                    this.dnsServCounterResponses
                                };
                            }
                            public static final class DnsServCounterOpCodeEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServCounterOpCodeEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServCounterOpCode", "1.3.6.1.2.1.32.1.1.2.13.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServCounterQClassEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServCounterQClassEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServCounterQClass", "1.3.6.1.2.1.32.1.1.2.13.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServCounterQTypeEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServCounterQTypeEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServCounterQType", "1.3.6.1.2.1.32.1.1.2.13.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServCounterTransportEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServCounterTransportEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServCounterTransport", "1.3.6.1.2.1.32.1.1.2.13.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServCounterRequestsEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServCounterRequestsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServCounterRequests", "1.3.6.1.2.1.32.1.1.2.13.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServCounterResponsesEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServCounterResponsesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServCounterResponses", "1.3.6.1.2.1.32.1.1.2.13.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class DnsServOptCounterEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    /** Server Optional Counter Group
The Server Optional Counter Group is intended for those systemswhich make distinctions between the different sources of the DNSqueries as defined below.Objects in this group are implemented on servers which distinguishbetween queries which originate from the same host as the server,queries from one of an arbitrary group of hosts that are on anaccess list defined by the server, and queries from hosts that donot fit either of these descriptions.The objects found in the Server Counter group are totals.  Thus ifone wanted to identify, for example, the number of queries from`remote' hosts which have been given authoritative answers, onewould subtract the current values of ServOptCounterFriendsAuthAnsand ServOptCounterSelfAuthAns from servCounterAuthAns.The purpose of these distinctions is to allow for implementationsto group queries and responses on this basis.  One way in whichservers may make these distinctions is by looking at the source IPaddress of the DNS query.  If the source of the query is `yourown' then the query should be counted as `yourself' (local host).If the source of the query matches an `access list,' the querycame from a friend.  What constitutes an `access list' isimplementation dependent and could be as simple as a rule that allhosts on the same IP network as the DNS server are classed`friends.'In order to avoid double counting, the following rules apply:1. No host is in more than one of the three groups defined above.2. All queries from the local host are always counted in the`yourself' group regardless of what the access list, if any,says.3. The access list should not define `your friends' in such a waythat it includes all hosts.   That is, not everybody is your`friend.'*/
                    public final DnsServOptCounterSelfAuthAnsEnt dnsServOptCounterSelfAuthAns;

                    public final DnsServOptCounterSelfAuthNoNamesEnt dnsServOptCounterSelfAuthNoNames;

                    public final DnsServOptCounterSelfAuthNoDataRespsEnt dnsServOptCounterSelfAuthNoDataResps;

                    public final DnsServOptCounterSelfNonAuthDatasEnt dnsServOptCounterSelfNonAuthDatas;

                    public final DnsServOptCounterSelfNonAuthNoDatasEnt dnsServOptCounterSelfNonAuthNoDatas;

                    public final DnsServOptCounterSelfReferralsEnt dnsServOptCounterSelfReferrals;

                    public final DnsServOptCounterSelfErrorsEnt dnsServOptCounterSelfErrors;

                    public final DnsServOptCounterSelfRelNamesEnt dnsServOptCounterSelfRelNames;

                    public final DnsServOptCounterSelfReqRefusalsEnt dnsServOptCounterSelfReqRefusals;

                    public final DnsServOptCounterSelfReqUnparsesEnt dnsServOptCounterSelfReqUnparses;

                    public final DnsServOptCounterSelfOtherErrorsEnt dnsServOptCounterSelfOtherErrors;

                    public final DnsServOptCounterFriendsAuthAnsEnt dnsServOptCounterFriendsAuthAns;

                    public final DnsServOptCounterFriendsAuthNoNamesEnt dnsServOptCounterFriendsAuthNoNames;

                    public final DnsServOptCounterFriendsAuthNoDataRespsEnt dnsServOptCounterFriendsAuthNoDataResps;

                    public final DnsServOptCounterFriendsNonAuthDatasEnt dnsServOptCounterFriendsNonAuthDatas;

                    public final DnsServOptCounterFriendsNonAuthNoDatasEnt dnsServOptCounterFriendsNonAuthNoDatas;

                    public final DnsServOptCounterFriendsReferralsEnt dnsServOptCounterFriendsReferrals;

                    public final DnsServOptCounterFriendsErrorsEnt dnsServOptCounterFriendsErrors;

                    public final DnsServOptCounterFriendsRelNamesEnt dnsServOptCounterFriendsRelNames;

                    public final DnsServOptCounterFriendsReqRefusalsEnt dnsServOptCounterFriendsReqRefusals;

                    public final DnsServOptCounterFriendsReqUnparsesEnt dnsServOptCounterFriendsReqUnparses;

                    public final DnsServOptCounterFriendsOtherErrorsEnt dnsServOptCounterFriendsOtherErrors;

                    private DnsServOptCounterEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServOptCounter", "1.3.6.1.2.1.32.1.1.3", false, false, false, false);
                        this.dnsServOptCounterSelfAuthAns = new DnsServOptCounterSelfAuthAnsEnt(mib, this);
                        this.dnsServOptCounterSelfAuthNoNames = new DnsServOptCounterSelfAuthNoNamesEnt(mib, this);
                        this.dnsServOptCounterSelfAuthNoDataResps = new DnsServOptCounterSelfAuthNoDataRespsEnt(mib, this);
                        this.dnsServOptCounterSelfNonAuthDatas = new DnsServOptCounterSelfNonAuthDatasEnt(mib, this);
                        this.dnsServOptCounterSelfNonAuthNoDatas = new DnsServOptCounterSelfNonAuthNoDatasEnt(mib, this);
                        this.dnsServOptCounterSelfReferrals = new DnsServOptCounterSelfReferralsEnt(mib, this);
                        this.dnsServOptCounterSelfErrors = new DnsServOptCounterSelfErrorsEnt(mib, this);
                        this.dnsServOptCounterSelfRelNames = new DnsServOptCounterSelfRelNamesEnt(mib, this);
                        this.dnsServOptCounterSelfReqRefusals = new DnsServOptCounterSelfReqRefusalsEnt(mib, this);
                        this.dnsServOptCounterSelfReqUnparses = new DnsServOptCounterSelfReqUnparsesEnt(mib, this);
                        this.dnsServOptCounterSelfOtherErrors = new DnsServOptCounterSelfOtherErrorsEnt(mib, this);
                        this.dnsServOptCounterFriendsAuthAns = new DnsServOptCounterFriendsAuthAnsEnt(mib, this);
                        this.dnsServOptCounterFriendsAuthNoNames = new DnsServOptCounterFriendsAuthNoNamesEnt(mib, this);
                        this.dnsServOptCounterFriendsAuthNoDataResps = new DnsServOptCounterFriendsAuthNoDataRespsEnt(mib, this);
                        this.dnsServOptCounterFriendsNonAuthDatas = new DnsServOptCounterFriendsNonAuthDatasEnt(mib, this);
                        this.dnsServOptCounterFriendsNonAuthNoDatas = new DnsServOptCounterFriendsNonAuthNoDatasEnt(mib, this);
                        this.dnsServOptCounterFriendsReferrals = new DnsServOptCounterFriendsReferralsEnt(mib, this);
                        this.dnsServOptCounterFriendsErrors = new DnsServOptCounterFriendsErrorsEnt(mib, this);
                        this.dnsServOptCounterFriendsRelNames = new DnsServOptCounterFriendsRelNamesEnt(mib, this);
                        this.dnsServOptCounterFriendsReqRefusals = new DnsServOptCounterFriendsReqRefusalsEnt(mib, this);
                        this.dnsServOptCounterFriendsReqUnparses = new DnsServOptCounterFriendsReqUnparsesEnt(mib, this);
                        this.dnsServOptCounterFriendsOtherErrors = new DnsServOptCounterFriendsOtherErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsServOptCounterSelfAuthAns,
                            this.dnsServOptCounterSelfAuthNoNames,
                            this.dnsServOptCounterSelfAuthNoDataResps,
                            this.dnsServOptCounterSelfNonAuthDatas,
                            this.dnsServOptCounterSelfNonAuthNoDatas,
                            this.dnsServOptCounterSelfReferrals,
                            this.dnsServOptCounterSelfErrors,
                            this.dnsServOptCounterSelfRelNames,
                            this.dnsServOptCounterSelfReqRefusals,
                            this.dnsServOptCounterSelfReqUnparses,
                            this.dnsServOptCounterSelfOtherErrors,
                            this.dnsServOptCounterFriendsAuthAns,
                            this.dnsServOptCounterFriendsAuthNoNames,
                            this.dnsServOptCounterFriendsAuthNoDataResps,
                            this.dnsServOptCounterFriendsNonAuthDatas,
                            this.dnsServOptCounterFriendsNonAuthNoDatas,
                            this.dnsServOptCounterFriendsReferrals,
                            this.dnsServOptCounterFriendsErrors,
                            this.dnsServOptCounterFriendsRelNames,
                            this.dnsServOptCounterFriendsReqRefusals,
                            this.dnsServOptCounterFriendsReqUnparses,
                            this.dnsServOptCounterFriendsOtherErrors
                        };
                    }
                    public static final class DnsServOptCounterSelfAuthAnsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfAuthAnsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfAuthAns", "1.3.6.1.2.1.32.1.1.3.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfAuthNoNamesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfAuthNoNamesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfAuthNoNames", "1.3.6.1.2.1.32.1.1.3.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfAuthNoDataRespsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfAuthNoDataRespsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfAuthNoDataResps", "1.3.6.1.2.1.32.1.1.3.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfNonAuthDatasEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfNonAuthDatasEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfNonAuthDatas", "1.3.6.1.2.1.32.1.1.3.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfNonAuthNoDatasEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfNonAuthNoDatasEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfNonAuthNoDatas", "1.3.6.1.2.1.32.1.1.3.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfReferralsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfReferralsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfReferrals", "1.3.6.1.2.1.32.1.1.3.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfErrorsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfErrorsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfErrors", "1.3.6.1.2.1.32.1.1.3.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfRelNamesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfRelNamesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfRelNames", "1.3.6.1.2.1.32.1.1.3.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfReqRefusalsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfReqRefusalsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfReqRefusals", "1.3.6.1.2.1.32.1.1.3.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfReqUnparsesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfReqUnparsesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfReqUnparses", "1.3.6.1.2.1.32.1.1.3.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterSelfOtherErrorsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterSelfOtherErrorsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterSelfOtherErrors", "1.3.6.1.2.1.32.1.1.3.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsAuthAnsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsAuthAnsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsAuthAns", "1.3.6.1.2.1.32.1.1.3.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsAuthNoNamesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsAuthNoNamesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsAuthNoNames", "1.3.6.1.2.1.32.1.1.3.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsAuthNoDataRespsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsAuthNoDataRespsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsAuthNoDataResps", "1.3.6.1.2.1.32.1.1.3.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsNonAuthDatasEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsNonAuthDatasEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsNonAuthDatas", "1.3.6.1.2.1.32.1.1.3.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsNonAuthNoDatasEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsNonAuthNoDatasEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsNonAuthNoDatas", "1.3.6.1.2.1.32.1.1.3.16", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsReferralsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsReferralsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsReferrals", "1.3.6.1.2.1.32.1.1.3.17", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsErrorsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsErrorsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsErrors", "1.3.6.1.2.1.32.1.1.3.18", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsRelNamesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsRelNamesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsRelNames", "1.3.6.1.2.1.32.1.1.3.19", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsReqRefusalsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsReqRefusalsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsReqRefusals", "1.3.6.1.2.1.32.1.1.3.20", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsReqUnparsesEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsReqUnparsesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsReqUnparses", "1.3.6.1.2.1.32.1.1.3.21", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DnsServOptCounterFriendsOtherErrorsEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        private DnsServOptCounterFriendsOtherErrorsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServOptCounterFriendsOtherErrors", "1.3.6.1.2.1.32.1.1.3.22", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class DnsServZoneEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    /** Server Zone Group
DNS Management Zone Configuration Table
This table contains zone configuration information.*/
                    public final DnsServZoneTableEnt dnsServZoneTable;

                    /** DNS Zone Source Table*/
                    public final DnsServZoneSrcTableEnt dnsServZoneSrcTable;

                    private DnsServZoneEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServZone", "1.3.6.1.2.1.32.1.1.4", false, false, false, false);
                        this.dnsServZoneTable = new DnsServZoneTableEnt(mib, this);
                        this.dnsServZoneSrcTable = new DnsServZoneSrcTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dnsServZoneTable,
                            this.dnsServZoneSrcTable
                        };
                    }
                    public static final class DnsServZoneTableEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        public final DnsServZoneEntryEnt dnsServZoneEntry;

                        private DnsServZoneTableEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServZoneTable", "1.3.6.1.2.1.32.1.1.4.1", false, true, false, false);
                            this.dnsServZoneEntry = new DnsServZoneEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsServZoneEntry
                            };
                        }
                        public static final class DnsServZoneEntryEnt extends MIBEntry<DNSSERVERMIBDef>
                        {
                            public final DnsServZoneNameEnt dnsServZoneName;

                            public final DnsServZoneClassEnt dnsServZoneClass;

                            public final DnsServZoneLastReloadSuccessEnt dnsServZoneLastReloadSuccess;

                            public final DnsServZoneLastReloadAttemptEnt dnsServZoneLastReloadAttempt;

                            public final DnsServZoneLastSourceAttemptEnt dnsServZoneLastSourceAttempt;

                            public final DnsServZoneStatusEnt dnsServZoneStatus;

                            public final DnsServZoneSerialEnt dnsServZoneSerial;

                            public final DnsServZoneCurrentEnt dnsServZoneCurrent;

                            public final DnsServZoneLastSourceSuccessEnt dnsServZoneLastSourceSuccess;

                            private DnsServZoneEntryEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsServZoneEntry", "1.3.6.1.2.1.32.1.1.4.1.1", false, false, false, true);
                                this.dnsServZoneName = new DnsServZoneNameEnt(mib, this);
                                this.dnsServZoneClass = new DnsServZoneClassEnt(mib, this);
                                this.dnsServZoneLastReloadSuccess = new DnsServZoneLastReloadSuccessEnt(mib, this);
                                this.dnsServZoneLastReloadAttempt = new DnsServZoneLastReloadAttemptEnt(mib, this);
                                this.dnsServZoneLastSourceAttempt = new DnsServZoneLastSourceAttemptEnt(mib, this);
                                this.dnsServZoneStatus = new DnsServZoneStatusEnt(mib, this);
                                this.dnsServZoneSerial = new DnsServZoneSerialEnt(mib, this);
                                this.dnsServZoneCurrent = new DnsServZoneCurrentEnt(mib, this);
                                this.dnsServZoneLastSourceSuccess = new DnsServZoneLastSourceSuccessEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dnsServZoneName,
                                    this.dnsServZoneClass,
                                    this.dnsServZoneLastReloadSuccess,
                                    this.dnsServZoneLastReloadAttempt,
                                    this.dnsServZoneLastSourceAttempt,
                                    this.dnsServZoneStatus,
                                    this.dnsServZoneSerial,
                                    this.dnsServZoneCurrent,
                                    this.dnsServZoneLastSourceSuccess
                                };
                            }
                            public static final class DnsServZoneNameEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneNameEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneName", "1.3.6.1.2.1.32.1.1.4.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneClassEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneClassEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneClass", "1.3.6.1.2.1.32.1.1.4.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneLastReloadSuccessEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneLastReloadSuccessEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneLastReloadSuccess", "1.3.6.1.2.1.32.1.1.4.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneLastReloadAttemptEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneLastReloadAttemptEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneLastReloadAttempt", "1.3.6.1.2.1.32.1.1.4.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneLastSourceAttemptEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneLastSourceAttemptEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneLastSourceAttempt", "1.3.6.1.2.1.32.1.1.4.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneStatusEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneStatusEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneStatus", "1.3.6.1.2.1.32.1.1.4.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneSerialEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneSerialEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneSerial", "1.3.6.1.2.1.32.1.1.4.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneCurrentEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneCurrentEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneCurrent", "1.3.6.1.2.1.32.1.1.4.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneLastSourceSuccessEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneLastSourceSuccessEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneLastSourceSuccess", "1.3.6.1.2.1.32.1.1.4.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class DnsServZoneSrcTableEnt extends MIBEntry<DNSSERVERMIBDef>
                    {
                        public final DnsServZoneSrcEntryEnt dnsServZoneSrcEntry;

                        private DnsServZoneSrcTableEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                        {
                            super(mib, parent, "dnsServZoneSrcTable", "1.3.6.1.2.1.32.1.1.4.2", false, true, false, false);
                            this.dnsServZoneSrcEntry = new DnsServZoneSrcEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dnsServZoneSrcEntry
                            };
                        }
                        public static final class DnsServZoneSrcEntryEnt extends MIBEntry<DNSSERVERMIBDef>
                        {
                            public final DnsServZoneSrcNameEnt dnsServZoneSrcName;

                            public final DnsServZoneSrcClassEnt dnsServZoneSrcClass;

                            public final DnsServZoneSrcAddrEnt dnsServZoneSrcAddr;

                            public final DnsServZoneSrcStatusEnt dnsServZoneSrcStatus;

                            private DnsServZoneSrcEntryEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                            {
                                super(mib, parent, "dnsServZoneSrcEntry", "1.3.6.1.2.1.32.1.1.4.2.1", false, false, false, true);
                                this.dnsServZoneSrcName = new DnsServZoneSrcNameEnt(mib, this);
                                this.dnsServZoneSrcClass = new DnsServZoneSrcClassEnt(mib, this);
                                this.dnsServZoneSrcAddr = new DnsServZoneSrcAddrEnt(mib, this);
                                this.dnsServZoneSrcStatus = new DnsServZoneSrcStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dnsServZoneSrcName,
                                    this.dnsServZoneSrcClass,
                                    this.dnsServZoneSrcAddr,
                                    this.dnsServZoneSrcStatus
                                };
                            }
                            public static final class DnsServZoneSrcNameEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneSrcNameEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneSrcName", "1.3.6.1.2.1.32.1.1.4.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneSrcClassEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneSrcClassEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneSrcClass", "1.3.6.1.2.1.32.1.1.4.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneSrcAddrEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneSrcAddrEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneSrcAddr", "1.3.6.1.2.1.32.1.1.4.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class DnsServZoneSrcStatusEnt extends MIBEntry<DNSSERVERMIBDef>
                            {
                                private DnsServZoneSrcStatusEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                                {
                                    super(mib, parent, "dnsServZoneSrcStatus", "1.3.6.1.2.1.32.1.1.4.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class DnsServMIBGroupsEnt extends MIBEntry<DNSSERVERMIBDef>
            {
                public final DnsServConfigGroupEnt dnsServConfigGroup;

                public final DnsServCounterGroupEnt dnsServCounterGroup;

                public final DnsServOptCounterGroupEnt dnsServOptCounterGroup;

                public final DnsServZoneGroupEnt dnsServZoneGroup;

                private DnsServMIBGroupsEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                {
                    super(mib, parent, "dnsServMIBGroups", "1.3.6.1.2.1.32.1.2", false, false, false, false);
                    this.dnsServConfigGroup = new DnsServConfigGroupEnt(mib, this);
                    this.dnsServCounterGroup = new DnsServCounterGroupEnt(mib, this);
                    this.dnsServOptCounterGroup = new DnsServOptCounterGroupEnt(mib, this);
                    this.dnsServZoneGroup = new DnsServZoneGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsServConfigGroup,
                        this.dnsServCounterGroup,
                        this.dnsServOptCounterGroup,
                        this.dnsServZoneGroup
                    };
                }
                public static final class DnsServConfigGroupEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    private DnsServConfigGroupEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServConfigGroup", "1.3.6.1.2.1.32.1.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsServCounterGroupEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    private DnsServCounterGroupEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServCounterGroup", "1.3.6.1.2.1.32.1.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsServOptCounterGroupEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    private DnsServOptCounterGroupEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServOptCounterGroup", "1.3.6.1.2.1.32.1.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DnsServZoneGroupEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    private DnsServZoneGroupEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServZoneGroup", "1.3.6.1.2.1.32.1.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DnsServMIBCompliancesEnt extends MIBEntry<DNSSERVERMIBDef>
            {
                public final DnsServMIBComplianceEnt dnsServMIBCompliance;

                private DnsServMIBCompliancesEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                {
                    super(mib, parent, "dnsServMIBCompliances", "1.3.6.1.2.1.32.1.3", false, false, false, false);
                    this.dnsServMIBCompliance = new DnsServMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dnsServMIBCompliance
                    };
                }
                public static final class DnsServMIBComplianceEnt extends MIBEntry<DNSSERVERMIBDef>
                {
                    private DnsServMIBComplianceEnt(DNSSERVERMIBDef mib, MIBEntry<DNSSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dnsServMIBCompliance", "1.3.6.1.2.1.32.1.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
