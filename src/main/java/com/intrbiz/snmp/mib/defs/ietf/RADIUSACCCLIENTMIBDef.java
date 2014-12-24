package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class RADIUSACCCLIENTMIBDef extends MIB
{
    public static final RADIUSACCCLIENTMIBDef RADIUSACCCLIENTMIB = new RADIUSACCCLIENTMIBDef();

    public final RadiusMIBEnt radiusMIB;

    private RADIUSACCCLIENTMIBDef()
    {
        super("RADIUS-ACC-CLIENT-MIB");
        this.radiusMIB = new RadiusMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.radiusMIB
        };
    }

    public static final class RadiusMIBEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
    {
        public final RadiusAccountingEnt radiusAccounting;

        private RadiusMIBEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
        {
            super(mib, parent, "radiusMIB", "1.3.6.1.2.1.67", false, false, false, false);
            this.radiusAccounting = new RadiusAccountingEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusAccounting
            };
        }
        public static final class RadiusAccountingEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
        {
            /** 21 August 2006*/
            public final RadiusAccClientMIBEnt radiusAccClientMIB;

            private RadiusAccountingEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
            {
                super(mib, parent, "radiusAccounting", "1.3.6.1.2.1.67.2", false, false, false, false);
                this.radiusAccClientMIB = new RadiusAccClientMIBEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusAccClientMIB
                };
            }
            public static final class RadiusAccClientMIBEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
            {
                public final RadiusAccClientMIBObjectsEnt radiusAccClientMIBObjects;

                /** conformance information*/
                public final RadiusAccClientMIBConformanceEnt radiusAccClientMIBConformance;

                private RadiusAccClientMIBEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusAccClientMIB", "1.3.6.1.2.1.67.2.2", false, false, false, false);
                    this.radiusAccClientMIBObjects = new RadiusAccClientMIBObjectsEnt(mib, this);
                    this.radiusAccClientMIBConformance = new RadiusAccClientMIBConformanceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAccClientMIBObjects,
                        this.radiusAccClientMIBConformance
                    };
                }
                public static final class RadiusAccClientMIBObjectsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                {
                    public final RadiusAccClientEnt radiusAccClient;

                    private RadiusAccClientMIBObjectsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccClientMIBObjects", "1.3.6.1.2.1.67.2.2.1", false, false, false, false);
                        this.radiusAccClient = new RadiusAccClientEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAccClient
                        };
                    }
                    public static final class RadiusAccClientEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                    {
                        public final RadiusAccClientInvalidServerAddressesEnt radiusAccClientInvalidServerAddresses;

                        public final RadiusAccClientIdentifierEnt radiusAccClientIdentifier;

                        public final RadiusAccServerTableEnt radiusAccServerTable;

                        /** New MIB objects added in this revision*/
                        public final RadiusAccServerExtTableEnt radiusAccServerExtTable;

                        private RadiusAccClientEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAccClient", "1.3.6.1.2.1.67.2.2.1.1", false, false, false, false);
                            this.radiusAccClientInvalidServerAddresses = new RadiusAccClientInvalidServerAddressesEnt(mib, this);
                            this.radiusAccClientIdentifier = new RadiusAccClientIdentifierEnt(mib, this);
                            this.radiusAccServerTable = new RadiusAccServerTableEnt(mib, this);
                            this.radiusAccServerExtTable = new RadiusAccServerExtTableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAccClientInvalidServerAddresses,
                                this.radiusAccClientIdentifier,
                                this.radiusAccServerTable,
                                this.radiusAccServerExtTable
                            };
                        }
                        public static final class RadiusAccClientInvalidServerAddressesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            private RadiusAccClientInvalidServerAddressesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientInvalidServerAddresses", "1.3.6.1.2.1.67.2.2.1.1.1", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientIdentifierEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            private RadiusAccClientIdentifierEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientIdentifier", "1.3.6.1.2.1.67.2.2.1.1.2", true, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServerTableEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            public final RadiusAccServerEntryEnt radiusAccServerEntry;

                            private RadiusAccServerTableEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServerTable", "1.3.6.1.2.1.67.2.2.1.1.3", false, true, false, false);
                                this.radiusAccServerEntry = new RadiusAccServerEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.radiusAccServerEntry
                                };
                            }
                            public static final class RadiusAccServerEntryEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                            {
                                public final RadiusAccServerIndexEnt radiusAccServerIndex;

                                public final RadiusAccServerAddressEnt radiusAccServerAddress;

                                public final RadiusAccClientServerPortNumberEnt radiusAccClientServerPortNumber;

                                public final RadiusAccClientRoundTripTimeEnt radiusAccClientRoundTripTime;

                                /** Request/Response statisticsRequests = Responses + PendingRequests + ClientTimeoutsResponses - MalformedResponses - BadAuthenticators -UnknownTypes - PacketsDropped = Successfully received*/
                                public final RadiusAccClientRequestsEnt radiusAccClientRequests;

                                public final RadiusAccClientRetransmissionsEnt radiusAccClientRetransmissions;

                                public final RadiusAccClientResponsesEnt radiusAccClientResponses;

                                public final RadiusAccClientMalformedResponsesEnt radiusAccClientMalformedResponses;

                                public final RadiusAccClientBadAuthenticatorsEnt radiusAccClientBadAuthenticators;

                                public final RadiusAccClientPendingRequestsEnt radiusAccClientPendingRequests;

                                public final RadiusAccClientTimeoutsEnt radiusAccClientTimeouts;

                                public final RadiusAccClientUnknownTypesEnt radiusAccClientUnknownTypes;

                                public final RadiusAccClientPacketsDroppedEnt radiusAccClientPacketsDropped;

                                private RadiusAccServerEntryEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAccServerEntry", "1.3.6.1.2.1.67.2.2.1.1.3.1", false, false, false, true);
                                    this.radiusAccServerIndex = new RadiusAccServerIndexEnt(mib, this);
                                    this.radiusAccServerAddress = new RadiusAccServerAddressEnt(mib, this);
                                    this.radiusAccClientServerPortNumber = new RadiusAccClientServerPortNumberEnt(mib, this);
                                    this.radiusAccClientRoundTripTime = new RadiusAccClientRoundTripTimeEnt(mib, this);
                                    this.radiusAccClientRequests = new RadiusAccClientRequestsEnt(mib, this);
                                    this.radiusAccClientRetransmissions = new RadiusAccClientRetransmissionsEnt(mib, this);
                                    this.radiusAccClientResponses = new RadiusAccClientResponsesEnt(mib, this);
                                    this.radiusAccClientMalformedResponses = new RadiusAccClientMalformedResponsesEnt(mib, this);
                                    this.radiusAccClientBadAuthenticators = new RadiusAccClientBadAuthenticatorsEnt(mib, this);
                                    this.radiusAccClientPendingRequests = new RadiusAccClientPendingRequestsEnt(mib, this);
                                    this.radiusAccClientTimeouts = new RadiusAccClientTimeoutsEnt(mib, this);
                                    this.radiusAccClientUnknownTypes = new RadiusAccClientUnknownTypesEnt(mib, this);
                                    this.radiusAccClientPacketsDropped = new RadiusAccClientPacketsDroppedEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.radiusAccServerIndex,
                                        this.radiusAccServerAddress,
                                        this.radiusAccClientServerPortNumber,
                                        this.radiusAccClientRoundTripTime,
                                        this.radiusAccClientRequests,
                                        this.radiusAccClientRetransmissions,
                                        this.radiusAccClientResponses,
                                        this.radiusAccClientMalformedResponses,
                                        this.radiusAccClientBadAuthenticators,
                                        this.radiusAccClientPendingRequests,
                                        this.radiusAccClientTimeouts,
                                        this.radiusAccClientUnknownTypes,
                                        this.radiusAccClientPacketsDropped
                                    };
                                }
                                public static final class RadiusAccServerIndexEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccServerIndexEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccServerIndex", "1.3.6.1.2.1.67.2.2.1.1.3.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccServerAddressEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccServerAddressEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccServerAddress", "1.3.6.1.2.1.67.2.2.1.1.3.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientServerPortNumberEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientServerPortNumberEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientServerPortNumber", "1.3.6.1.2.1.67.2.2.1.1.3.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientRoundTripTimeEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientRoundTripTimeEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientRoundTripTime", "1.3.6.1.2.1.67.2.2.1.1.3.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientRequestsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientRequestsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientRequests", "1.3.6.1.2.1.67.2.2.1.1.3.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientRetransmissionsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientRetransmissionsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientRetransmissions", "1.3.6.1.2.1.67.2.2.1.1.3.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientResponsesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientResponsesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientResponses", "1.3.6.1.2.1.67.2.2.1.1.3.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientMalformedResponsesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientMalformedResponsesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientMalformedResponses", "1.3.6.1.2.1.67.2.2.1.1.3.1.8", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientBadAuthenticatorsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientBadAuthenticatorsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientBadAuthenticators", "1.3.6.1.2.1.67.2.2.1.1.3.1.9", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientPendingRequestsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientPendingRequestsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientPendingRequests", "1.3.6.1.2.1.67.2.2.1.1.3.1.10", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientTimeoutsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientTimeoutsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientTimeouts", "1.3.6.1.2.1.67.2.2.1.1.3.1.11", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientUnknownTypesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientUnknownTypesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientUnknownTypes", "1.3.6.1.2.1.67.2.2.1.1.3.1.12", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientPacketsDroppedEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientPacketsDroppedEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientPacketsDropped", "1.3.6.1.2.1.67.2.2.1.1.3.1.13", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                        public static final class RadiusAccServerExtTableEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            public final RadiusAccServerExtEntryEnt radiusAccServerExtEntry;

                            private RadiusAccServerExtTableEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServerExtTable", "1.3.6.1.2.1.67.2.2.1.1.4", false, true, false, false);
                                this.radiusAccServerExtEntry = new RadiusAccServerExtEntryEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.radiusAccServerExtEntry
                                };
                            }
                            public static final class RadiusAccServerExtEntryEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                            {
                                public final RadiusAccServerExtIndexEnt radiusAccServerExtIndex;

                                public final RadiusAccServerInetAddressTypeEnt radiusAccServerInetAddressType;

                                public final RadiusAccServerInetAddressEnt radiusAccServerInetAddress;

                                public final RadiusAccClientServerInetPortNumberEnt radiusAccClientServerInetPortNumber;

                                public final RadiusAccClientExtRoundTripTimeEnt radiusAccClientExtRoundTripTime;

                                /** Request/Response statisticsRequests = Responses + PendingRequests + ClientTimeoutsResponses - MalformedResponses - BadAuthenticators -UnknownTypes - PacketsDropped = Successfully received*/
                                public final RadiusAccClientExtRequestsEnt radiusAccClientExtRequests;

                                public final RadiusAccClientExtRetransmissionsEnt radiusAccClientExtRetransmissions;

                                public final RadiusAccClientExtResponsesEnt radiusAccClientExtResponses;

                                public final RadiusAccClientExtMalformedResponsesEnt radiusAccClientExtMalformedResponses;

                                public final RadiusAccClientExtBadAuthenticatorsEnt radiusAccClientExtBadAuthenticators;

                                public final RadiusAccClientExtPendingRequestsEnt radiusAccClientExtPendingRequests;

                                public final RadiusAccClientExtTimeoutsEnt radiusAccClientExtTimeouts;

                                public final RadiusAccClientExtUnknownTypesEnt radiusAccClientExtUnknownTypes;

                                public final RadiusAccClientExtPacketsDroppedEnt radiusAccClientExtPacketsDropped;

                                public final RadiusAccClientCounterDiscontinuityEnt radiusAccClientCounterDiscontinuity;

                                private RadiusAccServerExtEntryEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAccServerExtEntry", "1.3.6.1.2.1.67.2.2.1.1.4.1", false, false, false, true);
                                    this.radiusAccServerExtIndex = new RadiusAccServerExtIndexEnt(mib, this);
                                    this.radiusAccServerInetAddressType = new RadiusAccServerInetAddressTypeEnt(mib, this);
                                    this.radiusAccServerInetAddress = new RadiusAccServerInetAddressEnt(mib, this);
                                    this.radiusAccClientServerInetPortNumber = new RadiusAccClientServerInetPortNumberEnt(mib, this);
                                    this.radiusAccClientExtRoundTripTime = new RadiusAccClientExtRoundTripTimeEnt(mib, this);
                                    this.radiusAccClientExtRequests = new RadiusAccClientExtRequestsEnt(mib, this);
                                    this.radiusAccClientExtRetransmissions = new RadiusAccClientExtRetransmissionsEnt(mib, this);
                                    this.radiusAccClientExtResponses = new RadiusAccClientExtResponsesEnt(mib, this);
                                    this.radiusAccClientExtMalformedResponses = new RadiusAccClientExtMalformedResponsesEnt(mib, this);
                                    this.radiusAccClientExtBadAuthenticators = new RadiusAccClientExtBadAuthenticatorsEnt(mib, this);
                                    this.radiusAccClientExtPendingRequests = new RadiusAccClientExtPendingRequestsEnt(mib, this);
                                    this.radiusAccClientExtTimeouts = new RadiusAccClientExtTimeoutsEnt(mib, this);
                                    this.radiusAccClientExtUnknownTypes = new RadiusAccClientExtUnknownTypesEnt(mib, this);
                                    this.radiusAccClientExtPacketsDropped = new RadiusAccClientExtPacketsDroppedEnt(mib, this);
                                    this.radiusAccClientCounterDiscontinuity = new RadiusAccClientCounterDiscontinuityEnt(mib, this);
                                    this.entries = new MIBEntry<?>[] {
                                        this.radiusAccServerExtIndex,
                                        this.radiusAccServerInetAddressType,
                                        this.radiusAccServerInetAddress,
                                        this.radiusAccClientServerInetPortNumber,
                                        this.radiusAccClientExtRoundTripTime,
                                        this.radiusAccClientExtRequests,
                                        this.radiusAccClientExtRetransmissions,
                                        this.radiusAccClientExtResponses,
                                        this.radiusAccClientExtMalformedResponses,
                                        this.radiusAccClientExtBadAuthenticators,
                                        this.radiusAccClientExtPendingRequests,
                                        this.radiusAccClientExtTimeouts,
                                        this.radiusAccClientExtUnknownTypes,
                                        this.radiusAccClientExtPacketsDropped,
                                        this.radiusAccClientCounterDiscontinuity
                                    };
                                }
                                public static final class RadiusAccServerExtIndexEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccServerExtIndexEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccServerExtIndex", "1.3.6.1.2.1.67.2.2.1.1.4.1.1", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccServerInetAddressTypeEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccServerInetAddressTypeEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccServerInetAddressType", "1.3.6.1.2.1.67.2.2.1.1.4.1.2", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccServerInetAddressEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccServerInetAddressEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccServerInetAddress", "1.3.6.1.2.1.67.2.2.1.1.4.1.3", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientServerInetPortNumberEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientServerInetPortNumberEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientServerInetPortNumber", "1.3.6.1.2.1.67.2.2.1.1.4.1.4", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtRoundTripTimeEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtRoundTripTimeEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtRoundTripTime", "1.3.6.1.2.1.67.2.2.1.1.4.1.5", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtRequestsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtRequestsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtRequests", "1.3.6.1.2.1.67.2.2.1.1.4.1.6", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtRetransmissionsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtRetransmissionsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtRetransmissions", "1.3.6.1.2.1.67.2.2.1.1.4.1.7", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtResponsesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtResponsesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtResponses", "1.3.6.1.2.1.67.2.2.1.1.4.1.8", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtMalformedResponsesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtMalformedResponsesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtMalformedResponses", "1.3.6.1.2.1.67.2.2.1.1.4.1.9", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtBadAuthenticatorsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtBadAuthenticatorsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtBadAuthenticators", "1.3.6.1.2.1.67.2.2.1.1.4.1.10", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtPendingRequestsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtPendingRequestsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtPendingRequests", "1.3.6.1.2.1.67.2.2.1.1.4.1.11", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtTimeoutsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtTimeoutsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtTimeouts", "1.3.6.1.2.1.67.2.2.1.1.4.1.12", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtUnknownTypesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtUnknownTypesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtUnknownTypes", "1.3.6.1.2.1.67.2.2.1.1.4.1.13", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientExtPacketsDroppedEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientExtPacketsDroppedEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientExtPacketsDropped", "1.3.6.1.2.1.67.2.2.1.1.4.1.14", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                                public static final class RadiusAccClientCounterDiscontinuityEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                                {
                                    private RadiusAccClientCounterDiscontinuityEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                                    {
                                        super(mib, parent, "radiusAccClientCounterDiscontinuity", "1.3.6.1.2.1.67.2.2.1.1.4.1.15", false, false, true, false);
                                        this.entries = new MIBEntry<?>[] {

                                        };
                                    }
                                }

                            }

                        }

                    }

                }

                public static final class RadiusAccClientMIBConformanceEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                {
                    public final RadiusAccClientMIBCompliancesEnt radiusAccClientMIBCompliances;

                    public final RadiusAccClientMIBGroupsEnt radiusAccClientMIBGroups;

                    private RadiusAccClientMIBConformanceEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccClientMIBConformance", "1.3.6.1.2.1.67.2.2.2", false, false, false, false);
                        this.radiusAccClientMIBCompliances = new RadiusAccClientMIBCompliancesEnt(mib, this);
                        this.radiusAccClientMIBGroups = new RadiusAccClientMIBGroupsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAccClientMIBCompliances,
                            this.radiusAccClientMIBGroups
                        };
                    }
                    public static final class RadiusAccClientMIBCompliancesEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                    {
                        /** units of conformance*/
                        public final RadiusAccClientMIBComplianceEnt radiusAccClientMIBCompliance;

                        public final RadiusAccClientExtMIBComplianceEnt radiusAccClientExtMIBCompliance;

                        private RadiusAccClientMIBCompliancesEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAccClientMIBCompliances", "1.3.6.1.2.1.67.2.2.2.1", false, false, false, false);
                            this.radiusAccClientMIBCompliance = new RadiusAccClientMIBComplianceEnt(mib, this);
                            this.radiusAccClientExtMIBCompliance = new RadiusAccClientExtMIBComplianceEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAccClientMIBCompliance,
                                this.radiusAccClientExtMIBCompliance
                            };
                        }
                        public static final class RadiusAccClientMIBComplianceEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            private RadiusAccClientMIBComplianceEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientMIBCompliance", "1.3.6.1.2.1.67.2.2.2.1.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientExtMIBComplianceEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            private RadiusAccClientExtMIBComplianceEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientExtMIBCompliance", "1.3.6.1.2.1.67.2.2.2.1.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class RadiusAccClientMIBGroupsEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                    {
                        /** units of conformance*/
                        public final RadiusAccClientMIBGroupEnt radiusAccClientMIBGroup;

                        public final RadiusAccClientExtMIBGroupEnt radiusAccClientExtMIBGroup;

                        private RadiusAccClientMIBGroupsEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAccClientMIBGroups", "1.3.6.1.2.1.67.2.2.2.2", false, false, false, false);
                            this.radiusAccClientMIBGroup = new RadiusAccClientMIBGroupEnt(mib, this);
                            this.radiusAccClientExtMIBGroup = new RadiusAccClientExtMIBGroupEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAccClientMIBGroup,
                                this.radiusAccClientExtMIBGroup
                            };
                        }
                        public static final class RadiusAccClientMIBGroupEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            private RadiusAccClientMIBGroupEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientMIBGroup", "1.3.6.1.2.1.67.2.2.2.2.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientExtMIBGroupEnt extends MIBEntry<RADIUSACCCLIENTMIBDef>
                        {
                            private RadiusAccClientExtMIBGroupEnt(RADIUSACCCLIENTMIBDef mib, MIBEntry<RADIUSACCCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientExtMIBGroup", "1.3.6.1.2.1.67.2.2.2.2.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

    }

}
