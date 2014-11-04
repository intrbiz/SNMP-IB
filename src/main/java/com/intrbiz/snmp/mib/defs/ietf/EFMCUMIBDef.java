package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC3411]
[RFC2863]*/
public final class EFMCUMIBDef extends MIB
{
    public static final EFMCUMIBDef EFMCUMIB = new EFMCUMIBDef();

    static { MIBs.getInstance().registerMIB(EFMCUMIBDef.EFMCUMIB); }

    /** November 14, 2007*/
    public final EfmCuMIBEnt efmCuMIB;

    private EFMCUMIBDef()
    {
        super("EFM-CU-MIB");
        this.efmCuMIB = new EfmCuMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.efmCuMIB
        };
    }

    public static final class EfmCuMIBEnt extends MIBEntry<EFMCUMIBDef>
    {
        /** Sections of the module*/
        public final EfmCuObjectsEnt efmCuObjects;

        public final EfmCuConformanceEnt efmCuConformance;

        private EfmCuMIBEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
        {
            super(mib, parent, "efmCuMIB", "1.3.6.1.2.1.167", false, false, false, false);
            this.efmCuObjects = new EfmCuObjectsEnt(mib, this);
            this.efmCuConformance = new EfmCuConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.efmCuObjects,
                this.efmCuConformance
            };
        }
        public static final class EfmCuObjectsEnt extends MIBEntry<EFMCUMIBDef>
        {
            /** Groups in the module*/
            public final EfmCuPortEnt efmCuPort;

            public final EfmCuPmeEnt efmCuPme;

            private EfmCuObjectsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
            {
                super(mib, parent, "efmCuObjects", "1.3.6.1.2.1.167.1", false, false, false, false);
                this.efmCuPort = new EfmCuPortEnt(mib, this);
                this.efmCuPme = new EfmCuPmeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.efmCuPort,
                    this.efmCuPme
                };
            }
            public static final class EfmCuPortEnt extends MIBEntry<EFMCUMIBDef>
            {
                /** Port Notifications Group*/
                public final EfmCuPortNotificationsEnt efmCuPortNotifications;

                /** PCS Port group*/
                public final EfmCuPortConfTableEnt efmCuPortConfTable;

                public final EfmCuPortCapabilityTableEnt efmCuPortCapabilityTable;

                public final EfmCuPortStatusTableEnt efmCuPortStatusTable;

                private EfmCuPortEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                {
                    super(mib, parent, "efmCuPort", "1.3.6.1.2.1.167.1.1", false, false, false, false);
                    this.efmCuPortNotifications = new EfmCuPortNotificationsEnt(mib, this);
                    this.efmCuPortConfTable = new EfmCuPortConfTableEnt(mib, this);
                    this.efmCuPortCapabilityTable = new EfmCuPortCapabilityTableEnt(mib, this);
                    this.efmCuPortStatusTable = new EfmCuPortStatusTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.efmCuPortNotifications,
                        this.efmCuPortConfTable,
                        this.efmCuPortCapabilityTable,
                        this.efmCuPortStatusTable
                    };
                }
                public static final class EfmCuPortNotificationsEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuLowRateCrossingEnt efmCuLowRateCrossing;

                    private EfmCuPortNotificationsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPortNotifications", "1.3.6.1.2.1.167.1.1.0", false, false, false, false);
                        this.efmCuLowRateCrossing = new EfmCuLowRateCrossingEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuLowRateCrossing
                        };
                    }
                    public static final class EfmCuLowRateCrossingEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        private EfmCuLowRateCrossingEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuLowRateCrossing", "1.3.6.1.2.1.167.1.1.0.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class EfmCuPortConfTableEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPortConfEntryEnt efmCuPortConfEntry;

                    private EfmCuPortConfTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPortConfTable", "1.3.6.1.2.1.167.1.1.1", false, true, false, false);
                        this.efmCuPortConfEntry = new EfmCuPortConfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPortConfEntry
                        };
                    }
                    public static final class EfmCuPortConfEntryEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPAFAdminStateEnt efmCuPAFAdminState;

                        public final EfmCuPAFDiscoveryCodeEnt efmCuPAFDiscoveryCode;

                        public final EfmCuAdminProfileEnt efmCuAdminProfile;

                        public final EfmCuTargetDataRateEnt efmCuTargetDataRate;

                        public final EfmCuTargetSnrMgnEnt efmCuTargetSnrMgn;

                        public final EfmCuAdaptiveSpectraEnt efmCuAdaptiveSpectra;

                        public final EfmCuThreshLowRateEnt efmCuThreshLowRate;

                        public final EfmCuLowRateCrossingEnableEnt efmCuLowRateCrossingEnable;

                        private EfmCuPortConfEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPortConfEntry", "1.3.6.1.2.1.167.1.1.1.1", false, false, false, true);
                            this.efmCuPAFAdminState = new EfmCuPAFAdminStateEnt(mib, this);
                            this.efmCuPAFDiscoveryCode = new EfmCuPAFDiscoveryCodeEnt(mib, this);
                            this.efmCuAdminProfile = new EfmCuAdminProfileEnt(mib, this);
                            this.efmCuTargetDataRate = new EfmCuTargetDataRateEnt(mib, this);
                            this.efmCuTargetSnrMgn = new EfmCuTargetSnrMgnEnt(mib, this);
                            this.efmCuAdaptiveSpectra = new EfmCuAdaptiveSpectraEnt(mib, this);
                            this.efmCuThreshLowRate = new EfmCuThreshLowRateEnt(mib, this);
                            this.efmCuLowRateCrossingEnable = new EfmCuLowRateCrossingEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPAFAdminState,
                                this.efmCuPAFDiscoveryCode,
                                this.efmCuAdminProfile,
                                this.efmCuTargetDataRate,
                                this.efmCuTargetSnrMgn,
                                this.efmCuAdaptiveSpectra,
                                this.efmCuThreshLowRate,
                                this.efmCuLowRateCrossingEnable
                            };
                        }
                        public static final class EfmCuPAFAdminStateEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFAdminStateEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFAdminState", "1.3.6.1.2.1.167.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFDiscoveryCodeEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFDiscoveryCodeEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFDiscoveryCode", "1.3.6.1.2.1.167.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuAdminProfileEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuAdminProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuAdminProfile", "1.3.6.1.2.1.167.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuTargetDataRateEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuTargetDataRateEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuTargetDataRate", "1.3.6.1.2.1.167.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuTargetSnrMgnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuTargetSnrMgnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuTargetSnrMgn", "1.3.6.1.2.1.167.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuAdaptiveSpectraEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuAdaptiveSpectraEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuAdaptiveSpectra", "1.3.6.1.2.1.167.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuThreshLowRateEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuThreshLowRateEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuThreshLowRate", "1.3.6.1.2.1.167.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuLowRateCrossingEnableEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuLowRateCrossingEnableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuLowRateCrossingEnable", "1.3.6.1.2.1.167.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EfmCuPortCapabilityTableEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPortCapabilityEntryEnt efmCuPortCapabilityEntry;

                    private EfmCuPortCapabilityTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPortCapabilityTable", "1.3.6.1.2.1.167.1.1.2", false, true, false, false);
                        this.efmCuPortCapabilityEntry = new EfmCuPortCapabilityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPortCapabilityEntry
                        };
                    }
                    public static final class EfmCuPortCapabilityEntryEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPAFSupportedEnt efmCuPAFSupported;

                        public final EfmCuPeerPAFSupportedEnt efmCuPeerPAFSupported;

                        public final EfmCuPAFCapacityEnt efmCuPAFCapacity;

                        public final EfmCuPeerPAFCapacityEnt efmCuPeerPAFCapacity;

                        private EfmCuPortCapabilityEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPortCapabilityEntry", "1.3.6.1.2.1.167.1.1.2.1", false, false, false, true);
                            this.efmCuPAFSupported = new EfmCuPAFSupportedEnt(mib, this);
                            this.efmCuPeerPAFSupported = new EfmCuPeerPAFSupportedEnt(mib, this);
                            this.efmCuPAFCapacity = new EfmCuPAFCapacityEnt(mib, this);
                            this.efmCuPeerPAFCapacity = new EfmCuPeerPAFCapacityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPAFSupported,
                                this.efmCuPeerPAFSupported,
                                this.efmCuPAFCapacity,
                                this.efmCuPeerPAFCapacity
                            };
                        }
                        public static final class EfmCuPAFSupportedEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFSupportedEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFSupported", "1.3.6.1.2.1.167.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPeerPAFSupportedEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPeerPAFSupportedEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPeerPAFSupported", "1.3.6.1.2.1.167.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFCapacityEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFCapacityEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFCapacity", "1.3.6.1.2.1.167.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPeerPAFCapacityEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPeerPAFCapacityEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPeerPAFCapacity", "1.3.6.1.2.1.167.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EfmCuPortStatusTableEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPortStatusEntryEnt efmCuPortStatusEntry;

                    private EfmCuPortStatusTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPortStatusTable", "1.3.6.1.2.1.167.1.1.3", false, true, false, false);
                        this.efmCuPortStatusEntry = new EfmCuPortStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPortStatusEntry
                        };
                    }
                    public static final class EfmCuPortStatusEntryEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuFltStatusEnt efmCuFltStatus;

                        public final EfmCuPortSideEnt efmCuPortSide;

                        public final EfmCuNumPMEsEnt efmCuNumPMEs;

                        public final EfmCuPAFInErrorsEnt efmCuPAFInErrors;

                        public final EfmCuPAFInSmallFragmentsEnt efmCuPAFInSmallFragments;

                        public final EfmCuPAFInLargeFragmentsEnt efmCuPAFInLargeFragments;

                        public final EfmCuPAFInBadFragmentsEnt efmCuPAFInBadFragments;

                        public final EfmCuPAFInLostFragmentsEnt efmCuPAFInLostFragments;

                        public final EfmCuPAFInLostStartsEnt efmCuPAFInLostStarts;

                        public final EfmCuPAFInLostEndsEnt efmCuPAFInLostEnds;

                        public final EfmCuPAFInOverflowsEnt efmCuPAFInOverflows;

                        private EfmCuPortStatusEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPortStatusEntry", "1.3.6.1.2.1.167.1.1.3.1", false, false, false, true);
                            this.efmCuFltStatus = new EfmCuFltStatusEnt(mib, this);
                            this.efmCuPortSide = new EfmCuPortSideEnt(mib, this);
                            this.efmCuNumPMEs = new EfmCuNumPMEsEnt(mib, this);
                            this.efmCuPAFInErrors = new EfmCuPAFInErrorsEnt(mib, this);
                            this.efmCuPAFInSmallFragments = new EfmCuPAFInSmallFragmentsEnt(mib, this);
                            this.efmCuPAFInLargeFragments = new EfmCuPAFInLargeFragmentsEnt(mib, this);
                            this.efmCuPAFInBadFragments = new EfmCuPAFInBadFragmentsEnt(mib, this);
                            this.efmCuPAFInLostFragments = new EfmCuPAFInLostFragmentsEnt(mib, this);
                            this.efmCuPAFInLostStarts = new EfmCuPAFInLostStartsEnt(mib, this);
                            this.efmCuPAFInLostEnds = new EfmCuPAFInLostEndsEnt(mib, this);
                            this.efmCuPAFInOverflows = new EfmCuPAFInOverflowsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuFltStatus,
                                this.efmCuPortSide,
                                this.efmCuNumPMEs,
                                this.efmCuPAFInErrors,
                                this.efmCuPAFInSmallFragments,
                                this.efmCuPAFInLargeFragments,
                                this.efmCuPAFInBadFragments,
                                this.efmCuPAFInLostFragments,
                                this.efmCuPAFInLostStarts,
                                this.efmCuPAFInLostEnds,
                                this.efmCuPAFInOverflows
                            };
                        }
                        public static final class EfmCuFltStatusEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuFltStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuFltStatus", "1.3.6.1.2.1.167.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPortSideEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPortSideEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPortSide", "1.3.6.1.2.1.167.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuNumPMEsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuNumPMEsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuNumPMEs", "1.3.6.1.2.1.167.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInErrorsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInErrorsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInErrors", "1.3.6.1.2.1.167.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInSmallFragmentsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInSmallFragmentsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInSmallFragments", "1.3.6.1.2.1.167.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInLargeFragmentsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInLargeFragmentsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInLargeFragments", "1.3.6.1.2.1.167.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInBadFragmentsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInBadFragmentsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInBadFragments", "1.3.6.1.2.1.167.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInLostFragmentsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInLostFragmentsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInLostFragments", "1.3.6.1.2.1.167.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInLostStartsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInLostStartsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInLostStarts", "1.3.6.1.2.1.167.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInLostEndsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInLostEndsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInLostEnds", "1.3.6.1.2.1.167.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFInOverflowsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFInOverflowsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFInOverflows", "1.3.6.1.2.1.167.1.1.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EfmCuPmeEnt extends MIBEntry<EFMCUMIBDef>
            {
                /** PME Notifications Group*/
                public final EfmCuPmeNotificationsEnt efmCuPmeNotifications;

                /** The PME group*/
                public final EfmCuPmeConfTableEnt efmCuPmeConfTable;

                public final EfmCuPmeCapabilityTableEnt efmCuPmeCapabilityTable;

                public final EfmCuPmeStatusTableEnt efmCuPmeStatusTable;

                /** 2BASE-TL specific PME group*/
                public final EfmCuPme2BEnt efmCuPme2B;

                /** 10PASS-TS specific PME group*/
                public final EfmCuPme10PEnt efmCuPme10P;

                private EfmCuPmeEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                {
                    super(mib, parent, "efmCuPme", "1.3.6.1.2.1.167.1.2", false, false, false, false);
                    this.efmCuPmeNotifications = new EfmCuPmeNotificationsEnt(mib, this);
                    this.efmCuPmeConfTable = new EfmCuPmeConfTableEnt(mib, this);
                    this.efmCuPmeCapabilityTable = new EfmCuPmeCapabilityTableEnt(mib, this);
                    this.efmCuPmeStatusTable = new EfmCuPmeStatusTableEnt(mib, this);
                    this.efmCuPme2B = new EfmCuPme2BEnt(mib, this);
                    this.efmCuPme10P = new EfmCuPme10PEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.efmCuPmeNotifications,
                        this.efmCuPmeConfTable,
                        this.efmCuPmeCapabilityTable,
                        this.efmCuPmeStatusTable,
                        this.efmCuPme2B,
                        this.efmCuPme10P
                    };
                }
                public static final class EfmCuPmeNotificationsEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPmeLineAtnCrossingEnt efmCuPmeLineAtnCrossing;

                    public final EfmCuPmeSnrMgnCrossingEnt efmCuPmeSnrMgnCrossing;

                    public final EfmCuPmeDeviceFaultEnt efmCuPmeDeviceFault;

                    public final EfmCuPmeConfigInitFailureEnt efmCuPmeConfigInitFailure;

                    public final EfmCuPmeProtocolInitFailureEnt efmCuPmeProtocolInitFailure;

                    private EfmCuPmeNotificationsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPmeNotifications", "1.3.6.1.2.1.167.1.2.0", false, false, false, false);
                        this.efmCuPmeLineAtnCrossing = new EfmCuPmeLineAtnCrossingEnt(mib, this);
                        this.efmCuPmeSnrMgnCrossing = new EfmCuPmeSnrMgnCrossingEnt(mib, this);
                        this.efmCuPmeDeviceFault = new EfmCuPmeDeviceFaultEnt(mib, this);
                        this.efmCuPmeConfigInitFailure = new EfmCuPmeConfigInitFailureEnt(mib, this);
                        this.efmCuPmeProtocolInitFailure = new EfmCuPmeProtocolInitFailureEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPmeLineAtnCrossing,
                            this.efmCuPmeSnrMgnCrossing,
                            this.efmCuPmeDeviceFault,
                            this.efmCuPmeConfigInitFailure,
                            this.efmCuPmeProtocolInitFailure
                        };
                    }
                    public static final class EfmCuPmeLineAtnCrossingEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        private EfmCuPmeLineAtnCrossingEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeLineAtnCrossing", "1.3.6.1.2.1.167.1.2.0.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EfmCuPmeSnrMgnCrossingEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        private EfmCuPmeSnrMgnCrossingEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeSnrMgnCrossing", "1.3.6.1.2.1.167.1.2.0.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EfmCuPmeDeviceFaultEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        private EfmCuPmeDeviceFaultEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeDeviceFault", "1.3.6.1.2.1.167.1.2.0.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EfmCuPmeConfigInitFailureEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        private EfmCuPmeConfigInitFailureEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeConfigInitFailure", "1.3.6.1.2.1.167.1.2.0.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EfmCuPmeProtocolInitFailureEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        private EfmCuPmeProtocolInitFailureEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeProtocolInitFailure", "1.3.6.1.2.1.167.1.2.0.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class EfmCuPmeConfTableEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPmeConfEntryEnt efmCuPmeConfEntry;

                    private EfmCuPmeConfTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPmeConfTable", "1.3.6.1.2.1.167.1.2.1", false, true, false, false);
                        this.efmCuPmeConfEntry = new EfmCuPmeConfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPmeConfEntry
                        };
                    }
                    public static final class EfmCuPmeConfEntryEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPmeAdminSubTypeEnt efmCuPmeAdminSubType;

                        public final EfmCuPmeAdminProfileEnt efmCuPmeAdminProfile;

                        public final EfmCuPAFRemoteDiscoveryCodeEnt efmCuPAFRemoteDiscoveryCode;

                        public final EfmCuPmeThreshLineAtnEnt efmCuPmeThreshLineAtn;

                        public final EfmCuPmeThreshSnrMgnEnt efmCuPmeThreshSnrMgn;

                        public final EfmCuPmeLineAtnCrossingEnableEnt efmCuPmeLineAtnCrossingEnable;

                        public final EfmCuPmeSnrMgnCrossingEnableEnt efmCuPmeSnrMgnCrossingEnable;

                        public final EfmCuPmeDeviceFaultEnableEnt efmCuPmeDeviceFaultEnable;

                        public final EfmCuPmeConfigInitFailEnableEnt efmCuPmeConfigInitFailEnable;

                        public final EfmCuPmeProtocolInitFailEnableEnt efmCuPmeProtocolInitFailEnable;

                        private EfmCuPmeConfEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeConfEntry", "1.3.6.1.2.1.167.1.2.1.1", false, false, false, true);
                            this.efmCuPmeAdminSubType = new EfmCuPmeAdminSubTypeEnt(mib, this);
                            this.efmCuPmeAdminProfile = new EfmCuPmeAdminProfileEnt(mib, this);
                            this.efmCuPAFRemoteDiscoveryCode = new EfmCuPAFRemoteDiscoveryCodeEnt(mib, this);
                            this.efmCuPmeThreshLineAtn = new EfmCuPmeThreshLineAtnEnt(mib, this);
                            this.efmCuPmeThreshSnrMgn = new EfmCuPmeThreshSnrMgnEnt(mib, this);
                            this.efmCuPmeLineAtnCrossingEnable = new EfmCuPmeLineAtnCrossingEnableEnt(mib, this);
                            this.efmCuPmeSnrMgnCrossingEnable = new EfmCuPmeSnrMgnCrossingEnableEnt(mib, this);
                            this.efmCuPmeDeviceFaultEnable = new EfmCuPmeDeviceFaultEnableEnt(mib, this);
                            this.efmCuPmeConfigInitFailEnable = new EfmCuPmeConfigInitFailEnableEnt(mib, this);
                            this.efmCuPmeProtocolInitFailEnable = new EfmCuPmeProtocolInitFailEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPmeAdminSubType,
                                this.efmCuPmeAdminProfile,
                                this.efmCuPAFRemoteDiscoveryCode,
                                this.efmCuPmeThreshLineAtn,
                                this.efmCuPmeThreshSnrMgn,
                                this.efmCuPmeLineAtnCrossingEnable,
                                this.efmCuPmeSnrMgnCrossingEnable,
                                this.efmCuPmeDeviceFaultEnable,
                                this.efmCuPmeConfigInitFailEnable,
                                this.efmCuPmeProtocolInitFailEnable
                            };
                        }
                        public static final class EfmCuPmeAdminSubTypeEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeAdminSubTypeEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeAdminSubType", "1.3.6.1.2.1.167.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeAdminProfileEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeAdminProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeAdminProfile", "1.3.6.1.2.1.167.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPAFRemoteDiscoveryCodeEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPAFRemoteDiscoveryCodeEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPAFRemoteDiscoveryCode", "1.3.6.1.2.1.167.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeThreshLineAtnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeThreshLineAtnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeThreshLineAtn", "1.3.6.1.2.1.167.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeThreshSnrMgnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeThreshSnrMgnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeThreshSnrMgn", "1.3.6.1.2.1.167.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeLineAtnCrossingEnableEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeLineAtnCrossingEnableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeLineAtnCrossingEnable", "1.3.6.1.2.1.167.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeSnrMgnCrossingEnableEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeSnrMgnCrossingEnableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeSnrMgnCrossingEnable", "1.3.6.1.2.1.167.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeDeviceFaultEnableEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeDeviceFaultEnableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeDeviceFaultEnable", "1.3.6.1.2.1.167.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeConfigInitFailEnableEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeConfigInitFailEnableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeConfigInitFailEnable", "1.3.6.1.2.1.167.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeProtocolInitFailEnableEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeProtocolInitFailEnableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeProtocolInitFailEnable", "1.3.6.1.2.1.167.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EfmCuPmeCapabilityTableEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPmeCapabilityEntryEnt efmCuPmeCapabilityEntry;

                    private EfmCuPmeCapabilityTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPmeCapabilityTable", "1.3.6.1.2.1.167.1.2.2", false, true, false, false);
                        this.efmCuPmeCapabilityEntry = new EfmCuPmeCapabilityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPmeCapabilityEntry
                        };
                    }
                    public static final class EfmCuPmeCapabilityEntryEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPmeSubTypesSupportedEnt efmCuPmeSubTypesSupported;

                        private EfmCuPmeCapabilityEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeCapabilityEntry", "1.3.6.1.2.1.167.1.2.2.1", false, false, false, true);
                            this.efmCuPmeSubTypesSupported = new EfmCuPmeSubTypesSupportedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPmeSubTypesSupported
                            };
                        }
                        public static final class EfmCuPmeSubTypesSupportedEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeSubTypesSupportedEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeSubTypesSupported", "1.3.6.1.2.1.167.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EfmCuPmeStatusTableEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPmeStatusEntryEnt efmCuPmeStatusEntry;

                    private EfmCuPmeStatusTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPmeStatusTable", "1.3.6.1.2.1.167.1.2.3", false, true, false, false);
                        this.efmCuPmeStatusEntry = new EfmCuPmeStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPmeStatusEntry
                        };
                    }
                    public static final class EfmCuPmeStatusEntryEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPmeOperStatusEnt efmCuPmeOperStatus;

                        public final EfmCuPmeFltStatusEnt efmCuPmeFltStatus;

                        public final EfmCuPmeOperSubTypeEnt efmCuPmeOperSubType;

                        public final EfmCuPmeOperProfileEnt efmCuPmeOperProfile;

                        public final EfmCuPmeSnrMgnEnt efmCuPmeSnrMgn;

                        public final EfmCuPmePeerSnrMgnEnt efmCuPmePeerSnrMgn;

                        public final EfmCuPmeLineAtnEnt efmCuPmeLineAtn;

                        public final EfmCuPmePeerLineAtnEnt efmCuPmePeerLineAtn;

                        public final EfmCuPmeEquivalentLengthEnt efmCuPmeEquivalentLength;

                        public final EfmCuPmeTCCodingErrorsEnt efmCuPmeTCCodingErrors;

                        public final EfmCuPmeTCCrcErrorsEnt efmCuPmeTCCrcErrors;

                        private EfmCuPmeStatusEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPmeStatusEntry", "1.3.6.1.2.1.167.1.2.3.1", false, false, false, true);
                            this.efmCuPmeOperStatus = new EfmCuPmeOperStatusEnt(mib, this);
                            this.efmCuPmeFltStatus = new EfmCuPmeFltStatusEnt(mib, this);
                            this.efmCuPmeOperSubType = new EfmCuPmeOperSubTypeEnt(mib, this);
                            this.efmCuPmeOperProfile = new EfmCuPmeOperProfileEnt(mib, this);
                            this.efmCuPmeSnrMgn = new EfmCuPmeSnrMgnEnt(mib, this);
                            this.efmCuPmePeerSnrMgn = new EfmCuPmePeerSnrMgnEnt(mib, this);
                            this.efmCuPmeLineAtn = new EfmCuPmeLineAtnEnt(mib, this);
                            this.efmCuPmePeerLineAtn = new EfmCuPmePeerLineAtnEnt(mib, this);
                            this.efmCuPmeEquivalentLength = new EfmCuPmeEquivalentLengthEnt(mib, this);
                            this.efmCuPmeTCCodingErrors = new EfmCuPmeTCCodingErrorsEnt(mib, this);
                            this.efmCuPmeTCCrcErrors = new EfmCuPmeTCCrcErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPmeOperStatus,
                                this.efmCuPmeFltStatus,
                                this.efmCuPmeOperSubType,
                                this.efmCuPmeOperProfile,
                                this.efmCuPmeSnrMgn,
                                this.efmCuPmePeerSnrMgn,
                                this.efmCuPmeLineAtn,
                                this.efmCuPmePeerLineAtn,
                                this.efmCuPmeEquivalentLength,
                                this.efmCuPmeTCCodingErrors,
                                this.efmCuPmeTCCrcErrors
                            };
                        }
                        public static final class EfmCuPmeOperStatusEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeOperStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeOperStatus", "1.3.6.1.2.1.167.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeFltStatusEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeFltStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeFltStatus", "1.3.6.1.2.1.167.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeOperSubTypeEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeOperSubTypeEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeOperSubType", "1.3.6.1.2.1.167.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeOperProfileEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeOperProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeOperProfile", "1.3.6.1.2.1.167.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeSnrMgnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeSnrMgnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeSnrMgn", "1.3.6.1.2.1.167.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmePeerSnrMgnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmePeerSnrMgnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmePeerSnrMgn", "1.3.6.1.2.1.167.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeLineAtnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeLineAtnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeLineAtn", "1.3.6.1.2.1.167.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmePeerLineAtnEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmePeerLineAtnEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmePeerLineAtn", "1.3.6.1.2.1.167.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeEquivalentLengthEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeEquivalentLengthEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeEquivalentLength", "1.3.6.1.2.1.167.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeTCCodingErrorsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeTCCodingErrorsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeTCCodingErrors", "1.3.6.1.2.1.167.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EfmCuPmeTCCrcErrorsEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            private EfmCuPmeTCCrcErrorsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPmeTCCrcErrors", "1.3.6.1.2.1.167.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class EfmCuPme2BEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPme2BProfileTableEnt efmCuPme2BProfileTable;

                    public final EfmCuPme2BsModeTableEnt efmCuPme2BsModeTable;

                    public final EfmCuPme2BReachRateTableEnt efmCuPme2BReachRateTable;

                    private EfmCuPme2BEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPme2B", "1.3.6.1.2.1.167.1.2.5", false, false, false, false);
                        this.efmCuPme2BProfileTable = new EfmCuPme2BProfileTableEnt(mib, this);
                        this.efmCuPme2BsModeTable = new EfmCuPme2BsModeTableEnt(mib, this);
                        this.efmCuPme2BReachRateTable = new EfmCuPme2BReachRateTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPme2BProfileTable,
                            this.efmCuPme2BsModeTable,
                            this.efmCuPme2BReachRateTable
                        };
                    }
                    public static final class EfmCuPme2BProfileTableEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPme2BProfileEntryEnt efmCuPme2BProfileEntry;

                        private EfmCuPme2BProfileTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPme2BProfileTable", "1.3.6.1.2.1.167.1.2.5.2", false, true, false, false);
                            this.efmCuPme2BProfileEntry = new EfmCuPme2BProfileEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPme2BProfileEntry
                            };
                        }
                        public static final class EfmCuPme2BProfileEntryEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            public final EfmCuPme2BProfileIndexEnt efmCuPme2BProfileIndex;

                            public final EfmCuPme2BProfileDescrEnt efmCuPme2BProfileDescr;

                            public final EfmCuPme2BRegionEnt efmCuPme2BRegion;

                            public final EfmCuPme2BsModeEnt efmCuPme2BsMode;

                            public final EfmCuPme2BMinDataRateEnt efmCuPme2BMinDataRate;

                            public final EfmCuPme2BMaxDataRateEnt efmCuPme2BMaxDataRate;

                            public final EfmCuPme2BPowerEnt efmCuPme2BPower;

                            public final EfmCuPme2BConstellationEnt efmCuPme2BConstellation;

                            public final EfmCuPme2BProfileRowStatusEnt efmCuPme2BProfileRowStatus;

                            private EfmCuPme2BProfileEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPme2BProfileEntry", "1.3.6.1.2.1.167.1.2.5.2.1", false, false, false, true);
                                this.efmCuPme2BProfileIndex = new EfmCuPme2BProfileIndexEnt(mib, this);
                                this.efmCuPme2BProfileDescr = new EfmCuPme2BProfileDescrEnt(mib, this);
                                this.efmCuPme2BRegion = new EfmCuPme2BRegionEnt(mib, this);
                                this.efmCuPme2BsMode = new EfmCuPme2BsModeEnt(mib, this);
                                this.efmCuPme2BMinDataRate = new EfmCuPme2BMinDataRateEnt(mib, this);
                                this.efmCuPme2BMaxDataRate = new EfmCuPme2BMaxDataRateEnt(mib, this);
                                this.efmCuPme2BPower = new EfmCuPme2BPowerEnt(mib, this);
                                this.efmCuPme2BConstellation = new EfmCuPme2BConstellationEnt(mib, this);
                                this.efmCuPme2BProfileRowStatus = new EfmCuPme2BProfileRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.efmCuPme2BProfileIndex,
                                    this.efmCuPme2BProfileDescr,
                                    this.efmCuPme2BRegion,
                                    this.efmCuPme2BsMode,
                                    this.efmCuPme2BMinDataRate,
                                    this.efmCuPme2BMaxDataRate,
                                    this.efmCuPme2BPower,
                                    this.efmCuPme2BConstellation,
                                    this.efmCuPme2BProfileRowStatus
                                };
                            }
                            public static final class EfmCuPme2BProfileIndexEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BProfileIndexEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BProfileIndex", "1.3.6.1.2.1.167.1.2.5.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BProfileDescrEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BProfileDescrEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BProfileDescr", "1.3.6.1.2.1.167.1.2.5.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BRegionEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BRegionEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BRegion", "1.3.6.1.2.1.167.1.2.5.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BsModeEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BsModeEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BsMode", "1.3.6.1.2.1.167.1.2.5.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BMinDataRateEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BMinDataRateEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BMinDataRate", "1.3.6.1.2.1.167.1.2.5.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BMaxDataRateEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BMaxDataRateEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BMaxDataRate", "1.3.6.1.2.1.167.1.2.5.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BPowerEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BPowerEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BPower", "1.3.6.1.2.1.167.1.2.5.2.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BConstellationEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BConstellationEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BConstellation", "1.3.6.1.2.1.167.1.2.5.2.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BProfileRowStatusEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BProfileRowStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BProfileRowStatus", "1.3.6.1.2.1.167.1.2.5.2.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class EfmCuPme2BsModeTableEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPme2BsModeEntryEnt efmCuPme2BsModeEntry;

                        private EfmCuPme2BsModeTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPme2BsModeTable", "1.3.6.1.2.1.167.1.2.5.3", false, true, false, false);
                            this.efmCuPme2BsModeEntry = new EfmCuPme2BsModeEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPme2BsModeEntry
                            };
                        }
                        public static final class EfmCuPme2BsModeEntryEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            public final EfmCuPme2BsModeIndexEnt efmCuPme2BsModeIndex;

                            public final EfmCuPme2BsModeDescrEnt efmCuPme2BsModeDescr;

                            public final EfmCuPme2BsModeRowStatusEnt efmCuPme2BsModeRowStatus;

                            private EfmCuPme2BsModeEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPme2BsModeEntry", "1.3.6.1.2.1.167.1.2.5.3.1", false, false, false, true);
                                this.efmCuPme2BsModeIndex = new EfmCuPme2BsModeIndexEnt(mib, this);
                                this.efmCuPme2BsModeDescr = new EfmCuPme2BsModeDescrEnt(mib, this);
                                this.efmCuPme2BsModeRowStatus = new EfmCuPme2BsModeRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.efmCuPme2BsModeIndex,
                                    this.efmCuPme2BsModeDescr,
                                    this.efmCuPme2BsModeRowStatus
                                };
                            }
                            public static final class EfmCuPme2BsModeIndexEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BsModeIndexEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BsModeIndex", "1.3.6.1.2.1.167.1.2.5.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BsModeDescrEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BsModeDescrEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BsModeDescr", "1.3.6.1.2.1.167.1.2.5.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BsModeRowStatusEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BsModeRowStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BsModeRowStatus", "1.3.6.1.2.1.167.1.2.5.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class EfmCuPme2BReachRateTableEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPme2BReachRateEntryEnt efmCuPme2BReachRateEntry;

                        private EfmCuPme2BReachRateTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPme2BReachRateTable", "1.3.6.1.2.1.167.1.2.5.4", false, true, false, false);
                            this.efmCuPme2BReachRateEntry = new EfmCuPme2BReachRateEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPme2BReachRateEntry
                            };
                        }
                        public static final class EfmCuPme2BReachRateEntryEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            public final EfmCuPme2BReachRateIndexEnt efmCuPme2BReachRateIndex;

                            public final EfmCuPme2BEquivalentLengthEnt efmCuPme2BEquivalentLength;

                            public final EfmCuPme2BMaxDataRatePam16Ent efmCuPme2BMaxDataRatePam16;

                            public final EfmCuPme2BMaxDataRatePam32Ent efmCuPme2BMaxDataRatePam32;

                            public final EfmCuPme2BReachRateRowStatusEnt efmCuPme2BReachRateRowStatus;

                            private EfmCuPme2BReachRateEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPme2BReachRateEntry", "1.3.6.1.2.1.167.1.2.5.4.1", false, false, false, true);
                                this.efmCuPme2BReachRateIndex = new EfmCuPme2BReachRateIndexEnt(mib, this);
                                this.efmCuPme2BEquivalentLength = new EfmCuPme2BEquivalentLengthEnt(mib, this);
                                this.efmCuPme2BMaxDataRatePam16 = new EfmCuPme2BMaxDataRatePam16Ent(mib, this);
                                this.efmCuPme2BMaxDataRatePam32 = new EfmCuPme2BMaxDataRatePam32Ent(mib, this);
                                this.efmCuPme2BReachRateRowStatus = new EfmCuPme2BReachRateRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.efmCuPme2BReachRateIndex,
                                    this.efmCuPme2BEquivalentLength,
                                    this.efmCuPme2BMaxDataRatePam16,
                                    this.efmCuPme2BMaxDataRatePam32,
                                    this.efmCuPme2BReachRateRowStatus
                                };
                            }
                            public static final class EfmCuPme2BReachRateIndexEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BReachRateIndexEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BReachRateIndex", "1.3.6.1.2.1.167.1.2.5.4.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BEquivalentLengthEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BEquivalentLengthEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BEquivalentLength", "1.3.6.1.2.1.167.1.2.5.4.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BMaxDataRatePam16Ent extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BMaxDataRatePam16Ent(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BMaxDataRatePam16", "1.3.6.1.2.1.167.1.2.5.4.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BMaxDataRatePam32Ent extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BMaxDataRatePam32Ent(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BMaxDataRatePam32", "1.3.6.1.2.1.167.1.2.5.4.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme2BReachRateRowStatusEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme2BReachRateRowStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme2BReachRateRowStatus", "1.3.6.1.2.1.167.1.2.5.4.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class EfmCuPme10PEnt extends MIBEntry<EFMCUMIBDef>
                {
                    public final EfmCuPme10PProfileTableEnt efmCuPme10PProfileTable;

                    public final EfmCuPme10PStatusTableEnt efmCuPme10PStatusTable;

                    private EfmCuPme10PEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPme10P", "1.3.6.1.2.1.167.1.2.6", false, false, false, false);
                        this.efmCuPme10PProfileTable = new EfmCuPme10PProfileTableEnt(mib, this);
                        this.efmCuPme10PStatusTable = new EfmCuPme10PStatusTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.efmCuPme10PProfileTable,
                            this.efmCuPme10PStatusTable
                        };
                    }
                    public static final class EfmCuPme10PProfileTableEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPme10PProfileEntryEnt efmCuPme10PProfileEntry;

                        private EfmCuPme10PProfileTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPme10PProfileTable", "1.3.6.1.2.1.167.1.2.6.1", false, true, false, false);
                            this.efmCuPme10PProfileEntry = new EfmCuPme10PProfileEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPme10PProfileEntry
                            };
                        }
                        public static final class EfmCuPme10PProfileEntryEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            public final EfmCuPme10PProfileIndexEnt efmCuPme10PProfileIndex;

                            public final EfmCuPme10PProfileDescrEnt efmCuPme10PProfileDescr;

                            public final EfmCuPme10PBandplanPSDMskProfileEnt efmCuPme10PBandplanPSDMskProfile;

                            public final EfmCuPme10PUPBOReferenceProfileEnt efmCuPme10PUPBOReferenceProfile;

                            public final EfmCuPme10PBandNotchProfilesEnt efmCuPme10PBandNotchProfiles;

                            public final EfmCuPme10PPayloadDRateProfileEnt efmCuPme10PPayloadDRateProfile;

                            public final EfmCuPme10PPayloadURateProfileEnt efmCuPme10PPayloadURateProfile;

                            public final EfmCuPme10PProfileRowStatusEnt efmCuPme10PProfileRowStatus;

                            private EfmCuPme10PProfileEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPme10PProfileEntry", "1.3.6.1.2.1.167.1.2.6.1.1", false, false, false, true);
                                this.efmCuPme10PProfileIndex = new EfmCuPme10PProfileIndexEnt(mib, this);
                                this.efmCuPme10PProfileDescr = new EfmCuPme10PProfileDescrEnt(mib, this);
                                this.efmCuPme10PBandplanPSDMskProfile = new EfmCuPme10PBandplanPSDMskProfileEnt(mib, this);
                                this.efmCuPme10PUPBOReferenceProfile = new EfmCuPme10PUPBOReferenceProfileEnt(mib, this);
                                this.efmCuPme10PBandNotchProfiles = new EfmCuPme10PBandNotchProfilesEnt(mib, this);
                                this.efmCuPme10PPayloadDRateProfile = new EfmCuPme10PPayloadDRateProfileEnt(mib, this);
                                this.efmCuPme10PPayloadURateProfile = new EfmCuPme10PPayloadURateProfileEnt(mib, this);
                                this.efmCuPme10PProfileRowStatus = new EfmCuPme10PProfileRowStatusEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.efmCuPme10PProfileIndex,
                                    this.efmCuPme10PProfileDescr,
                                    this.efmCuPme10PBandplanPSDMskProfile,
                                    this.efmCuPme10PUPBOReferenceProfile,
                                    this.efmCuPme10PBandNotchProfiles,
                                    this.efmCuPme10PPayloadDRateProfile,
                                    this.efmCuPme10PPayloadURateProfile,
                                    this.efmCuPme10PProfileRowStatus
                                };
                            }
                            public static final class EfmCuPme10PProfileIndexEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PProfileIndexEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PProfileIndex", "1.3.6.1.2.1.167.1.2.6.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PProfileDescrEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PProfileDescrEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PProfileDescr", "1.3.6.1.2.1.167.1.2.6.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PBandplanPSDMskProfileEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PBandplanPSDMskProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PBandplanPSDMskProfile", "1.3.6.1.2.1.167.1.2.6.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PUPBOReferenceProfileEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PUPBOReferenceProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PUPBOReferenceProfile", "1.3.6.1.2.1.167.1.2.6.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PBandNotchProfilesEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PBandNotchProfilesEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PBandNotchProfiles", "1.3.6.1.2.1.167.1.2.6.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PPayloadDRateProfileEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PPayloadDRateProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PPayloadDRateProfile", "1.3.6.1.2.1.167.1.2.6.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PPayloadURateProfileEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PPayloadURateProfileEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PPayloadURateProfile", "1.3.6.1.2.1.167.1.2.6.1.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PProfileRowStatusEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PProfileRowStatusEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PProfileRowStatus", "1.3.6.1.2.1.167.1.2.6.1.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class EfmCuPme10PStatusTableEnt extends MIBEntry<EFMCUMIBDef>
                    {
                        public final EfmCuPme10PStatusEntryEnt efmCuPme10PStatusEntry;

                        private EfmCuPme10PStatusTableEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                        {
                            super(mib, parent, "efmCuPme10PStatusTable", "1.3.6.1.2.1.167.1.2.6.2", false, true, false, false);
                            this.efmCuPme10PStatusEntry = new EfmCuPme10PStatusEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.efmCuPme10PStatusEntry
                            };
                        }
                        public static final class EfmCuPme10PStatusEntryEnt extends MIBEntry<EFMCUMIBDef>
                        {
                            public final EfmCuPme10PFECCorrectedBlocksEnt efmCuPme10PFECCorrectedBlocks;

                            public final EfmCuPme10PFECUncorrectedBlocksEnt efmCuPme10PFECUncorrectedBlocks;

                            private EfmCuPme10PStatusEntryEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                            {
                                super(mib, parent, "efmCuPme10PStatusEntry", "1.3.6.1.2.1.167.1.2.6.2.1", false, false, false, true);
                                this.efmCuPme10PFECCorrectedBlocks = new EfmCuPme10PFECCorrectedBlocksEnt(mib, this);
                                this.efmCuPme10PFECUncorrectedBlocks = new EfmCuPme10PFECUncorrectedBlocksEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.efmCuPme10PFECCorrectedBlocks,
                                    this.efmCuPme10PFECUncorrectedBlocks
                                };
                            }
                            public static final class EfmCuPme10PFECCorrectedBlocksEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PFECCorrectedBlocksEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PFECCorrectedBlocks", "1.3.6.1.2.1.167.1.2.6.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class EfmCuPme10PFECUncorrectedBlocksEnt extends MIBEntry<EFMCUMIBDef>
                            {
                                private EfmCuPme10PFECUncorrectedBlocksEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                                {
                                    super(mib, parent, "efmCuPme10PFECUncorrectedBlocks", "1.3.6.1.2.1.167.1.2.6.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

        }

        public static final class EfmCuConformanceEnt extends MIBEntry<EFMCUMIBDef>
        {
            /** Conformance Statements*/
            public final EfmCuGroupsEnt efmCuGroups;

            public final EfmCuCompliancesEnt efmCuCompliances;

            private EfmCuConformanceEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
            {
                super(mib, parent, "efmCuConformance", "1.3.6.1.2.1.167.2", false, false, false, false);
                this.efmCuGroups = new EfmCuGroupsEnt(mib, this);
                this.efmCuCompliances = new EfmCuCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.efmCuGroups,
                    this.efmCuCompliances
                };
            }
            public static final class EfmCuGroupsEnt extends MIBEntry<EFMCUMIBDef>
            {
                /** Object Groups*/
                public final EfmCuBasicGroupEnt efmCuBasicGroup;

                public final EfmCuPAFGroupEnt efmCuPAFGroup;

                public final EfmCuPAFErrorsGroupEnt efmCuPAFErrorsGroup;

                public final EfmCuPmeGroupEnt efmCuPmeGroup;

                public final EfmCuAlarmConfGroupEnt efmCuAlarmConfGroup;

                public final EfmCuNotificationGroupEnt efmCuNotificationGroup;

                public final EfmCuPme2BProfileGroupEnt efmCuPme2BProfileGroup;

                public final EfmCuPme10PProfileGroupEnt efmCuPme10PProfileGroup;

                public final EfmCuPme10PStatusGroupEnt efmCuPme10PStatusGroup;

                private EfmCuGroupsEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                {
                    super(mib, parent, "efmCuGroups", "1.3.6.1.2.1.167.2.1", false, false, false, false);
                    this.efmCuBasicGroup = new EfmCuBasicGroupEnt(mib, this);
                    this.efmCuPAFGroup = new EfmCuPAFGroupEnt(mib, this);
                    this.efmCuPAFErrorsGroup = new EfmCuPAFErrorsGroupEnt(mib, this);
                    this.efmCuPmeGroup = new EfmCuPmeGroupEnt(mib, this);
                    this.efmCuAlarmConfGroup = new EfmCuAlarmConfGroupEnt(mib, this);
                    this.efmCuNotificationGroup = new EfmCuNotificationGroupEnt(mib, this);
                    this.efmCuPme2BProfileGroup = new EfmCuPme2BProfileGroupEnt(mib, this);
                    this.efmCuPme10PProfileGroup = new EfmCuPme10PProfileGroupEnt(mib, this);
                    this.efmCuPme10PStatusGroup = new EfmCuPme10PStatusGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.efmCuBasicGroup,
                        this.efmCuPAFGroup,
                        this.efmCuPAFErrorsGroup,
                        this.efmCuPmeGroup,
                        this.efmCuAlarmConfGroup,
                        this.efmCuNotificationGroup,
                        this.efmCuPme2BProfileGroup,
                        this.efmCuPme10PProfileGroup,
                        this.efmCuPme10PStatusGroup
                    };
                }
                public static final class EfmCuBasicGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuBasicGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuBasicGroup", "1.3.6.1.2.1.167.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuPAFGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuPAFGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPAFGroup", "1.3.6.1.2.1.167.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuPAFErrorsGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuPAFErrorsGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPAFErrorsGroup", "1.3.6.1.2.1.167.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuPmeGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuPmeGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPmeGroup", "1.3.6.1.2.1.167.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuAlarmConfGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuAlarmConfGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuAlarmConfGroup", "1.3.6.1.2.1.167.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuNotificationGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuNotificationGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuNotificationGroup", "1.3.6.1.2.1.167.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuPme2BProfileGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuPme2BProfileGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPme2BProfileGroup", "1.3.6.1.2.1.167.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuPme10PProfileGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuPme10PProfileGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPme10PProfileGroup", "1.3.6.1.2.1.167.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EfmCuPme10PStatusGroupEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuPme10PStatusGroupEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuPme10PStatusGroup", "1.3.6.1.2.1.167.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EfmCuCompliancesEnt extends MIBEntry<EFMCUMIBDef>
            {
                /** Compliance Statements*/
                public final EfmCuComplianceEnt efmCuCompliance;

                private EfmCuCompliancesEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                {
                    super(mib, parent, "efmCuCompliances", "1.3.6.1.2.1.167.2.2", false, false, false, false);
                    this.efmCuCompliance = new EfmCuComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.efmCuCompliance
                    };
                }
                public static final class EfmCuComplianceEnt extends MIBEntry<EFMCUMIBDef>
                {
                    private EfmCuComplianceEnt(EFMCUMIBDef mib, MIBEntry<EFMCUMIBDef> parent)
                    {
                        super(mib, parent, "efmCuCompliance", "1.3.6.1.2.1.167.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
