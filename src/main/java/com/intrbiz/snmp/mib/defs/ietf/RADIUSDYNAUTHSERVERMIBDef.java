package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC3411]
[RFC4001]*/
public final class RADIUSDYNAUTHSERVERMIBDef extends MIB
{
    public static final RADIUSDYNAUTHSERVERMIBDef RADIUSDYNAUTHSERVERMIB = new RADIUSDYNAUTHSERVERMIBDef();

    static { MIBs.getInstance().registerMIB(RADIUSDYNAUTHSERVERMIBDef.RADIUSDYNAUTHSERVERMIB); }

    /** [RFC2580]

29 August 2006*/
    public final RadiusDynAuthServerMIBEnt radiusDynAuthServerMIB;

    private RADIUSDYNAUTHSERVERMIBDef()
    {
        super("RADIUS-DYNAUTH-SERVER-MIB");
        this.radiusDynAuthServerMIB = new RadiusDynAuthServerMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.radiusDynAuthServerMIB
        };
    }

    public static final class RadiusDynAuthServerMIBEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
    {
        public final RadiusDynAuthServerMIBObjectsEnt radiusDynAuthServerMIBObjects;

        /** conformance information*/
        public final RadiusDynAuthServerMIBConformanceEnt radiusDynAuthServerMIBConformance;

        private RadiusDynAuthServerMIBEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
        {
            super(mib, parent, "radiusDynAuthServerMIB", "1.3.6.1.2.1.146", false, false, false, false);
            this.radiusDynAuthServerMIBObjects = new RadiusDynAuthServerMIBObjectsEnt(mib, this);
            this.radiusDynAuthServerMIBConformance = new RadiusDynAuthServerMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusDynAuthServerMIBObjects,
                this.radiusDynAuthServerMIBConformance
            };
        }
        public static final class RadiusDynAuthServerMIBObjectsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
        {
            public final RadiusDynAuthServerScalarsEnt radiusDynAuthServerScalars;

            public final RadiusDynAuthClientTableEnt radiusDynAuthClientTable;

            private RadiusDynAuthServerMIBObjectsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusDynAuthServerMIBObjects", "1.3.6.1.2.1.146.1", false, false, false, false);
                this.radiusDynAuthServerScalars = new RadiusDynAuthServerScalarsEnt(mib, this);
                this.radiusDynAuthClientTable = new RadiusDynAuthClientTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusDynAuthServerScalars,
                    this.radiusDynAuthClientTable
                };
            }
            public static final class RadiusDynAuthServerScalarsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
            {
                public final RadiusDynAuthServerDisconInvalidClientAddressesEnt radiusDynAuthServerDisconInvalidClientAddresses;

                public final RadiusDynAuthServerCoAInvalidClientAddressesEnt radiusDynAuthServerCoAInvalidClientAddresses;

                public final RadiusDynAuthServerIdentifierEnt radiusDynAuthServerIdentifier;

                private RadiusDynAuthServerScalarsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthServerScalars", "1.3.6.1.2.1.146.1.1", false, false, false, false);
                    this.radiusDynAuthServerDisconInvalidClientAddresses = new RadiusDynAuthServerDisconInvalidClientAddressesEnt(mib, this);
                    this.radiusDynAuthServerCoAInvalidClientAddresses = new RadiusDynAuthServerCoAInvalidClientAddressesEnt(mib, this);
                    this.radiusDynAuthServerIdentifier = new RadiusDynAuthServerIdentifierEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthServerDisconInvalidClientAddresses,
                        this.radiusDynAuthServerCoAInvalidClientAddresses,
                        this.radiusDynAuthServerIdentifier
                    };
                }
                public static final class RadiusDynAuthServerDisconInvalidClientAddressesEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusDynAuthServerDisconInvalidClientAddressesEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerDisconInvalidClientAddresses", "1.3.6.1.2.1.146.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthServerCoAInvalidClientAddressesEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusDynAuthServerCoAInvalidClientAddressesEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerCoAInvalidClientAddresses", "1.3.6.1.2.1.146.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthServerIdentifierEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusDynAuthServerIdentifierEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerIdentifier", "1.3.6.1.2.1.146.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RadiusDynAuthClientTableEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
            {
                public final RadiusDynAuthClientEntryEnt radiusDynAuthClientEntry;

                private RadiusDynAuthClientTableEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthClientTable", "1.3.6.1.2.1.146.1.2", false, true, false, false);
                    this.radiusDynAuthClientEntry = new RadiusDynAuthClientEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthClientEntry
                    };
                }
                public static final class RadiusDynAuthClientEntryEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    public final RadiusDynAuthClientIndexEnt radiusDynAuthClientIndex;

                    public final RadiusDynAuthClientAddressTypeEnt radiusDynAuthClientAddressType;

                    public final RadiusDynAuthClientAddressEnt radiusDynAuthClientAddress;

                    public final RadiusDynAuthServDisconRequestsEnt radiusDynAuthServDisconRequests;

                    public final RadiusDynAuthServDisconAuthOnlyRequestsEnt radiusDynAuthServDisconAuthOnlyRequests;

                    public final RadiusDynAuthServDupDisconRequestsEnt radiusDynAuthServDupDisconRequests;

                    public final RadiusDynAuthServDisconAcksEnt radiusDynAuthServDisconAcks;

                    public final RadiusDynAuthServDisconNaksEnt radiusDynAuthServDisconNaks;

                    public final RadiusDynAuthServDisconNakAuthOnlyRequestsEnt radiusDynAuthServDisconNakAuthOnlyRequests;

                    public final RadiusDynAuthServDisconNakSessNoContextEnt radiusDynAuthServDisconNakSessNoContext;

                    public final RadiusDynAuthServDisconUserSessRemovedEnt radiusDynAuthServDisconUserSessRemoved;

                    public final RadiusDynAuthServMalformedDisconRequestsEnt radiusDynAuthServMalformedDisconRequests;

                    public final RadiusDynAuthServDisconBadAuthenticatorsEnt radiusDynAuthServDisconBadAuthenticators;

                    public final RadiusDynAuthServDisconPacketsDroppedEnt radiusDynAuthServDisconPacketsDropped;

                    public final RadiusDynAuthServCoARequestsEnt radiusDynAuthServCoARequests;

                    public final RadiusDynAuthServCoAAuthOnlyRequestsEnt radiusDynAuthServCoAAuthOnlyRequests;

                    public final RadiusDynAuthServDupCoARequestsEnt radiusDynAuthServDupCoARequests;

                    public final RadiusDynAuthServCoAAcksEnt radiusDynAuthServCoAAcks;

                    public final RadiusDynAuthServCoANaksEnt radiusDynAuthServCoANaks;

                    public final RadiusDynAuthServCoANakAuthOnlyRequestsEnt radiusDynAuthServCoANakAuthOnlyRequests;

                    public final RadiusDynAuthServCoANakSessNoContextEnt radiusDynAuthServCoANakSessNoContext;

                    public final RadiusDynAuthServCoAUserSessChangedEnt radiusDynAuthServCoAUserSessChanged;

                    public final RadiusDynAuthServMalformedCoARequestsEnt radiusDynAuthServMalformedCoARequests;

                    public final RadiusDynAuthServCoABadAuthenticatorsEnt radiusDynAuthServCoABadAuthenticators;

                    public final RadiusDynAuthServCoAPacketsDroppedEnt radiusDynAuthServCoAPacketsDropped;

                    public final RadiusDynAuthServUnknownTypesEnt radiusDynAuthServUnknownTypes;

                    public final RadiusDynAuthServerCounterDiscontinuityEnt radiusDynAuthServerCounterDiscontinuity;

                    private RadiusDynAuthClientEntryEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthClientEntry", "1.3.6.1.2.1.146.1.2.1", false, false, false, true);
                        this.radiusDynAuthClientIndex = new RadiusDynAuthClientIndexEnt(mib, this);
                        this.radiusDynAuthClientAddressType = new RadiusDynAuthClientAddressTypeEnt(mib, this);
                        this.radiusDynAuthClientAddress = new RadiusDynAuthClientAddressEnt(mib, this);
                        this.radiusDynAuthServDisconRequests = new RadiusDynAuthServDisconRequestsEnt(mib, this);
                        this.radiusDynAuthServDisconAuthOnlyRequests = new RadiusDynAuthServDisconAuthOnlyRequestsEnt(mib, this);
                        this.radiusDynAuthServDupDisconRequests = new RadiusDynAuthServDupDisconRequestsEnt(mib, this);
                        this.radiusDynAuthServDisconAcks = new RadiusDynAuthServDisconAcksEnt(mib, this);
                        this.radiusDynAuthServDisconNaks = new RadiusDynAuthServDisconNaksEnt(mib, this);
                        this.radiusDynAuthServDisconNakAuthOnlyRequests = new RadiusDynAuthServDisconNakAuthOnlyRequestsEnt(mib, this);
                        this.radiusDynAuthServDisconNakSessNoContext = new RadiusDynAuthServDisconNakSessNoContextEnt(mib, this);
                        this.radiusDynAuthServDisconUserSessRemoved = new RadiusDynAuthServDisconUserSessRemovedEnt(mib, this);
                        this.radiusDynAuthServMalformedDisconRequests = new RadiusDynAuthServMalformedDisconRequestsEnt(mib, this);
                        this.radiusDynAuthServDisconBadAuthenticators = new RadiusDynAuthServDisconBadAuthenticatorsEnt(mib, this);
                        this.radiusDynAuthServDisconPacketsDropped = new RadiusDynAuthServDisconPacketsDroppedEnt(mib, this);
                        this.radiusDynAuthServCoARequests = new RadiusDynAuthServCoARequestsEnt(mib, this);
                        this.radiusDynAuthServCoAAuthOnlyRequests = new RadiusDynAuthServCoAAuthOnlyRequestsEnt(mib, this);
                        this.radiusDynAuthServDupCoARequests = new RadiusDynAuthServDupCoARequestsEnt(mib, this);
                        this.radiusDynAuthServCoAAcks = new RadiusDynAuthServCoAAcksEnt(mib, this);
                        this.radiusDynAuthServCoANaks = new RadiusDynAuthServCoANaksEnt(mib, this);
                        this.radiusDynAuthServCoANakAuthOnlyRequests = new RadiusDynAuthServCoANakAuthOnlyRequestsEnt(mib, this);
                        this.radiusDynAuthServCoANakSessNoContext = new RadiusDynAuthServCoANakSessNoContextEnt(mib, this);
                        this.radiusDynAuthServCoAUserSessChanged = new RadiusDynAuthServCoAUserSessChangedEnt(mib, this);
                        this.radiusDynAuthServMalformedCoARequests = new RadiusDynAuthServMalformedCoARequestsEnt(mib, this);
                        this.radiusDynAuthServCoABadAuthenticators = new RadiusDynAuthServCoABadAuthenticatorsEnt(mib, this);
                        this.radiusDynAuthServCoAPacketsDropped = new RadiusDynAuthServCoAPacketsDroppedEnt(mib, this);
                        this.radiusDynAuthServUnknownTypes = new RadiusDynAuthServUnknownTypesEnt(mib, this);
                        this.radiusDynAuthServerCounterDiscontinuity = new RadiusDynAuthServerCounterDiscontinuityEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusDynAuthClientIndex,
                            this.radiusDynAuthClientAddressType,
                            this.radiusDynAuthClientAddress,
                            this.radiusDynAuthServDisconRequests,
                            this.radiusDynAuthServDisconAuthOnlyRequests,
                            this.radiusDynAuthServDupDisconRequests,
                            this.radiusDynAuthServDisconAcks,
                            this.radiusDynAuthServDisconNaks,
                            this.radiusDynAuthServDisconNakAuthOnlyRequests,
                            this.radiusDynAuthServDisconNakSessNoContext,
                            this.radiusDynAuthServDisconUserSessRemoved,
                            this.radiusDynAuthServMalformedDisconRequests,
                            this.radiusDynAuthServDisconBadAuthenticators,
                            this.radiusDynAuthServDisconPacketsDropped,
                            this.radiusDynAuthServCoARequests,
                            this.radiusDynAuthServCoAAuthOnlyRequests,
                            this.radiusDynAuthServDupCoARequests,
                            this.radiusDynAuthServCoAAcks,
                            this.radiusDynAuthServCoANaks,
                            this.radiusDynAuthServCoANakAuthOnlyRequests,
                            this.radiusDynAuthServCoANakSessNoContext,
                            this.radiusDynAuthServCoAUserSessChanged,
                            this.radiusDynAuthServMalformedCoARequests,
                            this.radiusDynAuthServCoABadAuthenticators,
                            this.radiusDynAuthServCoAPacketsDropped,
                            this.radiusDynAuthServUnknownTypes,
                            this.radiusDynAuthServerCounterDiscontinuity
                        };
                    }
                    public static final class RadiusDynAuthClientIndexEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthClientIndexEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientIndex", "1.3.6.1.2.1.146.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientAddressTypeEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthClientAddressTypeEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientAddressType", "1.3.6.1.2.1.146.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthClientAddressEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthClientAddressEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthClientAddress", "1.3.6.1.2.1.146.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconRequests", "1.3.6.1.2.1.146.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconAuthOnlyRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconAuthOnlyRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconAuthOnlyRequests", "1.3.6.1.2.1.146.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDupDisconRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDupDisconRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDupDisconRequests", "1.3.6.1.2.1.146.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconAcksEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconAcksEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconAcks", "1.3.6.1.2.1.146.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconNaksEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconNaksEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconNaks", "1.3.6.1.2.1.146.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconNakAuthOnlyRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconNakAuthOnlyRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconNakAuthOnlyRequests", "1.3.6.1.2.1.146.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconNakSessNoContextEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconNakSessNoContextEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconNakSessNoContext", "1.3.6.1.2.1.146.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconUserSessRemovedEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconUserSessRemovedEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconUserSessRemoved", "1.3.6.1.2.1.146.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServMalformedDisconRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServMalformedDisconRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServMalformedDisconRequests", "1.3.6.1.2.1.146.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconBadAuthenticatorsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconBadAuthenticatorsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconBadAuthenticators", "1.3.6.1.2.1.146.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDisconPacketsDroppedEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDisconPacketsDroppedEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDisconPacketsDropped", "1.3.6.1.2.1.146.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoARequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoARequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoARequests", "1.3.6.1.2.1.146.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoAAuthOnlyRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoAAuthOnlyRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoAAuthOnlyRequests", "1.3.6.1.2.1.146.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServDupCoARequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServDupCoARequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServDupCoARequests", "1.3.6.1.2.1.146.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoAAcksEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoAAcksEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoAAcks", "1.3.6.1.2.1.146.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoANaksEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoANaksEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoANaks", "1.3.6.1.2.1.146.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoANakAuthOnlyRequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoANakAuthOnlyRequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoANakAuthOnlyRequests", "1.3.6.1.2.1.146.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoANakSessNoContextEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoANakSessNoContextEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoANakSessNoContext", "1.3.6.1.2.1.146.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoAUserSessChangedEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoAUserSessChangedEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoAUserSessChanged", "1.3.6.1.2.1.146.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServMalformedCoARequestsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServMalformedCoARequestsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServMalformedCoARequests", "1.3.6.1.2.1.146.1.2.1.23", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoABadAuthenticatorsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoABadAuthenticatorsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoABadAuthenticators", "1.3.6.1.2.1.146.1.2.1.24", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServCoAPacketsDroppedEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServCoAPacketsDroppedEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServCoAPacketsDropped", "1.3.6.1.2.1.146.1.2.1.25", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServUnknownTypesEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServUnknownTypesEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServUnknownTypes", "1.3.6.1.2.1.146.1.2.1.26", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RadiusDynAuthServerCounterDiscontinuityEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                    {
                        private RadiusDynAuthServerCounterDiscontinuityEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusDynAuthServerCounterDiscontinuity", "1.3.6.1.2.1.146.1.2.1.27", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RadiusDynAuthServerMIBConformanceEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
        {
            public final RadiusDynAuthServerMIBCompliancesEnt radiusDynAuthServerMIBCompliances;

            public final RadiusDynAuthServerMIBGroupsEnt radiusDynAuthServerMIBGroups;

            private RadiusDynAuthServerMIBConformanceEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusDynAuthServerMIBConformance", "1.3.6.1.2.1.146.2", false, false, false, false);
                this.radiusDynAuthServerMIBCompliances = new RadiusDynAuthServerMIBCompliancesEnt(mib, this);
                this.radiusDynAuthServerMIBGroups = new RadiusDynAuthServerMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusDynAuthServerMIBCompliances,
                    this.radiusDynAuthServerMIBGroups
                };
            }
            public static final class RadiusDynAuthServerMIBCompliancesEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
            {
                /** compliance statements*/
                public final RadiusAuthServerMIBComplianceEnt radiusAuthServerMIBCompliance;

                private RadiusDynAuthServerMIBCompliancesEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthServerMIBCompliances", "1.3.6.1.2.1.146.2.1", false, false, false, false);
                    this.radiusAuthServerMIBCompliance = new RadiusAuthServerMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAuthServerMIBCompliance
                    };
                }
                public static final class RadiusAuthServerMIBComplianceEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusAuthServerMIBComplianceEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServerMIBCompliance", "1.3.6.1.2.1.146.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RadiusDynAuthServerMIBGroupsEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
            {
                /** units of conformance*/
                public final RadiusDynAuthServerMIBGroupEnt radiusDynAuthServerMIBGroup;

                public final RadiusDynAuthServerAuthOnlyGroupEnt radiusDynAuthServerAuthOnlyGroup;

                public final RadiusDynAuthServerNoSessGroupEnt radiusDynAuthServerNoSessGroup;

                private RadiusDynAuthServerMIBGroupsEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusDynAuthServerMIBGroups", "1.3.6.1.2.1.146.2.2", false, false, false, false);
                    this.radiusDynAuthServerMIBGroup = new RadiusDynAuthServerMIBGroupEnt(mib, this);
                    this.radiusDynAuthServerAuthOnlyGroup = new RadiusDynAuthServerAuthOnlyGroupEnt(mib, this);
                    this.radiusDynAuthServerNoSessGroup = new RadiusDynAuthServerNoSessGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusDynAuthServerMIBGroup,
                        this.radiusDynAuthServerAuthOnlyGroup,
                        this.radiusDynAuthServerNoSessGroup
                    };
                }
                public static final class RadiusDynAuthServerMIBGroupEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusDynAuthServerMIBGroupEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerMIBGroup", "1.3.6.1.2.1.146.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthServerAuthOnlyGroupEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusDynAuthServerAuthOnlyGroupEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerAuthOnlyGroup", "1.3.6.1.2.1.146.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusDynAuthServerNoSessGroupEnt extends MIBEntry<RADIUSDYNAUTHSERVERMIBDef>
                {
                    private RadiusDynAuthServerNoSessGroupEnt(RADIUSDYNAUTHSERVERMIBDef mib, MIBEntry<RADIUSDYNAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusDynAuthServerNoSessGroup", "1.3.6.1.2.1.146.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
