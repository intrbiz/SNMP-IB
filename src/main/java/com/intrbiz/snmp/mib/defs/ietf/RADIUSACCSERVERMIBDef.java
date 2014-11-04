package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class RADIUSACCSERVERMIBDef extends MIB
{
    public static final RADIUSACCSERVERMIBDef RADIUSACCSERVERMIB = new RADIUSACCSERVERMIBDef();

    static { MIBs.getInstance().registerMIB(RADIUSACCSERVERMIBDef.RADIUSACCSERVERMIB); }

    /** 21 August 2006*/
    public final RadiusAccServMIBEnt radiusAccServMIB;

    public final RadiusMIBEnt radiusMIB;

    private RADIUSACCSERVERMIBDef()
    {
        super("RADIUS-ACC-SERVER-MIB");
        this.radiusAccServMIB = new RadiusAccServMIBEnt(this, null);
        this.radiusMIB = new RadiusMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.radiusAccServMIB,
            this.radiusMIB
        };
    }

    public static final class RadiusAccServMIBEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
    {
        public final RadiusAccServMIBObjectsEnt radiusAccServMIBObjects;

        /** conformance information*/
        public final RadiusAccServMIBConformanceEnt radiusAccServMIBConformance;

        private RadiusAccServMIBEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
        {
            super(mib, parent, "radiusAccServMIB", "1.3.6.1.2.1.67.2.1", false, false, false, false);
            this.radiusAccServMIBObjects = new RadiusAccServMIBObjectsEnt(mib, this);
            this.radiusAccServMIBConformance = new RadiusAccServMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusAccServMIBObjects,
                this.radiusAccServMIBConformance
            };
        }
        public static final class RadiusAccServMIBObjectsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
        {
            public final RadiusAccServEnt radiusAccServ;

            private RadiusAccServMIBObjectsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusAccServMIBObjects", "1.3.6.1.2.1.67.2.1.1", false, false, false, false);
                this.radiusAccServ = new RadiusAccServEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusAccServ
                };
            }
            public static final class RadiusAccServEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
            {
                public final RadiusAccServIdentEnt radiusAccServIdent;

                public final RadiusAccServUpTimeEnt radiusAccServUpTime;

                public final RadiusAccServResetTimeEnt radiusAccServResetTime;

                public final RadiusAccServConfigResetEnt radiusAccServConfigReset;

                public final RadiusAccServTotalRequestsEnt radiusAccServTotalRequests;

                public final RadiusAccServTotalInvalidRequestsEnt radiusAccServTotalInvalidRequests;

                public final RadiusAccServTotalDupRequestsEnt radiusAccServTotalDupRequests;

                public final RadiusAccServTotalResponsesEnt radiusAccServTotalResponses;

                public final RadiusAccServTotalMalformedRequestsEnt radiusAccServTotalMalformedRequests;

                public final RadiusAccServTotalBadAuthenticatorsEnt radiusAccServTotalBadAuthenticators;

                public final RadiusAccServTotalPacketsDroppedEnt radiusAccServTotalPacketsDropped;

                public final RadiusAccServTotalNoRecordsEnt radiusAccServTotalNoRecords;

                public final RadiusAccServTotalUnknownTypesEnt radiusAccServTotalUnknownTypes;

                public final RadiusAccClientTableEnt radiusAccClientTable;

                /** New MIB objects added in this revision*/
                public final RadiusAccClientExtTableEnt radiusAccClientExtTable;

                private RadiusAccServEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusAccServ", "1.3.6.1.2.1.67.2.1.1.1", false, false, false, false);
                    this.radiusAccServIdent = new RadiusAccServIdentEnt(mib, this);
                    this.radiusAccServUpTime = new RadiusAccServUpTimeEnt(mib, this);
                    this.radiusAccServResetTime = new RadiusAccServResetTimeEnt(mib, this);
                    this.radiusAccServConfigReset = new RadiusAccServConfigResetEnt(mib, this);
                    this.radiusAccServTotalRequests = new RadiusAccServTotalRequestsEnt(mib, this);
                    this.radiusAccServTotalInvalidRequests = new RadiusAccServTotalInvalidRequestsEnt(mib, this);
                    this.radiusAccServTotalDupRequests = new RadiusAccServTotalDupRequestsEnt(mib, this);
                    this.radiusAccServTotalResponses = new RadiusAccServTotalResponsesEnt(mib, this);
                    this.radiusAccServTotalMalformedRequests = new RadiusAccServTotalMalformedRequestsEnt(mib, this);
                    this.radiusAccServTotalBadAuthenticators = new RadiusAccServTotalBadAuthenticatorsEnt(mib, this);
                    this.radiusAccServTotalPacketsDropped = new RadiusAccServTotalPacketsDroppedEnt(mib, this);
                    this.radiusAccServTotalNoRecords = new RadiusAccServTotalNoRecordsEnt(mib, this);
                    this.radiusAccServTotalUnknownTypes = new RadiusAccServTotalUnknownTypesEnt(mib, this);
                    this.radiusAccClientTable = new RadiusAccClientTableEnt(mib, this);
                    this.radiusAccClientExtTable = new RadiusAccClientExtTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAccServIdent,
                        this.radiusAccServUpTime,
                        this.radiusAccServResetTime,
                        this.radiusAccServConfigReset,
                        this.radiusAccServTotalRequests,
                        this.radiusAccServTotalInvalidRequests,
                        this.radiusAccServTotalDupRequests,
                        this.radiusAccServTotalResponses,
                        this.radiusAccServTotalMalformedRequests,
                        this.radiusAccServTotalBadAuthenticators,
                        this.radiusAccServTotalPacketsDropped,
                        this.radiusAccServTotalNoRecords,
                        this.radiusAccServTotalUnknownTypes,
                        this.radiusAccClientTable,
                        this.radiusAccClientExtTable
                    };
                }
                public static final class RadiusAccServIdentEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServIdentEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServIdent", "1.3.6.1.2.1.67.2.1.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServUpTimeEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServUpTimeEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServUpTime", "1.3.6.1.2.1.67.2.1.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServResetTimeEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServResetTimeEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServResetTime", "1.3.6.1.2.1.67.2.1.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServConfigResetEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServConfigResetEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServConfigReset", "1.3.6.1.2.1.67.2.1.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalRequests", "1.3.6.1.2.1.67.2.1.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalInvalidRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalInvalidRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalInvalidRequests", "1.3.6.1.2.1.67.2.1.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalDupRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalDupRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalDupRequests", "1.3.6.1.2.1.67.2.1.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalResponsesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalResponsesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalResponses", "1.3.6.1.2.1.67.2.1.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalMalformedRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalMalformedRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalMalformedRequests", "1.3.6.1.2.1.67.2.1.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalBadAuthenticatorsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalBadAuthenticatorsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalBadAuthenticators", "1.3.6.1.2.1.67.2.1.1.1.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalPacketsDroppedEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalPacketsDroppedEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalPacketsDropped", "1.3.6.1.2.1.67.2.1.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalNoRecordsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalNoRecordsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalNoRecords", "1.3.6.1.2.1.67.2.1.1.1.12", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServTotalUnknownTypesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServTotalUnknownTypesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServTotalUnknownTypes", "1.3.6.1.2.1.67.2.1.1.1.13", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccClientTableEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    public final RadiusAccClientEntryEnt radiusAccClientEntry;

                    private RadiusAccClientTableEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccClientTable", "1.3.6.1.2.1.67.2.1.1.1.14", false, true, false, false);
                        this.radiusAccClientEntry = new RadiusAccClientEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAccClientEntry
                        };
                    }
                    public static final class RadiusAccClientEntryEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                    {
                        public final RadiusAccClientIndexEnt radiusAccClientIndex;

                        public final RadiusAccClientAddressEnt radiusAccClientAddress;

                        public final RadiusAccClientIDEnt radiusAccClientID;

                        /** Server CountersRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes -  PacketsDropped - Responses = PendingRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes - PacketsDropped - NoRecords = entries logged*/
                        public final RadiusAccServPacketsDroppedEnt radiusAccServPacketsDropped;

                        public final RadiusAccServRequestsEnt radiusAccServRequests;

                        public final RadiusAccServDupRequestsEnt radiusAccServDupRequests;

                        public final RadiusAccServResponsesEnt radiusAccServResponses;

                        public final RadiusAccServBadAuthenticatorsEnt radiusAccServBadAuthenticators;

                        public final RadiusAccServMalformedRequestsEnt radiusAccServMalformedRequests;

                        public final RadiusAccServNoRecordsEnt radiusAccServNoRecords;

                        public final RadiusAccServUnknownTypesEnt radiusAccServUnknownTypes;

                        private RadiusAccClientEntryEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusAccClientEntry", "1.3.6.1.2.1.67.2.1.1.1.14.1", false, false, false, true);
                            this.radiusAccClientIndex = new RadiusAccClientIndexEnt(mib, this);
                            this.radiusAccClientAddress = new RadiusAccClientAddressEnt(mib, this);
                            this.radiusAccClientID = new RadiusAccClientIDEnt(mib, this);
                            this.radiusAccServPacketsDropped = new RadiusAccServPacketsDroppedEnt(mib, this);
                            this.radiusAccServRequests = new RadiusAccServRequestsEnt(mib, this);
                            this.radiusAccServDupRequests = new RadiusAccServDupRequestsEnt(mib, this);
                            this.radiusAccServResponses = new RadiusAccServResponsesEnt(mib, this);
                            this.radiusAccServBadAuthenticators = new RadiusAccServBadAuthenticatorsEnt(mib, this);
                            this.radiusAccServMalformedRequests = new RadiusAccServMalformedRequestsEnt(mib, this);
                            this.radiusAccServNoRecords = new RadiusAccServNoRecordsEnt(mib, this);
                            this.radiusAccServUnknownTypes = new RadiusAccServUnknownTypesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAccClientIndex,
                                this.radiusAccClientAddress,
                                this.radiusAccClientID,
                                this.radiusAccServPacketsDropped,
                                this.radiusAccServRequests,
                                this.radiusAccServDupRequests,
                                this.radiusAccServResponses,
                                this.radiusAccServBadAuthenticators,
                                this.radiusAccServMalformedRequests,
                                this.radiusAccServNoRecords,
                                this.radiusAccServUnknownTypes
                            };
                        }
                        public static final class RadiusAccClientIndexEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientIndexEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientIndex", "1.3.6.1.2.1.67.2.1.1.1.14.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientAddressEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientAddressEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientAddress", "1.3.6.1.2.1.67.2.1.1.1.14.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientIDEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientIDEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientID", "1.3.6.1.2.1.67.2.1.1.1.14.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServPacketsDroppedEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServPacketsDroppedEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServPacketsDropped", "1.3.6.1.2.1.67.2.1.1.1.14.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServRequests", "1.3.6.1.2.1.67.2.1.1.1.14.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServDupRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServDupRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServDupRequests", "1.3.6.1.2.1.67.2.1.1.1.14.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServResponsesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServResponsesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServResponses", "1.3.6.1.2.1.67.2.1.1.1.14.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServBadAuthenticatorsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServBadAuthenticatorsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServBadAuthenticators", "1.3.6.1.2.1.67.2.1.1.1.14.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServMalformedRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServMalformedRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServMalformedRequests", "1.3.6.1.2.1.67.2.1.1.1.14.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServNoRecordsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServNoRecordsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServNoRecords", "1.3.6.1.2.1.67.2.1.1.1.14.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServUnknownTypesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServUnknownTypesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServUnknownTypes", "1.3.6.1.2.1.67.2.1.1.1.14.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RadiusAccClientExtTableEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    public final RadiusAccClientExtEntryEnt radiusAccClientExtEntry;

                    private RadiusAccClientExtTableEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccClientExtTable", "1.3.6.1.2.1.67.2.1.1.1.15", false, true, false, false);
                        this.radiusAccClientExtEntry = new RadiusAccClientExtEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.radiusAccClientExtEntry
                        };
                    }
                    public static final class RadiusAccClientExtEntryEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                    {
                        public final RadiusAccClientExtIndexEnt radiusAccClientExtIndex;

                        public final RadiusAccClientInetAddressTypeEnt radiusAccClientInetAddressType;

                        public final RadiusAccClientInetAddressEnt radiusAccClientInetAddress;

                        public final RadiusAccClientExtIDEnt radiusAccClientExtID;

                        /** Server CountersRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes -  PacketsDropped - Responses = PendingRequests - DupRequests - BadAuthenticators - MalformedRequests -UnknownTypes - PacketsDropped - NoRecords = entries logged*/
                        public final RadiusAccServExtPacketsDroppedEnt radiusAccServExtPacketsDropped;

                        public final RadiusAccServExtRequestsEnt radiusAccServExtRequests;

                        public final RadiusAccServExtDupRequestsEnt radiusAccServExtDupRequests;

                        public final RadiusAccServExtResponsesEnt radiusAccServExtResponses;

                        public final RadiusAccServExtBadAuthenticatorsEnt radiusAccServExtBadAuthenticators;

                        public final RadiusAccServExtMalformedRequestsEnt radiusAccServExtMalformedRequests;

                        public final RadiusAccServExtNoRecordsEnt radiusAccServExtNoRecords;

                        public final RadiusAccServExtUnknownTypesEnt radiusAccServExtUnknownTypes;

                        public final RadiusAccServerCounterDiscontinuityEnt radiusAccServerCounterDiscontinuity;

                        private RadiusAccClientExtEntryEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                        {
                            super(mib, parent, "radiusAccClientExtEntry", "1.3.6.1.2.1.67.2.1.1.1.15.1", false, false, false, true);
                            this.radiusAccClientExtIndex = new RadiusAccClientExtIndexEnt(mib, this);
                            this.radiusAccClientInetAddressType = new RadiusAccClientInetAddressTypeEnt(mib, this);
                            this.radiusAccClientInetAddress = new RadiusAccClientInetAddressEnt(mib, this);
                            this.radiusAccClientExtID = new RadiusAccClientExtIDEnt(mib, this);
                            this.radiusAccServExtPacketsDropped = new RadiusAccServExtPacketsDroppedEnt(mib, this);
                            this.radiusAccServExtRequests = new RadiusAccServExtRequestsEnt(mib, this);
                            this.radiusAccServExtDupRequests = new RadiusAccServExtDupRequestsEnt(mib, this);
                            this.radiusAccServExtResponses = new RadiusAccServExtResponsesEnt(mib, this);
                            this.radiusAccServExtBadAuthenticators = new RadiusAccServExtBadAuthenticatorsEnt(mib, this);
                            this.radiusAccServExtMalformedRequests = new RadiusAccServExtMalformedRequestsEnt(mib, this);
                            this.radiusAccServExtNoRecords = new RadiusAccServExtNoRecordsEnt(mib, this);
                            this.radiusAccServExtUnknownTypes = new RadiusAccServExtUnknownTypesEnt(mib, this);
                            this.radiusAccServerCounterDiscontinuity = new RadiusAccServerCounterDiscontinuityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.radiusAccClientExtIndex,
                                this.radiusAccClientInetAddressType,
                                this.radiusAccClientInetAddress,
                                this.radiusAccClientExtID,
                                this.radiusAccServExtPacketsDropped,
                                this.radiusAccServExtRequests,
                                this.radiusAccServExtDupRequests,
                                this.radiusAccServExtResponses,
                                this.radiusAccServExtBadAuthenticators,
                                this.radiusAccServExtMalformedRequests,
                                this.radiusAccServExtNoRecords,
                                this.radiusAccServExtUnknownTypes,
                                this.radiusAccServerCounterDiscontinuity
                            };
                        }
                        public static final class RadiusAccClientExtIndexEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientExtIndexEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientExtIndex", "1.3.6.1.2.1.67.2.1.1.1.15.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientInetAddressTypeEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientInetAddressTypeEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientInetAddressType", "1.3.6.1.2.1.67.2.1.1.1.15.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientInetAddressEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientInetAddressEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientInetAddress", "1.3.6.1.2.1.67.2.1.1.1.15.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccClientExtIDEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccClientExtIDEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccClientExtID", "1.3.6.1.2.1.67.2.1.1.1.15.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtPacketsDroppedEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtPacketsDroppedEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtPacketsDropped", "1.3.6.1.2.1.67.2.1.1.1.15.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtRequests", "1.3.6.1.2.1.67.2.1.1.1.15.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtDupRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtDupRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtDupRequests", "1.3.6.1.2.1.67.2.1.1.1.15.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtResponsesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtResponsesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtResponses", "1.3.6.1.2.1.67.2.1.1.1.15.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtBadAuthenticatorsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtBadAuthenticatorsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtBadAuthenticators", "1.3.6.1.2.1.67.2.1.1.1.15.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtMalformedRequestsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtMalformedRequestsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtMalformedRequests", "1.3.6.1.2.1.67.2.1.1.1.15.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtNoRecordsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtNoRecordsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtNoRecords", "1.3.6.1.2.1.67.2.1.1.1.15.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServExtUnknownTypesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServExtUnknownTypesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServExtUnknownTypes", "1.3.6.1.2.1.67.2.1.1.1.15.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RadiusAccServerCounterDiscontinuityEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                        {
                            private RadiusAccServerCounterDiscontinuityEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                            {
                                super(mib, parent, "radiusAccServerCounterDiscontinuity", "1.3.6.1.2.1.67.2.1.1.1.15.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class RadiusAccServMIBConformanceEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
        {
            public final RadiusAccServMIBCompliancesEnt radiusAccServMIBCompliances;

            public final RadiusAccServMIBGroupsEnt radiusAccServMIBGroups;

            private RadiusAccServMIBConformanceEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusAccServMIBConformance", "1.3.6.1.2.1.67.2.1.2", false, false, false, false);
                this.radiusAccServMIBCompliances = new RadiusAccServMIBCompliancesEnt(mib, this);
                this.radiusAccServMIBGroups = new RadiusAccServMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.radiusAccServMIBCompliances,
                    this.radiusAccServMIBGroups
                };
            }
            public static final class RadiusAccServMIBCompliancesEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
            {
                /** compliance statements*/
                public final RadiusAccServMIBComplianceEnt radiusAccServMIBCompliance;

                public final RadiusAccServExtMIBComplianceEnt radiusAccServExtMIBCompliance;

                private RadiusAccServMIBCompliancesEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusAccServMIBCompliances", "1.3.6.1.2.1.67.2.1.2.1", false, false, false, false);
                    this.radiusAccServMIBCompliance = new RadiusAccServMIBComplianceEnt(mib, this);
                    this.radiusAccServExtMIBCompliance = new RadiusAccServExtMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAccServMIBCompliance,
                        this.radiusAccServExtMIBCompliance
                    };
                }
                public static final class RadiusAccServMIBComplianceEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServMIBComplianceEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServMIBCompliance", "1.3.6.1.2.1.67.2.1.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServExtMIBComplianceEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServExtMIBComplianceEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServExtMIBCompliance", "1.3.6.1.2.1.67.2.1.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RadiusAccServMIBGroupsEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
            {
                /** units of conformance*/
                public final RadiusAccServMIBGroupEnt radiusAccServMIBGroup;

                public final RadiusAccServExtMIBGroupEnt radiusAccServExtMIBGroup;

                private RadiusAccServMIBGroupsEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                {
                    super(mib, parent, "radiusAccServMIBGroups", "1.3.6.1.2.1.67.2.1.2.2", false, false, false, false);
                    this.radiusAccServMIBGroup = new RadiusAccServMIBGroupEnt(mib, this);
                    this.radiusAccServExtMIBGroup = new RadiusAccServExtMIBGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.radiusAccServMIBGroup,
                        this.radiusAccServExtMIBGroup
                    };
                }
                public static final class RadiusAccServMIBGroupEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServMIBGroupEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServMIBGroup", "1.3.6.1.2.1.67.2.1.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RadiusAccServExtMIBGroupEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
                {
                    private RadiusAccServExtMIBGroupEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
                    {
                        super(mib, parent, "radiusAccServExtMIBGroup", "1.3.6.1.2.1.67.2.1.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class RadiusMIBEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
    {
        public final RadiusAccountingEnt radiusAccounting;

        private RadiusMIBEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
        {
            super(mib, parent, "radiusMIB", "1.3.6.1.2.1.67", false, false, false, false);
            this.radiusAccounting = new RadiusAccountingEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.radiusAccounting
            };
        }
        public static final class RadiusAccountingEnt extends MIBEntry<RADIUSACCSERVERMIBDef>
        {
            private RadiusAccountingEnt(RADIUSACCSERVERMIBDef mib, MIBEntry<RADIUSACCSERVERMIBDef> parent)
            {
                super(mib, parent, "radiusAccounting", "1.3.6.1.2.1.67.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
