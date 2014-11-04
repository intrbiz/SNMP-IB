package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC3411]
[RFC4001]*/
public final class RADIUSDYNAUTHCLIENTMIBDef extends MIB
{
    public static final RADIUSDYNAUTHCLIENTMIBDef RADIUSDYNAUTHCLIENTMIB = new RADIUSDYNAUTHCLIENTMIBDef();

    static { MIBs.getInstance().registerMIB(RADIUSDYNAUTHCLIENTMIBDef.RADIUSDYNAUTHCLIENTMIB); }

    /** [RFC2580]

29 August 2006*/
    public final RadiusDynAuthClientMIBEnt radiusDynAuthClientMIB;

    private RADIUSDYNAUTHCLIENTMIBDef()
    {
        super("RADIUS-DYNAUTH-CLIENT-MIB");
        this.radiusDynAuthClientMIB = new RadiusDynAuthClientMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.radiusDynAuthClientMIB
        };
    }

    public static final class RadiusDynAuthClientMIBEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
    {
        public final RadiusDynAuthClientMIBObjectsEnt radiusDynAuthClientMIBObjects;

        /** conformance information*/
        public final RadiusDynAuthClientMIBConformanceEnt radiusDynAuthClientMIBConformance;

        private RadiusDynAuthClientMIBEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
        {
            super(mib, parent, "radiusDynAuthClientMIB", "1.3.6.1.2.1.145", false, false, false, false);
            this.radiusDynAuthClientMIBObjects = new RadiusDynAuthClientMIBObjectsEnt(mib, this);
            this.radiusDynAuthClientMIBConformance = new RadiusDynAuthClientMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusDynAuthClientMIBObjects,
                this.radiusDynAuthClientMIBConformance
            };
        }
        public static final class RadiusDynAuthClientMIBObjectsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
        {
            public final RadiusDynAuthClientScalarsEnt radiusDynAuthClientScalars;

            public final RadiusDynAuthServerTableEnt radiusDynAuthServerTable;

            private RadiusDynAuthClientMIBObjectsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
            {
                super(mib, parent, "radiusDynAuthClientMIBObjects", "1.3.6.1.2.1.145.1", false, false, false, false);
                this.radiusDynAuthClientScalars = new RadiusDynAuthClientScalarsEnt(mib, this);
                this.radiusDynAuthServerTable = new RadiusDynAuthServerTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusDynAuthClientScalars,
                    this.radiusDynAuthServerTable
                };
            }
            public static final class RadiusDynAuthClientScalarsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
            {
                public final RadiusDynAuthClientDisconInvalidServerAddressesEnt radiusDynAuthClientDisconInvalidServerAddresses;

                public final RadiusDynAuthClientCoAInvalidServerAddressesEnt radiusDynAuthClientCoAInvalidServerAddresses;

                private RadiusDynAuthClientScalarsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthClientScalars", "1.3.6.1.2.1.145.1.1", false, false, false, false);
                    this.radiusDynAuthClientDisconInvalidServerAddresses = new RadiusDynAuthClientDisconInvalidServerAddressesEnt(mib, this);
                    this.radiusDynAuthClientCoAInvalidServerAddresses = new RadiusDynAuthClientCoAInvalidServerAddressesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthClientDisconInvalidServerAddresses,
                        this.radiusDynAuthClientCoAInvalidServerAddresses
                    };
                }
                public static final class RadiusDynAuthClientDisconInvalidServerAddressesEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    private RadiusDynAuthClientDisconInvalidServerAddressesEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientDisconInvalidServerAddresses", "1.3.6.1.2.1.145.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthClientCoAInvalidServerAddressesEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    private RadiusDynAuthClientCoAInvalidServerAddressesEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientCoAInvalidServerAddresses", "1.3.6.1.2.1.145.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RadiusDynAuthServerTableEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
            {
                public final RadiusDynAuthServerEntryEnt radiusDynAuthServerEntry;

                private RadiusDynAuthServerTableEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthServerTable", "1.3.6.1.2.1.145.1.2", false, true, false, false);
                    this.radiusDynAuthServerEntry = new RadiusDynAuthServerEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthServerEntry
                    };
                }
                public static final class RadiusDynAuthServerEntryEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    public final RadiusDynAuthServerIndexEnt radiusDynAuthServerIndex;

                    public final RadiusDynAuthServerAddressTypeEnt radiusDynAuthServerAddressType;

                    public final RadiusDynAuthServerAddressEnt radiusDynAuthServerAddress;

                    public final RadiusDynAuthServerClientPortNumberEnt radiusDynAuthServerClientPortNumber;

                    public final RadiusDynAuthServerIDEnt radiusDynAuthServerID;

                    public final RadiusDynAuthClientRoundTripTimeEnt radiusDynAuthClientRoundTripTime;

                    public final RadiusDynAuthClientDisconRequestsEnt radiusDynAuthClientDisconRequests;

                    public final RadiusDynAuthClientDisconAuthOnlyRequestsEnt radiusDynAuthClientDisconAuthOnlyRequests;

                    public final RadiusDynAuthClientDisconRetransmissionsEnt radiusDynAuthClientDisconRetransmissions;

                    public final RadiusDynAuthClientDisconAcksEnt radiusDynAuthClientDisconAcks;

                    public final RadiusDynAuthClientDisconNaksEnt radiusDynAuthClientDisconNaks;

                    public final RadiusDynAuthClientDisconNakAuthOnlyRequestEnt radiusDynAuthClientDisconNakAuthOnlyRequest;

                    public final RadiusDynAuthClientDisconNakSessNoContextEnt radiusDynAuthClientDisconNakSessNoContext;

                    public final RadiusDynAuthClientMalformedDisconResponsesEnt radiusDynAuthClientMalformedDisconResponses;

                    public final RadiusDynAuthClientDisconBadAuthenticatorsEnt radiusDynAuthClientDisconBadAuthenticators;

                    public final RadiusDynAuthClientDisconPendingRequestsEnt radiusDynAuthClientDisconPendingRequests;

                    public final RadiusDynAuthClientDisconTimeoutsEnt radiusDynAuthClientDisconTimeouts;

                    public final RadiusDynAuthClientDisconPacketsDroppedEnt radiusDynAuthClientDisconPacketsDropped;

                    public final RadiusDynAuthClientCoARequestsEnt radiusDynAuthClientCoARequests;

                    public final RadiusDynAuthClientCoAAuthOnlyRequestEnt radiusDynAuthClientCoAAuthOnlyRequest;

                    public final RadiusDynAuthClientCoARetransmissionsEnt radiusDynAuthClientCoARetransmissions;

                    public final RadiusDynAuthClientCoAAcksEnt radiusDynAuthClientCoAAcks;

                    public final RadiusDynAuthClientCoANaksEnt radiusDynAuthClientCoANaks;

                    public final RadiusDynAuthClientCoANakAuthOnlyRequestEnt radiusDynAuthClientCoANakAuthOnlyRequest;

                    public final RadiusDynAuthClientCoANakSessNoContextEnt radiusDynAuthClientCoANakSessNoContext;

                    public final RadiusDynAuthClientMalformedCoAResponsesEnt radiusDynAuthClientMalformedCoAResponses;

                    public final RadiusDynAuthClientCoABadAuthenticatorsEnt radiusDynAuthClientCoABadAuthenticators;

                    public final RadiusDynAuthClientCoAPendingRequestsEnt radiusDynAuthClientCoAPendingRequests;

                    public final RadiusDynAuthClientCoATimeoutsEnt radiusDynAuthClientCoATimeouts;

                    public final RadiusDynAuthClientCoAPacketsDroppedEnt radiusDynAuthClientCoAPacketsDropped;

                    public final RadiusDynAuthClientUnknownTypesEnt radiusDynAuthClientUnknownTypes;

                    public final RadiusDynAuthClientCounterDiscontinuityEnt radiusDynAuthClientCounterDiscontinuity;

                    private RadiusDynAuthServerEntryEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerEntry", "1.3.6.1.2.1.145.1.2.1", false, false, false, true);
                        this.radiusDynAuthServerIndex = new RadiusDynAuthServerIndexEnt(mib, this);
                        this.radiusDynAuthServerAddressType = new RadiusDynAuthServerAddressTypeEnt(mib, this);
                        this.radiusDynAuthServerAddress = new RadiusDynAuthServerAddressEnt(mib, this);
                        this.radiusDynAuthServerClientPortNumber = new RadiusDynAuthServerClientPortNumberEnt(mib, this);
                        this.radiusDynAuthServerID = new RadiusDynAuthServerIDEnt(mib, this);
                        this.radiusDynAuthClientRoundTripTime = new RadiusDynAuthClientRoundTripTimeEnt(mib, this);
                        this.radiusDynAuthClientDisconRequests = new RadiusDynAuthClientDisconRequestsEnt(mib, this);
                        this.radiusDynAuthClientDisconAuthOnlyRequests = new RadiusDynAuthClientDisconAuthOnlyRequestsEnt(mib, this);
                        this.radiusDynAuthClientDisconRetransmissions = new RadiusDynAuthClientDisconRetransmissionsEnt(mib, this);
                        this.radiusDynAuthClientDisconAcks = new RadiusDynAuthClientDisconAcksEnt(mib, this);
                        this.radiusDynAuthClientDisconNaks = new RadiusDynAuthClientDisconNaksEnt(mib, this);
                        this.radiusDynAuthClientDisconNakAuthOnlyRequest = new RadiusDynAuthClientDisconNakAuthOnlyRequestEnt(mib, this);
                        this.radiusDynAuthClientDisconNakSessNoContext = new RadiusDynAuthClientDisconNakSessNoContextEnt(mib, this);
                        this.radiusDynAuthClientMalformedDisconResponses = new RadiusDynAuthClientMalformedDisconResponsesEnt(mib, this);
                        this.radiusDynAuthClientDisconBadAuthenticators = new RadiusDynAuthClientDisconBadAuthenticatorsEnt(mib, this);
                        this.radiusDynAuthClientDisconPendingRequests = new RadiusDynAuthClientDisconPendingRequestsEnt(mib, this);
                        this.radiusDynAuthClientDisconTimeouts = new RadiusDynAuthClientDisconTimeoutsEnt(mib, this);
                        this.radiusDynAuthClientDisconPacketsDropped = new RadiusDynAuthClientDisconPacketsDroppedEnt(mib, this);
                        this.radiusDynAuthClientCoARequests = new RadiusDynAuthClientCoARequestsEnt(mib, this);
                        this.radiusDynAuthClientCoAAuthOnlyRequest = new RadiusDynAuthClientCoAAuthOnlyRequestEnt(mib, this);
                        this.radiusDynAuthClientCoARetransmissions = new RadiusDynAuthClientCoARetransmissionsEnt(mib, this);
                        this.radiusDynAuthClientCoAAcks = new RadiusDynAuthClientCoAAcksEnt(mib, this);
                        this.radiusDynAuthClientCoANaks = new RadiusDynAuthClientCoANaksEnt(mib, this);
                        this.radiusDynAuthClientCoANakAuthOnlyRequest = new RadiusDynAuthClientCoANakAuthOnlyRequestEnt(mib, this);
                        this.radiusDynAuthClientCoANakSessNoContext = new RadiusDynAuthClientCoANakSessNoContextEnt(mib, this);
                        this.radiusDynAuthClientMalformedCoAResponses = new RadiusDynAuthClientMalformedCoAResponsesEnt(mib, this);
                        this.radiusDynAuthClientCoABadAuthenticators = new RadiusDynAuthClientCoABadAuthenticatorsEnt(mib, this);
                        this.radiusDynAuthClientCoAPendingRequests = new RadiusDynAuthClientCoAPendingRequestsEnt(mib, this);
                        this.radiusDynAuthClientCoATimeouts = new RadiusDynAuthClientCoATimeoutsEnt(mib, this);
                        this.radiusDynAuthClientCoAPacketsDropped = new RadiusDynAuthClientCoAPacketsDroppedEnt(mib, this);
                        this.radiusDynAuthClientUnknownTypes = new RadiusDynAuthClientUnknownTypesEnt(mib, this);
                        this.radiusDynAuthClientCounterDiscontinuity = new RadiusDynAuthClientCounterDiscontinuityEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusDynAuthServerIndex,
                            this.radiusDynAuthServerAddressType,
                            this.radiusDynAuthServerAddress,
                            this.radiusDynAuthServerClientPortNumber,
                            this.radiusDynAuthServerID,
                            this.radiusDynAuthClientRoundTripTime,
                            this.radiusDynAuthClientDisconRequests,
                            this.radiusDynAuthClientDisconAuthOnlyRequests,
                            this.radiusDynAuthClientDisconRetransmissions,
                            this.radiusDynAuthClientDisconAcks,
                            this.radiusDynAuthClientDisconNaks,
                            this.radiusDynAuthClientDisconNakAuthOnlyRequest,
                            this.radiusDynAuthClientDisconNakSessNoContext,
                            this.radiusDynAuthClientMalformedDisconResponses,
                            this.radiusDynAuthClientDisconBadAuthenticators,
                            this.radiusDynAuthClientDisconPendingRequests,
                            this.radiusDynAuthClientDisconTimeouts,
                            this.radiusDynAuthClientDisconPacketsDropped,
                            this.radiusDynAuthClientCoARequests,
                            this.radiusDynAuthClientCoAAuthOnlyRequest,
                            this.radiusDynAuthClientCoARetransmissions,
                            this.radiusDynAuthClientCoAAcks,
                            this.radiusDynAuthClientCoANaks,
                            this.radiusDynAuthClientCoANakAuthOnlyRequest,
                            this.radiusDynAuthClientCoANakSessNoContext,
                            this.radiusDynAuthClientMalformedCoAResponses,
                            this.radiusDynAuthClientCoABadAuthenticators,
                            this.radiusDynAuthClientCoAPendingRequests,
                            this.radiusDynAuthClientCoATimeouts,
                            this.radiusDynAuthClientCoAPacketsDropped,
                            this.radiusDynAuthClientUnknownTypes,
                            this.radiusDynAuthClientCounterDiscontinuity
                        };
                    }
                    public static final class RadiusDynAuthServerIndexEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthServerIndexEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServerIndex", "1.3.6.1.2.1.145.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServerAddressTypeEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthServerAddressTypeEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServerAddressType", "1.3.6.1.2.1.145.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServerAddressEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthServerAddressEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServerAddress", "1.3.6.1.2.1.145.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServerClientPortNumberEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthServerClientPortNumberEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServerClientPortNumber", "1.3.6.1.2.1.145.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServerIDEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthServerIDEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServerID", "1.3.6.1.2.1.145.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientRoundTripTimeEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientRoundTripTimeEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientRoundTripTime", "1.3.6.1.2.1.145.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconRequestsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconRequestsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconRequests", "1.3.6.1.2.1.145.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconAuthOnlyRequestsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconAuthOnlyRequestsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconAuthOnlyRequests", "1.3.6.1.2.1.145.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconRetransmissionsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconRetransmissionsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconRetransmissions", "1.3.6.1.2.1.145.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconAcksEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconAcksEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconAcks", "1.3.6.1.2.1.145.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconNaksEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconNaksEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconNaks", "1.3.6.1.2.1.145.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconNakAuthOnlyRequestEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconNakAuthOnlyRequestEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconNakAuthOnlyRequest", "1.3.6.1.2.1.145.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconNakSessNoContextEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconNakSessNoContextEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconNakSessNoContext", "1.3.6.1.2.1.145.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientMalformedDisconResponsesEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientMalformedDisconResponsesEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientMalformedDisconResponses", "1.3.6.1.2.1.145.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconBadAuthenticatorsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconBadAuthenticatorsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconBadAuthenticators", "1.3.6.1.2.1.145.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconPendingRequestsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconPendingRequestsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconPendingRequests", "1.3.6.1.2.1.145.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconTimeoutsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconTimeoutsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconTimeouts", "1.3.6.1.2.1.145.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientDisconPacketsDroppedEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientDisconPacketsDroppedEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientDisconPacketsDropped", "1.3.6.1.2.1.145.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoARequestsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoARequestsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoARequests", "1.3.6.1.2.1.145.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoAAuthOnlyRequestEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoAAuthOnlyRequestEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoAAuthOnlyRequest", "1.3.6.1.2.1.145.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoARetransmissionsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoARetransmissionsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoARetransmissions", "1.3.6.1.2.1.145.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoAAcksEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoAAcksEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoAAcks", "1.3.6.1.2.1.145.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoANaksEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoANaksEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoANaks", "1.3.6.1.2.1.145.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoANakAuthOnlyRequestEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoANakAuthOnlyRequestEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoANakAuthOnlyRequest", "1.3.6.1.2.1.145.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoANakSessNoContextEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoANakSessNoContextEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoANakSessNoContext", "1.3.6.1.2.1.145.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientMalformedCoAResponsesEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientMalformedCoAResponsesEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientMalformedCoAResponses", "1.3.6.1.2.1.145.1.2.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoABadAuthenticatorsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoABadAuthenticatorsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoABadAuthenticators", "1.3.6.1.2.1.145.1.2.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoAPendingRequestsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoAPendingRequestsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoAPendingRequests", "1.3.6.1.2.1.145.1.2.1.28", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoATimeoutsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoATimeoutsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoATimeouts", "1.3.6.1.2.1.145.1.2.1.29", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCoAPacketsDroppedEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCoAPacketsDroppedEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCoAPacketsDropped", "1.3.6.1.2.1.145.1.2.1.30", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientUnknownTypesEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientUnknownTypesEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientUnknownTypes", "1.3.6.1.2.1.145.1.2.1.31", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientCounterDiscontinuityEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                    {
                        private RadiusDynAuthClientCounterDiscontinuityEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientCounterDiscontinuity", "1.3.6.1.2.1.145.1.2.1.32", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RadiusDynAuthClientMIBConformanceEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
        {
            public final RadiusDynAuthClientMIBCompliancesEnt radiusDynAuthClientMIBCompliances;

            public final RadiusDynAuthClientMIBGroupsEnt radiusDynAuthClientMIBGroups;

            private RadiusDynAuthClientMIBConformanceEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
            {
                super(mib, parent, "radiusDynAuthClientMIBConformance", "1.3.6.1.2.1.145.2", false, false, false, false);
                this.radiusDynAuthClientMIBCompliances = new RadiusDynAuthClientMIBCompliancesEnt(mib, this);
                this.radiusDynAuthClientMIBGroups = new RadiusDynAuthClientMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusDynAuthClientMIBCompliances,
                    this.radiusDynAuthClientMIBGroups
                };
            }
            public static final class RadiusDynAuthClientMIBCompliancesEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
            {
                /** compliance statements*/
                public final RadiusDynAuthClientMIBComplianceEnt radiusDynAuthClientMIBCompliance;

                private RadiusDynAuthClientMIBCompliancesEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthClientMIBCompliances", "1.3.6.1.2.1.145.2.1", false, false, false, false);
                    this.radiusDynAuthClientMIBCompliance = new RadiusDynAuthClientMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthClientMIBCompliance
                    };
                }
                public static final class RadiusDynAuthClientMIBComplianceEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    private RadiusDynAuthClientMIBComplianceEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientMIBCompliance", "1.3.6.1.2.1.145.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RadiusDynAuthClientMIBGroupsEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
            {
                /** units of conformance*/
                public final RadiusDynAuthClientMIBGroupEnt radiusDynAuthClientMIBGroup;

                public final RadiusDynAuthClientAuthOnlyGroupEnt radiusDynAuthClientAuthOnlyGroup;

                public final RadiusDynAuthClientNoSessGroupEnt radiusDynAuthClientNoSessGroup;

                private RadiusDynAuthClientMIBGroupsEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthClientMIBGroups", "1.3.6.1.2.1.145.2.2", false, false, false, false);
                    this.radiusDynAuthClientMIBGroup = new RadiusDynAuthClientMIBGroupEnt(mib, this);
                    this.radiusDynAuthClientAuthOnlyGroup = new RadiusDynAuthClientAuthOnlyGroupEnt(mib, this);
                    this.radiusDynAuthClientNoSessGroup = new RadiusDynAuthClientNoSessGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthClientMIBGroup,
                        this.radiusDynAuthClientAuthOnlyGroup,
                        this.radiusDynAuthClientNoSessGroup
                    };
                }
                public static final class RadiusDynAuthClientMIBGroupEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    private RadiusDynAuthClientMIBGroupEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientMIBGroup", "1.3.6.1.2.1.145.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthClientAuthOnlyGroupEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    private RadiusDynAuthClientAuthOnlyGroupEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientAuthOnlyGroup", "1.3.6.1.2.1.145.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthClientNoSessGroupEnt extends MIBEntry<RADIUSDYNAUTHCLIENTMIBDef>
                {
                    private RadiusDynAuthClientNoSessGroupEnt(RADIUSDYNAUTHCLIENTMIBDef mib, MIBEntry<RADIUSDYNAUTHCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientNoSessGroup", "1.3.6.1.2.1.145.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
