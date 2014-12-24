package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class RFC1158MIBDef extends MIB
{
    public static final RFC1158MIBDef RFC1158MIB = new RFC1158MIBDef();

    /** the path to the root*/
    public final OrgEnt org;

    /** ::= { snmpMIBObjects 1 }        this OID is obsolete::= { snmpMIBObjects 2 }        this OID is obsolete::= { snmpMIBObjects 3 }        this OID is obsolete
the System groupa collection of objects common to all managed systems.*/
    public final SystemEnt system;

    public final InterfacesEnt interfaces;

    public final AtEnt at;

    public final IpEnt ip;

    public final IcmpEnt icmp;

    public final TcpEnt tcp;

    public final UdpEnt udp;

    public final EgpEnt egp;

    /** the SNMP groupa collection of objects providing basic instrumentation andcontrol of an SNMP entity.*/
    public final SnmpEnt snmp;

    /** definitions of administrative identifiers*/
    public final ZeroDotZeroEnt zeroDotZero;

    public final SnmpInBadTypesEnt snmpInBadTypes;

    public final SnmpOutReadOnlysEnt snmpOutReadOnlys;

    private RFC1158MIBDef()
    {
        super("RFC1158-MIB");
        this.org = new OrgEnt(this, null);
        this.system = new SystemEnt(this, null);
        this.interfaces = new InterfacesEnt(this, null);
        this.at = new AtEnt(this, null);
        this.ip = new IpEnt(this, null);
        this.icmp = new IcmpEnt(this, null);
        this.tcp = new TcpEnt(this, null);
        this.udp = new UdpEnt(this, null);
        this.egp = new EgpEnt(this, null);
        this.snmp = new SnmpEnt(this, null);
        this.zeroDotZero = new ZeroDotZeroEnt(this, null);
        this.snmpInBadTypes = new SnmpInBadTypesEnt(this, null);
        this.snmpOutReadOnlys = new SnmpOutReadOnlysEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.org,
            this.system,
            this.interfaces,
            this.at,
            this.ip,
            this.icmp,
            this.tcp,
            this.udp,
            this.egp,
            this.snmp,
            this.zeroDotZero,
            this.snmpInBadTypes,
            this.snmpOutReadOnlys
        };
    }

    public static final class OrgEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** "iso" = 1*/
        public final DodEnt dod;

        private OrgEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "org", "1.3", false, false, false, false);
            this.dod = new DodEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dod
            };
        }
        public static final class DodEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final InternetEnt internet;

            private DodEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "dod", "1.3.6", false, false, false, false);
                this.internet = new InternetEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.internet
                };
            }
            public static final class InternetEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final MgmtEnt mgmt;

                private InternetEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "internet", "1.3.6.1", false, false, false, false);
                    this.mgmt = new MgmtEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mgmt
                    };
                }
                public static final class MgmtEnt extends MIBEntry<RFC1158MIBDef>
                {
                    public final Mib2Ent mib2;

                    private MgmtEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "mgmt", "1.3.6.1.2", false, false, false, false);
                        this.mib2 = new Mib2Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mib2
                        };
                    }
                    public static final class Mib2Ent extends MIBEntry<RFC1158MIBDef>
                    {
                        public final TransmissionEnt transmission;

                        private Mib2Ent(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                        {
                            super(mib, parent, "mib-2", "1.3.6.1.2.1", false, false, false, false);
                            this.transmission = new TransmissionEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.transmission
                            };
                        }
                        public static final class TransmissionEnt extends MIBEntry<RFC1158MIBDef>
                        {
                            private TransmissionEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                            {
                                super(mib, parent, "transmission", "1.3.6.1.2.1.10", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

    }

    public static final class SystemEnt extends MIBEntry<RFC1158MIBDef>
    {
        public final SysDescrEnt sysDescr;

        public final SysObjectIDEnt sysObjectID;

        public final SysUpTimeEnt sysUpTime;

        public final SysContactEnt sysContact;

        public final SysNameEnt sysName;

        public final SysLocationEnt sysLocation;

        public final SysServicesEnt sysServices;

        private SystemEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "system", "1.3.6.1.2.1.1", false, false, false, false);
            this.sysDescr = new SysDescrEnt(mib, this);
            this.sysObjectID = new SysObjectIDEnt(mib, this);
            this.sysUpTime = new SysUpTimeEnt(mib, this);
            this.sysContact = new SysContactEnt(mib, this);
            this.sysName = new SysNameEnt(mib, this);
            this.sysLocation = new SysLocationEnt(mib, this);
            this.sysServices = new SysServicesEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sysDescr,
                this.sysObjectID,
                this.sysUpTime,
                this.sysContact,
                this.sysName,
                this.sysLocation,
                this.sysServices
            };
        }
        public static final class SysDescrEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysDescrEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysDescr", "1.3.6.1.2.1.1.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysObjectIDEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysObjectIDEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysObjectID", "1.3.6.1.2.1.1.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysUpTimeEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysUpTimeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysUpTime", "1.3.6.1.2.1.1.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysContactEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysContactEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysContact", "1.3.6.1.2.1.1.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysNameEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysNameEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysName", "1.3.6.1.2.1.1.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysLocationEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysLocationEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysLocation", "1.3.6.1.2.1.1.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SysServicesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SysServicesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "sysServices", "1.3.6.1.2.1.1.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class InterfacesEnt extends MIBEntry<RFC1158MIBDef>
    {
        public final IfNumberEnt ifNumber;

        /** the Interfaces table
The Interfaces table contains information on the entity's

interfaces.  Each sub-layer below the internetwork-layerof a network interface is considered to be an interface.*/
        public final IfTableEnt ifTable;

        private InterfacesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "interfaces", "1.3.6.1.2.1.2", false, false, false, false);
            this.ifNumber = new IfNumberEnt(mib, this);
            this.ifTable = new IfTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ifNumber,
                this.ifTable
            };
        }
        public static final class IfNumberEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IfNumberEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ifNumber", "1.3.6.1.2.1.2.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IfTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final IfEntryEnt ifEntry;

            private IfTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ifTable", "1.3.6.1.2.1.2.2", false, true, false, false);
                this.ifEntry = new IfEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifEntry
                };
            }
            public static final class IfEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final IfIndexEnt ifIndex;

                public final IfDescrEnt ifDescr;

                public final IfTypeEnt ifType;

                public final IfMtuEnt ifMtu;

                public final IfSpeedEnt ifSpeed;

                public final IfPhysAddressEnt ifPhysAddress;

                public final IfAdminStatusEnt ifAdminStatus;

                public final IfOperStatusEnt ifOperStatus;

                public final IfLastChangeEnt ifLastChange;

                public final IfInOctetsEnt ifInOctets;

                public final IfInUcastPktsEnt ifInUcastPkts;

                public final IfInNUcastPktsEnt ifInNUcastPkts;

                public final IfInDiscardsEnt ifInDiscards;

                public final IfInErrorsEnt ifInErrors;

                public final IfInUnknownProtosEnt ifInUnknownProtos;

                public final IfOutOctetsEnt ifOutOctets;

                public final IfOutUcastPktsEnt ifOutUcastPkts;

                public final IfOutNUcastPktsEnt ifOutNUcastPkts;

                public final IfOutDiscardsEnt ifOutDiscards;

                public final IfOutErrorsEnt ifOutErrors;

                public final IfOutQLenEnt ifOutQLen;

                public final IfSpecificEnt ifSpecific;

                private IfEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "ifEntry", "1.3.6.1.2.1.2.2.1", false, false, false, true);
                    this.ifIndex = new IfIndexEnt(mib, this);
                    this.ifDescr = new IfDescrEnt(mib, this);
                    this.ifType = new IfTypeEnt(mib, this);
                    this.ifMtu = new IfMtuEnt(mib, this);
                    this.ifSpeed = new IfSpeedEnt(mib, this);
                    this.ifPhysAddress = new IfPhysAddressEnt(mib, this);
                    this.ifAdminStatus = new IfAdminStatusEnt(mib, this);
                    this.ifOperStatus = new IfOperStatusEnt(mib, this);
                    this.ifLastChange = new IfLastChangeEnt(mib, this);
                    this.ifInOctets = new IfInOctetsEnt(mib, this);
                    this.ifInUcastPkts = new IfInUcastPktsEnt(mib, this);
                    this.ifInNUcastPkts = new IfInNUcastPktsEnt(mib, this);
                    this.ifInDiscards = new IfInDiscardsEnt(mib, this);
                    this.ifInErrors = new IfInErrorsEnt(mib, this);
                    this.ifInUnknownProtos = new IfInUnknownProtosEnt(mib, this);
                    this.ifOutOctets = new IfOutOctetsEnt(mib, this);
                    this.ifOutUcastPkts = new IfOutUcastPktsEnt(mib, this);
                    this.ifOutNUcastPkts = new IfOutNUcastPktsEnt(mib, this);
                    this.ifOutDiscards = new IfOutDiscardsEnt(mib, this);
                    this.ifOutErrors = new IfOutErrorsEnt(mib, this);
                    this.ifOutQLen = new IfOutQLenEnt(mib, this);
                    this.ifSpecific = new IfSpecificEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifIndex,
                        this.ifDescr,
                        this.ifType,
                        this.ifMtu,
                        this.ifSpeed,
                        this.ifPhysAddress,
                        this.ifAdminStatus,
                        this.ifOperStatus,
                        this.ifLastChange,
                        this.ifInOctets,
                        this.ifInUcastPkts,
                        this.ifInNUcastPkts,
                        this.ifInDiscards,
                        this.ifInErrors,
                        this.ifInUnknownProtos,
                        this.ifOutOctets,
                        this.ifOutUcastPkts,
                        this.ifOutNUcastPkts,
                        this.ifOutDiscards,
                        this.ifOutErrors,
                        this.ifOutQLen,
                        this.ifSpecific
                    };
                }
                public static final class IfIndexEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfIndexEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifIndex", "1.3.6.1.2.1.2.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfDescrEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfDescrEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifDescr", "1.3.6.1.2.1.2.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfTypeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfTypeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifType", "1.3.6.1.2.1.2.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfMtuEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfMtuEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifMtu", "1.3.6.1.2.1.2.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfSpeedEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfSpeedEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifSpeed", "1.3.6.1.2.1.2.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfPhysAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfPhysAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifPhysAddress", "1.3.6.1.2.1.2.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfAdminStatusEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfAdminStatusEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifAdminStatus", "1.3.6.1.2.1.2.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOperStatusEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOperStatusEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOperStatus", "1.3.6.1.2.1.2.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfLastChangeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfLastChangeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifLastChange", "1.3.6.1.2.1.2.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInOctetsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfInOctetsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifInOctets", "1.3.6.1.2.1.2.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInUcastPktsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfInUcastPktsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifInUcastPkts", "1.3.6.1.2.1.2.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInNUcastPktsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfInNUcastPktsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifInNUcastPkts", "1.3.6.1.2.1.2.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInDiscardsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfInDiscardsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifInDiscards", "1.3.6.1.2.1.2.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInErrorsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfInErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifInErrors", "1.3.6.1.2.1.2.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfInUnknownProtosEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfInUnknownProtosEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifInUnknownProtos", "1.3.6.1.2.1.2.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutOctetsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOutOctetsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOutOctets", "1.3.6.1.2.1.2.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutUcastPktsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOutUcastPktsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOutUcastPkts", "1.3.6.1.2.1.2.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutNUcastPktsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOutNUcastPktsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOutNUcastPkts", "1.3.6.1.2.1.2.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutDiscardsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOutDiscardsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOutDiscards", "1.3.6.1.2.1.2.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutErrorsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOutErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOutErrors", "1.3.6.1.2.1.2.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfOutQLenEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfOutQLenEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifOutQLen", "1.3.6.1.2.1.2.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IfSpecificEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IfSpecificEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ifSpecific", "1.3.6.1.2.1.2.2.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class AtEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** the Address Translation group
Implementation of the Address Translation group ismandatory for all systems.  Note however that this groupis deprecated by MIB-II. That is, it is being included
solely for compatibility with MIB-I nodes, and will mostlikely be excluded from MIB-III nodes.  From MIB-II andonwards, each network protocol group contains its ownaddress translation tables.
The Address Translation group contains one table which isthe union across all interfaces of the translation tablesfor converting a NetworkAddress (e.g., an IP address) intoa subnetwork-specific address.  For lack of a better term,this document refers to such a subnetwork-specific addressas a `physical' address.
Examples of such translation tables are: for broadcastmedia where ARP is in use, the translation table isequivalent to the ARP cache; or, on an X.25 network wherenon-algorithmic translation to X.121 addresses isrequired, the translation table contains theNetworkAddress to X.121 address equivalences.*/
        public final AtTableEnt atTable;

        private AtEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "at", "1.3.6.1.2.1.3", false, false, false, false);
            this.atTable = new AtTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.atTable
            };
        }
        public static final class AtTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final AtEntryEnt atEntry;

            private AtTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "atTable", "1.3.6.1.2.1.3.1", false, true, false, false);
                this.atEntry = new AtEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.atEntry
                };
            }
            public static final class AtEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final AtIfIndexEnt atIfIndex;

                public final AtPhysAddressEnt atPhysAddress;

                public final AtNetAddressEnt atNetAddress;

                private AtEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "atEntry", "1.3.6.1.2.1.3.1.1", false, false, false, true);
                    this.atIfIndex = new AtIfIndexEnt(mib, this);
                    this.atPhysAddress = new AtPhysAddressEnt(mib, this);
                    this.atNetAddress = new AtNetAddressEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.atIfIndex,
                        this.atPhysAddress,
                        this.atNetAddress
                    };
                }
                public static final class AtIfIndexEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private AtIfIndexEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "atIfIndex", "1.3.6.1.2.1.3.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtPhysAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private AtPhysAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "atPhysAddress", "1.3.6.1.2.1.3.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class AtNetAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private AtNetAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "atNetAddress", "1.3.6.1.2.1.3.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class IpEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** the IP group
Implementation of the IP group is mandatory for allsystems.*/
        public final IpForwardingEnt ipForwarding;

        public final IpDefaultTTLEnt ipDefaultTTL;

        public final IpInReceivesEnt ipInReceives;

        public final IpInHdrErrorsEnt ipInHdrErrors;

        public final IpInAddrErrorsEnt ipInAddrErrors;

        public final IpForwDatagramsEnt ipForwDatagrams;

        public final IpInUnknownProtosEnt ipInUnknownProtos;

        public final IpInDiscardsEnt ipInDiscards;

        public final IpInDeliversEnt ipInDelivers;

        public final IpOutRequestsEnt ipOutRequests;

        public final IpOutDiscardsEnt ipOutDiscards;

        public final IpOutNoRoutesEnt ipOutNoRoutes;

        public final IpReasmTimeoutEnt ipReasmTimeout;

        public final IpReasmReqdsEnt ipReasmReqds;

        public final IpReasmOKsEnt ipReasmOKs;

        public final IpReasmFailsEnt ipReasmFails;

        public final IpFragOKsEnt ipFragOKs;

        public final IpFragFailsEnt ipFragFails;

        public final IpFragCreatesEnt ipFragCreates;

        /** the IP address table
The IP address table contains this entity's IP addressinginformation.*/
        public final IpAddrTableEnt ipAddrTable;

        /** the IP routing table
The IP routing table contains an entry for each routepresently known to this entity.*/
        public final IpRouteTableEnt ipRouteTable;

        /** the IP Address Translation table
The IP address translation table contain the IpAddress to`physical' address equivalences.  Some interfaces do notuse translation tables for determining addressequivalences (e.g., DDN-X.25 has an algorithmic method);if all interfaces are of this type, then the AddressTranslation table is empty, i.e., has zero entries.*/
        public final IpNetToMediaTableEnt ipNetToMediaTable;

        private IpEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "ip", "1.3.6.1.2.1.4", false, false, false, false);
            this.ipForwarding = new IpForwardingEnt(mib, this);
            this.ipDefaultTTL = new IpDefaultTTLEnt(mib, this);
            this.ipInReceives = new IpInReceivesEnt(mib, this);
            this.ipInHdrErrors = new IpInHdrErrorsEnt(mib, this);
            this.ipInAddrErrors = new IpInAddrErrorsEnt(mib, this);
            this.ipForwDatagrams = new IpForwDatagramsEnt(mib, this);
            this.ipInUnknownProtos = new IpInUnknownProtosEnt(mib, this);
            this.ipInDiscards = new IpInDiscardsEnt(mib, this);
            this.ipInDelivers = new IpInDeliversEnt(mib, this);
            this.ipOutRequests = new IpOutRequestsEnt(mib, this);
            this.ipOutDiscards = new IpOutDiscardsEnt(mib, this);
            this.ipOutNoRoutes = new IpOutNoRoutesEnt(mib, this);
            this.ipReasmTimeout = new IpReasmTimeoutEnt(mib, this);
            this.ipReasmReqds = new IpReasmReqdsEnt(mib, this);
            this.ipReasmOKs = new IpReasmOKsEnt(mib, this);
            this.ipReasmFails = new IpReasmFailsEnt(mib, this);
            this.ipFragOKs = new IpFragOKsEnt(mib, this);
            this.ipFragFails = new IpFragFailsEnt(mib, this);
            this.ipFragCreates = new IpFragCreatesEnt(mib, this);
            this.ipAddrTable = new IpAddrTableEnt(mib, this);
            this.ipRouteTable = new IpRouteTableEnt(mib, this);
            this.ipNetToMediaTable = new IpNetToMediaTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ipForwarding,
                this.ipDefaultTTL,
                this.ipInReceives,
                this.ipInHdrErrors,
                this.ipInAddrErrors,
                this.ipForwDatagrams,
                this.ipInUnknownProtos,
                this.ipInDiscards,
                this.ipInDelivers,
                this.ipOutRequests,
                this.ipOutDiscards,
                this.ipOutNoRoutes,
                this.ipReasmTimeout,
                this.ipReasmReqds,
                this.ipReasmOKs,
                this.ipReasmFails,
                this.ipFragOKs,
                this.ipFragFails,
                this.ipFragCreates,
                this.ipAddrTable,
                this.ipRouteTable,
                this.ipNetToMediaTable
            };
        }
        public static final class IpForwardingEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpForwardingEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipForwarding", "1.3.6.1.2.1.4.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpDefaultTTLEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpDefaultTTLEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipDefaultTTL", "1.3.6.1.2.1.4.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInReceivesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpInReceivesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipInReceives", "1.3.6.1.2.1.4.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInHdrErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpInHdrErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipInHdrErrors", "1.3.6.1.2.1.4.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInAddrErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpInAddrErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipInAddrErrors", "1.3.6.1.2.1.4.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpForwDatagramsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpForwDatagramsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipForwDatagrams", "1.3.6.1.2.1.4.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInUnknownProtosEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpInUnknownProtosEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipInUnknownProtos", "1.3.6.1.2.1.4.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInDiscardsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpInDiscardsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipInDiscards", "1.3.6.1.2.1.4.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpInDeliversEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpInDeliversEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipInDelivers", "1.3.6.1.2.1.4.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpOutRequestsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpOutRequestsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipOutRequests", "1.3.6.1.2.1.4.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpOutDiscardsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpOutDiscardsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipOutDiscards", "1.3.6.1.2.1.4.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpOutNoRoutesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpOutNoRoutesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipOutNoRoutes", "1.3.6.1.2.1.4.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmTimeoutEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpReasmTimeoutEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipReasmTimeout", "1.3.6.1.2.1.4.13", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmReqdsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpReasmReqdsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipReasmReqds", "1.3.6.1.2.1.4.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmOKsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpReasmOKsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipReasmOKs", "1.3.6.1.2.1.4.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpReasmFailsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpReasmFailsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipReasmFails", "1.3.6.1.2.1.4.16", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpFragOKsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpFragOKsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipFragOKs", "1.3.6.1.2.1.4.17", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpFragFailsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpFragFailsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipFragFails", "1.3.6.1.2.1.4.18", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpFragCreatesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IpFragCreatesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipFragCreates", "1.3.6.1.2.1.4.19", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IpAddrTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final IpAddrEntryEnt ipAddrEntry;

            private IpAddrTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipAddrTable", "1.3.6.1.2.1.4.20", false, true, false, false);
                this.ipAddrEntry = new IpAddrEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipAddrEntry
                };
            }
            public static final class IpAddrEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final IpAdEntAddrEnt ipAdEntAddr;

                public final IpAdEntIfIndexEnt ipAdEntIfIndex;

                public final IpAdEntNetMaskEnt ipAdEntNetMask;

                public final IpAdEntBcastAddrEnt ipAdEntBcastAddr;

                public final IpAdEntReasmMaxSizeEnt ipAdEntReasmMaxSize;

                private IpAddrEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "ipAddrEntry", "1.3.6.1.2.1.4.20.1", false, false, false, true);
                    this.ipAdEntAddr = new IpAdEntAddrEnt(mib, this);
                    this.ipAdEntIfIndex = new IpAdEntIfIndexEnt(mib, this);
                    this.ipAdEntNetMask = new IpAdEntNetMaskEnt(mib, this);
                    this.ipAdEntBcastAddr = new IpAdEntBcastAddrEnt(mib, this);
                    this.ipAdEntReasmMaxSize = new IpAdEntReasmMaxSizeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipAdEntAddr,
                        this.ipAdEntIfIndex,
                        this.ipAdEntNetMask,
                        this.ipAdEntBcastAddr,
                        this.ipAdEntReasmMaxSize
                    };
                }
                public static final class IpAdEntAddrEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpAdEntAddrEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntAddr", "1.3.6.1.2.1.4.20.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntIfIndexEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpAdEntIfIndexEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntIfIndex", "1.3.6.1.2.1.4.20.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntNetMaskEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpAdEntNetMaskEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntNetMask", "1.3.6.1.2.1.4.20.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntBcastAddrEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpAdEntBcastAddrEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntBcastAddr", "1.3.6.1.2.1.4.20.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpAdEntReasmMaxSizeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpAdEntReasmMaxSizeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipAdEntReasmMaxSize", "1.3.6.1.2.1.4.20.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpRouteTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final IpRouteEntryEnt ipRouteEntry;

            private IpRouteTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipRouteTable", "1.3.6.1.2.1.4.21", false, true, false, false);
                this.ipRouteEntry = new IpRouteEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipRouteEntry
                };
            }
            public static final class IpRouteEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final IpRouteDestEnt ipRouteDest;

                public final IpRouteIfIndexEnt ipRouteIfIndex;

                public final IpRouteMetric1Ent ipRouteMetric1;

                public final IpRouteMetric2Ent ipRouteMetric2;

                public final IpRouteMetric3Ent ipRouteMetric3;

                public final IpRouteMetric4Ent ipRouteMetric4;

                public final IpRouteNextHopEnt ipRouteNextHop;

                public final IpRouteTypeEnt ipRouteType;

                public final IpRouteProtoEnt ipRouteProto;

                public final IpRouteAgeEnt ipRouteAge;

                public final IpRouteMaskEnt ipRouteMask;

                private IpRouteEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "ipRouteEntry", "1.3.6.1.2.1.4.21.1", false, false, false, true);
                    this.ipRouteDest = new IpRouteDestEnt(mib, this);
                    this.ipRouteIfIndex = new IpRouteIfIndexEnt(mib, this);
                    this.ipRouteMetric1 = new IpRouteMetric1Ent(mib, this);
                    this.ipRouteMetric2 = new IpRouteMetric2Ent(mib, this);
                    this.ipRouteMetric3 = new IpRouteMetric3Ent(mib, this);
                    this.ipRouteMetric4 = new IpRouteMetric4Ent(mib, this);
                    this.ipRouteNextHop = new IpRouteNextHopEnt(mib, this);
                    this.ipRouteType = new IpRouteTypeEnt(mib, this);
                    this.ipRouteProto = new IpRouteProtoEnt(mib, this);
                    this.ipRouteAge = new IpRouteAgeEnt(mib, this);
                    this.ipRouteMask = new IpRouteMaskEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipRouteDest,
                        this.ipRouteIfIndex,
                        this.ipRouteMetric1,
                        this.ipRouteMetric2,
                        this.ipRouteMetric3,
                        this.ipRouteMetric4,
                        this.ipRouteNextHop,
                        this.ipRouteType,
                        this.ipRouteProto,
                        this.ipRouteAge,
                        this.ipRouteMask
                    };
                }
                public static final class IpRouteDestEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteDestEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteDest", "1.3.6.1.2.1.4.21.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteIfIndexEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteIfIndexEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteIfIndex", "1.3.6.1.2.1.4.21.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteMetric1Ent extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteMetric1Ent(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteMetric1", "1.3.6.1.2.1.4.21.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteMetric2Ent extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteMetric2Ent(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteMetric2", "1.3.6.1.2.1.4.21.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteMetric3Ent extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteMetric3Ent(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteMetric3", "1.3.6.1.2.1.4.21.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteMetric4Ent extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteMetric4Ent(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteMetric4", "1.3.6.1.2.1.4.21.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteNextHopEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteNextHopEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteNextHop", "1.3.6.1.2.1.4.21.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteTypeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteTypeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteType", "1.3.6.1.2.1.4.21.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteProtoEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteProtoEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteProto", "1.3.6.1.2.1.4.21.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteAgeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteAgeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteAge", "1.3.6.1.2.1.4.21.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpRouteMaskEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpRouteMaskEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipRouteMask", "1.3.6.1.2.1.4.21.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class IpNetToMediaTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final IpNetToMediaEntryEnt ipNetToMediaEntry;

            private IpNetToMediaTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "ipNetToMediaTable", "1.3.6.1.2.1.4.22", false, true, false, false);
                this.ipNetToMediaEntry = new IpNetToMediaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ipNetToMediaEntry
                };
            }
            public static final class IpNetToMediaEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final IpNetToMediaIfIndexEnt ipNetToMediaIfIndex;

                public final IpNetToMediaPhysAddressEnt ipNetToMediaPhysAddress;

                public final IpNetToMediaNetAddressEnt ipNetToMediaNetAddress;

                public final IpNetToMediaTypeEnt ipNetToMediaType;

                private IpNetToMediaEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "ipNetToMediaEntry", "1.3.6.1.2.1.4.22.1", false, false, false, true);
                    this.ipNetToMediaIfIndex = new IpNetToMediaIfIndexEnt(mib, this);
                    this.ipNetToMediaPhysAddress = new IpNetToMediaPhysAddressEnt(mib, this);
                    this.ipNetToMediaNetAddress = new IpNetToMediaNetAddressEnt(mib, this);
                    this.ipNetToMediaType = new IpNetToMediaTypeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ipNetToMediaIfIndex,
                        this.ipNetToMediaPhysAddress,
                        this.ipNetToMediaNetAddress,
                        this.ipNetToMediaType
                    };
                }
                public static final class IpNetToMediaIfIndexEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpNetToMediaIfIndexEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaIfIndex", "1.3.6.1.2.1.4.22.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToMediaPhysAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpNetToMediaPhysAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaPhysAddress", "1.3.6.1.2.1.4.22.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToMediaNetAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpNetToMediaNetAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaNetAddress", "1.3.6.1.2.1.4.22.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class IpNetToMediaTypeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private IpNetToMediaTypeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "ipNetToMediaType", "1.3.6.1.2.1.4.22.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class IcmpEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** the ICMP group
Implementation of the ICMP group is mandatory for allsystems.*/
        public final IcmpInMsgsEnt icmpInMsgs;

        public final IcmpInErrorsEnt icmpInErrors;

        public final IcmpInDestUnreachsEnt icmpInDestUnreachs;

        public final IcmpInTimeExcdsEnt icmpInTimeExcds;

        public final IcmpInParmProbsEnt icmpInParmProbs;

        public final IcmpInSrcQuenchsEnt icmpInSrcQuenchs;

        public final IcmpInRedirectsEnt icmpInRedirects;

        public final IcmpInEchosEnt icmpInEchos;

        public final IcmpInEchoRepsEnt icmpInEchoReps;

        public final IcmpInTimestampsEnt icmpInTimestamps;

        public final IcmpInTimestampRepsEnt icmpInTimestampReps;

        public final IcmpInAddrMasksEnt icmpInAddrMasks;

        public final IcmpInAddrMaskRepsEnt icmpInAddrMaskReps;

        public final IcmpOutMsgsEnt icmpOutMsgs;

        public final IcmpOutErrorsEnt icmpOutErrors;

        public final IcmpOutDestUnreachsEnt icmpOutDestUnreachs;

        public final IcmpOutTimeExcdsEnt icmpOutTimeExcds;

        public final IcmpOutParmProbsEnt icmpOutParmProbs;

        public final IcmpOutSrcQuenchsEnt icmpOutSrcQuenchs;

        public final IcmpOutRedirectsEnt icmpOutRedirects;

        public final IcmpOutEchosEnt icmpOutEchos;

        public final IcmpOutEchoRepsEnt icmpOutEchoReps;

        public final IcmpOutTimestampsEnt icmpOutTimestamps;

        public final IcmpOutTimestampRepsEnt icmpOutTimestampReps;

        public final IcmpOutAddrMasksEnt icmpOutAddrMasks;

        public final IcmpOutAddrMaskRepsEnt icmpOutAddrMaskReps;

        private IcmpEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "icmp", "1.3.6.1.2.1.5", false, false, false, false);
            this.icmpInMsgs = new IcmpInMsgsEnt(mib, this);
            this.icmpInErrors = new IcmpInErrorsEnt(mib, this);
            this.icmpInDestUnreachs = new IcmpInDestUnreachsEnt(mib, this);
            this.icmpInTimeExcds = new IcmpInTimeExcdsEnt(mib, this);
            this.icmpInParmProbs = new IcmpInParmProbsEnt(mib, this);
            this.icmpInSrcQuenchs = new IcmpInSrcQuenchsEnt(mib, this);
            this.icmpInRedirects = new IcmpInRedirectsEnt(mib, this);
            this.icmpInEchos = new IcmpInEchosEnt(mib, this);
            this.icmpInEchoReps = new IcmpInEchoRepsEnt(mib, this);
            this.icmpInTimestamps = new IcmpInTimestampsEnt(mib, this);
            this.icmpInTimestampReps = new IcmpInTimestampRepsEnt(mib, this);
            this.icmpInAddrMasks = new IcmpInAddrMasksEnt(mib, this);
            this.icmpInAddrMaskReps = new IcmpInAddrMaskRepsEnt(mib, this);
            this.icmpOutMsgs = new IcmpOutMsgsEnt(mib, this);
            this.icmpOutErrors = new IcmpOutErrorsEnt(mib, this);
            this.icmpOutDestUnreachs = new IcmpOutDestUnreachsEnt(mib, this);
            this.icmpOutTimeExcds = new IcmpOutTimeExcdsEnt(mib, this);
            this.icmpOutParmProbs = new IcmpOutParmProbsEnt(mib, this);
            this.icmpOutSrcQuenchs = new IcmpOutSrcQuenchsEnt(mib, this);
            this.icmpOutRedirects = new IcmpOutRedirectsEnt(mib, this);
            this.icmpOutEchos = new IcmpOutEchosEnt(mib, this);
            this.icmpOutEchoReps = new IcmpOutEchoRepsEnt(mib, this);
            this.icmpOutTimestamps = new IcmpOutTimestampsEnt(mib, this);
            this.icmpOutTimestampReps = new IcmpOutTimestampRepsEnt(mib, this);
            this.icmpOutAddrMasks = new IcmpOutAddrMasksEnt(mib, this);
            this.icmpOutAddrMaskReps = new IcmpOutAddrMaskRepsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.icmpInMsgs,
                this.icmpInErrors,
                this.icmpInDestUnreachs,
                this.icmpInTimeExcds,
                this.icmpInParmProbs,
                this.icmpInSrcQuenchs,
                this.icmpInRedirects,
                this.icmpInEchos,
                this.icmpInEchoReps,
                this.icmpInTimestamps,
                this.icmpInTimestampReps,
                this.icmpInAddrMasks,
                this.icmpInAddrMaskReps,
                this.icmpOutMsgs,
                this.icmpOutErrors,
                this.icmpOutDestUnreachs,
                this.icmpOutTimeExcds,
                this.icmpOutParmProbs,
                this.icmpOutSrcQuenchs,
                this.icmpOutRedirects,
                this.icmpOutEchos,
                this.icmpOutEchoReps,
                this.icmpOutTimestamps,
                this.icmpOutTimestampReps,
                this.icmpOutAddrMasks,
                this.icmpOutAddrMaskReps
            };
        }
        public static final class IcmpInMsgsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInMsgs", "1.3.6.1.2.1.5.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInErrors", "1.3.6.1.2.1.5.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInDestUnreachsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInDestUnreachsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInDestUnreachs", "1.3.6.1.2.1.5.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInTimeExcdsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInTimeExcdsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInTimeExcds", "1.3.6.1.2.1.5.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInParmProbsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInParmProbsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInParmProbs", "1.3.6.1.2.1.5.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInSrcQuenchsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInSrcQuenchsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInSrcQuenchs", "1.3.6.1.2.1.5.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInRedirectsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInRedirectsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInRedirects", "1.3.6.1.2.1.5.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInEchosEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInEchosEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInEchos", "1.3.6.1.2.1.5.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInEchoRepsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInEchoRepsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInEchoReps", "1.3.6.1.2.1.5.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInTimestampsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInTimestampsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInTimestamps", "1.3.6.1.2.1.5.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInTimestampRepsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInTimestampRepsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInTimestampReps", "1.3.6.1.2.1.5.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInAddrMasksEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInAddrMasksEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInAddrMasks", "1.3.6.1.2.1.5.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpInAddrMaskRepsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpInAddrMaskRepsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpInAddrMaskReps", "1.3.6.1.2.1.5.13", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutMsgsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutMsgs", "1.3.6.1.2.1.5.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutErrors", "1.3.6.1.2.1.5.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutDestUnreachsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutDestUnreachsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutDestUnreachs", "1.3.6.1.2.1.5.16", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutTimeExcdsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutTimeExcdsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutTimeExcds", "1.3.6.1.2.1.5.17", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutParmProbsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutParmProbsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutParmProbs", "1.3.6.1.2.1.5.18", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutSrcQuenchsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutSrcQuenchsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutSrcQuenchs", "1.3.6.1.2.1.5.19", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutRedirectsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutRedirectsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutRedirects", "1.3.6.1.2.1.5.20", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutEchosEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutEchosEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutEchos", "1.3.6.1.2.1.5.21", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutEchoRepsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutEchoRepsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutEchoReps", "1.3.6.1.2.1.5.22", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutTimestampsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutTimestampsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutTimestamps", "1.3.6.1.2.1.5.23", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutTimestampRepsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutTimestampRepsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutTimestampReps", "1.3.6.1.2.1.5.24", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutAddrMasksEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutAddrMasksEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutAddrMasks", "1.3.6.1.2.1.5.25", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IcmpOutAddrMaskRepsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private IcmpOutAddrMaskRepsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "icmpOutAddrMaskReps", "1.3.6.1.2.1.5.26", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class TcpEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** the TCP group
Implementation of the TCP group is mandatory for allsystems that implement the TCP.
Note that instances of object types that representinformation about a particular TCP connection aretransient; they persist only as long as the connectionin question.*/
        public final TcpRtoAlgorithmEnt tcpRtoAlgorithm;

        public final TcpRtoMinEnt tcpRtoMin;

        public final TcpRtoMaxEnt tcpRtoMax;

        public final TcpMaxConnEnt tcpMaxConn;

        public final TcpActiveOpensEnt tcpActiveOpens;

        public final TcpPassiveOpensEnt tcpPassiveOpens;

        public final TcpAttemptFailsEnt tcpAttemptFails;

        public final TcpEstabResetsEnt tcpEstabResets;

        public final TcpCurrEstabEnt tcpCurrEstab;

        public final TcpInSegsEnt tcpInSegs;

        public final TcpOutSegsEnt tcpOutSegs;

        public final TcpRetransSegsEnt tcpRetransSegs;

        /** the TCP Connection table
The TCP connection table contains information about thisentity's existing TCP connections.*/
        public final TcpConnTableEnt tcpConnTable;

        /** additional TCP objects*/
        public final TcpInErrsEnt tcpInErrs;

        public final TcpOutRstsEnt tcpOutRsts;

        private TcpEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "tcp", "1.3.6.1.2.1.6", false, false, false, false);
            this.tcpRtoAlgorithm = new TcpRtoAlgorithmEnt(mib, this);
            this.tcpRtoMin = new TcpRtoMinEnt(mib, this);
            this.tcpRtoMax = new TcpRtoMaxEnt(mib, this);
            this.tcpMaxConn = new TcpMaxConnEnt(mib, this);
            this.tcpActiveOpens = new TcpActiveOpensEnt(mib, this);
            this.tcpPassiveOpens = new TcpPassiveOpensEnt(mib, this);
            this.tcpAttemptFails = new TcpAttemptFailsEnt(mib, this);
            this.tcpEstabResets = new TcpEstabResetsEnt(mib, this);
            this.tcpCurrEstab = new TcpCurrEstabEnt(mib, this);
            this.tcpInSegs = new TcpInSegsEnt(mib, this);
            this.tcpOutSegs = new TcpOutSegsEnt(mib, this);
            this.tcpRetransSegs = new TcpRetransSegsEnt(mib, this);
            this.tcpConnTable = new TcpConnTableEnt(mib, this);
            this.tcpInErrs = new TcpInErrsEnt(mib, this);
            this.tcpOutRsts = new TcpOutRstsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tcpRtoAlgorithm,
                this.tcpRtoMin,
                this.tcpRtoMax,
                this.tcpMaxConn,
                this.tcpActiveOpens,
                this.tcpPassiveOpens,
                this.tcpAttemptFails,
                this.tcpEstabResets,
                this.tcpCurrEstab,
                this.tcpInSegs,
                this.tcpOutSegs,
                this.tcpRetransSegs,
                this.tcpConnTable,
                this.tcpInErrs,
                this.tcpOutRsts
            };
        }
        public static final class TcpRtoAlgorithmEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpRtoAlgorithmEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpRtoAlgorithm", "1.3.6.1.2.1.6.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpRtoMinEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpRtoMinEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpRtoMin", "1.3.6.1.2.1.6.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpRtoMaxEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpRtoMaxEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpRtoMax", "1.3.6.1.2.1.6.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpMaxConnEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpMaxConnEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpMaxConn", "1.3.6.1.2.1.6.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpActiveOpensEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpActiveOpensEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpActiveOpens", "1.3.6.1.2.1.6.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpPassiveOpensEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpPassiveOpensEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpPassiveOpens", "1.3.6.1.2.1.6.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpAttemptFailsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpAttemptFailsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpAttemptFails", "1.3.6.1.2.1.6.7", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpEstabResetsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpEstabResetsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpEstabResets", "1.3.6.1.2.1.6.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpCurrEstabEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpCurrEstabEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpCurrEstab", "1.3.6.1.2.1.6.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpInSegsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpInSegsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpInSegs", "1.3.6.1.2.1.6.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpOutSegsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpOutSegsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpOutSegs", "1.3.6.1.2.1.6.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpRetransSegsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpRetransSegsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpRetransSegs", "1.3.6.1.2.1.6.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpConnTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final TcpConnEntryEnt tcpConnEntry;

            private TcpConnTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpConnTable", "1.3.6.1.2.1.6.13", false, true, false, false);
                this.tcpConnEntry = new TcpConnEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpConnEntry
                };
            }
            public static final class TcpConnEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final TcpConnStateEnt tcpConnState;

                public final TcpConnLocalAddressEnt tcpConnLocalAddress;

                public final TcpConnLocalPortEnt tcpConnLocalPort;

                public final TcpConnRemAddressEnt tcpConnRemAddress;

                public final TcpConnRemPortEnt tcpConnRemPort;

                private TcpConnEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "tcpConnEntry", "1.3.6.1.2.1.6.13.1", false, false, false, true);
                    this.tcpConnState = new TcpConnStateEnt(mib, this);
                    this.tcpConnLocalAddress = new TcpConnLocalAddressEnt(mib, this);
                    this.tcpConnLocalPort = new TcpConnLocalPortEnt(mib, this);
                    this.tcpConnRemAddress = new TcpConnRemAddressEnt(mib, this);
                    this.tcpConnRemPort = new TcpConnRemPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpConnState,
                        this.tcpConnLocalAddress,
                        this.tcpConnLocalPort,
                        this.tcpConnRemAddress,
                        this.tcpConnRemPort
                    };
                }
                public static final class TcpConnStateEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private TcpConnStateEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "tcpConnState", "1.3.6.1.2.1.6.13.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnLocalAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private TcpConnLocalAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "tcpConnLocalAddress", "1.3.6.1.2.1.6.13.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnLocalPortEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private TcpConnLocalPortEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "tcpConnLocalPort", "1.3.6.1.2.1.6.13.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnRemAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private TcpConnRemAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "tcpConnRemAddress", "1.3.6.1.2.1.6.13.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TcpConnRemPortEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private TcpConnRemPortEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "tcpConnRemPort", "1.3.6.1.2.1.6.13.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class TcpInErrsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpInErrsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpInErrs", "1.3.6.1.2.1.6.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class TcpOutRstsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private TcpOutRstsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "tcpOutRsts", "1.3.6.1.2.1.6.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class UdpEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** the UDP group
Implementation of the UDP group is mandatory for allsystems which implement the UDP.*/
        public final UdpInDatagramsEnt udpInDatagrams;

        public final UdpNoPortsEnt udpNoPorts;

        public final UdpInErrorsEnt udpInErrors;

        public final UdpOutDatagramsEnt udpOutDatagrams;

        /** the UDP Listener table
The UDP listener table contains information about thisentity's UDP end-points on which a local application iscurrently accepting datagrams.*/
        public final UdpTableEnt udpTable;

        private UdpEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "udp", "1.3.6.1.2.1.7", false, false, false, false);
            this.udpInDatagrams = new UdpInDatagramsEnt(mib, this);
            this.udpNoPorts = new UdpNoPortsEnt(mib, this);
            this.udpInErrors = new UdpInErrorsEnt(mib, this);
            this.udpOutDatagrams = new UdpOutDatagramsEnt(mib, this);
            this.udpTable = new UdpTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.udpInDatagrams,
                this.udpNoPorts,
                this.udpInErrors,
                this.udpOutDatagrams,
                this.udpTable
            };
        }
        public static final class UdpInDatagramsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private UdpInDatagramsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "udpInDatagrams", "1.3.6.1.2.1.7.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpNoPortsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private UdpNoPortsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "udpNoPorts", "1.3.6.1.2.1.7.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpInErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private UdpInErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "udpInErrors", "1.3.6.1.2.1.7.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpOutDatagramsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private UdpOutDatagramsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "udpOutDatagrams", "1.3.6.1.2.1.7.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UdpTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final UdpEntryEnt udpEntry;

            private UdpTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "udpTable", "1.3.6.1.2.1.7.5", false, true, false, false);
                this.udpEntry = new UdpEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.udpEntry
                };
            }
            public static final class UdpEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final UdpLocalAddressEnt udpLocalAddress;

                public final UdpLocalPortEnt udpLocalPort;

                private UdpEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "udpEntry", "1.3.6.1.2.1.7.5.1", false, false, false, true);
                    this.udpLocalAddress = new UdpLocalAddressEnt(mib, this);
                    this.udpLocalPort = new UdpLocalPortEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.udpLocalAddress,
                        this.udpLocalPort
                    };
                }
                public static final class UdpLocalAddressEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private UdpLocalAddressEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "udpLocalAddress", "1.3.6.1.2.1.7.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UdpLocalPortEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private UdpLocalPortEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "udpLocalPort", "1.3.6.1.2.1.7.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class EgpEnt extends MIBEntry<RFC1158MIBDef>
    {
        /** the EGP group
Implementation of the EGP group is mandatory for allsystems which implement the EGP.*/
        public final EgpInMsgsEnt egpInMsgs;

        public final EgpInErrorsEnt egpInErrors;

        public final EgpOutMsgsEnt egpOutMsgs;

        public final EgpOutErrorsEnt egpOutErrors;

        /** the EGP Neighbor table
The EGP neighbor table contains information about thisentity's EGP neighbors.*/
        public final EgpNeighTableEnt egpNeighTable;

        /** additional EGP objects*/
        public final EgpAsEnt egpAs;

        private EgpEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "egp", "1.3.6.1.2.1.8", false, false, false, false);
            this.egpInMsgs = new EgpInMsgsEnt(mib, this);
            this.egpInErrors = new EgpInErrorsEnt(mib, this);
            this.egpOutMsgs = new EgpOutMsgsEnt(mib, this);
            this.egpOutErrors = new EgpOutErrorsEnt(mib, this);
            this.egpNeighTable = new EgpNeighTableEnt(mib, this);
            this.egpAs = new EgpAsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.egpInMsgs,
                this.egpInErrors,
                this.egpOutMsgs,
                this.egpOutErrors,
                this.egpNeighTable,
                this.egpAs
            };
        }
        public static final class EgpInMsgsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private EgpInMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "egpInMsgs", "1.3.6.1.2.1.8.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EgpInErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private EgpInErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "egpInErrors", "1.3.6.1.2.1.8.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EgpOutMsgsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private EgpOutMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "egpOutMsgs", "1.3.6.1.2.1.8.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EgpOutErrorsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private EgpOutErrorsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "egpOutErrors", "1.3.6.1.2.1.8.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EgpNeighTableEnt extends MIBEntry<RFC1158MIBDef>
        {
            public final EgpNeighEntryEnt egpNeighEntry;

            private EgpNeighTableEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "egpNeighTable", "1.3.6.1.2.1.8.5", false, true, false, false);
                this.egpNeighEntry = new EgpNeighEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.egpNeighEntry
                };
            }
            public static final class EgpNeighEntryEnt extends MIBEntry<RFC1158MIBDef>
            {
                public final EgpNeighStateEnt egpNeighState;

                public final EgpNeighAddrEnt egpNeighAddr;

                public final EgpNeighAsEnt egpNeighAs;

                public final EgpNeighInMsgsEnt egpNeighInMsgs;

                public final EgpNeighInErrsEnt egpNeighInErrs;

                public final EgpNeighOutMsgsEnt egpNeighOutMsgs;

                public final EgpNeighOutErrsEnt egpNeighOutErrs;

                public final EgpNeighInErrMsgsEnt egpNeighInErrMsgs;

                public final EgpNeighOutErrMsgsEnt egpNeighOutErrMsgs;

                public final EgpNeighStateUpsEnt egpNeighStateUps;

                public final EgpNeighStateDownsEnt egpNeighStateDowns;

                public final EgpNeighIntervalHelloEnt egpNeighIntervalHello;

                public final EgpNeighIntervalPollEnt egpNeighIntervalPoll;

                public final EgpNeighModeEnt egpNeighMode;

                public final EgpNeighEventTriggerEnt egpNeighEventTrigger;

                private EgpNeighEntryEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                {
                    super(mib, parent, "egpNeighEntry", "1.3.6.1.2.1.8.5.1", false, false, false, true);
                    this.egpNeighState = new EgpNeighStateEnt(mib, this);
                    this.egpNeighAddr = new EgpNeighAddrEnt(mib, this);
                    this.egpNeighAs = new EgpNeighAsEnt(mib, this);
                    this.egpNeighInMsgs = new EgpNeighInMsgsEnt(mib, this);
                    this.egpNeighInErrs = new EgpNeighInErrsEnt(mib, this);
                    this.egpNeighOutMsgs = new EgpNeighOutMsgsEnt(mib, this);
                    this.egpNeighOutErrs = new EgpNeighOutErrsEnt(mib, this);
                    this.egpNeighInErrMsgs = new EgpNeighInErrMsgsEnt(mib, this);
                    this.egpNeighOutErrMsgs = new EgpNeighOutErrMsgsEnt(mib, this);
                    this.egpNeighStateUps = new EgpNeighStateUpsEnt(mib, this);
                    this.egpNeighStateDowns = new EgpNeighStateDownsEnt(mib, this);
                    this.egpNeighIntervalHello = new EgpNeighIntervalHelloEnt(mib, this);
                    this.egpNeighIntervalPoll = new EgpNeighIntervalPollEnt(mib, this);
                    this.egpNeighMode = new EgpNeighModeEnt(mib, this);
                    this.egpNeighEventTrigger = new EgpNeighEventTriggerEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.egpNeighState,
                        this.egpNeighAddr,
                        this.egpNeighAs,
                        this.egpNeighInMsgs,
                        this.egpNeighInErrs,
                        this.egpNeighOutMsgs,
                        this.egpNeighOutErrs,
                        this.egpNeighInErrMsgs,
                        this.egpNeighOutErrMsgs,
                        this.egpNeighStateUps,
                        this.egpNeighStateDowns,
                        this.egpNeighIntervalHello,
                        this.egpNeighIntervalPoll,
                        this.egpNeighMode,
                        this.egpNeighEventTrigger
                    };
                }
                public static final class EgpNeighStateEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighStateEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighState", "1.3.6.1.2.1.8.5.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighAddrEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighAddrEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighAddr", "1.3.6.1.2.1.8.5.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighAsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighAsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighAs", "1.3.6.1.2.1.8.5.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighInMsgsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighInMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighInMsgs", "1.3.6.1.2.1.8.5.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighInErrsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighInErrsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighInErrs", "1.3.6.1.2.1.8.5.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighOutMsgsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighOutMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighOutMsgs", "1.3.6.1.2.1.8.5.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighOutErrsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighOutErrsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighOutErrs", "1.3.6.1.2.1.8.5.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighInErrMsgsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighInErrMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighInErrMsgs", "1.3.6.1.2.1.8.5.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighOutErrMsgsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighOutErrMsgsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighOutErrMsgs", "1.3.6.1.2.1.8.5.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighStateUpsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighStateUpsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighStateUps", "1.3.6.1.2.1.8.5.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighStateDownsEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighStateDownsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighStateDowns", "1.3.6.1.2.1.8.5.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighIntervalHelloEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighIntervalHelloEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighIntervalHello", "1.3.6.1.2.1.8.5.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighIntervalPollEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighIntervalPollEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighIntervalPoll", "1.3.6.1.2.1.8.5.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighModeEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighModeEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighMode", "1.3.6.1.2.1.8.5.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EgpNeighEventTriggerEnt extends MIBEntry<RFC1158MIBDef>
                {
                    private EgpNeighEventTriggerEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
                    {
                        super(mib, parent, "egpNeighEventTrigger", "1.3.6.1.2.1.8.5.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class EgpAsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private EgpAsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "egpAs", "1.3.6.1.2.1.8.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class SnmpEnt extends MIBEntry<RFC1158MIBDef>
    {
        public final SnmpInPktsEnt snmpInPkts;

        /** definitions in RFC 1213 made obsolete by the inclusion of asubset of the snmp group in this MIB*/
        public final SnmpOutPktsEnt snmpOutPkts;

        public final SnmpInBadVersionsEnt snmpInBadVersions;

        public final SnmpInBadCommunityNamesEnt snmpInBadCommunityNames;

        public final SnmpInBadCommunityUsesEnt snmpInBadCommunityUses;

        public final SnmpInASNParseErrsEnt snmpInASNParseErrs;

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

        public final SnmpEnableAuthenTrapsEnt snmpEnableAuthenTraps;

        private SnmpEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "snmp", "1.3.6.1.2.1.11", false, false, false, false);
            this.snmpInPkts = new SnmpInPktsEnt(mib, this);
            this.snmpOutPkts = new SnmpOutPktsEnt(mib, this);
            this.snmpInBadVersions = new SnmpInBadVersionsEnt(mib, this);
            this.snmpInBadCommunityNames = new SnmpInBadCommunityNamesEnt(mib, this);
            this.snmpInBadCommunityUses = new SnmpInBadCommunityUsesEnt(mib, this);
            this.snmpInASNParseErrs = new SnmpInASNParseErrsEnt(mib, this);
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
            this.snmpEnableAuthenTraps = new SnmpEnableAuthenTrapsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpInPkts,
                this.snmpOutPkts,
                this.snmpInBadVersions,
                this.snmpInBadCommunityNames,
                this.snmpInBadCommunityUses,
                this.snmpInASNParseErrs,
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
                this.snmpOutTraps,
                this.snmpEnableAuthenTraps
            };
        }
        public static final class SnmpInPktsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInPktsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInPkts", "1.3.6.1.2.1.11.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutPktsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutPktsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutPkts", "1.3.6.1.2.1.11.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadVersionsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInBadVersionsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInBadVersions", "1.3.6.1.2.1.11.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadCommunityNamesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInBadCommunityNamesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInBadCommunityNames", "1.3.6.1.2.1.11.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadCommunityUsesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInBadCommunityUsesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInBadCommunityUses", "1.3.6.1.2.1.11.5", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInASNParseErrsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInASNParseErrsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInASNParseErrs", "1.3.6.1.2.1.11.6", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTooBigsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInTooBigsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInTooBigs", "1.3.6.1.2.1.11.8", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInNoSuchNamesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInNoSuchNamesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInNoSuchNames", "1.3.6.1.2.1.11.9", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInBadValuesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInBadValuesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInBadValues", "1.3.6.1.2.1.11.10", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInReadOnlysEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInReadOnlysEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInReadOnlys", "1.3.6.1.2.1.11.11", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGenErrsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInGenErrsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInGenErrs", "1.3.6.1.2.1.11.12", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTotalReqVarsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInTotalReqVarsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInTotalReqVars", "1.3.6.1.2.1.11.13", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTotalSetVarsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInTotalSetVarsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInTotalSetVars", "1.3.6.1.2.1.11.14", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGetRequestsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInGetRequestsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInGetRequests", "1.3.6.1.2.1.11.15", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGetNextsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInGetNextsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInGetNexts", "1.3.6.1.2.1.11.16", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInSetRequestsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInSetRequestsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInSetRequests", "1.3.6.1.2.1.11.17", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInGetResponsesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInGetResponsesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInGetResponses", "1.3.6.1.2.1.11.18", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpInTrapsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpInTrapsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpInTraps", "1.3.6.1.2.1.11.19", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutTooBigsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutTooBigsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutTooBigs", "1.3.6.1.2.1.11.20", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutNoSuchNamesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutNoSuchNamesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutNoSuchNames", "1.3.6.1.2.1.11.21", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutBadValuesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutBadValuesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutBadValues", "1.3.6.1.2.1.11.22", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGenErrsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutGenErrsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutGenErrs", "1.3.6.1.2.1.11.24", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGetRequestsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutGetRequestsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutGetRequests", "1.3.6.1.2.1.11.25", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGetNextsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutGetNextsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutGetNexts", "1.3.6.1.2.1.11.26", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutSetRequestsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutSetRequestsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutSetRequests", "1.3.6.1.2.1.11.27", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutGetResponsesEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutGetResponsesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutGetResponses", "1.3.6.1.2.1.11.28", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpOutTrapsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpOutTrapsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpOutTraps", "1.3.6.1.2.1.11.29", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class SnmpEnableAuthenTrapsEnt extends MIBEntry<RFC1158MIBDef>
        {
            private SnmpEnableAuthenTrapsEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
            {
                super(mib, parent, "snmpEnableAuthenTraps", "1.3.6.1.2.1.11.30", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class ZeroDotZeroEnt extends MIBEntry<RFC1158MIBDef>
    {
        private ZeroDotZeroEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "zeroDotZero", "0.0", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpInBadTypesEnt extends MIBEntry<RFC1158MIBDef>
    {
        private SnmpInBadTypesEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "snmpInBadTypes", "1.3.6.1.2.1.11.7", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpOutReadOnlysEnt extends MIBEntry<RFC1158MIBDef>
    {
        private SnmpOutReadOnlysEnt(RFC1158MIBDef mib, MIBEntry<RFC1158MIBDef> parent)
        {
            super(mib, parent, "snmpOutReadOnlys", "1.3.6.1.2.1.11.23", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
