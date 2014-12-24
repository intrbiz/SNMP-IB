package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class RADIUSAUTHCLIENTMIBDef extends MIB
{
    public static final RADIUSAUTHCLIENTMIBDef RADIUSAUTHCLIENTMIB = new RADIUSAUTHCLIENTMIBDef();

    public final RadiusAuthenticationEnt radiusAuthentication;

    public final RadiusMIBEnt radiusMIB;

    private RADIUSAUTHCLIENTMIBDef()
    {
        super("RADIUS-AUTH-CLIENT-MIB");
        this.radiusAuthentication = new RadiusAuthenticationEnt(this, null);
        this.radiusMIB = new RadiusMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.radiusAuthentication,
            this.radiusMIB
        };
    }

    public static final class RadiusAuthenticationEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
    {
        /** 21 August 2006*/
        public final RadiusAuthClientMIBEnt radiusAuthClientMIB;

        private RadiusAuthenticationEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
        {
            super(mib, parent, "radiusAuthentication", "1.3.6.1.2.1.67.1", false, false, false, false);
            this.radiusAuthClientMIB = new RadiusAuthClientMIBEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusAuthClientMIB
            };
        }
        public static final class RadiusAuthClientMIBEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
        {
            public final RadiusAuthClientMIBObjectsEnt radiusAuthClientMIBObjects;

            /** conformance information*/
            public final RadiusAuthClientMIBConformanceEnt radiusAuthClientMIBConformance;

            private RadiusAuthClientMIBEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
            {
                super(mib, parent, "radiusAuthClientMIB", "1.3.6.1.2.1.67.1.2", false, false, false, false);
                this.radiusAuthClientMIBObjects = new RadiusAuthClientMIBObjectsEnt(mib, this);
                this.radiusAuthClientMIBConformance = new RadiusAuthClientMIBConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusAuthClientMIBObjects,
                    this.radiusAuthClientMIBConformance
                };
            }
            public static final class RadiusAuthClientMIBObjectsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
            {
                public final RadiusAuthClientEnt radiusAuthClient;

                private RadiusAuthClientMIBObjectsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusAuthClientMIBObjects", "1.3.6.1.2.1.67.1.2.1", false, false, false, false);
                    this.radiusAuthClient = new RadiusAuthClientEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAuthClient
                    };
                }
                public static final class RadiusAuthClientEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                {
                    public final RadiusAuthClientInvalidServerAddressesEnt radiusAuthClientInvalidServerAddresses;

                    public final RadiusAuthClientIdentifierEnt radiusAuthClientIdentifier;

                    public final RadiusAuthServerTableEnt radiusAuthServerTable;

                    /** New MIB Objects in this revision*/
                    public final RadiusAuthServerExtTableEnt radiusAuthServerExtTable;

                    private RadiusAuthClientEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthClient", "1.3.6.1.2.1.67.1.2.1.1", false, false, false, false);
                        this.radiusAuthClientInvalidServerAddresses = new RadiusAuthClientInvalidServerAddressesEnt(mib, this);
                        this.radiusAuthClientIdentifier = new RadiusAuthClientIdentifierEnt(mib, this);
                        this.radiusAuthServerTable = new RadiusAuthServerTableEnt(mib, this);
                        this.radiusAuthServerExtTable = new RadiusAuthServerExtTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAuthClientInvalidServerAddresses,
                            this.radiusAuthClientIdentifier,
                            this.radiusAuthServerTable,
                            this.radiusAuthServerExtTable
                        };
                    }
                    public static final class RadiusAuthClientInvalidServerAddressesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        private RadiusAuthClientInvalidServerAddressesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientInvalidServerAddresses", "1.3.6.1.2.1.67.1.2.1.1.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusAuthClientIdentifierEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        private RadiusAuthClientIdentifierEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientIdentifier", "1.3.6.1.2.1.67.1.2.1.1.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusAuthServerTableEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        public final RadiusAuthServerEntryEnt radiusAuthServerEntry;

                        private RadiusAuthServerTableEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthServerTable", "1.3.6.1.2.1.67.1.2.1.1.3", false, true, false, false);
                            this.radiusAuthServerEntry = new RadiusAuthServerEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAuthServerEntry
                            };
                        }
                        public static final class RadiusAuthServerEntryEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                        {
                            public final RadiusAuthServerIndexEnt radiusAuthServerIndex;

                            public final RadiusAuthServerAddressEnt radiusAuthServerAddress;

                            public final RadiusAuthClientServerPortNumberEnt radiusAuthClientServerPortNumber;

                            public final RadiusAuthClientRoundTripTimeEnt radiusAuthClientRoundTripTime;

                            /** Request/Response statisticsTotalIncomingPackets = Accepts + Rejects + Challenges +UnknownTypesTotalIncomingPackets - MalformedResponses -BadAuthenticators - UnknownTypes - PacketsDropped =Successfully receivedAccessRequests + PendingRequests + ClientTimeouts =


Successfully received*/
                            public final RadiusAuthClientAccessRequestsEnt radiusAuthClientAccessRequests;

                            public final RadiusAuthClientAccessRetransmissionsEnt radiusAuthClientAccessRetransmissions;

                            public final RadiusAuthClientAccessAcceptsEnt radiusAuthClientAccessAccepts;

                            public final RadiusAuthClientAccessRejectsEnt radiusAuthClientAccessRejects;

                            public final RadiusAuthClientAccessChallengesEnt radiusAuthClientAccessChallenges;

                            /** "Access-Response" includes an Access-Accept, Access-Challengeor Access-Reject*/
                            public final RadiusAuthClientMalformedAccessResponsesEnt radiusAuthClientMalformedAccessResponses;

                            public final RadiusAuthClientBadAuthenticatorsEnt radiusAuthClientBadAuthenticators;

                            public final RadiusAuthClientPendingRequestsEnt radiusAuthClientPendingRequests;

                            public final RadiusAuthClientTimeoutsEnt radiusAuthClientTimeouts;

                            public final RadiusAuthClientUnknownTypesEnt radiusAuthClientUnknownTypes;

                            public final RadiusAuthClientPacketsDroppedEnt radiusAuthClientPacketsDropped;

                            private RadiusAuthServerEntryEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServerEntry", "1.3.6.1.2.1.67.1.2.1.1.3.1", false, false, false, true);
                                this.radiusAuthServerIndex = new RadiusAuthServerIndexEnt(mib, this);
                                this.radiusAuthServerAddress = new RadiusAuthServerAddressEnt(mib, this);
                                this.radiusAuthClientServerPortNumber = new RadiusAuthClientServerPortNumberEnt(mib, this);
                                this.radiusAuthClientRoundTripTime = new RadiusAuthClientRoundTripTimeEnt(mib, this);
                                this.radiusAuthClientAccessRequests = new RadiusAuthClientAccessRequestsEnt(mib, this);
                                this.radiusAuthClientAccessRetransmissions = new RadiusAuthClientAccessRetransmissionsEnt(mib, this);
                                this.radiusAuthClientAccessAccepts = new RadiusAuthClientAccessAcceptsEnt(mib, this);
                                this.radiusAuthClientAccessRejects = new RadiusAuthClientAccessRejectsEnt(mib, this);
                                this.radiusAuthClientAccessChallenges = new RadiusAuthClientAccessChallengesEnt(mib, this);
                                this.radiusAuthClientMalformedAccessResponses = new RadiusAuthClientMalformedAccessResponsesEnt(mib, this);
                                this.radiusAuthClientBadAuthenticators = new RadiusAuthClientBadAuthenticatorsEnt(mib, this);
                                this.radiusAuthClientPendingRequests = new RadiusAuthClientPendingRequestsEnt(mib, this);
                                this.radiusAuthClientTimeouts = new RadiusAuthClientTimeoutsEnt(mib, this);
                                this.radiusAuthClientUnknownTypes = new RadiusAuthClientUnknownTypesEnt(mib, this);
                                this.radiusAuthClientPacketsDropped = new RadiusAuthClientPacketsDroppedEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.radiusAuthServerIndex,
                                    this.radiusAuthServerAddress,
                                    this.radiusAuthClientServerPortNumber,
                                    this.radiusAuthClientRoundTripTime,
                                    this.radiusAuthClientAccessRequests,
                                    this.radiusAuthClientAccessRetransmissions,
                                    this.radiusAuthClientAccessAccepts,
                                    this.radiusAuthClientAccessRejects,
                                    this.radiusAuthClientAccessChallenges,
                                    this.radiusAuthClientMalformedAccessResponses,
                                    this.radiusAuthClientBadAuthenticators,
                                    this.radiusAuthClientPendingRequests,
                                    this.radiusAuthClientTimeouts,
                                    this.radiusAuthClientUnknownTypes,
                                    this.radiusAuthClientPacketsDropped
                                };
                            }
                            public static final class RadiusAuthServerIndexEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthServerIndexEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthServerIndex", "1.3.6.1.2.1.67.1.2.1.1.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthServerAddressEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthServerAddressEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthServerAddress", "1.3.6.1.2.1.67.1.2.1.1.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientServerPortNumberEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientServerPortNumberEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientServerPortNumber", "1.3.6.1.2.1.67.1.2.1.1.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientRoundTripTimeEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientRoundTripTimeEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientRoundTripTime", "1.3.6.1.2.1.67.1.2.1.1.3.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientAccessRequestsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientAccessRequestsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientAccessRequests", "1.3.6.1.2.1.67.1.2.1.1.3.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientAccessRetransmissionsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientAccessRetransmissionsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientAccessRetransmissions", "1.3.6.1.2.1.67.1.2.1.1.3.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientAccessAcceptsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientAccessAcceptsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientAccessAccepts", "1.3.6.1.2.1.67.1.2.1.1.3.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientAccessRejectsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientAccessRejectsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientAccessRejects", "1.3.6.1.2.1.67.1.2.1.1.3.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientAccessChallengesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientAccessChallengesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientAccessChallenges", "1.3.6.1.2.1.67.1.2.1.1.3.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientMalformedAccessResponsesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientMalformedAccessResponsesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientMalformedAccessResponses", "1.3.6.1.2.1.67.1.2.1.1.3.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientBadAuthenticatorsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientBadAuthenticatorsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientBadAuthenticators", "1.3.6.1.2.1.67.1.2.1.1.3.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientPendingRequestsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientPendingRequestsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientPendingRequests", "1.3.6.1.2.1.67.1.2.1.1.3.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientTimeoutsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientTimeoutsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientTimeouts", "1.3.6.1.2.1.67.1.2.1.1.3.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientUnknownTypesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientUnknownTypesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientUnknownTypes", "1.3.6.1.2.1.67.1.2.1.1.3.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientPacketsDroppedEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientPacketsDroppedEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientPacketsDropped", "1.3.6.1.2.1.67.1.2.1.1.3.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class RadiusAuthServerExtTableEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        public final RadiusAuthServerExtEntryEnt radiusAuthServerExtEntry;

                        private RadiusAuthServerExtTableEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthServerExtTable", "1.3.6.1.2.1.67.1.2.1.1.4", false, true, false, false);
                            this.radiusAuthServerExtEntry = new RadiusAuthServerExtEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAuthServerExtEntry
                            };
                        }
                        public static final class RadiusAuthServerExtEntryEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                        {
                            public final RadiusAuthServerExtIndexEnt radiusAuthServerExtIndex;

                            public final RadiusAuthServerInetAddressTypeEnt radiusAuthServerInetAddressType;

                            public final RadiusAuthServerInetAddressEnt radiusAuthServerInetAddress;

                            public final RadiusAuthClientServerInetPortNumberEnt radiusAuthClientServerInetPortNumber;

                            public final RadiusAuthClientExtRoundTripTimeEnt radiusAuthClientExtRoundTripTime;

                            /** Request/Response statisticsTotalIncomingPackets = Accepts + Rejects + Challenges +UnknownTypesTotalIncomingPackets - MalformedResponses -BadAuthenticators - UnknownTypes - PacketsDropped =


Successfully receivedAccessRequests + PendingRequests + ClientTimeouts =Successfully received*/
                            public final RadiusAuthClientExtAccessRequestsEnt radiusAuthClientExtAccessRequests;

                            public final RadiusAuthClientExtAccessRetransmissionsEnt radiusAuthClientExtAccessRetransmissions;

                            public final RadiusAuthClientExtAccessAcceptsEnt radiusAuthClientExtAccessAccepts;

                            public final RadiusAuthClientExtAccessRejectsEnt radiusAuthClientExtAccessRejects;

                            public final RadiusAuthClientExtAccessChallengesEnt radiusAuthClientExtAccessChallenges;

                            /** "Access-Response" includes an Access-Accept, Access-Challenge,or Access-Reject*/
                            public final RadiusAuthClientExtMalformedAccessResponsesEnt radiusAuthClientExtMalformedAccessResponses;

                            public final RadiusAuthClientExtBadAuthenticatorsEnt radiusAuthClientExtBadAuthenticators;

                            public final RadiusAuthClientExtPendingRequestsEnt radiusAuthClientExtPendingRequests;

                            public final RadiusAuthClientExtTimeoutsEnt radiusAuthClientExtTimeouts;

                            public final RadiusAuthClientExtUnknownTypesEnt radiusAuthClientExtUnknownTypes;

                            public final RadiusAuthClientExtPacketsDroppedEnt radiusAuthClientExtPacketsDropped;

                            public final RadiusAuthClientCounterDiscontinuityEnt radiusAuthClientCounterDiscontinuity;

                            private RadiusAuthServerExtEntryEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServerExtEntry", "1.3.6.1.2.1.67.1.2.1.1.4.1", false, false, false, true);
                                this.radiusAuthServerExtIndex = new RadiusAuthServerExtIndexEnt(mib, this);
                                this.radiusAuthServerInetAddressType = new RadiusAuthServerInetAddressTypeEnt(mib, this);
                                this.radiusAuthServerInetAddress = new RadiusAuthServerInetAddressEnt(mib, this);
                                this.radiusAuthClientServerInetPortNumber = new RadiusAuthClientServerInetPortNumberEnt(mib, this);
                                this.radiusAuthClientExtRoundTripTime = new RadiusAuthClientExtRoundTripTimeEnt(mib, this);
                                this.radiusAuthClientExtAccessRequests = new RadiusAuthClientExtAccessRequestsEnt(mib, this);
                                this.radiusAuthClientExtAccessRetransmissions = new RadiusAuthClientExtAccessRetransmissionsEnt(mib, this);
                                this.radiusAuthClientExtAccessAccepts = new RadiusAuthClientExtAccessAcceptsEnt(mib, this);
                                this.radiusAuthClientExtAccessRejects = new RadiusAuthClientExtAccessRejectsEnt(mib, this);
                                this.radiusAuthClientExtAccessChallenges = new RadiusAuthClientExtAccessChallengesEnt(mib, this);
                                this.radiusAuthClientExtMalformedAccessResponses = new RadiusAuthClientExtMalformedAccessResponsesEnt(mib, this);
                                this.radiusAuthClientExtBadAuthenticators = new RadiusAuthClientExtBadAuthenticatorsEnt(mib, this);
                                this.radiusAuthClientExtPendingRequests = new RadiusAuthClientExtPendingRequestsEnt(mib, this);
                                this.radiusAuthClientExtTimeouts = new RadiusAuthClientExtTimeoutsEnt(mib, this);
                                this.radiusAuthClientExtUnknownTypes = new RadiusAuthClientExtUnknownTypesEnt(mib, this);
                                this.radiusAuthClientExtPacketsDropped = new RadiusAuthClientExtPacketsDroppedEnt(mib, this);
                                this.radiusAuthClientCounterDiscontinuity = new RadiusAuthClientCounterDiscontinuityEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.radiusAuthServerExtIndex,
                                    this.radiusAuthServerInetAddressType,
                                    this.radiusAuthServerInetAddress,
                                    this.radiusAuthClientServerInetPortNumber,
                                    this.radiusAuthClientExtRoundTripTime,
                                    this.radiusAuthClientExtAccessRequests,
                                    this.radiusAuthClientExtAccessRetransmissions,
                                    this.radiusAuthClientExtAccessAccepts,
                                    this.radiusAuthClientExtAccessRejects,
                                    this.radiusAuthClientExtAccessChallenges,
                                    this.radiusAuthClientExtMalformedAccessResponses,
                                    this.radiusAuthClientExtBadAuthenticators,
                                    this.radiusAuthClientExtPendingRequests,
                                    this.radiusAuthClientExtTimeouts,
                                    this.radiusAuthClientExtUnknownTypes,
                                    this.radiusAuthClientExtPacketsDropped,
                                    this.radiusAuthClientCounterDiscontinuity
                                };
                            }
                            public static final class RadiusAuthServerExtIndexEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthServerExtIndexEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthServerExtIndex", "1.3.6.1.2.1.67.1.2.1.1.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthServerInetAddressTypeEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthServerInetAddressTypeEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthServerInetAddressType", "1.3.6.1.2.1.67.1.2.1.1.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthServerInetAddressEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthServerInetAddressEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthServerInetAddress", "1.3.6.1.2.1.67.1.2.1.1.4.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientServerInetPortNumberEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientServerInetPortNumberEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientServerInetPortNumber", "1.3.6.1.2.1.67.1.2.1.1.4.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtRoundTripTimeEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtRoundTripTimeEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtRoundTripTime", "1.3.6.1.2.1.67.1.2.1.1.4.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtAccessRequestsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtAccessRequestsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtAccessRequests", "1.3.6.1.2.1.67.1.2.1.1.4.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtAccessRetransmissionsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtAccessRetransmissionsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtAccessRetransmissions", "1.3.6.1.2.1.67.1.2.1.1.4.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtAccessAcceptsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtAccessAcceptsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtAccessAccepts", "1.3.6.1.2.1.67.1.2.1.1.4.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtAccessRejectsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtAccessRejectsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtAccessRejects", "1.3.6.1.2.1.67.1.2.1.1.4.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtAccessChallengesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtAccessChallengesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtAccessChallenges", "1.3.6.1.2.1.67.1.2.1.1.4.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtMalformedAccessResponsesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtMalformedAccessResponsesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtMalformedAccessResponses", "1.3.6.1.2.1.67.1.2.1.1.4.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtBadAuthenticatorsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtBadAuthenticatorsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtBadAuthenticators", "1.3.6.1.2.1.67.1.2.1.1.4.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtPendingRequestsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtPendingRequestsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtPendingRequests", "1.3.6.1.2.1.67.1.2.1.1.4.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtTimeoutsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtTimeoutsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtTimeouts", "1.3.6.1.2.1.67.1.2.1.1.4.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtUnknownTypesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtUnknownTypesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtUnknownTypes", "1.3.6.1.2.1.67.1.2.1.1.4.1.15", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientExtPacketsDroppedEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientExtPacketsDroppedEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientExtPacketsDropped", "1.3.6.1.2.1.67.1.2.1.1.4.1.16", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class RadiusAuthClientCounterDiscontinuityEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                            {
                                private RadiusAuthClientCounterDiscontinuityEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                                {
                                    super(mib, parent, "radiusAuthClientCounterDiscontinuity", "1.3.6.1.2.1.67.1.2.1.1.4.1.17", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

            public static final class RadiusAuthClientMIBConformanceEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
            {
                public final RadiusAuthClientMIBCompliancesEnt radiusAuthClientMIBCompliances;

                public final RadiusAuthClientMIBGroupsEnt radiusAuthClientMIBGroups;

                private RadiusAuthClientMIBConformanceEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusAuthClientMIBConformance", "1.3.6.1.2.1.67.1.2.2", false, false, false, false);
                    this.radiusAuthClientMIBCompliances = new RadiusAuthClientMIBCompliancesEnt(mib, this);
                    this.radiusAuthClientMIBGroups = new RadiusAuthClientMIBGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAuthClientMIBCompliances,
                        this.radiusAuthClientMIBGroups
                    };
                }
                public static final class RadiusAuthClientMIBCompliancesEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                {
                    /** compliance statements*/
                    public final RadiusAuthClientMIBComplianceEnt radiusAuthClientMIBCompliance;

                    public final RadiusAuthClientExtMIBComplianceEnt radiusAuthClientExtMIBCompliance;

                    private RadiusAuthClientMIBCompliancesEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthClientMIBCompliances", "1.3.6.1.2.1.67.1.2.2.1", false, false, false, false);
                        this.radiusAuthClientMIBCompliance = new RadiusAuthClientMIBComplianceEnt(mib, this);
                        this.radiusAuthClientExtMIBCompliance = new RadiusAuthClientExtMIBComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAuthClientMIBCompliance,
                            this.radiusAuthClientExtMIBCompliance
                        };
                    }
                    public static final class RadiusAuthClientMIBComplianceEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        private RadiusAuthClientMIBComplianceEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientMIBCompliance", "1.3.6.1.2.1.67.1.2.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusAuthClientExtMIBComplianceEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        private RadiusAuthClientExtMIBComplianceEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientExtMIBCompliance", "1.3.6.1.2.1.67.1.2.2.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class RadiusAuthClientMIBGroupsEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                {
                    /** units of conformance*/
                    public final RadiusAuthClientMIBGroupEnt radiusAuthClientMIBGroup;

                    public final RadiusAuthClientExtMIBGroupEnt radiusAuthClientExtMIBGroup;

                    private RadiusAuthClientMIBGroupsEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthClientMIBGroups", "1.3.6.1.2.1.67.1.2.2.2", false, false, false, false);
                        this.radiusAuthClientMIBGroup = new RadiusAuthClientMIBGroupEnt(mib, this);
                        this.radiusAuthClientExtMIBGroup = new RadiusAuthClientExtMIBGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAuthClientMIBGroup,
                            this.radiusAuthClientExtMIBGroup
                        };
                    }
                    public static final class RadiusAuthClientMIBGroupEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        private RadiusAuthClientMIBGroupEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientMIBGroup", "1.3.6.1.2.1.67.1.2.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusAuthClientExtMIBGroupEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
                    {
                        private RadiusAuthClientExtMIBGroupEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientExtMIBGroup", "1.3.6.1.2.1.67.1.2.2.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

    public static final class RadiusMIBEnt extends MIBEntry<RADIUSAUTHCLIENTMIBDef>
    {
        private RadiusMIBEnt(RADIUSAUTHCLIENTMIBDef mib, MIBEntry<RADIUSAUTHCLIENTMIBDef> parent)
        {
            super(mib, parent, "radiusMIB", "1.3.6.1.2.1.67", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
