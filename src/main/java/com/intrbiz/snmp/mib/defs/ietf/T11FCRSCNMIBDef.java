package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**The Fibre Channel RSCN MIB

for the monitoring of registrations by Nx_Ports to receive
Registered State Change Notifications (RSCNs), and the
monitoring of RSCN usage.

[RFC2578]
[RFC2580]
[RFC2579]
[RFC4044]
[RFC4438]*/
public final class T11FCRSCNMIBDef extends MIB
{
    public static final T11FCRSCNMIBDef T11FCRSCNMIB = new T11FCRSCNMIBDef();

    /** [RFC4439]*/
    public final T11FcRscnMIBEnt t11FcRscnMIB;

    private T11FCRSCNMIBDef()
    {
        super("T11-FC-RSCN-MIB");
        this.t11FcRscnMIB = new T11FcRscnMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.t11FcRscnMIB
        };
    }

    public static final class T11FcRscnMIBEnt extends MIBEntry<T11FCRSCNMIBDef>
    {
        public final T11FcRscnNotificationsEnt t11FcRscnNotifications;

        public final T11FcRscnObjectsEnt t11FcRscnObjects;

        public final T11FcRscnConformanceEnt t11FcRscnConformance;

        private T11FcRscnMIBEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
        {
            super(mib, parent, "t11FcRscnMIB", "1.3.6.1.2.1.161", false, false, false, false);
            this.t11FcRscnNotifications = new T11FcRscnNotificationsEnt(mib, this);
            this.t11FcRscnObjects = new T11FcRscnObjectsEnt(mib, this);
            this.t11FcRscnConformance = new T11FcRscnConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.t11FcRscnNotifications,
                this.t11FcRscnObjects,
                this.t11FcRscnConformance
            };
        }
        public static final class T11FcRscnNotificationsEnt extends MIBEntry<T11FCRSCNMIBDef>
        {
            /** Notifications*/
            public final T11FcRscnElsRejectReqNotifyEnt t11FcRscnElsRejectReqNotify;

            public final T11FcRscnIlsRejectReqNotifyEnt t11FcRscnIlsRejectReqNotify;

            private T11FcRscnNotificationsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
            {
                super(mib, parent, "t11FcRscnNotifications", "1.3.6.1.2.1.161.0", false, false, false, false);
                this.t11FcRscnElsRejectReqNotify = new T11FcRscnElsRejectReqNotifyEnt(mib, this);
                this.t11FcRscnIlsRejectReqNotify = new T11FcRscnIlsRejectReqNotifyEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcRscnElsRejectReqNotify,
                    this.t11FcRscnIlsRejectReqNotify
                };
            }
            public static final class T11FcRscnElsRejectReqNotifyEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                private T11FcRscnElsRejectReqNotifyEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnElsRejectReqNotify", "1.3.6.1.2.1.161.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class T11FcRscnIlsRejectReqNotifyEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                private T11FcRscnIlsRejectReqNotifyEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnIlsRejectReqNotify", "1.3.6.1.2.1.161.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class T11FcRscnObjectsEnt extends MIBEntry<T11FCRSCNMIBDef>
        {
            public final T11FcRscnRegistrationsEnt t11FcRscnRegistrations;

            public final T11FcRscnStatsEnt t11FcRscnStats;

            public final T11FcRscnInformationEnt t11FcRscnInformation;

            private T11FcRscnObjectsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
            {
                super(mib, parent, "t11FcRscnObjects", "1.3.6.1.2.1.161.1", false, false, false, false);
                this.t11FcRscnRegistrations = new T11FcRscnRegistrationsEnt(mib, this);
                this.t11FcRscnStats = new T11FcRscnStatsEnt(mib, this);
                this.t11FcRscnInformation = new T11FcRscnInformationEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcRscnRegistrations,
                    this.t11FcRscnStats,
                    this.t11FcRscnInformation
                };
            }
            public static final class T11FcRscnRegistrationsEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                /** State Change Registration Table*/
                public final T11FcRscnRegTableEnt t11FcRscnRegTable;

                private T11FcRscnRegistrationsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnRegistrations", "1.3.6.1.2.1.161.1.1", false, false, false, false);
                    this.t11FcRscnRegTable = new T11FcRscnRegTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRscnRegTable
                    };
                }
                public static final class T11FcRscnRegTableEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    public final T11FcRscnRegEntryEnt t11FcRscnRegEntry;

                    private T11FcRscnRegTableEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnRegTable", "1.3.6.1.2.1.161.1.1.1", false, true, false, false);
                        this.t11FcRscnRegEntry = new T11FcRscnRegEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcRscnRegEntry
                        };
                    }
                    public static final class T11FcRscnRegEntryEnt extends MIBEntry<T11FCRSCNMIBDef>
                    {
                        public final T11FcRscnFabricIndexEnt t11FcRscnFabricIndex;

                        public final T11FcRscnRegFcIdEnt t11FcRscnRegFcId;

                        public final T11FcRscnRegTypeEnt t11FcRscnRegType;

                        private T11FcRscnRegEntryEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRscnRegEntry", "1.3.6.1.2.1.161.1.1.1.1", false, false, false, true);
                            this.t11FcRscnFabricIndex = new T11FcRscnFabricIndexEnt(mib, this);
                            this.t11FcRscnRegFcId = new T11FcRscnRegFcIdEnt(mib, this);
                            this.t11FcRscnRegType = new T11FcRscnRegTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcRscnFabricIndex,
                                this.t11FcRscnRegFcId,
                                this.t11FcRscnRegType
                            };
                        }
                        public static final class T11FcRscnFabricIndexEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnFabricIndexEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnFabricIndex", "1.3.6.1.2.1.161.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRegFcIdEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRegFcIdEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRegFcId", "1.3.6.1.2.1.161.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRegTypeEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRegTypeEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRegType", "1.3.6.1.2.1.161.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FcRscnStatsEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                /** Statistics*/
                public final T11FcRscnStatsTableEnt t11FcRscnStatsTable;

                private T11FcRscnStatsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnStats", "1.3.6.1.2.1.161.1.2", false, false, false, false);
                    this.t11FcRscnStatsTable = new T11FcRscnStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRscnStatsTable
                    };
                }
                public static final class T11FcRscnStatsTableEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    public final T11FcRscnStatsEntryEnt t11FcRscnStatsEntry;

                    private T11FcRscnStatsTableEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnStatsTable", "1.3.6.1.2.1.161.1.2.1", false, true, false, false);
                        this.t11FcRscnStatsEntry = new T11FcRscnStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcRscnStatsEntry
                        };
                    }
                    public static final class T11FcRscnStatsEntryEnt extends MIBEntry<T11FCRSCNMIBDef>
                    {
                        public final T11FcRscnInScrsEnt t11FcRscnInScrs;

                        public final T11FcRscnInRscnsEnt t11FcRscnInRscns;

                        public final T11FcRscnOutRscnsEnt t11FcRscnOutRscns;

                        public final T11FcRscnInSwRscnsEnt t11FcRscnInSwRscns;

                        public final T11FcRscnOutSwRscnsEnt t11FcRscnOutSwRscns;

                        public final T11FcRscnScrRejectsEnt t11FcRscnScrRejects;

                        public final T11FcRscnRscnRejectsEnt t11FcRscnRscnRejects;

                        public final T11FcRscnSwRscnRejectsEnt t11FcRscnSwRscnRejects;

                        public final T11FcRscnInUnspecifiedRscnsEnt t11FcRscnInUnspecifiedRscns;

                        public final T11FcRscnOutUnspecifiedRscnsEnt t11FcRscnOutUnspecifiedRscns;

                        public final T11FcRscnInChangedAttribRscnsEnt t11FcRscnInChangedAttribRscns;

                        public final T11FcRscnOutChangedAttribRscnsEnt t11FcRscnOutChangedAttribRscns;

                        public final T11FcRscnInChangedServiceRscnsEnt t11FcRscnInChangedServiceRscns;

                        public final T11FcRscnOutChangedServiceRscnsEnt t11FcRscnOutChangedServiceRscns;

                        public final T11FcRscnInChangedSwitchRscnsEnt t11FcRscnInChangedSwitchRscns;

                        public final T11FcRscnOutChangedSwitchRscnsEnt t11FcRscnOutChangedSwitchRscns;

                        public final T11FcRscnInRemovedRscnsEnt t11FcRscnInRemovedRscns;

                        public final T11FcRscnOutRemovedRscnsEnt t11FcRscnOutRemovedRscns;

                        private T11FcRscnStatsEntryEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRscnStatsEntry", "1.3.6.1.2.1.161.1.2.1.1", false, false, false, true);
                            this.t11FcRscnInScrs = new T11FcRscnInScrsEnt(mib, this);
                            this.t11FcRscnInRscns = new T11FcRscnInRscnsEnt(mib, this);
                            this.t11FcRscnOutRscns = new T11FcRscnOutRscnsEnt(mib, this);
                            this.t11FcRscnInSwRscns = new T11FcRscnInSwRscnsEnt(mib, this);
                            this.t11FcRscnOutSwRscns = new T11FcRscnOutSwRscnsEnt(mib, this);
                            this.t11FcRscnScrRejects = new T11FcRscnScrRejectsEnt(mib, this);
                            this.t11FcRscnRscnRejects = new T11FcRscnRscnRejectsEnt(mib, this);
                            this.t11FcRscnSwRscnRejects = new T11FcRscnSwRscnRejectsEnt(mib, this);
                            this.t11FcRscnInUnspecifiedRscns = new T11FcRscnInUnspecifiedRscnsEnt(mib, this);
                            this.t11FcRscnOutUnspecifiedRscns = new T11FcRscnOutUnspecifiedRscnsEnt(mib, this);
                            this.t11FcRscnInChangedAttribRscns = new T11FcRscnInChangedAttribRscnsEnt(mib, this);
                            this.t11FcRscnOutChangedAttribRscns = new T11FcRscnOutChangedAttribRscnsEnt(mib, this);
                            this.t11FcRscnInChangedServiceRscns = new T11FcRscnInChangedServiceRscnsEnt(mib, this);
                            this.t11FcRscnOutChangedServiceRscns = new T11FcRscnOutChangedServiceRscnsEnt(mib, this);
                            this.t11FcRscnInChangedSwitchRscns = new T11FcRscnInChangedSwitchRscnsEnt(mib, this);
                            this.t11FcRscnOutChangedSwitchRscns = new T11FcRscnOutChangedSwitchRscnsEnt(mib, this);
                            this.t11FcRscnInRemovedRscns = new T11FcRscnInRemovedRscnsEnt(mib, this);
                            this.t11FcRscnOutRemovedRscns = new T11FcRscnOutRemovedRscnsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcRscnInScrs,
                                this.t11FcRscnInRscns,
                                this.t11FcRscnOutRscns,
                                this.t11FcRscnInSwRscns,
                                this.t11FcRscnOutSwRscns,
                                this.t11FcRscnScrRejects,
                                this.t11FcRscnRscnRejects,
                                this.t11FcRscnSwRscnRejects,
                                this.t11FcRscnInUnspecifiedRscns,
                                this.t11FcRscnOutUnspecifiedRscns,
                                this.t11FcRscnInChangedAttribRscns,
                                this.t11FcRscnOutChangedAttribRscns,
                                this.t11FcRscnInChangedServiceRscns,
                                this.t11FcRscnOutChangedServiceRscns,
                                this.t11FcRscnInChangedSwitchRscns,
                                this.t11FcRscnOutChangedSwitchRscns,
                                this.t11FcRscnInRemovedRscns,
                                this.t11FcRscnOutRemovedRscns
                            };
                        }
                        public static final class T11FcRscnInScrsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInScrsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInScrs", "1.3.6.1.2.1.161.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInRscns", "1.3.6.1.2.1.161.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutRscns", "1.3.6.1.2.1.161.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInSwRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInSwRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInSwRscns", "1.3.6.1.2.1.161.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutSwRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutSwRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutSwRscns", "1.3.6.1.2.1.161.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnScrRejectsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnScrRejectsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnScrRejects", "1.3.6.1.2.1.161.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRscnRejectsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRscnRejectsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRscnRejects", "1.3.6.1.2.1.161.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnSwRscnRejectsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnSwRscnRejectsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnSwRscnRejects", "1.3.6.1.2.1.161.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInUnspecifiedRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInUnspecifiedRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInUnspecifiedRscns", "1.3.6.1.2.1.161.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutUnspecifiedRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutUnspecifiedRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutUnspecifiedRscns", "1.3.6.1.2.1.161.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInChangedAttribRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInChangedAttribRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInChangedAttribRscns", "1.3.6.1.2.1.161.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutChangedAttribRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutChangedAttribRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutChangedAttribRscns", "1.3.6.1.2.1.161.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInChangedServiceRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInChangedServiceRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInChangedServiceRscns", "1.3.6.1.2.1.161.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutChangedServiceRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutChangedServiceRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutChangedServiceRscns", "1.3.6.1.2.1.161.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInChangedSwitchRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInChangedSwitchRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInChangedSwitchRscns", "1.3.6.1.2.1.161.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutChangedSwitchRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutChangedSwitchRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutChangedSwitchRscns", "1.3.6.1.2.1.161.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnInRemovedRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnInRemovedRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnInRemovedRscns", "1.3.6.1.2.1.161.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnOutRemovedRscnsEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnOutRemovedRscnsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnOutRemovedRscns", "1.3.6.1.2.1.161.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class T11FcRscnInformationEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                /** Notification Control Table*/
                public final T11FcRscnNotifyControlTableEnt t11FcRscnNotifyControlTable;

                private T11FcRscnInformationEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnInformation", "1.3.6.1.2.1.161.1.3", false, false, false, false);
                    this.t11FcRscnNotifyControlTable = new T11FcRscnNotifyControlTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRscnNotifyControlTable
                    };
                }
                public static final class T11FcRscnNotifyControlTableEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    public final T11FcRscnNotifyControlEntryEnt t11FcRscnNotifyControlEntry;

                    private T11FcRscnNotifyControlTableEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnNotifyControlTable", "1.3.6.1.2.1.161.1.3.1", false, true, false, false);
                        this.t11FcRscnNotifyControlEntry = new T11FcRscnNotifyControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.t11FcRscnNotifyControlEntry
                        };
                    }
                    public static final class T11FcRscnNotifyControlEntryEnt extends MIBEntry<T11FCRSCNMIBDef>
                    {
                        public final T11FcRscnIlsRejectNotifyEnableEnt t11FcRscnIlsRejectNotifyEnable;

                        public final T11FcRscnElsRejectNotifyEnableEnt t11FcRscnElsRejectNotifyEnable;

                        public final T11FcRscnRejectedRequestStringEnt t11FcRscnRejectedRequestString;

                        public final T11FcRscnRejectedRequestSourceEnt t11FcRscnRejectedRequestSource;

                        public final T11FcRscnRejectReasonCodeEnt t11FcRscnRejectReasonCode;

                        public final T11FcRscnRejectReasonCodeExpEnt t11FcRscnRejectReasonCodeExp;

                        public final T11FcRscnRejectReasonVendorCodeEnt t11FcRscnRejectReasonVendorCode;

                        private T11FcRscnNotifyControlEntryEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                        {
                            super(mib, parent, "t11FcRscnNotifyControlEntry", "1.3.6.1.2.1.161.1.3.1.1", false, false, false, true);
                            this.t11FcRscnIlsRejectNotifyEnable = new T11FcRscnIlsRejectNotifyEnableEnt(mib, this);
                            this.t11FcRscnElsRejectNotifyEnable = new T11FcRscnElsRejectNotifyEnableEnt(mib, this);
                            this.t11FcRscnRejectedRequestString = new T11FcRscnRejectedRequestStringEnt(mib, this);
                            this.t11FcRscnRejectedRequestSource = new T11FcRscnRejectedRequestSourceEnt(mib, this);
                            this.t11FcRscnRejectReasonCode = new T11FcRscnRejectReasonCodeEnt(mib, this);
                            this.t11FcRscnRejectReasonCodeExp = new T11FcRscnRejectReasonCodeExpEnt(mib, this);
                            this.t11FcRscnRejectReasonVendorCode = new T11FcRscnRejectReasonVendorCodeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.t11FcRscnIlsRejectNotifyEnable,
                                this.t11FcRscnElsRejectNotifyEnable,
                                this.t11FcRscnRejectedRequestString,
                                this.t11FcRscnRejectedRequestSource,
                                this.t11FcRscnRejectReasonCode,
                                this.t11FcRscnRejectReasonCodeExp,
                                this.t11FcRscnRejectReasonVendorCode
                            };
                        }
                        public static final class T11FcRscnIlsRejectNotifyEnableEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnIlsRejectNotifyEnableEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnIlsRejectNotifyEnable", "1.3.6.1.2.1.161.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnElsRejectNotifyEnableEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnElsRejectNotifyEnableEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnElsRejectNotifyEnable", "1.3.6.1.2.1.161.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRejectedRequestStringEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRejectedRequestStringEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRejectedRequestString", "1.3.6.1.2.1.161.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRejectedRequestSourceEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRejectedRequestSourceEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRejectedRequestSource", "1.3.6.1.2.1.161.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRejectReasonCodeEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRejectReasonCodeEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRejectReasonCode", "1.3.6.1.2.1.161.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRejectReasonCodeExpEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRejectReasonCodeExpEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRejectReasonCodeExp", "1.3.6.1.2.1.161.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class T11FcRscnRejectReasonVendorCodeEnt extends MIBEntry<T11FCRSCNMIBDef>
                        {
                            private T11FcRscnRejectReasonVendorCodeEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                            {
                                super(mib, parent, "t11FcRscnRejectReasonVendorCode", "1.3.6.1.2.1.161.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class T11FcRscnConformanceEnt extends MIBEntry<T11FCRSCNMIBDef>
        {
            /** Conformance*/
            public final T11FcRscnCompliancesEnt t11FcRscnCompliances;

            public final T11FcRscnGroupsEnt t11FcRscnGroups;

            private T11FcRscnConformanceEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
            {
                super(mib, parent, "t11FcRscnConformance", "1.3.6.1.2.1.161.2", false, false, false, false);
                this.t11FcRscnCompliances = new T11FcRscnCompliancesEnt(mib, this);
                this.t11FcRscnGroups = new T11FcRscnGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.t11FcRscnCompliances,
                    this.t11FcRscnGroups
                };
            }
            public static final class T11FcRscnCompliancesEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                public final T11FcRscnComplianceEnt t11FcRscnCompliance;

                private T11FcRscnCompliancesEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnCompliances", "1.3.6.1.2.1.161.2.1", false, false, false, false);
                    this.t11FcRscnCompliance = new T11FcRscnComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRscnCompliance
                    };
                }
                public static final class T11FcRscnComplianceEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    private T11FcRscnComplianceEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnCompliance", "1.3.6.1.2.1.161.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class T11FcRscnGroupsEnt extends MIBEntry<T11FCRSCNMIBDef>
            {
                /** Units of conformance*/
                public final T11FcRscnRegistrationGroupEnt t11FcRscnRegistrationGroup;

                public final T11FcRscnStatsGroupEnt t11FcRscnStatsGroup;

                public final T11FcRscnNotifyControlGroupEnt t11FcRscnNotifyControlGroup;

                public final T11FcRscnNotifyGroupEnt t11FcRscnNotifyGroup;

                private T11FcRscnGroupsEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                {
                    super(mib, parent, "t11FcRscnGroups", "1.3.6.1.2.1.161.2.2", false, false, false, false);
                    this.t11FcRscnRegistrationGroup = new T11FcRscnRegistrationGroupEnt(mib, this);
                    this.t11FcRscnStatsGroup = new T11FcRscnStatsGroupEnt(mib, this);
                    this.t11FcRscnNotifyControlGroup = new T11FcRscnNotifyControlGroupEnt(mib, this);
                    this.t11FcRscnNotifyGroup = new T11FcRscnNotifyGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.t11FcRscnRegistrationGroup,
                        this.t11FcRscnStatsGroup,
                        this.t11FcRscnNotifyControlGroup,
                        this.t11FcRscnNotifyGroup
                    };
                }
                public static final class T11FcRscnRegistrationGroupEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    private T11FcRscnRegistrationGroupEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnRegistrationGroup", "1.3.6.1.2.1.161.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcRscnStatsGroupEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    private T11FcRscnStatsGroupEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnStatsGroup", "1.3.6.1.2.1.161.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcRscnNotifyControlGroupEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    private T11FcRscnNotifyControlGroupEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnNotifyControlGroup", "1.3.6.1.2.1.161.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class T11FcRscnNotifyGroupEnt extends MIBEntry<T11FCRSCNMIBDef>
                {
                    private T11FcRscnNotifyGroupEnt(T11FCRSCNMIBDef mib, MIBEntry<T11FCRSCNMIBDef> parent)
                    {
                        super(mib, parent, "t11FcRscnNotifyGroup", "1.3.6.1.2.1.161.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
