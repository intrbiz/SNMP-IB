package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SIPMIBDef extends MIB
{
    public static final SIPMIBDef SIPMIB = new SIPMIBDef();

    static { MIBs.getInstance().registerMIB(SIPMIBDef.SIPMIB); }

    /** This is the MIB module for the SMDS Interface objects.*/
    public final SipMIBEnt sipMIB;

    public final SipEnt sip;

    private SIPMIBDef()
    {
        super("SIP-MIB");
        this.sipMIB = new SipMIBEnt(this, null);
        this.sip = new SipEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sipMIB,
            this.sip
        };
    }

    public static final class SipMIBEnt extends MIBEntry<SIPMIBDef>
    {
        public final SipMIBObjectsEnt sipMIBObjects;

        /** conformance information*/
        public final SmdsConformanceEnt smdsConformance;

        private SipMIBEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
        {
            super(mib, parent, "sipMIB", "1.3.6.1.2.1.36", false, false, false, false);
            this.sipMIBObjects = new SipMIBObjectsEnt(mib, this);
            this.smdsConformance = new SmdsConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sipMIBObjects,
                this.smdsConformance
            };
        }
        public static final class SipMIBObjectsEnt extends MIBEntry<SIPMIBDef>
        {
            /** The DXI Group*/
            public final SipDxiTableEnt sipDxiTable;

            private SipMIBObjectsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "sipMIBObjects", "1.3.6.1.2.1.36.1", false, false, false, false);
                this.sipDxiTable = new SipDxiTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipDxiTable
                };
            }
            public static final class SipDxiTableEnt extends MIBEntry<SIPMIBDef>
            {
                public final SipDxiEntryEnt sipDxiEntry;

                private SipDxiTableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "sipDxiTable", "1.3.6.1.2.1.36.1.1", false, true, false, false);
                    this.sipDxiEntry = new SipDxiEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipDxiEntry
                    };
                }
                public static final class SipDxiEntryEnt extends MIBEntry<SIPMIBDef>
                {
                    public final SipDxiCrcEnt sipDxiCrc;

                    public final SipDxiOutDiscardsEnt sipDxiOutDiscards;

                    public final SipDxiInErrorsEnt sipDxiInErrors;

                    public final SipDxiInAbortsEnt sipDxiInAborts;

                    public final SipDxiInTestFramesEnt sipDxiInTestFrames;

                    public final SipDxiOutTestFramesEnt sipDxiOutTestFrames;

                    public final SipDxiHbpNoAcksEnt sipDxiHbpNoAcks;

                    private SipDxiEntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipDxiEntry", "1.3.6.1.2.1.36.1.1.1", false, false, false, true);
                        this.sipDxiCrc = new SipDxiCrcEnt(mib, this);
                        this.sipDxiOutDiscards = new SipDxiOutDiscardsEnt(mib, this);
                        this.sipDxiInErrors = new SipDxiInErrorsEnt(mib, this);
                        this.sipDxiInAborts = new SipDxiInAbortsEnt(mib, this);
                        this.sipDxiInTestFrames = new SipDxiInTestFramesEnt(mib, this);
                        this.sipDxiOutTestFrames = new SipDxiOutTestFramesEnt(mib, this);
                        this.sipDxiHbpNoAcks = new SipDxiHbpNoAcksEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipDxiCrc,
                            this.sipDxiOutDiscards,
                            this.sipDxiInErrors,
                            this.sipDxiInAborts,
                            this.sipDxiInTestFrames,
                            this.sipDxiOutTestFrames,
                            this.sipDxiHbpNoAcks
                        };
                    }
                    public static final class SipDxiCrcEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiCrcEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiCrc", "1.3.6.1.2.1.36.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDxiOutDiscardsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiOutDiscardsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiOutDiscards", "1.3.6.1.2.1.36.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDxiInErrorsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiInErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiInErrors", "1.3.6.1.2.1.36.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDxiInAbortsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiInAbortsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiInAborts", "1.3.6.1.2.1.36.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDxiInTestFramesEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiInTestFramesEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiInTestFrames", "1.3.6.1.2.1.36.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDxiOutTestFramesEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiOutTestFramesEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiOutTestFrames", "1.3.6.1.2.1.36.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDxiHbpNoAcksEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDxiHbpNoAcksEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDxiHbpNoAcks", "1.3.6.1.2.1.36.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SmdsConformanceEnt extends MIBEntry<SIPMIBDef>
        {
            public final SmdsGroupsEnt smdsGroups;

            public final SmdsCompliancesEnt smdsCompliances;

            private SmdsConformanceEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "smdsConformance", "1.3.6.1.2.1.36.2", false, false, false, false);
                this.smdsGroups = new SmdsGroupsEnt(mib, this);
                this.smdsCompliances = new SmdsCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.smdsGroups,
                    this.smdsCompliances
                };
            }
            public static final class SmdsGroupsEnt extends MIBEntry<SIPMIBDef>
            {
                /** units of conformance*/
                public final SipLevel3StuffEnt sipLevel3Stuff;

                public final SipLevel2StuffEnt sipLevel2Stuff;

                public final SipDS1PLCPStuffEnt sipDS1PLCPStuff;

                public final SipDS3PLCPStuffEnt sipDS3PLCPStuff;

                public final SipIPApplicationsStuffEnt sipIPApplicationsStuff;

                public final SipDxiStuffEnt sipDxiStuff;

                private SmdsGroupsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "smdsGroups", "1.3.6.1.2.1.36.2.1", false, false, false, false);
                    this.sipLevel3Stuff = new SipLevel3StuffEnt(mib, this);
                    this.sipLevel2Stuff = new SipLevel2StuffEnt(mib, this);
                    this.sipDS1PLCPStuff = new SipDS1PLCPStuffEnt(mib, this);
                    this.sipDS3PLCPStuff = new SipDS3PLCPStuffEnt(mib, this);
                    this.sipIPApplicationsStuff = new SipIPApplicationsStuffEnt(mib, this);
                    this.sipDxiStuff = new SipDxiStuffEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipLevel3Stuff,
                        this.sipLevel2Stuff,
                        this.sipDS1PLCPStuff,
                        this.sipDS3PLCPStuff,
                        this.sipIPApplicationsStuff,
                        this.sipDxiStuff
                    };
                }
                public static final class SipLevel3StuffEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipLevel3StuffEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipLevel3Stuff", "1.3.6.1.2.1.36.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipLevel2StuffEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipLevel2StuffEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipLevel2Stuff", "1.3.6.1.2.1.36.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipDS1PLCPStuffEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipDS1PLCPStuffEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipDS1PLCPStuff", "1.3.6.1.2.1.36.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipDS3PLCPStuffEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipDS3PLCPStuffEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipDS3PLCPStuff", "1.3.6.1.2.1.36.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipIPApplicationsStuffEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipIPApplicationsStuffEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipIPApplicationsStuff", "1.3.6.1.2.1.36.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipDxiStuffEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipDxiStuffEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipDxiStuff", "1.3.6.1.2.1.36.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SmdsCompliancesEnt extends MIBEntry<SIPMIBDef>
            {
                /** compliance statements*/
                public final SmdsComplianceEnt smdsCompliance;

                private SmdsCompliancesEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "smdsCompliances", "1.3.6.1.2.1.36.2.2", false, false, false, false);
                    this.smdsCompliance = new SmdsComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.smdsCompliance
                    };
                }
                public static final class SmdsComplianceEnt extends MIBEntry<SIPMIBDef>
                {
                    private SmdsComplianceEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "smdsCompliance", "1.3.6.1.2.1.36.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SipEnt extends MIBEntry<SIPMIBDef>
    {
        /** The SIP Level 3 Group*/
        public final SipL3TableEnt sipL3Table;

        /** The SIP Level 2 Group*/
        public final SipL2TableEnt sipL2Table;

        /** The SIP PLCP Group*/
        public final SipPLCPEnt sipPLCP;

        /** The SMDS Applications groupApplications that have been identified for this group are:
* IP-over-SMDS (details are specified in RFC 1209)*/
        public final SmdsApplicationsEnt smdsApplications;

        /** The SMDS Carrier Selection group
This group is used as a place holderfor carrier selection objects.*/
        public final SmdsCarrierSelectionEnt smdsCarrierSelection;

        /** The SIP Error Log*/
        public final SipErrorLogEnt sipErrorLog;

        private SipEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
        {
            super(mib, parent, "sip", "1.3.6.1.2.1.10.31", false, false, false, false);
            this.sipL3Table = new SipL3TableEnt(mib, this);
            this.sipL2Table = new SipL2TableEnt(mib, this);
            this.sipPLCP = new SipPLCPEnt(mib, this);
            this.smdsApplications = new SmdsApplicationsEnt(mib, this);
            this.smdsCarrierSelection = new SmdsCarrierSelectionEnt(mib, this);
            this.sipErrorLog = new SipErrorLogEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sipL3Table,
                this.sipL2Table,
                this.sipPLCP,
                this.smdsApplications,
                this.smdsCarrierSelection,
                this.sipErrorLog
            };
        }
        public static final class SipL3TableEnt extends MIBEntry<SIPMIBDef>
        {
            public final SipL3EntryEnt sipL3Entry;

            private SipL3TableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "sipL3Table", "1.3.6.1.2.1.10.31.1", false, true, false, false);
                this.sipL3Entry = new SipL3EntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipL3Entry
                };
            }
            public static final class SipL3EntryEnt extends MIBEntry<SIPMIBDef>
            {
                public final SipL3IndexEnt sipL3Index;

                /** Moved to ifTable
ifInUcastPkts defined in [9] must be used instead.*/
                public final SipL3ReceivedIndividualDAsEnt sipL3ReceivedIndividualDAs;

                /** Moved to ifTable
ifInMulticastPkts defined in [9] must be used instead.*/
                public final SipL3ReceivedGAsEnt sipL3ReceivedGAs;

                public final SipL3UnrecognizedIndividualDAsEnt sipL3UnrecognizedIndividualDAs;

                public final SipL3UnrecognizedGAsEnt sipL3UnrecognizedGAs;

                /** Moved to ifTable
ifOutUcastPkts defined in [9] must be used instead.*/
                public final SipL3SentIndividualDAsEnt sipL3SentIndividualDAs;

                /** Moved to ifTable
ifOutMulticastPkts defined in [9] must be used instead.*/
                public final SipL3SentGAsEnt sipL3SentGAs;

                /** The total number of SIP L3PDU errors can be calculated as(Syntactic errors + Semantic Service errors )Syntactic errors include:sipL3ErrorsLatest occurrences of syntactic error types are logged insipL3PDUErrorTable.Semantic Service errors include:
sipL3UnrecognizedIndividualDAssipL3UnrecognizedGAssipL3InvalidSMDSAddressTypesNote that public networks supporting SMDS may discardSIP L3PDUs due to subscription violations.  Relatedmanaged objects are defined in Definitions of ManagedObjects for SMDS Subscription.

Moved to ifTable
ifInErrors defined in [9] must be used instead.*/
                public final SipL3ErrorsEnt sipL3Errors;

                /** Moved to ifTable
ifInUnknownProtos defined in [9] must be used instead.*/
                public final SipL3InvalidSMDSAddressTypesEnt sipL3InvalidSMDSAddressTypes;

                public final SipL3VersionSupportEnt sipL3VersionSupport;

                private SipL3EntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "sipL3Entry", "1.3.6.1.2.1.10.31.1.1", false, false, false, true);
                    this.sipL3Index = new SipL3IndexEnt(mib, this);
                    this.sipL3ReceivedIndividualDAs = new SipL3ReceivedIndividualDAsEnt(mib, this);
                    this.sipL3ReceivedGAs = new SipL3ReceivedGAsEnt(mib, this);
                    this.sipL3UnrecognizedIndividualDAs = new SipL3UnrecognizedIndividualDAsEnt(mib, this);
                    this.sipL3UnrecognizedGAs = new SipL3UnrecognizedGAsEnt(mib, this);
                    this.sipL3SentIndividualDAs = new SipL3SentIndividualDAsEnt(mib, this);
                    this.sipL3SentGAs = new SipL3SentGAsEnt(mib, this);
                    this.sipL3Errors = new SipL3ErrorsEnt(mib, this);
                    this.sipL3InvalidSMDSAddressTypes = new SipL3InvalidSMDSAddressTypesEnt(mib, this);
                    this.sipL3VersionSupport = new SipL3VersionSupportEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipL3Index,
                        this.sipL3ReceivedIndividualDAs,
                        this.sipL3ReceivedGAs,
                        this.sipL3UnrecognizedIndividualDAs,
                        this.sipL3UnrecognizedGAs,
                        this.sipL3SentIndividualDAs,
                        this.sipL3SentGAs,
                        this.sipL3Errors,
                        this.sipL3InvalidSMDSAddressTypes,
                        this.sipL3VersionSupport
                    };
                }
                public static final class SipL3IndexEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3IndexEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3Index", "1.3.6.1.2.1.10.31.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3ReceivedIndividualDAsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3ReceivedIndividualDAsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3ReceivedIndividualDAs", "1.3.6.1.2.1.10.31.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3ReceivedGAsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3ReceivedGAsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3ReceivedGAs", "1.3.6.1.2.1.10.31.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3UnrecognizedIndividualDAsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3UnrecognizedIndividualDAsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3UnrecognizedIndividualDAs", "1.3.6.1.2.1.10.31.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3UnrecognizedGAsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3UnrecognizedGAsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3UnrecognizedGAs", "1.3.6.1.2.1.10.31.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3SentIndividualDAsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3SentIndividualDAsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3SentIndividualDAs", "1.3.6.1.2.1.10.31.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3SentGAsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3SentGAsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3SentGAs", "1.3.6.1.2.1.10.31.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3ErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3ErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3Errors", "1.3.6.1.2.1.10.31.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3InvalidSMDSAddressTypesEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3InvalidSMDSAddressTypesEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3InvalidSMDSAddressTypes", "1.3.6.1.2.1.10.31.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL3VersionSupportEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL3VersionSupportEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3VersionSupport", "1.3.6.1.2.1.10.31.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SipL2TableEnt extends MIBEntry<SIPMIBDef>
        {
            public final SipL2EntryEnt sipL2Entry;

            private SipL2TableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "sipL2Table", "1.3.6.1.2.1.10.31.2", false, true, false, false);
                this.sipL2Entry = new SipL2EntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipL2Entry
                };
            }
            public static final class SipL2EntryEnt extends MIBEntry<SIPMIBDef>
            {
                public final SipL2IndexEnt sipL2Index;

                public final SipL2ReceivedCountsEnt sipL2ReceivedCounts;

                public final SipL2SentCountsEnt sipL2SentCounts;

                /** The following error types are counted, andpreclude sipL2ReceivedCounts to be incremented:sipL2HcsOrCRCErrorssipL2PayloadLengthErrorssipL2SequenceNumberErrorssipL2BomOrSSMsMIDErrorssipL2EomsMIDErrorsThe receipt of SIP Level 2 PDUs which are BOMs andfor with a MID that is already active will causesipL2MidCurrentlyActiveErrors to increment.Any already accumulated (correct) segmentationunits are discarded.The sipL2ReceivedCountsis incremented by 1. Thus,sipL2ReceivedCounts defines the number ofcorrect SIP Level 2 PDUs delivered to the reassemblyprocess.*/
                public final SipL2HcsOrCRCErrorsEnt sipL2HcsOrCRCErrors;

                public final SipL2PayloadLengthErrorsEnt sipL2PayloadLengthErrors;

                public final SipL2SequenceNumberErrorsEnt sipL2SequenceNumberErrors;

                public final SipL2MidCurrentlyActiveErrorsEnt sipL2MidCurrentlyActiveErrors;

                public final SipL2BomOrSSMsMIDErrorsEnt sipL2BomOrSSMsMIDErrors;

                public final SipL2EomsMIDErrorsEnt sipL2EomsMIDErrors;

                private SipL2EntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "sipL2Entry", "1.3.6.1.2.1.10.31.2.1", false, false, false, true);
                    this.sipL2Index = new SipL2IndexEnt(mib, this);
                    this.sipL2ReceivedCounts = new SipL2ReceivedCountsEnt(mib, this);
                    this.sipL2SentCounts = new SipL2SentCountsEnt(mib, this);
                    this.sipL2HcsOrCRCErrors = new SipL2HcsOrCRCErrorsEnt(mib, this);
                    this.sipL2PayloadLengthErrors = new SipL2PayloadLengthErrorsEnt(mib, this);
                    this.sipL2SequenceNumberErrors = new SipL2SequenceNumberErrorsEnt(mib, this);
                    this.sipL2MidCurrentlyActiveErrors = new SipL2MidCurrentlyActiveErrorsEnt(mib, this);
                    this.sipL2BomOrSSMsMIDErrors = new SipL2BomOrSSMsMIDErrorsEnt(mib, this);
                    this.sipL2EomsMIDErrors = new SipL2EomsMIDErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipL2Index,
                        this.sipL2ReceivedCounts,
                        this.sipL2SentCounts,
                        this.sipL2HcsOrCRCErrors,
                        this.sipL2PayloadLengthErrors,
                        this.sipL2SequenceNumberErrors,
                        this.sipL2MidCurrentlyActiveErrors,
                        this.sipL2BomOrSSMsMIDErrors,
                        this.sipL2EomsMIDErrors
                    };
                }
                public static final class SipL2IndexEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2IndexEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2Index", "1.3.6.1.2.1.10.31.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2ReceivedCountsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2ReceivedCountsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2ReceivedCounts", "1.3.6.1.2.1.10.31.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2SentCountsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2SentCountsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2SentCounts", "1.3.6.1.2.1.10.31.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2HcsOrCRCErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2HcsOrCRCErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2HcsOrCRCErrors", "1.3.6.1.2.1.10.31.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2PayloadLengthErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2PayloadLengthErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2PayloadLengthErrors", "1.3.6.1.2.1.10.31.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2SequenceNumberErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2SequenceNumberErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2SequenceNumberErrors", "1.3.6.1.2.1.10.31.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2MidCurrentlyActiveErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2MidCurrentlyActiveErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2MidCurrentlyActiveErrors", "1.3.6.1.2.1.10.31.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2BomOrSSMsMIDErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2BomOrSSMsMIDErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2BomOrSSMsMIDErrors", "1.3.6.1.2.1.10.31.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SipL2EomsMIDErrorsEnt extends MIBEntry<SIPMIBDef>
                {
                    private SipL2EomsMIDErrorsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL2EomsMIDErrors", "1.3.6.1.2.1.10.31.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SipPLCPEnt extends MIBEntry<SIPMIBDef>
        {
            /** The DS1 PLCP Group*/
            public final SipDS1PLCPTableEnt sipDS1PLCPTable;

            /** The DS3 PLCP Group*/
            public final SipDS3PLCPTableEnt sipDS3PLCPTable;

            private SipPLCPEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "sipPLCP", "1.3.6.1.2.1.10.31.3", false, false, false, false);
                this.sipDS1PLCPTable = new SipDS1PLCPTableEnt(mib, this);
                this.sipDS3PLCPTable = new SipDS3PLCPTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipDS1PLCPTable,
                    this.sipDS3PLCPTable
                };
            }
            public static final class SipDS1PLCPTableEnt extends MIBEntry<SIPMIBDef>
            {
                public final SipDS1PLCPEntryEnt sipDS1PLCPEntry;

                private SipDS1PLCPTableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "sipDS1PLCPTable", "1.3.6.1.2.1.10.31.3.1", false, true, false, false);
                    this.sipDS1PLCPEntry = new SipDS1PLCPEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipDS1PLCPEntry
                    };
                }
                public static final class SipDS1PLCPEntryEnt extends MIBEntry<SIPMIBDef>
                {
                    public final SipDS1PLCPIndexEnt sipDS1PLCPIndex;

                    public final SipDS1PLCPSEFSsEnt sipDS1PLCPSEFSs;

                    public final SipDS1PLCPAlarmStateEnt sipDS1PLCPAlarmState;

                    public final SipDS1PLCPUASsEnt sipDS1PLCPUASs;

                    private SipDS1PLCPEntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipDS1PLCPEntry", "1.3.6.1.2.1.10.31.3.1.1", false, false, false, true);
                        this.sipDS1PLCPIndex = new SipDS1PLCPIndexEnt(mib, this);
                        this.sipDS1PLCPSEFSs = new SipDS1PLCPSEFSsEnt(mib, this);
                        this.sipDS1PLCPAlarmState = new SipDS1PLCPAlarmStateEnt(mib, this);
                        this.sipDS1PLCPUASs = new SipDS1PLCPUASsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipDS1PLCPIndex,
                            this.sipDS1PLCPSEFSs,
                            this.sipDS1PLCPAlarmState,
                            this.sipDS1PLCPUASs
                        };
                    }
                    public static final class SipDS1PLCPIndexEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS1PLCPIndexEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS1PLCPIndex", "1.3.6.1.2.1.10.31.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDS1PLCPSEFSsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS1PLCPSEFSsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS1PLCPSEFSs", "1.3.6.1.2.1.10.31.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDS1PLCPAlarmStateEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS1PLCPAlarmStateEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS1PLCPAlarmState", "1.3.6.1.2.1.10.31.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDS1PLCPUASsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS1PLCPUASsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS1PLCPUASs", "1.3.6.1.2.1.10.31.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SipDS3PLCPTableEnt extends MIBEntry<SIPMIBDef>
            {
                public final SipDS3PLCPEntryEnt sipDS3PLCPEntry;

                private SipDS3PLCPTableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "sipDS3PLCPTable", "1.3.6.1.2.1.10.31.3.2", false, true, false, false);
                    this.sipDS3PLCPEntry = new SipDS3PLCPEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipDS3PLCPEntry
                    };
                }
                public static final class SipDS3PLCPEntryEnt extends MIBEntry<SIPMIBDef>
                {
                    public final SipDS3PLCPIndexEnt sipDS3PLCPIndex;

                    public final SipDS3PLCPSEFSsEnt sipDS3PLCPSEFSs;

                    public final SipDS3PLCPAlarmStateEnt sipDS3PLCPAlarmState;

                    public final SipDS3PLCPUASsEnt sipDS3PLCPUASs;

                    private SipDS3PLCPEntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipDS3PLCPEntry", "1.3.6.1.2.1.10.31.3.2.1", false, false, false, true);
                        this.sipDS3PLCPIndex = new SipDS3PLCPIndexEnt(mib, this);
                        this.sipDS3PLCPSEFSs = new SipDS3PLCPSEFSsEnt(mib, this);
                        this.sipDS3PLCPAlarmState = new SipDS3PLCPAlarmStateEnt(mib, this);
                        this.sipDS3PLCPUASs = new SipDS3PLCPUASsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipDS3PLCPIndex,
                            this.sipDS3PLCPSEFSs,
                            this.sipDS3PLCPAlarmState,
                            this.sipDS3PLCPUASs
                        };
                    }
                    public static final class SipDS3PLCPIndexEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS3PLCPIndexEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS3PLCPIndex", "1.3.6.1.2.1.10.31.3.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDS3PLCPSEFSsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS3PLCPSEFSsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS3PLCPSEFSs", "1.3.6.1.2.1.10.31.3.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDS3PLCPAlarmStateEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS3PLCPAlarmStateEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS3PLCPAlarmState", "1.3.6.1.2.1.10.31.3.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipDS3PLCPUASsEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipDS3PLCPUASsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipDS3PLCPUASs", "1.3.6.1.2.1.10.31.3.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SmdsApplicationsEnt extends MIBEntry<SIPMIBDef>
        {
            public final IpOverSMDSEnt ipOverSMDS;

            private SmdsApplicationsEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "smdsApplications", "1.3.6.1.2.1.10.31.4", false, false, false, false);
                this.ipOverSMDS = new IpOverSMDSEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipOverSMDS
                };
            }
            public static final class IpOverSMDSEnt extends MIBEntry<SIPMIBDef>
            {
                /** Although the objects in this group are read-only, at theagent's discretion they may be made read-write so that themanagement station, when appropriately authorized, maychange the addressing information related to theconfiguration of a logical IP subnetwork implemented ontop of SMDS.
This table is necessary to support RFC1209 (IP-over-SMDS)and gives information on the Group Addresses and ARPAddresses used in the Logical IP subnetwork.One SMDS address may be associated with multiple IPaddresses.  One SNI may be associated with multiple LISs.*/
                public final IpOverSMDSTableEnt ipOverSMDSTable;

                private IpOverSMDSEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "ipOverSMDS", "1.3.6.1.2.1.10.31.4.1", false, false, false, false);
                    this.ipOverSMDSTable = new IpOverSMDSTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipOverSMDSTable
                    };
                }
                public static final class IpOverSMDSTableEnt extends MIBEntry<SIPMIBDef>
                {
                    public final IpOverSMDSEntryEnt ipOverSMDSEntry;

                    private IpOverSMDSTableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "ipOverSMDSTable", "1.3.6.1.2.1.10.31.4.1.1", false, true, false, false);
                        this.ipOverSMDSEntry = new IpOverSMDSEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ipOverSMDSEntry
                        };
                    }
                    public static final class IpOverSMDSEntryEnt extends MIBEntry<SIPMIBDef>
                    {
                        public final IpOverSMDSIndexEnt ipOverSMDSIndex;

                        public final IpOverSMDSAddressEnt ipOverSMDSAddress;

                        public final IpOverSMDSHAEnt ipOverSMDSHA;

                        public final IpOverSMDSLISGAEnt ipOverSMDSLISGA;

                        public final IpOverSMDSARPReqEnt ipOverSMDSARPReq;

                        private IpOverSMDSEntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "ipOverSMDSEntry", "1.3.6.1.2.1.10.31.4.1.1.1", false, false, false, true);
                            this.ipOverSMDSIndex = new IpOverSMDSIndexEnt(mib, this);
                            this.ipOverSMDSAddress = new IpOverSMDSAddressEnt(mib, this);
                            this.ipOverSMDSHA = new IpOverSMDSHAEnt(mib, this);
                            this.ipOverSMDSLISGA = new IpOverSMDSLISGAEnt(mib, this);
                            this.ipOverSMDSARPReq = new IpOverSMDSARPReqEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.ipOverSMDSIndex,
                                this.ipOverSMDSAddress,
                                this.ipOverSMDSHA,
                                this.ipOverSMDSLISGA,
                                this.ipOverSMDSARPReq
                            };
                        }
                        public static final class IpOverSMDSIndexEnt extends MIBEntry<SIPMIBDef>
                        {
                            private IpOverSMDSIndexEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                            {
                                super(mib, parent, "ipOverSMDSIndex", "1.3.6.1.2.1.10.31.4.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpOverSMDSAddressEnt extends MIBEntry<SIPMIBDef>
                        {
                            private IpOverSMDSAddressEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                            {
                                super(mib, parent, "ipOverSMDSAddress", "1.3.6.1.2.1.10.31.4.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpOverSMDSHAEnt extends MIBEntry<SIPMIBDef>
                        {
                            private IpOverSMDSHAEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                            {
                                super(mib, parent, "ipOverSMDSHA", "1.3.6.1.2.1.10.31.4.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpOverSMDSLISGAEnt extends MIBEntry<SIPMIBDef>
                        {
                            private IpOverSMDSLISGAEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                            {
                                super(mib, parent, "ipOverSMDSLISGA", "1.3.6.1.2.1.10.31.4.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class IpOverSMDSARPReqEnt extends MIBEntry<SIPMIBDef>
                        {
                            private IpOverSMDSARPReqEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                            {
                                super(mib, parent, "ipOverSMDSARPReq", "1.3.6.1.2.1.10.31.4.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SmdsCarrierSelectionEnt extends MIBEntry<SIPMIBDef>
        {
            private SmdsCarrierSelectionEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "smdsCarrierSelection", "1.3.6.1.2.1.10.31.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SipErrorLogEnt extends MIBEntry<SIPMIBDef>
        {
            public final SipL3PDUErrorTableEnt sipL3PDUErrorTable;

            private SipErrorLogEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
            {
                super(mib, parent, "sipErrorLog", "1.3.6.1.2.1.10.31.6", false, false, false, false);
                this.sipL3PDUErrorTable = new SipL3PDUErrorTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipL3PDUErrorTable
                };
            }
            public static final class SipL3PDUErrorTableEnt extends MIBEntry<SIPMIBDef>
            {
                public final SipL3PDUErrorEntryEnt sipL3PDUErrorEntry;

                private SipL3PDUErrorTableEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                {
                    super(mib, parent, "sipL3PDUErrorTable", "1.3.6.1.2.1.10.31.6.1", false, true, false, false);
                    this.sipL3PDUErrorEntry = new SipL3PDUErrorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipL3PDUErrorEntry
                    };
                }
                public static final class SipL3PDUErrorEntryEnt extends MIBEntry<SIPMIBDef>
                {
                    public final SipL3PDUErrorIndexEnt sipL3PDUErrorIndex;

                    public final SipL3PDUErrorTypeEnt sipL3PDUErrorType;

                    public final SipL3PDUErrorSAEnt sipL3PDUErrorSA;

                    public final SipL3PDUErrorDAEnt sipL3PDUErrorDA;

                    public final SipL3PDUErrorTimeStampEnt sipL3PDUErrorTimeStamp;

                    private SipL3PDUErrorEntryEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                    {
                        super(mib, parent, "sipL3PDUErrorEntry", "1.3.6.1.2.1.10.31.6.1.1", false, false, false, true);
                        this.sipL3PDUErrorIndex = new SipL3PDUErrorIndexEnt(mib, this);
                        this.sipL3PDUErrorType = new SipL3PDUErrorTypeEnt(mib, this);
                        this.sipL3PDUErrorSA = new SipL3PDUErrorSAEnt(mib, this);
                        this.sipL3PDUErrorDA = new SipL3PDUErrorDAEnt(mib, this);
                        this.sipL3PDUErrorTimeStamp = new SipL3PDUErrorTimeStampEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipL3PDUErrorIndex,
                            this.sipL3PDUErrorType,
                            this.sipL3PDUErrorSA,
                            this.sipL3PDUErrorDA,
                            this.sipL3PDUErrorTimeStamp
                        };
                    }
                    public static final class SipL3PDUErrorIndexEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipL3PDUErrorIndexEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipL3PDUErrorIndex", "1.3.6.1.2.1.10.31.6.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipL3PDUErrorTypeEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipL3PDUErrorTypeEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipL3PDUErrorType", "1.3.6.1.2.1.10.31.6.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipL3PDUErrorSAEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipL3PDUErrorSAEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipL3PDUErrorSA", "1.3.6.1.2.1.10.31.6.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipL3PDUErrorDAEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipL3PDUErrorDAEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipL3PDUErrorDA", "1.3.6.1.2.1.10.31.6.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SipL3PDUErrorTimeStampEnt extends MIBEntry<SIPMIBDef>
                    {
                        private SipL3PDUErrorTimeStampEnt(SIPMIBDef mib, MIBEntry<SIPMIBDef> parent)
                        {
                            super(mib, parent, "sipL3PDUErrorTimeStamp", "1.3.6.1.2.1.10.31.6.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
