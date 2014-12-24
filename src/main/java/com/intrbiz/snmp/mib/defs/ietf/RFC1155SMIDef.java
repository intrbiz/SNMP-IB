package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**EVERYTHING*/
public final class RFC1155SMIDef extends MIB
{
    public static final RFC1155SMIDef RFC1155SMI = new RFC1155SMIDef();

    /** the path to the root*/
    public final OrgEnt org;

    private RFC1155SMIDef()
    {
        super("RFC1155-SMI");
        this.org = new OrgEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.org
        };
    }

    public static final class OrgEnt extends MIBEntry<RFC1155SMIDef>
    {
        /** "iso" = 1*/
        public final DodEnt dod;

        private OrgEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
        {
            super(mib, parent, "org", "1.3", false, false, false, false);
            this.dod = new DodEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dod
            };
        }
        public static final class DodEnt extends MIBEntry<RFC1155SMIDef>
        {
            public final InternetEnt internet;

            private DodEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
            {
                super(mib, parent, "dod", "1.3.6", false, false, false, false);
                this.internet = new InternetEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.internet
                };
            }
            public static final class InternetEnt extends MIBEntry<RFC1155SMIDef>
            {
                public final DirectoryEnt directory;

                public final MgmtEnt mgmt;

                public final ExperimentalEnt experimental;

                public final PrivateEntryEnt privateEntry;

                private InternetEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
                {
                    super(mib, parent, "internet", "1.3.6.1", false, false, false, false);
                    this.directory = new DirectoryEnt(mib, this);
                    this.mgmt = new MgmtEnt(mib, this);
                    this.experimental = new ExperimentalEnt(mib, this);
                    this.privateEntry = new PrivateEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.directory,
                        this.mgmt,
                        this.experimental,
                        this.privateEntry
                    };
                }
                public static final class DirectoryEnt extends MIBEntry<RFC1155SMIDef>
                {
                    private DirectoryEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
                    {
                        super(mib, parent, "directory", "1.3.6.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MgmtEnt extends MIBEntry<RFC1155SMIDef>
                {
                    private MgmtEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
                    {
                        super(mib, parent, "mgmt", "1.3.6.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class ExperimentalEnt extends MIBEntry<RFC1155SMIDef>
                {
                    private ExperimentalEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
                    {
                        super(mib, parent, "experimental", "1.3.6.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PrivateEntryEnt extends MIBEntry<RFC1155SMIDef>
                {
                    public final EnterprisesEnt enterprises;

                    private PrivateEntryEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
                    {
                        super(mib, parent, "private", "1.3.6.1.4", false, false, false, false);
                        this.enterprises = new EnterprisesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.enterprises
                        };
                    }
                    public static final class EnterprisesEnt extends MIBEntry<RFC1155SMIDef>
                    {
                        private EnterprisesEnt(RFC1155SMIDef mib, MIBEntry<RFC1155SMIDef> parent)
                        {
                            super(mib, parent, "enterprises", "1.3.6.1.4.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
