package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class INTEGRATEDSERVICESMIBDef extends MIB
{
    public static final INTEGRATEDSERVICESMIBDef INTEGRATEDSERVICESMIB = new INTEGRATEDSERVICESMIBDef();

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in [9].

Thu Aug 28 09:04:13 PDT 1997*/
    public final IntSrvEnt intSrv;

    private INTEGRATEDSERVICESMIBDef()
    {
        super("INTEGRATED-SERVICES-MIB");
        this.intSrv = new IntSrvEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.intSrv
        };
    }

    public static final class IntSrvEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
    {
        public final IntSrvObjectsEnt intSrvObjects;

        public final IntSrvGenObjectsEnt intSrvGenObjects;

        public final IntSrvNotificationsEnt intSrvNotifications;

        public final IntSrvConformanceEnt intSrvConformance;

        private IntSrvEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
        {
            super(mib, parent, "intSrv", "1.3.6.1.2.1.52", false, false, false, false);
            this.intSrvObjects = new IntSrvObjectsEnt(mib, this);
            this.intSrvGenObjects = new IntSrvGenObjectsEnt(mib, this);
            this.intSrvNotifications = new IntSrvNotificationsEnt(mib, this);
            this.intSrvConformance = new IntSrvConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.intSrvObjects,
                this.intSrvGenObjects,
                this.intSrvNotifications,
                this.intSrvConformance
            };
        }
        public static final class IntSrvObjectsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
        {
            /** The Integrated Services Interface Attributes Database containsinformation about resources allocated by resource reservationprotocols, such as RSVP and ST-II.*/
            public final IntSrvIfAttribTableEnt intSrvIfAttribTable;

            /** The Integrated Services Active Flows Databaselists all flows active on an outgoing interface, includingrelevant attributes.*/
            public final IntSrvFlowTableEnt intSrvFlowTable;

            private IntSrvObjectsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
            {
                super(mib, parent, "intSrvObjects", "1.3.6.1.2.1.52.1", false, false, false, false);
                this.intSrvIfAttribTable = new IntSrvIfAttribTableEnt(mib, this);
                this.intSrvFlowTable = new IntSrvFlowTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.intSrvIfAttribTable,
                    this.intSrvFlowTable
                };
            }
            public static final class IntSrvIfAttribTableEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
            {
                public final IntSrvIfAttribEntryEnt intSrvIfAttribEntry;

                private IntSrvIfAttribTableEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                {
                    super(mib, parent, "intSrvIfAttribTable", "1.3.6.1.2.1.52.1.1", false, true, false, false);
                    this.intSrvIfAttribEntry = new IntSrvIfAttribEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvIfAttribEntry
                    };
                }
                public static final class IntSrvIfAttribEntryEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                {
                    public final IntSrvIfAttribAllocatedBitsEnt intSrvIfAttribAllocatedBits;

                    public final IntSrvIfAttribMaxAllocatedBitsEnt intSrvIfAttribMaxAllocatedBits;

                    public final IntSrvIfAttribAllocatedBufferEnt intSrvIfAttribAllocatedBuffer;

                    public final IntSrvIfAttribFlowsEnt intSrvIfAttribFlows;

                    /** by default, interfaces are presumed to add
no extra delays*/
                    public final IntSrvIfAttribPropagationDelayEnt intSrvIfAttribPropagationDelay;

                    public final IntSrvIfAttribStatusEnt intSrvIfAttribStatus;

                    private IntSrvIfAttribEntryEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "intSrvIfAttribEntry", "1.3.6.1.2.1.52.1.1.1", false, false, false, true);
                        this.intSrvIfAttribAllocatedBits = new IntSrvIfAttribAllocatedBitsEnt(mib, this);
                        this.intSrvIfAttribMaxAllocatedBits = new IntSrvIfAttribMaxAllocatedBitsEnt(mib, this);
                        this.intSrvIfAttribAllocatedBuffer = new IntSrvIfAttribAllocatedBufferEnt(mib, this);
                        this.intSrvIfAttribFlows = new IntSrvIfAttribFlowsEnt(mib, this);
                        this.intSrvIfAttribPropagationDelay = new IntSrvIfAttribPropagationDelayEnt(mib, this);
                        this.intSrvIfAttribStatus = new IntSrvIfAttribStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.intSrvIfAttribAllocatedBits,
                            this.intSrvIfAttribMaxAllocatedBits,
                            this.intSrvIfAttribAllocatedBuffer,
                            this.intSrvIfAttribFlows,
                            this.intSrvIfAttribPropagationDelay,
                            this.intSrvIfAttribStatus
                        };
                    }
                    public static final class IntSrvIfAttribAllocatedBitsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvIfAttribAllocatedBitsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvIfAttribAllocatedBits", "1.3.6.1.2.1.52.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvIfAttribMaxAllocatedBitsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvIfAttribMaxAllocatedBitsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvIfAttribMaxAllocatedBits", "1.3.6.1.2.1.52.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvIfAttribAllocatedBufferEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvIfAttribAllocatedBufferEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvIfAttribAllocatedBuffer", "1.3.6.1.2.1.52.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvIfAttribFlowsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvIfAttribFlowsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvIfAttribFlows", "1.3.6.1.2.1.52.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvIfAttribPropagationDelayEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvIfAttribPropagationDelayEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvIfAttribPropagationDelay", "1.3.6.1.2.1.52.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvIfAttribStatusEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvIfAttribStatusEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvIfAttribStatus", "1.3.6.1.2.1.52.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IntSrvFlowTableEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
            {
                public final IntSrvFlowEntryEnt intSrvFlowEntry;

                private IntSrvFlowTableEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                {
                    super(mib, parent, "intSrvFlowTable", "1.3.6.1.2.1.52.1.2", false, true, false, false);
                    this.intSrvFlowEntry = new IntSrvFlowEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvFlowEntry
                    };
                }
                public static final class IntSrvFlowEntryEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                {
                    public final IntSrvFlowNumberEnt intSrvFlowNumber;

                    public final IntSrvFlowTypeEnt intSrvFlowType;

                    public final IntSrvFlowOwnerEnt intSrvFlowOwner;

                    public final IntSrvFlowDestAddrEnt intSrvFlowDestAddr;

                    public final IntSrvFlowSenderAddrEnt intSrvFlowSenderAddr;

                    public final IntSrvFlowDestAddrLengthEnt intSrvFlowDestAddrLength;

                    public final IntSrvFlowSenderAddrLengthEnt intSrvFlowSenderAddrLength;

                    public final IntSrvFlowProtocolEnt intSrvFlowProtocol;

                    public final IntSrvFlowDestPortEnt intSrvFlowDestPort;

                    public final IntSrvFlowPortEnt intSrvFlowPort;

                    public final IntSrvFlowFlowIdEnt intSrvFlowFlowId;

                    public final IntSrvFlowInterfaceEnt intSrvFlowInterface;

                    public final IntSrvFlowIfAddrEnt intSrvFlowIfAddr;

                    public final IntSrvFlowRateEnt intSrvFlowRate;

                    public final IntSrvFlowBurstEnt intSrvFlowBurst;

                    public final IntSrvFlowWeightEnt intSrvFlowWeight;

                    public final IntSrvFlowQueueEnt intSrvFlowQueue;

                    public final IntSrvFlowMinTUEnt intSrvFlowMinTU;

                    public final IntSrvFlowMaxTUEnt intSrvFlowMaxTU;

                    public final IntSrvFlowBestEffortEnt intSrvFlowBestEffort;

                    public final IntSrvFlowPolicedEnt intSrvFlowPoliced;

                    /** traffic is, by default, treated as best
effort*/
                    public final IntSrvFlowDiscardEnt intSrvFlowDiscard;

                    public final IntSrvFlowServiceEnt intSrvFlowService;

                    public final IntSrvFlowOrderEnt intSrvFlowOrder;

                    public final IntSrvFlowStatusEnt intSrvFlowStatus;

                    private IntSrvFlowEntryEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "intSrvFlowEntry", "1.3.6.1.2.1.52.1.2.1", false, false, false, true);
                        this.intSrvFlowNumber = new IntSrvFlowNumberEnt(mib, this);
                        this.intSrvFlowType = new IntSrvFlowTypeEnt(mib, this);
                        this.intSrvFlowOwner = new IntSrvFlowOwnerEnt(mib, this);
                        this.intSrvFlowDestAddr = new IntSrvFlowDestAddrEnt(mib, this);
                        this.intSrvFlowSenderAddr = new IntSrvFlowSenderAddrEnt(mib, this);
                        this.intSrvFlowDestAddrLength = new IntSrvFlowDestAddrLengthEnt(mib, this);
                        this.intSrvFlowSenderAddrLength = new IntSrvFlowSenderAddrLengthEnt(mib, this);
                        this.intSrvFlowProtocol = new IntSrvFlowProtocolEnt(mib, this);
                        this.intSrvFlowDestPort = new IntSrvFlowDestPortEnt(mib, this);
                        this.intSrvFlowPort = new IntSrvFlowPortEnt(mib, this);
                        this.intSrvFlowFlowId = new IntSrvFlowFlowIdEnt(mib, this);
                        this.intSrvFlowInterface = new IntSrvFlowInterfaceEnt(mib, this);
                        this.intSrvFlowIfAddr = new IntSrvFlowIfAddrEnt(mib, this);
                        this.intSrvFlowRate = new IntSrvFlowRateEnt(mib, this);
                        this.intSrvFlowBurst = new IntSrvFlowBurstEnt(mib, this);
                        this.intSrvFlowWeight = new IntSrvFlowWeightEnt(mib, this);
                        this.intSrvFlowQueue = new IntSrvFlowQueueEnt(mib, this);
                        this.intSrvFlowMinTU = new IntSrvFlowMinTUEnt(mib, this);
                        this.intSrvFlowMaxTU = new IntSrvFlowMaxTUEnt(mib, this);
                        this.intSrvFlowBestEffort = new IntSrvFlowBestEffortEnt(mib, this);
                        this.intSrvFlowPoliced = new IntSrvFlowPolicedEnt(mib, this);
                        this.intSrvFlowDiscard = new IntSrvFlowDiscardEnt(mib, this);
                        this.intSrvFlowService = new IntSrvFlowServiceEnt(mib, this);
                        this.intSrvFlowOrder = new IntSrvFlowOrderEnt(mib, this);
                        this.intSrvFlowStatus = new IntSrvFlowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.intSrvFlowNumber,
                            this.intSrvFlowType,
                            this.intSrvFlowOwner,
                            this.intSrvFlowDestAddr,
                            this.intSrvFlowSenderAddr,
                            this.intSrvFlowDestAddrLength,
                            this.intSrvFlowSenderAddrLength,
                            this.intSrvFlowProtocol,
                            this.intSrvFlowDestPort,
                            this.intSrvFlowPort,
                            this.intSrvFlowFlowId,
                            this.intSrvFlowInterface,
                            this.intSrvFlowIfAddr,
                            this.intSrvFlowRate,
                            this.intSrvFlowBurst,
                            this.intSrvFlowWeight,
                            this.intSrvFlowQueue,
                            this.intSrvFlowMinTU,
                            this.intSrvFlowMaxTU,
                            this.intSrvFlowBestEffort,
                            this.intSrvFlowPoliced,
                            this.intSrvFlowDiscard,
                            this.intSrvFlowService,
                            this.intSrvFlowOrder,
                            this.intSrvFlowStatus
                        };
                    }
                    public static final class IntSrvFlowNumberEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowNumberEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowNumber", "1.3.6.1.2.1.52.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowTypeEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowTypeEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowType", "1.3.6.1.2.1.52.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowOwnerEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowOwnerEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowOwner", "1.3.6.1.2.1.52.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowDestAddrEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowDestAddrEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowDestAddr", "1.3.6.1.2.1.52.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowSenderAddrEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowSenderAddrEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowSenderAddr", "1.3.6.1.2.1.52.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowDestAddrLengthEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowDestAddrLengthEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowDestAddrLength", "1.3.6.1.2.1.52.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowSenderAddrLengthEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowSenderAddrLengthEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowSenderAddrLength", "1.3.6.1.2.1.52.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowProtocolEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowProtocolEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowProtocol", "1.3.6.1.2.1.52.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowDestPortEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowDestPortEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowDestPort", "1.3.6.1.2.1.52.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowPortEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowPortEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowPort", "1.3.6.1.2.1.52.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowFlowIdEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowFlowIdEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowFlowId", "1.3.6.1.2.1.52.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowInterfaceEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowInterfaceEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowInterface", "1.3.6.1.2.1.52.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowIfAddrEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowIfAddrEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowIfAddr", "1.3.6.1.2.1.52.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowRateEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowRateEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowRate", "1.3.6.1.2.1.52.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowBurstEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowBurstEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowBurst", "1.3.6.1.2.1.52.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowWeightEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowWeightEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowWeight", "1.3.6.1.2.1.52.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowQueueEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowQueueEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowQueue", "1.3.6.1.2.1.52.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowMinTUEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowMinTUEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowMinTU", "1.3.6.1.2.1.52.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowMaxTUEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowMaxTUEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowMaxTU", "1.3.6.1.2.1.52.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowBestEffortEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowBestEffortEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowBestEffort", "1.3.6.1.2.1.52.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowPolicedEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowPolicedEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowPoliced", "1.3.6.1.2.1.52.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowDiscardEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowDiscardEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowDiscard", "1.3.6.1.2.1.52.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowServiceEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowServiceEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowService", "1.3.6.1.2.1.52.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowOrderEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowOrderEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowOrder", "1.3.6.1.2.1.52.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvFlowStatusEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                    {
                        private IntSrvFlowStatusEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                        {
                            super(mib, parent, "intSrvFlowStatus", "1.3.6.1.2.1.52.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IntSrvGenObjectsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
        {
            public final IntSrvFlowNewIndexEnt intSrvFlowNewIndex;

            private IntSrvGenObjectsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
            {
                super(mib, parent, "intSrvGenObjects", "1.3.6.1.2.1.52.2", false, false, false, false);
                this.intSrvFlowNewIndex = new IntSrvFlowNewIndexEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.intSrvFlowNewIndex
                };
            }
            public static final class IntSrvFlowNewIndexEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
            {
                private IntSrvFlowNewIndexEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                {
                    super(mib, parent, "intSrvFlowNewIndex", "1.3.6.1.2.1.52.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class IntSrvNotificationsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
        {
            private IntSrvNotificationsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
            {
                super(mib, parent, "intSrvNotifications", "1.3.6.1.2.1.52.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IntSrvConformanceEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
        {
            /** conformance information*/
            public final IntSrvGroupsEnt intSrvGroups;

            public final IntSrvCompliancesEnt intSrvCompliances;

            private IntSrvConformanceEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
            {
                super(mib, parent, "intSrvConformance", "1.3.6.1.2.1.52.4", false, false, false, false);
                this.intSrvGroups = new IntSrvGroupsEnt(mib, this);
                this.intSrvCompliances = new IntSrvCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.intSrvGroups,
                    this.intSrvCompliances
                };
            }
            public static final class IntSrvGroupsEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
            {
                public final IntSrvIfAttribGroupEnt intSrvIfAttribGroup;

                public final IntSrvFlowsGroupEnt intSrvFlowsGroup;

                private IntSrvGroupsEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                {
                    super(mib, parent, "intSrvGroups", "1.3.6.1.2.1.52.4.1", false, false, false, false);
                    this.intSrvIfAttribGroup = new IntSrvIfAttribGroupEnt(mib, this);
                    this.intSrvFlowsGroup = new IntSrvFlowsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvIfAttribGroup,
                        this.intSrvFlowsGroup
                    };
                }
                public static final class IntSrvIfAttribGroupEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                {
                    private IntSrvIfAttribGroupEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "intSrvIfAttribGroup", "1.3.6.1.2.1.52.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IntSrvFlowsGroupEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                {
                    private IntSrvFlowsGroupEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "intSrvFlowsGroup", "1.3.6.1.2.1.52.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IntSrvCompliancesEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
            {
                /** compliance statements*/
                public final IntSrvComplianceEnt intSrvCompliance;

                private IntSrvCompliancesEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                {
                    super(mib, parent, "intSrvCompliances", "1.3.6.1.2.1.52.4.2", false, false, false, false);
                    this.intSrvCompliance = new IntSrvComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvCompliance
                    };
                }
                public static final class IntSrvComplianceEnt extends MIBEntry<INTEGRATEDSERVICESMIBDef>
                {
                    private IntSrvComplianceEnt(INTEGRATEDSERVICESMIBDef mib, MIBEntry<INTEGRATEDSERVICESMIBDef> parent)
                    {
                        super(mib, parent, "intSrvCompliance", "1.3.6.1.2.1.52.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
