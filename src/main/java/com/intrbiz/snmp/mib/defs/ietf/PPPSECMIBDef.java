package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class PPPSECMIBDef extends MIB
{
    public static final PPPSECMIBDef PPPSECMIB = new PPPSECMIBDef();

    public final PppSecurityEnt pppSecurity;

    private PPPSECMIBDef()
    {
        super("PPP-SEC-MIB");
        this.pppSecurity = new PppSecurityEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pppSecurity
        };
    }

    public static final class PppSecurityEnt extends MIBEntry<PPPSECMIBDef>
    {
        public final PppSecurityProtocolsEnt pppSecurityProtocols;

        /** PPP Security GroupImplementation of this group is optional.
This table allows the network manager to configurewhich security protocols are to be used on whichlink and in what order of preference each is to be tried*/
        public final PppSecurityConfigTableEnt pppSecurityConfigTable;

        /** This table contains all of the ID/Secret pair information.*/
        public final PppSecuritySecretsTableEnt pppSecuritySecretsTable;

        private PppSecurityEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
        {
            super(mib, parent, "pppSecurity", "1.3.6.1.2.1.10.23.2", false, false, false, false);
            this.pppSecurityProtocols = new PppSecurityProtocolsEnt(mib, this);
            this.pppSecurityConfigTable = new PppSecurityConfigTableEnt(mib, this);
            this.pppSecuritySecretsTable = new PppSecuritySecretsTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pppSecurityProtocols,
                this.pppSecurityConfigTable,
                this.pppSecuritySecretsTable
            };
        }
        public static final class PppSecurityProtocolsEnt extends MIBEntry<PPPSECMIBDef>
        {
            /** The following uniquely identify the various protocolsused by PPP security. These OBJECT IDENTIFIERS areused in the pppSecurityConfigProtocol andpppSecuritySecretsProtocol objects to identify to whichprotocols the table entries apply.*/
            public final PppSecurityPapProtocolEnt pppSecurityPapProtocol;

            public final PppSecurityChapMD5ProtocolEnt pppSecurityChapMD5Protocol;

            private PppSecurityProtocolsEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
            {
                super(mib, parent, "pppSecurityProtocols", "1.3.6.1.2.1.10.23.2.1", false, false, false, false);
                this.pppSecurityPapProtocol = new PppSecurityPapProtocolEnt(mib, this);
                this.pppSecurityChapMD5Protocol = new PppSecurityChapMD5ProtocolEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppSecurityPapProtocol,
                    this.pppSecurityChapMD5Protocol
                };
            }
            public static final class PppSecurityPapProtocolEnt extends MIBEntry<PPPSECMIBDef>
            {
                private PppSecurityPapProtocolEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                {
                    super(mib, parent, "pppSecurityPapProtocol", "1.3.6.1.2.1.10.23.2.1.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PppSecurityChapMD5ProtocolEnt extends MIBEntry<PPPSECMIBDef>
            {
                private PppSecurityChapMD5ProtocolEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                {
                    super(mib, parent, "pppSecurityChapMD5Protocol", "1.3.6.1.2.1.10.23.2.1.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PppSecurityConfigTableEnt extends MIBEntry<PPPSECMIBDef>
        {
            public final PppSecurityConfigEntryEnt pppSecurityConfigEntry;

            private PppSecurityConfigTableEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
            {
                super(mib, parent, "pppSecurityConfigTable", "1.3.6.1.2.1.10.23.2.2", false, true, false, false);
                this.pppSecurityConfigEntry = new PppSecurityConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppSecurityConfigEntry
                };
            }
            public static final class PppSecurityConfigEntryEnt extends MIBEntry<PPPSECMIBDef>
            {
                public final PppSecurityConfigLinkEnt pppSecurityConfigLink;

                public final PppSecurityConfigPreferenceEnt pppSecurityConfigPreference;

                public final PppSecurityConfigProtocolEnt pppSecurityConfigProtocol;

                public final PppSecurityConfigStatusEnt pppSecurityConfigStatus;

                private PppSecurityConfigEntryEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                {
                    super(mib, parent, "pppSecurityConfigEntry", "1.3.6.1.2.1.10.23.2.2.1", false, false, false, true);
                    this.pppSecurityConfigLink = new PppSecurityConfigLinkEnt(mib, this);
                    this.pppSecurityConfigPreference = new PppSecurityConfigPreferenceEnt(mib, this);
                    this.pppSecurityConfigProtocol = new PppSecurityConfigProtocolEnt(mib, this);
                    this.pppSecurityConfigStatus = new PppSecurityConfigStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppSecurityConfigLink,
                        this.pppSecurityConfigPreference,
                        this.pppSecurityConfigProtocol,
                        this.pppSecurityConfigStatus
                    };
                }
                public static final class PppSecurityConfigLinkEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecurityConfigLinkEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecurityConfigLink", "1.3.6.1.2.1.10.23.2.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecurityConfigPreferenceEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecurityConfigPreferenceEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecurityConfigPreference", "1.3.6.1.2.1.10.23.2.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecurityConfigProtocolEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecurityConfigProtocolEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecurityConfigProtocol", "1.3.6.1.2.1.10.23.2.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecurityConfigStatusEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecurityConfigStatusEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecurityConfigStatus", "1.3.6.1.2.1.10.23.2.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PppSecuritySecretsTableEnt extends MIBEntry<PPPSECMIBDef>
        {
            public final PppSecuritySecretsEntryEnt pppSecuritySecretsEntry;

            private PppSecuritySecretsTableEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
            {
                super(mib, parent, "pppSecuritySecretsTable", "1.3.6.1.2.1.10.23.2.3", false, true, false, false);
                this.pppSecuritySecretsEntry = new PppSecuritySecretsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppSecuritySecretsEntry
                };
            }
            public static final class PppSecuritySecretsEntryEnt extends MIBEntry<PPPSECMIBDef>
            {
                public final PppSecuritySecretsLinkEnt pppSecuritySecretsLink;

                public final PppSecuritySecretsIdIndexEnt pppSecuritySecretsIdIndex;

                public final PppSecuritySecretsDirectionEnt pppSecuritySecretsDirection;

                public final PppSecuritySecretsProtocolEnt pppSecuritySecretsProtocol;

                public final PppSecuritySecretsIdentityEnt pppSecuritySecretsIdentity;

                public final PppSecuritySecretsSecretEnt pppSecuritySecretsSecret;

                public final PppSecuritySecretsStatusEnt pppSecuritySecretsStatus;

                private PppSecuritySecretsEntryEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                {
                    super(mib, parent, "pppSecuritySecretsEntry", "1.3.6.1.2.1.10.23.2.3.1", false, false, false, true);
                    this.pppSecuritySecretsLink = new PppSecuritySecretsLinkEnt(mib, this);
                    this.pppSecuritySecretsIdIndex = new PppSecuritySecretsIdIndexEnt(mib, this);
                    this.pppSecuritySecretsDirection = new PppSecuritySecretsDirectionEnt(mib, this);
                    this.pppSecuritySecretsProtocol = new PppSecuritySecretsProtocolEnt(mib, this);
                    this.pppSecuritySecretsIdentity = new PppSecuritySecretsIdentityEnt(mib, this);
                    this.pppSecuritySecretsSecret = new PppSecuritySecretsSecretEnt(mib, this);
                    this.pppSecuritySecretsStatus = new PppSecuritySecretsStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppSecuritySecretsLink,
                        this.pppSecuritySecretsIdIndex,
                        this.pppSecuritySecretsDirection,
                        this.pppSecuritySecretsProtocol,
                        this.pppSecuritySecretsIdentity,
                        this.pppSecuritySecretsSecret,
                        this.pppSecuritySecretsStatus
                    };
                }
                public static final class PppSecuritySecretsLinkEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsLinkEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsLink", "1.3.6.1.2.1.10.23.2.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecuritySecretsIdIndexEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsIdIndexEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsIdIndex", "1.3.6.1.2.1.10.23.2.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecuritySecretsDirectionEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsDirectionEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsDirection", "1.3.6.1.2.1.10.23.2.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecuritySecretsProtocolEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsProtocolEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsProtocol", "1.3.6.1.2.1.10.23.2.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecuritySecretsIdentityEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsIdentityEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsIdentity", "1.3.6.1.2.1.10.23.2.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecuritySecretsSecretEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsSecretEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsSecret", "1.3.6.1.2.1.10.23.2.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppSecuritySecretsStatusEnt extends MIBEntry<PPPSECMIBDef>
                {
                    private PppSecuritySecretsStatusEnt(PPPSECMIBDef mib, MIBEntry<PPPSECMIBDef> parent)
                    {
                        super(mib, parent, "pppSecuritySecretsStatus", "1.3.6.1.2.1.10.23.2.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
