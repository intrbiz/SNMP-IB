package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2020]
[RFC2514]
[RFC3811]
[RFC3813]*/
public final class MPLSLDPATMSTDMIBDef extends MIB
{
    public static final MPLSLDPATMSTDMIBDef MPLSLDPATMSTDMIB = new MPLSLDPATMSTDMIBDef();

    /** June 3, 2004*/
    public final MplsLdpAtmStdMIBEnt mplsLdpAtmStdMIB;

    private MPLSLDPATMSTDMIBDef()
    {
        super("MPLS-LDP-ATM-STD-MIB");
        this.mplsLdpAtmStdMIB = new MplsLdpAtmStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLdpAtmStdMIB
        };
    }

    public static final class MplsLdpAtmStdMIBEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
    {
        /** *****************************************************************/
        public final MplsLdpAtmObjectsEnt mplsLdpAtmObjects;

        public final MplsLdpAtmConformanceEnt mplsLdpAtmConformance;

        private MplsLdpAtmStdMIBEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLdpAtmStdMIB", "1.3.6.1.2.1.10.166.5", false, false, false, false);
            this.mplsLdpAtmObjects = new MplsLdpAtmObjectsEnt(mib, this);
            this.mplsLdpAtmConformance = new MplsLdpAtmConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLdpAtmObjects,
                this.mplsLdpAtmConformance
            };
        }
        public static final class MplsLdpAtmObjectsEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
        {
            /** ****************************************************************MPLS LDP ATM Objects****************************************************************Ldp Entity Objects for ATM*/
            public final MplsLdpEntityAtmObjectsEnt mplsLdpEntityAtmObjects;

            /** MPLS LDP ATM Session Information*/
            public final MplsLdpAtmSessionObjectsEnt mplsLdpAtmSessionObjects;

            private MplsLdpAtmObjectsEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpAtmObjects", "1.3.6.1.2.1.10.166.5.1", false, false, false, false);
                this.mplsLdpEntityAtmObjects = new MplsLdpEntityAtmObjectsEnt(mib, this);
                this.mplsLdpAtmSessionObjects = new MplsLdpAtmSessionObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpEntityAtmObjects,
                    this.mplsLdpAtmSessionObjects
                };
            }
            public static final class MplsLdpEntityAtmObjectsEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
            {
                public final MplsLdpEntityAtmTableEnt mplsLdpEntityAtmTable;

                /** The MPLS LDP Entity ATM Label Range Table*/
                public final MplsLdpEntityAtmLRTableEnt mplsLdpEntityAtmLRTable;

                private MplsLdpEntityAtmObjectsEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpEntityAtmObjects", "1.3.6.1.2.1.10.166.5.1.1", false, false, false, false);
                    this.mplsLdpEntityAtmTable = new MplsLdpEntityAtmTableEnt(mib, this);
                    this.mplsLdpEntityAtmLRTable = new MplsLdpEntityAtmLRTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpEntityAtmTable,
                        this.mplsLdpEntityAtmLRTable
                    };
                }
                public static final class MplsLdpEntityAtmTableEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                {
                    public final MplsLdpEntityAtmEntryEnt mplsLdpEntityAtmEntry;

                    private MplsLdpEntityAtmTableEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityAtmTable", "1.3.6.1.2.1.10.166.5.1.1.1", false, true, false, false);
                        this.mplsLdpEntityAtmEntry = new MplsLdpEntityAtmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityAtmEntry
                        };
                    }
                    public static final class MplsLdpEntityAtmEntryEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                    {
                        public final MplsLdpEntityAtmIfIndexOrZeroEnt mplsLdpEntityAtmIfIndexOrZero;

                        public final MplsLdpEntityAtmMergeCapEnt mplsLdpEntityAtmMergeCap;

                        public final MplsLdpEntityAtmLRComponentsEnt mplsLdpEntityAtmLRComponents;

                        public final MplsLdpEntityAtmVcDirectionalityEnt mplsLdpEntityAtmVcDirectionality;

                        public final MplsLdpEntityAtmLsrConnectivityEnt mplsLdpEntityAtmLsrConnectivity;

                        public final MplsLdpEntityAtmDefaultControlVpiEnt mplsLdpEntityAtmDefaultControlVpi;

                        public final MplsLdpEntityAtmDefaultControlVciEnt mplsLdpEntityAtmDefaultControlVci;

                        public final MplsLdpEntityAtmUnlabTrafVpiEnt mplsLdpEntityAtmUnlabTrafVpi;

                        public final MplsLdpEntityAtmUnlabTrafVciEnt mplsLdpEntityAtmUnlabTrafVci;

                        public final MplsLdpEntityAtmStorageTypeEnt mplsLdpEntityAtmStorageType;

                        public final MplsLdpEntityAtmRowStatusEnt mplsLdpEntityAtmRowStatus;

                        private MplsLdpEntityAtmEntryEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityAtmEntry", "1.3.6.1.2.1.10.166.5.1.1.1.1", false, false, false, true);
                            this.mplsLdpEntityAtmIfIndexOrZero = new MplsLdpEntityAtmIfIndexOrZeroEnt(mib, this);
                            this.mplsLdpEntityAtmMergeCap = new MplsLdpEntityAtmMergeCapEnt(mib, this);
                            this.mplsLdpEntityAtmLRComponents = new MplsLdpEntityAtmLRComponentsEnt(mib, this);
                            this.mplsLdpEntityAtmVcDirectionality = new MplsLdpEntityAtmVcDirectionalityEnt(mib, this);
                            this.mplsLdpEntityAtmLsrConnectivity = new MplsLdpEntityAtmLsrConnectivityEnt(mib, this);
                            this.mplsLdpEntityAtmDefaultControlVpi = new MplsLdpEntityAtmDefaultControlVpiEnt(mib, this);
                            this.mplsLdpEntityAtmDefaultControlVci = new MplsLdpEntityAtmDefaultControlVciEnt(mib, this);
                            this.mplsLdpEntityAtmUnlabTrafVpi = new MplsLdpEntityAtmUnlabTrafVpiEnt(mib, this);
                            this.mplsLdpEntityAtmUnlabTrafVci = new MplsLdpEntityAtmUnlabTrafVciEnt(mib, this);
                            this.mplsLdpEntityAtmStorageType = new MplsLdpEntityAtmStorageTypeEnt(mib, this);
                            this.mplsLdpEntityAtmRowStatus = new MplsLdpEntityAtmRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityAtmIfIndexOrZero,
                                this.mplsLdpEntityAtmMergeCap,
                                this.mplsLdpEntityAtmLRComponents,
                                this.mplsLdpEntityAtmVcDirectionality,
                                this.mplsLdpEntityAtmLsrConnectivity,
                                this.mplsLdpEntityAtmDefaultControlVpi,
                                this.mplsLdpEntityAtmDefaultControlVci,
                                this.mplsLdpEntityAtmUnlabTrafVpi,
                                this.mplsLdpEntityAtmUnlabTrafVci,
                                this.mplsLdpEntityAtmStorageType,
                                this.mplsLdpEntityAtmRowStatus
                            };
                        }
                        public static final class MplsLdpEntityAtmIfIndexOrZeroEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmIfIndexOrZeroEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmIfIndexOrZero", "1.3.6.1.2.1.10.166.5.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmMergeCapEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmMergeCapEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmMergeCap", "1.3.6.1.2.1.10.166.5.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLRComponentsEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRComponentsEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRComponents", "1.3.6.1.2.1.10.166.5.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmVcDirectionalityEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmVcDirectionalityEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmVcDirectionality", "1.3.6.1.2.1.10.166.5.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLsrConnectivityEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLsrConnectivityEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLsrConnectivity", "1.3.6.1.2.1.10.166.5.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmDefaultControlVpiEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmDefaultControlVpiEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmDefaultControlVpi", "1.3.6.1.2.1.10.166.5.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmDefaultControlVciEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmDefaultControlVciEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmDefaultControlVci", "1.3.6.1.2.1.10.166.5.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmUnlabTrafVpiEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmUnlabTrafVpiEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmUnlabTrafVpi", "1.3.6.1.2.1.10.166.5.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmUnlabTrafVciEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmUnlabTrafVciEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmUnlabTrafVci", "1.3.6.1.2.1.10.166.5.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmStorageTypeEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmStorageTypeEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmStorageType", "1.3.6.1.2.1.10.166.5.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmRowStatusEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmRowStatusEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmRowStatus", "1.3.6.1.2.1.10.166.5.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MplsLdpEntityAtmLRTableEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                {
                    public final MplsLdpEntityAtmLREntryEnt mplsLdpEntityAtmLREntry;

                    private MplsLdpEntityAtmLRTableEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpEntityAtmLRTable", "1.3.6.1.2.1.10.166.5.1.1.2", false, true, false, false);
                        this.mplsLdpEntityAtmLREntry = new MplsLdpEntityAtmLREntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpEntityAtmLREntry
                        };
                    }
                    public static final class MplsLdpEntityAtmLREntryEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                    {
                        public final MplsLdpEntityAtmLRMinVpiEnt mplsLdpEntityAtmLRMinVpi;

                        public final MplsLdpEntityAtmLRMinVciEnt mplsLdpEntityAtmLRMinVci;

                        public final MplsLdpEntityAtmLRMaxVpiEnt mplsLdpEntityAtmLRMaxVpi;

                        public final MplsLdpEntityAtmLRMaxVciEnt mplsLdpEntityAtmLRMaxVci;

                        public final MplsLdpEntityAtmLRStorageTypeEnt mplsLdpEntityAtmLRStorageType;

                        public final MplsLdpEntityAtmLRRowStatusEnt mplsLdpEntityAtmLRRowStatus;

                        private MplsLdpEntityAtmLREntryEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpEntityAtmLREntry", "1.3.6.1.2.1.10.166.5.1.1.2.1", false, false, false, true);
                            this.mplsLdpEntityAtmLRMinVpi = new MplsLdpEntityAtmLRMinVpiEnt(mib, this);
                            this.mplsLdpEntityAtmLRMinVci = new MplsLdpEntityAtmLRMinVciEnt(mib, this);
                            this.mplsLdpEntityAtmLRMaxVpi = new MplsLdpEntityAtmLRMaxVpiEnt(mib, this);
                            this.mplsLdpEntityAtmLRMaxVci = new MplsLdpEntityAtmLRMaxVciEnt(mib, this);
                            this.mplsLdpEntityAtmLRStorageType = new MplsLdpEntityAtmLRStorageTypeEnt(mib, this);
                            this.mplsLdpEntityAtmLRRowStatus = new MplsLdpEntityAtmLRRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpEntityAtmLRMinVpi,
                                this.mplsLdpEntityAtmLRMinVci,
                                this.mplsLdpEntityAtmLRMaxVpi,
                                this.mplsLdpEntityAtmLRMaxVci,
                                this.mplsLdpEntityAtmLRStorageType,
                                this.mplsLdpEntityAtmLRRowStatus
                            };
                        }
                        public static final class MplsLdpEntityAtmLRMinVpiEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRMinVpiEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRMinVpi", "1.3.6.1.2.1.10.166.5.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLRMinVciEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRMinVciEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRMinVci", "1.3.6.1.2.1.10.166.5.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLRMaxVpiEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRMaxVpiEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRMaxVpi", "1.3.6.1.2.1.10.166.5.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLRMaxVciEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRMaxVciEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRMaxVci", "1.3.6.1.2.1.10.166.5.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLRStorageTypeEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRStorageTypeEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRStorageType", "1.3.6.1.2.1.10.166.5.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpEntityAtmLRRowStatusEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpEntityAtmLRRowStatusEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpEntityAtmLRRowStatus", "1.3.6.1.2.1.10.166.5.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MplsLdpAtmSessionObjectsEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
            {
                public final MplsLdpAtmSessionTableEnt mplsLdpAtmSessionTable;

                private MplsLdpAtmSessionObjectsEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpAtmSessionObjects", "1.3.6.1.2.1.10.166.5.1.2", false, false, false, false);
                    this.mplsLdpAtmSessionTable = new MplsLdpAtmSessionTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpAtmSessionTable
                    };
                }
                public static final class MplsLdpAtmSessionTableEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                {
                    public final MplsLdpAtmSessionEntryEnt mplsLdpAtmSessionEntry;

                    private MplsLdpAtmSessionTableEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpAtmSessionTable", "1.3.6.1.2.1.10.166.5.1.2.1", false, true, false, false);
                        this.mplsLdpAtmSessionEntry = new MplsLdpAtmSessionEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLdpAtmSessionEntry
                        };
                    }
                    public static final class MplsLdpAtmSessionEntryEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                    {
                        public final MplsLdpSessionAtmLRLowerBoundVpiEnt mplsLdpSessionAtmLRLowerBoundVpi;

                        public final MplsLdpSessionAtmLRLowerBoundVciEnt mplsLdpSessionAtmLRLowerBoundVci;

                        public final MplsLdpSessionAtmLRUpperBoundVpiEnt mplsLdpSessionAtmLRUpperBoundVpi;

                        public final MplsLdpSessionAtmLRUpperBoundVciEnt mplsLdpSessionAtmLRUpperBoundVci;

                        private MplsLdpAtmSessionEntryEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLdpAtmSessionEntry", "1.3.6.1.2.1.10.166.5.1.2.1.1", false, false, false, true);
                            this.mplsLdpSessionAtmLRLowerBoundVpi = new MplsLdpSessionAtmLRLowerBoundVpiEnt(mib, this);
                            this.mplsLdpSessionAtmLRLowerBoundVci = new MplsLdpSessionAtmLRLowerBoundVciEnt(mib, this);
                            this.mplsLdpSessionAtmLRUpperBoundVpi = new MplsLdpSessionAtmLRUpperBoundVpiEnt(mib, this);
                            this.mplsLdpSessionAtmLRUpperBoundVci = new MplsLdpSessionAtmLRUpperBoundVciEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.mplsLdpSessionAtmLRLowerBoundVpi,
                                this.mplsLdpSessionAtmLRLowerBoundVci,
                                this.mplsLdpSessionAtmLRUpperBoundVpi,
                                this.mplsLdpSessionAtmLRUpperBoundVci
                            };
                        }
                        public static final class MplsLdpSessionAtmLRLowerBoundVpiEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpSessionAtmLRLowerBoundVpiEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionAtmLRLowerBoundVpi", "1.3.6.1.2.1.10.166.5.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionAtmLRLowerBoundVciEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpSessionAtmLRLowerBoundVciEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionAtmLRLowerBoundVci", "1.3.6.1.2.1.10.166.5.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionAtmLRUpperBoundVpiEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpSessionAtmLRUpperBoundVpiEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionAtmLRUpperBoundVpi", "1.3.6.1.2.1.10.166.5.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MplsLdpSessionAtmLRUpperBoundVciEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                        {
                            private MplsLdpSessionAtmLRUpperBoundVciEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                            {
                                super(mib, parent, "mplsLdpSessionAtmLRUpperBoundVci", "1.3.6.1.2.1.10.166.5.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class MplsLdpAtmConformanceEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
        {
            /** **************************************************************Module Conformance Statement***************************************************************/
            public final MplsLdpAtmGroupsEnt mplsLdpAtmGroups;

            public final MplsLdpAtmCompliancesEnt mplsLdpAtmCompliances;

            private MplsLdpAtmConformanceEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLdpAtmConformance", "1.3.6.1.2.1.10.166.5.2", false, false, false, false);
                this.mplsLdpAtmGroups = new MplsLdpAtmGroupsEnt(mib, this);
                this.mplsLdpAtmCompliances = new MplsLdpAtmCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLdpAtmGroups,
                    this.mplsLdpAtmCompliances
                };
            }
            public static final class MplsLdpAtmGroupsEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
            {
                /** units of conformance*/
                public final MplsLdpAtmGroupEnt mplsLdpAtmGroup;

                private MplsLdpAtmGroupsEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpAtmGroups", "1.3.6.1.2.1.10.166.5.2.1", false, false, false, false);
                    this.mplsLdpAtmGroup = new MplsLdpAtmGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpAtmGroup
                    };
                }
                public static final class MplsLdpAtmGroupEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                {
                    private MplsLdpAtmGroupEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpAtmGroup", "1.3.6.1.2.1.10.166.5.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLdpAtmCompliancesEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
            {
                /** Full Compliance*/
                public final MplsLdpAtmModuleFullComplianceEnt mplsLdpAtmModuleFullCompliance;

                /** Read-Only Compliance*/
                public final MplsLdpAtmModuleReadOnlyComplianceEnt mplsLdpAtmModuleReadOnlyCompliance;

                private MplsLdpAtmCompliancesEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLdpAtmCompliances", "1.3.6.1.2.1.10.166.5.2.2", false, false, false, false);
                    this.mplsLdpAtmModuleFullCompliance = new MplsLdpAtmModuleFullComplianceEnt(mib, this);
                    this.mplsLdpAtmModuleReadOnlyCompliance = new MplsLdpAtmModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLdpAtmModuleFullCompliance,
                        this.mplsLdpAtmModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLdpAtmModuleFullComplianceEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                {
                    private MplsLdpAtmModuleFullComplianceEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpAtmModuleFullCompliance", "1.3.6.1.2.1.10.166.5.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLdpAtmModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLDPATMSTDMIBDef>
                {
                    private MplsLdpAtmModuleReadOnlyComplianceEnt(MPLSLDPATMSTDMIBDef mib, MIBEntry<MPLSLDPATMSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLdpAtmModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.5.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
