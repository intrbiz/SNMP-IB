package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SNMPFRAMEWORKMIBDef extends MIB
{
    public static final SNMPFRAMEWORKMIBDef SNMPFRAMEWORKMIB = new SNMPFRAMEWORKMIBDef();

    public final SnmpFrameworkMIBEnt snmpFrameworkMIB;

    private SNMPFRAMEWORKMIBDef()
    {
        super("SNMP-FRAMEWORK-MIB");
        this.snmpFrameworkMIB = new SnmpFrameworkMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpFrameworkMIB
        };
    }

    public static final class SnmpFrameworkMIBEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
    {
        /** Administrative assignments ****************************************/
        public final SnmpFrameworkAdminEnt snmpFrameworkAdmin;

        public final SnmpFrameworkMIBObjectsEnt snmpFrameworkMIBObjects;

        public final SnmpFrameworkMIBConformanceEnt snmpFrameworkMIBConformance;

        private SnmpFrameworkMIBEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
        {
            super(mib, parent, "snmpFrameworkMIB", "1.3.6.1.6.3.10", false, false, false, false);
            this.snmpFrameworkAdmin = new SnmpFrameworkAdminEnt(mib, this);
            this.snmpFrameworkMIBObjects = new SnmpFrameworkMIBObjectsEnt(mib, this);
            this.snmpFrameworkMIBConformance = new SnmpFrameworkMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpFrameworkAdmin,
                this.snmpFrameworkMIBObjects,
                this.snmpFrameworkMIBConformance
            };
        }
        public static final class SnmpFrameworkAdminEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
        {
            /** Registration Points for Authentication and Privacy Protocols ***/
            public final SnmpAuthProtocolsEnt snmpAuthProtocols;

            public final SnmpPrivProtocolsEnt snmpPrivProtocols;

            private SnmpFrameworkAdminEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
            {
                super(mib, parent, "snmpFrameworkAdmin", "1.3.6.1.6.3.10.1", false, false, false, false);
                this.snmpAuthProtocols = new SnmpAuthProtocolsEnt(mib, this);
                this.snmpPrivProtocols = new SnmpPrivProtocolsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpAuthProtocols,
                    this.snmpPrivProtocols
                };
            }
            public static final class SnmpAuthProtocolsEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
            {
                private SnmpAuthProtocolsEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                {
                    super(mib, parent, "snmpAuthProtocols", "1.3.6.1.6.3.10.1.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class SnmpPrivProtocolsEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
            {
                private SnmpPrivProtocolsEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                {
                    super(mib, parent, "snmpPrivProtocols", "1.3.6.1.6.3.10.1.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class SnmpFrameworkMIBObjectsEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
        {
            /** the snmpEngine Group *********************************************/
            public final SnmpEngineEnt snmpEngine;

            private SnmpFrameworkMIBObjectsEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
            {
                super(mib, parent, "snmpFrameworkMIBObjects", "1.3.6.1.6.3.10.2", false, false, false, false);
                this.snmpEngine = new SnmpEngineEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpEngine
                };
            }
            public static final class SnmpEngineEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
            {
                public final SnmpEngineIDEnt snmpEngineID;

                public final SnmpEngineBootsEnt snmpEngineBoots;

                public final SnmpEngineTimeEnt snmpEngineTime;

                public final SnmpEngineMaxMessageSizeEnt snmpEngineMaxMessageSize;

                private SnmpEngineEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                {
                    super(mib, parent, "snmpEngine", "1.3.6.1.6.3.10.2.1", false, false, false, false);
                    this.snmpEngineID = new SnmpEngineIDEnt(mib, this);
                    this.snmpEngineBoots = new SnmpEngineBootsEnt(mib, this);
                    this.snmpEngineTime = new SnmpEngineTimeEnt(mib, this);
                    this.snmpEngineMaxMessageSize = new SnmpEngineMaxMessageSizeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpEngineID,
                        this.snmpEngineBoots,
                        this.snmpEngineTime,
                        this.snmpEngineMaxMessageSize
                    };
                }
                public static final class SnmpEngineIDEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
                {
                    private SnmpEngineIDEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                    {
                        super(mib, parent, "snmpEngineID", "1.3.6.1.6.3.10.2.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpEngineBootsEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
                {
                    private SnmpEngineBootsEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                    {
                        super(mib, parent, "snmpEngineBoots", "1.3.6.1.6.3.10.2.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpEngineTimeEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
                {
                    private SnmpEngineTimeEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                    {
                        super(mib, parent, "snmpEngineTime", "1.3.6.1.6.3.10.2.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpEngineMaxMessageSizeEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
                {
                    private SnmpEngineMaxMessageSizeEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                    {
                        super(mib, parent, "snmpEngineMaxMessageSize", "1.3.6.1.6.3.10.2.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SnmpFrameworkMIBConformanceEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
        {
            /** Conformance information *******************************************/
            public final SnmpFrameworkMIBCompliancesEnt snmpFrameworkMIBCompliances;

            public final SnmpFrameworkMIBGroupsEnt snmpFrameworkMIBGroups;

            private SnmpFrameworkMIBConformanceEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
            {
                super(mib, parent, "snmpFrameworkMIBConformance", "1.3.6.1.6.3.10.3", false, false, false, false);
                this.snmpFrameworkMIBCompliances = new SnmpFrameworkMIBCompliancesEnt(mib, this);
                this.snmpFrameworkMIBGroups = new SnmpFrameworkMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpFrameworkMIBCompliances,
                    this.snmpFrameworkMIBGroups
                };
            }
            public static final class SnmpFrameworkMIBCompliancesEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
            {
                /** compliance statements*/
                public final SnmpFrameworkMIBComplianceEnt snmpFrameworkMIBCompliance;

                private SnmpFrameworkMIBCompliancesEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                {
                    super(mib, parent, "snmpFrameworkMIBCompliances", "1.3.6.1.6.3.10.3.1", false, false, false, false);
                    this.snmpFrameworkMIBCompliance = new SnmpFrameworkMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpFrameworkMIBCompliance
                    };
                }
                public static final class SnmpFrameworkMIBComplianceEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
                {
                    private SnmpFrameworkMIBComplianceEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                    {
                        super(mib, parent, "snmpFrameworkMIBCompliance", "1.3.6.1.6.3.10.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpFrameworkMIBGroupsEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
            {
                /** units of conformance*/
                public final SnmpEngineGroupEnt snmpEngineGroup;

                private SnmpFrameworkMIBGroupsEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                {
                    super(mib, parent, "snmpFrameworkMIBGroups", "1.3.6.1.6.3.10.3.2", false, false, false, false);
                    this.snmpEngineGroup = new SnmpEngineGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpEngineGroup
                    };
                }
                public static final class SnmpEngineGroupEnt extends MIBEntry<SNMPFRAMEWORKMIBDef>
                {
                    private SnmpEngineGroupEnt(SNMPFRAMEWORKMIBDef mib, MIBEntry<SNMPFRAMEWORKMIBDef> parent)
                    {
                        super(mib, parent, "snmpEngineGroup", "1.3.6.1.6.3.10.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
