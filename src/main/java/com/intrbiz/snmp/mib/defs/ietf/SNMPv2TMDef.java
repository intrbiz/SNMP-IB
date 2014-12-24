package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**::= { rfc1157Proxy 2 }            this OID is obsolete*/
public final class SNMPv2TMDef extends MIB
{
    public static final SNMPv2TMDef SNMPv2TM = new SNMPv2TMDef();

    public final Snmpv2tmEnt snmpv2tm;

    /** SNMP over UDP over IPv4*/
    public final SnmpUDPDomainEnt snmpUDPDomain;

    /** SNMP over OSI*/
    public final SnmpCLNSDomainEnt snmpCLNSDomain;

    public final SnmpCONSDomainEnt snmpCONSDomain;

    /** SNMP over DDP*/
    public final SnmpDDPDomainEnt snmpDDPDomain;

    /** SNMP over IPX*/
    public final SnmpIPXDomainEnt snmpIPXDomain;

    /** for proxy to SNMPv1 (RFC 1157)*/
    public final Rfc1157ProxyEnt rfc1157Proxy;

    private SNMPv2TMDef()
    {
        super("SNMPv2-TM");
        this.snmpv2tm = new Snmpv2tmEnt(this, null);
        this.snmpUDPDomain = new SnmpUDPDomainEnt(this, null);
        this.snmpCLNSDomain = new SnmpCLNSDomainEnt(this, null);
        this.snmpCONSDomain = new SnmpCONSDomainEnt(this, null);
        this.snmpDDPDomain = new SnmpDDPDomainEnt(this, null);
        this.snmpIPXDomain = new SnmpIPXDomainEnt(this, null);
        this.rfc1157Proxy = new Rfc1157ProxyEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpv2tm,
            this.snmpUDPDomain,
            this.snmpCLNSDomain,
            this.snmpCONSDomain,
            this.snmpDDPDomain,
            this.snmpIPXDomain,
            this.rfc1157Proxy
        };
    }

    public static final class Snmpv2tmEnt extends MIBEntry<SNMPv2TMDef>
    {
        private Snmpv2tmEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "snmpv2tm", "1.3.6.1.6.3.19", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpUDPDomainEnt extends MIBEntry<SNMPv2TMDef>
    {
        private SnmpUDPDomainEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "snmpUDPDomain", "1.3.6.1.6.1.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpCLNSDomainEnt extends MIBEntry<SNMPv2TMDef>
    {
        private SnmpCLNSDomainEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "snmpCLNSDomain", "1.3.6.1.6.1.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpCONSDomainEnt extends MIBEntry<SNMPv2TMDef>
    {
        private SnmpCONSDomainEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "snmpCONSDomain", "1.3.6.1.6.1.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpDDPDomainEnt extends MIBEntry<SNMPv2TMDef>
    {
        private SnmpDDPDomainEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "snmpDDPDomain", "1.3.6.1.6.1.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class SnmpIPXDomainEnt extends MIBEntry<SNMPv2TMDef>
    {
        private SnmpIPXDomainEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "snmpIPXDomain", "1.3.6.1.6.1.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Rfc1157ProxyEnt extends MIBEntry<SNMPv2TMDef>
    {
        public final Rfc1157DomainEnt rfc1157Domain;

        private Rfc1157ProxyEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
        {
            super(mib, parent, "rfc1157Proxy", "1.3.6.1.6.2.1", false, false, false, false);
            this.rfc1157Domain = new Rfc1157DomainEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rfc1157Domain
            };
        }
        public static final class Rfc1157DomainEnt extends MIBEntry<SNMPv2TMDef>
        {
            private Rfc1157DomainEnt(SNMPv2TMDef mib, MIBEntry<SNMPv2TMDef> parent)
            {
                super(mib, parent, "rfc1157Domain", "1.3.6.1.6.2.1.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
