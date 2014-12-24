package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SNMPv2SMIDef extends MIB
{
    public static final SNMPv2SMIDef SNMPv2SMI = new SNMPv2SMIDef();

    /** the path to the root*/
    public final OrgEnt org;

    /** definitions of administrative identifiers*/
    public final ZeroDotZeroEnt zeroDotZero;

    private SNMPv2SMIDef()
    {
        super("SNMPv2-SMI");
        this.org = new OrgEnt(this, null);
        this.zeroDotZero = new ZeroDotZeroEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.org,
            this.zeroDotZero
        };
    }

    public static final class OrgEnt extends MIBEntry<SNMPv2SMIDef>
    {
        /** "iso" = 1*/
        public final DodEnt dod;

        private OrgEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
        {
            super(mib, parent, "org", "1.3", false, false, false, false);
            this.dod = new DodEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dod
            };
        }
        public static final class DodEnt extends MIBEntry<SNMPv2SMIDef>
        {
            public final InternetEnt internet;

            private DodEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
            {
                super(mib, parent, "dod", "1.3.6", false, false, false, false);
                this.internet = new InternetEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.internet
                };
            }
            public static final class InternetEnt extends MIBEntry<SNMPv2SMIDef>
            {
                public final DirectoryEnt directory;

                public final MgmtEnt mgmt;

                public final ExperimentalEnt experimental;

                public final PrivateEntryEnt privateEntry;

                public final SecurityEnt security;

                public final SnmpV2Ent snmpV2;

                private InternetEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                {
                    super(mib, parent, "internet", "1.3.6.1", false, false, false, false);
                    this.directory = new DirectoryEnt(mib, this);
                    this.mgmt = new MgmtEnt(mib, this);
                    this.experimental = new ExperimentalEnt(mib, this);
                    this.privateEntry = new PrivateEntryEnt(mib, this);
                    this.security = new SecurityEnt(mib, this);
                    this.snmpV2 = new SnmpV2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.directory,
                        this.mgmt,
                        this.experimental,
                        this.privateEntry,
                        this.security,
                        this.snmpV2
                    };
                }
                public static final class DirectoryEnt extends MIBEntry<SNMPv2SMIDef>
                {
                    private DirectoryEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                    {
                        super(mib, parent, "directory", "1.3.6.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MgmtEnt extends MIBEntry<SNMPv2SMIDef>
                {
                    public final Mib2Ent mib2;

                    private MgmtEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                    {
                        super(mib, parent, "mgmt", "1.3.6.1.2", false, false, false, false);
                        this.mib2 = new Mib2Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mib2
                        };
                    }
                    public static final class Mib2Ent extends MIBEntry<SNMPv2SMIDef>
                    {
                        public final TransmissionEnt transmission;

                        private Mib2Ent(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                        {
                            super(mib, parent, "mib-2", "1.3.6.1.2.1", false, false, false, false);
                            this.transmission = new TransmissionEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.transmission
                            };
                        }
                        public static final class TransmissionEnt extends MIBEntry<SNMPv2SMIDef>
                        {
                            private TransmissionEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                            {
                                super(mib, parent, "transmission", "1.3.6.1.2.1.10", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class ExperimentalEnt extends MIBEntry<SNMPv2SMIDef>
                {
                    private ExperimentalEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                    {
                        super(mib, parent, "experimental", "1.3.6.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrivateEntryEnt extends MIBEntry<SNMPv2SMIDef>
                {
                    public final EnterprisesEnt enterprises;

                    private PrivateEntryEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                    {
                        super(mib, parent, "private", "1.3.6.1.4", false, false, false, false);
                        this.enterprises = new EnterprisesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.enterprises
                        };
                    }
                    public static final class EnterprisesEnt extends MIBEntry<SNMPv2SMIDef>
                    {
                        private EnterprisesEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                        {
                            super(mib, parent, "enterprises", "1.3.6.1.4.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class SecurityEnt extends MIBEntry<SNMPv2SMIDef>
                {
                    private SecurityEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                    {
                        super(mib, parent, "security", "1.3.6.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpV2Ent extends MIBEntry<SNMPv2SMIDef>
                {
                    /** transport domains*/
                    public final SnmpDomainsEnt snmpDomains;

                    /** transport proxies*/
                    public final SnmpProxysEnt snmpProxys;

                    /** module identities*/
                    public final SnmpModulesEnt snmpModules;

                    private SnmpV2Ent(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                    {
                        super(mib, parent, "snmpV2", "1.3.6.1.6", false, false, false, false);
                        this.snmpDomains = new SnmpDomainsEnt(mib, this);
                        this.snmpProxys = new SnmpProxysEnt(mib, this);
                        this.snmpModules = new SnmpModulesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpDomains,
                            this.snmpProxys,
                            this.snmpModules
                        };
                    }
                    public static final class SnmpDomainsEnt extends MIBEntry<SNMPv2SMIDef>
                    {
                        private SnmpDomainsEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                        {
                            super(mib, parent, "snmpDomains", "1.3.6.1.6.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxysEnt extends MIBEntry<SNMPv2SMIDef>
                    {
                        private SnmpProxysEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                        {
                            super(mib, parent, "snmpProxys", "1.3.6.1.6.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpModulesEnt extends MIBEntry<SNMPv2SMIDef>
                    {
                        private SnmpModulesEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
                        {
                            super(mib, parent, "snmpModules", "1.3.6.1.6.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

    public static final class ZeroDotZeroEnt extends MIBEntry<SNMPv2SMIDef>
    {
        private ZeroDotZeroEnt(SNMPv2SMIDef mib, MIBEntry<SNMPv2SMIDef> parent)
        {
            super(mib, parent, "zeroDotZero", "0.0", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
