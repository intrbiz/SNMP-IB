package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2021]
[RFC2863]
[RFC2514]*/
public final class GSMPMIBDef extends MIB
{
    public static final GSMPMIBDef GSMPMIB = new GSMPMIBDef();

    static { MIBs.getInstance().registerMIB(GSMPMIBDef.GSMPMIB); }

    /** [RFC3291]

May 31, 2002*/
    public final GsmpMIBEnt gsmpMIB;

    private GSMPMIBDef()
    {
        super("GSMP-MIB");
        this.gsmpMIB = new GsmpMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.gsmpMIB
        };
    }

    public static final class GsmpMIBEnt extends MIBEntry<GSMPMIBDef>
    {
        public final GsmpNotificationsEnt gsmpNotifications;

        public final GsmpObjectsEnt gsmpObjects;

        public final GsmpNotificationsObjectsEnt gsmpNotificationsObjects;

        public final GsmpConformanceEnt gsmpConformance;

        private GsmpMIBEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
        {
            super(mib, parent, "gsmpMIB", "1.3.6.1.2.1.98", false, false, false, false);
            this.gsmpNotifications = new GsmpNotificationsEnt(mib, this);
            this.gsmpObjects = new GsmpObjectsEnt(mib, this);
            this.gsmpNotificationsObjects = new GsmpNotificationsObjectsEnt(mib, this);
            this.gsmpConformance = new GsmpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.gsmpNotifications,
                this.gsmpObjects,
                this.gsmpNotificationsObjects,
                this.gsmpConformance
            };
        }
        public static final class GsmpNotificationsEnt extends MIBEntry<GSMPMIBDef>
        {
            /** Notifications*/
            public final GsmpSessionDownEnt gsmpSessionDown;

            public final GsmpSessionUpEnt gsmpSessionUp;

            public final GsmpSentFailureIndEnt gsmpSentFailureInd;

            public final GsmpReceivedFailureIndEnt gsmpReceivedFailureInd;

            public final GsmpPortUpEventEnt gsmpPortUpEvent;

            public final GsmpPortDownEventEnt gsmpPortDownEvent;

            public final GsmpInvalidLabelEventEnt gsmpInvalidLabelEvent;

            public final GsmpNewPortEventEnt gsmpNewPortEvent;

            public final GsmpDeadPortEventEnt gsmpDeadPortEvent;

            public final GsmpAdjacencyUpdateEventEnt gsmpAdjacencyUpdateEvent;

            private GsmpNotificationsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
            {
                super(mib, parent, "gsmpNotifications", "1.3.6.1.2.1.98.0", false, false, false, false);
                this.gsmpSessionDown = new GsmpSessionDownEnt(mib, this);
                this.gsmpSessionUp = new GsmpSessionUpEnt(mib, this);
                this.gsmpSentFailureInd = new GsmpSentFailureIndEnt(mib, this);
                this.gsmpReceivedFailureInd = new GsmpReceivedFailureIndEnt(mib, this);
                this.gsmpPortUpEvent = new GsmpPortUpEventEnt(mib, this);
                this.gsmpPortDownEvent = new GsmpPortDownEventEnt(mib, this);
                this.gsmpInvalidLabelEvent = new GsmpInvalidLabelEventEnt(mib, this);
                this.gsmpNewPortEvent = new GsmpNewPortEventEnt(mib, this);
                this.gsmpDeadPortEvent = new GsmpDeadPortEventEnt(mib, this);
                this.gsmpAdjacencyUpdateEvent = new GsmpAdjacencyUpdateEventEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gsmpSessionDown,
                    this.gsmpSessionUp,
                    this.gsmpSentFailureInd,
                    this.gsmpReceivedFailureInd,
                    this.gsmpPortUpEvent,
                    this.gsmpPortDownEvent,
                    this.gsmpInvalidLabelEvent,
                    this.gsmpNewPortEvent,
                    this.gsmpDeadPortEvent,
                    this.gsmpAdjacencyUpdateEvent
                };
            }
            public static final class GsmpSessionDownEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpSessionDownEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpSessionDown", "1.3.6.1.2.1.98.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpSessionUpEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpSessionUpEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpSessionUp", "1.3.6.1.2.1.98.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpSentFailureIndEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpSentFailureIndEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpSentFailureInd", "1.3.6.1.2.1.98.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpReceivedFailureIndEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpReceivedFailureIndEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpReceivedFailureInd", "1.3.6.1.2.1.98.0.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpPortUpEventEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpPortUpEventEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpPortUpEvent", "1.3.6.1.2.1.98.0.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpPortDownEventEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpPortDownEventEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpPortDownEvent", "1.3.6.1.2.1.98.0.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpInvalidLabelEventEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpInvalidLabelEventEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpInvalidLabelEvent", "1.3.6.1.2.1.98.0.7", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpNewPortEventEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpNewPortEventEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpNewPortEvent", "1.3.6.1.2.1.98.0.8", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpDeadPortEventEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpDeadPortEventEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpDeadPortEvent", "1.3.6.1.2.1.98.0.9", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpAdjacencyUpdateEventEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpAdjacencyUpdateEventEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpAdjacencyUpdateEvent", "1.3.6.1.2.1.98.0.10", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class GsmpObjectsEnt extends MIBEntry<GSMPMIBDef>
        {
            /** **************************************************************GSMP Entity Objects**************************************************************
Switch Controller Entity table*/
            public final GsmpControllerTableEnt gsmpControllerTable;

            /** Switch Entity table*/
            public final GsmpSwitchTableEnt gsmpSwitchTable;

            /** **************************************************************GSMP Encapsulation Objects**************************************************************
GSMP ATM Encapsulation Table*/
            public final GsmpAtmEncapTableEnt gsmpAtmEncapTable;

            /** GSMP TCP/IP Encapsulation Table*/
            public final GsmpTcpIpEncapTableEnt gsmpTcpIpEncapTable;

            /** **************************************************************GSMP Session Objects


**************************************************************
GSMP Session table*/
            public final GsmpSessionTableEnt gsmpSessionTable;

            private GsmpObjectsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
            {
                super(mib, parent, "gsmpObjects", "1.3.6.1.2.1.98.1", false, false, false, false);
                this.gsmpControllerTable = new GsmpControllerTableEnt(mib, this);
                this.gsmpSwitchTable = new GsmpSwitchTableEnt(mib, this);
                this.gsmpAtmEncapTable = new GsmpAtmEncapTableEnt(mib, this);
                this.gsmpTcpIpEncapTable = new GsmpTcpIpEncapTableEnt(mib, this);
                this.gsmpSessionTable = new GsmpSessionTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gsmpControllerTable,
                    this.gsmpSwitchTable,
                    this.gsmpAtmEncapTable,
                    this.gsmpTcpIpEncapTable,
                    this.gsmpSessionTable
                };
            }
            public static final class GsmpControllerTableEnt extends MIBEntry<GSMPMIBDef>
            {
                public final GsmpControllerEntryEnt gsmpControllerEntry;

                private GsmpControllerTableEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpControllerTable", "1.3.6.1.2.1.98.1.1", false, true, false, false);
                    this.gsmpControllerEntry = new GsmpControllerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpControllerEntry
                    };
                }
                public static final class GsmpControllerEntryEnt extends MIBEntry<GSMPMIBDef>
                {
                    public final GsmpControllerEntityIdEnt gsmpControllerEntityId;

                    public final GsmpControllerMaxVersionEnt gsmpControllerMaxVersion;

                    public final GsmpControllerTimerEnt gsmpControllerTimer;

                    public final GsmpControllerPortEnt gsmpControllerPort;

                    public final GsmpControllerInstanceEnt gsmpControllerInstance;

                    public final GsmpControllerPartitionTypeEnt gsmpControllerPartitionType;

                    public final GsmpControllerPartitionIdEnt gsmpControllerPartitionId;

                    public final GsmpControllerDoResyncEnt gsmpControllerDoResync;

                    public final GsmpControllerNotificationMapEnt gsmpControllerNotificationMap;

                    public final GsmpControllerSessionStateEnt gsmpControllerSessionState;

                    public final GsmpControllerStorageTypeEnt gsmpControllerStorageType;

                    public final GsmpControllerRowStatusEnt gsmpControllerRowStatus;

                    private GsmpControllerEntryEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpControllerEntry", "1.3.6.1.2.1.98.1.1.1", false, false, false, true);
                        this.gsmpControllerEntityId = new GsmpControllerEntityIdEnt(mib, this);
                        this.gsmpControllerMaxVersion = new GsmpControllerMaxVersionEnt(mib, this);
                        this.gsmpControllerTimer = new GsmpControllerTimerEnt(mib, this);
                        this.gsmpControllerPort = new GsmpControllerPortEnt(mib, this);
                        this.gsmpControllerInstance = new GsmpControllerInstanceEnt(mib, this);
                        this.gsmpControllerPartitionType = new GsmpControllerPartitionTypeEnt(mib, this);
                        this.gsmpControllerPartitionId = new GsmpControllerPartitionIdEnt(mib, this);
                        this.gsmpControllerDoResync = new GsmpControllerDoResyncEnt(mib, this);
                        this.gsmpControllerNotificationMap = new GsmpControllerNotificationMapEnt(mib, this);
                        this.gsmpControllerSessionState = new GsmpControllerSessionStateEnt(mib, this);
                        this.gsmpControllerStorageType = new GsmpControllerStorageTypeEnt(mib, this);
                        this.gsmpControllerRowStatus = new GsmpControllerRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gsmpControllerEntityId,
                            this.gsmpControllerMaxVersion,
                            this.gsmpControllerTimer,
                            this.gsmpControllerPort,
                            this.gsmpControllerInstance,
                            this.gsmpControllerPartitionType,
                            this.gsmpControllerPartitionId,
                            this.gsmpControllerDoResync,
                            this.gsmpControllerNotificationMap,
                            this.gsmpControllerSessionState,
                            this.gsmpControllerStorageType,
                            this.gsmpControllerRowStatus
                        };
                    }
                    public static final class GsmpControllerEntityIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerEntityIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerEntityId", "1.3.6.1.2.1.98.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerMaxVersionEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerMaxVersionEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerMaxVersion", "1.3.6.1.2.1.98.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerTimerEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerTimerEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerTimer", "1.3.6.1.2.1.98.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerPortEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerPortEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerPort", "1.3.6.1.2.1.98.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerInstanceEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerInstanceEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerInstance", "1.3.6.1.2.1.98.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerPartitionTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerPartitionTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerPartitionType", "1.3.6.1.2.1.98.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerPartitionIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerPartitionIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerPartitionId", "1.3.6.1.2.1.98.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerDoResyncEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerDoResyncEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerDoResync", "1.3.6.1.2.1.98.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerNotificationMapEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerNotificationMapEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerNotificationMap", "1.3.6.1.2.1.98.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerSessionStateEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerSessionStateEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerSessionState", "1.3.6.1.2.1.98.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerStorageTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerStorageTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerStorageType", "1.3.6.1.2.1.98.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpControllerRowStatusEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpControllerRowStatusEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpControllerRowStatus", "1.3.6.1.2.1.98.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GsmpSwitchTableEnt extends MIBEntry<GSMPMIBDef>
            {
                public final GsmpSwitchEntryEnt gsmpSwitchEntry;

                private GsmpSwitchTableEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpSwitchTable", "1.3.6.1.2.1.98.1.2", false, true, false, false);
                    this.gsmpSwitchEntry = new GsmpSwitchEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpSwitchEntry
                    };
                }
                public static final class GsmpSwitchEntryEnt extends MIBEntry<GSMPMIBDef>
                {
                    public final GsmpSwitchEntityIdEnt gsmpSwitchEntityId;

                    public final GsmpSwitchMaxVersionEnt gsmpSwitchMaxVersion;

                    public final GsmpSwitchTimerEnt gsmpSwitchTimer;

                    public final GsmpSwitchNameEnt gsmpSwitchName;

                    public final GsmpSwitchPortEnt gsmpSwitchPort;

                    public final GsmpSwitchInstanceEnt gsmpSwitchInstance;

                    public final GsmpSwitchPartitionTypeEnt gsmpSwitchPartitionType;

                    public final GsmpSwitchPartitionIdEnt gsmpSwitchPartitionId;

                    public final GsmpSwitchNotificationMapEnt gsmpSwitchNotificationMap;

                    public final GsmpSwitchSwitchTypeEnt gsmpSwitchSwitchType;

                    public final GsmpSwitchWindowSizeEnt gsmpSwitchWindowSize;

                    public final GsmpSwitchSessionStateEnt gsmpSwitchSessionState;

                    public final GsmpSwitchStorageTypeEnt gsmpSwitchStorageType;

                    public final GsmpSwitchRowStatusEnt gsmpSwitchRowStatus;

                    private GsmpSwitchEntryEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpSwitchEntry", "1.3.6.1.2.1.98.1.2.1", false, false, false, true);
                        this.gsmpSwitchEntityId = new GsmpSwitchEntityIdEnt(mib, this);
                        this.gsmpSwitchMaxVersion = new GsmpSwitchMaxVersionEnt(mib, this);
                        this.gsmpSwitchTimer = new GsmpSwitchTimerEnt(mib, this);
                        this.gsmpSwitchName = new GsmpSwitchNameEnt(mib, this);
                        this.gsmpSwitchPort = new GsmpSwitchPortEnt(mib, this);
                        this.gsmpSwitchInstance = new GsmpSwitchInstanceEnt(mib, this);
                        this.gsmpSwitchPartitionType = new GsmpSwitchPartitionTypeEnt(mib, this);
                        this.gsmpSwitchPartitionId = new GsmpSwitchPartitionIdEnt(mib, this);
                        this.gsmpSwitchNotificationMap = new GsmpSwitchNotificationMapEnt(mib, this);
                        this.gsmpSwitchSwitchType = new GsmpSwitchSwitchTypeEnt(mib, this);
                        this.gsmpSwitchWindowSize = new GsmpSwitchWindowSizeEnt(mib, this);
                        this.gsmpSwitchSessionState = new GsmpSwitchSessionStateEnt(mib, this);
                        this.gsmpSwitchStorageType = new GsmpSwitchStorageTypeEnt(mib, this);
                        this.gsmpSwitchRowStatus = new GsmpSwitchRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gsmpSwitchEntityId,
                            this.gsmpSwitchMaxVersion,
                            this.gsmpSwitchTimer,
                            this.gsmpSwitchName,
                            this.gsmpSwitchPort,
                            this.gsmpSwitchInstance,
                            this.gsmpSwitchPartitionType,
                            this.gsmpSwitchPartitionId,
                            this.gsmpSwitchNotificationMap,
                            this.gsmpSwitchSwitchType,
                            this.gsmpSwitchWindowSize,
                            this.gsmpSwitchSessionState,
                            this.gsmpSwitchStorageType,
                            this.gsmpSwitchRowStatus
                        };
                    }
                    public static final class GsmpSwitchEntityIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchEntityIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchEntityId", "1.3.6.1.2.1.98.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchMaxVersionEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchMaxVersionEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchMaxVersion", "1.3.6.1.2.1.98.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchTimerEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchTimerEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchTimer", "1.3.6.1.2.1.98.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchNameEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchNameEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchName", "1.3.6.1.2.1.98.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchPortEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchPortEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchPort", "1.3.6.1.2.1.98.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchInstanceEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchInstanceEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchInstance", "1.3.6.1.2.1.98.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchPartitionTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchPartitionTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchPartitionType", "1.3.6.1.2.1.98.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchPartitionIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchPartitionIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchPartitionId", "1.3.6.1.2.1.98.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchNotificationMapEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchNotificationMapEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchNotificationMap", "1.3.6.1.2.1.98.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchSwitchTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchSwitchTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchSwitchType", "1.3.6.1.2.1.98.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchWindowSizeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchWindowSizeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchWindowSize", "1.3.6.1.2.1.98.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchSessionStateEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchSessionStateEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchSessionState", "1.3.6.1.2.1.98.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchStorageTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchStorageTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchStorageType", "1.3.6.1.2.1.98.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSwitchRowStatusEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSwitchRowStatusEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSwitchRowStatus", "1.3.6.1.2.1.98.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GsmpAtmEncapTableEnt extends MIBEntry<GSMPMIBDef>
            {
                public final GsmpAtmEncapEntryEnt gsmpAtmEncapEntry;

                private GsmpAtmEncapTableEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpAtmEncapTable", "1.3.6.1.2.1.98.1.3", false, true, false, false);
                    this.gsmpAtmEncapEntry = new GsmpAtmEncapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpAtmEncapEntry
                    };
                }
                public static final class GsmpAtmEncapEntryEnt extends MIBEntry<GSMPMIBDef>
                {
                    public final GsmpAtmEncapEntityIdEnt gsmpAtmEncapEntityId;

                    public final GsmpAtmEncapIfIndexEnt gsmpAtmEncapIfIndex;

                    public final GsmpAtmEncapVpiEnt gsmpAtmEncapVpi;

                    public final GsmpAtmEncapVciEnt gsmpAtmEncapVci;

                    public final GsmpAtmEncapStorageTypeEnt gsmpAtmEncapStorageType;

                    public final GsmpAtmEncapRowStatusEnt gsmpAtmEncapRowStatus;

                    private GsmpAtmEncapEntryEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpAtmEncapEntry", "1.3.6.1.2.1.98.1.3.1", false, false, false, true);
                        this.gsmpAtmEncapEntityId = new GsmpAtmEncapEntityIdEnt(mib, this);
                        this.gsmpAtmEncapIfIndex = new GsmpAtmEncapIfIndexEnt(mib, this);
                        this.gsmpAtmEncapVpi = new GsmpAtmEncapVpiEnt(mib, this);
                        this.gsmpAtmEncapVci = new GsmpAtmEncapVciEnt(mib, this);
                        this.gsmpAtmEncapStorageType = new GsmpAtmEncapStorageTypeEnt(mib, this);
                        this.gsmpAtmEncapRowStatus = new GsmpAtmEncapRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gsmpAtmEncapEntityId,
                            this.gsmpAtmEncapIfIndex,
                            this.gsmpAtmEncapVpi,
                            this.gsmpAtmEncapVci,
                            this.gsmpAtmEncapStorageType,
                            this.gsmpAtmEncapRowStatus
                        };
                    }
                    public static final class GsmpAtmEncapEntityIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpAtmEncapEntityIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpAtmEncapEntityId", "1.3.6.1.2.1.98.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpAtmEncapIfIndexEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpAtmEncapIfIndexEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpAtmEncapIfIndex", "1.3.6.1.2.1.98.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpAtmEncapVpiEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpAtmEncapVpiEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpAtmEncapVpi", "1.3.6.1.2.1.98.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpAtmEncapVciEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpAtmEncapVciEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpAtmEncapVci", "1.3.6.1.2.1.98.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpAtmEncapStorageTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpAtmEncapStorageTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpAtmEncapStorageType", "1.3.6.1.2.1.98.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpAtmEncapRowStatusEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpAtmEncapRowStatusEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpAtmEncapRowStatus", "1.3.6.1.2.1.98.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GsmpTcpIpEncapTableEnt extends MIBEntry<GSMPMIBDef>
            {
                public final GsmpTcpIpEncapEntryEnt gsmpTcpIpEncapEntry;

                private GsmpTcpIpEncapTableEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpTcpIpEncapTable", "1.3.6.1.2.1.98.1.4", false, true, false, false);
                    this.gsmpTcpIpEncapEntry = new GsmpTcpIpEncapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpTcpIpEncapEntry
                    };
                }
                public static final class GsmpTcpIpEncapEntryEnt extends MIBEntry<GSMPMIBDef>
                {
                    public final GsmpTcpIpEncapEntityIdEnt gsmpTcpIpEncapEntityId;

                    public final GsmpTcpIpEncapAddressTypeEnt gsmpTcpIpEncapAddressType;

                    public final GsmpTcpIpEncapAddressEnt gsmpTcpIpEncapAddress;

                    public final GsmpTcpIpEncapPortNumberEnt gsmpTcpIpEncapPortNumber;

                    public final GsmpTcpIpEncapStorageTypeEnt gsmpTcpIpEncapStorageType;

                    public final GsmpTcpIpEncapRowStatusEnt gsmpTcpIpEncapRowStatus;

                    private GsmpTcpIpEncapEntryEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpTcpIpEncapEntry", "1.3.6.1.2.1.98.1.4.1", false, false, false, true);
                        this.gsmpTcpIpEncapEntityId = new GsmpTcpIpEncapEntityIdEnt(mib, this);
                        this.gsmpTcpIpEncapAddressType = new GsmpTcpIpEncapAddressTypeEnt(mib, this);
                        this.gsmpTcpIpEncapAddress = new GsmpTcpIpEncapAddressEnt(mib, this);
                        this.gsmpTcpIpEncapPortNumber = new GsmpTcpIpEncapPortNumberEnt(mib, this);
                        this.gsmpTcpIpEncapStorageType = new GsmpTcpIpEncapStorageTypeEnt(mib, this);
                        this.gsmpTcpIpEncapRowStatus = new GsmpTcpIpEncapRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gsmpTcpIpEncapEntityId,
                            this.gsmpTcpIpEncapAddressType,
                            this.gsmpTcpIpEncapAddress,
                            this.gsmpTcpIpEncapPortNumber,
                            this.gsmpTcpIpEncapStorageType,
                            this.gsmpTcpIpEncapRowStatus
                        };
                    }
                    public static final class GsmpTcpIpEncapEntityIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpTcpIpEncapEntityIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpTcpIpEncapEntityId", "1.3.6.1.2.1.98.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpTcpIpEncapAddressTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpTcpIpEncapAddressTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpTcpIpEncapAddressType", "1.3.6.1.2.1.98.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpTcpIpEncapAddressEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpTcpIpEncapAddressEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpTcpIpEncapAddress", "1.3.6.1.2.1.98.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpTcpIpEncapPortNumberEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpTcpIpEncapPortNumberEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpTcpIpEncapPortNumber", "1.3.6.1.2.1.98.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpTcpIpEncapStorageTypeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpTcpIpEncapStorageTypeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpTcpIpEncapStorageType", "1.3.6.1.2.1.98.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpTcpIpEncapRowStatusEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpTcpIpEncapRowStatusEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpTcpIpEncapRowStatus", "1.3.6.1.2.1.98.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GsmpSessionTableEnt extends MIBEntry<GSMPMIBDef>
            {
                public final GsmpSessionEntryEnt gsmpSessionEntry;

                private GsmpSessionTableEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpSessionTable", "1.3.6.1.2.1.98.1.5", false, true, false, false);
                    this.gsmpSessionEntry = new GsmpSessionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpSessionEntry
                    };
                }
                public static final class GsmpSessionEntryEnt extends MIBEntry<GSMPMIBDef>
                {
                    public final GsmpSessionThisSideIdEnt gsmpSessionThisSideId;

                    public final GsmpSessionFarSideIdEnt gsmpSessionFarSideId;

                    public final GsmpSessionVersionEnt gsmpSessionVersion;

                    public final GsmpSessionTimerEnt gsmpSessionTimer;

                    public final GsmpSessionPartitionIdEnt gsmpSessionPartitionId;

                    public final GsmpSessionAdjacencyCountEnt gsmpSessionAdjacencyCount;

                    public final GsmpSessionFarSideNameEnt gsmpSessionFarSideName;

                    public final GsmpSessionFarSidePortEnt gsmpSessionFarSidePort;

                    public final GsmpSessionFarSideInstanceEnt gsmpSessionFarSideInstance;

                    public final GsmpSessionLastFailureCodeEnt gsmpSessionLastFailureCode;

                    public final GsmpSessionDiscontinuityTimeEnt gsmpSessionDiscontinuityTime;

                    public final GsmpSessionStartUptimeEnt gsmpSessionStartUptime;

                    public final GsmpSessionStatSentMessagesEnt gsmpSessionStatSentMessages;

                    public final GsmpSessionStatFailureIndsEnt gsmpSessionStatFailureInds;

                    public final GsmpSessionStatReceivedMessagesEnt gsmpSessionStatReceivedMessages;

                    public final GsmpSessionStatReceivedFailuresEnt gsmpSessionStatReceivedFailures;

                    public final GsmpSessionStatPortUpEventsEnt gsmpSessionStatPortUpEvents;

                    public final GsmpSessionStatPortDownEventsEnt gsmpSessionStatPortDownEvents;

                    public final GsmpSessionStatInvLabelEventsEnt gsmpSessionStatInvLabelEvents;

                    public final GsmpSessionStatNewPortEventsEnt gsmpSessionStatNewPortEvents;

                    public final GsmpSessionStatDeadPortEventsEnt gsmpSessionStatDeadPortEvents;

                    public final GsmpSessionStatAdjUpdateEventsEnt gsmpSessionStatAdjUpdateEvents;

                    private GsmpSessionEntryEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpSessionEntry", "1.3.6.1.2.1.98.1.5.1", false, false, false, true);
                        this.gsmpSessionThisSideId = new GsmpSessionThisSideIdEnt(mib, this);
                        this.gsmpSessionFarSideId = new GsmpSessionFarSideIdEnt(mib, this);
                        this.gsmpSessionVersion = new GsmpSessionVersionEnt(mib, this);
                        this.gsmpSessionTimer = new GsmpSessionTimerEnt(mib, this);
                        this.gsmpSessionPartitionId = new GsmpSessionPartitionIdEnt(mib, this);
                        this.gsmpSessionAdjacencyCount = new GsmpSessionAdjacencyCountEnt(mib, this);
                        this.gsmpSessionFarSideName = new GsmpSessionFarSideNameEnt(mib, this);
                        this.gsmpSessionFarSidePort = new GsmpSessionFarSidePortEnt(mib, this);
                        this.gsmpSessionFarSideInstance = new GsmpSessionFarSideInstanceEnt(mib, this);
                        this.gsmpSessionLastFailureCode = new GsmpSessionLastFailureCodeEnt(mib, this);
                        this.gsmpSessionDiscontinuityTime = new GsmpSessionDiscontinuityTimeEnt(mib, this);
                        this.gsmpSessionStartUptime = new GsmpSessionStartUptimeEnt(mib, this);
                        this.gsmpSessionStatSentMessages = new GsmpSessionStatSentMessagesEnt(mib, this);
                        this.gsmpSessionStatFailureInds = new GsmpSessionStatFailureIndsEnt(mib, this);
                        this.gsmpSessionStatReceivedMessages = new GsmpSessionStatReceivedMessagesEnt(mib, this);
                        this.gsmpSessionStatReceivedFailures = new GsmpSessionStatReceivedFailuresEnt(mib, this);
                        this.gsmpSessionStatPortUpEvents = new GsmpSessionStatPortUpEventsEnt(mib, this);
                        this.gsmpSessionStatPortDownEvents = new GsmpSessionStatPortDownEventsEnt(mib, this);
                        this.gsmpSessionStatInvLabelEvents = new GsmpSessionStatInvLabelEventsEnt(mib, this);
                        this.gsmpSessionStatNewPortEvents = new GsmpSessionStatNewPortEventsEnt(mib, this);
                        this.gsmpSessionStatDeadPortEvents = new GsmpSessionStatDeadPortEventsEnt(mib, this);
                        this.gsmpSessionStatAdjUpdateEvents = new GsmpSessionStatAdjUpdateEventsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gsmpSessionThisSideId,
                            this.gsmpSessionFarSideId,
                            this.gsmpSessionVersion,
                            this.gsmpSessionTimer,
                            this.gsmpSessionPartitionId,
                            this.gsmpSessionAdjacencyCount,
                            this.gsmpSessionFarSideName,
                            this.gsmpSessionFarSidePort,
                            this.gsmpSessionFarSideInstance,
                            this.gsmpSessionLastFailureCode,
                            this.gsmpSessionDiscontinuityTime,
                            this.gsmpSessionStartUptime,
                            this.gsmpSessionStatSentMessages,
                            this.gsmpSessionStatFailureInds,
                            this.gsmpSessionStatReceivedMessages,
                            this.gsmpSessionStatReceivedFailures,
                            this.gsmpSessionStatPortUpEvents,
                            this.gsmpSessionStatPortDownEvents,
                            this.gsmpSessionStatInvLabelEvents,
                            this.gsmpSessionStatNewPortEvents,
                            this.gsmpSessionStatDeadPortEvents,
                            this.gsmpSessionStatAdjUpdateEvents
                        };
                    }
                    public static final class GsmpSessionThisSideIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionThisSideIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionThisSideId", "1.3.6.1.2.1.98.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionFarSideIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionFarSideIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionFarSideId", "1.3.6.1.2.1.98.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionVersionEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionVersionEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionVersion", "1.3.6.1.2.1.98.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionTimerEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionTimerEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionTimer", "1.3.6.1.2.1.98.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionPartitionIdEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionPartitionIdEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionPartitionId", "1.3.6.1.2.1.98.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionAdjacencyCountEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionAdjacencyCountEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionAdjacencyCount", "1.3.6.1.2.1.98.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionFarSideNameEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionFarSideNameEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionFarSideName", "1.3.6.1.2.1.98.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionFarSidePortEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionFarSidePortEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionFarSidePort", "1.3.6.1.2.1.98.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionFarSideInstanceEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionFarSideInstanceEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionFarSideInstance", "1.3.6.1.2.1.98.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionLastFailureCodeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionLastFailureCodeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionLastFailureCode", "1.3.6.1.2.1.98.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionDiscontinuityTimeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionDiscontinuityTimeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionDiscontinuityTime", "1.3.6.1.2.1.98.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStartUptimeEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStartUptimeEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStartUptime", "1.3.6.1.2.1.98.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatSentMessagesEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatSentMessagesEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatSentMessages", "1.3.6.1.2.1.98.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatFailureIndsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatFailureIndsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatFailureInds", "1.3.6.1.2.1.98.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatReceivedMessagesEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatReceivedMessagesEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatReceivedMessages", "1.3.6.1.2.1.98.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatReceivedFailuresEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatReceivedFailuresEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatReceivedFailures", "1.3.6.1.2.1.98.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatPortUpEventsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatPortUpEventsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatPortUpEvents", "1.3.6.1.2.1.98.1.5.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatPortDownEventsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatPortDownEventsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatPortDownEvents", "1.3.6.1.2.1.98.1.5.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatInvLabelEventsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatInvLabelEventsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatInvLabelEvents", "1.3.6.1.2.1.98.1.5.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatNewPortEventsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatNewPortEventsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatNewPortEvents", "1.3.6.1.2.1.98.1.5.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatDeadPortEventsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatDeadPortEventsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatDeadPortEvents", "1.3.6.1.2.1.98.1.5.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GsmpSessionStatAdjUpdateEventsEnt extends MIBEntry<GSMPMIBDef>
                    {
                        private GsmpSessionStatAdjUpdateEventsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                        {
                            super(mib, parent, "gsmpSessionStatAdjUpdateEvents", "1.3.6.1.2.1.98.1.5.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class GsmpNotificationsObjectsEnt extends MIBEntry<GSMPMIBDef>
        {
            /** **************************************************************GSMP Notifications**************************************************************
Notification objects*/
            public final GsmpEventPortEnt gsmpEventPort;

            public final GsmpEventPortSessionNumberEnt gsmpEventPortSessionNumber;

            public final GsmpEventSequenceNumberEnt gsmpEventSequenceNumber;

            public final GsmpEventLabelEnt gsmpEventLabel;

            private GsmpNotificationsObjectsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
            {
                super(mib, parent, "gsmpNotificationsObjects", "1.3.6.1.2.1.98.2", false, false, false, false);
                this.gsmpEventPort = new GsmpEventPortEnt(mib, this);
                this.gsmpEventPortSessionNumber = new GsmpEventPortSessionNumberEnt(mib, this);
                this.gsmpEventSequenceNumber = new GsmpEventSequenceNumberEnt(mib, this);
                this.gsmpEventLabel = new GsmpEventLabelEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gsmpEventPort,
                    this.gsmpEventPortSessionNumber,
                    this.gsmpEventSequenceNumber,
                    this.gsmpEventLabel
                };
            }
            public static final class GsmpEventPortEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpEventPortEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpEventPort", "1.3.6.1.2.1.98.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpEventPortSessionNumberEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpEventPortSessionNumberEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpEventPortSessionNumber", "1.3.6.1.2.1.98.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpEventSequenceNumberEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpEventSequenceNumberEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpEventSequenceNumber", "1.3.6.1.2.1.98.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GsmpEventLabelEnt extends MIBEntry<GSMPMIBDef>
            {
                private GsmpEventLabelEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpEventLabel", "1.3.6.1.2.1.98.2.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class GsmpConformanceEnt extends MIBEntry<GSMPMIBDef>
        {
            /** **************************************************************GSMP Compliance***************************************************************/
            public final GsmpGroupsEnt gsmpGroups;

            public final GsmpCompliancesEnt gsmpCompliances;

            private GsmpConformanceEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
            {
                super(mib, parent, "gsmpConformance", "1.3.6.1.2.1.98.3", false, false, false, false);
                this.gsmpGroups = new GsmpGroupsEnt(mib, this);
                this.gsmpCompliances = new GsmpCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gsmpGroups,
                    this.gsmpCompliances
                };
            }
            public static final class GsmpGroupsEnt extends MIBEntry<GSMPMIBDef>
            {
                /** units of conformance*/
                public final GsmpGeneralGroupEnt gsmpGeneralGroup;

                public final GsmpControllerGroupEnt gsmpControllerGroup;

                public final GsmpSwitchGroupEnt gsmpSwitchGroup;

                public final GsmpAtmEncapGroupEnt gsmpAtmEncapGroup;

                public final GsmpTcpIpEncapGroupEnt gsmpTcpIpEncapGroup;

                public final GsmpNotificationObjectsGroupEnt gsmpNotificationObjectsGroup;

                public final GsmpNotificationsGroupEnt gsmpNotificationsGroup;

                private GsmpGroupsEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpGroups", "1.3.6.1.2.1.98.3.1", false, false, false, false);
                    this.gsmpGeneralGroup = new GsmpGeneralGroupEnt(mib, this);
                    this.gsmpControllerGroup = new GsmpControllerGroupEnt(mib, this);
                    this.gsmpSwitchGroup = new GsmpSwitchGroupEnt(mib, this);
                    this.gsmpAtmEncapGroup = new GsmpAtmEncapGroupEnt(mib, this);
                    this.gsmpTcpIpEncapGroup = new GsmpTcpIpEncapGroupEnt(mib, this);
                    this.gsmpNotificationObjectsGroup = new GsmpNotificationObjectsGroupEnt(mib, this);
                    this.gsmpNotificationsGroup = new GsmpNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpGeneralGroup,
                        this.gsmpControllerGroup,
                        this.gsmpSwitchGroup,
                        this.gsmpAtmEncapGroup,
                        this.gsmpTcpIpEncapGroup,
                        this.gsmpNotificationObjectsGroup,
                        this.gsmpNotificationsGroup
                    };
                }
                public static final class GsmpGeneralGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpGeneralGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpGeneralGroup", "1.3.6.1.2.1.98.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GsmpControllerGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpControllerGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpControllerGroup", "1.3.6.1.2.1.98.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GsmpSwitchGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpSwitchGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpSwitchGroup", "1.3.6.1.2.1.98.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GsmpAtmEncapGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpAtmEncapGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpAtmEncapGroup", "1.3.6.1.2.1.98.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GsmpTcpIpEncapGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpTcpIpEncapGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpTcpIpEncapGroup", "1.3.6.1.2.1.98.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GsmpNotificationObjectsGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpNotificationObjectsGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpNotificationObjectsGroup", "1.3.6.1.2.1.98.3.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GsmpNotificationsGroupEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpNotificationsGroupEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpNotificationsGroup", "1.3.6.1.2.1.98.3.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class GsmpCompliancesEnt extends MIBEntry<GSMPMIBDef>
            {
                public final GsmpModuleComplianceEnt gsmpModuleCompliance;

                private GsmpCompliancesEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                {
                    super(mib, parent, "gsmpCompliances", "1.3.6.1.2.1.98.3.2", false, false, false, false);
                    this.gsmpModuleCompliance = new GsmpModuleComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gsmpModuleCompliance
                    };
                }
                public static final class GsmpModuleComplianceEnt extends MIBEntry<GSMPMIBDef>
                {
                    private GsmpModuleComplianceEnt(GSMPMIBDef mib, MIBEntry<GSMPMIBDef> parent)
                    {
                        super(mib, parent, "gsmpModuleCompliance", "1.3.6.1.2.1.98.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
