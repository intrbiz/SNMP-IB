package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SNMPCOMMUNITYMIBDef extends MIB
{
    public static final SNMPCOMMUNITYMIBDef SNMPCOMMUNITYMIB = new SNMPCOMMUNITYMIBDef();

    /** 6 Mar 2000, midnight*/
    public final SnmpCommunityMIBEnt snmpCommunityMIB;

    private SNMPCOMMUNITYMIBDef()
    {
        super("SNMP-COMMUNITY-MIB");
        this.snmpCommunityMIB = new SnmpCommunityMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpCommunityMIB
        };
    }

    public static final class SnmpCommunityMIBEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
    {
        /** Administrative assignments *****************************************/
        public final SnmpCommunityMIBObjectsEnt snmpCommunityMIBObjects;

        public final SnmpCommunityMIBConformanceEnt snmpCommunityMIBConformance;

        private SnmpCommunityMIBEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
        {
            super(mib, parent, "snmpCommunityMIB", "1.3.6.1.6.3.18", false, false, false, false);
            this.snmpCommunityMIBObjects = new SnmpCommunityMIBObjectsEnt(mib, this);
            this.snmpCommunityMIBConformance = new SnmpCommunityMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpCommunityMIBObjects,
                this.snmpCommunityMIBConformance
            };
        }
        public static final class SnmpCommunityMIBObjectsEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
        {
            /** The snmpCommunityTable contains a database of community strings.This table provides mappings between community strings, and the

parameters required for View-based Access Control.*/
            public final SnmpCommunityTableEnt snmpCommunityTable;

            /** The snmpTargetAddrExtTable*/
            public final SnmpTargetAddrExtTableEnt snmpTargetAddrExtTable;

            /** The snmpTrapAddress and snmpTrapCommunity objects are includedin notifications that are forwarded by a proxy, which wereoriginally received as SNMPv1 Trap messages.*/
            public final SnmpTrapAddressEnt snmpTrapAddress;

            public final SnmpTrapCommunityEnt snmpTrapCommunity;

            private SnmpCommunityMIBObjectsEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
            {
                super(mib, parent, "snmpCommunityMIBObjects", "1.3.6.1.6.3.18.1", false, false, false, false);
                this.snmpCommunityTable = new SnmpCommunityTableEnt(mib, this);
                this.snmpTargetAddrExtTable = new SnmpTargetAddrExtTableEnt(mib, this);
                this.snmpTrapAddress = new SnmpTrapAddressEnt(mib, this);
                this.snmpTrapCommunity = new SnmpTrapCommunityEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpCommunityTable,
                    this.snmpTargetAddrExtTable,
                    this.snmpTrapAddress,
                    this.snmpTrapCommunity
                };
            }
            public static final class SnmpCommunityTableEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
            {
                public final SnmpCommunityEntryEnt snmpCommunityEntry;

                private SnmpCommunityTableEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                {
                    super(mib, parent, "snmpCommunityTable", "1.3.6.1.6.3.18.1.1", false, true, false, false);
                    this.snmpCommunityEntry = new SnmpCommunityEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpCommunityEntry
                    };
                }
                public static final class SnmpCommunityEntryEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                {
                    public final SnmpCommunityIndexEnt snmpCommunityIndex;

                    public final SnmpCommunityNameEnt snmpCommunityName;

                    public final SnmpCommunitySecurityNameEnt snmpCommunitySecurityName;

                    public final SnmpCommunityContextEngineIDEnt snmpCommunityContextEngineID;

                    /** the empty string*/
                    public final SnmpCommunityContextNameEnt snmpCommunityContextName;

                    /** the empty string*/
                    public final SnmpCommunityTransportTagEnt snmpCommunityTransportTag;

                    public final SnmpCommunityStorageTypeEnt snmpCommunityStorageType;

                    public final SnmpCommunityStatusEnt snmpCommunityStatus;

                    private SnmpCommunityEntryEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                    {
                        super(mib, parent, "snmpCommunityEntry", "1.3.6.1.6.3.18.1.1.1", false, false, false, true);
                        this.snmpCommunityIndex = new SnmpCommunityIndexEnt(mib, this);
                        this.snmpCommunityName = new SnmpCommunityNameEnt(mib, this);
                        this.snmpCommunitySecurityName = new SnmpCommunitySecurityNameEnt(mib, this);
                        this.snmpCommunityContextEngineID = new SnmpCommunityContextEngineIDEnt(mib, this);
                        this.snmpCommunityContextName = new SnmpCommunityContextNameEnt(mib, this);
                        this.snmpCommunityTransportTag = new SnmpCommunityTransportTagEnt(mib, this);
                        this.snmpCommunityStorageType = new SnmpCommunityStorageTypeEnt(mib, this);
                        this.snmpCommunityStatus = new SnmpCommunityStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpCommunityIndex,
                            this.snmpCommunityName,
                            this.snmpCommunitySecurityName,
                            this.snmpCommunityContextEngineID,
                            this.snmpCommunityContextName,
                            this.snmpCommunityTransportTag,
                            this.snmpCommunityStorageType,
                            this.snmpCommunityStatus
                        };
                    }
                    public static final class SnmpCommunityIndexEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityIndexEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityIndex", "1.3.6.1.6.3.18.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunityNameEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityNameEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityName", "1.3.6.1.6.3.18.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunitySecurityNameEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunitySecurityNameEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunitySecurityName", "1.3.6.1.6.3.18.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunityContextEngineIDEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityContextEngineIDEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityContextEngineID", "1.3.6.1.6.3.18.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunityContextNameEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityContextNameEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityContextName", "1.3.6.1.6.3.18.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunityTransportTagEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityTransportTagEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityTransportTag", "1.3.6.1.6.3.18.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunityStorageTypeEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityStorageTypeEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityStorageType", "1.3.6.1.6.3.18.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpCommunityStatusEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpCommunityStatusEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpCommunityStatus", "1.3.6.1.6.3.18.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnmpTargetAddrExtTableEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
            {
                public final SnmpTargetAddrExtEntryEnt snmpTargetAddrExtEntry;

                private SnmpTargetAddrExtTableEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                {
                    super(mib, parent, "snmpTargetAddrExtTable", "1.3.6.1.6.3.18.1.2", false, true, false, false);
                    this.snmpTargetAddrExtEntry = new SnmpTargetAddrExtEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpTargetAddrExtEntry
                    };
                }
                public static final class SnmpTargetAddrExtEntryEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                {
                    public final SnmpTargetAddrTMaskEnt snmpTargetAddrTMask;

                    public final SnmpTargetAddrMMSEnt snmpTargetAddrMMS;

                    private SnmpTargetAddrExtEntryEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetAddrExtEntry", "1.3.6.1.6.3.18.1.2.1", false, false, false, true);
                        this.snmpTargetAddrTMask = new SnmpTargetAddrTMaskEnt(mib, this);
                        this.snmpTargetAddrMMS = new SnmpTargetAddrMMSEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpTargetAddrTMask,
                            this.snmpTargetAddrMMS
                        };
                    }
                    public static final class SnmpTargetAddrTMaskEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpTargetAddrTMaskEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrTMask", "1.3.6.1.6.3.18.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrMMSEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                    {
                        private SnmpTargetAddrMMSEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrMMS", "1.3.6.1.6.3.18.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnmpTrapAddressEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
            {
                private SnmpTrapAddressEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                {
                    super(mib, parent, "snmpTrapAddress", "1.3.6.1.6.3.18.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SnmpTrapCommunityEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
            {
                private SnmpTrapCommunityEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                {
                    super(mib, parent, "snmpTrapCommunity", "1.3.6.1.6.3.18.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class SnmpCommunityMIBConformanceEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
        {
            /** Conformance Information ********************************************/
            public final SnmpCommunityMIBCompliancesEnt snmpCommunityMIBCompliances;

            public final SnmpCommunityMIBGroupsEnt snmpCommunityMIBGroups;

            private SnmpCommunityMIBConformanceEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
            {
                super(mib, parent, "snmpCommunityMIBConformance", "1.3.6.1.6.3.18.2", false, false, false, false);
                this.snmpCommunityMIBCompliances = new SnmpCommunityMIBCompliancesEnt(mib, this);
                this.snmpCommunityMIBGroups = new SnmpCommunityMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpCommunityMIBCompliances,
                    this.snmpCommunityMIBGroups
                };
            }
            public static final class SnmpCommunityMIBCompliancesEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
            {
                /** Compliance statements*/
                public final SnmpCommunityMIBComplianceEnt snmpCommunityMIBCompliance;

                public final SnmpProxyTrapForwardComplianceEnt snmpProxyTrapForwardCompliance;

                private SnmpCommunityMIBCompliancesEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                {
                    super(mib, parent, "snmpCommunityMIBCompliances", "1.3.6.1.6.3.18.2.1", false, false, false, false);
                    this.snmpCommunityMIBCompliance = new SnmpCommunityMIBComplianceEnt(mib, this);
                    this.snmpProxyTrapForwardCompliance = new SnmpProxyTrapForwardComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpCommunityMIBCompliance,
                        this.snmpProxyTrapForwardCompliance
                    };
                }
                public static final class SnmpCommunityMIBComplianceEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                {
                    private SnmpCommunityMIBComplianceEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                    {
                        super(mib, parent, "snmpCommunityMIBCompliance", "1.3.6.1.6.3.18.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpProxyTrapForwardComplianceEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                {
                    private SnmpProxyTrapForwardComplianceEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                    {
                        super(mib, parent, "snmpProxyTrapForwardCompliance", "1.3.6.1.6.3.18.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpCommunityMIBGroupsEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
            {
                public final SnmpCommunityGroupEnt snmpCommunityGroup;

                public final SnmpProxyTrapForwardGroupEnt snmpProxyTrapForwardGroup;

                private SnmpCommunityMIBGroupsEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                {
                    super(mib, parent, "snmpCommunityMIBGroups", "1.3.6.1.6.3.18.2.2", false, false, false, false);
                    this.snmpCommunityGroup = new SnmpCommunityGroupEnt(mib, this);
                    this.snmpProxyTrapForwardGroup = new SnmpProxyTrapForwardGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpCommunityGroup,
                        this.snmpProxyTrapForwardGroup
                    };
                }
                public static final class SnmpCommunityGroupEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                {
                    private SnmpCommunityGroupEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                    {
                        super(mib, parent, "snmpCommunityGroup", "1.3.6.1.6.3.18.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpProxyTrapForwardGroupEnt extends MIBEntry<SNMPCOMMUNITYMIBDef>
                {
                    private SnmpProxyTrapForwardGroupEnt(SNMPCOMMUNITYMIBDef mib, MIBEntry<SNMPCOMMUNITYMIBDef> parent)
                    {
                        super(mib, parent, "snmpProxyTrapForwardGroup", "1.3.6.1.6.3.18.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
