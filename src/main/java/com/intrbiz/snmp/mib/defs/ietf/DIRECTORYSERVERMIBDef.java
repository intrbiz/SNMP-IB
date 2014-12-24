package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DIRECTORYSERVERMIBDef extends MIB
{
    public static final DIRECTORYSERVERMIBDef DIRECTORYSERVERMIB = new DIRECTORYSERVERMIBDef();

    public final DsMIBEnt dsMIB;

    private DIRECTORYSERVERMIBDef()
    {
        super("DIRECTORY-SERVER-MIB");
        this.dsMIB = new DsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dsMIB
        };
    }

    public static final class DsMIBEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
    {
        public final DsTableEnt dsTable;

        public final DsApplIfOpsTableEnt dsApplIfOpsTable;

        /** The dsIntTable contains statistical data on the peerDirectory Servers  with which the monitored DirectoryServer interacts or, attempts to interact. This  table isexpected to provide a useful insight into the effect ofneighbours on the Directory Server's performance.The table keeps track of the last "N" Directory Serverswith which  the  monitored   Directory  has  interacted(attempted to interact), where "N" is a locally-definedconstant.For a multiprotocol server, statistics for each protocol
are kept separetely.*/
        public final DsIntTableEnt dsIntTable;

        /** Conformance information*/
        public final DsConformanceEnt dsConformance;

        private DsMIBEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
        {
            super(mib, parent, "dsMIB", "1.3.6.1.2.1.66", false, false, false, false);
            this.dsTable = new DsTableEnt(mib, this);
            this.dsApplIfOpsTable = new DsApplIfOpsTableEnt(mib, this);
            this.dsIntTable = new DsIntTableEnt(mib, this);
            this.dsConformance = new DsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsTable,
                this.dsApplIfOpsTable,
                this.dsIntTable,
                this.dsConformance
            };
        }
        public static final class DsTableEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
        {
            public final DsTableEntryEnt dsTableEntry;

            private DsTableEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
            {
                super(mib, parent, "dsTable", "1.3.6.1.2.1.66.1", false, true, false, false);
                this.dsTableEntry = new DsTableEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsTableEntry
                };
            }
            public static final class DsTableEntryEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
            {
                public final DsServerTypeEnt dsServerType;

                public final DsServerDescriptionEnt dsServerDescription;

                /** A (C)LDAP frontend to the X.500 Directory will not haveMasterEntries, CopyEntries; the following counters willbe inaccessible for LDAP/CLDAP frontends to the X.500directory: dsMasterEntries, dsCopyEntries, dsSlaveHits.*/
                public final DsMasterEntriesEnt dsMasterEntries;

                public final DsCopyEntriesEnt dsCopyEntries;

                public final DsCacheEntriesEnt dsCacheEntries;

                public final DsCacheHitsEnt dsCacheHits;

                public final DsSlaveHitsEnt dsSlaveHits;

                private DsTableEntryEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                {
                    super(mib, parent, "dsTableEntry", "1.3.6.1.2.1.66.1.1", false, false, false, true);
                    this.dsServerType = new DsServerTypeEnt(mib, this);
                    this.dsServerDescription = new DsServerDescriptionEnt(mib, this);
                    this.dsMasterEntries = new DsMasterEntriesEnt(mib, this);
                    this.dsCopyEntries = new DsCopyEntriesEnt(mib, this);
                    this.dsCacheEntries = new DsCacheEntriesEnt(mib, this);
                    this.dsCacheHits = new DsCacheHitsEnt(mib, this);
                    this.dsSlaveHits = new DsSlaveHitsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsServerType,
                        this.dsServerDescription,
                        this.dsMasterEntries,
                        this.dsCopyEntries,
                        this.dsCacheEntries,
                        this.dsCacheHits,
                        this.dsSlaveHits
                    };
                }
                public static final class DsServerTypeEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsServerTypeEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsServerType", "1.3.6.1.2.1.66.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsServerDescriptionEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsServerDescriptionEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsServerDescription", "1.3.6.1.2.1.66.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsMasterEntriesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsMasterEntriesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsMasterEntries", "1.3.6.1.2.1.66.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsCopyEntriesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsCopyEntriesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsCopyEntries", "1.3.6.1.2.1.66.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsCacheEntriesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsCacheEntriesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsCacheEntries", "1.3.6.1.2.1.66.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsCacheHitsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsCacheHitsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsCacheHits", "1.3.6.1.2.1.66.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsSlaveHitsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsSlaveHitsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsSlaveHits", "1.3.6.1.2.1.66.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DsApplIfOpsTableEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
        {
            public final DsApplIfOpsEntryEnt dsApplIfOpsEntry;

            private DsApplIfOpsTableEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
            {
                super(mib, parent, "dsApplIfOpsTable", "1.3.6.1.2.1.66.2", false, true, false, false);
                this.dsApplIfOpsEntry = new DsApplIfOpsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsApplIfOpsEntry
                };
            }
            public static final class DsApplIfOpsEntryEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
            {
                /** CLDAP does not use binds; for the CLDAP interface of a DirectoryServer the bind related counters will be inaccessible.CLDAP and LDAP implement "Read" and "List" operationsindirectly via the "search" operation; the followingcounters will be inaccessible for the CLDAP and LDAP interfaces ofDirectory Servers:  dsApplIfReadOps, dsApplIfListOpsCLDAP does not implement "Compare", "Add", "Remove","Modify", "ModifyRDN"; the following counters will beinaccessible for the CLDAP interfaces of Directory Servers:dsApplIfCompareOps, dsApplIfAddEntryOps,  dsApplIfRemoveEntryOps,dsApplIfModifyEntryOps, dsApplIfModifyRDNOps.CLDAP Directory Servers do not return Referralsthe following fields will remain inaccessible forCLDAP interfaces of Directory Servers: dsApplIfReferrals.*/
                public final DsApplIfProtocolIndexEnt dsApplIfProtocolIndex;

                public final DsApplIfProtocolEnt dsApplIfProtocol;

                public final DsApplIfUnauthBindsEnt dsApplIfUnauthBinds;

                public final DsApplIfSimpleAuthBindsEnt dsApplIfSimpleAuthBinds;

                public final DsApplIfStrongAuthBindsEnt dsApplIfStrongAuthBinds;

                public final DsApplIfBindSecurityErrorsEnt dsApplIfBindSecurityErrors;

                public final DsApplIfInOpsEnt dsApplIfInOps;

                public final DsApplIfReadOpsEnt dsApplIfReadOps;

                public final DsApplIfCompareOpsEnt dsApplIfCompareOps;

                public final DsApplIfAddEntryOpsEnt dsApplIfAddEntryOps;

                public final DsApplIfRemoveEntryOpsEnt dsApplIfRemoveEntryOps;

                public final DsApplIfModifyEntryOpsEnt dsApplIfModifyEntryOps;

                public final DsApplIfModifyRDNOpsEnt dsApplIfModifyRDNOps;

                public final DsApplIfListOpsEnt dsApplIfListOps;

                public final DsApplIfSearchOpsEnt dsApplIfSearchOps;

                public final DsApplIfOneLevelSearchOpsEnt dsApplIfOneLevelSearchOps;

                public final DsApplIfWholeSubtreeSearchOpsEnt dsApplIfWholeSubtreeSearchOps;

                public final DsApplIfReferralsEnt dsApplIfReferrals;

                public final DsApplIfChainingsEnt dsApplIfChainings;

                public final DsApplIfSecurityErrorsEnt dsApplIfSecurityErrors;

                public final DsApplIfErrorsEnt dsApplIfErrors;

                /** Replication operations*/
                public final DsApplIfReplicationUpdatesInEnt dsApplIfReplicationUpdatesIn;

                public final DsApplIfReplicationUpdatesOutEnt dsApplIfReplicationUpdatesOut;

                public final DsApplIfInBytesEnt dsApplIfInBytes;

                public final DsApplIfOutBytesEnt dsApplIfOutBytes;

                private DsApplIfOpsEntryEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                {
                    super(mib, parent, "dsApplIfOpsEntry", "1.3.6.1.2.1.66.2.1", false, false, false, true);
                    this.dsApplIfProtocolIndex = new DsApplIfProtocolIndexEnt(mib, this);
                    this.dsApplIfProtocol = new DsApplIfProtocolEnt(mib, this);
                    this.dsApplIfUnauthBinds = new DsApplIfUnauthBindsEnt(mib, this);
                    this.dsApplIfSimpleAuthBinds = new DsApplIfSimpleAuthBindsEnt(mib, this);
                    this.dsApplIfStrongAuthBinds = new DsApplIfStrongAuthBindsEnt(mib, this);
                    this.dsApplIfBindSecurityErrors = new DsApplIfBindSecurityErrorsEnt(mib, this);
                    this.dsApplIfInOps = new DsApplIfInOpsEnt(mib, this);
                    this.dsApplIfReadOps = new DsApplIfReadOpsEnt(mib, this);
                    this.dsApplIfCompareOps = new DsApplIfCompareOpsEnt(mib, this);
                    this.dsApplIfAddEntryOps = new DsApplIfAddEntryOpsEnt(mib, this);
                    this.dsApplIfRemoveEntryOps = new DsApplIfRemoveEntryOpsEnt(mib, this);
                    this.dsApplIfModifyEntryOps = new DsApplIfModifyEntryOpsEnt(mib, this);
                    this.dsApplIfModifyRDNOps = new DsApplIfModifyRDNOpsEnt(mib, this);
                    this.dsApplIfListOps = new DsApplIfListOpsEnt(mib, this);
                    this.dsApplIfSearchOps = new DsApplIfSearchOpsEnt(mib, this);
                    this.dsApplIfOneLevelSearchOps = new DsApplIfOneLevelSearchOpsEnt(mib, this);
                    this.dsApplIfWholeSubtreeSearchOps = new DsApplIfWholeSubtreeSearchOpsEnt(mib, this);
                    this.dsApplIfReferrals = new DsApplIfReferralsEnt(mib, this);
                    this.dsApplIfChainings = new DsApplIfChainingsEnt(mib, this);
                    this.dsApplIfSecurityErrors = new DsApplIfSecurityErrorsEnt(mib, this);
                    this.dsApplIfErrors = new DsApplIfErrorsEnt(mib, this);
                    this.dsApplIfReplicationUpdatesIn = new DsApplIfReplicationUpdatesInEnt(mib, this);
                    this.dsApplIfReplicationUpdatesOut = new DsApplIfReplicationUpdatesOutEnt(mib, this);
                    this.dsApplIfInBytes = new DsApplIfInBytesEnt(mib, this);
                    this.dsApplIfOutBytes = new DsApplIfOutBytesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsApplIfProtocolIndex,
                        this.dsApplIfProtocol,
                        this.dsApplIfUnauthBinds,
                        this.dsApplIfSimpleAuthBinds,
                        this.dsApplIfStrongAuthBinds,
                        this.dsApplIfBindSecurityErrors,
                        this.dsApplIfInOps,
                        this.dsApplIfReadOps,
                        this.dsApplIfCompareOps,
                        this.dsApplIfAddEntryOps,
                        this.dsApplIfRemoveEntryOps,
                        this.dsApplIfModifyEntryOps,
                        this.dsApplIfModifyRDNOps,
                        this.dsApplIfListOps,
                        this.dsApplIfSearchOps,
                        this.dsApplIfOneLevelSearchOps,
                        this.dsApplIfWholeSubtreeSearchOps,
                        this.dsApplIfReferrals,
                        this.dsApplIfChainings,
                        this.dsApplIfSecurityErrors,
                        this.dsApplIfErrors,
                        this.dsApplIfReplicationUpdatesIn,
                        this.dsApplIfReplicationUpdatesOut,
                        this.dsApplIfInBytes,
                        this.dsApplIfOutBytes
                    };
                }
                public static final class DsApplIfProtocolIndexEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfProtocolIndexEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfProtocolIndex", "1.3.6.1.2.1.66.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfProtocolEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfProtocolEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfProtocol", "1.3.6.1.2.1.66.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfUnauthBindsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfUnauthBindsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfUnauthBinds", "1.3.6.1.2.1.66.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfSimpleAuthBindsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfSimpleAuthBindsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfSimpleAuthBinds", "1.3.6.1.2.1.66.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfStrongAuthBindsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfStrongAuthBindsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfStrongAuthBinds", "1.3.6.1.2.1.66.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfBindSecurityErrorsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfBindSecurityErrorsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfBindSecurityErrors", "1.3.6.1.2.1.66.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfInOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfInOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfInOps", "1.3.6.1.2.1.66.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfReadOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfReadOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfReadOps", "1.3.6.1.2.1.66.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfCompareOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfCompareOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfCompareOps", "1.3.6.1.2.1.66.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfAddEntryOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfAddEntryOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfAddEntryOps", "1.3.6.1.2.1.66.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfRemoveEntryOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfRemoveEntryOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfRemoveEntryOps", "1.3.6.1.2.1.66.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfModifyEntryOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfModifyEntryOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfModifyEntryOps", "1.3.6.1.2.1.66.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfModifyRDNOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfModifyRDNOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfModifyRDNOps", "1.3.6.1.2.1.66.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfListOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfListOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfListOps", "1.3.6.1.2.1.66.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfSearchOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfSearchOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfSearchOps", "1.3.6.1.2.1.66.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfOneLevelSearchOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfOneLevelSearchOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfOneLevelSearchOps", "1.3.6.1.2.1.66.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfWholeSubtreeSearchOpsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfWholeSubtreeSearchOpsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfWholeSubtreeSearchOps", "1.3.6.1.2.1.66.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfReferralsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfReferralsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfReferrals", "1.3.6.1.2.1.66.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfChainingsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfChainingsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfChainings", "1.3.6.1.2.1.66.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfSecurityErrorsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfSecurityErrorsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfSecurityErrors", "1.3.6.1.2.1.66.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfErrorsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfErrorsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfErrors", "1.3.6.1.2.1.66.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfReplicationUpdatesInEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfReplicationUpdatesInEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfReplicationUpdatesIn", "1.3.6.1.2.1.66.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfReplicationUpdatesOutEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfReplicationUpdatesOutEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfReplicationUpdatesOut", "1.3.6.1.2.1.66.2.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfInBytesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfInBytesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfInBytes", "1.3.6.1.2.1.66.2.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsApplIfOutBytesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsApplIfOutBytesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsApplIfOutBytes", "1.3.6.1.2.1.66.2.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DsIntTableEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
        {
            public final DsIntEntryEnt dsIntEntry;

            private DsIntTableEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
            {
                super(mib, parent, "dsIntTable", "1.3.6.1.2.1.66.3", false, true, false, false);
                this.dsIntEntry = new DsIntEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsIntEntry
                };
            }
            public static final class DsIntEntryEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
            {
                public final DsIntEntIndexEnt dsIntEntIndex;

                public final DsIntEntDirectoryNameEnt dsIntEntDirectoryName;

                public final DsIntEntTimeOfCreationEnt dsIntEntTimeOfCreation;

                public final DsIntEntTimeOfLastAttemptEnt dsIntEntTimeOfLastAttempt;

                public final DsIntEntTimeOfLastSuccessEnt dsIntEntTimeOfLastSuccess;

                public final DsIntEntFailuresSinceLastSuccessEnt dsIntEntFailuresSinceLastSuccess;

                /** note this gauge has a maximum value of 4294967295 and,it does not wrap.[5]*/
                public final DsIntEntFailuresEnt dsIntEntFailures;

                public final DsIntEntSuccessesEnt dsIntEntSuccesses;

                public final DsIntEntURLEnt dsIntEntURL;

                private DsIntEntryEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                {
                    super(mib, parent, "dsIntEntry", "1.3.6.1.2.1.66.3.1", false, false, false, true);
                    this.dsIntEntIndex = new DsIntEntIndexEnt(mib, this);
                    this.dsIntEntDirectoryName = new DsIntEntDirectoryNameEnt(mib, this);
                    this.dsIntEntTimeOfCreation = new DsIntEntTimeOfCreationEnt(mib, this);
                    this.dsIntEntTimeOfLastAttempt = new DsIntEntTimeOfLastAttemptEnt(mib, this);
                    this.dsIntEntTimeOfLastSuccess = new DsIntEntTimeOfLastSuccessEnt(mib, this);
                    this.dsIntEntFailuresSinceLastSuccess = new DsIntEntFailuresSinceLastSuccessEnt(mib, this);
                    this.dsIntEntFailures = new DsIntEntFailuresEnt(mib, this);
                    this.dsIntEntSuccesses = new DsIntEntSuccessesEnt(mib, this);
                    this.dsIntEntURL = new DsIntEntURLEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsIntEntIndex,
                        this.dsIntEntDirectoryName,
                        this.dsIntEntTimeOfCreation,
                        this.dsIntEntTimeOfLastAttempt,
                        this.dsIntEntTimeOfLastSuccess,
                        this.dsIntEntFailuresSinceLastSuccess,
                        this.dsIntEntFailures,
                        this.dsIntEntSuccesses,
                        this.dsIntEntURL
                    };
                }
                public static final class DsIntEntIndexEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntIndexEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntIndex", "1.3.6.1.2.1.66.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntDirectoryNameEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntDirectoryNameEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntDirectoryName", "1.3.6.1.2.1.66.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntTimeOfCreationEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntTimeOfCreationEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntTimeOfCreation", "1.3.6.1.2.1.66.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntTimeOfLastAttemptEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntTimeOfLastAttemptEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntTimeOfLastAttempt", "1.3.6.1.2.1.66.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntTimeOfLastSuccessEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntTimeOfLastSuccessEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntTimeOfLastSuccess", "1.3.6.1.2.1.66.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntFailuresSinceLastSuccessEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntFailuresSinceLastSuccessEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntFailuresSinceLastSuccess", "1.3.6.1.2.1.66.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntFailuresEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntFailuresEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntFailures", "1.3.6.1.2.1.66.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntSuccessesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntSuccessesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntSuccesses", "1.3.6.1.2.1.66.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntEntURLEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntEntURLEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntEntURL", "1.3.6.1.2.1.66.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DsConformanceEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
        {
            public final DsGroupsEnt dsGroups;

            public final DsCompliancesEnt dsCompliances;

            private DsConformanceEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
            {
                super(mib, parent, "dsConformance", "1.3.6.1.2.1.66.4", false, false, false, false);
                this.dsGroups = new DsGroupsEnt(mib, this);
                this.dsCompliances = new DsCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsGroups,
                    this.dsCompliances
                };
            }
            public static final class DsGroupsEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
            {
                /** Units of conformance*/
                public final DsEntryGroupEnt dsEntryGroup;

                public final DsOpsGroupEnt dsOpsGroup;

                public final DsIntGroupEnt dsIntGroup;

                private DsGroupsEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                {
                    super(mib, parent, "dsGroups", "1.3.6.1.2.1.66.4.1", false, false, false, false);
                    this.dsEntryGroup = new DsEntryGroupEnt(mib, this);
                    this.dsOpsGroup = new DsOpsGroupEnt(mib, this);
                    this.dsIntGroup = new DsIntGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsEntryGroup,
                        this.dsOpsGroup,
                        this.dsIntGroup
                    };
                }
                public static final class DsEntryGroupEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsEntryGroupEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsEntryGroup", "1.3.6.1.2.1.66.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsOpsGroupEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsOpsGroupEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsOpsGroup", "1.3.6.1.2.1.66.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntGroupEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntGroupEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntGroup", "1.3.6.1.2.1.66.4.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DsCompliancesEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
            {
                /** Compliance statements*/
                public final DsEntryComplianceEnt dsEntryCompliance;

                public final DsOpsComplianceEnt dsOpsCompliance;

                public final DsIntComplianceEnt dsIntCompliance;

                public final DsOpsIntComplianceEnt dsOpsIntCompliance;

                private DsCompliancesEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                {
                    super(mib, parent, "dsCompliances", "1.3.6.1.2.1.66.4.2", false, false, false, false);
                    this.dsEntryCompliance = new DsEntryComplianceEnt(mib, this);
                    this.dsOpsCompliance = new DsOpsComplianceEnt(mib, this);
                    this.dsIntCompliance = new DsIntComplianceEnt(mib, this);
                    this.dsOpsIntCompliance = new DsOpsIntComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsEntryCompliance,
                        this.dsOpsCompliance,
                        this.dsIntCompliance,
                        this.dsOpsIntCompliance
                    };
                }
                public static final class DsEntryComplianceEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsEntryComplianceEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsEntryCompliance", "1.3.6.1.2.1.66.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsOpsComplianceEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsOpsComplianceEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsOpsCompliance", "1.3.6.1.2.1.66.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsIntComplianceEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsIntComplianceEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsIntCompliance", "1.3.6.1.2.1.66.4.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsOpsIntComplianceEnt extends MIBEntry<DIRECTORYSERVERMIBDef>
                {
                    private DsOpsIntComplianceEnt(DIRECTORYSERVERMIBDef mib, MIBEntry<DIRECTORYSERVERMIBDef> parent)
                    {
                        super(mib, parent, "dsOpsIntCompliance", "1.3.6.1.2.1.66.4.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
