package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 2578
RFC 2580
RFC 2788
RFC 4001*/
public final class SIPUAMIBDef extends MIB
{
    public static final SIPUAMIBDef SIPUAMIB = new SIPUAMIBDef();

    static { MIBs.getInstance().registerMIB(SIPUAMIBDef.SIPUAMIB); }

    /** RFC 4780*/
    public final SipUAMIBEnt sipUAMIB;

    private SIPUAMIBDef()
    {
        super("SIP-UA-MIB");
        this.sipUAMIB = new SipUAMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.sipUAMIB
        };
    }

    public static final class SipUAMIBEnt extends MIBEntry<SIPUAMIBDef>
    {
        /** Top-Level Components of this MIB.*/
        public final SipUAMIBObjectsEnt sipUAMIBObjects;

        public final SipUAMIBConformanceEnt sipUAMIBConformance;

        private SipUAMIBEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
        {
            super(mib, parent, "sipUAMIB", "1.3.6.1.2.1.150", false, false, false, false);
            this.sipUAMIBObjects = new SipUAMIBObjectsEnt(mib, this);
            this.sipUAMIBConformance = new SipUAMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sipUAMIBObjects,
                this.sipUAMIBConformance
            };
        }
        public static final class SipUAMIBObjectsEnt extends MIBEntry<SIPUAMIBDef>
        {
            /** This MIB contains objects related to SIP User Agents.*/
            public final SipUACfgServerEnt sipUACfgServer;

            private SipUAMIBObjectsEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
            {
                super(mib, parent, "sipUAMIBObjects", "1.3.6.1.2.1.150.1", false, false, false, false);
                this.sipUACfgServer = new SipUACfgServerEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipUACfgServer
                };
            }
            public static final class SipUACfgServerEnt extends MIBEntry<SIPUAMIBDef>
            {
                /** SIP Server Configuration*/
                public final SipUACfgServerTableEnt sipUACfgServerTable;

                private SipUACfgServerEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                {
                    super(mib, parent, "sipUACfgServer", "1.3.6.1.2.1.150.1.1", false, false, false, false);
                    this.sipUACfgServerTable = new SipUACfgServerTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipUACfgServerTable
                    };
                }
                public static final class SipUACfgServerTableEnt extends MIBEntry<SIPUAMIBDef>
                {
                    public final SipUACfgServerEntryEnt sipUACfgServerEntry;

                    private SipUACfgServerTableEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                    {
                        super(mib, parent, "sipUACfgServerTable", "1.3.6.1.2.1.150.1.1.1", false, true, false, false);
                        this.sipUACfgServerEntry = new SipUACfgServerEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sipUACfgServerEntry
                        };
                    }
                    public static final class SipUACfgServerEntryEnt extends MIBEntry<SIPUAMIBDef>
                    {
                        public final SipUACfgServerIndexEnt sipUACfgServerIndex;

                        public final SipUACfgServerAddressTypeEnt sipUACfgServerAddressType;

                        public final SipUACfgServerAddressEnt sipUACfgServerAddress;

                        public final SipUACfgServerRoleEnt sipUACfgServerRole;

                        private SipUACfgServerEntryEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                        {
                            super(mib, parent, "sipUACfgServerEntry", "1.3.6.1.2.1.150.1.1.1.1", false, false, false, true);
                            this.sipUACfgServerIndex = new SipUACfgServerIndexEnt(mib, this);
                            this.sipUACfgServerAddressType = new SipUACfgServerAddressTypeEnt(mib, this);
                            this.sipUACfgServerAddress = new SipUACfgServerAddressEnt(mib, this);
                            this.sipUACfgServerRole = new SipUACfgServerRoleEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sipUACfgServerIndex,
                                this.sipUACfgServerAddressType,
                                this.sipUACfgServerAddress,
                                this.sipUACfgServerRole
                            };
                        }
                        public static final class SipUACfgServerIndexEnt extends MIBEntry<SIPUAMIBDef>
                        {
                            private SipUACfgServerIndexEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                            {
                                super(mib, parent, "sipUACfgServerIndex", "1.3.6.1.2.1.150.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipUACfgServerAddressTypeEnt extends MIBEntry<SIPUAMIBDef>
                        {
                            private SipUACfgServerAddressTypeEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                            {
                                super(mib, parent, "sipUACfgServerAddressType", "1.3.6.1.2.1.150.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipUACfgServerAddressEnt extends MIBEntry<SIPUAMIBDef>
                        {
                            private SipUACfgServerAddressEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                            {
                                super(mib, parent, "sipUACfgServerAddress", "1.3.6.1.2.1.150.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SipUACfgServerRoleEnt extends MIBEntry<SIPUAMIBDef>
                        {
                            private SipUACfgServerRoleEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                            {
                                super(mib, parent, "sipUACfgServerRole", "1.3.6.1.2.1.150.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class SipUAMIBConformanceEnt extends MIBEntry<SIPUAMIBDef>
        {
            /** Conformance*/
            public final SipUAMIBCompliancesEnt sipUAMIBCompliances;

            public final SipUAMIBGroupsEnt sipUAMIBGroups;

            private SipUAMIBConformanceEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
            {
                super(mib, parent, "sipUAMIBConformance", "1.3.6.1.2.1.150.2", false, false, false, false);
                this.sipUAMIBCompliances = new SipUAMIBCompliancesEnt(mib, this);
                this.sipUAMIBGroups = new SipUAMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sipUAMIBCompliances,
                    this.sipUAMIBGroups
                };
            }
            public static final class SipUAMIBCompliancesEnt extends MIBEntry<SIPUAMIBDef>
            {
                /** Compliance Statements*/
                public final SipUAComplianceEnt sipUACompliance;

                private SipUAMIBCompliancesEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                {
                    super(mib, parent, "sipUAMIBCompliances", "1.3.6.1.2.1.150.2.1", false, false, false, false);
                    this.sipUACompliance = new SipUAComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipUACompliance
                    };
                }
                public static final class SipUAComplianceEnt extends MIBEntry<SIPUAMIBDef>
                {
                    private SipUAComplianceEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                    {
                        super(mib, parent, "sipUACompliance", "1.3.6.1.2.1.150.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SipUAMIBGroupsEnt extends MIBEntry<SIPUAMIBDef>
            {
                /** Units of Conformance*/
                public final SipUAConfigGroupEnt sipUAConfigGroup;

                private SipUAMIBGroupsEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                {
                    super(mib, parent, "sipUAMIBGroups", "1.3.6.1.2.1.150.2.2", false, false, false, false);
                    this.sipUAConfigGroup = new SipUAConfigGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sipUAConfigGroup
                    };
                }
                public static final class SipUAConfigGroupEnt extends MIBEntry<SIPUAMIBDef>
                {
                    private SipUAConfigGroupEnt(SIPUAMIBDef mib, MIBEntry<SIPUAMIBDef> parent)
                    {
                        super(mib, parent, "sipUAConfigGroup", "1.3.6.1.2.1.150.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
