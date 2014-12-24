package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**Invoking this test causes a PPP Discard Packet to be sent on
the line. ifExtnsTestResult returns success(2) if the discard
packet was successfully transmitted and failed(7) if an error
was detected on transmission. The definition of "transmission
error" in this context is left to the discretion of the
implementor.*/
public final class PPPLCPMIBDef extends MIB
{
    public static final PPPLCPMIBDef PPPLCPMIB = new PPPLCPMIBDef();

    /** PPP MIB*/
    public final PppEnt ppp;

    private PPPLCPMIBDef()
    {
        super("PPP-LCP-MIB");
        this.ppp = new PppEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.ppp
        };
    }

    public static final class PppEnt extends MIBEntry<PPPLCPMIBDef>
    {
        public final PppLcpEnt pppLcp;

        private PppEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
        {
            super(mib, parent, "ppp", "1.3.6.1.2.1.10.23", false, false, false, false);
            this.pppLcp = new PppLcpEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pppLcp
            };
        }
        public static final class PppLcpEnt extends MIBEntry<PPPLCPMIBDef>
        {
            /** The individual groups within the PPP-LCP-MIB*/
            public final PppLinkEnt pppLink;

            public final PppLqrEnt pppLqr;

            public final PppTestsEnt pppTests;

            private PppLcpEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
            {
                super(mib, parent, "pppLcp", "1.3.6.1.2.1.10.23.1", false, false, false, false);
                this.pppLink = new PppLinkEnt(mib, this);
                this.pppLqr = new PppLqrEnt(mib, this);
                this.pppTests = new PppTestsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppLink,
                    this.pppLqr,
                    this.pppTests
                };
            }
            public static final class PppLinkEnt extends MIBEntry<PPPLCPMIBDef>
            {
                /** 4.1.  PPP Link Group

The PPP Link Group. Implementation of thisgroup is mandatory for all PPP entities.
The following object reflect the values of the optionparameters used in the PPP Link Control ProtocolpppLinkStatusLocalMRUpppLinkStatusRemoteMRUpppLinkStatusLocalToPeerACCMappppLinkStatusPeerToLocalACCMappppLinkStatusLocalToRemoteProtocolCompressionpppLinkStatusRemoteToLocalProtocolCompressionpppLinkStatusLocalToRemoteACCompressionpppLinkStatusRemoteToLocalACCompressionpppLinkStatusTransmitFcsSizepppLinkStatusReceiveFcsSizeThese values are not available until after the PPP Optionnegotiation has completed, which is indicated by the linkreaching the open state (i.e., ifOperStatus is set toup).Therefore, when ifOperStatus is not upthe contents of these objects is undefined. The valuereturned when accessing the objects is an implementationdependent issue.*/
                public final PppLinkStatusTableEnt pppLinkStatusTable;

                public final PppLinkConfigTableEnt pppLinkConfigTable;

                private PppLinkEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                {
                    super(mib, parent, "pppLink", "1.3.6.1.2.1.10.23.1.1", false, false, false, false);
                    this.pppLinkStatusTable = new PppLinkStatusTableEnt(mib, this);
                    this.pppLinkConfigTable = new PppLinkConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppLinkStatusTable,
                        this.pppLinkConfigTable
                    };
                }
                public static final class PppLinkStatusTableEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    public final PppLinkStatusEntryEnt pppLinkStatusEntry;

                    private PppLinkStatusTableEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppLinkStatusTable", "1.3.6.1.2.1.10.23.1.1.1", false, true, false, false);
                        this.pppLinkStatusEntry = new PppLinkStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pppLinkStatusEntry
                        };
                    }
                    public static final class PppLinkStatusEntryEnt extends MIBEntry<PPPLCPMIBDef>
                    {
                        public final PppLinkStatusPhysicalIndexEnt pppLinkStatusPhysicalIndex;

                        public final PppLinkStatusBadAddressesEnt pppLinkStatusBadAddresses;

                        public final PppLinkStatusBadControlsEnt pppLinkStatusBadControls;

                        public final PppLinkStatusPacketTooLongsEnt pppLinkStatusPacketTooLongs;

                        public final PppLinkStatusBadFCSsEnt pppLinkStatusBadFCSs;

                        public final PppLinkStatusLocalMRUEnt pppLinkStatusLocalMRU;

                        public final PppLinkStatusRemoteMRUEnt pppLinkStatusRemoteMRU;

                        public final PppLinkStatusLocalToPeerACCMapEnt pppLinkStatusLocalToPeerACCMap;

                        public final PppLinkStatusPeerToLocalACCMapEnt pppLinkStatusPeerToLocalACCMap;

                        public final PppLinkStatusLocalToRemoteProtocolCompressionEnt pppLinkStatusLocalToRemoteProtocolCompression;

                        public final PppLinkStatusRemoteToLocalProtocolCompressionEnt pppLinkStatusRemoteToLocalProtocolCompression;

                        public final PppLinkStatusLocalToRemoteACCompressionEnt pppLinkStatusLocalToRemoteACCompression;

                        public final PppLinkStatusRemoteToLocalACCompressionEnt pppLinkStatusRemoteToLocalACCompression;

                        public final PppLinkStatusTransmitFcsSizeEnt pppLinkStatusTransmitFcsSize;

                        public final PppLinkStatusReceiveFcsSizeEnt pppLinkStatusReceiveFcsSize;

                        private PppLinkStatusEntryEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                        {
                            super(mib, parent, "pppLinkStatusEntry", "1.3.6.1.2.1.10.23.1.1.1.1", false, false, false, true);
                            this.pppLinkStatusPhysicalIndex = new PppLinkStatusPhysicalIndexEnt(mib, this);
                            this.pppLinkStatusBadAddresses = new PppLinkStatusBadAddressesEnt(mib, this);
                            this.pppLinkStatusBadControls = new PppLinkStatusBadControlsEnt(mib, this);
                            this.pppLinkStatusPacketTooLongs = new PppLinkStatusPacketTooLongsEnt(mib, this);
                            this.pppLinkStatusBadFCSs = new PppLinkStatusBadFCSsEnt(mib, this);
                            this.pppLinkStatusLocalMRU = new PppLinkStatusLocalMRUEnt(mib, this);
                            this.pppLinkStatusRemoteMRU = new PppLinkStatusRemoteMRUEnt(mib, this);
                            this.pppLinkStatusLocalToPeerACCMap = new PppLinkStatusLocalToPeerACCMapEnt(mib, this);
                            this.pppLinkStatusPeerToLocalACCMap = new PppLinkStatusPeerToLocalACCMapEnt(mib, this);
                            this.pppLinkStatusLocalToRemoteProtocolCompression = new PppLinkStatusLocalToRemoteProtocolCompressionEnt(mib, this);
                            this.pppLinkStatusRemoteToLocalProtocolCompression = new PppLinkStatusRemoteToLocalProtocolCompressionEnt(mib, this);
                            this.pppLinkStatusLocalToRemoteACCompression = new PppLinkStatusLocalToRemoteACCompressionEnt(mib, this);
                            this.pppLinkStatusRemoteToLocalACCompression = new PppLinkStatusRemoteToLocalACCompressionEnt(mib, this);
                            this.pppLinkStatusTransmitFcsSize = new PppLinkStatusTransmitFcsSizeEnt(mib, this);
                            this.pppLinkStatusReceiveFcsSize = new PppLinkStatusReceiveFcsSizeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pppLinkStatusPhysicalIndex,
                                this.pppLinkStatusBadAddresses,
                                this.pppLinkStatusBadControls,
                                this.pppLinkStatusPacketTooLongs,
                                this.pppLinkStatusBadFCSs,
                                this.pppLinkStatusLocalMRU,
                                this.pppLinkStatusRemoteMRU,
                                this.pppLinkStatusLocalToPeerACCMap,
                                this.pppLinkStatusPeerToLocalACCMap,
                                this.pppLinkStatusLocalToRemoteProtocolCompression,
                                this.pppLinkStatusRemoteToLocalProtocolCompression,
                                this.pppLinkStatusLocalToRemoteACCompression,
                                this.pppLinkStatusRemoteToLocalACCompression,
                                this.pppLinkStatusTransmitFcsSize,
                                this.pppLinkStatusReceiveFcsSize
                            };
                        }
                        public static final class PppLinkStatusPhysicalIndexEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusPhysicalIndexEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusPhysicalIndex", "1.3.6.1.2.1.10.23.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusBadAddressesEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusBadAddressesEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusBadAddresses", "1.3.6.1.2.1.10.23.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusBadControlsEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusBadControlsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusBadControls", "1.3.6.1.2.1.10.23.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusPacketTooLongsEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusPacketTooLongsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusPacketTooLongs", "1.3.6.1.2.1.10.23.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusBadFCSsEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusBadFCSsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusBadFCSs", "1.3.6.1.2.1.10.23.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusLocalMRUEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusLocalMRUEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusLocalMRU", "1.3.6.1.2.1.10.23.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusRemoteMRUEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusRemoteMRUEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusRemoteMRU", "1.3.6.1.2.1.10.23.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusLocalToPeerACCMapEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusLocalToPeerACCMapEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusLocalToPeerACCMap", "1.3.6.1.2.1.10.23.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusPeerToLocalACCMapEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusPeerToLocalACCMapEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusPeerToLocalACCMap", "1.3.6.1.2.1.10.23.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusLocalToRemoteProtocolCompressionEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusLocalToRemoteProtocolCompressionEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusLocalToRemoteProtocolCompression", "1.3.6.1.2.1.10.23.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusRemoteToLocalProtocolCompressionEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusRemoteToLocalProtocolCompressionEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusRemoteToLocalProtocolCompression", "1.3.6.1.2.1.10.23.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusLocalToRemoteACCompressionEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusLocalToRemoteACCompressionEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusLocalToRemoteACCompression", "1.3.6.1.2.1.10.23.1.1.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusRemoteToLocalACCompressionEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusRemoteToLocalACCompressionEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusRemoteToLocalACCompression", "1.3.6.1.2.1.10.23.1.1.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusTransmitFcsSizeEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusTransmitFcsSizeEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusTransmitFcsSize", "1.3.6.1.2.1.10.23.1.1.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkStatusReceiveFcsSizeEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkStatusReceiveFcsSizeEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkStatusReceiveFcsSize", "1.3.6.1.2.1.10.23.1.1.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PppLinkConfigTableEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    public final PppLinkConfigEntryEnt pppLinkConfigEntry;

                    private PppLinkConfigTableEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppLinkConfigTable", "1.3.6.1.2.1.10.23.1.1.2", false, true, false, false);
                        this.pppLinkConfigEntry = new PppLinkConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pppLinkConfigEntry
                        };
                    }
                    public static final class PppLinkConfigEntryEnt extends MIBEntry<PPPLCPMIBDef>
                    {
                        public final PppLinkConfigInitialMRUEnt pppLinkConfigInitialMRU;

                        public final PppLinkConfigReceiveACCMapEnt pppLinkConfigReceiveACCMap;

                        public final PppLinkConfigTransmitACCMapEnt pppLinkConfigTransmitACCMap;

                        public final PppLinkConfigMagicNumberEnt pppLinkConfigMagicNumber;

                        public final PppLinkConfigFcsSizeEnt pppLinkConfigFcsSize;

                        private PppLinkConfigEntryEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                        {
                            super(mib, parent, "pppLinkConfigEntry", "1.3.6.1.2.1.10.23.1.1.2.1", false, false, false, true);
                            this.pppLinkConfigInitialMRU = new PppLinkConfigInitialMRUEnt(mib, this);
                            this.pppLinkConfigReceiveACCMap = new PppLinkConfigReceiveACCMapEnt(mib, this);
                            this.pppLinkConfigTransmitACCMap = new PppLinkConfigTransmitACCMapEnt(mib, this);
                            this.pppLinkConfigMagicNumber = new PppLinkConfigMagicNumberEnt(mib, this);
                            this.pppLinkConfigFcsSize = new PppLinkConfigFcsSizeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pppLinkConfigInitialMRU,
                                this.pppLinkConfigReceiveACCMap,
                                this.pppLinkConfigTransmitACCMap,
                                this.pppLinkConfigMagicNumber,
                                this.pppLinkConfigFcsSize
                            };
                        }
                        public static final class PppLinkConfigInitialMRUEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkConfigInitialMRUEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkConfigInitialMRU", "1.3.6.1.2.1.10.23.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkConfigReceiveACCMapEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkConfigReceiveACCMapEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkConfigReceiveACCMap", "1.3.6.1.2.1.10.23.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkConfigTransmitACCMapEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkConfigTransmitACCMapEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkConfigTransmitACCMap", "1.3.6.1.2.1.10.23.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkConfigMagicNumberEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkConfigMagicNumberEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkConfigMagicNumber", "1.3.6.1.2.1.10.23.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLinkConfigFcsSizeEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLinkConfigFcsSizeEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLinkConfigFcsSize", "1.3.6.1.2.1.10.23.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PppLqrEnt extends MIBEntry<PPPLCPMIBDef>
            {
                /** 4.2.  PPP LQR Group

The PPP LQR Group.Implementation of this group is mandatory for allPPP implementations that implement LQR.*/
                public final PppLqrTableEnt pppLqrTable;

                /** The PPP LQR Configuration table.*/
                public final PppLqrConfigTableEnt pppLqrConfigTable;

                /** 4.3.  PPP LQR Extensions Group

The PPP LQR Extensions Group.Implementation of this group is optional.The intent of this group is to allow externalimplementation of the policy mechanisms thatare used to declare a link to be "bad" or not.It is not practical to examine the MIB objectswhich are used to generate LQR packets sinceLQR policies tend to require synchronization ofthe values of all data used to determine LinkQuality; i.e. the values of the relevant countersmust all be taken at the same instant in time.*/
                public final PppLqrExtnsTableEnt pppLqrExtnsTable;

                private PppLqrEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                {
                    super(mib, parent, "pppLqr", "1.3.6.1.2.1.10.23.1.2", false, false, false, false);
                    this.pppLqrTable = new PppLqrTableEnt(mib, this);
                    this.pppLqrConfigTable = new PppLqrConfigTableEnt(mib, this);
                    this.pppLqrExtnsTable = new PppLqrExtnsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppLqrTable,
                        this.pppLqrConfigTable,
                        this.pppLqrExtnsTable
                    };
                }
                public static final class PppLqrTableEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    public final PppLqrEntryEnt pppLqrEntry;

                    private PppLqrTableEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppLqrTable", "1.3.6.1.2.1.10.23.1.2.1", false, true, false, false);
                        this.pppLqrEntry = new PppLqrEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pppLqrEntry
                        };
                    }
                    public static final class PppLqrEntryEnt extends MIBEntry<PPPLCPMIBDef>
                    {
                        public final PppLqrQualityEnt pppLqrQuality;

                        public final PppLqrInGoodOctetsEnt pppLqrInGoodOctets;

                        public final PppLqrLocalPeriodEnt pppLqrLocalPeriod;

                        public final PppLqrRemotePeriodEnt pppLqrRemotePeriod;

                        public final PppLqrOutLQRsEnt pppLqrOutLQRs;

                        public final PppLqrInLQRsEnt pppLqrInLQRs;

                        private PppLqrEntryEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                        {
                            super(mib, parent, "pppLqrEntry", "1.3.6.1.2.1.10.23.1.2.1.1", false, false, false, true);
                            this.pppLqrQuality = new PppLqrQualityEnt(mib, this);
                            this.pppLqrInGoodOctets = new PppLqrInGoodOctetsEnt(mib, this);
                            this.pppLqrLocalPeriod = new PppLqrLocalPeriodEnt(mib, this);
                            this.pppLqrRemotePeriod = new PppLqrRemotePeriodEnt(mib, this);
                            this.pppLqrOutLQRs = new PppLqrOutLQRsEnt(mib, this);
                            this.pppLqrInLQRs = new PppLqrInLQRsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pppLqrQuality,
                                this.pppLqrInGoodOctets,
                                this.pppLqrLocalPeriod,
                                this.pppLqrRemotePeriod,
                                this.pppLqrOutLQRs,
                                this.pppLqrInLQRs
                            };
                        }
                        public static final class PppLqrQualityEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrQualityEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrQuality", "1.3.6.1.2.1.10.23.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLqrInGoodOctetsEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrInGoodOctetsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrInGoodOctets", "1.3.6.1.2.1.10.23.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLqrLocalPeriodEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrLocalPeriodEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrLocalPeriod", "1.3.6.1.2.1.10.23.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLqrRemotePeriodEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrRemotePeriodEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrRemotePeriod", "1.3.6.1.2.1.10.23.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLqrOutLQRsEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrOutLQRsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrOutLQRs", "1.3.6.1.2.1.10.23.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLqrInLQRsEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrInLQRsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrInLQRs", "1.3.6.1.2.1.10.23.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PppLqrConfigTableEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    public final PppLqrConfigEntryEnt pppLqrConfigEntry;

                    private PppLqrConfigTableEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppLqrConfigTable", "1.3.6.1.2.1.10.23.1.2.2", false, true, false, false);
                        this.pppLqrConfigEntry = new PppLqrConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pppLqrConfigEntry
                        };
                    }
                    public static final class PppLqrConfigEntryEnt extends MIBEntry<PPPLCPMIBDef>
                    {
                        public final PppLqrConfigPeriodEnt pppLqrConfigPeriod;

                        public final PppLqrConfigStatusEnt pppLqrConfigStatus;

                        private PppLqrConfigEntryEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                        {
                            super(mib, parent, "pppLqrConfigEntry", "1.3.6.1.2.1.10.23.1.2.2.1", false, false, false, true);
                            this.pppLqrConfigPeriod = new PppLqrConfigPeriodEnt(mib, this);
                            this.pppLqrConfigStatus = new PppLqrConfigStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pppLqrConfigPeriod,
                                this.pppLqrConfigStatus
                            };
                        }
                        public static final class PppLqrConfigPeriodEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrConfigPeriodEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrConfigPeriod", "1.3.6.1.2.1.10.23.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PppLqrConfigStatusEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrConfigStatusEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrConfigStatus", "1.3.6.1.2.1.10.23.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PppLqrExtnsTableEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    public final PppLqrExtnsEntryEnt pppLqrExtnsEntry;

                    private PppLqrExtnsTableEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppLqrExtnsTable", "1.3.6.1.2.1.10.23.1.2.3", false, true, false, false);
                        this.pppLqrExtnsEntry = new PppLqrExtnsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pppLqrExtnsEntry
                        };
                    }
                    public static final class PppLqrExtnsEntryEnt extends MIBEntry<PPPLCPMIBDef>
                    {
                        public final PppLqrExtnsLastReceivedLqrPacketEnt pppLqrExtnsLastReceivedLqrPacket;

                        private PppLqrExtnsEntryEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                        {
                            super(mib, parent, "pppLqrExtnsEntry", "1.3.6.1.2.1.10.23.1.2.3.1", false, false, false, true);
                            this.pppLqrExtnsLastReceivedLqrPacket = new PppLqrExtnsLastReceivedLqrPacketEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pppLqrExtnsLastReceivedLqrPacket
                            };
                        }
                        public static final class PppLqrExtnsLastReceivedLqrPacketEnt extends MIBEntry<PPPLCPMIBDef>
                        {
                            private PppLqrExtnsLastReceivedLqrPacketEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                            {
                                super(mib, parent, "pppLqrExtnsLastReceivedLqrPacket", "1.3.6.1.2.1.10.23.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PppTestsEnt extends MIBEntry<PPPLCPMIBDef>
            {
                /** 4.4.  PPP Tests
The extensions to the interface table in RFC1229 define atable through which the network manager can instruct themanaged object to perform various tests of the interface. Thisis the ifExtnsTestTable.
The PPP MIB defines two such tests.
4.4.1.  PPP Echo Test
The PPP Echo Test is defined as*/
                public final PppEchoTestEnt pppEchoTest;

                /** Invoking this test causes a PPP Echo Packet to be sent on theline. ifExtnsTestResult returns success(2) if the echoresponse came back properly. It returns failed(7) if theresponse did not properly return. The definition of "proper"
in this context is left to the discretion of the implementor.
4.4.2.  PPP Discard Test
The PPP Discard Test is defined as*/
                public final PppDiscardTestEnt pppDiscardTest;

                private PppTestsEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                {
                    super(mib, parent, "pppTests", "1.3.6.1.2.1.10.23.1.3", false, false, false, false);
                    this.pppEchoTest = new PppEchoTestEnt(mib, this);
                    this.pppDiscardTest = new PppDiscardTestEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppEchoTest,
                        this.pppDiscardTest
                    };
                }
                public static final class PppEchoTestEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    private PppEchoTestEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppEchoTest", "1.3.6.1.2.1.10.23.1.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppDiscardTestEnt extends MIBEntry<PPPLCPMIBDef>
                {
                    private PppDiscardTestEnt(PPPLCPMIBDef mib, MIBEntry<PPPLCPMIBDef> parent)
                    {
                        super(mib, parent, "pppDiscardTest", "1.3.6.1.2.1.10.23.1.3.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
