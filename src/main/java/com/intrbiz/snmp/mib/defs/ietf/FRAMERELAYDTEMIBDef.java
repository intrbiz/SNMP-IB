package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class FRAMERELAYDTEMIBDef extends MIB
{
    public static final FRAMERELAYDTEMIBDef FRAMERELAYDTEMIB = new FRAMERELAYDTEMIBDef();

    /** Frame Relay DTE MIB

Thu May  1 02:29:46 PDT 1997*/
    public final FrameRelayDTEEnt frameRelayDTE;

    private FRAMERELAYDTEMIBDef()
    {
        super("FRAME-RELAY-DTE-MIB");
        this.frameRelayDTE = new FrameRelayDTEEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.frameRelayDTE
        };
    }

    public static final class FrameRelayDTEEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
    {
        /** Data Link Connection Management Interface
The variables that configure the DLC Management Interface.*/
        public final FrDlcmiTableEnt frDlcmiTable;

        /** A Frame Relay service is a multiplexing service.  DataLink Connection Identifiers enumerate virtual circuits(permanent or dynamic) which are layered onto the underlyingcircuit, represented by ifEntry.  Therefore, each of the entriesin the Standard MIB's Interface Table with an IfType ofFrame Relay represents a Q.922 interface.  Zero or morevirtual circuits are layered onto this interface and provideinterconnection with various remote destinations.Each such virtual circuit is represented by an entry in thecircuit table.  The management virtual circuit (i.e. DLCI 0)is a virtual circuit by this definition and will be representedwith an entry in the circuit table.
Circuit Table
The table describing the use of the DLCIs attached toeach Frame Relay Interface.*/
        public final FrCircuitTableEnt frCircuitTable;

        /** Error Table
The table describing errors encountered on each FrameRelay Interface.*/
        public final FrErrTableEnt frErrTable;

        /** Frame Relay Trap Control*/
        public final FrameRelayTrapControlEnt frameRelayTrapControl;

        /** the following highly unusual OID is as it is for compatibilitywith RFC 1315, the SNMP V1 predecessor of this document.*/
        public final FrameRelayTrapsEnt frameRelayTraps;

        /** conformance information*/
        public final FrConformanceEnt frConformance;

        private FrameRelayDTEEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
        {
            super(mib, parent, "frameRelayDTE", "1.3.6.1.2.1.10.32", false, false, false, false);
            this.frDlcmiTable = new FrDlcmiTableEnt(mib, this);
            this.frCircuitTable = new FrCircuitTableEnt(mib, this);
            this.frErrTable = new FrErrTableEnt(mib, this);
            this.frameRelayTrapControl = new FrameRelayTrapControlEnt(mib, this);
            this.frameRelayTraps = new FrameRelayTrapsEnt(mib, this);
            this.frConformance = new FrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.frDlcmiTable,
                this.frCircuitTable,
                this.frErrTable,
                this.frameRelayTrapControl,
                this.frameRelayTraps,
                this.frConformance
            };
        }
        public static final class FrDlcmiTableEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
        {
            public final FrDlcmiEntryEnt frDlcmiEntry;

            private FrDlcmiTableEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
            {
                super(mib, parent, "frDlcmiTable", "1.3.6.1.2.1.10.32.1", false, true, false, false);
                this.frDlcmiEntry = new FrDlcmiEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frDlcmiEntry
                };
            }
            public static final class FrDlcmiEntryEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                public final FrDlcmiIfIndexEnt frDlcmiIfIndex;

                public final FrDlcmiStateEnt frDlcmiState;

                public final FrDlcmiAddressEnt frDlcmiAddress;

                public final FrDlcmiAddressLenEnt frDlcmiAddressLen;

                public final FrDlcmiPollingIntervalEnt frDlcmiPollingInterval;

                public final FrDlcmiFullEnquiryIntervalEnt frDlcmiFullEnquiryInterval;

                public final FrDlcmiErrorThresholdEnt frDlcmiErrorThreshold;

                public final FrDlcmiMonitoredEventsEnt frDlcmiMonitoredEvents;

                public final FrDlcmiMaxSupportedVCsEnt frDlcmiMaxSupportedVCs;

                public final FrDlcmiMulticastEnt frDlcmiMulticast;

                public final FrDlcmiStatusEnt frDlcmiStatus;

                public final FrDlcmiRowStatusEnt frDlcmiRowStatus;

                private FrDlcmiEntryEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frDlcmiEntry", "1.3.6.1.2.1.10.32.1.1", false, false, false, true);
                    this.frDlcmiIfIndex = new FrDlcmiIfIndexEnt(mib, this);
                    this.frDlcmiState = new FrDlcmiStateEnt(mib, this);
                    this.frDlcmiAddress = new FrDlcmiAddressEnt(mib, this);
                    this.frDlcmiAddressLen = new FrDlcmiAddressLenEnt(mib, this);
                    this.frDlcmiPollingInterval = new FrDlcmiPollingIntervalEnt(mib, this);
                    this.frDlcmiFullEnquiryInterval = new FrDlcmiFullEnquiryIntervalEnt(mib, this);
                    this.frDlcmiErrorThreshold = new FrDlcmiErrorThresholdEnt(mib, this);
                    this.frDlcmiMonitoredEvents = new FrDlcmiMonitoredEventsEnt(mib, this);
                    this.frDlcmiMaxSupportedVCs = new FrDlcmiMaxSupportedVCsEnt(mib, this);
                    this.frDlcmiMulticast = new FrDlcmiMulticastEnt(mib, this);
                    this.frDlcmiStatus = new FrDlcmiStatusEnt(mib, this);
                    this.frDlcmiRowStatus = new FrDlcmiRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frDlcmiIfIndex,
                        this.frDlcmiState,
                        this.frDlcmiAddress,
                        this.frDlcmiAddressLen,
                        this.frDlcmiPollingInterval,
                        this.frDlcmiFullEnquiryInterval,
                        this.frDlcmiErrorThreshold,
                        this.frDlcmiMonitoredEvents,
                        this.frDlcmiMaxSupportedVCs,
                        this.frDlcmiMulticast,
                        this.frDlcmiStatus,
                        this.frDlcmiRowStatus
                    };
                }
                public static final class FrDlcmiIfIndexEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiIfIndexEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiIfIndex", "1.3.6.1.2.1.10.32.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiStateEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiStateEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiState", "1.3.6.1.2.1.10.32.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiAddressEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiAddressEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiAddress", "1.3.6.1.2.1.10.32.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiAddressLenEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiAddressLenEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiAddressLen", "1.3.6.1.2.1.10.32.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiPollingIntervalEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiPollingIntervalEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiPollingInterval", "1.3.6.1.2.1.10.32.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiFullEnquiryIntervalEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiFullEnquiryIntervalEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiFullEnquiryInterval", "1.3.6.1.2.1.10.32.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiErrorThresholdEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiErrorThresholdEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiErrorThreshold", "1.3.6.1.2.1.10.32.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiMonitoredEventsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiMonitoredEventsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiMonitoredEvents", "1.3.6.1.2.1.10.32.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiMaxSupportedVCsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiMaxSupportedVCsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiMaxSupportedVCs", "1.3.6.1.2.1.10.32.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiMulticastEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiMulticastEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiMulticast", "1.3.6.1.2.1.10.32.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiStatusEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiStatusEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiStatus", "1.3.6.1.2.1.10.32.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiRowStatusEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrDlcmiRowStatusEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiRowStatus", "1.3.6.1.2.1.10.32.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrCircuitTableEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
        {
            public final FrCircuitEntryEnt frCircuitEntry;

            private FrCircuitTableEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
            {
                super(mib, parent, "frCircuitTable", "1.3.6.1.2.1.10.32.2", false, true, false, false);
                this.frCircuitEntry = new FrCircuitEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frCircuitEntry
                };
            }
            public static final class FrCircuitEntryEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                public final FrCircuitIfIndexEnt frCircuitIfIndex;

                public final FrCircuitDlciEnt frCircuitDlci;

                public final FrCircuitStateEnt frCircuitState;

                public final FrCircuitReceivedFECNsEnt frCircuitReceivedFECNs;

                public final FrCircuitReceivedBECNsEnt frCircuitReceivedBECNs;

                public final FrCircuitSentFramesEnt frCircuitSentFrames;

                public final FrCircuitSentOctetsEnt frCircuitSentOctets;

                public final FrCircuitReceivedFramesEnt frCircuitReceivedFrames;

                public final FrCircuitReceivedOctetsEnt frCircuitReceivedOctets;

                public final FrCircuitCreationTimeEnt frCircuitCreationTime;

                public final FrCircuitLastTimeChangeEnt frCircuitLastTimeChange;

                /** the default indicates no commitment*/
                public final FrCircuitCommittedBurstEnt frCircuitCommittedBurst;

                public final FrCircuitExcessBurstEnt frCircuitExcessBurst;

                /** the default value of Throughput is
"no commitment".*/
                public final FrCircuitThroughputEnt frCircuitThroughput;

                /** the default value of frCircuitMulticast is
"unicast" (not a multicast VC).*/
                public final FrCircuitMulticastEnt frCircuitMulticast;

                public final FrCircuitTypeEnt frCircuitType;

                public final FrCircuitDiscardsEnt frCircuitDiscards;

                public final FrCircuitReceivedDEsEnt frCircuitReceivedDEs;

                public final FrCircuitSentDEsEnt frCircuitSentDEs;

                public final FrCircuitLogicalIfIndexEnt frCircuitLogicalIfIndex;

                public final FrCircuitRowStatusEnt frCircuitRowStatus;

                private FrCircuitEntryEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frCircuitEntry", "1.3.6.1.2.1.10.32.2.1", false, false, false, true);
                    this.frCircuitIfIndex = new FrCircuitIfIndexEnt(mib, this);
                    this.frCircuitDlci = new FrCircuitDlciEnt(mib, this);
                    this.frCircuitState = new FrCircuitStateEnt(mib, this);
                    this.frCircuitReceivedFECNs = new FrCircuitReceivedFECNsEnt(mib, this);
                    this.frCircuitReceivedBECNs = new FrCircuitReceivedBECNsEnt(mib, this);
                    this.frCircuitSentFrames = new FrCircuitSentFramesEnt(mib, this);
                    this.frCircuitSentOctets = new FrCircuitSentOctetsEnt(mib, this);
                    this.frCircuitReceivedFrames = new FrCircuitReceivedFramesEnt(mib, this);
                    this.frCircuitReceivedOctets = new FrCircuitReceivedOctetsEnt(mib, this);
                    this.frCircuitCreationTime = new FrCircuitCreationTimeEnt(mib, this);
                    this.frCircuitLastTimeChange = new FrCircuitLastTimeChangeEnt(mib, this);
                    this.frCircuitCommittedBurst = new FrCircuitCommittedBurstEnt(mib, this);
                    this.frCircuitExcessBurst = new FrCircuitExcessBurstEnt(mib, this);
                    this.frCircuitThroughput = new FrCircuitThroughputEnt(mib, this);
                    this.frCircuitMulticast = new FrCircuitMulticastEnt(mib, this);
                    this.frCircuitType = new FrCircuitTypeEnt(mib, this);
                    this.frCircuitDiscards = new FrCircuitDiscardsEnt(mib, this);
                    this.frCircuitReceivedDEs = new FrCircuitReceivedDEsEnt(mib, this);
                    this.frCircuitSentDEs = new FrCircuitSentDEsEnt(mib, this);
                    this.frCircuitLogicalIfIndex = new FrCircuitLogicalIfIndexEnt(mib, this);
                    this.frCircuitRowStatus = new FrCircuitRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frCircuitIfIndex,
                        this.frCircuitDlci,
                        this.frCircuitState,
                        this.frCircuitReceivedFECNs,
                        this.frCircuitReceivedBECNs,
                        this.frCircuitSentFrames,
                        this.frCircuitSentOctets,
                        this.frCircuitReceivedFrames,
                        this.frCircuitReceivedOctets,
                        this.frCircuitCreationTime,
                        this.frCircuitLastTimeChange,
                        this.frCircuitCommittedBurst,
                        this.frCircuitExcessBurst,
                        this.frCircuitThroughput,
                        this.frCircuitMulticast,
                        this.frCircuitType,
                        this.frCircuitDiscards,
                        this.frCircuitReceivedDEs,
                        this.frCircuitSentDEs,
                        this.frCircuitLogicalIfIndex,
                        this.frCircuitRowStatus
                    };
                }
                public static final class FrCircuitIfIndexEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitIfIndexEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitIfIndex", "1.3.6.1.2.1.10.32.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitDlciEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitDlciEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitDlci", "1.3.6.1.2.1.10.32.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitStateEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitStateEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitState", "1.3.6.1.2.1.10.32.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedFECNsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitReceivedFECNsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedFECNs", "1.3.6.1.2.1.10.32.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedBECNsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitReceivedBECNsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedBECNs", "1.3.6.1.2.1.10.32.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitSentFramesEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitSentFramesEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitSentFrames", "1.3.6.1.2.1.10.32.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitSentOctetsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitSentOctetsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitSentOctets", "1.3.6.1.2.1.10.32.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedFramesEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitReceivedFramesEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedFrames", "1.3.6.1.2.1.10.32.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedOctetsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitReceivedOctetsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedOctets", "1.3.6.1.2.1.10.32.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitCreationTimeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitCreationTimeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitCreationTime", "1.3.6.1.2.1.10.32.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitLastTimeChangeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitLastTimeChangeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitLastTimeChange", "1.3.6.1.2.1.10.32.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitCommittedBurstEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitCommittedBurstEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitCommittedBurst", "1.3.6.1.2.1.10.32.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitExcessBurstEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitExcessBurstEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitExcessBurst", "1.3.6.1.2.1.10.32.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitThroughputEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitThroughputEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitThroughput", "1.3.6.1.2.1.10.32.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitMulticastEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitMulticastEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitMulticast", "1.3.6.1.2.1.10.32.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitTypeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitTypeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitType", "1.3.6.1.2.1.10.32.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitDiscardsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitDiscardsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitDiscards", "1.3.6.1.2.1.10.32.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedDEsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitReceivedDEsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedDEs", "1.3.6.1.2.1.10.32.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitSentDEsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitSentDEsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitSentDEs", "1.3.6.1.2.1.10.32.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitLogicalIfIndexEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitLogicalIfIndexEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitLogicalIfIndex", "1.3.6.1.2.1.10.32.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitRowStatusEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitRowStatusEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitRowStatus", "1.3.6.1.2.1.10.32.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrErrTableEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
        {
            public final FrErrEntryEnt frErrEntry;

            private FrErrTableEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
            {
                super(mib, parent, "frErrTable", "1.3.6.1.2.1.10.32.3", false, true, false, false);
                this.frErrEntry = new FrErrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frErrEntry
                };
            }
            public static final class FrErrEntryEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                public final FrErrIfIndexEnt frErrIfIndex;

                public final FrErrTypeEnt frErrType;

                public final FrErrDataEnt frErrData;

                public final FrErrTimeEnt frErrTime;

                public final FrErrFaultsEnt frErrFaults;

                public final FrErrFaultTimeEnt frErrFaultTime;

                private FrErrEntryEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frErrEntry", "1.3.6.1.2.1.10.32.3.1", false, false, false, true);
                    this.frErrIfIndex = new FrErrIfIndexEnt(mib, this);
                    this.frErrType = new FrErrTypeEnt(mib, this);
                    this.frErrData = new FrErrDataEnt(mib, this);
                    this.frErrTime = new FrErrTimeEnt(mib, this);
                    this.frErrFaults = new FrErrFaultsEnt(mib, this);
                    this.frErrFaultTime = new FrErrFaultTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frErrIfIndex,
                        this.frErrType,
                        this.frErrData,
                        this.frErrTime,
                        this.frErrFaults,
                        this.frErrFaultTime
                    };
                }
                public static final class FrErrIfIndexEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrIfIndexEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrIfIndex", "1.3.6.1.2.1.10.32.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrTypeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrTypeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrType", "1.3.6.1.2.1.10.32.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrDataEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrDataEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrData", "1.3.6.1.2.1.10.32.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrTimeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrTimeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrTime", "1.3.6.1.2.1.10.32.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrFaultsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrFaultsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrFaults", "1.3.6.1.2.1.10.32.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrFaultTimeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrFaultTimeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrFaultTime", "1.3.6.1.2.1.10.32.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrameRelayTrapControlEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
        {
            public final FrTrapStateEnt frTrapState;

            /** no minimum elapsed period is specified*/
            public final FrTrapMaxRateEnt frTrapMaxRate;

            private FrameRelayTrapControlEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
            {
                super(mib, parent, "frameRelayTrapControl", "1.3.6.1.2.1.10.32.4", false, false, false, false);
                this.frTrapState = new FrTrapStateEnt(mib, this);
                this.frTrapMaxRate = new FrTrapMaxRateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frTrapState,
                    this.frTrapMaxRate
                };
            }
            public static final class FrTrapStateEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                private FrTrapStateEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frTrapState", "1.3.6.1.2.1.10.32.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrTrapMaxRateEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                private FrTrapMaxRateEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frTrapMaxRate", "1.3.6.1.2.1.10.32.4.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class FrameRelayTrapsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
        {
            /** Data Link Connection Management Interface Related Traps*/
            public final FrDLCIStatusChangeEnt frDLCIStatusChange;

            private FrameRelayTrapsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
            {
                super(mib, parent, "frameRelayTraps", "1.3.6.1.2.1.10.32.0", false, false, false, false);
                this.frDLCIStatusChange = new FrDLCIStatusChangeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frDLCIStatusChange
                };
            }
            public static final class FrDLCIStatusChangeEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                private FrDLCIStatusChangeEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frDLCIStatusChange", "1.3.6.1.2.1.10.32.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class FrConformanceEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
        {
            public final FrGroupsEnt frGroups;

            public final FrCompliancesEnt frCompliances;

            private FrConformanceEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
            {
                super(mib, parent, "frConformance", "1.3.6.1.2.1.10.32.6", false, false, false, false);
                this.frGroups = new FrGroupsEnt(mib, this);
                this.frCompliances = new FrCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frGroups,
                    this.frCompliances
                };
            }
            public static final class FrGroupsEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                /** units of conformance*/
                public final FrPortGroupEnt frPortGroup;

                public final FrCircuitGroupEnt frCircuitGroup;

                public final FrTrapGroupEnt frTrapGroup;

                public final FrErrGroupEnt frErrGroup;

                public final FrNotificationGroupEnt frNotificationGroup;

                public final FrPortGroup0Ent frPortGroup0;

                public final FrCircuitGroup0Ent frCircuitGroup0;

                public final FrErrGroup0Ent frErrGroup0;

                public final FrTrapGroup0Ent frTrapGroup0;

                private FrGroupsEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frGroups", "1.3.6.1.2.1.10.32.6.1", false, false, false, false);
                    this.frPortGroup = new FrPortGroupEnt(mib, this);
                    this.frCircuitGroup = new FrCircuitGroupEnt(mib, this);
                    this.frTrapGroup = new FrTrapGroupEnt(mib, this);
                    this.frErrGroup = new FrErrGroupEnt(mib, this);
                    this.frNotificationGroup = new FrNotificationGroupEnt(mib, this);
                    this.frPortGroup0 = new FrPortGroup0Ent(mib, this);
                    this.frCircuitGroup0 = new FrCircuitGroup0Ent(mib, this);
                    this.frErrGroup0 = new FrErrGroup0Ent(mib, this);
                    this.frTrapGroup0 = new FrTrapGroup0Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frPortGroup,
                        this.frCircuitGroup,
                        this.frTrapGroup,
                        this.frErrGroup,
                        this.frNotificationGroup,
                        this.frPortGroup0,
                        this.frCircuitGroup0,
                        this.frErrGroup0,
                        this.frTrapGroup0
                    };
                }
                public static final class FrPortGroupEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrPortGroupEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frPortGroup", "1.3.6.1.2.1.10.32.6.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitGroupEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitGroupEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitGroup", "1.3.6.1.2.1.10.32.6.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrTrapGroupEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrTrapGroupEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frTrapGroup", "1.3.6.1.2.1.10.32.6.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrGroupEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrGroupEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrGroup", "1.3.6.1.2.1.10.32.6.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrNotificationGroupEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrNotificationGroupEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frNotificationGroup", "1.3.6.1.2.1.10.32.6.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrPortGroup0Ent extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrPortGroup0Ent(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frPortGroup0", "1.3.6.1.2.1.10.32.6.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitGroup0Ent extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCircuitGroup0Ent(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCircuitGroup0", "1.3.6.1.2.1.10.32.6.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrGroup0Ent extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrErrGroup0Ent(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frErrGroup0", "1.3.6.1.2.1.10.32.6.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrTrapGroup0Ent extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrTrapGroup0Ent(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frTrapGroup0", "1.3.6.1.2.1.10.32.6.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FrCompliancesEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
            {
                /** compliance statements*/
                public final FrComplianceEnt frCompliance;

                public final FrCompliance0Ent frCompliance0;

                private FrCompliancesEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                {
                    super(mib, parent, "frCompliances", "1.3.6.1.2.1.10.32.6.2", false, false, false, false);
                    this.frCompliance = new FrComplianceEnt(mib, this);
                    this.frCompliance0 = new FrCompliance0Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frCompliance,
                        this.frCompliance0
                    };
                }
                public static final class FrComplianceEnt extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrComplianceEnt(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCompliance", "1.3.6.1.2.1.10.32.6.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCompliance0Ent extends MIBEntry<FRAMERELAYDTEMIBDef>
                {
                    private FrCompliance0Ent(FRAMERELAYDTEMIBDef mib, MIBEntry<FRAMERELAYDTEMIBDef> parent)
                    {
                        super(mib, parent, "frCompliance0", "1.3.6.1.2.1.10.32.6.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
