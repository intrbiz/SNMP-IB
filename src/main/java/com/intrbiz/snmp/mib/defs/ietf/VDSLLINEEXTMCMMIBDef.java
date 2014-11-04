package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]*/
public final class VDSLLINEEXTMCMMIBDef extends MIB
{
    public static final VDSLLINEEXTMCMMIBDef VDSLLINEEXTMCMMIB = new VDSLLINEEXTMCMMIBDef();

    static { MIBs.getInstance().registerMIB(VDSLLINEEXTMCMMIBDef.VDSLLINEEXTMCMMIB); }

    /** [RFC3728]

April 28, 2005*/
    public final VdslExtMCMMIBEnt vdslExtMCMMIB;

    private VDSLLINEEXTMCMMIBDef()
    {
        super("VDSL-LINE-EXT-MCM-MIB");
        this.vdslExtMCMMIB = new VdslExtMCMMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.vdslExtMCMMIB
        };
    }

    public static final class VdslExtMCMMIBEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
    {
        public final VdslLineExtMCMMibEnt vdslLineExtMCMMib;

        private VdslExtMCMMIBEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
        {
            super(mib, parent, "vdslExtMCMMIB", "1.3.6.1.2.1.10.229", false, false, false, false);
            this.vdslLineExtMCMMib = new VdslLineExtMCMMibEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.vdslLineExtMCMMib
            };
        }
        public static final class VdslLineExtMCMMibEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
        {
            public final VdslLineExtMCMMibObjectsEnt vdslLineExtMCMMibObjects;

            /** conformance information*/
            public final VdslLineExtMCMConformanceEnt vdslLineExtMCMConformance;

            private VdslLineExtMCMMibEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
            {
                super(mib, parent, "vdslLineExtMCMMib", "1.3.6.1.2.1.10.229.1", false, false, false, false);
                this.vdslLineExtMCMMibObjects = new VdslLineExtMCMMibObjectsEnt(mib, this);
                this.vdslLineExtMCMConformance = new VdslLineExtMCMConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.vdslLineExtMCMMibObjects,
                    this.vdslLineExtMCMConformance
                };
            }
            public static final class VdslLineExtMCMMibObjectsEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
            {
                /** Multiple carrier modulation (MCM) configuration profile tables*/
                public final VdslLineMCMConfProfileTableEnt vdslLineMCMConfProfileTable;

                public final VdslLineMCMConfProfileTxBandTableEnt vdslLineMCMConfProfileTxBandTable;

                public final VdslLineMCMConfProfileRxBandTableEnt vdslLineMCMConfProfileRxBandTable;

                public final VdslLineMCMConfProfileTxPSDTableEnt vdslLineMCMConfProfileTxPSDTable;

                public final VdslLineMCMConfProfileMaxTxPSDTableEnt vdslLineMCMConfProfileMaxTxPSDTable;

                public final VdslLineMCMConfProfileMaxRxPSDTableEnt vdslLineMCMConfProfileMaxRxPSDTable;

                private VdslLineExtMCMMibObjectsEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                {
                    super(mib, parent, "vdslLineExtMCMMibObjects", "1.3.6.1.2.1.10.229.1.1", false, false, false, false);
                    this.vdslLineMCMConfProfileTable = new VdslLineMCMConfProfileTableEnt(mib, this);
                    this.vdslLineMCMConfProfileTxBandTable = new VdslLineMCMConfProfileTxBandTableEnt(mib, this);
                    this.vdslLineMCMConfProfileRxBandTable = new VdslLineMCMConfProfileRxBandTableEnt(mib, this);
                    this.vdslLineMCMConfProfileTxPSDTable = new VdslLineMCMConfProfileTxPSDTableEnt(mib, this);
                    this.vdslLineMCMConfProfileMaxTxPSDTable = new VdslLineMCMConfProfileMaxTxPSDTableEnt(mib, this);
                    this.vdslLineMCMConfProfileMaxRxPSDTable = new VdslLineMCMConfProfileMaxRxPSDTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslLineMCMConfProfileTable,
                        this.vdslLineMCMConfProfileTxBandTable,
                        this.vdslLineMCMConfProfileRxBandTable,
                        this.vdslLineMCMConfProfileTxPSDTable,
                        this.vdslLineMCMConfProfileMaxTxPSDTable,
                        this.vdslLineMCMConfProfileMaxRxPSDTable
                    };
                }
                public static final class VdslLineMCMConfProfileTableEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineMCMConfProfileEntryEnt vdslLineMCMConfProfileEntry;

                    private VdslLineMCMConfProfileTableEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineMCMConfProfileTable", "1.3.6.1.2.1.10.229.1.1.1", false, true, false, false);
                        this.vdslLineMCMConfProfileEntry = new VdslLineMCMConfProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMCMConfProfileEntry
                        };
                    }
                    public static final class VdslLineMCMConfProfileEntryEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileTxWindowLengthEnt vdslLineMCMConfProfileTxWindowLength;

                        public final VdslLineMCMConfProfileRowStatusEnt vdslLineMCMConfProfileRowStatus;

                        private VdslLineMCMConfProfileEntryEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMCMConfProfileEntry", "1.3.6.1.2.1.10.229.1.1.1.1", false, false, false, true);
                            this.vdslLineMCMConfProfileTxWindowLength = new VdslLineMCMConfProfileTxWindowLengthEnt(mib, this);
                            this.vdslLineMCMConfProfileRowStatus = new VdslLineMCMConfProfileRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineMCMConfProfileTxWindowLength,
                                this.vdslLineMCMConfProfileRowStatus
                            };
                        }
                        public static final class VdslLineMCMConfProfileTxWindowLengthEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxWindowLengthEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxWindowLength", "1.3.6.1.2.1.10.229.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileRowStatusEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileRowStatusEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileRowStatus", "1.3.6.1.2.1.10.229.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineMCMConfProfileTxBandTableEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineMCMConfProfileTxBandEntryEnt vdslLineMCMConfProfileTxBandEntry;

                    private VdslLineMCMConfProfileTxBandTableEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineMCMConfProfileTxBandTable", "1.3.6.1.2.1.10.229.1.1.2", false, true, false, false);
                        this.vdslLineMCMConfProfileTxBandEntry = new VdslLineMCMConfProfileTxBandEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMCMConfProfileTxBandEntry
                        };
                    }
                    public static final class VdslLineMCMConfProfileTxBandEntryEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        public final VdslLineMCMConfProfileTxBandNumberEnt vdslLineMCMConfProfileTxBandNumber;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileTxBandStartEnt vdslLineMCMConfProfileTxBandStart;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileTxBandStopEnt vdslLineMCMConfProfileTxBandStop;

                        public final VdslLineMCMConfProfileTxBandRowStatusEnt vdslLineMCMConfProfileTxBandRowStatus;

                        private VdslLineMCMConfProfileTxBandEntryEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMCMConfProfileTxBandEntry", "1.3.6.1.2.1.10.229.1.1.2.1", false, false, false, true);
                            this.vdslLineMCMConfProfileTxBandNumber = new VdslLineMCMConfProfileTxBandNumberEnt(mib, this);
                            this.vdslLineMCMConfProfileTxBandStart = new VdslLineMCMConfProfileTxBandStartEnt(mib, this);
                            this.vdslLineMCMConfProfileTxBandStop = new VdslLineMCMConfProfileTxBandStopEnt(mib, this);
                            this.vdslLineMCMConfProfileTxBandRowStatus = new VdslLineMCMConfProfileTxBandRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineMCMConfProfileTxBandNumber,
                                this.vdslLineMCMConfProfileTxBandStart,
                                this.vdslLineMCMConfProfileTxBandStop,
                                this.vdslLineMCMConfProfileTxBandRowStatus
                            };
                        }
                        public static final class VdslLineMCMConfProfileTxBandNumberEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxBandNumberEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxBandNumber", "1.3.6.1.2.1.10.229.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileTxBandStartEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxBandStartEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxBandStart", "1.3.6.1.2.1.10.229.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileTxBandStopEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxBandStopEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxBandStop", "1.3.6.1.2.1.10.229.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileTxBandRowStatusEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxBandRowStatusEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxBandRowStatus", "1.3.6.1.2.1.10.229.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineMCMConfProfileRxBandTableEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineMCMConfProfileRxBandEntryEnt vdslLineMCMConfProfileRxBandEntry;

                    private VdslLineMCMConfProfileRxBandTableEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineMCMConfProfileRxBandTable", "1.3.6.1.2.1.10.229.1.1.3", false, true, false, false);
                        this.vdslLineMCMConfProfileRxBandEntry = new VdslLineMCMConfProfileRxBandEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMCMConfProfileRxBandEntry
                        };
                    }
                    public static final class VdslLineMCMConfProfileRxBandEntryEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        public final VdslLineMCMConfProfileRxBandNumberEnt vdslLineMCMConfProfileRxBandNumber;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileRxBandStartEnt vdslLineMCMConfProfileRxBandStart;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileRxBandStopEnt vdslLineMCMConfProfileRxBandStop;

                        public final VdslLineMCMConfProfileRxBandRowStatusEnt vdslLineMCMConfProfileRxBandRowStatus;

                        private VdslLineMCMConfProfileRxBandEntryEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMCMConfProfileRxBandEntry", "1.3.6.1.2.1.10.229.1.1.3.1", false, false, false, true);
                            this.vdslLineMCMConfProfileRxBandNumber = new VdslLineMCMConfProfileRxBandNumberEnt(mib, this);
                            this.vdslLineMCMConfProfileRxBandStart = new VdslLineMCMConfProfileRxBandStartEnt(mib, this);
                            this.vdslLineMCMConfProfileRxBandStop = new VdslLineMCMConfProfileRxBandStopEnt(mib, this);
                            this.vdslLineMCMConfProfileRxBandRowStatus = new VdslLineMCMConfProfileRxBandRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineMCMConfProfileRxBandNumber,
                                this.vdslLineMCMConfProfileRxBandStart,
                                this.vdslLineMCMConfProfileRxBandStop,
                                this.vdslLineMCMConfProfileRxBandRowStatus
                            };
                        }
                        public static final class VdslLineMCMConfProfileRxBandNumberEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileRxBandNumberEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileRxBandNumber", "1.3.6.1.2.1.10.229.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileRxBandStartEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileRxBandStartEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileRxBandStart", "1.3.6.1.2.1.10.229.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileRxBandStopEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileRxBandStopEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileRxBandStop", "1.3.6.1.2.1.10.229.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileRxBandRowStatusEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileRxBandRowStatusEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileRxBandRowStatus", "1.3.6.1.2.1.10.229.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineMCMConfProfileTxPSDTableEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineMCMConfProfileTxPSDEntryEnt vdslLineMCMConfProfileTxPSDEntry;

                    private VdslLineMCMConfProfileTxPSDTableEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineMCMConfProfileTxPSDTable", "1.3.6.1.2.1.10.229.1.1.4", false, true, false, false);
                        this.vdslLineMCMConfProfileTxPSDEntry = new VdslLineMCMConfProfileTxPSDEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMCMConfProfileTxPSDEntry
                        };
                    }
                    public static final class VdslLineMCMConfProfileTxPSDEntryEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        public final VdslLineMCMConfProfileTxPSDNumberEnt vdslLineMCMConfProfileTxPSDNumber;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileTxPSDToneEnt vdslLineMCMConfProfileTxPSDTone;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileTxPSDPSDEnt vdslLineMCMConfProfileTxPSDPSD;

                        public final VdslLineMCMConfProfileTxPSDRowStatusEnt vdslLineMCMConfProfileTxPSDRowStatus;

                        private VdslLineMCMConfProfileTxPSDEntryEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMCMConfProfileTxPSDEntry", "1.3.6.1.2.1.10.229.1.1.4.1", false, false, false, true);
                            this.vdslLineMCMConfProfileTxPSDNumber = new VdslLineMCMConfProfileTxPSDNumberEnt(mib, this);
                            this.vdslLineMCMConfProfileTxPSDTone = new VdslLineMCMConfProfileTxPSDToneEnt(mib, this);
                            this.vdslLineMCMConfProfileTxPSDPSD = new VdslLineMCMConfProfileTxPSDPSDEnt(mib, this);
                            this.vdslLineMCMConfProfileTxPSDRowStatus = new VdslLineMCMConfProfileTxPSDRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineMCMConfProfileTxPSDNumber,
                                this.vdslLineMCMConfProfileTxPSDTone,
                                this.vdslLineMCMConfProfileTxPSDPSD,
                                this.vdslLineMCMConfProfileTxPSDRowStatus
                            };
                        }
                        public static final class VdslLineMCMConfProfileTxPSDNumberEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxPSDNumberEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxPSDNumber", "1.3.6.1.2.1.10.229.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileTxPSDToneEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxPSDToneEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxPSDTone", "1.3.6.1.2.1.10.229.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileTxPSDPSDEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxPSDPSDEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxPSDPSD", "1.3.6.1.2.1.10.229.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileTxPSDRowStatusEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileTxPSDRowStatusEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileTxPSDRowStatus", "1.3.6.1.2.1.10.229.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineMCMConfProfileMaxTxPSDTableEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineMCMConfProfileMaxTxPSDEntryEnt vdslLineMCMConfProfileMaxTxPSDEntry;

                    private VdslLineMCMConfProfileMaxTxPSDTableEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineMCMConfProfileMaxTxPSDTable", "1.3.6.1.2.1.10.229.1.1.5", false, true, false, false);
                        this.vdslLineMCMConfProfileMaxTxPSDEntry = new VdslLineMCMConfProfileMaxTxPSDEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMCMConfProfileMaxTxPSDEntry
                        };
                    }
                    public static final class VdslLineMCMConfProfileMaxTxPSDEntryEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        public final VdslLineMCMConfProfileMaxTxPSDNumberEnt vdslLineMCMConfProfileMaxTxPSDNumber;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileMaxTxPSDToneEnt vdslLineMCMConfProfileMaxTxPSDTone;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileMaxTxPSDPSDEnt vdslLineMCMConfProfileMaxTxPSDPSD;

                        public final VdslLineMCMConfProfileMaxTxPSDRowStatusEnt vdslLineMCMConfProfileMaxTxPSDRowStatus;

                        private VdslLineMCMConfProfileMaxTxPSDEntryEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMCMConfProfileMaxTxPSDEntry", "1.3.6.1.2.1.10.229.1.1.5.1", false, false, false, true);
                            this.vdslLineMCMConfProfileMaxTxPSDNumber = new VdslLineMCMConfProfileMaxTxPSDNumberEnt(mib, this);
                            this.vdslLineMCMConfProfileMaxTxPSDTone = new VdslLineMCMConfProfileMaxTxPSDToneEnt(mib, this);
                            this.vdslLineMCMConfProfileMaxTxPSDPSD = new VdslLineMCMConfProfileMaxTxPSDPSDEnt(mib, this);
                            this.vdslLineMCMConfProfileMaxTxPSDRowStatus = new VdslLineMCMConfProfileMaxTxPSDRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineMCMConfProfileMaxTxPSDNumber,
                                this.vdslLineMCMConfProfileMaxTxPSDTone,
                                this.vdslLineMCMConfProfileMaxTxPSDPSD,
                                this.vdslLineMCMConfProfileMaxTxPSDRowStatus
                            };
                        }
                        public static final class VdslLineMCMConfProfileMaxTxPSDNumberEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxTxPSDNumberEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxTxPSDNumber", "1.3.6.1.2.1.10.229.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileMaxTxPSDToneEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxTxPSDToneEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxTxPSDTone", "1.3.6.1.2.1.10.229.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileMaxTxPSDPSDEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxTxPSDPSDEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxTxPSDPSD", "1.3.6.1.2.1.10.229.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileMaxTxPSDRowStatusEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxTxPSDRowStatusEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxTxPSDRowStatus", "1.3.6.1.2.1.10.229.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class VdslLineMCMConfProfileMaxRxPSDTableEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineMCMConfProfileMaxRxPSDEntryEnt vdslLineMCMConfProfileMaxRxPSDEntry;

                    private VdslLineMCMConfProfileMaxRxPSDTableEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineMCMConfProfileMaxRxPSDTable", "1.3.6.1.2.1.10.229.1.1.6", false, true, false, false);
                        this.vdslLineMCMConfProfileMaxRxPSDEntry = new VdslLineMCMConfProfileMaxRxPSDEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineMCMConfProfileMaxRxPSDEntry
                        };
                    }
                    public static final class VdslLineMCMConfProfileMaxRxPSDEntryEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        public final VdslLineMCMConfProfileMaxRxPSDNumberEnt vdslLineMCMConfProfileMaxRxPSDNumber;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileMaxRxPSDToneEnt vdslLineMCMConfProfileMaxRxPSDTone;

                        /** Part 3, MCM*/
                        public final VdslLineMCMConfProfileMaxRxPSDPSDEnt vdslLineMCMConfProfileMaxRxPSDPSD;

                        public final VdslLineMCMConfProfileMaxRxPSDRowStatusEnt vdslLineMCMConfProfileMaxRxPSDRowStatus;

                        private VdslLineMCMConfProfileMaxRxPSDEntryEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineMCMConfProfileMaxRxPSDEntry", "1.3.6.1.2.1.10.229.1.1.6.1", false, false, false, true);
                            this.vdslLineMCMConfProfileMaxRxPSDNumber = new VdslLineMCMConfProfileMaxRxPSDNumberEnt(mib, this);
                            this.vdslLineMCMConfProfileMaxRxPSDTone = new VdslLineMCMConfProfileMaxRxPSDToneEnt(mib, this);
                            this.vdslLineMCMConfProfileMaxRxPSDPSD = new VdslLineMCMConfProfileMaxRxPSDPSDEnt(mib, this);
                            this.vdslLineMCMConfProfileMaxRxPSDRowStatus = new VdslLineMCMConfProfileMaxRxPSDRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.vdslLineMCMConfProfileMaxRxPSDNumber,
                                this.vdslLineMCMConfProfileMaxRxPSDTone,
                                this.vdslLineMCMConfProfileMaxRxPSDPSD,
                                this.vdslLineMCMConfProfileMaxRxPSDRowStatus
                            };
                        }
                        public static final class VdslLineMCMConfProfileMaxRxPSDNumberEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxRxPSDNumberEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxRxPSDNumber", "1.3.6.1.2.1.10.229.1.1.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileMaxRxPSDToneEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxRxPSDToneEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxRxPSDTone", "1.3.6.1.2.1.10.229.1.1.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileMaxRxPSDPSDEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxRxPSDPSDEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxRxPSDPSD", "1.3.6.1.2.1.10.229.1.1.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class VdslLineMCMConfProfileMaxRxPSDRowStatusEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                        {
                            private VdslLineMCMConfProfileMaxRxPSDRowStatusEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                            {
                                super(mib, parent, "vdslLineMCMConfProfileMaxRxPSDRowStatus", "1.3.6.1.2.1.10.229.1.1.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class VdslLineExtMCMConformanceEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
            {
                public final VdslLineExtMCMGroupsEnt vdslLineExtMCMGroups;

                public final VdslLineExtMCMCompliancesEnt vdslLineExtMCMCompliances;

                private VdslLineExtMCMConformanceEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                {
                    super(mib, parent, "vdslLineExtMCMConformance", "1.3.6.1.2.1.10.229.1.2", false, false, false, false);
                    this.vdslLineExtMCMGroups = new VdslLineExtMCMGroupsEnt(mib, this);
                    this.vdslLineExtMCMCompliances = new VdslLineExtMCMCompliancesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.vdslLineExtMCMGroups,
                        this.vdslLineExtMCMCompliances
                    };
                }
                public static final class VdslLineExtMCMGroupsEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    /** units of conformance*/
                    public final VdslLineExtMCMGroupEnt vdslLineExtMCMGroup;

                    private VdslLineExtMCMGroupsEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineExtMCMGroups", "1.3.6.1.2.1.10.229.1.2.1", false, false, false, false);
                        this.vdslLineExtMCMGroup = new VdslLineExtMCMGroupEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineExtMCMGroup
                        };
                    }
                    public static final class VdslLineExtMCMGroupEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        private VdslLineExtMCMGroupEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineExtMCMGroup", "1.3.6.1.2.1.10.229.1.2.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class VdslLineExtMCMCompliancesEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                {
                    public final VdslLineExtMCMMibComplianceEnt vdslLineExtMCMMibCompliance;

                    private VdslLineExtMCMCompliancesEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                    {
                        super(mib, parent, "vdslLineExtMCMCompliances", "1.3.6.1.2.1.10.229.1.2.2", false, false, false, false);
                        this.vdslLineExtMCMMibCompliance = new VdslLineExtMCMMibComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.vdslLineExtMCMMibCompliance
                        };
                    }
                    public static final class VdslLineExtMCMMibComplianceEnt extends MIBEntry<VDSLLINEEXTMCMMIBDef>
                    {
                        private VdslLineExtMCMMibComplianceEnt(VDSLLINEEXTMCMMIBDef mib, MIBEntry<VDSLLINEEXTMCMMIBDef> parent)
                        {
                            super(mib, parent, "vdslLineExtMCMMibCompliance", "1.3.6.1.2.1.10.229.1.2.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

    }

}
