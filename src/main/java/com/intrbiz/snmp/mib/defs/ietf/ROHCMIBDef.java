package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC3411]*/
public final class ROHCMIBDef extends MIB
{
    public static final ROHCMIBDef ROHCMIB = new ROHCMIBDef();

    static { MIBs.getInstance().registerMIB(ROHCMIBDef.ROHCMIB); }

    /** [RFC2863]

June 3, 2004*/
    public final RohcMIBEnt rohcMIB;

    private ROHCMIBDef()
    {
        super("ROHC-MIB");
        this.rohcMIB = new RohcMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rohcMIB
        };
    }

    public static final class RohcMIBEnt extends MIBEntry<ROHCMIBDef>
    {
        /** The groups defined within this MIB module:*/
        public final RohcObjectsEnt rohcObjects;

        public final RohcConformanceEnt rohcConformance;

        private RohcMIBEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
        {
            super(mib, parent, "rohcMIB", "1.3.6.1.2.1.112", false, false, false, false);
            this.rohcObjects = new RohcObjectsEnt(mib, this);
            this.rohcConformance = new RohcConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rohcObjects,
                this.rohcConformance
            };
        }
        public static final class RohcObjectsEnt extends MIBEntry<ROHCMIBDef>
        {
            /** The ROHC Instance group lists properties of ROHCinstances in the rohcInstanceTable, about the channels usedby the instances in the rohcChanneltable and about the profilesavailable at the instances in the rohcProfileTable.*/
            public final RohcInstanceObjectsEnt rohcInstanceObjects;

            /** Context Table*/
            public final RohcContextTableEnt rohcContextTable;

            private RohcObjectsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
            {
                super(mib, parent, "rohcObjects", "1.3.6.1.2.1.112.1", false, false, false, false);
                this.rohcInstanceObjects = new RohcInstanceObjectsEnt(mib, this);
                this.rohcContextTable = new RohcContextTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rohcInstanceObjects,
                    this.rohcContextTable
                };
            }
            public static final class RohcInstanceObjectsEnt extends MIBEntry<ROHCMIBDef>
            {
                /** Channel TableListing all channels used for ROHC data channeland/or as feedback channel.*/
                public final RohcChannelTableEnt rohcChannelTable;

                /** Instances of ROHCThis table lists properties of running instances of ROHCcompressors and decompressors at the managed node.*/
                public final RohcInstanceTableEnt rohcInstanceTable;

                /** Profile Table*/
                public final RohcProfileTableEnt rohcProfileTable;

                private RohcInstanceObjectsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                {
                    super(mib, parent, "rohcInstanceObjects", "1.3.6.1.2.1.112.1.1", false, false, false, false);
                    this.rohcChannelTable = new RohcChannelTableEnt(mib, this);
                    this.rohcInstanceTable = new RohcInstanceTableEnt(mib, this);
                    this.rohcProfileTable = new RohcProfileTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcChannelTable,
                        this.rohcInstanceTable,
                        this.rohcProfileTable
                    };
                }
                public static final class RohcChannelTableEnt extends MIBEntry<ROHCMIBDef>
                {
                    public final RohcChannelEntryEnt rohcChannelEntry;

                    private RohcChannelTableEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcChannelTable", "1.3.6.1.2.1.112.1.1.1", false, true, false, false);
                        this.rohcChannelEntry = new RohcChannelEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcChannelEntry
                        };
                    }
                    public static final class RohcChannelEntryEnt extends MIBEntry<ROHCMIBDef>
                    {
                        public final RohcChannelIDEnt rohcChannelID;

                        public final RohcChannelTypeEnt rohcChannelType;

                        public final RohcChannelFeedbackForEnt rohcChannelFeedbackFor;

                        public final RohcChannelDescrEnt rohcChannelDescr;

                        public final RohcChannelStatusEnt rohcChannelStatus;

                        private RohcChannelEntryEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcChannelEntry", "1.3.6.1.2.1.112.1.1.1.1", false, false, false, true);
                            this.rohcChannelID = new RohcChannelIDEnt(mib, this);
                            this.rohcChannelType = new RohcChannelTypeEnt(mib, this);
                            this.rohcChannelFeedbackFor = new RohcChannelFeedbackForEnt(mib, this);
                            this.rohcChannelDescr = new RohcChannelDescrEnt(mib, this);
                            this.rohcChannelStatus = new RohcChannelStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rohcChannelID,
                                this.rohcChannelType,
                                this.rohcChannelFeedbackFor,
                                this.rohcChannelDescr,
                                this.rohcChannelStatus
                            };
                        }
                        public static final class RohcChannelIDEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcChannelIDEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcChannelID", "1.3.6.1.2.1.112.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcChannelTypeEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcChannelTypeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcChannelType", "1.3.6.1.2.1.112.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcChannelFeedbackForEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcChannelFeedbackForEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcChannelFeedbackFor", "1.3.6.1.2.1.112.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcChannelDescrEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcChannelDescrEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcChannelDescr", "1.3.6.1.2.1.112.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcChannelStatusEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcChannelStatusEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcChannelStatus", "1.3.6.1.2.1.112.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RohcInstanceTableEnt extends MIBEntry<ROHCMIBDef>
                {
                    public final RohcInstanceEntryEnt rohcInstanceEntry;

                    private RohcInstanceTableEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcInstanceTable", "1.3.6.1.2.1.112.1.1.2", false, true, false, false);
                        this.rohcInstanceEntry = new RohcInstanceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcInstanceEntry
                        };
                    }
                    public static final class RohcInstanceEntryEnt extends MIBEntry<ROHCMIBDef>
                    {
                        public final RohcInstanceTypeEnt rohcInstanceType;

                        public final RohcInstanceFBChannelIDEnt rohcInstanceFBChannelID;

                        public final RohcInstanceVendorEnt rohcInstanceVendor;

                        public final RohcInstanceVersionEnt rohcInstanceVersion;

                        public final RohcInstanceDescrEnt rohcInstanceDescr;

                        public final RohcInstanceClockResEnt rohcInstanceClockRes;

                        public final RohcInstanceMaxCIDEnt rohcInstanceMaxCID;

                        public final RohcInstanceLargeCIDsEnt rohcInstanceLargeCIDs;

                        public final RohcInstanceMRRUEnt rohcInstanceMRRU;

                        public final RohcInstanceContextStorageTimeEnt rohcInstanceContextStorageTime;

                        public final RohcInstanceStatusEnt rohcInstanceStatus;

                        public final RohcInstanceContextsTotalEnt rohcInstanceContextsTotal;

                        public final RohcInstanceContextsCurrentEnt rohcInstanceContextsCurrent;

                        public final RohcInstancePacketsEnt rohcInstancePackets;

                        public final RohcInstanceIRsEnt rohcInstanceIRs;

                        public final RohcInstanceIRDYNsEnt rohcInstanceIRDYNs;

                        public final RohcInstanceFeedbacksEnt rohcInstanceFeedbacks;

                        public final RohcInstanceCompressionRatioEnt rohcInstanceCompressionRatio;

                        private RohcInstanceEntryEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcInstanceEntry", "1.3.6.1.2.1.112.1.1.2.1", false, false, false, true);
                            this.rohcInstanceType = new RohcInstanceTypeEnt(mib, this);
                            this.rohcInstanceFBChannelID = new RohcInstanceFBChannelIDEnt(mib, this);
                            this.rohcInstanceVendor = new RohcInstanceVendorEnt(mib, this);
                            this.rohcInstanceVersion = new RohcInstanceVersionEnt(mib, this);
                            this.rohcInstanceDescr = new RohcInstanceDescrEnt(mib, this);
                            this.rohcInstanceClockRes = new RohcInstanceClockResEnt(mib, this);
                            this.rohcInstanceMaxCID = new RohcInstanceMaxCIDEnt(mib, this);
                            this.rohcInstanceLargeCIDs = new RohcInstanceLargeCIDsEnt(mib, this);
                            this.rohcInstanceMRRU = new RohcInstanceMRRUEnt(mib, this);
                            this.rohcInstanceContextStorageTime = new RohcInstanceContextStorageTimeEnt(mib, this);
                            this.rohcInstanceStatus = new RohcInstanceStatusEnt(mib, this);
                            this.rohcInstanceContextsTotal = new RohcInstanceContextsTotalEnt(mib, this);
                            this.rohcInstanceContextsCurrent = new RohcInstanceContextsCurrentEnt(mib, this);
                            this.rohcInstancePackets = new RohcInstancePacketsEnt(mib, this);
                            this.rohcInstanceIRs = new RohcInstanceIRsEnt(mib, this);
                            this.rohcInstanceIRDYNs = new RohcInstanceIRDYNsEnt(mib, this);
                            this.rohcInstanceFeedbacks = new RohcInstanceFeedbacksEnt(mib, this);
                            this.rohcInstanceCompressionRatio = new RohcInstanceCompressionRatioEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rohcInstanceType,
                                this.rohcInstanceFBChannelID,
                                this.rohcInstanceVendor,
                                this.rohcInstanceVersion,
                                this.rohcInstanceDescr,
                                this.rohcInstanceClockRes,
                                this.rohcInstanceMaxCID,
                                this.rohcInstanceLargeCIDs,
                                this.rohcInstanceMRRU,
                                this.rohcInstanceContextStorageTime,
                                this.rohcInstanceStatus,
                                this.rohcInstanceContextsTotal,
                                this.rohcInstanceContextsCurrent,
                                this.rohcInstancePackets,
                                this.rohcInstanceIRs,
                                this.rohcInstanceIRDYNs,
                                this.rohcInstanceFeedbacks,
                                this.rohcInstanceCompressionRatio
                            };
                        }
                        public static final class RohcInstanceTypeEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceTypeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceType", "1.3.6.1.2.1.112.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceFBChannelIDEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceFBChannelIDEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceFBChannelID", "1.3.6.1.2.1.112.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceVendorEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceVendorEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceVendor", "1.3.6.1.2.1.112.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceVersionEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceVersionEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceVersion", "1.3.6.1.2.1.112.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceDescrEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceDescrEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceDescr", "1.3.6.1.2.1.112.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceClockResEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceClockResEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceClockRes", "1.3.6.1.2.1.112.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceMaxCIDEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceMaxCIDEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceMaxCID", "1.3.6.1.2.1.112.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceLargeCIDsEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceLargeCIDsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceLargeCIDs", "1.3.6.1.2.1.112.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceMRRUEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceMRRUEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceMRRU", "1.3.6.1.2.1.112.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceContextStorageTimeEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceContextStorageTimeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceContextStorageTime", "1.3.6.1.2.1.112.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceStatusEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceStatusEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceStatus", "1.3.6.1.2.1.112.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceContextsTotalEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceContextsTotalEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceContextsTotal", "1.3.6.1.2.1.112.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceContextsCurrentEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceContextsCurrentEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceContextsCurrent", "1.3.6.1.2.1.112.1.1.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstancePacketsEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstancePacketsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstancePackets", "1.3.6.1.2.1.112.1.1.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceIRsEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceIRsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceIRs", "1.3.6.1.2.1.112.1.1.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceIRDYNsEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceIRDYNsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceIRDYNs", "1.3.6.1.2.1.112.1.1.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceFeedbacksEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceFeedbacksEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceFeedbacks", "1.3.6.1.2.1.112.1.1.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcInstanceCompressionRatioEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcInstanceCompressionRatioEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcInstanceCompressionRatio", "1.3.6.1.2.1.112.1.1.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RohcProfileTableEnt extends MIBEntry<ROHCMIBDef>
                {
                    public final RohcProfileEntryEnt rohcProfileEntry;

                    private RohcProfileTableEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcProfileTable", "1.3.6.1.2.1.112.1.1.3", false, true, false, false);
                        this.rohcProfileEntry = new RohcProfileEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcProfileEntry
                        };
                    }
                    public static final class RohcProfileEntryEnt extends MIBEntry<ROHCMIBDef>
                    {
                        public final RohcProfileEnt rohcProfile;

                        public final RohcProfileVendorEnt rohcProfileVendor;

                        public final RohcProfileVersionEnt rohcProfileVersion;

                        public final RohcProfileDescrEnt rohcProfileDescr;

                        public final RohcProfileNegotiatedEnt rohcProfileNegotiated;

                        private RohcProfileEntryEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcProfileEntry", "1.3.6.1.2.1.112.1.1.3.1", false, false, false, true);
                            this.rohcProfile = new RohcProfileEnt(mib, this);
                            this.rohcProfileVendor = new RohcProfileVendorEnt(mib, this);
                            this.rohcProfileVersion = new RohcProfileVersionEnt(mib, this);
                            this.rohcProfileDescr = new RohcProfileDescrEnt(mib, this);
                            this.rohcProfileNegotiated = new RohcProfileNegotiatedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rohcProfile,
                                this.rohcProfileVendor,
                                this.rohcProfileVersion,
                                this.rohcProfileDescr,
                                this.rohcProfileNegotiated
                            };
                        }
                        public static final class RohcProfileEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcProfileEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcProfile", "1.3.6.1.2.1.112.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcProfileVendorEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcProfileVendorEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcProfileVendor", "1.3.6.1.2.1.112.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcProfileVersionEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcProfileVersionEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcProfileVersion", "1.3.6.1.2.1.112.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcProfileDescrEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcProfileDescrEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcProfileDescr", "1.3.6.1.2.1.112.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RohcProfileNegotiatedEnt extends MIBEntry<ROHCMIBDef>
                        {
                            private RohcProfileNegotiatedEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                            {
                                super(mib, parent, "rohcProfileNegotiated", "1.3.6.1.2.1.112.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RohcContextTableEnt extends MIBEntry<ROHCMIBDef>
            {
                public final RohcContextEntryEnt rohcContextEntry;

                private RohcContextTableEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                {
                    super(mib, parent, "rohcContextTable", "1.3.6.1.2.1.112.1.2", false, true, false, false);
                    this.rohcContextEntry = new RohcContextEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcContextEntry
                    };
                }
                public static final class RohcContextEntryEnt extends MIBEntry<ROHCMIBDef>
                {
                    public final RohcContextCIDEnt rohcContextCID;

                    public final RohcContextCIDStateEnt rohcContextCIDState;

                    public final RohcContextProfileEnt rohcContextProfile;

                    public final RohcContextDecompressorDepthEnt rohcContextDecompressorDepth;

                    public final RohcContextStorageTimeEnt rohcContextStorageTime;

                    public final RohcContextActivationTimeEnt rohcContextActivationTime;

                    public final RohcContextDeactivationTimeEnt rohcContextDeactivationTime;

                    public final RohcContextPacketsEnt rohcContextPackets;

                    public final RohcContextIRsEnt rohcContextIRs;

                    public final RohcContextIRDYNsEnt rohcContextIRDYNs;

                    public final RohcContextFeedbacksEnt rohcContextFeedbacks;

                    public final RohcContextDecompressorFailuresEnt rohcContextDecompressorFailures;

                    public final RohcContextDecompressorRepairsEnt rohcContextDecompressorRepairs;

                    public final RohcContextAllPacketsRatioEnt rohcContextAllPacketsRatio;

                    public final RohcContextAllHeadersRatioEnt rohcContextAllHeadersRatio;

                    public final RohcContextAllPacketsMeanSizeEnt rohcContextAllPacketsMeanSize;

                    public final RohcContextAllHeadersMeanSizeEnt rohcContextAllHeadersMeanSize;

                    public final RohcContextLastPacketsRatioEnt rohcContextLastPacketsRatio;

                    public final RohcContextLastHeadersRatioEnt rohcContextLastHeadersRatio;

                    public final RohcContextLastPacketsMeanSizeEnt rohcContextLastPacketsMeanSize;

                    public final RohcContextLastHeadersMeanSizeEnt rohcContextLastHeadersMeanSize;

                    private RohcContextEntryEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcContextEntry", "1.3.6.1.2.1.112.1.2.1", false, false, false, true);
                        this.rohcContextCID = new RohcContextCIDEnt(mib, this);
                        this.rohcContextCIDState = new RohcContextCIDStateEnt(mib, this);
                        this.rohcContextProfile = new RohcContextProfileEnt(mib, this);
                        this.rohcContextDecompressorDepth = new RohcContextDecompressorDepthEnt(mib, this);
                        this.rohcContextStorageTime = new RohcContextStorageTimeEnt(mib, this);
                        this.rohcContextActivationTime = new RohcContextActivationTimeEnt(mib, this);
                        this.rohcContextDeactivationTime = new RohcContextDeactivationTimeEnt(mib, this);
                        this.rohcContextPackets = new RohcContextPacketsEnt(mib, this);
                        this.rohcContextIRs = new RohcContextIRsEnt(mib, this);
                        this.rohcContextIRDYNs = new RohcContextIRDYNsEnt(mib, this);
                        this.rohcContextFeedbacks = new RohcContextFeedbacksEnt(mib, this);
                        this.rohcContextDecompressorFailures = new RohcContextDecompressorFailuresEnt(mib, this);
                        this.rohcContextDecompressorRepairs = new RohcContextDecompressorRepairsEnt(mib, this);
                        this.rohcContextAllPacketsRatio = new RohcContextAllPacketsRatioEnt(mib, this);
                        this.rohcContextAllHeadersRatio = new RohcContextAllHeadersRatioEnt(mib, this);
                        this.rohcContextAllPacketsMeanSize = new RohcContextAllPacketsMeanSizeEnt(mib, this);
                        this.rohcContextAllHeadersMeanSize = new RohcContextAllHeadersMeanSizeEnt(mib, this);
                        this.rohcContextLastPacketsRatio = new RohcContextLastPacketsRatioEnt(mib, this);
                        this.rohcContextLastHeadersRatio = new RohcContextLastHeadersRatioEnt(mib, this);
                        this.rohcContextLastPacketsMeanSize = new RohcContextLastPacketsMeanSizeEnt(mib, this);
                        this.rohcContextLastHeadersMeanSize = new RohcContextLastHeadersMeanSizeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rohcContextCID,
                            this.rohcContextCIDState,
                            this.rohcContextProfile,
                            this.rohcContextDecompressorDepth,
                            this.rohcContextStorageTime,
                            this.rohcContextActivationTime,
                            this.rohcContextDeactivationTime,
                            this.rohcContextPackets,
                            this.rohcContextIRs,
                            this.rohcContextIRDYNs,
                            this.rohcContextFeedbacks,
                            this.rohcContextDecompressorFailures,
                            this.rohcContextDecompressorRepairs,
                            this.rohcContextAllPacketsRatio,
                            this.rohcContextAllHeadersRatio,
                            this.rohcContextAllPacketsMeanSize,
                            this.rohcContextAllHeadersMeanSize,
                            this.rohcContextLastPacketsRatio,
                            this.rohcContextLastHeadersRatio,
                            this.rohcContextLastPacketsMeanSize,
                            this.rohcContextLastHeadersMeanSize
                        };
                    }
                    public static final class RohcContextCIDEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextCIDEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextCID", "1.3.6.1.2.1.112.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextCIDStateEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextCIDStateEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextCIDState", "1.3.6.1.2.1.112.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextProfileEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextProfileEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextProfile", "1.3.6.1.2.1.112.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextDecompressorDepthEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextDecompressorDepthEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextDecompressorDepth", "1.3.6.1.2.1.112.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextStorageTimeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextStorageTimeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextStorageTime", "1.3.6.1.2.1.112.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextActivationTimeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextActivationTimeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextActivationTime", "1.3.6.1.2.1.112.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextDeactivationTimeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextDeactivationTimeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextDeactivationTime", "1.3.6.1.2.1.112.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextPacketsEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextPacketsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextPackets", "1.3.6.1.2.1.112.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextIRsEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextIRsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextIRs", "1.3.6.1.2.1.112.1.2.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextIRDYNsEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextIRDYNsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextIRDYNs", "1.3.6.1.2.1.112.1.2.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextFeedbacksEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextFeedbacksEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextFeedbacks", "1.3.6.1.2.1.112.1.2.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextDecompressorFailuresEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextDecompressorFailuresEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextDecompressorFailures", "1.3.6.1.2.1.112.1.2.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextDecompressorRepairsEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextDecompressorRepairsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextDecompressorRepairs", "1.3.6.1.2.1.112.1.2.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextAllPacketsRatioEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextAllPacketsRatioEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextAllPacketsRatio", "1.3.6.1.2.1.112.1.2.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextAllHeadersRatioEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextAllHeadersRatioEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextAllHeadersRatio", "1.3.6.1.2.1.112.1.2.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextAllPacketsMeanSizeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextAllPacketsMeanSizeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextAllPacketsMeanSize", "1.3.6.1.2.1.112.1.2.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextAllHeadersMeanSizeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextAllHeadersMeanSizeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextAllHeadersMeanSize", "1.3.6.1.2.1.112.1.2.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextLastPacketsRatioEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextLastPacketsRatioEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextLastPacketsRatio", "1.3.6.1.2.1.112.1.2.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextLastHeadersRatioEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextLastHeadersRatioEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextLastHeadersRatio", "1.3.6.1.2.1.112.1.2.1.20", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextLastPacketsMeanSizeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextLastPacketsMeanSizeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextLastPacketsMeanSize", "1.3.6.1.2.1.112.1.2.1.21", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RohcContextLastHeadersMeanSizeEnt extends MIBEntry<ROHCMIBDef>
                    {
                        private RohcContextLastHeadersMeanSizeEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                        {
                            super(mib, parent, "rohcContextLastHeadersMeanSize", "1.3.6.1.2.1.112.1.2.1.22", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class RohcConformanceEnt extends MIBEntry<ROHCMIBDef>
        {
            /** conformance information*/
            public final RohcCompliancesEnt rohcCompliances;

            public final RohcGroupsEnt rohcGroups;

            private RohcConformanceEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
            {
                super(mib, parent, "rohcConformance", "1.3.6.1.2.1.112.2", false, false, false, false);
                this.rohcCompliances = new RohcCompliancesEnt(mib, this);
                this.rohcGroups = new RohcGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rohcCompliances,
                    this.rohcGroups
                };
            }
            public static final class RohcCompliancesEnt extends MIBEntry<ROHCMIBDef>
            {
                /** compliance statements*/
                public final RohcComplianceEnt rohcCompliance;

                private RohcCompliancesEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                {
                    super(mib, parent, "rohcCompliances", "1.3.6.1.2.1.112.2.1", false, false, false, false);
                    this.rohcCompliance = new RohcComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcCompliance
                    };
                }
                public static final class RohcComplianceEnt extends MIBEntry<ROHCMIBDef>
                {
                    private RohcComplianceEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcCompliance", "1.3.6.1.2.1.112.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RohcGroupsEnt extends MIBEntry<ROHCMIBDef>
            {
                public final RohcInstanceGroupEnt rohcInstanceGroup;

                public final RohcStatisticsGroupEnt rohcStatisticsGroup;

                public final RohcContextGroupEnt rohcContextGroup;

                public final RohcTimerGroupEnt rohcTimerGroup;

                public final RohcContextStatisticsGroupEnt rohcContextStatisticsGroup;

                private RohcGroupsEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                {
                    super(mib, parent, "rohcGroups", "1.3.6.1.2.1.112.2.2", false, false, false, false);
                    this.rohcInstanceGroup = new RohcInstanceGroupEnt(mib, this);
                    this.rohcStatisticsGroup = new RohcStatisticsGroupEnt(mib, this);
                    this.rohcContextGroup = new RohcContextGroupEnt(mib, this);
                    this.rohcTimerGroup = new RohcTimerGroupEnt(mib, this);
                    this.rohcContextStatisticsGroup = new RohcContextStatisticsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rohcInstanceGroup,
                        this.rohcStatisticsGroup,
                        this.rohcContextGroup,
                        this.rohcTimerGroup,
                        this.rohcContextStatisticsGroup
                    };
                }
                public static final class RohcInstanceGroupEnt extends MIBEntry<ROHCMIBDef>
                {
                    private RohcInstanceGroupEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcInstanceGroup", "1.3.6.1.2.1.112.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcStatisticsGroupEnt extends MIBEntry<ROHCMIBDef>
                {
                    private RohcStatisticsGroupEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcStatisticsGroup", "1.3.6.1.2.1.112.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcContextGroupEnt extends MIBEntry<ROHCMIBDef>
                {
                    private RohcContextGroupEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcContextGroup", "1.3.6.1.2.1.112.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcTimerGroupEnt extends MIBEntry<ROHCMIBDef>
                {
                    private RohcTimerGroupEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcTimerGroup", "1.3.6.1.2.1.112.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RohcContextStatisticsGroupEnt extends MIBEntry<ROHCMIBDef>
                {
                    private RohcContextStatisticsGroupEnt(ROHCMIBDef mib, MIBEntry<ROHCMIBDef> parent)
                    {
                        super(mib, parent, "rohcContextStatisticsGroup", "1.3.6.1.2.1.112.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
