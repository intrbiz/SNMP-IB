package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class SNMPv2MIBDef extends MIB
{
    public static final SNMPv2MIBDef SNMPv2MIB = new SNMPv2MIBDef();

    public final SnmpMIBEnt snmpMIB;

    /** ::= { snmpMIBObjects 1 }        this OID is obsolete::= { snmpMIBObjects 2 }        this OID is obsolete::= { snmpMIBObjects 3 }        this OID is obsolete
the System groupa collection of objects common to all managed systems.*/
    public final SystemEnt system;

    /** the SNMP groupa collection of objects providing basic instrumentation andcontrol of an SNMP entity.*/
    public final SnmpEnt snmp;

    private SNMPv2MIBDef()
    {
        super("SNMPv2-MIB");
        this.snmpMIB = new SnmpMIBEnt(this, null);
        this.system = new SystemEnt(this, null);
        this.snmp = new SnmpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpMIB,
            this.system,
            this.snmp
        };
    }

    public static final class SnmpMIBEnt extends MIBEntry<SNMPv2MIBDef>
    {
        public final SnmpMIBObjectsEnt snmpMIBObjects;

        /** conformance information*/
        public final SnmpMIBConformanceEnt snmpMIBConformance;

        private SnmpMIBEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
        {
            super(mib, parent, "snmpMIB", "1.3.6.1.6.3.1", false, false, false, false);
            this.snmpMIBObjects = new SnmpMIBObjectsEnt(mib, this);
            this.snmpMIBConformance = new SnmpMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpMIBObjects,
                this.snmpMIBConformance
            };
        }
        public static final class SnmpMIBObjectsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            /** information for notificationsa collection of objects which allow the SNMP entity, whensupporting a notification originator application,to be configured to generate SNMPv2-Trap-PDUs.*/
            public final SnmpTrapEnt snmpTrap;

            /** ::= { snmpTrap 4 }   this OID is obsolete

well-known traps*/
            public final SnmpTrapsEnt snmpTraps;

            /** Note the egpNeighborLoss notification is definedas { snmpTraps 6 } in RFC 1213
the set groupa collection of objects which allow several cooperatingcommand generator applications to coordinate their use of theset operation.*/
            public final SnmpSetEnt snmpSet;

            private SnmpMIBObjectsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpMIBObjects", "1.3.6.1.6.3.1.1", false, false, false, false);
                this.snmpTrap = new SnmpTrapEnt(mib, this);
                this.snmpTraps = new SnmpTrapsEnt(mib, this);
                this.snmpSet = new SnmpSetEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpTrap,
                    this.snmpTraps,
                    this.snmpSet
                };
            }
            public static final class SnmpTrapEnt extends MIBEntry<SNMPv2MIBDef>
            {
                public final SnmpTrapOIDEnt snmpTrapOID;

                /** ::= { snmpTrap 2 }   this OID is obsolete*/
                public final SnmpTrapEnterpriseEnt snmpTrapEnterprise;

                private SnmpTrapEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                {
                    super(mib, parent, "snmpTrap", "1.3.6.1.6.3.1.1.4", false, false, false, false);
                    this.snmpTrapOID = new SnmpTrapOIDEnt(mib, this);
                    this.snmpTrapEnterprise = new SnmpTrapEnterpriseEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpTrapOID,
                        this.snmpTrapEnterprise
                    };
                }
                public static final class SnmpTrapOIDEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpTrapOIDEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpTrapOID", "1.3.6.1.6.3.1.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpTrapEnterpriseEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpTrapEnterpriseEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpTrapEnterprise", "1.3.6.1.6.3.1.1.4.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpTrapsEnt extends MIBEntry<SNMPv2MIBDef>
            {
                public final ColdStartEnt coldStart;

                public final WarmStartEnt warmStart;

                /** Note the linkDown NOTIFICATION-TYPE ::= { snmpTraps 3 }and the linkUp NOTIFICATION-TYPE ::= { snmpTraps 4 }are defined in RFC 2863 [RFC2863]*/
                public final AuthenticationFailureEnt authenticationFailure;

                private SnmpTrapsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                {
                    super(mib, parent, "snmpTraps", "1.3.6.1.6.3.1.1.5", false, false, false, false);
                    this.coldStart = new ColdStartEnt(mib, this);
                    this.warmStart = new WarmStartEnt(mib, this);
                    this.authenticationFailure = new AuthenticationFailureEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.coldStart,
                        this.warmStart,
                        this.authenticationFailure
                    };
                }
                public static final class ColdStartEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private ColdStartEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "coldStart", "1.3.6.1.6.3.1.1.5.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class WarmStartEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private WarmStartEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "warmStart", "1.3.6.1.6.3.1.1.5.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AuthenticationFailureEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private AuthenticationFailureEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "authenticationFailure", "1.3.6.1.6.3.1.1.5.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpSetEnt extends MIBEntry<SNMPv2MIBDef>
            {
                public final SnmpSetSerialNoEnt snmpSetSerialNo;

                private SnmpSetEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                {
                    super(mib, parent, "snmpSet", "1.3.6.1.6.3.1.1.6", false, false, false, false);
                    this.snmpSetSerialNo = new SnmpSetSerialNoEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpSetSerialNo
                    };
                }
                public static final class SnmpSetSerialNoEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpSetSerialNoEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpSetSerialNo", "1.3.6.1.6.3.1.1.6.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class SnmpMIBConformanceEnt extends MIBEntry<SNMPv2MIBDef>
        {
            public final SnmpMIBCompliancesEnt snmpMIBCompliances;

            public final SnmpMIBGroupsEnt snmpMIBGroups;

            private SnmpMIBConformanceEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpMIBConformance", "1.3.6.1.6.3.1.2", false, false, false, false);
                this.snmpMIBCompliances = new SnmpMIBCompliancesEnt(mib, this);
                this.snmpMIBGroups = new SnmpMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpMIBCompliances,
                    this.snmpMIBGroups
                };
            }
            public static final class SnmpMIBCompliancesEnt extends MIBEntry<SNMPv2MIBDef>
            {
                /** compliance statements



::= { snmpMIBCompliances 1 }      this OID is obsolete*/
                public final SnmpBasicComplianceEnt snmpBasicCompliance;

                public final SnmpBasicComplianceRev2Ent snmpBasicComplianceRev2;

                private SnmpMIBCompliancesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                {
                    super(mib, parent, "snmpMIBCompliances", "1.3.6.1.6.3.1.2.1", false, false, false, false);
                    this.snmpBasicCompliance = new SnmpBasicComplianceEnt(mib, this);
                    this.snmpBasicComplianceRev2 = new SnmpBasicComplianceRev2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpBasicCompliance,
                        this.snmpBasicComplianceRev2
                    };
                }
                public static final class SnmpBasicComplianceEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpBasicComplianceEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpBasicCompliance", "1.3.6.1.6.3.1.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpBasicComplianceRev2Ent extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpBasicComplianceRev2Ent(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpBasicComplianceRev2", "1.3.6.1.6.3.1.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SnmpMIBGroupsEnt extends MIBEntry<SNMPv2MIBDef>
            {
                /** units of conformance
::= { snmpMIBGroups 1 }           this OID is obsolete::= { snmpMIBGroups 2 }           this OID is obsolete::= { snmpMIBGroups 3 }           this OID is obsolete


::= { snmpMIBGroups 4 }           this OID is obsolete*/
                public final SnmpGroupEnt snmpGroup;

                public final SnmpCommunityGroupEnt snmpCommunityGroup;

                public final SnmpSetGroupEnt snmpSetGroup;

                public final SystemGroupEnt systemGroup;

                public final SnmpBasicNotificationsGroupEnt snmpBasicNotificationsGroup;

                public final SnmpWarmStartNotificationGroupEnt snmpWarmStartNotificationGroup;

                public final SnmpNotificationGroupEnt snmpNotificationGroup;

                public final SnmpObsoleteGroupEnt snmpObsoleteGroup;

                private SnmpMIBGroupsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                {
                    super(mib, parent, "snmpMIBGroups", "1.3.6.1.6.3.1.2.2", false, false, false, false);
                    this.snmpGroup = new SnmpGroupEnt(mib, this);
                    this.snmpCommunityGroup = new SnmpCommunityGroupEnt(mib, this);
                    this.snmpSetGroup = new SnmpSetGroupEnt(mib, this);
                    this.systemGroup = new SystemGroupEnt(mib, this);
                    this.snmpBasicNotificationsGroup = new SnmpBasicNotificationsGroupEnt(mib, this);
                    this.snmpWarmStartNotificationGroup = new SnmpWarmStartNotificationGroupEnt(mib, this);
                    this.snmpNotificationGroup = new SnmpNotificationGroupEnt(mib, this);
                    this.snmpObsoleteGroup = new SnmpObsoleteGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpGroup,
                        this.snmpCommunityGroup,
                        this.snmpSetGroup,
                        this.systemGroup,
                        this.snmpBasicNotificationsGroup,
                        this.snmpWarmStartNotificationGroup,
                        this.snmpNotificationGroup,
                        this.snmpObsoleteGroup
                    };
                }
                public static final class SnmpGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpGroup", "1.3.6.1.6.3.1.2.2.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpCommunityGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpCommunityGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpCommunityGroup", "1.3.6.1.6.3.1.2.2.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpSetGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpSetGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpSetGroup", "1.3.6.1.6.3.1.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SystemGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SystemGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "systemGroup", "1.3.6.1.6.3.1.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpBasicNotificationsGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpBasicNotificationsGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpBasicNotificationsGroup", "1.3.6.1.6.3.1.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpWarmStartNotificationGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpWarmStartNotificationGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpWarmStartNotificationGroup", "1.3.6.1.6.3.1.2.2.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpNotificationGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpNotificationGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpNotificationGroup", "1.3.6.1.6.3.1.2.2.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SnmpObsoleteGroupEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SnmpObsoleteGroupEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "snmpObsoleteGroup", "1.3.6.1.6.3.1.2.2.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SystemEnt extends MIBEntry<SNMPv2MIBDef>
    {
        public final SysDescrEnt sysDescr;

        public final SysObjectIDEnt sysObjectID;

        public final SysUpTimeEnt sysUpTime;

        public final SysContactEnt sysContact;

        public final SysNameEnt sysName;

        public final SysLocationEnt sysLocation;

        public final SysServicesEnt sysServices;

        /** object resource informationa collection of objects which describe the SNMP entity's(statically and dynamically configurable) support ofvarious MIB modules.*/
        public final SysORLastChangeEnt sysORLastChange;

        public final SysORTableEnt sysORTable;

        private SystemEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
        {
            super(mib, parent, "system", "1.3.6.1.2.1.1", false, false, false, false);
            this.sysDescr = new SysDescrEnt(mib, this);
            this.sysObjectID = new SysObjectIDEnt(mib, this);
            this.sysUpTime = new SysUpTimeEnt(mib, this);
            this.sysContact = new SysContactEnt(mib, this);
            this.sysName = new SysNameEnt(mib, this);
            this.sysLocation = new SysLocationEnt(mib, this);
            this.sysServices = new SysServicesEnt(mib, this);
            this.sysORLastChange = new SysORLastChangeEnt(mib, this);
            this.sysORTable = new SysORTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sysDescr,
                this.sysObjectID,
                this.sysUpTime,
                this.sysContact,
                this.sysName,
                this.sysLocation,
                this.sysServices,
                this.sysORLastChange,
                this.sysORTable
            };
        }
        public static final class SysDescrEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysDescrEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysDescr", "1.3.6.1.2.1.1.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysObjectIDEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysObjectIDEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysObjectID", "1.3.6.1.2.1.1.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysUpTimeEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysUpTimeEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysUpTime", "1.3.6.1.2.1.1.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysContactEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysContactEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysContact", "1.3.6.1.2.1.1.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysNameEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysNameEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysName", "1.3.6.1.2.1.1.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysLocationEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysLocationEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysLocation", "1.3.6.1.2.1.1.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysServicesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysServicesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysServices", "1.3.6.1.2.1.1.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysORLastChangeEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SysORLastChangeEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysORLastChange", "1.3.6.1.2.1.1.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysORTableEnt extends MIBEntry<SNMPv2MIBDef>
        {
            public final SysOREntryEnt sysOREntry;

            private SysORTableEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "sysORTable", "1.3.6.1.2.1.1.9", false, true, false, false);
                this.sysOREntry = new SysOREntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sysOREntry
                };
            }
            public static final class SysOREntryEnt extends MIBEntry<SNMPv2MIBDef>
            {
                public final SysORIndexEnt sysORIndex;

                public final SysORIDEnt sysORID;

                public final SysORDescrEnt sysORDescr;

                public final SysORUpTimeEnt sysORUpTime;

                private SysOREntryEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                {
                    super(mib, parent, "sysOREntry", "1.3.6.1.2.1.1.9.1", false, false, false, true);
                    this.sysORIndex = new SysORIndexEnt(mib, this);
                    this.sysORID = new SysORIDEnt(mib, this);
                    this.sysORDescr = new SysORDescrEnt(mib, this);
                    this.sysORUpTime = new SysORUpTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sysORIndex,
                        this.sysORID,
                        this.sysORDescr,
                        this.sysORUpTime
                    };
                }
                public static final class SysORIndexEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SysORIndexEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "sysORIndex", "1.3.6.1.2.1.1.9.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysORIDEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SysORIDEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "sysORID", "1.3.6.1.2.1.1.9.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysORDescrEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SysORDescrEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "sysORDescr", "1.3.6.1.2.1.1.9.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SysORUpTimeEnt extends MIBEntry<SNMPv2MIBDef>
                {
                    private SysORUpTimeEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
                    {
                        super(mib, parent, "sysORUpTime", "1.3.6.1.2.1.1.9.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class SnmpEnt extends MIBEntry<SNMPv2MIBDef>
    {
        public final SnmpInPktsEnt snmpInPkts;

        public final SnmpInBadVersionsEnt snmpInBadVersions;

        public final SnmpInBadCommunityNamesEnt snmpInBadCommunityNames;

        public final SnmpInBadCommunityUsesEnt snmpInBadCommunityUses;

        public final SnmpInASNParseErrsEnt snmpInASNParseErrs;

        public final SnmpEnableAuthenTrapsEnt snmpEnableAuthenTraps;

        public final SnmpSilentDropsEnt snmpSilentDrops;

        public final SnmpProxyDropsEnt snmpProxyDrops;

        /** definitions in RFC 1213 made obsolete by the inclusion of asubset of the snmp group in this MIB*/
        public final SnmpOutPktsEnt snmpOutPkts;

        /** { snmp 7 } is not used*/
        public final SnmpInTooBigsEnt snmpInTooBigs;

        public final SnmpInNoSuchNamesEnt snmpInNoSuchNames;

        public final SnmpInBadValuesEnt snmpInBadValues;

        public final SnmpInReadOnlysEnt snmpInReadOnlys;

        public final SnmpInGenErrsEnt snmpInGenErrs;

        public final SnmpInTotalReqVarsEnt snmpInTotalReqVars;

        public final SnmpInTotalSetVarsEnt snmpInTotalSetVars;

        public final SnmpInGetRequestsEnt snmpInGetRequests;

        public final SnmpInGetNextsEnt snmpInGetNexts;

        public final SnmpInSetRequestsEnt snmpInSetRequests;

        public final SnmpInGetResponsesEnt snmpInGetResponses;

        public final SnmpInTrapsEnt snmpInTraps;

        public final SnmpOutTooBigsEnt snmpOutTooBigs;

        public final SnmpOutNoSuchNamesEnt snmpOutNoSuchNames;

        public final SnmpOutBadValuesEnt snmpOutBadValues;

        /** { snmp 23 } is not used*/
        public final SnmpOutGenErrsEnt snmpOutGenErrs;

        public final SnmpOutGetRequestsEnt snmpOutGetRequests;

        public final SnmpOutGetNextsEnt snmpOutGetNexts;

        public final SnmpOutSetRequestsEnt snmpOutSetRequests;

        public final SnmpOutGetResponsesEnt snmpOutGetResponses;

        public final SnmpOutTrapsEnt snmpOutTraps;

        private SnmpEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
        {
            super(mib, parent, "snmp", "1.3.6.1.2.1.11", false, false, false, false);
            this.snmpInPkts = new SnmpInPktsEnt(mib, this);
            this.snmpInBadVersions = new SnmpInBadVersionsEnt(mib, this);
            this.snmpInBadCommunityNames = new SnmpInBadCommunityNamesEnt(mib, this);
            this.snmpInBadCommunityUses = new SnmpInBadCommunityUsesEnt(mib, this);
            this.snmpInASNParseErrs = new SnmpInASNParseErrsEnt(mib, this);
            this.snmpEnableAuthenTraps = new SnmpEnableAuthenTrapsEnt(mib, this);
            this.snmpSilentDrops = new SnmpSilentDropsEnt(mib, this);
            this.snmpProxyDrops = new SnmpProxyDropsEnt(mib, this);
            this.snmpOutPkts = new SnmpOutPktsEnt(mib, this);
            this.snmpInTooBigs = new SnmpInTooBigsEnt(mib, this);
            this.snmpInNoSuchNames = new SnmpInNoSuchNamesEnt(mib, this);
            this.snmpInBadValues = new SnmpInBadValuesEnt(mib, this);
            this.snmpInReadOnlys = new SnmpInReadOnlysEnt(mib, this);
            this.snmpInGenErrs = new SnmpInGenErrsEnt(mib, this);
            this.snmpInTotalReqVars = new SnmpInTotalReqVarsEnt(mib, this);
            this.snmpInTotalSetVars = new SnmpInTotalSetVarsEnt(mib, this);
            this.snmpInGetRequests = new SnmpInGetRequestsEnt(mib, this);
            this.snmpInGetNexts = new SnmpInGetNextsEnt(mib, this);
            this.snmpInSetRequests = new SnmpInSetRequestsEnt(mib, this);
            this.snmpInGetResponses = new SnmpInGetResponsesEnt(mib, this);
            this.snmpInTraps = new SnmpInTrapsEnt(mib, this);
            this.snmpOutTooBigs = new SnmpOutTooBigsEnt(mib, this);
            this.snmpOutNoSuchNames = new SnmpOutNoSuchNamesEnt(mib, this);
            this.snmpOutBadValues = new SnmpOutBadValuesEnt(mib, this);
            this.snmpOutGenErrs = new SnmpOutGenErrsEnt(mib, this);
            this.snmpOutGetRequests = new SnmpOutGetRequestsEnt(mib, this);
            this.snmpOutGetNexts = new SnmpOutGetNextsEnt(mib, this);
            this.snmpOutSetRequests = new SnmpOutSetRequestsEnt(mib, this);
            this.snmpOutGetResponses = new SnmpOutGetResponsesEnt(mib, this);
            this.snmpOutTraps = new SnmpOutTrapsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpInPkts,
                this.snmpInBadVersions,
                this.snmpInBadCommunityNames,
                this.snmpInBadCommunityUses,
                this.snmpInASNParseErrs,
                this.snmpEnableAuthenTraps,
                this.snmpSilentDrops,
                this.snmpProxyDrops,
                this.snmpOutPkts,
                this.snmpInTooBigs,
                this.snmpInNoSuchNames,
                this.snmpInBadValues,
                this.snmpInReadOnlys,
                this.snmpInGenErrs,
                this.snmpInTotalReqVars,
                this.snmpInTotalSetVars,
                this.snmpInGetRequests,
                this.snmpInGetNexts,
                this.snmpInSetRequests,
                this.snmpInGetResponses,
                this.snmpInTraps,
                this.snmpOutTooBigs,
                this.snmpOutNoSuchNames,
                this.snmpOutBadValues,
                this.snmpOutGenErrs,
                this.snmpOutGetRequests,
                this.snmpOutGetNexts,
                this.snmpOutSetRequests,
                this.snmpOutGetResponses,
                this.snmpOutTraps
            };
        }
        public static final class SnmpInPktsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInPktsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInPkts", "1.3.6.1.2.1.11.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadVersionsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInBadVersionsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInBadVersions", "1.3.6.1.2.1.11.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadCommunityNamesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInBadCommunityNamesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInBadCommunityNames", "1.3.6.1.2.1.11.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadCommunityUsesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInBadCommunityUsesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInBadCommunityUses", "1.3.6.1.2.1.11.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInASNParseErrsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInASNParseErrsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInASNParseErrs", "1.3.6.1.2.1.11.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpEnableAuthenTrapsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpEnableAuthenTrapsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpEnableAuthenTraps", "1.3.6.1.2.1.11.30", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpSilentDropsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpSilentDropsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpSilentDrops", "1.3.6.1.2.1.11.31", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpProxyDropsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpProxyDropsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpProxyDrops", "1.3.6.1.2.1.11.32", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutPktsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutPktsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutPkts", "1.3.6.1.2.1.11.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTooBigsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInTooBigsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInTooBigs", "1.3.6.1.2.1.11.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInNoSuchNamesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInNoSuchNamesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInNoSuchNames", "1.3.6.1.2.1.11.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadValuesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInBadValuesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInBadValues", "1.3.6.1.2.1.11.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInReadOnlysEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInReadOnlysEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInReadOnlys", "1.3.6.1.2.1.11.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGenErrsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInGenErrsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInGenErrs", "1.3.6.1.2.1.11.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTotalReqVarsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInTotalReqVarsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInTotalReqVars", "1.3.6.1.2.1.11.13", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTotalSetVarsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInTotalSetVarsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInTotalSetVars", "1.3.6.1.2.1.11.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGetRequestsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInGetRequestsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInGetRequests", "1.3.6.1.2.1.11.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGetNextsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInGetNextsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInGetNexts", "1.3.6.1.2.1.11.16", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInSetRequestsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInSetRequestsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInSetRequests", "1.3.6.1.2.1.11.17", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGetResponsesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInGetResponsesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInGetResponses", "1.3.6.1.2.1.11.18", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTrapsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpInTrapsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpInTraps", "1.3.6.1.2.1.11.19", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutTooBigsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutTooBigsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutTooBigs", "1.3.6.1.2.1.11.20", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutNoSuchNamesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutNoSuchNamesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutNoSuchNames", "1.3.6.1.2.1.11.21", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutBadValuesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutBadValuesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutBadValues", "1.3.6.1.2.1.11.22", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGenErrsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutGenErrsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutGenErrs", "1.3.6.1.2.1.11.24", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGetRequestsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutGetRequestsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutGetRequests", "1.3.6.1.2.1.11.25", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGetNextsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutGetNextsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutGetNexts", "1.3.6.1.2.1.11.26", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutSetRequestsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutSetRequestsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutSetRequests", "1.3.6.1.2.1.11.27", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGetResponsesEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutGetResponsesEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutGetResponses", "1.3.6.1.2.1.11.28", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutTrapsEnt extends MIBEntry<SNMPv2MIBDef>
        {
            private SnmpOutTrapsEnt(SNMPv2MIBDef mib, MIBEntry<SNMPv2MIBDef> parent)
            {
                super(mib, parent, "snmpOutTraps", "1.3.6.1.2.1.11.29", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
