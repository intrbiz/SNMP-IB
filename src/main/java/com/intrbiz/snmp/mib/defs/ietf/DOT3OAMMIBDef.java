package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**from [RFC2578]
from [RFC2579]
from [RFC2856]
from [RFC2863]*/
public final class DOT3OAMMIBDef extends MIB
{
    public static final DOT3OAMMIBDef DOT3OAMMIB = new DOT3OAMMIBDef();

    static { MIBs.getInstance().registerMIB(DOT3OAMMIBDef.DOT3OAMMIB); }

    /** from [RFC2580]

June 14,2007"*/
    public final Dot3OamMIBEnt dot3OamMIB;

    private DOT3OAMMIBDef()
    {
        super("DOT3-OAM-MIB");
        this.dot3OamMIB = new Dot3OamMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot3OamMIB
        };
    }

    public static final class Dot3OamMIBEnt extends MIBEntry<DOT3OAMMIBDef>
    {
        /** Sections of the Ethernet OAM MIB*/
        public final Dot3OamNotificationsEnt dot3OamNotifications;

        public final Dot3OamObjectsEnt dot3OamObjects;

        public final Dot3OamConformanceEnt dot3OamConformance;

        private Dot3OamMIBEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
        {
            super(mib, parent, "dot3OamMIB", "1.3.6.1.2.1.158", false, false, false, false);
            this.dot3OamNotifications = new Dot3OamNotificationsEnt(mib, this);
            this.dot3OamObjects = new Dot3OamObjectsEnt(mib, this);
            this.dot3OamConformance = new Dot3OamConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3OamNotifications,
                this.dot3OamObjects,
                this.dot3OamConformance
            };
        }
        public static final class Dot3OamNotificationsEnt extends MIBEntry<DOT3OAMMIBDef>
        {
            /** ***************************************************************Ethernet OAM Notifications*/
            public final Dot3OamThresholdEventEnt dot3OamThresholdEvent;

            public final Dot3OamNonThresholdEventEnt dot3OamNonThresholdEvent;

            private Dot3OamNotificationsEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
            {
                super(mib, parent, "dot3OamNotifications", "1.3.6.1.2.1.158.0", false, false, false, false);
                this.dot3OamThresholdEvent = new Dot3OamThresholdEventEnt(mib, this);
                this.dot3OamNonThresholdEvent = new Dot3OamNonThresholdEventEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3OamThresholdEvent,
                    this.dot3OamNonThresholdEvent
                };
            }
            public static final class Dot3OamThresholdEventEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                private Dot3OamThresholdEventEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamThresholdEvent", "1.3.6.1.2.1.158.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot3OamNonThresholdEventEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                private Dot3OamNonThresholdEventEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamNonThresholdEvent", "1.3.6.1.2.1.158.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot3OamObjectsEnt extends MIBEntry<DOT3OAMMIBDef>
        {
            /** ***************************************************************Ethernet OAM Control group*/
            public final Dot3OamTableEnt dot3OamTable;

            /** ***************************************************************Ethernet OAM Peer group*/
            public final Dot3OamPeerTableEnt dot3OamPeerTable;

            /** ***************************************************************Ethernet OAM Loopback group*/
            public final Dot3OamLoopbackTableEnt dot3OamLoopbackTable;

            /** ***************************************************************Ethernet OAM Statistics group*/
            public final Dot3OamStatsTableEnt dot3OamStatsTable;

            /** ***************************************************************Ethernet OAM Event Configuration group*/
            public final Dot3OamEventConfigTableEnt dot3OamEventConfigTable;

            /** **************************************************************Ethernet OAM Event Log group*/
            public final Dot3OamEventLogTableEnt dot3OamEventLogTable;

            private Dot3OamObjectsEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
            {
                super(mib, parent, "dot3OamObjects", "1.3.6.1.2.1.158.1", false, false, false, false);
                this.dot3OamTable = new Dot3OamTableEnt(mib, this);
                this.dot3OamPeerTable = new Dot3OamPeerTableEnt(mib, this);
                this.dot3OamLoopbackTable = new Dot3OamLoopbackTableEnt(mib, this);
                this.dot3OamStatsTable = new Dot3OamStatsTableEnt(mib, this);
                this.dot3OamEventConfigTable = new Dot3OamEventConfigTableEnt(mib, this);
                this.dot3OamEventLogTable = new Dot3OamEventLogTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3OamTable,
                    this.dot3OamPeerTable,
                    this.dot3OamLoopbackTable,
                    this.dot3OamStatsTable,
                    this.dot3OamEventConfigTable,
                    this.dot3OamEventLogTable
                };
            }
            public static final class Dot3OamTableEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamEntryEnt dot3OamEntry;

                private Dot3OamTableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamTable", "1.3.6.1.2.1.158.1.1", false, true, false, false);
                    this.dot3OamEntry = new Dot3OamEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamEntry
                    };
                }
                public static final class Dot3OamEntryEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    public final Dot3OamAdminStateEnt dot3OamAdminState;

                    public final Dot3OamOperStatusEnt dot3OamOperStatus;

                    public final Dot3OamModeEnt dot3OamMode;

                    public final Dot3OamMaxOamPduSizeEnt dot3OamMaxOamPduSize;

                    public final Dot3OamConfigRevisionEnt dot3OamConfigRevision;

                    public final Dot3OamFunctionsSupportedEnt dot3OamFunctionsSupported;

                    private Dot3OamEntryEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamEntry", "1.3.6.1.2.1.158.1.1.1", false, false, false, true);
                        this.dot3OamAdminState = new Dot3OamAdminStateEnt(mib, this);
                        this.dot3OamOperStatus = new Dot3OamOperStatusEnt(mib, this);
                        this.dot3OamMode = new Dot3OamModeEnt(mib, this);
                        this.dot3OamMaxOamPduSize = new Dot3OamMaxOamPduSizeEnt(mib, this);
                        this.dot3OamConfigRevision = new Dot3OamConfigRevisionEnt(mib, this);
                        this.dot3OamFunctionsSupported = new Dot3OamFunctionsSupportedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OamAdminState,
                            this.dot3OamOperStatus,
                            this.dot3OamMode,
                            this.dot3OamMaxOamPduSize,
                            this.dot3OamConfigRevision,
                            this.dot3OamFunctionsSupported
                        };
                    }
                    public static final class Dot3OamAdminStateEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamAdminStateEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamAdminState", "1.3.6.1.2.1.158.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamOperStatusEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamOperStatusEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamOperStatus", "1.3.6.1.2.1.158.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamModeEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamModeEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamMode", "1.3.6.1.2.1.158.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamMaxOamPduSizeEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamMaxOamPduSizeEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamMaxOamPduSize", "1.3.6.1.2.1.158.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamConfigRevisionEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamConfigRevisionEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamConfigRevision", "1.3.6.1.2.1.158.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamFunctionsSupportedEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamFunctionsSupportedEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamFunctionsSupported", "1.3.6.1.2.1.158.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot3OamPeerTableEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamPeerEntryEnt dot3OamPeerEntry;

                private Dot3OamPeerTableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamPeerTable", "1.3.6.1.2.1.158.1.2", false, true, false, false);
                    this.dot3OamPeerEntry = new Dot3OamPeerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamPeerEntry
                    };
                }
                public static final class Dot3OamPeerEntryEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    public final Dot3OamPeerMacAddressEnt dot3OamPeerMacAddress;

                    public final Dot3OamPeerVendorOuiEnt dot3OamPeerVendorOui;

                    public final Dot3OamPeerVendorInfoEnt dot3OamPeerVendorInfo;

                    public final Dot3OamPeerModeEnt dot3OamPeerMode;

                    public final Dot3OamPeerMaxOamPduSizeEnt dot3OamPeerMaxOamPduSize;

                    public final Dot3OamPeerConfigRevisionEnt dot3OamPeerConfigRevision;

                    public final Dot3OamPeerFunctionsSupportedEnt dot3OamPeerFunctionsSupported;

                    private Dot3OamPeerEntryEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamPeerEntry", "1.3.6.1.2.1.158.1.2.1", false, false, false, true);
                        this.dot3OamPeerMacAddress = new Dot3OamPeerMacAddressEnt(mib, this);
                        this.dot3OamPeerVendorOui = new Dot3OamPeerVendorOuiEnt(mib, this);
                        this.dot3OamPeerVendorInfo = new Dot3OamPeerVendorInfoEnt(mib, this);
                        this.dot3OamPeerMode = new Dot3OamPeerModeEnt(mib, this);
                        this.dot3OamPeerMaxOamPduSize = new Dot3OamPeerMaxOamPduSizeEnt(mib, this);
                        this.dot3OamPeerConfigRevision = new Dot3OamPeerConfigRevisionEnt(mib, this);
                        this.dot3OamPeerFunctionsSupported = new Dot3OamPeerFunctionsSupportedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OamPeerMacAddress,
                            this.dot3OamPeerVendorOui,
                            this.dot3OamPeerVendorInfo,
                            this.dot3OamPeerMode,
                            this.dot3OamPeerMaxOamPduSize,
                            this.dot3OamPeerConfigRevision,
                            this.dot3OamPeerFunctionsSupported
                        };
                    }
                    public static final class Dot3OamPeerMacAddressEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerMacAddressEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerMacAddress", "1.3.6.1.2.1.158.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamPeerVendorOuiEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerVendorOuiEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerVendorOui", "1.3.6.1.2.1.158.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamPeerVendorInfoEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerVendorInfoEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerVendorInfo", "1.3.6.1.2.1.158.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamPeerModeEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerModeEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerMode", "1.3.6.1.2.1.158.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamPeerMaxOamPduSizeEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerMaxOamPduSizeEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerMaxOamPduSize", "1.3.6.1.2.1.158.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamPeerConfigRevisionEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerConfigRevisionEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerConfigRevision", "1.3.6.1.2.1.158.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamPeerFunctionsSupportedEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamPeerFunctionsSupportedEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamPeerFunctionsSupported", "1.3.6.1.2.1.158.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot3OamLoopbackTableEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamLoopbackEntryEnt dot3OamLoopbackEntry;

                private Dot3OamLoopbackTableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamLoopbackTable", "1.3.6.1.2.1.158.1.3", false, true, false, false);
                    this.dot3OamLoopbackEntry = new Dot3OamLoopbackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamLoopbackEntry
                    };
                }
                public static final class Dot3OamLoopbackEntryEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    public final Dot3OamLoopbackStatusEnt dot3OamLoopbackStatus;

                    public final Dot3OamLoopbackIgnoreRxEnt dot3OamLoopbackIgnoreRx;

                    private Dot3OamLoopbackEntryEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamLoopbackEntry", "1.3.6.1.2.1.158.1.3.1", false, false, false, true);
                        this.dot3OamLoopbackStatus = new Dot3OamLoopbackStatusEnt(mib, this);
                        this.dot3OamLoopbackIgnoreRx = new Dot3OamLoopbackIgnoreRxEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OamLoopbackStatus,
                            this.dot3OamLoopbackIgnoreRx
                        };
                    }
                    public static final class Dot3OamLoopbackStatusEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamLoopbackStatusEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamLoopbackStatus", "1.3.6.1.2.1.158.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamLoopbackIgnoreRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamLoopbackIgnoreRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamLoopbackIgnoreRx", "1.3.6.1.2.1.158.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot3OamStatsTableEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamStatsEntryEnt dot3OamStatsEntry;

                private Dot3OamStatsTableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamStatsTable", "1.3.6.1.2.1.158.1.4", false, true, false, false);
                    this.dot3OamStatsEntry = new Dot3OamStatsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamStatsEntry
                    };
                }
                public static final class Dot3OamStatsEntryEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    public final Dot3OamInformationTxEnt dot3OamInformationTx;

                    public final Dot3OamInformationRxEnt dot3OamInformationRx;

                    public final Dot3OamUniqueEventNotificationTxEnt dot3OamUniqueEventNotificationTx;

                    public final Dot3OamUniqueEventNotificationRxEnt dot3OamUniqueEventNotificationRx;

                    public final Dot3OamDuplicateEventNotificationTxEnt dot3OamDuplicateEventNotificationTx;

                    public final Dot3OamDuplicateEventNotificationRxEnt dot3OamDuplicateEventNotificationRx;

                    public final Dot3OamLoopbackControlTxEnt dot3OamLoopbackControlTx;

                    public final Dot3OamLoopbackControlRxEnt dot3OamLoopbackControlRx;

                    public final Dot3OamVariableRequestTxEnt dot3OamVariableRequestTx;

                    public final Dot3OamVariableRequestRxEnt dot3OamVariableRequestRx;

                    public final Dot3OamVariableResponseTxEnt dot3OamVariableResponseTx;

                    public final Dot3OamVariableResponseRxEnt dot3OamVariableResponseRx;

                    public final Dot3OamOrgSpecificTxEnt dot3OamOrgSpecificTx;

                    public final Dot3OamOrgSpecificRxEnt dot3OamOrgSpecificRx;

                    public final Dot3OamUnsupportedCodesTxEnt dot3OamUnsupportedCodesTx;

                    public final Dot3OamUnsupportedCodesRxEnt dot3OamUnsupportedCodesRx;

                    public final Dot3OamFramesLostDueToOamEnt dot3OamFramesLostDueToOam;

                    private Dot3OamStatsEntryEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamStatsEntry", "1.3.6.1.2.1.158.1.4.1", false, false, false, true);
                        this.dot3OamInformationTx = new Dot3OamInformationTxEnt(mib, this);
                        this.dot3OamInformationRx = new Dot3OamInformationRxEnt(mib, this);
                        this.dot3OamUniqueEventNotificationTx = new Dot3OamUniqueEventNotificationTxEnt(mib, this);
                        this.dot3OamUniqueEventNotificationRx = new Dot3OamUniqueEventNotificationRxEnt(mib, this);
                        this.dot3OamDuplicateEventNotificationTx = new Dot3OamDuplicateEventNotificationTxEnt(mib, this);
                        this.dot3OamDuplicateEventNotificationRx = new Dot3OamDuplicateEventNotificationRxEnt(mib, this);
                        this.dot3OamLoopbackControlTx = new Dot3OamLoopbackControlTxEnt(mib, this);
                        this.dot3OamLoopbackControlRx = new Dot3OamLoopbackControlRxEnt(mib, this);
                        this.dot3OamVariableRequestTx = new Dot3OamVariableRequestTxEnt(mib, this);
                        this.dot3OamVariableRequestRx = new Dot3OamVariableRequestRxEnt(mib, this);
                        this.dot3OamVariableResponseTx = new Dot3OamVariableResponseTxEnt(mib, this);
                        this.dot3OamVariableResponseRx = new Dot3OamVariableResponseRxEnt(mib, this);
                        this.dot3OamOrgSpecificTx = new Dot3OamOrgSpecificTxEnt(mib, this);
                        this.dot3OamOrgSpecificRx = new Dot3OamOrgSpecificRxEnt(mib, this);
                        this.dot3OamUnsupportedCodesTx = new Dot3OamUnsupportedCodesTxEnt(mib, this);
                        this.dot3OamUnsupportedCodesRx = new Dot3OamUnsupportedCodesRxEnt(mib, this);
                        this.dot3OamFramesLostDueToOam = new Dot3OamFramesLostDueToOamEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OamInformationTx,
                            this.dot3OamInformationRx,
                            this.dot3OamUniqueEventNotificationTx,
                            this.dot3OamUniqueEventNotificationRx,
                            this.dot3OamDuplicateEventNotificationTx,
                            this.dot3OamDuplicateEventNotificationRx,
                            this.dot3OamLoopbackControlTx,
                            this.dot3OamLoopbackControlRx,
                            this.dot3OamVariableRequestTx,
                            this.dot3OamVariableRequestRx,
                            this.dot3OamVariableResponseTx,
                            this.dot3OamVariableResponseRx,
                            this.dot3OamOrgSpecificTx,
                            this.dot3OamOrgSpecificRx,
                            this.dot3OamUnsupportedCodesTx,
                            this.dot3OamUnsupportedCodesRx,
                            this.dot3OamFramesLostDueToOam
                        };
                    }
                    public static final class Dot3OamInformationTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamInformationTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamInformationTx", "1.3.6.1.2.1.158.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamInformationRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamInformationRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamInformationRx", "1.3.6.1.2.1.158.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamUniqueEventNotificationTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamUniqueEventNotificationTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamUniqueEventNotificationTx", "1.3.6.1.2.1.158.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamUniqueEventNotificationRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamUniqueEventNotificationRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamUniqueEventNotificationRx", "1.3.6.1.2.1.158.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamDuplicateEventNotificationTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamDuplicateEventNotificationTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamDuplicateEventNotificationTx", "1.3.6.1.2.1.158.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamDuplicateEventNotificationRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamDuplicateEventNotificationRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamDuplicateEventNotificationRx", "1.3.6.1.2.1.158.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamLoopbackControlTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamLoopbackControlTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamLoopbackControlTx", "1.3.6.1.2.1.158.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamLoopbackControlRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamLoopbackControlRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamLoopbackControlRx", "1.3.6.1.2.1.158.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamVariableRequestTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamVariableRequestTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamVariableRequestTx", "1.3.6.1.2.1.158.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamVariableRequestRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamVariableRequestRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamVariableRequestRx", "1.3.6.1.2.1.158.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamVariableResponseTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamVariableResponseTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamVariableResponseTx", "1.3.6.1.2.1.158.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamVariableResponseRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamVariableResponseRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamVariableResponseRx", "1.3.6.1.2.1.158.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamOrgSpecificTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamOrgSpecificTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamOrgSpecificTx", "1.3.6.1.2.1.158.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamOrgSpecificRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamOrgSpecificRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamOrgSpecificRx", "1.3.6.1.2.1.158.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamUnsupportedCodesTxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamUnsupportedCodesTxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamUnsupportedCodesTx", "1.3.6.1.2.1.158.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamUnsupportedCodesRxEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamUnsupportedCodesRxEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamUnsupportedCodesRx", "1.3.6.1.2.1.158.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamFramesLostDueToOamEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamFramesLostDueToOamEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamFramesLostDueToOam", "1.3.6.1.2.1.158.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot3OamEventConfigTableEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamEventConfigEntryEnt dot3OamEventConfigEntry;

                private Dot3OamEventConfigTableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamEventConfigTable", "1.3.6.1.2.1.158.1.5", false, true, false, false);
                    this.dot3OamEventConfigEntry = new Dot3OamEventConfigEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamEventConfigEntry
                    };
                }
                public static final class Dot3OamEventConfigEntryEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    public final Dot3OamErrSymPeriodWindowHiEnt dot3OamErrSymPeriodWindowHi;

                    public final Dot3OamErrSymPeriodWindowLoEnt dot3OamErrSymPeriodWindowLo;

                    public final Dot3OamErrSymPeriodThresholdHiEnt dot3OamErrSymPeriodThresholdHi;

                    public final Dot3OamErrSymPeriodThresholdLoEnt dot3OamErrSymPeriodThresholdLo;

                    public final Dot3OamErrSymPeriodEvNotifEnableEnt dot3OamErrSymPeriodEvNotifEnable;

                    public final Dot3OamErrFramePeriodWindowEnt dot3OamErrFramePeriodWindow;

                    public final Dot3OamErrFramePeriodThresholdEnt dot3OamErrFramePeriodThreshold;

                    public final Dot3OamErrFramePeriodEvNotifEnableEnt dot3OamErrFramePeriodEvNotifEnable;

                    public final Dot3OamErrFrameWindowEnt dot3OamErrFrameWindow;

                    public final Dot3OamErrFrameThresholdEnt dot3OamErrFrameThreshold;

                    public final Dot3OamErrFrameEvNotifEnableEnt dot3OamErrFrameEvNotifEnable;

                    public final Dot3OamErrFrameSecsSummaryWindowEnt dot3OamErrFrameSecsSummaryWindow;

                    public final Dot3OamErrFrameSecsSummaryThresholdEnt dot3OamErrFrameSecsSummaryThreshold;

                    public final Dot3OamErrFrameSecsEvNotifEnableEnt dot3OamErrFrameSecsEvNotifEnable;

                    public final Dot3OamDyingGaspEnableEnt dot3OamDyingGaspEnable;

                    public final Dot3OamCriticalEventEnableEnt dot3OamCriticalEventEnable;

                    private Dot3OamEventConfigEntryEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamEventConfigEntry", "1.3.6.1.2.1.158.1.5.1", false, false, false, true);
                        this.dot3OamErrSymPeriodWindowHi = new Dot3OamErrSymPeriodWindowHiEnt(mib, this);
                        this.dot3OamErrSymPeriodWindowLo = new Dot3OamErrSymPeriodWindowLoEnt(mib, this);
                        this.dot3OamErrSymPeriodThresholdHi = new Dot3OamErrSymPeriodThresholdHiEnt(mib, this);
                        this.dot3OamErrSymPeriodThresholdLo = new Dot3OamErrSymPeriodThresholdLoEnt(mib, this);
                        this.dot3OamErrSymPeriodEvNotifEnable = new Dot3OamErrSymPeriodEvNotifEnableEnt(mib, this);
                        this.dot3OamErrFramePeriodWindow = new Dot3OamErrFramePeriodWindowEnt(mib, this);
                        this.dot3OamErrFramePeriodThreshold = new Dot3OamErrFramePeriodThresholdEnt(mib, this);
                        this.dot3OamErrFramePeriodEvNotifEnable = new Dot3OamErrFramePeriodEvNotifEnableEnt(mib, this);
                        this.dot3OamErrFrameWindow = new Dot3OamErrFrameWindowEnt(mib, this);
                        this.dot3OamErrFrameThreshold = new Dot3OamErrFrameThresholdEnt(mib, this);
                        this.dot3OamErrFrameEvNotifEnable = new Dot3OamErrFrameEvNotifEnableEnt(mib, this);
                        this.dot3OamErrFrameSecsSummaryWindow = new Dot3OamErrFrameSecsSummaryWindowEnt(mib, this);
                        this.dot3OamErrFrameSecsSummaryThreshold = new Dot3OamErrFrameSecsSummaryThresholdEnt(mib, this);
                        this.dot3OamErrFrameSecsEvNotifEnable = new Dot3OamErrFrameSecsEvNotifEnableEnt(mib, this);
                        this.dot3OamDyingGaspEnable = new Dot3OamDyingGaspEnableEnt(mib, this);
                        this.dot3OamCriticalEventEnable = new Dot3OamCriticalEventEnableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OamErrSymPeriodWindowHi,
                            this.dot3OamErrSymPeriodWindowLo,
                            this.dot3OamErrSymPeriodThresholdHi,
                            this.dot3OamErrSymPeriodThresholdLo,
                            this.dot3OamErrSymPeriodEvNotifEnable,
                            this.dot3OamErrFramePeriodWindow,
                            this.dot3OamErrFramePeriodThreshold,
                            this.dot3OamErrFramePeriodEvNotifEnable,
                            this.dot3OamErrFrameWindow,
                            this.dot3OamErrFrameThreshold,
                            this.dot3OamErrFrameEvNotifEnable,
                            this.dot3OamErrFrameSecsSummaryWindow,
                            this.dot3OamErrFrameSecsSummaryThreshold,
                            this.dot3OamErrFrameSecsEvNotifEnable,
                            this.dot3OamDyingGaspEnable,
                            this.dot3OamCriticalEventEnable
                        };
                    }
                    public static final class Dot3OamErrSymPeriodWindowHiEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrSymPeriodWindowHiEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrSymPeriodWindowHi", "1.3.6.1.2.1.158.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrSymPeriodWindowLoEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrSymPeriodWindowLoEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrSymPeriodWindowLo", "1.3.6.1.2.1.158.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrSymPeriodThresholdHiEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrSymPeriodThresholdHiEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrSymPeriodThresholdHi", "1.3.6.1.2.1.158.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrSymPeriodThresholdLoEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrSymPeriodThresholdLoEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrSymPeriodThresholdLo", "1.3.6.1.2.1.158.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrSymPeriodEvNotifEnableEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrSymPeriodEvNotifEnableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrSymPeriodEvNotifEnable", "1.3.6.1.2.1.158.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFramePeriodWindowEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFramePeriodWindowEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFramePeriodWindow", "1.3.6.1.2.1.158.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFramePeriodThresholdEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFramePeriodThresholdEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFramePeriodThreshold", "1.3.6.1.2.1.158.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFramePeriodEvNotifEnableEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFramePeriodEvNotifEnableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFramePeriodEvNotifEnable", "1.3.6.1.2.1.158.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFrameWindowEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFrameWindowEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFrameWindow", "1.3.6.1.2.1.158.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFrameThresholdEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFrameThresholdEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFrameThreshold", "1.3.6.1.2.1.158.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFrameEvNotifEnableEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFrameEvNotifEnableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFrameEvNotifEnable", "1.3.6.1.2.1.158.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFrameSecsSummaryWindowEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFrameSecsSummaryWindowEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFrameSecsSummaryWindow", "1.3.6.1.2.1.158.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFrameSecsSummaryThresholdEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFrameSecsSummaryThresholdEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFrameSecsSummaryThreshold", "1.3.6.1.2.1.158.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamErrFrameSecsEvNotifEnableEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamErrFrameSecsEvNotifEnableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamErrFrameSecsEvNotifEnable", "1.3.6.1.2.1.158.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamDyingGaspEnableEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamDyingGaspEnableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamDyingGaspEnable", "1.3.6.1.2.1.158.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamCriticalEventEnableEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamCriticalEventEnableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamCriticalEventEnable", "1.3.6.1.2.1.158.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot3OamEventLogTableEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamEventLogEntryEnt dot3OamEventLogEntry;

                private Dot3OamEventLogTableEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamEventLogTable", "1.3.6.1.2.1.158.1.6", false, true, false, false);
                    this.dot3OamEventLogEntry = new Dot3OamEventLogEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamEventLogEntry
                    };
                }
                public static final class Dot3OamEventLogEntryEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    public final Dot3OamEventLogIndexEnt dot3OamEventLogIndex;

                    public final Dot3OamEventLogTimestampEnt dot3OamEventLogTimestamp;

                    public final Dot3OamEventLogOuiEnt dot3OamEventLogOui;

                    public final Dot3OamEventLogTypeEnt dot3OamEventLogType;

                    public final Dot3OamEventLogLocationEnt dot3OamEventLogLocation;

                    public final Dot3OamEventLogWindowHiEnt dot3OamEventLogWindowHi;

                    public final Dot3OamEventLogWindowLoEnt dot3OamEventLogWindowLo;

                    public final Dot3OamEventLogThresholdHiEnt dot3OamEventLogThresholdHi;

                    public final Dot3OamEventLogThresholdLoEnt dot3OamEventLogThresholdLo;

                    public final Dot3OamEventLogValueEnt dot3OamEventLogValue;

                    public final Dot3OamEventLogRunningTotalEnt dot3OamEventLogRunningTotal;

                    public final Dot3OamEventLogEventTotalEnt dot3OamEventLogEventTotal;

                    private Dot3OamEventLogEntryEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamEventLogEntry", "1.3.6.1.2.1.158.1.6.1", false, false, false, true);
                        this.dot3OamEventLogIndex = new Dot3OamEventLogIndexEnt(mib, this);
                        this.dot3OamEventLogTimestamp = new Dot3OamEventLogTimestampEnt(mib, this);
                        this.dot3OamEventLogOui = new Dot3OamEventLogOuiEnt(mib, this);
                        this.dot3OamEventLogType = new Dot3OamEventLogTypeEnt(mib, this);
                        this.dot3OamEventLogLocation = new Dot3OamEventLogLocationEnt(mib, this);
                        this.dot3OamEventLogWindowHi = new Dot3OamEventLogWindowHiEnt(mib, this);
                        this.dot3OamEventLogWindowLo = new Dot3OamEventLogWindowLoEnt(mib, this);
                        this.dot3OamEventLogThresholdHi = new Dot3OamEventLogThresholdHiEnt(mib, this);
                        this.dot3OamEventLogThresholdLo = new Dot3OamEventLogThresholdLoEnt(mib, this);
                        this.dot3OamEventLogValue = new Dot3OamEventLogValueEnt(mib, this);
                        this.dot3OamEventLogRunningTotal = new Dot3OamEventLogRunningTotalEnt(mib, this);
                        this.dot3OamEventLogEventTotal = new Dot3OamEventLogEventTotalEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OamEventLogIndex,
                            this.dot3OamEventLogTimestamp,
                            this.dot3OamEventLogOui,
                            this.dot3OamEventLogType,
                            this.dot3OamEventLogLocation,
                            this.dot3OamEventLogWindowHi,
                            this.dot3OamEventLogWindowLo,
                            this.dot3OamEventLogThresholdHi,
                            this.dot3OamEventLogThresholdLo,
                            this.dot3OamEventLogValue,
                            this.dot3OamEventLogRunningTotal,
                            this.dot3OamEventLogEventTotal
                        };
                    }
                    public static final class Dot3OamEventLogIndexEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogIndexEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogIndex", "1.3.6.1.2.1.158.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogTimestampEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogTimestampEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogTimestamp", "1.3.6.1.2.1.158.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogOuiEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogOuiEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogOui", "1.3.6.1.2.1.158.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogTypeEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogTypeEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogType", "1.3.6.1.2.1.158.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogLocationEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogLocationEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogLocation", "1.3.6.1.2.1.158.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogWindowHiEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogWindowHiEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogWindowHi", "1.3.6.1.2.1.158.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogWindowLoEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogWindowLoEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogWindowLo", "1.3.6.1.2.1.158.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogThresholdHiEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogThresholdHiEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogThresholdHi", "1.3.6.1.2.1.158.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogThresholdLoEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogThresholdLoEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogThresholdLo", "1.3.6.1.2.1.158.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogValueEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogValueEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogValue", "1.3.6.1.2.1.158.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogRunningTotalEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogRunningTotalEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogRunningTotal", "1.3.6.1.2.1.158.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot3OamEventLogEventTotalEnt extends MIBEntry<DOT3OAMMIBDef>
                    {
                        private Dot3OamEventLogEventTotalEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                        {
                            super(mib, parent, "dot3OamEventLogEventTotal", "1.3.6.1.2.1.158.1.6.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot3OamConformanceEnt extends MIBEntry<DOT3OAMMIBDef>
        {
            /** ***************************************************************Ethernet OAM Compliance group*/
            public final Dot3OamGroupsEnt dot3OamGroups;

            public final Dot3OamCompliancesEnt dot3OamCompliances;

            private Dot3OamConformanceEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
            {
                super(mib, parent, "dot3OamConformance", "1.3.6.1.2.1.158.2", false, false, false, false);
                this.dot3OamGroups = new Dot3OamGroupsEnt(mib, this);
                this.dot3OamCompliances = new Dot3OamCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3OamGroups,
                    this.dot3OamCompliances
                };
            }
            public static final class Dot3OamGroupsEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                public final Dot3OamControlGroupEnt dot3OamControlGroup;

                public final Dot3OamPeerGroupEnt dot3OamPeerGroup;

                public final Dot3OamStatsBaseGroupEnt dot3OamStatsBaseGroup;

                public final Dot3OamLoopbackGroupEnt dot3OamLoopbackGroup;

                public final Dot3OamErrSymbolPeriodEventGroupEnt dot3OamErrSymbolPeriodEventGroup;

                public final Dot3OamErrFramePeriodEventGroupEnt dot3OamErrFramePeriodEventGroup;

                public final Dot3OamErrFrameEventGroupEnt dot3OamErrFrameEventGroup;

                public final Dot3OamErrFrameSecsSummaryEventGroupEnt dot3OamErrFrameSecsSummaryEventGroup;

                public final Dot3OamFlagEventGroupEnt dot3OamFlagEventGroup;

                public final Dot3OamEventLogGroupEnt dot3OamEventLogGroup;

                public final Dot3OamNotificationGroupEnt dot3OamNotificationGroup;

                private Dot3OamGroupsEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamGroups", "1.3.6.1.2.1.158.2.1", false, false, false, false);
                    this.dot3OamControlGroup = new Dot3OamControlGroupEnt(mib, this);
                    this.dot3OamPeerGroup = new Dot3OamPeerGroupEnt(mib, this);
                    this.dot3OamStatsBaseGroup = new Dot3OamStatsBaseGroupEnt(mib, this);
                    this.dot3OamLoopbackGroup = new Dot3OamLoopbackGroupEnt(mib, this);
                    this.dot3OamErrSymbolPeriodEventGroup = new Dot3OamErrSymbolPeriodEventGroupEnt(mib, this);
                    this.dot3OamErrFramePeriodEventGroup = new Dot3OamErrFramePeriodEventGroupEnt(mib, this);
                    this.dot3OamErrFrameEventGroup = new Dot3OamErrFrameEventGroupEnt(mib, this);
                    this.dot3OamErrFrameSecsSummaryEventGroup = new Dot3OamErrFrameSecsSummaryEventGroupEnt(mib, this);
                    this.dot3OamFlagEventGroup = new Dot3OamFlagEventGroupEnt(mib, this);
                    this.dot3OamEventLogGroup = new Dot3OamEventLogGroupEnt(mib, this);
                    this.dot3OamNotificationGroup = new Dot3OamNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamControlGroup,
                        this.dot3OamPeerGroup,
                        this.dot3OamStatsBaseGroup,
                        this.dot3OamLoopbackGroup,
                        this.dot3OamErrSymbolPeriodEventGroup,
                        this.dot3OamErrFramePeriodEventGroup,
                        this.dot3OamErrFrameEventGroup,
                        this.dot3OamErrFrameSecsSummaryEventGroup,
                        this.dot3OamFlagEventGroup,
                        this.dot3OamEventLogGroup,
                        this.dot3OamNotificationGroup
                    };
                }
                public static final class Dot3OamControlGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamControlGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamControlGroup", "1.3.6.1.2.1.158.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamPeerGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamPeerGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamPeerGroup", "1.3.6.1.2.1.158.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamStatsBaseGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamStatsBaseGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamStatsBaseGroup", "1.3.6.1.2.1.158.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamLoopbackGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamLoopbackGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamLoopbackGroup", "1.3.6.1.2.1.158.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamErrSymbolPeriodEventGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamErrSymbolPeriodEventGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamErrSymbolPeriodEventGroup", "1.3.6.1.2.1.158.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamErrFramePeriodEventGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamErrFramePeriodEventGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamErrFramePeriodEventGroup", "1.3.6.1.2.1.158.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamErrFrameEventGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamErrFrameEventGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamErrFrameEventGroup", "1.3.6.1.2.1.158.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamErrFrameSecsSummaryEventGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamErrFrameSecsSummaryEventGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamErrFrameSecsSummaryEventGroup", "1.3.6.1.2.1.158.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamFlagEventGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamFlagEventGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamFlagEventGroup", "1.3.6.1.2.1.158.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamEventLogGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamEventLogGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamEventLogGroup", "1.3.6.1.2.1.158.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OamNotificationGroupEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamNotificationGroupEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamNotificationGroup", "1.3.6.1.2.1.158.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot3OamCompliancesEnt extends MIBEntry<DOT3OAMMIBDef>
            {
                /** Compliance statements*/
                public final Dot3OamComplianceEnt dot3OamCompliance;

                private Dot3OamCompliancesEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                {
                    super(mib, parent, "dot3OamCompliances", "1.3.6.1.2.1.158.2.2", false, false, false, false);
                    this.dot3OamCompliance = new Dot3OamComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OamCompliance
                    };
                }
                public static final class Dot3OamComplianceEnt extends MIBEntry<DOT3OAMMIBDef>
                {
                    private Dot3OamComplianceEnt(DOT3OAMMIBDef mib, MIBEntry<DOT3OAMMIBDef> parent)
                    {
                        super(mib, parent, "dot3OamCompliance", "1.3.6.1.2.1.158.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
