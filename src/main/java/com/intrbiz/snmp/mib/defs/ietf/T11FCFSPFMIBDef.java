package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**For management of FSPF, the Fibre Channel routing protocol.

[RFC2578]
[RFC2580]
[RFC2579]
[RFC2863]
[FC-MGMT]
[RFC4439]*/
public final class T11FCFSPFMIBDef extends MIB
{
    public static final T11FCFSPFMIBDef T11FCFSPFMIB = new T11FCFSPFMIBDef();

    static { MIBs.getInstance().registerMIB(T11FCFSPFMIBDef.T11FCFSPFMIB); }

    /** [RFC4439]*/
    public final T11FcFspfMIBEnt t11FcFspfMIB;

    private T11FCFSPFMIBDef()
    {
        super("T11-FC-FSPF-MIB");
        this.t11FcFspfMIB = new T11FcFspfMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcFspfMIB
        };
    }

    public static final class T11FcFspfMIBEnt extends MIBEntry<T11FCFSPFMIBDef>
    {
        public final T11FspfNotificationsEnt t11FspfNotifications;

        public final T11FspfObjectsEnt t11FspfObjects;

        public final T11FspfConformanceEnt t11FspfConformance;

        private T11FcFspfMIBEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
        {
            super(mib, parent, "t11FcFspfMIB", "1.3.6.1.2.1.143", false, false, false, false);
            this.t11FspfNotifications = new T11FspfNotificationsEnt(mib, this);
            this.t11FspfObjects = new T11FspfObjectsEnt(mib, this);
            this.t11FspfConformance = new T11FspfConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11FspfNotifications,
                this.t11FspfObjects,
                this.t11FspfConformance
            };
        }
        public static final class T11FspfNotificationsEnt extends MIBEntry<T11FCFSPFMIBDef>
        {
            /** Notifications*/
            public final T11FspfNbrStateChangNotifyEnt t11FspfNbrStateChangNotify;

            private T11FspfNotificationsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
            {
                super(mib, parent, "t11FspfNotifications", "1.3.6.1.2.1.143.0", false, false, false, false);
                this.t11FspfNbrStateChangNotify = new T11FspfNbrStateChangNotifyEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FspfNbrStateChangNotify
                };
            }
            public static final class T11FspfNbrStateChangNotifyEnt extends MIBEntry<T11FCFSPFMIBDef>
            {
                private T11FspfNbrStateChangNotifyEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                {
                    super(mib, parent, "t11FspfNbrStateChangNotify", "1.3.6.1.2.1.143.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class T11FspfObjectsEnt extends MIBEntry<T11FCFSPFMIBDef>
        {
            public final T11FspfConfigurationEnt t11FspfConfiguration;

            public final T11FspfDatabaseEnt t11FspfDatabase;

            private T11FspfObjectsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
            {
                super(mib, parent, "t11FspfObjects", "1.3.6.1.2.1.143.1", false, false, false, false);
                this.t11FspfConfiguration = new T11FspfConfigurationEnt(mib, this);
                this.t11FspfDatabase = new T11FspfDatabaseEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FspfConfiguration,
                    this.t11FspfDatabase
                };
            }
            public static final class T11FspfConfigurationEnt extends MIBEntry<T11FCFSPFMIBDef>
            {
                /** t11FspfTable*/
                public final T11FspfTableEnt t11FspfTable;

                /** t11FspfIfTable*/
                public final T11FspfIfTableEnt t11FspfIfTable;

                /** Notification-related object*/
                public final T11FspfIfPrevNbrStateEnt t11FspfIfPrevNbrState;

                private T11FspfConfigurationEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                {
                    super(mib, parent, "t11FspfConfiguration", "1.3.6.1.2.1.143.1.1", false, false, false, false);
                    this.t11FspfTable = new T11FspfTableEnt(mib, this);
                    this.t11FspfIfTable = new T11FspfIfTableEnt(mib, this);
                    this.t11FspfIfPrevNbrState = new T11FspfIfPrevNbrStateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FspfTable,
                        this.t11FspfIfTable,
                        this.t11FspfIfPrevNbrState
                    };
                }
                public static final class T11FspfTableEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    public final T11FspfEntryEnt t11FspfEntry;

                    private T11FspfTableEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfTable", "1.3.6.1.2.1.143.1.1.1", false, true, false, false);
                        this.t11FspfEntry = new T11FspfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FspfEntry
                        };
                    }
                    public static final class T11FspfEntryEnt extends MIBEntry<T11FCFSPFMIBDef>
                    {
                        public final T11FspfFabricIndexEnt t11FspfFabricIndex;

                        public final T11FspfMinLsArrivalEnt t11FspfMinLsArrival;

                        public final T11FspfMinLsIntervalEnt t11FspfMinLsInterval;

                        public final T11FspfLsRefreshTimeEnt t11FspfLsRefreshTime;

                        public final T11FspfMaxAgeEnt t11FspfMaxAge;

                        public final T11FspfMaxAgeDiscardsEnt t11FspfMaxAgeDiscards;

                        public final T11FspfPathComputationsEnt t11FspfPathComputations;

                        public final T11FspfChecksumErrorsEnt t11FspfChecksumErrors;

                        public final T11FspfLsrsEnt t11FspfLsrs;

                        public final T11FspfCreateTimeEnt t11FspfCreateTime;

                        public final T11FspfAdminStatusEnt t11FspfAdminStatus;

                        public final T11FspfOperStatusEnt t11FspfOperStatus;

                        public final T11FspfNbrStateChangNotifyEnableEnt t11FspfNbrStateChangNotifyEnable;

                        public final T11FspfSetToDefaultEnt t11FspfSetToDefault;

                        public final T11FspfStorageTypeEnt t11FspfStorageType;

                        private T11FspfEntryEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                        {
                            super(mib, parent, "t11FspfEntry", "1.3.6.1.2.1.143.1.1.1.1", false, false, false, true);
                            this.t11FspfFabricIndex = new T11FspfFabricIndexEnt(mib, this);
                            this.t11FspfMinLsArrival = new T11FspfMinLsArrivalEnt(mib, this);
                            this.t11FspfMinLsInterval = new T11FspfMinLsIntervalEnt(mib, this);
                            this.t11FspfLsRefreshTime = new T11FspfLsRefreshTimeEnt(mib, this);
                            this.t11FspfMaxAge = new T11FspfMaxAgeEnt(mib, this);
                            this.t11FspfMaxAgeDiscards = new T11FspfMaxAgeDiscardsEnt(mib, this);
                            this.t11FspfPathComputations = new T11FspfPathComputationsEnt(mib, this);
                            this.t11FspfChecksumErrors = new T11FspfChecksumErrorsEnt(mib, this);
                            this.t11FspfLsrs = new T11FspfLsrsEnt(mib, this);
                            this.t11FspfCreateTime = new T11FspfCreateTimeEnt(mib, this);
                            this.t11FspfAdminStatus = new T11FspfAdminStatusEnt(mib, this);
                            this.t11FspfOperStatus = new T11FspfOperStatusEnt(mib, this);
                            this.t11FspfNbrStateChangNotifyEnable = new T11FspfNbrStateChangNotifyEnableEnt(mib, this);
                            this.t11FspfSetToDefault = new T11FspfSetToDefaultEnt(mib, this);
                            this.t11FspfStorageType = new T11FspfStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FspfFabricIndex,
                                this.t11FspfMinLsArrival,
                                this.t11FspfMinLsInterval,
                                this.t11FspfLsRefreshTime,
                                this.t11FspfMaxAge,
                                this.t11FspfMaxAgeDiscards,
                                this.t11FspfPathComputations,
                                this.t11FspfChecksumErrors,
                                this.t11FspfLsrs,
                                this.t11FspfCreateTime,
                                this.t11FspfAdminStatus,
                                this.t11FspfOperStatus,
                                this.t11FspfNbrStateChangNotifyEnable,
                                this.t11FspfSetToDefault,
                                this.t11FspfStorageType
                            };
                        }
                        public static final class T11FspfFabricIndexEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfFabricIndexEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfFabricIndex", "1.3.6.1.2.1.143.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfMinLsArrivalEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfMinLsArrivalEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfMinLsArrival", "1.3.6.1.2.1.143.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfMinLsIntervalEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfMinLsIntervalEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfMinLsInterval", "1.3.6.1.2.1.143.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsRefreshTimeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsRefreshTimeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsRefreshTime", "1.3.6.1.2.1.143.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfMaxAgeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfMaxAgeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfMaxAge", "1.3.6.1.2.1.143.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfMaxAgeDiscardsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfMaxAgeDiscardsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfMaxAgeDiscards", "1.3.6.1.2.1.143.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfPathComputationsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfPathComputationsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfPathComputations", "1.3.6.1.2.1.143.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfChecksumErrorsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfChecksumErrorsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfChecksumErrors", "1.3.6.1.2.1.143.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrs", "1.3.6.1.2.1.143.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfCreateTimeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfCreateTimeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfCreateTime", "1.3.6.1.2.1.143.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfAdminStatusEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfAdminStatusEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfAdminStatus", "1.3.6.1.2.1.143.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfOperStatusEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfOperStatusEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfOperStatus", "1.3.6.1.2.1.143.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfNbrStateChangNotifyEnableEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfNbrStateChangNotifyEnableEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfNbrStateChangNotifyEnable", "1.3.6.1.2.1.143.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfSetToDefaultEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfSetToDefaultEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfSetToDefault", "1.3.6.1.2.1.143.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfStorageTypeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfStorageTypeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfStorageType", "1.3.6.1.2.1.143.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FspfIfTableEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    public final T11FspfIfEntryEnt t11FspfIfEntry;

                    private T11FspfIfTableEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfIfTable", "1.3.6.1.2.1.143.1.1.2", false, true, false, false);
                        this.t11FspfIfEntry = new T11FspfIfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FspfIfEntry
                        };
                    }
                    public static final class T11FspfIfEntryEnt extends MIBEntry<T11FCFSPFMIBDef>
                    {
                        public final T11FspfIfIndexEnt t11FspfIfIndex;

                        public final T11FspfIfHelloIntervalEnt t11FspfIfHelloInterval;

                        public final T11FspfIfDeadIntervalEnt t11FspfIfDeadInterval;

                        public final T11FspfIfRetransmitIntervalEnt t11FspfIfRetransmitInterval;

                        public final T11FspfIfInLsuPktsEnt t11FspfIfInLsuPkts;

                        public final T11FspfIfInLsaPktsEnt t11FspfIfInLsaPkts;

                        public final T11FspfIfOutLsuPktsEnt t11FspfIfOutLsuPkts;

                        public final T11FspfIfOutLsaPktsEnt t11FspfIfOutLsaPkts;

                        public final T11FspfIfOutHelloPktsEnt t11FspfIfOutHelloPkts;

                        public final T11FspfIfInHelloPktsEnt t11FspfIfInHelloPkts;

                        public final T11FspfIfRetransmittedLsuPktsEnt t11FspfIfRetransmittedLsuPkts;

                        public final T11FspfIfInErrorPktsEnt t11FspfIfInErrorPkts;

                        public final T11FspfIfNbrStateEnt t11FspfIfNbrState;

                        public final T11FspfIfNbrDomainIdEnt t11FspfIfNbrDomainId;

                        public final T11FspfIfNbrPortIndexEnt t11FspfIfNbrPortIndex;

                        public final T11FspfIfAdminStatusEnt t11FspfIfAdminStatus;

                        public final T11FspfIfCreateTimeEnt t11FspfIfCreateTime;

                        public final T11FspfIfSetToDefaultEnt t11FspfIfSetToDefault;

                        public final T11FspfIfLinkCostFactorEnt t11FspfIfLinkCostFactor;

                        public final T11FspfIfStorageTypeEnt t11FspfIfStorageType;

                        public final T11FspfIfRowStatusEnt t11FspfIfRowStatus;

                        private T11FspfIfEntryEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                        {
                            super(mib, parent, "t11FspfIfEntry", "1.3.6.1.2.1.143.1.1.2.1", false, false, false, true);
                            this.t11FspfIfIndex = new T11FspfIfIndexEnt(mib, this);
                            this.t11FspfIfHelloInterval = new T11FspfIfHelloIntervalEnt(mib, this);
                            this.t11FspfIfDeadInterval = new T11FspfIfDeadIntervalEnt(mib, this);
                            this.t11FspfIfRetransmitInterval = new T11FspfIfRetransmitIntervalEnt(mib, this);
                            this.t11FspfIfInLsuPkts = new T11FspfIfInLsuPktsEnt(mib, this);
                            this.t11FspfIfInLsaPkts = new T11FspfIfInLsaPktsEnt(mib, this);
                            this.t11FspfIfOutLsuPkts = new T11FspfIfOutLsuPktsEnt(mib, this);
                            this.t11FspfIfOutLsaPkts = new T11FspfIfOutLsaPktsEnt(mib, this);
                            this.t11FspfIfOutHelloPkts = new T11FspfIfOutHelloPktsEnt(mib, this);
                            this.t11FspfIfInHelloPkts = new T11FspfIfInHelloPktsEnt(mib, this);
                            this.t11FspfIfRetransmittedLsuPkts = new T11FspfIfRetransmittedLsuPktsEnt(mib, this);
                            this.t11FspfIfInErrorPkts = new T11FspfIfInErrorPktsEnt(mib, this);
                            this.t11FspfIfNbrState = new T11FspfIfNbrStateEnt(mib, this);
                            this.t11FspfIfNbrDomainId = new T11FspfIfNbrDomainIdEnt(mib, this);
                            this.t11FspfIfNbrPortIndex = new T11FspfIfNbrPortIndexEnt(mib, this);
                            this.t11FspfIfAdminStatus = new T11FspfIfAdminStatusEnt(mib, this);
                            this.t11FspfIfCreateTime = new T11FspfIfCreateTimeEnt(mib, this);
                            this.t11FspfIfSetToDefault = new T11FspfIfSetToDefaultEnt(mib, this);
                            this.t11FspfIfLinkCostFactor = new T11FspfIfLinkCostFactorEnt(mib, this);
                            this.t11FspfIfStorageType = new T11FspfIfStorageTypeEnt(mib, this);
                            this.t11FspfIfRowStatus = new T11FspfIfRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FspfIfIndex,
                                this.t11FspfIfHelloInterval,
                                this.t11FspfIfDeadInterval,
                                this.t11FspfIfRetransmitInterval,
                                this.t11FspfIfInLsuPkts,
                                this.t11FspfIfInLsaPkts,
                                this.t11FspfIfOutLsuPkts,
                                this.t11FspfIfOutLsaPkts,
                                this.t11FspfIfOutHelloPkts,
                                this.t11FspfIfInHelloPkts,
                                this.t11FspfIfRetransmittedLsuPkts,
                                this.t11FspfIfInErrorPkts,
                                this.t11FspfIfNbrState,
                                this.t11FspfIfNbrDomainId,
                                this.t11FspfIfNbrPortIndex,
                                this.t11FspfIfAdminStatus,
                                this.t11FspfIfCreateTime,
                                this.t11FspfIfSetToDefault,
                                this.t11FspfIfLinkCostFactor,
                                this.t11FspfIfStorageType,
                                this.t11FspfIfRowStatus
                            };
                        }
                        public static final class T11FspfIfIndexEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfIndexEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfIndex", "1.3.6.1.2.1.143.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfHelloIntervalEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfHelloIntervalEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfHelloInterval", "1.3.6.1.2.1.143.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfDeadIntervalEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfDeadIntervalEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfDeadInterval", "1.3.6.1.2.1.143.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfRetransmitIntervalEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfRetransmitIntervalEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfRetransmitInterval", "1.3.6.1.2.1.143.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfInLsuPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfInLsuPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfInLsuPkts", "1.3.6.1.2.1.143.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfInLsaPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfInLsaPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfInLsaPkts", "1.3.6.1.2.1.143.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfOutLsuPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfOutLsuPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfOutLsuPkts", "1.3.6.1.2.1.143.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfOutLsaPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfOutLsaPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfOutLsaPkts", "1.3.6.1.2.1.143.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfOutHelloPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfOutHelloPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfOutHelloPkts", "1.3.6.1.2.1.143.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfInHelloPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfInHelloPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfInHelloPkts", "1.3.6.1.2.1.143.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfRetransmittedLsuPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfRetransmittedLsuPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfRetransmittedLsuPkts", "1.3.6.1.2.1.143.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfInErrorPktsEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfInErrorPktsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfInErrorPkts", "1.3.6.1.2.1.143.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfNbrStateEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfNbrStateEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfNbrState", "1.3.6.1.2.1.143.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfNbrDomainIdEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfNbrDomainIdEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfNbrDomainId", "1.3.6.1.2.1.143.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfNbrPortIndexEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfNbrPortIndexEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfNbrPortIndex", "1.3.6.1.2.1.143.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfAdminStatusEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfAdminStatusEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfAdminStatus", "1.3.6.1.2.1.143.1.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfCreateTimeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfCreateTimeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfCreateTime", "1.3.6.1.2.1.143.1.1.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfSetToDefaultEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfSetToDefaultEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfSetToDefault", "1.3.6.1.2.1.143.1.1.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfLinkCostFactorEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfLinkCostFactorEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfLinkCostFactor", "1.3.6.1.2.1.143.1.1.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfStorageTypeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfStorageTypeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfStorageType", "1.3.6.1.2.1.143.1.1.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfIfRowStatusEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfIfRowStatusEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfIfRowStatus", "1.3.6.1.2.1.143.1.1.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FspfIfPrevNbrStateEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfIfPrevNbrStateEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfIfPrevNbrState", "1.3.6.1.2.1.143.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FspfDatabaseEnt extends MIBEntry<T11FCFSPFMIBDef>
            {
                /** t11FspfLsrTable*/
                public final T11FspfLsrTableEnt t11FspfLsrTable;

                /** t11FspfLinkTable*/
                public final T11FspfLinkNumberEnt t11FspfLinkNumber;

                public final T11FspfLinkTableEnt t11FspfLinkTable;

                private T11FspfDatabaseEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                {
                    super(mib, parent, "t11FspfDatabase", "1.3.6.1.2.1.143.1.2", false, false, false, false);
                    this.t11FspfLsrTable = new T11FspfLsrTableEnt(mib, this);
                    this.t11FspfLinkNumber = new T11FspfLinkNumberEnt(mib, this);
                    this.t11FspfLinkTable = new T11FspfLinkTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FspfLsrTable,
                        this.t11FspfLinkNumber,
                        this.t11FspfLinkTable
                    };
                }
                public static final class T11FspfLsrTableEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    public final T11FspfLsrEntryEnt t11FspfLsrEntry;

                    private T11FspfLsrTableEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfLsrTable", "1.3.6.1.2.1.143.1.2.1", false, true, false, false);
                        this.t11FspfLsrEntry = new T11FspfLsrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FspfLsrEntry
                        };
                    }
                    public static final class T11FspfLsrEntryEnt extends MIBEntry<T11FCFSPFMIBDef>
                    {
                        public final T11FspfLsrDomainIdEnt t11FspfLsrDomainId;

                        public final T11FspfLsrTypeEnt t11FspfLsrType;

                        public final T11FspfLsrAdvDomainIdEnt t11FspfLsrAdvDomainId;

                        public final T11FspfLsrAgeEnt t11FspfLsrAge;

                        public final T11FspfLsrIncarnationNumberEnt t11FspfLsrIncarnationNumber;

                        public final T11FspfLsrCheckSumEnt t11FspfLsrCheckSum;

                        public final T11FspfLsrLinksEnt t11FspfLsrLinks;

                        private T11FspfLsrEntryEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                        {
                            super(mib, parent, "t11FspfLsrEntry", "1.3.6.1.2.1.143.1.2.1.1", false, false, false, true);
                            this.t11FspfLsrDomainId = new T11FspfLsrDomainIdEnt(mib, this);
                            this.t11FspfLsrType = new T11FspfLsrTypeEnt(mib, this);
                            this.t11FspfLsrAdvDomainId = new T11FspfLsrAdvDomainIdEnt(mib, this);
                            this.t11FspfLsrAge = new T11FspfLsrAgeEnt(mib, this);
                            this.t11FspfLsrIncarnationNumber = new T11FspfLsrIncarnationNumberEnt(mib, this);
                            this.t11FspfLsrCheckSum = new T11FspfLsrCheckSumEnt(mib, this);
                            this.t11FspfLsrLinks = new T11FspfLsrLinksEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FspfLsrDomainId,
                                this.t11FspfLsrType,
                                this.t11FspfLsrAdvDomainId,
                                this.t11FspfLsrAge,
                                this.t11FspfLsrIncarnationNumber,
                                this.t11FspfLsrCheckSum,
                                this.t11FspfLsrLinks
                            };
                        }
                        public static final class T11FspfLsrDomainIdEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrDomainIdEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrDomainId", "1.3.6.1.2.1.143.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrTypeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrTypeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrType", "1.3.6.1.2.1.143.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrAdvDomainIdEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrAdvDomainIdEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrAdvDomainId", "1.3.6.1.2.1.143.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrAgeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrAgeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrAge", "1.3.6.1.2.1.143.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrIncarnationNumberEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrIncarnationNumberEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrIncarnationNumber", "1.3.6.1.2.1.143.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrCheckSumEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrCheckSumEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrCheckSum", "1.3.6.1.2.1.143.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLsrLinksEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLsrLinksEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLsrLinks", "1.3.6.1.2.1.143.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class T11FspfLinkNumberEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfLinkNumberEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfLinkNumber", "1.3.6.1.2.1.143.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FspfLinkTableEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    public final T11FspfLinkEntryEnt t11FspfLinkEntry;

                    private T11FspfLinkTableEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfLinkTable", "1.3.6.1.2.1.143.1.2.4", false, true, false, false);
                        this.t11FspfLinkEntry = new T11FspfLinkEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FspfLinkEntry
                        };
                    }
                    public static final class T11FspfLinkEntryEnt extends MIBEntry<T11FCFSPFMIBDef>
                    {
                        public final T11FspfLinkIndexEnt t11FspfLinkIndex;

                        public final T11FspfLinkNbrDomainIdEnt t11FspfLinkNbrDomainId;

                        public final T11FspfLinkPortIndexEnt t11FspfLinkPortIndex;

                        public final T11FspfLinkNbrPortIndexEnt t11FspfLinkNbrPortIndex;

                        public final T11FspfLinkTypeEnt t11FspfLinkType;

                        public final T11FspfLinkCostEnt t11FspfLinkCost;

                        private T11FspfLinkEntryEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                        {
                            super(mib, parent, "t11FspfLinkEntry", "1.3.6.1.2.1.143.1.2.4.1", false, false, false, true);
                            this.t11FspfLinkIndex = new T11FspfLinkIndexEnt(mib, this);
                            this.t11FspfLinkNbrDomainId = new T11FspfLinkNbrDomainIdEnt(mib, this);
                            this.t11FspfLinkPortIndex = new T11FspfLinkPortIndexEnt(mib, this);
                            this.t11FspfLinkNbrPortIndex = new T11FspfLinkNbrPortIndexEnt(mib, this);
                            this.t11FspfLinkType = new T11FspfLinkTypeEnt(mib, this);
                            this.t11FspfLinkCost = new T11FspfLinkCostEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FspfLinkIndex,
                                this.t11FspfLinkNbrDomainId,
                                this.t11FspfLinkPortIndex,
                                this.t11FspfLinkNbrPortIndex,
                                this.t11FspfLinkType,
                                this.t11FspfLinkCost
                            };
                        }
                        public static final class T11FspfLinkIndexEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLinkIndexEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLinkIndex", "1.3.6.1.2.1.143.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLinkNbrDomainIdEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLinkNbrDomainIdEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLinkNbrDomainId", "1.3.6.1.2.1.143.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLinkPortIndexEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLinkPortIndexEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLinkPortIndex", "1.3.6.1.2.1.143.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLinkNbrPortIndexEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLinkNbrPortIndexEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLinkNbrPortIndex", "1.3.6.1.2.1.143.1.2.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLinkTypeEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLinkTypeEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLinkType", "1.3.6.1.2.1.143.1.2.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FspfLinkCostEnt extends MIBEntry<T11FCFSPFMIBDef>
                        {
                            private T11FspfLinkCostEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                            {
                                super(mib, parent, "t11FspfLinkCost", "1.3.6.1.2.1.143.1.2.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class T11FspfConformanceEnt extends MIBEntry<T11FCFSPFMIBDef>
        {
            /** Conformance*/
            public final T11FspfMIBCompliancesEnt t11FspfMIBCompliances;

            public final T11FspfMIBGroupsEnt t11FspfMIBGroups;

            private T11FspfConformanceEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
            {
                super(mib, parent, "t11FspfConformance", "1.3.6.1.2.1.143.2", false, false, false, false);
                this.t11FspfMIBCompliances = new T11FspfMIBCompliancesEnt(mib, this);
                this.t11FspfMIBGroups = new T11FspfMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FspfMIBCompliances,
                    this.t11FspfMIBGroups
                };
            }
            public static final class T11FspfMIBCompliancesEnt extends MIBEntry<T11FCFSPFMIBDef>
            {
                public final T11FspfMIBComplianceEnt t11FspfMIBCompliance;

                private T11FspfMIBCompliancesEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                {
                    super(mib, parent, "t11FspfMIBCompliances", "1.3.6.1.2.1.143.2.1", false, false, false, false);
                    this.t11FspfMIBCompliance = new T11FspfMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FspfMIBCompliance
                    };
                }
                public static final class T11FspfMIBComplianceEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfMIBComplianceEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfMIBCompliance", "1.3.6.1.2.1.143.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FspfMIBGroupsEnt extends MIBEntry<T11FCFSPFMIBDef>
            {
                /** Units of Conformance*/
                public final T11FspfGeneralGroupEnt t11FspfGeneralGroup;

                public final T11FspfIfGroupEnt t11FspfIfGroup;

                public final T11FspfIfCounterGroupEnt t11FspfIfCounterGroup;

                public final T11FspfDatabaseGroupEnt t11FspfDatabaseGroup;

                public final T11FspfNotificationGroupEnt t11FspfNotificationGroup;

                private T11FspfMIBGroupsEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                {
                    super(mib, parent, "t11FspfMIBGroups", "1.3.6.1.2.1.143.2.2", false, false, false, false);
                    this.t11FspfGeneralGroup = new T11FspfGeneralGroupEnt(mib, this);
                    this.t11FspfIfGroup = new T11FspfIfGroupEnt(mib, this);
                    this.t11FspfIfCounterGroup = new T11FspfIfCounterGroupEnt(mib, this);
                    this.t11FspfDatabaseGroup = new T11FspfDatabaseGroupEnt(mib, this);
                    this.t11FspfNotificationGroup = new T11FspfNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FspfGeneralGroup,
                        this.t11FspfIfGroup,
                        this.t11FspfIfCounterGroup,
                        this.t11FspfDatabaseGroup,
                        this.t11FspfNotificationGroup
                    };
                }
                public static final class T11FspfGeneralGroupEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfGeneralGroupEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfGeneralGroup", "1.3.6.1.2.1.143.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FspfIfGroupEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfIfGroupEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfIfGroup", "1.3.6.1.2.1.143.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FspfIfCounterGroupEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfIfCounterGroupEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfIfCounterGroup", "1.3.6.1.2.1.143.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FspfDatabaseGroupEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfDatabaseGroupEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfDatabaseGroup", "1.3.6.1.2.1.143.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FspfNotificationGroupEnt extends MIBEntry<T11FCFSPFMIBDef>
                {
                    private T11FspfNotificationGroupEnt(T11FCFSPFMIBDef mib, MIBEntry<T11FCFSPFMIBDef> parent)
                    {
                        super(mib, parent, "t11FspfNotificationGroup", "1.3.6.1.2.1.143.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
