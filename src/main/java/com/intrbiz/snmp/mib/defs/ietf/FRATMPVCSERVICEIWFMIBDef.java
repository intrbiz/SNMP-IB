package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class FRATMPVCSERVICEIWFMIBDef extends MIB
{
    public static final FRATMPVCSERVICEIWFMIBDef FRATMPVCSERVICEIWFMIB = new FRATMPVCSERVICEIWFMIBDef();

    /** September 28, 2000*/
    public final FrAtmIwfMIBEnt frAtmIwfMIB;

    private FRATMPVCSERVICEIWFMIBDef()
    {
        super("FR-ATM-PVC-SERVICE-IWF-MIB");
        this.frAtmIwfMIB = new FrAtmIwfMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.frAtmIwfMIB
        };
    }

    public static final class FrAtmIwfMIBEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
    {
        /** Object Identifiers*/
        public final FrAtmIwfMIBObjectsEnt frAtmIwfMIBObjects;

        public final FrAtmIwfTrapsEnt frAtmIwfTraps;

        public final FrAtmIwfConformanceEnt frAtmIwfConformance;

        private FrAtmIwfMIBEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
        {
            super(mib, parent, "frAtmIwfMIB", "1.3.6.1.2.1.86", false, false, false, false);
            this.frAtmIwfMIBObjects = new FrAtmIwfMIBObjectsEnt(mib, this);
            this.frAtmIwfTraps = new FrAtmIwfTrapsEnt(mib, this);
            this.frAtmIwfConformance = new FrAtmIwfConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.frAtmIwfMIBObjects,
                this.frAtmIwfTraps,
                this.frAtmIwfConformance
            };
        }
        public static final class FrAtmIwfMIBObjectsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
        {
            /** The FR/ATM PVC Service IWF GroupThe Frame Relay/ATM PVC Service Interworking FunctionConnection Table contains all connections utilizingthe interworking function.*/
            public final FrAtmIwfConnIndexNextEnt frAtmIwfConnIndexNext;

            public final FrAtmIwfConnectionTableEnt frAtmIwfConnectionTable;

            /** The FR/ATM PVC Service IWF Connection Descriptor GroupThe Frame Relay/ATM PVC Service Interworking FunctionConnection Descriptor table.  A descriptor provides theattributes for a type of interworked connection.*/
            public final FrAtmIwfConnectionDescriptorIndexNextEnt frAtmIwfConnectionDescriptorIndexNext;

            public final FrAtmIwfConnectionDescriptorTableEnt frAtmIwfConnectionDescriptorTable;

            /** Augmentation of ATM MIB VCL Endpoint Table (atmVclTable)*/
            public final FrAtmIwfVclTableEnt frAtmIwfVclTable;

            private FrAtmIwfMIBObjectsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
            {
                super(mib, parent, "frAtmIwfMIBObjects", "1.3.6.1.2.1.86.1", false, false, false, false);
                this.frAtmIwfConnIndexNext = new FrAtmIwfConnIndexNextEnt(mib, this);
                this.frAtmIwfConnectionTable = new FrAtmIwfConnectionTableEnt(mib, this);
                this.frAtmIwfConnectionDescriptorIndexNext = new FrAtmIwfConnectionDescriptorIndexNextEnt(mib, this);
                this.frAtmIwfConnectionDescriptorTable = new FrAtmIwfConnectionDescriptorTableEnt(mib, this);
                this.frAtmIwfVclTable = new FrAtmIwfVclTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frAtmIwfConnIndexNext,
                    this.frAtmIwfConnectionTable,
                    this.frAtmIwfConnectionDescriptorIndexNext,
                    this.frAtmIwfConnectionDescriptorTable,
                    this.frAtmIwfVclTable
                };
            }
            public static final class FrAtmIwfConnIndexNextEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                private FrAtmIwfConnIndexNextEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfConnIndexNext", "1.3.6.1.2.1.86.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrAtmIwfConnectionTableEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                public final FrAtmIwfConnectionEntryEnt frAtmIwfConnectionEntry;

                private FrAtmIwfConnectionTableEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfConnectionTable", "1.3.6.1.2.1.86.1.2", false, true, false, false);
                    this.frAtmIwfConnectionEntry = new FrAtmIwfConnectionEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAtmIwfConnectionEntry
                    };
                }
                public static final class FrAtmIwfConnectionEntryEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    public final FrAtmIwfConnIndexEnt frAtmIwfConnIndex;

                    public final FrAtmIwfConnAtmPortEnt frAtmIwfConnAtmPort;

                    public final FrAtmIwfConnVpiEnt frAtmIwfConnVpi;

                    public final FrAtmIwfConnVciEnt frAtmIwfConnVci;

                    public final FrAtmIwfConnFrPortEnt frAtmIwfConnFrPort;

                    public final FrAtmIwfConnDlciEnt frAtmIwfConnDlci;

                    public final FrAtmIwfConnRowStatusEnt frAtmIwfConnRowStatus;

                    public final FrAtmIwfConnAdminStatusEnt frAtmIwfConnAdminStatus;

                    public final FrAtmIwfConnAtm2FrOperStatusEnt frAtmIwfConnAtm2FrOperStatus;

                    public final FrAtmIwfConnAtm2FrLastChangeEnt frAtmIwfConnAtm2FrLastChange;

                    public final FrAtmIwfConnFr2AtmOperStatusEnt frAtmIwfConnFr2AtmOperStatus;

                    public final FrAtmIwfConnFr2AtmLastChangeEnt frAtmIwfConnFr2AtmLastChange;

                    public final FrAtmIwfConnectionDescriptorEnt frAtmIwfConnectionDescriptor;

                    public final FrAtmIwfConnFailedFrameTranslateEnt frAtmIwfConnFailedFrameTranslate;

                    public final FrAtmIwfConnOverSizedFramesEnt frAtmIwfConnOverSizedFrames;

                    public final FrAtmIwfConnFailedAal5PduTranslateEnt frAtmIwfConnFailedAal5PduTranslate;

                    public final FrAtmIwfConnOverSizedSDUsEnt frAtmIwfConnOverSizedSDUs;

                    public final FrAtmIwfConnCrcErrorsEnt frAtmIwfConnCrcErrors;

                    public final FrAtmIwfConnSarTimeOutsEnt frAtmIwfConnSarTimeOuts;

                    private FrAtmIwfConnectionEntryEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfConnectionEntry", "1.3.6.1.2.1.86.1.2.1", false, false, false, true);
                        this.frAtmIwfConnIndex = new FrAtmIwfConnIndexEnt(mib, this);
                        this.frAtmIwfConnAtmPort = new FrAtmIwfConnAtmPortEnt(mib, this);
                        this.frAtmIwfConnVpi = new FrAtmIwfConnVpiEnt(mib, this);
                        this.frAtmIwfConnVci = new FrAtmIwfConnVciEnt(mib, this);
                        this.frAtmIwfConnFrPort = new FrAtmIwfConnFrPortEnt(mib, this);
                        this.frAtmIwfConnDlci = new FrAtmIwfConnDlciEnt(mib, this);
                        this.frAtmIwfConnRowStatus = new FrAtmIwfConnRowStatusEnt(mib, this);
                        this.frAtmIwfConnAdminStatus = new FrAtmIwfConnAdminStatusEnt(mib, this);
                        this.frAtmIwfConnAtm2FrOperStatus = new FrAtmIwfConnAtm2FrOperStatusEnt(mib, this);
                        this.frAtmIwfConnAtm2FrLastChange = new FrAtmIwfConnAtm2FrLastChangeEnt(mib, this);
                        this.frAtmIwfConnFr2AtmOperStatus = new FrAtmIwfConnFr2AtmOperStatusEnt(mib, this);
                        this.frAtmIwfConnFr2AtmLastChange = new FrAtmIwfConnFr2AtmLastChangeEnt(mib, this);
                        this.frAtmIwfConnectionDescriptor = new FrAtmIwfConnectionDescriptorEnt(mib, this);
                        this.frAtmIwfConnFailedFrameTranslate = new FrAtmIwfConnFailedFrameTranslateEnt(mib, this);
                        this.frAtmIwfConnOverSizedFrames = new FrAtmIwfConnOverSizedFramesEnt(mib, this);
                        this.frAtmIwfConnFailedAal5PduTranslate = new FrAtmIwfConnFailedAal5PduTranslateEnt(mib, this);
                        this.frAtmIwfConnOverSizedSDUs = new FrAtmIwfConnOverSizedSDUsEnt(mib, this);
                        this.frAtmIwfConnCrcErrors = new FrAtmIwfConnCrcErrorsEnt(mib, this);
                        this.frAtmIwfConnSarTimeOuts = new FrAtmIwfConnSarTimeOutsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frAtmIwfConnIndex,
                            this.frAtmIwfConnAtmPort,
                            this.frAtmIwfConnVpi,
                            this.frAtmIwfConnVci,
                            this.frAtmIwfConnFrPort,
                            this.frAtmIwfConnDlci,
                            this.frAtmIwfConnRowStatus,
                            this.frAtmIwfConnAdminStatus,
                            this.frAtmIwfConnAtm2FrOperStatus,
                            this.frAtmIwfConnAtm2FrLastChange,
                            this.frAtmIwfConnFr2AtmOperStatus,
                            this.frAtmIwfConnFr2AtmLastChange,
                            this.frAtmIwfConnectionDescriptor,
                            this.frAtmIwfConnFailedFrameTranslate,
                            this.frAtmIwfConnOverSizedFrames,
                            this.frAtmIwfConnFailedAal5PduTranslate,
                            this.frAtmIwfConnOverSizedSDUs,
                            this.frAtmIwfConnCrcErrors,
                            this.frAtmIwfConnSarTimeOuts
                        };
                    }
                    public static final class FrAtmIwfConnIndexEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnIndexEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnIndex", "1.3.6.1.2.1.86.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnAtmPortEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnAtmPortEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnAtmPort", "1.3.6.1.2.1.86.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnVpiEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnVpiEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnVpi", "1.3.6.1.2.1.86.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnVciEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnVciEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnVci", "1.3.6.1.2.1.86.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnFrPortEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnFrPortEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnFrPort", "1.3.6.1.2.1.86.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnDlciEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnDlciEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnDlci", "1.3.6.1.2.1.86.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnRowStatusEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnRowStatusEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnRowStatus", "1.3.6.1.2.1.86.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnAdminStatusEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnAdminStatusEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnAdminStatus", "1.3.6.1.2.1.86.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnAtm2FrOperStatusEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnAtm2FrOperStatusEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnAtm2FrOperStatus", "1.3.6.1.2.1.86.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnAtm2FrLastChangeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnAtm2FrLastChangeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnAtm2FrLastChange", "1.3.6.1.2.1.86.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnFr2AtmOperStatusEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnFr2AtmOperStatusEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnFr2AtmOperStatus", "1.3.6.1.2.1.86.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnFr2AtmLastChangeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnFr2AtmLastChangeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnFr2AtmLastChange", "1.3.6.1.2.1.86.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnectionDescriptorEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnectionDescriptorEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnectionDescriptor", "1.3.6.1.2.1.86.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnFailedFrameTranslateEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnFailedFrameTranslateEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnFailedFrameTranslate", "1.3.6.1.2.1.86.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnOverSizedFramesEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnOverSizedFramesEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnOverSizedFrames", "1.3.6.1.2.1.86.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnFailedAal5PduTranslateEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnFailedAal5PduTranslateEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnFailedAal5PduTranslate", "1.3.6.1.2.1.86.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnOverSizedSDUsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnOverSizedSDUsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnOverSizedSDUs", "1.3.6.1.2.1.86.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnCrcErrorsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnCrcErrorsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnCrcErrors", "1.3.6.1.2.1.86.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnSarTimeOutsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnSarTimeOutsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnSarTimeOuts", "1.3.6.1.2.1.86.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrAtmIwfConnectionDescriptorIndexNextEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                private FrAtmIwfConnectionDescriptorIndexNextEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfConnectionDescriptorIndexNext", "1.3.6.1.2.1.86.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class FrAtmIwfConnectionDescriptorTableEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                public final FrAtmIwfConnectionDescriptorEntryEnt frAtmIwfConnectionDescriptorEntry;

                private FrAtmIwfConnectionDescriptorTableEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfConnectionDescriptorTable", "1.3.6.1.2.1.86.1.4", false, true, false, false);
                    this.frAtmIwfConnectionDescriptorEntry = new FrAtmIwfConnectionDescriptorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAtmIwfConnectionDescriptorEntry
                    };
                }
                public static final class FrAtmIwfConnectionDescriptorEntryEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    public final FrAtmIwfConnectionDescriptorIndexEnt frAtmIwfConnectionDescriptorIndex;

                    public final FrAtmIwfConnDescriptorRowStatusEnt frAtmIwfConnDescriptorRowStatus;

                    public final FrAtmIwfConnDeToClpMappingModeEnt frAtmIwfConnDeToClpMappingMode;

                    public final FrAtmIwfConnClpToDeMappingModeEnt frAtmIwfConnClpToDeMappingMode;

                    public final FrAtmIwfConnCongestionMappingModeEnt frAtmIwfConnCongestionMappingMode;

                    public final FrAtmIwfConnEncapsulationMappingModeEnt frAtmIwfConnEncapsulationMappingMode;

                    public final FrAtmIwfConnEncapsulationMappingsEnt frAtmIwfConnEncapsulationMappings;

                    public final FrAtmIwfConnFragAndReassEnabledEnt frAtmIwfConnFragAndReassEnabled;

                    public final FrAtmIwfConnArpTranslationEnabledEnt frAtmIwfConnArpTranslationEnabled;

                    private FrAtmIwfConnectionDescriptorEntryEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfConnectionDescriptorEntry", "1.3.6.1.2.1.86.1.4.1", false, false, false, true);
                        this.frAtmIwfConnectionDescriptorIndex = new FrAtmIwfConnectionDescriptorIndexEnt(mib, this);
                        this.frAtmIwfConnDescriptorRowStatus = new FrAtmIwfConnDescriptorRowStatusEnt(mib, this);
                        this.frAtmIwfConnDeToClpMappingMode = new FrAtmIwfConnDeToClpMappingModeEnt(mib, this);
                        this.frAtmIwfConnClpToDeMappingMode = new FrAtmIwfConnClpToDeMappingModeEnt(mib, this);
                        this.frAtmIwfConnCongestionMappingMode = new FrAtmIwfConnCongestionMappingModeEnt(mib, this);
                        this.frAtmIwfConnEncapsulationMappingMode = new FrAtmIwfConnEncapsulationMappingModeEnt(mib, this);
                        this.frAtmIwfConnEncapsulationMappings = new FrAtmIwfConnEncapsulationMappingsEnt(mib, this);
                        this.frAtmIwfConnFragAndReassEnabled = new FrAtmIwfConnFragAndReassEnabledEnt(mib, this);
                        this.frAtmIwfConnArpTranslationEnabled = new FrAtmIwfConnArpTranslationEnabledEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frAtmIwfConnectionDescriptorIndex,
                            this.frAtmIwfConnDescriptorRowStatus,
                            this.frAtmIwfConnDeToClpMappingMode,
                            this.frAtmIwfConnClpToDeMappingMode,
                            this.frAtmIwfConnCongestionMappingMode,
                            this.frAtmIwfConnEncapsulationMappingMode,
                            this.frAtmIwfConnEncapsulationMappings,
                            this.frAtmIwfConnFragAndReassEnabled,
                            this.frAtmIwfConnArpTranslationEnabled
                        };
                    }
                    public static final class FrAtmIwfConnectionDescriptorIndexEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnectionDescriptorIndexEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnectionDescriptorIndex", "1.3.6.1.2.1.86.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnDescriptorRowStatusEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnDescriptorRowStatusEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnDescriptorRowStatus", "1.3.6.1.2.1.86.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnDeToClpMappingModeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnDeToClpMappingModeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnDeToClpMappingMode", "1.3.6.1.2.1.86.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnClpToDeMappingModeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnClpToDeMappingModeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnClpToDeMappingMode", "1.3.6.1.2.1.86.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnCongestionMappingModeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnCongestionMappingModeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnCongestionMappingMode", "1.3.6.1.2.1.86.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnEncapsulationMappingModeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnEncapsulationMappingModeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnEncapsulationMappingMode", "1.3.6.1.2.1.86.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnEncapsulationMappingsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnEncapsulationMappingsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnEncapsulationMappings", "1.3.6.1.2.1.86.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnFragAndReassEnabledEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnFragAndReassEnabledEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnFragAndReassEnabled", "1.3.6.1.2.1.86.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class FrAtmIwfConnArpTranslationEnabledEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfConnArpTranslationEnabledEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfConnArpTranslationEnabled", "1.3.6.1.2.1.86.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class FrAtmIwfVclTableEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                public final FrAtmIwfVclEntryEnt frAtmIwfVclEntry;

                private FrAtmIwfVclTableEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfVclTable", "1.3.6.1.2.1.86.1.5", false, true, false, false);
                    this.frAtmIwfVclEntry = new FrAtmIwfVclEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAtmIwfVclEntry
                    };
                }
                public static final class FrAtmIwfVclEntryEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    public final FrAtmIwfVclCrossConnectIdentifierEnt frAtmIwfVclCrossConnectIdentifier;

                    private FrAtmIwfVclEntryEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfVclEntry", "1.3.6.1.2.1.86.1.5.1", false, false, false, true);
                        this.frAtmIwfVclCrossConnectIdentifier = new FrAtmIwfVclCrossConnectIdentifierEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.frAtmIwfVclCrossConnectIdentifier
                        };
                    }
                    public static final class FrAtmIwfVclCrossConnectIdentifierEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                    {
                        private FrAtmIwfVclCrossConnectIdentifierEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                        {
                            super(mib, parent, "frAtmIwfVclCrossConnectIdentifier", "1.3.6.1.2.1.86.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class FrAtmIwfTrapsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
        {
            public final FrAtmIwfTrapsPrefixEnt frAtmIwfTrapsPrefix;

            private FrAtmIwfTrapsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
            {
                super(mib, parent, "frAtmIwfTraps", "1.3.6.1.2.1.86.2", false, false, false, false);
                this.frAtmIwfTrapsPrefix = new FrAtmIwfTrapsPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frAtmIwfTrapsPrefix
                };
            }
            public static final class FrAtmIwfTrapsPrefixEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                /** Frame Relay/ATM PVC Service Interworking NOTIFICATION*/
                public final FrAtmIwfConnStatusChangeEnt frAtmIwfConnStatusChange;

                private FrAtmIwfTrapsPrefixEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfTrapsPrefix", "1.3.6.1.2.1.86.2.0", false, false, false, false);
                    this.frAtmIwfConnStatusChange = new FrAtmIwfConnStatusChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAtmIwfConnStatusChange
                    };
                }
                public static final class FrAtmIwfConnStatusChangeEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfConnStatusChangeEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfConnStatusChange", "1.3.6.1.2.1.86.2.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class FrAtmIwfConformanceEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
        {
            public final FrAtmIwfGroupsEnt frAtmIwfGroups;

            public final FrAtmIwfCompliancesEnt frAtmIwfCompliances;

            private FrAtmIwfConformanceEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
            {
                super(mib, parent, "frAtmIwfConformance", "1.3.6.1.2.1.86.3", false, false, false, false);
                this.frAtmIwfGroups = new FrAtmIwfGroupsEnt(mib, this);
                this.frAtmIwfCompliances = new FrAtmIwfCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.frAtmIwfGroups,
                    this.frAtmIwfCompliances
                };
            }
            public static final class FrAtmIwfGroupsEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                /** Units of Conformance
Basic FR/ATM IWF PVC Connection Group*/
                public final FrAtmIwfBasicGroupEnt frAtmIwfBasicGroup;

                /** FR/ATM IWF PVC Connection Descriptor Group*/
                public final FrAtmIwfConnectionDescriptorGroupEnt frAtmIwfConnectionDescriptorGroup;

                /** ATM MIB VCL Endpoint Table Augmentation Group*/
                public final FrAtmIwfAtmVclTableAugmentGroupEnt frAtmIwfAtmVclTableAugmentGroup;

                /** Notification Group*/
                public final FrAtmIwfNotificationsGroupEnt frAtmIwfNotificationsGroup;

                private FrAtmIwfGroupsEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfGroups", "1.3.6.1.2.1.86.3.1", false, false, false, false);
                    this.frAtmIwfBasicGroup = new FrAtmIwfBasicGroupEnt(mib, this);
                    this.frAtmIwfConnectionDescriptorGroup = new FrAtmIwfConnectionDescriptorGroupEnt(mib, this);
                    this.frAtmIwfAtmVclTableAugmentGroup = new FrAtmIwfAtmVclTableAugmentGroupEnt(mib, this);
                    this.frAtmIwfNotificationsGroup = new FrAtmIwfNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAtmIwfBasicGroup,
                        this.frAtmIwfConnectionDescriptorGroup,
                        this.frAtmIwfAtmVclTableAugmentGroup,
                        this.frAtmIwfNotificationsGroup
                    };
                }
                public static final class FrAtmIwfBasicGroupEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfBasicGroupEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfBasicGroup", "1.3.6.1.2.1.86.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrAtmIwfConnectionDescriptorGroupEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfConnectionDescriptorGroupEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfConnectionDescriptorGroup", "1.3.6.1.2.1.86.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrAtmIwfAtmVclTableAugmentGroupEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfAtmVclTableAugmentGroupEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfAtmVclTableAugmentGroup", "1.3.6.1.2.1.86.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrAtmIwfNotificationsGroupEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfNotificationsGroupEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfNotificationsGroup", "1.3.6.1.2.1.86.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FrAtmIwfCompliancesEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
            {
                /** Conformance Information
Compliance Statement For Equipment*/
                public final FrAtmIwfEquipmentComplianceEnt frAtmIwfEquipmentCompliance;

                /** Compliance Statement For Service (CNM Interface)*/
                public final FrAtmIwfServiceComplianceEnt frAtmIwfServiceCompliance;

                private FrAtmIwfCompliancesEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                {
                    super(mib, parent, "frAtmIwfCompliances", "1.3.6.1.2.1.86.3.2", false, false, false, false);
                    this.frAtmIwfEquipmentCompliance = new FrAtmIwfEquipmentComplianceEnt(mib, this);
                    this.frAtmIwfServiceCompliance = new FrAtmIwfServiceComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.frAtmIwfEquipmentCompliance,
                        this.frAtmIwfServiceCompliance
                    };
                }
                public static final class FrAtmIwfEquipmentComplianceEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfEquipmentComplianceEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfEquipmentCompliance", "1.3.6.1.2.1.86.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FrAtmIwfServiceComplianceEnt extends MIBEntry<FRATMPVCSERVICEIWFMIBDef>
                {
                    private FrAtmIwfServiceComplianceEnt(FRATMPVCSERVICEIWFMIBDef mib, MIBEntry<FRATMPVCSERVICEIWFMIBDef> parent)
                    {
                        super(mib, parent, "frAtmIwfServiceCompliance", "1.3.6.1.2.1.86.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
