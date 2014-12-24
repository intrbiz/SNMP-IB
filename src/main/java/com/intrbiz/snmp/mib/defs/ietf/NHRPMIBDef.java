package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class NHRPMIBDef extends MIB
{
    public static final NHRPMIBDef NHRPMIB = new NHRPMIBDef();

    /** August 26, 1999*/
    public final NhrpMIBEnt nhrpMIB;

    private NHRPMIBDef()
    {
        super("NHRP-MIB");
        this.nhrpMIB = new NhrpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.nhrpMIB
        };
    }

    public static final class NhrpMIBEnt extends MIBEntry<NHRPMIBDef>
    {
        public final NhrpObjectsEnt nhrpObjects;

        /** ****************************************************************Module Compliance Statement*****************************************************************/
        public final NhrpConformanceEnt nhrpConformance;

        private NhrpMIBEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
        {
            super(mib, parent, "nhrpMIB", "1.3.6.1.2.1.71", false, false, false, false);
            this.nhrpObjects = new NhrpObjectsEnt(mib, this);
            this.nhrpConformance = new NhrpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.nhrpObjects,
                this.nhrpConformance
            };
        }
        public static final class NhrpObjectsEnt extends MIBEntry<NHRPMIBDef>
        {
            /** ****************************************************************NHRP General (Client and Server) Objects*****************************************************************/
            public final NhrpGeneralObjectsEnt nhrpGeneralObjects;

            /** ****************************************************************NHRP Client Objects*****************************************************************/
            public final NhrpClientObjectsEnt nhrpClientObjects;

            /** ****************************************************************NHRP Server Objects*****************************************************************/
            public final NhrpServerObjectsEnt nhrpServerObjects;

            private NhrpObjectsEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
            {
                super(mib, parent, "nhrpObjects", "1.3.6.1.2.1.71.1", false, false, false, false);
                this.nhrpGeneralObjects = new NhrpGeneralObjectsEnt(mib, this);
                this.nhrpClientObjects = new NhrpClientObjectsEnt(mib, this);
                this.nhrpServerObjects = new NhrpServerObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nhrpGeneralObjects,
                    this.nhrpClientObjects,
                    this.nhrpServerObjects
                };
            }
            public static final class NhrpGeneralObjectsEnt extends MIBEntry<NHRPMIBDef>
            {
                /** The following scalar is to be used toprovided indices for thenhrpClientTable, and/or the nhrpServerTable.*/
                public final NhrpNextIndexEnt nhrpNextIndex;

                /** The NHRP Cache Table*/
                public final NhrpCacheTableEnt nhrpCacheTable;

                /** The NHRP Purge Request Table*/
                public final NhrpPurgeReqTableEnt nhrpPurgeReqTable;

                private NhrpGeneralObjectsEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                {
                    super(mib, parent, "nhrpGeneralObjects", "1.3.6.1.2.1.71.1.1", false, false, false, false);
                    this.nhrpNextIndex = new NhrpNextIndexEnt(mib, this);
                    this.nhrpCacheTable = new NhrpCacheTableEnt(mib, this);
                    this.nhrpPurgeReqTable = new NhrpPurgeReqTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nhrpNextIndex,
                        this.nhrpCacheTable,
                        this.nhrpPurgeReqTable
                    };
                }
                public static final class NhrpNextIndexEnt extends MIBEntry<NHRPMIBDef>
                {
                    private NhrpNextIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpNextIndex", "1.3.6.1.2.1.71.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NhrpCacheTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpCacheEntryEnt nhrpCacheEntry;

                    private NhrpCacheTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpCacheTable", "1.3.6.1.2.1.71.1.1.2", false, true, false, false);
                        this.nhrpCacheEntry = new NhrpCacheEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpCacheEntry
                        };
                    }
                    public static final class NhrpCacheEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpCacheInternetworkAddrTypeEnt nhrpCacheInternetworkAddrType;

                        public final NhrpCacheInternetworkAddrEnt nhrpCacheInternetworkAddr;

                        public final NhrpCacheIndexEnt nhrpCacheIndex;

                        public final NhrpCachePrefixLengthEnt nhrpCachePrefixLength;

                        public final NhrpCacheNextHopInternetworkAddrEnt nhrpCacheNextHopInternetworkAddr;

                        public final NhrpCacheNbmaAddrTypeEnt nhrpCacheNbmaAddrType;

                        public final NhrpCacheNbmaAddrEnt nhrpCacheNbmaAddr;

                        public final NhrpCacheNbmaSubaddrEnt nhrpCacheNbmaSubaddr;

                        public final NhrpCacheTypeEnt nhrpCacheType;

                        public final NhrpCacheStateEnt nhrpCacheState;

                        public final NhrpCacheHoldingTimeValidEnt nhrpCacheHoldingTimeValid;

                        public final NhrpCacheHoldingTimeEnt nhrpCacheHoldingTime;

                        public final NhrpCacheNegotiatedMtuEnt nhrpCacheNegotiatedMtu;

                        public final NhrpCachePreferenceEnt nhrpCachePreference;

                        public final NhrpCacheStorageTypeEnt nhrpCacheStorageType;

                        public final NhrpCacheRowStatusEnt nhrpCacheRowStatus;

                        private NhrpCacheEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpCacheEntry", "1.3.6.1.2.1.71.1.1.2.1", false, false, false, true);
                            this.nhrpCacheInternetworkAddrType = new NhrpCacheInternetworkAddrTypeEnt(mib, this);
                            this.nhrpCacheInternetworkAddr = new NhrpCacheInternetworkAddrEnt(mib, this);
                            this.nhrpCacheIndex = new NhrpCacheIndexEnt(mib, this);
                            this.nhrpCachePrefixLength = new NhrpCachePrefixLengthEnt(mib, this);
                            this.nhrpCacheNextHopInternetworkAddr = new NhrpCacheNextHopInternetworkAddrEnt(mib, this);
                            this.nhrpCacheNbmaAddrType = new NhrpCacheNbmaAddrTypeEnt(mib, this);
                            this.nhrpCacheNbmaAddr = new NhrpCacheNbmaAddrEnt(mib, this);
                            this.nhrpCacheNbmaSubaddr = new NhrpCacheNbmaSubaddrEnt(mib, this);
                            this.nhrpCacheType = new NhrpCacheTypeEnt(mib, this);
                            this.nhrpCacheState = new NhrpCacheStateEnt(mib, this);
                            this.nhrpCacheHoldingTimeValid = new NhrpCacheHoldingTimeValidEnt(mib, this);
                            this.nhrpCacheHoldingTime = new NhrpCacheHoldingTimeEnt(mib, this);
                            this.nhrpCacheNegotiatedMtu = new NhrpCacheNegotiatedMtuEnt(mib, this);
                            this.nhrpCachePreference = new NhrpCachePreferenceEnt(mib, this);
                            this.nhrpCacheStorageType = new NhrpCacheStorageTypeEnt(mib, this);
                            this.nhrpCacheRowStatus = new NhrpCacheRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpCacheInternetworkAddrType,
                                this.nhrpCacheInternetworkAddr,
                                this.nhrpCacheIndex,
                                this.nhrpCachePrefixLength,
                                this.nhrpCacheNextHopInternetworkAddr,
                                this.nhrpCacheNbmaAddrType,
                                this.nhrpCacheNbmaAddr,
                                this.nhrpCacheNbmaSubaddr,
                                this.nhrpCacheType,
                                this.nhrpCacheState,
                                this.nhrpCacheHoldingTimeValid,
                                this.nhrpCacheHoldingTime,
                                this.nhrpCacheNegotiatedMtu,
                                this.nhrpCachePreference,
                                this.nhrpCacheStorageType,
                                this.nhrpCacheRowStatus
                            };
                        }
                        public static final class NhrpCacheInternetworkAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheInternetworkAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheInternetworkAddrType", "1.3.6.1.2.1.71.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheInternetworkAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheInternetworkAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheInternetworkAddr", "1.3.6.1.2.1.71.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheIndex", "1.3.6.1.2.1.71.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCachePrefixLengthEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCachePrefixLengthEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCachePrefixLength", "1.3.6.1.2.1.71.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheNextHopInternetworkAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheNextHopInternetworkAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheNextHopInternetworkAddr", "1.3.6.1.2.1.71.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheNbmaAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheNbmaAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheNbmaAddrType", "1.3.6.1.2.1.71.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheNbmaAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheNbmaAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheNbmaAddr", "1.3.6.1.2.1.71.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheNbmaSubaddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheNbmaSubaddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheNbmaSubaddr", "1.3.6.1.2.1.71.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheType", "1.3.6.1.2.1.71.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheStateEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheStateEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheState", "1.3.6.1.2.1.71.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheHoldingTimeValidEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheHoldingTimeValidEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheHoldingTimeValid", "1.3.6.1.2.1.71.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheHoldingTimeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheHoldingTimeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheHoldingTime", "1.3.6.1.2.1.71.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheNegotiatedMtuEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheNegotiatedMtuEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheNegotiatedMtu", "1.3.6.1.2.1.71.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCachePreferenceEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCachePreferenceEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCachePreference", "1.3.6.1.2.1.71.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheStorageTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheStorageTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheStorageType", "1.3.6.1.2.1.71.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpCacheRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpCacheRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpCacheRowStatus", "1.3.6.1.2.1.71.1.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpPurgeReqTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpPurgeReqEntryEnt nhrpPurgeReqEntry;

                    private NhrpPurgeReqTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpPurgeReqTable", "1.3.6.1.2.1.71.1.1.3", false, true, false, false);
                        this.nhrpPurgeReqEntry = new NhrpPurgeReqEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpPurgeReqEntry
                        };
                    }
                    public static final class NhrpPurgeReqEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpPurgeIndexEnt nhrpPurgeIndex;

                        public final NhrpPurgeCacheIdentifierEnt nhrpPurgeCacheIdentifier;

                        public final NhrpPurgePrefixLengthEnt nhrpPurgePrefixLength;

                        public final NhrpPurgeRequestIDEnt nhrpPurgeRequestID;

                        public final NhrpPurgeReplyExpectedEnt nhrpPurgeReplyExpected;

                        public final NhrpPurgeRowStatusEnt nhrpPurgeRowStatus;

                        private NhrpPurgeReqEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpPurgeReqEntry", "1.3.6.1.2.1.71.1.1.3.1", false, false, false, true);
                            this.nhrpPurgeIndex = new NhrpPurgeIndexEnt(mib, this);
                            this.nhrpPurgeCacheIdentifier = new NhrpPurgeCacheIdentifierEnt(mib, this);
                            this.nhrpPurgePrefixLength = new NhrpPurgePrefixLengthEnt(mib, this);
                            this.nhrpPurgeRequestID = new NhrpPurgeRequestIDEnt(mib, this);
                            this.nhrpPurgeReplyExpected = new NhrpPurgeReplyExpectedEnt(mib, this);
                            this.nhrpPurgeRowStatus = new NhrpPurgeRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpPurgeIndex,
                                this.nhrpPurgeCacheIdentifier,
                                this.nhrpPurgePrefixLength,
                                this.nhrpPurgeRequestID,
                                this.nhrpPurgeReplyExpected,
                                this.nhrpPurgeRowStatus
                            };
                        }
                        public static final class NhrpPurgeIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpPurgeIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpPurgeIndex", "1.3.6.1.2.1.71.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpPurgeCacheIdentifierEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpPurgeCacheIdentifierEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpPurgeCacheIdentifier", "1.3.6.1.2.1.71.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpPurgePrefixLengthEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpPurgePrefixLengthEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpPurgePrefixLength", "1.3.6.1.2.1.71.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpPurgeRequestIDEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpPurgeRequestIDEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpPurgeRequestID", "1.3.6.1.2.1.71.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpPurgeReplyExpectedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpPurgeReplyExpectedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpPurgeReplyExpected", "1.3.6.1.2.1.71.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpPurgeRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpPurgeRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpPurgeRowStatus", "1.3.6.1.2.1.71.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class NhrpClientObjectsEnt extends MIBEntry<NHRPMIBDef>
            {
                /** The NHRP Client Table*/
                public final NhrpClientTableEnt nhrpClientTable;

                /** The NHRP Client Registration Table*/
                public final NhrpClientRegistrationTableEnt nhrpClientRegistrationTable;

                /** The NHRP Client->Server Table*/
                public final NhrpClientNhsTableEnt nhrpClientNhsTable;

                /** The NHRP Client StatisticsTable*/
                public final NhrpClientStatTableEnt nhrpClientStatTable;

                private NhrpClientObjectsEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                {
                    super(mib, parent, "nhrpClientObjects", "1.3.6.1.2.1.71.1.2", false, false, false, false);
                    this.nhrpClientTable = new NhrpClientTableEnt(mib, this);
                    this.nhrpClientRegistrationTable = new NhrpClientRegistrationTableEnt(mib, this);
                    this.nhrpClientNhsTable = new NhrpClientNhsTableEnt(mib, this);
                    this.nhrpClientStatTable = new NhrpClientStatTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nhrpClientTable,
                        this.nhrpClientRegistrationTable,
                        this.nhrpClientNhsTable,
                        this.nhrpClientStatTable
                    };
                }
                public static final class NhrpClientTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpClientEntryEnt nhrpClientEntry;

                    private NhrpClientTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpClientTable", "1.3.6.1.2.1.71.1.2.1", false, true, false, false);
                        this.nhrpClientEntry = new NhrpClientEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpClientEntry
                        };
                    }
                    public static final class NhrpClientEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpClientIndexEnt nhrpClientIndex;

                        public final NhrpClientInternetworkAddrTypeEnt nhrpClientInternetworkAddrType;

                        public final NhrpClientInternetworkAddrEnt nhrpClientInternetworkAddr;

                        public final NhrpClientNbmaAddrTypeEnt nhrpClientNbmaAddrType;

                        public final NhrpClientNbmaAddrEnt nhrpClientNbmaAddr;

                        public final NhrpClientNbmaSubaddrEnt nhrpClientNbmaSubaddr;

                        public final NhrpClientInitialRequestTimeoutEnt nhrpClientInitialRequestTimeout;

                        public final NhrpClientRegistrationRequestRetriesEnt nhrpClientRegistrationRequestRetries;

                        public final NhrpClientResolutionRequestRetriesEnt nhrpClientResolutionRequestRetries;

                        public final NhrpClientPurgeRequestRetriesEnt nhrpClientPurgeRequestRetries;

                        public final NhrpClientDefaultMtuEnt nhrpClientDefaultMtu;

                        public final NhrpClientHoldTimeEnt nhrpClientHoldTime;

                        public final NhrpClientRequestIDEnt nhrpClientRequestID;

                        public final NhrpClientStorageTypeEnt nhrpClientStorageType;

                        public final NhrpClientRowStatusEnt nhrpClientRowStatus;

                        private NhrpClientEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpClientEntry", "1.3.6.1.2.1.71.1.2.1.1", false, false, false, true);
                            this.nhrpClientIndex = new NhrpClientIndexEnt(mib, this);
                            this.nhrpClientInternetworkAddrType = new NhrpClientInternetworkAddrTypeEnt(mib, this);
                            this.nhrpClientInternetworkAddr = new NhrpClientInternetworkAddrEnt(mib, this);
                            this.nhrpClientNbmaAddrType = new NhrpClientNbmaAddrTypeEnt(mib, this);
                            this.nhrpClientNbmaAddr = new NhrpClientNbmaAddrEnt(mib, this);
                            this.nhrpClientNbmaSubaddr = new NhrpClientNbmaSubaddrEnt(mib, this);
                            this.nhrpClientInitialRequestTimeout = new NhrpClientInitialRequestTimeoutEnt(mib, this);
                            this.nhrpClientRegistrationRequestRetries = new NhrpClientRegistrationRequestRetriesEnt(mib, this);
                            this.nhrpClientResolutionRequestRetries = new NhrpClientResolutionRequestRetriesEnt(mib, this);
                            this.nhrpClientPurgeRequestRetries = new NhrpClientPurgeRequestRetriesEnt(mib, this);
                            this.nhrpClientDefaultMtu = new NhrpClientDefaultMtuEnt(mib, this);
                            this.nhrpClientHoldTime = new NhrpClientHoldTimeEnt(mib, this);
                            this.nhrpClientRequestID = new NhrpClientRequestIDEnt(mib, this);
                            this.nhrpClientStorageType = new NhrpClientStorageTypeEnt(mib, this);
                            this.nhrpClientRowStatus = new NhrpClientRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpClientIndex,
                                this.nhrpClientInternetworkAddrType,
                                this.nhrpClientInternetworkAddr,
                                this.nhrpClientNbmaAddrType,
                                this.nhrpClientNbmaAddr,
                                this.nhrpClientNbmaSubaddr,
                                this.nhrpClientInitialRequestTimeout,
                                this.nhrpClientRegistrationRequestRetries,
                                this.nhrpClientResolutionRequestRetries,
                                this.nhrpClientPurgeRequestRetries,
                                this.nhrpClientDefaultMtu,
                                this.nhrpClientHoldTime,
                                this.nhrpClientRequestID,
                                this.nhrpClientStorageType,
                                this.nhrpClientRowStatus
                            };
                        }
                        public static final class NhrpClientIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientIndex", "1.3.6.1.2.1.71.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientInternetworkAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientInternetworkAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientInternetworkAddrType", "1.3.6.1.2.1.71.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientInternetworkAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientInternetworkAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientInternetworkAddr", "1.3.6.1.2.1.71.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNbmaAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNbmaAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNbmaAddrType", "1.3.6.1.2.1.71.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNbmaAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNbmaAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNbmaAddr", "1.3.6.1.2.1.71.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNbmaSubaddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNbmaSubaddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNbmaSubaddr", "1.3.6.1.2.1.71.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientInitialRequestTimeoutEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientInitialRequestTimeoutEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientInitialRequestTimeout", "1.3.6.1.2.1.71.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientRegistrationRequestRetriesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRegistrationRequestRetriesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRegistrationRequestRetries", "1.3.6.1.2.1.71.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientResolutionRequestRetriesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientResolutionRequestRetriesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientResolutionRequestRetries", "1.3.6.1.2.1.71.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientPurgeRequestRetriesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientPurgeRequestRetriesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientPurgeRequestRetries", "1.3.6.1.2.1.71.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientDefaultMtuEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientDefaultMtuEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientDefaultMtu", "1.3.6.1.2.1.71.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientHoldTimeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientHoldTimeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientHoldTime", "1.3.6.1.2.1.71.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientRequestIDEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRequestIDEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRequestID", "1.3.6.1.2.1.71.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStorageTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStorageTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStorageType", "1.3.6.1.2.1.71.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRowStatus", "1.3.6.1.2.1.71.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpClientRegistrationTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpClientRegistrationEntryEnt nhrpClientRegistrationEntry;

                    private NhrpClientRegistrationTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpClientRegistrationTable", "1.3.6.1.2.1.71.1.2.2", false, true, false, false);
                        this.nhrpClientRegistrationEntry = new NhrpClientRegistrationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpClientRegistrationEntry
                        };
                    }
                    public static final class NhrpClientRegistrationEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpClientRegIndexEnt nhrpClientRegIndex;

                        public final NhrpClientRegUniquenessEnt nhrpClientRegUniqueness;

                        public final NhrpClientRegStateEnt nhrpClientRegState;

                        public final NhrpClientRegRowStatusEnt nhrpClientRegRowStatus;

                        private NhrpClientRegistrationEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpClientRegistrationEntry", "1.3.6.1.2.1.71.1.2.2.1", false, false, false, true);
                            this.nhrpClientRegIndex = new NhrpClientRegIndexEnt(mib, this);
                            this.nhrpClientRegUniqueness = new NhrpClientRegUniquenessEnt(mib, this);
                            this.nhrpClientRegState = new NhrpClientRegStateEnt(mib, this);
                            this.nhrpClientRegRowStatus = new NhrpClientRegRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpClientRegIndex,
                                this.nhrpClientRegUniqueness,
                                this.nhrpClientRegState,
                                this.nhrpClientRegRowStatus
                            };
                        }
                        public static final class NhrpClientRegIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRegIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRegIndex", "1.3.6.1.2.1.71.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientRegUniquenessEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRegUniquenessEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRegUniqueness", "1.3.6.1.2.1.71.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientRegStateEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRegStateEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRegState", "1.3.6.1.2.1.71.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientRegRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientRegRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientRegRowStatus", "1.3.6.1.2.1.71.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpClientNhsTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpClientNhsEntryEnt nhrpClientNhsEntry;

                    private NhrpClientNhsTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpClientNhsTable", "1.3.6.1.2.1.71.1.2.3", false, true, false, false);
                        this.nhrpClientNhsEntry = new NhrpClientNhsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpClientNhsEntry
                        };
                    }
                    public static final class NhrpClientNhsEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpClientNhsIndexEnt nhrpClientNhsIndex;

                        public final NhrpClientNhsInternetworkAddrTypeEnt nhrpClientNhsInternetworkAddrType;

                        public final NhrpClientNhsInternetworkAddrEnt nhrpClientNhsInternetworkAddr;

                        public final NhrpClientNhsNbmaAddrTypeEnt nhrpClientNhsNbmaAddrType;

                        public final NhrpClientNhsNbmaAddrEnt nhrpClientNhsNbmaAddr;

                        public final NhrpClientNhsNbmaSubaddrEnt nhrpClientNhsNbmaSubaddr;

                        public final NhrpClientNhsInUseEnt nhrpClientNhsInUse;

                        public final NhrpClientNhsRowStatusEnt nhrpClientNhsRowStatus;

                        private NhrpClientNhsEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpClientNhsEntry", "1.3.6.1.2.1.71.1.2.3.1", false, false, false, true);
                            this.nhrpClientNhsIndex = new NhrpClientNhsIndexEnt(mib, this);
                            this.nhrpClientNhsInternetworkAddrType = new NhrpClientNhsInternetworkAddrTypeEnt(mib, this);
                            this.nhrpClientNhsInternetworkAddr = new NhrpClientNhsInternetworkAddrEnt(mib, this);
                            this.nhrpClientNhsNbmaAddrType = new NhrpClientNhsNbmaAddrTypeEnt(mib, this);
                            this.nhrpClientNhsNbmaAddr = new NhrpClientNhsNbmaAddrEnt(mib, this);
                            this.nhrpClientNhsNbmaSubaddr = new NhrpClientNhsNbmaSubaddrEnt(mib, this);
                            this.nhrpClientNhsInUse = new NhrpClientNhsInUseEnt(mib, this);
                            this.nhrpClientNhsRowStatus = new NhrpClientNhsRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpClientNhsIndex,
                                this.nhrpClientNhsInternetworkAddrType,
                                this.nhrpClientNhsInternetworkAddr,
                                this.nhrpClientNhsNbmaAddrType,
                                this.nhrpClientNhsNbmaAddr,
                                this.nhrpClientNhsNbmaSubaddr,
                                this.nhrpClientNhsInUse,
                                this.nhrpClientNhsRowStatus
                            };
                        }
                        public static final class NhrpClientNhsIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsIndex", "1.3.6.1.2.1.71.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsInternetworkAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsInternetworkAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsInternetworkAddrType", "1.3.6.1.2.1.71.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsInternetworkAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsInternetworkAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsInternetworkAddr", "1.3.6.1.2.1.71.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsNbmaAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsNbmaAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsNbmaAddrType", "1.3.6.1.2.1.71.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsNbmaAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsNbmaAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsNbmaAddr", "1.3.6.1.2.1.71.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsNbmaSubaddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsNbmaSubaddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsNbmaSubaddr", "1.3.6.1.2.1.71.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsInUseEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsInUseEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsInUse", "1.3.6.1.2.1.71.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientNhsRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientNhsRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientNhsRowStatus", "1.3.6.1.2.1.71.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpClientStatTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpClientStatEntryEnt nhrpClientStatEntry;

                    private NhrpClientStatTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpClientStatTable", "1.3.6.1.2.1.71.1.2.4", false, true, false, false);
                        this.nhrpClientStatEntry = new NhrpClientStatEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpClientStatEntry
                        };
                    }
                    public static final class NhrpClientStatEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpClientStatTxResolveReqEnt nhrpClientStatTxResolveReq;

                        public final NhrpClientStatRxResolveReplyAckEnt nhrpClientStatRxResolveReplyAck;

                        public final NhrpClientStatRxResolveReplyNakProhibitedEnt nhrpClientStatRxResolveReplyNakProhibited;

                        public final NhrpClientStatRxResolveReplyNakInsufResourcesEnt nhrpClientStatRxResolveReplyNakInsufResources;

                        public final NhrpClientStatRxResolveReplyNakNoBindingEnt nhrpClientStatRxResolveReplyNakNoBinding;

                        public final NhrpClientStatRxResolveReplyNakNotUniqueEnt nhrpClientStatRxResolveReplyNakNotUnique;

                        public final NhrpClientStatTxRegisterReqEnt nhrpClientStatTxRegisterReq;

                        public final NhrpClientStatRxRegisterAckEnt nhrpClientStatRxRegisterAck;

                        public final NhrpClientStatRxRegisterNakProhibitedEnt nhrpClientStatRxRegisterNakProhibited;

                        public final NhrpClientStatRxRegisterNakInsufResourcesEnt nhrpClientStatRxRegisterNakInsufResources;

                        public final NhrpClientStatRxRegisterNakAlreadyRegEnt nhrpClientStatRxRegisterNakAlreadyReg;

                        public final NhrpClientStatRxPurgeReqEnt nhrpClientStatRxPurgeReq;

                        public final NhrpClientStatTxPurgeReqEnt nhrpClientStatTxPurgeReq;

                        public final NhrpClientStatRxPurgeReplyEnt nhrpClientStatRxPurgeReply;

                        public final NhrpClientStatTxPurgeReplyEnt nhrpClientStatTxPurgeReply;

                        public final NhrpClientStatTxErrorIndicationEnt nhrpClientStatTxErrorIndication;

                        public final NhrpClientStatRxErrUnrecognizedExtensionEnt nhrpClientStatRxErrUnrecognizedExtension;

                        public final NhrpClientStatRxErrLoopDetectedEnt nhrpClientStatRxErrLoopDetected;

                        public final NhrpClientStatRxErrProtoAddrUnreachableEnt nhrpClientStatRxErrProtoAddrUnreachable;

                        public final NhrpClientStatRxErrProtoErrorEnt nhrpClientStatRxErrProtoError;

                        public final NhrpClientStatRxErrSduSizeExceededEnt nhrpClientStatRxErrSduSizeExceeded;

                        public final NhrpClientStatRxErrInvalidExtensionEnt nhrpClientStatRxErrInvalidExtension;

                        public final NhrpClientStatRxErrAuthenticationFailureEnt nhrpClientStatRxErrAuthenticationFailure;

                        public final NhrpClientStatRxErrHopCountExceededEnt nhrpClientStatRxErrHopCountExceeded;

                        public final NhrpClientStatDiscontinuityTimeEnt nhrpClientStatDiscontinuityTime;

                        private NhrpClientStatEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpClientStatEntry", "1.3.6.1.2.1.71.1.2.4.1", false, false, false, true);
                            this.nhrpClientStatTxResolveReq = new NhrpClientStatTxResolveReqEnt(mib, this);
                            this.nhrpClientStatRxResolveReplyAck = new NhrpClientStatRxResolveReplyAckEnt(mib, this);
                            this.nhrpClientStatRxResolveReplyNakProhibited = new NhrpClientStatRxResolveReplyNakProhibitedEnt(mib, this);
                            this.nhrpClientStatRxResolveReplyNakInsufResources = new NhrpClientStatRxResolveReplyNakInsufResourcesEnt(mib, this);
                            this.nhrpClientStatRxResolveReplyNakNoBinding = new NhrpClientStatRxResolveReplyNakNoBindingEnt(mib, this);
                            this.nhrpClientStatRxResolveReplyNakNotUnique = new NhrpClientStatRxResolveReplyNakNotUniqueEnt(mib, this);
                            this.nhrpClientStatTxRegisterReq = new NhrpClientStatTxRegisterReqEnt(mib, this);
                            this.nhrpClientStatRxRegisterAck = new NhrpClientStatRxRegisterAckEnt(mib, this);
                            this.nhrpClientStatRxRegisterNakProhibited = new NhrpClientStatRxRegisterNakProhibitedEnt(mib, this);
                            this.nhrpClientStatRxRegisterNakInsufResources = new NhrpClientStatRxRegisterNakInsufResourcesEnt(mib, this);
                            this.nhrpClientStatRxRegisterNakAlreadyReg = new NhrpClientStatRxRegisterNakAlreadyRegEnt(mib, this);
                            this.nhrpClientStatRxPurgeReq = new NhrpClientStatRxPurgeReqEnt(mib, this);
                            this.nhrpClientStatTxPurgeReq = new NhrpClientStatTxPurgeReqEnt(mib, this);
                            this.nhrpClientStatRxPurgeReply = new NhrpClientStatRxPurgeReplyEnt(mib, this);
                            this.nhrpClientStatTxPurgeReply = new NhrpClientStatTxPurgeReplyEnt(mib, this);
                            this.nhrpClientStatTxErrorIndication = new NhrpClientStatTxErrorIndicationEnt(mib, this);
                            this.nhrpClientStatRxErrUnrecognizedExtension = new NhrpClientStatRxErrUnrecognizedExtensionEnt(mib, this);
                            this.nhrpClientStatRxErrLoopDetected = new NhrpClientStatRxErrLoopDetectedEnt(mib, this);
                            this.nhrpClientStatRxErrProtoAddrUnreachable = new NhrpClientStatRxErrProtoAddrUnreachableEnt(mib, this);
                            this.nhrpClientStatRxErrProtoError = new NhrpClientStatRxErrProtoErrorEnt(mib, this);
                            this.nhrpClientStatRxErrSduSizeExceeded = new NhrpClientStatRxErrSduSizeExceededEnt(mib, this);
                            this.nhrpClientStatRxErrInvalidExtension = new NhrpClientStatRxErrInvalidExtensionEnt(mib, this);
                            this.nhrpClientStatRxErrAuthenticationFailure = new NhrpClientStatRxErrAuthenticationFailureEnt(mib, this);
                            this.nhrpClientStatRxErrHopCountExceeded = new NhrpClientStatRxErrHopCountExceededEnt(mib, this);
                            this.nhrpClientStatDiscontinuityTime = new NhrpClientStatDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpClientStatTxResolveReq,
                                this.nhrpClientStatRxResolveReplyAck,
                                this.nhrpClientStatRxResolveReplyNakProhibited,
                                this.nhrpClientStatRxResolveReplyNakInsufResources,
                                this.nhrpClientStatRxResolveReplyNakNoBinding,
                                this.nhrpClientStatRxResolveReplyNakNotUnique,
                                this.nhrpClientStatTxRegisterReq,
                                this.nhrpClientStatRxRegisterAck,
                                this.nhrpClientStatRxRegisterNakProhibited,
                                this.nhrpClientStatRxRegisterNakInsufResources,
                                this.nhrpClientStatRxRegisterNakAlreadyReg,
                                this.nhrpClientStatRxPurgeReq,
                                this.nhrpClientStatTxPurgeReq,
                                this.nhrpClientStatRxPurgeReply,
                                this.nhrpClientStatTxPurgeReply,
                                this.nhrpClientStatTxErrorIndication,
                                this.nhrpClientStatRxErrUnrecognizedExtension,
                                this.nhrpClientStatRxErrLoopDetected,
                                this.nhrpClientStatRxErrProtoAddrUnreachable,
                                this.nhrpClientStatRxErrProtoError,
                                this.nhrpClientStatRxErrSduSizeExceeded,
                                this.nhrpClientStatRxErrInvalidExtension,
                                this.nhrpClientStatRxErrAuthenticationFailure,
                                this.nhrpClientStatRxErrHopCountExceeded,
                                this.nhrpClientStatDiscontinuityTime
                            };
                        }
                        public static final class NhrpClientStatTxResolveReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatTxResolveReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatTxResolveReq", "1.3.6.1.2.1.71.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxResolveReplyAckEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxResolveReplyAckEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxResolveReplyAck", "1.3.6.1.2.1.71.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxResolveReplyNakProhibitedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxResolveReplyNakProhibitedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxResolveReplyNakProhibited", "1.3.6.1.2.1.71.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxResolveReplyNakInsufResourcesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxResolveReplyNakInsufResourcesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxResolveReplyNakInsufResources", "1.3.6.1.2.1.71.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxResolveReplyNakNoBindingEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxResolveReplyNakNoBindingEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxResolveReplyNakNoBinding", "1.3.6.1.2.1.71.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxResolveReplyNakNotUniqueEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxResolveReplyNakNotUniqueEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxResolveReplyNakNotUnique", "1.3.6.1.2.1.71.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatTxRegisterReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatTxRegisterReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatTxRegisterReq", "1.3.6.1.2.1.71.1.2.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxRegisterAckEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxRegisterAckEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxRegisterAck", "1.3.6.1.2.1.71.1.2.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxRegisterNakProhibitedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxRegisterNakProhibitedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxRegisterNakProhibited", "1.3.6.1.2.1.71.1.2.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxRegisterNakInsufResourcesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxRegisterNakInsufResourcesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxRegisterNakInsufResources", "1.3.6.1.2.1.71.1.2.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxRegisterNakAlreadyRegEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxRegisterNakAlreadyRegEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxRegisterNakAlreadyReg", "1.3.6.1.2.1.71.1.2.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxPurgeReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxPurgeReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxPurgeReq", "1.3.6.1.2.1.71.1.2.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatTxPurgeReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatTxPurgeReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatTxPurgeReq", "1.3.6.1.2.1.71.1.2.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxPurgeReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxPurgeReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxPurgeReply", "1.3.6.1.2.1.71.1.2.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatTxPurgeReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatTxPurgeReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatTxPurgeReply", "1.3.6.1.2.1.71.1.2.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatTxErrorIndicationEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatTxErrorIndicationEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatTxErrorIndication", "1.3.6.1.2.1.71.1.2.4.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrUnrecognizedExtensionEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrUnrecognizedExtensionEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrUnrecognizedExtension", "1.3.6.1.2.1.71.1.2.4.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrLoopDetectedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrLoopDetectedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrLoopDetected", "1.3.6.1.2.1.71.1.2.4.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrProtoAddrUnreachableEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrProtoAddrUnreachableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrProtoAddrUnreachable", "1.3.6.1.2.1.71.1.2.4.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrProtoErrorEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrProtoErrorEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrProtoError", "1.3.6.1.2.1.71.1.2.4.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrSduSizeExceededEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrSduSizeExceededEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrSduSizeExceeded", "1.3.6.1.2.1.71.1.2.4.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrInvalidExtensionEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrInvalidExtensionEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrInvalidExtension", "1.3.6.1.2.1.71.1.2.4.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrAuthenticationFailureEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrAuthenticationFailureEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrAuthenticationFailure", "1.3.6.1.2.1.71.1.2.4.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatRxErrHopCountExceededEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatRxErrHopCountExceededEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatRxErrHopCountExceeded", "1.3.6.1.2.1.71.1.2.4.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpClientStatDiscontinuityTimeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpClientStatDiscontinuityTimeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpClientStatDiscontinuityTime", "1.3.6.1.2.1.71.1.2.4.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class NhrpServerObjectsEnt extends MIBEntry<NHRPMIBDef>
            {
                /** The NHRP Next Hop Server Table*/
                public final NhrpServerTableEnt nhrpServerTable;

                /** The Server Cache Table*/
                public final NhrpServerCacheTableEnt nhrpServerCacheTable;

                /** The NHRP Server->Client Table*/
                public final NhrpServerNhcTableEnt nhrpServerNhcTable;

                /** The Next Hop Server Statistics Table*/
                public final NhrpServerStatTableEnt nhrpServerStatTable;

                private NhrpServerObjectsEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                {
                    super(mib, parent, "nhrpServerObjects", "1.3.6.1.2.1.71.1.3", false, false, false, false);
                    this.nhrpServerTable = new NhrpServerTableEnt(mib, this);
                    this.nhrpServerCacheTable = new NhrpServerCacheTableEnt(mib, this);
                    this.nhrpServerNhcTable = new NhrpServerNhcTableEnt(mib, this);
                    this.nhrpServerStatTable = new NhrpServerStatTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nhrpServerTable,
                        this.nhrpServerCacheTable,
                        this.nhrpServerNhcTable,
                        this.nhrpServerStatTable
                    };
                }
                public static final class NhrpServerTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpServerEntryEnt nhrpServerEntry;

                    private NhrpServerTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpServerTable", "1.3.6.1.2.1.71.1.3.1", false, true, false, false);
                        this.nhrpServerEntry = new NhrpServerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpServerEntry
                        };
                    }
                    public static final class NhrpServerEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpServerIndexEnt nhrpServerIndex;

                        public final NhrpServerInternetworkAddrTypeEnt nhrpServerInternetworkAddrType;

                        public final NhrpServerInternetworkAddrEnt nhrpServerInternetworkAddr;

                        public final NhrpServerNbmaAddrTypeEnt nhrpServerNbmaAddrType;

                        public final NhrpServerNbmaAddrEnt nhrpServerNbmaAddr;

                        public final NhrpServerNbmaSubaddrEnt nhrpServerNbmaSubaddr;

                        public final NhrpServerStorageTypeEnt nhrpServerStorageType;

                        public final NhrpServerRowStatusEnt nhrpServerRowStatus;

                        private NhrpServerEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpServerEntry", "1.3.6.1.2.1.71.1.3.1.1", false, false, false, true);
                            this.nhrpServerIndex = new NhrpServerIndexEnt(mib, this);
                            this.nhrpServerInternetworkAddrType = new NhrpServerInternetworkAddrTypeEnt(mib, this);
                            this.nhrpServerInternetworkAddr = new NhrpServerInternetworkAddrEnt(mib, this);
                            this.nhrpServerNbmaAddrType = new NhrpServerNbmaAddrTypeEnt(mib, this);
                            this.nhrpServerNbmaAddr = new NhrpServerNbmaAddrEnt(mib, this);
                            this.nhrpServerNbmaSubaddr = new NhrpServerNbmaSubaddrEnt(mib, this);
                            this.nhrpServerStorageType = new NhrpServerStorageTypeEnt(mib, this);
                            this.nhrpServerRowStatus = new NhrpServerRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpServerIndex,
                                this.nhrpServerInternetworkAddrType,
                                this.nhrpServerInternetworkAddr,
                                this.nhrpServerNbmaAddrType,
                                this.nhrpServerNbmaAddr,
                                this.nhrpServerNbmaSubaddr,
                                this.nhrpServerStorageType,
                                this.nhrpServerRowStatus
                            };
                        }
                        public static final class NhrpServerIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerIndex", "1.3.6.1.2.1.71.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerInternetworkAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerInternetworkAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerInternetworkAddrType", "1.3.6.1.2.1.71.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerInternetworkAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerInternetworkAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerInternetworkAddr", "1.3.6.1.2.1.71.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNbmaAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNbmaAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNbmaAddrType", "1.3.6.1.2.1.71.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNbmaAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNbmaAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNbmaAddr", "1.3.6.1.2.1.71.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNbmaSubaddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNbmaSubaddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNbmaSubaddr", "1.3.6.1.2.1.71.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStorageTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStorageTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStorageType", "1.3.6.1.2.1.71.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerRowStatus", "1.3.6.1.2.1.71.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpServerCacheTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpServerCacheEntryEnt nhrpServerCacheEntry;

                    private NhrpServerCacheTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpServerCacheTable", "1.3.6.1.2.1.71.1.3.2", false, true, false, false);
                        this.nhrpServerCacheEntry = new NhrpServerCacheEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpServerCacheEntry
                        };
                    }
                    public static final class NhrpServerCacheEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpServerCacheAuthoritativeEnt nhrpServerCacheAuthoritative;

                        public final NhrpServerCacheUniquenessEnt nhrpServerCacheUniqueness;

                        private NhrpServerCacheEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpServerCacheEntry", "1.3.6.1.2.1.71.1.3.2.1", false, false, false, true);
                            this.nhrpServerCacheAuthoritative = new NhrpServerCacheAuthoritativeEnt(mib, this);
                            this.nhrpServerCacheUniqueness = new NhrpServerCacheUniquenessEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpServerCacheAuthoritative,
                                this.nhrpServerCacheUniqueness
                            };
                        }
                        public static final class NhrpServerCacheAuthoritativeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerCacheAuthoritativeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerCacheAuthoritative", "1.3.6.1.2.1.71.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerCacheUniquenessEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerCacheUniquenessEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerCacheUniqueness", "1.3.6.1.2.1.71.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpServerNhcTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpServerNhcEntryEnt nhrpServerNhcEntry;

                    private NhrpServerNhcTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpServerNhcTable", "1.3.6.1.2.1.71.1.3.3", false, true, false, false);
                        this.nhrpServerNhcEntry = new NhrpServerNhcEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpServerNhcEntry
                        };
                    }
                    public static final class NhrpServerNhcEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpServerNhcIndexEnt nhrpServerNhcIndex;

                        public final NhrpServerNhcPrefixLengthEnt nhrpServerNhcPrefixLength;

                        public final NhrpServerNhcInternetworkAddrTypeEnt nhrpServerNhcInternetworkAddrType;

                        public final NhrpServerNhcInternetworkAddrEnt nhrpServerNhcInternetworkAddr;

                        public final NhrpServerNhcNbmaAddrTypeEnt nhrpServerNhcNbmaAddrType;

                        public final NhrpServerNhcNbmaAddrEnt nhrpServerNhcNbmaAddr;

                        public final NhrpServerNhcNbmaSubaddrEnt nhrpServerNhcNbmaSubaddr;

                        public final NhrpServerNhcInUseEnt nhrpServerNhcInUse;

                        public final NhrpServerNhcRowStatusEnt nhrpServerNhcRowStatus;

                        private NhrpServerNhcEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpServerNhcEntry", "1.3.6.1.2.1.71.1.3.3.1", false, false, false, true);
                            this.nhrpServerNhcIndex = new NhrpServerNhcIndexEnt(mib, this);
                            this.nhrpServerNhcPrefixLength = new NhrpServerNhcPrefixLengthEnt(mib, this);
                            this.nhrpServerNhcInternetworkAddrType = new NhrpServerNhcInternetworkAddrTypeEnt(mib, this);
                            this.nhrpServerNhcInternetworkAddr = new NhrpServerNhcInternetworkAddrEnt(mib, this);
                            this.nhrpServerNhcNbmaAddrType = new NhrpServerNhcNbmaAddrTypeEnt(mib, this);
                            this.nhrpServerNhcNbmaAddr = new NhrpServerNhcNbmaAddrEnt(mib, this);
                            this.nhrpServerNhcNbmaSubaddr = new NhrpServerNhcNbmaSubaddrEnt(mib, this);
                            this.nhrpServerNhcInUse = new NhrpServerNhcInUseEnt(mib, this);
                            this.nhrpServerNhcRowStatus = new NhrpServerNhcRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpServerNhcIndex,
                                this.nhrpServerNhcPrefixLength,
                                this.nhrpServerNhcInternetworkAddrType,
                                this.nhrpServerNhcInternetworkAddr,
                                this.nhrpServerNhcNbmaAddrType,
                                this.nhrpServerNhcNbmaAddr,
                                this.nhrpServerNhcNbmaSubaddr,
                                this.nhrpServerNhcInUse,
                                this.nhrpServerNhcRowStatus
                            };
                        }
                        public static final class NhrpServerNhcIndexEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcIndexEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcIndex", "1.3.6.1.2.1.71.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcPrefixLengthEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcPrefixLengthEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcPrefixLength", "1.3.6.1.2.1.71.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcInternetworkAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcInternetworkAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcInternetworkAddrType", "1.3.6.1.2.1.71.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcInternetworkAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcInternetworkAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcInternetworkAddr", "1.3.6.1.2.1.71.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcNbmaAddrTypeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcNbmaAddrTypeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcNbmaAddrType", "1.3.6.1.2.1.71.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcNbmaAddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcNbmaAddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcNbmaAddr", "1.3.6.1.2.1.71.1.3.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcNbmaSubaddrEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcNbmaSubaddrEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcNbmaSubaddr", "1.3.6.1.2.1.71.1.3.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcInUseEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcInUseEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcInUse", "1.3.6.1.2.1.71.1.3.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerNhcRowStatusEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerNhcRowStatusEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerNhcRowStatus", "1.3.6.1.2.1.71.1.3.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class NhrpServerStatTableEnt extends MIBEntry<NHRPMIBDef>
                {
                    public final NhrpServerStatEntryEnt nhrpServerStatEntry;

                    private NhrpServerStatTableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpServerStatTable", "1.3.6.1.2.1.71.1.3.4", false, true, false, false);
                        this.nhrpServerStatEntry = new NhrpServerStatEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.nhrpServerStatEntry
                        };
                    }
                    public static final class NhrpServerStatEntryEnt extends MIBEntry<NHRPMIBDef>
                    {
                        public final NhrpServerStatRxResolveReqEnt nhrpServerStatRxResolveReq;

                        public final NhrpServerStatTxResolveReplyAckEnt nhrpServerStatTxResolveReplyAck;

                        public final NhrpServerStatTxResolveReplyNakProhibitedEnt nhrpServerStatTxResolveReplyNakProhibited;

                        public final NhrpServerStatTxResolveReplyNakInsufResourcesEnt nhrpServerStatTxResolveReplyNakInsufResources;

                        public final NhrpServerStatTxResolveReplyNakNoBindingEnt nhrpServerStatTxResolveReplyNakNoBinding;

                        public final NhrpServerStatTxResolveReplyNakNotUniqueEnt nhrpServerStatTxResolveReplyNakNotUnique;

                        public final NhrpServerStatRxRegisterReqEnt nhrpServerStatRxRegisterReq;

                        public final NhrpServerStatTxRegisterAckEnt nhrpServerStatTxRegisterAck;

                        public final NhrpServerStatTxRegisterNakProhibitedEnt nhrpServerStatTxRegisterNakProhibited;

                        public final NhrpServerStatTxRegisterNakInsufResourcesEnt nhrpServerStatTxRegisterNakInsufResources;

                        public final NhrpServerStatTxRegisterNakAlreadyRegEnt nhrpServerStatTxRegisterNakAlreadyReg;

                        public final NhrpServerStatRxPurgeReqEnt nhrpServerStatRxPurgeReq;

                        public final NhrpServerStatTxPurgeReqEnt nhrpServerStatTxPurgeReq;

                        public final NhrpServerStatRxPurgeReplyEnt nhrpServerStatRxPurgeReply;

                        public final NhrpServerStatTxPurgeReplyEnt nhrpServerStatTxPurgeReply;

                        public final NhrpServerStatRxErrUnrecognizedExtensionEnt nhrpServerStatRxErrUnrecognizedExtension;

                        public final NhrpServerStatRxErrLoopDetectedEnt nhrpServerStatRxErrLoopDetected;

                        public final NhrpServerStatRxErrProtoAddrUnreachableEnt nhrpServerStatRxErrProtoAddrUnreachable;

                        public final NhrpServerStatRxErrProtoErrorEnt nhrpServerStatRxErrProtoError;

                        public final NhrpServerStatRxErrSduSizeExceededEnt nhrpServerStatRxErrSduSizeExceeded;

                        public final NhrpServerStatRxErrInvalidExtensionEnt nhrpServerStatRxErrInvalidExtension;

                        public final NhrpServerStatRxErrInvalidResReplyReceivedEnt nhrpServerStatRxErrInvalidResReplyReceived;

                        public final NhrpServerStatRxErrAuthenticationFailureEnt nhrpServerStatRxErrAuthenticationFailure;

                        public final NhrpServerStatRxErrHopCountExceededEnt nhrpServerStatRxErrHopCountExceeded;

                        public final NhrpServerStatTxErrUnrecognizedExtensionEnt nhrpServerStatTxErrUnrecognizedExtension;

                        public final NhrpServerStatTxErrLoopDetectedEnt nhrpServerStatTxErrLoopDetected;

                        public final NhrpServerStatTxErrProtoAddrUnreachableEnt nhrpServerStatTxErrProtoAddrUnreachable;

                        public final NhrpServerStatTxErrProtoErrorEnt nhrpServerStatTxErrProtoError;

                        public final NhrpServerStatTxErrSduSizeExceededEnt nhrpServerStatTxErrSduSizeExceeded;

                        public final NhrpServerStatTxErrInvalidExtensionEnt nhrpServerStatTxErrInvalidExtension;

                        public final NhrpServerStatTxErrAuthenticationFailureEnt nhrpServerStatTxErrAuthenticationFailure;

                        public final NhrpServerStatTxErrHopCountExceededEnt nhrpServerStatTxErrHopCountExceeded;

                        public final NhrpServerStatFwResolveReqEnt nhrpServerStatFwResolveReq;

                        public final NhrpServerStatFwResolveReplyEnt nhrpServerStatFwResolveReply;

                        public final NhrpServerStatFwRegisterReqEnt nhrpServerStatFwRegisterReq;

                        public final NhrpServerStatFwRegisterReplyEnt nhrpServerStatFwRegisterReply;

                        public final NhrpServerStatFwPurgeReqEnt nhrpServerStatFwPurgeReq;

                        public final NhrpServerStatFwPurgeReplyEnt nhrpServerStatFwPurgeReply;

                        public final NhrpServerStatFwErrorIndicationEnt nhrpServerStatFwErrorIndication;

                        public final NhrpServerStatDiscontinuityTimeEnt nhrpServerStatDiscontinuityTime;

                        private NhrpServerStatEntryEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                        {
                            super(mib, parent, "nhrpServerStatEntry", "1.3.6.1.2.1.71.1.3.4.1", false, false, false, true);
                            this.nhrpServerStatRxResolveReq = new NhrpServerStatRxResolveReqEnt(mib, this);
                            this.nhrpServerStatTxResolveReplyAck = new NhrpServerStatTxResolveReplyAckEnt(mib, this);
                            this.nhrpServerStatTxResolveReplyNakProhibited = new NhrpServerStatTxResolveReplyNakProhibitedEnt(mib, this);
                            this.nhrpServerStatTxResolveReplyNakInsufResources = new NhrpServerStatTxResolveReplyNakInsufResourcesEnt(mib, this);
                            this.nhrpServerStatTxResolveReplyNakNoBinding = new NhrpServerStatTxResolveReplyNakNoBindingEnt(mib, this);
                            this.nhrpServerStatTxResolveReplyNakNotUnique = new NhrpServerStatTxResolveReplyNakNotUniqueEnt(mib, this);
                            this.nhrpServerStatRxRegisterReq = new NhrpServerStatRxRegisterReqEnt(mib, this);
                            this.nhrpServerStatTxRegisterAck = new NhrpServerStatTxRegisterAckEnt(mib, this);
                            this.nhrpServerStatTxRegisterNakProhibited = new NhrpServerStatTxRegisterNakProhibitedEnt(mib, this);
                            this.nhrpServerStatTxRegisterNakInsufResources = new NhrpServerStatTxRegisterNakInsufResourcesEnt(mib, this);
                            this.nhrpServerStatTxRegisterNakAlreadyReg = new NhrpServerStatTxRegisterNakAlreadyRegEnt(mib, this);
                            this.nhrpServerStatRxPurgeReq = new NhrpServerStatRxPurgeReqEnt(mib, this);
                            this.nhrpServerStatTxPurgeReq = new NhrpServerStatTxPurgeReqEnt(mib, this);
                            this.nhrpServerStatRxPurgeReply = new NhrpServerStatRxPurgeReplyEnt(mib, this);
                            this.nhrpServerStatTxPurgeReply = new NhrpServerStatTxPurgeReplyEnt(mib, this);
                            this.nhrpServerStatRxErrUnrecognizedExtension = new NhrpServerStatRxErrUnrecognizedExtensionEnt(mib, this);
                            this.nhrpServerStatRxErrLoopDetected = new NhrpServerStatRxErrLoopDetectedEnt(mib, this);
                            this.nhrpServerStatRxErrProtoAddrUnreachable = new NhrpServerStatRxErrProtoAddrUnreachableEnt(mib, this);
                            this.nhrpServerStatRxErrProtoError = new NhrpServerStatRxErrProtoErrorEnt(mib, this);
                            this.nhrpServerStatRxErrSduSizeExceeded = new NhrpServerStatRxErrSduSizeExceededEnt(mib, this);
                            this.nhrpServerStatRxErrInvalidExtension = new NhrpServerStatRxErrInvalidExtensionEnt(mib, this);
                            this.nhrpServerStatRxErrInvalidResReplyReceived = new NhrpServerStatRxErrInvalidResReplyReceivedEnt(mib, this);
                            this.nhrpServerStatRxErrAuthenticationFailure = new NhrpServerStatRxErrAuthenticationFailureEnt(mib, this);
                            this.nhrpServerStatRxErrHopCountExceeded = new NhrpServerStatRxErrHopCountExceededEnt(mib, this);
                            this.nhrpServerStatTxErrUnrecognizedExtension = new NhrpServerStatTxErrUnrecognizedExtensionEnt(mib, this);
                            this.nhrpServerStatTxErrLoopDetected = new NhrpServerStatTxErrLoopDetectedEnt(mib, this);
                            this.nhrpServerStatTxErrProtoAddrUnreachable = new NhrpServerStatTxErrProtoAddrUnreachableEnt(mib, this);
                            this.nhrpServerStatTxErrProtoError = new NhrpServerStatTxErrProtoErrorEnt(mib, this);
                            this.nhrpServerStatTxErrSduSizeExceeded = new NhrpServerStatTxErrSduSizeExceededEnt(mib, this);
                            this.nhrpServerStatTxErrInvalidExtension = new NhrpServerStatTxErrInvalidExtensionEnt(mib, this);
                            this.nhrpServerStatTxErrAuthenticationFailure = new NhrpServerStatTxErrAuthenticationFailureEnt(mib, this);
                            this.nhrpServerStatTxErrHopCountExceeded = new NhrpServerStatTxErrHopCountExceededEnt(mib, this);
                            this.nhrpServerStatFwResolveReq = new NhrpServerStatFwResolveReqEnt(mib, this);
                            this.nhrpServerStatFwResolveReply = new NhrpServerStatFwResolveReplyEnt(mib, this);
                            this.nhrpServerStatFwRegisterReq = new NhrpServerStatFwRegisterReqEnt(mib, this);
                            this.nhrpServerStatFwRegisterReply = new NhrpServerStatFwRegisterReplyEnt(mib, this);
                            this.nhrpServerStatFwPurgeReq = new NhrpServerStatFwPurgeReqEnt(mib, this);
                            this.nhrpServerStatFwPurgeReply = new NhrpServerStatFwPurgeReplyEnt(mib, this);
                            this.nhrpServerStatFwErrorIndication = new NhrpServerStatFwErrorIndicationEnt(mib, this);
                            this.nhrpServerStatDiscontinuityTime = new NhrpServerStatDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.nhrpServerStatRxResolveReq,
                                this.nhrpServerStatTxResolveReplyAck,
                                this.nhrpServerStatTxResolveReplyNakProhibited,
                                this.nhrpServerStatTxResolveReplyNakInsufResources,
                                this.nhrpServerStatTxResolveReplyNakNoBinding,
                                this.nhrpServerStatTxResolveReplyNakNotUnique,
                                this.nhrpServerStatRxRegisterReq,
                                this.nhrpServerStatTxRegisterAck,
                                this.nhrpServerStatTxRegisterNakProhibited,
                                this.nhrpServerStatTxRegisterNakInsufResources,
                                this.nhrpServerStatTxRegisterNakAlreadyReg,
                                this.nhrpServerStatRxPurgeReq,
                                this.nhrpServerStatTxPurgeReq,
                                this.nhrpServerStatRxPurgeReply,
                                this.nhrpServerStatTxPurgeReply,
                                this.nhrpServerStatRxErrUnrecognizedExtension,
                                this.nhrpServerStatRxErrLoopDetected,
                                this.nhrpServerStatRxErrProtoAddrUnreachable,
                                this.nhrpServerStatRxErrProtoError,
                                this.nhrpServerStatRxErrSduSizeExceeded,
                                this.nhrpServerStatRxErrInvalidExtension,
                                this.nhrpServerStatRxErrInvalidResReplyReceived,
                                this.nhrpServerStatRxErrAuthenticationFailure,
                                this.nhrpServerStatRxErrHopCountExceeded,
                                this.nhrpServerStatTxErrUnrecognizedExtension,
                                this.nhrpServerStatTxErrLoopDetected,
                                this.nhrpServerStatTxErrProtoAddrUnreachable,
                                this.nhrpServerStatTxErrProtoError,
                                this.nhrpServerStatTxErrSduSizeExceeded,
                                this.nhrpServerStatTxErrInvalidExtension,
                                this.nhrpServerStatTxErrAuthenticationFailure,
                                this.nhrpServerStatTxErrHopCountExceeded,
                                this.nhrpServerStatFwResolveReq,
                                this.nhrpServerStatFwResolveReply,
                                this.nhrpServerStatFwRegisterReq,
                                this.nhrpServerStatFwRegisterReply,
                                this.nhrpServerStatFwPurgeReq,
                                this.nhrpServerStatFwPurgeReply,
                                this.nhrpServerStatFwErrorIndication,
                                this.nhrpServerStatDiscontinuityTime
                            };
                        }
                        public static final class NhrpServerStatRxResolveReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxResolveReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxResolveReq", "1.3.6.1.2.1.71.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxResolveReplyAckEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxResolveReplyAckEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxResolveReplyAck", "1.3.6.1.2.1.71.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxResolveReplyNakProhibitedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxResolveReplyNakProhibitedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxResolveReplyNakProhibited", "1.3.6.1.2.1.71.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxResolveReplyNakInsufResourcesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxResolveReplyNakInsufResourcesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxResolveReplyNakInsufResources", "1.3.6.1.2.1.71.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxResolveReplyNakNoBindingEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxResolveReplyNakNoBindingEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxResolveReplyNakNoBinding", "1.3.6.1.2.1.71.1.3.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxResolveReplyNakNotUniqueEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxResolveReplyNakNotUniqueEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxResolveReplyNakNotUnique", "1.3.6.1.2.1.71.1.3.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxRegisterReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxRegisterReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxRegisterReq", "1.3.6.1.2.1.71.1.3.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxRegisterAckEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxRegisterAckEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxRegisterAck", "1.3.6.1.2.1.71.1.3.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxRegisterNakProhibitedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxRegisterNakProhibitedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxRegisterNakProhibited", "1.3.6.1.2.1.71.1.3.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxRegisterNakInsufResourcesEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxRegisterNakInsufResourcesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxRegisterNakInsufResources", "1.3.6.1.2.1.71.1.3.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxRegisterNakAlreadyRegEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxRegisterNakAlreadyRegEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxRegisterNakAlreadyReg", "1.3.6.1.2.1.71.1.3.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxPurgeReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxPurgeReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxPurgeReq", "1.3.6.1.2.1.71.1.3.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxPurgeReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxPurgeReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxPurgeReq", "1.3.6.1.2.1.71.1.3.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxPurgeReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxPurgeReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxPurgeReply", "1.3.6.1.2.1.71.1.3.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxPurgeReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxPurgeReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxPurgeReply", "1.3.6.1.2.1.71.1.3.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrUnrecognizedExtensionEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrUnrecognizedExtensionEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrUnrecognizedExtension", "1.3.6.1.2.1.71.1.3.4.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrLoopDetectedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrLoopDetectedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrLoopDetected", "1.3.6.1.2.1.71.1.3.4.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrProtoAddrUnreachableEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrProtoAddrUnreachableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrProtoAddrUnreachable", "1.3.6.1.2.1.71.1.3.4.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrProtoErrorEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrProtoErrorEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrProtoError", "1.3.6.1.2.1.71.1.3.4.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrSduSizeExceededEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrSduSizeExceededEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrSduSizeExceeded", "1.3.6.1.2.1.71.1.3.4.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrInvalidExtensionEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrInvalidExtensionEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrInvalidExtension", "1.3.6.1.2.1.71.1.3.4.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrInvalidResReplyReceivedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrInvalidResReplyReceivedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrInvalidResReplyReceived", "1.3.6.1.2.1.71.1.3.4.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrAuthenticationFailureEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrAuthenticationFailureEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrAuthenticationFailure", "1.3.6.1.2.1.71.1.3.4.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatRxErrHopCountExceededEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatRxErrHopCountExceededEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatRxErrHopCountExceeded", "1.3.6.1.2.1.71.1.3.4.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrUnrecognizedExtensionEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrUnrecognizedExtensionEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrUnrecognizedExtension", "1.3.6.1.2.1.71.1.3.4.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrLoopDetectedEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrLoopDetectedEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrLoopDetected", "1.3.6.1.2.1.71.1.3.4.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrProtoAddrUnreachableEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrProtoAddrUnreachableEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrProtoAddrUnreachable", "1.3.6.1.2.1.71.1.3.4.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrProtoErrorEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrProtoErrorEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrProtoError", "1.3.6.1.2.1.71.1.3.4.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrSduSizeExceededEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrSduSizeExceededEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrSduSizeExceeded", "1.3.6.1.2.1.71.1.3.4.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrInvalidExtensionEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrInvalidExtensionEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrInvalidExtension", "1.3.6.1.2.1.71.1.3.4.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrAuthenticationFailureEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrAuthenticationFailureEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrAuthenticationFailure", "1.3.6.1.2.1.71.1.3.4.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatTxErrHopCountExceededEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatTxErrHopCountExceededEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatTxErrHopCountExceeded", "1.3.6.1.2.1.71.1.3.4.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwResolveReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwResolveReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwResolveReq", "1.3.6.1.2.1.71.1.3.4.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwResolveReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwResolveReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwResolveReply", "1.3.6.1.2.1.71.1.3.4.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwRegisterReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwRegisterReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwRegisterReq", "1.3.6.1.2.1.71.1.3.4.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwRegisterReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwRegisterReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwRegisterReply", "1.3.6.1.2.1.71.1.3.4.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwPurgeReqEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwPurgeReqEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwPurgeReq", "1.3.6.1.2.1.71.1.3.4.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwPurgeReplyEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwPurgeReplyEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwPurgeReply", "1.3.6.1.2.1.71.1.3.4.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatFwErrorIndicationEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatFwErrorIndicationEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatFwErrorIndication", "1.3.6.1.2.1.71.1.3.4.1.39", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class NhrpServerStatDiscontinuityTimeEnt extends MIBEntry<NHRPMIBDef>
                        {
                            private NhrpServerStatDiscontinuityTimeEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                            {
                                super(mib, parent, "nhrpServerStatDiscontinuityTime", "1.3.6.1.2.1.71.1.3.4.1.40", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class NhrpConformanceEnt extends MIBEntry<NHRPMIBDef>
        {
            public final NhrpCompliancesEnt nhrpCompliances;

            public final NhrpGroupsEnt nhrpGroups;

            private NhrpConformanceEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
            {
                super(mib, parent, "nhrpConformance", "1.3.6.1.2.1.71.2", false, false, false, false);
                this.nhrpCompliances = new NhrpCompliancesEnt(mib, this);
                this.nhrpGroups = new NhrpGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nhrpCompliances,
                    this.nhrpGroups
                };
            }
            public static final class NhrpCompliancesEnt extends MIBEntry<NHRPMIBDef>
            {
                public final NhrpModuleComplianceEnt nhrpModuleCompliance;

                private NhrpCompliancesEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                {
                    super(mib, parent, "nhrpCompliances", "1.3.6.1.2.1.71.2.1", false, false, false, false);
                    this.nhrpModuleCompliance = new NhrpModuleComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nhrpModuleCompliance
                    };
                }
                public static final class NhrpModuleComplianceEnt extends MIBEntry<NHRPMIBDef>
                {
                    private NhrpModuleComplianceEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpModuleCompliance", "1.3.6.1.2.1.71.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class NhrpGroupsEnt extends MIBEntry<NHRPMIBDef>
            {
                public final NhrpGeneralGroupEnt nhrpGeneralGroup;

                public final NhrpClientGroupEnt nhrpClientGroup;

                public final NhrpServerGroupEnt nhrpServerGroup;

                private NhrpGroupsEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                {
                    super(mib, parent, "nhrpGroups", "1.3.6.1.2.1.71.2.2", false, false, false, false);
                    this.nhrpGeneralGroup = new NhrpGeneralGroupEnt(mib, this);
                    this.nhrpClientGroup = new NhrpClientGroupEnt(mib, this);
                    this.nhrpServerGroup = new NhrpServerGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.nhrpGeneralGroup,
                        this.nhrpClientGroup,
                        this.nhrpServerGroup
                    };
                }
                public static final class NhrpGeneralGroupEnt extends MIBEntry<NHRPMIBDef>
                {
                    private NhrpGeneralGroupEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpGeneralGroup", "1.3.6.1.2.1.71.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NhrpClientGroupEnt extends MIBEntry<NHRPMIBDef>
                {
                    private NhrpClientGroupEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpClientGroup", "1.3.6.1.2.1.71.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class NhrpServerGroupEnt extends MIBEntry<NHRPMIBDef>
                {
                    private NhrpServerGroupEnt(NHRPMIBDef mib, MIBEntry<NHRPMIBDef> parent)
                    {
                        super(mib, parent, "nhrpServerGroup", "1.3.6.1.2.1.71.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
