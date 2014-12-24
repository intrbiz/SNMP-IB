package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]*/
public final class UDPLITEMIBDef extends MIB
{
    public static final UDPLITEMIBDef UDPLITEMIB = new UDPLITEMIBDef();

    /** [RFC4001]

18 December 2007*/
    public final UdpliteMIBEnt udpliteMIB;

    private UDPLITEMIBDef()
    {
        super("UDPLITE-MIB");
        this.udpliteMIB = new UdpliteMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.udpliteMIB
        };
    }

    public static final class UdpliteMIBEnt extends MIBEntry<UDPLITEMIBDef>
    {
        public final UdpliteEnt udplite;

        /** Conformance Information*/
        public final UdpliteMIBConformanceEnt udpliteMIBConformance;

        private UdpliteMIBEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
        {
            super(mib, parent, "udpliteMIB", "1.3.6.1.2.1.170", false, false, false, false);
            this.udplite = new UdpliteEnt(mib, this);
            this.udpliteMIBConformance = new UdpliteMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.udplite,
                this.udpliteMIBConformance
            };
        }
        public static final class UdpliteEnt extends MIBEntry<UDPLITEMIBDef>
        {
            public final UdpliteInDatagramsEnt udpliteInDatagrams;

            public final UdpliteInPartialCovEnt udpliteInPartialCov;

            public final UdpliteNoPortsEnt udpliteNoPorts;

            public final UdpliteInErrorsEnt udpliteInErrors;

            public final UdpliteInBadChecksumEnt udpliteInBadChecksum;

            public final UdpliteOutDatagramsEnt udpliteOutDatagrams;

            public final UdpliteOutPartialCovEnt udpliteOutPartialCov;

            public final UdpliteEndpointTableEnt udpliteEndpointTable;

            public final UdpliteStatsDiscontinuityTimeEnt udpliteStatsDiscontinuityTime;

            private UdpliteEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
            {
                super(mib, parent, "udplite", "1.3.6.1.2.1.170.1", false, false, false, false);
                this.udpliteInDatagrams = new UdpliteInDatagramsEnt(mib, this);
                this.udpliteInPartialCov = new UdpliteInPartialCovEnt(mib, this);
                this.udpliteNoPorts = new UdpliteNoPortsEnt(mib, this);
                this.udpliteInErrors = new UdpliteInErrorsEnt(mib, this);
                this.udpliteInBadChecksum = new UdpliteInBadChecksumEnt(mib, this);
                this.udpliteOutDatagrams = new UdpliteOutDatagramsEnt(mib, this);
                this.udpliteOutPartialCov = new UdpliteOutPartialCovEnt(mib, this);
                this.udpliteEndpointTable = new UdpliteEndpointTableEnt(mib, this);
                this.udpliteStatsDiscontinuityTime = new UdpliteStatsDiscontinuityTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.udpliteInDatagrams,
                    this.udpliteInPartialCov,
                    this.udpliteNoPorts,
                    this.udpliteInErrors,
                    this.udpliteInBadChecksum,
                    this.udpliteOutDatagrams,
                    this.udpliteOutPartialCov,
                    this.udpliteEndpointTable,
                    this.udpliteStatsDiscontinuityTime
                };
            }
            public static final class UdpliteInDatagramsEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteInDatagramsEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteInDatagrams", "1.3.6.1.2.1.170.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteInPartialCovEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteInPartialCovEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteInPartialCov", "1.3.6.1.2.1.170.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteNoPortsEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteNoPortsEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteNoPorts", "1.3.6.1.2.1.170.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteInErrorsEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteInErrorsEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteInErrors", "1.3.6.1.2.1.170.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteInBadChecksumEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteInBadChecksumEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteInBadChecksum", "1.3.6.1.2.1.170.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteOutDatagramsEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteOutDatagramsEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteOutDatagrams", "1.3.6.1.2.1.170.1.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteOutPartialCovEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteOutPartialCovEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteOutPartialCov", "1.3.6.1.2.1.170.1.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteEndpointTableEnt extends MIBEntry<UDPLITEMIBDef>
            {
                public final UdpliteEndpointEntryEnt udpliteEndpointEntry;

                private UdpliteEndpointTableEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteEndpointTable", "1.3.6.1.2.1.170.1.8", false, true, false, false);
                    this.udpliteEndpointEntry = new UdpliteEndpointEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.udpliteEndpointEntry
                    };
                }
                public static final class UdpliteEndpointEntryEnt extends MIBEntry<UDPLITEMIBDef>
                {
                    public final UdpliteEndpointLocalAddressTypeEnt udpliteEndpointLocalAddressType;

                    public final UdpliteEndpointLocalAddressEnt udpliteEndpointLocalAddress;

                    public final UdpliteEndpointLocalPortEnt udpliteEndpointLocalPort;

                    public final UdpliteEndpointRemoteAddressTypeEnt udpliteEndpointRemoteAddressType;

                    public final UdpliteEndpointRemoteAddressEnt udpliteEndpointRemoteAddress;

                    public final UdpliteEndpointRemotePortEnt udpliteEndpointRemotePort;

                    public final UdpliteEndpointInstanceEnt udpliteEndpointInstance;

                    public final UdpliteEndpointProcessEnt udpliteEndpointProcess;

                    public final UdpliteEndpointMinCoverageEnt udpliteEndpointMinCoverage;

                    public final UdpliteEndpointViolCoverageEnt udpliteEndpointViolCoverage;

                    private UdpliteEndpointEntryEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                    {
                        super(mib, parent, "udpliteEndpointEntry", "1.3.6.1.2.1.170.1.8.1", false, false, false, true);
                        this.udpliteEndpointLocalAddressType = new UdpliteEndpointLocalAddressTypeEnt(mib, this);
                        this.udpliteEndpointLocalAddress = new UdpliteEndpointLocalAddressEnt(mib, this);
                        this.udpliteEndpointLocalPort = new UdpliteEndpointLocalPortEnt(mib, this);
                        this.udpliteEndpointRemoteAddressType = new UdpliteEndpointRemoteAddressTypeEnt(mib, this);
                        this.udpliteEndpointRemoteAddress = new UdpliteEndpointRemoteAddressEnt(mib, this);
                        this.udpliteEndpointRemotePort = new UdpliteEndpointRemotePortEnt(mib, this);
                        this.udpliteEndpointInstance = new UdpliteEndpointInstanceEnt(mib, this);
                        this.udpliteEndpointProcess = new UdpliteEndpointProcessEnt(mib, this);
                        this.udpliteEndpointMinCoverage = new UdpliteEndpointMinCoverageEnt(mib, this);
                        this.udpliteEndpointViolCoverage = new UdpliteEndpointViolCoverageEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.udpliteEndpointLocalAddressType,
                            this.udpliteEndpointLocalAddress,
                            this.udpliteEndpointLocalPort,
                            this.udpliteEndpointRemoteAddressType,
                            this.udpliteEndpointRemoteAddress,
                            this.udpliteEndpointRemotePort,
                            this.udpliteEndpointInstance,
                            this.udpliteEndpointProcess,
                            this.udpliteEndpointMinCoverage,
                            this.udpliteEndpointViolCoverage
                        };
                    }
                    public static final class UdpliteEndpointLocalAddressTypeEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointLocalAddressTypeEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointLocalAddressType", "1.3.6.1.2.1.170.1.8.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointLocalAddressEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointLocalAddressEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointLocalAddress", "1.3.6.1.2.1.170.1.8.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointLocalPortEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointLocalPortEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointLocalPort", "1.3.6.1.2.1.170.1.8.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointRemoteAddressTypeEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointRemoteAddressTypeEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointRemoteAddressType", "1.3.6.1.2.1.170.1.8.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointRemoteAddressEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointRemoteAddressEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointRemoteAddress", "1.3.6.1.2.1.170.1.8.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointRemotePortEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointRemotePortEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointRemotePort", "1.3.6.1.2.1.170.1.8.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointInstanceEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointInstanceEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointInstance", "1.3.6.1.2.1.170.1.8.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointProcessEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointProcessEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointProcess", "1.3.6.1.2.1.170.1.8.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointMinCoverageEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointMinCoverageEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointMinCoverage", "1.3.6.1.2.1.170.1.8.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class UdpliteEndpointViolCoverageEnt extends MIBEntry<UDPLITEMIBDef>
                    {
                        private UdpliteEndpointViolCoverageEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                        {
                            super(mib, parent, "udpliteEndpointViolCoverage", "1.3.6.1.2.1.170.1.8.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class UdpliteStatsDiscontinuityTimeEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteStatsDiscontinuityTimeEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteStatsDiscontinuityTime", "1.3.6.1.2.1.170.1.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class UdpliteMIBConformanceEnt extends MIBEntry<UDPLITEMIBDef>
        {
            public final UdpliteMIBComplianceEnt udpliteMIBCompliance;

            public final UdpliteMIBGroupsEnt udpliteMIBGroups;

            private UdpliteMIBConformanceEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
            {
                super(mib, parent, "udpliteMIBConformance", "1.3.6.1.2.1.170.2", false, false, false, false);
                this.udpliteMIBCompliance = new UdpliteMIBComplianceEnt(mib, this);
                this.udpliteMIBGroups = new UdpliteMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.udpliteMIBCompliance,
                    this.udpliteMIBGroups
                };
            }
            public static final class UdpliteMIBComplianceEnt extends MIBEntry<UDPLITEMIBDef>
            {
                private UdpliteMIBComplianceEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteMIBCompliance", "1.3.6.1.2.1.170.2.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UdpliteMIBGroupsEnt extends MIBEntry<UDPLITEMIBDef>
            {
                /** as in UDP*/
                public final UdpliteBaseGroupEnt udpliteBaseGroup;

                /** specific to UDP-Lite*/
                public final UdplitePartialCsumGroupEnt udplitePartialCsumGroup;

                public final UdpliteEndpointGroupEnt udpliteEndpointGroup;

                public final UdpliteAppGroupEnt udpliteAppGroup;

                private UdpliteMIBGroupsEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                {
                    super(mib, parent, "udpliteMIBGroups", "1.3.6.1.2.1.170.2.2", false, false, false, false);
                    this.udpliteBaseGroup = new UdpliteBaseGroupEnt(mib, this);
                    this.udplitePartialCsumGroup = new UdplitePartialCsumGroupEnt(mib, this);
                    this.udpliteEndpointGroup = new UdpliteEndpointGroupEnt(mib, this);
                    this.udpliteAppGroup = new UdpliteAppGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.udpliteBaseGroup,
                        this.udplitePartialCsumGroup,
                        this.udpliteEndpointGroup,
                        this.udpliteAppGroup
                    };
                }
                public static final class UdpliteBaseGroupEnt extends MIBEntry<UDPLITEMIBDef>
                {
                    private UdpliteBaseGroupEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                    {
                        super(mib, parent, "udpliteBaseGroup", "1.3.6.1.2.1.170.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdplitePartialCsumGroupEnt extends MIBEntry<UDPLITEMIBDef>
                {
                    private UdplitePartialCsumGroupEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                    {
                        super(mib, parent, "udplitePartialCsumGroup", "1.3.6.1.2.1.170.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpliteEndpointGroupEnt extends MIBEntry<UDPLITEMIBDef>
                {
                    private UdpliteEndpointGroupEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                    {
                        super(mib, parent, "udpliteEndpointGroup", "1.3.6.1.2.1.170.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpliteAppGroupEnt extends MIBEntry<UDPLITEMIBDef>
                {
                    private UdpliteAppGroupEnt(UDPLITEMIBDef mib, MIBEntry<UDPLITEMIBDef> parent)
                    {
                        super(mib, parent, "udpliteAppGroup", "1.3.6.1.2.1.170.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
