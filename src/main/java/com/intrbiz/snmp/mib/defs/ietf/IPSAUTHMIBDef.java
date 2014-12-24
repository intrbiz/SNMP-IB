package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 3411*/
public final class IPSAUTHMIBDef extends MIB
{
    public static final IPSAUTHMIBDef IPSAUTHMIB = new IPSAUTHMIBDef();

    /** May 22, 2006*/
    public final IpsAuthMibModuleEnt ipsAuthMibModule;

    private IPSAUTHMIBDef()
    {
        super("IPS-AUTH-MIB");
        this.ipsAuthMibModule = new IpsAuthMibModuleEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ipsAuthMibModule
        };
    }

    public static final class IpsAuthMibModuleEnt extends MIBEntry<IPSAUTHMIBDef>
    {
        public final IpsAuthNotificationsEnt ipsAuthNotifications;

        public final IpsAuthObjectsEnt ipsAuthObjects;

        public final IpsAuthConformanceEnt ipsAuthConformance;

        private IpsAuthMibModuleEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
        {
            super(mib, parent, "ipsAuthMibModule", "1.3.6.1.2.1.141", false, false, false, false);
            this.ipsAuthNotifications = new IpsAuthNotificationsEnt(mib, this);
            this.ipsAuthObjects = new IpsAuthObjectsEnt(mib, this);
            this.ipsAuthConformance = new IpsAuthConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipsAuthNotifications,
                this.ipsAuthObjects,
                this.ipsAuthConformance
            };
        }
        public static final class IpsAuthNotificationsEnt extends MIBEntry<IPSAUTHMIBDef>
        {
            private IpsAuthNotificationsEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
            {
                super(mib, parent, "ipsAuthNotifications", "1.3.6.1.2.1.141.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpsAuthObjectsEnt extends MIBEntry<IPSAUTHMIBDef>
        {
            /** *******************************************************************/
            public final IpsAuthDescriptorsEnt ipsAuthDescriptors;

            /** *******************************************************************/
            public final IpsAuthInstanceEnt ipsAuthInstance;

            public final IpsAuthIdentityEnt ipsAuthIdentity;

            public final IpsAuthIdentityNameEnt ipsAuthIdentityName;

            public final IpsAuthIdentityAddressEnt ipsAuthIdentityAddress;

            public final IpsAuthCredentialEnt ipsAuthCredential;

            public final IpsAuthCredChapEnt ipsAuthCredChap;

            public final IpsAuthCredSrpEnt ipsAuthCredSrp;

            public final IpsAuthCredKerberosEnt ipsAuthCredKerberos;

            private IpsAuthObjectsEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
            {
                super(mib, parent, "ipsAuthObjects", "1.3.6.1.2.1.141.1", false, false, false, false);
                this.ipsAuthDescriptors = new IpsAuthDescriptorsEnt(mib, this);
                this.ipsAuthInstance = new IpsAuthInstanceEnt(mib, this);
                this.ipsAuthIdentity = new IpsAuthIdentityEnt(mib, this);
                this.ipsAuthIdentityName = new IpsAuthIdentityNameEnt(mib, this);
                this.ipsAuthIdentityAddress = new IpsAuthIdentityAddressEnt(mib, this);
                this.ipsAuthCredential = new IpsAuthCredentialEnt(mib, this);
                this.ipsAuthCredChap = new IpsAuthCredChapEnt(mib, this);
                this.ipsAuthCredSrp = new IpsAuthCredSrpEnt(mib, this);
                this.ipsAuthCredKerberos = new IpsAuthCredKerberosEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipsAuthDescriptors,
                    this.ipsAuthInstance,
                    this.ipsAuthIdentity,
                    this.ipsAuthIdentityName,
                    this.ipsAuthIdentityAddress,
                    this.ipsAuthCredential,
                    this.ipsAuthCredChap,
                    this.ipsAuthCredSrp,
                    this.ipsAuthCredKerberos
                };
            }
            public static final class IpsAuthDescriptorsEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                public final IpsAuthMethodTypesEnt ipsAuthMethodTypes;

                private IpsAuthDescriptorsEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthDescriptors", "1.3.6.1.2.1.141.1.1", false, false, false, false);
                    this.ipsAuthMethodTypes = new IpsAuthMethodTypesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthMethodTypes
                    };
                }
                public static final class IpsAuthMethodTypesEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthMethodNoneEnt ipsAuthMethodNone;

                    public final IpsAuthMethodSrpEnt ipsAuthMethodSrp;

                    public final IpsAuthMethodChapEnt ipsAuthMethodChap;

                    public final IpsAuthMethodKerberosEnt ipsAuthMethodKerberos;

                    private IpsAuthMethodTypesEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthMethodTypes", "1.3.6.1.2.1.141.1.1.1", false, false, false, false);
                        this.ipsAuthMethodNone = new IpsAuthMethodNoneEnt(mib, this);
                        this.ipsAuthMethodSrp = new IpsAuthMethodSrpEnt(mib, this);
                        this.ipsAuthMethodChap = new IpsAuthMethodChapEnt(mib, this);
                        this.ipsAuthMethodKerberos = new IpsAuthMethodKerberosEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthMethodNone,
                            this.ipsAuthMethodSrp,
                            this.ipsAuthMethodChap,
                            this.ipsAuthMethodKerberos
                        };
                    }
                    public static final class IpsAuthMethodNoneEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        private IpsAuthMethodNoneEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthMethodNone", "1.3.6.1.2.1.141.1.1.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpsAuthMethodSrpEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        private IpsAuthMethodSrpEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthMethodSrp", "1.3.6.1.2.1.141.1.1.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpsAuthMethodChapEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        private IpsAuthMethodChapEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthMethodChap", "1.3.6.1.2.1.141.1.1.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IpsAuthMethodKerberosEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        private IpsAuthMethodKerberosEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthMethodKerberos", "1.3.6.1.2.1.141.1.1.1.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IpsAuthInstanceEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** Instance Attributes Table*/
                public final IpsAuthInstanceAttributesTableEnt ipsAuthInstanceAttributesTable;

                private IpsAuthInstanceEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthInstance", "1.3.6.1.2.1.141.1.2", false, false, false, false);
                    this.ipsAuthInstanceAttributesTable = new IpsAuthInstanceAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthInstanceAttributesTable
                    };
                }
                public static final class IpsAuthInstanceAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthInstanceAttributesEntryEnt ipsAuthInstanceAttributesEntry;

                    private IpsAuthInstanceAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthInstanceAttributesTable", "1.3.6.1.2.1.141.1.2.2", false, true, false, false);
                        this.ipsAuthInstanceAttributesEntry = new IpsAuthInstanceAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthInstanceAttributesEntry
                        };
                    }
                    public static final class IpsAuthInstanceAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthInstIndexEnt ipsAuthInstIndex;

                        public final IpsAuthInstDescrEnt ipsAuthInstDescr;

                        public final IpsAuthInstStorageTypeEnt ipsAuthInstStorageType;

                        private IpsAuthInstanceAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthInstanceAttributesEntry", "1.3.6.1.2.1.141.1.2.2.1", false, false, false, true);
                            this.ipsAuthInstIndex = new IpsAuthInstIndexEnt(mib, this);
                            this.ipsAuthInstDescr = new IpsAuthInstDescrEnt(mib, this);
                            this.ipsAuthInstStorageType = new IpsAuthInstStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthInstIndex,
                                this.ipsAuthInstDescr,
                                this.ipsAuthInstStorageType
                            };
                        }
                        public static final class IpsAuthInstIndexEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthInstIndexEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthInstIndex", "1.3.6.1.2.1.141.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthInstDescrEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthInstDescrEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthInstDescr", "1.3.6.1.2.1.141.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthInstStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthInstStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthInstStorageType", "1.3.6.1.2.1.141.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthIdentityEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** User Identity Attributes Table*/
                public final IpsAuthIdentAttributesTableEnt ipsAuthIdentAttributesTable;

                private IpsAuthIdentityEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthIdentity", "1.3.6.1.2.1.141.1.3", false, false, false, false);
                    this.ipsAuthIdentAttributesTable = new IpsAuthIdentAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthIdentAttributesTable
                    };
                }
                public static final class IpsAuthIdentAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthIdentAttributesEntryEnt ipsAuthIdentAttributesEntry;

                    private IpsAuthIdentAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentAttributesTable", "1.3.6.1.2.1.141.1.3.1", false, true, false, false);
                        this.ipsAuthIdentAttributesEntry = new IpsAuthIdentAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthIdentAttributesEntry
                        };
                    }
                    public static final class IpsAuthIdentAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthIdentIndexEnt ipsAuthIdentIndex;

                        public final IpsAuthIdentDescriptionEnt ipsAuthIdentDescription;

                        public final IpsAuthIdentRowStatusEnt ipsAuthIdentRowStatus;

                        public final IpsAuthIdentStorageTypeEnt ipsAuthIdentStorageType;

                        private IpsAuthIdentAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthIdentAttributesEntry", "1.3.6.1.2.1.141.1.3.1.1", false, false, false, true);
                            this.ipsAuthIdentIndex = new IpsAuthIdentIndexEnt(mib, this);
                            this.ipsAuthIdentDescription = new IpsAuthIdentDescriptionEnt(mib, this);
                            this.ipsAuthIdentRowStatus = new IpsAuthIdentRowStatusEnt(mib, this);
                            this.ipsAuthIdentStorageType = new IpsAuthIdentStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthIdentIndex,
                                this.ipsAuthIdentDescription,
                                this.ipsAuthIdentRowStatus,
                                this.ipsAuthIdentStorageType
                            };
                        }
                        public static final class IpsAuthIdentIndexEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentIndexEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentIndex", "1.3.6.1.2.1.141.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentDescriptionEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentDescriptionEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentDescription", "1.3.6.1.2.1.141.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentRowStatus", "1.3.6.1.2.1.141.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentStorageType", "1.3.6.1.2.1.141.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthIdentityNameEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** User Initiator Name Attributes Table*/
                public final IpsAuthIdentNameAttributesTableEnt ipsAuthIdentNameAttributesTable;

                private IpsAuthIdentityNameEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthIdentityName", "1.3.6.1.2.1.141.1.4", false, false, false, false);
                    this.ipsAuthIdentNameAttributesTable = new IpsAuthIdentNameAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthIdentNameAttributesTable
                    };
                }
                public static final class IpsAuthIdentNameAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthIdentNameAttributesEntryEnt ipsAuthIdentNameAttributesEntry;

                    private IpsAuthIdentNameAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentNameAttributesTable", "1.3.6.1.2.1.141.1.4.1", false, true, false, false);
                        this.ipsAuthIdentNameAttributesEntry = new IpsAuthIdentNameAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthIdentNameAttributesEntry
                        };
                    }
                    public static final class IpsAuthIdentNameAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthIdentNameIndexEnt ipsAuthIdentNameIndex;

                        public final IpsAuthIdentNameEnt ipsAuthIdentName;

                        public final IpsAuthIdentNameRowStatusEnt ipsAuthIdentNameRowStatus;

                        public final IpsAuthIdentNameStorageTypeEnt ipsAuthIdentNameStorageType;

                        private IpsAuthIdentNameAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthIdentNameAttributesEntry", "1.3.6.1.2.1.141.1.4.1.1", false, false, false, true);
                            this.ipsAuthIdentNameIndex = new IpsAuthIdentNameIndexEnt(mib, this);
                            this.ipsAuthIdentName = new IpsAuthIdentNameEnt(mib, this);
                            this.ipsAuthIdentNameRowStatus = new IpsAuthIdentNameRowStatusEnt(mib, this);
                            this.ipsAuthIdentNameStorageType = new IpsAuthIdentNameStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthIdentNameIndex,
                                this.ipsAuthIdentName,
                                this.ipsAuthIdentNameRowStatus,
                                this.ipsAuthIdentNameStorageType
                            };
                        }
                        public static final class IpsAuthIdentNameIndexEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentNameIndexEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentNameIndex", "1.3.6.1.2.1.141.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentNameEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentNameEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentName", "1.3.6.1.2.1.141.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentNameRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentNameRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentNameRowStatus", "1.3.6.1.2.1.141.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentNameStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentNameStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentNameStorageType", "1.3.6.1.2.1.141.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthIdentityAddressEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** User Initiator Address Attributes Table*/
                public final IpsAuthIdentAddrAttributesTableEnt ipsAuthIdentAddrAttributesTable;

                private IpsAuthIdentityAddressEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthIdentityAddress", "1.3.6.1.2.1.141.1.5", false, false, false, false);
                    this.ipsAuthIdentAddrAttributesTable = new IpsAuthIdentAddrAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthIdentAddrAttributesTable
                    };
                }
                public static final class IpsAuthIdentAddrAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthIdentAddrAttributesEntryEnt ipsAuthIdentAddrAttributesEntry;

                    private IpsAuthIdentAddrAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentAddrAttributesTable", "1.3.6.1.2.1.141.1.5.1", false, true, false, false);
                        this.ipsAuthIdentAddrAttributesEntry = new IpsAuthIdentAddrAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthIdentAddrAttributesEntry
                        };
                    }
                    public static final class IpsAuthIdentAddrAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthIdentAddrIndexEnt ipsAuthIdentAddrIndex;

                        public final IpsAuthIdentAddrTypeEnt ipsAuthIdentAddrType;

                        public final IpsAuthIdentAddrStartEnt ipsAuthIdentAddrStart;

                        public final IpsAuthIdentAddrEndEnt ipsAuthIdentAddrEnd;

                        public final IpsAuthIdentAddrRowStatusEnt ipsAuthIdentAddrRowStatus;

                        public final IpsAuthIdentAddrStorageTypeEnt ipsAuthIdentAddrStorageType;

                        private IpsAuthIdentAddrAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthIdentAddrAttributesEntry", "1.3.6.1.2.1.141.1.5.1.1", false, false, false, true);
                            this.ipsAuthIdentAddrIndex = new IpsAuthIdentAddrIndexEnt(mib, this);
                            this.ipsAuthIdentAddrType = new IpsAuthIdentAddrTypeEnt(mib, this);
                            this.ipsAuthIdentAddrStart = new IpsAuthIdentAddrStartEnt(mib, this);
                            this.ipsAuthIdentAddrEnd = new IpsAuthIdentAddrEndEnt(mib, this);
                            this.ipsAuthIdentAddrRowStatus = new IpsAuthIdentAddrRowStatusEnt(mib, this);
                            this.ipsAuthIdentAddrStorageType = new IpsAuthIdentAddrStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthIdentAddrIndex,
                                this.ipsAuthIdentAddrType,
                                this.ipsAuthIdentAddrStart,
                                this.ipsAuthIdentAddrEnd,
                                this.ipsAuthIdentAddrRowStatus,
                                this.ipsAuthIdentAddrStorageType
                            };
                        }
                        public static final class IpsAuthIdentAddrIndexEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentAddrIndexEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentAddrIndex", "1.3.6.1.2.1.141.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentAddrTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentAddrTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentAddrType", "1.3.6.1.2.1.141.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentAddrStartEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentAddrStartEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentAddrStart", "1.3.6.1.2.1.141.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentAddrEndEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentAddrEndEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentAddrEnd", "1.3.6.1.2.1.141.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentAddrRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentAddrRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentAddrRowStatus", "1.3.6.1.2.1.141.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthIdentAddrStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthIdentAddrStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthIdentAddrStorageType", "1.3.6.1.2.1.141.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthCredentialEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** Credential Attributes Table*/
                public final IpsAuthCredentialAttributesTableEnt ipsAuthCredentialAttributesTable;

                private IpsAuthCredentialEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthCredential", "1.3.6.1.2.1.141.1.6", false, false, false, false);
                    this.ipsAuthCredentialAttributesTable = new IpsAuthCredentialAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthCredentialAttributesTable
                    };
                }
                public static final class IpsAuthCredentialAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthCredentialAttributesEntryEnt ipsAuthCredentialAttributesEntry;

                    private IpsAuthCredentialAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthCredentialAttributesTable", "1.3.6.1.2.1.141.1.6.1", false, true, false, false);
                        this.ipsAuthCredentialAttributesEntry = new IpsAuthCredentialAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthCredentialAttributesEntry
                        };
                    }
                    public static final class IpsAuthCredentialAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthCredIndexEnt ipsAuthCredIndex;

                        public final IpsAuthCredAuthMethodEnt ipsAuthCredAuthMethod;

                        public final IpsAuthCredRowStatusEnt ipsAuthCredRowStatus;

                        public final IpsAuthCredStorageTypeEnt ipsAuthCredStorageType;

                        private IpsAuthCredentialAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthCredentialAttributesEntry", "1.3.6.1.2.1.141.1.6.1.1", false, false, false, true);
                            this.ipsAuthCredIndex = new IpsAuthCredIndexEnt(mib, this);
                            this.ipsAuthCredAuthMethod = new IpsAuthCredAuthMethodEnt(mib, this);
                            this.ipsAuthCredRowStatus = new IpsAuthCredRowStatusEnt(mib, this);
                            this.ipsAuthCredStorageType = new IpsAuthCredStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthCredIndex,
                                this.ipsAuthCredAuthMethod,
                                this.ipsAuthCredRowStatus,
                                this.ipsAuthCredStorageType
                            };
                        }
                        public static final class IpsAuthCredIndexEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredIndexEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredIndex", "1.3.6.1.2.1.141.1.6.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredAuthMethodEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredAuthMethodEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredAuthMethod", "1.3.6.1.2.1.141.1.6.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredRowStatus", "1.3.6.1.2.1.141.1.6.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredStorageType", "1.3.6.1.2.1.141.1.6.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthCredChapEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** Credential Chap-Specific Attributes Table*/
                public final IpsAuthCredChapAttributesTableEnt ipsAuthCredChapAttributesTable;

                private IpsAuthCredChapEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthCredChap", "1.3.6.1.2.1.141.1.7", false, false, false, false);
                    this.ipsAuthCredChapAttributesTable = new IpsAuthCredChapAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthCredChapAttributesTable
                    };
                }
                public static final class IpsAuthCredChapAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthCredChapAttributesEntryEnt ipsAuthCredChapAttributesEntry;

                    private IpsAuthCredChapAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthCredChapAttributesTable", "1.3.6.1.2.1.141.1.7.1", false, true, false, false);
                        this.ipsAuthCredChapAttributesEntry = new IpsAuthCredChapAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthCredChapAttributesEntry
                        };
                    }
                    public static final class IpsAuthCredChapAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthCredChapUserNameEnt ipsAuthCredChapUserName;

                        public final IpsAuthCredChapRowStatusEnt ipsAuthCredChapRowStatus;

                        public final IpsAuthCredChapStorageTypeEnt ipsAuthCredChapStorageType;

                        private IpsAuthCredChapAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthCredChapAttributesEntry", "1.3.6.1.2.1.141.1.7.1.1", false, false, false, true);
                            this.ipsAuthCredChapUserName = new IpsAuthCredChapUserNameEnt(mib, this);
                            this.ipsAuthCredChapRowStatus = new IpsAuthCredChapRowStatusEnt(mib, this);
                            this.ipsAuthCredChapStorageType = new IpsAuthCredChapStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthCredChapUserName,
                                this.ipsAuthCredChapRowStatus,
                                this.ipsAuthCredChapStorageType
                            };
                        }
                        public static final class IpsAuthCredChapUserNameEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredChapUserNameEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredChapUserName", "1.3.6.1.2.1.141.1.7.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredChapRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredChapRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredChapRowStatus", "1.3.6.1.2.1.141.1.7.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredChapStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredChapStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredChapStorageType", "1.3.6.1.2.1.141.1.7.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthCredSrpEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** Credential Srp-Specific Attributes Table*/
                public final IpsAuthCredSrpAttributesTableEnt ipsAuthCredSrpAttributesTable;

                private IpsAuthCredSrpEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthCredSrp", "1.3.6.1.2.1.141.1.8", false, false, false, false);
                    this.ipsAuthCredSrpAttributesTable = new IpsAuthCredSrpAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthCredSrpAttributesTable
                    };
                }
                public static final class IpsAuthCredSrpAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthCredSrpAttributesEntryEnt ipsAuthCredSrpAttributesEntry;

                    private IpsAuthCredSrpAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthCredSrpAttributesTable", "1.3.6.1.2.1.141.1.8.1", false, true, false, false);
                        this.ipsAuthCredSrpAttributesEntry = new IpsAuthCredSrpAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthCredSrpAttributesEntry
                        };
                    }
                    public static final class IpsAuthCredSrpAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthCredSrpUserNameEnt ipsAuthCredSrpUserName;

                        public final IpsAuthCredSrpRowStatusEnt ipsAuthCredSrpRowStatus;

                        public final IpsAuthCredSrpStorageTypeEnt ipsAuthCredSrpStorageType;

                        private IpsAuthCredSrpAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthCredSrpAttributesEntry", "1.3.6.1.2.1.141.1.8.1.1", false, false, false, true);
                            this.ipsAuthCredSrpUserName = new IpsAuthCredSrpUserNameEnt(mib, this);
                            this.ipsAuthCredSrpRowStatus = new IpsAuthCredSrpRowStatusEnt(mib, this);
                            this.ipsAuthCredSrpStorageType = new IpsAuthCredSrpStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthCredSrpUserName,
                                this.ipsAuthCredSrpRowStatus,
                                this.ipsAuthCredSrpStorageType
                            };
                        }
                        public static final class IpsAuthCredSrpUserNameEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredSrpUserNameEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredSrpUserName", "1.3.6.1.2.1.141.1.8.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredSrpRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredSrpRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredSrpRowStatus", "1.3.6.1.2.1.141.1.8.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredSrpStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredSrpStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredSrpStorageType", "1.3.6.1.2.1.141.1.8.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class IpsAuthCredKerberosEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** Credential Kerberos-Specific Attributes Table*/
                public final IpsAuthCredKerbAttributesTableEnt ipsAuthCredKerbAttributesTable;

                private IpsAuthCredKerberosEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthCredKerberos", "1.3.6.1.2.1.141.1.9", false, false, false, false);
                    this.ipsAuthCredKerbAttributesTable = new IpsAuthCredKerbAttributesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthCredKerbAttributesTable
                    };
                }
                public static final class IpsAuthCredKerbAttributesTableEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    public final IpsAuthCredKerbAttributesEntryEnt ipsAuthCredKerbAttributesEntry;

                    private IpsAuthCredKerbAttributesTableEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthCredKerbAttributesTable", "1.3.6.1.2.1.141.1.9.1", false, true, false, false);
                        this.ipsAuthCredKerbAttributesEntry = new IpsAuthCredKerbAttributesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipsAuthCredKerbAttributesEntry
                        };
                    }
                    public static final class IpsAuthCredKerbAttributesEntryEnt extends MIBEntry<IPSAUTHMIBDef>
                    {
                        public final IpsAuthCredKerbPrincipalEnt ipsAuthCredKerbPrincipal;

                        public final IpsAuthCredKerbRowStatusEnt ipsAuthCredKerbRowStatus;

                        public final IpsAuthCredKerbStorageTypeEnt ipsAuthCredKerbStorageType;

                        private IpsAuthCredKerbAttributesEntryEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                        {
                            super(mib, parent, "ipsAuthCredKerbAttributesEntry", "1.3.6.1.2.1.141.1.9.1.1", false, false, false, true);
                            this.ipsAuthCredKerbPrincipal = new IpsAuthCredKerbPrincipalEnt(mib, this);
                            this.ipsAuthCredKerbRowStatus = new IpsAuthCredKerbRowStatusEnt(mib, this);
                            this.ipsAuthCredKerbStorageType = new IpsAuthCredKerbStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipsAuthCredKerbPrincipal,
                                this.ipsAuthCredKerbRowStatus,
                                this.ipsAuthCredKerbStorageType
                            };
                        }
                        public static final class IpsAuthCredKerbPrincipalEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredKerbPrincipalEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredKerbPrincipal", "1.3.6.1.2.1.141.1.9.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredKerbRowStatusEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredKerbRowStatusEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredKerbRowStatus", "1.3.6.1.2.1.141.1.9.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpsAuthCredKerbStorageTypeEnt extends MIBEntry<IPSAUTHMIBDef>
                        {
                            private IpsAuthCredKerbStorageTypeEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                            {
                                super(mib, parent, "ipsAuthCredKerbStorageType", "1.3.6.1.2.1.141.1.9.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class IpsAuthConformanceEnt extends MIBEntry<IPSAUTHMIBDef>
        {
            /** ******************************************************************Notifications
There are no notifications necessary in this MIB module.


******************************************************************
Conformance Statements*/
            public final IpsAuthCompliancesEnt ipsAuthCompliances;

            public final IpsAuthGroupsEnt ipsAuthGroups;

            private IpsAuthConformanceEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
            {
                super(mib, parent, "ipsAuthConformance", "1.3.6.1.2.1.141.2", false, false, false, false);
                this.ipsAuthCompliances = new IpsAuthCompliancesEnt(mib, this);
                this.ipsAuthGroups = new IpsAuthGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipsAuthCompliances,
                    this.ipsAuthGroups
                };
            }
            public static final class IpsAuthCompliancesEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                /** *******************************************************************/
                public final IpsAuthComplianceV1Ent ipsAuthComplianceV1;

                private IpsAuthCompliancesEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthCompliances", "1.3.6.1.2.1.141.2.1", false, false, false, false);
                    this.ipsAuthComplianceV1 = new IpsAuthComplianceV1Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthComplianceV1
                    };
                }
                public static final class IpsAuthComplianceV1Ent extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthComplianceV1Ent(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthComplianceV1", "1.3.6.1.2.1.141.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IpsAuthGroupsEnt extends MIBEntry<IPSAUTHMIBDef>
            {
                public final IpsAuthInstanceAttributesGroupEnt ipsAuthInstanceAttributesGroup;

                public final IpsAuthIdentAttributesGroupEnt ipsAuthIdentAttributesGroup;

                public final IpsAuthIdentNameAttributesGroupEnt ipsAuthIdentNameAttributesGroup;

                public final IpsAuthIdentAddrAttributesGroupEnt ipsAuthIdentAddrAttributesGroup;

                public final IpsAuthIdentCredAttributesGroupEnt ipsAuthIdentCredAttributesGroup;

                public final IpsAuthIdentChapAttrGroupEnt ipsAuthIdentChapAttrGroup;

                public final IpsAuthIdentSrpAttrGroupEnt ipsAuthIdentSrpAttrGroup;

                public final IpsAuthIdentKerberosAttrGroupEnt ipsAuthIdentKerberosAttrGroup;

                private IpsAuthGroupsEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                {
                    super(mib, parent, "ipsAuthGroups", "1.3.6.1.2.1.141.2.2", false, false, false, false);
                    this.ipsAuthInstanceAttributesGroup = new IpsAuthInstanceAttributesGroupEnt(mib, this);
                    this.ipsAuthIdentAttributesGroup = new IpsAuthIdentAttributesGroupEnt(mib, this);
                    this.ipsAuthIdentNameAttributesGroup = new IpsAuthIdentNameAttributesGroupEnt(mib, this);
                    this.ipsAuthIdentAddrAttributesGroup = new IpsAuthIdentAddrAttributesGroupEnt(mib, this);
                    this.ipsAuthIdentCredAttributesGroup = new IpsAuthIdentCredAttributesGroupEnt(mib, this);
                    this.ipsAuthIdentChapAttrGroup = new IpsAuthIdentChapAttrGroupEnt(mib, this);
                    this.ipsAuthIdentSrpAttrGroup = new IpsAuthIdentSrpAttrGroupEnt(mib, this);
                    this.ipsAuthIdentKerberosAttrGroup = new IpsAuthIdentKerberosAttrGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipsAuthInstanceAttributesGroup,
                        this.ipsAuthIdentAttributesGroup,
                        this.ipsAuthIdentNameAttributesGroup,
                        this.ipsAuthIdentAddrAttributesGroup,
                        this.ipsAuthIdentCredAttributesGroup,
                        this.ipsAuthIdentChapAttrGroup,
                        this.ipsAuthIdentSrpAttrGroup,
                        this.ipsAuthIdentKerberosAttrGroup
                    };
                }
                public static final class IpsAuthInstanceAttributesGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthInstanceAttributesGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthInstanceAttributesGroup", "1.3.6.1.2.1.141.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentAttributesGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentAttributesGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentAttributesGroup", "1.3.6.1.2.1.141.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentNameAttributesGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentNameAttributesGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentNameAttributesGroup", "1.3.6.1.2.1.141.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentAddrAttributesGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentAddrAttributesGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentAddrAttributesGroup", "1.3.6.1.2.1.141.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentCredAttributesGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentCredAttributesGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentCredAttributesGroup", "1.3.6.1.2.1.141.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentChapAttrGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentChapAttrGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentChapAttrGroup", "1.3.6.1.2.1.141.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentSrpAttrGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentSrpAttrGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentSrpAttrGroup", "1.3.6.1.2.1.141.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpsAuthIdentKerberosAttrGroupEnt extends MIBEntry<IPSAUTHMIBDef>
                {
                    private IpsAuthIdentKerberosAttrGroupEnt(IPSAUTHMIBDef mib, MIBEntry<IPSAUTHMIBDef> parent)
                    {
                        super(mib, parent, "ipsAuthIdentKerberosAttrGroup", "1.3.6.1.2.1.141.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
