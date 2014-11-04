package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class MALLOCMIBDef extends MIB
{
    public static final MALLOCMIBDef MALLOCMIB = new MALLOCMIBDef();

    static { MIBs.getInstance().registerMIB(MALLOCMIBDef.MALLOCMIB); }

    /** June 9, 2003*/
    public final MallocMIBEnt mallocMIB;

    private MALLOCMIBDef()
    {
        super("MALLOC-MIB");
        this.mallocMIB = new MallocMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mallocMIB
        };
    }

    public static final class MallocMIBEnt extends MIBEntry<MALLOCMIBDef>
    {
        public final MallocMIBObjectsEnt mallocMIBObjects;

        /** conformance information*/
        public final MallocConformanceEnt mallocConformance;

        private MallocMIBEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
        {
            super(mib, parent, "mallocMIB", "1.3.6.1.2.1.101", false, false, false, false);
            this.mallocMIBObjects = new MallocMIBObjectsEnt(mib, this);
            this.mallocConformance = new MallocConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mallocMIBObjects,
                this.mallocConformance
            };
        }
        public static final class MallocMIBObjectsEnt extends MIBEntry<MALLOCMIBDef>
        {
            public final MallocEnt malloc;

            public final MadcapEnt madcap;

            private MallocMIBObjectsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
            {
                super(mib, parent, "mallocMIBObjects", "1.3.6.1.2.1.101.1", false, false, false, false);
                this.malloc = new MallocEnt(mib, this);
                this.madcap = new MadcapEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.malloc,
                    this.madcap
                };
            }
            public static final class MallocEnt extends MIBEntry<MALLOCMIBDef>
            {
                /** scalars*/
                public final MallocCapabilitiesEnt mallocCapabilities;

                /** the Scope Table*/
                public final MallocScopeTableEnt mallocScopeTable;

                /** the Scope Name Table*/
                public final MallocScopeNameTableEnt mallocScopeNameTable;

                /** the Allocation Range Table*/
                public final MallocAllocRangeTableEnt mallocAllocRangeTable;

                /** the Request Table*/
                public final MallocRequestTableEnt mallocRequestTable;

                /** the Address Table*/
                public final MallocAddressTableEnt mallocAddressTable;

                private MallocEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                {
                    super(mib, parent, "malloc", "1.3.6.1.2.1.101.1.1", false, false, false, false);
                    this.mallocCapabilities = new MallocCapabilitiesEnt(mib, this);
                    this.mallocScopeTable = new MallocScopeTableEnt(mib, this);
                    this.mallocScopeNameTable = new MallocScopeNameTableEnt(mib, this);
                    this.mallocAllocRangeTable = new MallocAllocRangeTableEnt(mib, this);
                    this.mallocRequestTable = new MallocRequestTableEnt(mib, this);
                    this.mallocAddressTable = new MallocAddressTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mallocCapabilities,
                        this.mallocScopeTable,
                        this.mallocScopeNameTable,
                        this.mallocAllocRangeTable,
                        this.mallocRequestTable,
                        this.mallocAddressTable
                    };
                }
                public static final class MallocCapabilitiesEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocCapabilitiesEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocCapabilities", "1.3.6.1.2.1.101.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocScopeTableEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MallocScopeEntryEnt mallocScopeEntry;

                    private MallocScopeTableEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocScopeTable", "1.3.6.1.2.1.101.1.1.2", false, true, false, false);
                        this.mallocScopeEntry = new MallocScopeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mallocScopeEntry
                        };
                    }
                    public static final class MallocScopeEntryEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        public final MallocScopeAddressTypeEnt mallocScopeAddressType;

                        public final MallocScopeFirstAddressEnt mallocScopeFirstAddress;

                        public final MallocScopeLastAddressEnt mallocScopeLastAddress;

                        public final MallocScopeHopLimitEnt mallocScopeHopLimit;

                        public final MallocScopeStatusEnt mallocScopeStatus;

                        public final MallocScopeSourceEnt mallocScopeSource;

                        public final MallocScopeDivisibleEnt mallocScopeDivisible;

                        public final MallocScopeServerAddressTypeEnt mallocScopeServerAddressType;

                        /** the empty string*/
                        public final MallocScopeServerAddressEnt mallocScopeServerAddress;

                        public final MallocScopeSSMEnt mallocScopeSSM;

                        public final MallocScopeStorageEnt mallocScopeStorage;

                        private MallocScopeEntryEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "mallocScopeEntry", "1.3.6.1.2.1.101.1.1.2.1", false, false, false, true);
                            this.mallocScopeAddressType = new MallocScopeAddressTypeEnt(mib, this);
                            this.mallocScopeFirstAddress = new MallocScopeFirstAddressEnt(mib, this);
                            this.mallocScopeLastAddress = new MallocScopeLastAddressEnt(mib, this);
                            this.mallocScopeHopLimit = new MallocScopeHopLimitEnt(mib, this);
                            this.mallocScopeStatus = new MallocScopeStatusEnt(mib, this);
                            this.mallocScopeSource = new MallocScopeSourceEnt(mib, this);
                            this.mallocScopeDivisible = new MallocScopeDivisibleEnt(mib, this);
                            this.mallocScopeServerAddressType = new MallocScopeServerAddressTypeEnt(mib, this);
                            this.mallocScopeServerAddress = new MallocScopeServerAddressEnt(mib, this);
                            this.mallocScopeSSM = new MallocScopeSSMEnt(mib, this);
                            this.mallocScopeStorage = new MallocScopeStorageEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mallocScopeAddressType,
                                this.mallocScopeFirstAddress,
                                this.mallocScopeLastAddress,
                                this.mallocScopeHopLimit,
                                this.mallocScopeStatus,
                                this.mallocScopeSource,
                                this.mallocScopeDivisible,
                                this.mallocScopeServerAddressType,
                                this.mallocScopeServerAddress,
                                this.mallocScopeSSM,
                                this.mallocScopeStorage
                            };
                        }
                        public static final class MallocScopeAddressTypeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeAddressTypeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeAddressType", "1.3.6.1.2.1.101.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeFirstAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeFirstAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeFirstAddress", "1.3.6.1.2.1.101.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeLastAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeLastAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeLastAddress", "1.3.6.1.2.1.101.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeHopLimitEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeHopLimitEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeHopLimit", "1.3.6.1.2.1.101.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeStatusEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeStatusEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeStatus", "1.3.6.1.2.1.101.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeSourceEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeSourceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeSource", "1.3.6.1.2.1.101.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeDivisibleEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeDivisibleEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeDivisible", "1.3.6.1.2.1.101.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeServerAddressTypeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeServerAddressTypeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeServerAddressType", "1.3.6.1.2.1.101.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeServerAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeServerAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeServerAddress", "1.3.6.1.2.1.101.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeSSMEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeSSMEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeSSM", "1.3.6.1.2.1.101.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeStorageEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeStorageEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeStorage", "1.3.6.1.2.1.101.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MallocScopeNameTableEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MallocScopeNameEntryEnt mallocScopeNameEntry;

                    private MallocScopeNameTableEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocScopeNameTable", "1.3.6.1.2.1.101.1.1.3", false, true, false, false);
                        this.mallocScopeNameEntry = new MallocScopeNameEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mallocScopeNameEntry
                        };
                    }
                    public static final class MallocScopeNameEntryEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        public final MallocScopeNameLangNameEnt mallocScopeNameLangName;

                        public final MallocScopeNameScopeNameEnt mallocScopeNameScopeName;

                        public final MallocScopeNameDefaultEnt mallocScopeNameDefault;

                        public final MallocScopeNameStatusEnt mallocScopeNameStatus;

                        public final MallocScopeNameStorageEnt mallocScopeNameStorage;

                        private MallocScopeNameEntryEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "mallocScopeNameEntry", "1.3.6.1.2.1.101.1.1.3.1", false, false, false, true);
                            this.mallocScopeNameLangName = new MallocScopeNameLangNameEnt(mib, this);
                            this.mallocScopeNameScopeName = new MallocScopeNameScopeNameEnt(mib, this);
                            this.mallocScopeNameDefault = new MallocScopeNameDefaultEnt(mib, this);
                            this.mallocScopeNameStatus = new MallocScopeNameStatusEnt(mib, this);
                            this.mallocScopeNameStorage = new MallocScopeNameStorageEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mallocScopeNameLangName,
                                this.mallocScopeNameScopeName,
                                this.mallocScopeNameDefault,
                                this.mallocScopeNameStatus,
                                this.mallocScopeNameStorage
                            };
                        }
                        public static final class MallocScopeNameLangNameEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeNameLangNameEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeNameLangName", "1.3.6.1.2.1.101.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeNameScopeNameEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeNameScopeNameEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeNameScopeName", "1.3.6.1.2.1.101.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeNameDefaultEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeNameDefaultEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeNameDefault", "1.3.6.1.2.1.101.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeNameStatusEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeNameStatusEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeNameStatus", "1.3.6.1.2.1.101.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocScopeNameStorageEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocScopeNameStorageEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocScopeNameStorage", "1.3.6.1.2.1.101.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MallocAllocRangeTableEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MallocAllocRangeEntryEnt mallocAllocRangeEntry;

                    private MallocAllocRangeTableEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocAllocRangeTable", "1.3.6.1.2.1.101.1.1.4", false, true, false, false);
                        this.mallocAllocRangeEntry = new MallocAllocRangeEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mallocAllocRangeEntry
                        };
                    }
                    public static final class MallocAllocRangeEntryEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        public final MallocAllocRangeFirstAddressEnt mallocAllocRangeFirstAddress;

                        public final MallocAllocRangeLastAddressEnt mallocAllocRangeLastAddress;

                        public final MallocAllocRangeStatusEnt mallocAllocRangeStatus;

                        public final MallocAllocRangeSourceEnt mallocAllocRangeSource;

                        public final MallocAllocRangeLifetimeEnt mallocAllocRangeLifetime;

                        public final MallocAllocRangeMaxLeaseAddrsEnt mallocAllocRangeMaxLeaseAddrs;

                        public final MallocAllocRangeMaxLeaseTimeEnt mallocAllocRangeMaxLeaseTime;

                        public final MallocAllocRangeNumAllocatedAddrsEnt mallocAllocRangeNumAllocatedAddrs;

                        public final MallocAllocRangeNumOfferedAddrsEnt mallocAllocRangeNumOfferedAddrs;

                        public final MallocAllocRangeNumWaitingAddrsEnt mallocAllocRangeNumWaitingAddrs;

                        public final MallocAllocRangeNumTryingAddrsEnt mallocAllocRangeNumTryingAddrs;

                        public final MallocAllocRangeAdvertisableEnt mallocAllocRangeAdvertisable;

                        public final MallocAllocRangeTotalAllocatedAddrsEnt mallocAllocRangeTotalAllocatedAddrs;

                        public final MallocAllocRangeTotalRequestedAddrsEnt mallocAllocRangeTotalRequestedAddrs;

                        public final MallocAllocRangeStorageEnt mallocAllocRangeStorage;

                        private MallocAllocRangeEntryEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "mallocAllocRangeEntry", "1.3.6.1.2.1.101.1.1.4.1", false, false, false, true);
                            this.mallocAllocRangeFirstAddress = new MallocAllocRangeFirstAddressEnt(mib, this);
                            this.mallocAllocRangeLastAddress = new MallocAllocRangeLastAddressEnt(mib, this);
                            this.mallocAllocRangeStatus = new MallocAllocRangeStatusEnt(mib, this);
                            this.mallocAllocRangeSource = new MallocAllocRangeSourceEnt(mib, this);
                            this.mallocAllocRangeLifetime = new MallocAllocRangeLifetimeEnt(mib, this);
                            this.mallocAllocRangeMaxLeaseAddrs = new MallocAllocRangeMaxLeaseAddrsEnt(mib, this);
                            this.mallocAllocRangeMaxLeaseTime = new MallocAllocRangeMaxLeaseTimeEnt(mib, this);
                            this.mallocAllocRangeNumAllocatedAddrs = new MallocAllocRangeNumAllocatedAddrsEnt(mib, this);
                            this.mallocAllocRangeNumOfferedAddrs = new MallocAllocRangeNumOfferedAddrsEnt(mib, this);
                            this.mallocAllocRangeNumWaitingAddrs = new MallocAllocRangeNumWaitingAddrsEnt(mib, this);
                            this.mallocAllocRangeNumTryingAddrs = new MallocAllocRangeNumTryingAddrsEnt(mib, this);
                            this.mallocAllocRangeAdvertisable = new MallocAllocRangeAdvertisableEnt(mib, this);
                            this.mallocAllocRangeTotalAllocatedAddrs = new MallocAllocRangeTotalAllocatedAddrsEnt(mib, this);
                            this.mallocAllocRangeTotalRequestedAddrs = new MallocAllocRangeTotalRequestedAddrsEnt(mib, this);
                            this.mallocAllocRangeStorage = new MallocAllocRangeStorageEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mallocAllocRangeFirstAddress,
                                this.mallocAllocRangeLastAddress,
                                this.mallocAllocRangeStatus,
                                this.mallocAllocRangeSource,
                                this.mallocAllocRangeLifetime,
                                this.mallocAllocRangeMaxLeaseAddrs,
                                this.mallocAllocRangeMaxLeaseTime,
                                this.mallocAllocRangeNumAllocatedAddrs,
                                this.mallocAllocRangeNumOfferedAddrs,
                                this.mallocAllocRangeNumWaitingAddrs,
                                this.mallocAllocRangeNumTryingAddrs,
                                this.mallocAllocRangeAdvertisable,
                                this.mallocAllocRangeTotalAllocatedAddrs,
                                this.mallocAllocRangeTotalRequestedAddrs,
                                this.mallocAllocRangeStorage
                            };
                        }
                        public static final class MallocAllocRangeFirstAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeFirstAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeFirstAddress", "1.3.6.1.2.1.101.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeLastAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeLastAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeLastAddress", "1.3.6.1.2.1.101.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeStatusEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeStatusEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeStatus", "1.3.6.1.2.1.101.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeSourceEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeSourceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeSource", "1.3.6.1.2.1.101.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeLifetimeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeLifetimeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeLifetime", "1.3.6.1.2.1.101.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeMaxLeaseAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeMaxLeaseAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeMaxLeaseAddrs", "1.3.6.1.2.1.101.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeMaxLeaseTimeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeMaxLeaseTimeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeMaxLeaseTime", "1.3.6.1.2.1.101.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeNumAllocatedAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeNumAllocatedAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeNumAllocatedAddrs", "1.3.6.1.2.1.101.1.1.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeNumOfferedAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeNumOfferedAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeNumOfferedAddrs", "1.3.6.1.2.1.101.1.1.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeNumWaitingAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeNumWaitingAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeNumWaitingAddrs", "1.3.6.1.2.1.101.1.1.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeNumTryingAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeNumTryingAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeNumTryingAddrs", "1.3.6.1.2.1.101.1.1.4.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeAdvertisableEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeAdvertisableEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeAdvertisable", "1.3.6.1.2.1.101.1.1.4.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeTotalAllocatedAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeTotalAllocatedAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeTotalAllocatedAddrs", "1.3.6.1.2.1.101.1.1.4.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeTotalRequestedAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeTotalRequestedAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeTotalRequestedAddrs", "1.3.6.1.2.1.101.1.1.4.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAllocRangeStorageEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAllocRangeStorageEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAllocRangeStorage", "1.3.6.1.2.1.101.1.1.4.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MallocRequestTableEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MallocRequestEntryEnt mallocRequestEntry;

                    private MallocRequestTableEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocRequestTable", "1.3.6.1.2.1.101.1.1.5", false, true, false, false);
                        this.mallocRequestEntry = new MallocRequestEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mallocRequestEntry
                        };
                    }
                    public static final class MallocRequestEntryEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        public final MallocRequestIdEnt mallocRequestId;

                        public final MallocRequestScopeAddressTypeEnt mallocRequestScopeAddressType;

                        public final MallocRequestScopeFirstAddressEnt mallocRequestScopeFirstAddress;

                        public final MallocRequestStartTimeEnt mallocRequestStartTime;

                        public final MallocRequestEndTimeEnt mallocRequestEndTime;

                        public final MallocRequestNumAddrsEnt mallocRequestNumAddrs;

                        public final MallocRequestStateEnt mallocRequestState;

                        public final MallocRequestClientAddressTypeEnt mallocRequestClientAddressType;

                        public final MallocRequestClientAddressEnt mallocRequestClientAddress;

                        public final MallocRequestServerAddressTypeEnt mallocRequestServerAddressType;

                        public final MallocRequestServerAddressEnt mallocRequestServerAddress;

                        public final MallocRequestLeaseIdentifierEnt mallocRequestLeaseIdentifier;

                        private MallocRequestEntryEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "mallocRequestEntry", "1.3.6.1.2.1.101.1.1.5.1", false, false, false, true);
                            this.mallocRequestId = new MallocRequestIdEnt(mib, this);
                            this.mallocRequestScopeAddressType = new MallocRequestScopeAddressTypeEnt(mib, this);
                            this.mallocRequestScopeFirstAddress = new MallocRequestScopeFirstAddressEnt(mib, this);
                            this.mallocRequestStartTime = new MallocRequestStartTimeEnt(mib, this);
                            this.mallocRequestEndTime = new MallocRequestEndTimeEnt(mib, this);
                            this.mallocRequestNumAddrs = new MallocRequestNumAddrsEnt(mib, this);
                            this.mallocRequestState = new MallocRequestStateEnt(mib, this);
                            this.mallocRequestClientAddressType = new MallocRequestClientAddressTypeEnt(mib, this);
                            this.mallocRequestClientAddress = new MallocRequestClientAddressEnt(mib, this);
                            this.mallocRequestServerAddressType = new MallocRequestServerAddressTypeEnt(mib, this);
                            this.mallocRequestServerAddress = new MallocRequestServerAddressEnt(mib, this);
                            this.mallocRequestLeaseIdentifier = new MallocRequestLeaseIdentifierEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mallocRequestId,
                                this.mallocRequestScopeAddressType,
                                this.mallocRequestScopeFirstAddress,
                                this.mallocRequestStartTime,
                                this.mallocRequestEndTime,
                                this.mallocRequestNumAddrs,
                                this.mallocRequestState,
                                this.mallocRequestClientAddressType,
                                this.mallocRequestClientAddress,
                                this.mallocRequestServerAddressType,
                                this.mallocRequestServerAddress,
                                this.mallocRequestLeaseIdentifier
                            };
                        }
                        public static final class MallocRequestIdEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestIdEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestId", "1.3.6.1.2.1.101.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestScopeAddressTypeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestScopeAddressTypeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestScopeAddressType", "1.3.6.1.2.1.101.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestScopeFirstAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestScopeFirstAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestScopeFirstAddress", "1.3.6.1.2.1.101.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestStartTimeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestStartTimeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestStartTime", "1.3.6.1.2.1.101.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestEndTimeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestEndTimeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestEndTime", "1.3.6.1.2.1.101.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestNumAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestNumAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestNumAddrs", "1.3.6.1.2.1.101.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestStateEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestStateEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestState", "1.3.6.1.2.1.101.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestClientAddressTypeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestClientAddressTypeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestClientAddressType", "1.3.6.1.2.1.101.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestClientAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestClientAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestClientAddress", "1.3.6.1.2.1.101.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestServerAddressTypeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestServerAddressTypeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestServerAddressType", "1.3.6.1.2.1.101.1.1.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestServerAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestServerAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestServerAddress", "1.3.6.1.2.1.101.1.1.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocRequestLeaseIdentifierEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocRequestLeaseIdentifierEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocRequestLeaseIdentifier", "1.3.6.1.2.1.101.1.1.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MallocAddressTableEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MallocAddressEntryEnt mallocAddressEntry;

                    private MallocAddressTableEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocAddressTable", "1.3.6.1.2.1.101.1.1.6", false, true, false, false);
                        this.mallocAddressEntry = new MallocAddressEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mallocAddressEntry
                        };
                    }
                    public static final class MallocAddressEntryEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        public final MallocAddressAddressTypeEnt mallocAddressAddressType;

                        public final MallocAddressFirstAddressEnt mallocAddressFirstAddress;

                        public final MallocAddressNumAddrsEnt mallocAddressNumAddrs;

                        public final MallocAddressRequestIdEnt mallocAddressRequestId;

                        private MallocAddressEntryEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "mallocAddressEntry", "1.3.6.1.2.1.101.1.1.6.1", false, false, false, true);
                            this.mallocAddressAddressType = new MallocAddressAddressTypeEnt(mib, this);
                            this.mallocAddressFirstAddress = new MallocAddressFirstAddressEnt(mib, this);
                            this.mallocAddressNumAddrs = new MallocAddressNumAddrsEnt(mib, this);
                            this.mallocAddressRequestId = new MallocAddressRequestIdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mallocAddressAddressType,
                                this.mallocAddressFirstAddress,
                                this.mallocAddressNumAddrs,
                                this.mallocAddressRequestId
                            };
                        }
                        public static final class MallocAddressAddressTypeEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAddressAddressTypeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAddressAddressType", "1.3.6.1.2.1.101.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAddressFirstAddressEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAddressFirstAddressEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAddressFirstAddress", "1.3.6.1.2.1.101.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAddressNumAddrsEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAddressNumAddrsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAddressNumAddrs", "1.3.6.1.2.1.101.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MallocAddressRequestIdEnt extends MIBEntry<MALLOCMIBDef>
                        {
                            private MallocAddressRequestIdEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                            {
                                super(mib, parent, "mallocAddressRequestId", "1.3.6.1.2.1.101.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MadcapEnt extends MIBEntry<MALLOCMIBDef>
            {
                /** MADCAP-specific objects*/
                public final MadcapConfigEnt madcapConfig;

                public final MadcapCountersEnt madcapCounters;

                private MadcapEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                {
                    super(mib, parent, "madcap", "1.3.6.1.2.1.101.1.2", false, false, false, false);
                    this.madcapConfig = new MadcapConfigEnt(mib, this);
                    this.madcapCounters = new MadcapCountersEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.madcapConfig,
                        this.madcapCounters
                    };
                }
                public static final class MadcapConfigEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MadcapConfigExtraAllocationTimeEnt madcapConfigExtraAllocationTime;

                    public final MadcapConfigNoResponseDelayEnt madcapConfigNoResponseDelay;

                    public final MadcapConfigOfferHoldEnt madcapConfigOfferHold;

                    public final MadcapConfigResponseCacheIntervalEnt madcapConfigResponseCacheInterval;

                    public final MadcapConfigClockSkewAllowanceEnt madcapConfigClockSkewAllowance;

                    private MadcapConfigEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "madcapConfig", "1.3.6.1.2.1.101.1.2.1", false, false, false, false);
                        this.madcapConfigExtraAllocationTime = new MadcapConfigExtraAllocationTimeEnt(mib, this);
                        this.madcapConfigNoResponseDelay = new MadcapConfigNoResponseDelayEnt(mib, this);
                        this.madcapConfigOfferHold = new MadcapConfigOfferHoldEnt(mib, this);
                        this.madcapConfigResponseCacheInterval = new MadcapConfigResponseCacheIntervalEnt(mib, this);
                        this.madcapConfigClockSkewAllowance = new MadcapConfigClockSkewAllowanceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.madcapConfigExtraAllocationTime,
                            this.madcapConfigNoResponseDelay,
                            this.madcapConfigOfferHold,
                            this.madcapConfigResponseCacheInterval,
                            this.madcapConfigClockSkewAllowance
                        };
                    }
                    public static final class MadcapConfigExtraAllocationTimeEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapConfigExtraAllocationTimeEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapConfigExtraAllocationTime", "1.3.6.1.2.1.101.1.2.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapConfigNoResponseDelayEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapConfigNoResponseDelayEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapConfigNoResponseDelay", "1.3.6.1.2.1.101.1.2.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapConfigOfferHoldEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapConfigOfferHoldEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapConfigOfferHold", "1.3.6.1.2.1.101.1.2.1.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapConfigResponseCacheIntervalEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapConfigResponseCacheIntervalEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapConfigResponseCacheInterval", "1.3.6.1.2.1.101.1.2.1.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapConfigClockSkewAllowanceEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapConfigClockSkewAllowanceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapConfigClockSkewAllowance", "1.3.6.1.2.1.101.1.2.1.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MadcapCountersEnt extends MIBEntry<MALLOCMIBDef>
                {
                    public final MadcapTotalErrorsEnt madcapTotalErrors;

                    public final MadcapRequestsDeniedEnt madcapRequestsDenied;

                    public final MadcapInvalidRequestsEnt madcapInvalidRequests;

                    public final MadcapExcessiveClockSkewsEnt madcapExcessiveClockSkews;

                    public final MadcapBadLeaseIdsEnt madcapBadLeaseIds;

                    public final MadcapDiscoversEnt madcapDiscovers;

                    public final MadcapInformsEnt madcapInforms;

                    public final MadcapRequestsEnt madcapRequests;

                    public final MadcapRenewsEnt madcapRenews;

                    public final MadcapReleasesEnt madcapReleases;

                    private MadcapCountersEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "madcapCounters", "1.3.6.1.2.1.101.1.2.2", false, false, false, false);
                        this.madcapTotalErrors = new MadcapTotalErrorsEnt(mib, this);
                        this.madcapRequestsDenied = new MadcapRequestsDeniedEnt(mib, this);
                        this.madcapInvalidRequests = new MadcapInvalidRequestsEnt(mib, this);
                        this.madcapExcessiveClockSkews = new MadcapExcessiveClockSkewsEnt(mib, this);
                        this.madcapBadLeaseIds = new MadcapBadLeaseIdsEnt(mib, this);
                        this.madcapDiscovers = new MadcapDiscoversEnt(mib, this);
                        this.madcapInforms = new MadcapInformsEnt(mib, this);
                        this.madcapRequests = new MadcapRequestsEnt(mib, this);
                        this.madcapRenews = new MadcapRenewsEnt(mib, this);
                        this.madcapReleases = new MadcapReleasesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.madcapTotalErrors,
                            this.madcapRequestsDenied,
                            this.madcapInvalidRequests,
                            this.madcapExcessiveClockSkews,
                            this.madcapBadLeaseIds,
                            this.madcapDiscovers,
                            this.madcapInforms,
                            this.madcapRequests,
                            this.madcapRenews,
                            this.madcapReleases
                        };
                    }
                    public static final class MadcapTotalErrorsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapTotalErrorsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapTotalErrors", "1.3.6.1.2.1.101.1.2.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapRequestsDeniedEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapRequestsDeniedEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapRequestsDenied", "1.3.6.1.2.1.101.1.2.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapInvalidRequestsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapInvalidRequestsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapInvalidRequests", "1.3.6.1.2.1.101.1.2.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapExcessiveClockSkewsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapExcessiveClockSkewsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapExcessiveClockSkews", "1.3.6.1.2.1.101.1.2.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapBadLeaseIdsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapBadLeaseIdsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapBadLeaseIds", "1.3.6.1.2.1.101.1.2.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapDiscoversEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapDiscoversEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapDiscovers", "1.3.6.1.2.1.101.1.2.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapInformsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapInformsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapInforms", "1.3.6.1.2.1.101.1.2.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapRequestsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapRequestsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapRequests", "1.3.6.1.2.1.101.1.2.2.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapRenewsEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapRenewsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapRenews", "1.3.6.1.2.1.101.1.2.2.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MadcapReleasesEnt extends MIBEntry<MALLOCMIBDef>
                    {
                        private MadcapReleasesEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                        {
                            super(mib, parent, "madcapReleases", "1.3.6.1.2.1.101.1.2.2.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MallocConformanceEnt extends MIBEntry<MALLOCMIBDef>
        {
            public final MallocCompliancesEnt mallocCompliances;

            public final MallocGroupsEnt mallocGroups;

            private MallocConformanceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
            {
                super(mib, parent, "mallocConformance", "1.3.6.1.2.1.101.2", false, false, false, false);
                this.mallocCompliances = new MallocCompliancesEnt(mib, this);
                this.mallocGroups = new MallocGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mallocCompliances,
                    this.mallocGroups
                };
            }
            public static final class MallocCompliancesEnt extends MIBEntry<MALLOCMIBDef>
            {
                /** compliance statements*/
                public final MallocServerReadOnlyComplianceEnt mallocServerReadOnlyCompliance;

                public final MallocClientReadOnlyComplianceEnt mallocClientReadOnlyCompliance;

                public final MallocPrefixCoordinatorReadOnlyComplianceEnt mallocPrefixCoordinatorReadOnlyCompliance;

                public final MallocServerFullComplianceEnt mallocServerFullCompliance;

                public final MallocClientFullComplianceEnt mallocClientFullCompliance;

                public final MallocPrefixCoordinatorFullComplianceEnt mallocPrefixCoordinatorFullCompliance;

                private MallocCompliancesEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                {
                    super(mib, parent, "mallocCompliances", "1.3.6.1.2.1.101.2.1", false, false, false, false);
                    this.mallocServerReadOnlyCompliance = new MallocServerReadOnlyComplianceEnt(mib, this);
                    this.mallocClientReadOnlyCompliance = new MallocClientReadOnlyComplianceEnt(mib, this);
                    this.mallocPrefixCoordinatorReadOnlyCompliance = new MallocPrefixCoordinatorReadOnlyComplianceEnt(mib, this);
                    this.mallocServerFullCompliance = new MallocServerFullComplianceEnt(mib, this);
                    this.mallocClientFullCompliance = new MallocClientFullComplianceEnt(mib, this);
                    this.mallocPrefixCoordinatorFullCompliance = new MallocPrefixCoordinatorFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mallocServerReadOnlyCompliance,
                        this.mallocClientReadOnlyCompliance,
                        this.mallocPrefixCoordinatorReadOnlyCompliance,
                        this.mallocServerFullCompliance,
                        this.mallocClientFullCompliance,
                        this.mallocPrefixCoordinatorFullCompliance
                    };
                }
                public static final class MallocServerReadOnlyComplianceEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocServerReadOnlyComplianceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocServerReadOnlyCompliance", "1.3.6.1.2.1.101.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocClientReadOnlyComplianceEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocClientReadOnlyComplianceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocClientReadOnlyCompliance", "1.3.6.1.2.1.101.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocPrefixCoordinatorReadOnlyComplianceEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocPrefixCoordinatorReadOnlyComplianceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocPrefixCoordinatorReadOnlyCompliance", "1.3.6.1.2.1.101.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocServerFullComplianceEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocServerFullComplianceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocServerFullCompliance", "1.3.6.1.2.1.101.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocClientFullComplianceEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocClientFullComplianceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocClientFullCompliance", "1.3.6.1.2.1.101.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocPrefixCoordinatorFullComplianceEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocPrefixCoordinatorFullComplianceEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocPrefixCoordinatorFullCompliance", "1.3.6.1.2.1.101.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MallocGroupsEnt extends MIBEntry<MALLOCMIBDef>
            {
                /** units of conformance*/
                public final MallocBasicGroupEnt mallocBasicGroup;

                public final MallocServerGroupEnt mallocServerGroup;

                public final MallocClientGroupEnt mallocClientGroup;

                public final MadcapServerGroupEnt madcapServerGroup;

                public final MadcapClientGroupEnt madcapClientGroup;

                public final MallocClientScopeGroupEnt mallocClientScopeGroup;

                public final MallocPrefixCoordinatorGroupEnt mallocPrefixCoordinatorGroup;

                private MallocGroupsEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                {
                    super(mib, parent, "mallocGroups", "1.3.6.1.2.1.101.2.2", false, false, false, false);
                    this.mallocBasicGroup = new MallocBasicGroupEnt(mib, this);
                    this.mallocServerGroup = new MallocServerGroupEnt(mib, this);
                    this.mallocClientGroup = new MallocClientGroupEnt(mib, this);
                    this.madcapServerGroup = new MadcapServerGroupEnt(mib, this);
                    this.madcapClientGroup = new MadcapClientGroupEnt(mib, this);
                    this.mallocClientScopeGroup = new MallocClientScopeGroupEnt(mib, this);
                    this.mallocPrefixCoordinatorGroup = new MallocPrefixCoordinatorGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mallocBasicGroup,
                        this.mallocServerGroup,
                        this.mallocClientGroup,
                        this.madcapServerGroup,
                        this.madcapClientGroup,
                        this.mallocClientScopeGroup,
                        this.mallocPrefixCoordinatorGroup
                    };
                }
                public static final class MallocBasicGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocBasicGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocBasicGroup", "1.3.6.1.2.1.101.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocServerGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocServerGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocServerGroup", "1.3.6.1.2.1.101.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocClientGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocClientGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocClientGroup", "1.3.6.1.2.1.101.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MadcapServerGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MadcapServerGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "madcapServerGroup", "1.3.6.1.2.1.101.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MadcapClientGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MadcapClientGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "madcapClientGroup", "1.3.6.1.2.1.101.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocClientScopeGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocClientScopeGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocClientScopeGroup", "1.3.6.1.2.1.101.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MallocPrefixCoordinatorGroupEnt extends MIBEntry<MALLOCMIBDef>
                {
                    private MallocPrefixCoordinatorGroupEnt(MALLOCMIBDef mib, MIBEntry<MALLOCMIBDef> parent)
                    {
                        super(mib, parent, "mallocPrefixCoordinatorGroup", "1.3.6.1.2.1.101.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
