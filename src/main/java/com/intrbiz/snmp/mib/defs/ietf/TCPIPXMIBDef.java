package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class TCPIPXMIBDef extends MIB
{
    public static final TCPIPXMIBDef TCPIPXMIB = new TCPIPXMIBDef();

    /** TCP/IPX MIB object idenfifiers*/
    public final NovellEnt novell;

    private TCPIPXMIBDef()
    {
        super("TCPIPX-MIB");
        this.novell = new NovellEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.novell
        };
    }

    public static final class NovellEnt extends MIBEntry<TCPIPXMIBDef>
    {
        public final MibDocEnt mibDoc;

        private NovellEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
        {
            super(mib, parent, "novell", "1.3.6.1.4.1.23", false, false, false, false);
            this.mibDoc = new MibDocEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mibDoc
            };
        }
        public static final class MibDocEnt extends MIBEntry<TCPIPXMIBDef>
        {
            public final TcpxEnt tcpx;

            private MibDocEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
            {
                super(mib, parent, "mibDoc", "1.3.6.1.4.1.23.2", false, false, false, false);
                this.tcpx = new TcpxEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tcpx
                };
            }
            public static final class TcpxEnt extends MIBEntry<TCPIPXMIBDef>
            {
                public final TcpxTcpEnt tcpxTcp;

                public final TcpxUdpEnt tcpxUdp;

                private TcpxEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                {
                    super(mib, parent, "tcpx", "1.3.6.1.4.1.23.2.29", false, false, false, false);
                    this.tcpxTcp = new TcpxTcpEnt(mib, this);
                    this.tcpxUdp = new TcpxUdpEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tcpxTcp,
                        this.tcpxUdp
                    };
                }
                public static final class TcpxTcpEnt extends MIBEntry<TCPIPXMIBDef>
                {
                    /** the TCP/IPX Connection table
The TCP/IPX connection table contains informationabout this entity's existing TCP connections overIPX.*/
                    public final TcpIpxConnTableEnt tcpIpxConnTable;

                    /** the TCP/UNSPEC Connection table
The TCP/UPSPEC connection table contains informationabout this entity's existing TCP connections overunspecified network.Since the network is unspecified, the networkaddress is also unspecified.  Hence, thisconnection table does not include any networkaddress.*/
                    public final TcpUnspecConnTableEnt tcpUnspecConnTable;

                    private TcpxTcpEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                    {
                        super(mib, parent, "tcpxTcp", "1.3.6.1.4.1.23.2.29.1", false, false, false, false);
                        this.tcpIpxConnTable = new TcpIpxConnTableEnt(mib, this);
                        this.tcpUnspecConnTable = new TcpUnspecConnTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tcpIpxConnTable,
                            this.tcpUnspecConnTable
                        };
                    }
                    public static final class TcpIpxConnTableEnt extends MIBEntry<TCPIPXMIBDef>
                    {
                        public final TcpIpxConnEntryEnt tcpIpxConnEntry;

                        private TcpIpxConnTableEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                        {
                            super(mib, parent, "tcpIpxConnTable", "1.3.6.1.4.1.23.2.29.1.1", false, true, false, false);
                            this.tcpIpxConnEntry = new TcpIpxConnEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpIpxConnEntry
                            };
                        }
                        public static final class TcpIpxConnEntryEnt extends MIBEntry<TCPIPXMIBDef>
                        {
                            public final TcpIpxConnStateEnt tcpIpxConnState;

                            public final TcpIpxConnLocalAddressEnt tcpIpxConnLocalAddress;

                            /** NetworkAddress defined in SMI only include IP currently,so we can't use it to represent both IP and IPX address.*/
                            public final TcpIpxConnLocalPortEnt tcpIpxConnLocalPort;

                            public final TcpIpxConnRemAddressEnt tcpIpxConnRemAddress;

                            public final TcpIpxConnRemPortEnt tcpIpxConnRemPort;

                            private TcpIpxConnEntryEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                            {
                                super(mib, parent, "tcpIpxConnEntry", "1.3.6.1.4.1.23.2.29.1.1.1", false, false, false, true);
                                this.tcpIpxConnState = new TcpIpxConnStateEnt(mib, this);
                                this.tcpIpxConnLocalAddress = new TcpIpxConnLocalAddressEnt(mib, this);
                                this.tcpIpxConnLocalPort = new TcpIpxConnLocalPortEnt(mib, this);
                                this.tcpIpxConnRemAddress = new TcpIpxConnRemAddressEnt(mib, this);
                                this.tcpIpxConnRemPort = new TcpIpxConnRemPortEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.tcpIpxConnState,
                                    this.tcpIpxConnLocalAddress,
                                    this.tcpIpxConnLocalPort,
                                    this.tcpIpxConnRemAddress,
                                    this.tcpIpxConnRemPort
                                };
                            }
                            public static final class TcpIpxConnStateEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpIpxConnStateEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpIpxConnState", "1.3.6.1.4.1.23.2.29.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class TcpIpxConnLocalAddressEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpIpxConnLocalAddressEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpIpxConnLocalAddress", "1.3.6.1.4.1.23.2.29.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class TcpIpxConnLocalPortEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpIpxConnLocalPortEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpIpxConnLocalPort", "1.3.6.1.4.1.23.2.29.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class TcpIpxConnRemAddressEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpIpxConnRemAddressEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpIpxConnRemAddress", "1.3.6.1.4.1.23.2.29.1.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class TcpIpxConnRemPortEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpIpxConnRemPortEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpIpxConnRemPort", "1.3.6.1.4.1.23.2.29.1.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class TcpUnspecConnTableEnt extends MIBEntry<TCPIPXMIBDef>
                    {
                        public final TcpUnspecConnEntryEnt tcpUnspecConnEntry;

                        private TcpUnspecConnTableEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                        {
                            super(mib, parent, "tcpUnspecConnTable", "1.3.6.1.4.1.23.2.29.1.2", false, true, false, false);
                            this.tcpUnspecConnEntry = new TcpUnspecConnEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tcpUnspecConnEntry
                            };
                        }
                        public static final class TcpUnspecConnEntryEnt extends MIBEntry<TCPIPXMIBDef>
                        {
                            public final TcpUnspecConnStateEnt tcpUnspecConnState;

                            public final TcpUnspecConnLocalPortEnt tcpUnspecConnLocalPort;

                            private TcpUnspecConnEntryEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                            {
                                super(mib, parent, "tcpUnspecConnEntry", "1.3.6.1.4.1.23.2.29.1.2.1", false, false, false, true);
                                this.tcpUnspecConnState = new TcpUnspecConnStateEnt(mib, this);
                                this.tcpUnspecConnLocalPort = new TcpUnspecConnLocalPortEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.tcpUnspecConnState,
                                    this.tcpUnspecConnLocalPort
                                };
                            }
                            public static final class TcpUnspecConnStateEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpUnspecConnStateEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpUnspecConnState", "1.3.6.1.4.1.23.2.29.1.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class TcpUnspecConnLocalPortEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private TcpUnspecConnLocalPortEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "tcpUnspecConnLocalPort", "1.3.6.1.4.1.23.2.29.1.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

                public static final class TcpxUdpEnt extends MIBEntry<TCPIPXMIBDef>
                {
                    /** the UDP Listener table
The UDP listener table contains information about thisentity's UDP end-points on which a local application iscurrently accepting datagrams.*/
                    public final UdpIpxTableEnt udpIpxTable;

                    /** the UDP Listener table
The UDP listener table contains information about thisentity's UDP end-points over unspecified network layer,on which a local application is currently acceptingdatagrams.  If network layer is unspecified, the networkaddress is also unspecified.  Hence, this table does notinclude any network address.*/
                    public final UdpUnspecTableEnt udpUnspecTable;

                    private TcpxUdpEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                    {
                        super(mib, parent, "tcpxUdp", "1.3.6.1.4.1.23.2.29.2", false, false, false, false);
                        this.udpIpxTable = new UdpIpxTableEnt(mib, this);
                        this.udpUnspecTable = new UdpUnspecTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.udpIpxTable,
                            this.udpUnspecTable
                        };
                    }
                    public static final class UdpIpxTableEnt extends MIBEntry<TCPIPXMIBDef>
                    {
                        public final UdpIpxEntryEnt udpIpxEntry;

                        private UdpIpxTableEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                        {
                            super(mib, parent, "udpIpxTable", "1.3.6.1.4.1.23.2.29.2.1", false, true, false, false);
                            this.udpIpxEntry = new UdpIpxEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.udpIpxEntry
                            };
                        }
                        public static final class UdpIpxEntryEnt extends MIBEntry<TCPIPXMIBDef>
                        {
                            public final UdpIpxLocalAddressEnt udpIpxLocalAddress;

                            public final UdpIpxLocalPortEnt udpIpxLocalPort;

                            private UdpIpxEntryEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                            {
                                super(mib, parent, "udpIpxEntry", "1.3.6.1.4.1.23.2.29.2.1.1", false, false, false, true);
                                this.udpIpxLocalAddress = new UdpIpxLocalAddressEnt(mib, this);
                                this.udpIpxLocalPort = new UdpIpxLocalPortEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.udpIpxLocalAddress,
                                    this.udpIpxLocalPort
                                };
                            }
                            public static final class UdpIpxLocalAddressEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private UdpIpxLocalAddressEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "udpIpxLocalAddress", "1.3.6.1.4.1.23.2.29.2.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class UdpIpxLocalPortEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private UdpIpxLocalPortEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "udpIpxLocalPort", "1.3.6.1.4.1.23.2.29.2.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class UdpUnspecTableEnt extends MIBEntry<TCPIPXMIBDef>
                    {
                        public final UdpUnspecEntryEnt udpUnspecEntry;

                        private UdpUnspecTableEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                        {
                            super(mib, parent, "udpUnspecTable", "1.3.6.1.4.1.23.2.29.2.2", false, true, false, false);
                            this.udpUnspecEntry = new UdpUnspecEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.udpUnspecEntry
                            };
                        }
                        public static final class UdpUnspecEntryEnt extends MIBEntry<TCPIPXMIBDef>
                        {
                            public final UdpUnspecLocalPortEnt udpUnspecLocalPort;

                            private UdpUnspecEntryEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                            {
                                super(mib, parent, "udpUnspecEntry", "1.3.6.1.4.1.23.2.29.2.2.1", false, false, false, true);
                                this.udpUnspecLocalPort = new UdpUnspecLocalPortEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.udpUnspecLocalPort
                                };
                            }
                            public static final class UdpUnspecLocalPortEnt extends MIBEntry<TCPIPXMIBDef>
                            {
                                private UdpUnspecLocalPortEnt(TCPIPXMIBDef mib, MIBEntry<TCPIPXMIBDef> parent)
                                {
                                    super(mib, parent, "udpUnspecLocalPort", "1.3.6.1.4.1.23.2.29.2.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

        }

    }

}
