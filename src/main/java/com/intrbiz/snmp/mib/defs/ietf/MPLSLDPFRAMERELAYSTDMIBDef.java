package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2115]
[RFC2020]
[RFC3811]
[RFC3813]*/
public final class MPLSLDPFRAMERELAYSTDMIBDef extends MIB
{
    public static final MPLSLDPFRAMERELAYSTDMIBDef MPLSLDPFRAMERELAYSTDMIB = new MPLSLDPFRAMERELAYSTDMIBDef();

    /** June 3, 2004*/
    public final MplsLdpFrameRelayStdMIBEnt mplsLdpFrameRelayStdMIB;

    private MPLSLDPFRAMERELAYSTDMIBDef()
    {
        super("MPLS-LDP-FRAME-RELAY-STD-MIB");
        this.mplsLdpFrameRelayStdMIB = new MplsLdpFrameRelayStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLdpFrameRelayStdMIB
        };
    }

    public static final class MplsLdpFrameRelayStdMIBEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
    {
        /** *****************************************************************/
        public final MplsLdpFrameRelayObjectsEnt mplsLdpFrameRelayObjects;

        public final MplsLdpFrameRelayConformanceEnt mplsLdpFrameRelayConformance;

        private MplsLdpFrameRelayStdMIBEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLdpFrameRelayStdMIB", "1.3.6.1.2.1.10.166.6", false, false, false, false);
            this.mplsLdpFrameRelayObjects = new MplsLdpFrameRelayObjectsEnt(mib, this);
            this.mplsLdpFrameRelayConformance = new MplsLdpFrameRelayConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLdpFrameRelayObjects,
                this.mplsLdpFrameRelayConformance
            };
        }
        public static final class MplsLdpFrameRelayObjectsEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
        {
            /** ****************************************************************MPLS LDP Frame Relay Objects****************************************************************
Ldp Entity Objects for Frame Relay*/
            public final MplsLdpEntityFrameRelayObjectsEnt mplsLdpEntityFrameRelayObjects;

            /** MPLS LDP Frame Relay Session Information*/
            public final MplsLdpFrameRelaySessionObjectsEnt mplsLdpFrameRelaySessionObjects;

            private MplsLdpFrameRelayObjectsEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpFrameRelayObjects", "1.3.6.1.2.1.10.166.6.1", false, false, false, false);
                this.mplsLdpEntityFrameRelayObjects = new MplsLdpEntityFrameRelayObjectsEnt(mib, this);
                this.mplsLdpFrameRelaySessionObjects = new MplsLdpFrameRelaySessionObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpEntityFrameRelayObjects,
                    this.mplsLdpFrameRelaySessionObjects
                };
            }
            public static final class MplsLdpEntityFrameRelayObjectsEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
            {
                public final MplsLdpEntityFrameRelayTableEnt mplsLdpEntityFrameRelayTable;

                /** Frame Relay Label Range Components*/
                public final MplsLdpEntityFrameRelayLRTableEnt mplsLdpEntityFrameRelayLRTable;

                private MplsLdpEntityFrameRelayObjectsEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpEntityFrameRelayObjects", "1.3.6.1.2.1.10.166.6.1.1", false, false, false, false);
                    this.mplsLdpEntityFrameRelayTable = new MplsLdpEntityFrameRelayTableEnt(mib, this);
                    this.mplsLdpEntityFrameRelayLRTable = new MplsLdpEntityFrameRelayLRTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpEntityFrameRelayTable,
                        this.mplsLdpEntityFrameRelayLRTable
                    };
                }
                public static final class MplsLdpEntityFrameRelayTableEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                {
                    public final MplsLdpEntityFrameRelayEntryEnt mplsLdpEntityFrameRelayEntry;

                    private MplsLdpEntityFrameRelayTableEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityFrameRelayTable", "1.3.6.1.2.1.10.166.6.1.1.1", false, true, false, false);
                        this.mplsLdpEntityFrameRelayEntry = new MplsLdpEntityFrameRelayEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityFrameRelayEntry
                        };
                    }
                    public static final class MplsLdpEntityFrameRelayEntryEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                    {
                        public final MplsLdpEntityFrameRelayIfIndexOrZeroEnt mplsLdpEntityFrameRelayIfIndexOrZero;

                        public final MplsLdpEntityFrameRelayMergeCapEnt mplsLdpEntityFrameRelayMergeCap;

                        public final MplsLdpEntityFrameRelayLRComponentsEnt mplsLdpEntityFrameRelayLRComponents;

                        public final MplsLdpEntityFrameRelayVcDirectionalityEnt mplsLdpEntityFrameRelayVcDirectionality;

                        public final MplsLdpEntityFrameRelayStorageTypeEnt mplsLdpEntityFrameRelayStorageType;

                        public final MplsLdpEntityFrameRelayRowStatusEnt mplsLdpEntityFrameRelayRowStatus;

                        private MplsLdpEntityFrameRelayEntryEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityFrameRelayEntry", "1.3.6.1.2.1.10.166.6.1.1.1.1", false, false, false, true);
                            this.mplsLdpEntityFrameRelayIfIndexOrZero = new MplsLdpEntityFrameRelayIfIndexOrZeroEnt(mib, this);
                            this.mplsLdpEntityFrameRelayMergeCap = new MplsLdpEntityFrameRelayMergeCapEnt(mib, this);
                            this.mplsLdpEntityFrameRelayLRComponents = new MplsLdpEntityFrameRelayLRComponentsEnt(mib, this);
                            this.mplsLdpEntityFrameRelayVcDirectionality = new MplsLdpEntityFrameRelayVcDirectionalityEnt(mib, this);
                            this.mplsLdpEntityFrameRelayStorageType = new MplsLdpEntityFrameRelayStorageTypeEnt(mib, this);
                            this.mplsLdpEntityFrameRelayRowStatus = new MplsLdpEntityFrameRelayRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityFrameRelayIfIndexOrZero,
                                this.mplsLdpEntityFrameRelayMergeCap,
                                this.mplsLdpEntityFrameRelayLRComponents,
                                this.mplsLdpEntityFrameRelayVcDirectionality,
                                this.mplsLdpEntityFrameRelayStorageType,
                                this.mplsLdpEntityFrameRelayRowStatus
                            };
                        }
                        public static final class MplsLdpEntityFrameRelayIfIndexOrZeroEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayIfIndexOrZeroEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayIfIndexOrZero", "1.3.6.1.2.1.10.166.6.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayMergeCapEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayMergeCapEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayMergeCap", "1.3.6.1.2.1.10.166.6.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayLRComponentsEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayLRComponentsEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayLRComponents", "1.3.6.1.2.1.10.166.6.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayVcDirectionalityEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayVcDirectionalityEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayVcDirectionality", "1.3.6.1.2.1.10.166.6.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayStorageTypeEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayStorageTypeEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayStorageType", "1.3.6.1.2.1.10.166.6.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayRowStatusEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayRowStatusEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayRowStatus", "1.3.6.1.2.1.10.166.6.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpEntityFrameRelayLRTableEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                {
                    public final MplsLdpEntityFrameRelayLREntryEnt mplsLdpEntityFrameRelayLREntry;

                    private MplsLdpEntityFrameRelayLRTableEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityFrameRelayLRTable", "1.3.6.1.2.1.10.166.6.1.1.2", false, true, false, false);
                        this.mplsLdpEntityFrameRelayLREntry = new MplsLdpEntityFrameRelayLREntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityFrameRelayLREntry
                        };
                    }
                    public static final class MplsLdpEntityFrameRelayLREntryEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                    {
                        public final MplsLdpEntityFrameRelayLRMinDlciEnt mplsLdpEntityFrameRelayLRMinDlci;

                        public final MplsLdpEntityFrameRelayLRMaxDlciEnt mplsLdpEntityFrameRelayLRMaxDlci;

                        public final MplsLdpEntityFrameRelayLRLenEnt mplsLdpEntityFrameRelayLRLen;

                        public final MplsLdpEntityFrameRelayLRStorageTypeEnt mplsLdpEntityFrameRelayLRStorageType;

                        public final MplsLdpEntityFrameRelayLRRowStatusEnt mplsLdpEntityFrameRelayLRRowStatus;

                        private MplsLdpEntityFrameRelayLREntryEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityFrameRelayLREntry", "1.3.6.1.2.1.10.166.6.1.1.2.1", false, false, false, true);
                            this.mplsLdpEntityFrameRelayLRMinDlci = new MplsLdpEntityFrameRelayLRMinDlciEnt(mib, this);
                            this.mplsLdpEntityFrameRelayLRMaxDlci = new MplsLdpEntityFrameRelayLRMaxDlciEnt(mib, this);
                            this.mplsLdpEntityFrameRelayLRLen = new MplsLdpEntityFrameRelayLRLenEnt(mib, this);
                            this.mplsLdpEntityFrameRelayLRStorageType = new MplsLdpEntityFrameRelayLRStorageTypeEnt(mib, this);
                            this.mplsLdpEntityFrameRelayLRRowStatus = new MplsLdpEntityFrameRelayLRRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityFrameRelayLRMinDlci,
                                this.mplsLdpEntityFrameRelayLRMaxDlci,
                                this.mplsLdpEntityFrameRelayLRLen,
                                this.mplsLdpEntityFrameRelayLRStorageType,
                                this.mplsLdpEntityFrameRelayLRRowStatus
                            };
                        }
                        public static final class MplsLdpEntityFrameRelayLRMinDlciEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayLRMinDlciEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayLRMinDlci", "1.3.6.1.2.1.10.166.6.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayLRMaxDlciEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayLRMaxDlciEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayLRMaxDlci", "1.3.6.1.2.1.10.166.6.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayLRLenEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayLRLenEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayLRLen", "1.3.6.1.2.1.10.166.6.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayLRStorageTypeEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayLRStorageTypeEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayLRStorageType", "1.3.6.1.2.1.10.166.6.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityFrameRelayLRRowStatusEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpEntityFrameRelayLRRowStatusEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityFrameRelayLRRowStatus", "1.3.6.1.2.1.10.166.6.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MplsLdpFrameRelaySessionObjectsEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
            {
                public final MplsLdpFrameRelaySessionTableEnt mplsLdpFrameRelaySessionTable;

                private MplsLdpFrameRelaySessionObjectsEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpFrameRelaySessionObjects", "1.3.6.1.2.1.10.166.6.1.2", false, false, false, false);
                    this.mplsLdpFrameRelaySessionTable = new MplsLdpFrameRelaySessionTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpFrameRelaySessionTable
                    };
                }
                public static final class MplsLdpFrameRelaySessionTableEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                {
                    public final MplsLdpFrameRelaySessionEntryEnt mplsLdpFrameRelaySessionEntry;

                    private MplsLdpFrameRelaySessionTableEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpFrameRelaySessionTable", "1.3.6.1.2.1.10.166.6.1.2.1", false, true, false, false);
                        this.mplsLdpFrameRelaySessionEntry = new MplsLdpFrameRelaySessionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpFrameRelaySessionEntry
                        };
                    }
                    public static final class MplsLdpFrameRelaySessionEntryEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                    {
                        public final MplsLdpFrameRelaySessionMinDlciEnt mplsLdpFrameRelaySessionMinDlci;

                        public final MplsLdpFrameRelaySessionMaxDlciEnt mplsLdpFrameRelaySessionMaxDlci;

                        public final MplsLdpFrameRelaySessionLenEnt mplsLdpFrameRelaySessionLen;

                        private MplsLdpFrameRelaySessionEntryEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpFrameRelaySessionEntry", "1.3.6.1.2.1.10.166.6.1.2.1.1", false, false, false, true);
                            this.mplsLdpFrameRelaySessionMinDlci = new MplsLdpFrameRelaySessionMinDlciEnt(mib, this);
                            this.mplsLdpFrameRelaySessionMaxDlci = new MplsLdpFrameRelaySessionMaxDlciEnt(mib, this);
                            this.mplsLdpFrameRelaySessionLen = new MplsLdpFrameRelaySessionLenEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpFrameRelaySessionMinDlci,
                                this.mplsLdpFrameRelaySessionMaxDlci,
                                this.mplsLdpFrameRelaySessionLen
                            };
                        }
                        public static final class MplsLdpFrameRelaySessionMinDlciEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpFrameRelaySessionMinDlciEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpFrameRelaySessionMinDlci", "1.3.6.1.2.1.10.166.6.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpFrameRelaySessionMaxDlciEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpFrameRelaySessionMaxDlciEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpFrameRelaySessionMaxDlci", "1.3.6.1.2.1.10.166.6.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpFrameRelaySessionLenEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                        {
                            private MplsLdpFrameRelaySessionLenEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpFrameRelaySessionLen", "1.3.6.1.2.1.10.166.6.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class MplsLdpFrameRelayConformanceEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
        {
            /** ****************************************************************Module Conformance Statement*****************************************************************/
            public final MplsLdpFrameRelayGroupsEnt mplsLdpFrameRelayGroups;

            public final MplsLdpFrameRelayCompliancesEnt mplsLdpFrameRelayCompliances;

            private MplsLdpFrameRelayConformanceEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpFrameRelayConformance", "1.3.6.1.2.1.10.166.6.2", false, false, false, false);
                this.mplsLdpFrameRelayGroups = new MplsLdpFrameRelayGroupsEnt(mib, this);
                this.mplsLdpFrameRelayCompliances = new MplsLdpFrameRelayCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpFrameRelayGroups,
                    this.mplsLdpFrameRelayCompliances
                };
            }
            public static final class MplsLdpFrameRelayGroupsEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
            {
                /** units of conformance*/
                public final MplsLdpFrameRelayGroupEnt mplsLdpFrameRelayGroup;

                private MplsLdpFrameRelayGroupsEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpFrameRelayGroups", "1.3.6.1.2.1.10.166.6.2.1", false, false, false, false);
                    this.mplsLdpFrameRelayGroup = new MplsLdpFrameRelayGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpFrameRelayGroup
                    };
                }
                public static final class MplsLdpFrameRelayGroupEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                {
                    private MplsLdpFrameRelayGroupEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpFrameRelayGroup", "1.3.6.1.2.1.10.166.6.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLdpFrameRelayCompliancesEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
            {
                /** Full Compliance*/
                public final MplsLdpFrameRelayModuleFullComplianceEnt mplsLdpFrameRelayModuleFullCompliance;

                /** Read-Only Compliance*/
                public final MplsLdpFrameRelayModuleReadOnlyComplianceEnt mplsLdpFrameRelayModuleReadOnlyCompliance;

                private MplsLdpFrameRelayCompliancesEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpFrameRelayCompliances", "1.3.6.1.2.1.10.166.6.2.2", false, false, false, false);
                    this.mplsLdpFrameRelayModuleFullCompliance = new MplsLdpFrameRelayModuleFullComplianceEnt(mib, this);
                    this.mplsLdpFrameRelayModuleReadOnlyCompliance = new MplsLdpFrameRelayModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpFrameRelayModuleFullCompliance,
                        this.mplsLdpFrameRelayModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLdpFrameRelayModuleFullComplianceEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                {
                    private MplsLdpFrameRelayModuleFullComplianceEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpFrameRelayModuleFullCompliance", "1.3.6.1.2.1.10.166.6.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpFrameRelayModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef>
                {
                    private MplsLdpFrameRelayModuleReadOnlyComplianceEnt(MPLSLDPFRAMERELAYSTDMIBDef mib, MIBEntry<MPLSLDPFRAMERELAYSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpFrameRelayModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.6.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
