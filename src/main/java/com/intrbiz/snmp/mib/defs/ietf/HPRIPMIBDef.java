package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class HPRIPMIBDef extends MIB
{
    public static final HPRIPMIBDef HPRIPMIB = new HPRIPMIBDef();

    /** September 24, 1998*/
    public final HprIpEnt hprIp;

    /** *******************************************************************Conformance Statement*******************************************************************Definitions imported from the HPR MIB:hprConformance      OBJECT IDENTIFIER ::= { hprMIB 2 }hprCompliances      OBJECT IDENTIFIER ::= { hprConformance 1 }hprGroups           OBJECT IDENTIFIER ::= { hprConformance 2 }
Compliance statements*/
    public final HprIpComplianceEnt hprIpCompliance;

    /** Group definitions*/
    public final HprIpMonitoringGroupEnt hprIpMonitoringGroup;

    public final HprIpConfigurationGroupEnt hprIpConfigurationGroup;

    private HPRIPMIBDef()
    {
        super("HPR-IP-MIB");
        this.hprIp = new HprIpEnt(this, null);
        this.hprIpCompliance = new HprIpComplianceEnt(this, null);
        this.hprIpMonitoringGroup = new HprIpMonitoringGroupEnt(this, null);
        this.hprIpConfigurationGroup = new HprIpConfigurationGroupEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hprIp,
            this.hprIpCompliance,
            this.hprIpMonitoringGroup,
            this.hprIpConfigurationGroup
        };
    }

    public static final class HprIpEnt extends MIBEntry<HPRIPMIBDef>
    {
        /** *******************************************************************
hprObjects              OBJECT IDENTIFIER ::= { hprMIB 1 }*******************************************************************
*******************************************************************HPR over IP Monitoring GroupThis group contains a single table, the hprIsActiveLsTable,providing a  count of UDP packets sent with each type ofAPPN traffic on each active link supporting HPR over IP.********************************************************************/
        public final HprIpActiveLsTableEnt hprIpActiveLsTable;

        /** *******************************************************************HPR over IP Configuration GroupThis group contains three tables for reading and setting themapping between APPN traffic types and values for the TOSPrecedence bits in the IP header.  hprIpAppnPortTOSPrecedencerepresents the APPN port-level mapping.  This mapping can beoverridden for an individual link station or an individualconnection network via, respectively, the hprIpLsTOSPrecedenceand the hprIpCnTOSPrecedence objects.********************************************************************/
        public final HprIpAppnPortTableEnt hprIpAppnPortTable;

        /** ********************************************************************/
        public final HprIpLsTableEnt hprIpLsTable;

        /** ********************************************************************/
        public final HprIpCnTableEnt hprIpCnTable;

        private HprIpEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
        {
            super(mib, parent, "hprIp", "1.3.6.1.2.1.34.6.1.5", false, false, false, false);
            this.hprIpActiveLsTable = new HprIpActiveLsTableEnt(mib, this);
            this.hprIpAppnPortTable = new HprIpAppnPortTableEnt(mib, this);
            this.hprIpLsTable = new HprIpLsTableEnt(mib, this);
            this.hprIpCnTable = new HprIpCnTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hprIpActiveLsTable,
                this.hprIpAppnPortTable,
                this.hprIpLsTable,
                this.hprIpCnTable
            };
        }
        public static final class HprIpActiveLsTableEnt extends MIBEntry<HPRIPMIBDef>
        {
            public final HprIpActiveLsEntryEnt hprIpActiveLsEntry;

            private HprIpActiveLsTableEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
            {
                super(mib, parent, "hprIpActiveLsTable", "1.3.6.1.2.1.34.6.1.5.1", false, true, false, false);
                this.hprIpActiveLsEntry = new HprIpActiveLsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hprIpActiveLsEntry
                };
            }
            public static final class HprIpActiveLsEntryEnt extends MIBEntry<HPRIPMIBDef>
            {
                public final HprIpActiveLsLsNameEnt hprIpActiveLsLsName;

                public final HprIpActiveLsAppnTrafficTypeEnt hprIpActiveLsAppnTrafficType;

                public final HprIpActiveLsUdpPacketsEnt hprIpActiveLsUdpPackets;

                private HprIpActiveLsEntryEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                {
                    super(mib, parent, "hprIpActiveLsEntry", "1.3.6.1.2.1.34.6.1.5.1.1", false, false, false, true);
                    this.hprIpActiveLsLsName = new HprIpActiveLsLsNameEnt(mib, this);
                    this.hprIpActiveLsAppnTrafficType = new HprIpActiveLsAppnTrafficTypeEnt(mib, this);
                    this.hprIpActiveLsUdpPackets = new HprIpActiveLsUdpPacketsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprIpActiveLsLsName,
                        this.hprIpActiveLsAppnTrafficType,
                        this.hprIpActiveLsUdpPackets
                    };
                }
                public static final class HprIpActiveLsLsNameEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpActiveLsLsNameEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpActiveLsLsName", "1.3.6.1.2.1.34.6.1.5.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpActiveLsAppnTrafficTypeEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpActiveLsAppnTrafficTypeEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpActiveLsAppnTrafficType", "1.3.6.1.2.1.34.6.1.5.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpActiveLsUdpPacketsEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpActiveLsUdpPacketsEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpActiveLsUdpPackets", "1.3.6.1.2.1.34.6.1.5.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class HprIpAppnPortTableEnt extends MIBEntry<HPRIPMIBDef>
        {
            public final HprIpAppnPortEntryEnt hprIpAppnPortEntry;

            private HprIpAppnPortTableEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
            {
                super(mib, parent, "hprIpAppnPortTable", "1.3.6.1.2.1.34.6.1.5.2", false, true, false, false);
                this.hprIpAppnPortEntry = new HprIpAppnPortEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hprIpAppnPortEntry
                };
            }
            public static final class HprIpAppnPortEntryEnt extends MIBEntry<HPRIPMIBDef>
            {
                public final HprIpAppnPortNameEnt hprIpAppnPortName;

                public final HprIpAppnPortAppnTrafficTypeEnt hprIpAppnPortAppnTrafficType;

                public final HprIpAppnPortTOSPrecedenceEnt hprIpAppnPortTOSPrecedence;

                private HprIpAppnPortEntryEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                {
                    super(mib, parent, "hprIpAppnPortEntry", "1.3.6.1.2.1.34.6.1.5.2.1", false, false, false, true);
                    this.hprIpAppnPortName = new HprIpAppnPortNameEnt(mib, this);
                    this.hprIpAppnPortAppnTrafficType = new HprIpAppnPortAppnTrafficTypeEnt(mib, this);
                    this.hprIpAppnPortTOSPrecedence = new HprIpAppnPortTOSPrecedenceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprIpAppnPortName,
                        this.hprIpAppnPortAppnTrafficType,
                        this.hprIpAppnPortTOSPrecedence
                    };
                }
                public static final class HprIpAppnPortNameEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpAppnPortNameEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpAppnPortName", "1.3.6.1.2.1.34.6.1.5.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpAppnPortAppnTrafficTypeEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpAppnPortAppnTrafficTypeEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpAppnPortAppnTrafficType", "1.3.6.1.2.1.34.6.1.5.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpAppnPortTOSPrecedenceEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpAppnPortTOSPrecedenceEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpAppnPortTOSPrecedence", "1.3.6.1.2.1.34.6.1.5.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class HprIpLsTableEnt extends MIBEntry<HPRIPMIBDef>
        {
            public final HprIpLsEntryEnt hprIpLsEntry;

            private HprIpLsTableEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
            {
                super(mib, parent, "hprIpLsTable", "1.3.6.1.2.1.34.6.1.5.3", false, true, false, false);
                this.hprIpLsEntry = new HprIpLsEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hprIpLsEntry
                };
            }
            public static final class HprIpLsEntryEnt extends MIBEntry<HPRIPMIBDef>
            {
                public final HprIpLsLsNameEnt hprIpLsLsName;

                public final HprIpLsAppnTrafficTypeEnt hprIpLsAppnTrafficType;

                public final HprIpLsTOSPrecedenceEnt hprIpLsTOSPrecedence;

                public final HprIpLsRowStatusEnt hprIpLsRowStatus;

                private HprIpLsEntryEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                {
                    super(mib, parent, "hprIpLsEntry", "1.3.6.1.2.1.34.6.1.5.3.1", false, false, false, true);
                    this.hprIpLsLsName = new HprIpLsLsNameEnt(mib, this);
                    this.hprIpLsAppnTrafficType = new HprIpLsAppnTrafficTypeEnt(mib, this);
                    this.hprIpLsTOSPrecedence = new HprIpLsTOSPrecedenceEnt(mib, this);
                    this.hprIpLsRowStatus = new HprIpLsRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprIpLsLsName,
                        this.hprIpLsAppnTrafficType,
                        this.hprIpLsTOSPrecedence,
                        this.hprIpLsRowStatus
                    };
                }
                public static final class HprIpLsLsNameEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpLsLsNameEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpLsLsName", "1.3.6.1.2.1.34.6.1.5.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpLsAppnTrafficTypeEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpLsAppnTrafficTypeEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpLsAppnTrafficType", "1.3.6.1.2.1.34.6.1.5.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpLsTOSPrecedenceEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpLsTOSPrecedenceEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpLsTOSPrecedence", "1.3.6.1.2.1.34.6.1.5.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpLsRowStatusEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpLsRowStatusEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpLsRowStatus", "1.3.6.1.2.1.34.6.1.5.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class HprIpCnTableEnt extends MIBEntry<HPRIPMIBDef>
        {
            public final HprIpCnEntryEnt hprIpCnEntry;

            private HprIpCnTableEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
            {
                super(mib, parent, "hprIpCnTable", "1.3.6.1.2.1.34.6.1.5.4", false, true, false, false);
                this.hprIpCnEntry = new HprIpCnEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hprIpCnEntry
                };
            }
            public static final class HprIpCnEntryEnt extends MIBEntry<HPRIPMIBDef>
            {
                public final HprIpCnVrnNameEnt hprIpCnVrnName;

                public final HprIpCnAppnTrafficTypeEnt hprIpCnAppnTrafficType;

                public final HprIpCnTOSPrecedenceEnt hprIpCnTOSPrecedence;

                public final HprIpCnRowStatusEnt hprIpCnRowStatus;

                private HprIpCnEntryEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                {
                    super(mib, parent, "hprIpCnEntry", "1.3.6.1.2.1.34.6.1.5.4.1", false, false, false, true);
                    this.hprIpCnVrnName = new HprIpCnVrnNameEnt(mib, this);
                    this.hprIpCnAppnTrafficType = new HprIpCnAppnTrafficTypeEnt(mib, this);
                    this.hprIpCnTOSPrecedence = new HprIpCnTOSPrecedenceEnt(mib, this);
                    this.hprIpCnRowStatus = new HprIpCnRowStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.hprIpCnVrnName,
                        this.hprIpCnAppnTrafficType,
                        this.hprIpCnTOSPrecedence,
                        this.hprIpCnRowStatus
                    };
                }
                public static final class HprIpCnVrnNameEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpCnVrnNameEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpCnVrnName", "1.3.6.1.2.1.34.6.1.5.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpCnAppnTrafficTypeEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpCnAppnTrafficTypeEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpCnAppnTrafficType", "1.3.6.1.2.1.34.6.1.5.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpCnTOSPrecedenceEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpCnTOSPrecedenceEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpCnTOSPrecedence", "1.3.6.1.2.1.34.6.1.5.4.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class HprIpCnRowStatusEnt extends MIBEntry<HPRIPMIBDef>
                {
                    private HprIpCnRowStatusEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
                    {
                        super(mib, parent, "hprIpCnRowStatus", "1.3.6.1.2.1.34.6.1.5.4.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class HprIpComplianceEnt extends MIBEntry<HPRIPMIBDef>
    {
        private HprIpComplianceEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
        {
            super(mib, parent, "hprIpCompliance", "1.3.6.1.2.1.34.6.2.1.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HprIpMonitoringGroupEnt extends MIBEntry<HPRIPMIBDef>
    {
        private HprIpMonitoringGroupEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
        {
            super(mib, parent, "hprIpMonitoringGroup", "1.3.6.1.2.1.34.6.2.2.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HprIpConfigurationGroupEnt extends MIBEntry<HPRIPMIBDef>
    {
        private HprIpConfigurationGroupEnt(HPRIPMIBDef mib, MIBEntry<HPRIPMIBDef> parent)
        {
            super(mib, parent, "hprIpConfigurationGroup", "1.3.6.1.2.1.34.6.2.2.6", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
