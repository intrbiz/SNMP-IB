package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class DOT3EPONMIBDef extends MIB
{
    public static final DOT3EPONMIBDef DOT3EPONMIB = new DOT3EPONMIBDef();

    /** March 29, 2007*/
    public final Dot3EponMIBEnt dot3EponMIB;

    private DOT3EPONMIBDef()
    {
        super("DOT3-EPON-MIB");
        this.dot3EponMIB = new Dot3EponMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot3EponMIB
        };
    }

    public static final class Dot3EponMIBEnt extends MIBEntry<DOT3EPONMIBDef>
    {
        public final Dot3EponObjectsEnt dot3EponObjects;

        public final Dot3EponConformanceEnt dot3EponConformance;

        private Dot3EponMIBEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
        {
            super(mib, parent, "dot3EponMIB", "1.3.6.1.2.1.155", false, false, false, false);
            this.dot3EponObjects = new Dot3EponObjectsEnt(mib, this);
            this.dot3EponConformance = new Dot3EponConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot3EponObjects,
                this.dot3EponConformance
            };
        }
        public static final class Dot3EponObjectsEnt extends MIBEntry<DOT3EPONMIBDef>
        {
            /** MPCP MIB modules definitions ([802.3ah], clause 30.3.5)*/
            public final Dot3EponMpcpObjectsEnt dot3EponMpcpObjects;

            /** Optical Multi Point Emulation (OMPEmulation)managed object definitions*/
            public final Dot3OmpEmulationObjectsEnt dot3OmpEmulationObjects;

            /** FEC managed object definitions (30.5.1)*/
            public final Dot3EponFecObjectsEnt dot3EponFecObjects;

            /** ExtendedPackage managed object definitions*/
            public final Dot3ExtPkgObjectsEnt dot3ExtPkgObjects;

            private Dot3EponObjectsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
            {
                super(mib, parent, "dot3EponObjects", "1.3.6.1.2.1.155.1", false, false, false, false);
                this.dot3EponMpcpObjects = new Dot3EponMpcpObjectsEnt(mib, this);
                this.dot3OmpEmulationObjects = new Dot3OmpEmulationObjectsEnt(mib, this);
                this.dot3EponFecObjects = new Dot3EponFecObjectsEnt(mib, this);
                this.dot3ExtPkgObjects = new Dot3ExtPkgObjectsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3EponMpcpObjects,
                    this.dot3OmpEmulationObjects,
                    this.dot3EponFecObjects,
                    this.dot3ExtPkgObjects
                };
            }
            public static final class Dot3EponMpcpObjectsEnt extends MIBEntry<DOT3EPONMIBDef>
            {
                public final Dot3MpcpControlTableEnt dot3MpcpControlTable;

                public final Dot3MpcpStatTableEnt dot3MpcpStatTable;

                private Dot3EponMpcpObjectsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                {
                    super(mib, parent, "dot3EponMpcpObjects", "1.3.6.1.2.1.155.1.1", false, false, false, false);
                    this.dot3MpcpControlTable = new Dot3MpcpControlTableEnt(mib, this);
                    this.dot3MpcpStatTable = new Dot3MpcpStatTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3MpcpControlTable,
                        this.dot3MpcpStatTable
                    };
                }
                public static final class Dot3MpcpControlTableEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    public final Dot3MpcpControlEntryEnt dot3MpcpControlEntry;

                    private Dot3MpcpControlTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3MpcpControlTable", "1.3.6.1.2.1.155.1.1.1", false, true, false, false);
                        this.dot3MpcpControlEntry = new Dot3MpcpControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3MpcpControlEntry
                        };
                    }
                    public static final class Dot3MpcpControlEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3MpcpOperStatusEnt dot3MpcpOperStatus;

                        public final Dot3MpcpAdminStateEnt dot3MpcpAdminState;

                        public final Dot3MpcpModeEnt dot3MpcpMode;

                        public final Dot3MpcpSyncTimeEnt dot3MpcpSyncTime;

                        public final Dot3MpcpLinkIDEnt dot3MpcpLinkID;

                        public final Dot3MpcpRemoteMACAddressEnt dot3MpcpRemoteMACAddress;

                        public final Dot3MpcpRegistrationStateEnt dot3MpcpRegistrationState;

                        public final Dot3MpcpTransmitElapsedEnt dot3MpcpTransmitElapsed;

                        public final Dot3MpcpReceiveElapsedEnt dot3MpcpReceiveElapsed;

                        public final Dot3MpcpRoundTripTimeEnt dot3MpcpRoundTripTime;

                        public final Dot3MpcpMaximumPendingGrantsEnt dot3MpcpMaximumPendingGrants;

                        private Dot3MpcpControlEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3MpcpControlEntry", "1.3.6.1.2.1.155.1.1.1.1", false, false, false, true);
                            this.dot3MpcpOperStatus = new Dot3MpcpOperStatusEnt(mib, this);
                            this.dot3MpcpAdminState = new Dot3MpcpAdminStateEnt(mib, this);
                            this.dot3MpcpMode = new Dot3MpcpModeEnt(mib, this);
                            this.dot3MpcpSyncTime = new Dot3MpcpSyncTimeEnt(mib, this);
                            this.dot3MpcpLinkID = new Dot3MpcpLinkIDEnt(mib, this);
                            this.dot3MpcpRemoteMACAddress = new Dot3MpcpRemoteMACAddressEnt(mib, this);
                            this.dot3MpcpRegistrationState = new Dot3MpcpRegistrationStateEnt(mib, this);
                            this.dot3MpcpTransmitElapsed = new Dot3MpcpTransmitElapsedEnt(mib, this);
                            this.dot3MpcpReceiveElapsed = new Dot3MpcpReceiveElapsedEnt(mib, this);
                            this.dot3MpcpRoundTripTime = new Dot3MpcpRoundTripTimeEnt(mib, this);
                            this.dot3MpcpMaximumPendingGrants = new Dot3MpcpMaximumPendingGrantsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3MpcpOperStatus,
                                this.dot3MpcpAdminState,
                                this.dot3MpcpMode,
                                this.dot3MpcpSyncTime,
                                this.dot3MpcpLinkID,
                                this.dot3MpcpRemoteMACAddress,
                                this.dot3MpcpRegistrationState,
                                this.dot3MpcpTransmitElapsed,
                                this.dot3MpcpReceiveElapsed,
                                this.dot3MpcpRoundTripTime,
                                this.dot3MpcpMaximumPendingGrants
                            };
                        }
                        public static final class Dot3MpcpOperStatusEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpOperStatusEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpOperStatus", "1.3.6.1.2.1.155.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpAdminStateEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpAdminStateEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpAdminState", "1.3.6.1.2.1.155.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpModeEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpModeEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpMode", "1.3.6.1.2.1.155.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpSyncTimeEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpSyncTimeEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpSyncTime", "1.3.6.1.2.1.155.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpLinkIDEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpLinkIDEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpLinkID", "1.3.6.1.2.1.155.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRemoteMACAddressEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRemoteMACAddressEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRemoteMACAddress", "1.3.6.1.2.1.155.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRegistrationStateEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRegistrationStateEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRegistrationState", "1.3.6.1.2.1.155.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpTransmitElapsedEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpTransmitElapsedEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpTransmitElapsed", "1.3.6.1.2.1.155.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpReceiveElapsedEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpReceiveElapsedEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpReceiveElapsed", "1.3.6.1.2.1.155.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRoundTripTimeEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRoundTripTimeEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRoundTripTime", "1.3.6.1.2.1.155.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpMaximumPendingGrantsEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpMaximumPendingGrantsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpMaximumPendingGrants", "1.3.6.1.2.1.155.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot3MpcpStatTableEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    public final Dot3MpcpStatEntryEnt dot3MpcpStatEntry;

                    private Dot3MpcpStatTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3MpcpStatTable", "1.3.6.1.2.1.155.1.1.2", false, true, false, false);
                        this.dot3MpcpStatEntry = new Dot3MpcpStatEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3MpcpStatEntry
                        };
                    }
                    public static final class Dot3MpcpStatEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3MpcpMACCtrlFramesTransmittedEnt dot3MpcpMACCtrlFramesTransmitted;

                        public final Dot3MpcpMACCtrlFramesReceivedEnt dot3MpcpMACCtrlFramesReceived;

                        public final Dot3MpcpDiscoveryWindowsSentEnt dot3MpcpDiscoveryWindowsSent;

                        public final Dot3MpcpDiscoveryTimeoutEnt dot3MpcpDiscoveryTimeout;

                        public final Dot3MpcpTxRegRequestEnt dot3MpcpTxRegRequest;

                        public final Dot3MpcpRxRegRequestEnt dot3MpcpRxRegRequest;

                        public final Dot3MpcpTxRegAckEnt dot3MpcpTxRegAck;

                        public final Dot3MpcpRxRegAckEnt dot3MpcpRxRegAck;

                        public final Dot3MpcpTxReportEnt dot3MpcpTxReport;

                        public final Dot3MpcpRxReportEnt dot3MpcpRxReport;

                        public final Dot3MpcpTxGateEnt dot3MpcpTxGate;

                        public final Dot3MpcpRxGateEnt dot3MpcpRxGate;

                        public final Dot3MpcpTxRegisterEnt dot3MpcpTxRegister;

                        public final Dot3MpcpRxRegisterEnt dot3MpcpRxRegister;

                        private Dot3MpcpStatEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3MpcpStatEntry", "1.3.6.1.2.1.155.1.1.2.1", false, false, false, true);
                            this.dot3MpcpMACCtrlFramesTransmitted = new Dot3MpcpMACCtrlFramesTransmittedEnt(mib, this);
                            this.dot3MpcpMACCtrlFramesReceived = new Dot3MpcpMACCtrlFramesReceivedEnt(mib, this);
                            this.dot3MpcpDiscoveryWindowsSent = new Dot3MpcpDiscoveryWindowsSentEnt(mib, this);
                            this.dot3MpcpDiscoveryTimeout = new Dot3MpcpDiscoveryTimeoutEnt(mib, this);
                            this.dot3MpcpTxRegRequest = new Dot3MpcpTxRegRequestEnt(mib, this);
                            this.dot3MpcpRxRegRequest = new Dot3MpcpRxRegRequestEnt(mib, this);
                            this.dot3MpcpTxRegAck = new Dot3MpcpTxRegAckEnt(mib, this);
                            this.dot3MpcpRxRegAck = new Dot3MpcpRxRegAckEnt(mib, this);
                            this.dot3MpcpTxReport = new Dot3MpcpTxReportEnt(mib, this);
                            this.dot3MpcpRxReport = new Dot3MpcpRxReportEnt(mib, this);
                            this.dot3MpcpTxGate = new Dot3MpcpTxGateEnt(mib, this);
                            this.dot3MpcpRxGate = new Dot3MpcpRxGateEnt(mib, this);
                            this.dot3MpcpTxRegister = new Dot3MpcpTxRegisterEnt(mib, this);
                            this.dot3MpcpRxRegister = new Dot3MpcpRxRegisterEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3MpcpMACCtrlFramesTransmitted,
                                this.dot3MpcpMACCtrlFramesReceived,
                                this.dot3MpcpDiscoveryWindowsSent,
                                this.dot3MpcpDiscoveryTimeout,
                                this.dot3MpcpTxRegRequest,
                                this.dot3MpcpRxRegRequest,
                                this.dot3MpcpTxRegAck,
                                this.dot3MpcpRxRegAck,
                                this.dot3MpcpTxReport,
                                this.dot3MpcpRxReport,
                                this.dot3MpcpTxGate,
                                this.dot3MpcpRxGate,
                                this.dot3MpcpTxRegister,
                                this.dot3MpcpRxRegister
                            };
                        }
                        public static final class Dot3MpcpMACCtrlFramesTransmittedEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpMACCtrlFramesTransmittedEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpMACCtrlFramesTransmitted", "1.3.6.1.2.1.155.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpMACCtrlFramesReceivedEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpMACCtrlFramesReceivedEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpMACCtrlFramesReceived", "1.3.6.1.2.1.155.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpDiscoveryWindowsSentEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpDiscoveryWindowsSentEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpDiscoveryWindowsSent", "1.3.6.1.2.1.155.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpDiscoveryTimeoutEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpDiscoveryTimeoutEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpDiscoveryTimeout", "1.3.6.1.2.1.155.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpTxRegRequestEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpTxRegRequestEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpTxRegRequest", "1.3.6.1.2.1.155.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRxRegRequestEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRxRegRequestEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRxRegRequest", "1.3.6.1.2.1.155.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpTxRegAckEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpTxRegAckEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpTxRegAck", "1.3.6.1.2.1.155.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRxRegAckEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRxRegAckEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRxRegAck", "1.3.6.1.2.1.155.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpTxReportEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpTxReportEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpTxReport", "1.3.6.1.2.1.155.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRxReportEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRxReportEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRxReport", "1.3.6.1.2.1.155.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpTxGateEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpTxGateEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpTxGate", "1.3.6.1.2.1.155.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRxGateEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRxGateEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRxGate", "1.3.6.1.2.1.155.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpTxRegisterEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpTxRegisterEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpTxRegister", "1.3.6.1.2.1.155.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3MpcpRxRegisterEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3MpcpRxRegisterEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3MpcpRxRegister", "1.3.6.1.2.1.155.1.1.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot3OmpEmulationObjectsEnt extends MIBEntry<DOT3EPONMIBDef>
            {
                public final Dot3OmpEmulationTableEnt dot3OmpEmulationTable;

                public final Dot3OmpEmulationStatTableEnt dot3OmpEmulationStatTable;

                private Dot3OmpEmulationObjectsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                {
                    super(mib, parent, "dot3OmpEmulationObjects", "1.3.6.1.2.1.155.1.2", false, false, false, false);
                    this.dot3OmpEmulationTable = new Dot3OmpEmulationTableEnt(mib, this);
                    this.dot3OmpEmulationStatTable = new Dot3OmpEmulationStatTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3OmpEmulationTable,
                        this.dot3OmpEmulationStatTable
                    };
                }
                public static final class Dot3OmpEmulationTableEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    public final Dot3OmpEmulationEntryEnt dot3OmpEmulationEntry;

                    private Dot3OmpEmulationTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3OmpEmulationTable", "1.3.6.1.2.1.155.1.2.1", false, true, false, false);
                        this.dot3OmpEmulationEntry = new Dot3OmpEmulationEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OmpEmulationEntry
                        };
                    }
                    public static final class Dot3OmpEmulationEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3OmpEmulationTypeEnt dot3OmpEmulationType;

                        private Dot3OmpEmulationEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3OmpEmulationEntry", "1.3.6.1.2.1.155.1.2.1.1", false, false, false, true);
                            this.dot3OmpEmulationType = new Dot3OmpEmulationTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3OmpEmulationType
                            };
                        }
                        public static final class Dot3OmpEmulationTypeEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationTypeEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationType", "1.3.6.1.2.1.155.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot3OmpEmulationStatTableEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    public final Dot3OmpEmulationStatEntryEnt dot3OmpEmulationStatEntry;

                    private Dot3OmpEmulationStatTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3OmpEmulationStatTable", "1.3.6.1.2.1.155.1.2.2", false, true, false, false);
                        this.dot3OmpEmulationStatEntry = new Dot3OmpEmulationStatEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3OmpEmulationStatEntry
                        };
                    }
                    public static final class Dot3OmpEmulationStatEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3OmpEmulationSLDErrorsEnt dot3OmpEmulationSLDErrors;

                        public final Dot3OmpEmulationCRC8ErrorsEnt dot3OmpEmulationCRC8Errors;

                        public final Dot3OmpEmulationBadLLIDEnt dot3OmpEmulationBadLLID;

                        public final Dot3OmpEmulationGoodLLIDEnt dot3OmpEmulationGoodLLID;

                        public final Dot3OmpEmulationOnuPonCastLLIDEnt dot3OmpEmulationOnuPonCastLLID;

                        public final Dot3OmpEmulationOltPonCastLLIDEnt dot3OmpEmulationOltPonCastLLID;

                        public final Dot3OmpEmulationBroadcastBitNotOnuLlidEnt dot3OmpEmulationBroadcastBitNotOnuLlid;

                        public final Dot3OmpEmulationOnuLLIDNotBroadcastEnt dot3OmpEmulationOnuLLIDNotBroadcast;

                        public final Dot3OmpEmulationBroadcastBitPlusOnuLlidEnt dot3OmpEmulationBroadcastBitPlusOnuLlid;

                        public final Dot3OmpEmulationNotBroadcastBitNotOnuLlidEnt dot3OmpEmulationNotBroadcastBitNotOnuLlid;

                        private Dot3OmpEmulationStatEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3OmpEmulationStatEntry", "1.3.6.1.2.1.155.1.2.2.1", false, false, false, true);
                            this.dot3OmpEmulationSLDErrors = new Dot3OmpEmulationSLDErrorsEnt(mib, this);
                            this.dot3OmpEmulationCRC8Errors = new Dot3OmpEmulationCRC8ErrorsEnt(mib, this);
                            this.dot3OmpEmulationBadLLID = new Dot3OmpEmulationBadLLIDEnt(mib, this);
                            this.dot3OmpEmulationGoodLLID = new Dot3OmpEmulationGoodLLIDEnt(mib, this);
                            this.dot3OmpEmulationOnuPonCastLLID = new Dot3OmpEmulationOnuPonCastLLIDEnt(mib, this);
                            this.dot3OmpEmulationOltPonCastLLID = new Dot3OmpEmulationOltPonCastLLIDEnt(mib, this);
                            this.dot3OmpEmulationBroadcastBitNotOnuLlid = new Dot3OmpEmulationBroadcastBitNotOnuLlidEnt(mib, this);
                            this.dot3OmpEmulationOnuLLIDNotBroadcast = new Dot3OmpEmulationOnuLLIDNotBroadcastEnt(mib, this);
                            this.dot3OmpEmulationBroadcastBitPlusOnuLlid = new Dot3OmpEmulationBroadcastBitPlusOnuLlidEnt(mib, this);
                            this.dot3OmpEmulationNotBroadcastBitNotOnuLlid = new Dot3OmpEmulationNotBroadcastBitNotOnuLlidEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3OmpEmulationSLDErrors,
                                this.dot3OmpEmulationCRC8Errors,
                                this.dot3OmpEmulationBadLLID,
                                this.dot3OmpEmulationGoodLLID,
                                this.dot3OmpEmulationOnuPonCastLLID,
                                this.dot3OmpEmulationOltPonCastLLID,
                                this.dot3OmpEmulationBroadcastBitNotOnuLlid,
                                this.dot3OmpEmulationOnuLLIDNotBroadcast,
                                this.dot3OmpEmulationBroadcastBitPlusOnuLlid,
                                this.dot3OmpEmulationNotBroadcastBitNotOnuLlid
                            };
                        }
                        public static final class Dot3OmpEmulationSLDErrorsEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationSLDErrorsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationSLDErrors", "1.3.6.1.2.1.155.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationCRC8ErrorsEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationCRC8ErrorsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationCRC8Errors", "1.3.6.1.2.1.155.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationBadLLIDEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationBadLLIDEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationBadLLID", "1.3.6.1.2.1.155.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationGoodLLIDEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationGoodLLIDEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationGoodLLID", "1.3.6.1.2.1.155.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationOnuPonCastLLIDEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationOnuPonCastLLIDEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationOnuPonCastLLID", "1.3.6.1.2.1.155.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationOltPonCastLLIDEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationOltPonCastLLIDEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationOltPonCastLLID", "1.3.6.1.2.1.155.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationBroadcastBitNotOnuLlidEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationBroadcastBitNotOnuLlidEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationBroadcastBitNotOnuLlid", "1.3.6.1.2.1.155.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationOnuLLIDNotBroadcastEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationOnuLLIDNotBroadcastEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationOnuLLIDNotBroadcast", "1.3.6.1.2.1.155.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationBroadcastBitPlusOnuLlidEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationBroadcastBitPlusOnuLlidEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationBroadcastBitPlusOnuLlid", "1.3.6.1.2.1.155.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3OmpEmulationNotBroadcastBitNotOnuLlidEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3OmpEmulationNotBroadcastBitNotOnuLlidEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3OmpEmulationNotBroadcastBitNotOnuLlid", "1.3.6.1.2.1.155.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot3EponFecObjectsEnt extends MIBEntry<DOT3EPONMIBDef>
            {
                public final Dot3EponFecTableEnt dot3EponFecTable;

                private Dot3EponFecObjectsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                {
                    super(mib, parent, "dot3EponFecObjects", "1.3.6.1.2.1.155.1.3", false, false, false, false);
                    this.dot3EponFecTable = new Dot3EponFecTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3EponFecTable
                    };
                }
                public static final class Dot3EponFecTableEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    public final Dot3EponFecEntryEnt dot3EponFecEntry;

                    private Dot3EponFecTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3EponFecTable", "1.3.6.1.2.1.155.1.3.1", false, true, false, false);
                        this.dot3EponFecEntry = new Dot3EponFecEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3EponFecEntry
                        };
                    }
                    public static final class Dot3EponFecEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3EponFecPCSCodingViolationEnt dot3EponFecPCSCodingViolation;

                        public final Dot3EponFecAbilityEnt dot3EponFecAbility;

                        public final Dot3EponFecModeEnt dot3EponFecMode;

                        public final Dot3EponFecCorrectedBlocksEnt dot3EponFecCorrectedBlocks;

                        public final Dot3EponFecUncorrectableBlocksEnt dot3EponFecUncorrectableBlocks;

                        public final Dot3EponFecBufferHeadCodingViolationEnt dot3EponFecBufferHeadCodingViolation;

                        private Dot3EponFecEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3EponFecEntry", "1.3.6.1.2.1.155.1.3.1.1", false, false, false, true);
                            this.dot3EponFecPCSCodingViolation = new Dot3EponFecPCSCodingViolationEnt(mib, this);
                            this.dot3EponFecAbility = new Dot3EponFecAbilityEnt(mib, this);
                            this.dot3EponFecMode = new Dot3EponFecModeEnt(mib, this);
                            this.dot3EponFecCorrectedBlocks = new Dot3EponFecCorrectedBlocksEnt(mib, this);
                            this.dot3EponFecUncorrectableBlocks = new Dot3EponFecUncorrectableBlocksEnt(mib, this);
                            this.dot3EponFecBufferHeadCodingViolation = new Dot3EponFecBufferHeadCodingViolationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3EponFecPCSCodingViolation,
                                this.dot3EponFecAbility,
                                this.dot3EponFecMode,
                                this.dot3EponFecCorrectedBlocks,
                                this.dot3EponFecUncorrectableBlocks,
                                this.dot3EponFecBufferHeadCodingViolation
                            };
                        }
                        public static final class Dot3EponFecPCSCodingViolationEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3EponFecPCSCodingViolationEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3EponFecPCSCodingViolation", "1.3.6.1.2.1.155.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3EponFecAbilityEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3EponFecAbilityEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3EponFecAbility", "1.3.6.1.2.1.155.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3EponFecModeEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3EponFecModeEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3EponFecMode", "1.3.6.1.2.1.155.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3EponFecCorrectedBlocksEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3EponFecCorrectedBlocksEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3EponFecCorrectedBlocks", "1.3.6.1.2.1.155.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3EponFecUncorrectableBlocksEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3EponFecUncorrectableBlocksEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3EponFecUncorrectableBlocks", "1.3.6.1.2.1.155.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot3EponFecBufferHeadCodingViolationEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            private Dot3EponFecBufferHeadCodingViolationEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3EponFecBufferHeadCodingViolation", "1.3.6.1.2.1.155.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot3ExtPkgObjectsEnt extends MIBEntry<DOT3EPONMIBDef>
            {
                public final Dot3ExtPkgControlObjectsEnt dot3ExtPkgControlObjects;

                private Dot3ExtPkgObjectsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                {
                    super(mib, parent, "dot3ExtPkgObjects", "1.3.6.1.2.1.155.1.4", false, false, false, false);
                    this.dot3ExtPkgControlObjects = new Dot3ExtPkgControlObjectsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3ExtPkgControlObjects
                    };
                }
                public static final class Dot3ExtPkgControlObjectsEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    public final Dot3ExtPkgControlTableEnt dot3ExtPkgControlTable;

                    public final Dot3ExtPkgQueueTableEnt dot3ExtPkgQueueTable;

                    public final Dot3ExtPkgQueueSetsTableEnt dot3ExtPkgQueueSetsTable;

                    /** Optical Interface status tables*/
                    public final Dot3ExtPkgOptIfTableEnt dot3ExtPkgOptIfTable;

                    private Dot3ExtPkgControlObjectsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3ExtPkgControlObjects", "1.3.6.1.2.1.155.1.4.1", false, false, false, false);
                        this.dot3ExtPkgControlTable = new Dot3ExtPkgControlTableEnt(mib, this);
                        this.dot3ExtPkgQueueTable = new Dot3ExtPkgQueueTableEnt(mib, this);
                        this.dot3ExtPkgQueueSetsTable = new Dot3ExtPkgQueueSetsTableEnt(mib, this);
                        this.dot3ExtPkgOptIfTable = new Dot3ExtPkgOptIfTableEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot3ExtPkgControlTable,
                            this.dot3ExtPkgQueueTable,
                            this.dot3ExtPkgQueueSetsTable,
                            this.dot3ExtPkgOptIfTable
                        };
                    }
                    public static final class Dot3ExtPkgControlTableEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3ExtPkgControlEntryEnt dot3ExtPkgControlEntry;

                        private Dot3ExtPkgControlTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3ExtPkgControlTable", "1.3.6.1.2.1.155.1.4.1.1", false, true, false, false);
                            this.dot3ExtPkgControlEntry = new Dot3ExtPkgControlEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3ExtPkgControlEntry
                            };
                        }
                        public static final class Dot3ExtPkgControlEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            public final Dot3ExtPkgObjectResetEnt dot3ExtPkgObjectReset;

                            public final Dot3ExtPkgObjectPowerDownEnt dot3ExtPkgObjectPowerDown;

                            public final Dot3ExtPkgObjectNumberOfLLIDsEnt dot3ExtPkgObjectNumberOfLLIDs;

                            public final Dot3ExtPkgObjectFecEnabledEnt dot3ExtPkgObjectFecEnabled;

                            public final Dot3ExtPkgObjectReportMaximumNumQueuesEnt dot3ExtPkgObjectReportMaximumNumQueues;

                            public final Dot3ExtPkgObjectRegisterActionEnt dot3ExtPkgObjectRegisterAction;

                            private Dot3ExtPkgControlEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3ExtPkgControlEntry", "1.3.6.1.2.1.155.1.4.1.1.1", false, false, false, true);
                                this.dot3ExtPkgObjectReset = new Dot3ExtPkgObjectResetEnt(mib, this);
                                this.dot3ExtPkgObjectPowerDown = new Dot3ExtPkgObjectPowerDownEnt(mib, this);
                                this.dot3ExtPkgObjectNumberOfLLIDs = new Dot3ExtPkgObjectNumberOfLLIDsEnt(mib, this);
                                this.dot3ExtPkgObjectFecEnabled = new Dot3ExtPkgObjectFecEnabledEnt(mib, this);
                                this.dot3ExtPkgObjectReportMaximumNumQueues = new Dot3ExtPkgObjectReportMaximumNumQueuesEnt(mib, this);
                                this.dot3ExtPkgObjectRegisterAction = new Dot3ExtPkgObjectRegisterActionEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dot3ExtPkgObjectReset,
                                    this.dot3ExtPkgObjectPowerDown,
                                    this.dot3ExtPkgObjectNumberOfLLIDs,
                                    this.dot3ExtPkgObjectFecEnabled,
                                    this.dot3ExtPkgObjectReportMaximumNumQueues,
                                    this.dot3ExtPkgObjectRegisterAction
                                };
                            }
                            public static final class Dot3ExtPkgObjectResetEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectResetEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectReset", "1.3.6.1.2.1.155.1.4.1.1.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectPowerDownEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectPowerDownEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectPowerDown", "1.3.6.1.2.1.155.1.4.1.1.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectNumberOfLLIDsEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectNumberOfLLIDsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectNumberOfLLIDs", "1.3.6.1.2.1.155.1.4.1.1.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectFecEnabledEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectFecEnabledEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectFecEnabled", "1.3.6.1.2.1.155.1.4.1.1.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectReportMaximumNumQueuesEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectReportMaximumNumQueuesEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectReportMaximumNumQueues", "1.3.6.1.2.1.155.1.4.1.1.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectRegisterActionEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectRegisterActionEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectRegisterAction", "1.3.6.1.2.1.155.1.4.1.1.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Dot3ExtPkgQueueTableEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3ExtPkgQueueEntryEnt dot3ExtPkgQueueEntry;

                        private Dot3ExtPkgQueueTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3ExtPkgQueueTable", "1.3.6.1.2.1.155.1.4.1.2", false, true, false, false);
                            this.dot3ExtPkgQueueEntry = new Dot3ExtPkgQueueEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3ExtPkgQueueEntry
                            };
                        }
                        public static final class Dot3ExtPkgQueueEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            public final Dot3QueueIndexEnt dot3QueueIndex;

                            public final Dot3ExtPkgObjectReportNumThresholdEnt dot3ExtPkgObjectReportNumThreshold;

                            public final Dot3ExtPkgObjectReportMaximumNumThresholdEnt dot3ExtPkgObjectReportMaximumNumThreshold;

                            public final Dot3ExtPkgStatTxFramesQueueEnt dot3ExtPkgStatTxFramesQueue;

                            public final Dot3ExtPkgStatRxFramesQueueEnt dot3ExtPkgStatRxFramesQueue;

                            public final Dot3ExtPkgStatDroppedFramesQueueEnt dot3ExtPkgStatDroppedFramesQueue;

                            private Dot3ExtPkgQueueEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3ExtPkgQueueEntry", "1.3.6.1.2.1.155.1.4.1.2.1", false, false, false, true);
                                this.dot3QueueIndex = new Dot3QueueIndexEnt(mib, this);
                                this.dot3ExtPkgObjectReportNumThreshold = new Dot3ExtPkgObjectReportNumThresholdEnt(mib, this);
                                this.dot3ExtPkgObjectReportMaximumNumThreshold = new Dot3ExtPkgObjectReportMaximumNumThresholdEnt(mib, this);
                                this.dot3ExtPkgStatTxFramesQueue = new Dot3ExtPkgStatTxFramesQueueEnt(mib, this);
                                this.dot3ExtPkgStatRxFramesQueue = new Dot3ExtPkgStatRxFramesQueueEnt(mib, this);
                                this.dot3ExtPkgStatDroppedFramesQueue = new Dot3ExtPkgStatDroppedFramesQueueEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dot3QueueIndex,
                                    this.dot3ExtPkgObjectReportNumThreshold,
                                    this.dot3ExtPkgObjectReportMaximumNumThreshold,
                                    this.dot3ExtPkgStatTxFramesQueue,
                                    this.dot3ExtPkgStatRxFramesQueue,
                                    this.dot3ExtPkgStatDroppedFramesQueue
                                };
                            }
                            public static final class Dot3QueueIndexEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3QueueIndexEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3QueueIndex", "1.3.6.1.2.1.155.1.4.1.2.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectReportNumThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectReportNumThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectReportNumThreshold", "1.3.6.1.2.1.155.1.4.1.2.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectReportMaximumNumThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectReportMaximumNumThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectReportMaximumNumThreshold", "1.3.6.1.2.1.155.1.4.1.2.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgStatTxFramesQueueEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgStatTxFramesQueueEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgStatTxFramesQueue", "1.3.6.1.2.1.155.1.4.1.2.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgStatRxFramesQueueEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgStatRxFramesQueueEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgStatRxFramesQueue", "1.3.6.1.2.1.155.1.4.1.2.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgStatDroppedFramesQueueEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgStatDroppedFramesQueueEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgStatDroppedFramesQueue", "1.3.6.1.2.1.155.1.4.1.2.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Dot3ExtPkgQueueSetsTableEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3ExtPkgQueueSetsEntryEnt dot3ExtPkgQueueSetsEntry;

                        private Dot3ExtPkgQueueSetsTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3ExtPkgQueueSetsTable", "1.3.6.1.2.1.155.1.4.1.3", false, true, false, false);
                            this.dot3ExtPkgQueueSetsEntry = new Dot3ExtPkgQueueSetsEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3ExtPkgQueueSetsEntry
                            };
                        }
                        public static final class Dot3ExtPkgQueueSetsEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            public final Dot3QueueSetQueueIndexEnt dot3QueueSetQueueIndex;

                            public final Dot3QueueSetIndexEnt dot3QueueSetIndex;

                            public final Dot3ExtPkgObjectReportThresholdEnt dot3ExtPkgObjectReportThreshold;

                            private Dot3ExtPkgQueueSetsEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3ExtPkgQueueSetsEntry", "1.3.6.1.2.1.155.1.4.1.3.1", false, false, false, true);
                                this.dot3QueueSetQueueIndex = new Dot3QueueSetQueueIndexEnt(mib, this);
                                this.dot3QueueSetIndex = new Dot3QueueSetIndexEnt(mib, this);
                                this.dot3ExtPkgObjectReportThreshold = new Dot3ExtPkgObjectReportThresholdEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dot3QueueSetQueueIndex,
                                    this.dot3QueueSetIndex,
                                    this.dot3ExtPkgObjectReportThreshold
                                };
                            }
                            public static final class Dot3QueueSetQueueIndexEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3QueueSetQueueIndexEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3QueueSetQueueIndex", "1.3.6.1.2.1.155.1.4.1.3.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3QueueSetIndexEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3QueueSetIndexEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3QueueSetIndex", "1.3.6.1.2.1.155.1.4.1.3.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgObjectReportThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgObjectReportThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgObjectReportThreshold", "1.3.6.1.2.1.155.1.4.1.3.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                    public static final class Dot3ExtPkgOptIfTableEnt extends MIBEntry<DOT3EPONMIBDef>
                    {
                        public final Dot3ExtPkgOptIfEntryEnt dot3ExtPkgOptIfEntry;

                        private Dot3ExtPkgOptIfTableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                        {
                            super(mib, parent, "dot3ExtPkgOptIfTable", "1.3.6.1.2.1.155.1.4.1.5", false, true, false, false);
                            this.dot3ExtPkgOptIfEntry = new Dot3ExtPkgOptIfEntryEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot3ExtPkgOptIfEntry
                            };
                        }
                        public static final class Dot3ExtPkgOptIfEntryEnt extends MIBEntry<DOT3EPONMIBDef>
                        {
                            public final Dot3ExtPkgOptIfSuspectedFlagEnt dot3ExtPkgOptIfSuspectedFlag;

                            public final Dot3ExtPkgOptIfInputPowerEnt dot3ExtPkgOptIfInputPower;

                            public final Dot3ExtPkgOptIfLowInputPowerEnt dot3ExtPkgOptIfLowInputPower;

                            public final Dot3ExtPkgOptIfHighInputPowerEnt dot3ExtPkgOptIfHighInputPower;

                            public final Dot3ExtPkgOptIfLowerInputPowerThresholdEnt dot3ExtPkgOptIfLowerInputPowerThreshold;

                            public final Dot3ExtPkgOptIfUpperInputPowerThresholdEnt dot3ExtPkgOptIfUpperInputPowerThreshold;

                            public final Dot3ExtPkgOptIfOutputPowerEnt dot3ExtPkgOptIfOutputPower;

                            public final Dot3ExtPkgOptIfLowOutputPowerEnt dot3ExtPkgOptIfLowOutputPower;

                            public final Dot3ExtPkgOptIfHighOutputPowerEnt dot3ExtPkgOptIfHighOutputPower;

                            public final Dot3ExtPkgOptIfLowerOutputPowerThresholdEnt dot3ExtPkgOptIfLowerOutputPowerThreshold;

                            public final Dot3ExtPkgOptIfUpperOutputPowerThresholdEnt dot3ExtPkgOptIfUpperOutputPowerThreshold;

                            public final Dot3ExtPkgOptIfSignalDetectEnt dot3ExtPkgOptIfSignalDetect;

                            public final Dot3ExtPkgOptIfTransmitAlarmEnt dot3ExtPkgOptIfTransmitAlarm;

                            public final Dot3ExtPkgOptIfTransmitEnableEnt dot3ExtPkgOptIfTransmitEnable;

                            private Dot3ExtPkgOptIfEntryEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                            {
                                super(mib, parent, "dot3ExtPkgOptIfEntry", "1.3.6.1.2.1.155.1.4.1.5.1", false, false, false, true);
                                this.dot3ExtPkgOptIfSuspectedFlag = new Dot3ExtPkgOptIfSuspectedFlagEnt(mib, this);
                                this.dot3ExtPkgOptIfInputPower = new Dot3ExtPkgOptIfInputPowerEnt(mib, this);
                                this.dot3ExtPkgOptIfLowInputPower = new Dot3ExtPkgOptIfLowInputPowerEnt(mib, this);
                                this.dot3ExtPkgOptIfHighInputPower = new Dot3ExtPkgOptIfHighInputPowerEnt(mib, this);
                                this.dot3ExtPkgOptIfLowerInputPowerThreshold = new Dot3ExtPkgOptIfLowerInputPowerThresholdEnt(mib, this);
                                this.dot3ExtPkgOptIfUpperInputPowerThreshold = new Dot3ExtPkgOptIfUpperInputPowerThresholdEnt(mib, this);
                                this.dot3ExtPkgOptIfOutputPower = new Dot3ExtPkgOptIfOutputPowerEnt(mib, this);
                                this.dot3ExtPkgOptIfLowOutputPower = new Dot3ExtPkgOptIfLowOutputPowerEnt(mib, this);
                                this.dot3ExtPkgOptIfHighOutputPower = new Dot3ExtPkgOptIfHighOutputPowerEnt(mib, this);
                                this.dot3ExtPkgOptIfLowerOutputPowerThreshold = new Dot3ExtPkgOptIfLowerOutputPowerThresholdEnt(mib, this);
                                this.dot3ExtPkgOptIfUpperOutputPowerThreshold = new Dot3ExtPkgOptIfUpperOutputPowerThresholdEnt(mib, this);
                                this.dot3ExtPkgOptIfSignalDetect = new Dot3ExtPkgOptIfSignalDetectEnt(mib, this);
                                this.dot3ExtPkgOptIfTransmitAlarm = new Dot3ExtPkgOptIfTransmitAlarmEnt(mib, this);
                                this.dot3ExtPkgOptIfTransmitEnable = new Dot3ExtPkgOptIfTransmitEnableEnt(mib, this);
                                this.entries = new MIBEntry<?>[] {
                                    this.dot3ExtPkgOptIfSuspectedFlag,
                                    this.dot3ExtPkgOptIfInputPower,
                                    this.dot3ExtPkgOptIfLowInputPower,
                                    this.dot3ExtPkgOptIfHighInputPower,
                                    this.dot3ExtPkgOptIfLowerInputPowerThreshold,
                                    this.dot3ExtPkgOptIfUpperInputPowerThreshold,
                                    this.dot3ExtPkgOptIfOutputPower,
                                    this.dot3ExtPkgOptIfLowOutputPower,
                                    this.dot3ExtPkgOptIfHighOutputPower,
                                    this.dot3ExtPkgOptIfLowerOutputPowerThreshold,
                                    this.dot3ExtPkgOptIfUpperOutputPowerThreshold,
                                    this.dot3ExtPkgOptIfSignalDetect,
                                    this.dot3ExtPkgOptIfTransmitAlarm,
                                    this.dot3ExtPkgOptIfTransmitEnable
                                };
                            }
                            public static final class Dot3ExtPkgOptIfSuspectedFlagEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfSuspectedFlagEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfSuspectedFlag", "1.3.6.1.2.1.155.1.4.1.5.1.1", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfInputPowerEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfInputPowerEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfInputPower", "1.3.6.1.2.1.155.1.4.1.5.1.2", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfLowInputPowerEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfLowInputPowerEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfLowInputPower", "1.3.6.1.2.1.155.1.4.1.5.1.3", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfHighInputPowerEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfHighInputPowerEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfHighInputPower", "1.3.6.1.2.1.155.1.4.1.5.1.4", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfLowerInputPowerThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfLowerInputPowerThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfLowerInputPowerThreshold", "1.3.6.1.2.1.155.1.4.1.5.1.5", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfUpperInputPowerThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfUpperInputPowerThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfUpperInputPowerThreshold", "1.3.6.1.2.1.155.1.4.1.5.1.6", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfOutputPowerEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfOutputPowerEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfOutputPower", "1.3.6.1.2.1.155.1.4.1.5.1.7", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfLowOutputPowerEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfLowOutputPowerEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfLowOutputPower", "1.3.6.1.2.1.155.1.4.1.5.1.8", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfHighOutputPowerEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfHighOutputPowerEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfHighOutputPower", "1.3.6.1.2.1.155.1.4.1.5.1.9", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfLowerOutputPowerThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfLowerOutputPowerThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfLowerOutputPowerThreshold", "1.3.6.1.2.1.155.1.4.1.5.1.10", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfUpperOutputPowerThresholdEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfUpperOutputPowerThresholdEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfUpperOutputPowerThreshold", "1.3.6.1.2.1.155.1.4.1.5.1.11", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfSignalDetectEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfSignalDetectEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfSignalDetect", "1.3.6.1.2.1.155.1.4.1.5.1.12", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfTransmitAlarmEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfTransmitAlarmEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfTransmitAlarm", "1.3.6.1.2.1.155.1.4.1.5.1.13", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                            public static final class Dot3ExtPkgOptIfTransmitEnableEnt extends MIBEntry<DOT3EPONMIBDef>
                            {
                                private Dot3ExtPkgOptIfTransmitEnableEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                                {
                                    super(mib, parent, "dot3ExtPkgOptIfTransmitEnable", "1.3.6.1.2.1.155.1.4.1.5.1.14", false, false, true, false);
                                    this.entries = new MIBEntry<?>[] {

                                    };
                                }
                            }

                        }

                    }

                }

            }

        }

        public static final class Dot3EponConformanceEnt extends MIBEntry<DOT3EPONMIBDef>
        {
            /** Conformance Statements
Conformance Groups*/
            public final Dot3EponGroupsEnt dot3EponGroups;

            /** Compliance*/
            public final Dot3EponCompliancesEnt dot3EponCompliances;

            private Dot3EponConformanceEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
            {
                super(mib, parent, "dot3EponConformance", "1.3.6.1.2.1.155.2", false, false, false, false);
                this.dot3EponGroups = new Dot3EponGroupsEnt(mib, this);
                this.dot3EponCompliances = new Dot3EponCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot3EponGroups,
                    this.dot3EponCompliances
                };
            }
            public static final class Dot3EponGroupsEnt extends MIBEntry<DOT3EPONMIBDef>
            {
                public final Dot3MpcpGroupBaseEnt dot3MpcpGroupBase;

                public final Dot3MpcpGroupStatEnt dot3MpcpGroupStat;

                public final Dot3OmpeGroupIDEnt dot3OmpeGroupID;

                public final Dot3OmpeGroupStatEnt dot3OmpeGroupStat;

                public final Dot3EponFecGroupAllEnt dot3EponFecGroupAll;

                public final Dot3ExtPkgGroupControlEnt dot3ExtPkgGroupControl;

                public final Dot3ExtPkgGroupQueueEnt dot3ExtPkgGroupQueue;

                public final Dot3ExtPkgGroupQueueSetsEnt dot3ExtPkgGroupQueueSets;

                public final Dot3ExtPkgGroupOptIfEnt dot3ExtPkgGroupOptIf;

                private Dot3EponGroupsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                {
                    super(mib, parent, "dot3EponGroups", "1.3.6.1.2.1.155.2.1", false, false, false, false);
                    this.dot3MpcpGroupBase = new Dot3MpcpGroupBaseEnt(mib, this);
                    this.dot3MpcpGroupStat = new Dot3MpcpGroupStatEnt(mib, this);
                    this.dot3OmpeGroupID = new Dot3OmpeGroupIDEnt(mib, this);
                    this.dot3OmpeGroupStat = new Dot3OmpeGroupStatEnt(mib, this);
                    this.dot3EponFecGroupAll = new Dot3EponFecGroupAllEnt(mib, this);
                    this.dot3ExtPkgGroupControl = new Dot3ExtPkgGroupControlEnt(mib, this);
                    this.dot3ExtPkgGroupQueue = new Dot3ExtPkgGroupQueueEnt(mib, this);
                    this.dot3ExtPkgGroupQueueSets = new Dot3ExtPkgGroupQueueSetsEnt(mib, this);
                    this.dot3ExtPkgGroupOptIf = new Dot3ExtPkgGroupOptIfEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3MpcpGroupBase,
                        this.dot3MpcpGroupStat,
                        this.dot3OmpeGroupID,
                        this.dot3OmpeGroupStat,
                        this.dot3EponFecGroupAll,
                        this.dot3ExtPkgGroupControl,
                        this.dot3ExtPkgGroupQueue,
                        this.dot3ExtPkgGroupQueueSets,
                        this.dot3ExtPkgGroupOptIf
                    };
                }
                public static final class Dot3MpcpGroupBaseEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3MpcpGroupBaseEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3MpcpGroupBase", "1.3.6.1.2.1.155.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3MpcpGroupStatEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3MpcpGroupStatEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3MpcpGroupStat", "1.3.6.1.2.1.155.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OmpeGroupIDEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3OmpeGroupIDEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3OmpeGroupID", "1.3.6.1.2.1.155.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OmpeGroupStatEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3OmpeGroupStatEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3OmpeGroupStat", "1.3.6.1.2.1.155.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3EponFecGroupAllEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3EponFecGroupAllEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3EponFecGroupAll", "1.3.6.1.2.1.155.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ExtPkgGroupControlEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3ExtPkgGroupControlEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3ExtPkgGroupControl", "1.3.6.1.2.1.155.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ExtPkgGroupQueueEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3ExtPkgGroupQueueEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3ExtPkgGroupQueue", "1.3.6.1.2.1.155.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ExtPkgGroupQueueSetsEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3ExtPkgGroupQueueSetsEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3ExtPkgGroupQueueSets", "1.3.6.1.2.1.155.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ExtPkgGroupOptIfEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3ExtPkgGroupOptIfEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3ExtPkgGroupOptIf", "1.3.6.1.2.1.155.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot3EponCompliancesEnt extends MIBEntry<DOT3EPONMIBDef>
            {
                public final Dot3MPCPComplianceEnt dot3MPCPCompliance;

                public final Dot3OmpeComplianceEnt dot3OmpeCompliance;

                public final Dot3EponFecComplianceEnt dot3EponFecCompliance;

                public final Dot3ExtPkgComplianceEnt dot3ExtPkgCompliance;

                private Dot3EponCompliancesEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                {
                    super(mib, parent, "dot3EponCompliances", "1.3.6.1.2.1.155.2.2", false, false, false, false);
                    this.dot3MPCPCompliance = new Dot3MPCPComplianceEnt(mib, this);
                    this.dot3OmpeCompliance = new Dot3OmpeComplianceEnt(mib, this);
                    this.dot3EponFecCompliance = new Dot3EponFecComplianceEnt(mib, this);
                    this.dot3ExtPkgCompliance = new Dot3ExtPkgComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot3MPCPCompliance,
                        this.dot3OmpeCompliance,
                        this.dot3EponFecCompliance,
                        this.dot3ExtPkgCompliance
                    };
                }
                public static final class Dot3MPCPComplianceEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3MPCPComplianceEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3MPCPCompliance", "1.3.6.1.2.1.155.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3OmpeComplianceEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3OmpeComplianceEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3OmpeCompliance", "1.3.6.1.2.1.155.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3EponFecComplianceEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3EponFecComplianceEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3EponFecCompliance", "1.3.6.1.2.1.155.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot3ExtPkgComplianceEnt extends MIBEntry<DOT3EPONMIBDef>
                {
                    private Dot3ExtPkgComplianceEnt(DOT3EPONMIBDef mib, MIBEntry<DOT3EPONMIBDef> parent)
                    {
                        super(mib, parent, "dot3ExtPkgCompliance", "1.3.6.1.2.1.155.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
