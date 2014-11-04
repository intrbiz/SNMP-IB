package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPTARGETMIBDef extends MIB
{
    public static final SNMPTARGETMIBDef SNMPTARGETMIB = new SNMPTARGETMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPTARGETMIBDef.SNMPTARGETMIB); }

    public final SnmpTargetMIBEnt snmpTargetMIB;

    private SNMPTARGETMIBDef()
    {
        super("SNMP-TARGET-MIB");
        this.snmpTargetMIB = new SnmpTargetMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpTargetMIB
        };
    }

    public static final class SnmpTargetMIBEnt extends MIBEntry<SNMPTARGETMIBDef>
    {
        public final SnmpTargetObjectsEnt snmpTargetObjects;

        public final SnmpTargetConformanceEnt snmpTargetConformance;

        private SnmpTargetMIBEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
        {
            super(mib, parent, "snmpTargetMIB", "1.3.6.1.6.3.12", false, false, false, false);
            this.snmpTargetObjects = new SnmpTargetObjectsEnt(mib, this);
            this.snmpTargetConformance = new SnmpTargetConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpTargetObjects,
                this.snmpTargetConformance
            };
        }
        public static final class SnmpTargetObjectsEnt extends MIBEntry<SNMPTARGETMIBDef>
        {
            /** The snmpTargetObjects group*/
            public final SnmpTargetSpinLockEnt snmpTargetSpinLock;

            public final SnmpTargetAddrTableEnt snmpTargetAddrTable;

            public final SnmpTargetParamsTableEnt snmpTargetParamsTable;

            public final SnmpUnavailableContextsEnt snmpUnavailableContexts;

            public final SnmpUnknownContextsEnt snmpUnknownContexts;

            private SnmpTargetObjectsEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
            {
                super(mib, parent, "snmpTargetObjects", "1.3.6.1.6.3.12.1", false, false, false, false);
                this.snmpTargetSpinLock = new SnmpTargetSpinLockEnt(mib, this);
                this.snmpTargetAddrTable = new SnmpTargetAddrTableEnt(mib, this);
                this.snmpTargetParamsTable = new SnmpTargetParamsTableEnt(mib, this);
                this.snmpUnavailableContexts = new SnmpUnavailableContextsEnt(mib, this);
                this.snmpUnknownContexts = new SnmpUnknownContextsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpTargetSpinLock,
                    this.snmpTargetAddrTable,
                    this.snmpTargetParamsTable,
                    this.snmpUnavailableContexts,
                    this.snmpUnknownContexts
                };
            }
            public static final class SnmpTargetSpinLockEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                private SnmpTargetSpinLockEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpTargetSpinLock", "1.3.6.1.6.3.12.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SnmpTargetAddrTableEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                public final SnmpTargetAddrEntryEnt snmpTargetAddrEntry;

                private SnmpTargetAddrTableEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpTargetAddrTable", "1.3.6.1.6.3.12.1.2", false, true, false, false);
                    this.snmpTargetAddrEntry = new SnmpTargetAddrEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpTargetAddrEntry
                    };
                }
                public static final class SnmpTargetAddrEntryEnt extends MIBEntry<SNMPTARGETMIBDef>
                {
                    public final SnmpTargetAddrNameEnt snmpTargetAddrName;

                    public final SnmpTargetAddrTDomainEnt snmpTargetAddrTDomain;

                    public final SnmpTargetAddrTAddressEnt snmpTargetAddrTAddress;

                    public final SnmpTargetAddrTimeoutEnt snmpTargetAddrTimeout;

                    public final SnmpTargetAddrRetryCountEnt snmpTargetAddrRetryCount;

                    public final SnmpTargetAddrTagListEnt snmpTargetAddrTagList;

                    public final SnmpTargetAddrParamsEnt snmpTargetAddrParams;

                    public final SnmpTargetAddrStorageTypeEnt snmpTargetAddrStorageType;

                    public final SnmpTargetAddrRowStatusEnt snmpTargetAddrRowStatus;

                    private SnmpTargetAddrEntryEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetAddrEntry", "1.3.6.1.6.3.12.1.2.1", false, false, false, true);
                        this.snmpTargetAddrName = new SnmpTargetAddrNameEnt(mib, this);
                        this.snmpTargetAddrTDomain = new SnmpTargetAddrTDomainEnt(mib, this);
                        this.snmpTargetAddrTAddress = new SnmpTargetAddrTAddressEnt(mib, this);
                        this.snmpTargetAddrTimeout = new SnmpTargetAddrTimeoutEnt(mib, this);
                        this.snmpTargetAddrRetryCount = new SnmpTargetAddrRetryCountEnt(mib, this);
                        this.snmpTargetAddrTagList = new SnmpTargetAddrTagListEnt(mib, this);
                        this.snmpTargetAddrParams = new SnmpTargetAddrParamsEnt(mib, this);
                        this.snmpTargetAddrStorageType = new SnmpTargetAddrStorageTypeEnt(mib, this);
                        this.snmpTargetAddrRowStatus = new SnmpTargetAddrRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpTargetAddrName,
                            this.snmpTargetAddrTDomain,
                            this.snmpTargetAddrTAddress,
                            this.snmpTargetAddrTimeout,
                            this.snmpTargetAddrRetryCount,
                            this.snmpTargetAddrTagList,
                            this.snmpTargetAddrParams,
                            this.snmpTargetAddrStorageType,
                            this.snmpTargetAddrRowStatus
                        };
                    }
                    public static final class SnmpTargetAddrNameEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrNameEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrName", "1.3.6.1.6.3.12.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrTDomainEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrTDomainEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrTDomain", "1.3.6.1.6.3.12.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrTAddressEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrTAddressEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrTAddress", "1.3.6.1.6.3.12.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrTimeoutEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrTimeoutEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrTimeout", "1.3.6.1.6.3.12.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrRetryCountEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrRetryCountEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrRetryCount", "1.3.6.1.6.3.12.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrTagListEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrTagListEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrTagList", "1.3.6.1.6.3.12.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrParamsEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrParamsEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrParams", "1.3.6.1.6.3.12.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrStorageTypeEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrStorageTypeEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrStorageType", "1.3.6.1.6.3.12.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetAddrRowStatusEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetAddrRowStatusEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetAddrRowStatus", "1.3.6.1.6.3.12.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnmpTargetParamsTableEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                public final SnmpTargetParamsEntryEnt snmpTargetParamsEntry;

                private SnmpTargetParamsTableEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpTargetParamsTable", "1.3.6.1.6.3.12.1.3", false, true, false, false);
                    this.snmpTargetParamsEntry = new SnmpTargetParamsEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpTargetParamsEntry
                    };
                }
                public static final class SnmpTargetParamsEntryEnt extends MIBEntry<SNMPTARGETMIBDef>
                {
                    public final SnmpTargetParamsNameEnt snmpTargetParamsName;

                    public final SnmpTargetParamsMPModelEnt snmpTargetParamsMPModel;

                    public final SnmpTargetParamsSecurityModelEnt snmpTargetParamsSecurityModel;

                    public final SnmpTargetParamsSecurityNameEnt snmpTargetParamsSecurityName;

                    public final SnmpTargetParamsSecurityLevelEnt snmpTargetParamsSecurityLevel;

                    public final SnmpTargetParamsStorageTypeEnt snmpTargetParamsStorageType;

                    public final SnmpTargetParamsRowStatusEnt snmpTargetParamsRowStatus;

                    private SnmpTargetParamsEntryEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetParamsEntry", "1.3.6.1.6.3.12.1.3.1", false, false, false, true);
                        this.snmpTargetParamsName = new SnmpTargetParamsNameEnt(mib, this);
                        this.snmpTargetParamsMPModel = new SnmpTargetParamsMPModelEnt(mib, this);
                        this.snmpTargetParamsSecurityModel = new SnmpTargetParamsSecurityModelEnt(mib, this);
                        this.snmpTargetParamsSecurityName = new SnmpTargetParamsSecurityNameEnt(mib, this);
                        this.snmpTargetParamsSecurityLevel = new SnmpTargetParamsSecurityLevelEnt(mib, this);
                        this.snmpTargetParamsStorageType = new SnmpTargetParamsStorageTypeEnt(mib, this);
                        this.snmpTargetParamsRowStatus = new SnmpTargetParamsRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpTargetParamsName,
                            this.snmpTargetParamsMPModel,
                            this.snmpTargetParamsSecurityModel,
                            this.snmpTargetParamsSecurityName,
                            this.snmpTargetParamsSecurityLevel,
                            this.snmpTargetParamsStorageType,
                            this.snmpTargetParamsRowStatus
                        };
                    }
                    public static final class SnmpTargetParamsNameEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsNameEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsName", "1.3.6.1.6.3.12.1.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetParamsMPModelEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsMPModelEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsMPModel", "1.3.6.1.6.3.12.1.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetParamsSecurityModelEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsSecurityModelEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsSecurityModel", "1.3.6.1.6.3.12.1.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetParamsSecurityNameEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsSecurityNameEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsSecurityName", "1.3.6.1.6.3.12.1.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetParamsSecurityLevelEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsSecurityLevelEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsSecurityLevel", "1.3.6.1.6.3.12.1.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetParamsStorageTypeEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsStorageTypeEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsStorageType", "1.3.6.1.6.3.12.1.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpTargetParamsRowStatusEnt extends MIBEntry<SNMPTARGETMIBDef>
                    {
                        private SnmpTargetParamsRowStatusEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                        {
                            super(mib, parent, "snmpTargetParamsRowStatus", "1.3.6.1.6.3.12.1.3.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class SnmpUnavailableContextsEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                private SnmpUnavailableContextsEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpUnavailableContexts", "1.3.6.1.6.3.12.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SnmpUnknownContextsEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                private SnmpUnknownContextsEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpUnknownContexts", "1.3.6.1.6.3.12.1.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class SnmpTargetConformanceEnt extends MIBEntry<SNMPTARGETMIBDef>
        {
            /** Conformance information*/
            public final SnmpTargetCompliancesEnt snmpTargetCompliances;

            public final SnmpTargetGroupsEnt snmpTargetGroups;

            private SnmpTargetConformanceEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
            {
                super(mib, parent, "snmpTargetConformance", "1.3.6.1.6.3.12.3", false, false, false, false);
                this.snmpTargetCompliances = new SnmpTargetCompliancesEnt(mib, this);
                this.snmpTargetGroups = new SnmpTargetGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpTargetCompliances,
                    this.snmpTargetGroups
                };
            }
            public static final class SnmpTargetCompliancesEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                /** Compliance statements*/
                public final SnmpTargetCommandResponderComplianceEnt snmpTargetCommandResponderCompliance;

                private SnmpTargetCompliancesEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpTargetCompliances", "1.3.6.1.6.3.12.3.1", false, false, false, false);
                    this.snmpTargetCommandResponderCompliance = new SnmpTargetCommandResponderComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpTargetCommandResponderCompliance
                    };
                }
                public static final class SnmpTargetCommandResponderComplianceEnt extends MIBEntry<SNMPTARGETMIBDef>
                {
                    private SnmpTargetCommandResponderComplianceEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetCommandResponderCompliance", "1.3.6.1.6.3.12.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpTargetGroupsEnt extends MIBEntry<SNMPTARGETMIBDef>
            {
                public final SnmpTargetBasicGroupEnt snmpTargetBasicGroup;

                public final SnmpTargetResponseGroupEnt snmpTargetResponseGroup;

                public final SnmpTargetCommandResponderGroupEnt snmpTargetCommandResponderGroup;

                private SnmpTargetGroupsEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                {
                    super(mib, parent, "snmpTargetGroups", "1.3.6.1.6.3.12.3.2", false, false, false, false);
                    this.snmpTargetBasicGroup = new SnmpTargetBasicGroupEnt(mib, this);
                    this.snmpTargetResponseGroup = new SnmpTargetResponseGroupEnt(mib, this);
                    this.snmpTargetCommandResponderGroup = new SnmpTargetCommandResponderGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpTargetBasicGroup,
                        this.snmpTargetResponseGroup,
                        this.snmpTargetCommandResponderGroup
                    };
                }
                public static final class SnmpTargetBasicGroupEnt extends MIBEntry<SNMPTARGETMIBDef>
                {
                    private SnmpTargetBasicGroupEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetBasicGroup", "1.3.6.1.6.3.12.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpTargetResponseGroupEnt extends MIBEntry<SNMPTARGETMIBDef>
                {
                    private SnmpTargetResponseGroupEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetResponseGroup", "1.3.6.1.6.3.12.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpTargetCommandResponderGroupEnt extends MIBEntry<SNMPTARGETMIBDef>
                {
                    private SnmpTargetCommandResponderGroupEnt(SNMPTARGETMIBDef mib, MIBEntry<SNMPTARGETMIBDef> parent)
                    {
                        super(mib, parent, "snmpTargetCommandResponderGroup", "1.3.6.1.6.3.12.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
