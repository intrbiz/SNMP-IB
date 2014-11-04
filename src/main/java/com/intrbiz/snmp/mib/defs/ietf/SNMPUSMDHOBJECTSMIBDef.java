package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**OBJECT-IDENTITY,*/
public final class SNMPUSMDHOBJECTSMIBDef extends MIB
{
    public static final SNMPUSMDHOBJECTSMIBDef SNMPUSMDHOBJECTSMIB = new SNMPUSMDHOBJECTSMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPUSMDHOBJECTSMIBDef.SNMPUSMDHOBJECTSMIB); }

    /** 6 March 2000, Midnight*/
    public final SnmpUsmDHObjectsMIBEnt snmpUsmDHObjectsMIB;

    private SNMPUSMDHOBJECTSMIBDef()
    {
        super("SNMP-USM-DH-OBJECTS-MIB");
        this.snmpUsmDHObjectsMIB = new SnmpUsmDHObjectsMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpUsmDHObjectsMIB
        };
    }

    public static final class SnmpUsmDHObjectsMIBEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
    {
        /** IANA DHKEY-CHANGE 101
Administrative assignments*/
        public final UsmDHKeyObjectsEnt usmDHKeyObjects;

        public final UsmDHKeyConformanceEnt usmDHKeyConformance;

        private SnmpUsmDHObjectsMIBEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
        {
            super(mib, parent, "snmpUsmDHObjectsMIB", "1.3.6.1.3.101", false, false, false, false);
            this.usmDHKeyObjects = new UsmDHKeyObjectsEnt(mib, this);
            this.usmDHKeyConformance = new UsmDHKeyConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.usmDHKeyObjects,
                this.usmDHKeyConformance
            };
        }
        public static final class UsmDHKeyObjectsEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
        {
            /** Diffie Hellman public values*/
            public final UsmDHPublicObjectsEnt usmDHPublicObjects;

            public final UsmDHKickstartGroupEnt usmDHKickstartGroup;

            private UsmDHKeyObjectsEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
            {
                super(mib, parent, "usmDHKeyObjects", "1.3.6.1.3.101.1", false, false, false, false);
                this.usmDHPublicObjects = new UsmDHPublicObjectsEnt(mib, this);
                this.usmDHKickstartGroup = new UsmDHKickstartGroupEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usmDHPublicObjects,
                    this.usmDHKickstartGroup
                };
            }
            public static final class UsmDHPublicObjectsEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
            {
                public final UsmDHParametersEnt usmDHParameters;

                public final UsmDHUserKeyTableEnt usmDHUserKeyTable;

                private UsmDHPublicObjectsEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                {
                    super(mib, parent, "usmDHPublicObjects", "1.3.6.1.3.101.1.1", false, false, false, false);
                    this.usmDHParameters = new UsmDHParametersEnt(mib, this);
                    this.usmDHUserKeyTable = new UsmDHUserKeyTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmDHParameters,
                        this.usmDHUserKeyTable
                    };
                }
                public static final class UsmDHParametersEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    private UsmDHParametersEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHParameters", "1.3.6.1.3.101.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmDHUserKeyTableEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    public final UsmDHUserKeyEntryEnt usmDHUserKeyEntry;

                    private UsmDHUserKeyTableEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHUserKeyTable", "1.3.6.1.3.101.1.1.2", false, true, false, false);
                        this.usmDHUserKeyEntry = new UsmDHUserKeyEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.usmDHUserKeyEntry
                        };
                    }
                    public static final class UsmDHUserKeyEntryEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                    {
                        public final UsmDHUserAuthKeyChangeEnt usmDHUserAuthKeyChange;

                        public final UsmDHUserOwnAuthKeyChangeEnt usmDHUserOwnAuthKeyChange;

                        public final UsmDHUserPrivKeyChangeEnt usmDHUserPrivKeyChange;

                        public final UsmDHUserOwnPrivKeyChangeEnt usmDHUserOwnPrivKeyChange;

                        private UsmDHUserKeyEntryEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                        {
                            super(mib, parent, "usmDHUserKeyEntry", "1.3.6.1.3.101.1.1.2.1", false, false, false, true);
                            this.usmDHUserAuthKeyChange = new UsmDHUserAuthKeyChangeEnt(mib, this);
                            this.usmDHUserOwnAuthKeyChange = new UsmDHUserOwnAuthKeyChangeEnt(mib, this);
                            this.usmDHUserPrivKeyChange = new UsmDHUserPrivKeyChangeEnt(mib, this);
                            this.usmDHUserOwnPrivKeyChange = new UsmDHUserOwnPrivKeyChangeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.usmDHUserAuthKeyChange,
                                this.usmDHUserOwnAuthKeyChange,
                                this.usmDHUserPrivKeyChange,
                                this.usmDHUserOwnPrivKeyChange
                            };
                        }
                        public static final class UsmDHUserAuthKeyChangeEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHUserAuthKeyChangeEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHUserAuthKeyChange", "1.3.6.1.3.101.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmDHUserOwnAuthKeyChangeEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHUserOwnAuthKeyChangeEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHUserOwnAuthKeyChange", "1.3.6.1.3.101.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmDHUserPrivKeyChangeEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHUserPrivKeyChangeEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHUserPrivKeyChange", "1.3.6.1.3.101.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmDHUserOwnPrivKeyChangeEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHUserOwnPrivKeyChangeEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHUserOwnPrivKeyChange", "1.3.6.1.3.101.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class UsmDHKickstartGroupEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
            {
                public final UsmDHKickstartTableEnt usmDHKickstartTable;

                private UsmDHKickstartGroupEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                {
                    super(mib, parent, "usmDHKickstartGroup", "1.3.6.1.3.101.1.2", false, false, false, false);
                    this.usmDHKickstartTable = new UsmDHKickstartTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmDHKickstartTable
                    };
                }
                public static final class UsmDHKickstartTableEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    public final UsmDHKickstartEntryEnt usmDHKickstartEntry;

                    private UsmDHKickstartTableEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHKickstartTable", "1.3.6.1.3.101.1.2.1", false, true, false, false);
                        this.usmDHKickstartEntry = new UsmDHKickstartEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.usmDHKickstartEntry
                        };
                    }
                    public static final class UsmDHKickstartEntryEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                    {
                        public final UsmDHKickstartIndexEnt usmDHKickstartIndex;

                        public final UsmDHKickstartMyPublicEnt usmDHKickstartMyPublic;

                        public final UsmDHKickstartMgrPublicEnt usmDHKickstartMgrPublic;

                        public final UsmDHKickstartSecurityNameEnt usmDHKickstartSecurityName;

                        private UsmDHKickstartEntryEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                        {
                            super(mib, parent, "usmDHKickstartEntry", "1.3.6.1.3.101.1.2.1.1", false, false, false, true);
                            this.usmDHKickstartIndex = new UsmDHKickstartIndexEnt(mib, this);
                            this.usmDHKickstartMyPublic = new UsmDHKickstartMyPublicEnt(mib, this);
                            this.usmDHKickstartMgrPublic = new UsmDHKickstartMgrPublicEnt(mib, this);
                            this.usmDHKickstartSecurityName = new UsmDHKickstartSecurityNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.usmDHKickstartIndex,
                                this.usmDHKickstartMyPublic,
                                this.usmDHKickstartMgrPublic,
                                this.usmDHKickstartSecurityName
                            };
                        }
                        public static final class UsmDHKickstartIndexEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHKickstartIndexEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHKickstartIndex", "1.3.6.1.3.101.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmDHKickstartMyPublicEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHKickstartMyPublicEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHKickstartMyPublic", "1.3.6.1.3.101.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmDHKickstartMgrPublicEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHKickstartMgrPublicEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHKickstartMgrPublic", "1.3.6.1.3.101.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmDHKickstartSecurityNameEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                        {
                            private UsmDHKickstartSecurityNameEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                            {
                                super(mib, parent, "usmDHKickstartSecurityName", "1.3.6.1.3.101.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class UsmDHKeyConformanceEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
        {
            /** Conformance Information*/
            public final UsmDHKeyMIBCompliancesEnt usmDHKeyMIBCompliances;

            public final UsmDHKeyMIBGroupsEnt usmDHKeyMIBGroups;

            private UsmDHKeyConformanceEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
            {
                super(mib, parent, "usmDHKeyConformance", "1.3.6.1.3.101.2", false, false, false, false);
                this.usmDHKeyMIBCompliances = new UsmDHKeyMIBCompliancesEnt(mib, this);
                this.usmDHKeyMIBGroups = new UsmDHKeyMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usmDHKeyMIBCompliances,
                    this.usmDHKeyMIBGroups
                };
            }
            public static final class UsmDHKeyMIBCompliancesEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
            {
                /** Compliance statements*/
                public final UsmDHKeyMIBComplianceEnt usmDHKeyMIBCompliance;

                private UsmDHKeyMIBCompliancesEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                {
                    super(mib, parent, "usmDHKeyMIBCompliances", "1.3.6.1.3.101.2.1", false, false, false, false);
                    this.usmDHKeyMIBCompliance = new UsmDHKeyMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmDHKeyMIBCompliance
                    };
                }
                public static final class UsmDHKeyMIBComplianceEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    private UsmDHKeyMIBComplianceEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHKeyMIBCompliance", "1.3.6.1.3.101.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UsmDHKeyMIBGroupsEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
            {
                /** Units of Compliance*/
                public final UsmDHKeyMIBBasicGroupEnt usmDHKeyMIBBasicGroup;

                public final UsmDHKeyParamGroupEnt usmDHKeyParamGroup;

                public final UsmDHKeyKickstartGroupEnt usmDHKeyKickstartGroup;

                private UsmDHKeyMIBGroupsEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                {
                    super(mib, parent, "usmDHKeyMIBGroups", "1.3.6.1.3.101.2.2", false, false, false, false);
                    this.usmDHKeyMIBBasicGroup = new UsmDHKeyMIBBasicGroupEnt(mib, this);
                    this.usmDHKeyParamGroup = new UsmDHKeyParamGroupEnt(mib, this);
                    this.usmDHKeyKickstartGroup = new UsmDHKeyKickstartGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmDHKeyMIBBasicGroup,
                        this.usmDHKeyParamGroup,
                        this.usmDHKeyKickstartGroup
                    };
                }
                public static final class UsmDHKeyMIBBasicGroupEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    private UsmDHKeyMIBBasicGroupEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHKeyMIBBasicGroup", "1.3.6.1.3.101.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmDHKeyParamGroupEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    private UsmDHKeyParamGroupEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHKeyParamGroup", "1.3.6.1.3.101.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmDHKeyKickstartGroupEnt extends MIBEntry<SNMPUSMDHOBJECTSMIBDef>
                {
                    private UsmDHKeyKickstartGroupEnt(SNMPUSMDHOBJECTSMIBDef mib, MIBEntry<SNMPUSMDHOBJECTSMIBDef> parent)
                    {
                        super(mib, parent, "usmDHKeyKickstartGroup", "1.3.6.1.3.101.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
