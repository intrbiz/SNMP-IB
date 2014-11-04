package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class MOBILEIPV6MIBDef extends MIB
{
    public static final MOBILEIPV6MIBDef MOBILEIPV6MIB = new MOBILEIPV6MIBDef();

    static { MIBs.getInstance().registerMIB(MOBILEIPV6MIBDef.MOBILEIPV6MIB); }

    /** 1st February 2006*/
    public final Mip6MIBEnt mip6MIB;

    private MOBILEIPV6MIBDef()
    {
        super("MOBILEIPV6-MIB");
        this.mip6MIB = new Mip6MIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mip6MIB
        };
    }

    public static final class Mip6MIBEnt extends MIBEntry<MOBILEIPV6MIBDef>
    {
        /** The major groups*/
        public final Mip6NotificationsEnt mip6Notifications;

        public final Mip6ObjectsEnt mip6Objects;

        public final Mip6ConformanceEnt mip6Conformance;

        private Mip6MIBEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
        {
            super(mib, parent, "mip6MIB", "1.3.6.1.2.1.133", false, false, false, false);
            this.mip6Notifications = new Mip6NotificationsEnt(mib, this);
            this.mip6Objects = new Mip6ObjectsEnt(mib, this);
            this.mip6Conformance = new Mip6ConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mip6Notifications,
                this.mip6Objects,
                this.mip6Conformance
            };
        }
        public static final class Mip6NotificationsEnt extends MIBEntry<MOBILEIPV6MIBDef>
        {
            /** Notifications*/
            public final Mip6MnRegisteredEnt mip6MnRegistered;

            public final Mip6MnDeRegisteredEnt mip6MnDeRegistered;

            public final Mip6MnCOAChangedEnt mip6MnCOAChanged;

            public final Mip6MnBindingExpiredAtHAEnt mip6MnBindingExpiredAtHA;

            public final Mip6MnBindingExpiredAtCNEnt mip6MnBindingExpiredAtCN;

            private Mip6NotificationsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
            {
                super(mib, parent, "mip6Notifications", "1.3.6.1.2.1.133.0", false, false, false, false);
                this.mip6MnRegistered = new Mip6MnRegisteredEnt(mib, this);
                this.mip6MnDeRegistered = new Mip6MnDeRegisteredEnt(mib, this);
                this.mip6MnCOAChanged = new Mip6MnCOAChangedEnt(mib, this);
                this.mip6MnBindingExpiredAtHA = new Mip6MnBindingExpiredAtHAEnt(mib, this);
                this.mip6MnBindingExpiredAtCN = new Mip6MnBindingExpiredAtCNEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mip6MnRegistered,
                    this.mip6MnDeRegistered,
                    this.mip6MnCOAChanged,
                    this.mip6MnBindingExpiredAtHA,
                    this.mip6MnBindingExpiredAtCN
                };
            }
            public static final class Mip6MnRegisteredEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                private Mip6MnRegisteredEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6MnRegistered", "1.3.6.1.2.1.133.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Mip6MnDeRegisteredEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                private Mip6MnDeRegisteredEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6MnDeRegistered", "1.3.6.1.2.1.133.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Mip6MnCOAChangedEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                private Mip6MnCOAChangedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6MnCOAChanged", "1.3.6.1.2.1.133.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Mip6MnBindingExpiredAtHAEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                private Mip6MnBindingExpiredAtHAEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6MnBindingExpiredAtHA", "1.3.6.1.2.1.133.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Mip6MnBindingExpiredAtCNEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                private Mip6MnBindingExpiredAtCNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6MnBindingExpiredAtCN", "1.3.6.1.2.1.133.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Mip6ObjectsEnt extends MIBEntry<MOBILEIPV6MIBDef>
        {
            public final Mip6CoreEnt mip6Core;

            public final Mip6MnEnt mip6Mn;

            public final Mip6CnEnt mip6Cn;

            public final Mip6HaEnt mip6Ha;

            private Mip6ObjectsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
            {
                super(mib, parent, "mip6Objects", "1.3.6.1.2.1.133.1", false, false, false, false);
                this.mip6Core = new Mip6CoreEnt(mib, this);
                this.mip6Mn = new Mip6MnEnt(mib, this);
                this.mip6Cn = new Mip6CnEnt(mib, this);
                this.mip6Ha = new Mip6HaEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mip6Core,
                    this.mip6Mn,
                    this.mip6Cn,
                    this.mip6Ha
                };
            }
            public static final class Mip6CoreEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                /** The sub groups*/
                public final Mip6SystemEnt mip6System;

                public final Mip6BindingsEnt mip6Bindings;

                public final Mip6StatsEnt mip6Stats;

                private Mip6CoreEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6Core", "1.3.6.1.2.1.133.1.1", false, false, false, false);
                    this.mip6System = new Mip6SystemEnt(mib, this);
                    this.mip6Bindings = new Mip6BindingsEnt(mib, this);
                    this.mip6Stats = new Mip6StatsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mip6System,
                        this.mip6Bindings,
                        this.mip6Stats
                    };
                }
                public static final class Mip6SystemEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    public final Mip6CapabilitiesEnt mip6Capabilities;

                    public final Mip6StatusEnt mip6Status;

                    private Mip6SystemEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6System", "1.3.6.1.2.1.133.1.1.1", false, false, false, false);
                        this.mip6Capabilities = new Mip6CapabilitiesEnt(mib, this);
                        this.mip6Status = new Mip6StatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6Capabilities,
                            this.mip6Status
                        };
                    }
                    public static final class Mip6CapabilitiesEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6CapabilitiesEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6Capabilities", "1.3.6.1.2.1.133.1.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6StatusEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6StatusEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6Status", "1.3.6.1.2.1.133.1.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class Mip6BindingsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** mip6BindingCache*/
                    public final Mip6BindingCacheTableEnt mip6BindingCacheTable;

                    /** mip6BindingHistoryOnce the lifetime expires an entry will be removed from theBinding Cache.For monitoring purposes it will be useful to have access tothe history of the Binding Cache.  BindingHistoryTable servesthis purpose.  It records the history of the Bindings.The size of the table will be left to implementors.*/
                    public final Mip6BindingHistoryTableEnt mip6BindingHistoryTable;

                    private Mip6BindingsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6Bindings", "1.3.6.1.2.1.133.1.1.2", false, false, false, false);
                        this.mip6BindingCacheTable = new Mip6BindingCacheTableEnt(mib, this);
                        this.mip6BindingHistoryTable = new Mip6BindingHistoryTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6BindingCacheTable,
                            this.mip6BindingHistoryTable
                        };
                    }
                    public static final class Mip6BindingCacheTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6BindingCacheEntryEnt mip6BindingCacheEntry;

                        private Mip6BindingCacheTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6BindingCacheTable", "1.3.6.1.2.1.133.1.1.2.1", false, true, false, false);
                            this.mip6BindingCacheEntry = new Mip6BindingCacheEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6BindingCacheEntry
                            };
                        }
                        public static final class Mip6BindingCacheEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6BindingHomeAddressTypeEnt mip6BindingHomeAddressType;

                            public final Mip6BindingHomeAddressEnt mip6BindingHomeAddress;

                            public final Mip6BindingCOATypeEnt mip6BindingCOAType;

                            public final Mip6BindingCOAEnt mip6BindingCOA;

                            public final Mip6BindingTimeRegisteredEnt mip6BindingTimeRegistered;

                            public final Mip6BindingTimeGrantedEnt mip6BindingTimeGranted;

                            public final Mip6BindingTimeRemainingEnt mip6BindingTimeRemaining;

                            public final Mip6BindingHomeRegnEnt mip6BindingHomeRegn;

                            public final Mip6BindingMaxSeqEnt mip6BindingMaxSeq;

                            public final Mip6BindingUsageTSEnt mip6BindingUsageTS;

                            public final Mip6BindingUsageCountEnt mip6BindingUsageCount;

                            public final Mip6BindingAdminStatusEnt mip6BindingAdminStatus;

                            private Mip6BindingCacheEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6BindingCacheEntry", "1.3.6.1.2.1.133.1.1.2.1.1", false, false, false, true);
                                this.mip6BindingHomeAddressType = new Mip6BindingHomeAddressTypeEnt(mib, this);
                                this.mip6BindingHomeAddress = new Mip6BindingHomeAddressEnt(mib, this);
                                this.mip6BindingCOAType = new Mip6BindingCOATypeEnt(mib, this);
                                this.mip6BindingCOA = new Mip6BindingCOAEnt(mib, this);
                                this.mip6BindingTimeRegistered = new Mip6BindingTimeRegisteredEnt(mib, this);
                                this.mip6BindingTimeGranted = new Mip6BindingTimeGrantedEnt(mib, this);
                                this.mip6BindingTimeRemaining = new Mip6BindingTimeRemainingEnt(mib, this);
                                this.mip6BindingHomeRegn = new Mip6BindingHomeRegnEnt(mib, this);
                                this.mip6BindingMaxSeq = new Mip6BindingMaxSeqEnt(mib, this);
                                this.mip6BindingUsageTS = new Mip6BindingUsageTSEnt(mib, this);
                                this.mip6BindingUsageCount = new Mip6BindingUsageCountEnt(mib, this);
                                this.mip6BindingAdminStatus = new Mip6BindingAdminStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6BindingHomeAddressType,
                                    this.mip6BindingHomeAddress,
                                    this.mip6BindingCOAType,
                                    this.mip6BindingCOA,
                                    this.mip6BindingTimeRegistered,
                                    this.mip6BindingTimeGranted,
                                    this.mip6BindingTimeRemaining,
                                    this.mip6BindingHomeRegn,
                                    this.mip6BindingMaxSeq,
                                    this.mip6BindingUsageTS,
                                    this.mip6BindingUsageCount,
                                    this.mip6BindingAdminStatus
                                };
                            }
                            public static final class Mip6BindingHomeAddressTypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHomeAddressTypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHomeAddressType", "1.3.6.1.2.1.133.1.1.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHomeAddressEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHomeAddressEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHomeAddress", "1.3.6.1.2.1.133.1.1.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingCOATypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingCOATypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingCOAType", "1.3.6.1.2.1.133.1.1.2.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingCOAEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingCOAEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingCOA", "1.3.6.1.2.1.133.1.1.2.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingTimeRegisteredEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingTimeRegisteredEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingTimeRegistered", "1.3.6.1.2.1.133.1.1.2.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingTimeGrantedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingTimeGrantedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingTimeGranted", "1.3.6.1.2.1.133.1.1.2.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingTimeRemainingEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingTimeRemainingEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingTimeRemaining", "1.3.6.1.2.1.133.1.1.2.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHomeRegnEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHomeRegnEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHomeRegn", "1.3.6.1.2.1.133.1.1.2.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingMaxSeqEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingMaxSeqEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingMaxSeq", "1.3.6.1.2.1.133.1.1.2.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingUsageTSEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingUsageTSEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingUsageTS", "1.3.6.1.2.1.133.1.1.2.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingUsageCountEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingUsageCountEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingUsageCount", "1.3.6.1.2.1.133.1.1.2.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingAdminStatusEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingAdminStatusEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingAdminStatus", "1.3.6.1.2.1.133.1.1.2.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Mip6BindingHistoryTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6BindingHistoryEntryEnt mip6BindingHistoryEntry;

                        private Mip6BindingHistoryTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6BindingHistoryTable", "1.3.6.1.2.1.133.1.1.2.2", false, true, false, false);
                            this.mip6BindingHistoryEntry = new Mip6BindingHistoryEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6BindingHistoryEntry
                            };
                        }
                        public static final class Mip6BindingHistoryEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6BindingHstHomeAddressTypeEnt mip6BindingHstHomeAddressType;

                            public final Mip6BindingHstHomeAddressEnt mip6BindingHstHomeAddress;

                            public final Mip6BindingHstIndexEnt mip6BindingHstIndex;

                            public final Mip6BindingHstCOATypeEnt mip6BindingHstCOAType;

                            public final Mip6BindingHstCOAEnt mip6BindingHstCOA;

                            public final Mip6BindingHstTimeRegisteredEnt mip6BindingHstTimeRegistered;

                            public final Mip6BindingHstTimeExpiredEnt mip6BindingHstTimeExpired;

                            public final Mip6BindingHstHomeRegnEnt mip6BindingHstHomeRegn;

                            public final Mip6BindingHstUsageTSEnt mip6BindingHstUsageTS;

                            public final Mip6BindingHstUsageCountEnt mip6BindingHstUsageCount;

                            private Mip6BindingHistoryEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6BindingHistoryEntry", "1.3.6.1.2.1.133.1.1.2.2.1", false, false, false, true);
                                this.mip6BindingHstHomeAddressType = new Mip6BindingHstHomeAddressTypeEnt(mib, this);
                                this.mip6BindingHstHomeAddress = new Mip6BindingHstHomeAddressEnt(mib, this);
                                this.mip6BindingHstIndex = new Mip6BindingHstIndexEnt(mib, this);
                                this.mip6BindingHstCOAType = new Mip6BindingHstCOATypeEnt(mib, this);
                                this.mip6BindingHstCOA = new Mip6BindingHstCOAEnt(mib, this);
                                this.mip6BindingHstTimeRegistered = new Mip6BindingHstTimeRegisteredEnt(mib, this);
                                this.mip6BindingHstTimeExpired = new Mip6BindingHstTimeExpiredEnt(mib, this);
                                this.mip6BindingHstHomeRegn = new Mip6BindingHstHomeRegnEnt(mib, this);
                                this.mip6BindingHstUsageTS = new Mip6BindingHstUsageTSEnt(mib, this);
                                this.mip6BindingHstUsageCount = new Mip6BindingHstUsageCountEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6BindingHstHomeAddressType,
                                    this.mip6BindingHstHomeAddress,
                                    this.mip6BindingHstIndex,
                                    this.mip6BindingHstCOAType,
                                    this.mip6BindingHstCOA,
                                    this.mip6BindingHstTimeRegistered,
                                    this.mip6BindingHstTimeExpired,
                                    this.mip6BindingHstHomeRegn,
                                    this.mip6BindingHstUsageTS,
                                    this.mip6BindingHstUsageCount
                                };
                            }
                            public static final class Mip6BindingHstHomeAddressTypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstHomeAddressTypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstHomeAddressType", "1.3.6.1.2.1.133.1.1.2.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstHomeAddressEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstHomeAddressEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstHomeAddress", "1.3.6.1.2.1.133.1.1.2.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstIndexEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstIndexEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstIndex", "1.3.6.1.2.1.133.1.1.2.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstCOATypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstCOATypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstCOAType", "1.3.6.1.2.1.133.1.1.2.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstCOAEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstCOAEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstCOA", "1.3.6.1.2.1.133.1.1.2.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstTimeRegisteredEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstTimeRegisteredEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstTimeRegistered", "1.3.6.1.2.1.133.1.1.2.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstTimeExpiredEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstTimeExpiredEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstTimeExpired", "1.3.6.1.2.1.133.1.1.2.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstHomeRegnEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstHomeRegnEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstHomeRegn", "1.3.6.1.2.1.133.1.1.2.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstUsageTSEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstUsageTSEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstUsageTS", "1.3.6.1.2.1.133.1.1.2.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6BindingHstUsageCountEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6BindingHstUsageCountEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6BindingHstUsageCount", "1.3.6.1.2.1.133.1.1.2.2.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class Mip6StatsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** mip6TrafficCounters
MIPv6 Traffic will be characterized byIPv6 datagrams which satisfy at least one of the followingconditions- the datagrams are tunneled to the mobile node by the HA- the datagrams are reverse tunneled by the MN to the HA- the datagrams have the Routing header type 2 set.- the datagrams have the Home Address option set in theDestination Option extension header- the datagrams have the mobility header*/
                    public final Mip6TotalTrafficEnt mip6TotalTraffic;

                    /** mip6NodeTrafficCounters*/
                    public final Mip6NodeTrafficTableEnt mip6NodeTrafficTable;

                    private Mip6StatsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6Stats", "1.3.6.1.2.1.133.1.1.3", false, false, false, false);
                        this.mip6TotalTraffic = new Mip6TotalTrafficEnt(mib, this);
                        this.mip6NodeTrafficTable = new Mip6NodeTrafficTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6TotalTraffic,
                            this.mip6NodeTrafficTable
                        };
                    }
                    public static final class Mip6TotalTrafficEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        /** REFERENCE"RFC 3775 : Section 4.1, 6.3, 6.4"*/
                        public final Mip6InOctetsEnt mip6InOctets;

                        public final Mip6HCInOctetsEnt mip6HCInOctets;

                        public final Mip6InPktsEnt mip6InPkts;

                        public final Mip6HCInPktsEnt mip6HCInPkts;

                        public final Mip6OutOctetsEnt mip6OutOctets;

                        public final Mip6HCOutOctetsEnt mip6HCOutOctets;

                        public final Mip6OutPktsEnt mip6OutPkts;

                        public final Mip6HCOutPktsEnt mip6HCOutPkts;

                        public final Mip6CounterDiscontinuityTimeEnt mip6CounterDiscontinuityTime;

                        private Mip6TotalTrafficEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6TotalTraffic", "1.3.6.1.2.1.133.1.1.3.1", false, false, false, false);
                            this.mip6InOctets = new Mip6InOctetsEnt(mib, this);
                            this.mip6HCInOctets = new Mip6HCInOctetsEnt(mib, this);
                            this.mip6InPkts = new Mip6InPktsEnt(mib, this);
                            this.mip6HCInPkts = new Mip6HCInPktsEnt(mib, this);
                            this.mip6OutOctets = new Mip6OutOctetsEnt(mib, this);
                            this.mip6HCOutOctets = new Mip6HCOutOctetsEnt(mib, this);
                            this.mip6OutPkts = new Mip6OutPktsEnt(mib, this);
                            this.mip6HCOutPkts = new Mip6HCOutPktsEnt(mib, this);
                            this.mip6CounterDiscontinuityTime = new Mip6CounterDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6InOctets,
                                this.mip6HCInOctets,
                                this.mip6InPkts,
                                this.mip6HCInPkts,
                                this.mip6OutOctets,
                                this.mip6HCOutOctets,
                                this.mip6OutPkts,
                                this.mip6HCOutPkts,
                                this.mip6CounterDiscontinuityTime
                            };
                        }
                        public static final class Mip6InOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6InOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6InOctets", "1.3.6.1.2.1.133.1.1.3.1.1", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HCInOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HCInOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HCInOctets", "1.3.6.1.2.1.133.1.1.3.1.2", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6InPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6InPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6InPkts", "1.3.6.1.2.1.133.1.1.3.1.3", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HCInPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HCInPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HCInPkts", "1.3.6.1.2.1.133.1.1.3.1.4", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6OutOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6OutOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6OutOctets", "1.3.6.1.2.1.133.1.1.3.1.5", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HCOutOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HCOutOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HCOutOctets", "1.3.6.1.2.1.133.1.1.3.1.6", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6OutPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6OutPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6OutPkts", "1.3.6.1.2.1.133.1.1.3.1.7", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HCOutPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HCOutPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HCOutPkts", "1.3.6.1.2.1.133.1.1.3.1.8", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CounterDiscontinuityTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CounterDiscontinuityTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CounterDiscontinuityTime", "1.3.6.1.2.1.133.1.1.3.1.9", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class Mip6NodeTrafficTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6NodeTrafficEntryEnt mip6NodeTrafficEntry;

                        private Mip6NodeTrafficTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6NodeTrafficTable", "1.3.6.1.2.1.133.1.1.3.2", false, true, false, false);
                            this.mip6NodeTrafficEntry = new Mip6NodeTrafficEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6NodeTrafficEntry
                            };
                        }
                        public static final class Mip6NodeTrafficEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6NodeInOctetsEnt mip6NodeInOctets;

                            public final Mip6HCNodeInOctetsEnt mip6HCNodeInOctets;

                            public final Mip6NodeInPktsEnt mip6NodeInPkts;

                            public final Mip6HCNodeInPktsEnt mip6HCNodeInPkts;

                            public final Mip6NodeOutOctetsEnt mip6NodeOutOctets;

                            public final Mip6HCNodeOutOctetsEnt mip6HCNodeOutOctets;

                            public final Mip6NodeOutPktsEnt mip6NodeOutPkts;

                            public final Mip6HCNodeOutPktsEnt mip6HCNodeOutPkts;

                            public final Mip6NodeCtrDiscontinuityTimeEnt mip6NodeCtrDiscontinuityTime;

                            private Mip6NodeTrafficEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6NodeTrafficEntry", "1.3.6.1.2.1.133.1.1.3.2.1", false, false, false, true);
                                this.mip6NodeInOctets = new Mip6NodeInOctetsEnt(mib, this);
                                this.mip6HCNodeInOctets = new Mip6HCNodeInOctetsEnt(mib, this);
                                this.mip6NodeInPkts = new Mip6NodeInPktsEnt(mib, this);
                                this.mip6HCNodeInPkts = new Mip6HCNodeInPktsEnt(mib, this);
                                this.mip6NodeOutOctets = new Mip6NodeOutOctetsEnt(mib, this);
                                this.mip6HCNodeOutOctets = new Mip6HCNodeOutOctetsEnt(mib, this);
                                this.mip6NodeOutPkts = new Mip6NodeOutPktsEnt(mib, this);
                                this.mip6HCNodeOutPkts = new Mip6HCNodeOutPktsEnt(mib, this);
                                this.mip6NodeCtrDiscontinuityTime = new Mip6NodeCtrDiscontinuityTimeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6NodeInOctets,
                                    this.mip6HCNodeInOctets,
                                    this.mip6NodeInPkts,
                                    this.mip6HCNodeInPkts,
                                    this.mip6NodeOutOctets,
                                    this.mip6HCNodeOutOctets,
                                    this.mip6NodeOutPkts,
                                    this.mip6HCNodeOutPkts,
                                    this.mip6NodeCtrDiscontinuityTime
                                };
                            }
                            public static final class Mip6NodeInOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6NodeInOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6NodeInOctets", "1.3.6.1.2.1.133.1.1.3.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HCNodeInOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HCNodeInOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HCNodeInOctets", "1.3.6.1.2.1.133.1.1.3.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6NodeInPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6NodeInPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6NodeInPkts", "1.3.6.1.2.1.133.1.1.3.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HCNodeInPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HCNodeInPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HCNodeInPkts", "1.3.6.1.2.1.133.1.1.3.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6NodeOutOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6NodeOutOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6NodeOutOctets", "1.3.6.1.2.1.133.1.1.3.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HCNodeOutOctetsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HCNodeOutOctetsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HCNodeOutOctets", "1.3.6.1.2.1.133.1.1.3.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6NodeOutPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6NodeOutPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6NodeOutPkts", "1.3.6.1.2.1.133.1.1.3.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HCNodeOutPktsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HCNodeOutPktsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HCNodeOutPkts", "1.3.6.1.2.1.133.1.1.3.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6NodeCtrDiscontinuityTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6NodeCtrDiscontinuityTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6NodeCtrDiscontinuityTime", "1.3.6.1.2.1.133.1.1.3.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class Mip6MnEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                public final Mip6MnSystemEnt mip6MnSystem;

                public final Mip6MnConfEnt mip6MnConf;

                public final Mip6MnRegistrationEnt mip6MnRegistration;

                private Mip6MnEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6Mn", "1.3.6.1.2.1.133.1.2", false, false, false, false);
                    this.mip6MnSystem = new Mip6MnSystemEnt(mib, this);
                    this.mip6MnConf = new Mip6MnConfEnt(mib, this);
                    this.mip6MnRegistration = new Mip6MnRegistrationEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mip6MnSystem,
                        this.mip6MnConf,
                        this.mip6MnRegistration
                    };
                }
                public static final class Mip6MnSystemEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** mip6MnSystem Group*/
                    public final Mip6MnHomeAddressTableEnt mip6MnHomeAddressTable;

                    private Mip6MnSystemEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnSystem", "1.3.6.1.2.1.133.1.2.1", false, false, false, false);
                        this.mip6MnHomeAddressTable = new Mip6MnHomeAddressTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6MnHomeAddressTable
                        };
                    }
                    public static final class Mip6MnHomeAddressTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6MnHomeAddressEntryEnt mip6MnHomeAddressEntry;

                        private Mip6MnHomeAddressTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnHomeAddressTable", "1.3.6.1.2.1.133.1.2.1.1", false, true, false, false);
                            this.mip6MnHomeAddressEntry = new Mip6MnHomeAddressEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6MnHomeAddressEntry
                            };
                        }
                        public static final class Mip6MnHomeAddressEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6MnHomeAddressTypeEnt mip6MnHomeAddressType;

                            public final Mip6MnHomeAddressEnt mip6MnHomeAddress;

                            public final Mip6MnHomeAddressStateEnt mip6MnHomeAddressState;

                            private Mip6MnHomeAddressEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnHomeAddressEntry", "1.3.6.1.2.1.133.1.2.1.1.1", false, false, false, true);
                                this.mip6MnHomeAddressType = new Mip6MnHomeAddressTypeEnt(mib, this);
                                this.mip6MnHomeAddress = new Mip6MnHomeAddressEnt(mib, this);
                                this.mip6MnHomeAddressState = new Mip6MnHomeAddressStateEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6MnHomeAddressType,
                                    this.mip6MnHomeAddress,
                                    this.mip6MnHomeAddressState
                                };
                            }
                            public static final class Mip6MnHomeAddressTypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnHomeAddressTypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnHomeAddressType", "1.3.6.1.2.1.133.1.2.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnHomeAddressEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnHomeAddressEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnHomeAddress", "1.3.6.1.2.1.133.1.2.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnHomeAddressStateEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnHomeAddressStateEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnHomeAddressState", "1.3.6.1.2.1.133.1.2.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class Mip6MnConfEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** Mobile Node Discovery and Advertisement Group Counters*/
                    public final Mip6MnDiscoveryRequestsEnt mip6MnDiscoveryRequests;

                    public final Mip6MnDiscoveryRepliesEnt mip6MnDiscoveryReplies;

                    public final Mip6MnDiscoveryTimeoutsEnt mip6MnDiscoveryTimeouts;

                    public final Mip6MnPrefixSolicitationsSentEnt mip6MnPrefixSolicitationsSent;

                    public final Mip6MnPrefixAdvsRecdEnt mip6MnPrefixAdvsRecd;

                    public final Mip6MnPrefixAdvsIgnoredEnt mip6MnPrefixAdvsIgnored;

                    public final Mip6MnMovedToFNEnt mip6MnMovedToFN;

                    public final Mip6MnMovedToHNEnt mip6MnMovedToHN;

                    private Mip6MnConfEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnConf", "1.3.6.1.2.1.133.1.2.2", false, false, false, false);
                        this.mip6MnDiscoveryRequests = new Mip6MnDiscoveryRequestsEnt(mib, this);
                        this.mip6MnDiscoveryReplies = new Mip6MnDiscoveryRepliesEnt(mib, this);
                        this.mip6MnDiscoveryTimeouts = new Mip6MnDiscoveryTimeoutsEnt(mib, this);
                        this.mip6MnPrefixSolicitationsSent = new Mip6MnPrefixSolicitationsSentEnt(mib, this);
                        this.mip6MnPrefixAdvsRecd = new Mip6MnPrefixAdvsRecdEnt(mib, this);
                        this.mip6MnPrefixAdvsIgnored = new Mip6MnPrefixAdvsIgnoredEnt(mib, this);
                        this.mip6MnMovedToFN = new Mip6MnMovedToFNEnt(mib, this);
                        this.mip6MnMovedToHN = new Mip6MnMovedToHNEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6MnDiscoveryRequests,
                            this.mip6MnDiscoveryReplies,
                            this.mip6MnDiscoveryTimeouts,
                            this.mip6MnPrefixSolicitationsSent,
                            this.mip6MnPrefixAdvsRecd,
                            this.mip6MnPrefixAdvsIgnored,
                            this.mip6MnMovedToFN,
                            this.mip6MnMovedToHN
                        };
                    }
                    public static final class Mip6MnDiscoveryRequestsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnDiscoveryRequestsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnDiscoveryRequests", "1.3.6.1.2.1.133.1.2.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnDiscoveryRepliesEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnDiscoveryRepliesEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnDiscoveryReplies", "1.3.6.1.2.1.133.1.2.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnDiscoveryTimeoutsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnDiscoveryTimeoutsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnDiscoveryTimeouts", "1.3.6.1.2.1.133.1.2.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnPrefixSolicitationsSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnPrefixSolicitationsSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnPrefixSolicitationsSent", "1.3.6.1.2.1.133.1.2.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnPrefixAdvsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnPrefixAdvsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnPrefixAdvsRecd", "1.3.6.1.2.1.133.1.2.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnPrefixAdvsIgnoredEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnPrefixAdvsIgnoredEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnPrefixAdvsIgnored", "1.3.6.1.2.1.133.1.2.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnMovedToFNEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnMovedToFNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnMovedToFN", "1.3.6.1.2.1.133.1.2.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6MnMovedToHNEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6MnMovedToHNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnMovedToHN", "1.3.6.1.2.1.133.1.2.2.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class Mip6MnRegistrationEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** Mobile Node Registration Group
Registration table of mobile node*/
                    public final Mip6MnBLTableEnt mip6MnBLTable;

                    /** Mobile Node Registration Group Counters*/
                    public final Mip6MnRegnCountersEnt mip6MnRegnCounters;

                    private Mip6MnRegistrationEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnRegistration", "1.3.6.1.2.1.133.1.2.3", false, false, false, false);
                        this.mip6MnBLTable = new Mip6MnBLTableEnt(mib, this);
                        this.mip6MnRegnCounters = new Mip6MnRegnCountersEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6MnBLTable,
                            this.mip6MnRegnCounters
                        };
                    }
                    public static final class Mip6MnBLTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6MnBLEntryEnt mip6MnBLEntry;

                        private Mip6MnBLTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnBLTable", "1.3.6.1.2.1.133.1.2.3.1", false, true, false, false);
                            this.mip6MnBLEntry = new Mip6MnBLEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6MnBLEntry
                            };
                        }
                        public static final class Mip6MnBLEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6MnBLNodeAddressTypeEnt mip6MnBLNodeAddressType;

                            public final Mip6MnBLNodeAddressEnt mip6MnBLNodeAddress;

                            public final Mip6MnBLCOATypeEnt mip6MnBLCOAType;

                            public final Mip6MnBLCOAEnt mip6MnBLCOA;

                            public final Mip6MnBLLifeTimeRequestedEnt mip6MnBLLifeTimeRequested;

                            public final Mip6MnBLLifeTimeGrantedEnt mip6MnBLLifeTimeGranted;

                            public final Mip6MnBLMaxSeqEnt mip6MnBLMaxSeq;

                            public final Mip6MnBLTimeSentEnt mip6MnBLTimeSent;

                            public final Mip6MnBLAcceptedEnt mip6MnBLAccepted;

                            public final Mip6MnBLAcceptedTimeEnt mip6MnBLAcceptedTime;

                            public final Mip6MnBLRetransmissionsEnt mip6MnBLRetransmissions;

                            public final Mip6MnBLDontSendBUFlagEnt mip6MnBLDontSendBUFlag;

                            private Mip6MnBLEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBLEntry", "1.3.6.1.2.1.133.1.2.3.1.1", false, false, false, true);
                                this.mip6MnBLNodeAddressType = new Mip6MnBLNodeAddressTypeEnt(mib, this);
                                this.mip6MnBLNodeAddress = new Mip6MnBLNodeAddressEnt(mib, this);
                                this.mip6MnBLCOAType = new Mip6MnBLCOATypeEnt(mib, this);
                                this.mip6MnBLCOA = new Mip6MnBLCOAEnt(mib, this);
                                this.mip6MnBLLifeTimeRequested = new Mip6MnBLLifeTimeRequestedEnt(mib, this);
                                this.mip6MnBLLifeTimeGranted = new Mip6MnBLLifeTimeGrantedEnt(mib, this);
                                this.mip6MnBLMaxSeq = new Mip6MnBLMaxSeqEnt(mib, this);
                                this.mip6MnBLTimeSent = new Mip6MnBLTimeSentEnt(mib, this);
                                this.mip6MnBLAccepted = new Mip6MnBLAcceptedEnt(mib, this);
                                this.mip6MnBLAcceptedTime = new Mip6MnBLAcceptedTimeEnt(mib, this);
                                this.mip6MnBLRetransmissions = new Mip6MnBLRetransmissionsEnt(mib, this);
                                this.mip6MnBLDontSendBUFlag = new Mip6MnBLDontSendBUFlagEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6MnBLNodeAddressType,
                                    this.mip6MnBLNodeAddress,
                                    this.mip6MnBLCOAType,
                                    this.mip6MnBLCOA,
                                    this.mip6MnBLLifeTimeRequested,
                                    this.mip6MnBLLifeTimeGranted,
                                    this.mip6MnBLMaxSeq,
                                    this.mip6MnBLTimeSent,
                                    this.mip6MnBLAccepted,
                                    this.mip6MnBLAcceptedTime,
                                    this.mip6MnBLRetransmissions,
                                    this.mip6MnBLDontSendBUFlag
                                };
                            }
                            public static final class Mip6MnBLNodeAddressTypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLNodeAddressTypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLNodeAddressType", "1.3.6.1.2.1.133.1.2.3.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLNodeAddressEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLNodeAddressEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLNodeAddress", "1.3.6.1.2.1.133.1.2.3.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLCOATypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLCOATypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLCOAType", "1.3.6.1.2.1.133.1.2.3.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLCOAEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLCOAEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLCOA", "1.3.6.1.2.1.133.1.2.3.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLLifeTimeRequestedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLLifeTimeRequestedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLLifeTimeRequested", "1.3.6.1.2.1.133.1.2.3.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLLifeTimeGrantedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLLifeTimeGrantedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLLifeTimeGranted", "1.3.6.1.2.1.133.1.2.3.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLMaxSeqEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLMaxSeqEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLMaxSeq", "1.3.6.1.2.1.133.1.2.3.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLTimeSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLTimeSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLTimeSent", "1.3.6.1.2.1.133.1.2.3.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLAcceptedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLAcceptedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLAccepted", "1.3.6.1.2.1.133.1.2.3.1.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLAcceptedTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLAcceptedTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLAcceptedTime", "1.3.6.1.2.1.133.1.2.3.1.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLRetransmissionsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLRetransmissionsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLRetransmissions", "1.3.6.1.2.1.133.1.2.3.1.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6MnBLDontSendBUFlagEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6MnBLDontSendBUFlagEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6MnBLDontSendBUFlag", "1.3.6.1.2.1.133.1.2.3.1.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Mip6MnRegnCountersEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6MnMobilityMessagesSentEnt mip6MnMobilityMessagesSent;

                        public final Mip6MnMobilityMessagesRecdEnt mip6MnMobilityMessagesRecd;

                        public final Mip6MnBUsToHAEnt mip6MnBUsToHA;

                        public final Mip6MnBUAcksFromHAEnt mip6MnBUAcksFromHA;

                        public final Mip6MnBUsToCNEnt mip6MnBUsToCN;

                        public final Mip6MnBUAcksFromCNEnt mip6MnBUAcksFromCN;

                        public final Mip6MnBindingErrorsFromCNEnt mip6MnBindingErrorsFromCN;

                        public final Mip6MnICMPErrorsRecdEnt mip6MnICMPErrorsRecd;

                        public final Mip6MnBRRequestsRecdEnt mip6MnBRRequestsRecd;

                        private Mip6MnRegnCountersEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6MnRegnCounters", "1.3.6.1.2.1.133.1.2.3.2", false, false, false, false);
                            this.mip6MnMobilityMessagesSent = new Mip6MnMobilityMessagesSentEnt(mib, this);
                            this.mip6MnMobilityMessagesRecd = new Mip6MnMobilityMessagesRecdEnt(mib, this);
                            this.mip6MnBUsToHA = new Mip6MnBUsToHAEnt(mib, this);
                            this.mip6MnBUAcksFromHA = new Mip6MnBUAcksFromHAEnt(mib, this);
                            this.mip6MnBUsToCN = new Mip6MnBUsToCNEnt(mib, this);
                            this.mip6MnBUAcksFromCN = new Mip6MnBUAcksFromCNEnt(mib, this);
                            this.mip6MnBindingErrorsFromCN = new Mip6MnBindingErrorsFromCNEnt(mib, this);
                            this.mip6MnICMPErrorsRecd = new Mip6MnICMPErrorsRecdEnt(mib, this);
                            this.mip6MnBRRequestsRecd = new Mip6MnBRRequestsRecdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6MnMobilityMessagesSent,
                                this.mip6MnMobilityMessagesRecd,
                                this.mip6MnBUsToHA,
                                this.mip6MnBUAcksFromHA,
                                this.mip6MnBUsToCN,
                                this.mip6MnBUAcksFromCN,
                                this.mip6MnBindingErrorsFromCN,
                                this.mip6MnICMPErrorsRecd,
                                this.mip6MnBRRequestsRecd
                            };
                        }
                        public static final class Mip6MnMobilityMessagesSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnMobilityMessagesSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnMobilityMessagesSent", "1.3.6.1.2.1.133.1.2.3.2.1", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnMobilityMessagesRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnMobilityMessagesRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnMobilityMessagesRecd", "1.3.6.1.2.1.133.1.2.3.2.2", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnBUsToHAEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnBUsToHAEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBUsToHA", "1.3.6.1.2.1.133.1.2.3.2.3", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnBUAcksFromHAEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnBUAcksFromHAEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBUAcksFromHA", "1.3.6.1.2.1.133.1.2.3.2.4", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnBUsToCNEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnBUsToCNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBUsToCN", "1.3.6.1.2.1.133.1.2.3.2.5", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnBUAcksFromCNEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnBUAcksFromCNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBUAcksFromCN", "1.3.6.1.2.1.133.1.2.3.2.6", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnBindingErrorsFromCNEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnBindingErrorsFromCNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBindingErrorsFromCN", "1.3.6.1.2.1.133.1.2.3.2.7", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnICMPErrorsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnICMPErrorsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnICMPErrorsRecd", "1.3.6.1.2.1.133.1.2.3.2.8", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6MnBRRequestsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6MnBRRequestsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6MnBRRequestsRecd", "1.3.6.1.2.1.133.1.2.3.2.9", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Mip6CnEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                public final Mip6CnSystemEnt mip6CnSystem;

                public final Mip6CnStatsEnt mip6CnStats;

                private Mip6CnEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6Cn", "1.3.6.1.2.1.133.1.3", false, false, false, false);
                    this.mip6CnSystem = new Mip6CnSystemEnt(mib, this);
                    this.mip6CnStats = new Mip6CnStatsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mip6CnSystem,
                        this.mip6CnStats
                    };
                }
                public static final class Mip6CnSystemEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CnSystemEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CnSystem", "1.3.6.1.2.1.133.1.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6CnStatsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** Registration Group counters used for Correspondent Node*/
                    public final Mip6CnGlobalStatsEnt mip6CnGlobalStats;

                    /** The Correspondent Node statistics by mobile node*/
                    public final Mip6CnCounterTableEnt mip6CnCounterTable;

                    private Mip6CnStatsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CnStats", "1.3.6.1.2.1.133.1.3.2", false, false, false, false);
                        this.mip6CnGlobalStats = new Mip6CnGlobalStatsEnt(mib, this);
                        this.mip6CnCounterTable = new Mip6CnCounterTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6CnGlobalStats,
                            this.mip6CnCounterTable
                        };
                    }
                    public static final class Mip6CnGlobalStatsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6CnHomeTestInitsRecdEnt mip6CnHomeTestInitsRecd;

                        public final Mip6CnHomeTestsSentEnt mip6CnHomeTestsSent;

                        public final Mip6CnCareOfTestInitsRecdEnt mip6CnCareOfTestInitsRecd;

                        public final Mip6CnCareOfTestsSentEnt mip6CnCareOfTestsSent;

                        public final Mip6CnBUsRecdEnt mip6CnBUsRecd;

                        public final Mip6CnBUAcksSentEnt mip6CnBUAcksSent;

                        public final Mip6CnBRsSentEnt mip6CnBRsSent;

                        public final Mip6CnBindingErrorsEnt mip6CnBindingErrors;

                        public final Mip6CnBUsAcceptedEnt mip6CnBUsAccepted;

                        public final Mip6CnBUsRejectedEnt mip6CnBUsRejected;

                        public final Mip6CnReasonUnspecifiedEnt mip6CnReasonUnspecified;

                        public final Mip6CnInsufficientResourceEnt mip6CnInsufficientResource;

                        public final Mip6CnHomeRegnNotSupportedEnt mip6CnHomeRegnNotSupported;

                        public final Mip6CnSeqNumberOutOfWindowEnt mip6CnSeqNumberOutOfWindow;

                        public final Mip6CnExpiredHomeNonceIndexEnt mip6CnExpiredHomeNonceIndex;

                        public final Mip6CnExpiredCareOfNonceIndexEnt mip6CnExpiredCareOfNonceIndex;

                        public final Mip6CnExpiredNonceEnt mip6CnExpiredNonce;

                        public final Mip6CnRegTypeChangeDisallowedEnt mip6CnRegTypeChangeDisallowed;

                        private Mip6CnGlobalStatsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6CnGlobalStats", "1.3.6.1.2.1.133.1.3.2.1", false, false, false, false);
                            this.mip6CnHomeTestInitsRecd = new Mip6CnHomeTestInitsRecdEnt(mib, this);
                            this.mip6CnHomeTestsSent = new Mip6CnHomeTestsSentEnt(mib, this);
                            this.mip6CnCareOfTestInitsRecd = new Mip6CnCareOfTestInitsRecdEnt(mib, this);
                            this.mip6CnCareOfTestsSent = new Mip6CnCareOfTestsSentEnt(mib, this);
                            this.mip6CnBUsRecd = new Mip6CnBUsRecdEnt(mib, this);
                            this.mip6CnBUAcksSent = new Mip6CnBUAcksSentEnt(mib, this);
                            this.mip6CnBRsSent = new Mip6CnBRsSentEnt(mib, this);
                            this.mip6CnBindingErrors = new Mip6CnBindingErrorsEnt(mib, this);
                            this.mip6CnBUsAccepted = new Mip6CnBUsAcceptedEnt(mib, this);
                            this.mip6CnBUsRejected = new Mip6CnBUsRejectedEnt(mib, this);
                            this.mip6CnReasonUnspecified = new Mip6CnReasonUnspecifiedEnt(mib, this);
                            this.mip6CnInsufficientResource = new Mip6CnInsufficientResourceEnt(mib, this);
                            this.mip6CnHomeRegnNotSupported = new Mip6CnHomeRegnNotSupportedEnt(mib, this);
                            this.mip6CnSeqNumberOutOfWindow = new Mip6CnSeqNumberOutOfWindowEnt(mib, this);
                            this.mip6CnExpiredHomeNonceIndex = new Mip6CnExpiredHomeNonceIndexEnt(mib, this);
                            this.mip6CnExpiredCareOfNonceIndex = new Mip6CnExpiredCareOfNonceIndexEnt(mib, this);
                            this.mip6CnExpiredNonce = new Mip6CnExpiredNonceEnt(mib, this);
                            this.mip6CnRegTypeChangeDisallowed = new Mip6CnRegTypeChangeDisallowedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6CnHomeTestInitsRecd,
                                this.mip6CnHomeTestsSent,
                                this.mip6CnCareOfTestInitsRecd,
                                this.mip6CnCareOfTestsSent,
                                this.mip6CnBUsRecd,
                                this.mip6CnBUAcksSent,
                                this.mip6CnBRsSent,
                                this.mip6CnBindingErrors,
                                this.mip6CnBUsAccepted,
                                this.mip6CnBUsRejected,
                                this.mip6CnReasonUnspecified,
                                this.mip6CnInsufficientResource,
                                this.mip6CnHomeRegnNotSupported,
                                this.mip6CnSeqNumberOutOfWindow,
                                this.mip6CnExpiredHomeNonceIndex,
                                this.mip6CnExpiredCareOfNonceIndex,
                                this.mip6CnExpiredNonce,
                                this.mip6CnRegTypeChangeDisallowed
                            };
                        }
                        public static final class Mip6CnHomeTestInitsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnHomeTestInitsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnHomeTestInitsRecd", "1.3.6.1.2.1.133.1.3.2.1.1", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnHomeTestsSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnHomeTestsSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnHomeTestsSent", "1.3.6.1.2.1.133.1.3.2.1.2", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnCareOfTestInitsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnCareOfTestInitsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnCareOfTestInitsRecd", "1.3.6.1.2.1.133.1.3.2.1.3", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnCareOfTestsSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnCareOfTestsSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnCareOfTestsSent", "1.3.6.1.2.1.133.1.3.2.1.4", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnBUsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnBUsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnBUsRecd", "1.3.6.1.2.1.133.1.3.2.1.5", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnBUAcksSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnBUAcksSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnBUAcksSent", "1.3.6.1.2.1.133.1.3.2.1.6", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnBRsSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnBRsSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnBRsSent", "1.3.6.1.2.1.133.1.3.2.1.7", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnBindingErrorsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnBindingErrorsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnBindingErrors", "1.3.6.1.2.1.133.1.3.2.1.8", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnBUsAcceptedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnBUsAcceptedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnBUsAccepted", "1.3.6.1.2.1.133.1.3.2.1.9", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnBUsRejectedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnBUsRejectedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnBUsRejected", "1.3.6.1.2.1.133.1.3.2.1.10", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnReasonUnspecifiedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnReasonUnspecifiedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnReasonUnspecified", "1.3.6.1.2.1.133.1.3.2.1.11", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnInsufficientResourceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnInsufficientResourceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnInsufficientResource", "1.3.6.1.2.1.133.1.3.2.1.12", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnHomeRegnNotSupportedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnHomeRegnNotSupportedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnHomeRegnNotSupported", "1.3.6.1.2.1.133.1.3.2.1.13", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnSeqNumberOutOfWindowEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnSeqNumberOutOfWindowEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnSeqNumberOutOfWindow", "1.3.6.1.2.1.133.1.3.2.1.14", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnExpiredHomeNonceIndexEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnExpiredHomeNonceIndexEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnExpiredHomeNonceIndex", "1.3.6.1.2.1.133.1.3.2.1.15", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnExpiredCareOfNonceIndexEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnExpiredCareOfNonceIndexEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnExpiredCareOfNonceIndex", "1.3.6.1.2.1.133.1.3.2.1.16", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnExpiredNonceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnExpiredNonceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnExpiredNonce", "1.3.6.1.2.1.133.1.3.2.1.17", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6CnRegTypeChangeDisallowedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6CnRegTypeChangeDisallowedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnRegTypeChangeDisallowed", "1.3.6.1.2.1.133.1.3.2.1.18", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class Mip6CnCounterTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6CnCounterEntryEnt mip6CnCounterEntry;

                        private Mip6CnCounterTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6CnCounterTable", "1.3.6.1.2.1.133.1.3.2.2", false, true, false, false);
                            this.mip6CnCounterEntry = new Mip6CnCounterEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6CnCounterEntry
                            };
                        }
                        public static final class Mip6CnCounterEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6CnBURequestsAcceptedEnt mip6CnBURequestsAccepted;

                            public final Mip6CnBURequestsRejectedEnt mip6CnBURequestsRejected;

                            public final Mip6CnBCEntryCreationTimeEnt mip6CnBCEntryCreationTime;

                            public final Mip6CnBUAcceptedTimeEnt mip6CnBUAcceptedTime;

                            public final Mip6CnBURejectionTimeEnt mip6CnBURejectionTime;

                            public final Mip6CnBURejectionCodeEnt mip6CnBURejectionCode;

                            public final Mip6CnCtrDiscontinuityTimeEnt mip6CnCtrDiscontinuityTime;

                            private Mip6CnCounterEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6CnCounterEntry", "1.3.6.1.2.1.133.1.3.2.2.1", false, false, false, true);
                                this.mip6CnBURequestsAccepted = new Mip6CnBURequestsAcceptedEnt(mib, this);
                                this.mip6CnBURequestsRejected = new Mip6CnBURequestsRejectedEnt(mib, this);
                                this.mip6CnBCEntryCreationTime = new Mip6CnBCEntryCreationTimeEnt(mib, this);
                                this.mip6CnBUAcceptedTime = new Mip6CnBUAcceptedTimeEnt(mib, this);
                                this.mip6CnBURejectionTime = new Mip6CnBURejectionTimeEnt(mib, this);
                                this.mip6CnBURejectionCode = new Mip6CnBURejectionCodeEnt(mib, this);
                                this.mip6CnCtrDiscontinuityTime = new Mip6CnCtrDiscontinuityTimeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6CnBURequestsAccepted,
                                    this.mip6CnBURequestsRejected,
                                    this.mip6CnBCEntryCreationTime,
                                    this.mip6CnBUAcceptedTime,
                                    this.mip6CnBURejectionTime,
                                    this.mip6CnBURejectionCode,
                                    this.mip6CnCtrDiscontinuityTime
                                };
                            }
                            public static final class Mip6CnBURequestsAcceptedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnBURequestsAcceptedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnBURequestsAccepted", "1.3.6.1.2.1.133.1.3.2.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6CnBURequestsRejectedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnBURequestsRejectedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnBURequestsRejected", "1.3.6.1.2.1.133.1.3.2.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6CnBCEntryCreationTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnBCEntryCreationTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnBCEntryCreationTime", "1.3.6.1.2.1.133.1.3.2.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6CnBUAcceptedTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnBUAcceptedTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnBUAcceptedTime", "1.3.6.1.2.1.133.1.3.2.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6CnBURejectionTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnBURejectionTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnBURejectionTime", "1.3.6.1.2.1.133.1.3.2.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6CnBURejectionCodeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnBURejectionCodeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnBURejectionCode", "1.3.6.1.2.1.133.1.3.2.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6CnCtrDiscontinuityTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6CnCtrDiscontinuityTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6CnCtrDiscontinuityTime", "1.3.6.1.2.1.133.1.3.2.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class Mip6HaEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                public final Mip6HaAdvertisementEnt mip6HaAdvertisement;

                public final Mip6HaStatsEnt mip6HaStats;

                private Mip6HaEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6Ha", "1.3.6.1.2.1.133.1.4", false, false, false, false);
                    this.mip6HaAdvertisement = new Mip6HaAdvertisementEnt(mib, this);
                    this.mip6HaStats = new Mip6HaStatsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mip6HaAdvertisement,
                        this.mip6HaStats
                    };
                }
                public static final class Mip6HaAdvertisementEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** Home agent group*/
                    public final Mip6HaAdvsRecdEnt mip6HaAdvsRecd;

                    public final Mip6HaAdvsSentEnt mip6HaAdvsSent;

                    public final Mip6HaConfTableEnt mip6HaConfTable;

                    /** Home Agent List Table*/
                    public final Mip6HaListTableEnt mip6HaListTable;

                    /** The list of global addresses of a home agent in thehome agent list*/
                    public final Mip6HaGlAddrTableEnt mip6HaGlAddrTable;

                    private Mip6HaAdvertisementEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaAdvertisement", "1.3.6.1.2.1.133.1.4.1", false, false, false, false);
                        this.mip6HaAdvsRecd = new Mip6HaAdvsRecdEnt(mib, this);
                        this.mip6HaAdvsSent = new Mip6HaAdvsSentEnt(mib, this);
                        this.mip6HaConfTable = new Mip6HaConfTableEnt(mib, this);
                        this.mip6HaListTable = new Mip6HaListTableEnt(mib, this);
                        this.mip6HaGlAddrTable = new Mip6HaGlAddrTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6HaAdvsRecd,
                            this.mip6HaAdvsSent,
                            this.mip6HaConfTable,
                            this.mip6HaListTable,
                            this.mip6HaGlAddrTable
                        };
                    }
                    public static final class Mip6HaAdvsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6HaAdvsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaAdvsRecd", "1.3.6.1.2.1.133.1.4.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6HaAdvsSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        private Mip6HaAdvsSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaAdvsSent", "1.3.6.1.2.1.133.1.4.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Mip6HaConfTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6HaConfEntryEnt mip6HaConfEntry;

                        private Mip6HaConfTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaConfTable", "1.3.6.1.2.1.133.1.4.1.3", false, true, false, false);
                            this.mip6HaConfEntry = new Mip6HaConfEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6HaConfEntry
                            };
                        }
                        public static final class Mip6HaConfEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6HaAdvPreferenceEnt mip6HaAdvPreference;

                            public final Mip6HaAdvLifetimeEnt mip6HaAdvLifetime;

                            public final Mip6HaPrefixAdvEnt mip6HaPrefixAdv;

                            public final Mip6HaPrefixSolicitationEnt mip6HaPrefixSolicitation;

                            public final Mip6HaMCastCtlMsgSupportEnt mip6HaMCastCtlMsgSupport;

                            private Mip6HaConfEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaConfEntry", "1.3.6.1.2.1.133.1.4.1.3.1", false, false, false, true);
                                this.mip6HaAdvPreference = new Mip6HaAdvPreferenceEnt(mib, this);
                                this.mip6HaAdvLifetime = new Mip6HaAdvLifetimeEnt(mib, this);
                                this.mip6HaPrefixAdv = new Mip6HaPrefixAdvEnt(mib, this);
                                this.mip6HaPrefixSolicitation = new Mip6HaPrefixSolicitationEnt(mib, this);
                                this.mip6HaMCastCtlMsgSupport = new Mip6HaMCastCtlMsgSupportEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6HaAdvPreference,
                                    this.mip6HaAdvLifetime,
                                    this.mip6HaPrefixAdv,
                                    this.mip6HaPrefixSolicitation,
                                    this.mip6HaMCastCtlMsgSupport
                                };
                            }
                            public static final class Mip6HaAdvPreferenceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaAdvPreferenceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaAdvPreference", "1.3.6.1.2.1.133.1.4.1.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaAdvLifetimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaAdvLifetimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaAdvLifetime", "1.3.6.1.2.1.133.1.4.1.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaPrefixAdvEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaPrefixAdvEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaPrefixAdv", "1.3.6.1.2.1.133.1.4.1.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaPrefixSolicitationEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaPrefixSolicitationEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaPrefixSolicitation", "1.3.6.1.2.1.133.1.4.1.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaMCastCtlMsgSupportEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaMCastCtlMsgSupportEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaMCastCtlMsgSupport", "1.3.6.1.2.1.133.1.4.1.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Mip6HaListTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6HaListEntryEnt mip6HaListEntry;

                        private Mip6HaListTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaListTable", "1.3.6.1.2.1.133.1.4.1.4", false, true, false, false);
                            this.mip6HaListEntry = new Mip6HaListEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6HaListEntry
                            };
                        }
                        public static final class Mip6HaListEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6HaLinkLocalAddressTypeEnt mip6HaLinkLocalAddressType;

                            public final Mip6HaLinkLocalAddressEnt mip6HaLinkLocalAddress;

                            public final Mip6HaPreferenceEnt mip6HaPreference;

                            public final Mip6HaRecvLifeTimeEnt mip6HaRecvLifeTime;

                            public final Mip6HaRecvTimeStampEnt mip6HaRecvTimeStamp;

                            private Mip6HaListEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaListEntry", "1.3.6.1.2.1.133.1.4.1.4.1", false, false, false, true);
                                this.mip6HaLinkLocalAddressType = new Mip6HaLinkLocalAddressTypeEnt(mib, this);
                                this.mip6HaLinkLocalAddress = new Mip6HaLinkLocalAddressEnt(mib, this);
                                this.mip6HaPreference = new Mip6HaPreferenceEnt(mib, this);
                                this.mip6HaRecvLifeTime = new Mip6HaRecvLifeTimeEnt(mib, this);
                                this.mip6HaRecvTimeStamp = new Mip6HaRecvTimeStampEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6HaLinkLocalAddressType,
                                    this.mip6HaLinkLocalAddress,
                                    this.mip6HaPreference,
                                    this.mip6HaRecvLifeTime,
                                    this.mip6HaRecvTimeStamp
                                };
                            }
                            public static final class Mip6HaLinkLocalAddressTypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaLinkLocalAddressTypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaLinkLocalAddressType", "1.3.6.1.2.1.133.1.4.1.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaLinkLocalAddressEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaLinkLocalAddressEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaLinkLocalAddress", "1.3.6.1.2.1.133.1.4.1.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaPreferenceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaPreferenceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaPreference", "1.3.6.1.2.1.133.1.4.1.4.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaRecvLifeTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaRecvLifeTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaRecvLifeTime", "1.3.6.1.2.1.133.1.4.1.4.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaRecvTimeStampEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaRecvTimeStampEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaRecvTimeStamp", "1.3.6.1.2.1.133.1.4.1.4.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Mip6HaGlAddrTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6HaGlAddrEntryEnt mip6HaGlAddrEntry;

                        private Mip6HaGlAddrTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaGlAddrTable", "1.3.6.1.2.1.133.1.4.1.5", false, true, false, false);
                            this.mip6HaGlAddrEntry = new Mip6HaGlAddrEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6HaGlAddrEntry
                            };
                        }
                        public static final class Mip6HaGlAddrEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6HaGaAddrSeqNoEnt mip6HaGaAddrSeqNo;

                            public final Mip6HaGaGlobalAddressTypeEnt mip6HaGaGlobalAddressType;

                            public final Mip6HaGaGlobalAddressEnt mip6HaGaGlobalAddress;

                            private Mip6HaGlAddrEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaGlAddrEntry", "1.3.6.1.2.1.133.1.4.1.5.1", false, false, false, true);
                                this.mip6HaGaAddrSeqNo = new Mip6HaGaAddrSeqNoEnt(mib, this);
                                this.mip6HaGaGlobalAddressType = new Mip6HaGaGlobalAddressTypeEnt(mib, this);
                                this.mip6HaGaGlobalAddress = new Mip6HaGaGlobalAddressEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6HaGaAddrSeqNo,
                                    this.mip6HaGaGlobalAddressType,
                                    this.mip6HaGaGlobalAddress
                                };
                            }
                            public static final class Mip6HaGaAddrSeqNoEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaGaAddrSeqNoEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaGaAddrSeqNo", "1.3.6.1.2.1.133.1.4.1.5.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaGaGlobalAddressTypeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaGaGlobalAddressTypeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaGaGlobalAddressType", "1.3.6.1.2.1.133.1.4.1.5.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaGaGlobalAddressEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaGaGlobalAddressEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaGaGlobalAddress", "1.3.6.1.2.1.133.1.4.1.5.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class Mip6HaStatsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    /** Registration Group counters HA*/
                    public final Mip6HaGlobalStatsEnt mip6HaGlobalStats;

                    /** Home agent registration Counters per node*/
                    public final Mip6HaCounterTableEnt mip6HaCounterTable;

                    private Mip6HaStatsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaStats", "1.3.6.1.2.1.133.1.4.2", false, false, false, false);
                        this.mip6HaGlobalStats = new Mip6HaGlobalStatsEnt(mib, this);
                        this.mip6HaCounterTable = new Mip6HaCounterTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mip6HaGlobalStats,
                            this.mip6HaCounterTable
                        };
                    }
                    public static final class Mip6HaGlobalStatsEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6HaHomeTestInitsRecdEnt mip6HaHomeTestInitsRecd;

                        public final Mip6HaHomeTestsSentEnt mip6HaHomeTestsSent;

                        public final Mip6HaBUsRecdEnt mip6HaBUsRecd;

                        public final Mip6HaBUAcksSentEnt mip6HaBUAcksSent;

                        public final Mip6HaBRAdviceSentEnt mip6HaBRAdviceSent;

                        public final Mip6HaBUsAcceptedEnt mip6HaBUsAccepted;

                        public final Mip6HaPrefDiscoverReqdEnt mip6HaPrefDiscoverReqd;

                        public final Mip6HaReasonUnspecifiedEnt mip6HaReasonUnspecified;

                        public final Mip6HaAdmProhibitedEnt mip6HaAdmProhibited;

                        public final Mip6HaInsufficientResourceEnt mip6HaInsufficientResource;

                        public final Mip6HaHomeRegnNotSupportedEnt mip6HaHomeRegnNotSupported;

                        public final Mip6HaNotHomeSubnetEnt mip6HaNotHomeSubnet;

                        public final Mip6HaNotHomeAgentForThisMNEnt mip6HaNotHomeAgentForThisMN;

                        public final Mip6HaDupAddrDetectionFailedEnt mip6HaDupAddrDetectionFailed;

                        public final Mip6HaSeqNumberOutOfWindowEnt mip6HaSeqNumberOutOfWindow;

                        public final Mip6HaExpiredHomeNonceIndexEnt mip6HaExpiredHomeNonceIndex;

                        public final Mip6HaRegTypeChangeDisallowedEnt mip6HaRegTypeChangeDisallowed;

                        private Mip6HaGlobalStatsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaGlobalStats", "1.3.6.1.2.1.133.1.4.2.1", false, false, false, false);
                            this.mip6HaHomeTestInitsRecd = new Mip6HaHomeTestInitsRecdEnt(mib, this);
                            this.mip6HaHomeTestsSent = new Mip6HaHomeTestsSentEnt(mib, this);
                            this.mip6HaBUsRecd = new Mip6HaBUsRecdEnt(mib, this);
                            this.mip6HaBUAcksSent = new Mip6HaBUAcksSentEnt(mib, this);
                            this.mip6HaBRAdviceSent = new Mip6HaBRAdviceSentEnt(mib, this);
                            this.mip6HaBUsAccepted = new Mip6HaBUsAcceptedEnt(mib, this);
                            this.mip6HaPrefDiscoverReqd = new Mip6HaPrefDiscoverReqdEnt(mib, this);
                            this.mip6HaReasonUnspecified = new Mip6HaReasonUnspecifiedEnt(mib, this);
                            this.mip6HaAdmProhibited = new Mip6HaAdmProhibitedEnt(mib, this);
                            this.mip6HaInsufficientResource = new Mip6HaInsufficientResourceEnt(mib, this);
                            this.mip6HaHomeRegnNotSupported = new Mip6HaHomeRegnNotSupportedEnt(mib, this);
                            this.mip6HaNotHomeSubnet = new Mip6HaNotHomeSubnetEnt(mib, this);
                            this.mip6HaNotHomeAgentForThisMN = new Mip6HaNotHomeAgentForThisMNEnt(mib, this);
                            this.mip6HaDupAddrDetectionFailed = new Mip6HaDupAddrDetectionFailedEnt(mib, this);
                            this.mip6HaSeqNumberOutOfWindow = new Mip6HaSeqNumberOutOfWindowEnt(mib, this);
                            this.mip6HaExpiredHomeNonceIndex = new Mip6HaExpiredHomeNonceIndexEnt(mib, this);
                            this.mip6HaRegTypeChangeDisallowed = new Mip6HaRegTypeChangeDisallowedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6HaHomeTestInitsRecd,
                                this.mip6HaHomeTestsSent,
                                this.mip6HaBUsRecd,
                                this.mip6HaBUAcksSent,
                                this.mip6HaBRAdviceSent,
                                this.mip6HaBUsAccepted,
                                this.mip6HaPrefDiscoverReqd,
                                this.mip6HaReasonUnspecified,
                                this.mip6HaAdmProhibited,
                                this.mip6HaInsufficientResource,
                                this.mip6HaHomeRegnNotSupported,
                                this.mip6HaNotHomeSubnet,
                                this.mip6HaNotHomeAgentForThisMN,
                                this.mip6HaDupAddrDetectionFailed,
                                this.mip6HaSeqNumberOutOfWindow,
                                this.mip6HaExpiredHomeNonceIndex,
                                this.mip6HaRegTypeChangeDisallowed
                            };
                        }
                        public static final class Mip6HaHomeTestInitsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaHomeTestInitsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaHomeTestInitsRecd", "1.3.6.1.2.1.133.1.4.2.1.1", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaHomeTestsSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaHomeTestsSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaHomeTestsSent", "1.3.6.1.2.1.133.1.4.2.1.2", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaBUsRecdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaBUsRecdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaBUsRecd", "1.3.6.1.2.1.133.1.4.2.1.3", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaBUAcksSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaBUAcksSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaBUAcksSent", "1.3.6.1.2.1.133.1.4.2.1.4", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaBRAdviceSentEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaBRAdviceSentEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaBRAdviceSent", "1.3.6.1.2.1.133.1.4.2.1.5", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaBUsAcceptedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaBUsAcceptedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaBUsAccepted", "1.3.6.1.2.1.133.1.4.2.1.6", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaPrefDiscoverReqdEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaPrefDiscoverReqdEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaPrefDiscoverReqd", "1.3.6.1.2.1.133.1.4.2.1.7", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaReasonUnspecifiedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaReasonUnspecifiedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaReasonUnspecified", "1.3.6.1.2.1.133.1.4.2.1.8", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaAdmProhibitedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaAdmProhibitedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaAdmProhibited", "1.3.6.1.2.1.133.1.4.2.1.9", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaInsufficientResourceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaInsufficientResourceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaInsufficientResource", "1.3.6.1.2.1.133.1.4.2.1.10", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaHomeRegnNotSupportedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaHomeRegnNotSupportedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaHomeRegnNotSupported", "1.3.6.1.2.1.133.1.4.2.1.11", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaNotHomeSubnetEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaNotHomeSubnetEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaNotHomeSubnet", "1.3.6.1.2.1.133.1.4.2.1.12", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaNotHomeAgentForThisMNEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaNotHomeAgentForThisMNEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaNotHomeAgentForThisMN", "1.3.6.1.2.1.133.1.4.2.1.13", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaDupAddrDetectionFailedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaDupAddrDetectionFailedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaDupAddrDetectionFailed", "1.3.6.1.2.1.133.1.4.2.1.14", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaSeqNumberOutOfWindowEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaSeqNumberOutOfWindowEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaSeqNumberOutOfWindow", "1.3.6.1.2.1.133.1.4.2.1.15", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaExpiredHomeNonceIndexEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaExpiredHomeNonceIndexEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaExpiredHomeNonceIndex", "1.3.6.1.2.1.133.1.4.2.1.16", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Mip6HaRegTypeChangeDisallowedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            private Mip6HaRegTypeChangeDisallowedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaRegTypeChangeDisallowed", "1.3.6.1.2.1.133.1.4.2.1.17", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class Mip6HaCounterTableEnt extends MIBEntry<MOBILEIPV6MIBDef>
                    {
                        public final Mip6HaCounterEntryEnt mip6HaCounterEntry;

                        private Mip6HaCounterTableEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                        {
                            super(mib, parent, "mip6HaCounterTable", "1.3.6.1.2.1.133.1.4.2.2", false, true, false, false);
                            this.mip6HaCounterEntry = new Mip6HaCounterEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mip6HaCounterEntry
                            };
                        }
                        public static final class Mip6HaCounterEntryEnt extends MIBEntry<MOBILEIPV6MIBDef>
                        {
                            public final Mip6HaBURequestsAcceptedEnt mip6HaBURequestsAccepted;

                            public final Mip6HaBURequestsDeniedEnt mip6HaBURequestsDenied;

                            public final Mip6HaBCEntryCreationTimeEnt mip6HaBCEntryCreationTime;

                            public final Mip6HaBUAcceptedTimeEnt mip6HaBUAcceptedTime;

                            public final Mip6HaBURejectionTimeEnt mip6HaBURejectionTime;

                            public final Mip6HaRecentBURejectionCodeEnt mip6HaRecentBURejectionCode;

                            public final Mip6HaCtrDiscontinuityTimeEnt mip6HaCtrDiscontinuityTime;

                            private Mip6HaCounterEntryEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                            {
                                super(mib, parent, "mip6HaCounterEntry", "1.3.6.1.2.1.133.1.4.2.2.1", false, false, false, true);
                                this.mip6HaBURequestsAccepted = new Mip6HaBURequestsAcceptedEnt(mib, this);
                                this.mip6HaBURequestsDenied = new Mip6HaBURequestsDeniedEnt(mib, this);
                                this.mip6HaBCEntryCreationTime = new Mip6HaBCEntryCreationTimeEnt(mib, this);
                                this.mip6HaBUAcceptedTime = new Mip6HaBUAcceptedTimeEnt(mib, this);
                                this.mip6HaBURejectionTime = new Mip6HaBURejectionTimeEnt(mib, this);
                                this.mip6HaRecentBURejectionCode = new Mip6HaRecentBURejectionCodeEnt(mib, this);
                                this.mip6HaCtrDiscontinuityTime = new Mip6HaCtrDiscontinuityTimeEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.mip6HaBURequestsAccepted,
                                    this.mip6HaBURequestsDenied,
                                    this.mip6HaBCEntryCreationTime,
                                    this.mip6HaBUAcceptedTime,
                                    this.mip6HaBURejectionTime,
                                    this.mip6HaRecentBURejectionCode,
                                    this.mip6HaCtrDiscontinuityTime
                                };
                            }
                            public static final class Mip6HaBURequestsAcceptedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaBURequestsAcceptedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaBURequestsAccepted", "1.3.6.1.2.1.133.1.4.2.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaBURequestsDeniedEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaBURequestsDeniedEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaBURequestsDenied", "1.3.6.1.2.1.133.1.4.2.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaBCEntryCreationTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaBCEntryCreationTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaBCEntryCreationTime", "1.3.6.1.2.1.133.1.4.2.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaBUAcceptedTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaBUAcceptedTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaBUAcceptedTime", "1.3.6.1.2.1.133.1.4.2.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaBURejectionTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaBURejectionTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaBURejectionTime", "1.3.6.1.2.1.133.1.4.2.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaRecentBURejectionCodeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaRecentBURejectionCodeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaRecentBURejectionCode", "1.3.6.1.2.1.133.1.4.2.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Mip6HaCtrDiscontinuityTimeEnt extends MIBEntry<MOBILEIPV6MIBDef>
                            {
                                private Mip6HaCtrDiscontinuityTimeEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                                {
                                    super(mib, parent, "mip6HaCtrDiscontinuityTime", "1.3.6.1.2.1.133.1.4.2.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

        }

        public static final class Mip6ConformanceEnt extends MIBEntry<MOBILEIPV6MIBDef>
        {
            /** Conformance information*/
            public final Mip6GroupsEnt mip6Groups;

            public final Mip6CompliancesEnt mip6Compliances;

            private Mip6ConformanceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
            {
                super(mib, parent, "mip6Conformance", "1.3.6.1.2.1.133.2", false, false, false, false);
                this.mip6Groups = new Mip6GroupsEnt(mib, this);
                this.mip6Compliances = new Mip6CompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mip6Groups,
                    this.mip6Compliances
                };
            }
            public static final class Mip6GroupsEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                /** Units of conformance*/
                public final Mip6SystemGroupEnt mip6SystemGroup;

                public final Mip6BindingCacheGroupEnt mip6BindingCacheGroup;

                public final Mip6BindingHstGroupEnt mip6BindingHstGroup;

                public final Mip6TotalTrafficGroupEnt mip6TotalTrafficGroup;

                public final Mip6NodeTrafficGroupEnt mip6NodeTrafficGroup;

                public final Mip6MnSystemGroupEnt mip6MnSystemGroup;

                public final Mip6MnConfGroupEnt mip6MnConfGroup;

                /** Binding Update List*/
                public final Mip6MnRegistrationGroupEnt mip6MnRegistrationGroup;

                public final Mip6CnStatsGroupEnt mip6CnStatsGroup;

                public final Mip6HaSystemGroupEnt mip6HaSystemGroup;

                public final Mip6HaListGroupEnt mip6HaListGroup;

                public final Mip6HaStatsGroupEnt mip6HaStatsGroup;

                public final Mip6CnGlobalStatsGroupEnt mip6CnGlobalStatsGroup;

                public final Mip6HaGlobalStatsGroupEnt mip6HaGlobalStatsGroup;

                public final Mip6BindingCacheCtlGroupEnt mip6BindingCacheCtlGroup;

                public final Mip6NotificationGroupEnt mip6NotificationGroup;

                private Mip6GroupsEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6Groups", "1.3.6.1.2.1.133.2.1", false, false, false, false);
                    this.mip6SystemGroup = new Mip6SystemGroupEnt(mib, this);
                    this.mip6BindingCacheGroup = new Mip6BindingCacheGroupEnt(mib, this);
                    this.mip6BindingHstGroup = new Mip6BindingHstGroupEnt(mib, this);
                    this.mip6TotalTrafficGroup = new Mip6TotalTrafficGroupEnt(mib, this);
                    this.mip6NodeTrafficGroup = new Mip6NodeTrafficGroupEnt(mib, this);
                    this.mip6MnSystemGroup = new Mip6MnSystemGroupEnt(mib, this);
                    this.mip6MnConfGroup = new Mip6MnConfGroupEnt(mib, this);
                    this.mip6MnRegistrationGroup = new Mip6MnRegistrationGroupEnt(mib, this);
                    this.mip6CnStatsGroup = new Mip6CnStatsGroupEnt(mib, this);
                    this.mip6HaSystemGroup = new Mip6HaSystemGroupEnt(mib, this);
                    this.mip6HaListGroup = new Mip6HaListGroupEnt(mib, this);
                    this.mip6HaStatsGroup = new Mip6HaStatsGroupEnt(mib, this);
                    this.mip6CnGlobalStatsGroup = new Mip6CnGlobalStatsGroupEnt(mib, this);
                    this.mip6HaGlobalStatsGroup = new Mip6HaGlobalStatsGroupEnt(mib, this);
                    this.mip6BindingCacheCtlGroup = new Mip6BindingCacheCtlGroupEnt(mib, this);
                    this.mip6NotificationGroup = new Mip6NotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mip6SystemGroup,
                        this.mip6BindingCacheGroup,
                        this.mip6BindingHstGroup,
                        this.mip6TotalTrafficGroup,
                        this.mip6NodeTrafficGroup,
                        this.mip6MnSystemGroup,
                        this.mip6MnConfGroup,
                        this.mip6MnRegistrationGroup,
                        this.mip6CnStatsGroup,
                        this.mip6HaSystemGroup,
                        this.mip6HaListGroup,
                        this.mip6HaStatsGroup,
                        this.mip6CnGlobalStatsGroup,
                        this.mip6HaGlobalStatsGroup,
                        this.mip6BindingCacheCtlGroup,
                        this.mip6NotificationGroup
                    };
                }
                public static final class Mip6SystemGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6SystemGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6SystemGroup", "1.3.6.1.2.1.133.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6BindingCacheGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6BindingCacheGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6BindingCacheGroup", "1.3.6.1.2.1.133.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6BindingHstGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6BindingHstGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6BindingHstGroup", "1.3.6.1.2.1.133.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6TotalTrafficGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6TotalTrafficGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6TotalTrafficGroup", "1.3.6.1.2.1.133.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6NodeTrafficGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6NodeTrafficGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6NodeTrafficGroup", "1.3.6.1.2.1.133.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6MnSystemGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6MnSystemGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnSystemGroup", "1.3.6.1.2.1.133.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6MnConfGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6MnConfGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnConfGroup", "1.3.6.1.2.1.133.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6MnRegistrationGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6MnRegistrationGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnRegistrationGroup", "1.3.6.1.2.1.133.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6CnStatsGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CnStatsGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CnStatsGroup", "1.3.6.1.2.1.133.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaSystemGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaSystemGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaSystemGroup", "1.3.6.1.2.1.133.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaListGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaListGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaListGroup", "1.3.6.1.2.1.133.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaStatsGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaStatsGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaStatsGroup", "1.3.6.1.2.1.133.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6CnGlobalStatsGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CnGlobalStatsGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CnGlobalStatsGroup", "1.3.6.1.2.1.133.2.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaGlobalStatsGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaGlobalStatsGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaGlobalStatsGroup", "1.3.6.1.2.1.133.2.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6BindingCacheCtlGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6BindingCacheCtlGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6BindingCacheCtlGroup", "1.3.6.1.2.1.133.2.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6NotificationGroupEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6NotificationGroupEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6NotificationGroup", "1.3.6.1.2.1.133.2.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Mip6CompliancesEnt extends MIBEntry<MOBILEIPV6MIBDef>
            {
                /** Compliance statements*/
                public final Mip6CoreComplianceEnt mip6CoreCompliance;

                public final Mip6Compliance2Ent mip6Compliance2;

                public final Mip6Compliance3Ent mip6Compliance3;

                public final Mip6CoreReadOnlyComplianceEnt mip6CoreReadOnlyCompliance;

                public final Mip6ReadOnlyCompliance2Ent mip6ReadOnlyCompliance2;

                public final Mip6ReadOnlyCompliance3Ent mip6ReadOnlyCompliance3;

                public final Mip6MnCoreComplianceEnt mip6MnCoreCompliance;

                public final Mip6MnCompliance2Ent mip6MnCompliance2;

                public final Mip6CnCoreComplianceEnt mip6CnCoreCompliance;

                public final Mip6CnComplianceEnt mip6CnCompliance;

                public final Mip6HaCoreComplianceEnt mip6HaCoreCompliance;

                public final Mip6HaCompliance2Ent mip6HaCompliance2;

                public final Mip6HaCompliance3Ent mip6HaCompliance3;

                public final Mip6HaCoreReadOnlyComplianceEnt mip6HaCoreReadOnlyCompliance;

                public final Mip6HaReadOnlyCompliance2Ent mip6HaReadOnlyCompliance2;

                public final Mip6HaReadOnlyCompliance3Ent mip6HaReadOnlyCompliance3;

                public final Mip6NotificationComplianceEnt mip6NotificationCompliance;

                private Mip6CompliancesEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                {
                    super(mib, parent, "mip6Compliances", "1.3.6.1.2.1.133.2.2", false, false, false, false);
                    this.mip6CoreCompliance = new Mip6CoreComplianceEnt(mib, this);
                    this.mip6Compliance2 = new Mip6Compliance2Ent(mib, this);
                    this.mip6Compliance3 = new Mip6Compliance3Ent(mib, this);
                    this.mip6CoreReadOnlyCompliance = new Mip6CoreReadOnlyComplianceEnt(mib, this);
                    this.mip6ReadOnlyCompliance2 = new Mip6ReadOnlyCompliance2Ent(mib, this);
                    this.mip6ReadOnlyCompliance3 = new Mip6ReadOnlyCompliance3Ent(mib, this);
                    this.mip6MnCoreCompliance = new Mip6MnCoreComplianceEnt(mib, this);
                    this.mip6MnCompliance2 = new Mip6MnCompliance2Ent(mib, this);
                    this.mip6CnCoreCompliance = new Mip6CnCoreComplianceEnt(mib, this);
                    this.mip6CnCompliance = new Mip6CnComplianceEnt(mib, this);
                    this.mip6HaCoreCompliance = new Mip6HaCoreComplianceEnt(mib, this);
                    this.mip6HaCompliance2 = new Mip6HaCompliance2Ent(mib, this);
                    this.mip6HaCompliance3 = new Mip6HaCompliance3Ent(mib, this);
                    this.mip6HaCoreReadOnlyCompliance = new Mip6HaCoreReadOnlyComplianceEnt(mib, this);
                    this.mip6HaReadOnlyCompliance2 = new Mip6HaReadOnlyCompliance2Ent(mib, this);
                    this.mip6HaReadOnlyCompliance3 = new Mip6HaReadOnlyCompliance3Ent(mib, this);
                    this.mip6NotificationCompliance = new Mip6NotificationComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mip6CoreCompliance,
                        this.mip6Compliance2,
                        this.mip6Compliance3,
                        this.mip6CoreReadOnlyCompliance,
                        this.mip6ReadOnlyCompliance2,
                        this.mip6ReadOnlyCompliance3,
                        this.mip6MnCoreCompliance,
                        this.mip6MnCompliance2,
                        this.mip6CnCoreCompliance,
                        this.mip6CnCompliance,
                        this.mip6HaCoreCompliance,
                        this.mip6HaCompliance2,
                        this.mip6HaCompliance3,
                        this.mip6HaCoreReadOnlyCompliance,
                        this.mip6HaReadOnlyCompliance2,
                        this.mip6HaReadOnlyCompliance3,
                        this.mip6NotificationCompliance
                    };
                }
                public static final class Mip6CoreComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CoreComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CoreCompliance", "1.3.6.1.2.1.133.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6Compliance2Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6Compliance2Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6Compliance2", "1.3.6.1.2.1.133.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6Compliance3Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6Compliance3Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6Compliance3", "1.3.6.1.2.1.133.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6CoreReadOnlyComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CoreReadOnlyComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CoreReadOnlyCompliance", "1.3.6.1.2.1.133.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6ReadOnlyCompliance2Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6ReadOnlyCompliance2Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6ReadOnlyCompliance2", "1.3.6.1.2.1.133.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6ReadOnlyCompliance3Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6ReadOnlyCompliance3Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6ReadOnlyCompliance3", "1.3.6.1.2.1.133.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6MnCoreComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6MnCoreComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnCoreCompliance", "1.3.6.1.2.1.133.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6MnCompliance2Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6MnCompliance2Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6MnCompliance2", "1.3.6.1.2.1.133.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6CnCoreComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CnCoreComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CnCoreCompliance", "1.3.6.1.2.1.133.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6CnComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6CnComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6CnCompliance", "1.3.6.1.2.1.133.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaCoreComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaCoreComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaCoreCompliance", "1.3.6.1.2.1.133.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaCompliance2Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaCompliance2Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaCompliance2", "1.3.6.1.2.1.133.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaCompliance3Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaCompliance3Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaCompliance3", "1.3.6.1.2.1.133.2.2.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaCoreReadOnlyComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaCoreReadOnlyComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaCoreReadOnlyCompliance", "1.3.6.1.2.1.133.2.2.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaReadOnlyCompliance2Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaReadOnlyCompliance2Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaReadOnlyCompliance2", "1.3.6.1.2.1.133.2.2.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6HaReadOnlyCompliance3Ent extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6HaReadOnlyCompliance3Ent(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6HaReadOnlyCompliance3", "1.3.6.1.2.1.133.2.2.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Mip6NotificationComplianceEnt extends MIBEntry<MOBILEIPV6MIBDef>
                {
                    private Mip6NotificationComplianceEnt(MOBILEIPV6MIBDef mib, MIBEntry<MOBILEIPV6MIBDef> parent)
                    {
                        super(mib, parent, "mip6NotificationCompliance", "1.3.6.1.2.1.133.2.2.17", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
