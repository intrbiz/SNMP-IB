package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**###########################################################*/
public final class RFC1382MIBDef extends MIB
{
    public static final RFC1382MIBDef RFC1382MIB = new RFC1382MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1382MIBDef.RFC1382MIB); }

    public final X25Ent x25;

    private RFC1382MIBDef()
    {
        super("RFC1382-MIB");
        this.x25 = new X25Ent(this, null);
        this.entries = new MIBEntry<?>[] {
            this.x25
        };
    }

    public static final class X25Ent extends MIBEntry<RFC1382MIBDef>
    {
        /** 0 to 17 bytes in length containing the ASCIIcharacters [0-9], each octet contains one digitof the address.

###########################################################X.25 Administration Table###########################################################*/
        public final X25AdmnTableEnt x25AdmnTable;

        /** ###########################################################X.25 Operational Table###########################################################*/
        public final X25OperTableEnt x25OperTable;

        /** MIB-II also provides:
ifDescr:On an X.25 interface this must include sufficient
information to enable the system's administratorto determine the appropriate configurationinformation on a system having multiple X.25subnetworks.
ifType: ddn-x25 or rfc877-x25an interface of type ddn-x25 will use an algorithm totranslate between X.121 address and IP addresses.An interface of type rfc877-x25 will use aconfiguration table to translate between X.121addresses and IP addresses.
ifMtu: the maximum PDU a higher layer can pass to X.25 orreceive from X.25
ifSpeed:This will be the value of the local clock for this line.A value of zero indicates external clocking.
ifAdminStatus:
ifOperStatus
ifLastChange

###########################################################X.25 Statistics Table###########################################################*/
        public final X25StatTableEnt x25StatTable;

        /** MIB-II also contains:
ifInOctets: Number of data octets delivered to upperlayer entities.
ifInUcastPkts: Number of packets with a clear M-bitdelivered to higher layer entities.
ifDiscards: Number of packets dropped for lack of buffering
ifInErrors: Number of packets received containing errorsREFERENCE ProtocolErrorsDetectedLocally
ifInUnknownProtos: Number of packets with unknown circuitidentifier.
ifOutOctets: Number of data octets delivered byX.25 to upper layers.
ifOutUcastPkts: Number of packets with a clear M-bitreceived from higher layer entities.

###########################################################X.25 Channel Table###########################################################*/
        public final X25ChannelTableEnt x25ChannelTable;

        /** ###########################################################X25 Per Circuits Information Table###########################################################*/
        public final X25CircuitTableEnt x25CircuitTable;

        /** ###########################################################The Cleared Circuit Table###########################################################*/
        public final X25ClearedCircuitEntriesRequestedEnt x25ClearedCircuitEntriesRequested;

        public final X25ClearedCircuitEntriesGrantedEnt x25ClearedCircuitEntriesGranted;

        public final X25ClearedCircuitTableEnt x25ClearedCircuitTable;

        /** ###########################################################The Call Parameter Table###########################################################*/
        public final X25CallParmTableEnt x25CallParmTable;

        /** ###########################################################X.25 Protocol Version Identifiers###########################################################*/
        public final X25ProtocolVersionEnt x25ProtocolVersion;

        private X25Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
        {
            super(mib, parent, "x25", "1.3.6.1.2.1.10.5", false, false, false, false);
            this.x25AdmnTable = new X25AdmnTableEnt(mib, this);
            this.x25OperTable = new X25OperTableEnt(mib, this);
            this.x25StatTable = new X25StatTableEnt(mib, this);
            this.x25ChannelTable = new X25ChannelTableEnt(mib, this);
            this.x25CircuitTable = new X25CircuitTableEnt(mib, this);
            this.x25ClearedCircuitEntriesRequested = new X25ClearedCircuitEntriesRequestedEnt(mib, this);
            this.x25ClearedCircuitEntriesGranted = new X25ClearedCircuitEntriesGrantedEnt(mib, this);
            this.x25ClearedCircuitTable = new X25ClearedCircuitTableEnt(mib, this);
            this.x25CallParmTable = new X25CallParmTableEnt(mib, this);
            this.x25ProtocolVersion = new X25ProtocolVersionEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.x25AdmnTable,
                this.x25OperTable,
                this.x25StatTable,
                this.x25ChannelTable,
                this.x25CircuitTable,
                this.x25ClearedCircuitEntriesRequested,
                this.x25ClearedCircuitEntriesGranted,
                this.x25ClearedCircuitTable,
                this.x25CallParmTable,
                this.x25ProtocolVersion
            };
        }
        public static final class X25AdmnTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25AdmnEntryEnt x25AdmnEntry;

            private X25AdmnTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25AdmnTable", "1.3.6.1.2.1.10.5.1", false, true, false, false);
                this.x25AdmnEntry = new X25AdmnEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25AdmnEntry
                };
            }
            public static final class X25AdmnEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25AdmnIndexEnt x25AdmnIndex;

                public final X25AdmnInterfaceModeEnt x25AdmnInterfaceMode;

                public final X25AdmnMaxActiveCircuitsEnt x25AdmnMaxActiveCircuits;

                public final X25AdmnPacketSequencingEnt x25AdmnPacketSequencing;

                public final X25AdmnRestartTimerEnt x25AdmnRestartTimer;

                public final X25AdmnCallTimerEnt x25AdmnCallTimer;

                public final X25AdmnResetTimerEnt x25AdmnResetTimer;

                public final X25AdmnClearTimerEnt x25AdmnClearTimer;

                public final X25AdmnWindowTimerEnt x25AdmnWindowTimer;

                public final X25AdmnDataRxmtTimerEnt x25AdmnDataRxmtTimer;

                public final X25AdmnInterruptTimerEnt x25AdmnInterruptTimer;

                public final X25AdmnRejectTimerEnt x25AdmnRejectTimer;

                public final X25AdmnRegistrationRequestTimerEnt x25AdmnRegistrationRequestTimer;

                public final X25AdmnMinimumRecallTimerEnt x25AdmnMinimumRecallTimer;

                public final X25AdmnRestartCountEnt x25AdmnRestartCount;

                public final X25AdmnResetCountEnt x25AdmnResetCount;

                public final X25AdmnClearCountEnt x25AdmnClearCount;

                public final X25AdmnDataRxmtCountEnt x25AdmnDataRxmtCount;

                public final X25AdmnRejectCountEnt x25AdmnRejectCount;

                public final X25AdmnRegistrationRequestCountEnt x25AdmnRegistrationRequestCount;

                public final X25AdmnNumberPVCsEnt x25AdmnNumberPVCs;

                public final X25AdmnDefCallParamIdEnt x25AdmnDefCallParamId;

                public final X25AdmnLocalAddressEnt x25AdmnLocalAddress;

                public final X25AdmnProtocolVersionSupportedEnt x25AdmnProtocolVersionSupported;

                private X25AdmnEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25AdmnEntry", "1.3.6.1.2.1.10.5.1.1", false, false, false, true);
                    this.x25AdmnIndex = new X25AdmnIndexEnt(mib, this);
                    this.x25AdmnInterfaceMode = new X25AdmnInterfaceModeEnt(mib, this);
                    this.x25AdmnMaxActiveCircuits = new X25AdmnMaxActiveCircuitsEnt(mib, this);
                    this.x25AdmnPacketSequencing = new X25AdmnPacketSequencingEnt(mib, this);
                    this.x25AdmnRestartTimer = new X25AdmnRestartTimerEnt(mib, this);
                    this.x25AdmnCallTimer = new X25AdmnCallTimerEnt(mib, this);
                    this.x25AdmnResetTimer = new X25AdmnResetTimerEnt(mib, this);
                    this.x25AdmnClearTimer = new X25AdmnClearTimerEnt(mib, this);
                    this.x25AdmnWindowTimer = new X25AdmnWindowTimerEnt(mib, this);
                    this.x25AdmnDataRxmtTimer = new X25AdmnDataRxmtTimerEnt(mib, this);
                    this.x25AdmnInterruptTimer = new X25AdmnInterruptTimerEnt(mib, this);
                    this.x25AdmnRejectTimer = new X25AdmnRejectTimerEnt(mib, this);
                    this.x25AdmnRegistrationRequestTimer = new X25AdmnRegistrationRequestTimerEnt(mib, this);
                    this.x25AdmnMinimumRecallTimer = new X25AdmnMinimumRecallTimerEnt(mib, this);
                    this.x25AdmnRestartCount = new X25AdmnRestartCountEnt(mib, this);
                    this.x25AdmnResetCount = new X25AdmnResetCountEnt(mib, this);
                    this.x25AdmnClearCount = new X25AdmnClearCountEnt(mib, this);
                    this.x25AdmnDataRxmtCount = new X25AdmnDataRxmtCountEnt(mib, this);
                    this.x25AdmnRejectCount = new X25AdmnRejectCountEnt(mib, this);
                    this.x25AdmnRegistrationRequestCount = new X25AdmnRegistrationRequestCountEnt(mib, this);
                    this.x25AdmnNumberPVCs = new X25AdmnNumberPVCsEnt(mib, this);
                    this.x25AdmnDefCallParamId = new X25AdmnDefCallParamIdEnt(mib, this);
                    this.x25AdmnLocalAddress = new X25AdmnLocalAddressEnt(mib, this);
                    this.x25AdmnProtocolVersionSupported = new X25AdmnProtocolVersionSupportedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25AdmnIndex,
                        this.x25AdmnInterfaceMode,
                        this.x25AdmnMaxActiveCircuits,
                        this.x25AdmnPacketSequencing,
                        this.x25AdmnRestartTimer,
                        this.x25AdmnCallTimer,
                        this.x25AdmnResetTimer,
                        this.x25AdmnClearTimer,
                        this.x25AdmnWindowTimer,
                        this.x25AdmnDataRxmtTimer,
                        this.x25AdmnInterruptTimer,
                        this.x25AdmnRejectTimer,
                        this.x25AdmnRegistrationRequestTimer,
                        this.x25AdmnMinimumRecallTimer,
                        this.x25AdmnRestartCount,
                        this.x25AdmnResetCount,
                        this.x25AdmnClearCount,
                        this.x25AdmnDataRxmtCount,
                        this.x25AdmnRejectCount,
                        this.x25AdmnRegistrationRequestCount,
                        this.x25AdmnNumberPVCs,
                        this.x25AdmnDefCallParamId,
                        this.x25AdmnLocalAddress,
                        this.x25AdmnProtocolVersionSupported
                    };
                }
                public static final class X25AdmnIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnIndex", "1.3.6.1.2.1.10.5.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnInterfaceModeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnInterfaceModeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnInterfaceMode", "1.3.6.1.2.1.10.5.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnMaxActiveCircuitsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnMaxActiveCircuitsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnMaxActiveCircuits", "1.3.6.1.2.1.10.5.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnPacketSequencingEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnPacketSequencingEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnPacketSequencing", "1.3.6.1.2.1.10.5.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnRestartTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnRestartTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnRestartTimer", "1.3.6.1.2.1.10.5.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnCallTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnCallTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnCallTimer", "1.3.6.1.2.1.10.5.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnResetTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnResetTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnResetTimer", "1.3.6.1.2.1.10.5.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnClearTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnClearTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnClearTimer", "1.3.6.1.2.1.10.5.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnWindowTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnWindowTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnWindowTimer", "1.3.6.1.2.1.10.5.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnDataRxmtTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnDataRxmtTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnDataRxmtTimer", "1.3.6.1.2.1.10.5.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnInterruptTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnInterruptTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnInterruptTimer", "1.3.6.1.2.1.10.5.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnRejectTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnRejectTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnRejectTimer", "1.3.6.1.2.1.10.5.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnRegistrationRequestTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnRegistrationRequestTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnRegistrationRequestTimer", "1.3.6.1.2.1.10.5.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnMinimumRecallTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnMinimumRecallTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnMinimumRecallTimer", "1.3.6.1.2.1.10.5.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnRestartCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnRestartCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnRestartCount", "1.3.6.1.2.1.10.5.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnResetCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnResetCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnResetCount", "1.3.6.1.2.1.10.5.1.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnClearCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnClearCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnClearCount", "1.3.6.1.2.1.10.5.1.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnDataRxmtCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnDataRxmtCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnDataRxmtCount", "1.3.6.1.2.1.10.5.1.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnRejectCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnRejectCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnRejectCount", "1.3.6.1.2.1.10.5.1.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnRegistrationRequestCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnRegistrationRequestCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnRegistrationRequestCount", "1.3.6.1.2.1.10.5.1.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnNumberPVCsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnNumberPVCsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnNumberPVCs", "1.3.6.1.2.1.10.5.1.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnDefCallParamIdEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnDefCallParamIdEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnDefCallParamId", "1.3.6.1.2.1.10.5.1.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnLocalAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnLocalAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnLocalAddress", "1.3.6.1.2.1.10.5.1.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25AdmnProtocolVersionSupportedEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25AdmnProtocolVersionSupportedEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25AdmnProtocolVersionSupported", "1.3.6.1.2.1.10.5.1.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25OperTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25OperEntryEnt x25OperEntry;

            private X25OperTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25OperTable", "1.3.6.1.2.1.10.5.2", false, true, false, false);
                this.x25OperEntry = new X25OperEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25OperEntry
                };
            }
            public static final class X25OperEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25OperIndexEnt x25OperIndex;

                public final X25OperInterfaceModeEnt x25OperInterfaceMode;

                public final X25OperMaxActiveCircuitsEnt x25OperMaxActiveCircuits;

                public final X25OperPacketSequencingEnt x25OperPacketSequencing;

                public final X25OperRestartTimerEnt x25OperRestartTimer;

                public final X25OperCallTimerEnt x25OperCallTimer;

                public final X25OperResetTimerEnt x25OperResetTimer;

                public final X25OperClearTimerEnt x25OperClearTimer;

                public final X25OperWindowTimerEnt x25OperWindowTimer;

                public final X25OperDataRxmtTimerEnt x25OperDataRxmtTimer;

                public final X25OperInterruptTimerEnt x25OperInterruptTimer;

                public final X25OperRejectTimerEnt x25OperRejectTimer;

                public final X25OperRegistrationRequestTimerEnt x25OperRegistrationRequestTimer;

                public final X25OperMinimumRecallTimerEnt x25OperMinimumRecallTimer;

                public final X25OperRestartCountEnt x25OperRestartCount;

                public final X25OperResetCountEnt x25OperResetCount;

                public final X25OperClearCountEnt x25OperClearCount;

                public final X25OperDataRxmtCountEnt x25OperDataRxmtCount;

                public final X25OperRejectCountEnt x25OperRejectCount;

                public final X25OperRegistrationRequestCountEnt x25OperRegistrationRequestCount;

                public final X25OperNumberPVCsEnt x25OperNumberPVCs;

                public final X25OperDefCallParamIdEnt x25OperDefCallParamId;

                public final X25OperLocalAddressEnt x25OperLocalAddress;

                public final X25OperDataLinkIdEnt x25OperDataLinkId;

                public final X25OperProtocolVersionSupportedEnt x25OperProtocolVersionSupported;

                private X25OperEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25OperEntry", "1.3.6.1.2.1.10.5.2.1", false, false, false, true);
                    this.x25OperIndex = new X25OperIndexEnt(mib, this);
                    this.x25OperInterfaceMode = new X25OperInterfaceModeEnt(mib, this);
                    this.x25OperMaxActiveCircuits = new X25OperMaxActiveCircuitsEnt(mib, this);
                    this.x25OperPacketSequencing = new X25OperPacketSequencingEnt(mib, this);
                    this.x25OperRestartTimer = new X25OperRestartTimerEnt(mib, this);
                    this.x25OperCallTimer = new X25OperCallTimerEnt(mib, this);
                    this.x25OperResetTimer = new X25OperResetTimerEnt(mib, this);
                    this.x25OperClearTimer = new X25OperClearTimerEnt(mib, this);
                    this.x25OperWindowTimer = new X25OperWindowTimerEnt(mib, this);
                    this.x25OperDataRxmtTimer = new X25OperDataRxmtTimerEnt(mib, this);
                    this.x25OperInterruptTimer = new X25OperInterruptTimerEnt(mib, this);
                    this.x25OperRejectTimer = new X25OperRejectTimerEnt(mib, this);
                    this.x25OperRegistrationRequestTimer = new X25OperRegistrationRequestTimerEnt(mib, this);
                    this.x25OperMinimumRecallTimer = new X25OperMinimumRecallTimerEnt(mib, this);
                    this.x25OperRestartCount = new X25OperRestartCountEnt(mib, this);
                    this.x25OperResetCount = new X25OperResetCountEnt(mib, this);
                    this.x25OperClearCount = new X25OperClearCountEnt(mib, this);
                    this.x25OperDataRxmtCount = new X25OperDataRxmtCountEnt(mib, this);
                    this.x25OperRejectCount = new X25OperRejectCountEnt(mib, this);
                    this.x25OperRegistrationRequestCount = new X25OperRegistrationRequestCountEnt(mib, this);
                    this.x25OperNumberPVCs = new X25OperNumberPVCsEnt(mib, this);
                    this.x25OperDefCallParamId = new X25OperDefCallParamIdEnt(mib, this);
                    this.x25OperLocalAddress = new X25OperLocalAddressEnt(mib, this);
                    this.x25OperDataLinkId = new X25OperDataLinkIdEnt(mib, this);
                    this.x25OperProtocolVersionSupported = new X25OperProtocolVersionSupportedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25OperIndex,
                        this.x25OperInterfaceMode,
                        this.x25OperMaxActiveCircuits,
                        this.x25OperPacketSequencing,
                        this.x25OperRestartTimer,
                        this.x25OperCallTimer,
                        this.x25OperResetTimer,
                        this.x25OperClearTimer,
                        this.x25OperWindowTimer,
                        this.x25OperDataRxmtTimer,
                        this.x25OperInterruptTimer,
                        this.x25OperRejectTimer,
                        this.x25OperRegistrationRequestTimer,
                        this.x25OperMinimumRecallTimer,
                        this.x25OperRestartCount,
                        this.x25OperResetCount,
                        this.x25OperClearCount,
                        this.x25OperDataRxmtCount,
                        this.x25OperRejectCount,
                        this.x25OperRegistrationRequestCount,
                        this.x25OperNumberPVCs,
                        this.x25OperDefCallParamId,
                        this.x25OperLocalAddress,
                        this.x25OperDataLinkId,
                        this.x25OperProtocolVersionSupported
                    };
                }
                public static final class X25OperIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperIndex", "1.3.6.1.2.1.10.5.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperInterfaceModeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperInterfaceModeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperInterfaceMode", "1.3.6.1.2.1.10.5.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperMaxActiveCircuitsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperMaxActiveCircuitsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperMaxActiveCircuits", "1.3.6.1.2.1.10.5.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperPacketSequencingEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperPacketSequencingEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperPacketSequencing", "1.3.6.1.2.1.10.5.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperRestartTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperRestartTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperRestartTimer", "1.3.6.1.2.1.10.5.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperCallTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperCallTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperCallTimer", "1.3.6.1.2.1.10.5.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperResetTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperResetTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperResetTimer", "1.3.6.1.2.1.10.5.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperClearTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperClearTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperClearTimer", "1.3.6.1.2.1.10.5.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperWindowTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperWindowTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperWindowTimer", "1.3.6.1.2.1.10.5.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperDataRxmtTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperDataRxmtTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperDataRxmtTimer", "1.3.6.1.2.1.10.5.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperInterruptTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperInterruptTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperInterruptTimer", "1.3.6.1.2.1.10.5.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperRejectTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperRejectTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperRejectTimer", "1.3.6.1.2.1.10.5.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperRegistrationRequestTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperRegistrationRequestTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperRegistrationRequestTimer", "1.3.6.1.2.1.10.5.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperMinimumRecallTimerEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperMinimumRecallTimerEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperMinimumRecallTimer", "1.3.6.1.2.1.10.5.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperRestartCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperRestartCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperRestartCount", "1.3.6.1.2.1.10.5.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperResetCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperResetCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperResetCount", "1.3.6.1.2.1.10.5.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperClearCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperClearCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperClearCount", "1.3.6.1.2.1.10.5.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperDataRxmtCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperDataRxmtCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperDataRxmtCount", "1.3.6.1.2.1.10.5.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperRejectCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperRejectCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperRejectCount", "1.3.6.1.2.1.10.5.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperRegistrationRequestCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperRegistrationRequestCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperRegistrationRequestCount", "1.3.6.1.2.1.10.5.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperNumberPVCsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperNumberPVCsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperNumberPVCs", "1.3.6.1.2.1.10.5.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperDefCallParamIdEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperDefCallParamIdEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperDefCallParamId", "1.3.6.1.2.1.10.5.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperLocalAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperLocalAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperLocalAddress", "1.3.6.1.2.1.10.5.2.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperDataLinkIdEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperDataLinkIdEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperDataLinkId", "1.3.6.1.2.1.10.5.2.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25OperProtocolVersionSupportedEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25OperProtocolVersionSupportedEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25OperProtocolVersionSupported", "1.3.6.1.2.1.10.5.2.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25StatTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25StatEntryEnt x25StatEntry;

            private X25StatTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25StatTable", "1.3.6.1.2.1.10.5.3", false, true, false, false);
                this.x25StatEntry = new X25StatEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25StatEntry
                };
            }
            public static final class X25StatEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25StatIndexEnt x25StatIndex;

                public final X25StatInCallsEnt x25StatInCalls;

                public final X25StatInCallRefusalsEnt x25StatInCallRefusals;

                public final X25StatInProviderInitiatedClearsEnt x25StatInProviderInitiatedClears;

                public final X25StatInRemotelyInitiatedResetsEnt x25StatInRemotelyInitiatedResets;

                public final X25StatInProviderInitiatedResetsEnt x25StatInProviderInitiatedResets;

                public final X25StatInRestartsEnt x25StatInRestarts;

                public final X25StatInDataPacketsEnt x25StatInDataPackets;

                public final X25StatInAccusedOfProtocolErrorsEnt x25StatInAccusedOfProtocolErrors;

                public final X25StatInInterruptsEnt x25StatInInterrupts;

                public final X25StatOutCallAttemptsEnt x25StatOutCallAttempts;

                public final X25StatOutCallFailuresEnt x25StatOutCallFailures;

                public final X25StatOutInterruptsEnt x25StatOutInterrupts;

                public final X25StatOutDataPacketsEnt x25StatOutDataPackets;

                public final X25StatOutgoingCircuitsEnt x25StatOutgoingCircuits;

                public final X25StatIncomingCircuitsEnt x25StatIncomingCircuits;

                public final X25StatTwowayCircuitsEnt x25StatTwowayCircuits;

                public final X25StatRestartTimeoutsEnt x25StatRestartTimeouts;

                public final X25StatCallTimeoutsEnt x25StatCallTimeouts;

                public final X25StatResetTimeoutsEnt x25StatResetTimeouts;

                public final X25StatClearTimeoutsEnt x25StatClearTimeouts;

                public final X25StatDataRxmtTimeoutsEnt x25StatDataRxmtTimeouts;

                public final X25StatInterruptTimeoutsEnt x25StatInterruptTimeouts;

                public final X25StatRetryCountExceededsEnt x25StatRetryCountExceededs;

                public final X25StatClearCountExceededsEnt x25StatClearCountExceededs;

                private X25StatEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25StatEntry", "1.3.6.1.2.1.10.5.3.1", false, false, false, true);
                    this.x25StatIndex = new X25StatIndexEnt(mib, this);
                    this.x25StatInCalls = new X25StatInCallsEnt(mib, this);
                    this.x25StatInCallRefusals = new X25StatInCallRefusalsEnt(mib, this);
                    this.x25StatInProviderInitiatedClears = new X25StatInProviderInitiatedClearsEnt(mib, this);
                    this.x25StatInRemotelyInitiatedResets = new X25StatInRemotelyInitiatedResetsEnt(mib, this);
                    this.x25StatInProviderInitiatedResets = new X25StatInProviderInitiatedResetsEnt(mib, this);
                    this.x25StatInRestarts = new X25StatInRestartsEnt(mib, this);
                    this.x25StatInDataPackets = new X25StatInDataPacketsEnt(mib, this);
                    this.x25StatInAccusedOfProtocolErrors = new X25StatInAccusedOfProtocolErrorsEnt(mib, this);
                    this.x25StatInInterrupts = new X25StatInInterruptsEnt(mib, this);
                    this.x25StatOutCallAttempts = new X25StatOutCallAttemptsEnt(mib, this);
                    this.x25StatOutCallFailures = new X25StatOutCallFailuresEnt(mib, this);
                    this.x25StatOutInterrupts = new X25StatOutInterruptsEnt(mib, this);
                    this.x25StatOutDataPackets = new X25StatOutDataPacketsEnt(mib, this);
                    this.x25StatOutgoingCircuits = new X25StatOutgoingCircuitsEnt(mib, this);
                    this.x25StatIncomingCircuits = new X25StatIncomingCircuitsEnt(mib, this);
                    this.x25StatTwowayCircuits = new X25StatTwowayCircuitsEnt(mib, this);
                    this.x25StatRestartTimeouts = new X25StatRestartTimeoutsEnt(mib, this);
                    this.x25StatCallTimeouts = new X25StatCallTimeoutsEnt(mib, this);
                    this.x25StatResetTimeouts = new X25StatResetTimeoutsEnt(mib, this);
                    this.x25StatClearTimeouts = new X25StatClearTimeoutsEnt(mib, this);
                    this.x25StatDataRxmtTimeouts = new X25StatDataRxmtTimeoutsEnt(mib, this);
                    this.x25StatInterruptTimeouts = new X25StatInterruptTimeoutsEnt(mib, this);
                    this.x25StatRetryCountExceededs = new X25StatRetryCountExceededsEnt(mib, this);
                    this.x25StatClearCountExceededs = new X25StatClearCountExceededsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25StatIndex,
                        this.x25StatInCalls,
                        this.x25StatInCallRefusals,
                        this.x25StatInProviderInitiatedClears,
                        this.x25StatInRemotelyInitiatedResets,
                        this.x25StatInProviderInitiatedResets,
                        this.x25StatInRestarts,
                        this.x25StatInDataPackets,
                        this.x25StatInAccusedOfProtocolErrors,
                        this.x25StatInInterrupts,
                        this.x25StatOutCallAttempts,
                        this.x25StatOutCallFailures,
                        this.x25StatOutInterrupts,
                        this.x25StatOutDataPackets,
                        this.x25StatOutgoingCircuits,
                        this.x25StatIncomingCircuits,
                        this.x25StatTwowayCircuits,
                        this.x25StatRestartTimeouts,
                        this.x25StatCallTimeouts,
                        this.x25StatResetTimeouts,
                        this.x25StatClearTimeouts,
                        this.x25StatDataRxmtTimeouts,
                        this.x25StatInterruptTimeouts,
                        this.x25StatRetryCountExceededs,
                        this.x25StatClearCountExceededs
                    };
                }
                public static final class X25StatIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatIndex", "1.3.6.1.2.1.10.5.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInCallsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInCallsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInCalls", "1.3.6.1.2.1.10.5.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInCallRefusalsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInCallRefusalsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInCallRefusals", "1.3.6.1.2.1.10.5.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInProviderInitiatedClearsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInProviderInitiatedClearsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInProviderInitiatedClears", "1.3.6.1.2.1.10.5.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInRemotelyInitiatedResetsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInRemotelyInitiatedResetsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInRemotelyInitiatedResets", "1.3.6.1.2.1.10.5.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInProviderInitiatedResetsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInProviderInitiatedResetsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInProviderInitiatedResets", "1.3.6.1.2.1.10.5.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInRestartsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInRestartsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInRestarts", "1.3.6.1.2.1.10.5.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInDataPacketsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInDataPacketsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInDataPackets", "1.3.6.1.2.1.10.5.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInAccusedOfProtocolErrorsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInAccusedOfProtocolErrorsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInAccusedOfProtocolErrors", "1.3.6.1.2.1.10.5.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInInterruptsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInInterruptsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInInterrupts", "1.3.6.1.2.1.10.5.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatOutCallAttemptsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatOutCallAttemptsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatOutCallAttempts", "1.3.6.1.2.1.10.5.3.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatOutCallFailuresEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatOutCallFailuresEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatOutCallFailures", "1.3.6.1.2.1.10.5.3.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatOutInterruptsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatOutInterruptsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatOutInterrupts", "1.3.6.1.2.1.10.5.3.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatOutDataPacketsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatOutDataPacketsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatOutDataPackets", "1.3.6.1.2.1.10.5.3.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatOutgoingCircuitsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatOutgoingCircuitsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatOutgoingCircuits", "1.3.6.1.2.1.10.5.3.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatIncomingCircuitsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatIncomingCircuitsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatIncomingCircuits", "1.3.6.1.2.1.10.5.3.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatTwowayCircuitsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatTwowayCircuitsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatTwowayCircuits", "1.3.6.1.2.1.10.5.3.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatRestartTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatRestartTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatRestartTimeouts", "1.3.6.1.2.1.10.5.3.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatCallTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatCallTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatCallTimeouts", "1.3.6.1.2.1.10.5.3.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatResetTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatResetTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatResetTimeouts", "1.3.6.1.2.1.10.5.3.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatClearTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatClearTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatClearTimeouts", "1.3.6.1.2.1.10.5.3.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatDataRxmtTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatDataRxmtTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatDataRxmtTimeouts", "1.3.6.1.2.1.10.5.3.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatInterruptTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatInterruptTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatInterruptTimeouts", "1.3.6.1.2.1.10.5.3.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatRetryCountExceededsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatRetryCountExceededsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatRetryCountExceededs", "1.3.6.1.2.1.10.5.3.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25StatClearCountExceededsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25StatClearCountExceededsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25StatClearCountExceededs", "1.3.6.1.2.1.10.5.3.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25ChannelTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25ChannelEntryEnt x25ChannelEntry;

            private X25ChannelTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25ChannelTable", "1.3.6.1.2.1.10.5.4", false, true, false, false);
                this.x25ChannelEntry = new X25ChannelEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25ChannelEntry
                };
            }
            public static final class X25ChannelEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25ChannelIndexEnt x25ChannelIndex;

                public final X25ChannelLICEnt x25ChannelLIC;

                public final X25ChannelHICEnt x25ChannelHIC;

                public final X25ChannelLTCEnt x25ChannelLTC;

                public final X25ChannelHTCEnt x25ChannelHTC;

                public final X25ChannelLOCEnt x25ChannelLOC;

                public final X25ChannelHOCEnt x25ChannelHOC;

                private X25ChannelEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25ChannelEntry", "1.3.6.1.2.1.10.5.4.1", false, false, false, true);
                    this.x25ChannelIndex = new X25ChannelIndexEnt(mib, this);
                    this.x25ChannelLIC = new X25ChannelLICEnt(mib, this);
                    this.x25ChannelHIC = new X25ChannelHICEnt(mib, this);
                    this.x25ChannelLTC = new X25ChannelLTCEnt(mib, this);
                    this.x25ChannelHTC = new X25ChannelHTCEnt(mib, this);
                    this.x25ChannelLOC = new X25ChannelLOCEnt(mib, this);
                    this.x25ChannelHOC = new X25ChannelHOCEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25ChannelIndex,
                        this.x25ChannelLIC,
                        this.x25ChannelHIC,
                        this.x25ChannelLTC,
                        this.x25ChannelHTC,
                        this.x25ChannelLOC,
                        this.x25ChannelHOC
                    };
                }
                public static final class X25ChannelIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelIndex", "1.3.6.1.2.1.10.5.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ChannelLICEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelLICEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelLIC", "1.3.6.1.2.1.10.5.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ChannelHICEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelHICEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelHIC", "1.3.6.1.2.1.10.5.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ChannelLTCEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelLTCEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelLTC", "1.3.6.1.2.1.10.5.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ChannelHTCEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelHTCEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelHTC", "1.3.6.1.2.1.10.5.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ChannelLOCEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelLOCEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelLOC", "1.3.6.1.2.1.10.5.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ChannelHOCEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ChannelHOCEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ChannelHOC", "1.3.6.1.2.1.10.5.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25CircuitTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25CircuitEntryEnt x25CircuitEntry;

            private X25CircuitTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25CircuitTable", "1.3.6.1.2.1.10.5.5", false, true, false, false);
                this.x25CircuitEntry = new X25CircuitEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25CircuitEntry
                };
            }
            public static final class X25CircuitEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25CircuitIndexEnt x25CircuitIndex;

                public final X25CircuitChannelEnt x25CircuitChannel;

                public final X25CircuitStatusEnt x25CircuitStatus;

                public final X25CircuitEstablishTimeEnt x25CircuitEstablishTime;

                public final X25CircuitDirectionEnt x25CircuitDirection;

                /** X25 Circuit data flow statistics*/
                public final X25CircuitInOctetsEnt x25CircuitInOctets;

                public final X25CircuitInPdusEnt x25CircuitInPdus;

                public final X25CircuitInRemotelyInitiatedResetsEnt x25CircuitInRemotelyInitiatedResets;

                public final X25CircuitInProviderInitiatedResetsEnt x25CircuitInProviderInitiatedResets;

                public final X25CircuitInInterruptsEnt x25CircuitInInterrupts;

                public final X25CircuitOutOctetsEnt x25CircuitOutOctets;

                public final X25CircuitOutPdusEnt x25CircuitOutPdus;

                public final X25CircuitOutInterruptsEnt x25CircuitOutInterrupts;

                /** X25 circuit timer statistics*/
                public final X25CircuitDataRetransmissionTimeoutsEnt x25CircuitDataRetransmissionTimeouts;

                public final X25CircuitResetTimeoutsEnt x25CircuitResetTimeouts;

                public final X25CircuitInterruptTimeoutsEnt x25CircuitInterruptTimeouts;

                public final X25CircuitCallParamIdEnt x25CircuitCallParamId;

                public final X25CircuitCalledDteAddressEnt x25CircuitCalledDteAddress;

                public final X25CircuitCallingDteAddressEnt x25CircuitCallingDteAddress;

                public final X25CircuitOriginallyCalledAddressEnt x25CircuitOriginallyCalledAddress;

                public final X25CircuitDescrEnt x25CircuitDescr;

                private X25CircuitEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25CircuitEntry", "1.3.6.1.2.1.10.5.5.1", false, false, false, true);
                    this.x25CircuitIndex = new X25CircuitIndexEnt(mib, this);
                    this.x25CircuitChannel = new X25CircuitChannelEnt(mib, this);
                    this.x25CircuitStatus = new X25CircuitStatusEnt(mib, this);
                    this.x25CircuitEstablishTime = new X25CircuitEstablishTimeEnt(mib, this);
                    this.x25CircuitDirection = new X25CircuitDirectionEnt(mib, this);
                    this.x25CircuitInOctets = new X25CircuitInOctetsEnt(mib, this);
                    this.x25CircuitInPdus = new X25CircuitInPdusEnt(mib, this);
                    this.x25CircuitInRemotelyInitiatedResets = new X25CircuitInRemotelyInitiatedResetsEnt(mib, this);
                    this.x25CircuitInProviderInitiatedResets = new X25CircuitInProviderInitiatedResetsEnt(mib, this);
                    this.x25CircuitInInterrupts = new X25CircuitInInterruptsEnt(mib, this);
                    this.x25CircuitOutOctets = new X25CircuitOutOctetsEnt(mib, this);
                    this.x25CircuitOutPdus = new X25CircuitOutPdusEnt(mib, this);
                    this.x25CircuitOutInterrupts = new X25CircuitOutInterruptsEnt(mib, this);
                    this.x25CircuitDataRetransmissionTimeouts = new X25CircuitDataRetransmissionTimeoutsEnt(mib, this);
                    this.x25CircuitResetTimeouts = new X25CircuitResetTimeoutsEnt(mib, this);
                    this.x25CircuitInterruptTimeouts = new X25CircuitInterruptTimeoutsEnt(mib, this);
                    this.x25CircuitCallParamId = new X25CircuitCallParamIdEnt(mib, this);
                    this.x25CircuitCalledDteAddress = new X25CircuitCalledDteAddressEnt(mib, this);
                    this.x25CircuitCallingDteAddress = new X25CircuitCallingDteAddressEnt(mib, this);
                    this.x25CircuitOriginallyCalledAddress = new X25CircuitOriginallyCalledAddressEnt(mib, this);
                    this.x25CircuitDescr = new X25CircuitDescrEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25CircuitIndex,
                        this.x25CircuitChannel,
                        this.x25CircuitStatus,
                        this.x25CircuitEstablishTime,
                        this.x25CircuitDirection,
                        this.x25CircuitInOctets,
                        this.x25CircuitInPdus,
                        this.x25CircuitInRemotelyInitiatedResets,
                        this.x25CircuitInProviderInitiatedResets,
                        this.x25CircuitInInterrupts,
                        this.x25CircuitOutOctets,
                        this.x25CircuitOutPdus,
                        this.x25CircuitOutInterrupts,
                        this.x25CircuitDataRetransmissionTimeouts,
                        this.x25CircuitResetTimeouts,
                        this.x25CircuitInterruptTimeouts,
                        this.x25CircuitCallParamId,
                        this.x25CircuitCalledDteAddress,
                        this.x25CircuitCallingDteAddress,
                        this.x25CircuitOriginallyCalledAddress,
                        this.x25CircuitDescr
                    };
                }
                public static final class X25CircuitIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitIndex", "1.3.6.1.2.1.10.5.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitChannelEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitChannelEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitChannel", "1.3.6.1.2.1.10.5.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitStatusEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitStatusEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitStatus", "1.3.6.1.2.1.10.5.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitEstablishTimeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitEstablishTimeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitEstablishTime", "1.3.6.1.2.1.10.5.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitDirectionEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitDirectionEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitDirection", "1.3.6.1.2.1.10.5.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitInOctetsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitInOctetsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitInOctets", "1.3.6.1.2.1.10.5.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitInPdusEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitInPdusEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitInPdus", "1.3.6.1.2.1.10.5.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitInRemotelyInitiatedResetsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitInRemotelyInitiatedResetsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitInRemotelyInitiatedResets", "1.3.6.1.2.1.10.5.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitInProviderInitiatedResetsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitInProviderInitiatedResetsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitInProviderInitiatedResets", "1.3.6.1.2.1.10.5.5.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitInInterruptsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitInInterruptsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitInInterrupts", "1.3.6.1.2.1.10.5.5.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitOutOctetsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitOutOctetsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitOutOctets", "1.3.6.1.2.1.10.5.5.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitOutPdusEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitOutPdusEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitOutPdus", "1.3.6.1.2.1.10.5.5.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitOutInterruptsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitOutInterruptsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitOutInterrupts", "1.3.6.1.2.1.10.5.5.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitDataRetransmissionTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitDataRetransmissionTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitDataRetransmissionTimeouts", "1.3.6.1.2.1.10.5.5.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitResetTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitResetTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitResetTimeouts", "1.3.6.1.2.1.10.5.5.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitInterruptTimeoutsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitInterruptTimeoutsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitInterruptTimeouts", "1.3.6.1.2.1.10.5.5.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitCallParamIdEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitCallParamIdEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitCallParamId", "1.3.6.1.2.1.10.5.5.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitCalledDteAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitCalledDteAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitCalledDteAddress", "1.3.6.1.2.1.10.5.5.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitCallingDteAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitCallingDteAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitCallingDteAddress", "1.3.6.1.2.1.10.5.5.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitOriginallyCalledAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitOriginallyCalledAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitOriginallyCalledAddress", "1.3.6.1.2.1.10.5.5.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CircuitDescrEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CircuitDescrEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CircuitDescr", "1.3.6.1.2.1.10.5.5.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25ClearedCircuitEntriesRequestedEnt extends MIBEntry<RFC1382MIBDef>
        {
            private X25ClearedCircuitEntriesRequestedEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25ClearedCircuitEntriesRequested", "1.3.6.1.2.1.10.5.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class X25ClearedCircuitEntriesGrantedEnt extends MIBEntry<RFC1382MIBDef>
        {
            private X25ClearedCircuitEntriesGrantedEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25ClearedCircuitEntriesGranted", "1.3.6.1.2.1.10.5.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class X25ClearedCircuitTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25ClearedCircuitEntryEnt x25ClearedCircuitEntry;

            private X25ClearedCircuitTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25ClearedCircuitTable", "1.3.6.1.2.1.10.5.8", false, true, false, false);
                this.x25ClearedCircuitEntry = new X25ClearedCircuitEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25ClearedCircuitEntry
                };
            }
            public static final class X25ClearedCircuitEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25ClearedCircuitIndexEnt x25ClearedCircuitIndex;

                public final X25ClearedCircuitPleIndexEnt x25ClearedCircuitPleIndex;

                public final X25ClearedCircuitTimeEstablishedEnt x25ClearedCircuitTimeEstablished;

                public final X25ClearedCircuitTimeClearedEnt x25ClearedCircuitTimeCleared;

                public final X25ClearedCircuitChannelEnt x25ClearedCircuitChannel;

                public final X25ClearedCircuitClearingCauseEnt x25ClearedCircuitClearingCause;

                public final X25ClearedCircuitDiagnosticCodeEnt x25ClearedCircuitDiagnosticCode;

                public final X25ClearedCircuitInPdusEnt x25ClearedCircuitInPdus;

                public final X25ClearedCircuitOutPdusEnt x25ClearedCircuitOutPdus;

                public final X25ClearedCircuitCalledAddressEnt x25ClearedCircuitCalledAddress;

                public final X25ClearedCircuitCallingAddressEnt x25ClearedCircuitCallingAddress;

                public final X25ClearedCircuitClearFacilitiesEnt x25ClearedCircuitClearFacilities;

                private X25ClearedCircuitEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25ClearedCircuitEntry", "1.3.6.1.2.1.10.5.8.1", false, false, false, true);
                    this.x25ClearedCircuitIndex = new X25ClearedCircuitIndexEnt(mib, this);
                    this.x25ClearedCircuitPleIndex = new X25ClearedCircuitPleIndexEnt(mib, this);
                    this.x25ClearedCircuitTimeEstablished = new X25ClearedCircuitTimeEstablishedEnt(mib, this);
                    this.x25ClearedCircuitTimeCleared = new X25ClearedCircuitTimeClearedEnt(mib, this);
                    this.x25ClearedCircuitChannel = new X25ClearedCircuitChannelEnt(mib, this);
                    this.x25ClearedCircuitClearingCause = new X25ClearedCircuitClearingCauseEnt(mib, this);
                    this.x25ClearedCircuitDiagnosticCode = new X25ClearedCircuitDiagnosticCodeEnt(mib, this);
                    this.x25ClearedCircuitInPdus = new X25ClearedCircuitInPdusEnt(mib, this);
                    this.x25ClearedCircuitOutPdus = new X25ClearedCircuitOutPdusEnt(mib, this);
                    this.x25ClearedCircuitCalledAddress = new X25ClearedCircuitCalledAddressEnt(mib, this);
                    this.x25ClearedCircuitCallingAddress = new X25ClearedCircuitCallingAddressEnt(mib, this);
                    this.x25ClearedCircuitClearFacilities = new X25ClearedCircuitClearFacilitiesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25ClearedCircuitIndex,
                        this.x25ClearedCircuitPleIndex,
                        this.x25ClearedCircuitTimeEstablished,
                        this.x25ClearedCircuitTimeCleared,
                        this.x25ClearedCircuitChannel,
                        this.x25ClearedCircuitClearingCause,
                        this.x25ClearedCircuitDiagnosticCode,
                        this.x25ClearedCircuitInPdus,
                        this.x25ClearedCircuitOutPdus,
                        this.x25ClearedCircuitCalledAddress,
                        this.x25ClearedCircuitCallingAddress,
                        this.x25ClearedCircuitClearFacilities
                    };
                }
                public static final class X25ClearedCircuitIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitIndex", "1.3.6.1.2.1.10.5.8.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitPleIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitPleIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitPleIndex", "1.3.6.1.2.1.10.5.8.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitTimeEstablishedEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitTimeEstablishedEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitTimeEstablished", "1.3.6.1.2.1.10.5.8.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitTimeClearedEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitTimeClearedEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitTimeCleared", "1.3.6.1.2.1.10.5.8.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitChannelEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitChannelEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitChannel", "1.3.6.1.2.1.10.5.8.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitClearingCauseEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitClearingCauseEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitClearingCause", "1.3.6.1.2.1.10.5.8.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitDiagnosticCodeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitDiagnosticCodeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitDiagnosticCode", "1.3.6.1.2.1.10.5.8.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitInPdusEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitInPdusEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitInPdus", "1.3.6.1.2.1.10.5.8.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitOutPdusEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitOutPdusEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitOutPdus", "1.3.6.1.2.1.10.5.8.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitCalledAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitCalledAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitCalledAddress", "1.3.6.1.2.1.10.5.8.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitCallingAddressEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitCallingAddressEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitCallingAddress", "1.3.6.1.2.1.10.5.8.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25ClearedCircuitClearFacilitiesEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25ClearedCircuitClearFacilitiesEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25ClearedCircuitClearFacilities", "1.3.6.1.2.1.10.5.8.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25CallParmTableEnt extends MIBEntry<RFC1382MIBDef>
        {
            public final X25CallParmEntryEnt x25CallParmEntry;

            private X25CallParmTableEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25CallParmTable", "1.3.6.1.2.1.10.5.9", false, true, false, false);
                this.x25CallParmEntry = new X25CallParmEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25CallParmEntry
                };
            }
            public static final class X25CallParmEntryEnt extends MIBEntry<RFC1382MIBDef>
            {
                public final X25CallParmIndexEnt x25CallParmIndex;

                public final X25CallParmStatusEnt x25CallParmStatus;

                public final X25CallParmRefCountEnt x25CallParmRefCount;

                public final X25CallParmInPacketSizeEnt x25CallParmInPacketSize;

                public final X25CallParmOutPacketSizeEnt x25CallParmOutPacketSize;

                public final X25CallParmInWindowSizeEnt x25CallParmInWindowSize;

                public final X25CallParmOutWindowSizeEnt x25CallParmOutWindowSize;

                public final X25CallParmAcceptReverseChargingEnt x25CallParmAcceptReverseCharging;

                public final X25CallParmProposeReverseChargingEnt x25CallParmProposeReverseCharging;

                public final X25CallParmFastSelectEnt x25CallParmFastSelect;

                public final X25CallParmInThruPutClasSizeEnt x25CallParmInThruPutClasSize;

                public final X25CallParmOutThruPutClasSizeEnt x25CallParmOutThruPutClasSize;

                public final X25CallParmCugEnt x25CallParmCug;

                public final X25CallParmCugoaEnt x25CallParmCugoa;

                public final X25CallParmBcugEnt x25CallParmBcug;

                public final X25CallParmNuiEnt x25CallParmNui;

                public final X25CallParmChargingInfoEnt x25CallParmChargingInfo;

                public final X25CallParmRpoaEnt x25CallParmRpoa;

                public final X25CallParmTrnstDlyEnt x25CallParmTrnstDly;

                /** The following parameters are for CCITT facilities.*/
                public final X25CallParmCallingExtEnt x25CallParmCallingExt;

                public final X25CallParmCalledExtEnt x25CallParmCalledExt;

                public final X25CallParmInMinThuPutClsEnt x25CallParmInMinThuPutCls;

                public final X25CallParmOutMinThuPutClsEnt x25CallParmOutMinThuPutCls;

                public final X25CallParmEndTrnsDlyEnt x25CallParmEndTrnsDly;

                public final X25CallParmPriorityEnt x25CallParmPriority;

                public final X25CallParmProtectionEnt x25CallParmProtection;

                public final X25CallParmExptDataEnt x25CallParmExptData;

                public final X25CallParmUserDataEnt x25CallParmUserData;

                public final X25CallParmCallingNetworkFacilitiesEnt x25CallParmCallingNetworkFacilities;

                public final X25CallParmCalledNetworkFacilitiesEnt x25CallParmCalledNetworkFacilities;

                private X25CallParmEntryEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25CallParmEntry", "1.3.6.1.2.1.10.5.9.1", false, false, false, true);
                    this.x25CallParmIndex = new X25CallParmIndexEnt(mib, this);
                    this.x25CallParmStatus = new X25CallParmStatusEnt(mib, this);
                    this.x25CallParmRefCount = new X25CallParmRefCountEnt(mib, this);
                    this.x25CallParmInPacketSize = new X25CallParmInPacketSizeEnt(mib, this);
                    this.x25CallParmOutPacketSize = new X25CallParmOutPacketSizeEnt(mib, this);
                    this.x25CallParmInWindowSize = new X25CallParmInWindowSizeEnt(mib, this);
                    this.x25CallParmOutWindowSize = new X25CallParmOutWindowSizeEnt(mib, this);
                    this.x25CallParmAcceptReverseCharging = new X25CallParmAcceptReverseChargingEnt(mib, this);
                    this.x25CallParmProposeReverseCharging = new X25CallParmProposeReverseChargingEnt(mib, this);
                    this.x25CallParmFastSelect = new X25CallParmFastSelectEnt(mib, this);
                    this.x25CallParmInThruPutClasSize = new X25CallParmInThruPutClasSizeEnt(mib, this);
                    this.x25CallParmOutThruPutClasSize = new X25CallParmOutThruPutClasSizeEnt(mib, this);
                    this.x25CallParmCug = new X25CallParmCugEnt(mib, this);
                    this.x25CallParmCugoa = new X25CallParmCugoaEnt(mib, this);
                    this.x25CallParmBcug = new X25CallParmBcugEnt(mib, this);
                    this.x25CallParmNui = new X25CallParmNuiEnt(mib, this);
                    this.x25CallParmChargingInfo = new X25CallParmChargingInfoEnt(mib, this);
                    this.x25CallParmRpoa = new X25CallParmRpoaEnt(mib, this);
                    this.x25CallParmTrnstDly = new X25CallParmTrnstDlyEnt(mib, this);
                    this.x25CallParmCallingExt = new X25CallParmCallingExtEnt(mib, this);
                    this.x25CallParmCalledExt = new X25CallParmCalledExtEnt(mib, this);
                    this.x25CallParmInMinThuPutCls = new X25CallParmInMinThuPutClsEnt(mib, this);
                    this.x25CallParmOutMinThuPutCls = new X25CallParmOutMinThuPutClsEnt(mib, this);
                    this.x25CallParmEndTrnsDly = new X25CallParmEndTrnsDlyEnt(mib, this);
                    this.x25CallParmPriority = new X25CallParmPriorityEnt(mib, this);
                    this.x25CallParmProtection = new X25CallParmProtectionEnt(mib, this);
                    this.x25CallParmExptData = new X25CallParmExptDataEnt(mib, this);
                    this.x25CallParmUserData = new X25CallParmUserDataEnt(mib, this);
                    this.x25CallParmCallingNetworkFacilities = new X25CallParmCallingNetworkFacilitiesEnt(mib, this);
                    this.x25CallParmCalledNetworkFacilities = new X25CallParmCalledNetworkFacilitiesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.x25CallParmIndex,
                        this.x25CallParmStatus,
                        this.x25CallParmRefCount,
                        this.x25CallParmInPacketSize,
                        this.x25CallParmOutPacketSize,
                        this.x25CallParmInWindowSize,
                        this.x25CallParmOutWindowSize,
                        this.x25CallParmAcceptReverseCharging,
                        this.x25CallParmProposeReverseCharging,
                        this.x25CallParmFastSelect,
                        this.x25CallParmInThruPutClasSize,
                        this.x25CallParmOutThruPutClasSize,
                        this.x25CallParmCug,
                        this.x25CallParmCugoa,
                        this.x25CallParmBcug,
                        this.x25CallParmNui,
                        this.x25CallParmChargingInfo,
                        this.x25CallParmRpoa,
                        this.x25CallParmTrnstDly,
                        this.x25CallParmCallingExt,
                        this.x25CallParmCalledExt,
                        this.x25CallParmInMinThuPutCls,
                        this.x25CallParmOutMinThuPutCls,
                        this.x25CallParmEndTrnsDly,
                        this.x25CallParmPriority,
                        this.x25CallParmProtection,
                        this.x25CallParmExptData,
                        this.x25CallParmUserData,
                        this.x25CallParmCallingNetworkFacilities,
                        this.x25CallParmCalledNetworkFacilities
                    };
                }
                public static final class X25CallParmIndexEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmIndexEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmIndex", "1.3.6.1.2.1.10.5.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmStatusEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmStatusEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmStatus", "1.3.6.1.2.1.10.5.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmRefCountEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmRefCountEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmRefCount", "1.3.6.1.2.1.10.5.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmInPacketSizeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmInPacketSizeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmInPacketSize", "1.3.6.1.2.1.10.5.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmOutPacketSizeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmOutPacketSizeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmOutPacketSize", "1.3.6.1.2.1.10.5.9.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmInWindowSizeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmInWindowSizeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmInWindowSize", "1.3.6.1.2.1.10.5.9.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmOutWindowSizeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmOutWindowSizeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmOutWindowSize", "1.3.6.1.2.1.10.5.9.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmAcceptReverseChargingEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmAcceptReverseChargingEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmAcceptReverseCharging", "1.3.6.1.2.1.10.5.9.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmProposeReverseChargingEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmProposeReverseChargingEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmProposeReverseCharging", "1.3.6.1.2.1.10.5.9.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmFastSelectEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmFastSelectEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmFastSelect", "1.3.6.1.2.1.10.5.9.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmInThruPutClasSizeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmInThruPutClasSizeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmInThruPutClasSize", "1.3.6.1.2.1.10.5.9.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmOutThruPutClasSizeEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmOutThruPutClasSizeEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmOutThruPutClasSize", "1.3.6.1.2.1.10.5.9.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmCugEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmCugEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmCug", "1.3.6.1.2.1.10.5.9.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmCugoaEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmCugoaEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmCugoa", "1.3.6.1.2.1.10.5.9.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmBcugEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmBcugEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmBcug", "1.3.6.1.2.1.10.5.9.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmNuiEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmNuiEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmNui", "1.3.6.1.2.1.10.5.9.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmChargingInfoEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmChargingInfoEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmChargingInfo", "1.3.6.1.2.1.10.5.9.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmRpoaEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmRpoaEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmRpoa", "1.3.6.1.2.1.10.5.9.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmTrnstDlyEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmTrnstDlyEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmTrnstDly", "1.3.6.1.2.1.10.5.9.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmCallingExtEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmCallingExtEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmCallingExt", "1.3.6.1.2.1.10.5.9.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmCalledExtEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmCalledExtEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmCalledExt", "1.3.6.1.2.1.10.5.9.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmInMinThuPutClsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmInMinThuPutClsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmInMinThuPutCls", "1.3.6.1.2.1.10.5.9.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmOutMinThuPutClsEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmOutMinThuPutClsEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmOutMinThuPutCls", "1.3.6.1.2.1.10.5.9.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmEndTrnsDlyEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmEndTrnsDlyEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmEndTrnsDly", "1.3.6.1.2.1.10.5.9.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmPriorityEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmPriorityEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmPriority", "1.3.6.1.2.1.10.5.9.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmProtectionEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmProtectionEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmProtection", "1.3.6.1.2.1.10.5.9.1.26", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmExptDataEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmExptDataEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmExptData", "1.3.6.1.2.1.10.5.9.1.27", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmUserDataEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmUserDataEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmUserData", "1.3.6.1.2.1.10.5.9.1.28", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmCallingNetworkFacilitiesEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmCallingNetworkFacilitiesEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmCallingNetworkFacilities", "1.3.6.1.2.1.10.5.9.1.29", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class X25CallParmCalledNetworkFacilitiesEnt extends MIBEntry<RFC1382MIBDef>
                {
                    private X25CallParmCalledNetworkFacilitiesEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                    {
                        super(mib, parent, "x25CallParmCalledNetworkFacilities", "1.3.6.1.2.1.10.5.9.1.30", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class X25ProtocolVersionEnt extends MIBEntry<RFC1382MIBDef>
        {
            /** X.25 CCITT 1976 version.*/
            public final X25protocolCcittV1976Ent x25protocolCcittV1976;

            /** X.25 CCITT 1980 version.*/
            public final X25protocolCcittV1980Ent x25protocolCcittV1980;

            /** X.25 CCITT 1984 version.*/
            public final X25protocolCcittV1984Ent x25protocolCcittV1984;

            /** X.25 CCITT 1988 version.*/
            public final X25protocolCcittV1988Ent x25protocolCcittV1988;

            /** X.25 1987 version of ISO 8208.*/
            public final X25protocolIso8208V1987Ent x25protocolIso8208V1987;

            /** X.25 1989 version of ISO 8208.*/
            public final X25protocolIso8208V1989Ent x25protocolIso8208V1989;

            private X25ProtocolVersionEnt(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
            {
                super(mib, parent, "x25ProtocolVersion", "1.3.6.1.2.1.10.5.10", false, false, false, false);
                this.x25protocolCcittV1976 = new X25protocolCcittV1976Ent(mib, this);
                this.x25protocolCcittV1980 = new X25protocolCcittV1980Ent(mib, this);
                this.x25protocolCcittV1984 = new X25protocolCcittV1984Ent(mib, this);
                this.x25protocolCcittV1988 = new X25protocolCcittV1988Ent(mib, this);
                this.x25protocolIso8208V1987 = new X25protocolIso8208V1987Ent(mib, this);
                this.x25protocolIso8208V1989 = new X25protocolIso8208V1989Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.x25protocolCcittV1976,
                    this.x25protocolCcittV1980,
                    this.x25protocolCcittV1984,
                    this.x25protocolCcittV1988,
                    this.x25protocolIso8208V1987,
                    this.x25protocolIso8208V1989
                };
            }
            public static final class X25protocolCcittV1976Ent extends MIBEntry<RFC1382MIBDef>
            {
                private X25protocolCcittV1976Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25protocolCcittV1976", "1.3.6.1.2.1.10.5.10.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class X25protocolCcittV1980Ent extends MIBEntry<RFC1382MIBDef>
            {
                private X25protocolCcittV1980Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25protocolCcittV1980", "1.3.6.1.2.1.10.5.10.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class X25protocolCcittV1984Ent extends MIBEntry<RFC1382MIBDef>
            {
                private X25protocolCcittV1984Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25protocolCcittV1984", "1.3.6.1.2.1.10.5.10.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class X25protocolCcittV1988Ent extends MIBEntry<RFC1382MIBDef>
            {
                private X25protocolCcittV1988Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25protocolCcittV1988", "1.3.6.1.2.1.10.5.10.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class X25protocolIso8208V1987Ent extends MIBEntry<RFC1382MIBDef>
            {
                private X25protocolIso8208V1987Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25protocolIso8208V1987", "1.3.6.1.2.1.10.5.10.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class X25protocolIso8208V1989Ent extends MIBEntry<RFC1382MIBDef>
            {
                private X25protocolIso8208V1989Ent(RFC1382MIBDef mib, MIBEntry<RFC1382MIBDef> parent)
                {
                    super(mib, parent, "x25protocolIso8208V1989", "1.3.6.1.2.1.10.5.10.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
