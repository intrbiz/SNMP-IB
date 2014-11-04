package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPPROXYMIBDef extends MIB
{
    public static final SNMPPROXYMIBDef SNMPPROXYMIB = new SNMPPROXYMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPPROXYMIBDef.SNMPPROXYMIB); }

    public final SnmpProxyMIBEnt snmpProxyMIB;

    private SNMPPROXYMIBDef()
    {
        super("SNMP-PROXY-MIB");
        this.snmpProxyMIB = new SnmpProxyMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpProxyMIB
        };
    }

    public static final class SnmpProxyMIBEnt extends MIBEntry<SNMPPROXYMIBDef>
    {
        public final SnmpProxyObjectsEnt snmpProxyObjects;

        public final SnmpProxyConformanceEnt snmpProxyConformance;

        private SnmpProxyMIBEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
        {
            super(mib, parent, "snmpProxyMIB", "1.3.6.1.6.3.14", false, false, false, false);
            this.snmpProxyObjects = new SnmpProxyObjectsEnt(mib, this);
            this.snmpProxyConformance = new SnmpProxyConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpProxyObjects,
                this.snmpProxyConformance
            };
        }
        public static final class SnmpProxyObjectsEnt extends MIBEntry<SNMPPROXYMIBDef>
        {
            /** The snmpProxyObjects group*/
            public final SnmpProxyTableEnt snmpProxyTable;

            private SnmpProxyObjectsEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
            {
                super(mib, parent, "snmpProxyObjects", "1.3.6.1.6.3.14.1", false, false, false, false);
                this.snmpProxyTable = new SnmpProxyTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpProxyTable
                };
            }
            public static final class SnmpProxyTableEnt extends MIBEntry<SNMPPROXYMIBDef>
            {
                public final SnmpProxyEntryEnt snmpProxyEntry;

                private SnmpProxyTableEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                {
                    super(mib, parent, "snmpProxyTable", "1.3.6.1.6.3.14.1.2", false, true, false, false);
                    this.snmpProxyEntry = new SnmpProxyEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpProxyEntry
                    };
                }
                public static final class SnmpProxyEntryEnt extends MIBEntry<SNMPPROXYMIBDef>
                {
                    public final SnmpProxyNameEnt snmpProxyName;

                    public final SnmpProxyTypeEnt snmpProxyType;

                    public final SnmpProxyContextEngineIDEnt snmpProxyContextEngineID;

                    public final SnmpProxyContextNameEnt snmpProxyContextName;

                    public final SnmpProxyTargetParamsInEnt snmpProxyTargetParamsIn;

                    public final SnmpProxySingleTargetOutEnt snmpProxySingleTargetOut;

                    public final SnmpProxyMultipleTargetOutEnt snmpProxyMultipleTargetOut;

                    public final SnmpProxyStorageTypeEnt snmpProxyStorageType;

                    public final SnmpProxyRowStatusEnt snmpProxyRowStatus;

                    private SnmpProxyEntryEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                    {
                        super(mib, parent, "snmpProxyEntry", "1.3.6.1.6.3.14.1.2.1", false, false, false, true);
                        this.snmpProxyName = new SnmpProxyNameEnt(mib, this);
                        this.snmpProxyType = new SnmpProxyTypeEnt(mib, this);
                        this.snmpProxyContextEngineID = new SnmpProxyContextEngineIDEnt(mib, this);
                        this.snmpProxyContextName = new SnmpProxyContextNameEnt(mib, this);
                        this.snmpProxyTargetParamsIn = new SnmpProxyTargetParamsInEnt(mib, this);
                        this.snmpProxySingleTargetOut = new SnmpProxySingleTargetOutEnt(mib, this);
                        this.snmpProxyMultipleTargetOut = new SnmpProxyMultipleTargetOutEnt(mib, this);
                        this.snmpProxyStorageType = new SnmpProxyStorageTypeEnt(mib, this);
                        this.snmpProxyRowStatus = new SnmpProxyRowStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpProxyName,
                            this.snmpProxyType,
                            this.snmpProxyContextEngineID,
                            this.snmpProxyContextName,
                            this.snmpProxyTargetParamsIn,
                            this.snmpProxySingleTargetOut,
                            this.snmpProxyMultipleTargetOut,
                            this.snmpProxyStorageType,
                            this.snmpProxyRowStatus
                        };
                    }
                    public static final class SnmpProxyNameEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyNameEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyName", "1.3.6.1.6.3.14.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyTypeEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyTypeEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyType", "1.3.6.1.6.3.14.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyContextEngineIDEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyContextEngineIDEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyContextEngineID", "1.3.6.1.6.3.14.1.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyContextNameEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyContextNameEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyContextName", "1.3.6.1.6.3.14.1.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyTargetParamsInEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyTargetParamsInEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyTargetParamsIn", "1.3.6.1.6.3.14.1.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxySingleTargetOutEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxySingleTargetOutEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxySingleTargetOut", "1.3.6.1.6.3.14.1.2.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyMultipleTargetOutEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyMultipleTargetOutEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyMultipleTargetOut", "1.3.6.1.6.3.14.1.2.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyStorageTypeEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyStorageTypeEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyStorageType", "1.3.6.1.6.3.14.1.2.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpProxyRowStatusEnt extends MIBEntry<SNMPPROXYMIBDef>
                    {
                        private SnmpProxyRowStatusEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                        {
                            super(mib, parent, "snmpProxyRowStatus", "1.3.6.1.6.3.14.1.2.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SnmpProxyConformanceEnt extends MIBEntry<SNMPPROXYMIBDef>
        {
            /** Conformance information*/
            public final SnmpProxyCompliancesEnt snmpProxyCompliances;

            public final SnmpProxyGroupsEnt snmpProxyGroups;

            private SnmpProxyConformanceEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
            {
                super(mib, parent, "snmpProxyConformance", "1.3.6.1.6.3.14.3", false, false, false, false);
                this.snmpProxyCompliances = new SnmpProxyCompliancesEnt(mib, this);
                this.snmpProxyGroups = new SnmpProxyGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpProxyCompliances,
                    this.snmpProxyGroups
                };
            }
            public static final class SnmpProxyCompliancesEnt extends MIBEntry<SNMPPROXYMIBDef>
            {
                /** Compliance statements*/
                public final SnmpProxyComplianceEnt snmpProxyCompliance;

                private SnmpProxyCompliancesEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                {
                    super(mib, parent, "snmpProxyCompliances", "1.3.6.1.6.3.14.3.1", false, false, false, false);
                    this.snmpProxyCompliance = new SnmpProxyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpProxyCompliance
                    };
                }
                public static final class SnmpProxyComplianceEnt extends MIBEntry<SNMPPROXYMIBDef>
                {
                    private SnmpProxyComplianceEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                    {
                        super(mib, parent, "snmpProxyCompliance", "1.3.6.1.6.3.14.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpProxyGroupsEnt extends MIBEntry<SNMPPROXYMIBDef>
            {
                public final SnmpProxyGroupEnt snmpProxyGroup;

                private SnmpProxyGroupsEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                {
                    super(mib, parent, "snmpProxyGroups", "1.3.6.1.6.3.14.3.2", false, false, false, false);
                    this.snmpProxyGroup = new SnmpProxyGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpProxyGroup
                    };
                }
                public static final class SnmpProxyGroupEnt extends MIBEntry<SNMPPROXYMIBDef>
                {
                    private SnmpProxyGroupEnt(SNMPPROXYMIBDef mib, MIBEntry<SNMPPROXYMIBDef> parent)
                    {
                        super(mib, parent, "snmpProxyGroup", "1.3.6.1.6.3.14.3.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
