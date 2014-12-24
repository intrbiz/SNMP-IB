package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class RADIUSAUTHSERVERMIBDef extends MIB
{
    public static final RADIUSAUTHSERVERMIBDef RADIUSAUTHSERVERMIB = new RADIUSAUTHSERVERMIBDef();

    /** 21 August 2006*/
    public final RadiusAuthServMIBEnt radiusAuthServMIB;

    public final RadiusMIBEnt radiusMIB;

    public final RadiusAuthenticationEnt radiusAuthentication;

    private RADIUSAUTHSERVERMIBDef()
    {
        super("RADIUS-AUTH-SERVER-MIB");
        this.radiusAuthServMIB = new RadiusAuthServMIBEnt(this, null);
        this.radiusMIB = new RadiusMIBEnt(this, null);
        this.radiusAuthentication = new RadiusAuthenticationEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.radiusAuthServMIB,
            this.radiusMIB,
            this.radiusAuthentication
        };
    }

    public static final class RadiusAuthServMIBEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
    {
        public final RadiusAuthServMIBObjectsEnt radiusAuthServMIBObjects;

        /** conformance information*/
        public final RadiusAuthServMIBConformanceEnt radiusAuthServMIBConformance;

        private RadiusAuthServMIBEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
        {
            super(mib, parent, "radiusAuthServMIB", "1.3.6.1.2.1.67.1.1", false, false, false, false);
            this.radiusAuthServMIBObjects = new RadiusAuthServMIBObjectsEnt(mib, this);
            this.radiusAuthServMIBConformance = new RadiusAuthServMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusAuthServMIBObjects,
                this.radiusAuthServMIBConformance
            };
        }
        public static final class RadiusAuthServMIBObjectsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
        {
            public final RadiusAuthServEnt radiusAuthServ;

            private RadiusAuthServMIBObjectsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusAuthServMIBObjects", "1.3.6.1.2.1.67.1.1.1", false, false, false, false);
                this.radiusAuthServ = new RadiusAuthServEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusAuthServ
                };
            }
            public static final class RadiusAuthServEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
            {
                public final RadiusAuthServIdentEnt radiusAuthServIdent;

                public final RadiusAuthServUpTimeEnt radiusAuthServUpTime;

                public final RadiusAuthServResetTimeEnt radiusAuthServResetTime;

                public final RadiusAuthServConfigResetEnt radiusAuthServConfigReset;

                public final RadiusAuthServTotalAccessRequestsEnt radiusAuthServTotalAccessRequests;

                public final RadiusAuthServTotalInvalidRequestsEnt radiusAuthServTotalInvalidRequests;

                public final RadiusAuthServTotalDupAccessRequestsEnt radiusAuthServTotalDupAccessRequests;

                public final RadiusAuthServTotalAccessAcceptsEnt radiusAuthServTotalAccessAccepts;

                public final RadiusAuthServTotalAccessRejectsEnt radiusAuthServTotalAccessRejects;

                public final RadiusAuthServTotalAccessChallengesEnt radiusAuthServTotalAccessChallenges;

                public final RadiusAuthServTotalMalformedAccessRequestsEnt radiusAuthServTotalMalformedAccessRequests;

                public final RadiusAuthServTotalBadAuthenticatorsEnt radiusAuthServTotalBadAuthenticators;

                public final RadiusAuthServTotalPacketsDroppedEnt radiusAuthServTotalPacketsDropped;

                public final RadiusAuthServTotalUnknownTypesEnt radiusAuthServTotalUnknownTypes;

                public final RadiusAuthClientTableEnt radiusAuthClientTable;

                /** New MIB objects added in this revision*/
                public final RadiusAuthClientExtTableEnt radiusAuthClientExtTable;

                private RadiusAuthServEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusAuthServ", "1.3.6.1.2.1.67.1.1.1.1", false, false, false, false);
                    this.radiusAuthServIdent = new RadiusAuthServIdentEnt(mib, this);
                    this.radiusAuthServUpTime = new RadiusAuthServUpTimeEnt(mib, this);
                    this.radiusAuthServResetTime = new RadiusAuthServResetTimeEnt(mib, this);
                    this.radiusAuthServConfigReset = new RadiusAuthServConfigResetEnt(mib, this);
                    this.radiusAuthServTotalAccessRequests = new RadiusAuthServTotalAccessRequestsEnt(mib, this);
                    this.radiusAuthServTotalInvalidRequests = new RadiusAuthServTotalInvalidRequestsEnt(mib, this);
                    this.radiusAuthServTotalDupAccessRequests = new RadiusAuthServTotalDupAccessRequestsEnt(mib, this);
                    this.radiusAuthServTotalAccessAccepts = new RadiusAuthServTotalAccessAcceptsEnt(mib, this);
                    this.radiusAuthServTotalAccessRejects = new RadiusAuthServTotalAccessRejectsEnt(mib, this);
                    this.radiusAuthServTotalAccessChallenges = new RadiusAuthServTotalAccessChallengesEnt(mib, this);
                    this.radiusAuthServTotalMalformedAccessRequests = new RadiusAuthServTotalMalformedAccessRequestsEnt(mib, this);
                    this.radiusAuthServTotalBadAuthenticators = new RadiusAuthServTotalBadAuthenticatorsEnt(mib, this);
                    this.radiusAuthServTotalPacketsDropped = new RadiusAuthServTotalPacketsDroppedEnt(mib, this);
                    this.radiusAuthServTotalUnknownTypes = new RadiusAuthServTotalUnknownTypesEnt(mib, this);
                    this.radiusAuthClientTable = new RadiusAuthClientTableEnt(mib, this);
                    this.radiusAuthClientExtTable = new RadiusAuthClientExtTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAuthServIdent,
                        this.radiusAuthServUpTime,
                        this.radiusAuthServResetTime,
                        this.radiusAuthServConfigReset,
                        this.radiusAuthServTotalAccessRequests,
                        this.radiusAuthServTotalInvalidRequests,
                        this.radiusAuthServTotalDupAccessRequests,
                        this.radiusAuthServTotalAccessAccepts,
                        this.radiusAuthServTotalAccessRejects,
                        this.radiusAuthServTotalAccessChallenges,
                        this.radiusAuthServTotalMalformedAccessRequests,
                        this.radiusAuthServTotalBadAuthenticators,
                        this.radiusAuthServTotalPacketsDropped,
                        this.radiusAuthServTotalUnknownTypes,
                        this.radiusAuthClientTable,
                        this.radiusAuthClientExtTable
                    };
                }
                public static final class RadiusAuthServIdentEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServIdentEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServIdent", "1.3.6.1.2.1.67.1.1.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServUpTimeEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServUpTimeEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServUpTime", "1.3.6.1.2.1.67.1.1.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServResetTimeEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServResetTimeEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServResetTime", "1.3.6.1.2.1.67.1.1.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServConfigResetEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServConfigResetEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServConfigReset", "1.3.6.1.2.1.67.1.1.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalInvalidRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalInvalidRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalInvalidRequests", "1.3.6.1.2.1.67.1.1.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalDupAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalDupAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalDupAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalAccessAcceptsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalAccessAcceptsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalAccessAccepts", "1.3.6.1.2.1.67.1.1.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalAccessRejectsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalAccessRejectsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalAccessRejects", "1.3.6.1.2.1.67.1.1.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalAccessChallengesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalAccessChallengesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalAccessChallenges", "1.3.6.1.2.1.67.1.1.1.1.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalMalformedAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalMalformedAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalMalformedAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalBadAuthenticatorsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalBadAuthenticatorsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalBadAuthenticators", "1.3.6.1.2.1.67.1.1.1.1.12", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalPacketsDroppedEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalPacketsDroppedEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalPacketsDropped", "1.3.6.1.2.1.67.1.1.1.1.13", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServTotalUnknownTypesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServTotalUnknownTypesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServTotalUnknownTypes", "1.3.6.1.2.1.67.1.1.1.1.14", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthClientTableEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    public final RadiusAuthClientEntryEnt radiusAuthClientEntry;

                    private RadiusAuthClientTableEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthClientTable", "1.3.6.1.2.1.67.1.1.1.1.15", false, true, false, false);
                        this.radiusAuthClientEntry = new RadiusAuthClientEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAuthClientEntry
                        };
                    }
                    public static final class RadiusAuthClientEntryEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                    {
                        public final RadiusAuthClientIndexEnt radiusAuthClientIndex;

                        public final RadiusAuthClientAddressEnt radiusAuthClientAddress;

                        public final RadiusAuthClientIDEnt radiusAuthClientID;

                        /** Server Counters
Responses = AccessAccepts + AccessRejects + AccessChallengesRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes -  PacketsDropped - Responses = PendingRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes - PacketsDropped = entries logged*/
                        public final RadiusAuthServAccessRequestsEnt radiusAuthServAccessRequests;

                        public final RadiusAuthServDupAccessRequestsEnt radiusAuthServDupAccessRequests;

                        public final RadiusAuthServAccessAcceptsEnt radiusAuthServAccessAccepts;

                        public final RadiusAuthServAccessRejectsEnt radiusAuthServAccessRejects;

                        public final RadiusAuthServAccessChallengesEnt radiusAuthServAccessChallenges;

                        public final RadiusAuthServMalformedAccessRequestsEnt radiusAuthServMalformedAccessRequests;

                        public final RadiusAuthServBadAuthenticatorsEnt radiusAuthServBadAuthenticators;

                        public final RadiusAuthServPacketsDroppedEnt radiusAuthServPacketsDropped;

                        public final RadiusAuthServUnknownTypesEnt radiusAuthServUnknownTypes;

                        private RadiusAuthClientEntryEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientEntry", "1.3.6.1.2.1.67.1.1.1.1.15.1", false, false, false, true);
                            this.radiusAuthClientIndex = new RadiusAuthClientIndexEnt(mib, this);
                            this.radiusAuthClientAddress = new RadiusAuthClientAddressEnt(mib, this);
                            this.radiusAuthClientID = new RadiusAuthClientIDEnt(mib, this);
                            this.radiusAuthServAccessRequests = new RadiusAuthServAccessRequestsEnt(mib, this);
                            this.radiusAuthServDupAccessRequests = new RadiusAuthServDupAccessRequestsEnt(mib, this);
                            this.radiusAuthServAccessAccepts = new RadiusAuthServAccessAcceptsEnt(mib, this);
                            this.radiusAuthServAccessRejects = new RadiusAuthServAccessRejectsEnt(mib, this);
                            this.radiusAuthServAccessChallenges = new RadiusAuthServAccessChallengesEnt(mib, this);
                            this.radiusAuthServMalformedAccessRequests = new RadiusAuthServMalformedAccessRequestsEnt(mib, this);
                            this.radiusAuthServBadAuthenticators = new RadiusAuthServBadAuthenticatorsEnt(mib, this);
                            this.radiusAuthServPacketsDropped = new RadiusAuthServPacketsDroppedEnt(mib, this);
                            this.radiusAuthServUnknownTypes = new RadiusAuthServUnknownTypesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAuthClientIndex,
                                this.radiusAuthClientAddress,
                                this.radiusAuthClientID,
                                this.radiusAuthServAccessRequests,
                                this.radiusAuthServDupAccessRequests,
                                this.radiusAuthServAccessAccepts,
                                this.radiusAuthServAccessRejects,
                                this.radiusAuthServAccessChallenges,
                                this.radiusAuthServMalformedAccessRequests,
                                this.radiusAuthServBadAuthenticators,
                                this.radiusAuthServPacketsDropped,
                                this.radiusAuthServUnknownTypes
                            };
                        }
                        public static final class RadiusAuthClientIndexEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientIndexEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientIndex", "1.3.6.1.2.1.67.1.1.1.1.15.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthClientAddressEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientAddressEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientAddress", "1.3.6.1.2.1.67.1.1.1.1.15.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthClientIDEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientIDEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientID", "1.3.6.1.2.1.67.1.1.1.1.15.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.15.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServDupAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServDupAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServDupAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.15.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServAccessAcceptsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServAccessAcceptsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServAccessAccepts", "1.3.6.1.2.1.67.1.1.1.1.15.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServAccessRejectsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServAccessRejectsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServAccessRejects", "1.3.6.1.2.1.67.1.1.1.1.15.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServAccessChallengesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServAccessChallengesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServAccessChallenges", "1.3.6.1.2.1.67.1.1.1.1.15.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServMalformedAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServMalformedAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServMalformedAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.15.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServBadAuthenticatorsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServBadAuthenticatorsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServBadAuthenticators", "1.3.6.1.2.1.67.1.1.1.1.15.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServPacketsDroppedEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServPacketsDroppedEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServPacketsDropped", "1.3.6.1.2.1.67.1.1.1.1.15.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServUnknownTypesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServUnknownTypesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServUnknownTypes", "1.3.6.1.2.1.67.1.1.1.1.15.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RadiusAuthClientExtTableEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    public final RadiusAuthClientExtEntryEnt radiusAuthClientExtEntry;

                    private RadiusAuthClientExtTableEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthClientExtTable", "1.3.6.1.2.1.67.1.1.1.1.16", false, true, false, false);
                        this.radiusAuthClientExtEntry = new RadiusAuthClientExtEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAuthClientExtEntry
                        };
                    }
                    public static final class RadiusAuthClientExtEntryEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                    {
                        public final RadiusAuthClientExtIndexEnt radiusAuthClientExtIndex;

                        public final RadiusAuthClientInetAddressTypeEnt radiusAuthClientInetAddressType;

                        public final RadiusAuthClientInetAddressEnt radiusAuthClientInetAddress;

                        public final RadiusAuthClientExtIDEnt radiusAuthClientExtID;

                        /** Server Counters
Responses = AccessAccepts + AccessRejects + AccessChallengesRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes -  PacketsDropped - Responses = PendingRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes - PacketsDropped = entries logged*/
                        public final RadiusAuthServExtAccessRequestsEnt radiusAuthServExtAccessRequests;

                        public final RadiusAuthServExtDupAccessRequestsEnt radiusAuthServExtDupAccessRequests;

                        public final RadiusAuthServExtAccessAcceptsEnt radiusAuthServExtAccessAccepts;

                        public final RadiusAuthServExtAccessRejectsEnt radiusAuthServExtAccessRejects;

                        public final RadiusAuthServExtAccessChallengesEnt radiusAuthServExtAccessChallenges;

                        public final RadiusAuthServExtMalformedAccessRequestsEnt radiusAuthServExtMalformedAccessRequests;

                        public final RadiusAuthServExtBadAuthenticatorsEnt radiusAuthServExtBadAuthenticators;

                        public final RadiusAuthServExtPacketsDroppedEnt radiusAuthServExtPacketsDropped;

                        public final RadiusAuthServExtUnknownTypesEnt radiusAuthServExtUnknownTypes;

                        public final RadiusAuthServCounterDiscontinuityEnt radiusAuthServCounterDiscontinuity;

                        private RadiusAuthClientExtEntryEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusAuthClientExtEntry", "1.3.6.1.2.1.67.1.1.1.1.16.1", false, false, false, true);
                            this.radiusAuthClientExtIndex = new RadiusAuthClientExtIndexEnt(mib, this);
                            this.radiusAuthClientInetAddressType = new RadiusAuthClientInetAddressTypeEnt(mib, this);
                            this.radiusAuthClientInetAddress = new RadiusAuthClientInetAddressEnt(mib, this);
                            this.radiusAuthClientExtID = new RadiusAuthClientExtIDEnt(mib, this);
                            this.radiusAuthServExtAccessRequests = new RadiusAuthServExtAccessRequestsEnt(mib, this);
                            this.radiusAuthServExtDupAccessRequests = new RadiusAuthServExtDupAccessRequestsEnt(mib, this);
                            this.radiusAuthServExtAccessAccepts = new RadiusAuthServExtAccessAcceptsEnt(mib, this);
                            this.radiusAuthServExtAccessRejects = new RadiusAuthServExtAccessRejectsEnt(mib, this);
                            this.radiusAuthServExtAccessChallenges = new RadiusAuthServExtAccessChallengesEnt(mib, this);
                            this.radiusAuthServExtMalformedAccessRequests = new RadiusAuthServExtMalformedAccessRequestsEnt(mib, this);
                            this.radiusAuthServExtBadAuthenticators = new RadiusAuthServExtBadAuthenticatorsEnt(mib, this);
                            this.radiusAuthServExtPacketsDropped = new RadiusAuthServExtPacketsDroppedEnt(mib, this);
                            this.radiusAuthServExtUnknownTypes = new RadiusAuthServExtUnknownTypesEnt(mib, this);
                            this.radiusAuthServCounterDiscontinuity = new RadiusAuthServCounterDiscontinuityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAuthClientExtIndex,
                                this.radiusAuthClientInetAddressType,
                                this.radiusAuthClientInetAddress,
                                this.radiusAuthClientExtID,
                                this.radiusAuthServExtAccessRequests,
                                this.radiusAuthServExtDupAccessRequests,
                                this.radiusAuthServExtAccessAccepts,
                                this.radiusAuthServExtAccessRejects,
                                this.radiusAuthServExtAccessChallenges,
                                this.radiusAuthServExtMalformedAccessRequests,
                                this.radiusAuthServExtBadAuthenticators,
                                this.radiusAuthServExtPacketsDropped,
                                this.radiusAuthServExtUnknownTypes,
                                this.radiusAuthServCounterDiscontinuity
                            };
                        }
                        public static final class RadiusAuthClientExtIndexEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientExtIndexEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientExtIndex", "1.3.6.1.2.1.67.1.1.1.1.16.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthClientInetAddressTypeEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientInetAddressTypeEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientInetAddressType", "1.3.6.1.2.1.67.1.1.1.1.16.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthClientInetAddressEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientInetAddressEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientInetAddress", "1.3.6.1.2.1.67.1.1.1.1.16.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthClientExtIDEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthClientExtIDEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthClientExtID", "1.3.6.1.2.1.67.1.1.1.1.16.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.16.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtDupAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtDupAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtDupAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.16.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtAccessAcceptsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtAccessAcceptsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtAccessAccepts", "1.3.6.1.2.1.67.1.1.1.1.16.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtAccessRejectsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtAccessRejectsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtAccessRejects", "1.3.6.1.2.1.67.1.1.1.1.16.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtAccessChallengesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtAccessChallengesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtAccessChallenges", "1.3.6.1.2.1.67.1.1.1.1.16.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtMalformedAccessRequestsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtMalformedAccessRequestsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtMalformedAccessRequests", "1.3.6.1.2.1.67.1.1.1.1.16.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtBadAuthenticatorsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtBadAuthenticatorsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtBadAuthenticators", "1.3.6.1.2.1.67.1.1.1.1.16.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtPacketsDroppedEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtPacketsDroppedEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtPacketsDropped", "1.3.6.1.2.1.67.1.1.1.1.16.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServExtUnknownTypesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServExtUnknownTypesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServExtUnknownTypes", "1.3.6.1.2.1.67.1.1.1.1.16.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAuthServCounterDiscontinuityEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                        {
                            private RadiusAuthServCounterDiscontinuityEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAuthServCounterDiscontinuity", "1.3.6.1.2.1.67.1.1.1.1.16.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class RadiusAuthServMIBConformanceEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
        {
            public final RadiusAuthServMIBCompliancesEnt radiusAuthServMIBCompliances;

            public final RadiusAuthServMIBGroupsEnt radiusAuthServMIBGroups;

            private RadiusAuthServMIBConformanceEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusAuthServMIBConformance", "1.3.6.1.2.1.67.1.1.2", false, false, false, false);
                this.radiusAuthServMIBCompliances = new RadiusAuthServMIBCompliancesEnt(mib, this);
                this.radiusAuthServMIBGroups = new RadiusAuthServMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusAuthServMIBCompliances,
                    this.radiusAuthServMIBGroups
                };
            }
            public static final class RadiusAuthServMIBCompliancesEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
            {
                /** compliance statements*/
                public final RadiusAuthServMIBComplianceEnt radiusAuthServMIBCompliance;

                public final RadiusAuthServMIBExtComplianceEnt radiusAuthServMIBExtCompliance;

                private RadiusAuthServMIBCompliancesEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusAuthServMIBCompliances", "1.3.6.1.2.1.67.1.1.2.1", false, false, false, false);
                    this.radiusAuthServMIBCompliance = new RadiusAuthServMIBComplianceEnt(mib, this);
                    this.radiusAuthServMIBExtCompliance = new RadiusAuthServMIBExtComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAuthServMIBCompliance,
                        this.radiusAuthServMIBExtCompliance
                    };
                }
                public static final class RadiusAuthServMIBComplianceEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServMIBComplianceEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServMIBCompliance", "1.3.6.1.2.1.67.1.1.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServMIBExtComplianceEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServMIBExtComplianceEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServMIBExtCompliance", "1.3.6.1.2.1.67.1.1.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RadiusAuthServMIBGroupsEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
            {
                /** units of conformance*/
                public final RadiusAuthServMIBGroupEnt radiusAuthServMIBGroup;

                public final RadiusAuthServExtMIBGroupEnt radiusAuthServExtMIBGroup;

                private RadiusAuthServMIBGroupsEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusAuthServMIBGroups", "1.3.6.1.2.1.67.1.1.2.2", false, false, false, false);
                    this.radiusAuthServMIBGroup = new RadiusAuthServMIBGroupEnt(mib, this);
                    this.radiusAuthServExtMIBGroup = new RadiusAuthServExtMIBGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAuthServMIBGroup,
                        this.radiusAuthServExtMIBGroup
                    };
                }
                public static final class RadiusAuthServMIBGroupEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServMIBGroupEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServMIBGroup", "1.3.6.1.2.1.67.1.1.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAuthServExtMIBGroupEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
                {
                    private RadiusAuthServExtMIBGroupEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAuthServExtMIBGroup", "1.3.6.1.2.1.67.1.1.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class RadiusMIBEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
    {
        private RadiusMIBEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
        {
            super(mib, parent, "radiusMIB", "1.3.6.1.2.1.67", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class RadiusAuthenticationEnt extends MIBEntry<RADIUSAUTHSERVERMIBDef>
    {
        private RadiusAuthenticationEnt(RADIUSAUTHSERVERMIBDef mib, MIBEntry<RADIUSAUTHSERVERMIBDef> parent)
        {
            super(mib, parent, "radiusAuthentication", "1.3.6.1.2.1.67.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
