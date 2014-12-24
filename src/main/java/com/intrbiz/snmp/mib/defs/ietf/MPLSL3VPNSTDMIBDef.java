package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2863]
[RFC4265]
[RFC3411]
[RTPROTO]
[RFC4001]
[RFC3811]
[RFC3813]*/
public final class MPLSL3VPNSTDMIBDef extends MIB
{
    public static final MPLSL3VPNSTDMIBDef MPLSL3VPNSTDMIB = new MPLSL3VPNSTDMIBDef();

    /** 23 January 2006*/
    public final MplsL3VpnMIBEnt mplsL3VpnMIB;

    private MPLSL3VPNSTDMIBDef()
    {
        super("MPLS-L3VPN-STD-MIB");
        this.mplsL3VpnMIB = new MplsL3VpnMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsL3VpnMIB
        };
    }

    public static final class MplsL3VpnMIBEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
    {
        /** Top level components of this MIB.*/
        public final MplsL3VpnNotificationsEnt mplsL3VpnNotifications;

        public final MplsL3VpnObjectsEnt mplsL3VpnObjects;

        public final MplsL3VpnConformanceEnt mplsL3VpnConformance;

        private MplsL3VpnMIBEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
        {
            super(mib, parent, "mplsL3VpnMIB", "1.3.6.1.2.1.10.166.11", false, false, false, false);
            this.mplsL3VpnNotifications = new MplsL3VpnNotificationsEnt(mib, this);
            this.mplsL3VpnObjects = new MplsL3VpnObjectsEnt(mib, this);
            this.mplsL3VpnConformance = new MplsL3VpnConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsL3VpnNotifications,
                this.mplsL3VpnObjects,
                this.mplsL3VpnConformance
            };
        }
        public static final class MplsL3VpnNotificationsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
        {
            /** MPLS L3VPN Notifications*/
            public final MplsL3VpnVrfUpEnt mplsL3VpnVrfUp;

            public final MplsL3VpnVrfDownEnt mplsL3VpnVrfDown;

            public final MplsL3VpnVrfRouteMidThreshExceededEnt mplsL3VpnVrfRouteMidThreshExceeded;

            public final MplsL3VpnVrfNumVrfRouteMaxThreshExceededEnt mplsL3VpnVrfNumVrfRouteMaxThreshExceeded;

            public final MplsL3VpnNumVrfSecIllglLblThrshExcdEnt mplsL3VpnNumVrfSecIllglLblThrshExcd;

            public final MplsL3VpnNumVrfRouteMaxThreshClearedEnt mplsL3VpnNumVrfRouteMaxThreshCleared;

            private MplsL3VpnNotificationsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
            {
                super(mib, parent, "mplsL3VpnNotifications", "1.3.6.1.2.1.10.166.11.0", false, false, false, false);
                this.mplsL3VpnVrfUp = new MplsL3VpnVrfUpEnt(mib, this);
                this.mplsL3VpnVrfDown = new MplsL3VpnVrfDownEnt(mib, this);
                this.mplsL3VpnVrfRouteMidThreshExceeded = new MplsL3VpnVrfRouteMidThreshExceededEnt(mib, this);
                this.mplsL3VpnVrfNumVrfRouteMaxThreshExceeded = new MplsL3VpnVrfNumVrfRouteMaxThreshExceededEnt(mib, this);
                this.mplsL3VpnNumVrfSecIllglLblThrshExcd = new MplsL3VpnNumVrfSecIllglLblThrshExcdEnt(mib, this);
                this.mplsL3VpnNumVrfRouteMaxThreshCleared = new MplsL3VpnNumVrfRouteMaxThreshClearedEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsL3VpnVrfUp,
                    this.mplsL3VpnVrfDown,
                    this.mplsL3VpnVrfRouteMidThreshExceeded,
                    this.mplsL3VpnVrfNumVrfRouteMaxThreshExceeded,
                    this.mplsL3VpnNumVrfSecIllglLblThrshExcd,
                    this.mplsL3VpnNumVrfRouteMaxThreshCleared
                };
            }
            public static final class MplsL3VpnVrfUpEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                private MplsL3VpnVrfUpEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnVrfUp", "1.3.6.1.2.1.10.166.11.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsL3VpnVrfDownEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                private MplsL3VpnVrfDownEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnVrfDown", "1.3.6.1.2.1.10.166.11.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsL3VpnVrfRouteMidThreshExceededEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                private MplsL3VpnVrfRouteMidThreshExceededEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnVrfRouteMidThreshExceeded", "1.3.6.1.2.1.10.166.11.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsL3VpnVrfNumVrfRouteMaxThreshExceededEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                private MplsL3VpnVrfNumVrfRouteMaxThreshExceededEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnVrfNumVrfRouteMaxThreshExceeded", "1.3.6.1.2.1.10.166.11.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsL3VpnNumVrfSecIllglLblThrshExcdEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                private MplsL3VpnNumVrfSecIllglLblThrshExcdEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnNumVrfSecIllglLblThrshExcd", "1.3.6.1.2.1.10.166.11.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsL3VpnNumVrfRouteMaxThreshClearedEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                private MplsL3VpnNumVrfRouteMaxThreshClearedEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnNumVrfRouteMaxThreshCleared", "1.3.6.1.2.1.10.166.11.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsL3VpnObjectsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
        {
            public final MplsL3VpnScalarsEnt mplsL3VpnScalars;

            public final MplsL3VpnConfEnt mplsL3VpnConf;

            public final MplsL3VpnPerfEnt mplsL3VpnPerf;

            public final MplsL3VpnRouteEnt mplsL3VpnRoute;

            private MplsL3VpnObjectsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
            {
                super(mib, parent, "mplsL3VpnObjects", "1.3.6.1.2.1.10.166.11.1", false, false, false, false);
                this.mplsL3VpnScalars = new MplsL3VpnScalarsEnt(mib, this);
                this.mplsL3VpnConf = new MplsL3VpnConfEnt(mib, this);
                this.mplsL3VpnPerf = new MplsL3VpnPerfEnt(mib, this);
                this.mplsL3VpnRoute = new MplsL3VpnRouteEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsL3VpnScalars,
                    this.mplsL3VpnConf,
                    this.mplsL3VpnPerf,
                    this.mplsL3VpnRoute
                };
            }
            public static final class MplsL3VpnScalarsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                /** Scalar Objects*/
                public final MplsL3VpnConfiguredVrfsEnt mplsL3VpnConfiguredVrfs;

                public final MplsL3VpnActiveVrfsEnt mplsL3VpnActiveVrfs;

                public final MplsL3VpnConnectedInterfacesEnt mplsL3VpnConnectedInterfaces;

                public final MplsL3VpnNotificationEnableEnt mplsL3VpnNotificationEnable;

                public final MplsL3VpnVrfConfMaxPossRtsEnt mplsL3VpnVrfConfMaxPossRts;

                public final MplsL3VpnVrfConfRteMxThrshTimeEnt mplsL3VpnVrfConfRteMxThrshTime;

                public final MplsL3VpnIllLblRcvThrshEnt mplsL3VpnIllLblRcvThrsh;

                private MplsL3VpnScalarsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnScalars", "1.3.6.1.2.1.10.166.11.1.1", false, false, false, false);
                    this.mplsL3VpnConfiguredVrfs = new MplsL3VpnConfiguredVrfsEnt(mib, this);
                    this.mplsL3VpnActiveVrfs = new MplsL3VpnActiveVrfsEnt(mib, this);
                    this.mplsL3VpnConnectedInterfaces = new MplsL3VpnConnectedInterfacesEnt(mib, this);
                    this.mplsL3VpnNotificationEnable = new MplsL3VpnNotificationEnableEnt(mib, this);
                    this.mplsL3VpnVrfConfMaxPossRts = new MplsL3VpnVrfConfMaxPossRtsEnt(mib, this);
                    this.mplsL3VpnVrfConfRteMxThrshTime = new MplsL3VpnVrfConfRteMxThrshTimeEnt(mib, this);
                    this.mplsL3VpnIllLblRcvThrsh = new MplsL3VpnIllLblRcvThrshEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsL3VpnConfiguredVrfs,
                        this.mplsL3VpnActiveVrfs,
                        this.mplsL3VpnConnectedInterfaces,
                        this.mplsL3VpnNotificationEnable,
                        this.mplsL3VpnVrfConfMaxPossRts,
                        this.mplsL3VpnVrfConfRteMxThrshTime,
                        this.mplsL3VpnIllLblRcvThrsh
                    };
                }
                public static final class MplsL3VpnConfiguredVrfsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnConfiguredVrfsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnConfiguredVrfs", "1.3.6.1.2.1.10.166.11.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnActiveVrfsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnActiveVrfsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnActiveVrfs", "1.3.6.1.2.1.10.166.11.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnConnectedInterfacesEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnConnectedInterfacesEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnConnectedInterfaces", "1.3.6.1.2.1.10.166.11.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnNotificationEnableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnNotificationEnableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnNotificationEnable", "1.3.6.1.2.1.10.166.11.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnVrfConfMaxPossRtsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnVrfConfMaxPossRtsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfConfMaxPossRts", "1.3.6.1.2.1.10.166.11.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnVrfConfRteMxThrshTimeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnVrfConfRteMxThrshTimeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfConfRteMxThrshTime", "1.3.6.1.2.1.10.166.11.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnIllLblRcvThrshEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnIllLblRcvThrshEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnIllLblRcvThrsh", "1.3.6.1.2.1.10.166.11.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsL3VpnConfEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                /** VPN Interface Configuration Table*/
                public final MplsL3VpnIfConfTableEnt mplsL3VpnIfConfTable;

                /** VRF Configuration Table*/
                public final MplsL3VpnVrfTableEnt mplsL3VpnVrfTable;

                /** MplsL3VpnVrfRTTable*/
                public final MplsL3VpnVrfRTTableEnt mplsL3VpnVrfRTTable;

                /** VRF Security Table*/
                public final MplsL3VpnVrfSecTableEnt mplsL3VpnVrfSecTable;

                private MplsL3VpnConfEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnConf", "1.3.6.1.2.1.10.166.11.1.2", false, false, false, false);
                    this.mplsL3VpnIfConfTable = new MplsL3VpnIfConfTableEnt(mib, this);
                    this.mplsL3VpnVrfTable = new MplsL3VpnVrfTableEnt(mib, this);
                    this.mplsL3VpnVrfRTTable = new MplsL3VpnVrfRTTableEnt(mib, this);
                    this.mplsL3VpnVrfSecTable = new MplsL3VpnVrfSecTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsL3VpnIfConfTable,
                        this.mplsL3VpnVrfTable,
                        this.mplsL3VpnVrfRTTable,
                        this.mplsL3VpnVrfSecTable
                    };
                }
                public static final class MplsL3VpnIfConfTableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    public final MplsL3VpnIfConfEntryEnt mplsL3VpnIfConfEntry;

                    private MplsL3VpnIfConfTableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnIfConfTable", "1.3.6.1.2.1.10.166.11.1.2.1", false, true, false, false);
                        this.mplsL3VpnIfConfEntry = new MplsL3VpnIfConfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsL3VpnIfConfEntry
                        };
                    }
                    public static final class MplsL3VpnIfConfEntryEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                    {
                        public final MplsL3VpnIfConfIndexEnt mplsL3VpnIfConfIndex;

                        public final MplsL3VpnIfVpnClassificationEnt mplsL3VpnIfVpnClassification;

                        public final MplsL3VpnIfVpnRouteDistProtocolEnt mplsL3VpnIfVpnRouteDistProtocol;

                        public final MplsL3VpnIfConfStorageTypeEnt mplsL3VpnIfConfStorageType;

                        public final MplsL3VpnIfConfRowStatusEnt mplsL3VpnIfConfRowStatus;

                        private MplsL3VpnIfConfEntryEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsL3VpnIfConfEntry", "1.3.6.1.2.1.10.166.11.1.2.1.1", false, false, false, true);
                            this.mplsL3VpnIfConfIndex = new MplsL3VpnIfConfIndexEnt(mib, this);
                            this.mplsL3VpnIfVpnClassification = new MplsL3VpnIfVpnClassificationEnt(mib, this);
                            this.mplsL3VpnIfVpnRouteDistProtocol = new MplsL3VpnIfVpnRouteDistProtocolEnt(mib, this);
                            this.mplsL3VpnIfConfStorageType = new MplsL3VpnIfConfStorageTypeEnt(mib, this);
                            this.mplsL3VpnIfConfRowStatus = new MplsL3VpnIfConfRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsL3VpnIfConfIndex,
                                this.mplsL3VpnIfVpnClassification,
                                this.mplsL3VpnIfVpnRouteDistProtocol,
                                this.mplsL3VpnIfConfStorageType,
                                this.mplsL3VpnIfConfRowStatus
                            };
                        }
                        public static final class MplsL3VpnIfConfIndexEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnIfConfIndexEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnIfConfIndex", "1.3.6.1.2.1.10.166.11.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnIfVpnClassificationEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnIfVpnClassificationEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnIfVpnClassification", "1.3.6.1.2.1.10.166.11.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnIfVpnRouteDistProtocolEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnIfVpnRouteDistProtocolEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnIfVpnRouteDistProtocol", "1.3.6.1.2.1.10.166.11.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnIfConfStorageTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnIfConfStorageTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnIfConfStorageType", "1.3.6.1.2.1.10.166.11.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnIfConfRowStatusEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnIfConfRowStatusEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnIfConfRowStatus", "1.3.6.1.2.1.10.166.11.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsL3VpnVrfTableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    public final MplsL3VpnVrfEntryEnt mplsL3VpnVrfEntry;

                    private MplsL3VpnVrfTableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfTable", "1.3.6.1.2.1.10.166.11.1.2.2", false, true, false, false);
                        this.mplsL3VpnVrfEntry = new MplsL3VpnVrfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsL3VpnVrfEntry
                        };
                    }
                    public static final class MplsL3VpnVrfEntryEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                    {
                        public final MplsL3VpnVrfNameEnt mplsL3VpnVrfName;

                        public final MplsL3VpnVrfVpnIdEnt mplsL3VpnVrfVpnId;

                        public final MplsL3VpnVrfDescriptionEnt mplsL3VpnVrfDescription;

                        public final MplsL3VpnVrfRDEnt mplsL3VpnVrfRD;

                        public final MplsL3VpnVrfCreationTimeEnt mplsL3VpnVrfCreationTime;

                        public final MplsL3VpnVrfOperStatusEnt mplsL3VpnVrfOperStatus;

                        public final MplsL3VpnVrfActiveInterfacesEnt mplsL3VpnVrfActiveInterfaces;

                        public final MplsL3VpnVrfAssociatedInterfacesEnt mplsL3VpnVrfAssociatedInterfaces;

                        public final MplsL3VpnVrfConfMidRteThreshEnt mplsL3VpnVrfConfMidRteThresh;

                        public final MplsL3VpnVrfConfHighRteThreshEnt mplsL3VpnVrfConfHighRteThresh;

                        public final MplsL3VpnVrfConfMaxRoutesEnt mplsL3VpnVrfConfMaxRoutes;

                        public final MplsL3VpnVrfConfLastChangedEnt mplsL3VpnVrfConfLastChanged;

                        public final MplsL3VpnVrfConfRowStatusEnt mplsL3VpnVrfConfRowStatus;

                        public final MplsL3VpnVrfConfAdminStatusEnt mplsL3VpnVrfConfAdminStatus;

                        public final MplsL3VpnVrfConfStorageTypeEnt mplsL3VpnVrfConfStorageType;

                        private MplsL3VpnVrfEntryEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsL3VpnVrfEntry", "1.3.6.1.2.1.10.166.11.1.2.2.1", false, false, false, true);
                            this.mplsL3VpnVrfName = new MplsL3VpnVrfNameEnt(mib, this);
                            this.mplsL3VpnVrfVpnId = new MplsL3VpnVrfVpnIdEnt(mib, this);
                            this.mplsL3VpnVrfDescription = new MplsL3VpnVrfDescriptionEnt(mib, this);
                            this.mplsL3VpnVrfRD = new MplsL3VpnVrfRDEnt(mib, this);
                            this.mplsL3VpnVrfCreationTime = new MplsL3VpnVrfCreationTimeEnt(mib, this);
                            this.mplsL3VpnVrfOperStatus = new MplsL3VpnVrfOperStatusEnt(mib, this);
                            this.mplsL3VpnVrfActiveInterfaces = new MplsL3VpnVrfActiveInterfacesEnt(mib, this);
                            this.mplsL3VpnVrfAssociatedInterfaces = new MplsL3VpnVrfAssociatedInterfacesEnt(mib, this);
                            this.mplsL3VpnVrfConfMidRteThresh = new MplsL3VpnVrfConfMidRteThreshEnt(mib, this);
                            this.mplsL3VpnVrfConfHighRteThresh = new MplsL3VpnVrfConfHighRteThreshEnt(mib, this);
                            this.mplsL3VpnVrfConfMaxRoutes = new MplsL3VpnVrfConfMaxRoutesEnt(mib, this);
                            this.mplsL3VpnVrfConfLastChanged = new MplsL3VpnVrfConfLastChangedEnt(mib, this);
                            this.mplsL3VpnVrfConfRowStatus = new MplsL3VpnVrfConfRowStatusEnt(mib, this);
                            this.mplsL3VpnVrfConfAdminStatus = new MplsL3VpnVrfConfAdminStatusEnt(mib, this);
                            this.mplsL3VpnVrfConfStorageType = new MplsL3VpnVrfConfStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsL3VpnVrfName,
                                this.mplsL3VpnVrfVpnId,
                                this.mplsL3VpnVrfDescription,
                                this.mplsL3VpnVrfRD,
                                this.mplsL3VpnVrfCreationTime,
                                this.mplsL3VpnVrfOperStatus,
                                this.mplsL3VpnVrfActiveInterfaces,
                                this.mplsL3VpnVrfAssociatedInterfaces,
                                this.mplsL3VpnVrfConfMidRteThresh,
                                this.mplsL3VpnVrfConfHighRteThresh,
                                this.mplsL3VpnVrfConfMaxRoutes,
                                this.mplsL3VpnVrfConfLastChanged,
                                this.mplsL3VpnVrfConfRowStatus,
                                this.mplsL3VpnVrfConfAdminStatus,
                                this.mplsL3VpnVrfConfStorageType
                            };
                        }
                        public static final class MplsL3VpnVrfNameEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfNameEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfName", "1.3.6.1.2.1.10.166.11.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfVpnIdEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfVpnIdEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfVpnId", "1.3.6.1.2.1.10.166.11.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfDescriptionEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfDescriptionEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfDescription", "1.3.6.1.2.1.10.166.11.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRDEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRDEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRD", "1.3.6.1.2.1.10.166.11.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfCreationTimeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfCreationTimeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfCreationTime", "1.3.6.1.2.1.10.166.11.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfOperStatusEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfOperStatusEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfOperStatus", "1.3.6.1.2.1.10.166.11.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfActiveInterfacesEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfActiveInterfacesEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfActiveInterfaces", "1.3.6.1.2.1.10.166.11.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfAssociatedInterfacesEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfAssociatedInterfacesEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfAssociatedInterfaces", "1.3.6.1.2.1.10.166.11.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfMidRteThreshEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfMidRteThreshEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfMidRteThresh", "1.3.6.1.2.1.10.166.11.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfHighRteThreshEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfHighRteThreshEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfHighRteThresh", "1.3.6.1.2.1.10.166.11.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfMaxRoutesEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfMaxRoutesEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfMaxRoutes", "1.3.6.1.2.1.10.166.11.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfLastChangedEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfLastChangedEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfLastChanged", "1.3.6.1.2.1.10.166.11.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfRowStatusEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfRowStatusEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfRowStatus", "1.3.6.1.2.1.10.166.11.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfAdminStatusEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfAdminStatusEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfAdminStatus", "1.3.6.1.2.1.10.166.11.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfConfStorageTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfConfStorageTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfConfStorageType", "1.3.6.1.2.1.10.166.11.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsL3VpnVrfRTTableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    public final MplsL3VpnVrfRTEntryEnt mplsL3VpnVrfRTEntry;

                    private MplsL3VpnVrfRTTableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfRTTable", "1.3.6.1.2.1.10.166.11.1.2.3", false, true, false, false);
                        this.mplsL3VpnVrfRTEntry = new MplsL3VpnVrfRTEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsL3VpnVrfRTEntry
                        };
                    }
                    public static final class MplsL3VpnVrfRTEntryEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                    {
                        public final MplsL3VpnVrfRTIndexEnt mplsL3VpnVrfRTIndex;

                        public final MplsL3VpnVrfRTTypeEnt mplsL3VpnVrfRTType;

                        public final MplsL3VpnVrfRTEnt mplsL3VpnVrfRT;

                        public final MplsL3VpnVrfRTDescrEnt mplsL3VpnVrfRTDescr;

                        public final MplsL3VpnVrfRTRowStatusEnt mplsL3VpnVrfRTRowStatus;

                        public final MplsL3VpnVrfRTStorageTypeEnt mplsL3VpnVrfRTStorageType;

                        private MplsL3VpnVrfRTEntryEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsL3VpnVrfRTEntry", "1.3.6.1.2.1.10.166.11.1.2.3.1", false, false, false, true);
                            this.mplsL3VpnVrfRTIndex = new MplsL3VpnVrfRTIndexEnt(mib, this);
                            this.mplsL3VpnVrfRTType = new MplsL3VpnVrfRTTypeEnt(mib, this);
                            this.mplsL3VpnVrfRT = new MplsL3VpnVrfRTEnt(mib, this);
                            this.mplsL3VpnVrfRTDescr = new MplsL3VpnVrfRTDescrEnt(mib, this);
                            this.mplsL3VpnVrfRTRowStatus = new MplsL3VpnVrfRTRowStatusEnt(mib, this);
                            this.mplsL3VpnVrfRTStorageType = new MplsL3VpnVrfRTStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsL3VpnVrfRTIndex,
                                this.mplsL3VpnVrfRTType,
                                this.mplsL3VpnVrfRT,
                                this.mplsL3VpnVrfRTDescr,
                                this.mplsL3VpnVrfRTRowStatus,
                                this.mplsL3VpnVrfRTStorageType
                            };
                        }
                        public static final class MplsL3VpnVrfRTIndexEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRTIndexEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRTIndex", "1.3.6.1.2.1.10.166.11.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRTTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRTTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRTType", "1.3.6.1.2.1.10.166.11.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRTEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRTEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRT", "1.3.6.1.2.1.10.166.11.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRTDescrEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRTDescrEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRTDescr", "1.3.6.1.2.1.10.166.11.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRTRowStatusEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRTRowStatusEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRTRowStatus", "1.3.6.1.2.1.10.166.11.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRTStorageTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRTStorageTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRTStorageType", "1.3.6.1.2.1.10.166.11.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsL3VpnVrfSecTableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    public final MplsL3VpnVrfSecEntryEnt mplsL3VpnVrfSecEntry;

                    private MplsL3VpnVrfSecTableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfSecTable", "1.3.6.1.2.1.10.166.11.1.2.6", false, true, false, false);
                        this.mplsL3VpnVrfSecEntry = new MplsL3VpnVrfSecEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsL3VpnVrfSecEntry
                        };
                    }
                    public static final class MplsL3VpnVrfSecEntryEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                    {
                        public final MplsL3VpnVrfSecIllegalLblVltnsEnt mplsL3VpnVrfSecIllegalLblVltns;

                        public final MplsL3VpnVrfSecDiscontinuityTimeEnt mplsL3VpnVrfSecDiscontinuityTime;

                        private MplsL3VpnVrfSecEntryEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsL3VpnVrfSecEntry", "1.3.6.1.2.1.10.166.11.1.2.6.1", false, false, false, true);
                            this.mplsL3VpnVrfSecIllegalLblVltns = new MplsL3VpnVrfSecIllegalLblVltnsEnt(mib, this);
                            this.mplsL3VpnVrfSecDiscontinuityTime = new MplsL3VpnVrfSecDiscontinuityTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsL3VpnVrfSecIllegalLblVltns,
                                this.mplsL3VpnVrfSecDiscontinuityTime
                            };
                        }
                        public static final class MplsL3VpnVrfSecIllegalLblVltnsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfSecIllegalLblVltnsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfSecIllegalLblVltns", "1.3.6.1.2.1.10.166.11.1.2.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfSecDiscontinuityTimeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfSecDiscontinuityTimeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfSecDiscontinuityTime", "1.3.6.1.2.1.10.166.11.1.2.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MplsL3VpnPerfEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                /** VRF Performance Table*/
                public final MplsL3VpnVrfPerfTableEnt mplsL3VpnVrfPerfTable;

                private MplsL3VpnPerfEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnPerf", "1.3.6.1.2.1.10.166.11.1.3", false, false, false, false);
                    this.mplsL3VpnVrfPerfTable = new MplsL3VpnVrfPerfTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsL3VpnVrfPerfTable
                    };
                }
                public static final class MplsL3VpnVrfPerfTableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    public final MplsL3VpnVrfPerfEntryEnt mplsL3VpnVrfPerfEntry;

                    private MplsL3VpnVrfPerfTableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfPerfTable", "1.3.6.1.2.1.10.166.11.1.3.1", false, true, false, false);
                        this.mplsL3VpnVrfPerfEntry = new MplsL3VpnVrfPerfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsL3VpnVrfPerfEntry
                        };
                    }
                    public static final class MplsL3VpnVrfPerfEntryEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                    {
                        public final MplsL3VpnVrfPerfRoutesAddedEnt mplsL3VpnVrfPerfRoutesAdded;

                        public final MplsL3VpnVrfPerfRoutesDeletedEnt mplsL3VpnVrfPerfRoutesDeleted;

                        public final MplsL3VpnVrfPerfCurrNumRoutesEnt mplsL3VpnVrfPerfCurrNumRoutes;

                        public final MplsL3VpnVrfPerfRoutesDroppedEnt mplsL3VpnVrfPerfRoutesDropped;

                        public final MplsL3VpnVrfPerfDiscTimeEnt mplsL3VpnVrfPerfDiscTime;

                        private MplsL3VpnVrfPerfEntryEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsL3VpnVrfPerfEntry", "1.3.6.1.2.1.10.166.11.1.3.1.1", false, false, false, true);
                            this.mplsL3VpnVrfPerfRoutesAdded = new MplsL3VpnVrfPerfRoutesAddedEnt(mib, this);
                            this.mplsL3VpnVrfPerfRoutesDeleted = new MplsL3VpnVrfPerfRoutesDeletedEnt(mib, this);
                            this.mplsL3VpnVrfPerfCurrNumRoutes = new MplsL3VpnVrfPerfCurrNumRoutesEnt(mib, this);
                            this.mplsL3VpnVrfPerfRoutesDropped = new MplsL3VpnVrfPerfRoutesDroppedEnt(mib, this);
                            this.mplsL3VpnVrfPerfDiscTime = new MplsL3VpnVrfPerfDiscTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsL3VpnVrfPerfRoutesAdded,
                                this.mplsL3VpnVrfPerfRoutesDeleted,
                                this.mplsL3VpnVrfPerfCurrNumRoutes,
                                this.mplsL3VpnVrfPerfRoutesDropped,
                                this.mplsL3VpnVrfPerfDiscTime
                            };
                        }
                        public static final class MplsL3VpnVrfPerfRoutesAddedEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfPerfRoutesAddedEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfPerfRoutesAdded", "1.3.6.1.2.1.10.166.11.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfPerfRoutesDeletedEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfPerfRoutesDeletedEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfPerfRoutesDeleted", "1.3.6.1.2.1.10.166.11.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfPerfCurrNumRoutesEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfPerfCurrNumRoutesEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfPerfCurrNumRoutes", "1.3.6.1.2.1.10.166.11.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfPerfRoutesDroppedEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfPerfRoutesDroppedEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfPerfRoutesDropped", "1.3.6.1.2.1.10.166.11.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfPerfDiscTimeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfPerfDiscTimeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfPerfDiscTime", "1.3.6.1.2.1.10.166.11.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MplsL3VpnRouteEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                /** VRF Routing Table*/
                public final MplsL3VpnVrfRteTableEnt mplsL3VpnVrfRteTable;

                private MplsL3VpnRouteEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnRoute", "1.3.6.1.2.1.10.166.11.1.4", false, false, false, false);
                    this.mplsL3VpnVrfRteTable = new MplsL3VpnVrfRteTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsL3VpnVrfRteTable
                    };
                }
                public static final class MplsL3VpnVrfRteTableEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    public final MplsL3VpnVrfRteEntryEnt mplsL3VpnVrfRteEntry;

                    private MplsL3VpnVrfRteTableEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfRteTable", "1.3.6.1.2.1.10.166.11.1.4.1", false, true, false, false);
                        this.mplsL3VpnVrfRteEntry = new MplsL3VpnVrfRteEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsL3VpnVrfRteEntry
                        };
                    }
                    public static final class MplsL3VpnVrfRteEntryEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                    {
                        public final MplsL3VpnVrfRteInetCidrDestTypeEnt mplsL3VpnVrfRteInetCidrDestType;

                        public final MplsL3VpnVrfRteInetCidrDestEnt mplsL3VpnVrfRteInetCidrDest;

                        public final MplsL3VpnVrfRteInetCidrPfxLenEnt mplsL3VpnVrfRteInetCidrPfxLen;

                        public final MplsL3VpnVrfRteInetCidrPolicyEnt mplsL3VpnVrfRteInetCidrPolicy;

                        public final MplsL3VpnVrfRteInetCidrNHopTypeEnt mplsL3VpnVrfRteInetCidrNHopType;

                        public final MplsL3VpnVrfRteInetCidrNextHopEnt mplsL3VpnVrfRteInetCidrNextHop;

                        public final MplsL3VpnVrfRteInetCidrIfIndexEnt mplsL3VpnVrfRteInetCidrIfIndex;

                        public final MplsL3VpnVrfRteInetCidrTypeEnt mplsL3VpnVrfRteInetCidrType;

                        public final MplsL3VpnVrfRteInetCidrProtoEnt mplsL3VpnVrfRteInetCidrProto;

                        public final MplsL3VpnVrfRteInetCidrAgeEnt mplsL3VpnVrfRteInetCidrAge;

                        public final MplsL3VpnVrfRteInetCidrNextHopASEnt mplsL3VpnVrfRteInetCidrNextHopAS;

                        public final MplsL3VpnVrfRteInetCidrMetric1Ent mplsL3VpnVrfRteInetCidrMetric1;

                        public final MplsL3VpnVrfRteInetCidrMetric2Ent mplsL3VpnVrfRteInetCidrMetric2;

                        public final MplsL3VpnVrfRteInetCidrMetric3Ent mplsL3VpnVrfRteInetCidrMetric3;

                        public final MplsL3VpnVrfRteInetCidrMetric4Ent mplsL3VpnVrfRteInetCidrMetric4;

                        public final MplsL3VpnVrfRteInetCidrMetric5Ent mplsL3VpnVrfRteInetCidrMetric5;

                        public final MplsL3VpnVrfRteXCPointerEnt mplsL3VpnVrfRteXCPointer;

                        public final MplsL3VpnVrfRteInetCidrStatusEnt mplsL3VpnVrfRteInetCidrStatus;

                        private MplsL3VpnVrfRteEntryEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsL3VpnVrfRteEntry", "1.3.6.1.2.1.10.166.11.1.4.1.1", false, false, false, true);
                            this.mplsL3VpnVrfRteInetCidrDestType = new MplsL3VpnVrfRteInetCidrDestTypeEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrDest = new MplsL3VpnVrfRteInetCidrDestEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrPfxLen = new MplsL3VpnVrfRteInetCidrPfxLenEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrPolicy = new MplsL3VpnVrfRteInetCidrPolicyEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrNHopType = new MplsL3VpnVrfRteInetCidrNHopTypeEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrNextHop = new MplsL3VpnVrfRteInetCidrNextHopEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrIfIndex = new MplsL3VpnVrfRteInetCidrIfIndexEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrType = new MplsL3VpnVrfRteInetCidrTypeEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrProto = new MplsL3VpnVrfRteInetCidrProtoEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrAge = new MplsL3VpnVrfRteInetCidrAgeEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrNextHopAS = new MplsL3VpnVrfRteInetCidrNextHopASEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrMetric1 = new MplsL3VpnVrfRteInetCidrMetric1Ent(mib, this);
                            this.mplsL3VpnVrfRteInetCidrMetric2 = new MplsL3VpnVrfRteInetCidrMetric2Ent(mib, this);
                            this.mplsL3VpnVrfRteInetCidrMetric3 = new MplsL3VpnVrfRteInetCidrMetric3Ent(mib, this);
                            this.mplsL3VpnVrfRteInetCidrMetric4 = new MplsL3VpnVrfRteInetCidrMetric4Ent(mib, this);
                            this.mplsL3VpnVrfRteInetCidrMetric5 = new MplsL3VpnVrfRteInetCidrMetric5Ent(mib, this);
                            this.mplsL3VpnVrfRteXCPointer = new MplsL3VpnVrfRteXCPointerEnt(mib, this);
                            this.mplsL3VpnVrfRteInetCidrStatus = new MplsL3VpnVrfRteInetCidrStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsL3VpnVrfRteInetCidrDestType,
                                this.mplsL3VpnVrfRteInetCidrDest,
                                this.mplsL3VpnVrfRteInetCidrPfxLen,
                                this.mplsL3VpnVrfRteInetCidrPolicy,
                                this.mplsL3VpnVrfRteInetCidrNHopType,
                                this.mplsL3VpnVrfRteInetCidrNextHop,
                                this.mplsL3VpnVrfRteInetCidrIfIndex,
                                this.mplsL3VpnVrfRteInetCidrType,
                                this.mplsL3VpnVrfRteInetCidrProto,
                                this.mplsL3VpnVrfRteInetCidrAge,
                                this.mplsL3VpnVrfRteInetCidrNextHopAS,
                                this.mplsL3VpnVrfRteInetCidrMetric1,
                                this.mplsL3VpnVrfRteInetCidrMetric2,
                                this.mplsL3VpnVrfRteInetCidrMetric3,
                                this.mplsL3VpnVrfRteInetCidrMetric4,
                                this.mplsL3VpnVrfRteInetCidrMetric5,
                                this.mplsL3VpnVrfRteXCPointer,
                                this.mplsL3VpnVrfRteInetCidrStatus
                            };
                        }
                        public static final class MplsL3VpnVrfRteInetCidrDestTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrDestTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrDestType", "1.3.6.1.2.1.10.166.11.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrDestEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrDestEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrDest", "1.3.6.1.2.1.10.166.11.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrPfxLenEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrPfxLenEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrPfxLen", "1.3.6.1.2.1.10.166.11.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrPolicyEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrPolicyEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrPolicy", "1.3.6.1.2.1.10.166.11.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrNHopTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrNHopTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrNHopType", "1.3.6.1.2.1.10.166.11.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrNextHopEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrNextHopEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrNextHop", "1.3.6.1.2.1.10.166.11.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrIfIndexEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrIfIndexEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrIfIndex", "1.3.6.1.2.1.10.166.11.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrTypeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrTypeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrType", "1.3.6.1.2.1.10.166.11.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrProtoEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrProtoEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrProto", "1.3.6.1.2.1.10.166.11.1.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrAgeEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrAgeEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrAge", "1.3.6.1.2.1.10.166.11.1.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrNextHopASEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrNextHopASEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrNextHopAS", "1.3.6.1.2.1.10.166.11.1.4.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrMetric1Ent extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrMetric1Ent(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrMetric1", "1.3.6.1.2.1.10.166.11.1.4.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrMetric2Ent extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrMetric2Ent(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrMetric2", "1.3.6.1.2.1.10.166.11.1.4.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrMetric3Ent extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrMetric3Ent(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrMetric3", "1.3.6.1.2.1.10.166.11.1.4.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrMetric4Ent extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrMetric4Ent(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrMetric4", "1.3.6.1.2.1.10.166.11.1.4.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrMetric5Ent extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrMetric5Ent(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrMetric5", "1.3.6.1.2.1.10.166.11.1.4.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteXCPointerEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteXCPointerEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteXCPointer", "1.3.6.1.2.1.10.166.11.1.4.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsL3VpnVrfRteInetCidrStatusEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                        {
                            private MplsL3VpnVrfRteInetCidrStatusEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsL3VpnVrfRteInetCidrStatus", "1.3.6.1.2.1.10.166.11.1.4.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class MplsL3VpnConformanceEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
        {
            /** Conformance Statement*/
            public final MplsL3VpnGroupsEnt mplsL3VpnGroups;

            public final MplsL3VpnCompliancesEnt mplsL3VpnCompliances;

            private MplsL3VpnConformanceEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
            {
                super(mib, parent, "mplsL3VpnConformance", "1.3.6.1.2.1.10.166.11.2", false, false, false, false);
                this.mplsL3VpnGroups = new MplsL3VpnGroupsEnt(mib, this);
                this.mplsL3VpnCompliances = new MplsL3VpnCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsL3VpnGroups,
                    this.mplsL3VpnCompliances
                };
            }
            public static final class MplsL3VpnGroupsEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                /** Units of conformance.*/
                public final MplsL3VpnScalarGroupEnt mplsL3VpnScalarGroup;

                public final MplsL3VpnVrfGroupEnt mplsL3VpnVrfGroup;

                public final MplsL3VpnIfGroupEnt mplsL3VpnIfGroup;

                public final MplsL3VpnPerfGroupEnt mplsL3VpnPerfGroup;

                public final MplsL3VpnPerfRouteGroupEnt mplsL3VpnPerfRouteGroup;

                public final MplsL3VpnSecGroupEnt mplsL3VpnSecGroup;

                public final MplsL3VpnVrfRteGroupEnt mplsL3VpnVrfRteGroup;

                public final MplsL3VpnVrfRTGroupEnt mplsL3VpnVrfRTGroup;

                public final MplsL3VpnNotificationGroupEnt mplsL3VpnNotificationGroup;

                private MplsL3VpnGroupsEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnGroups", "1.3.6.1.2.1.10.166.11.2.1", false, false, false, false);
                    this.mplsL3VpnScalarGroup = new MplsL3VpnScalarGroupEnt(mib, this);
                    this.mplsL3VpnVrfGroup = new MplsL3VpnVrfGroupEnt(mib, this);
                    this.mplsL3VpnIfGroup = new MplsL3VpnIfGroupEnt(mib, this);
                    this.mplsL3VpnPerfGroup = new MplsL3VpnPerfGroupEnt(mib, this);
                    this.mplsL3VpnPerfRouteGroup = new MplsL3VpnPerfRouteGroupEnt(mib, this);
                    this.mplsL3VpnSecGroup = new MplsL3VpnSecGroupEnt(mib, this);
                    this.mplsL3VpnVrfRteGroup = new MplsL3VpnVrfRteGroupEnt(mib, this);
                    this.mplsL3VpnVrfRTGroup = new MplsL3VpnVrfRTGroupEnt(mib, this);
                    this.mplsL3VpnNotificationGroup = new MplsL3VpnNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsL3VpnScalarGroup,
                        this.mplsL3VpnVrfGroup,
                        this.mplsL3VpnIfGroup,
                        this.mplsL3VpnPerfGroup,
                        this.mplsL3VpnPerfRouteGroup,
                        this.mplsL3VpnSecGroup,
                        this.mplsL3VpnVrfRteGroup,
                        this.mplsL3VpnVrfRTGroup,
                        this.mplsL3VpnNotificationGroup
                    };
                }
                public static final class MplsL3VpnScalarGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnScalarGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnScalarGroup", "1.3.6.1.2.1.10.166.11.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnVrfGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnVrfGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfGroup", "1.3.6.1.2.1.10.166.11.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnIfGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnIfGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnIfGroup", "1.3.6.1.2.1.10.166.11.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnPerfGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnPerfGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnPerfGroup", "1.3.6.1.2.1.10.166.11.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnPerfRouteGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnPerfRouteGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnPerfRouteGroup", "1.3.6.1.2.1.10.166.11.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnSecGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnSecGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnSecGroup", "1.3.6.1.2.1.10.166.11.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnVrfRteGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnVrfRteGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfRteGroup", "1.3.6.1.2.1.10.166.11.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnVrfRTGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnVrfRTGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnVrfRTGroup", "1.3.6.1.2.1.10.166.11.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnNotificationGroupEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnNotificationGroupEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnNotificationGroup", "1.3.6.1.2.1.10.166.11.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsL3VpnCompliancesEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
            {
                /** Module Compliance*/
                public final MplsL3VpnModuleFullComplianceEnt mplsL3VpnModuleFullCompliance;

                /** ReadOnly Compliance*/
                public final MplsL3VpnModuleReadOnlyComplianceEnt mplsL3VpnModuleReadOnlyCompliance;

                private MplsL3VpnCompliancesEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsL3VpnCompliances", "1.3.6.1.2.1.10.166.11.2.2", false, false, false, false);
                    this.mplsL3VpnModuleFullCompliance = new MplsL3VpnModuleFullComplianceEnt(mib, this);
                    this.mplsL3VpnModuleReadOnlyCompliance = new MplsL3VpnModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsL3VpnModuleFullCompliance,
                        this.mplsL3VpnModuleReadOnlyCompliance
                    };
                }
                public static final class MplsL3VpnModuleFullComplianceEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnModuleFullComplianceEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnModuleFullCompliance", "1.3.6.1.2.1.10.166.11.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsL3VpnModuleReadOnlyComplianceEnt extends MIBEntry<MPLSL3VPNSTDMIBDef>
                {
                    private MplsL3VpnModuleReadOnlyComplianceEnt(MPLSL3VPNSTDMIBDef mib, MIBEntry<MPLSL3VPNSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsL3VpnModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.11.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
