package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**The following describes some of the MIB-II interface
objects and their relationship with the objects in this
MIB extension.
ifDescr:  describes the interface.   It should include
identification information for the physical line and a
description of the network.  For connections to PDNs,
it should name the PDN.
ifMtu: the maximum number of octets an upper layer can
pass to this interface as a single frame.
ifSpeed:
ifAdminStatus:
ifOperStatus:
ifLastChange: the last time the state of the interface
changed.  A reset is considered an instantaneous change to
the ndm state and back to abm or abme.  This will be the
last time that lapbFlowChangeReason and lapbFlowChanges
changed.
ifInOctets: contains the number of octets
received from the peer LAPB including FCS.
ifInUcastPkts: contains the number of I-frames delivered
by this interface to a higher layer interface.
ifInDiscards: contains the number of received
frames discarded because of internal conditions
(such as lack of buffering).
ifInErrors: contains the number of Invalid frames received.
This does not have any relationship with the number REJ,
or RNR frames sent or received.
ifInUnknownProtos: contains the number of frames
that were correct but were dropped because they
were inappropriate for the current state.  This
includes an invalid Poll bit, an unknown address,
or other condition such as an RNR when connection
not established.  This also includes the number of
DISC or other frames that were ignored because the
link was not established and this interface was not
configured to perform link setup on that type frame.
ifOutOctets: number of octets sent to peer including
FCS octets.
ifOutUcastPkts: number of I-frames received from
a higher layer for transmission to peer.
ifOutDiscards: number of frames to be sent that were
dropped due to internal conditions such as buffering etc.
ifOutErrors: number of transmissions that failed
due to errors or were considered invalid by the receiver.
This does not have any relationship with the number REJ,
or RNR frames sent or received.
ifOutQLen: number of frames waiting to be transmitted.
This MIB does not provide any support for:
Multilink procedure (MLP) in ISO 7776 section 6
LLC Pbit timer
LLC REJ timer
LLC Busy State Timer 7.8.1.4
###########################################################*/
public final class RFC1381MIBDef extends MIB
{
    public static final RFC1381MIBDef RFC1381MIB = new RFC1381MIBDef();

    static { MIBs.getInstance().registerMIB(RFC1381MIBDef.RFC1381MIB); }

    /** LAPB MIB*/
    public final LapbEnt lapb;

    private RFC1381MIBDef()
    {
        super("RFC1381-MIB");
        this.lapb = new LapbEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.lapb
        };
    }

    public static final class LapbEnt extends MIBEntry<RFC1381MIBDef>
    {
        /** IfIndexType specifies an index object for a tablewith entries that match entries in the MIB-II ifTable.The value of the index for the table will match theifIndex entry for same interface in the ifTable.The values of this object range from 1 to ifNumberinclusive.

###########################################################LAPB Admn Table###########################################################
Support of the lapbAdmnTable is mandatory for allagents of systems that implement LAPB.*/
        public final LapbAdmnTableEnt lapbAdmnTable;

        /** ###########################################################LAPB operating parameters.###########################################################
Support of the lapbOperTable is mandatory for allagents of systems that implement LAPB.*/
        public final LapbOperTableEnt lapbOperTable;

        /** ###########################################################LAPB    Flow Table###########################################################
Support of the lapbFlowTable is mandatory for allagents of systems that implement LAPB.*/
        public final LapbFlowTableEnt lapbFlowTable;

        /** ###########################################################LAPB    XID Table###########################################################
Support for the lapbXidTable is mandatory for all agentsof systems that have a LAPB implementation using XIDnegotiation.  Agents of systems without XID negotiationsupport should not implement this table.*/
        public final LapbXidTableEnt lapbXidTable;

        /** ###########################################################LAPB protocol versions###########################################################*/
        public final LapbProtocolVersionEnt lapbProtocolVersion;

        private LapbEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
        {
            super(mib, parent, "lapb", "1.3.6.1.2.1.10.16", false, false, false, false);
            this.lapbAdmnTable = new LapbAdmnTableEnt(mib, this);
            this.lapbOperTable = new LapbOperTableEnt(mib, this);
            this.lapbFlowTable = new LapbFlowTableEnt(mib, this);
            this.lapbXidTable = new LapbXidTableEnt(mib, this);
            this.lapbProtocolVersion = new LapbProtocolVersionEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.lapbAdmnTable,
                this.lapbOperTable,
                this.lapbFlowTable,
                this.lapbXidTable,
                this.lapbProtocolVersion
            };
        }
        public static final class LapbAdmnTableEnt extends MIBEntry<RFC1381MIBDef>
        {
            public final LapbAdmnEntryEnt lapbAdmnEntry;

            private LapbAdmnTableEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
            {
                super(mib, parent, "lapbAdmnTable", "1.3.6.1.2.1.10.16.1", false, true, false, false);
                this.lapbAdmnEntry = new LapbAdmnEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lapbAdmnEntry
                };
            }
            public static final class LapbAdmnEntryEnt extends MIBEntry<RFC1381MIBDef>
            {
                public final LapbAdmnIndexEnt lapbAdmnIndex;

                public final LapbAdmnStationTypeEnt lapbAdmnStationType;

                public final LapbAdmnControlFieldEnt lapbAdmnControlField;

                /** 4500 * 8; 802.5 Frame size*/
                public final LapbAdmnTransmitN1FrameSizeEnt lapbAdmnTransmitN1FrameSize;

                /** 4500 * 8; 802.5 Frame size*/
                public final LapbAdmnReceiveN1FrameSizeEnt lapbAdmnReceiveN1FrameSize;

                public final LapbAdmnTransmitKWindowSizeEnt lapbAdmnTransmitKWindowSize;

                public final LapbAdmnReceiveKWindowSizeEnt lapbAdmnReceiveKWindowSize;

                public final LapbAdmnN2RxmitCountEnt lapbAdmnN2RxmitCount;

                public final LapbAdmnT1AckTimerEnt lapbAdmnT1AckTimer;

                public final LapbAdmnT2AckDelayTimerEnt lapbAdmnT2AckDelayTimer;

                public final LapbAdmnT3DisconnectTimerEnt lapbAdmnT3DisconnectTimer;

                public final LapbAdmnT4IdleTimerEnt lapbAdmnT4IdleTimer;

                public final LapbAdmnActionInitiateEnt lapbAdmnActionInitiate;

                public final LapbAdmnActionRecvDMEnt lapbAdmnActionRecvDM;

                private LapbAdmnEntryEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbAdmnEntry", "1.3.6.1.2.1.10.16.1.1", false, false, false, true);
                    this.lapbAdmnIndex = new LapbAdmnIndexEnt(mib, this);
                    this.lapbAdmnStationType = new LapbAdmnStationTypeEnt(mib, this);
                    this.lapbAdmnControlField = new LapbAdmnControlFieldEnt(mib, this);
                    this.lapbAdmnTransmitN1FrameSize = new LapbAdmnTransmitN1FrameSizeEnt(mib, this);
                    this.lapbAdmnReceiveN1FrameSize = new LapbAdmnReceiveN1FrameSizeEnt(mib, this);
                    this.lapbAdmnTransmitKWindowSize = new LapbAdmnTransmitKWindowSizeEnt(mib, this);
                    this.lapbAdmnReceiveKWindowSize = new LapbAdmnReceiveKWindowSizeEnt(mib, this);
                    this.lapbAdmnN2RxmitCount = new LapbAdmnN2RxmitCountEnt(mib, this);
                    this.lapbAdmnT1AckTimer = new LapbAdmnT1AckTimerEnt(mib, this);
                    this.lapbAdmnT2AckDelayTimer = new LapbAdmnT2AckDelayTimerEnt(mib, this);
                    this.lapbAdmnT3DisconnectTimer = new LapbAdmnT3DisconnectTimerEnt(mib, this);
                    this.lapbAdmnT4IdleTimer = new LapbAdmnT4IdleTimerEnt(mib, this);
                    this.lapbAdmnActionInitiate = new LapbAdmnActionInitiateEnt(mib, this);
                    this.lapbAdmnActionRecvDM = new LapbAdmnActionRecvDMEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lapbAdmnIndex,
                        this.lapbAdmnStationType,
                        this.lapbAdmnControlField,
                        this.lapbAdmnTransmitN1FrameSize,
                        this.lapbAdmnReceiveN1FrameSize,
                        this.lapbAdmnTransmitKWindowSize,
                        this.lapbAdmnReceiveKWindowSize,
                        this.lapbAdmnN2RxmitCount,
                        this.lapbAdmnT1AckTimer,
                        this.lapbAdmnT2AckDelayTimer,
                        this.lapbAdmnT3DisconnectTimer,
                        this.lapbAdmnT4IdleTimer,
                        this.lapbAdmnActionInitiate,
                        this.lapbAdmnActionRecvDM
                    };
                }
                public static final class LapbAdmnIndexEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnIndexEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnIndex", "1.3.6.1.2.1.10.16.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnStationTypeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnStationTypeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnStationType", "1.3.6.1.2.1.10.16.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnControlFieldEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnControlFieldEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnControlField", "1.3.6.1.2.1.10.16.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnTransmitN1FrameSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnTransmitN1FrameSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnTransmitN1FrameSize", "1.3.6.1.2.1.10.16.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnReceiveN1FrameSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnReceiveN1FrameSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnReceiveN1FrameSize", "1.3.6.1.2.1.10.16.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnTransmitKWindowSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnTransmitKWindowSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnTransmitKWindowSize", "1.3.6.1.2.1.10.16.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnReceiveKWindowSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnReceiveKWindowSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnReceiveKWindowSize", "1.3.6.1.2.1.10.16.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnN2RxmitCountEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnN2RxmitCountEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnN2RxmitCount", "1.3.6.1.2.1.10.16.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnT1AckTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnT1AckTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnT1AckTimer", "1.3.6.1.2.1.10.16.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnT2AckDelayTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnT2AckDelayTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnT2AckDelayTimer", "1.3.6.1.2.1.10.16.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnT3DisconnectTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnT3DisconnectTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnT3DisconnectTimer", "1.3.6.1.2.1.10.16.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnT4IdleTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnT4IdleTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnT4IdleTimer", "1.3.6.1.2.1.10.16.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnActionInitiateEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnActionInitiateEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnActionInitiate", "1.3.6.1.2.1.10.16.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbAdmnActionRecvDMEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbAdmnActionRecvDMEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbAdmnActionRecvDM", "1.3.6.1.2.1.10.16.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class LapbOperTableEnt extends MIBEntry<RFC1381MIBDef>
        {
            public final LapbOperEntryEnt lapbOperEntry;

            private LapbOperTableEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
            {
                super(mib, parent, "lapbOperTable", "1.3.6.1.2.1.10.16.2", false, true, false, false);
                this.lapbOperEntry = new LapbOperEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lapbOperEntry
                };
            }
            public static final class LapbOperEntryEnt extends MIBEntry<RFC1381MIBDef>
            {
                public final LapbOperIndexEnt lapbOperIndex;

                public final LapbOperStationTypeEnt lapbOperStationType;

                public final LapbOperControlFieldEnt lapbOperControlField;

                public final LapbOperTransmitN1FrameSizeEnt lapbOperTransmitN1FrameSize;

                /** See lapbOperTransmitN1FrameSize above*/
                public final LapbOperReceiveN1FrameSizeEnt lapbOperReceiveN1FrameSize;

                public final LapbOperTransmitKWindowSizeEnt lapbOperTransmitKWindowSize;

                public final LapbOperReceiveKWindowSizeEnt lapbOperReceiveKWindowSize;

                public final LapbOperN2RxmitCountEnt lapbOperN2RxmitCount;

                public final LapbOperT1AckTimerEnt lapbOperT1AckTimer;

                public final LapbOperT2AckDelayTimerEnt lapbOperT2AckDelayTimer;

                public final LapbOperT3DisconnectTimerEnt lapbOperT3DisconnectTimer;

                public final LapbOperT4IdleTimerEnt lapbOperT4IdleTimer;

                public final LapbOperPortIdEnt lapbOperPortId;

                public final LapbOperProtocolVersionIdEnt lapbOperProtocolVersionId;

                private LapbOperEntryEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbOperEntry", "1.3.6.1.2.1.10.16.2.1", false, false, false, true);
                    this.lapbOperIndex = new LapbOperIndexEnt(mib, this);
                    this.lapbOperStationType = new LapbOperStationTypeEnt(mib, this);
                    this.lapbOperControlField = new LapbOperControlFieldEnt(mib, this);
                    this.lapbOperTransmitN1FrameSize = new LapbOperTransmitN1FrameSizeEnt(mib, this);
                    this.lapbOperReceiveN1FrameSize = new LapbOperReceiveN1FrameSizeEnt(mib, this);
                    this.lapbOperTransmitKWindowSize = new LapbOperTransmitKWindowSizeEnt(mib, this);
                    this.lapbOperReceiveKWindowSize = new LapbOperReceiveKWindowSizeEnt(mib, this);
                    this.lapbOperN2RxmitCount = new LapbOperN2RxmitCountEnt(mib, this);
                    this.lapbOperT1AckTimer = new LapbOperT1AckTimerEnt(mib, this);
                    this.lapbOperT2AckDelayTimer = new LapbOperT2AckDelayTimerEnt(mib, this);
                    this.lapbOperT3DisconnectTimer = new LapbOperT3DisconnectTimerEnt(mib, this);
                    this.lapbOperT4IdleTimer = new LapbOperT4IdleTimerEnt(mib, this);
                    this.lapbOperPortId = new LapbOperPortIdEnt(mib, this);
                    this.lapbOperProtocolVersionId = new LapbOperProtocolVersionIdEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lapbOperIndex,
                        this.lapbOperStationType,
                        this.lapbOperControlField,
                        this.lapbOperTransmitN1FrameSize,
                        this.lapbOperReceiveN1FrameSize,
                        this.lapbOperTransmitKWindowSize,
                        this.lapbOperReceiveKWindowSize,
                        this.lapbOperN2RxmitCount,
                        this.lapbOperT1AckTimer,
                        this.lapbOperT2AckDelayTimer,
                        this.lapbOperT3DisconnectTimer,
                        this.lapbOperT4IdleTimer,
                        this.lapbOperPortId,
                        this.lapbOperProtocolVersionId
                    };
                }
                public static final class LapbOperIndexEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperIndexEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperIndex", "1.3.6.1.2.1.10.16.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperStationTypeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperStationTypeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperStationType", "1.3.6.1.2.1.10.16.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperControlFieldEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperControlFieldEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperControlField", "1.3.6.1.2.1.10.16.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperTransmitN1FrameSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperTransmitN1FrameSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperTransmitN1FrameSize", "1.3.6.1.2.1.10.16.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperReceiveN1FrameSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperReceiveN1FrameSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperReceiveN1FrameSize", "1.3.6.1.2.1.10.16.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperTransmitKWindowSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperTransmitKWindowSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperTransmitKWindowSize", "1.3.6.1.2.1.10.16.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperReceiveKWindowSizeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperReceiveKWindowSizeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperReceiveKWindowSize", "1.3.6.1.2.1.10.16.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperN2RxmitCountEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperN2RxmitCountEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperN2RxmitCount", "1.3.6.1.2.1.10.16.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperT1AckTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperT1AckTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperT1AckTimer", "1.3.6.1.2.1.10.16.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperT2AckDelayTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperT2AckDelayTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperT2AckDelayTimer", "1.3.6.1.2.1.10.16.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperT3DisconnectTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperT3DisconnectTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperT3DisconnectTimer", "1.3.6.1.2.1.10.16.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperT4IdleTimerEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperT4IdleTimerEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperT4IdleTimer", "1.3.6.1.2.1.10.16.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperPortIdEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperPortIdEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperPortId", "1.3.6.1.2.1.10.16.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbOperProtocolVersionIdEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbOperProtocolVersionIdEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbOperProtocolVersionId", "1.3.6.1.2.1.10.16.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class LapbFlowTableEnt extends MIBEntry<RFC1381MIBDef>
        {
            public final LapbFlowEntryEnt lapbFlowEntry;

            private LapbFlowTableEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
            {
                super(mib, parent, "lapbFlowTable", "1.3.6.1.2.1.10.16.3", false, true, false, false);
                this.lapbFlowEntry = new LapbFlowEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lapbFlowEntry
                };
            }
            public static final class LapbFlowEntryEnt extends MIBEntry<RFC1381MIBDef>
            {
                public final LapbFlowIfIndexEnt lapbFlowIfIndex;

                public final LapbFlowStateChangesEnt lapbFlowStateChanges;

                public final LapbFlowChangeReasonEnt lapbFlowChangeReason;

                public final LapbFlowCurrentModeEnt lapbFlowCurrentMode;

                public final LapbFlowBusyDefersEnt lapbFlowBusyDefers;

                public final LapbFlowRejOutPktsEnt lapbFlowRejOutPkts;

                public final LapbFlowRejInPktsEnt lapbFlowRejInPkts;

                public final LapbFlowT1TimeoutsEnt lapbFlowT1Timeouts;

                public final LapbFlowFrmrSentEnt lapbFlowFrmrSent;

                public final LapbFlowFrmrReceivedEnt lapbFlowFrmrReceived;

                public final LapbFlowXidReceivedEnt lapbFlowXidReceived;

                private LapbFlowEntryEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbFlowEntry", "1.3.6.1.2.1.10.16.3.1", false, false, false, true);
                    this.lapbFlowIfIndex = new LapbFlowIfIndexEnt(mib, this);
                    this.lapbFlowStateChanges = new LapbFlowStateChangesEnt(mib, this);
                    this.lapbFlowChangeReason = new LapbFlowChangeReasonEnt(mib, this);
                    this.lapbFlowCurrentMode = new LapbFlowCurrentModeEnt(mib, this);
                    this.lapbFlowBusyDefers = new LapbFlowBusyDefersEnt(mib, this);
                    this.lapbFlowRejOutPkts = new LapbFlowRejOutPktsEnt(mib, this);
                    this.lapbFlowRejInPkts = new LapbFlowRejInPktsEnt(mib, this);
                    this.lapbFlowT1Timeouts = new LapbFlowT1TimeoutsEnt(mib, this);
                    this.lapbFlowFrmrSent = new LapbFlowFrmrSentEnt(mib, this);
                    this.lapbFlowFrmrReceived = new LapbFlowFrmrReceivedEnt(mib, this);
                    this.lapbFlowXidReceived = new LapbFlowXidReceivedEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lapbFlowIfIndex,
                        this.lapbFlowStateChanges,
                        this.lapbFlowChangeReason,
                        this.lapbFlowCurrentMode,
                        this.lapbFlowBusyDefers,
                        this.lapbFlowRejOutPkts,
                        this.lapbFlowRejInPkts,
                        this.lapbFlowT1Timeouts,
                        this.lapbFlowFrmrSent,
                        this.lapbFlowFrmrReceived,
                        this.lapbFlowXidReceived
                    };
                }
                public static final class LapbFlowIfIndexEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowIfIndexEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowIfIndex", "1.3.6.1.2.1.10.16.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowStateChangesEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowStateChangesEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowStateChanges", "1.3.6.1.2.1.10.16.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowChangeReasonEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowChangeReasonEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowChangeReason", "1.3.6.1.2.1.10.16.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowCurrentModeEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowCurrentModeEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowCurrentMode", "1.3.6.1.2.1.10.16.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowBusyDefersEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowBusyDefersEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowBusyDefers", "1.3.6.1.2.1.10.16.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowRejOutPktsEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowRejOutPktsEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowRejOutPkts", "1.3.6.1.2.1.10.16.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowRejInPktsEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowRejInPktsEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowRejInPkts", "1.3.6.1.2.1.10.16.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowT1TimeoutsEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowT1TimeoutsEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowT1Timeouts", "1.3.6.1.2.1.10.16.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowFrmrSentEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowFrmrSentEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowFrmrSent", "1.3.6.1.2.1.10.16.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowFrmrReceivedEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowFrmrReceivedEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowFrmrReceived", "1.3.6.1.2.1.10.16.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbFlowXidReceivedEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbFlowXidReceivedEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbFlowXidReceived", "1.3.6.1.2.1.10.16.3.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class LapbXidTableEnt extends MIBEntry<RFC1381MIBDef>
        {
            public final LapbXidEntryEnt lapbXidEntry;

            private LapbXidTableEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
            {
                super(mib, parent, "lapbXidTable", "1.3.6.1.2.1.10.16.4", false, true, false, false);
                this.lapbXidEntry = new LapbXidEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lapbXidEntry
                };
            }
            public static final class LapbXidEntryEnt extends MIBEntry<RFC1381MIBDef>
            {
                public final LapbXidIndexEnt lapbXidIndex;

                public final LapbXidAdRIdentifierEnt lapbXidAdRIdentifier;

                public final LapbXidAdRAddressEnt lapbXidAdRAddress;

                public final LapbXidParameterUniqueIdentifierEnt lapbXidParameterUniqueIdentifier;

                public final LapbXidGroupAddressEnt lapbXidGroupAddress;

                public final LapbXidPortNumberEnt lapbXidPortNumber;

                public final LapbXidUserDataSubfieldEnt lapbXidUserDataSubfield;

                private LapbXidEntryEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbXidEntry", "1.3.6.1.2.1.10.16.4.1", false, false, false, true);
                    this.lapbXidIndex = new LapbXidIndexEnt(mib, this);
                    this.lapbXidAdRIdentifier = new LapbXidAdRIdentifierEnt(mib, this);
                    this.lapbXidAdRAddress = new LapbXidAdRAddressEnt(mib, this);
                    this.lapbXidParameterUniqueIdentifier = new LapbXidParameterUniqueIdentifierEnt(mib, this);
                    this.lapbXidGroupAddress = new LapbXidGroupAddressEnt(mib, this);
                    this.lapbXidPortNumber = new LapbXidPortNumberEnt(mib, this);
                    this.lapbXidUserDataSubfield = new LapbXidUserDataSubfieldEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.lapbXidIndex,
                        this.lapbXidAdRIdentifier,
                        this.lapbXidAdRAddress,
                        this.lapbXidParameterUniqueIdentifier,
                        this.lapbXidGroupAddress,
                        this.lapbXidPortNumber,
                        this.lapbXidUserDataSubfield
                    };
                }
                public static final class LapbXidIndexEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidIndexEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidIndex", "1.3.6.1.2.1.10.16.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbXidAdRIdentifierEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidAdRIdentifierEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidAdRIdentifier", "1.3.6.1.2.1.10.16.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbXidAdRAddressEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidAdRAddressEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidAdRAddress", "1.3.6.1.2.1.10.16.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbXidParameterUniqueIdentifierEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidParameterUniqueIdentifierEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidParameterUniqueIdentifier", "1.3.6.1.2.1.10.16.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbXidGroupAddressEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidGroupAddressEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidGroupAddress", "1.3.6.1.2.1.10.16.4.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbXidPortNumberEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidPortNumberEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidPortNumber", "1.3.6.1.2.1.10.16.4.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class LapbXidUserDataSubfieldEnt extends MIBEntry<RFC1381MIBDef>
                {
                    private LapbXidUserDataSubfieldEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                    {
                        super(mib, parent, "lapbXidUserDataSubfield", "1.3.6.1.2.1.10.16.4.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class LapbProtocolVersionEnt extends MIBEntry<RFC1381MIBDef>
        {
            public final LapbProtocolIso7776v1986Ent lapbProtocolIso7776v1986;

            public final LapbProtocolCcittV1980Ent lapbProtocolCcittV1980;

            public final LapbProtocolCcittV1984Ent lapbProtocolCcittV1984;

            private LapbProtocolVersionEnt(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
            {
                super(mib, parent, "lapbProtocolVersion", "1.3.6.1.2.1.10.16.5", false, false, false, false);
                this.lapbProtocolIso7776v1986 = new LapbProtocolIso7776v1986Ent(mib, this);
                this.lapbProtocolCcittV1980 = new LapbProtocolCcittV1980Ent(mib, this);
                this.lapbProtocolCcittV1984 = new LapbProtocolCcittV1984Ent(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.lapbProtocolIso7776v1986,
                    this.lapbProtocolCcittV1980,
                    this.lapbProtocolCcittV1984
                };
            }
            public static final class LapbProtocolIso7776v1986Ent extends MIBEntry<RFC1381MIBDef>
            {
                private LapbProtocolIso7776v1986Ent(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbProtocolIso7776v1986", "1.3.6.1.2.1.10.16.5.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LapbProtocolCcittV1980Ent extends MIBEntry<RFC1381MIBDef>
            {
                private LapbProtocolCcittV1980Ent(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbProtocolCcittV1980", "1.3.6.1.2.1.10.16.5.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LapbProtocolCcittV1984Ent extends MIBEntry<RFC1381MIBDef>
            {
                private LapbProtocolCcittV1984Ent(RFC1381MIBDef mib, MIBEntry<RFC1381MIBDef> parent)
                {
                    super(mib, parent, "lapbProtocolCcittV1984", "1.3.6.1.2.1.10.16.5.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
