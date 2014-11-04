package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RSVPMIBDef extends MIB
{
    public static final RSVPMIBDef RSVPMIB = new RSVPMIBDef();

    static { MIBs.getInstance().registerMIB(RSVPMIBDef.RSVPMIB); }

    /** Thu Aug 28 09:03:53 PDT 1997*/
    public final RsvpEnt rsvp;

    private RSVPMIBDef()
    {
        super("RSVP-MIB");
        this.rsvp = new RsvpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rsvp
        };
    }

    public static final class RsvpEnt extends MIBEntry<RSVPMIBDef>
    {
        public final RsvpObjectsEnt rsvpObjects;

        /** tables*/
        public final RsvpGenObjectsEnt rsvpGenObjects;

        /** global objects*/
        public final RsvpNotificationsPrefixEnt rsvpNotificationsPrefix;

        /** traps*/
        public final RsvpConformanceEnt rsvpConformance;

        private RsvpEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
        {
            super(mib, parent, "rsvp", "1.3.6.1.2.1.51", false, false, false, false);
            this.rsvpObjects = new RsvpObjectsEnt(mib, this);
            this.rsvpGenObjects = new RsvpGenObjectsEnt(mib, this);
            this.rsvpNotificationsPrefix = new RsvpNotificationsPrefixEnt(mib, this);
            this.rsvpConformance = new RsvpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rsvpObjects,
                this.rsvpGenObjects,
                this.rsvpNotificationsPrefix,
                this.rsvpConformance
            };
        }
        public static final class RsvpObjectsEnt extends MIBEntry<RSVPMIBDef>
        {
            /** The RSVP Session Statistics Database displays statisticsrelating to the number of senders and receivers in eachsession.*/
            public final RsvpSessionTableEnt rsvpSessionTable;

            public final RsvpSenderTableEnt rsvpSenderTable;

            public final RsvpSenderOutInterfaceTableEnt rsvpSenderOutInterfaceTable;

            public final RsvpResvTableEnt rsvpResvTable;

            public final RsvpResvFwdTableEnt rsvpResvFwdTable;

            /** The RSVP Interface Attributes Database contains theRSVP-specific information for an interface. Informationthat is shared with other reservation procedures suchas ST-II is in the Integrated Interface AttributesDatabase.*/
            public final RsvpIfTableEnt rsvpIfTable;

            /** The RSVP Neighbor Database lists the neighbors the RSVPprocess currently is receiving messages from.*/
            public final RsvpNbrTableEnt rsvpNbrTable;

            private RsvpObjectsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
            {
                super(mib, parent, "rsvpObjects", "1.3.6.1.2.1.51.1", false, false, false, false);
                this.rsvpSessionTable = new RsvpSessionTableEnt(mib, this);
                this.rsvpSenderTable = new RsvpSenderTableEnt(mib, this);
                this.rsvpSenderOutInterfaceTable = new RsvpSenderOutInterfaceTableEnt(mib, this);
                this.rsvpResvTable = new RsvpResvTableEnt(mib, this);
                this.rsvpResvFwdTable = new RsvpResvFwdTableEnt(mib, this);
                this.rsvpIfTable = new RsvpIfTableEnt(mib, this);
                this.rsvpNbrTable = new RsvpNbrTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rsvpSessionTable,
                    this.rsvpSenderTable,
                    this.rsvpSenderOutInterfaceTable,
                    this.rsvpResvTable,
                    this.rsvpResvFwdTable,
                    this.rsvpIfTable,
                    this.rsvpNbrTable
                };
            }
            public static final class RsvpSessionTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpSessionEntryEnt rsvpSessionEntry;

                private RsvpSessionTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpSessionTable", "1.3.6.1.2.1.51.1.1", false, true, false, false);
                    this.rsvpSessionEntry = new RsvpSessionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpSessionEntry
                    };
                }
                public static final class RsvpSessionEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpSessionNumberEnt rsvpSessionNumber;

                    public final RsvpSessionTypeEnt rsvpSessionType;

                    public final RsvpSessionDestAddrEnt rsvpSessionDestAddr;

                    public final RsvpSessionDestAddrLengthEnt rsvpSessionDestAddrLength;

                    public final RsvpSessionProtocolEnt rsvpSessionProtocol;

                    public final RsvpSessionPortEnt rsvpSessionPort;

                    public final RsvpSessionSendersEnt rsvpSessionSenders;

                    public final RsvpSessionReceiversEnt rsvpSessionReceivers;

                    public final RsvpSessionRequestsEnt rsvpSessionRequests;

                    private RsvpSessionEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpSessionEntry", "1.3.6.1.2.1.51.1.1.1", false, false, false, true);
                        this.rsvpSessionNumber = new RsvpSessionNumberEnt(mib, this);
                        this.rsvpSessionType = new RsvpSessionTypeEnt(mib, this);
                        this.rsvpSessionDestAddr = new RsvpSessionDestAddrEnt(mib, this);
                        this.rsvpSessionDestAddrLength = new RsvpSessionDestAddrLengthEnt(mib, this);
                        this.rsvpSessionProtocol = new RsvpSessionProtocolEnt(mib, this);
                        this.rsvpSessionPort = new RsvpSessionPortEnt(mib, this);
                        this.rsvpSessionSenders = new RsvpSessionSendersEnt(mib, this);
                        this.rsvpSessionReceivers = new RsvpSessionReceiversEnt(mib, this);
                        this.rsvpSessionRequests = new RsvpSessionRequestsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpSessionNumber,
                            this.rsvpSessionType,
                            this.rsvpSessionDestAddr,
                            this.rsvpSessionDestAddrLength,
                            this.rsvpSessionProtocol,
                            this.rsvpSessionPort,
                            this.rsvpSessionSenders,
                            this.rsvpSessionReceivers,
                            this.rsvpSessionRequests
                        };
                    }
                    public static final class RsvpSessionNumberEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionNumberEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionNumber", "1.3.6.1.2.1.51.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionTypeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionTypeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionType", "1.3.6.1.2.1.51.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionDestAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionDestAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionDestAddr", "1.3.6.1.2.1.51.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionDestAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionDestAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionDestAddrLength", "1.3.6.1.2.1.51.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionProtocolEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionProtocolEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionProtocol", "1.3.6.1.2.1.51.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionPort", "1.3.6.1.2.1.51.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionSendersEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionSendersEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionSenders", "1.3.6.1.2.1.51.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionReceiversEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionReceiversEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionReceivers", "1.3.6.1.2.1.51.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSessionRequestsEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSessionRequestsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSessionRequests", "1.3.6.1.2.1.51.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RsvpSenderTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpSenderEntryEnt rsvpSenderEntry;

                private RsvpSenderTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpSenderTable", "1.3.6.1.2.1.51.1.2", false, true, false, false);
                    this.rsvpSenderEntry = new RsvpSenderEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpSenderEntry
                    };
                }
                public static final class RsvpSenderEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpSenderNumberEnt rsvpSenderNumber;

                    public final RsvpSenderTypeEnt rsvpSenderType;

                    public final RsvpSenderDestAddrEnt rsvpSenderDestAddr;

                    public final RsvpSenderAddrEnt rsvpSenderAddr;

                    public final RsvpSenderDestAddrLengthEnt rsvpSenderDestAddrLength;

                    public final RsvpSenderAddrLengthEnt rsvpSenderAddrLength;

                    public final RsvpSenderProtocolEnt rsvpSenderProtocol;

                    public final RsvpSenderDestPortEnt rsvpSenderDestPort;

                    public final RsvpSenderPortEnt rsvpSenderPort;

                    public final RsvpSenderFlowIdEnt rsvpSenderFlowId;

                    public final RsvpSenderHopAddrEnt rsvpSenderHopAddr;

                    public final RsvpSenderHopLihEnt rsvpSenderHopLih;

                    public final RsvpSenderInterfaceEnt rsvpSenderInterface;

                    public final RsvpSenderTSpecRateEnt rsvpSenderTSpecRate;

                    public final RsvpSenderTSpecPeakRateEnt rsvpSenderTSpecPeakRate;

                    public final RsvpSenderTSpecBurstEnt rsvpSenderTSpecBurst;

                    public final RsvpSenderTSpecMinTUEnt rsvpSenderTSpecMinTU;

                    public final RsvpSenderTSpecMaxTUEnt rsvpSenderTSpecMaxTU;

                    public final RsvpSenderIntervalEnt rsvpSenderInterval;

                    public final RsvpSenderRSVPHopEnt rsvpSenderRSVPHop;

                    public final RsvpSenderLastChangeEnt rsvpSenderLastChange;

                    public final RsvpSenderPolicyEnt rsvpSenderPolicy;

                    public final RsvpSenderAdspecBreakEnt rsvpSenderAdspecBreak;

                    public final RsvpSenderAdspecHopCountEnt rsvpSenderAdspecHopCount;

                    public final RsvpSenderAdspecPathBwEnt rsvpSenderAdspecPathBw;

                    public final RsvpSenderAdspecMinLatencyEnt rsvpSenderAdspecMinLatency;

                    public final RsvpSenderAdspecMtuEnt rsvpSenderAdspecMtu;

                    public final RsvpSenderAdspecGuaranteedSvcEnt rsvpSenderAdspecGuaranteedSvc;

                    public final RsvpSenderAdspecGuaranteedBreakEnt rsvpSenderAdspecGuaranteedBreak;

                    public final RsvpSenderAdspecGuaranteedCtotEnt rsvpSenderAdspecGuaranteedCtot;

                    public final RsvpSenderAdspecGuaranteedDtotEnt rsvpSenderAdspecGuaranteedDtot;

                    public final RsvpSenderAdspecGuaranteedCsumEnt rsvpSenderAdspecGuaranteedCsum;

                    public final RsvpSenderAdspecGuaranteedDsumEnt rsvpSenderAdspecGuaranteedDsum;

                    public final RsvpSenderAdspecGuaranteedHopCountEnt rsvpSenderAdspecGuaranteedHopCount;

                    public final RsvpSenderAdspecGuaranteedPathBwEnt rsvpSenderAdspecGuaranteedPathBw;

                    public final RsvpSenderAdspecGuaranteedMinLatencyEnt rsvpSenderAdspecGuaranteedMinLatency;

                    public final RsvpSenderAdspecGuaranteedMtuEnt rsvpSenderAdspecGuaranteedMtu;

                    public final RsvpSenderAdspecCtrlLoadSvcEnt rsvpSenderAdspecCtrlLoadSvc;

                    public final RsvpSenderAdspecCtrlLoadBreakEnt rsvpSenderAdspecCtrlLoadBreak;

                    public final RsvpSenderAdspecCtrlLoadHopCountEnt rsvpSenderAdspecCtrlLoadHopCount;

                    public final RsvpSenderAdspecCtrlLoadPathBwEnt rsvpSenderAdspecCtrlLoadPathBw;

                    public final RsvpSenderAdspecCtrlLoadMinLatencyEnt rsvpSenderAdspecCtrlLoadMinLatency;

                    public final RsvpSenderAdspecCtrlLoadMtuEnt rsvpSenderAdspecCtrlLoadMtu;

                    public final RsvpSenderStatusEnt rsvpSenderStatus;

                    public final RsvpSenderTTLEnt rsvpSenderTTL;

                    private RsvpSenderEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpSenderEntry", "1.3.6.1.2.1.51.1.2.1", false, false, false, true);
                        this.rsvpSenderNumber = new RsvpSenderNumberEnt(mib, this);
                        this.rsvpSenderType = new RsvpSenderTypeEnt(mib, this);
                        this.rsvpSenderDestAddr = new RsvpSenderDestAddrEnt(mib, this);
                        this.rsvpSenderAddr = new RsvpSenderAddrEnt(mib, this);
                        this.rsvpSenderDestAddrLength = new RsvpSenderDestAddrLengthEnt(mib, this);
                        this.rsvpSenderAddrLength = new RsvpSenderAddrLengthEnt(mib, this);
                        this.rsvpSenderProtocol = new RsvpSenderProtocolEnt(mib, this);
                        this.rsvpSenderDestPort = new RsvpSenderDestPortEnt(mib, this);
                        this.rsvpSenderPort = new RsvpSenderPortEnt(mib, this);
                        this.rsvpSenderFlowId = new RsvpSenderFlowIdEnt(mib, this);
                        this.rsvpSenderHopAddr = new RsvpSenderHopAddrEnt(mib, this);
                        this.rsvpSenderHopLih = new RsvpSenderHopLihEnt(mib, this);
                        this.rsvpSenderInterface = new RsvpSenderInterfaceEnt(mib, this);
                        this.rsvpSenderTSpecRate = new RsvpSenderTSpecRateEnt(mib, this);
                        this.rsvpSenderTSpecPeakRate = new RsvpSenderTSpecPeakRateEnt(mib, this);
                        this.rsvpSenderTSpecBurst = new RsvpSenderTSpecBurstEnt(mib, this);
                        this.rsvpSenderTSpecMinTU = new RsvpSenderTSpecMinTUEnt(mib, this);
                        this.rsvpSenderTSpecMaxTU = new RsvpSenderTSpecMaxTUEnt(mib, this);
                        this.rsvpSenderInterval = new RsvpSenderIntervalEnt(mib, this);
                        this.rsvpSenderRSVPHop = new RsvpSenderRSVPHopEnt(mib, this);
                        this.rsvpSenderLastChange = new RsvpSenderLastChangeEnt(mib, this);
                        this.rsvpSenderPolicy = new RsvpSenderPolicyEnt(mib, this);
                        this.rsvpSenderAdspecBreak = new RsvpSenderAdspecBreakEnt(mib, this);
                        this.rsvpSenderAdspecHopCount = new RsvpSenderAdspecHopCountEnt(mib, this);
                        this.rsvpSenderAdspecPathBw = new RsvpSenderAdspecPathBwEnt(mib, this);
                        this.rsvpSenderAdspecMinLatency = new RsvpSenderAdspecMinLatencyEnt(mib, this);
                        this.rsvpSenderAdspecMtu = new RsvpSenderAdspecMtuEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedSvc = new RsvpSenderAdspecGuaranteedSvcEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedBreak = new RsvpSenderAdspecGuaranteedBreakEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedCtot = new RsvpSenderAdspecGuaranteedCtotEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedDtot = new RsvpSenderAdspecGuaranteedDtotEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedCsum = new RsvpSenderAdspecGuaranteedCsumEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedDsum = new RsvpSenderAdspecGuaranteedDsumEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedHopCount = new RsvpSenderAdspecGuaranteedHopCountEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedPathBw = new RsvpSenderAdspecGuaranteedPathBwEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedMinLatency = new RsvpSenderAdspecGuaranteedMinLatencyEnt(mib, this);
                        this.rsvpSenderAdspecGuaranteedMtu = new RsvpSenderAdspecGuaranteedMtuEnt(mib, this);
                        this.rsvpSenderAdspecCtrlLoadSvc = new RsvpSenderAdspecCtrlLoadSvcEnt(mib, this);
                        this.rsvpSenderAdspecCtrlLoadBreak = new RsvpSenderAdspecCtrlLoadBreakEnt(mib, this);
                        this.rsvpSenderAdspecCtrlLoadHopCount = new RsvpSenderAdspecCtrlLoadHopCountEnt(mib, this);
                        this.rsvpSenderAdspecCtrlLoadPathBw = new RsvpSenderAdspecCtrlLoadPathBwEnt(mib, this);
                        this.rsvpSenderAdspecCtrlLoadMinLatency = new RsvpSenderAdspecCtrlLoadMinLatencyEnt(mib, this);
                        this.rsvpSenderAdspecCtrlLoadMtu = new RsvpSenderAdspecCtrlLoadMtuEnt(mib, this);
                        this.rsvpSenderStatus = new RsvpSenderStatusEnt(mib, this);
                        this.rsvpSenderTTL = new RsvpSenderTTLEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpSenderNumber,
                            this.rsvpSenderType,
                            this.rsvpSenderDestAddr,
                            this.rsvpSenderAddr,
                            this.rsvpSenderDestAddrLength,
                            this.rsvpSenderAddrLength,
                            this.rsvpSenderProtocol,
                            this.rsvpSenderDestPort,
                            this.rsvpSenderPort,
                            this.rsvpSenderFlowId,
                            this.rsvpSenderHopAddr,
                            this.rsvpSenderHopLih,
                            this.rsvpSenderInterface,
                            this.rsvpSenderTSpecRate,
                            this.rsvpSenderTSpecPeakRate,
                            this.rsvpSenderTSpecBurst,
                            this.rsvpSenderTSpecMinTU,
                            this.rsvpSenderTSpecMaxTU,
                            this.rsvpSenderInterval,
                            this.rsvpSenderRSVPHop,
                            this.rsvpSenderLastChange,
                            this.rsvpSenderPolicy,
                            this.rsvpSenderAdspecBreak,
                            this.rsvpSenderAdspecHopCount,
                            this.rsvpSenderAdspecPathBw,
                            this.rsvpSenderAdspecMinLatency,
                            this.rsvpSenderAdspecMtu,
                            this.rsvpSenderAdspecGuaranteedSvc,
                            this.rsvpSenderAdspecGuaranteedBreak,
                            this.rsvpSenderAdspecGuaranteedCtot,
                            this.rsvpSenderAdspecGuaranteedDtot,
                            this.rsvpSenderAdspecGuaranteedCsum,
                            this.rsvpSenderAdspecGuaranteedDsum,
                            this.rsvpSenderAdspecGuaranteedHopCount,
                            this.rsvpSenderAdspecGuaranteedPathBw,
                            this.rsvpSenderAdspecGuaranteedMinLatency,
                            this.rsvpSenderAdspecGuaranteedMtu,
                            this.rsvpSenderAdspecCtrlLoadSvc,
                            this.rsvpSenderAdspecCtrlLoadBreak,
                            this.rsvpSenderAdspecCtrlLoadHopCount,
                            this.rsvpSenderAdspecCtrlLoadPathBw,
                            this.rsvpSenderAdspecCtrlLoadMinLatency,
                            this.rsvpSenderAdspecCtrlLoadMtu,
                            this.rsvpSenderStatus,
                            this.rsvpSenderTTL
                        };
                    }
                    public static final class RsvpSenderNumberEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderNumberEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderNumber", "1.3.6.1.2.1.51.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTypeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTypeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderType", "1.3.6.1.2.1.51.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderDestAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderDestAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderDestAddr", "1.3.6.1.2.1.51.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAddr", "1.3.6.1.2.1.51.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderDestAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderDestAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderDestAddrLength", "1.3.6.1.2.1.51.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAddrLength", "1.3.6.1.2.1.51.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderProtocolEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderProtocolEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderProtocol", "1.3.6.1.2.1.51.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderDestPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderDestPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderDestPort", "1.3.6.1.2.1.51.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderPort", "1.3.6.1.2.1.51.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderFlowIdEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderFlowIdEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderFlowId", "1.3.6.1.2.1.51.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderHopAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderHopAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderHopAddr", "1.3.6.1.2.1.51.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderHopLihEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderHopLihEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderHopLih", "1.3.6.1.2.1.51.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderInterfaceEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderInterfaceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderInterface", "1.3.6.1.2.1.51.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTSpecRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTSpecRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderTSpecRate", "1.3.6.1.2.1.51.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTSpecPeakRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTSpecPeakRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderTSpecPeakRate", "1.3.6.1.2.1.51.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTSpecBurstEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTSpecBurstEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderTSpecBurst", "1.3.6.1.2.1.51.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTSpecMinTUEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTSpecMinTUEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderTSpecMinTU", "1.3.6.1.2.1.51.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTSpecMaxTUEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTSpecMaxTUEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderTSpecMaxTU", "1.3.6.1.2.1.51.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderIntervalEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderIntervalEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderInterval", "1.3.6.1.2.1.51.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderRSVPHopEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderRSVPHopEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderRSVPHop", "1.3.6.1.2.1.51.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderLastChangeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderLastChangeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderLastChange", "1.3.6.1.2.1.51.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderPolicyEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderPolicyEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderPolicy", "1.3.6.1.2.1.51.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecBreakEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecBreakEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecBreak", "1.3.6.1.2.1.51.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecHopCountEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecHopCountEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecHopCount", "1.3.6.1.2.1.51.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecPathBwEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecPathBwEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecPathBw", "1.3.6.1.2.1.51.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecMinLatencyEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecMinLatencyEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecMinLatency", "1.3.6.1.2.1.51.1.2.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecMtuEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecMtuEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecMtu", "1.3.6.1.2.1.51.1.2.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedSvcEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedSvcEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedSvc", "1.3.6.1.2.1.51.1.2.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedBreakEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedBreakEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedBreak", "1.3.6.1.2.1.51.1.2.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedCtotEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedCtotEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedCtot", "1.3.6.1.2.1.51.1.2.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedDtotEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedDtotEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedDtot", "1.3.6.1.2.1.51.1.2.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedCsumEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedCsumEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedCsum", "1.3.6.1.2.1.51.1.2.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedDsumEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedDsumEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedDsum", "1.3.6.1.2.1.51.1.2.1.33", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedHopCountEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedHopCountEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedHopCount", "1.3.6.1.2.1.51.1.2.1.34", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedPathBwEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedPathBwEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedPathBw", "1.3.6.1.2.1.51.1.2.1.35", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedMinLatencyEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedMinLatencyEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedMinLatency", "1.3.6.1.2.1.51.1.2.1.36", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecGuaranteedMtuEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecGuaranteedMtuEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecGuaranteedMtu", "1.3.6.1.2.1.51.1.2.1.37", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecCtrlLoadSvcEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecCtrlLoadSvcEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecCtrlLoadSvc", "1.3.6.1.2.1.51.1.2.1.38", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecCtrlLoadBreakEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecCtrlLoadBreakEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecCtrlLoadBreak", "1.3.6.1.2.1.51.1.2.1.39", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecCtrlLoadHopCountEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecCtrlLoadHopCountEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecCtrlLoadHopCount", "1.3.6.1.2.1.51.1.2.1.40", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecCtrlLoadPathBwEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecCtrlLoadPathBwEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecCtrlLoadPathBw", "1.3.6.1.2.1.51.1.2.1.41", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecCtrlLoadMinLatencyEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecCtrlLoadMinLatencyEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecCtrlLoadMinLatency", "1.3.6.1.2.1.51.1.2.1.42", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderAdspecCtrlLoadMtuEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderAdspecCtrlLoadMtuEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderAdspecCtrlLoadMtu", "1.3.6.1.2.1.51.1.2.1.43", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderStatusEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderStatusEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderStatus", "1.3.6.1.2.1.51.1.2.1.44", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpSenderTTLEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderTTLEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderTTL", "1.3.6.1.2.1.51.1.2.1.45", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RsvpSenderOutInterfaceTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpSenderOutInterfaceEntryEnt rsvpSenderOutInterfaceEntry;

                private RsvpSenderOutInterfaceTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpSenderOutInterfaceTable", "1.3.6.1.2.1.51.1.3", false, true, false, false);
                    this.rsvpSenderOutInterfaceEntry = new RsvpSenderOutInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpSenderOutInterfaceEntry
                    };
                }
                public static final class RsvpSenderOutInterfaceEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpSenderOutInterfaceStatusEnt rsvpSenderOutInterfaceStatus;

                    private RsvpSenderOutInterfaceEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpSenderOutInterfaceEntry", "1.3.6.1.2.1.51.1.3.1", false, false, false, true);
                        this.rsvpSenderOutInterfaceStatus = new RsvpSenderOutInterfaceStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpSenderOutInterfaceStatus
                        };
                    }
                    public static final class RsvpSenderOutInterfaceStatusEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpSenderOutInterfaceStatusEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpSenderOutInterfaceStatus", "1.3.6.1.2.1.51.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RsvpResvTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpResvEntryEnt rsvpResvEntry;

                private RsvpResvTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpResvTable", "1.3.6.1.2.1.51.1.4", false, true, false, false);
                    this.rsvpResvEntry = new RsvpResvEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpResvEntry
                    };
                }
                public static final class RsvpResvEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpResvNumberEnt rsvpResvNumber;

                    public final RsvpResvTypeEnt rsvpResvType;

                    public final RsvpResvDestAddrEnt rsvpResvDestAddr;

                    public final RsvpResvSenderAddrEnt rsvpResvSenderAddr;

                    public final RsvpResvDestAddrLengthEnt rsvpResvDestAddrLength;

                    public final RsvpResvSenderAddrLengthEnt rsvpResvSenderAddrLength;

                    public final RsvpResvProtocolEnt rsvpResvProtocol;

                    public final RsvpResvDestPortEnt rsvpResvDestPort;

                    public final RsvpResvPortEnt rsvpResvPort;

                    public final RsvpResvHopAddrEnt rsvpResvHopAddr;

                    public final RsvpResvHopLihEnt rsvpResvHopLih;

                    public final RsvpResvInterfaceEnt rsvpResvInterface;

                    public final RsvpResvServiceEnt rsvpResvService;

                    public final RsvpResvTSpecRateEnt rsvpResvTSpecRate;

                    public final RsvpResvTSpecPeakRateEnt rsvpResvTSpecPeakRate;

                    public final RsvpResvTSpecBurstEnt rsvpResvTSpecBurst;

                    public final RsvpResvTSpecMinTUEnt rsvpResvTSpecMinTU;

                    public final RsvpResvTSpecMaxTUEnt rsvpResvTSpecMaxTU;

                    public final RsvpResvRSpecRateEnt rsvpResvRSpecRate;

                    public final RsvpResvRSpecSlackEnt rsvpResvRSpecSlack;

                    public final RsvpResvIntervalEnt rsvpResvInterval;

                    public final RsvpResvScopeEnt rsvpResvScope;

                    public final RsvpResvSharedEnt rsvpResvShared;

                    public final RsvpResvExplicitEnt rsvpResvExplicit;

                    public final RsvpResvRSVPHopEnt rsvpResvRSVPHop;

                    public final RsvpResvLastChangeEnt rsvpResvLastChange;

                    public final RsvpResvPolicyEnt rsvpResvPolicy;

                    public final RsvpResvStatusEnt rsvpResvStatus;

                    public final RsvpResvTTLEnt rsvpResvTTL;

                    public final RsvpResvFlowIdEnt rsvpResvFlowId;

                    private RsvpResvEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpResvEntry", "1.3.6.1.2.1.51.1.4.1", false, false, false, true);
                        this.rsvpResvNumber = new RsvpResvNumberEnt(mib, this);
                        this.rsvpResvType = new RsvpResvTypeEnt(mib, this);
                        this.rsvpResvDestAddr = new RsvpResvDestAddrEnt(mib, this);
                        this.rsvpResvSenderAddr = new RsvpResvSenderAddrEnt(mib, this);
                        this.rsvpResvDestAddrLength = new RsvpResvDestAddrLengthEnt(mib, this);
                        this.rsvpResvSenderAddrLength = new RsvpResvSenderAddrLengthEnt(mib, this);
                        this.rsvpResvProtocol = new RsvpResvProtocolEnt(mib, this);
                        this.rsvpResvDestPort = new RsvpResvDestPortEnt(mib, this);
                        this.rsvpResvPort = new RsvpResvPortEnt(mib, this);
                        this.rsvpResvHopAddr = new RsvpResvHopAddrEnt(mib, this);
                        this.rsvpResvHopLih = new RsvpResvHopLihEnt(mib, this);
                        this.rsvpResvInterface = new RsvpResvInterfaceEnt(mib, this);
                        this.rsvpResvService = new RsvpResvServiceEnt(mib, this);
                        this.rsvpResvTSpecRate = new RsvpResvTSpecRateEnt(mib, this);
                        this.rsvpResvTSpecPeakRate = new RsvpResvTSpecPeakRateEnt(mib, this);
                        this.rsvpResvTSpecBurst = new RsvpResvTSpecBurstEnt(mib, this);
                        this.rsvpResvTSpecMinTU = new RsvpResvTSpecMinTUEnt(mib, this);
                        this.rsvpResvTSpecMaxTU = new RsvpResvTSpecMaxTUEnt(mib, this);
                        this.rsvpResvRSpecRate = new RsvpResvRSpecRateEnt(mib, this);
                        this.rsvpResvRSpecSlack = new RsvpResvRSpecSlackEnt(mib, this);
                        this.rsvpResvInterval = new RsvpResvIntervalEnt(mib, this);
                        this.rsvpResvScope = new RsvpResvScopeEnt(mib, this);
                        this.rsvpResvShared = new RsvpResvSharedEnt(mib, this);
                        this.rsvpResvExplicit = new RsvpResvExplicitEnt(mib, this);
                        this.rsvpResvRSVPHop = new RsvpResvRSVPHopEnt(mib, this);
                        this.rsvpResvLastChange = new RsvpResvLastChangeEnt(mib, this);
                        this.rsvpResvPolicy = new RsvpResvPolicyEnt(mib, this);
                        this.rsvpResvStatus = new RsvpResvStatusEnt(mib, this);
                        this.rsvpResvTTL = new RsvpResvTTLEnt(mib, this);
                        this.rsvpResvFlowId = new RsvpResvFlowIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpResvNumber,
                            this.rsvpResvType,
                            this.rsvpResvDestAddr,
                            this.rsvpResvSenderAddr,
                            this.rsvpResvDestAddrLength,
                            this.rsvpResvSenderAddrLength,
                            this.rsvpResvProtocol,
                            this.rsvpResvDestPort,
                            this.rsvpResvPort,
                            this.rsvpResvHopAddr,
                            this.rsvpResvHopLih,
                            this.rsvpResvInterface,
                            this.rsvpResvService,
                            this.rsvpResvTSpecRate,
                            this.rsvpResvTSpecPeakRate,
                            this.rsvpResvTSpecBurst,
                            this.rsvpResvTSpecMinTU,
                            this.rsvpResvTSpecMaxTU,
                            this.rsvpResvRSpecRate,
                            this.rsvpResvRSpecSlack,
                            this.rsvpResvInterval,
                            this.rsvpResvScope,
                            this.rsvpResvShared,
                            this.rsvpResvExplicit,
                            this.rsvpResvRSVPHop,
                            this.rsvpResvLastChange,
                            this.rsvpResvPolicy,
                            this.rsvpResvStatus,
                            this.rsvpResvTTL,
                            this.rsvpResvFlowId
                        };
                    }
                    public static final class RsvpResvNumberEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvNumberEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvNumber", "1.3.6.1.2.1.51.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTypeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTypeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvType", "1.3.6.1.2.1.51.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvDestAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvDestAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvDestAddr", "1.3.6.1.2.1.51.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvSenderAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvSenderAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvSenderAddr", "1.3.6.1.2.1.51.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvDestAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvDestAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvDestAddrLength", "1.3.6.1.2.1.51.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvSenderAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvSenderAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvSenderAddrLength", "1.3.6.1.2.1.51.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvProtocolEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvProtocolEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvProtocol", "1.3.6.1.2.1.51.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvDestPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvDestPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvDestPort", "1.3.6.1.2.1.51.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvPort", "1.3.6.1.2.1.51.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvHopAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvHopAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvHopAddr", "1.3.6.1.2.1.51.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvHopLihEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvHopLihEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvHopLih", "1.3.6.1.2.1.51.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvInterfaceEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvInterfaceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvInterface", "1.3.6.1.2.1.51.1.4.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvServiceEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvServiceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvService", "1.3.6.1.2.1.51.1.4.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTSpecRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTSpecRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvTSpecRate", "1.3.6.1.2.1.51.1.4.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTSpecPeakRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTSpecPeakRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvTSpecPeakRate", "1.3.6.1.2.1.51.1.4.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTSpecBurstEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTSpecBurstEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvTSpecBurst", "1.3.6.1.2.1.51.1.4.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTSpecMinTUEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTSpecMinTUEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvTSpecMinTU", "1.3.6.1.2.1.51.1.4.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTSpecMaxTUEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTSpecMaxTUEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvTSpecMaxTU", "1.3.6.1.2.1.51.1.4.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvRSpecRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvRSpecRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvRSpecRate", "1.3.6.1.2.1.51.1.4.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvRSpecSlackEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvRSpecSlackEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvRSpecSlack", "1.3.6.1.2.1.51.1.4.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvIntervalEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvIntervalEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvInterval", "1.3.6.1.2.1.51.1.4.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvScopeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvScopeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvScope", "1.3.6.1.2.1.51.1.4.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvSharedEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvSharedEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvShared", "1.3.6.1.2.1.51.1.4.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvExplicitEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvExplicitEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvExplicit", "1.3.6.1.2.1.51.1.4.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvRSVPHopEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvRSVPHopEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvRSVPHop", "1.3.6.1.2.1.51.1.4.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvLastChangeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvLastChangeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvLastChange", "1.3.6.1.2.1.51.1.4.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvPolicyEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvPolicyEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvPolicy", "1.3.6.1.2.1.51.1.4.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvStatusEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvStatusEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvStatus", "1.3.6.1.2.1.51.1.4.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvTTLEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvTTLEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvTTL", "1.3.6.1.2.1.51.1.4.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFlowIdEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFlowIdEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFlowId", "1.3.6.1.2.1.51.1.4.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RsvpResvFwdTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpResvFwdEntryEnt rsvpResvFwdEntry;

                private RsvpResvFwdTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpResvFwdTable", "1.3.6.1.2.1.51.1.5", false, true, false, false);
                    this.rsvpResvFwdEntry = new RsvpResvFwdEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpResvFwdEntry
                    };
                }
                public static final class RsvpResvFwdEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpResvFwdNumberEnt rsvpResvFwdNumber;

                    public final RsvpResvFwdTypeEnt rsvpResvFwdType;

                    public final RsvpResvFwdDestAddrEnt rsvpResvFwdDestAddr;

                    public final RsvpResvFwdSenderAddrEnt rsvpResvFwdSenderAddr;

                    public final RsvpResvFwdDestAddrLengthEnt rsvpResvFwdDestAddrLength;

                    public final RsvpResvFwdSenderAddrLengthEnt rsvpResvFwdSenderAddrLength;

                    public final RsvpResvFwdProtocolEnt rsvpResvFwdProtocol;

                    public final RsvpResvFwdDestPortEnt rsvpResvFwdDestPort;

                    public final RsvpResvFwdPortEnt rsvpResvFwdPort;

                    public final RsvpResvFwdHopAddrEnt rsvpResvFwdHopAddr;

                    public final RsvpResvFwdHopLihEnt rsvpResvFwdHopLih;

                    public final RsvpResvFwdInterfaceEnt rsvpResvFwdInterface;

                    public final RsvpResvFwdServiceEnt rsvpResvFwdService;

                    public final RsvpResvFwdTSpecRateEnt rsvpResvFwdTSpecRate;

                    public final RsvpResvFwdTSpecPeakRateEnt rsvpResvFwdTSpecPeakRate;

                    public final RsvpResvFwdTSpecBurstEnt rsvpResvFwdTSpecBurst;

                    public final RsvpResvFwdTSpecMinTUEnt rsvpResvFwdTSpecMinTU;

                    public final RsvpResvFwdTSpecMaxTUEnt rsvpResvFwdTSpecMaxTU;

                    public final RsvpResvFwdRSpecRateEnt rsvpResvFwdRSpecRate;

                    public final RsvpResvFwdRSpecSlackEnt rsvpResvFwdRSpecSlack;

                    public final RsvpResvFwdIntervalEnt rsvpResvFwdInterval;

                    public final RsvpResvFwdScopeEnt rsvpResvFwdScope;

                    public final RsvpResvFwdSharedEnt rsvpResvFwdShared;

                    public final RsvpResvFwdExplicitEnt rsvpResvFwdExplicit;

                    public final RsvpResvFwdRSVPHopEnt rsvpResvFwdRSVPHop;

                    public final RsvpResvFwdLastChangeEnt rsvpResvFwdLastChange;

                    public final RsvpResvFwdPolicyEnt rsvpResvFwdPolicy;

                    public final RsvpResvFwdStatusEnt rsvpResvFwdStatus;

                    public final RsvpResvFwdTTLEnt rsvpResvFwdTTL;

                    public final RsvpResvFwdFlowIdEnt rsvpResvFwdFlowId;

                    private RsvpResvFwdEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpResvFwdEntry", "1.3.6.1.2.1.51.1.5.1", false, false, false, true);
                        this.rsvpResvFwdNumber = new RsvpResvFwdNumberEnt(mib, this);
                        this.rsvpResvFwdType = new RsvpResvFwdTypeEnt(mib, this);
                        this.rsvpResvFwdDestAddr = new RsvpResvFwdDestAddrEnt(mib, this);
                        this.rsvpResvFwdSenderAddr = new RsvpResvFwdSenderAddrEnt(mib, this);
                        this.rsvpResvFwdDestAddrLength = new RsvpResvFwdDestAddrLengthEnt(mib, this);
                        this.rsvpResvFwdSenderAddrLength = new RsvpResvFwdSenderAddrLengthEnt(mib, this);
                        this.rsvpResvFwdProtocol = new RsvpResvFwdProtocolEnt(mib, this);
                        this.rsvpResvFwdDestPort = new RsvpResvFwdDestPortEnt(mib, this);
                        this.rsvpResvFwdPort = new RsvpResvFwdPortEnt(mib, this);
                        this.rsvpResvFwdHopAddr = new RsvpResvFwdHopAddrEnt(mib, this);
                        this.rsvpResvFwdHopLih = new RsvpResvFwdHopLihEnt(mib, this);
                        this.rsvpResvFwdInterface = new RsvpResvFwdInterfaceEnt(mib, this);
                        this.rsvpResvFwdService = new RsvpResvFwdServiceEnt(mib, this);
                        this.rsvpResvFwdTSpecRate = new RsvpResvFwdTSpecRateEnt(mib, this);
                        this.rsvpResvFwdTSpecPeakRate = new RsvpResvFwdTSpecPeakRateEnt(mib, this);
                        this.rsvpResvFwdTSpecBurst = new RsvpResvFwdTSpecBurstEnt(mib, this);
                        this.rsvpResvFwdTSpecMinTU = new RsvpResvFwdTSpecMinTUEnt(mib, this);
                        this.rsvpResvFwdTSpecMaxTU = new RsvpResvFwdTSpecMaxTUEnt(mib, this);
                        this.rsvpResvFwdRSpecRate = new RsvpResvFwdRSpecRateEnt(mib, this);
                        this.rsvpResvFwdRSpecSlack = new RsvpResvFwdRSpecSlackEnt(mib, this);
                        this.rsvpResvFwdInterval = new RsvpResvFwdIntervalEnt(mib, this);
                        this.rsvpResvFwdScope = new RsvpResvFwdScopeEnt(mib, this);
                        this.rsvpResvFwdShared = new RsvpResvFwdSharedEnt(mib, this);
                        this.rsvpResvFwdExplicit = new RsvpResvFwdExplicitEnt(mib, this);
                        this.rsvpResvFwdRSVPHop = new RsvpResvFwdRSVPHopEnt(mib, this);
                        this.rsvpResvFwdLastChange = new RsvpResvFwdLastChangeEnt(mib, this);
                        this.rsvpResvFwdPolicy = new RsvpResvFwdPolicyEnt(mib, this);
                        this.rsvpResvFwdStatus = new RsvpResvFwdStatusEnt(mib, this);
                        this.rsvpResvFwdTTL = new RsvpResvFwdTTLEnt(mib, this);
                        this.rsvpResvFwdFlowId = new RsvpResvFwdFlowIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpResvFwdNumber,
                            this.rsvpResvFwdType,
                            this.rsvpResvFwdDestAddr,
                            this.rsvpResvFwdSenderAddr,
                            this.rsvpResvFwdDestAddrLength,
                            this.rsvpResvFwdSenderAddrLength,
                            this.rsvpResvFwdProtocol,
                            this.rsvpResvFwdDestPort,
                            this.rsvpResvFwdPort,
                            this.rsvpResvFwdHopAddr,
                            this.rsvpResvFwdHopLih,
                            this.rsvpResvFwdInterface,
                            this.rsvpResvFwdService,
                            this.rsvpResvFwdTSpecRate,
                            this.rsvpResvFwdTSpecPeakRate,
                            this.rsvpResvFwdTSpecBurst,
                            this.rsvpResvFwdTSpecMinTU,
                            this.rsvpResvFwdTSpecMaxTU,
                            this.rsvpResvFwdRSpecRate,
                            this.rsvpResvFwdRSpecSlack,
                            this.rsvpResvFwdInterval,
                            this.rsvpResvFwdScope,
                            this.rsvpResvFwdShared,
                            this.rsvpResvFwdExplicit,
                            this.rsvpResvFwdRSVPHop,
                            this.rsvpResvFwdLastChange,
                            this.rsvpResvFwdPolicy,
                            this.rsvpResvFwdStatus,
                            this.rsvpResvFwdTTL,
                            this.rsvpResvFwdFlowId
                        };
                    }
                    public static final class RsvpResvFwdNumberEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdNumberEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdNumber", "1.3.6.1.2.1.51.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTypeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTypeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdType", "1.3.6.1.2.1.51.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdDestAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdDestAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdDestAddr", "1.3.6.1.2.1.51.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdSenderAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdSenderAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdSenderAddr", "1.3.6.1.2.1.51.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdDestAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdDestAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdDestAddrLength", "1.3.6.1.2.1.51.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdSenderAddrLengthEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdSenderAddrLengthEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdSenderAddrLength", "1.3.6.1.2.1.51.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdProtocolEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdProtocolEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdProtocol", "1.3.6.1.2.1.51.1.5.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdDestPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdDestPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdDestPort", "1.3.6.1.2.1.51.1.5.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdPortEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdPortEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdPort", "1.3.6.1.2.1.51.1.5.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdHopAddrEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdHopAddrEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdHopAddr", "1.3.6.1.2.1.51.1.5.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdHopLihEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdHopLihEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdHopLih", "1.3.6.1.2.1.51.1.5.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdInterfaceEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdInterfaceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdInterface", "1.3.6.1.2.1.51.1.5.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdServiceEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdServiceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdService", "1.3.6.1.2.1.51.1.5.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTSpecRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTSpecRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdTSpecRate", "1.3.6.1.2.1.51.1.5.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTSpecPeakRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTSpecPeakRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdTSpecPeakRate", "1.3.6.1.2.1.51.1.5.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTSpecBurstEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTSpecBurstEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdTSpecBurst", "1.3.6.1.2.1.51.1.5.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTSpecMinTUEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTSpecMinTUEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdTSpecMinTU", "1.3.6.1.2.1.51.1.5.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTSpecMaxTUEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTSpecMaxTUEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdTSpecMaxTU", "1.3.6.1.2.1.51.1.5.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdRSpecRateEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdRSpecRateEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdRSpecRate", "1.3.6.1.2.1.51.1.5.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdRSpecSlackEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdRSpecSlackEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdRSpecSlack", "1.3.6.1.2.1.51.1.5.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdIntervalEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdIntervalEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdInterval", "1.3.6.1.2.1.51.1.5.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdScopeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdScopeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdScope", "1.3.6.1.2.1.51.1.5.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdSharedEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdSharedEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdShared", "1.3.6.1.2.1.51.1.5.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdExplicitEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdExplicitEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdExplicit", "1.3.6.1.2.1.51.1.5.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdRSVPHopEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdRSVPHopEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdRSVPHop", "1.3.6.1.2.1.51.1.5.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdLastChangeEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdLastChangeEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdLastChange", "1.3.6.1.2.1.51.1.5.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdPolicyEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdPolicyEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdPolicy", "1.3.6.1.2.1.51.1.5.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdStatusEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdStatusEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdStatus", "1.3.6.1.2.1.51.1.5.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdTTLEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdTTLEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdTTL", "1.3.6.1.2.1.51.1.5.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpResvFwdFlowIdEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpResvFwdFlowIdEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpResvFwdFlowId", "1.3.6.1.2.1.51.1.5.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RsvpIfTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpIfEntryEnt rsvpIfEntry;

                private RsvpIfTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpIfTable", "1.3.6.1.2.1.51.1.6", false, true, false, false);
                    this.rsvpIfEntry = new RsvpIfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpIfEntry
                    };
                }
                public static final class RsvpIfEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpIfUdpNbrsEnt rsvpIfUdpNbrs;

                    public final RsvpIfIpNbrsEnt rsvpIfIpNbrs;

                    public final RsvpIfNbrsEnt rsvpIfNbrs;

                    public final RsvpIfRefreshBlockadeMultipleEnt rsvpIfRefreshBlockadeMultiple;

                    public final RsvpIfRefreshMultipleEnt rsvpIfRefreshMultiple;

                    /** which is to say, no override*/
                    public final RsvpIfTTLEnt rsvpIfTTL;

                    /** 30 seconds*/
                    public final RsvpIfRefreshIntervalEnt rsvpIfRefreshInterval;

                    /** 2 seconds*/
                    public final RsvpIfRouteDelayEnt rsvpIfRouteDelay;

                    public final RsvpIfEnabledEnt rsvpIfEnabled;

                    public final RsvpIfUdpRequiredEnt rsvpIfUdpRequired;

                    public final RsvpIfStatusEnt rsvpIfStatus;

                    private RsvpIfEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpIfEntry", "1.3.6.1.2.1.51.1.6.1", false, false, false, true);
                        this.rsvpIfUdpNbrs = new RsvpIfUdpNbrsEnt(mib, this);
                        this.rsvpIfIpNbrs = new RsvpIfIpNbrsEnt(mib, this);
                        this.rsvpIfNbrs = new RsvpIfNbrsEnt(mib, this);
                        this.rsvpIfRefreshBlockadeMultiple = new RsvpIfRefreshBlockadeMultipleEnt(mib, this);
                        this.rsvpIfRefreshMultiple = new RsvpIfRefreshMultipleEnt(mib, this);
                        this.rsvpIfTTL = new RsvpIfTTLEnt(mib, this);
                        this.rsvpIfRefreshInterval = new RsvpIfRefreshIntervalEnt(mib, this);
                        this.rsvpIfRouteDelay = new RsvpIfRouteDelayEnt(mib, this);
                        this.rsvpIfEnabled = new RsvpIfEnabledEnt(mib, this);
                        this.rsvpIfUdpRequired = new RsvpIfUdpRequiredEnt(mib, this);
                        this.rsvpIfStatus = new RsvpIfStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpIfUdpNbrs,
                            this.rsvpIfIpNbrs,
                            this.rsvpIfNbrs,
                            this.rsvpIfRefreshBlockadeMultiple,
                            this.rsvpIfRefreshMultiple,
                            this.rsvpIfTTL,
                            this.rsvpIfRefreshInterval,
                            this.rsvpIfRouteDelay,
                            this.rsvpIfEnabled,
                            this.rsvpIfUdpRequired,
                            this.rsvpIfStatus
                        };
                    }
                    public static final class RsvpIfUdpNbrsEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfUdpNbrsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfUdpNbrs", "1.3.6.1.2.1.51.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfIpNbrsEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfIpNbrsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfIpNbrs", "1.3.6.1.2.1.51.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfNbrsEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfNbrsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfNbrs", "1.3.6.1.2.1.51.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfRefreshBlockadeMultipleEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfRefreshBlockadeMultipleEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfRefreshBlockadeMultiple", "1.3.6.1.2.1.51.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfRefreshMultipleEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfRefreshMultipleEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfRefreshMultiple", "1.3.6.1.2.1.51.1.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfTTLEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfTTLEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfTTL", "1.3.6.1.2.1.51.1.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfRefreshIntervalEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfRefreshIntervalEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfRefreshInterval", "1.3.6.1.2.1.51.1.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfRouteDelayEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfRouteDelayEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfRouteDelay", "1.3.6.1.2.1.51.1.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfEnabledEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfEnabledEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfEnabled", "1.3.6.1.2.1.51.1.6.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfUdpRequiredEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfUdpRequiredEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfUdpRequired", "1.3.6.1.2.1.51.1.6.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpIfStatusEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpIfStatusEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpIfStatus", "1.3.6.1.2.1.51.1.6.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RsvpNbrTableEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpNbrEntryEnt rsvpNbrEntry;

                private RsvpNbrTableEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpNbrTable", "1.3.6.1.2.1.51.1.7", false, true, false, false);
                    this.rsvpNbrEntry = new RsvpNbrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpNbrEntry
                    };
                }
                public static final class RsvpNbrEntryEnt extends MIBEntry<RSVPMIBDef>
                {
                    public final RsvpNbrAddressEnt rsvpNbrAddress;

                    public final RsvpNbrProtocolEnt rsvpNbrProtocol;

                    public final RsvpNbrStatusEnt rsvpNbrStatus;

                    private RsvpNbrEntryEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpNbrEntry", "1.3.6.1.2.1.51.1.7.1", false, false, false, true);
                        this.rsvpNbrAddress = new RsvpNbrAddressEnt(mib, this);
                        this.rsvpNbrProtocol = new RsvpNbrProtocolEnt(mib, this);
                        this.rsvpNbrStatus = new RsvpNbrStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rsvpNbrAddress,
                            this.rsvpNbrProtocol,
                            this.rsvpNbrStatus
                        };
                    }
                    public static final class RsvpNbrAddressEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpNbrAddressEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpNbrAddress", "1.3.6.1.2.1.51.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpNbrProtocolEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpNbrProtocolEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpNbrProtocol", "1.3.6.1.2.1.51.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RsvpNbrStatusEnt extends MIBEntry<RSVPMIBDef>
                    {
                        private RsvpNbrStatusEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                        {
                            super(mib, parent, "rsvpNbrStatus", "1.3.6.1.2.1.51.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RsvpGenObjectsEnt extends MIBEntry<RSVPMIBDef>
        {
            public final RsvpBadPacketsEnt rsvpBadPackets;

            /** The RSVP Session Sender Database contains the informationdisplayed by senders regarding their potential contributionto session data content. It is in essence a list of thevalid PATH messages that the RSVP Router or Host is receiving.*/
            public final RsvpSenderNewIndexEnt rsvpSenderNewIndex;

            /** The RSVP Reservation Requests Received Table contains theinformation displayed by receivers regarding their needs withrespect to sessions and senders. It is in essence a list of thevalid RESV messages that the RSVP Router or Host is receiving.*/
            public final RsvpResvNewIndexEnt rsvpResvNewIndex;

            /** The RSVP Reservation Requests Forwarded Table contains theinformation displayed by receivers regarding their needs withrespect to sessions and senders. It is in essence a list of thevalid RESV messages that the RSVP Router or Host is sendingto its upstream neighbors.*/
            public final RsvpResvFwdNewIndexEnt rsvpResvFwdNewIndex;

            private RsvpGenObjectsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
            {
                super(mib, parent, "rsvpGenObjects", "1.3.6.1.2.1.51.2", false, false, false, false);
                this.rsvpBadPackets = new RsvpBadPacketsEnt(mib, this);
                this.rsvpSenderNewIndex = new RsvpSenderNewIndexEnt(mib, this);
                this.rsvpResvNewIndex = new RsvpResvNewIndexEnt(mib, this);
                this.rsvpResvFwdNewIndex = new RsvpResvFwdNewIndexEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rsvpBadPackets,
                    this.rsvpSenderNewIndex,
                    this.rsvpResvNewIndex,
                    this.rsvpResvFwdNewIndex
                };
            }
            public static final class RsvpBadPacketsEnt extends MIBEntry<RSVPMIBDef>
            {
                private RsvpBadPacketsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpBadPackets", "1.3.6.1.2.1.51.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RsvpSenderNewIndexEnt extends MIBEntry<RSVPMIBDef>
            {
                private RsvpSenderNewIndexEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpSenderNewIndex", "1.3.6.1.2.1.51.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RsvpResvNewIndexEnt extends MIBEntry<RSVPMIBDef>
            {
                private RsvpResvNewIndexEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpResvNewIndex", "1.3.6.1.2.1.51.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RsvpResvFwdNewIndexEnt extends MIBEntry<RSVPMIBDef>
            {
                private RsvpResvFwdNewIndexEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpResvFwdNewIndex", "1.3.6.1.2.1.51.2.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class RsvpNotificationsPrefixEnt extends MIBEntry<RSVPMIBDef>
        {
            /** Notifications used to signal events*/
            public final RsvpNotificationsEnt rsvpNotifications;

            private RsvpNotificationsPrefixEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
            {
                super(mib, parent, "rsvpNotificationsPrefix", "1.3.6.1.2.1.51.3", false, false, false, false);
                this.rsvpNotifications = new RsvpNotificationsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rsvpNotifications
                };
            }
            public static final class RsvpNotificationsEnt extends MIBEntry<RSVPMIBDef>
            {
                public final NewFlowEnt newFlow;

                public final LostFlowEnt lostFlow;

                private RsvpNotificationsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpNotifications", "1.3.6.1.2.1.51.3.0", false, false, false, false);
                    this.newFlow = new NewFlowEnt(mib, this);
                    this.lostFlow = new LostFlowEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.newFlow,
                        this.lostFlow
                    };
                }
                public static final class NewFlowEnt extends MIBEntry<RSVPMIBDef>
                {
                    private NewFlowEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "newFlow", "1.3.6.1.2.1.51.3.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LostFlowEnt extends MIBEntry<RSVPMIBDef>
                {
                    private LostFlowEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "lostFlow", "1.3.6.1.2.1.51.3.0.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RsvpConformanceEnt extends MIBEntry<RSVPMIBDef>
        {
            /** conformance information*/
            public final RsvpGroupsEnt rsvpGroups;

            public final RsvpCompliancesEnt rsvpCompliances;

            private RsvpConformanceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
            {
                super(mib, parent, "rsvpConformance", "1.3.6.1.2.1.51.4", false, false, false, false);
                this.rsvpGroups = new RsvpGroupsEnt(mib, this);
                this.rsvpCompliances = new RsvpCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rsvpGroups,
                    this.rsvpCompliances
                };
            }
            public static final class RsvpGroupsEnt extends MIBEntry<RSVPMIBDef>
            {
                public final RsvpSessionGroupEnt rsvpSessionGroup;

                public final RsvpSenderGroupEnt rsvpSenderGroup;

                public final RsvpResvGroupEnt rsvpResvGroup;

                public final RsvpResvFwdGroupEnt rsvpResvFwdGroup;

                public final RsvpIfGroupEnt rsvpIfGroup;

                public final RsvpNbrGroupEnt rsvpNbrGroup;

                public final RsvpNotificationGroupEnt rsvpNotificationGroup;

                private RsvpGroupsEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpGroups", "1.3.6.1.2.1.51.4.1", false, false, false, false);
                    this.rsvpSessionGroup = new RsvpSessionGroupEnt(mib, this);
                    this.rsvpSenderGroup = new RsvpSenderGroupEnt(mib, this);
                    this.rsvpResvGroup = new RsvpResvGroupEnt(mib, this);
                    this.rsvpResvFwdGroup = new RsvpResvFwdGroupEnt(mib, this);
                    this.rsvpIfGroup = new RsvpIfGroupEnt(mib, this);
                    this.rsvpNbrGroup = new RsvpNbrGroupEnt(mib, this);
                    this.rsvpNotificationGroup = new RsvpNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpSessionGroup,
                        this.rsvpSenderGroup,
                        this.rsvpResvGroup,
                        this.rsvpResvFwdGroup,
                        this.rsvpIfGroup,
                        this.rsvpNbrGroup,
                        this.rsvpNotificationGroup
                    };
                }
                public static final class RsvpSessionGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpSessionGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpSessionGroup", "1.3.6.1.2.1.51.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RsvpSenderGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpSenderGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpSenderGroup", "1.3.6.1.2.1.51.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RsvpResvGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpResvGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpResvGroup", "1.3.6.1.2.1.51.4.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RsvpResvFwdGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpResvFwdGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpResvFwdGroup", "1.3.6.1.2.1.51.4.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RsvpIfGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpIfGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpIfGroup", "1.3.6.1.2.1.51.4.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RsvpNbrGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpNbrGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpNbrGroup", "1.3.6.1.2.1.51.4.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RsvpNotificationGroupEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpNotificationGroupEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpNotificationGroup", "1.3.6.1.2.1.51.4.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RsvpCompliancesEnt extends MIBEntry<RSVPMIBDef>
            {
                /** compliance statements*/
                public final RsvpComplianceEnt rsvpCompliance;

                private RsvpCompliancesEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                {
                    super(mib, parent, "rsvpCompliances", "1.3.6.1.2.1.51.4.2", false, false, false, false);
                    this.rsvpCompliance = new RsvpComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rsvpCompliance
                    };
                }
                public static final class RsvpComplianceEnt extends MIBEntry<RSVPMIBDef>
                {
                    private RsvpComplianceEnt(RSVPMIBDef mib, MIBEntry<RSVPMIBDef> parent)
                    {
                        super(mib, parent, "rsvpCompliance", "1.3.6.1.2.1.51.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
