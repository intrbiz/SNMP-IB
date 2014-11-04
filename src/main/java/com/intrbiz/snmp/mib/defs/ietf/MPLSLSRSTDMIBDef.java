package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2580]
[RFC2579]
[RFC2863]
[RFC3811]
[IANAFamily]
[RFC3291]*/
public final class MPLSLSRSTDMIBDef extends MIB
{
    public static final MPLSLSRSTDMIBDef MPLSLSRSTDMIB = new MPLSLSRSTDMIBDef();

    static { MIBs.getInstance().registerMIB(MPLSLSRSTDMIBDef.MPLSLSRSTDMIB); }

    /** June 3, 2004*/
    public final MplsLsrStdMIBEnt mplsLsrStdMIB;

    private MPLSLSRSTDMIBDef()
    {
        super("MPLS-LSR-STD-MIB");
        this.mplsLsrStdMIB = new MplsLsrStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mplsLsrStdMIB
        };
    }

    public static final class MplsLsrStdMIBEnt extends MIBEntry<MPLSLSRSTDMIBDef>
    {
        /** Top level components of this MIB module.
Notifications*/
        public final MplsLsrNotificationsEnt mplsLsrNotifications;

        /** Tables, Scalars*/
        public final MplsLsrObjectsEnt mplsLsrObjects;

        /** Conformance*/
        public final MplsLsrConformanceEnt mplsLsrConformance;

        private MplsLsrStdMIBEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
        {
            super(mib, parent, "mplsLsrStdMIB", "1.3.6.1.2.1.10.166.2", false, false, false, false);
            this.mplsLsrNotifications = new MplsLsrNotificationsEnt(mib, this);
            this.mplsLsrObjects = new MplsLsrObjectsEnt(mib, this);
            this.mplsLsrConformance = new MplsLsrConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mplsLsrNotifications,
                this.mplsLsrObjects,
                this.mplsLsrConformance
            };
        }
        public static final class MplsLsrNotificationsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
        {
            /** Cross-connect.

start of range
end of range*/
            public final MplsXCUpEnt mplsXCUp;

            /** start of range
end of range*/
            public final MplsXCDownEnt mplsXCDown;

            private MplsLsrNotificationsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLsrNotifications", "1.3.6.1.2.1.10.166.2.0", false, false, false, false);
                this.mplsXCUp = new MplsXCUpEnt(mib, this);
                this.mplsXCDown = new MplsXCDownEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsXCUp,
                    this.mplsXCDown
                };
            }
            public static final class MplsXCUpEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsXCUpEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsXCUp", "1.3.6.1.2.1.10.166.2.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsXCDownEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsXCDownEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsXCDown", "1.3.6.1.2.1.10.166.2.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsLsrObjectsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
        {
            /** MPLS Interface Table.*/
            public final MplsInterfaceTableEnt mplsInterfaceTable;

            /** End of mplsInterfaceTable

MPLS Interface Performance Table.*/
            public final MplsInterfacePerfTableEnt mplsInterfacePerfTable;

            /** mplsInterfacePerf Table end.*/
            public final MplsInSegmentIndexNextEnt mplsInSegmentIndexNext;

            /** in-segment table.*/
            public final MplsInSegmentTableEnt mplsInSegmentTable;

            /** End of mplsInSegmentTable
in-segment performance table.*/
            public final MplsInSegmentPerfTableEnt mplsInSegmentPerfTable;

            /** End of mplsInSegmentPerfTable.
out-segment table.*/
            public final MplsOutSegmentIndexNextEnt mplsOutSegmentIndexNext;

            public final MplsOutSegmentTableEnt mplsOutSegmentTable;

            /** End of mplsOutSegmentTable

out-segment performance table.*/
            public final MplsOutSegmentPerfTableEnt mplsOutSegmentPerfTable;

            /** End of mplsOutSegmentPerfTable.

Cross-connect table.*/
            public final MplsXCIndexNextEnt mplsXCIndexNext;

            public final MplsXCTableEnt mplsXCTable;

            /** End of mplsXCTable

Label stack table.*/
            public final MplsMaxLabelStackDepthEnt mplsMaxLabelStackDepth;

            public final MplsLabelStackIndexNextEnt mplsLabelStackIndexNext;

            public final MplsLabelStackTableEnt mplsLabelStackTable;

            /** End of mplsLabelStackTable
Begin mplsInSegmentMapTable*/
            public final MplsInSegmentMapTableEnt mplsInSegmentMapTable;

            /** End mplsInSegmentMapTable

Notification Configuration*/
            public final MplsXCNotificationsEnableEnt mplsXCNotificationsEnable;

            private MplsLsrObjectsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLsrObjects", "1.3.6.1.2.1.10.166.2.1", false, false, false, false);
                this.mplsInterfaceTable = new MplsInterfaceTableEnt(mib, this);
                this.mplsInterfacePerfTable = new MplsInterfacePerfTableEnt(mib, this);
                this.mplsInSegmentIndexNext = new MplsInSegmentIndexNextEnt(mib, this);
                this.mplsInSegmentTable = new MplsInSegmentTableEnt(mib, this);
                this.mplsInSegmentPerfTable = new MplsInSegmentPerfTableEnt(mib, this);
                this.mplsOutSegmentIndexNext = new MplsOutSegmentIndexNextEnt(mib, this);
                this.mplsOutSegmentTable = new MplsOutSegmentTableEnt(mib, this);
                this.mplsOutSegmentPerfTable = new MplsOutSegmentPerfTableEnt(mib, this);
                this.mplsXCIndexNext = new MplsXCIndexNextEnt(mib, this);
                this.mplsXCTable = new MplsXCTableEnt(mib, this);
                this.mplsMaxLabelStackDepth = new MplsMaxLabelStackDepthEnt(mib, this);
                this.mplsLabelStackIndexNext = new MplsLabelStackIndexNextEnt(mib, this);
                this.mplsLabelStackTable = new MplsLabelStackTableEnt(mib, this);
                this.mplsInSegmentMapTable = new MplsInSegmentMapTableEnt(mib, this);
                this.mplsXCNotificationsEnable = new MplsXCNotificationsEnableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsInterfaceTable,
                    this.mplsInterfacePerfTable,
                    this.mplsInSegmentIndexNext,
                    this.mplsInSegmentTable,
                    this.mplsInSegmentPerfTable,
                    this.mplsOutSegmentIndexNext,
                    this.mplsOutSegmentTable,
                    this.mplsOutSegmentPerfTable,
                    this.mplsXCIndexNext,
                    this.mplsXCTable,
                    this.mplsMaxLabelStackDepth,
                    this.mplsLabelStackIndexNext,
                    this.mplsLabelStackTable,
                    this.mplsInSegmentMapTable,
                    this.mplsXCNotificationsEnable
                };
            }
            public static final class MplsInterfaceTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsInterfaceEntryEnt mplsInterfaceEntry;

                private MplsInterfaceTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsInterfaceTable", "1.3.6.1.2.1.10.166.2.1.1", false, true, false, false);
                    this.mplsInterfaceEntry = new MplsInterfaceEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsInterfaceEntry
                    };
                }
                public static final class MplsInterfaceEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsInterfaceIndexEnt mplsInterfaceIndex;

                    public final MplsInterfaceLabelMinInEnt mplsInterfaceLabelMinIn;

                    public final MplsInterfaceLabelMaxInEnt mplsInterfaceLabelMaxIn;

                    public final MplsInterfaceLabelMinOutEnt mplsInterfaceLabelMinOut;

                    public final MplsInterfaceLabelMaxOutEnt mplsInterfaceLabelMaxOut;

                    public final MplsInterfaceTotalBandwidthEnt mplsInterfaceTotalBandwidth;

                    public final MplsInterfaceAvailableBandwidthEnt mplsInterfaceAvailableBandwidth;

                    public final MplsInterfaceLabelParticipationTypeEnt mplsInterfaceLabelParticipationType;

                    private MplsInterfaceEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInterfaceEntry", "1.3.6.1.2.1.10.166.2.1.1.1", false, false, false, true);
                        this.mplsInterfaceIndex = new MplsInterfaceIndexEnt(mib, this);
                        this.mplsInterfaceLabelMinIn = new MplsInterfaceLabelMinInEnt(mib, this);
                        this.mplsInterfaceLabelMaxIn = new MplsInterfaceLabelMaxInEnt(mib, this);
                        this.mplsInterfaceLabelMinOut = new MplsInterfaceLabelMinOutEnt(mib, this);
                        this.mplsInterfaceLabelMaxOut = new MplsInterfaceLabelMaxOutEnt(mib, this);
                        this.mplsInterfaceTotalBandwidth = new MplsInterfaceTotalBandwidthEnt(mib, this);
                        this.mplsInterfaceAvailableBandwidth = new MplsInterfaceAvailableBandwidthEnt(mib, this);
                        this.mplsInterfaceLabelParticipationType = new MplsInterfaceLabelParticipationTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsInterfaceIndex,
                            this.mplsInterfaceLabelMinIn,
                            this.mplsInterfaceLabelMaxIn,
                            this.mplsInterfaceLabelMinOut,
                            this.mplsInterfaceLabelMaxOut,
                            this.mplsInterfaceTotalBandwidth,
                            this.mplsInterfaceAvailableBandwidth,
                            this.mplsInterfaceLabelParticipationType
                        };
                    }
                    public static final class MplsInterfaceIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceIndex", "1.3.6.1.2.1.10.166.2.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceLabelMinInEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceLabelMinInEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceLabelMinIn", "1.3.6.1.2.1.10.166.2.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceLabelMaxInEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceLabelMaxInEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceLabelMaxIn", "1.3.6.1.2.1.10.166.2.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceLabelMinOutEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceLabelMinOutEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceLabelMinOut", "1.3.6.1.2.1.10.166.2.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceLabelMaxOutEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceLabelMaxOutEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceLabelMaxOut", "1.3.6.1.2.1.10.166.2.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceTotalBandwidthEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceTotalBandwidthEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceTotalBandwidth", "1.3.6.1.2.1.10.166.2.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceAvailableBandwidthEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceAvailableBandwidthEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceAvailableBandwidth", "1.3.6.1.2.1.10.166.2.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfaceLabelParticipationTypeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfaceLabelParticipationTypeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfaceLabelParticipationType", "1.3.6.1.2.1.10.166.2.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsInterfacePerfTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsInterfacePerfEntryEnt mplsInterfacePerfEntry;

                private MplsInterfacePerfTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsInterfacePerfTable", "1.3.6.1.2.1.10.166.2.1.2", false, true, false, false);
                    this.mplsInterfacePerfEntry = new MplsInterfacePerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsInterfacePerfEntry
                    };
                }
                public static final class MplsInterfacePerfEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsInterfacePerfInLabelsInUseEnt mplsInterfacePerfInLabelsInUse;

                    public final MplsInterfacePerfInLabelLookupFailuresEnt mplsInterfacePerfInLabelLookupFailures;

                    public final MplsInterfacePerfOutLabelsInUseEnt mplsInterfacePerfOutLabelsInUse;

                    public final MplsInterfacePerfOutFragmentedPktsEnt mplsInterfacePerfOutFragmentedPkts;

                    private MplsInterfacePerfEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInterfacePerfEntry", "1.3.6.1.2.1.10.166.2.1.2.1", false, false, false, true);
                        this.mplsInterfacePerfInLabelsInUse = new MplsInterfacePerfInLabelsInUseEnt(mib, this);
                        this.mplsInterfacePerfInLabelLookupFailures = new MplsInterfacePerfInLabelLookupFailuresEnt(mib, this);
                        this.mplsInterfacePerfOutLabelsInUse = new MplsInterfacePerfOutLabelsInUseEnt(mib, this);
                        this.mplsInterfacePerfOutFragmentedPkts = new MplsInterfacePerfOutFragmentedPktsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsInterfacePerfInLabelsInUse,
                            this.mplsInterfacePerfInLabelLookupFailures,
                            this.mplsInterfacePerfOutLabelsInUse,
                            this.mplsInterfacePerfOutFragmentedPkts
                        };
                    }
                    public static final class MplsInterfacePerfInLabelsInUseEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfacePerfInLabelsInUseEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfacePerfInLabelsInUse", "1.3.6.1.2.1.10.166.2.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfacePerfInLabelLookupFailuresEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfacePerfInLabelLookupFailuresEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfacePerfInLabelLookupFailures", "1.3.6.1.2.1.10.166.2.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfacePerfOutLabelsInUseEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfacePerfOutLabelsInUseEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfacePerfOutLabelsInUse", "1.3.6.1.2.1.10.166.2.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInterfacePerfOutFragmentedPktsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInterfacePerfOutFragmentedPktsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInterfacePerfOutFragmentedPkts", "1.3.6.1.2.1.10.166.2.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsInSegmentIndexNextEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsInSegmentIndexNextEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsInSegmentIndexNext", "1.3.6.1.2.1.10.166.2.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsInSegmentTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsInSegmentEntryEnt mplsInSegmentEntry;

                private MplsInSegmentTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsInSegmentTable", "1.3.6.1.2.1.10.166.2.1.4", false, true, false, false);
                    this.mplsInSegmentEntry = new MplsInSegmentEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsInSegmentEntry
                    };
                }
                public static final class MplsInSegmentEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsInSegmentIndexEnt mplsInSegmentIndex;

                    public final MplsInSegmentInterfaceEnt mplsInSegmentInterface;

                    public final MplsInSegmentLabelEnt mplsInSegmentLabel;

                    public final MplsInSegmentLabelPtrEnt mplsInSegmentLabelPtr;

                    public final MplsInSegmentNPopEnt mplsInSegmentNPop;

                    public final MplsInSegmentAddrFamilyEnt mplsInSegmentAddrFamily;

                    public final MplsInSegmentXCIndexEnt mplsInSegmentXCIndex;

                    public final MplsInSegmentOwnerEnt mplsInSegmentOwner;

                    public final MplsInSegmentTrafficParamPtrEnt mplsInSegmentTrafficParamPtr;

                    public final MplsInSegmentRowStatusEnt mplsInSegmentRowStatus;

                    public final MplsInSegmentStorageTypeEnt mplsInSegmentStorageType;

                    private MplsInSegmentEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInSegmentEntry", "1.3.6.1.2.1.10.166.2.1.4.1", false, false, false, true);
                        this.mplsInSegmentIndex = new MplsInSegmentIndexEnt(mib, this);
                        this.mplsInSegmentInterface = new MplsInSegmentInterfaceEnt(mib, this);
                        this.mplsInSegmentLabel = new MplsInSegmentLabelEnt(mib, this);
                        this.mplsInSegmentLabelPtr = new MplsInSegmentLabelPtrEnt(mib, this);
                        this.mplsInSegmentNPop = new MplsInSegmentNPopEnt(mib, this);
                        this.mplsInSegmentAddrFamily = new MplsInSegmentAddrFamilyEnt(mib, this);
                        this.mplsInSegmentXCIndex = new MplsInSegmentXCIndexEnt(mib, this);
                        this.mplsInSegmentOwner = new MplsInSegmentOwnerEnt(mib, this);
                        this.mplsInSegmentTrafficParamPtr = new MplsInSegmentTrafficParamPtrEnt(mib, this);
                        this.mplsInSegmentRowStatus = new MplsInSegmentRowStatusEnt(mib, this);
                        this.mplsInSegmentStorageType = new MplsInSegmentStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsInSegmentIndex,
                            this.mplsInSegmentInterface,
                            this.mplsInSegmentLabel,
                            this.mplsInSegmentLabelPtr,
                            this.mplsInSegmentNPop,
                            this.mplsInSegmentAddrFamily,
                            this.mplsInSegmentXCIndex,
                            this.mplsInSegmentOwner,
                            this.mplsInSegmentTrafficParamPtr,
                            this.mplsInSegmentRowStatus,
                            this.mplsInSegmentStorageType
                        };
                    }
                    public static final class MplsInSegmentIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentIndex", "1.3.6.1.2.1.10.166.2.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentInterfaceEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentInterfaceEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentInterface", "1.3.6.1.2.1.10.166.2.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentLabelEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentLabelEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentLabel", "1.3.6.1.2.1.10.166.2.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentLabelPtrEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentLabelPtrEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentLabelPtr", "1.3.6.1.2.1.10.166.2.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentNPopEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentNPopEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentNPop", "1.3.6.1.2.1.10.166.2.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentAddrFamilyEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentAddrFamilyEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentAddrFamily", "1.3.6.1.2.1.10.166.2.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentXCIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentXCIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentXCIndex", "1.3.6.1.2.1.10.166.2.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentOwnerEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentOwnerEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentOwner", "1.3.6.1.2.1.10.166.2.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentTrafficParamPtrEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentTrafficParamPtrEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentTrafficParamPtr", "1.3.6.1.2.1.10.166.2.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentRowStatusEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentRowStatusEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentRowStatus", "1.3.6.1.2.1.10.166.2.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentStorageTypeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentStorageTypeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentStorageType", "1.3.6.1.2.1.10.166.2.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsInSegmentPerfTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsInSegmentPerfEntryEnt mplsInSegmentPerfEntry;

                private MplsInSegmentPerfTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsInSegmentPerfTable", "1.3.6.1.2.1.10.166.2.1.5", false, true, false, false);
                    this.mplsInSegmentPerfEntry = new MplsInSegmentPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsInSegmentPerfEntry
                    };
                }
                public static final class MplsInSegmentPerfEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsInSegmentPerfOctetsEnt mplsInSegmentPerfOctets;

                    public final MplsInSegmentPerfPacketsEnt mplsInSegmentPerfPackets;

                    public final MplsInSegmentPerfErrorsEnt mplsInSegmentPerfErrors;

                    public final MplsInSegmentPerfDiscardsEnt mplsInSegmentPerfDiscards;

                    public final MplsInSegmentPerfHCOctetsEnt mplsInSegmentPerfHCOctets;

                    public final MplsInSegmentPerfDiscontinuityTimeEnt mplsInSegmentPerfDiscontinuityTime;

                    private MplsInSegmentPerfEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInSegmentPerfEntry", "1.3.6.1.2.1.10.166.2.1.5.1", false, false, false, true);
                        this.mplsInSegmentPerfOctets = new MplsInSegmentPerfOctetsEnt(mib, this);
                        this.mplsInSegmentPerfPackets = new MplsInSegmentPerfPacketsEnt(mib, this);
                        this.mplsInSegmentPerfErrors = new MplsInSegmentPerfErrorsEnt(mib, this);
                        this.mplsInSegmentPerfDiscards = new MplsInSegmentPerfDiscardsEnt(mib, this);
                        this.mplsInSegmentPerfHCOctets = new MplsInSegmentPerfHCOctetsEnt(mib, this);
                        this.mplsInSegmentPerfDiscontinuityTime = new MplsInSegmentPerfDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsInSegmentPerfOctets,
                            this.mplsInSegmentPerfPackets,
                            this.mplsInSegmentPerfErrors,
                            this.mplsInSegmentPerfDiscards,
                            this.mplsInSegmentPerfHCOctets,
                            this.mplsInSegmentPerfDiscontinuityTime
                        };
                    }
                    public static final class MplsInSegmentPerfOctetsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentPerfOctetsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentPerfOctets", "1.3.6.1.2.1.10.166.2.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentPerfPacketsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentPerfPacketsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentPerfPackets", "1.3.6.1.2.1.10.166.2.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentPerfErrorsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentPerfErrorsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentPerfErrors", "1.3.6.1.2.1.10.166.2.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentPerfDiscardsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentPerfDiscardsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentPerfDiscards", "1.3.6.1.2.1.10.166.2.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentPerfHCOctetsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentPerfHCOctetsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentPerfHCOctets", "1.3.6.1.2.1.10.166.2.1.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentPerfDiscontinuityTimeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentPerfDiscontinuityTimeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentPerfDiscontinuityTime", "1.3.6.1.2.1.10.166.2.1.5.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsOutSegmentIndexNextEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsOutSegmentIndexNextEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsOutSegmentIndexNext", "1.3.6.1.2.1.10.166.2.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsOutSegmentTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsOutSegmentEntryEnt mplsOutSegmentEntry;

                private MplsOutSegmentTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsOutSegmentTable", "1.3.6.1.2.1.10.166.2.1.7", false, true, false, false);
                    this.mplsOutSegmentEntry = new MplsOutSegmentEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsOutSegmentEntry
                    };
                }
                public static final class MplsOutSegmentEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsOutSegmentIndexEnt mplsOutSegmentIndex;

                    public final MplsOutSegmentInterfaceEnt mplsOutSegmentInterface;

                    public final MplsOutSegmentPushTopLabelEnt mplsOutSegmentPushTopLabel;

                    public final MplsOutSegmentTopLabelEnt mplsOutSegmentTopLabel;

                    public final MplsOutSegmentTopLabelPtrEnt mplsOutSegmentTopLabelPtr;

                    public final MplsOutSegmentNextHopAddrTypeEnt mplsOutSegmentNextHopAddrType;

                    public final MplsOutSegmentNextHopAddrEnt mplsOutSegmentNextHopAddr;

                    public final MplsOutSegmentXCIndexEnt mplsOutSegmentXCIndex;

                    public final MplsOutSegmentOwnerEnt mplsOutSegmentOwner;

                    public final MplsOutSegmentTrafficParamPtrEnt mplsOutSegmentTrafficParamPtr;

                    public final MplsOutSegmentRowStatusEnt mplsOutSegmentRowStatus;

                    public final MplsOutSegmentStorageTypeEnt mplsOutSegmentStorageType;

                    private MplsOutSegmentEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsOutSegmentEntry", "1.3.6.1.2.1.10.166.2.1.7.1", false, false, false, true);
                        this.mplsOutSegmentIndex = new MplsOutSegmentIndexEnt(mib, this);
                        this.mplsOutSegmentInterface = new MplsOutSegmentInterfaceEnt(mib, this);
                        this.mplsOutSegmentPushTopLabel = new MplsOutSegmentPushTopLabelEnt(mib, this);
                        this.mplsOutSegmentTopLabel = new MplsOutSegmentTopLabelEnt(mib, this);
                        this.mplsOutSegmentTopLabelPtr = new MplsOutSegmentTopLabelPtrEnt(mib, this);
                        this.mplsOutSegmentNextHopAddrType = new MplsOutSegmentNextHopAddrTypeEnt(mib, this);
                        this.mplsOutSegmentNextHopAddr = new MplsOutSegmentNextHopAddrEnt(mib, this);
                        this.mplsOutSegmentXCIndex = new MplsOutSegmentXCIndexEnt(mib, this);
                        this.mplsOutSegmentOwner = new MplsOutSegmentOwnerEnt(mib, this);
                        this.mplsOutSegmentTrafficParamPtr = new MplsOutSegmentTrafficParamPtrEnt(mib, this);
                        this.mplsOutSegmentRowStatus = new MplsOutSegmentRowStatusEnt(mib, this);
                        this.mplsOutSegmentStorageType = new MplsOutSegmentStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsOutSegmentIndex,
                            this.mplsOutSegmentInterface,
                            this.mplsOutSegmentPushTopLabel,
                            this.mplsOutSegmentTopLabel,
                            this.mplsOutSegmentTopLabelPtr,
                            this.mplsOutSegmentNextHopAddrType,
                            this.mplsOutSegmentNextHopAddr,
                            this.mplsOutSegmentXCIndex,
                            this.mplsOutSegmentOwner,
                            this.mplsOutSegmentTrafficParamPtr,
                            this.mplsOutSegmentRowStatus,
                            this.mplsOutSegmentStorageType
                        };
                    }
                    public static final class MplsOutSegmentIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentIndex", "1.3.6.1.2.1.10.166.2.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentInterfaceEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentInterfaceEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentInterface", "1.3.6.1.2.1.10.166.2.1.7.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentPushTopLabelEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPushTopLabelEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPushTopLabel", "1.3.6.1.2.1.10.166.2.1.7.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentTopLabelEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentTopLabelEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentTopLabel", "1.3.6.1.2.1.10.166.2.1.7.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentTopLabelPtrEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentTopLabelPtrEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentTopLabelPtr", "1.3.6.1.2.1.10.166.2.1.7.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentNextHopAddrTypeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentNextHopAddrTypeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentNextHopAddrType", "1.3.6.1.2.1.10.166.2.1.7.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentNextHopAddrEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentNextHopAddrEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentNextHopAddr", "1.3.6.1.2.1.10.166.2.1.7.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentXCIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentXCIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentXCIndex", "1.3.6.1.2.1.10.166.2.1.7.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentOwnerEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentOwnerEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentOwner", "1.3.6.1.2.1.10.166.2.1.7.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentTrafficParamPtrEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentTrafficParamPtrEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentTrafficParamPtr", "1.3.6.1.2.1.10.166.2.1.7.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentRowStatusEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentRowStatusEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentRowStatus", "1.3.6.1.2.1.10.166.2.1.7.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentStorageTypeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentStorageTypeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentStorageType", "1.3.6.1.2.1.10.166.2.1.7.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsOutSegmentPerfTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsOutSegmentPerfEntryEnt mplsOutSegmentPerfEntry;

                private MplsOutSegmentPerfTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsOutSegmentPerfTable", "1.3.6.1.2.1.10.166.2.1.8", false, true, false, false);
                    this.mplsOutSegmentPerfEntry = new MplsOutSegmentPerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsOutSegmentPerfEntry
                    };
                }
                public static final class MplsOutSegmentPerfEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsOutSegmentPerfOctetsEnt mplsOutSegmentPerfOctets;

                    public final MplsOutSegmentPerfPacketsEnt mplsOutSegmentPerfPackets;

                    public final MplsOutSegmentPerfErrorsEnt mplsOutSegmentPerfErrors;

                    public final MplsOutSegmentPerfDiscardsEnt mplsOutSegmentPerfDiscards;

                    public final MplsOutSegmentPerfHCOctetsEnt mplsOutSegmentPerfHCOctets;

                    public final MplsOutSegmentPerfDiscontinuityTimeEnt mplsOutSegmentPerfDiscontinuityTime;

                    private MplsOutSegmentPerfEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsOutSegmentPerfEntry", "1.3.6.1.2.1.10.166.2.1.8.1", false, false, false, true);
                        this.mplsOutSegmentPerfOctets = new MplsOutSegmentPerfOctetsEnt(mib, this);
                        this.mplsOutSegmentPerfPackets = new MplsOutSegmentPerfPacketsEnt(mib, this);
                        this.mplsOutSegmentPerfErrors = new MplsOutSegmentPerfErrorsEnt(mib, this);
                        this.mplsOutSegmentPerfDiscards = new MplsOutSegmentPerfDiscardsEnt(mib, this);
                        this.mplsOutSegmentPerfHCOctets = new MplsOutSegmentPerfHCOctetsEnt(mib, this);
                        this.mplsOutSegmentPerfDiscontinuityTime = new MplsOutSegmentPerfDiscontinuityTimeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsOutSegmentPerfOctets,
                            this.mplsOutSegmentPerfPackets,
                            this.mplsOutSegmentPerfErrors,
                            this.mplsOutSegmentPerfDiscards,
                            this.mplsOutSegmentPerfHCOctets,
                            this.mplsOutSegmentPerfDiscontinuityTime
                        };
                    }
                    public static final class MplsOutSegmentPerfOctetsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPerfOctetsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPerfOctets", "1.3.6.1.2.1.10.166.2.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentPerfPacketsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPerfPacketsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPerfPackets", "1.3.6.1.2.1.10.166.2.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentPerfErrorsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPerfErrorsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPerfErrors", "1.3.6.1.2.1.10.166.2.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentPerfDiscardsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPerfDiscardsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPerfDiscards", "1.3.6.1.2.1.10.166.2.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentPerfHCOctetsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPerfHCOctetsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPerfHCOctets", "1.3.6.1.2.1.10.166.2.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsOutSegmentPerfDiscontinuityTimeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsOutSegmentPerfDiscontinuityTimeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsOutSegmentPerfDiscontinuityTime", "1.3.6.1.2.1.10.166.2.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsXCIndexNextEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsXCIndexNextEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsXCIndexNext", "1.3.6.1.2.1.10.166.2.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsXCTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsXCEntryEnt mplsXCEntry;

                private MplsXCTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsXCTable", "1.3.6.1.2.1.10.166.2.1.10", false, true, false, false);
                    this.mplsXCEntry = new MplsXCEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsXCEntry
                    };
                }
                public static final class MplsXCEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsXCIndexEnt mplsXCIndex;

                    public final MplsXCInSegmentIndexEnt mplsXCInSegmentIndex;

                    public final MplsXCOutSegmentIndexEnt mplsXCOutSegmentIndex;

                    public final MplsXCLspIdEnt mplsXCLspId;

                    public final MplsXCLabelStackIndexEnt mplsXCLabelStackIndex;

                    public final MplsXCOwnerEnt mplsXCOwner;

                    public final MplsXCRowStatusEnt mplsXCRowStatus;

                    public final MplsXCStorageTypeEnt mplsXCStorageType;

                    public final MplsXCAdminStatusEnt mplsXCAdminStatus;

                    public final MplsXCOperStatusEnt mplsXCOperStatus;

                    private MplsXCEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsXCEntry", "1.3.6.1.2.1.10.166.2.1.10.1", false, false, false, true);
                        this.mplsXCIndex = new MplsXCIndexEnt(mib, this);
                        this.mplsXCInSegmentIndex = new MplsXCInSegmentIndexEnt(mib, this);
                        this.mplsXCOutSegmentIndex = new MplsXCOutSegmentIndexEnt(mib, this);
                        this.mplsXCLspId = new MplsXCLspIdEnt(mib, this);
                        this.mplsXCLabelStackIndex = new MplsXCLabelStackIndexEnt(mib, this);
                        this.mplsXCOwner = new MplsXCOwnerEnt(mib, this);
                        this.mplsXCRowStatus = new MplsXCRowStatusEnt(mib, this);
                        this.mplsXCStorageType = new MplsXCStorageTypeEnt(mib, this);
                        this.mplsXCAdminStatus = new MplsXCAdminStatusEnt(mib, this);
                        this.mplsXCOperStatus = new MplsXCOperStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsXCIndex,
                            this.mplsXCInSegmentIndex,
                            this.mplsXCOutSegmentIndex,
                            this.mplsXCLspId,
                            this.mplsXCLabelStackIndex,
                            this.mplsXCOwner,
                            this.mplsXCRowStatus,
                            this.mplsXCStorageType,
                            this.mplsXCAdminStatus,
                            this.mplsXCOperStatus
                        };
                    }
                    public static final class MplsXCIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCIndex", "1.3.6.1.2.1.10.166.2.1.10.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCInSegmentIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCInSegmentIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCInSegmentIndex", "1.3.6.1.2.1.10.166.2.1.10.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCOutSegmentIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCOutSegmentIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCOutSegmentIndex", "1.3.6.1.2.1.10.166.2.1.10.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCLspIdEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCLspIdEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCLspId", "1.3.6.1.2.1.10.166.2.1.10.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCLabelStackIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCLabelStackIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCLabelStackIndex", "1.3.6.1.2.1.10.166.2.1.10.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCOwnerEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCOwnerEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCOwner", "1.3.6.1.2.1.10.166.2.1.10.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCRowStatusEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCRowStatusEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCRowStatus", "1.3.6.1.2.1.10.166.2.1.10.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCStorageTypeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCStorageTypeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCStorageType", "1.3.6.1.2.1.10.166.2.1.10.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCAdminStatusEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCAdminStatusEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCAdminStatus", "1.3.6.1.2.1.10.166.2.1.10.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsXCOperStatusEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsXCOperStatusEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsXCOperStatus", "1.3.6.1.2.1.10.166.2.1.10.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsMaxLabelStackDepthEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsMaxLabelStackDepthEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsMaxLabelStackDepth", "1.3.6.1.2.1.10.166.2.1.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsLabelStackIndexNextEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsLabelStackIndexNextEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLabelStackIndexNext", "1.3.6.1.2.1.10.166.2.1.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MplsLabelStackTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsLabelStackEntryEnt mplsLabelStackEntry;

                private MplsLabelStackTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLabelStackTable", "1.3.6.1.2.1.10.166.2.1.13", false, true, false, false);
                    this.mplsLabelStackEntry = new MplsLabelStackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLabelStackEntry
                    };
                }
                public static final class MplsLabelStackEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsLabelStackIndexEnt mplsLabelStackIndex;

                    public final MplsLabelStackLabelIndexEnt mplsLabelStackLabelIndex;

                    public final MplsLabelStackLabelEnt mplsLabelStackLabel;

                    public final MplsLabelStackLabelPtrEnt mplsLabelStackLabelPtr;

                    public final MplsLabelStackRowStatusEnt mplsLabelStackRowStatus;

                    public final MplsLabelStackStorageTypeEnt mplsLabelStackStorageType;

                    private MplsLabelStackEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLabelStackEntry", "1.3.6.1.2.1.10.166.2.1.13.1", false, false, false, true);
                        this.mplsLabelStackIndex = new MplsLabelStackIndexEnt(mib, this);
                        this.mplsLabelStackLabelIndex = new MplsLabelStackLabelIndexEnt(mib, this);
                        this.mplsLabelStackLabel = new MplsLabelStackLabelEnt(mib, this);
                        this.mplsLabelStackLabelPtr = new MplsLabelStackLabelPtrEnt(mib, this);
                        this.mplsLabelStackRowStatus = new MplsLabelStackRowStatusEnt(mib, this);
                        this.mplsLabelStackStorageType = new MplsLabelStackStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsLabelStackIndex,
                            this.mplsLabelStackLabelIndex,
                            this.mplsLabelStackLabel,
                            this.mplsLabelStackLabelPtr,
                            this.mplsLabelStackRowStatus,
                            this.mplsLabelStackStorageType
                        };
                    }
                    public static final class MplsLabelStackIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsLabelStackIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLabelStackIndex", "1.3.6.1.2.1.10.166.2.1.13.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLabelStackLabelIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsLabelStackLabelIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLabelStackLabelIndex", "1.3.6.1.2.1.10.166.2.1.13.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLabelStackLabelEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsLabelStackLabelEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLabelStackLabel", "1.3.6.1.2.1.10.166.2.1.13.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLabelStackLabelPtrEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsLabelStackLabelPtrEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLabelStackLabelPtr", "1.3.6.1.2.1.10.166.2.1.13.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLabelStackRowStatusEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsLabelStackRowStatusEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLabelStackRowStatus", "1.3.6.1.2.1.10.166.2.1.13.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsLabelStackStorageTypeEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsLabelStackStorageTypeEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsLabelStackStorageType", "1.3.6.1.2.1.10.166.2.1.13.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsInSegmentMapTableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                public final MplsInSegmentMapEntryEnt mplsInSegmentMapEntry;

                private MplsInSegmentMapTableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsInSegmentMapTable", "1.3.6.1.2.1.10.166.2.1.14", false, true, false, false);
                    this.mplsInSegmentMapEntry = new MplsInSegmentMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsInSegmentMapEntry
                    };
                }
                public static final class MplsInSegmentMapEntryEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    public final MplsInSegmentMapInterfaceEnt mplsInSegmentMapInterface;

                    public final MplsInSegmentMapLabelEnt mplsInSegmentMapLabel;

                    public final MplsInSegmentMapLabelPtrIndexEnt mplsInSegmentMapLabelPtrIndex;

                    public final MplsInSegmentMapIndexEnt mplsInSegmentMapIndex;

                    private MplsInSegmentMapEntryEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInSegmentMapEntry", "1.3.6.1.2.1.10.166.2.1.14.1", false, false, false, true);
                        this.mplsInSegmentMapInterface = new MplsInSegmentMapInterfaceEnt(mib, this);
                        this.mplsInSegmentMapLabel = new MplsInSegmentMapLabelEnt(mib, this);
                        this.mplsInSegmentMapLabelPtrIndex = new MplsInSegmentMapLabelPtrIndexEnt(mib, this);
                        this.mplsInSegmentMapIndex = new MplsInSegmentMapIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mplsInSegmentMapInterface,
                            this.mplsInSegmentMapLabel,
                            this.mplsInSegmentMapLabelPtrIndex,
                            this.mplsInSegmentMapIndex
                        };
                    }
                    public static final class MplsInSegmentMapInterfaceEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentMapInterfaceEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentMapInterface", "1.3.6.1.2.1.10.166.2.1.14.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentMapLabelEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentMapLabelEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentMapLabel", "1.3.6.1.2.1.10.166.2.1.14.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentMapLabelPtrIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentMapLabelPtrIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentMapLabelPtrIndex", "1.3.6.1.2.1.10.166.2.1.14.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MplsInSegmentMapIndexEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                    {
                        private MplsInSegmentMapIndexEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                        {
                            super(mib, parent, "mplsInSegmentMapIndex", "1.3.6.1.2.1.10.166.2.1.14.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MplsXCNotificationsEnableEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                private MplsXCNotificationsEnableEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsXCNotificationsEnable", "1.3.6.1.2.1.10.166.2.1.15", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MplsLsrConformanceEnt extends MIBEntry<MPLSLSRSTDMIBDef>
        {
            /** End of notifications.

Module compliance.*/
            public final MplsLsrGroupsEnt mplsLsrGroups;

            public final MplsLsrCompliancesEnt mplsLsrCompliances;

            private MplsLsrConformanceEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
            {
                super(mib, parent, "mplsLsrConformance", "1.3.6.1.2.1.10.166.2.2", false, false, false, false);
                this.mplsLsrGroups = new MplsLsrGroupsEnt(mib, this);
                this.mplsLsrCompliances = new MplsLsrCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mplsLsrGroups,
                    this.mplsLsrCompliances
                };
            }
            public static final class MplsLsrGroupsEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                /** Units of conformance.*/
                public final MplsInterfaceGroupEnt mplsInterfaceGroup;

                public final MplsInSegmentGroupEnt mplsInSegmentGroup;

                public final MplsOutSegmentGroupEnt mplsOutSegmentGroup;

                public final MplsXCGroupEnt mplsXCGroup;

                public final MplsPerfGroupEnt mplsPerfGroup;

                public final MplsHCInSegmentPerfGroupEnt mplsHCInSegmentPerfGroup;

                public final MplsHCOutSegmentPerfGroupEnt mplsHCOutSegmentPerfGroup;

                public final MplsLabelStackGroupEnt mplsLabelStackGroup;

                public final MplsLsrNotificationGroupEnt mplsLsrNotificationGroup;

                private MplsLsrGroupsEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLsrGroups", "1.3.6.1.2.1.10.166.2.2.1", false, false, false, false);
                    this.mplsInterfaceGroup = new MplsInterfaceGroupEnt(mib, this);
                    this.mplsInSegmentGroup = new MplsInSegmentGroupEnt(mib, this);
                    this.mplsOutSegmentGroup = new MplsOutSegmentGroupEnt(mib, this);
                    this.mplsXCGroup = new MplsXCGroupEnt(mib, this);
                    this.mplsPerfGroup = new MplsPerfGroupEnt(mib, this);
                    this.mplsHCInSegmentPerfGroup = new MplsHCInSegmentPerfGroupEnt(mib, this);
                    this.mplsHCOutSegmentPerfGroup = new MplsHCOutSegmentPerfGroupEnt(mib, this);
                    this.mplsLabelStackGroup = new MplsLabelStackGroupEnt(mib, this);
                    this.mplsLsrNotificationGroup = new MplsLsrNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsInterfaceGroup,
                        this.mplsInSegmentGroup,
                        this.mplsOutSegmentGroup,
                        this.mplsXCGroup,
                        this.mplsPerfGroup,
                        this.mplsHCInSegmentPerfGroup,
                        this.mplsHCOutSegmentPerfGroup,
                        this.mplsLabelStackGroup,
                        this.mplsLsrNotificationGroup
                    };
                }
                public static final class MplsInterfaceGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsInterfaceGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInterfaceGroup", "1.3.6.1.2.1.10.166.2.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsInSegmentGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsInSegmentGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsInSegmentGroup", "1.3.6.1.2.1.10.166.2.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsOutSegmentGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsOutSegmentGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsOutSegmentGroup", "1.3.6.1.2.1.10.166.2.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsXCGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsXCGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsXCGroup", "1.3.6.1.2.1.10.166.2.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsPerfGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsPerfGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsPerfGroup", "1.3.6.1.2.1.10.166.2.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsHCInSegmentPerfGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsHCInSegmentPerfGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsHCInSegmentPerfGroup", "1.3.6.1.2.1.10.166.2.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsHCOutSegmentPerfGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsHCOutSegmentPerfGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsHCOutSegmentPerfGroup", "1.3.6.1.2.1.10.166.2.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLabelStackGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsLabelStackGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLabelStackGroup", "1.3.6.1.2.1.10.166.2.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLsrNotificationGroupEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsLsrNotificationGroupEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLsrNotificationGroup", "1.3.6.1.2.1.10.166.2.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MplsLsrCompliancesEnt extends MIBEntry<MPLSLSRSTDMIBDef>
            {
                /** Compliance requirement for fully compliant implementations.

The Interfaces Group MIB, RFC 2863.*/
                public final MplsLsrModuleFullComplianceEnt mplsLsrModuleFullCompliance;

                /** Compliance requirement for read-only implementations.

The interfaces Group MIB, RFC 2863*/
                public final MplsLsrModuleReadOnlyComplianceEnt mplsLsrModuleReadOnlyCompliance;

                private MplsLsrCompliancesEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                {
                    super(mib, parent, "mplsLsrCompliances", "1.3.6.1.2.1.10.166.2.2.2", false, false, false, false);
                    this.mplsLsrModuleFullCompliance = new MplsLsrModuleFullComplianceEnt(mib, this);
                    this.mplsLsrModuleReadOnlyCompliance = new MplsLsrModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mplsLsrModuleFullCompliance,
                        this.mplsLsrModuleReadOnlyCompliance
                    };
                }
                public static final class MplsLsrModuleFullComplianceEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsLsrModuleFullComplianceEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLsrModuleFullCompliance", "1.3.6.1.2.1.10.166.2.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MplsLsrModuleReadOnlyComplianceEnt extends MIBEntry<MPLSLSRSTDMIBDef>
                {
                    private MplsLsrModuleReadOnlyComplianceEnt(MPLSLSRSTDMIBDef mib, MIBEntry<MPLSLSRSTDMIBDef> parent)
                    {
                        super(mib, parent, "mplsLsrModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.2.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
