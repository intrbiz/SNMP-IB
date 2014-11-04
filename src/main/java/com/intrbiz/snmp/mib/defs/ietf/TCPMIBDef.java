package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class TCPMIBDef extends MIB
{
    public static final TCPMIBDef TCPMIB = new TCPMIBDef();

    static { MIBs.getInstance().registerMIB(TCPMIBDef.TCPMIB); }

    /** 18 February 2005*/
    public final TcpMIBEnt tcpMIB;

    public final TcpEnt tcp;

    /** { tcp 16 } was used to represent the ipv6TcpConnTable in RFC 2452,which has since been obsoleted.  It MUST not be used.*/
    public final TcpHCInSegsEnt tcpHCInSegs;

    public final TcpHCOutSegsEnt tcpHCOutSegs;

    /** The TCP Connection table*/
    public final TcpConnectionTableEnt tcpConnectionTable;

    /** The TCP Listener table*/
    public final TcpListenerTableEnt tcpListenerTable;

    private TCPMIBDef()
    {
        super("TCP-MIB");
        this.tcpMIB = new TcpMIBEnt(this, null);
        this.tcp = new TcpEnt(this, null);
        this.tcpHCInSegs = new TcpHCInSegsEnt(this, null);
        this.tcpHCOutSegs = new TcpHCOutSegsEnt(this, null);
        this.tcpConnectionTable = new TcpConnectionTableEnt(this, null);
        this.tcpListenerTable = new TcpListenerTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tcpMIB,
            this.tcp,
            this.tcpHCInSegs,
            this.tcpHCOutSegs,
            this.tcpConnectionTable,
            this.tcpListenerTable
        };
    }

    public static final class TcpMIBEnt extends MIBEntry<TCPMIBDef>
    {
        /** conformance information*/
        public final TcpMIBConformanceEnt tcpMIBConformance;

        private TcpMIBEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
        {
            super(mib, parent, "tcpMIB", "1.3.6.1.2.1.49", false, false, false, false);
            this.tcpMIBConformance = new TcpMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tcpMIBConformance
            };
        }
        public static final class TcpMIBConformanceEnt extends MIBEntry<TCPMIBDef>
        {
            public final TcpMIBCompliancesEnt tcpMIBCompliances;

            public final TcpMIBGroupsEnt tcpMIBGroups;

            private TcpMIBConformanceEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpMIBConformance", "1.3.6.1.2.1.49.2", false, false, false, false);
                this.tcpMIBCompliances = new TcpMIBCompliancesEnt(mib, this);
                this.tcpMIBGroups = new TcpMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpMIBCompliances,
                    this.tcpMIBGroups
                };
            }
            public static final class TcpMIBCompliancesEnt extends MIBEntry<TCPMIBDef>
            {
                /** compliance statements*/
                public final TcpMIBCompliance2Ent tcpMIBCompliance2;

                public final TcpMIBComplianceEnt tcpMIBCompliance;

                private TcpMIBCompliancesEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpMIBCompliances", "1.3.6.1.2.1.49.2.1", false, false, false, false);
                    this.tcpMIBCompliance2 = new TcpMIBCompliance2Ent(mib, this);
                    this.tcpMIBCompliance = new TcpMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpMIBCompliance2,
                        this.tcpMIBCompliance
                    };
                }
                public static final class TcpMIBCompliance2Ent extends MIBEntry<TCPMIBDef>
                {
                    private TcpMIBCompliance2Ent(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpMIBCompliance2", "1.3.6.1.2.1.49.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpMIBComplianceEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpMIBComplianceEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpMIBCompliance", "1.3.6.1.2.1.49.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TcpMIBGroupsEnt extends MIBEntry<TCPMIBDef>
            {
                /** units of conformance*/
                public final TcpGroupEnt tcpGroup;

                public final TcpBaseGroupEnt tcpBaseGroup;

                public final TcpConnectionGroupEnt tcpConnectionGroup;

                public final TcpListenerGroupEnt tcpListenerGroup;

                public final TcpHCGroupEnt tcpHCGroup;

                private TcpMIBGroupsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpMIBGroups", "1.3.6.1.2.1.49.2.2", false, false, false, false);
                    this.tcpGroup = new TcpGroupEnt(mib, this);
                    this.tcpBaseGroup = new TcpBaseGroupEnt(mib, this);
                    this.tcpConnectionGroup = new TcpConnectionGroupEnt(mib, this);
                    this.tcpListenerGroup = new TcpListenerGroupEnt(mib, this);
                    this.tcpHCGroup = new TcpHCGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpGroup,
                        this.tcpBaseGroup,
                        this.tcpConnectionGroup,
                        this.tcpListenerGroup,
                        this.tcpHCGroup
                    };
                }
                public static final class TcpGroupEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpGroupEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpGroup", "1.3.6.1.2.1.49.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpBaseGroupEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpBaseGroupEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpBaseGroup", "1.3.6.1.2.1.49.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnectionGroupEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpConnectionGroupEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpConnectionGroup", "1.3.6.1.2.1.49.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpListenerGroupEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpListenerGroupEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpListenerGroup", "1.3.6.1.2.1.49.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpHCGroupEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpHCGroupEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpHCGroup", "1.3.6.1.2.1.49.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class TcpEnt extends MIBEntry<TCPMIBDef>
    {
        /** the TCP group
Implementation of the TCP group is mandatory for allsystems that implement the TCP.
Note that instances of object types that representinformation about a particular TCP connection aretransient; they persist only as long as the connectionin question.*/
        public final TcpRtoAlgorithmEnt tcpRtoAlgorithm;

        public final TcpRtoMinEnt tcpRtoMin;

        public final TcpRtoMaxEnt tcpRtoMax;

        public final TcpMaxConnEnt tcpMaxConn;

        public final TcpActiveOpensEnt tcpActiveOpens;

        public final TcpPassiveOpensEnt tcpPassiveOpens;

        public final TcpAttemptFailsEnt tcpAttemptFails;

        public final TcpEstabResetsEnt tcpEstabResets;

        public final TcpCurrEstabEnt tcpCurrEstab;

        public final TcpInSegsEnt tcpInSegs;

        public final TcpOutSegsEnt tcpOutSegs;

        public final TcpRetransSegsEnt tcpRetransSegs;

        /** additional TCP objects*/
        public final TcpInErrsEnt tcpInErrs;

        public final TcpOutRstsEnt tcpOutRsts;

        /** the TCP Connection table
The TCP connection table contains information about thisentity's existing TCP connections.*/
        public final TcpConnTableEnt tcpConnTable;

        private TcpEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
        {
            super(mib, parent, "tcp", "1.3.6.1.2.1.6", false, false, false, false);
            this.tcpRtoAlgorithm = new TcpRtoAlgorithmEnt(mib, this);
            this.tcpRtoMin = new TcpRtoMinEnt(mib, this);
            this.tcpRtoMax = new TcpRtoMaxEnt(mib, this);
            this.tcpMaxConn = new TcpMaxConnEnt(mib, this);
            this.tcpActiveOpens = new TcpActiveOpensEnt(mib, this);
            this.tcpPassiveOpens = new TcpPassiveOpensEnt(mib, this);
            this.tcpAttemptFails = new TcpAttemptFailsEnt(mib, this);
            this.tcpEstabResets = new TcpEstabResetsEnt(mib, this);
            this.tcpCurrEstab = new TcpCurrEstabEnt(mib, this);
            this.tcpInSegs = new TcpInSegsEnt(mib, this);
            this.tcpOutSegs = new TcpOutSegsEnt(mib, this);
            this.tcpRetransSegs = new TcpRetransSegsEnt(mib, this);
            this.tcpInErrs = new TcpInErrsEnt(mib, this);
            this.tcpOutRsts = new TcpOutRstsEnt(mib, this);
            this.tcpConnTable = new TcpConnTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tcpRtoAlgorithm,
                this.tcpRtoMin,
                this.tcpRtoMax,
                this.tcpMaxConn,
                this.tcpActiveOpens,
                this.tcpPassiveOpens,
                this.tcpAttemptFails,
                this.tcpEstabResets,
                this.tcpCurrEstab,
                this.tcpInSegs,
                this.tcpOutSegs,
                this.tcpRetransSegs,
                this.tcpInErrs,
                this.tcpOutRsts,
                this.tcpConnTable
            };
        }
        public static final class TcpRtoAlgorithmEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpRtoAlgorithmEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpRtoAlgorithm", "1.3.6.1.2.1.6.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpRtoMinEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpRtoMinEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpRtoMin", "1.3.6.1.2.1.6.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpRtoMaxEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpRtoMaxEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpRtoMax", "1.3.6.1.2.1.6.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpMaxConnEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpMaxConnEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpMaxConn", "1.3.6.1.2.1.6.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpActiveOpensEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpActiveOpensEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpActiveOpens", "1.3.6.1.2.1.6.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpPassiveOpensEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpPassiveOpensEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpPassiveOpens", "1.3.6.1.2.1.6.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpAttemptFailsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpAttemptFailsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpAttemptFails", "1.3.6.1.2.1.6.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpEstabResetsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpEstabResetsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpEstabResets", "1.3.6.1.2.1.6.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpCurrEstabEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpCurrEstabEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpCurrEstab", "1.3.6.1.2.1.6.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpInSegsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpInSegsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpInSegs", "1.3.6.1.2.1.6.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpOutSegsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpOutSegsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpOutSegs", "1.3.6.1.2.1.6.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpRetransSegsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpRetransSegsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpRetransSegs", "1.3.6.1.2.1.6.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpInErrsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpInErrsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpInErrs", "1.3.6.1.2.1.6.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpOutRstsEnt extends MIBEntry<TCPMIBDef>
        {
            private TcpOutRstsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpOutRsts", "1.3.6.1.2.1.6.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpConnTableEnt extends MIBEntry<TCPMIBDef>
        {
            public final TcpConnEntryEnt tcpConnEntry;

            private TcpConnTableEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpConnTable", "1.3.6.1.2.1.6.13", false, true, false, false);
                this.tcpConnEntry = new TcpConnEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpConnEntry
                };
            }
            public static final class TcpConnEntryEnt extends MIBEntry<TCPMIBDef>
            {
                public final TcpConnStateEnt tcpConnState;

                public final TcpConnLocalAddressEnt tcpConnLocalAddress;

                public final TcpConnLocalPortEnt tcpConnLocalPort;

                public final TcpConnRemAddressEnt tcpConnRemAddress;

                public final TcpConnRemPortEnt tcpConnRemPort;

                private TcpConnEntryEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnEntry", "1.3.6.1.2.1.6.13.1", false, false, false, true);
                    this.tcpConnState = new TcpConnStateEnt(mib, this);
                    this.tcpConnLocalAddress = new TcpConnLocalAddressEnt(mib, this);
                    this.tcpConnLocalPort = new TcpConnLocalPortEnt(mib, this);
                    this.tcpConnRemAddress = new TcpConnRemAddressEnt(mib, this);
                    this.tcpConnRemPort = new TcpConnRemPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpConnState,
                        this.tcpConnLocalAddress,
                        this.tcpConnLocalPort,
                        this.tcpConnRemAddress,
                        this.tcpConnRemPort
                    };
                }
                public static final class TcpConnStateEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpConnStateEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpConnState", "1.3.6.1.2.1.6.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnLocalAddressEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpConnLocalAddressEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpConnLocalAddress", "1.3.6.1.2.1.6.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnLocalPortEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpConnLocalPortEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpConnLocalPort", "1.3.6.1.2.1.6.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnRemAddressEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpConnRemAddressEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpConnRemAddress", "1.3.6.1.2.1.6.13.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnRemPortEnt extends MIBEntry<TCPMIBDef>
                {
                    private TcpConnRemPortEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                    {
                        super(mib, parent, "tcpConnRemPort", "1.3.6.1.2.1.6.13.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class TcpHCInSegsEnt extends MIBEntry<TCPMIBDef>
    {
        private TcpHCInSegsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
        {
            super(mib, parent, "tcpHCInSegs", "1.3.6.1.2.1.6.17", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class TcpHCOutSegsEnt extends MIBEntry<TCPMIBDef>
    {
        private TcpHCOutSegsEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
        {
            super(mib, parent, "tcpHCOutSegs", "1.3.6.1.2.1.6.18", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class TcpConnectionTableEnt extends MIBEntry<TCPMIBDef>
    {
        public final TcpConnectionEntryEnt tcpConnectionEntry;

        private TcpConnectionTableEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
        {
            super(mib, parent, "tcpConnectionTable", "1.3.6.1.2.1.6.19", false, true, false, false);
            this.tcpConnectionEntry = new TcpConnectionEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tcpConnectionEntry
            };
        }
        public static final class TcpConnectionEntryEnt extends MIBEntry<TCPMIBDef>
        {
            public final TcpConnectionLocalAddressTypeEnt tcpConnectionLocalAddressType;

            public final TcpConnectionLocalAddressEnt tcpConnectionLocalAddress;

            public final TcpConnectionLocalPortEnt tcpConnectionLocalPort;

            public final TcpConnectionRemAddressTypeEnt tcpConnectionRemAddressType;

            public final TcpConnectionRemAddressEnt tcpConnectionRemAddress;

            public final TcpConnectionRemPortEnt tcpConnectionRemPort;

            public final TcpConnectionStateEnt tcpConnectionState;

            public final TcpConnectionProcessEnt tcpConnectionProcess;

            private TcpConnectionEntryEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpConnectionEntry", "1.3.6.1.2.1.6.19.1", false, false, false, true);
                this.tcpConnectionLocalAddressType = new TcpConnectionLocalAddressTypeEnt(mib, this);
                this.tcpConnectionLocalAddress = new TcpConnectionLocalAddressEnt(mib, this);
                this.tcpConnectionLocalPort = new TcpConnectionLocalPortEnt(mib, this);
                this.tcpConnectionRemAddressType = new TcpConnectionRemAddressTypeEnt(mib, this);
                this.tcpConnectionRemAddress = new TcpConnectionRemAddressEnt(mib, this);
                this.tcpConnectionRemPort = new TcpConnectionRemPortEnt(mib, this);
                this.tcpConnectionState = new TcpConnectionStateEnt(mib, this);
                this.tcpConnectionProcess = new TcpConnectionProcessEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpConnectionLocalAddressType,
                    this.tcpConnectionLocalAddress,
                    this.tcpConnectionLocalPort,
                    this.tcpConnectionRemAddressType,
                    this.tcpConnectionRemAddress,
                    this.tcpConnectionRemPort,
                    this.tcpConnectionState,
                    this.tcpConnectionProcess
                };
            }
            public static final class TcpConnectionLocalAddressTypeEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionLocalAddressTypeEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionLocalAddressType", "1.3.6.1.2.1.6.19.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionLocalAddressEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionLocalAddressEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionLocalAddress", "1.3.6.1.2.1.6.19.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionLocalPortEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionLocalPortEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionLocalPort", "1.3.6.1.2.1.6.19.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionRemAddressTypeEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionRemAddressTypeEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionRemAddressType", "1.3.6.1.2.1.6.19.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionRemAddressEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionRemAddressEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionRemAddress", "1.3.6.1.2.1.6.19.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionRemPortEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionRemPortEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionRemPort", "1.3.6.1.2.1.6.19.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionStateEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionStateEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionState", "1.3.6.1.2.1.6.19.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpConnectionProcessEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpConnectionProcessEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpConnectionProcess", "1.3.6.1.2.1.6.19.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class TcpListenerTableEnt extends MIBEntry<TCPMIBDef>
    {
        public final TcpListenerEntryEnt tcpListenerEntry;

        private TcpListenerTableEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
        {
            super(mib, parent, "tcpListenerTable", "1.3.6.1.2.1.6.20", false, true, false, false);
            this.tcpListenerEntry = new TcpListenerEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tcpListenerEntry
            };
        }
        public static final class TcpListenerEntryEnt extends MIBEntry<TCPMIBDef>
        {
            public final TcpListenerLocalAddressTypeEnt tcpListenerLocalAddressType;

            public final TcpListenerLocalAddressEnt tcpListenerLocalAddress;

            public final TcpListenerLocalPortEnt tcpListenerLocalPort;

            public final TcpListenerProcessEnt tcpListenerProcess;

            private TcpListenerEntryEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
            {
                super(mib, parent, "tcpListenerEntry", "1.3.6.1.2.1.6.20.1", false, false, false, true);
                this.tcpListenerLocalAddressType = new TcpListenerLocalAddressTypeEnt(mib, this);
                this.tcpListenerLocalAddress = new TcpListenerLocalAddressEnt(mib, this);
                this.tcpListenerLocalPort = new TcpListenerLocalPortEnt(mib, this);
                this.tcpListenerProcess = new TcpListenerProcessEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpListenerLocalAddressType,
                    this.tcpListenerLocalAddress,
                    this.tcpListenerLocalPort,
                    this.tcpListenerProcess
                };
            }
            public static final class TcpListenerLocalAddressTypeEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpListenerLocalAddressTypeEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpListenerLocalAddressType", "1.3.6.1.2.1.6.20.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpListenerLocalAddressEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpListenerLocalAddressEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpListenerLocalAddress", "1.3.6.1.2.1.6.20.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpListenerLocalPortEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpListenerLocalPortEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpListenerLocalPort", "1.3.6.1.2.1.6.20.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TcpListenerProcessEnt extends MIBEntry<TCPMIBDef>
            {
                private TcpListenerProcessEnt(TCPMIBDef mib, MIBEntry<TCPMIBDef> parent)
                {
                    super(mib, parent, "tcpListenerProcess", "1.3.6.1.2.1.6.20.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
