package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPMPDMIBDef extends MIB
{
    public static final SNMPMPDMIBDef SNMPMPDMIB = new SNMPMPDMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPMPDMIBDef.SNMPMPDMIB); }

    public final SnmpMPDMIBEnt snmpMPDMIB;

    private SNMPMPDMIBDef()
    {
        super("SNMP-MPD-MIB");
        this.snmpMPDMIB = new SnmpMPDMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpMPDMIB
        };
    }

    public static final class SnmpMPDMIBEnt extends MIBEntry<SNMPMPDMIBDef>
    {
        /** Administrative assignments ****************************************/
        public final SnmpMPDAdminEnt snmpMPDAdmin;

        public final SnmpMPDMIBObjectsEnt snmpMPDMIBObjects;

        public final SnmpMPDMIBConformanceEnt snmpMPDMIBConformance;

        private SnmpMPDMIBEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
        {
            super(mib, parent, "snmpMPDMIB", "1.3.6.1.6.3.11", false, false, false, false);
            this.snmpMPDAdmin = new SnmpMPDAdminEnt(mib, this);
            this.snmpMPDMIBObjects = new SnmpMPDMIBObjectsEnt(mib, this);
            this.snmpMPDMIBConformance = new SnmpMPDMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpMPDAdmin,
                this.snmpMPDMIBObjects,
                this.snmpMPDMIBConformance
            };
        }
        public static final class SnmpMPDAdminEnt extends MIBEntry<SNMPMPDMIBDef>
        {
            private SnmpMPDAdminEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
            {
                super(mib, parent, "snmpMPDAdmin", "1.3.6.1.6.3.11.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpMPDMIBObjectsEnt extends MIBEntry<SNMPMPDMIBDef>
        {
            /** Statistics for SNMP Messages **************************************/
            public final SnmpMPDStatsEnt snmpMPDStats;

            private SnmpMPDMIBObjectsEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
            {
                super(mib, parent, "snmpMPDMIBObjects", "1.3.6.1.6.3.11.2", false, false, false, false);
                this.snmpMPDStats = new SnmpMPDStatsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpMPDStats
                };
            }
            public static final class SnmpMPDStatsEnt extends MIBEntry<SNMPMPDMIBDef>
            {
                public final SnmpUnknownSecurityModelsEnt snmpUnknownSecurityModels;

                public final SnmpInvalidMsgsEnt snmpInvalidMsgs;

                public final SnmpUnknownPDUHandlersEnt snmpUnknownPDUHandlers;

                private SnmpMPDStatsEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                {
                    super(mib, parent, "snmpMPDStats", "1.3.6.1.6.3.11.2.1", false, false, false, false);
                    this.snmpUnknownSecurityModels = new SnmpUnknownSecurityModelsEnt(mib, this);
                    this.snmpInvalidMsgs = new SnmpInvalidMsgsEnt(mib, this);
                    this.snmpUnknownPDUHandlers = new SnmpUnknownPDUHandlersEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpUnknownSecurityModels,
                        this.snmpInvalidMsgs,
                        this.snmpUnknownPDUHandlers
                    };
                }
                public static final class SnmpUnknownSecurityModelsEnt extends MIBEntry<SNMPMPDMIBDef>
                {
                    private SnmpUnknownSecurityModelsEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                    {
                        super(mib, parent, "snmpUnknownSecurityModels", "1.3.6.1.6.3.11.2.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpInvalidMsgsEnt extends MIBEntry<SNMPMPDMIBDef>
                {
                    private SnmpInvalidMsgsEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                    {
                        super(mib, parent, "snmpInvalidMsgs", "1.3.6.1.6.3.11.2.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpUnknownPDUHandlersEnt extends MIBEntry<SNMPMPDMIBDef>
                {
                    private SnmpUnknownPDUHandlersEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                    {
                        super(mib, parent, "snmpUnknownPDUHandlers", "1.3.6.1.6.3.11.2.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SnmpMPDMIBConformanceEnt extends MIBEntry<SNMPMPDMIBDef>
        {
            /** Conformance information *******************************************/
            public final SnmpMPDMIBCompliancesEnt snmpMPDMIBCompliances;

            public final SnmpMPDMIBGroupsEnt snmpMPDMIBGroups;

            private SnmpMPDMIBConformanceEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
            {
                super(mib, parent, "snmpMPDMIBConformance", "1.3.6.1.6.3.11.3", false, false, false, false);
                this.snmpMPDMIBCompliances = new SnmpMPDMIBCompliancesEnt(mib, this);
                this.snmpMPDMIBGroups = new SnmpMPDMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpMPDMIBCompliances,
                    this.snmpMPDMIBGroups
                };
            }
            public static final class SnmpMPDMIBCompliancesEnt extends MIBEntry<SNMPMPDMIBDef>
            {
                /** Compliance statements*/
                public final SnmpMPDComplianceEnt snmpMPDCompliance;

                private SnmpMPDMIBCompliancesEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                {
                    super(mib, parent, "snmpMPDMIBCompliances", "1.3.6.1.6.3.11.3.1", false, false, false, false);
                    this.snmpMPDCompliance = new SnmpMPDComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpMPDCompliance
                    };
                }
                public static final class SnmpMPDComplianceEnt extends MIBEntry<SNMPMPDMIBDef>
                {
                    private SnmpMPDComplianceEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                    {
                        super(mib, parent, "snmpMPDCompliance", "1.3.6.1.6.3.11.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpMPDMIBGroupsEnt extends MIBEntry<SNMPMPDMIBDef>
            {
                public final SnmpMPDGroupEnt snmpMPDGroup;

                private SnmpMPDMIBGroupsEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                {
                    super(mib, parent, "snmpMPDMIBGroups", "1.3.6.1.6.3.11.3.2", false, false, false, false);
                    this.snmpMPDGroup = new SnmpMPDGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpMPDGroup
                    };
                }
                public static final class SnmpMPDGroupEnt extends MIBEntry<SNMPMPDMIBDef>
                {
                    private SnmpMPDGroupEnt(SNMPMPDMIBDef mib, MIBEntry<SNMPMPDMIBDef> parent)
                    {
                        super(mib, parent, "snmpMPDGroup", "1.3.6.1.6.3.11.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
