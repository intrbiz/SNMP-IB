package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**FIX: added additional import (Counter)
FIX:                FROM RFC-1155*/
public final class RFC1315MIBDef extends MIB
{
    public static final RFC1315MIBDef RFC1315MIB = new RFC1315MIBDef();

    /** Frame Relay DTE MIB

Thu May  1 02:29:46 PDT 1997*/
    public final FrameRelayDTEEnt frameRelayDTE;

    private RFC1315MIBDef()
    {
        super("RFC1315-MIB");
        this.frameRelayDTE = new FrameRelayDTEEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.frameRelayDTE
        };
    }

    public static final class FrameRelayDTEEnt extends MIBEntry<RFC1315MIBDef>
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

        private FrameRelayDTEEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
        {
            super(mib, parent, "frameRelayDTE", "1.3.6.1.2.1.10.32", false, false, false, false);
            this.frDlcmiTable = new FrDlcmiTableEnt(mib, this);
            this.frCircuitTable = new FrCircuitTableEnt(mib, this);
            this.frErrTable = new FrErrTableEnt(mib, this);
            this.frameRelayTrapControl = new FrameRelayTrapControlEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.frDlcmiTable,
                this.frCircuitTable,
                this.frErrTable,
                this.frameRelayTrapControl
            };
        }
        public static final class FrDlcmiTableEnt extends MIBEntry<RFC1315MIBDef>
        {
            public final FrDlcmiEntryEnt frDlcmiEntry;

            private FrDlcmiTableEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
            {
                super(mib, parent, "frDlcmiTable", "1.3.6.1.2.1.10.32.1", false, true, false, false);
                this.frDlcmiEntry = new FrDlcmiEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frDlcmiEntry
                };
            }
            public static final class FrDlcmiEntryEnt extends MIBEntry<RFC1315MIBDef>
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

                private FrDlcmiEntryEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
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
                        this.frDlcmiMulticast
                    };
                }
                public static final class FrDlcmiIfIndexEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiIfIndexEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiIfIndex", "1.3.6.1.2.1.10.32.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiStateEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiStateEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiState", "1.3.6.1.2.1.10.32.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiAddressEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiAddressEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiAddress", "1.3.6.1.2.1.10.32.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiAddressLenEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiAddressLenEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiAddressLen", "1.3.6.1.2.1.10.32.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiPollingIntervalEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiPollingIntervalEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiPollingInterval", "1.3.6.1.2.1.10.32.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiFullEnquiryIntervalEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiFullEnquiryIntervalEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiFullEnquiryInterval", "1.3.6.1.2.1.10.32.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiErrorThresholdEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiErrorThresholdEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiErrorThreshold", "1.3.6.1.2.1.10.32.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiMonitoredEventsEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiMonitoredEventsEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiMonitoredEvents", "1.3.6.1.2.1.10.32.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiMaxSupportedVCsEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiMaxSupportedVCsEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiMaxSupportedVCs", "1.3.6.1.2.1.10.32.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrDlcmiMulticastEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrDlcmiMulticastEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frDlcmiMulticast", "1.3.6.1.2.1.10.32.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrCircuitTableEnt extends MIBEntry<RFC1315MIBDef>
        {
            public final FrCircuitEntryEnt frCircuitEntry;

            private FrCircuitTableEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
            {
                super(mib, parent, "frCircuitTable", "1.3.6.1.2.1.10.32.2", false, true, false, false);
                this.frCircuitEntry = new FrCircuitEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frCircuitEntry
                };
            }
            public static final class FrCircuitEntryEnt extends MIBEntry<RFC1315MIBDef>
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

                private FrCircuitEntryEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
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
                        this.frCircuitThroughput
                    };
                }
                public static final class FrCircuitIfIndexEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitIfIndexEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitIfIndex", "1.3.6.1.2.1.10.32.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitDlciEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitDlciEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitDlci", "1.3.6.1.2.1.10.32.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitStateEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitStateEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitState", "1.3.6.1.2.1.10.32.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedFECNsEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitReceivedFECNsEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedFECNs", "1.3.6.1.2.1.10.32.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedBECNsEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitReceivedBECNsEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedBECNs", "1.3.6.1.2.1.10.32.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitSentFramesEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitSentFramesEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitSentFrames", "1.3.6.1.2.1.10.32.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitSentOctetsEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitSentOctetsEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitSentOctets", "1.3.6.1.2.1.10.32.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedFramesEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitReceivedFramesEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedFrames", "1.3.6.1.2.1.10.32.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitReceivedOctetsEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitReceivedOctetsEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitReceivedOctets", "1.3.6.1.2.1.10.32.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitCreationTimeEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitCreationTimeEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitCreationTime", "1.3.6.1.2.1.10.32.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitLastTimeChangeEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitLastTimeChangeEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitLastTimeChange", "1.3.6.1.2.1.10.32.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitCommittedBurstEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitCommittedBurstEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitCommittedBurst", "1.3.6.1.2.1.10.32.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitExcessBurstEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitExcessBurstEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitExcessBurst", "1.3.6.1.2.1.10.32.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrCircuitThroughputEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrCircuitThroughputEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frCircuitThroughput", "1.3.6.1.2.1.10.32.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrErrTableEnt extends MIBEntry<RFC1315MIBDef>
        {
            public final FrErrEntryEnt frErrEntry;

            private FrErrTableEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
            {
                super(mib, parent, "frErrTable", "1.3.6.1.2.1.10.32.3", false, true, false, false);
                this.frErrEntry = new FrErrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frErrEntry
                };
            }
            public static final class FrErrEntryEnt extends MIBEntry<RFC1315MIBDef>
            {
                public final FrErrIfIndexEnt frErrIfIndex;

                public final FrErrTypeEnt frErrType;

                public final FrErrDataEnt frErrData;

                public final FrErrTimeEnt frErrTime;

                private FrErrEntryEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                {
                    super(mib, parent, "frErrEntry", "1.3.6.1.2.1.10.32.3.1", false, false, false, true);
                    this.frErrIfIndex = new FrErrIfIndexEnt(mib, this);
                    this.frErrType = new FrErrTypeEnt(mib, this);
                    this.frErrData = new FrErrDataEnt(mib, this);
                    this.frErrTime = new FrErrTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frErrIfIndex,
                        this.frErrType,
                        this.frErrData,
                        this.frErrTime
                    };
                }
                public static final class FrErrIfIndexEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrErrIfIndexEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frErrIfIndex", "1.3.6.1.2.1.10.32.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrTypeEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrErrTypeEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frErrType", "1.3.6.1.2.1.10.32.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrDataEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrErrDataEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frErrData", "1.3.6.1.2.1.10.32.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrErrTimeEnt extends MIBEntry<RFC1315MIBDef>
                {
                    private FrErrTimeEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                    {
                        super(mib, parent, "frErrTime", "1.3.6.1.2.1.10.32.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrameRelayTrapControlEnt extends MIBEntry<RFC1315MIBDef>
        {
            public final FrTrapStateEnt frTrapState;

            private FrameRelayTrapControlEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
            {
                super(mib, parent, "frameRelayTrapControl", "1.3.6.1.2.1.10.32.4", false, false, false, false);
                this.frTrapState = new FrTrapStateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frTrapState
                };
            }
            public static final class FrTrapStateEnt extends MIBEntry<RFC1315MIBDef>
            {
                private FrTrapStateEnt(RFC1315MIBDef mib, MIBEntry<RFC1315MIBDef> parent)
                {
                    super(mib, parent, "frTrapState", "1.3.6.1.2.1.10.32.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
