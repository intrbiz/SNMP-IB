package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC2670
RFC3289*/
public final class DOCSIETFSUBMGTMIBDef extends MIB
{
    public static final DOCSIETFSUBMGTMIBDef DOCSIETFSUBMGTMIB = new DOCSIETFSUBMGTMIBDef();

    /** March 29, 2005*/
    public final DocsSubMgtEnt docsSubMgt;

    private DOCSIETFSUBMGTMIBDef()
    {
        super("DOCS-IETF-SUBMGT-MIB");
        this.docsSubMgt = new DocsSubMgtEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsSubMgt
        };
    }

    public static final class DocsSubMgtEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
    {
        public final DocsSubMgtObjectsEnt docsSubMgtObjects;

        public final DocsSubMgtConformanceEnt docsSubMgtConformance;

        private DocsSubMgtEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
        {
            super(mib, parent, "docsSubMgt", "1.3.6.1.2.1.125", false, false, false, false);
            this.docsSubMgtObjects = new DocsSubMgtObjectsEnt(mib, this);
            this.docsSubMgtConformance = new DocsSubMgtConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsSubMgtObjects,
                this.docsSubMgtConformance
            };
        }
        public static final class DocsSubMgtObjectsEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
        {
            public final DocsSubMgtCpeControlTableEnt docsSubMgtCpeControlTable;

            public final DocsSubMgtCpeMaxIpDefaultEnt docsSubMgtCpeMaxIpDefault;

            public final DocsSubMgtCpeActiveDefaultEnt docsSubMgtCpeActiveDefault;

            public final DocsSubMgtCpeLearnableDefaultEnt docsSubMgtCpeLearnableDefault;

            public final DocsSubMgtCpeIpTableEnt docsSubMgtCpeIpTable;

            public final DocsSubMgtCmFilterTableEnt docsSubMgtCmFilterTable;

            public final DocsSubMgtFilterGroupTableEnt docsSubMgtFilterGroupTable;

            private DocsSubMgtObjectsEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
            {
                super(mib, parent, "docsSubMgtObjects", "1.3.6.1.2.1.125.1", false, false, false, false);
                this.docsSubMgtCpeControlTable = new DocsSubMgtCpeControlTableEnt(mib, this);
                this.docsSubMgtCpeMaxIpDefault = new DocsSubMgtCpeMaxIpDefaultEnt(mib, this);
                this.docsSubMgtCpeActiveDefault = new DocsSubMgtCpeActiveDefaultEnt(mib, this);
                this.docsSubMgtCpeLearnableDefault = new DocsSubMgtCpeLearnableDefaultEnt(mib, this);
                this.docsSubMgtCpeIpTable = new DocsSubMgtCpeIpTableEnt(mib, this);
                this.docsSubMgtCmFilterTable = new DocsSubMgtCmFilterTableEnt(mib, this);
                this.docsSubMgtFilterGroupTable = new DocsSubMgtFilterGroupTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsSubMgtCpeControlTable,
                    this.docsSubMgtCpeMaxIpDefault,
                    this.docsSubMgtCpeActiveDefault,
                    this.docsSubMgtCpeLearnableDefault,
                    this.docsSubMgtCpeIpTable,
                    this.docsSubMgtCmFilterTable,
                    this.docsSubMgtFilterGroupTable
                };
            }
            public static final class DocsSubMgtCpeControlTableEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                public final DocsSubMgtCpeControlEntryEnt docsSubMgtCpeControlEntry;

                private DocsSubMgtCpeControlTableEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCpeControlTable", "1.3.6.1.2.1.125.1.1", false, true, false, false);
                    this.docsSubMgtCpeControlEntry = new DocsSubMgtCpeControlEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsSubMgtCpeControlEntry
                    };
                }
                public static final class DocsSubMgtCpeControlEntryEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                {
                    public final DocsSubMgtCpeControlMaxCpeIpEnt docsSubMgtCpeControlMaxCpeIp;

                    public final DocsSubMgtCpeControlActiveEnt docsSubMgtCpeControlActive;

                    public final DocsSubMgtCpeControlLearnableEnt docsSubMgtCpeControlLearnable;

                    public final DocsSubMgtCpeControlResetEnt docsSubMgtCpeControlReset;

                    public final DocsSubMgtCpeControlLastResetEnt docsSubMgtCpeControlLastReset;

                    private DocsSubMgtCpeControlEntryEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                    {
                        super(mib, parent, "docsSubMgtCpeControlEntry", "1.3.6.1.2.1.125.1.1.1", false, false, false, true);
                        this.docsSubMgtCpeControlMaxCpeIp = new DocsSubMgtCpeControlMaxCpeIpEnt(mib, this);
                        this.docsSubMgtCpeControlActive = new DocsSubMgtCpeControlActiveEnt(mib, this);
                        this.docsSubMgtCpeControlLearnable = new DocsSubMgtCpeControlLearnableEnt(mib, this);
                        this.docsSubMgtCpeControlReset = new DocsSubMgtCpeControlResetEnt(mib, this);
                        this.docsSubMgtCpeControlLastReset = new DocsSubMgtCpeControlLastResetEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsSubMgtCpeControlMaxCpeIp,
                            this.docsSubMgtCpeControlActive,
                            this.docsSubMgtCpeControlLearnable,
                            this.docsSubMgtCpeControlReset,
                            this.docsSubMgtCpeControlLastReset
                        };
                    }
                    public static final class DocsSubMgtCpeControlMaxCpeIpEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeControlMaxCpeIpEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeControlMaxCpeIp", "1.3.6.1.2.1.125.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeControlActiveEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeControlActiveEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeControlActive", "1.3.6.1.2.1.125.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeControlLearnableEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeControlLearnableEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeControlLearnable", "1.3.6.1.2.1.125.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeControlResetEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeControlResetEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeControlReset", "1.3.6.1.2.1.125.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeControlLastResetEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeControlLastResetEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeControlLastReset", "1.3.6.1.2.1.125.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsSubMgtCpeMaxIpDefaultEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                private DocsSubMgtCpeMaxIpDefaultEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCpeMaxIpDefault", "1.3.6.1.2.1.125.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DocsSubMgtCpeActiveDefaultEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                private DocsSubMgtCpeActiveDefaultEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCpeActiveDefault", "1.3.6.1.2.1.125.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DocsSubMgtCpeLearnableDefaultEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                private DocsSubMgtCpeLearnableDefaultEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCpeLearnableDefault", "1.3.6.1.2.1.125.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DocsSubMgtCpeIpTableEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                public final DocsSubMgtCpeIpEntryEnt docsSubMgtCpeIpEntry;

                private DocsSubMgtCpeIpTableEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCpeIpTable", "1.3.6.1.2.1.125.1.5", false, true, false, false);
                    this.docsSubMgtCpeIpEntry = new DocsSubMgtCpeIpEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsSubMgtCpeIpEntry
                    };
                }
                public static final class DocsSubMgtCpeIpEntryEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                {
                    public final DocsSubMgtCpeIpIndexEnt docsSubMgtCpeIpIndex;

                    public final DocsSubMgtCpeIpAddressTypeEnt docsSubMgtCpeIpAddressType;

                    public final DocsSubMgtCpeIpAddrEnt docsSubMgtCpeIpAddr;

                    public final DocsSubMgtCpeIpLearnedEnt docsSubMgtCpeIpLearned;

                    private DocsSubMgtCpeIpEntryEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                    {
                        super(mib, parent, "docsSubMgtCpeIpEntry", "1.3.6.1.2.1.125.1.5.1", false, false, false, true);
                        this.docsSubMgtCpeIpIndex = new DocsSubMgtCpeIpIndexEnt(mib, this);
                        this.docsSubMgtCpeIpAddressType = new DocsSubMgtCpeIpAddressTypeEnt(mib, this);
                        this.docsSubMgtCpeIpAddr = new DocsSubMgtCpeIpAddrEnt(mib, this);
                        this.docsSubMgtCpeIpLearned = new DocsSubMgtCpeIpLearnedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsSubMgtCpeIpIndex,
                            this.docsSubMgtCpeIpAddressType,
                            this.docsSubMgtCpeIpAddr,
                            this.docsSubMgtCpeIpLearned
                        };
                    }
                    public static final class DocsSubMgtCpeIpIndexEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeIpIndexEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeIpIndex", "1.3.6.1.2.1.125.1.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeIpAddressTypeEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeIpAddressTypeEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeIpAddressType", "1.3.6.1.2.1.125.1.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeIpAddrEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeIpAddrEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeIpAddr", "1.3.6.1.2.1.125.1.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCpeIpLearnedEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCpeIpLearnedEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCpeIpLearned", "1.3.6.1.2.1.125.1.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsSubMgtCmFilterTableEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                public final DocsSubMgtCmFilterEntryEnt docsSubMgtCmFilterEntry;

                private DocsSubMgtCmFilterTableEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCmFilterTable", "1.3.6.1.2.1.125.1.6", false, true, false, false);
                    this.docsSubMgtCmFilterEntry = new DocsSubMgtCmFilterEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsSubMgtCmFilterEntry
                    };
                }
                public static final class DocsSubMgtCmFilterEntryEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                {
                    public final DocsSubMgtCmFilterSubDownstreamEnt docsSubMgtCmFilterSubDownstream;

                    public final DocsSubMgtCmFilterSubUpstreamEnt docsSubMgtCmFilterSubUpstream;

                    public final DocsSubMgtCmFilterCmDownstreamEnt docsSubMgtCmFilterCmDownstream;

                    public final DocsSubMgtCmFilterCmUpstreamEnt docsSubMgtCmFilterCmUpstream;

                    private DocsSubMgtCmFilterEntryEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                    {
                        super(mib, parent, "docsSubMgtCmFilterEntry", "1.3.6.1.2.1.125.1.6.1", false, false, false, true);
                        this.docsSubMgtCmFilterSubDownstream = new DocsSubMgtCmFilterSubDownstreamEnt(mib, this);
                        this.docsSubMgtCmFilterSubUpstream = new DocsSubMgtCmFilterSubUpstreamEnt(mib, this);
                        this.docsSubMgtCmFilterCmDownstream = new DocsSubMgtCmFilterCmDownstreamEnt(mib, this);
                        this.docsSubMgtCmFilterCmUpstream = new DocsSubMgtCmFilterCmUpstreamEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsSubMgtCmFilterSubDownstream,
                            this.docsSubMgtCmFilterSubUpstream,
                            this.docsSubMgtCmFilterCmDownstream,
                            this.docsSubMgtCmFilterCmUpstream
                        };
                    }
                    public static final class DocsSubMgtCmFilterSubDownstreamEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCmFilterSubDownstreamEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCmFilterSubDownstream", "1.3.6.1.2.1.125.1.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCmFilterSubUpstreamEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCmFilterSubUpstreamEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCmFilterSubUpstream", "1.3.6.1.2.1.125.1.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCmFilterCmDownstreamEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCmFilterCmDownstreamEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCmFilterCmDownstream", "1.3.6.1.2.1.125.1.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class DocsSubMgtCmFilterCmUpstreamEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtCmFilterCmUpstreamEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtCmFilterCmUpstream", "1.3.6.1.2.1.125.1.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class DocsSubMgtFilterGroupTableEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                public final DocsSubMgtFilterGroupEntryEnt docsSubMgtFilterGroupEntry;

                private DocsSubMgtFilterGroupTableEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtFilterGroupTable", "1.3.6.1.2.1.125.1.7", false, true, false, false);
                    this.docsSubMgtFilterGroupEntry = new DocsSubMgtFilterGroupEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsSubMgtFilterGroupEntry
                    };
                }
                public static final class DocsSubMgtFilterGroupEntryEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                {
                    public final DocsSubMgtFilterGroupIndexEnt docsSubMgtFilterGroupIndex;

                    private DocsSubMgtFilterGroupEntryEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                    {
                        super(mib, parent, "docsSubMgtFilterGroupEntry", "1.3.6.1.2.1.125.1.7.1", false, false, false, true);
                        this.docsSubMgtFilterGroupIndex = new DocsSubMgtFilterGroupIndexEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.docsSubMgtFilterGroupIndex
                        };
                    }
                    public static final class DocsSubMgtFilterGroupIndexEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                    {
                        private DocsSubMgtFilterGroupIndexEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                        {
                            super(mib, parent, "docsSubMgtFilterGroupIndex", "1.3.6.1.2.1.125.1.7.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class DocsSubMgtConformanceEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
        {
            public final DocsSubMgtCompliancesEnt docsSubMgtCompliances;

            public final DocsSubMgtGroupsEnt docsSubMgtGroups;

            private DocsSubMgtConformanceEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
            {
                super(mib, parent, "docsSubMgtConformance", "1.3.6.1.2.1.125.2", false, false, false, false);
                this.docsSubMgtCompliances = new DocsSubMgtCompliancesEnt(mib, this);
                this.docsSubMgtGroups = new DocsSubMgtGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsSubMgtCompliances,
                    this.docsSubMgtGroups
                };
            }
            public static final class DocsSubMgtCompliancesEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                /** RFC3289*/
                public final DocsSubMgtBasicComplianceEnt docsSubMgtBasicCompliance;

                private DocsSubMgtCompliancesEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtCompliances", "1.3.6.1.2.1.125.2.1", false, false, false, false);
                    this.docsSubMgtBasicCompliance = new DocsSubMgtBasicComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsSubMgtBasicCompliance
                    };
                }
                public static final class DocsSubMgtBasicComplianceEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                {
                    private DocsSubMgtBasicComplianceEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                    {
                        super(mib, parent, "docsSubMgtBasicCompliance", "1.3.6.1.2.1.125.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsSubMgtGroupsEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
            {
                public final DocsSubMgtGroupEnt docsSubMgtGroup;

                private DocsSubMgtGroupsEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                {
                    super(mib, parent, "docsSubMgtGroups", "1.3.6.1.2.1.125.2.2", false, false, false, false);
                    this.docsSubMgtGroup = new DocsSubMgtGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsSubMgtGroup
                    };
                }
                public static final class DocsSubMgtGroupEnt extends MIBEntry<DOCSIETFSUBMGTMIBDef>
                {
                    private DocsSubMgtGroupEnt(DOCSIETFSUBMGTMIBDef mib, MIBEntry<DOCSIETFSUBMGTMIBDef> parent)
                    {
                        super(mib, parent, "docsSubMgtGroup", "1.3.6.1.2.1.125.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
