package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class TRANSPORTADDRESSMIBDef extends MIB
{
    public static final TRANSPORTADDRESSMIBDef TRANSPORTADDRESSMIB = new TRANSPORTADDRESSMIBDef();

    static { MIBs.getInstance().registerMIB(TRANSPORTADDRESSMIBDef.TRANSPORTADDRESSMIB); }

    public final TransportAddressMIBEnt transportAddressMIB;

    private TRANSPORTADDRESSMIBDef()
    {
        super("TRANSPORT-ADDRESS-MIB");
        this.transportAddressMIB = new TransportAddressMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.transportAddressMIB
        };
    }

    public static final class TransportAddressMIBEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
    {
        public final TransportDomainsEnt transportDomains;

        private TransportAddressMIBEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
        {
            super(mib, parent, "transportAddressMIB", "1.3.6.1.2.1.100", false, false, false, false);
            this.transportDomains = new TransportDomainsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.transportDomains
            };
        }
        public static final class TransportDomainsEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
        {
            public final TransportDomainUdpIpv4Ent transportDomainUdpIpv4;

            public final TransportDomainUdpIpv6Ent transportDomainUdpIpv6;

            public final TransportDomainUdpIpv4zEnt transportDomainUdpIpv4z;

            public final TransportDomainUdpIpv6zEnt transportDomainUdpIpv6z;

            public final TransportDomainTcpIpv4Ent transportDomainTcpIpv4;

            public final TransportDomainTcpIpv6Ent transportDomainTcpIpv6;

            public final TransportDomainTcpIpv4zEnt transportDomainTcpIpv4z;

            public final TransportDomainTcpIpv6zEnt transportDomainTcpIpv6z;

            public final TransportDomainSctpIpv4Ent transportDomainSctpIpv4;

            public final TransportDomainSctpIpv6Ent transportDomainSctpIpv6;

            public final TransportDomainSctpIpv4zEnt transportDomainSctpIpv4z;

            public final TransportDomainSctpIpv6zEnt transportDomainSctpIpv6z;

            public final TransportDomainLocalEnt transportDomainLocal;

            public final TransportDomainUdpDnsEnt transportDomainUdpDns;

            public final TransportDomainTcpDnsEnt transportDomainTcpDns;

            public final TransportDomainSctpDnsEnt transportDomainSctpDns;

            private TransportDomainsEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
            {
                super(mib, parent, "transportDomains", "1.3.6.1.2.1.100.1", false, false, false, false);
                this.transportDomainUdpIpv4 = new TransportDomainUdpIpv4Ent(mib, this);
                this.transportDomainUdpIpv6 = new TransportDomainUdpIpv6Ent(mib, this);
                this.transportDomainUdpIpv4z = new TransportDomainUdpIpv4zEnt(mib, this);
                this.transportDomainUdpIpv6z = new TransportDomainUdpIpv6zEnt(mib, this);
                this.transportDomainTcpIpv4 = new TransportDomainTcpIpv4Ent(mib, this);
                this.transportDomainTcpIpv6 = new TransportDomainTcpIpv6Ent(mib, this);
                this.transportDomainTcpIpv4z = new TransportDomainTcpIpv4zEnt(mib, this);
                this.transportDomainTcpIpv6z = new TransportDomainTcpIpv6zEnt(mib, this);
                this.transportDomainSctpIpv4 = new TransportDomainSctpIpv4Ent(mib, this);
                this.transportDomainSctpIpv6 = new TransportDomainSctpIpv6Ent(mib, this);
                this.transportDomainSctpIpv4z = new TransportDomainSctpIpv4zEnt(mib, this);
                this.transportDomainSctpIpv6z = new TransportDomainSctpIpv6zEnt(mib, this);
                this.transportDomainLocal = new TransportDomainLocalEnt(mib, this);
                this.transportDomainUdpDns = new TransportDomainUdpDnsEnt(mib, this);
                this.transportDomainTcpDns = new TransportDomainTcpDnsEnt(mib, this);
                this.transportDomainSctpDns = new TransportDomainSctpDnsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.transportDomainUdpIpv4,
                    this.transportDomainUdpIpv6,
                    this.transportDomainUdpIpv4z,
                    this.transportDomainUdpIpv6z,
                    this.transportDomainTcpIpv4,
                    this.transportDomainTcpIpv6,
                    this.transportDomainTcpIpv4z,
                    this.transportDomainTcpIpv6z,
                    this.transportDomainSctpIpv4,
                    this.transportDomainSctpIpv6,
                    this.transportDomainSctpIpv4z,
                    this.transportDomainSctpIpv6z,
                    this.transportDomainLocal,
                    this.transportDomainUdpDns,
                    this.transportDomainTcpDns,
                    this.transportDomainSctpDns
                };
            }
            public static final class TransportDomainUdpIpv4Ent extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainUdpIpv4Ent(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainUdpIpv4", "1.3.6.1.2.1.100.1.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainUdpIpv6Ent extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainUdpIpv6Ent(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainUdpIpv6", "1.3.6.1.2.1.100.1.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainUdpIpv4zEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainUdpIpv4zEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainUdpIpv4z", "1.3.6.1.2.1.100.1.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainUdpIpv6zEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainUdpIpv6zEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainUdpIpv6z", "1.3.6.1.2.1.100.1.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainTcpIpv4Ent extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainTcpIpv4Ent(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainTcpIpv4", "1.3.6.1.2.1.100.1.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainTcpIpv6Ent extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainTcpIpv6Ent(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainTcpIpv6", "1.3.6.1.2.1.100.1.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainTcpIpv4zEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainTcpIpv4zEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainTcpIpv4z", "1.3.6.1.2.1.100.1.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainTcpIpv6zEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainTcpIpv6zEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainTcpIpv6z", "1.3.6.1.2.1.100.1.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainSctpIpv4Ent extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainSctpIpv4Ent(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainSctpIpv4", "1.3.6.1.2.1.100.1.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainSctpIpv6Ent extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainSctpIpv6Ent(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainSctpIpv6", "1.3.6.1.2.1.100.1.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainSctpIpv4zEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainSctpIpv4zEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainSctpIpv4z", "1.3.6.1.2.1.100.1.11", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainSctpIpv6zEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainSctpIpv6zEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainSctpIpv6z", "1.3.6.1.2.1.100.1.12", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainLocalEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainLocalEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainLocal", "1.3.6.1.2.1.100.1.13", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainUdpDnsEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainUdpDnsEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainUdpDns", "1.3.6.1.2.1.100.1.14", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainTcpDnsEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainTcpDnsEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainTcpDns", "1.3.6.1.2.1.100.1.15", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TransportDomainSctpDnsEnt extends MIBEntry<TRANSPORTADDRESSMIBDef>
            {
                private TransportDomainSctpDnsEnt(TRANSPORTADDRESSMIBDef mib, MIBEntry<TRANSPORTADDRESSMIBDef> parent)
                {
                    super(mib, parent, "transportDomainSctpDns", "1.3.6.1.2.1.100.1.16", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
