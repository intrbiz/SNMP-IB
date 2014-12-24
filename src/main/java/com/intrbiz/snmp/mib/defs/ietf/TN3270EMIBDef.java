package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class TN3270EMIBDef extends MIB
{
    public static final TN3270EMIBDef TN3270EMIB = new TN3270EMIBDef();

    /** July 27, 1998
RFC Editor to fill in*/
    public final Tn3270eMIBEnt tn3270eMIB;

    private TN3270EMIBDef()
    {
        super("TN3270E-MIB");
        this.tn3270eMIB = new Tn3270eMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tn3270eMIB
        };
    }

    public static final class Tn3270eMIBEnt extends MIBEntry<TN3270EMIBDef>
    {
        /** Top-level structure of the MIB*/
        public final Tn3270eNotificationsEnt tn3270eNotifications;

        public final Tn3270eObjectsEnt tn3270eObjects;

        public final Tn3270eConformanceEnt tn3270eConformance;

        private Tn3270eMIBEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
        {
            super(mib, parent, "tn3270eMIB", "1.3.6.1.2.1.34.8", false, false, false, false);
            this.tn3270eNotifications = new Tn3270eNotificationsEnt(mib, this);
            this.tn3270eObjects = new Tn3270eObjectsEnt(mib, this);
            this.tn3270eConformance = new Tn3270eConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tn3270eNotifications,
                this.tn3270eObjects,
                this.tn3270eConformance
            };
        }
        public static final class Tn3270eNotificationsEnt extends MIBEntry<TN3270EMIBDef>
        {
            private Tn3270eNotificationsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
            {
                super(mib, parent, "tn3270eNotifications", "1.3.6.1.2.1.34.8.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Tn3270eObjectsEnt extends MIBEntry<TN3270EMIBDef>
        {
            /** MIB Objects*/
            public final Tn3270eSrvrConfTableEnt tn3270eSrvrConfTable;

            public final Tn3270eSrvrPortTableEnt tn3270eSrvrPortTable;

            public final Tn3270eSrvrStatsTableEnt tn3270eSrvrStatsTable;

            public final Tn3270eClientGroupTableEnt tn3270eClientGroupTable;

            public final Tn3270eResPoolTableEnt tn3270eResPoolTable;

            public final Tn3270eSnaMapTableEnt tn3270eSnaMapTable;

            public final Tn3270eClientResMapTableEnt tn3270eClientResMapTable;

            public final Tn3270eResMapTableEnt tn3270eResMapTable;

            /** Define the set of objects to supplement the TCP Connection Table*/
            public final Tn3270eTcpConnTableEnt tn3270eTcpConnTable;

            public final Tn3270eConfSpinLockEnt tn3270eConfSpinLock;

            private Tn3270eObjectsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
            {
                super(mib, parent, "tn3270eObjects", "1.3.6.1.2.1.34.8.1", false, false, false, false);
                this.tn3270eSrvrConfTable = new Tn3270eSrvrConfTableEnt(mib, this);
                this.tn3270eSrvrPortTable = new Tn3270eSrvrPortTableEnt(mib, this);
                this.tn3270eSrvrStatsTable = new Tn3270eSrvrStatsTableEnt(mib, this);
                this.tn3270eClientGroupTable = new Tn3270eClientGroupTableEnt(mib, this);
                this.tn3270eResPoolTable = new Tn3270eResPoolTableEnt(mib, this);
                this.tn3270eSnaMapTable = new Tn3270eSnaMapTableEnt(mib, this);
                this.tn3270eClientResMapTable = new Tn3270eClientResMapTableEnt(mib, this);
                this.tn3270eResMapTable = new Tn3270eResMapTableEnt(mib, this);
                this.tn3270eTcpConnTable = new Tn3270eTcpConnTableEnt(mib, this);
                this.tn3270eConfSpinLock = new Tn3270eConfSpinLockEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tn3270eSrvrConfTable,
                    this.tn3270eSrvrPortTable,
                    this.tn3270eSrvrStatsTable,
                    this.tn3270eClientGroupTable,
                    this.tn3270eResPoolTable,
                    this.tn3270eSnaMapTable,
                    this.tn3270eClientResMapTable,
                    this.tn3270eResMapTable,
                    this.tn3270eTcpConnTable,
                    this.tn3270eConfSpinLock
                };
            }
            public static final class Tn3270eSrvrConfTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eSrvrConfEntryEnt tn3270eSrvrConfEntry;

                private Tn3270eSrvrConfTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eSrvrConfTable", "1.3.6.1.2.1.34.8.1.1", false, true, false, false);
                    this.tn3270eSrvrConfEntry = new Tn3270eSrvrConfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eSrvrConfEntry
                    };
                }
                public static final class Tn3270eSrvrConfEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eSrvrConfIndexEnt tn3270eSrvrConfIndex;

                    public final Tn3270eSrvrConfInactivityTimeoutEnt tn3270eSrvrConfInactivityTimeout;

                    public final Tn3270eSrvrConfConnectivityChkEnt tn3270eSrvrConfConnectivityChk;

                    /** 10 minutes*/
                    public final Tn3270eSrvrConfTmNopInactTimeEnt tn3270eSrvrConfTmNopInactTime;

                    /** 2 minutes*/
                    public final Tn3270eSrvrConfTmNopIntervalEnt tn3270eSrvrConfTmNopInterval;

                    public final Tn3270eSrvrFunctionsSupportedEnt tn3270eSrvrFunctionsSupported;

                    public final Tn3270eSrvrConfAdminStatusEnt tn3270eSrvrConfAdminStatus;

                    public final Tn3270eSrvrConfOperStatusEnt tn3270eSrvrConfOperStatus;

                    public final Tn3270eSrvrConfSessionTermStateEnt tn3270eSrvrConfSessionTermState;

                    public final Tn3270eSrvrConfSrvrTypeEnt tn3270eSrvrConfSrvrType;

                    /** the empty string*/
                    public final Tn3270eSrvrConfContactEnt tn3270eSrvrConfContact;

                    public final Tn3270eSrvrConfRowStatusEnt tn3270eSrvrConfRowStatus;

                    public final Tn3270eSrvrConfLastActTimeEnt tn3270eSrvrConfLastActTime;

                    /** 5 seconds*/
                    public final Tn3270eSrvrConfTmTimeoutEnt tn3270eSrvrConfTmTimeout;

                    private Tn3270eSrvrConfEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eSrvrConfEntry", "1.3.6.1.2.1.34.8.1.1.1", false, false, false, true);
                        this.tn3270eSrvrConfIndex = new Tn3270eSrvrConfIndexEnt(mib, this);
                        this.tn3270eSrvrConfInactivityTimeout = new Tn3270eSrvrConfInactivityTimeoutEnt(mib, this);
                        this.tn3270eSrvrConfConnectivityChk = new Tn3270eSrvrConfConnectivityChkEnt(mib, this);
                        this.tn3270eSrvrConfTmNopInactTime = new Tn3270eSrvrConfTmNopInactTimeEnt(mib, this);
                        this.tn3270eSrvrConfTmNopInterval = new Tn3270eSrvrConfTmNopIntervalEnt(mib, this);
                        this.tn3270eSrvrFunctionsSupported = new Tn3270eSrvrFunctionsSupportedEnt(mib, this);
                        this.tn3270eSrvrConfAdminStatus = new Tn3270eSrvrConfAdminStatusEnt(mib, this);
                        this.tn3270eSrvrConfOperStatus = new Tn3270eSrvrConfOperStatusEnt(mib, this);
                        this.tn3270eSrvrConfSessionTermState = new Tn3270eSrvrConfSessionTermStateEnt(mib, this);
                        this.tn3270eSrvrConfSrvrType = new Tn3270eSrvrConfSrvrTypeEnt(mib, this);
                        this.tn3270eSrvrConfContact = new Tn3270eSrvrConfContactEnt(mib, this);
                        this.tn3270eSrvrConfRowStatus = new Tn3270eSrvrConfRowStatusEnt(mib, this);
                        this.tn3270eSrvrConfLastActTime = new Tn3270eSrvrConfLastActTimeEnt(mib, this);
                        this.tn3270eSrvrConfTmTimeout = new Tn3270eSrvrConfTmTimeoutEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eSrvrConfIndex,
                            this.tn3270eSrvrConfInactivityTimeout,
                            this.tn3270eSrvrConfConnectivityChk,
                            this.tn3270eSrvrConfTmNopInactTime,
                            this.tn3270eSrvrConfTmNopInterval,
                            this.tn3270eSrvrFunctionsSupported,
                            this.tn3270eSrvrConfAdminStatus,
                            this.tn3270eSrvrConfOperStatus,
                            this.tn3270eSrvrConfSessionTermState,
                            this.tn3270eSrvrConfSrvrType,
                            this.tn3270eSrvrConfContact,
                            this.tn3270eSrvrConfRowStatus,
                            this.tn3270eSrvrConfLastActTime,
                            this.tn3270eSrvrConfTmTimeout
                        };
                    }
                    public static final class Tn3270eSrvrConfIndexEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfIndexEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfIndex", "1.3.6.1.2.1.34.8.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfInactivityTimeoutEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfInactivityTimeoutEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfInactivityTimeout", "1.3.6.1.2.1.34.8.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfConnectivityChkEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfConnectivityChkEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfConnectivityChk", "1.3.6.1.2.1.34.8.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfTmNopInactTimeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfTmNopInactTimeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfTmNopInactTime", "1.3.6.1.2.1.34.8.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfTmNopIntervalEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfTmNopIntervalEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfTmNopInterval", "1.3.6.1.2.1.34.8.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrFunctionsSupportedEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrFunctionsSupportedEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrFunctionsSupported", "1.3.6.1.2.1.34.8.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfAdminStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfAdminStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfAdminStatus", "1.3.6.1.2.1.34.8.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfOperStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfOperStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfOperStatus", "1.3.6.1.2.1.34.8.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfSessionTermStateEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfSessionTermStateEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfSessionTermState", "1.3.6.1.2.1.34.8.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfSrvrTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfSrvrTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfSrvrType", "1.3.6.1.2.1.34.8.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfContactEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfContactEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfContact", "1.3.6.1.2.1.34.8.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfRowStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfRowStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfRowStatus", "1.3.6.1.2.1.34.8.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfLastActTimeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfLastActTimeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfLastActTime", "1.3.6.1.2.1.34.8.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrConfTmTimeoutEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrConfTmTimeoutEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrConfTmTimeout", "1.3.6.1.2.1.34.8.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eSrvrPortTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eSrvrPortEntryEnt tn3270eSrvrPortEntry;

                private Tn3270eSrvrPortTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eSrvrPortTable", "1.3.6.1.2.1.34.8.1.2", false, true, false, false);
                    this.tn3270eSrvrPortEntry = new Tn3270eSrvrPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eSrvrPortEntry
                    };
                }
                public static final class Tn3270eSrvrPortEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eSrvrPortEnt tn3270eSrvrPort;

                    public final Tn3270eSrvrPortAddrTypeEnt tn3270eSrvrPortAddrType;

                    public final Tn3270eSrvrPortAddressEnt tn3270eSrvrPortAddress;

                    public final Tn3270eSrvrPortRowStatusEnt tn3270eSrvrPortRowStatus;

                    private Tn3270eSrvrPortEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eSrvrPortEntry", "1.3.6.1.2.1.34.8.1.2.1", false, false, false, true);
                        this.tn3270eSrvrPort = new Tn3270eSrvrPortEnt(mib, this);
                        this.tn3270eSrvrPortAddrType = new Tn3270eSrvrPortAddrTypeEnt(mib, this);
                        this.tn3270eSrvrPortAddress = new Tn3270eSrvrPortAddressEnt(mib, this);
                        this.tn3270eSrvrPortRowStatus = new Tn3270eSrvrPortRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eSrvrPort,
                            this.tn3270eSrvrPortAddrType,
                            this.tn3270eSrvrPortAddress,
                            this.tn3270eSrvrPortRowStatus
                        };
                    }
                    public static final class Tn3270eSrvrPortEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrPortEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrPort", "1.3.6.1.2.1.34.8.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrPortAddrTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrPortAddrTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrPortAddrType", "1.3.6.1.2.1.34.8.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrPortAddressEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrPortAddressEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrPortAddress", "1.3.6.1.2.1.34.8.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrPortRowStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrPortRowStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrPortRowStatus", "1.3.6.1.2.1.34.8.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eSrvrStatsTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eSrvrStatsEntryEnt tn3270eSrvrStatsEntry;

                private Tn3270eSrvrStatsTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eSrvrStatsTable", "1.3.6.1.2.1.34.8.1.3", false, true, false, false);
                    this.tn3270eSrvrStatsEntry = new Tn3270eSrvrStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eSrvrStatsEntry
                    };
                }
                public static final class Tn3270eSrvrStatsEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eSrvrStatsUpTimeEnt tn3270eSrvrStatsUpTime;

                    public final Tn3270eSrvrStatsMaxTermsEnt tn3270eSrvrStatsMaxTerms;

                    public final Tn3270eSrvrStatsInUseTermsEnt tn3270eSrvrStatsInUseTerms;

                    public final Tn3270eSrvrStatsSpareTermsEnt tn3270eSrvrStatsSpareTerms;

                    public final Tn3270eSrvrStatsMaxPtrsEnt tn3270eSrvrStatsMaxPtrs;

                    public final Tn3270eSrvrStatsInUsePtrsEnt tn3270eSrvrStatsInUsePtrs;

                    public final Tn3270eSrvrStatsSparePtrsEnt tn3270eSrvrStatsSparePtrs;

                    public final Tn3270eSrvrStatsInConnectsEnt tn3270eSrvrStatsInConnects;

                    public final Tn3270eSrvrStatsConnResrceRejsEnt tn3270eSrvrStatsConnResrceRejs;

                    public final Tn3270eSrvrStatsDisconnectsEnt tn3270eSrvrStatsDisconnects;

                    public final Tn3270eSrvrStatsHCInOctetsEnt tn3270eSrvrStatsHCInOctets;

                    public final Tn3270eSrvrStatsInOctetsEnt tn3270eSrvrStatsInOctets;

                    public final Tn3270eSrvrStatsHCOutOctetsEnt tn3270eSrvrStatsHCOutOctets;

                    public final Tn3270eSrvrStatsOutOctetsEnt tn3270eSrvrStatsOutOctets;

                    public final Tn3270eSrvrStatsConnErrorRejsEnt tn3270eSrvrStatsConnErrorRejs;

                    private Tn3270eSrvrStatsEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eSrvrStatsEntry", "1.3.6.1.2.1.34.8.1.3.1", false, false, false, true);
                        this.tn3270eSrvrStatsUpTime = new Tn3270eSrvrStatsUpTimeEnt(mib, this);
                        this.tn3270eSrvrStatsMaxTerms = new Tn3270eSrvrStatsMaxTermsEnt(mib, this);
                        this.tn3270eSrvrStatsInUseTerms = new Tn3270eSrvrStatsInUseTermsEnt(mib, this);
                        this.tn3270eSrvrStatsSpareTerms = new Tn3270eSrvrStatsSpareTermsEnt(mib, this);
                        this.tn3270eSrvrStatsMaxPtrs = new Tn3270eSrvrStatsMaxPtrsEnt(mib, this);
                        this.tn3270eSrvrStatsInUsePtrs = new Tn3270eSrvrStatsInUsePtrsEnt(mib, this);
                        this.tn3270eSrvrStatsSparePtrs = new Tn3270eSrvrStatsSparePtrsEnt(mib, this);
                        this.tn3270eSrvrStatsInConnects = new Tn3270eSrvrStatsInConnectsEnt(mib, this);
                        this.tn3270eSrvrStatsConnResrceRejs = new Tn3270eSrvrStatsConnResrceRejsEnt(mib, this);
                        this.tn3270eSrvrStatsDisconnects = new Tn3270eSrvrStatsDisconnectsEnt(mib, this);
                        this.tn3270eSrvrStatsHCInOctets = new Tn3270eSrvrStatsHCInOctetsEnt(mib, this);
                        this.tn3270eSrvrStatsInOctets = new Tn3270eSrvrStatsInOctetsEnt(mib, this);
                        this.tn3270eSrvrStatsHCOutOctets = new Tn3270eSrvrStatsHCOutOctetsEnt(mib, this);
                        this.tn3270eSrvrStatsOutOctets = new Tn3270eSrvrStatsOutOctetsEnt(mib, this);
                        this.tn3270eSrvrStatsConnErrorRejs = new Tn3270eSrvrStatsConnErrorRejsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eSrvrStatsUpTime,
                            this.tn3270eSrvrStatsMaxTerms,
                            this.tn3270eSrvrStatsInUseTerms,
                            this.tn3270eSrvrStatsSpareTerms,
                            this.tn3270eSrvrStatsMaxPtrs,
                            this.tn3270eSrvrStatsInUsePtrs,
                            this.tn3270eSrvrStatsSparePtrs,
                            this.tn3270eSrvrStatsInConnects,
                            this.tn3270eSrvrStatsConnResrceRejs,
                            this.tn3270eSrvrStatsDisconnects,
                            this.tn3270eSrvrStatsHCInOctets,
                            this.tn3270eSrvrStatsInOctets,
                            this.tn3270eSrvrStatsHCOutOctets,
                            this.tn3270eSrvrStatsOutOctets,
                            this.tn3270eSrvrStatsConnErrorRejs
                        };
                    }
                    public static final class Tn3270eSrvrStatsUpTimeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsUpTimeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsUpTime", "1.3.6.1.2.1.34.8.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsMaxTermsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsMaxTermsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsMaxTerms", "1.3.6.1.2.1.34.8.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsInUseTermsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsInUseTermsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsInUseTerms", "1.3.6.1.2.1.34.8.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsSpareTermsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsSpareTermsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsSpareTerms", "1.3.6.1.2.1.34.8.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsMaxPtrsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsMaxPtrsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsMaxPtrs", "1.3.6.1.2.1.34.8.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsInUsePtrsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsInUsePtrsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsInUsePtrs", "1.3.6.1.2.1.34.8.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsSparePtrsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsSparePtrsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsSparePtrs", "1.3.6.1.2.1.34.8.1.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsInConnectsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsInConnectsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsInConnects", "1.3.6.1.2.1.34.8.1.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsConnResrceRejsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsConnResrceRejsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsConnResrceRejs", "1.3.6.1.2.1.34.8.1.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsDisconnectsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsDisconnectsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsDisconnects", "1.3.6.1.2.1.34.8.1.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsHCInOctetsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsHCInOctetsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsHCInOctets", "1.3.6.1.2.1.34.8.1.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsInOctetsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsInOctetsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsInOctets", "1.3.6.1.2.1.34.8.1.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsHCOutOctetsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsHCOutOctetsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsHCOutOctets", "1.3.6.1.2.1.34.8.1.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsOutOctetsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsOutOctetsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsOutOctets", "1.3.6.1.2.1.34.8.1.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSrvrStatsConnErrorRejsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSrvrStatsConnErrorRejsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSrvrStatsConnErrorRejs", "1.3.6.1.2.1.34.8.1.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eClientGroupTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eClientGroupEntryEnt tn3270eClientGroupEntry;

                private Tn3270eClientGroupTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eClientGroupTable", "1.3.6.1.2.1.34.8.1.4", false, true, false, false);
                    this.tn3270eClientGroupEntry = new Tn3270eClientGroupEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eClientGroupEntry
                    };
                }
                public static final class Tn3270eClientGroupEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eClientGroupNameEnt tn3270eClientGroupName;

                    public final Tn3270eClientGroupAddrTypeEnt tn3270eClientGroupAddrType;

                    public final Tn3270eClientGroupAddressEnt tn3270eClientGroupAddress;

                    public final Tn3270eClientGroupSubnetMaskEnt tn3270eClientGroupSubnetMask;

                    public final Tn3270eClientGroupPfxLengthEnt tn3270eClientGroupPfxLength;

                    public final Tn3270eClientGroupRowStatusEnt tn3270eClientGroupRowStatus;

                    private Tn3270eClientGroupEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eClientGroupEntry", "1.3.6.1.2.1.34.8.1.4.1", false, false, false, true);
                        this.tn3270eClientGroupName = new Tn3270eClientGroupNameEnt(mib, this);
                        this.tn3270eClientGroupAddrType = new Tn3270eClientGroupAddrTypeEnt(mib, this);
                        this.tn3270eClientGroupAddress = new Tn3270eClientGroupAddressEnt(mib, this);
                        this.tn3270eClientGroupSubnetMask = new Tn3270eClientGroupSubnetMaskEnt(mib, this);
                        this.tn3270eClientGroupPfxLength = new Tn3270eClientGroupPfxLengthEnt(mib, this);
                        this.tn3270eClientGroupRowStatus = new Tn3270eClientGroupRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eClientGroupName,
                            this.tn3270eClientGroupAddrType,
                            this.tn3270eClientGroupAddress,
                            this.tn3270eClientGroupSubnetMask,
                            this.tn3270eClientGroupPfxLength,
                            this.tn3270eClientGroupRowStatus
                        };
                    }
                    public static final class Tn3270eClientGroupNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientGroupNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientGroupName", "1.3.6.1.2.1.34.8.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientGroupAddrTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientGroupAddrTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientGroupAddrType", "1.3.6.1.2.1.34.8.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientGroupAddressEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientGroupAddressEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientGroupAddress", "1.3.6.1.2.1.34.8.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientGroupSubnetMaskEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientGroupSubnetMaskEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientGroupSubnetMask", "1.3.6.1.2.1.34.8.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientGroupPfxLengthEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientGroupPfxLengthEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientGroupPfxLength", "1.3.6.1.2.1.34.8.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientGroupRowStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientGroupRowStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientGroupRowStatus", "1.3.6.1.2.1.34.8.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eResPoolTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eResPoolEntryEnt tn3270eResPoolEntry;

                private Tn3270eResPoolTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eResPoolTable", "1.3.6.1.2.1.34.8.1.5", false, true, false, false);
                    this.tn3270eResPoolEntry = new Tn3270eResPoolEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eResPoolEntry
                    };
                }
                public static final class Tn3270eResPoolEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eResPoolNameEnt tn3270eResPoolName;

                    public final Tn3270eResPoolElementNameEnt tn3270eResPoolElementName;

                    public final Tn3270eResPoolElementTypeEnt tn3270eResPoolElementType;

                    public final Tn3270eResPoolRowStatusEnt tn3270eResPoolRowStatus;

                    private Tn3270eResPoolEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eResPoolEntry", "1.3.6.1.2.1.34.8.1.5.1", false, false, false, true);
                        this.tn3270eResPoolName = new Tn3270eResPoolNameEnt(mib, this);
                        this.tn3270eResPoolElementName = new Tn3270eResPoolElementNameEnt(mib, this);
                        this.tn3270eResPoolElementType = new Tn3270eResPoolElementTypeEnt(mib, this);
                        this.tn3270eResPoolRowStatus = new Tn3270eResPoolRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eResPoolName,
                            this.tn3270eResPoolElementName,
                            this.tn3270eResPoolElementType,
                            this.tn3270eResPoolRowStatus
                        };
                    }
                    public static final class Tn3270eResPoolNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResPoolNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResPoolName", "1.3.6.1.2.1.34.8.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResPoolElementNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResPoolElementNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResPoolElementName", "1.3.6.1.2.1.34.8.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResPoolElementTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResPoolElementTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResPoolElementType", "1.3.6.1.2.1.34.8.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResPoolRowStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResPoolRowStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResPoolRowStatus", "1.3.6.1.2.1.34.8.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eSnaMapTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eSnaMapEntryEnt tn3270eSnaMapEntry;

                private Tn3270eSnaMapTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eSnaMapTable", "1.3.6.1.2.1.34.8.1.6", false, true, false, false);
                    this.tn3270eSnaMapEntry = new Tn3270eSnaMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eSnaMapEntry
                    };
                }
                public static final class Tn3270eSnaMapEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eSnaMapSscpSuppliedNameEnt tn3270eSnaMapSscpSuppliedName;

                    public final Tn3270eSnaMapLocalNameEnt tn3270eSnaMapLocalName;

                    public final Tn3270eSnaMapPrimaryLuNameEnt tn3270eSnaMapPrimaryLuName;

                    private Tn3270eSnaMapEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eSnaMapEntry", "1.3.6.1.2.1.34.8.1.6.1", false, false, false, true);
                        this.tn3270eSnaMapSscpSuppliedName = new Tn3270eSnaMapSscpSuppliedNameEnt(mib, this);
                        this.tn3270eSnaMapLocalName = new Tn3270eSnaMapLocalNameEnt(mib, this);
                        this.tn3270eSnaMapPrimaryLuName = new Tn3270eSnaMapPrimaryLuNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eSnaMapSscpSuppliedName,
                            this.tn3270eSnaMapLocalName,
                            this.tn3270eSnaMapPrimaryLuName
                        };
                    }
                    public static final class Tn3270eSnaMapSscpSuppliedNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSnaMapSscpSuppliedNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSnaMapSscpSuppliedName", "1.3.6.1.2.1.34.8.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSnaMapLocalNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSnaMapLocalNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSnaMapLocalName", "1.3.6.1.2.1.34.8.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eSnaMapPrimaryLuNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eSnaMapPrimaryLuNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eSnaMapPrimaryLuName", "1.3.6.1.2.1.34.8.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eClientResMapTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eClientResMapEntryEnt tn3270eClientResMapEntry;

                private Tn3270eClientResMapTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eClientResMapTable", "1.3.6.1.2.1.34.8.1.7", false, true, false, false);
                    this.tn3270eClientResMapEntry = new Tn3270eClientResMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eClientResMapEntry
                    };
                }
                public static final class Tn3270eClientResMapEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eClientResMapPoolNameEnt tn3270eClientResMapPoolName;

                    public final Tn3270eClientResMapClientGroupNameEnt tn3270eClientResMapClientGroupName;

                    public final Tn3270eClientResMapClientPortEnt tn3270eClientResMapClientPort;

                    public final Tn3270eClientResMapRowStatusEnt tn3270eClientResMapRowStatus;

                    private Tn3270eClientResMapEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eClientResMapEntry", "1.3.6.1.2.1.34.8.1.7.1", false, false, false, true);
                        this.tn3270eClientResMapPoolName = new Tn3270eClientResMapPoolNameEnt(mib, this);
                        this.tn3270eClientResMapClientGroupName = new Tn3270eClientResMapClientGroupNameEnt(mib, this);
                        this.tn3270eClientResMapClientPort = new Tn3270eClientResMapClientPortEnt(mib, this);
                        this.tn3270eClientResMapRowStatus = new Tn3270eClientResMapRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eClientResMapPoolName,
                            this.tn3270eClientResMapClientGroupName,
                            this.tn3270eClientResMapClientPort,
                            this.tn3270eClientResMapRowStatus
                        };
                    }
                    public static final class Tn3270eClientResMapPoolNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientResMapPoolNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientResMapPoolName", "1.3.6.1.2.1.34.8.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientResMapClientGroupNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientResMapClientGroupNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientResMapClientGroupName", "1.3.6.1.2.1.34.8.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientResMapClientPortEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientResMapClientPortEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientResMapClientPort", "1.3.6.1.2.1.34.8.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eClientResMapRowStatusEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eClientResMapRowStatusEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eClientResMapRowStatus", "1.3.6.1.2.1.34.8.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eResMapTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eResMapEntryEnt tn3270eResMapEntry;

                private Tn3270eResMapTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eResMapTable", "1.3.6.1.2.1.34.8.1.8", false, true, false, false);
                    this.tn3270eResMapEntry = new Tn3270eResMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eResMapEntry
                    };
                }
                public static final class Tn3270eResMapEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eResMapElementNameEnt tn3270eResMapElementName;

                    public final Tn3270eResMapAddrTypeEnt tn3270eResMapAddrType;

                    public final Tn3270eResMapAddressEnt tn3270eResMapAddress;

                    public final Tn3270eResMapPortEnt tn3270eResMapPort;

                    public final Tn3270eResMapElementTypeEnt tn3270eResMapElementType;

                    public final Tn3270eResMapSscpSuppliedNameEnt tn3270eResMapSscpSuppliedName;

                    private Tn3270eResMapEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eResMapEntry", "1.3.6.1.2.1.34.8.1.8.1", false, false, false, true);
                        this.tn3270eResMapElementName = new Tn3270eResMapElementNameEnt(mib, this);
                        this.tn3270eResMapAddrType = new Tn3270eResMapAddrTypeEnt(mib, this);
                        this.tn3270eResMapAddress = new Tn3270eResMapAddressEnt(mib, this);
                        this.tn3270eResMapPort = new Tn3270eResMapPortEnt(mib, this);
                        this.tn3270eResMapElementType = new Tn3270eResMapElementTypeEnt(mib, this);
                        this.tn3270eResMapSscpSuppliedName = new Tn3270eResMapSscpSuppliedNameEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eResMapElementName,
                            this.tn3270eResMapAddrType,
                            this.tn3270eResMapAddress,
                            this.tn3270eResMapPort,
                            this.tn3270eResMapElementType,
                            this.tn3270eResMapSscpSuppliedName
                        };
                    }
                    public static final class Tn3270eResMapElementNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResMapElementNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResMapElementName", "1.3.6.1.2.1.34.8.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResMapAddrTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResMapAddrTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResMapAddrType", "1.3.6.1.2.1.34.8.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResMapAddressEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResMapAddressEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResMapAddress", "1.3.6.1.2.1.34.8.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResMapPortEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResMapPortEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResMapPort", "1.3.6.1.2.1.34.8.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResMapElementTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResMapElementTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResMapElementType", "1.3.6.1.2.1.34.8.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eResMapSscpSuppliedNameEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eResMapSscpSuppliedNameEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eResMapSscpSuppliedName", "1.3.6.1.2.1.34.8.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eTcpConnTableEnt extends MIBEntry<TN3270EMIBDef>
            {
                public final Tn3270eTcpConnEntryEnt tn3270eTcpConnEntry;

                private Tn3270eTcpConnTableEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eTcpConnTable", "1.3.6.1.2.1.34.8.1.9", false, true, false, false);
                    this.tn3270eTcpConnEntry = new Tn3270eTcpConnEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eTcpConnEntry
                    };
                }
                public static final class Tn3270eTcpConnEntryEnt extends MIBEntry<TN3270EMIBDef>
                {
                    public final Tn3270eTcpConnRemAddrTypeEnt tn3270eTcpConnRemAddrType;

                    public final Tn3270eTcpConnRemAddressEnt tn3270eTcpConnRemAddress;

                    public final Tn3270eTcpConnRemPortEnt tn3270eTcpConnRemPort;

                    public final Tn3270eTcpConnLocalAddrTypeEnt tn3270eTcpConnLocalAddrType;

                    public final Tn3270eTcpConnLocalAddressEnt tn3270eTcpConnLocalAddress;

                    public final Tn3270eTcpConnLocalPortEnt tn3270eTcpConnLocalPort;

                    public final Tn3270eTcpConnLastActivityEnt tn3270eTcpConnLastActivity;

                    public final Tn3270eTcpConnBytesInEnt tn3270eTcpConnBytesIn;

                    public final Tn3270eTcpConnBytesOutEnt tn3270eTcpConnBytesOut;

                    public final Tn3270eTcpConnResourceElementEnt tn3270eTcpConnResourceElement;

                    public final Tn3270eTcpConnResourceTypeEnt tn3270eTcpConnResourceType;

                    public final Tn3270eTcpConnDeviceTypeEnt tn3270eTcpConnDeviceType;

                    public final Tn3270eTcpConnFunctionsEnt tn3270eTcpConnFunctions;

                    public final Tn3270eTcpConnIdEnt tn3270eTcpConnId;

                    public final Tn3270eTcpConnClientIdFormatEnt tn3270eTcpConnClientIdFormat;

                    public final Tn3270eTcpConnClientIdEnt tn3270eTcpConnClientId;

                    public final Tn3270eTcpConnTraceDataEnt tn3270eTcpConnTraceData;

                    public final Tn3270eTcpConnLogInfoEnt tn3270eTcpConnLogInfo;

                    public final Tn3270eTcpConnLuLuBindImageEnt tn3270eTcpConnLuLuBindImage;

                    public final Tn3270eTcpConnSnaStateEnt tn3270eTcpConnSnaState;

                    public final Tn3270eTcpConnStateLastDiscReasonEnt tn3270eTcpConnStateLastDiscReason;

                    public final Tn3270eTcpConnSrvrConfIndexEnt tn3270eTcpConnSrvrConfIndex;

                    public final Tn3270eTcpConnActivationTimeEnt tn3270eTcpConnActivationTime;

                    private Tn3270eTcpConnEntryEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eTcpConnEntry", "1.3.6.1.2.1.34.8.1.9.1", false, false, false, true);
                        this.tn3270eTcpConnRemAddrType = new Tn3270eTcpConnRemAddrTypeEnt(mib, this);
                        this.tn3270eTcpConnRemAddress = new Tn3270eTcpConnRemAddressEnt(mib, this);
                        this.tn3270eTcpConnRemPort = new Tn3270eTcpConnRemPortEnt(mib, this);
                        this.tn3270eTcpConnLocalAddrType = new Tn3270eTcpConnLocalAddrTypeEnt(mib, this);
                        this.tn3270eTcpConnLocalAddress = new Tn3270eTcpConnLocalAddressEnt(mib, this);
                        this.tn3270eTcpConnLocalPort = new Tn3270eTcpConnLocalPortEnt(mib, this);
                        this.tn3270eTcpConnLastActivity = new Tn3270eTcpConnLastActivityEnt(mib, this);
                        this.tn3270eTcpConnBytesIn = new Tn3270eTcpConnBytesInEnt(mib, this);
                        this.tn3270eTcpConnBytesOut = new Tn3270eTcpConnBytesOutEnt(mib, this);
                        this.tn3270eTcpConnResourceElement = new Tn3270eTcpConnResourceElementEnt(mib, this);
                        this.tn3270eTcpConnResourceType = new Tn3270eTcpConnResourceTypeEnt(mib, this);
                        this.tn3270eTcpConnDeviceType = new Tn3270eTcpConnDeviceTypeEnt(mib, this);
                        this.tn3270eTcpConnFunctions = new Tn3270eTcpConnFunctionsEnt(mib, this);
                        this.tn3270eTcpConnId = new Tn3270eTcpConnIdEnt(mib, this);
                        this.tn3270eTcpConnClientIdFormat = new Tn3270eTcpConnClientIdFormatEnt(mib, this);
                        this.tn3270eTcpConnClientId = new Tn3270eTcpConnClientIdEnt(mib, this);
                        this.tn3270eTcpConnTraceData = new Tn3270eTcpConnTraceDataEnt(mib, this);
                        this.tn3270eTcpConnLogInfo = new Tn3270eTcpConnLogInfoEnt(mib, this);
                        this.tn3270eTcpConnLuLuBindImage = new Tn3270eTcpConnLuLuBindImageEnt(mib, this);
                        this.tn3270eTcpConnSnaState = new Tn3270eTcpConnSnaStateEnt(mib, this);
                        this.tn3270eTcpConnStateLastDiscReason = new Tn3270eTcpConnStateLastDiscReasonEnt(mib, this);
                        this.tn3270eTcpConnSrvrConfIndex = new Tn3270eTcpConnSrvrConfIndexEnt(mib, this);
                        this.tn3270eTcpConnActivationTime = new Tn3270eTcpConnActivationTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tn3270eTcpConnRemAddrType,
                            this.tn3270eTcpConnRemAddress,
                            this.tn3270eTcpConnRemPort,
                            this.tn3270eTcpConnLocalAddrType,
                            this.tn3270eTcpConnLocalAddress,
                            this.tn3270eTcpConnLocalPort,
                            this.tn3270eTcpConnLastActivity,
                            this.tn3270eTcpConnBytesIn,
                            this.tn3270eTcpConnBytesOut,
                            this.tn3270eTcpConnResourceElement,
                            this.tn3270eTcpConnResourceType,
                            this.tn3270eTcpConnDeviceType,
                            this.tn3270eTcpConnFunctions,
                            this.tn3270eTcpConnId,
                            this.tn3270eTcpConnClientIdFormat,
                            this.tn3270eTcpConnClientId,
                            this.tn3270eTcpConnTraceData,
                            this.tn3270eTcpConnLogInfo,
                            this.tn3270eTcpConnLuLuBindImage,
                            this.tn3270eTcpConnSnaState,
                            this.tn3270eTcpConnStateLastDiscReason,
                            this.tn3270eTcpConnSrvrConfIndex,
                            this.tn3270eTcpConnActivationTime
                        };
                    }
                    public static final class Tn3270eTcpConnRemAddrTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnRemAddrTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnRemAddrType", "1.3.6.1.2.1.34.8.1.9.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnRemAddressEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnRemAddressEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnRemAddress", "1.3.6.1.2.1.34.8.1.9.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnRemPortEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnRemPortEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnRemPort", "1.3.6.1.2.1.34.8.1.9.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnLocalAddrTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnLocalAddrTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnLocalAddrType", "1.3.6.1.2.1.34.8.1.9.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnLocalAddressEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnLocalAddressEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnLocalAddress", "1.3.6.1.2.1.34.8.1.9.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnLocalPortEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnLocalPortEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnLocalPort", "1.3.6.1.2.1.34.8.1.9.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnLastActivityEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnLastActivityEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnLastActivity", "1.3.6.1.2.1.34.8.1.9.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnBytesInEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnBytesInEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnBytesIn", "1.3.6.1.2.1.34.8.1.9.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnBytesOutEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnBytesOutEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnBytesOut", "1.3.6.1.2.1.34.8.1.9.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnResourceElementEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnResourceElementEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnResourceElement", "1.3.6.1.2.1.34.8.1.9.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnResourceTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnResourceTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnResourceType", "1.3.6.1.2.1.34.8.1.9.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnDeviceTypeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnDeviceTypeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnDeviceType", "1.3.6.1.2.1.34.8.1.9.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnFunctionsEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnFunctionsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnFunctions", "1.3.6.1.2.1.34.8.1.9.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnIdEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnIdEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnId", "1.3.6.1.2.1.34.8.1.9.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnClientIdFormatEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnClientIdFormatEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnClientIdFormat", "1.3.6.1.2.1.34.8.1.9.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnClientIdEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnClientIdEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnClientId", "1.3.6.1.2.1.34.8.1.9.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnTraceDataEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnTraceDataEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnTraceData", "1.3.6.1.2.1.34.8.1.9.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnLogInfoEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnLogInfoEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnLogInfo", "1.3.6.1.2.1.34.8.1.9.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnLuLuBindImageEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnLuLuBindImageEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnLuLuBindImage", "1.3.6.1.2.1.34.8.1.9.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnSnaStateEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnSnaStateEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnSnaState", "1.3.6.1.2.1.34.8.1.9.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnStateLastDiscReasonEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnStateLastDiscReasonEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnStateLastDiscReason", "1.3.6.1.2.1.34.8.1.9.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnSrvrConfIndexEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnSrvrConfIndexEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnSrvrConfIndex", "1.3.6.1.2.1.34.8.1.9.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Tn3270eTcpConnActivationTimeEnt extends MIBEntry<TN3270EMIBDef>
                    {
                        private Tn3270eTcpConnActivationTimeEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                        {
                            super(mib, parent, "tn3270eTcpConnActivationTime", "1.3.6.1.2.1.34.8.1.9.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Tn3270eConfSpinLockEnt extends MIBEntry<TN3270EMIBDef>
            {
                private Tn3270eConfSpinLockEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eConfSpinLock", "1.3.6.1.2.1.34.8.1.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Tn3270eConformanceEnt extends MIBEntry<TN3270EMIBDef>
        {
            /** Conformance Definitions*/
            public final Tn3270eGroupsEnt tn3270eGroups;

            public final Tn3270eCompliancesEnt tn3270eCompliances;

            private Tn3270eConformanceEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
            {
                super(mib, parent, "tn3270eConformance", "1.3.6.1.2.1.34.8.3", false, false, false, false);
                this.tn3270eGroups = new Tn3270eGroupsEnt(mib, this);
                this.tn3270eCompliances = new Tn3270eCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tn3270eGroups,
                    this.tn3270eCompliances
                };
            }
            public static final class Tn3270eGroupsEnt extends MIBEntry<TN3270EMIBDef>
            {
                /** units of conformance*/
                public final Tn3270eBasicGroupEnt tn3270eBasicGroup;

                public final Tn3270eSessionGroupEnt tn3270eSessionGroup;

                public final Tn3270eResMapGroupEnt tn3270eResMapGroup;

                public final Tn3270eHiCapacityGroupEnt tn3270eHiCapacityGroup;

                private Tn3270eGroupsEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eGroups", "1.3.6.1.2.1.34.8.3.1", false, false, false, false);
                    this.tn3270eBasicGroup = new Tn3270eBasicGroupEnt(mib, this);
                    this.tn3270eSessionGroup = new Tn3270eSessionGroupEnt(mib, this);
                    this.tn3270eResMapGroup = new Tn3270eResMapGroupEnt(mib, this);
                    this.tn3270eHiCapacityGroup = new Tn3270eHiCapacityGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eBasicGroup,
                        this.tn3270eSessionGroup,
                        this.tn3270eResMapGroup,
                        this.tn3270eHiCapacityGroup
                    };
                }
                public static final class Tn3270eBasicGroupEnt extends MIBEntry<TN3270EMIBDef>
                {
                    private Tn3270eBasicGroupEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eBasicGroup", "1.3.6.1.2.1.34.8.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Tn3270eSessionGroupEnt extends MIBEntry<TN3270EMIBDef>
                {
                    private Tn3270eSessionGroupEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eSessionGroup", "1.3.6.1.2.1.34.8.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Tn3270eResMapGroupEnt extends MIBEntry<TN3270EMIBDef>
                {
                    private Tn3270eResMapGroupEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eResMapGroup", "1.3.6.1.2.1.34.8.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Tn3270eHiCapacityGroupEnt extends MIBEntry<TN3270EMIBDef>
                {
                    private Tn3270eHiCapacityGroupEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eHiCapacityGroup", "1.3.6.1.2.1.34.8.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Tn3270eCompliancesEnt extends MIBEntry<TN3270EMIBDef>
            {
                /** compliance statements*/
                public final Tn3270eComplianceEnt tn3270eCompliance;

                private Tn3270eCompliancesEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                {
                    super(mib, parent, "tn3270eCompliances", "1.3.6.1.2.1.34.8.3.2", false, false, false, false);
                    this.tn3270eCompliance = new Tn3270eComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tn3270eCompliance
                    };
                }
                public static final class Tn3270eComplianceEnt extends MIBEntry<TN3270EMIBDef>
                {
                    private Tn3270eComplianceEnt(TN3270EMIBDef mib, MIBEntry<TN3270EMIBDef> parent)
                    {
                        super(mib, parent, "tn3270eCompliance", "1.3.6.1.2.1.34.8.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
