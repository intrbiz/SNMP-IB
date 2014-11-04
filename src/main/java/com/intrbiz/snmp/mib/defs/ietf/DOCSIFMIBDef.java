package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC2863]
[RFC4001]*/
public final class DOCSIFMIBDef extends MIB
{
    public static final DOCSIFMIBDef DOCSIFMIB = new DOCSIFMIBDef();

    static { MIBs.getInstance().registerMIB(DOCSIFMIBDef.DOCSIFMIB); }

    /** [IANA]

May 24, 2006*/
    public final DocsIfMibEnt docsIfMib;

    private DOCSIFMIBDef()
    {
        super("DOCS-IF-MIB");
        this.docsIfMib = new DocsIfMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsIfMib
        };
    }

    public static final class DocsIfMibEnt extends MIBEntry<DOCSIFMIBDef>
    {
        public final DocsIfMibObjectsEnt docsIfMibObjects;

        /** notification group is for future extension.*/
        public final DocsIfNotificationEnt docsIfNotification;

        /** MIB Compliance statements.
Conformance definitions*/
        public final DocsIfConformanceEnt docsIfConformance;

        private DocsIfMibEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
        {
            super(mib, parent, "docsIfMib", "1.3.6.1.2.1.10.127", false, false, false, false);
            this.docsIfMibObjects = new DocsIfMibObjectsEnt(mib, this);
            this.docsIfNotification = new DocsIfNotificationEnt(mib, this);
            this.docsIfConformance = new DocsIfConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsIfMibObjects,
                this.docsIfNotification,
                this.docsIfConformance
            };
        }
        public static final class DocsIfMibObjectsEnt extends MIBEntry<DOCSIFMIBDef>
        {
            public final DocsIfBaseObjectsEnt docsIfBaseObjects;

            public final DocsIfCmObjectsEnt docsIfCmObjects;

            public final DocsIfCmtsObjectsEnt docsIfCmtsObjects;

            private DocsIfMibObjectsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
            {
                super(mib, parent, "docsIfMibObjects", "1.3.6.1.2.1.10.127.1", false, false, false, false);
                this.docsIfBaseObjects = new DocsIfBaseObjectsEnt(mib, this);
                this.docsIfCmObjects = new DocsIfCmObjectsEnt(mib, this);
                this.docsIfCmtsObjects = new DocsIfCmtsObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsIfBaseObjects,
                    this.docsIfCmObjects,
                    this.docsIfCmtsObjects
                };
            }
            public static final class DocsIfBaseObjectsEnt extends MIBEntry<DOCSIFMIBDef>
            {
                /** BASE GROUP
The following table is implemented on both the Cable Modemand the Cable Modem Termination System.  This table isread only for the CM.*/
                public final DocsIfDownstreamChannelTableEnt docsIfDownstreamChannelTable;

                /** The following table is implemented on both the CM and the CMTS.For the CM, only attached channels appear in the table.  For theCM, this table is read-only as well.*/
                public final DocsIfUpstreamChannelTableEnt docsIfUpstreamChannelTable;

                /** The following table describes the attributes of each class ofservice.  The entries in this table are referenced from thedocsIfServiceEntries.  They exist as a separate table in order toreduce redundant information in docsIfServiceTable.This table is implemented at both the CM and the CMTS.The CM need only maintain entries for the classes of servicereferenced by its docsIfCmServiceTable.*/
                public final DocsIfQosProfileTableEnt docsIfQosProfileTable;

                public final DocsIfSignalQualityTableEnt docsIfSignalQualityTable;

                /** DOCSIS Version of the device*/
                public final DocsIfDocsisBaseCapabilityEnt docsIfDocsisBaseCapability;

                private DocsIfBaseObjectsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                {
                    super(mib, parent, "docsIfBaseObjects", "1.3.6.1.2.1.10.127.1.1", false, false, false, false);
                    this.docsIfDownstreamChannelTable = new DocsIfDownstreamChannelTableEnt(mib, this);
                    this.docsIfUpstreamChannelTable = new DocsIfUpstreamChannelTableEnt(mib, this);
                    this.docsIfQosProfileTable = new DocsIfQosProfileTableEnt(mib, this);
                    this.docsIfSignalQualityTable = new DocsIfSignalQualityTableEnt(mib, this);
                    this.docsIfDocsisBaseCapability = new DocsIfDocsisBaseCapabilityEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIfDownstreamChannelTable,
                        this.docsIfUpstreamChannelTable,
                        this.docsIfQosProfileTable,
                        this.docsIfSignalQualityTable,
                        this.docsIfDocsisBaseCapability
                    };
                }
                public static final class DocsIfDownstreamChannelTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfDownstreamChannelEntryEnt docsIfDownstreamChannelEntry;

                    private DocsIfDownstreamChannelTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfDownstreamChannelTable", "1.3.6.1.2.1.10.127.1.1.1", false, true, false, false);
                        this.docsIfDownstreamChannelEntry = new DocsIfDownstreamChannelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfDownstreamChannelEntry
                        };
                    }
                    public static final class DocsIfDownstreamChannelEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfDownChannelIdEnt docsIfDownChannelId;

                        public final DocsIfDownChannelFrequencyEnt docsIfDownChannelFrequency;

                        public final DocsIfDownChannelWidthEnt docsIfDownChannelWidth;

                        public final DocsIfDownChannelModulationEnt docsIfDownChannelModulation;

                        public final DocsIfDownChannelInterleaveEnt docsIfDownChannelInterleave;

                        public final DocsIfDownChannelPowerEnt docsIfDownChannelPower;

                        public final DocsIfDownChannelAnnexEnt docsIfDownChannelAnnex;

                        public final DocsIfDownChannelStorageTypeEnt docsIfDownChannelStorageType;

                        private DocsIfDownstreamChannelEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfDownstreamChannelEntry", "1.3.6.1.2.1.10.127.1.1.1.1", false, false, false, true);
                            this.docsIfDownChannelId = new DocsIfDownChannelIdEnt(mib, this);
                            this.docsIfDownChannelFrequency = new DocsIfDownChannelFrequencyEnt(mib, this);
                            this.docsIfDownChannelWidth = new DocsIfDownChannelWidthEnt(mib, this);
                            this.docsIfDownChannelModulation = new DocsIfDownChannelModulationEnt(mib, this);
                            this.docsIfDownChannelInterleave = new DocsIfDownChannelInterleaveEnt(mib, this);
                            this.docsIfDownChannelPower = new DocsIfDownChannelPowerEnt(mib, this);
                            this.docsIfDownChannelAnnex = new DocsIfDownChannelAnnexEnt(mib, this);
                            this.docsIfDownChannelStorageType = new DocsIfDownChannelStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfDownChannelId,
                                this.docsIfDownChannelFrequency,
                                this.docsIfDownChannelWidth,
                                this.docsIfDownChannelModulation,
                                this.docsIfDownChannelInterleave,
                                this.docsIfDownChannelPower,
                                this.docsIfDownChannelAnnex,
                                this.docsIfDownChannelStorageType
                            };
                        }
                        public static final class DocsIfDownChannelIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelId", "1.3.6.1.2.1.10.127.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelFrequencyEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelFrequencyEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelFrequency", "1.3.6.1.2.1.10.127.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelWidthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelWidthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelWidth", "1.3.6.1.2.1.10.127.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelModulationEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelModulationEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelModulation", "1.3.6.1.2.1.10.127.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelInterleaveEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelInterleaveEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelInterleave", "1.3.6.1.2.1.10.127.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelPowerEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelPowerEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelPower", "1.3.6.1.2.1.10.127.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelAnnexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelAnnexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelAnnex", "1.3.6.1.2.1.10.127.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfDownChannelStorageTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfDownChannelStorageTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfDownChannelStorageType", "1.3.6.1.2.1.10.127.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfUpstreamChannelTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfUpstreamChannelEntryEnt docsIfUpstreamChannelEntry;

                    private DocsIfUpstreamChannelTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfUpstreamChannelTable", "1.3.6.1.2.1.10.127.1.1.2", false, true, false, false);
                        this.docsIfUpstreamChannelEntry = new DocsIfUpstreamChannelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfUpstreamChannelEntry
                        };
                    }
                    public static final class DocsIfUpstreamChannelEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfUpChannelIdEnt docsIfUpChannelId;

                        public final DocsIfUpChannelFrequencyEnt docsIfUpChannelFrequency;

                        public final DocsIfUpChannelWidthEnt docsIfUpChannelWidth;

                        public final DocsIfUpChannelModulationProfileEnt docsIfUpChannelModulationProfile;

                        public final DocsIfUpChannelSlotSizeEnt docsIfUpChannelSlotSize;

                        public final DocsIfUpChannelTxTimingOffsetEnt docsIfUpChannelTxTimingOffset;

                        public final DocsIfUpChannelRangingBackoffStartEnt docsIfUpChannelRangingBackoffStart;

                        public final DocsIfUpChannelRangingBackoffEndEnt docsIfUpChannelRangingBackoffEnd;

                        public final DocsIfUpChannelTxBackoffStartEnt docsIfUpChannelTxBackoffStart;

                        public final DocsIfUpChannelTxBackoffEndEnt docsIfUpChannelTxBackoffEnd;

                        public final DocsIfUpChannelScdmaActiveCodesEnt docsIfUpChannelScdmaActiveCodes;

                        public final DocsIfUpChannelScdmaCodesPerSlotEnt docsIfUpChannelScdmaCodesPerSlot;

                        public final DocsIfUpChannelScdmaFrameSizeEnt docsIfUpChannelScdmaFrameSize;

                        public final DocsIfUpChannelScdmaHoppingSeedEnt docsIfUpChannelScdmaHoppingSeed;

                        public final DocsIfUpChannelTypeEnt docsIfUpChannelType;

                        public final DocsIfUpChannelCloneFromEnt docsIfUpChannelCloneFrom;

                        public final DocsIfUpChannelUpdateEnt docsIfUpChannelUpdate;

                        public final DocsIfUpChannelStatusEnt docsIfUpChannelStatus;

                        public final DocsIfUpChannelPreEqEnableEnt docsIfUpChannelPreEqEnable;

                        private DocsIfUpstreamChannelEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfUpstreamChannelEntry", "1.3.6.1.2.1.10.127.1.1.2.1", false, false, false, true);
                            this.docsIfUpChannelId = new DocsIfUpChannelIdEnt(mib, this);
                            this.docsIfUpChannelFrequency = new DocsIfUpChannelFrequencyEnt(mib, this);
                            this.docsIfUpChannelWidth = new DocsIfUpChannelWidthEnt(mib, this);
                            this.docsIfUpChannelModulationProfile = new DocsIfUpChannelModulationProfileEnt(mib, this);
                            this.docsIfUpChannelSlotSize = new DocsIfUpChannelSlotSizeEnt(mib, this);
                            this.docsIfUpChannelTxTimingOffset = new DocsIfUpChannelTxTimingOffsetEnt(mib, this);
                            this.docsIfUpChannelRangingBackoffStart = new DocsIfUpChannelRangingBackoffStartEnt(mib, this);
                            this.docsIfUpChannelRangingBackoffEnd = new DocsIfUpChannelRangingBackoffEndEnt(mib, this);
                            this.docsIfUpChannelTxBackoffStart = new DocsIfUpChannelTxBackoffStartEnt(mib, this);
                            this.docsIfUpChannelTxBackoffEnd = new DocsIfUpChannelTxBackoffEndEnt(mib, this);
                            this.docsIfUpChannelScdmaActiveCodes = new DocsIfUpChannelScdmaActiveCodesEnt(mib, this);
                            this.docsIfUpChannelScdmaCodesPerSlot = new DocsIfUpChannelScdmaCodesPerSlotEnt(mib, this);
                            this.docsIfUpChannelScdmaFrameSize = new DocsIfUpChannelScdmaFrameSizeEnt(mib, this);
                            this.docsIfUpChannelScdmaHoppingSeed = new DocsIfUpChannelScdmaHoppingSeedEnt(mib, this);
                            this.docsIfUpChannelType = new DocsIfUpChannelTypeEnt(mib, this);
                            this.docsIfUpChannelCloneFrom = new DocsIfUpChannelCloneFromEnt(mib, this);
                            this.docsIfUpChannelUpdate = new DocsIfUpChannelUpdateEnt(mib, this);
                            this.docsIfUpChannelStatus = new DocsIfUpChannelStatusEnt(mib, this);
                            this.docsIfUpChannelPreEqEnable = new DocsIfUpChannelPreEqEnableEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfUpChannelId,
                                this.docsIfUpChannelFrequency,
                                this.docsIfUpChannelWidth,
                                this.docsIfUpChannelModulationProfile,
                                this.docsIfUpChannelSlotSize,
                                this.docsIfUpChannelTxTimingOffset,
                                this.docsIfUpChannelRangingBackoffStart,
                                this.docsIfUpChannelRangingBackoffEnd,
                                this.docsIfUpChannelTxBackoffStart,
                                this.docsIfUpChannelTxBackoffEnd,
                                this.docsIfUpChannelScdmaActiveCodes,
                                this.docsIfUpChannelScdmaCodesPerSlot,
                                this.docsIfUpChannelScdmaFrameSize,
                                this.docsIfUpChannelScdmaHoppingSeed,
                                this.docsIfUpChannelType,
                                this.docsIfUpChannelCloneFrom,
                                this.docsIfUpChannelUpdate,
                                this.docsIfUpChannelStatus,
                                this.docsIfUpChannelPreEqEnable
                            };
                        }
                        public static final class DocsIfUpChannelIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelId", "1.3.6.1.2.1.10.127.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelFrequencyEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelFrequencyEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelFrequency", "1.3.6.1.2.1.10.127.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelWidthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelWidthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelWidth", "1.3.6.1.2.1.10.127.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelModulationProfileEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelModulationProfileEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelModulationProfile", "1.3.6.1.2.1.10.127.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelSlotSizeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelSlotSizeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelSlotSize", "1.3.6.1.2.1.10.127.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelTxTimingOffsetEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelTxTimingOffsetEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelTxTimingOffset", "1.3.6.1.2.1.10.127.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelRangingBackoffStartEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelRangingBackoffStartEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelRangingBackoffStart", "1.3.6.1.2.1.10.127.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelRangingBackoffEndEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelRangingBackoffEndEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelRangingBackoffEnd", "1.3.6.1.2.1.10.127.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelTxBackoffStartEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelTxBackoffStartEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelTxBackoffStart", "1.3.6.1.2.1.10.127.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelTxBackoffEndEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelTxBackoffEndEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelTxBackoffEnd", "1.3.6.1.2.1.10.127.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelScdmaActiveCodesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelScdmaActiveCodesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelScdmaActiveCodes", "1.3.6.1.2.1.10.127.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelScdmaCodesPerSlotEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelScdmaCodesPerSlotEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelScdmaCodesPerSlot", "1.3.6.1.2.1.10.127.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelScdmaFrameSizeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelScdmaFrameSizeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelScdmaFrameSize", "1.3.6.1.2.1.10.127.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelScdmaHoppingSeedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelScdmaHoppingSeedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelScdmaHoppingSeed", "1.3.6.1.2.1.10.127.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelType", "1.3.6.1.2.1.10.127.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelCloneFromEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelCloneFromEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelCloneFrom", "1.3.6.1.2.1.10.127.1.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelUpdateEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelUpdateEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelUpdate", "1.3.6.1.2.1.10.127.1.1.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelStatusEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelStatusEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelStatus", "1.3.6.1.2.1.10.127.1.1.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfUpChannelPreEqEnableEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfUpChannelPreEqEnableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfUpChannelPreEqEnable", "1.3.6.1.2.1.10.127.1.1.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfQosProfileTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfQosProfileEntryEnt docsIfQosProfileEntry;

                    private DocsIfQosProfileTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfQosProfileTable", "1.3.6.1.2.1.10.127.1.1.3", false, true, false, false);
                        this.docsIfQosProfileEntry = new DocsIfQosProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfQosProfileEntry
                        };
                    }
                    public static final class DocsIfQosProfileEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfQosProfIndexEnt docsIfQosProfIndex;

                        public final DocsIfQosProfPriorityEnt docsIfQosProfPriority;

                        public final DocsIfQosProfMaxUpBandwidthEnt docsIfQosProfMaxUpBandwidth;

                        public final DocsIfQosProfGuarUpBandwidthEnt docsIfQosProfGuarUpBandwidth;

                        public final DocsIfQosProfMaxDownBandwidthEnt docsIfQosProfMaxDownBandwidth;

                        public final DocsIfQosProfMaxTxBurstEnt docsIfQosProfMaxTxBurst;

                        public final DocsIfQosProfBaselinePrivacyEnt docsIfQosProfBaselinePrivacy;

                        public final DocsIfQosProfStatusEnt docsIfQosProfStatus;

                        public final DocsIfQosProfMaxTransmitBurstEnt docsIfQosProfMaxTransmitBurst;

                        public final DocsIfQosProfStorageTypeEnt docsIfQosProfStorageType;

                        private DocsIfQosProfileEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfQosProfileEntry", "1.3.6.1.2.1.10.127.1.1.3.1", false, false, false, true);
                            this.docsIfQosProfIndex = new DocsIfQosProfIndexEnt(mib, this);
                            this.docsIfQosProfPriority = new DocsIfQosProfPriorityEnt(mib, this);
                            this.docsIfQosProfMaxUpBandwidth = new DocsIfQosProfMaxUpBandwidthEnt(mib, this);
                            this.docsIfQosProfGuarUpBandwidth = new DocsIfQosProfGuarUpBandwidthEnt(mib, this);
                            this.docsIfQosProfMaxDownBandwidth = new DocsIfQosProfMaxDownBandwidthEnt(mib, this);
                            this.docsIfQosProfMaxTxBurst = new DocsIfQosProfMaxTxBurstEnt(mib, this);
                            this.docsIfQosProfBaselinePrivacy = new DocsIfQosProfBaselinePrivacyEnt(mib, this);
                            this.docsIfQosProfStatus = new DocsIfQosProfStatusEnt(mib, this);
                            this.docsIfQosProfMaxTransmitBurst = new DocsIfQosProfMaxTransmitBurstEnt(mib, this);
                            this.docsIfQosProfStorageType = new DocsIfQosProfStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfQosProfIndex,
                                this.docsIfQosProfPriority,
                                this.docsIfQosProfMaxUpBandwidth,
                                this.docsIfQosProfGuarUpBandwidth,
                                this.docsIfQosProfMaxDownBandwidth,
                                this.docsIfQosProfMaxTxBurst,
                                this.docsIfQosProfBaselinePrivacy,
                                this.docsIfQosProfStatus,
                                this.docsIfQosProfMaxTransmitBurst,
                                this.docsIfQosProfStorageType
                            };
                        }
                        public static final class DocsIfQosProfIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfIndex", "1.3.6.1.2.1.10.127.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfPriorityEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfPriorityEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfPriority", "1.3.6.1.2.1.10.127.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfMaxUpBandwidthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfMaxUpBandwidthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfMaxUpBandwidth", "1.3.6.1.2.1.10.127.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfGuarUpBandwidthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfGuarUpBandwidthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfGuarUpBandwidth", "1.3.6.1.2.1.10.127.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfMaxDownBandwidthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfMaxDownBandwidthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfMaxDownBandwidth", "1.3.6.1.2.1.10.127.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfMaxTxBurstEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfMaxTxBurstEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfMaxTxBurst", "1.3.6.1.2.1.10.127.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfBaselinePrivacyEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfBaselinePrivacyEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfBaselinePrivacy", "1.3.6.1.2.1.10.127.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfStatusEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfStatusEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfStatus", "1.3.6.1.2.1.10.127.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfMaxTransmitBurstEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfMaxTransmitBurstEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfMaxTransmitBurst", "1.3.6.1.2.1.10.127.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfQosProfStorageTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfQosProfStorageTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfQosProfStorageType", "1.3.6.1.2.1.10.127.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfSignalQualityTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfSignalQualityEntryEnt docsIfSignalQualityEntry;

                    private DocsIfSignalQualityTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfSignalQualityTable", "1.3.6.1.2.1.10.127.1.1.4", false, true, false, false);
                        this.docsIfSignalQualityEntry = new DocsIfSignalQualityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfSignalQualityEntry
                        };
                    }
                    public static final class DocsIfSignalQualityEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfSigQIncludesContentionEnt docsIfSigQIncludesContention;

                        public final DocsIfSigQUnerroredsEnt docsIfSigQUnerroreds;

                        public final DocsIfSigQCorrectedsEnt docsIfSigQCorrecteds;

                        public final DocsIfSigQUncorrectablesEnt docsIfSigQUncorrectables;

                        public final DocsIfSigQSignalNoiseEnt docsIfSigQSignalNoise;

                        public final DocsIfSigQMicroreflectionsEnt docsIfSigQMicroreflections;

                        public final DocsIfSigQEqualizationDataEnt docsIfSigQEqualizationData;

                        public final DocsIfSigQExtUnerroredsEnt docsIfSigQExtUnerroreds;

                        public final DocsIfSigQExtCorrectedsEnt docsIfSigQExtCorrecteds;

                        public final DocsIfSigQExtUncorrectablesEnt docsIfSigQExtUncorrectables;

                        private DocsIfSignalQualityEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfSignalQualityEntry", "1.3.6.1.2.1.10.127.1.1.4.1", false, false, false, true);
                            this.docsIfSigQIncludesContention = new DocsIfSigQIncludesContentionEnt(mib, this);
                            this.docsIfSigQUnerroreds = new DocsIfSigQUnerroredsEnt(mib, this);
                            this.docsIfSigQCorrecteds = new DocsIfSigQCorrectedsEnt(mib, this);
                            this.docsIfSigQUncorrectables = new DocsIfSigQUncorrectablesEnt(mib, this);
                            this.docsIfSigQSignalNoise = new DocsIfSigQSignalNoiseEnt(mib, this);
                            this.docsIfSigQMicroreflections = new DocsIfSigQMicroreflectionsEnt(mib, this);
                            this.docsIfSigQEqualizationData = new DocsIfSigQEqualizationDataEnt(mib, this);
                            this.docsIfSigQExtUnerroreds = new DocsIfSigQExtUnerroredsEnt(mib, this);
                            this.docsIfSigQExtCorrecteds = new DocsIfSigQExtCorrectedsEnt(mib, this);
                            this.docsIfSigQExtUncorrectables = new DocsIfSigQExtUncorrectablesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfSigQIncludesContention,
                                this.docsIfSigQUnerroreds,
                                this.docsIfSigQCorrecteds,
                                this.docsIfSigQUncorrectables,
                                this.docsIfSigQSignalNoise,
                                this.docsIfSigQMicroreflections,
                                this.docsIfSigQEqualizationData,
                                this.docsIfSigQExtUnerroreds,
                                this.docsIfSigQExtCorrecteds,
                                this.docsIfSigQExtUncorrectables
                            };
                        }
                        public static final class DocsIfSigQIncludesContentionEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQIncludesContentionEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQIncludesContention", "1.3.6.1.2.1.10.127.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQUnerroredsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQUnerroredsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQUnerroreds", "1.3.6.1.2.1.10.127.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQCorrectedsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQCorrectedsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQCorrecteds", "1.3.6.1.2.1.10.127.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQUncorrectablesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQUncorrectablesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQUncorrectables", "1.3.6.1.2.1.10.127.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQSignalNoiseEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQSignalNoiseEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQSignalNoise", "1.3.6.1.2.1.10.127.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQMicroreflectionsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQMicroreflectionsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQMicroreflections", "1.3.6.1.2.1.10.127.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQEqualizationDataEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQEqualizationDataEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQEqualizationData", "1.3.6.1.2.1.10.127.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQExtUnerroredsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQExtUnerroredsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQExtUnerroreds", "1.3.6.1.2.1.10.127.1.1.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQExtCorrectedsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQExtCorrectedsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQExtCorrecteds", "1.3.6.1.2.1.10.127.1.1.4.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfSigQExtUncorrectablesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfSigQExtUncorrectablesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfSigQExtUncorrectables", "1.3.6.1.2.1.10.127.1.1.4.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfDocsisBaseCapabilityEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfDocsisBaseCapabilityEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfDocsisBaseCapability", "1.3.6.1.2.1.10.127.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsIfCmObjectsEnt extends MIBEntry<DOCSIFMIBDef>
            {
                /** CABLE MODEM GROUP
The CM MAC Table*/
                public final DocsIfCmMacTableEnt docsIfCmMacTable;

                /** CM status table.This table is implemented only at the CM.*/
                public final DocsIfCmStatusTableEnt docsIfCmStatusTable;

                /** The Cable Modem Service Table*/
                public final DocsIfCmServiceTableEnt docsIfCmServiceTable;

                private DocsIfCmObjectsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                {
                    super(mib, parent, "docsIfCmObjects", "1.3.6.1.2.1.10.127.1.2", false, false, false, false);
                    this.docsIfCmMacTable = new DocsIfCmMacTableEnt(mib, this);
                    this.docsIfCmStatusTable = new DocsIfCmStatusTableEnt(mib, this);
                    this.docsIfCmServiceTable = new DocsIfCmServiceTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIfCmMacTable,
                        this.docsIfCmStatusTable,
                        this.docsIfCmServiceTable
                    };
                }
                public static final class DocsIfCmMacTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmMacEntryEnt docsIfCmMacEntry;

                    private DocsIfCmMacTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmMacTable", "1.3.6.1.2.1.10.127.1.2.1", false, true, false, false);
                        this.docsIfCmMacEntry = new DocsIfCmMacEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmMacEntry
                        };
                    }
                    public static final class DocsIfCmMacEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmCmtsAddressEnt docsIfCmCmtsAddress;

                        public final DocsIfCmCapabilitiesEnt docsIfCmCapabilities;

                        public final DocsIfCmRangingRespTimeoutEnt docsIfCmRangingRespTimeout;

                        public final DocsIfCmRangingTimeoutEnt docsIfCmRangingTimeout;

                        private DocsIfCmMacEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmMacEntry", "1.3.6.1.2.1.10.127.1.2.1.1", false, false, false, true);
                            this.docsIfCmCmtsAddress = new DocsIfCmCmtsAddressEnt(mib, this);
                            this.docsIfCmCapabilities = new DocsIfCmCapabilitiesEnt(mib, this);
                            this.docsIfCmRangingRespTimeout = new DocsIfCmRangingRespTimeoutEnt(mib, this);
                            this.docsIfCmRangingTimeout = new DocsIfCmRangingTimeoutEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmCmtsAddress,
                                this.docsIfCmCapabilities,
                                this.docsIfCmRangingRespTimeout,
                                this.docsIfCmRangingTimeout
                            };
                        }
                        public static final class DocsIfCmCmtsAddressEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmCmtsAddressEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmCmtsAddress", "1.3.6.1.2.1.10.127.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmCapabilitiesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmCapabilitiesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmCapabilities", "1.3.6.1.2.1.10.127.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmRangingRespTimeoutEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmRangingRespTimeoutEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmRangingRespTimeout", "1.3.6.1.2.1.10.127.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmRangingTimeoutEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmRangingTimeoutEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmRangingTimeout", "1.3.6.1.2.1.10.127.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmStatusTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmStatusEntryEnt docsIfCmStatusEntry;

                    private DocsIfCmStatusTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmStatusTable", "1.3.6.1.2.1.10.127.1.2.2", false, true, false, false);
                        this.docsIfCmStatusEntry = new DocsIfCmStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmStatusEntry
                        };
                    }
                    public static final class DocsIfCmStatusEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmStatusValueEnt docsIfCmStatusValue;

                        public final DocsIfCmStatusCodeEnt docsIfCmStatusCode;

                        public final DocsIfCmStatusTxPowerEnt docsIfCmStatusTxPower;

                        public final DocsIfCmStatusResetsEnt docsIfCmStatusResets;

                        public final DocsIfCmStatusLostSyncsEnt docsIfCmStatusLostSyncs;

                        public final DocsIfCmStatusInvalidMapsEnt docsIfCmStatusInvalidMaps;

                        public final DocsIfCmStatusInvalidUcdsEnt docsIfCmStatusInvalidUcds;

                        public final DocsIfCmStatusInvalidRangingResponsesEnt docsIfCmStatusInvalidRangingResponses;

                        public final DocsIfCmStatusInvalidRegistrationResponsesEnt docsIfCmStatusInvalidRegistrationResponses;

                        public final DocsIfCmStatusT1TimeoutsEnt docsIfCmStatusT1Timeouts;

                        public final DocsIfCmStatusT2TimeoutsEnt docsIfCmStatusT2Timeouts;

                        public final DocsIfCmStatusT3TimeoutsEnt docsIfCmStatusT3Timeouts;

                        public final DocsIfCmStatusT4TimeoutsEnt docsIfCmStatusT4Timeouts;

                        public final DocsIfCmStatusRangingAbortedsEnt docsIfCmStatusRangingAborteds;

                        public final DocsIfCmStatusDocsisOperModeEnt docsIfCmStatusDocsisOperMode;

                        public final DocsIfCmStatusModulationTypeEnt docsIfCmStatusModulationType;

                        public final DocsIfCmStatusEqualizationDataEnt docsIfCmStatusEqualizationData;

                        public final DocsIfCmStatusUCCsEnt docsIfCmStatusUCCs;

                        public final DocsIfCmStatusUCCFailsEnt docsIfCmStatusUCCFails;

                        private DocsIfCmStatusEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmStatusEntry", "1.3.6.1.2.1.10.127.1.2.2.1", false, false, false, true);
                            this.docsIfCmStatusValue = new DocsIfCmStatusValueEnt(mib, this);
                            this.docsIfCmStatusCode = new DocsIfCmStatusCodeEnt(mib, this);
                            this.docsIfCmStatusTxPower = new DocsIfCmStatusTxPowerEnt(mib, this);
                            this.docsIfCmStatusResets = new DocsIfCmStatusResetsEnt(mib, this);
                            this.docsIfCmStatusLostSyncs = new DocsIfCmStatusLostSyncsEnt(mib, this);
                            this.docsIfCmStatusInvalidMaps = new DocsIfCmStatusInvalidMapsEnt(mib, this);
                            this.docsIfCmStatusInvalidUcds = new DocsIfCmStatusInvalidUcdsEnt(mib, this);
                            this.docsIfCmStatusInvalidRangingResponses = new DocsIfCmStatusInvalidRangingResponsesEnt(mib, this);
                            this.docsIfCmStatusInvalidRegistrationResponses = new DocsIfCmStatusInvalidRegistrationResponsesEnt(mib, this);
                            this.docsIfCmStatusT1Timeouts = new DocsIfCmStatusT1TimeoutsEnt(mib, this);
                            this.docsIfCmStatusT2Timeouts = new DocsIfCmStatusT2TimeoutsEnt(mib, this);
                            this.docsIfCmStatusT3Timeouts = new DocsIfCmStatusT3TimeoutsEnt(mib, this);
                            this.docsIfCmStatusT4Timeouts = new DocsIfCmStatusT4TimeoutsEnt(mib, this);
                            this.docsIfCmStatusRangingAborteds = new DocsIfCmStatusRangingAbortedsEnt(mib, this);
                            this.docsIfCmStatusDocsisOperMode = new DocsIfCmStatusDocsisOperModeEnt(mib, this);
                            this.docsIfCmStatusModulationType = new DocsIfCmStatusModulationTypeEnt(mib, this);
                            this.docsIfCmStatusEqualizationData = new DocsIfCmStatusEqualizationDataEnt(mib, this);
                            this.docsIfCmStatusUCCs = new DocsIfCmStatusUCCsEnt(mib, this);
                            this.docsIfCmStatusUCCFails = new DocsIfCmStatusUCCFailsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmStatusValue,
                                this.docsIfCmStatusCode,
                                this.docsIfCmStatusTxPower,
                                this.docsIfCmStatusResets,
                                this.docsIfCmStatusLostSyncs,
                                this.docsIfCmStatusInvalidMaps,
                                this.docsIfCmStatusInvalidUcds,
                                this.docsIfCmStatusInvalidRangingResponses,
                                this.docsIfCmStatusInvalidRegistrationResponses,
                                this.docsIfCmStatusT1Timeouts,
                                this.docsIfCmStatusT2Timeouts,
                                this.docsIfCmStatusT3Timeouts,
                                this.docsIfCmStatusT4Timeouts,
                                this.docsIfCmStatusRangingAborteds,
                                this.docsIfCmStatusDocsisOperMode,
                                this.docsIfCmStatusModulationType,
                                this.docsIfCmStatusEqualizationData,
                                this.docsIfCmStatusUCCs,
                                this.docsIfCmStatusUCCFails
                            };
                        }
                        public static final class DocsIfCmStatusValueEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusValueEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusValue", "1.3.6.1.2.1.10.127.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusCodeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusCodeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusCode", "1.3.6.1.2.1.10.127.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusTxPowerEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusTxPowerEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusTxPower", "1.3.6.1.2.1.10.127.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusResetsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusResetsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusResets", "1.3.6.1.2.1.10.127.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusLostSyncsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusLostSyncsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusLostSyncs", "1.3.6.1.2.1.10.127.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusInvalidMapsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusInvalidMapsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusInvalidMaps", "1.3.6.1.2.1.10.127.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusInvalidUcdsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusInvalidUcdsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusInvalidUcds", "1.3.6.1.2.1.10.127.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusInvalidRangingResponsesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusInvalidRangingResponsesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusInvalidRangingResponses", "1.3.6.1.2.1.10.127.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusInvalidRegistrationResponsesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusInvalidRegistrationResponsesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusInvalidRegistrationResponses", "1.3.6.1.2.1.10.127.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusT1TimeoutsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusT1TimeoutsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusT1Timeouts", "1.3.6.1.2.1.10.127.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusT2TimeoutsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusT2TimeoutsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusT2Timeouts", "1.3.6.1.2.1.10.127.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusT3TimeoutsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusT3TimeoutsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusT3Timeouts", "1.3.6.1.2.1.10.127.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusT4TimeoutsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusT4TimeoutsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusT4Timeouts", "1.3.6.1.2.1.10.127.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusRangingAbortedsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusRangingAbortedsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusRangingAborteds", "1.3.6.1.2.1.10.127.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusDocsisOperModeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusDocsisOperModeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusDocsisOperMode", "1.3.6.1.2.1.10.127.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusModulationTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusModulationTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusModulationType", "1.3.6.1.2.1.10.127.1.2.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusEqualizationDataEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusEqualizationDataEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusEqualizationData", "1.3.6.1.2.1.10.127.1.2.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusUCCsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusUCCsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusUCCs", "1.3.6.1.2.1.10.127.1.2.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmStatusUCCFailsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmStatusUCCFailsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmStatusUCCFails", "1.3.6.1.2.1.10.127.1.2.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmServiceTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmServiceEntryEnt docsIfCmServiceEntry;

                    private DocsIfCmServiceTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmServiceTable", "1.3.6.1.2.1.10.127.1.2.3", false, true, false, false);
                        this.docsIfCmServiceEntry = new DocsIfCmServiceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmServiceEntry
                        };
                    }
                    public static final class DocsIfCmServiceEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmServiceIdEnt docsIfCmServiceId;

                        public final DocsIfCmServiceQosProfileEnt docsIfCmServiceQosProfile;

                        public final DocsIfCmServiceTxSlotsImmedEnt docsIfCmServiceTxSlotsImmed;

                        public final DocsIfCmServiceTxSlotsDedEnt docsIfCmServiceTxSlotsDed;

                        public final DocsIfCmServiceTxRetriesEnt docsIfCmServiceTxRetries;

                        public final DocsIfCmServiceTxExceededsEnt docsIfCmServiceTxExceededs;

                        public final DocsIfCmServiceRqRetriesEnt docsIfCmServiceRqRetries;

                        public final DocsIfCmServiceRqExceededsEnt docsIfCmServiceRqExceededs;

                        public final DocsIfCmServiceExtTxSlotsImmedEnt docsIfCmServiceExtTxSlotsImmed;

                        public final DocsIfCmServiceExtTxSlotsDedEnt docsIfCmServiceExtTxSlotsDed;

                        private DocsIfCmServiceEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmServiceEntry", "1.3.6.1.2.1.10.127.1.2.3.1", false, false, false, true);
                            this.docsIfCmServiceId = new DocsIfCmServiceIdEnt(mib, this);
                            this.docsIfCmServiceQosProfile = new DocsIfCmServiceQosProfileEnt(mib, this);
                            this.docsIfCmServiceTxSlotsImmed = new DocsIfCmServiceTxSlotsImmedEnt(mib, this);
                            this.docsIfCmServiceTxSlotsDed = new DocsIfCmServiceTxSlotsDedEnt(mib, this);
                            this.docsIfCmServiceTxRetries = new DocsIfCmServiceTxRetriesEnt(mib, this);
                            this.docsIfCmServiceTxExceededs = new DocsIfCmServiceTxExceededsEnt(mib, this);
                            this.docsIfCmServiceRqRetries = new DocsIfCmServiceRqRetriesEnt(mib, this);
                            this.docsIfCmServiceRqExceededs = new DocsIfCmServiceRqExceededsEnt(mib, this);
                            this.docsIfCmServiceExtTxSlotsImmed = new DocsIfCmServiceExtTxSlotsImmedEnt(mib, this);
                            this.docsIfCmServiceExtTxSlotsDed = new DocsIfCmServiceExtTxSlotsDedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmServiceId,
                                this.docsIfCmServiceQosProfile,
                                this.docsIfCmServiceTxSlotsImmed,
                                this.docsIfCmServiceTxSlotsDed,
                                this.docsIfCmServiceTxRetries,
                                this.docsIfCmServiceTxExceededs,
                                this.docsIfCmServiceRqRetries,
                                this.docsIfCmServiceRqExceededs,
                                this.docsIfCmServiceExtTxSlotsImmed,
                                this.docsIfCmServiceExtTxSlotsDed
                            };
                        }
                        public static final class DocsIfCmServiceIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceId", "1.3.6.1.2.1.10.127.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceQosProfileEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceQosProfileEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceQosProfile", "1.3.6.1.2.1.10.127.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceTxSlotsImmedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceTxSlotsImmedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceTxSlotsImmed", "1.3.6.1.2.1.10.127.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceTxSlotsDedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceTxSlotsDedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceTxSlotsDed", "1.3.6.1.2.1.10.127.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceTxRetriesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceTxRetriesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceTxRetries", "1.3.6.1.2.1.10.127.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceTxExceededsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceTxExceededsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceTxExceededs", "1.3.6.1.2.1.10.127.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceRqRetriesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceRqRetriesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceRqRetries", "1.3.6.1.2.1.10.127.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceRqExceededsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceRqExceededsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceRqExceededs", "1.3.6.1.2.1.10.127.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceExtTxSlotsImmedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceExtTxSlotsImmedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceExtTxSlotsImmed", "1.3.6.1.2.1.10.127.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmServiceExtTxSlotsDedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmServiceExtTxSlotsDedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmServiceExtTxSlotsDed", "1.3.6.1.2.1.10.127.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class DocsIfCmtsObjectsEnt extends MIBEntry<DOCSIFMIBDef>
            {
                /** CMTS GROUP
The CMTS MAC Table*/
                public final DocsIfCmtsMacTableEnt docsIfCmtsMacTable;

                /** CMTS status table.*/
                public final DocsIfCmtsStatusTableEnt docsIfCmtsStatusTable;

                /** CM status table (within CMTS).This table is implemented only at the CMTS.It contains per-CM status information available in the CMTS.*/
                public final DocsIfCmtsCmStatusTableEnt docsIfCmtsCmStatusTable;

                /** The CMTS Service Table.*/
                public final DocsIfCmtsServiceTableEnt docsIfCmtsServiceTable;

                /** The following table provides upstream channel modulation profiles.Entries in this table can bere-used by one or more upstream channels.  An upstream channelwill have a modulation profile for each value ofdocsIfModIntervalUsageCode.*/
                public final DocsIfCmtsModulationTableEnt docsIfCmtsModulationTable;

                public final DocsIfCmtsQosProfilePermissionsEnt docsIfCmtsQosProfilePermissions;

                public final DocsIfCmtsMacToCmTableEnt docsIfCmtsMacToCmTable;

                /** The following independent object and associated table provideoperators with a mechanism to evaluate the load/utilization ofboth upstream and downstream physical channels.  This informationmay be used for capacity planning and incident analysis and maybe particularly helpful in provisioning of high value QOS.Utilization is expressed as an index representing the calculatedpercentage utilization of the upstream or downstream channel inthe most recent sampling interval (i.e., utilization interval).Refer to the DESCRIPTION field of thedocsIfCmtsChannelUtUtilization object for definitions andcalculation details.*/
                public final DocsIfCmtsChannelUtilizationIntervalEnt docsIfCmtsChannelUtilizationInterval;

                public final DocsIfCmtsChannelUtilizationTableEnt docsIfCmtsChannelUtilizationTable;

                /** The following table provides operators with input dataappropriate for calculating downstream channel utilization.Operators may use the docsIfCmtsChannelUtilizationTable orperform their own polling of thedocsIfCmtsDownChannelCounterTable objects to characterizetheir downstream channel usage.  The 32-bit counter objects areincluded to provide backward compatibility with SNMPv1 managers,which cannot access 64-bit counter objects.*/
                public final DocsIfCmtsDownChannelCounterTableEnt docsIfCmtsDownChannelCounterTable;

                /** The following table provides operators with input data appropriatefor calculating upstream channel utilization, and for determiningthe traffic characteristics of upstream channels.  Operators mayuse the docsIfCmtsChannelUtilizationTable or perform their ownpolling of the docsIfCmtsUpChannelCounterTable objects forutilization determination.The first four 32 and 64 objects in this table are mandatory.Vendors may choose to implement the remaining optional objects toprovide operators with finer characterization of upstream channeltraffic patterns.  The 32-bit counter objects are included toprovide backward compatibility with SNMPv1 managers, which cannotaccess 64-bit counter objects.*/
                public final DocsIfCmtsUpChannelCounterTableEnt docsIfCmtsUpChannelCounterTable;

                private DocsIfCmtsObjectsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                {
                    super(mib, parent, "docsIfCmtsObjects", "1.3.6.1.2.1.10.127.1.3", false, false, false, false);
                    this.docsIfCmtsMacTable = new DocsIfCmtsMacTableEnt(mib, this);
                    this.docsIfCmtsStatusTable = new DocsIfCmtsStatusTableEnt(mib, this);
                    this.docsIfCmtsCmStatusTable = new DocsIfCmtsCmStatusTableEnt(mib, this);
                    this.docsIfCmtsServiceTable = new DocsIfCmtsServiceTableEnt(mib, this);
                    this.docsIfCmtsModulationTable = new DocsIfCmtsModulationTableEnt(mib, this);
                    this.docsIfCmtsQosProfilePermissions = new DocsIfCmtsQosProfilePermissionsEnt(mib, this);
                    this.docsIfCmtsMacToCmTable = new DocsIfCmtsMacToCmTableEnt(mib, this);
                    this.docsIfCmtsChannelUtilizationInterval = new DocsIfCmtsChannelUtilizationIntervalEnt(mib, this);
                    this.docsIfCmtsChannelUtilizationTable = new DocsIfCmtsChannelUtilizationTableEnt(mib, this);
                    this.docsIfCmtsDownChannelCounterTable = new DocsIfCmtsDownChannelCounterTableEnt(mib, this);
                    this.docsIfCmtsUpChannelCounterTable = new DocsIfCmtsUpChannelCounterTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIfCmtsMacTable,
                        this.docsIfCmtsStatusTable,
                        this.docsIfCmtsCmStatusTable,
                        this.docsIfCmtsServiceTable,
                        this.docsIfCmtsModulationTable,
                        this.docsIfCmtsQosProfilePermissions,
                        this.docsIfCmtsMacToCmTable,
                        this.docsIfCmtsChannelUtilizationInterval,
                        this.docsIfCmtsChannelUtilizationTable,
                        this.docsIfCmtsDownChannelCounterTable,
                        this.docsIfCmtsUpChannelCounterTable
                    };
                }
                public static final class DocsIfCmtsMacTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsMacEntryEnt docsIfCmtsMacEntry;

                    private DocsIfCmtsMacTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsMacTable", "1.3.6.1.2.1.10.127.1.3.1", false, true, false, false);
                        this.docsIfCmtsMacEntry = new DocsIfCmtsMacEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsMacEntry
                        };
                    }
                    public static final class DocsIfCmtsMacEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsCapabilitiesEnt docsIfCmtsCapabilities;

                        public final DocsIfCmtsSyncIntervalEnt docsIfCmtsSyncInterval;

                        public final DocsIfCmtsUcdIntervalEnt docsIfCmtsUcdInterval;

                        public final DocsIfCmtsMaxServiceIdsEnt docsIfCmtsMaxServiceIds;

                        public final DocsIfCmtsInsertionIntervalEnt docsIfCmtsInsertionInterval;

                        public final DocsIfCmtsInvitedRangingAttemptsEnt docsIfCmtsInvitedRangingAttempts;

                        public final DocsIfCmtsInsertIntervalEnt docsIfCmtsInsertInterval;

                        public final DocsIfCmtsMacStorageTypeEnt docsIfCmtsMacStorageType;

                        private DocsIfCmtsMacEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsMacEntry", "1.3.6.1.2.1.10.127.1.3.1.1", false, false, false, true);
                            this.docsIfCmtsCapabilities = new DocsIfCmtsCapabilitiesEnt(mib, this);
                            this.docsIfCmtsSyncInterval = new DocsIfCmtsSyncIntervalEnt(mib, this);
                            this.docsIfCmtsUcdInterval = new DocsIfCmtsUcdIntervalEnt(mib, this);
                            this.docsIfCmtsMaxServiceIds = new DocsIfCmtsMaxServiceIdsEnt(mib, this);
                            this.docsIfCmtsInsertionInterval = new DocsIfCmtsInsertionIntervalEnt(mib, this);
                            this.docsIfCmtsInvitedRangingAttempts = new DocsIfCmtsInvitedRangingAttemptsEnt(mib, this);
                            this.docsIfCmtsInsertInterval = new DocsIfCmtsInsertIntervalEnt(mib, this);
                            this.docsIfCmtsMacStorageType = new DocsIfCmtsMacStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsCapabilities,
                                this.docsIfCmtsSyncInterval,
                                this.docsIfCmtsUcdInterval,
                                this.docsIfCmtsMaxServiceIds,
                                this.docsIfCmtsInsertionInterval,
                                this.docsIfCmtsInvitedRangingAttempts,
                                this.docsIfCmtsInsertInterval,
                                this.docsIfCmtsMacStorageType
                            };
                        }
                        public static final class DocsIfCmtsCapabilitiesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCapabilitiesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCapabilities", "1.3.6.1.2.1.10.127.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsSyncIntervalEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsSyncIntervalEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsSyncInterval", "1.3.6.1.2.1.10.127.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUcdIntervalEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUcdIntervalEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUcdInterval", "1.3.6.1.2.1.10.127.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsMaxServiceIdsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsMaxServiceIdsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsMaxServiceIds", "1.3.6.1.2.1.10.127.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsInsertionIntervalEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsInsertionIntervalEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsInsertionInterval", "1.3.6.1.2.1.10.127.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsInvitedRangingAttemptsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsInvitedRangingAttemptsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsInvitedRangingAttempts", "1.3.6.1.2.1.10.127.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsInsertIntervalEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsInsertIntervalEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsInsertInterval", "1.3.6.1.2.1.10.127.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsMacStorageTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsMacStorageTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsMacStorageType", "1.3.6.1.2.1.10.127.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsStatusTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsStatusEntryEnt docsIfCmtsStatusEntry;

                    private DocsIfCmtsStatusTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsStatusTable", "1.3.6.1.2.1.10.127.1.3.2", false, true, false, false);
                        this.docsIfCmtsStatusEntry = new DocsIfCmtsStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsStatusEntry
                        };
                    }
                    public static final class DocsIfCmtsStatusEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsStatusInvalidRangeReqsEnt docsIfCmtsStatusInvalidRangeReqs;

                        public final DocsIfCmtsStatusRangingAbortedsEnt docsIfCmtsStatusRangingAborteds;

                        public final DocsIfCmtsStatusInvalidRegReqsEnt docsIfCmtsStatusInvalidRegReqs;

                        public final DocsIfCmtsStatusFailedRegReqsEnt docsIfCmtsStatusFailedRegReqs;

                        public final DocsIfCmtsStatusInvalidDataReqsEnt docsIfCmtsStatusInvalidDataReqs;

                        public final DocsIfCmtsStatusT5TimeoutsEnt docsIfCmtsStatusT5Timeouts;

                        private DocsIfCmtsStatusEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsStatusEntry", "1.3.6.1.2.1.10.127.1.3.2.1", false, false, false, true);
                            this.docsIfCmtsStatusInvalidRangeReqs = new DocsIfCmtsStatusInvalidRangeReqsEnt(mib, this);
                            this.docsIfCmtsStatusRangingAborteds = new DocsIfCmtsStatusRangingAbortedsEnt(mib, this);
                            this.docsIfCmtsStatusInvalidRegReqs = new DocsIfCmtsStatusInvalidRegReqsEnt(mib, this);
                            this.docsIfCmtsStatusFailedRegReqs = new DocsIfCmtsStatusFailedRegReqsEnt(mib, this);
                            this.docsIfCmtsStatusInvalidDataReqs = new DocsIfCmtsStatusInvalidDataReqsEnt(mib, this);
                            this.docsIfCmtsStatusT5Timeouts = new DocsIfCmtsStatusT5TimeoutsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsStatusInvalidRangeReqs,
                                this.docsIfCmtsStatusRangingAborteds,
                                this.docsIfCmtsStatusInvalidRegReqs,
                                this.docsIfCmtsStatusFailedRegReqs,
                                this.docsIfCmtsStatusInvalidDataReqs,
                                this.docsIfCmtsStatusT5Timeouts
                            };
                        }
                        public static final class DocsIfCmtsStatusInvalidRangeReqsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsStatusInvalidRangeReqsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsStatusInvalidRangeReqs", "1.3.6.1.2.1.10.127.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsStatusRangingAbortedsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsStatusRangingAbortedsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsStatusRangingAborteds", "1.3.6.1.2.1.10.127.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsStatusInvalidRegReqsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsStatusInvalidRegReqsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsStatusInvalidRegReqs", "1.3.6.1.2.1.10.127.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsStatusFailedRegReqsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsStatusFailedRegReqsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsStatusFailedRegReqs", "1.3.6.1.2.1.10.127.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsStatusInvalidDataReqsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsStatusInvalidDataReqsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsStatusInvalidDataReqs", "1.3.6.1.2.1.10.127.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsStatusT5TimeoutsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsStatusT5TimeoutsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsStatusT5Timeouts", "1.3.6.1.2.1.10.127.1.3.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsCmStatusTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsCmStatusEntryEnt docsIfCmtsCmStatusEntry;

                    private DocsIfCmtsCmStatusTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsCmStatusTable", "1.3.6.1.2.1.10.127.1.3.3", false, true, false, false);
                        this.docsIfCmtsCmStatusEntry = new DocsIfCmtsCmStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsCmStatusEntry
                        };
                    }
                    public static final class DocsIfCmtsCmStatusEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsCmStatusIndexEnt docsIfCmtsCmStatusIndex;

                        public final DocsIfCmtsCmStatusMacAddressEnt docsIfCmtsCmStatusMacAddress;

                        public final DocsIfCmtsCmStatusIpAddressEnt docsIfCmtsCmStatusIpAddress;

                        public final DocsIfCmtsCmStatusDownChannelIfIndexEnt docsIfCmtsCmStatusDownChannelIfIndex;

                        public final DocsIfCmtsCmStatusUpChannelIfIndexEnt docsIfCmtsCmStatusUpChannelIfIndex;

                        public final DocsIfCmtsCmStatusRxPowerEnt docsIfCmtsCmStatusRxPower;

                        public final DocsIfCmtsCmStatusTimingOffsetEnt docsIfCmtsCmStatusTimingOffset;

                        public final DocsIfCmtsCmStatusEqualizationDataEnt docsIfCmtsCmStatusEqualizationData;

                        public final DocsIfCmtsCmStatusValueEnt docsIfCmtsCmStatusValue;

                        public final DocsIfCmtsCmStatusUnerroredsEnt docsIfCmtsCmStatusUnerroreds;

                        public final DocsIfCmtsCmStatusCorrectedsEnt docsIfCmtsCmStatusCorrecteds;

                        public final DocsIfCmtsCmStatusUncorrectablesEnt docsIfCmtsCmStatusUncorrectables;

                        public final DocsIfCmtsCmStatusSignalNoiseEnt docsIfCmtsCmStatusSignalNoise;

                        public final DocsIfCmtsCmStatusMicroreflectionsEnt docsIfCmtsCmStatusMicroreflections;

                        public final DocsIfCmtsCmStatusExtUnerroredsEnt docsIfCmtsCmStatusExtUnerroreds;

                        public final DocsIfCmtsCmStatusExtCorrectedsEnt docsIfCmtsCmStatusExtCorrecteds;

                        public final DocsIfCmtsCmStatusExtUncorrectablesEnt docsIfCmtsCmStatusExtUncorrectables;

                        public final DocsIfCmtsCmStatusDocsisRegModeEnt docsIfCmtsCmStatusDocsisRegMode;

                        public final DocsIfCmtsCmStatusModulationTypeEnt docsIfCmtsCmStatusModulationType;

                        public final DocsIfCmtsCmStatusInetAddressTypeEnt docsIfCmtsCmStatusInetAddressType;

                        public final DocsIfCmtsCmStatusInetAddressEnt docsIfCmtsCmStatusInetAddress;

                        public final DocsIfCmtsCmStatusValueLastUpdateEnt docsIfCmtsCmStatusValueLastUpdate;

                        public final DocsIfCmtsCmStatusHighResolutionTimingOffsetEnt docsIfCmtsCmStatusHighResolutionTimingOffset;

                        private DocsIfCmtsCmStatusEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsCmStatusEntry", "1.3.6.1.2.1.10.127.1.3.3.1", false, false, false, true);
                            this.docsIfCmtsCmStatusIndex = new DocsIfCmtsCmStatusIndexEnt(mib, this);
                            this.docsIfCmtsCmStatusMacAddress = new DocsIfCmtsCmStatusMacAddressEnt(mib, this);
                            this.docsIfCmtsCmStatusIpAddress = new DocsIfCmtsCmStatusIpAddressEnt(mib, this);
                            this.docsIfCmtsCmStatusDownChannelIfIndex = new DocsIfCmtsCmStatusDownChannelIfIndexEnt(mib, this);
                            this.docsIfCmtsCmStatusUpChannelIfIndex = new DocsIfCmtsCmStatusUpChannelIfIndexEnt(mib, this);
                            this.docsIfCmtsCmStatusRxPower = new DocsIfCmtsCmStatusRxPowerEnt(mib, this);
                            this.docsIfCmtsCmStatusTimingOffset = new DocsIfCmtsCmStatusTimingOffsetEnt(mib, this);
                            this.docsIfCmtsCmStatusEqualizationData = new DocsIfCmtsCmStatusEqualizationDataEnt(mib, this);
                            this.docsIfCmtsCmStatusValue = new DocsIfCmtsCmStatusValueEnt(mib, this);
                            this.docsIfCmtsCmStatusUnerroreds = new DocsIfCmtsCmStatusUnerroredsEnt(mib, this);
                            this.docsIfCmtsCmStatusCorrecteds = new DocsIfCmtsCmStatusCorrectedsEnt(mib, this);
                            this.docsIfCmtsCmStatusUncorrectables = new DocsIfCmtsCmStatusUncorrectablesEnt(mib, this);
                            this.docsIfCmtsCmStatusSignalNoise = new DocsIfCmtsCmStatusSignalNoiseEnt(mib, this);
                            this.docsIfCmtsCmStatusMicroreflections = new DocsIfCmtsCmStatusMicroreflectionsEnt(mib, this);
                            this.docsIfCmtsCmStatusExtUnerroreds = new DocsIfCmtsCmStatusExtUnerroredsEnt(mib, this);
                            this.docsIfCmtsCmStatusExtCorrecteds = new DocsIfCmtsCmStatusExtCorrectedsEnt(mib, this);
                            this.docsIfCmtsCmStatusExtUncorrectables = new DocsIfCmtsCmStatusExtUncorrectablesEnt(mib, this);
                            this.docsIfCmtsCmStatusDocsisRegMode = new DocsIfCmtsCmStatusDocsisRegModeEnt(mib, this);
                            this.docsIfCmtsCmStatusModulationType = new DocsIfCmtsCmStatusModulationTypeEnt(mib, this);
                            this.docsIfCmtsCmStatusInetAddressType = new DocsIfCmtsCmStatusInetAddressTypeEnt(mib, this);
                            this.docsIfCmtsCmStatusInetAddress = new DocsIfCmtsCmStatusInetAddressEnt(mib, this);
                            this.docsIfCmtsCmStatusValueLastUpdate = new DocsIfCmtsCmStatusValueLastUpdateEnt(mib, this);
                            this.docsIfCmtsCmStatusHighResolutionTimingOffset = new DocsIfCmtsCmStatusHighResolutionTimingOffsetEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsCmStatusIndex,
                                this.docsIfCmtsCmStatusMacAddress,
                                this.docsIfCmtsCmStatusIpAddress,
                                this.docsIfCmtsCmStatusDownChannelIfIndex,
                                this.docsIfCmtsCmStatusUpChannelIfIndex,
                                this.docsIfCmtsCmStatusRxPower,
                                this.docsIfCmtsCmStatusTimingOffset,
                                this.docsIfCmtsCmStatusEqualizationData,
                                this.docsIfCmtsCmStatusValue,
                                this.docsIfCmtsCmStatusUnerroreds,
                                this.docsIfCmtsCmStatusCorrecteds,
                                this.docsIfCmtsCmStatusUncorrectables,
                                this.docsIfCmtsCmStatusSignalNoise,
                                this.docsIfCmtsCmStatusMicroreflections,
                                this.docsIfCmtsCmStatusExtUnerroreds,
                                this.docsIfCmtsCmStatusExtCorrecteds,
                                this.docsIfCmtsCmStatusExtUncorrectables,
                                this.docsIfCmtsCmStatusDocsisRegMode,
                                this.docsIfCmtsCmStatusModulationType,
                                this.docsIfCmtsCmStatusInetAddressType,
                                this.docsIfCmtsCmStatusInetAddress,
                                this.docsIfCmtsCmStatusValueLastUpdate,
                                this.docsIfCmtsCmStatusHighResolutionTimingOffset
                            };
                        }
                        public static final class DocsIfCmtsCmStatusIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusIndex", "1.3.6.1.2.1.10.127.1.3.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusMacAddressEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusMacAddressEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusMacAddress", "1.3.6.1.2.1.10.127.1.3.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusIpAddressEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusIpAddressEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusIpAddress", "1.3.6.1.2.1.10.127.1.3.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusDownChannelIfIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusDownChannelIfIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusDownChannelIfIndex", "1.3.6.1.2.1.10.127.1.3.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusUpChannelIfIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusUpChannelIfIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusUpChannelIfIndex", "1.3.6.1.2.1.10.127.1.3.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusRxPowerEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusRxPowerEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusRxPower", "1.3.6.1.2.1.10.127.1.3.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusTimingOffsetEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusTimingOffsetEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusTimingOffset", "1.3.6.1.2.1.10.127.1.3.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusEqualizationDataEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusEqualizationDataEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusEqualizationData", "1.3.6.1.2.1.10.127.1.3.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusValueEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusValueEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusValue", "1.3.6.1.2.1.10.127.1.3.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusUnerroredsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusUnerroredsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusUnerroreds", "1.3.6.1.2.1.10.127.1.3.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusCorrectedsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusCorrectedsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusCorrecteds", "1.3.6.1.2.1.10.127.1.3.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusUncorrectablesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusUncorrectablesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusUncorrectables", "1.3.6.1.2.1.10.127.1.3.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusSignalNoiseEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusSignalNoiseEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusSignalNoise", "1.3.6.1.2.1.10.127.1.3.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusMicroreflectionsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusMicroreflectionsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusMicroreflections", "1.3.6.1.2.1.10.127.1.3.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusExtUnerroredsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusExtUnerroredsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusExtUnerroreds", "1.3.6.1.2.1.10.127.1.3.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusExtCorrectedsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusExtCorrectedsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusExtCorrecteds", "1.3.6.1.2.1.10.127.1.3.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusExtUncorrectablesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusExtUncorrectablesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusExtUncorrectables", "1.3.6.1.2.1.10.127.1.3.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusDocsisRegModeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusDocsisRegModeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusDocsisRegMode", "1.3.6.1.2.1.10.127.1.3.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusModulationTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusModulationTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusModulationType", "1.3.6.1.2.1.10.127.1.3.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusInetAddressTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusInetAddressTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusInetAddressType", "1.3.6.1.2.1.10.127.1.3.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusInetAddressEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusInetAddressEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusInetAddress", "1.3.6.1.2.1.10.127.1.3.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusValueLastUpdateEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusValueLastUpdateEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusValueLastUpdate", "1.3.6.1.2.1.10.127.1.3.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmStatusHighResolutionTimingOffsetEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmStatusHighResolutionTimingOffsetEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmStatusHighResolutionTimingOffset", "1.3.6.1.2.1.10.127.1.3.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsServiceTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsServiceEntryEnt docsIfCmtsServiceEntry;

                    private DocsIfCmtsServiceTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsServiceTable", "1.3.6.1.2.1.10.127.1.3.4", false, true, false, false);
                        this.docsIfCmtsServiceEntry = new DocsIfCmtsServiceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsServiceEntry
                        };
                    }
                    public static final class DocsIfCmtsServiceEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsServiceIdEnt docsIfCmtsServiceId;

                        public final DocsIfCmtsServiceCmStatusIndexEnt docsIfCmtsServiceCmStatusIndex;

                        public final DocsIfCmtsServiceAdminStatusEnt docsIfCmtsServiceAdminStatus;

                        public final DocsIfCmtsServiceQosProfileEnt docsIfCmtsServiceQosProfile;

                        public final DocsIfCmtsServiceCreateTimeEnt docsIfCmtsServiceCreateTime;

                        public final DocsIfCmtsServiceInOctetsEnt docsIfCmtsServiceInOctets;

                        public final DocsIfCmtsServiceInPacketsEnt docsIfCmtsServiceInPackets;

                        public final DocsIfCmtsServiceNewCmStatusIndexEnt docsIfCmtsServiceNewCmStatusIndex;

                        private DocsIfCmtsServiceEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsServiceEntry", "1.3.6.1.2.1.10.127.1.3.4.1", false, false, false, true);
                            this.docsIfCmtsServiceId = new DocsIfCmtsServiceIdEnt(mib, this);
                            this.docsIfCmtsServiceCmStatusIndex = new DocsIfCmtsServiceCmStatusIndexEnt(mib, this);
                            this.docsIfCmtsServiceAdminStatus = new DocsIfCmtsServiceAdminStatusEnt(mib, this);
                            this.docsIfCmtsServiceQosProfile = new DocsIfCmtsServiceQosProfileEnt(mib, this);
                            this.docsIfCmtsServiceCreateTime = new DocsIfCmtsServiceCreateTimeEnt(mib, this);
                            this.docsIfCmtsServiceInOctets = new DocsIfCmtsServiceInOctetsEnt(mib, this);
                            this.docsIfCmtsServiceInPackets = new DocsIfCmtsServiceInPacketsEnt(mib, this);
                            this.docsIfCmtsServiceNewCmStatusIndex = new DocsIfCmtsServiceNewCmStatusIndexEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsServiceId,
                                this.docsIfCmtsServiceCmStatusIndex,
                                this.docsIfCmtsServiceAdminStatus,
                                this.docsIfCmtsServiceQosProfile,
                                this.docsIfCmtsServiceCreateTime,
                                this.docsIfCmtsServiceInOctets,
                                this.docsIfCmtsServiceInPackets,
                                this.docsIfCmtsServiceNewCmStatusIndex
                            };
                        }
                        public static final class DocsIfCmtsServiceIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceId", "1.3.6.1.2.1.10.127.1.3.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceCmStatusIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceCmStatusIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceCmStatusIndex", "1.3.6.1.2.1.10.127.1.3.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceAdminStatusEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceAdminStatusEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceAdminStatus", "1.3.6.1.2.1.10.127.1.3.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceQosProfileEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceQosProfileEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceQosProfile", "1.3.6.1.2.1.10.127.1.3.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceCreateTimeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceCreateTimeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceCreateTime", "1.3.6.1.2.1.10.127.1.3.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceInOctetsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceInOctetsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceInOctets", "1.3.6.1.2.1.10.127.1.3.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceInPacketsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceInPacketsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceInPackets", "1.3.6.1.2.1.10.127.1.3.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsServiceNewCmStatusIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsServiceNewCmStatusIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsServiceNewCmStatusIndex", "1.3.6.1.2.1.10.127.1.3.4.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsModulationTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsModulationEntryEnt docsIfCmtsModulationEntry;

                    private DocsIfCmtsModulationTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsModulationTable", "1.3.6.1.2.1.10.127.1.3.5", false, true, false, false);
                        this.docsIfCmtsModulationEntry = new DocsIfCmtsModulationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsModulationEntry
                        };
                    }
                    public static final class DocsIfCmtsModulationEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsModIndexEnt docsIfCmtsModIndex;

                        public final DocsIfCmtsModIntervalUsageCodeEnt docsIfCmtsModIntervalUsageCode;

                        public final DocsIfCmtsModControlEnt docsIfCmtsModControl;

                        public final DocsIfCmtsModTypeEnt docsIfCmtsModType;

                        public final DocsIfCmtsModPreambleLenEnt docsIfCmtsModPreambleLen;

                        public final DocsIfCmtsModDifferentialEncodingEnt docsIfCmtsModDifferentialEncoding;

                        public final DocsIfCmtsModFECErrorCorrectionEnt docsIfCmtsModFECErrorCorrection;

                        public final DocsIfCmtsModFECCodewordLengthEnt docsIfCmtsModFECCodewordLength;

                        public final DocsIfCmtsModScramblerSeedEnt docsIfCmtsModScramblerSeed;

                        public final DocsIfCmtsModMaxBurstSizeEnt docsIfCmtsModMaxBurstSize;

                        public final DocsIfCmtsModGuardTimeSizeEnt docsIfCmtsModGuardTimeSize;

                        public final DocsIfCmtsModLastCodewordShortenedEnt docsIfCmtsModLastCodewordShortened;

                        public final DocsIfCmtsModScramblerEnt docsIfCmtsModScrambler;

                        public final DocsIfCmtsModByteInterleaverDepthEnt docsIfCmtsModByteInterleaverDepth;

                        public final DocsIfCmtsModByteInterleaverBlockSizeEnt docsIfCmtsModByteInterleaverBlockSize;

                        public final DocsIfCmtsModPreambleTypeEnt docsIfCmtsModPreambleType;

                        public final DocsIfCmtsModTcmErrorCorrectionOnEnt docsIfCmtsModTcmErrorCorrectionOn;

                        public final DocsIfCmtsModScdmaInterleaverStepSizeEnt docsIfCmtsModScdmaInterleaverStepSize;

                        public final DocsIfCmtsModScdmaSpreaderEnableEnt docsIfCmtsModScdmaSpreaderEnable;

                        public final DocsIfCmtsModScdmaSubframeCodesEnt docsIfCmtsModScdmaSubframeCodes;

                        public final DocsIfCmtsModChannelTypeEnt docsIfCmtsModChannelType;

                        public final DocsIfCmtsModStorageTypeEnt docsIfCmtsModStorageType;

                        private DocsIfCmtsModulationEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsModulationEntry", "1.3.6.1.2.1.10.127.1.3.5.1", false, false, false, true);
                            this.docsIfCmtsModIndex = new DocsIfCmtsModIndexEnt(mib, this);
                            this.docsIfCmtsModIntervalUsageCode = new DocsIfCmtsModIntervalUsageCodeEnt(mib, this);
                            this.docsIfCmtsModControl = new DocsIfCmtsModControlEnt(mib, this);
                            this.docsIfCmtsModType = new DocsIfCmtsModTypeEnt(mib, this);
                            this.docsIfCmtsModPreambleLen = new DocsIfCmtsModPreambleLenEnt(mib, this);
                            this.docsIfCmtsModDifferentialEncoding = new DocsIfCmtsModDifferentialEncodingEnt(mib, this);
                            this.docsIfCmtsModFECErrorCorrection = new DocsIfCmtsModFECErrorCorrectionEnt(mib, this);
                            this.docsIfCmtsModFECCodewordLength = new DocsIfCmtsModFECCodewordLengthEnt(mib, this);
                            this.docsIfCmtsModScramblerSeed = new DocsIfCmtsModScramblerSeedEnt(mib, this);
                            this.docsIfCmtsModMaxBurstSize = new DocsIfCmtsModMaxBurstSizeEnt(mib, this);
                            this.docsIfCmtsModGuardTimeSize = new DocsIfCmtsModGuardTimeSizeEnt(mib, this);
                            this.docsIfCmtsModLastCodewordShortened = new DocsIfCmtsModLastCodewordShortenedEnt(mib, this);
                            this.docsIfCmtsModScrambler = new DocsIfCmtsModScramblerEnt(mib, this);
                            this.docsIfCmtsModByteInterleaverDepth = new DocsIfCmtsModByteInterleaverDepthEnt(mib, this);
                            this.docsIfCmtsModByteInterleaverBlockSize = new DocsIfCmtsModByteInterleaverBlockSizeEnt(mib, this);
                            this.docsIfCmtsModPreambleType = new DocsIfCmtsModPreambleTypeEnt(mib, this);
                            this.docsIfCmtsModTcmErrorCorrectionOn = new DocsIfCmtsModTcmErrorCorrectionOnEnt(mib, this);
                            this.docsIfCmtsModScdmaInterleaverStepSize = new DocsIfCmtsModScdmaInterleaverStepSizeEnt(mib, this);
                            this.docsIfCmtsModScdmaSpreaderEnable = new DocsIfCmtsModScdmaSpreaderEnableEnt(mib, this);
                            this.docsIfCmtsModScdmaSubframeCodes = new DocsIfCmtsModScdmaSubframeCodesEnt(mib, this);
                            this.docsIfCmtsModChannelType = new DocsIfCmtsModChannelTypeEnt(mib, this);
                            this.docsIfCmtsModStorageType = new DocsIfCmtsModStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsModIndex,
                                this.docsIfCmtsModIntervalUsageCode,
                                this.docsIfCmtsModControl,
                                this.docsIfCmtsModType,
                                this.docsIfCmtsModPreambleLen,
                                this.docsIfCmtsModDifferentialEncoding,
                                this.docsIfCmtsModFECErrorCorrection,
                                this.docsIfCmtsModFECCodewordLength,
                                this.docsIfCmtsModScramblerSeed,
                                this.docsIfCmtsModMaxBurstSize,
                                this.docsIfCmtsModGuardTimeSize,
                                this.docsIfCmtsModLastCodewordShortened,
                                this.docsIfCmtsModScrambler,
                                this.docsIfCmtsModByteInterleaverDepth,
                                this.docsIfCmtsModByteInterleaverBlockSize,
                                this.docsIfCmtsModPreambleType,
                                this.docsIfCmtsModTcmErrorCorrectionOn,
                                this.docsIfCmtsModScdmaInterleaverStepSize,
                                this.docsIfCmtsModScdmaSpreaderEnable,
                                this.docsIfCmtsModScdmaSubframeCodes,
                                this.docsIfCmtsModChannelType,
                                this.docsIfCmtsModStorageType
                            };
                        }
                        public static final class DocsIfCmtsModIndexEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModIndexEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModIndex", "1.3.6.1.2.1.10.127.1.3.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModIntervalUsageCodeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModIntervalUsageCodeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModIntervalUsageCode", "1.3.6.1.2.1.10.127.1.3.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModControlEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModControlEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModControl", "1.3.6.1.2.1.10.127.1.3.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModType", "1.3.6.1.2.1.10.127.1.3.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModPreambleLenEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModPreambleLenEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModPreambleLen", "1.3.6.1.2.1.10.127.1.3.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModDifferentialEncodingEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModDifferentialEncodingEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModDifferentialEncoding", "1.3.6.1.2.1.10.127.1.3.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModFECErrorCorrectionEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModFECErrorCorrectionEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModFECErrorCorrection", "1.3.6.1.2.1.10.127.1.3.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModFECCodewordLengthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModFECCodewordLengthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModFECCodewordLength", "1.3.6.1.2.1.10.127.1.3.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModScramblerSeedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModScramblerSeedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModScramblerSeed", "1.3.6.1.2.1.10.127.1.3.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModMaxBurstSizeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModMaxBurstSizeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModMaxBurstSize", "1.3.6.1.2.1.10.127.1.3.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModGuardTimeSizeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModGuardTimeSizeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModGuardTimeSize", "1.3.6.1.2.1.10.127.1.3.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModLastCodewordShortenedEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModLastCodewordShortenedEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModLastCodewordShortened", "1.3.6.1.2.1.10.127.1.3.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModScramblerEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModScramblerEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModScrambler", "1.3.6.1.2.1.10.127.1.3.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModByteInterleaverDepthEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModByteInterleaverDepthEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModByteInterleaverDepth", "1.3.6.1.2.1.10.127.1.3.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModByteInterleaverBlockSizeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModByteInterleaverBlockSizeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModByteInterleaverBlockSize", "1.3.6.1.2.1.10.127.1.3.5.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModPreambleTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModPreambleTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModPreambleType", "1.3.6.1.2.1.10.127.1.3.5.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModTcmErrorCorrectionOnEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModTcmErrorCorrectionOnEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModTcmErrorCorrectionOn", "1.3.6.1.2.1.10.127.1.3.5.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModScdmaInterleaverStepSizeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModScdmaInterleaverStepSizeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModScdmaInterleaverStepSize", "1.3.6.1.2.1.10.127.1.3.5.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModScdmaSpreaderEnableEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModScdmaSpreaderEnableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModScdmaSpreaderEnable", "1.3.6.1.2.1.10.127.1.3.5.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModScdmaSubframeCodesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModScdmaSubframeCodesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModScdmaSubframeCodes", "1.3.6.1.2.1.10.127.1.3.5.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModChannelTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModChannelTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModChannelType", "1.3.6.1.2.1.10.127.1.3.5.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsModStorageTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsModStorageTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsModStorageType", "1.3.6.1.2.1.10.127.1.3.5.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsQosProfilePermissionsEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfCmtsQosProfilePermissionsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsQosProfilePermissions", "1.3.6.1.2.1.10.127.1.3.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfCmtsMacToCmTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsMacToCmEntryEnt docsIfCmtsMacToCmEntry;

                    private DocsIfCmtsMacToCmTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsMacToCmTable", "1.3.6.1.2.1.10.127.1.3.7", false, true, false, false);
                        this.docsIfCmtsMacToCmEntry = new DocsIfCmtsMacToCmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsMacToCmEntry
                        };
                    }
                    public static final class DocsIfCmtsMacToCmEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsCmMacEnt docsIfCmtsCmMac;

                        public final DocsIfCmtsCmPtrEnt docsIfCmtsCmPtr;

                        private DocsIfCmtsMacToCmEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsMacToCmEntry", "1.3.6.1.2.1.10.127.1.3.7.1", false, false, false, true);
                            this.docsIfCmtsCmMac = new DocsIfCmtsCmMacEnt(mib, this);
                            this.docsIfCmtsCmPtr = new DocsIfCmtsCmPtrEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsCmMac,
                                this.docsIfCmtsCmPtr
                            };
                        }
                        public static final class DocsIfCmtsCmMacEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmMacEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmMac", "1.3.6.1.2.1.10.127.1.3.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsCmPtrEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsCmPtrEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsCmPtr", "1.3.6.1.2.1.10.127.1.3.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsChannelUtilizationIntervalEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfCmtsChannelUtilizationIntervalEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsChannelUtilizationInterval", "1.3.6.1.2.1.10.127.1.3.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfCmtsChannelUtilizationTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsChannelUtilizationEntryEnt docsIfCmtsChannelUtilizationEntry;

                    private DocsIfCmtsChannelUtilizationTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsChannelUtilizationTable", "1.3.6.1.2.1.10.127.1.3.9", false, true, false, false);
                        this.docsIfCmtsChannelUtilizationEntry = new DocsIfCmtsChannelUtilizationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsChannelUtilizationEntry
                        };
                    }
                    public static final class DocsIfCmtsChannelUtilizationEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsChannelUtIfTypeEnt docsIfCmtsChannelUtIfType;

                        public final DocsIfCmtsChannelUtIdEnt docsIfCmtsChannelUtId;

                        public final DocsIfCmtsChannelUtUtilizationEnt docsIfCmtsChannelUtUtilization;

                        private DocsIfCmtsChannelUtilizationEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsChannelUtilizationEntry", "1.3.6.1.2.1.10.127.1.3.9.1", false, false, false, true);
                            this.docsIfCmtsChannelUtIfType = new DocsIfCmtsChannelUtIfTypeEnt(mib, this);
                            this.docsIfCmtsChannelUtId = new DocsIfCmtsChannelUtIdEnt(mib, this);
                            this.docsIfCmtsChannelUtUtilization = new DocsIfCmtsChannelUtUtilizationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsChannelUtIfType,
                                this.docsIfCmtsChannelUtId,
                                this.docsIfCmtsChannelUtUtilization
                            };
                        }
                        public static final class DocsIfCmtsChannelUtIfTypeEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsChannelUtIfTypeEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsChannelUtIfType", "1.3.6.1.2.1.10.127.1.3.9.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsChannelUtIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsChannelUtIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsChannelUtId", "1.3.6.1.2.1.10.127.1.3.9.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsChannelUtUtilizationEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsChannelUtUtilizationEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsChannelUtUtilization", "1.3.6.1.2.1.10.127.1.3.9.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsDownChannelCounterTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsDownChannelCounterEntryEnt docsIfCmtsDownChannelCounterEntry;

                    private DocsIfCmtsDownChannelCounterTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsDownChannelCounterTable", "1.3.6.1.2.1.10.127.1.3.10", false, true, false, false);
                        this.docsIfCmtsDownChannelCounterEntry = new DocsIfCmtsDownChannelCounterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsDownChannelCounterEntry
                        };
                    }
                    public static final class DocsIfCmtsDownChannelCounterEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsDownChnlCtrIdEnt docsIfCmtsDownChnlCtrId;

                        public final DocsIfCmtsDownChnlCtrTotalBytesEnt docsIfCmtsDownChnlCtrTotalBytes;

                        public final DocsIfCmtsDownChnlCtrUsedBytesEnt docsIfCmtsDownChnlCtrUsedBytes;

                        public final DocsIfCmtsDownChnlCtrExtTotalBytesEnt docsIfCmtsDownChnlCtrExtTotalBytes;

                        public final DocsIfCmtsDownChnlCtrExtUsedBytesEnt docsIfCmtsDownChnlCtrExtUsedBytes;

                        private DocsIfCmtsDownChannelCounterEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsDownChannelCounterEntry", "1.3.6.1.2.1.10.127.1.3.10.1", false, false, false, true);
                            this.docsIfCmtsDownChnlCtrId = new DocsIfCmtsDownChnlCtrIdEnt(mib, this);
                            this.docsIfCmtsDownChnlCtrTotalBytes = new DocsIfCmtsDownChnlCtrTotalBytesEnt(mib, this);
                            this.docsIfCmtsDownChnlCtrUsedBytes = new DocsIfCmtsDownChnlCtrUsedBytesEnt(mib, this);
                            this.docsIfCmtsDownChnlCtrExtTotalBytes = new DocsIfCmtsDownChnlCtrExtTotalBytesEnt(mib, this);
                            this.docsIfCmtsDownChnlCtrExtUsedBytes = new DocsIfCmtsDownChnlCtrExtUsedBytesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsDownChnlCtrId,
                                this.docsIfCmtsDownChnlCtrTotalBytes,
                                this.docsIfCmtsDownChnlCtrUsedBytes,
                                this.docsIfCmtsDownChnlCtrExtTotalBytes,
                                this.docsIfCmtsDownChnlCtrExtUsedBytes
                            };
                        }
                        public static final class DocsIfCmtsDownChnlCtrIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsDownChnlCtrIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsDownChnlCtrId", "1.3.6.1.2.1.10.127.1.3.10.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsDownChnlCtrTotalBytesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsDownChnlCtrTotalBytesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsDownChnlCtrTotalBytes", "1.3.6.1.2.1.10.127.1.3.10.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsDownChnlCtrUsedBytesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsDownChnlCtrUsedBytesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsDownChnlCtrUsedBytes", "1.3.6.1.2.1.10.127.1.3.10.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsDownChnlCtrExtTotalBytesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsDownChnlCtrExtTotalBytesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsDownChnlCtrExtTotalBytes", "1.3.6.1.2.1.10.127.1.3.10.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsDownChnlCtrExtUsedBytesEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsDownChnlCtrExtUsedBytesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsDownChnlCtrExtUsedBytes", "1.3.6.1.2.1.10.127.1.3.10.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class DocsIfCmtsUpChannelCounterTableEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    public final DocsIfCmtsUpChannelCounterEntryEnt docsIfCmtsUpChannelCounterEntry;

                    private DocsIfCmtsUpChannelCounterTableEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsUpChannelCounterTable", "1.3.6.1.2.1.10.127.1.3.11", false, true, false, false);
                        this.docsIfCmtsUpChannelCounterEntry = new DocsIfCmtsUpChannelCounterEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsIfCmtsUpChannelCounterEntry
                        };
                    }
                    public static final class DocsIfCmtsUpChannelCounterEntryEnt extends MIBEntry<DOCSIFMIBDef>
                    {
                        public final DocsIfCmtsUpChnlCtrIdEnt docsIfCmtsUpChnlCtrId;

                        public final DocsIfCmtsUpChnlCtrTotalMslotsEnt docsIfCmtsUpChnlCtrTotalMslots;

                        public final DocsIfCmtsUpChnlCtrUcastGrantedMslotsEnt docsIfCmtsUpChnlCtrUcastGrantedMslots;

                        public final DocsIfCmtsUpChnlCtrTotalCntnMslotsEnt docsIfCmtsUpChnlCtrTotalCntnMslots;

                        public final DocsIfCmtsUpChnlCtrUsedCntnMslotsEnt docsIfCmtsUpChnlCtrUsedCntnMslots;

                        public final DocsIfCmtsUpChnlCtrExtTotalMslotsEnt docsIfCmtsUpChnlCtrExtTotalMslots;

                        public final DocsIfCmtsUpChnlCtrExtUcastGrantedMslotsEnt docsIfCmtsUpChnlCtrExtUcastGrantedMslots;

                        public final DocsIfCmtsUpChnlCtrExtTotalCntnMslotsEnt docsIfCmtsUpChnlCtrExtTotalCntnMslots;

                        public final DocsIfCmtsUpChnlCtrExtUsedCntnMslotsEnt docsIfCmtsUpChnlCtrExtUsedCntnMslots;

                        public final DocsIfCmtsUpChnlCtrCollCntnMslotsEnt docsIfCmtsUpChnlCtrCollCntnMslots;

                        public final DocsIfCmtsUpChnlCtrTotalCntnReqMslotsEnt docsIfCmtsUpChnlCtrTotalCntnReqMslots;

                        public final DocsIfCmtsUpChnlCtrUsedCntnReqMslotsEnt docsIfCmtsUpChnlCtrUsedCntnReqMslots;

                        public final DocsIfCmtsUpChnlCtrCollCntnReqMslotsEnt docsIfCmtsUpChnlCtrCollCntnReqMslots;

                        public final DocsIfCmtsUpChnlCtrTotalCntnReqDataMslotsEnt docsIfCmtsUpChnlCtrTotalCntnReqDataMslots;

                        public final DocsIfCmtsUpChnlCtrUsedCntnReqDataMslotsEnt docsIfCmtsUpChnlCtrUsedCntnReqDataMslots;

                        public final DocsIfCmtsUpChnlCtrCollCntnReqDataMslotsEnt docsIfCmtsUpChnlCtrCollCntnReqDataMslots;

                        public final DocsIfCmtsUpChnlCtrTotalCntnInitMaintMslotsEnt docsIfCmtsUpChnlCtrTotalCntnInitMaintMslots;

                        public final DocsIfCmtsUpChnlCtrUsedCntnInitMaintMslotsEnt docsIfCmtsUpChnlCtrUsedCntnInitMaintMslots;

                        public final DocsIfCmtsUpChnlCtrCollCntnInitMaintMslotsEnt docsIfCmtsUpChnlCtrCollCntnInitMaintMslots;

                        public final DocsIfCmtsUpChnlCtrExtCollCntnMslotsEnt docsIfCmtsUpChnlCtrExtCollCntnMslots;

                        public final DocsIfCmtsUpChnlCtrExtTotalCntnReqMslotsEnt docsIfCmtsUpChnlCtrExtTotalCntnReqMslots;

                        public final DocsIfCmtsUpChnlCtrExtUsedCntnReqMslotsEnt docsIfCmtsUpChnlCtrExtUsedCntnReqMslots;

                        public final DocsIfCmtsUpChnlCtrExtCollCntnReqMslotsEnt docsIfCmtsUpChnlCtrExtCollCntnReqMslots;

                        public final DocsIfCmtsUpChnlCtrExtTotalCntnReqDataMslotsEnt docsIfCmtsUpChnlCtrExtTotalCntnReqDataMslots;

                        public final DocsIfCmtsUpChnlCtrExtUsedCntnReqDataMslotsEnt docsIfCmtsUpChnlCtrExtUsedCntnReqDataMslots;

                        public final DocsIfCmtsUpChnlCtrExtCollCntnReqDataMslotsEnt docsIfCmtsUpChnlCtrExtCollCntnReqDataMslots;

                        public final DocsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslotsEnt docsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslots;

                        public final DocsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslotsEnt docsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslots;

                        public final DocsIfCmtsUpChnlCtrExtCollCntnInitMaintMslotsEnt docsIfCmtsUpChnlCtrExtCollCntnInitMaintMslots;

                        private DocsIfCmtsUpChannelCounterEntryEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                        {
                            super(mib, parent, "docsIfCmtsUpChannelCounterEntry", "1.3.6.1.2.1.10.127.1.3.11.1", false, false, false, true);
                            this.docsIfCmtsUpChnlCtrId = new DocsIfCmtsUpChnlCtrIdEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrTotalMslots = new DocsIfCmtsUpChnlCtrTotalMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrUcastGrantedMslots = new DocsIfCmtsUpChnlCtrUcastGrantedMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrTotalCntnMslots = new DocsIfCmtsUpChnlCtrTotalCntnMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrUsedCntnMslots = new DocsIfCmtsUpChnlCtrUsedCntnMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtTotalMslots = new DocsIfCmtsUpChnlCtrExtTotalMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtUcastGrantedMslots = new DocsIfCmtsUpChnlCtrExtUcastGrantedMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtTotalCntnMslots = new DocsIfCmtsUpChnlCtrExtTotalCntnMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtUsedCntnMslots = new DocsIfCmtsUpChnlCtrExtUsedCntnMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrCollCntnMslots = new DocsIfCmtsUpChnlCtrCollCntnMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrTotalCntnReqMslots = new DocsIfCmtsUpChnlCtrTotalCntnReqMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrUsedCntnReqMslots = new DocsIfCmtsUpChnlCtrUsedCntnReqMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrCollCntnReqMslots = new DocsIfCmtsUpChnlCtrCollCntnReqMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrTotalCntnReqDataMslots = new DocsIfCmtsUpChnlCtrTotalCntnReqDataMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrUsedCntnReqDataMslots = new DocsIfCmtsUpChnlCtrUsedCntnReqDataMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrCollCntnReqDataMslots = new DocsIfCmtsUpChnlCtrCollCntnReqDataMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrTotalCntnInitMaintMslots = new DocsIfCmtsUpChnlCtrTotalCntnInitMaintMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrUsedCntnInitMaintMslots = new DocsIfCmtsUpChnlCtrUsedCntnInitMaintMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrCollCntnInitMaintMslots = new DocsIfCmtsUpChnlCtrCollCntnInitMaintMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtCollCntnMslots = new DocsIfCmtsUpChnlCtrExtCollCntnMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtTotalCntnReqMslots = new DocsIfCmtsUpChnlCtrExtTotalCntnReqMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtUsedCntnReqMslots = new DocsIfCmtsUpChnlCtrExtUsedCntnReqMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtCollCntnReqMslots = new DocsIfCmtsUpChnlCtrExtCollCntnReqMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtTotalCntnReqDataMslots = new DocsIfCmtsUpChnlCtrExtTotalCntnReqDataMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtUsedCntnReqDataMslots = new DocsIfCmtsUpChnlCtrExtUsedCntnReqDataMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtCollCntnReqDataMslots = new DocsIfCmtsUpChnlCtrExtCollCntnReqDataMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslots = new DocsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslots = new DocsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslotsEnt(mib, this);
                            this.docsIfCmtsUpChnlCtrExtCollCntnInitMaintMslots = new DocsIfCmtsUpChnlCtrExtCollCntnInitMaintMslotsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.docsIfCmtsUpChnlCtrId,
                                this.docsIfCmtsUpChnlCtrTotalMslots,
                                this.docsIfCmtsUpChnlCtrUcastGrantedMslots,
                                this.docsIfCmtsUpChnlCtrTotalCntnMslots,
                                this.docsIfCmtsUpChnlCtrUsedCntnMslots,
                                this.docsIfCmtsUpChnlCtrExtTotalMslots,
                                this.docsIfCmtsUpChnlCtrExtUcastGrantedMslots,
                                this.docsIfCmtsUpChnlCtrExtTotalCntnMslots,
                                this.docsIfCmtsUpChnlCtrExtUsedCntnMslots,
                                this.docsIfCmtsUpChnlCtrCollCntnMslots,
                                this.docsIfCmtsUpChnlCtrTotalCntnReqMslots,
                                this.docsIfCmtsUpChnlCtrUsedCntnReqMslots,
                                this.docsIfCmtsUpChnlCtrCollCntnReqMslots,
                                this.docsIfCmtsUpChnlCtrTotalCntnReqDataMslots,
                                this.docsIfCmtsUpChnlCtrUsedCntnReqDataMslots,
                                this.docsIfCmtsUpChnlCtrCollCntnReqDataMslots,
                                this.docsIfCmtsUpChnlCtrTotalCntnInitMaintMslots,
                                this.docsIfCmtsUpChnlCtrUsedCntnInitMaintMslots,
                                this.docsIfCmtsUpChnlCtrCollCntnInitMaintMslots,
                                this.docsIfCmtsUpChnlCtrExtCollCntnMslots,
                                this.docsIfCmtsUpChnlCtrExtTotalCntnReqMslots,
                                this.docsIfCmtsUpChnlCtrExtUsedCntnReqMslots,
                                this.docsIfCmtsUpChnlCtrExtCollCntnReqMslots,
                                this.docsIfCmtsUpChnlCtrExtTotalCntnReqDataMslots,
                                this.docsIfCmtsUpChnlCtrExtUsedCntnReqDataMslots,
                                this.docsIfCmtsUpChnlCtrExtCollCntnReqDataMslots,
                                this.docsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslots,
                                this.docsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslots,
                                this.docsIfCmtsUpChnlCtrExtCollCntnInitMaintMslots
                            };
                        }
                        public static final class DocsIfCmtsUpChnlCtrIdEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrIdEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrId", "1.3.6.1.2.1.10.127.1.3.11.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrTotalMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrTotalMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrTotalMslots", "1.3.6.1.2.1.10.127.1.3.11.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrUcastGrantedMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrUcastGrantedMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrUcastGrantedMslots", "1.3.6.1.2.1.10.127.1.3.11.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrTotalCntnMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrTotalCntnMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrTotalCntnMslots", "1.3.6.1.2.1.10.127.1.3.11.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrUsedCntnMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrUsedCntnMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrUsedCntnMslots", "1.3.6.1.2.1.10.127.1.3.11.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtTotalMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtTotalMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtTotalMslots", "1.3.6.1.2.1.10.127.1.3.11.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtUcastGrantedMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtUcastGrantedMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtUcastGrantedMslots", "1.3.6.1.2.1.10.127.1.3.11.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtTotalCntnMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtTotalCntnMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtTotalCntnMslots", "1.3.6.1.2.1.10.127.1.3.11.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtUsedCntnMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtUsedCntnMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtUsedCntnMslots", "1.3.6.1.2.1.10.127.1.3.11.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrCollCntnMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrCollCntnMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrCollCntnMslots", "1.3.6.1.2.1.10.127.1.3.11.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrTotalCntnReqMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrTotalCntnReqMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrTotalCntnReqMslots", "1.3.6.1.2.1.10.127.1.3.11.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrUsedCntnReqMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrUsedCntnReqMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrUsedCntnReqMslots", "1.3.6.1.2.1.10.127.1.3.11.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrCollCntnReqMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrCollCntnReqMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrCollCntnReqMslots", "1.3.6.1.2.1.10.127.1.3.11.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrTotalCntnReqDataMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrTotalCntnReqDataMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrTotalCntnReqDataMslots", "1.3.6.1.2.1.10.127.1.3.11.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrUsedCntnReqDataMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrUsedCntnReqDataMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrUsedCntnReqDataMslots", "1.3.6.1.2.1.10.127.1.3.11.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrCollCntnReqDataMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrCollCntnReqDataMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrCollCntnReqDataMslots", "1.3.6.1.2.1.10.127.1.3.11.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrTotalCntnInitMaintMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrTotalCntnInitMaintMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrTotalCntnInitMaintMslots", "1.3.6.1.2.1.10.127.1.3.11.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrUsedCntnInitMaintMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrUsedCntnInitMaintMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrUsedCntnInitMaintMslots", "1.3.6.1.2.1.10.127.1.3.11.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrCollCntnInitMaintMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrCollCntnInitMaintMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrCollCntnInitMaintMslots", "1.3.6.1.2.1.10.127.1.3.11.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtCollCntnMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtCollCntnMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtCollCntnMslots", "1.3.6.1.2.1.10.127.1.3.11.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtTotalCntnReqMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtTotalCntnReqMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtTotalCntnReqMslots", "1.3.6.1.2.1.10.127.1.3.11.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtUsedCntnReqMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtUsedCntnReqMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtUsedCntnReqMslots", "1.3.6.1.2.1.10.127.1.3.11.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtCollCntnReqMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtCollCntnReqMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtCollCntnReqMslots", "1.3.6.1.2.1.10.127.1.3.11.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtTotalCntnReqDataMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtTotalCntnReqDataMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtTotalCntnReqDataMslots", "1.3.6.1.2.1.10.127.1.3.11.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtUsedCntnReqDataMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtUsedCntnReqDataMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtUsedCntnReqDataMslots", "1.3.6.1.2.1.10.127.1.3.11.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtCollCntnReqDataMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtCollCntnReqDataMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtCollCntnReqDataMslots", "1.3.6.1.2.1.10.127.1.3.11.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtTotalCntnInitMaintMslots", "1.3.6.1.2.1.10.127.1.3.11.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtUsedCntnInitMaintMslots", "1.3.6.1.2.1.10.127.1.3.11.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class DocsIfCmtsUpChnlCtrExtCollCntnInitMaintMslotsEnt extends MIBEntry<DOCSIFMIBDef>
                        {
                            private DocsIfCmtsUpChnlCtrExtCollCntnInitMaintMslotsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                            {
                                super(mib, parent, "docsIfCmtsUpChnlCtrExtCollCntnInitMaintMslots", "1.3.6.1.2.1.10.127.1.3.11.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class DocsIfNotificationEnt extends MIBEntry<DOCSIFMIBDef>
        {
            private DocsIfNotificationEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
            {
                super(mib, parent, "docsIfNotification", "1.3.6.1.2.1.10.127.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsIfConformanceEnt extends MIBEntry<DOCSIFMIBDef>
        {
            public final DocsIfCompliancesEnt docsIfCompliances;

            public final DocsIfGroupsEnt docsIfGroups;

            private DocsIfConformanceEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
            {
                super(mib, parent, "docsIfConformance", "1.3.6.1.2.1.10.127.3", false, false, false, false);
                this.docsIfCompliances = new DocsIfCompliancesEnt(mib, this);
                this.docsIfGroups = new DocsIfGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsIfCompliances,
                    this.docsIfGroups
                };
            }
            public static final class DocsIfCompliancesEnt extends MIBEntry<DOCSIFMIBDef>
            {
                public final DocsIfBasicComplianceEnt docsIfBasicCompliance;

                public final DocsIfBasicComplianceV2Ent docsIfBasicComplianceV2;

                private DocsIfCompliancesEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                {
                    super(mib, parent, "docsIfCompliances", "1.3.6.1.2.1.10.127.3.1", false, false, false, false);
                    this.docsIfBasicCompliance = new DocsIfBasicComplianceEnt(mib, this);
                    this.docsIfBasicComplianceV2 = new DocsIfBasicComplianceV2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIfBasicCompliance,
                        this.docsIfBasicComplianceV2
                    };
                }
                public static final class DocsIfBasicComplianceEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfBasicComplianceEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfBasicCompliance", "1.3.6.1.2.1.10.127.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfBasicComplianceV2Ent extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfBasicComplianceV2Ent(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfBasicComplianceV2", "1.3.6.1.2.1.10.127.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsIfGroupsEnt extends MIBEntry<DOCSIFMIBDef>
            {
                public final DocsIfBasicGroupEnt docsIfBasicGroup;

                public final DocsIfCmGroupEnt docsIfCmGroup;

                public final DocsIfCmtsGroupEnt docsIfCmtsGroup;

                /** obsolete groupRFC 2670 already had a obsolete group, even though RFC2670was the first version of this MIB Module.*/
                public final DocsIfObsoleteGroupEnt docsIfObsoleteGroup;

                public final DocsIfBasicGroupV2Ent docsIfBasicGroupV2;

                public final DocsIfCmGroupV2Ent docsIfCmGroupV2;

                public final DocsIfCmtsGroupV2Ent docsIfCmtsGroupV2;

                private DocsIfGroupsEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                {
                    super(mib, parent, "docsIfGroups", "1.3.6.1.2.1.10.127.3.2", false, false, false, false);
                    this.docsIfBasicGroup = new DocsIfBasicGroupEnt(mib, this);
                    this.docsIfCmGroup = new DocsIfCmGroupEnt(mib, this);
                    this.docsIfCmtsGroup = new DocsIfCmtsGroupEnt(mib, this);
                    this.docsIfObsoleteGroup = new DocsIfObsoleteGroupEnt(mib, this);
                    this.docsIfBasicGroupV2 = new DocsIfBasicGroupV2Ent(mib, this);
                    this.docsIfCmGroupV2 = new DocsIfCmGroupV2Ent(mib, this);
                    this.docsIfCmtsGroupV2 = new DocsIfCmtsGroupV2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsIfBasicGroup,
                        this.docsIfCmGroup,
                        this.docsIfCmtsGroup,
                        this.docsIfObsoleteGroup,
                        this.docsIfBasicGroupV2,
                        this.docsIfCmGroupV2,
                        this.docsIfCmtsGroupV2
                    };
                }
                public static final class DocsIfBasicGroupEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfBasicGroupEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfBasicGroup", "1.3.6.1.2.1.10.127.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfCmGroupEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfCmGroupEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmGroup", "1.3.6.1.2.1.10.127.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfCmtsGroupEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfCmtsGroupEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsGroup", "1.3.6.1.2.1.10.127.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfObsoleteGroupEnt extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfObsoleteGroupEnt(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfObsoleteGroup", "1.3.6.1.2.1.10.127.3.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfBasicGroupV2Ent extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfBasicGroupV2Ent(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfBasicGroupV2", "1.3.6.1.2.1.10.127.3.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfCmGroupV2Ent extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfCmGroupV2Ent(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmGroupV2", "1.3.6.1.2.1.10.127.3.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsIfCmtsGroupV2Ent extends MIBEntry<DOCSIFMIBDef>
                {
                    private DocsIfCmtsGroupV2Ent(DOCSIFMIBDef mib, MIBEntry<DOCSIFMIBDef> parent)
                    {
                        super(mib, parent, "docsIfCmtsGroupV2", "1.3.6.1.2.1.10.127.3.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
