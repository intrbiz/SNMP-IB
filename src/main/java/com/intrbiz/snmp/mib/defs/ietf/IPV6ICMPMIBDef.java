package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class IPV6ICMPMIBDef extends MIB
{
    public static final IPV6ICMPMIBDef IPV6ICMPMIB = new IPV6ICMPMIBDef();

    public final Ipv6IcmpMIBEnt ipv6IcmpMIB;

    private IPV6ICMPMIBDef()
    {
        super("IPV6-ICMP-MIB");
        this.ipv6IcmpMIB = new Ipv6IcmpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipv6IcmpMIB
        };
    }

    public static final class Ipv6IcmpMIBEnt extends MIBEntry<IPV6ICMPMIBDef>
    {
        /** the ICMPv6 group*/
        public final Ipv6IcmpMIBObjectsEnt ipv6IcmpMIBObjects;

        /** conformance information*/
        public final Ipv6IcmpConformanceEnt ipv6IcmpConformance;

        private Ipv6IcmpMIBEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
        {
            super(mib, parent, "ipv6IcmpMIB", "1.3.6.1.2.1.56", false, false, false, false);
            this.ipv6IcmpMIBObjects = new Ipv6IcmpMIBObjectsEnt(mib, this);
            this.ipv6IcmpConformance = new Ipv6IcmpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipv6IcmpMIBObjects,
                this.ipv6IcmpConformance
            };
        }
        public static final class Ipv6IcmpMIBObjectsEnt extends MIBEntry<IPV6ICMPMIBDef>
        {
            /** Per-interface ICMPv6 statistics table*/
            public final Ipv6IfIcmpTableEnt ipv6IfIcmpTable;

            private Ipv6IcmpMIBObjectsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
            {
                super(mib, parent, "ipv6IcmpMIBObjects", "1.3.6.1.2.1.56.1", false, false, false, false);
                this.ipv6IfIcmpTable = new Ipv6IfIcmpTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6IfIcmpTable
                };
            }
            public static final class Ipv6IfIcmpTableEnt extends MIBEntry<IPV6ICMPMIBDef>
            {
                public final Ipv6IfIcmpEntryEnt ipv6IfIcmpEntry;

                private Ipv6IfIcmpTableEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                {
                    super(mib, parent, "ipv6IfIcmpTable", "1.3.6.1.2.1.56.1.1", false, true, false, false);
                    this.ipv6IfIcmpEntry = new Ipv6IfIcmpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6IfIcmpEntry
                    };
                }
                public static final class Ipv6IfIcmpEntryEnt extends MIBEntry<IPV6ICMPMIBDef>
                {
                    public final Ipv6IfIcmpInMsgsEnt ipv6IfIcmpInMsgs;

                    public final Ipv6IfIcmpInErrorsEnt ipv6IfIcmpInErrors;

                    public final Ipv6IfIcmpInDestUnreachsEnt ipv6IfIcmpInDestUnreachs;

                    public final Ipv6IfIcmpInAdminProhibsEnt ipv6IfIcmpInAdminProhibs;

                    public final Ipv6IfIcmpInTimeExcdsEnt ipv6IfIcmpInTimeExcds;

                    public final Ipv6IfIcmpInParmProblemsEnt ipv6IfIcmpInParmProblems;

                    public final Ipv6IfIcmpInPktTooBigsEnt ipv6IfIcmpInPktTooBigs;

                    public final Ipv6IfIcmpInEchosEnt ipv6IfIcmpInEchos;

                    public final Ipv6IfIcmpInEchoRepliesEnt ipv6IfIcmpInEchoReplies;

                    public final Ipv6IfIcmpInRouterSolicitsEnt ipv6IfIcmpInRouterSolicits;

                    public final Ipv6IfIcmpInRouterAdvertisementsEnt ipv6IfIcmpInRouterAdvertisements;

                    public final Ipv6IfIcmpInNeighborSolicitsEnt ipv6IfIcmpInNeighborSolicits;

                    public final Ipv6IfIcmpInNeighborAdvertisementsEnt ipv6IfIcmpInNeighborAdvertisements;

                    public final Ipv6IfIcmpInRedirectsEnt ipv6IfIcmpInRedirects;

                    public final Ipv6IfIcmpInGroupMembQueriesEnt ipv6IfIcmpInGroupMembQueries;

                    public final Ipv6IfIcmpInGroupMembResponsesEnt ipv6IfIcmpInGroupMembResponses;

                    public final Ipv6IfIcmpInGroupMembReductionsEnt ipv6IfIcmpInGroupMembReductions;

                    public final Ipv6IfIcmpOutMsgsEnt ipv6IfIcmpOutMsgs;

                    public final Ipv6IfIcmpOutErrorsEnt ipv6IfIcmpOutErrors;

                    public final Ipv6IfIcmpOutDestUnreachsEnt ipv6IfIcmpOutDestUnreachs;

                    public final Ipv6IfIcmpOutAdminProhibsEnt ipv6IfIcmpOutAdminProhibs;

                    public final Ipv6IfIcmpOutTimeExcdsEnt ipv6IfIcmpOutTimeExcds;

                    public final Ipv6IfIcmpOutParmProblemsEnt ipv6IfIcmpOutParmProblems;

                    public final Ipv6IfIcmpOutPktTooBigsEnt ipv6IfIcmpOutPktTooBigs;

                    public final Ipv6IfIcmpOutEchosEnt ipv6IfIcmpOutEchos;

                    public final Ipv6IfIcmpOutEchoRepliesEnt ipv6IfIcmpOutEchoReplies;

                    public final Ipv6IfIcmpOutRouterSolicitsEnt ipv6IfIcmpOutRouterSolicits;

                    public final Ipv6IfIcmpOutRouterAdvertisementsEnt ipv6IfIcmpOutRouterAdvertisements;

                    public final Ipv6IfIcmpOutNeighborSolicitsEnt ipv6IfIcmpOutNeighborSolicits;

                    public final Ipv6IfIcmpOutNeighborAdvertisementsEnt ipv6IfIcmpOutNeighborAdvertisements;

                    public final Ipv6IfIcmpOutRedirectsEnt ipv6IfIcmpOutRedirects;

                    public final Ipv6IfIcmpOutGroupMembQueriesEnt ipv6IfIcmpOutGroupMembQueries;

                    public final Ipv6IfIcmpOutGroupMembResponsesEnt ipv6IfIcmpOutGroupMembResponses;

                    public final Ipv6IfIcmpOutGroupMembReductionsEnt ipv6IfIcmpOutGroupMembReductions;

                    private Ipv6IfIcmpEntryEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6IfIcmpEntry", "1.3.6.1.2.1.56.1.1.1", false, false, false, true);
                        this.ipv6IfIcmpInMsgs = new Ipv6IfIcmpInMsgsEnt(mib, this);
                        this.ipv6IfIcmpInErrors = new Ipv6IfIcmpInErrorsEnt(mib, this);
                        this.ipv6IfIcmpInDestUnreachs = new Ipv6IfIcmpInDestUnreachsEnt(mib, this);
                        this.ipv6IfIcmpInAdminProhibs = new Ipv6IfIcmpInAdminProhibsEnt(mib, this);
                        this.ipv6IfIcmpInTimeExcds = new Ipv6IfIcmpInTimeExcdsEnt(mib, this);
                        this.ipv6IfIcmpInParmProblems = new Ipv6IfIcmpInParmProblemsEnt(mib, this);
                        this.ipv6IfIcmpInPktTooBigs = new Ipv6IfIcmpInPktTooBigsEnt(mib, this);
                        this.ipv6IfIcmpInEchos = new Ipv6IfIcmpInEchosEnt(mib, this);
                        this.ipv6IfIcmpInEchoReplies = new Ipv6IfIcmpInEchoRepliesEnt(mib, this);
                        this.ipv6IfIcmpInRouterSolicits = new Ipv6IfIcmpInRouterSolicitsEnt(mib, this);
                        this.ipv6IfIcmpInRouterAdvertisements = new Ipv6IfIcmpInRouterAdvertisementsEnt(mib, this);
                        this.ipv6IfIcmpInNeighborSolicits = new Ipv6IfIcmpInNeighborSolicitsEnt(mib, this);
                        this.ipv6IfIcmpInNeighborAdvertisements = new Ipv6IfIcmpInNeighborAdvertisementsEnt(mib, this);
                        this.ipv6IfIcmpInRedirects = new Ipv6IfIcmpInRedirectsEnt(mib, this);
                        this.ipv6IfIcmpInGroupMembQueries = new Ipv6IfIcmpInGroupMembQueriesEnt(mib, this);
                        this.ipv6IfIcmpInGroupMembResponses = new Ipv6IfIcmpInGroupMembResponsesEnt(mib, this);
                        this.ipv6IfIcmpInGroupMembReductions = new Ipv6IfIcmpInGroupMembReductionsEnt(mib, this);
                        this.ipv6IfIcmpOutMsgs = new Ipv6IfIcmpOutMsgsEnt(mib, this);
                        this.ipv6IfIcmpOutErrors = new Ipv6IfIcmpOutErrorsEnt(mib, this);
                        this.ipv6IfIcmpOutDestUnreachs = new Ipv6IfIcmpOutDestUnreachsEnt(mib, this);
                        this.ipv6IfIcmpOutAdminProhibs = new Ipv6IfIcmpOutAdminProhibsEnt(mib, this);
                        this.ipv6IfIcmpOutTimeExcds = new Ipv6IfIcmpOutTimeExcdsEnt(mib, this);
                        this.ipv6IfIcmpOutParmProblems = new Ipv6IfIcmpOutParmProblemsEnt(mib, this);
                        this.ipv6IfIcmpOutPktTooBigs = new Ipv6IfIcmpOutPktTooBigsEnt(mib, this);
                        this.ipv6IfIcmpOutEchos = new Ipv6IfIcmpOutEchosEnt(mib, this);
                        this.ipv6IfIcmpOutEchoReplies = new Ipv6IfIcmpOutEchoRepliesEnt(mib, this);
                        this.ipv6IfIcmpOutRouterSolicits = new Ipv6IfIcmpOutRouterSolicitsEnt(mib, this);
                        this.ipv6IfIcmpOutRouterAdvertisements = new Ipv6IfIcmpOutRouterAdvertisementsEnt(mib, this);
                        this.ipv6IfIcmpOutNeighborSolicits = new Ipv6IfIcmpOutNeighborSolicitsEnt(mib, this);
                        this.ipv6IfIcmpOutNeighborAdvertisements = new Ipv6IfIcmpOutNeighborAdvertisementsEnt(mib, this);
                        this.ipv6IfIcmpOutRedirects = new Ipv6IfIcmpOutRedirectsEnt(mib, this);
                        this.ipv6IfIcmpOutGroupMembQueries = new Ipv6IfIcmpOutGroupMembQueriesEnt(mib, this);
                        this.ipv6IfIcmpOutGroupMembResponses = new Ipv6IfIcmpOutGroupMembResponsesEnt(mib, this);
                        this.ipv6IfIcmpOutGroupMembReductions = new Ipv6IfIcmpOutGroupMembReductionsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipv6IfIcmpInMsgs,
                            this.ipv6IfIcmpInErrors,
                            this.ipv6IfIcmpInDestUnreachs,
                            this.ipv6IfIcmpInAdminProhibs,
                            this.ipv6IfIcmpInTimeExcds,
                            this.ipv6IfIcmpInParmProblems,
                            this.ipv6IfIcmpInPktTooBigs,
                            this.ipv6IfIcmpInEchos,
                            this.ipv6IfIcmpInEchoReplies,
                            this.ipv6IfIcmpInRouterSolicits,
                            this.ipv6IfIcmpInRouterAdvertisements,
                            this.ipv6IfIcmpInNeighborSolicits,
                            this.ipv6IfIcmpInNeighborAdvertisements,
                            this.ipv6IfIcmpInRedirects,
                            this.ipv6IfIcmpInGroupMembQueries,
                            this.ipv6IfIcmpInGroupMembResponses,
                            this.ipv6IfIcmpInGroupMembReductions,
                            this.ipv6IfIcmpOutMsgs,
                            this.ipv6IfIcmpOutErrors,
                            this.ipv6IfIcmpOutDestUnreachs,
                            this.ipv6IfIcmpOutAdminProhibs,
                            this.ipv6IfIcmpOutTimeExcds,
                            this.ipv6IfIcmpOutParmProblems,
                            this.ipv6IfIcmpOutPktTooBigs,
                            this.ipv6IfIcmpOutEchos,
                            this.ipv6IfIcmpOutEchoReplies,
                            this.ipv6IfIcmpOutRouterSolicits,
                            this.ipv6IfIcmpOutRouterAdvertisements,
                            this.ipv6IfIcmpOutNeighborSolicits,
                            this.ipv6IfIcmpOutNeighborAdvertisements,
                            this.ipv6IfIcmpOutRedirects,
                            this.ipv6IfIcmpOutGroupMembQueries,
                            this.ipv6IfIcmpOutGroupMembResponses,
                            this.ipv6IfIcmpOutGroupMembReductions
                        };
                    }
                    public static final class Ipv6IfIcmpInMsgsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInMsgsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInMsgs", "1.3.6.1.2.1.56.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInErrorsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInErrorsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInErrors", "1.3.6.1.2.1.56.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInDestUnreachsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInDestUnreachsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInDestUnreachs", "1.3.6.1.2.1.56.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInAdminProhibsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInAdminProhibsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInAdminProhibs", "1.3.6.1.2.1.56.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInTimeExcdsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInTimeExcdsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInTimeExcds", "1.3.6.1.2.1.56.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInParmProblemsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInParmProblemsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInParmProblems", "1.3.6.1.2.1.56.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInPktTooBigsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInPktTooBigsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInPktTooBigs", "1.3.6.1.2.1.56.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInEchosEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInEchosEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInEchos", "1.3.6.1.2.1.56.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInEchoRepliesEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInEchoRepliesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInEchoReplies", "1.3.6.1.2.1.56.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInRouterSolicitsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInRouterSolicitsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInRouterSolicits", "1.3.6.1.2.1.56.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInRouterAdvertisementsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInRouterAdvertisementsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInRouterAdvertisements", "1.3.6.1.2.1.56.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInNeighborSolicitsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInNeighborSolicitsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInNeighborSolicits", "1.3.6.1.2.1.56.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInNeighborAdvertisementsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInNeighborAdvertisementsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInNeighborAdvertisements", "1.3.6.1.2.1.56.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInRedirectsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInRedirectsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInRedirects", "1.3.6.1.2.1.56.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInGroupMembQueriesEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInGroupMembQueriesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInGroupMembQueries", "1.3.6.1.2.1.56.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInGroupMembResponsesEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInGroupMembResponsesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInGroupMembResponses", "1.3.6.1.2.1.56.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpInGroupMembReductionsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpInGroupMembReductionsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpInGroupMembReductions", "1.3.6.1.2.1.56.1.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutMsgsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutMsgsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutMsgs", "1.3.6.1.2.1.56.1.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutErrorsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutErrorsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutErrors", "1.3.6.1.2.1.56.1.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutDestUnreachsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutDestUnreachsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutDestUnreachs", "1.3.6.1.2.1.56.1.1.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutAdminProhibsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutAdminProhibsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutAdminProhibs", "1.3.6.1.2.1.56.1.1.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutTimeExcdsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutTimeExcdsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutTimeExcds", "1.3.6.1.2.1.56.1.1.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutParmProblemsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutParmProblemsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutParmProblems", "1.3.6.1.2.1.56.1.1.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutPktTooBigsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutPktTooBigsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutPktTooBigs", "1.3.6.1.2.1.56.1.1.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutEchosEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutEchosEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutEchos", "1.3.6.1.2.1.56.1.1.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutEchoRepliesEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutEchoRepliesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutEchoReplies", "1.3.6.1.2.1.56.1.1.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutRouterSolicitsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutRouterSolicitsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutRouterSolicits", "1.3.6.1.2.1.56.1.1.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutRouterAdvertisementsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutRouterAdvertisementsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutRouterAdvertisements", "1.3.6.1.2.1.56.1.1.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutNeighborSolicitsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutNeighborSolicitsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutNeighborSolicits", "1.3.6.1.2.1.56.1.1.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutNeighborAdvertisementsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutNeighborAdvertisementsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutNeighborAdvertisements", "1.3.6.1.2.1.56.1.1.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutRedirectsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutRedirectsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutRedirects", "1.3.6.1.2.1.56.1.1.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutGroupMembQueriesEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutGroupMembQueriesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutGroupMembQueries", "1.3.6.1.2.1.56.1.1.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutGroupMembResponsesEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutGroupMembResponsesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutGroupMembResponses", "1.3.6.1.2.1.56.1.1.1.33", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Ipv6IfIcmpOutGroupMembReductionsEnt extends MIBEntry<IPV6ICMPMIBDef>
                    {
                        private Ipv6IfIcmpOutGroupMembReductionsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                        {
                            super(mib, parent, "ipv6IfIcmpOutGroupMembReductions", "1.3.6.1.2.1.56.1.1.1.34", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Ipv6IcmpConformanceEnt extends MIBEntry<IPV6ICMPMIBDef>
        {
            public final Ipv6IcmpCompliancesEnt ipv6IcmpCompliances;

            public final Ipv6IcmpGroupsEnt ipv6IcmpGroups;

            private Ipv6IcmpConformanceEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
            {
                super(mib, parent, "ipv6IcmpConformance", "1.3.6.1.2.1.56.2", false, false, false, false);
                this.ipv6IcmpCompliances = new Ipv6IcmpCompliancesEnt(mib, this);
                this.ipv6IcmpGroups = new Ipv6IcmpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipv6IcmpCompliances,
                    this.ipv6IcmpGroups
                };
            }
            public static final class Ipv6IcmpCompliancesEnt extends MIBEntry<IPV6ICMPMIBDef>
            {
                /** compliance statements*/
                public final Ipv6IcmpComplianceEnt ipv6IcmpCompliance;

                private Ipv6IcmpCompliancesEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                {
                    super(mib, parent, "ipv6IcmpCompliances", "1.3.6.1.2.1.56.2.1", false, false, false, false);
                    this.ipv6IcmpCompliance = new Ipv6IcmpComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6IcmpCompliance
                    };
                }
                public static final class Ipv6IcmpComplianceEnt extends MIBEntry<IPV6ICMPMIBDef>
                {
                    private Ipv6IcmpComplianceEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6IcmpCompliance", "1.3.6.1.2.1.56.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Ipv6IcmpGroupsEnt extends MIBEntry<IPV6ICMPMIBDef>
            {
                public final Ipv6IcmpGroupEnt ipv6IcmpGroup;

                private Ipv6IcmpGroupsEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                {
                    super(mib, parent, "ipv6IcmpGroups", "1.3.6.1.2.1.56.2.2", false, false, false, false);
                    this.ipv6IcmpGroup = new Ipv6IcmpGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipv6IcmpGroup
                    };
                }
                public static final class Ipv6IcmpGroupEnt extends MIBEntry<IPV6ICMPMIBDef>
                {
                    private Ipv6IcmpGroupEnt(IPV6ICMPMIBDef mib, MIBEntry<IPV6ICMPMIBDef> parent)
                    {
                        super(mib, parent, "ipv6IcmpGroup", "1.3.6.1.2.1.56.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
