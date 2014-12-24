package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**###########################################################*/
public final class MIOX25MIBDef extends MIB
{
    public static final MIOX25MIBDef MIOX25MIB = new MIOX25MIBDef();

    /** IP over X.25 MIB*/
    public final MioxEnt miox;

    private MIOX25MIBDef()
    {
        super("MIOX25-MIB");
        this.miox = new MioxEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.miox
        };
    }

    public static final class MioxEnt extends MIBEntry<MIOX25MIBDef>
    {
        public final MioxPleEnt mioxPle;

        public final MioxPeerEnt mioxPeer;

        private MioxEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
        {
            super(mib, parent, "miox", "1.3.6.1.2.1.10.38", false, false, false, false);
            this.mioxPle = new MioxPleEnt(mib, this);
            this.mioxPeer = new MioxPeerEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mioxPle,
                this.mioxPeer
            };
        }
        public static final class MioxPleEnt extends MIBEntry<MIOX25MIBDef>
        {
            /** ###########################################################Ple Table###########################################################
Systems that implement RFC 1356 must also implementall objects in this group.*/
            public final MioxPleTableEnt mioxPleTable;

            private MioxPleEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
            {
                super(mib, parent, "mioxPle", "1.3.6.1.2.1.10.38.1", false, false, false, false);
                this.mioxPleTable = new MioxPleTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mioxPleTable
                };
            }
            public static final class MioxPleTableEnt extends MIBEntry<MIOX25MIBDef>
            {
                public final MioxPleEntryEnt mioxPleEntry;

                private MioxPleTableEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                {
                    super(mib, parent, "mioxPleTable", "1.3.6.1.2.1.10.38.1.1", false, true, false, false);
                    this.mioxPleEntry = new MioxPleEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mioxPleEntry
                    };
                }
                public static final class MioxPleEntryEnt extends MIBEntry<MIOX25MIBDef>
                {
                    public final MioxPleMaxCircuitsEnt mioxPleMaxCircuits;

                    public final MioxPleRefusedConnectionsEnt mioxPleRefusedConnections;

                    public final MioxPleEnAddrToX121LkupFlrsEnt mioxPleEnAddrToX121LkupFlrs;

                    public final MioxPleLastFailedEnAddrEnt mioxPleLastFailedEnAddr;

                    public final MioxPleEnAddrToX121LkupFlrTimeEnt mioxPleEnAddrToX121LkupFlrTime;

                    public final MioxPleX121ToEnAddrLkupFlrsEnt mioxPleX121ToEnAddrLkupFlrs;

                    public final MioxPleLastFailedX121AddressEnt mioxPleLastFailedX121Address;

                    public final MioxPleX121ToEnAddrLkupFlrTimeEnt mioxPleX121ToEnAddrLkupFlrTime;

                    public final MioxPleQbitFailuresEnt mioxPleQbitFailures;

                    public final MioxPleQbitFailureRemoteAddressEnt mioxPleQbitFailureRemoteAddress;

                    public final MioxPleQbitFailureTimeEnt mioxPleQbitFailureTime;

                    public final MioxPleMinimumOpenTimerEnt mioxPleMinimumOpenTimer;

                    public final MioxPleInactivityTimerEnt mioxPleInactivityTimer;

                    public final MioxPleHoldDownTimerEnt mioxPleHoldDownTimer;

                    public final MioxPleCollisionRetryTimerEnt mioxPleCollisionRetryTimer;

                    public final MioxPleDefaultPeerIdEnt mioxPleDefaultPeerId;

                    private MioxPleEntryEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                    {
                        super(mib, parent, "mioxPleEntry", "1.3.6.1.2.1.10.38.1.1.1", false, false, false, true);
                        this.mioxPleMaxCircuits = new MioxPleMaxCircuitsEnt(mib, this);
                        this.mioxPleRefusedConnections = new MioxPleRefusedConnectionsEnt(mib, this);
                        this.mioxPleEnAddrToX121LkupFlrs = new MioxPleEnAddrToX121LkupFlrsEnt(mib, this);
                        this.mioxPleLastFailedEnAddr = new MioxPleLastFailedEnAddrEnt(mib, this);
                        this.mioxPleEnAddrToX121LkupFlrTime = new MioxPleEnAddrToX121LkupFlrTimeEnt(mib, this);
                        this.mioxPleX121ToEnAddrLkupFlrs = new MioxPleX121ToEnAddrLkupFlrsEnt(mib, this);
                        this.mioxPleLastFailedX121Address = new MioxPleLastFailedX121AddressEnt(mib, this);
                        this.mioxPleX121ToEnAddrLkupFlrTime = new MioxPleX121ToEnAddrLkupFlrTimeEnt(mib, this);
                        this.mioxPleQbitFailures = new MioxPleQbitFailuresEnt(mib, this);
                        this.mioxPleQbitFailureRemoteAddress = new MioxPleQbitFailureRemoteAddressEnt(mib, this);
                        this.mioxPleQbitFailureTime = new MioxPleQbitFailureTimeEnt(mib, this);
                        this.mioxPleMinimumOpenTimer = new MioxPleMinimumOpenTimerEnt(mib, this);
                        this.mioxPleInactivityTimer = new MioxPleInactivityTimerEnt(mib, this);
                        this.mioxPleHoldDownTimer = new MioxPleHoldDownTimerEnt(mib, this);
                        this.mioxPleCollisionRetryTimer = new MioxPleCollisionRetryTimerEnt(mib, this);
                        this.mioxPleDefaultPeerId = new MioxPleDefaultPeerIdEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mioxPleMaxCircuits,
                            this.mioxPleRefusedConnections,
                            this.mioxPleEnAddrToX121LkupFlrs,
                            this.mioxPleLastFailedEnAddr,
                            this.mioxPleEnAddrToX121LkupFlrTime,
                            this.mioxPleX121ToEnAddrLkupFlrs,
                            this.mioxPleLastFailedX121Address,
                            this.mioxPleX121ToEnAddrLkupFlrTime,
                            this.mioxPleQbitFailures,
                            this.mioxPleQbitFailureRemoteAddress,
                            this.mioxPleQbitFailureTime,
                            this.mioxPleMinimumOpenTimer,
                            this.mioxPleInactivityTimer,
                            this.mioxPleHoldDownTimer,
                            this.mioxPleCollisionRetryTimer,
                            this.mioxPleDefaultPeerId
                        };
                    }
                    public static final class MioxPleMaxCircuitsEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleMaxCircuitsEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleMaxCircuits", "1.3.6.1.2.1.10.38.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleRefusedConnectionsEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleRefusedConnectionsEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleRefusedConnections", "1.3.6.1.2.1.10.38.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleEnAddrToX121LkupFlrsEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleEnAddrToX121LkupFlrsEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleEnAddrToX121LkupFlrs", "1.3.6.1.2.1.10.38.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleLastFailedEnAddrEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleLastFailedEnAddrEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleLastFailedEnAddr", "1.3.6.1.2.1.10.38.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleEnAddrToX121LkupFlrTimeEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleEnAddrToX121LkupFlrTimeEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleEnAddrToX121LkupFlrTime", "1.3.6.1.2.1.10.38.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleX121ToEnAddrLkupFlrsEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleX121ToEnAddrLkupFlrsEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleX121ToEnAddrLkupFlrs", "1.3.6.1.2.1.10.38.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleLastFailedX121AddressEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleLastFailedX121AddressEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleLastFailedX121Address", "1.3.6.1.2.1.10.38.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleX121ToEnAddrLkupFlrTimeEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleX121ToEnAddrLkupFlrTimeEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleX121ToEnAddrLkupFlrTime", "1.3.6.1.2.1.10.38.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleQbitFailuresEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleQbitFailuresEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleQbitFailures", "1.3.6.1.2.1.10.38.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleQbitFailureRemoteAddressEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleQbitFailureRemoteAddressEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleQbitFailureRemoteAddress", "1.3.6.1.2.1.10.38.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleQbitFailureTimeEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleQbitFailureTimeEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleQbitFailureTime", "1.3.6.1.2.1.10.38.1.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleMinimumOpenTimerEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleMinimumOpenTimerEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleMinimumOpenTimer", "1.3.6.1.2.1.10.38.1.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleInactivityTimerEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleInactivityTimerEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleInactivityTimer", "1.3.6.1.2.1.10.38.1.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleHoldDownTimerEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleHoldDownTimerEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleHoldDownTimer", "1.3.6.1.2.1.10.38.1.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleCollisionRetryTimerEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleCollisionRetryTimerEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleCollisionRetryTimer", "1.3.6.1.2.1.10.38.1.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPleDefaultPeerIdEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPleDefaultPeerIdEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPleDefaultPeerId", "1.3.6.1.2.1.10.38.1.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MioxPeerEnt extends MIBEntry<MIOX25MIBDef>
        {
            /** ###########################################################Peer Table###########################################################
Systems that implement RFC 1356 must also implementall objects in this group.*/
            public final MioxPeerTableEnt mioxPeerTable;

            /** ###########################################################Peer Encapsulation Table###########################################################*/
            public final MioxPeerEncTableEnt mioxPeerEncTable;

            private MioxPeerEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
            {
                super(mib, parent, "mioxPeer", "1.3.6.1.2.1.10.38.2", false, false, false, false);
                this.mioxPeerTable = new MioxPeerTableEnt(mib, this);
                this.mioxPeerEncTable = new MioxPeerEncTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mioxPeerTable,
                    this.mioxPeerEncTable
                };
            }
            public static final class MioxPeerTableEnt extends MIBEntry<MIOX25MIBDef>
            {
                public final MioxPeerEntryEnt mioxPeerEntry;

                private MioxPeerTableEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                {
                    super(mib, parent, "mioxPeerTable", "1.3.6.1.2.1.10.38.2.1", false, true, false, false);
                    this.mioxPeerEntry = new MioxPeerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mioxPeerEntry
                    };
                }
                public static final class MioxPeerEntryEnt extends MIBEntry<MIOX25MIBDef>
                {
                    public final MioxPeerIndexEnt mioxPeerIndex;

                    /** Systems can claim conformance with this MIB withoutimplementing sets to mioxPeerStatus with a value ofclearCall or makeCall.All other defined values must be accepted.Implementors should realize that allowing these valuesprovides richer management, and implementationsare encouraged to accept these values.*/
                    public final MioxPeerStatusEnt mioxPeerStatus;

                    public final MioxPeerMaxCircuitsEnt mioxPeerMaxCircuits;

                    public final MioxPeerIfIndexEnt mioxPeerIfIndex;

                    public final MioxPeerConnectSecondsEnt mioxPeerConnectSeconds;

                    public final MioxPeerX25CallParamIdEnt mioxPeerX25CallParamId;

                    public final MioxPeerEnAddrEnt mioxPeerEnAddr;

                    public final MioxPeerX121AddressEnt mioxPeerX121Address;

                    /** Systems can claim conformance to this MIB withoutimplementing sets to mioxPeerX25CircuitId.However systems that use PVCs with RFC1356are encouraged to implement sets.*/
                    public final MioxPeerX25CircuitIdEnt mioxPeerX25CircuitId;

                    public final MioxPeerDescrEnt mioxPeerDescr;

                    private MioxPeerEntryEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                    {
                        super(mib, parent, "mioxPeerEntry", "1.3.6.1.2.1.10.38.2.1.1", false, false, false, true);
                        this.mioxPeerIndex = new MioxPeerIndexEnt(mib, this);
                        this.mioxPeerStatus = new MioxPeerStatusEnt(mib, this);
                        this.mioxPeerMaxCircuits = new MioxPeerMaxCircuitsEnt(mib, this);
                        this.mioxPeerIfIndex = new MioxPeerIfIndexEnt(mib, this);
                        this.mioxPeerConnectSeconds = new MioxPeerConnectSecondsEnt(mib, this);
                        this.mioxPeerX25CallParamId = new MioxPeerX25CallParamIdEnt(mib, this);
                        this.mioxPeerEnAddr = new MioxPeerEnAddrEnt(mib, this);
                        this.mioxPeerX121Address = new MioxPeerX121AddressEnt(mib, this);
                        this.mioxPeerX25CircuitId = new MioxPeerX25CircuitIdEnt(mib, this);
                        this.mioxPeerDescr = new MioxPeerDescrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mioxPeerIndex,
                            this.mioxPeerStatus,
                            this.mioxPeerMaxCircuits,
                            this.mioxPeerIfIndex,
                            this.mioxPeerConnectSeconds,
                            this.mioxPeerX25CallParamId,
                            this.mioxPeerEnAddr,
                            this.mioxPeerX121Address,
                            this.mioxPeerX25CircuitId,
                            this.mioxPeerDescr
                        };
                    }
                    public static final class MioxPeerIndexEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerIndexEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerIndex", "1.3.6.1.2.1.10.38.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerStatusEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerStatusEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerStatus", "1.3.6.1.2.1.10.38.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerMaxCircuitsEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerMaxCircuitsEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerMaxCircuits", "1.3.6.1.2.1.10.38.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerIfIndexEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerIfIndexEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerIfIndex", "1.3.6.1.2.1.10.38.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerConnectSecondsEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerConnectSecondsEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerConnectSeconds", "1.3.6.1.2.1.10.38.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerX25CallParamIdEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerX25CallParamIdEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerX25CallParamId", "1.3.6.1.2.1.10.38.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerEnAddrEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerEnAddrEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerEnAddr", "1.3.6.1.2.1.10.38.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerX121AddressEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerX121AddressEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerX121Address", "1.3.6.1.2.1.10.38.2.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerX25CircuitIdEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerX25CircuitIdEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerX25CircuitId", "1.3.6.1.2.1.10.38.2.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerDescrEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerDescrEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerDescr", "1.3.6.1.2.1.10.38.2.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MioxPeerEncTableEnt extends MIBEntry<MIOX25MIBDef>
            {
                public final MioxPeerEncEntryEnt mioxPeerEncEntry;

                private MioxPeerEncTableEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                {
                    super(mib, parent, "mioxPeerEncTable", "1.3.6.1.2.1.10.38.2.2", false, true, false, false);
                    this.mioxPeerEncEntry = new MioxPeerEncEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mioxPeerEncEntry
                    };
                }
                public static final class MioxPeerEncEntryEnt extends MIBEntry<MIOX25MIBDef>
                {
                    public final MioxPeerEncIndexEnt mioxPeerEncIndex;

                    public final MioxPeerEncTypeEnt mioxPeerEncType;

                    private MioxPeerEncEntryEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                    {
                        super(mib, parent, "mioxPeerEncEntry", "1.3.6.1.2.1.10.38.2.2.1", false, false, false, true);
                        this.mioxPeerEncIndex = new MioxPeerEncIndexEnt(mib, this);
                        this.mioxPeerEncType = new MioxPeerEncTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mioxPeerEncIndex,
                            this.mioxPeerEncType
                        };
                    }
                    public static final class MioxPeerEncIndexEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerEncIndexEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerEncIndex", "1.3.6.1.2.1.10.38.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MioxPeerEncTypeEnt extends MIBEntry<MIOX25MIBDef>
                    {
                        private MioxPeerEncTypeEnt(MIOX25MIBDef mib, MIBEntry<MIOX25MIBDef> parent)
                        {
                            super(mib, parent, "mioxPeerEncType", "1.3.6.1.2.1.10.38.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
