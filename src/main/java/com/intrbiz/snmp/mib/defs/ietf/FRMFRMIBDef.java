package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class FRMFRMIBDef extends MIB
{
    public static final FRMFRMIBDef FRMFRMIB = new FRMFRMIBDef();

    public final MfrMibEnt mfrMib;

    private FRMFRMIBDef()
    {
        super("FR-MFR-MIB");
        this.mfrMib = new MfrMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.mfrMib
        };
    }

    public static final class MfrMibEnt extends MIBEntry<FRMFRMIBDef>
    {
        /** ----------------------------------------------------------Object Identifiers

----------------------------------------------------------*/
        public final MfrMibScalarObjectsEnt mfrMibScalarObjects;

        public final MfrMibBundleObjectsEnt mfrMibBundleObjects;

        public final MfrMibBundleLinkObjectsEnt mfrMibBundleLinkObjects;

        public final MfrMibTrapsEnt mfrMibTraps;

        public final MfrMibConformanceEnt mfrMibConformance;

        private MfrMibEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
        {
            super(mib, parent, "mfrMib", "1.3.6.1.2.1.10.47", false, false, false, false);
            this.mfrMibScalarObjects = new MfrMibScalarObjectsEnt(mib, this);
            this.mfrMibBundleObjects = new MfrMibBundleObjectsEnt(mib, this);
            this.mfrMibBundleLinkObjects = new MfrMibBundleLinkObjectsEnt(mib, this);
            this.mfrMibTraps = new MfrMibTrapsEnt(mib, this);
            this.mfrMibConformance = new MfrMibConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mfrMibScalarObjects,
                this.mfrMibBundleObjects,
                this.mfrMibBundleLinkObjects,
                this.mfrMibTraps,
                this.mfrMibConformance
            };
        }
        public static final class MfrMibScalarObjectsEnt extends MIBEntry<FRMFRMIBDef>
        {
            /** ----------------------------------------------------------Scalars----------------------------------------------------------*/
            public final MfrBundleMaxNumBundlesEnt mfrBundleMaxNumBundles;

            public final MfrBundleNextIndexEnt mfrBundleNextIndex;

            private MfrMibScalarObjectsEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
            {
                super(mib, parent, "mfrMibScalarObjects", "1.3.6.1.2.1.10.47.1", false, false, false, false);
                this.mfrBundleMaxNumBundles = new MfrBundleMaxNumBundlesEnt(mib, this);
                this.mfrBundleNextIndex = new MfrBundleNextIndexEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mfrBundleMaxNumBundles,
                    this.mfrBundleNextIndex
                };
            }
            public static final class MfrBundleMaxNumBundlesEnt extends MIBEntry<FRMFRMIBDef>
            {
                private MfrBundleMaxNumBundlesEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrBundleMaxNumBundles", "1.3.6.1.2.1.10.47.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MfrBundleNextIndexEnt extends MIBEntry<FRMFRMIBDef>
            {
                private MfrBundleNextIndexEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrBundleNextIndex", "1.3.6.1.2.1.10.47.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MfrMibBundleObjectsEnt extends MIBEntry<FRMFRMIBDef>
        {
            /** ----------------------------------------------------------Bundle Table----------------------------------------------------------*/
            public final MfrBundleTableEnt mfrBundleTable;

            /** ----------------------------------------------------------ifIndex Mapping to Bundle Index Table----------------------------------------------------------*/
            public final MfrBundleIfIndexMappingTableEnt mfrBundleIfIndexMappingTable;

            private MfrMibBundleObjectsEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
            {
                super(mib, parent, "mfrMibBundleObjects", "1.3.6.1.2.1.10.47.2", false, false, false, false);
                this.mfrBundleTable = new MfrBundleTableEnt(mib, this);
                this.mfrBundleIfIndexMappingTable = new MfrBundleIfIndexMappingTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mfrBundleTable,
                    this.mfrBundleIfIndexMappingTable
                };
            }
            public static final class MfrBundleTableEnt extends MIBEntry<FRMFRMIBDef>
            {
                public final MfrBundleEntryEnt mfrBundleEntry;

                private MfrBundleTableEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrBundleTable", "1.3.6.1.2.1.10.47.2.3", false, true, false, false);
                    this.mfrBundleEntry = new MfrBundleEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mfrBundleEntry
                    };
                }
                public static final class MfrBundleEntryEnt extends MIBEntry<FRMFRMIBDef>
                {
                    public final MfrBundleIndexEnt mfrBundleIndex;

                    public final MfrBundleIfIndexEnt mfrBundleIfIndex;

                    public final MfrBundleRowStatusEnt mfrBundleRowStatus;

                    public final MfrBundleNearEndNameEnt mfrBundleNearEndName;

                    public final MfrBundleFragmentationEnt mfrBundleFragmentation;

                    public final MfrBundleMaxFragSizeEnt mfrBundleMaxFragSize;

                    public final MfrBundleTimerHelloEnt mfrBundleTimerHello;

                    public final MfrBundleTimerAckEnt mfrBundleTimerAck;

                    public final MfrBundleCountMaxRetryEnt mfrBundleCountMaxRetry;

                    public final MfrBundleActivationClassEnt mfrBundleActivationClass;

                    public final MfrBundleThresholdEnt mfrBundleThreshold;

                    public final MfrBundleMaxDiffDelayEnt mfrBundleMaxDiffDelay;

                    public final MfrBundleSeqNumSizeEnt mfrBundleSeqNumSize;

                    public final MfrBundleMaxBundleLinksEnt mfrBundleMaxBundleLinks;

                    public final MfrBundleLinksConfiguredEnt mfrBundleLinksConfigured;

                    public final MfrBundleLinksActiveEnt mfrBundleLinksActive;

                    public final MfrBundleBandwidthEnt mfrBundleBandwidth;

                    public final MfrBundleFarEndNameEnt mfrBundleFarEndName;

                    public final MfrBundleResequencingErrorsEnt mfrBundleResequencingErrors;

                    private MfrBundleEntryEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrBundleEntry", "1.3.6.1.2.1.10.47.2.3.1", false, false, false, true);
                        this.mfrBundleIndex = new MfrBundleIndexEnt(mib, this);
                        this.mfrBundleIfIndex = new MfrBundleIfIndexEnt(mib, this);
                        this.mfrBundleRowStatus = new MfrBundleRowStatusEnt(mib, this);
                        this.mfrBundleNearEndName = new MfrBundleNearEndNameEnt(mib, this);
                        this.mfrBundleFragmentation = new MfrBundleFragmentationEnt(mib, this);
                        this.mfrBundleMaxFragSize = new MfrBundleMaxFragSizeEnt(mib, this);
                        this.mfrBundleTimerHello = new MfrBundleTimerHelloEnt(mib, this);
                        this.mfrBundleTimerAck = new MfrBundleTimerAckEnt(mib, this);
                        this.mfrBundleCountMaxRetry = new MfrBundleCountMaxRetryEnt(mib, this);
                        this.mfrBundleActivationClass = new MfrBundleActivationClassEnt(mib, this);
                        this.mfrBundleThreshold = new MfrBundleThresholdEnt(mib, this);
                        this.mfrBundleMaxDiffDelay = new MfrBundleMaxDiffDelayEnt(mib, this);
                        this.mfrBundleSeqNumSize = new MfrBundleSeqNumSizeEnt(mib, this);
                        this.mfrBundleMaxBundleLinks = new MfrBundleMaxBundleLinksEnt(mib, this);
                        this.mfrBundleLinksConfigured = new MfrBundleLinksConfiguredEnt(mib, this);
                        this.mfrBundleLinksActive = new MfrBundleLinksActiveEnt(mib, this);
                        this.mfrBundleBandwidth = new MfrBundleBandwidthEnt(mib, this);
                        this.mfrBundleFarEndName = new MfrBundleFarEndNameEnt(mib, this);
                        this.mfrBundleResequencingErrors = new MfrBundleResequencingErrorsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mfrBundleIndex,
                            this.mfrBundleIfIndex,
                            this.mfrBundleRowStatus,
                            this.mfrBundleNearEndName,
                            this.mfrBundleFragmentation,
                            this.mfrBundleMaxFragSize,
                            this.mfrBundleTimerHello,
                            this.mfrBundleTimerAck,
                            this.mfrBundleCountMaxRetry,
                            this.mfrBundleActivationClass,
                            this.mfrBundleThreshold,
                            this.mfrBundleMaxDiffDelay,
                            this.mfrBundleSeqNumSize,
                            this.mfrBundleMaxBundleLinks,
                            this.mfrBundleLinksConfigured,
                            this.mfrBundleLinksActive,
                            this.mfrBundleBandwidth,
                            this.mfrBundleFarEndName,
                            this.mfrBundleResequencingErrors
                        };
                    }
                    public static final class MfrBundleIndexEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleIndexEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleIndex", "1.3.6.1.2.1.10.47.2.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleIfIndexEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleIfIndexEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleIfIndex", "1.3.6.1.2.1.10.47.2.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleRowStatusEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleRowStatusEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleRowStatus", "1.3.6.1.2.1.10.47.2.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleNearEndNameEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleNearEndNameEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleNearEndName", "1.3.6.1.2.1.10.47.2.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleFragmentationEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleFragmentationEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleFragmentation", "1.3.6.1.2.1.10.47.2.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleMaxFragSizeEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleMaxFragSizeEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleMaxFragSize", "1.3.6.1.2.1.10.47.2.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleTimerHelloEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleTimerHelloEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleTimerHello", "1.3.6.1.2.1.10.47.2.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleTimerAckEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleTimerAckEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleTimerAck", "1.3.6.1.2.1.10.47.2.3.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleCountMaxRetryEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleCountMaxRetryEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleCountMaxRetry", "1.3.6.1.2.1.10.47.2.3.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleActivationClassEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleActivationClassEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleActivationClass", "1.3.6.1.2.1.10.47.2.3.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleThresholdEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleThresholdEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleThreshold", "1.3.6.1.2.1.10.47.2.3.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleMaxDiffDelayEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleMaxDiffDelayEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleMaxDiffDelay", "1.3.6.1.2.1.10.47.2.3.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleSeqNumSizeEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleSeqNumSizeEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleSeqNumSize", "1.3.6.1.2.1.10.47.2.3.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleMaxBundleLinksEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleMaxBundleLinksEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleMaxBundleLinks", "1.3.6.1.2.1.10.47.2.3.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinksConfiguredEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinksConfiguredEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinksConfigured", "1.3.6.1.2.1.10.47.2.3.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinksActiveEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinksActiveEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinksActive", "1.3.6.1.2.1.10.47.2.3.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleBandwidthEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleBandwidthEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleBandwidth", "1.3.6.1.2.1.10.47.2.3.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleFarEndNameEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleFarEndNameEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleFarEndName", "1.3.6.1.2.1.10.47.2.3.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleResequencingErrorsEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleResequencingErrorsEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleResequencingErrors", "1.3.6.1.2.1.10.47.2.3.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class MfrBundleIfIndexMappingTableEnt extends MIBEntry<FRMFRMIBDef>
            {
                public final MfrBundleIfIndexMappingEntryEnt mfrBundleIfIndexMappingEntry;

                private MfrBundleIfIndexMappingTableEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrBundleIfIndexMappingTable", "1.3.6.1.2.1.10.47.2.4", false, true, false, false);
                    this.mfrBundleIfIndexMappingEntry = new MfrBundleIfIndexMappingEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mfrBundleIfIndexMappingEntry
                    };
                }
                public static final class MfrBundleIfIndexMappingEntryEnt extends MIBEntry<FRMFRMIBDef>
                {
                    public final MfrBundleIfIndexMappingIndexEnt mfrBundleIfIndexMappingIndex;

                    private MfrBundleIfIndexMappingEntryEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrBundleIfIndexMappingEntry", "1.3.6.1.2.1.10.47.2.4.1", false, false, false, true);
                        this.mfrBundleIfIndexMappingIndex = new MfrBundleIfIndexMappingIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mfrBundleIfIndexMappingIndex
                        };
                    }
                    public static final class MfrBundleIfIndexMappingIndexEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleIfIndexMappingIndexEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleIfIndexMappingIndex", "1.3.6.1.2.1.10.47.2.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MfrMibBundleLinkObjectsEnt extends MIBEntry<FRMFRMIBDef>
        {
            /** ----------------------------------------------------------Bundle Link Table----------------------------------------------------------*/
            public final MfrBundleLinkTableEnt mfrBundleLinkTable;

            private MfrMibBundleLinkObjectsEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
            {
                super(mib, parent, "mfrMibBundleLinkObjects", "1.3.6.1.2.1.10.47.3", false, false, false, false);
                this.mfrBundleLinkTable = new MfrBundleLinkTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mfrBundleLinkTable
                };
            }
            public static final class MfrBundleLinkTableEnt extends MIBEntry<FRMFRMIBDef>
            {
                public final MfrBundleLinkEntryEnt mfrBundleLinkEntry;

                private MfrBundleLinkTableEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrBundleLinkTable", "1.3.6.1.2.1.10.47.3.1", false, true, false, false);
                    this.mfrBundleLinkEntry = new MfrBundleLinkEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mfrBundleLinkEntry
                    };
                }
                public static final class MfrBundleLinkEntryEnt extends MIBEntry<FRMFRMIBDef>
                {
                    public final MfrBundleLinkRowStatusEnt mfrBundleLinkRowStatus;

                    public final MfrBundleLinkConfigBundleIndexEnt mfrBundleLinkConfigBundleIndex;

                    public final MfrBundleLinkNearEndNameEnt mfrBundleLinkNearEndName;

                    public final MfrBundleLinkStateEnt mfrBundleLinkState;

                    public final MfrBundleLinkFarEndNameEnt mfrBundleLinkFarEndName;

                    public final MfrBundleLinkFarEndBundleNameEnt mfrBundleLinkFarEndBundleName;

                    public final MfrBundleLinkDelayEnt mfrBundleLinkDelay;

                    public final MfrBundleLinkFramesControlTxEnt mfrBundleLinkFramesControlTx;

                    public final MfrBundleLinkFramesControlRxEnt mfrBundleLinkFramesControlRx;

                    public final MfrBundleLinkFramesControlInvalidEnt mfrBundleLinkFramesControlInvalid;

                    public final MfrBundleLinkTimerExpiredCountEnt mfrBundleLinkTimerExpiredCount;

                    public final MfrBundleLinkLoopbackSuspectedEnt mfrBundleLinkLoopbackSuspected;

                    public final MfrBundleLinkUnexpectedSequenceEnt mfrBundleLinkUnexpectedSequence;

                    public final MfrBundleLinkMismatchEnt mfrBundleLinkMismatch;

                    private MfrBundleLinkEntryEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrBundleLinkEntry", "1.3.6.1.2.1.10.47.3.1.1", false, false, false, true);
                        this.mfrBundleLinkRowStatus = new MfrBundleLinkRowStatusEnt(mib, this);
                        this.mfrBundleLinkConfigBundleIndex = new MfrBundleLinkConfigBundleIndexEnt(mib, this);
                        this.mfrBundleLinkNearEndName = new MfrBundleLinkNearEndNameEnt(mib, this);
                        this.mfrBundleLinkState = new MfrBundleLinkStateEnt(mib, this);
                        this.mfrBundleLinkFarEndName = new MfrBundleLinkFarEndNameEnt(mib, this);
                        this.mfrBundleLinkFarEndBundleName = new MfrBundleLinkFarEndBundleNameEnt(mib, this);
                        this.mfrBundleLinkDelay = new MfrBundleLinkDelayEnt(mib, this);
                        this.mfrBundleLinkFramesControlTx = new MfrBundleLinkFramesControlTxEnt(mib, this);
                        this.mfrBundleLinkFramesControlRx = new MfrBundleLinkFramesControlRxEnt(mib, this);
                        this.mfrBundleLinkFramesControlInvalid = new MfrBundleLinkFramesControlInvalidEnt(mib, this);
                        this.mfrBundleLinkTimerExpiredCount = new MfrBundleLinkTimerExpiredCountEnt(mib, this);
                        this.mfrBundleLinkLoopbackSuspected = new MfrBundleLinkLoopbackSuspectedEnt(mib, this);
                        this.mfrBundleLinkUnexpectedSequence = new MfrBundleLinkUnexpectedSequenceEnt(mib, this);
                        this.mfrBundleLinkMismatch = new MfrBundleLinkMismatchEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mfrBundleLinkRowStatus,
                            this.mfrBundleLinkConfigBundleIndex,
                            this.mfrBundleLinkNearEndName,
                            this.mfrBundleLinkState,
                            this.mfrBundleLinkFarEndName,
                            this.mfrBundleLinkFarEndBundleName,
                            this.mfrBundleLinkDelay,
                            this.mfrBundleLinkFramesControlTx,
                            this.mfrBundleLinkFramesControlRx,
                            this.mfrBundleLinkFramesControlInvalid,
                            this.mfrBundleLinkTimerExpiredCount,
                            this.mfrBundleLinkLoopbackSuspected,
                            this.mfrBundleLinkUnexpectedSequence,
                            this.mfrBundleLinkMismatch
                        };
                    }
                    public static final class MfrBundleLinkRowStatusEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkRowStatusEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkRowStatus", "1.3.6.1.2.1.10.47.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkConfigBundleIndexEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkConfigBundleIndexEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkConfigBundleIndex", "1.3.6.1.2.1.10.47.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkNearEndNameEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkNearEndNameEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkNearEndName", "1.3.6.1.2.1.10.47.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkStateEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkStateEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkState", "1.3.6.1.2.1.10.47.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkFarEndNameEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkFarEndNameEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkFarEndName", "1.3.6.1.2.1.10.47.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkFarEndBundleNameEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkFarEndBundleNameEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkFarEndBundleName", "1.3.6.1.2.1.10.47.3.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkDelayEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkDelayEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkDelay", "1.3.6.1.2.1.10.47.3.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkFramesControlTxEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkFramesControlTxEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkFramesControlTx", "1.3.6.1.2.1.10.47.3.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkFramesControlRxEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkFramesControlRxEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkFramesControlRx", "1.3.6.1.2.1.10.47.3.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkFramesControlInvalidEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkFramesControlInvalidEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkFramesControlInvalid", "1.3.6.1.2.1.10.47.3.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkTimerExpiredCountEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkTimerExpiredCountEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkTimerExpiredCount", "1.3.6.1.2.1.10.47.3.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkLoopbackSuspectedEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkLoopbackSuspectedEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkLoopbackSuspected", "1.3.6.1.2.1.10.47.3.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkUnexpectedSequenceEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkUnexpectedSequenceEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkUnexpectedSequence", "1.3.6.1.2.1.10.47.3.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MfrBundleLinkMismatchEnt extends MIBEntry<FRMFRMIBDef>
                    {
                        private MfrBundleLinkMismatchEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                        {
                            super(mib, parent, "mfrBundleLinkMismatch", "1.3.6.1.2.1.10.47.3.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MfrMibTrapsEnt extends MIBEntry<FRMFRMIBDef>
        {
            public final MfrMibTrapsPrefixEnt mfrMibTrapsPrefix;

            private MfrMibTrapsEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
            {
                super(mib, parent, "mfrMibTraps", "1.3.6.1.2.1.10.47.4", false, false, false, false);
                this.mfrMibTrapsPrefix = new MfrMibTrapsPrefixEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mfrMibTrapsPrefix
                };
            }
            public static final class MfrMibTrapsPrefixEnt extends MIBEntry<FRMFRMIBDef>
            {
                /** ----------------------------------------------------------Notifications/Traps----------------------------------------------------------*/
                public final MfrMibTrapBundleLinkMismatchEnt mfrMibTrapBundleLinkMismatch;

                private MfrMibTrapsPrefixEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrMibTrapsPrefix", "1.3.6.1.2.1.10.47.4.0", false, false, false, false);
                    this.mfrMibTrapBundleLinkMismatch = new MfrMibTrapBundleLinkMismatchEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mfrMibTrapBundleLinkMismatch
                    };
                }
                public static final class MfrMibTrapBundleLinkMismatchEnt extends MIBEntry<FRMFRMIBDef>
                {
                    private MfrMibTrapBundleLinkMismatchEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrMibTrapBundleLinkMismatch", "1.3.6.1.2.1.10.47.4.0.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class MfrMibConformanceEnt extends MIBEntry<FRMFRMIBDef>
        {
            public final MfrMibGroupsEnt mfrMibGroups;

            public final MfrMibCompliancesEnt mfrMibCompliances;

            private MfrMibConformanceEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
            {
                super(mib, parent, "mfrMibConformance", "1.3.6.1.2.1.10.47.5", false, false, false, false);
                this.mfrMibGroups = new MfrMibGroupsEnt(mib, this);
                this.mfrMibCompliances = new MfrMibCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mfrMibGroups,
                    this.mfrMibCompliances
                };
            }
            public static final class MfrMibGroupsEnt extends MIBEntry<FRMFRMIBDef>
            {
                /** ----------------------------------------------------------Units of Conformance----------------------------------------------------------*/
                public final MfrMibBundleGroupEnt mfrMibBundleGroup;

                public final MfrMibBundleLinkGroupEnt mfrMibBundleLinkGroup;

                public final MfrMibTrapGroupEnt mfrMibTrapGroup;

                private MfrMibGroupsEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrMibGroups", "1.3.6.1.2.1.10.47.5.1", false, false, false, false);
                    this.mfrMibBundleGroup = new MfrMibBundleGroupEnt(mib, this);
                    this.mfrMibBundleLinkGroup = new MfrMibBundleLinkGroupEnt(mib, this);
                    this.mfrMibTrapGroup = new MfrMibTrapGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mfrMibBundleGroup,
                        this.mfrMibBundleLinkGroup,
                        this.mfrMibTrapGroup
                    };
                }
                public static final class MfrMibBundleGroupEnt extends MIBEntry<FRMFRMIBDef>
                {
                    private MfrMibBundleGroupEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrMibBundleGroup", "1.3.6.1.2.1.10.47.5.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MfrMibBundleLinkGroupEnt extends MIBEntry<FRMFRMIBDef>
                {
                    private MfrMibBundleLinkGroupEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrMibBundleLinkGroup", "1.3.6.1.2.1.10.47.5.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MfrMibTrapGroupEnt extends MIBEntry<FRMFRMIBDef>
                {
                    private MfrMibTrapGroupEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrMibTrapGroup", "1.3.6.1.2.1.10.47.5.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MfrMibCompliancesEnt extends MIBEntry<FRMFRMIBDef>
            {
                /** ----------------------------------------------------------Conformance/Compliance----------------------------------------------------------*/
                public final MfrMibComplianceEnt mfrMibCompliance;

                private MfrMibCompliancesEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                {
                    super(mib, parent, "mfrMibCompliances", "1.3.6.1.2.1.10.47.5.2", false, false, false, false);
                    this.mfrMibCompliance = new MfrMibComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mfrMibCompliance
                    };
                }
                public static final class MfrMibComplianceEnt extends MIBEntry<FRMFRMIBDef>
                {
                    private MfrMibComplianceEnt(FRMFRMIBDef mib, MIBEntry<FRMFRMIBDef> parent)
                    {
                        super(mib, parent, "mfrMibCompliance", "1.3.6.1.2.1.10.47.5.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
