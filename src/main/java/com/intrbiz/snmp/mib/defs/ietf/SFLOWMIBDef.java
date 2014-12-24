package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SFLOWMIBDef extends MIB
{
    public static final SFLOWMIBDef SFLOWMIB = new SFLOWMIBDef();

    /** May 15, 2001*/
    public final SFlowMIBEnt sFlowMIB;

    private SFLOWMIBDef()
    {
        super("SFLOW-MIB");
        this.sFlowMIB = new SFlowMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sFlowMIB
        };
    }

    public static final class SFlowMIBEnt extends MIBEntry<SFLOWMIBDef>
    {
        public final SFlowAgentEnt sFlowAgent;

        /** Compliance Statements*/
        public final SFlowMIBConformanceEnt sFlowMIBConformance;

        private SFlowMIBEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
        {
            super(mib, parent, "sFlowMIB", "1.3.6.1.4.1.4300.1", false, false, false, false);
            this.sFlowAgent = new SFlowAgentEnt(mib, this);
            this.sFlowMIBConformance = new SFlowMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sFlowAgent,
                this.sFlowMIBConformance
            };
        }
        public static final class SFlowAgentEnt extends MIBEntry<SFLOWMIBDef>
        {
            public final SFlowVersionEnt sFlowVersion;

            public final SFlowAgentAddressTypeEnt sFlowAgentAddressType;

            public final SFlowAgentAddressEnt sFlowAgentAddress;

            public final SFlowTableEnt sFlowTable;

            private SFlowAgentEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
            {
                super(mib, parent, "sFlowAgent", "1.3.6.1.4.1.4300.1.1", false, false, false, false);
                this.sFlowVersion = new SFlowVersionEnt(mib, this);
                this.sFlowAgentAddressType = new SFlowAgentAddressTypeEnt(mib, this);
                this.sFlowAgentAddress = new SFlowAgentAddressEnt(mib, this);
                this.sFlowTable = new SFlowTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sFlowVersion,
                    this.sFlowAgentAddressType,
                    this.sFlowAgentAddress,
                    this.sFlowTable
                };
            }
            public static final class SFlowVersionEnt extends MIBEntry<SFLOWMIBDef>
            {
                private SFlowVersionEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                {
                    super(mib, parent, "sFlowVersion", "1.3.6.1.4.1.4300.1.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SFlowAgentAddressTypeEnt extends MIBEntry<SFLOWMIBDef>
            {
                private SFlowAgentAddressTypeEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                {
                    super(mib, parent, "sFlowAgentAddressType", "1.3.6.1.4.1.4300.1.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SFlowAgentAddressEnt extends MIBEntry<SFLOWMIBDef>
            {
                private SFlowAgentAddressEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                {
                    super(mib, parent, "sFlowAgentAddress", "1.3.6.1.4.1.4300.1.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SFlowTableEnt extends MIBEntry<SFLOWMIBDef>
            {
                public final SFlowEntryEnt sFlowEntry;

                private SFlowTableEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                {
                    super(mib, parent, "sFlowTable", "1.3.6.1.4.1.4300.1.1.4", false, true, false, false);
                    this.sFlowEntry = new SFlowEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sFlowEntry
                    };
                }
                public static final class SFlowEntryEnt extends MIBEntry<SFLOWMIBDef>
                {
                    public final SFlowDataSourceEnt sFlowDataSource;

                    public final SFlowOwnerEnt sFlowOwner;

                    public final SFlowTimeoutEnt sFlowTimeout;

                    public final SFlowPacketSamplingRateEnt sFlowPacketSamplingRate;

                    public final SFlowCounterSamplingIntervalEnt sFlowCounterSamplingInterval;

                    public final SFlowMaximumHeaderSizeEnt sFlowMaximumHeaderSize;

                    public final SFlowMaximumDatagramSizeEnt sFlowMaximumDatagramSize;

                    public final SFlowCollectorAddressTypeEnt sFlowCollectorAddressType;

                    public final SFlowCollectorAddressEnt sFlowCollectorAddress;

                    public final SFlowCollectorPortEnt sFlowCollectorPort;

                    public final SFlowDatagramVersionEnt sFlowDatagramVersion;

                    private SFlowEntryEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                    {
                        super(mib, parent, "sFlowEntry", "1.3.6.1.4.1.4300.1.1.4.1", false, false, false, true);
                        this.sFlowDataSource = new SFlowDataSourceEnt(mib, this);
                        this.sFlowOwner = new SFlowOwnerEnt(mib, this);
                        this.sFlowTimeout = new SFlowTimeoutEnt(mib, this);
                        this.sFlowPacketSamplingRate = new SFlowPacketSamplingRateEnt(mib, this);
                        this.sFlowCounterSamplingInterval = new SFlowCounterSamplingIntervalEnt(mib, this);
                        this.sFlowMaximumHeaderSize = new SFlowMaximumHeaderSizeEnt(mib, this);
                        this.sFlowMaximumDatagramSize = new SFlowMaximumDatagramSizeEnt(mib, this);
                        this.sFlowCollectorAddressType = new SFlowCollectorAddressTypeEnt(mib, this);
                        this.sFlowCollectorAddress = new SFlowCollectorAddressEnt(mib, this);
                        this.sFlowCollectorPort = new SFlowCollectorPortEnt(mib, this);
                        this.sFlowDatagramVersion = new SFlowDatagramVersionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sFlowDataSource,
                            this.sFlowOwner,
                            this.sFlowTimeout,
                            this.sFlowPacketSamplingRate,
                            this.sFlowCounterSamplingInterval,
                            this.sFlowMaximumHeaderSize,
                            this.sFlowMaximumDatagramSize,
                            this.sFlowCollectorAddressType,
                            this.sFlowCollectorAddress,
                            this.sFlowCollectorPort,
                            this.sFlowDatagramVersion
                        };
                    }
                    public static final class SFlowDataSourceEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowDataSourceEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowDataSource", "1.3.6.1.4.1.4300.1.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowOwnerEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowOwnerEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowOwner", "1.3.6.1.4.1.4300.1.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowTimeoutEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowTimeoutEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowTimeout", "1.3.6.1.4.1.4300.1.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowPacketSamplingRateEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowPacketSamplingRateEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowPacketSamplingRate", "1.3.6.1.4.1.4300.1.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowCounterSamplingIntervalEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowCounterSamplingIntervalEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowCounterSamplingInterval", "1.3.6.1.4.1.4300.1.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowMaximumHeaderSizeEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowMaximumHeaderSizeEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowMaximumHeaderSize", "1.3.6.1.4.1.4300.1.1.4.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowMaximumDatagramSizeEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowMaximumDatagramSizeEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowMaximumDatagramSize", "1.3.6.1.4.1.4300.1.1.4.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowCollectorAddressTypeEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowCollectorAddressTypeEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowCollectorAddressType", "1.3.6.1.4.1.4300.1.1.4.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowCollectorAddressEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowCollectorAddressEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowCollectorAddress", "1.3.6.1.4.1.4300.1.1.4.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowCollectorPortEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowCollectorPortEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowCollectorPort", "1.3.6.1.4.1.4300.1.1.4.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SFlowDatagramVersionEnt extends MIBEntry<SFLOWMIBDef>
                    {
                        private SFlowDatagramVersionEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                        {
                            super(mib, parent, "sFlowDatagramVersion", "1.3.6.1.4.1.4300.1.1.4.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SFlowMIBConformanceEnt extends MIBEntry<SFLOWMIBDef>
        {
            public final SFlowMIBGroupsEnt sFlowMIBGroups;

            public final SFlowMIBCompliancesEnt sFlowMIBCompliances;

            private SFlowMIBConformanceEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
            {
                super(mib, parent, "sFlowMIBConformance", "1.3.6.1.4.1.4300.1.2", false, false, false, false);
                this.sFlowMIBGroups = new SFlowMIBGroupsEnt(mib, this);
                this.sFlowMIBCompliances = new SFlowMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sFlowMIBGroups,
                    this.sFlowMIBCompliances
                };
            }
            public static final class SFlowMIBGroupsEnt extends MIBEntry<SFLOWMIBDef>
            {
                public final SFlowAgentGroupEnt sFlowAgentGroup;

                private SFlowMIBGroupsEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                {
                    super(mib, parent, "sFlowMIBGroups", "1.3.6.1.4.1.4300.1.2.1", false, false, false, false);
                    this.sFlowAgentGroup = new SFlowAgentGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sFlowAgentGroup
                    };
                }
                public static final class SFlowAgentGroupEnt extends MIBEntry<SFLOWMIBDef>
                {
                    private SFlowAgentGroupEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                    {
                        super(mib, parent, "sFlowAgentGroup", "1.3.6.1.4.1.4300.1.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SFlowMIBCompliancesEnt extends MIBEntry<SFLOWMIBDef>
            {
                public final SFlowComplianceEnt sFlowCompliance;

                private SFlowMIBCompliancesEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                {
                    super(mib, parent, "sFlowMIBCompliances", "1.3.6.1.4.1.4300.1.2.2", false, false, false, false);
                    this.sFlowCompliance = new SFlowComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sFlowCompliance
                    };
                }
                public static final class SFlowComplianceEnt extends MIBEntry<SFLOWMIBDef>
                {
                    private SFlowComplianceEnt(SFLOWMIBDef mib, MIBEntry<SFLOWMIBDef> parent)
                    {
                        super(mib, parent, "sFlowCompliance", "1.3.6.1.4.1.4300.1.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
