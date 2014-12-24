package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**FIX: added additional imports (Counter32, Gauge32)*/
public final class DSAMIBDef extends MIB
{
    public static final DSAMIBDef DSAMIB = new DSAMIBDef();

    public final DsaMIBEnt dsaMIB;

    private DSAMIBDef()
    {
        super("DSA-MIB");
        this.dsaMIB = new DsaMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dsaMIB
        };
    }

    public static final class DsaMIBEnt extends MIBEntry<DSAMIBDef>
    {
        public final DsaOpsTableEnt dsaOpsTable;

        /** Entry statistics/Cache performance*/
        public final DsaEntriesTableEnt dsaEntriesTable;

        /** The dsaIntTable contains statistical data on the peer DSAswith which the monitored DSAs [attempt to] interact.  Thistable  will provide a useful insight into  the   effect ofneighbours on the DSA performance.The table keeps track of the last "N" DSAs with which  themonitored  DSAs  has  interacted  [attempted to interact],where "N" is a locally-defined constant.*/
        public final DsaIntTableEnt dsaIntTable;

        /** Conformance information*/
        public final DsaConformanceEnt dsaConformance;

        private DsaMIBEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
        {
            super(mib, parent, "dsaMIB", "1.3.6.1.2.1.29", false, false, false, false);
            this.dsaOpsTable = new DsaOpsTableEnt(mib, this);
            this.dsaEntriesTable = new DsaEntriesTableEnt(mib, this);
            this.dsaIntTable = new DsaIntTableEnt(mib, this);
            this.dsaConformance = new DsaConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dsaOpsTable,
                this.dsaEntriesTable,
                this.dsaIntTable,
                this.dsaConformance
            };
        }
        public static final class DsaOpsTableEnt extends MIBEntry<DSAMIBDef>
        {
            public final DsaOpsEntryEnt dsaOpsEntry;

            private DsaOpsTableEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
            {
                super(mib, parent, "dsaOpsTable", "1.3.6.1.2.1.29.1", false, true, false, false);
                this.dsaOpsEntry = new DsaOpsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsaOpsEntry
                };
            }
            public static final class DsaOpsEntryEnt extends MIBEntry<DSAMIBDef>
            {
                public final DsaAnonymousBindsEnt dsaAnonymousBinds;

                public final DsaUnauthBindsEnt dsaUnauthBinds;

                public final DsaSimpleAuthBindsEnt dsaSimpleAuthBinds;

                public final DsaStrongAuthBindsEnt dsaStrongAuthBinds;

                public final DsaBindSecurityErrorsEnt dsaBindSecurityErrors;

                public final DsaInOpsEnt dsaInOps;

                public final DsaReadOpsEnt dsaReadOps;

                public final DsaCompareOpsEnt dsaCompareOps;

                public final DsaAddEntryOpsEnt dsaAddEntryOps;

                public final DsaRemoveEntryOpsEnt dsaRemoveEntryOps;

                public final DsaModifyEntryOpsEnt dsaModifyEntryOps;

                public final DsaModifyRDNOpsEnt dsaModifyRDNOps;

                public final DsaListOpsEnt dsaListOps;

                public final DsaSearchOpsEnt dsaSearchOps;

                public final DsaOneLevelSearchOpsEnt dsaOneLevelSearchOps;

                public final DsaWholeTreeSearchOpsEnt dsaWholeTreeSearchOps;

                public final DsaReferralsEnt dsaReferrals;

                public final DsaChainingsEnt dsaChainings;

                public final DsaSecurityErrorsEnt dsaSecurityErrors;

                public final DsaErrorsEnt dsaErrors;

                private DsaOpsEntryEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                {
                    super(mib, parent, "dsaOpsEntry", "1.3.6.1.2.1.29.1.1", false, false, false, true);
                    this.dsaAnonymousBinds = new DsaAnonymousBindsEnt(mib, this);
                    this.dsaUnauthBinds = new DsaUnauthBindsEnt(mib, this);
                    this.dsaSimpleAuthBinds = new DsaSimpleAuthBindsEnt(mib, this);
                    this.dsaStrongAuthBinds = new DsaStrongAuthBindsEnt(mib, this);
                    this.dsaBindSecurityErrors = new DsaBindSecurityErrorsEnt(mib, this);
                    this.dsaInOps = new DsaInOpsEnt(mib, this);
                    this.dsaReadOps = new DsaReadOpsEnt(mib, this);
                    this.dsaCompareOps = new DsaCompareOpsEnt(mib, this);
                    this.dsaAddEntryOps = new DsaAddEntryOpsEnt(mib, this);
                    this.dsaRemoveEntryOps = new DsaRemoveEntryOpsEnt(mib, this);
                    this.dsaModifyEntryOps = new DsaModifyEntryOpsEnt(mib, this);
                    this.dsaModifyRDNOps = new DsaModifyRDNOpsEnt(mib, this);
                    this.dsaListOps = new DsaListOpsEnt(mib, this);
                    this.dsaSearchOps = new DsaSearchOpsEnt(mib, this);
                    this.dsaOneLevelSearchOps = new DsaOneLevelSearchOpsEnt(mib, this);
                    this.dsaWholeTreeSearchOps = new DsaWholeTreeSearchOpsEnt(mib, this);
                    this.dsaReferrals = new DsaReferralsEnt(mib, this);
                    this.dsaChainings = new DsaChainingsEnt(mib, this);
                    this.dsaSecurityErrors = new DsaSecurityErrorsEnt(mib, this);
                    this.dsaErrors = new DsaErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsaAnonymousBinds,
                        this.dsaUnauthBinds,
                        this.dsaSimpleAuthBinds,
                        this.dsaStrongAuthBinds,
                        this.dsaBindSecurityErrors,
                        this.dsaInOps,
                        this.dsaReadOps,
                        this.dsaCompareOps,
                        this.dsaAddEntryOps,
                        this.dsaRemoveEntryOps,
                        this.dsaModifyEntryOps,
                        this.dsaModifyRDNOps,
                        this.dsaListOps,
                        this.dsaSearchOps,
                        this.dsaOneLevelSearchOps,
                        this.dsaWholeTreeSearchOps,
                        this.dsaReferrals,
                        this.dsaChainings,
                        this.dsaSecurityErrors,
                        this.dsaErrors
                    };
                }
                public static final class DsaAnonymousBindsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaAnonymousBindsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaAnonymousBinds", "1.3.6.1.2.1.29.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaUnauthBindsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaUnauthBindsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaUnauthBinds", "1.3.6.1.2.1.29.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaSimpleAuthBindsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaSimpleAuthBindsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaSimpleAuthBinds", "1.3.6.1.2.1.29.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaStrongAuthBindsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaStrongAuthBindsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaStrongAuthBinds", "1.3.6.1.2.1.29.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaBindSecurityErrorsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaBindSecurityErrorsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaBindSecurityErrors", "1.3.6.1.2.1.29.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaInOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaInOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaInOps", "1.3.6.1.2.1.29.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaReadOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaReadOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaReadOps", "1.3.6.1.2.1.29.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaCompareOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaCompareOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaCompareOps", "1.3.6.1.2.1.29.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaAddEntryOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaAddEntryOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaAddEntryOps", "1.3.6.1.2.1.29.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaRemoveEntryOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaRemoveEntryOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaRemoveEntryOps", "1.3.6.1.2.1.29.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaModifyEntryOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaModifyEntryOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaModifyEntryOps", "1.3.6.1.2.1.29.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaModifyRDNOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaModifyRDNOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaModifyRDNOps", "1.3.6.1.2.1.29.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaListOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaListOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaListOps", "1.3.6.1.2.1.29.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaSearchOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaSearchOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaSearchOps", "1.3.6.1.2.1.29.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaOneLevelSearchOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaOneLevelSearchOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaOneLevelSearchOps", "1.3.6.1.2.1.29.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaWholeTreeSearchOpsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaWholeTreeSearchOpsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaWholeTreeSearchOps", "1.3.6.1.2.1.29.1.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaReferralsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaReferralsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaReferrals", "1.3.6.1.2.1.29.1.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaChainingsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaChainingsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaChainings", "1.3.6.1.2.1.29.1.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaSecurityErrorsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaSecurityErrorsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaSecurityErrors", "1.3.6.1.2.1.29.1.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaErrorsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaErrorsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaErrors", "1.3.6.1.2.1.29.1.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DsaEntriesTableEnt extends MIBEntry<DSAMIBDef>
        {
            public final DsaEntriesEntryEnt dsaEntriesEntry;

            private DsaEntriesTableEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
            {
                super(mib, parent, "dsaEntriesTable", "1.3.6.1.2.1.29.2", false, true, false, false);
                this.dsaEntriesEntry = new DsaEntriesEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsaEntriesEntry
                };
            }
            public static final class DsaEntriesEntryEnt extends MIBEntry<DSAMIBDef>
            {
                public final DsaMasterEntriesEnt dsaMasterEntries;

                public final DsaCopyEntriesEnt dsaCopyEntries;

                public final DsaCacheEntriesEnt dsaCacheEntries;

                public final DsaCacheHitsEnt dsaCacheHits;

                public final DsaSlaveHitsEnt dsaSlaveHits;

                private DsaEntriesEntryEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                {
                    super(mib, parent, "dsaEntriesEntry", "1.3.6.1.2.1.29.2.1", false, false, false, true);
                    this.dsaMasterEntries = new DsaMasterEntriesEnt(mib, this);
                    this.dsaCopyEntries = new DsaCopyEntriesEnt(mib, this);
                    this.dsaCacheEntries = new DsaCacheEntriesEnt(mib, this);
                    this.dsaCacheHits = new DsaCacheHitsEnt(mib, this);
                    this.dsaSlaveHits = new DsaSlaveHitsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsaMasterEntries,
                        this.dsaCopyEntries,
                        this.dsaCacheEntries,
                        this.dsaCacheHits,
                        this.dsaSlaveHits
                    };
                }
                public static final class DsaMasterEntriesEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaMasterEntriesEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaMasterEntries", "1.3.6.1.2.1.29.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaCopyEntriesEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaCopyEntriesEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaCopyEntries", "1.3.6.1.2.1.29.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaCacheEntriesEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaCacheEntriesEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaCacheEntries", "1.3.6.1.2.1.29.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaCacheHitsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaCacheHitsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaCacheHits", "1.3.6.1.2.1.29.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaSlaveHitsEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaSlaveHitsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaSlaveHits", "1.3.6.1.2.1.29.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DsaIntTableEnt extends MIBEntry<DSAMIBDef>
        {
            public final DsaIntEntryEnt dsaIntEntry;

            private DsaIntTableEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
            {
                super(mib, parent, "dsaIntTable", "1.3.6.1.2.1.29.3", false, true, false, false);
                this.dsaIntEntry = new DsaIntEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsaIntEntry
                };
            }
            public static final class DsaIntEntryEnt extends MIBEntry<DSAMIBDef>
            {
                public final DsaIntIndexEnt dsaIntIndex;

                public final DsaNameEnt dsaName;

                public final DsaTimeOfCreationEnt dsaTimeOfCreation;

                public final DsaTimeOfLastAttemptEnt dsaTimeOfLastAttempt;

                public final DsaTimeOfLastSuccessEnt dsaTimeOfLastSuccess;

                public final DsaFailuresSinceLastSuccessEnt dsaFailuresSinceLastSuccess;

                public final DsaFailuresEnt dsaFailures;

                public final DsaSuccessesEnt dsaSuccesses;

                private DsaIntEntryEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                {
                    super(mib, parent, "dsaIntEntry", "1.3.6.1.2.1.29.3.1", false, false, false, true);
                    this.dsaIntIndex = new DsaIntIndexEnt(mib, this);
                    this.dsaName = new DsaNameEnt(mib, this);
                    this.dsaTimeOfCreation = new DsaTimeOfCreationEnt(mib, this);
                    this.dsaTimeOfLastAttempt = new DsaTimeOfLastAttemptEnt(mib, this);
                    this.dsaTimeOfLastSuccess = new DsaTimeOfLastSuccessEnt(mib, this);
                    this.dsaFailuresSinceLastSuccess = new DsaFailuresSinceLastSuccessEnt(mib, this);
                    this.dsaFailures = new DsaFailuresEnt(mib, this);
                    this.dsaSuccesses = new DsaSuccessesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsaIntIndex,
                        this.dsaName,
                        this.dsaTimeOfCreation,
                        this.dsaTimeOfLastAttempt,
                        this.dsaTimeOfLastSuccess,
                        this.dsaFailuresSinceLastSuccess,
                        this.dsaFailures,
                        this.dsaSuccesses
                    };
                }
                public static final class DsaIntIndexEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaIntIndexEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaIntIndex", "1.3.6.1.2.1.29.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaNameEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaNameEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaName", "1.3.6.1.2.1.29.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaTimeOfCreationEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaTimeOfCreationEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaTimeOfCreation", "1.3.6.1.2.1.29.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaTimeOfLastAttemptEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaTimeOfLastAttemptEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaTimeOfLastAttempt", "1.3.6.1.2.1.29.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaTimeOfLastSuccessEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaTimeOfLastSuccessEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaTimeOfLastSuccess", "1.3.6.1.2.1.29.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaFailuresSinceLastSuccessEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaFailuresSinceLastSuccessEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaFailuresSinceLastSuccess", "1.3.6.1.2.1.29.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaFailuresEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaFailuresEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaFailures", "1.3.6.1.2.1.29.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaSuccessesEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaSuccessesEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaSuccesses", "1.3.6.1.2.1.29.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class DsaConformanceEnt extends MIBEntry<DSAMIBDef>
        {
            public final DsaGroupsEnt dsaGroups;

            public final DsaCompliancesEnt dsaCompliances;

            private DsaConformanceEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
            {
                super(mib, parent, "dsaConformance", "1.3.6.1.2.1.29.4", false, false, false, false);
                this.dsaGroups = new DsaGroupsEnt(mib, this);
                this.dsaCompliances = new DsaCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dsaGroups,
                    this.dsaCompliances
                };
            }
            public static final class DsaGroupsEnt extends MIBEntry<DSAMIBDef>
            {
                /** Units of conformance*/
                public final DsaOpsGroupEnt dsaOpsGroup;

                public final DsaEntryGroupEnt dsaEntryGroup;

                public final DsaIntGroupEnt dsaIntGroup;

                private DsaGroupsEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                {
                    super(mib, parent, "dsaGroups", "1.3.6.1.2.1.29.4.1", false, false, false, false);
                    this.dsaOpsGroup = new DsaOpsGroupEnt(mib, this);
                    this.dsaEntryGroup = new DsaEntryGroupEnt(mib, this);
                    this.dsaIntGroup = new DsaIntGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsaOpsGroup,
                        this.dsaEntryGroup,
                        this.dsaIntGroup
                    };
                }
                public static final class DsaOpsGroupEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaOpsGroupEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaOpsGroup", "1.3.6.1.2.1.29.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaEntryGroupEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaEntryGroupEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaEntryGroup", "1.3.6.1.2.1.29.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaIntGroupEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaIntGroupEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaIntGroup", "1.3.6.1.2.1.29.4.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DsaCompliancesEnt extends MIBEntry<DSAMIBDef>
            {
                /** Compliance statements*/
                public final DsaOpsComplianceEnt dsaOpsCompliance;

                public final DsaEntryComplianceEnt dsaEntryCompliance;

                public final DsaIntComplianceEnt dsaIntCompliance;

                private DsaCompliancesEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                {
                    super(mib, parent, "dsaCompliances", "1.3.6.1.2.1.29.4.2", false, false, false, false);
                    this.dsaOpsCompliance = new DsaOpsComplianceEnt(mib, this);
                    this.dsaEntryCompliance = new DsaEntryComplianceEnt(mib, this);
                    this.dsaIntCompliance = new DsaIntComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dsaOpsCompliance,
                        this.dsaEntryCompliance,
                        this.dsaIntCompliance
                    };
                }
                public static final class DsaOpsComplianceEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaOpsComplianceEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaOpsCompliance", "1.3.6.1.2.1.29.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaEntryComplianceEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaEntryComplianceEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaEntryCompliance", "1.3.6.1.2.1.29.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DsaIntComplianceEnt extends MIBEntry<DSAMIBDef>
                {
                    private DsaIntComplianceEnt(DSAMIBDef mib, MIBEntry<DSAMIBDef> parent)
                    {
                        super(mib, parent, "dsaIntCompliance", "1.3.6.1.2.1.29.4.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
