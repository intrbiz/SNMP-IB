package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**--
--
--
--
--
--
--
--
--
--
--
--
--
--
--
-
--
--
--
--
--
--
--
--
--
--
--
--
--
--
--
-*/
public final class COPSCLIENTMIBDef extends MIB
{
    public static final COPSCLIENTMIBDef COPSCLIENTMIB = new COPSCLIENTMIBDef();

    /** REFERENCE

"The COPS (Common Open Policy Service) Protocol RFC 2748*/
    public final CopsClientMIBEnt copsClientMIB;

    private COPSCLIENTMIBDef()
    {
        super("COPS-CLIENT-MIB");
        this.copsClientMIB = new CopsClientMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.copsClientMIB
        };
    }

    public static final class CopsClientMIBEnt extends MIBEntry<COPSCLIENTMIBDef>
    {
        public final CopsClientMIBObjectsEnt copsClientMIBObjects;

        /** -------------------------------Conformance Information-------------------------------*/
        public final CopsClientConformanceEnt copsClientConformance;

        private CopsClientMIBEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
        {
            super(mib, parent, "copsClientMIB", "1.3.6.1.2.1.89", false, false, false, false);
            this.copsClientMIBObjects = new CopsClientMIBObjectsEnt(mib, this);
            this.copsClientConformance = new CopsClientConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.copsClientMIBObjects,
                this.copsClientConformance
            };
        }
        public static final class CopsClientMIBObjectsEnt extends MIBEntry<COPSCLIENTMIBDef>
        {
            /** -------------------------------*/
            public final CopsClientCapabilitiesGroupEnt copsClientCapabilitiesGroup;

            /** -------------------------------*/
            public final CopsClientStatusGroupEnt copsClientStatusGroup;

            /** -------------------------------*/
            public final CopsClientConfigGroupEnt copsClientConfigGroup;

            private CopsClientMIBObjectsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
            {
                super(mib, parent, "copsClientMIBObjects", "1.3.6.1.2.1.89.1", false, false, false, false);
                this.copsClientCapabilitiesGroup = new CopsClientCapabilitiesGroupEnt(mib, this);
                this.copsClientStatusGroup = new CopsClientStatusGroupEnt(mib, this);
                this.copsClientConfigGroup = new CopsClientConfigGroupEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.copsClientCapabilitiesGroup,
                    this.copsClientStatusGroup,
                    this.copsClientConfigGroup
                };
            }
            public static final class CopsClientCapabilitiesGroupEnt extends MIBEntry<COPSCLIENTMIBDef>
            {
                /** -------------------------------Capabilities of the COPS client to connect to a COPS server:*/
                public final CopsClientCapabilitiesEnt copsClientCapabilities;

                private CopsClientCapabilitiesGroupEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                {
                    super(mib, parent, "copsClientCapabilitiesGroup", "1.3.6.1.2.1.89.1.1", false, false, false, false);
                    this.copsClientCapabilities = new CopsClientCapabilitiesEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.copsClientCapabilities
                    };
                }
                public static final class CopsClientCapabilitiesEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsClientCapabilitiesEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientCapabilities", "1.3.6.1.2.1.89.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class CopsClientStatusGroupEnt extends MIBEntry<COPSCLIENTMIBDef>
            {
                /** -------------------------------Current status of COPS server connections, all read-only.*/
                public final CopsClientServerCurrentTableEnt copsClientServerCurrentTable;

                private CopsClientStatusGroupEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                {
                    super(mib, parent, "copsClientStatusGroup", "1.3.6.1.2.1.89.1.2", false, false, false, false);
                    this.copsClientServerCurrentTable = new CopsClientServerCurrentTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.copsClientServerCurrentTable
                    };
                }
                public static final class CopsClientServerCurrentTableEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    public final CopsClientServerCurrentEntryEnt copsClientServerCurrentEntry;

                    private CopsClientServerCurrentTableEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientServerCurrentTable", "1.3.6.1.2.1.89.1.2.1", false, true, false, false);
                        this.copsClientServerCurrentEntry = new CopsClientServerCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.copsClientServerCurrentEntry
                        };
                    }
                    public static final class CopsClientServerCurrentEntryEnt extends MIBEntry<COPSCLIENTMIBDef>
                    {
                        public final CopsClientServerAddressTypeEnt copsClientServerAddressType;

                        public final CopsClientServerAddressEnt copsClientServerAddress;

                        public final CopsClientServerClientTypeEnt copsClientServerClientType;

                        public final CopsClientServerTcpPortEnt copsClientServerTcpPort;

                        public final CopsClientServerTypeEnt copsClientServerType;

                        public final CopsClientServerAuthTypeEnt copsClientServerAuthType;

                        public final CopsClientServerLastConnAttemptEnt copsClientServerLastConnAttempt;

                        public final CopsClientStateEnt copsClientState;

                        public final CopsClientServerKeepaliveTimeEnt copsClientServerKeepaliveTime;

                        public final CopsClientServerAccountingTimeEnt copsClientServerAccountingTime;

                        public final CopsClientInPktsEnt copsClientInPkts;

                        public final CopsClientOutPktsEnt copsClientOutPkts;

                        public final CopsClientInErrsEnt copsClientInErrs;

                        public final CopsClientLastErrorEnt copsClientLastError;

                        public final CopsClientTcpConnectAttemptsEnt copsClientTcpConnectAttempts;

                        public final CopsClientTcpConnectFailuresEnt copsClientTcpConnectFailures;

                        public final CopsClientOpenAttemptsEnt copsClientOpenAttempts;

                        public final CopsClientOpenFailuresEnt copsClientOpenFailures;

                        public final CopsClientErrUnsupportClienttypeEnt copsClientErrUnsupportClienttype;

                        public final CopsClientErrUnsupportedVersionEnt copsClientErrUnsupportedVersion;

                        public final CopsClientErrLengthMismatchEnt copsClientErrLengthMismatch;

                        public final CopsClientErrUnknownOpcodeEnt copsClientErrUnknownOpcode;

                        public final CopsClientErrUnknownCnumEnt copsClientErrUnknownCnum;

                        public final CopsClientErrBadCtypeEnt copsClientErrBadCtype;

                        public final CopsClientErrBadSendsEnt copsClientErrBadSends;

                        public final CopsClientErrWrongObjectsEnt copsClientErrWrongObjects;

                        public final CopsClientErrWrongOpcodeEnt copsClientErrWrongOpcode;

                        public final CopsClientKaTimedoutClientsEnt copsClientKaTimedoutClients;

                        public final CopsClientErrAuthFailuresEnt copsClientErrAuthFailures;

                        public final CopsClientErrAuthMissingEnt copsClientErrAuthMissing;

                        private CopsClientServerCurrentEntryEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "copsClientServerCurrentEntry", "1.3.6.1.2.1.89.1.2.1.1", false, false, false, true);
                            this.copsClientServerAddressType = new CopsClientServerAddressTypeEnt(mib, this);
                            this.copsClientServerAddress = new CopsClientServerAddressEnt(mib, this);
                            this.copsClientServerClientType = new CopsClientServerClientTypeEnt(mib, this);
                            this.copsClientServerTcpPort = new CopsClientServerTcpPortEnt(mib, this);
                            this.copsClientServerType = new CopsClientServerTypeEnt(mib, this);
                            this.copsClientServerAuthType = new CopsClientServerAuthTypeEnt(mib, this);
                            this.copsClientServerLastConnAttempt = new CopsClientServerLastConnAttemptEnt(mib, this);
                            this.copsClientState = new CopsClientStateEnt(mib, this);
                            this.copsClientServerKeepaliveTime = new CopsClientServerKeepaliveTimeEnt(mib, this);
                            this.copsClientServerAccountingTime = new CopsClientServerAccountingTimeEnt(mib, this);
                            this.copsClientInPkts = new CopsClientInPktsEnt(mib, this);
                            this.copsClientOutPkts = new CopsClientOutPktsEnt(mib, this);
                            this.copsClientInErrs = new CopsClientInErrsEnt(mib, this);
                            this.copsClientLastError = new CopsClientLastErrorEnt(mib, this);
                            this.copsClientTcpConnectAttempts = new CopsClientTcpConnectAttemptsEnt(mib, this);
                            this.copsClientTcpConnectFailures = new CopsClientTcpConnectFailuresEnt(mib, this);
                            this.copsClientOpenAttempts = new CopsClientOpenAttemptsEnt(mib, this);
                            this.copsClientOpenFailures = new CopsClientOpenFailuresEnt(mib, this);
                            this.copsClientErrUnsupportClienttype = new CopsClientErrUnsupportClienttypeEnt(mib, this);
                            this.copsClientErrUnsupportedVersion = new CopsClientErrUnsupportedVersionEnt(mib, this);
                            this.copsClientErrLengthMismatch = new CopsClientErrLengthMismatchEnt(mib, this);
                            this.copsClientErrUnknownOpcode = new CopsClientErrUnknownOpcodeEnt(mib, this);
                            this.copsClientErrUnknownCnum = new CopsClientErrUnknownCnumEnt(mib, this);
                            this.copsClientErrBadCtype = new CopsClientErrBadCtypeEnt(mib, this);
                            this.copsClientErrBadSends = new CopsClientErrBadSendsEnt(mib, this);
                            this.copsClientErrWrongObjects = new CopsClientErrWrongObjectsEnt(mib, this);
                            this.copsClientErrWrongOpcode = new CopsClientErrWrongOpcodeEnt(mib, this);
                            this.copsClientKaTimedoutClients = new CopsClientKaTimedoutClientsEnt(mib, this);
                            this.copsClientErrAuthFailures = new CopsClientErrAuthFailuresEnt(mib, this);
                            this.copsClientErrAuthMissing = new CopsClientErrAuthMissingEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.copsClientServerAddressType,
                                this.copsClientServerAddress,
                                this.copsClientServerClientType,
                                this.copsClientServerTcpPort,
                                this.copsClientServerType,
                                this.copsClientServerAuthType,
                                this.copsClientServerLastConnAttempt,
                                this.copsClientState,
                                this.copsClientServerKeepaliveTime,
                                this.copsClientServerAccountingTime,
                                this.copsClientInPkts,
                                this.copsClientOutPkts,
                                this.copsClientInErrs,
                                this.copsClientLastError,
                                this.copsClientTcpConnectAttempts,
                                this.copsClientTcpConnectFailures,
                                this.copsClientOpenAttempts,
                                this.copsClientOpenFailures,
                                this.copsClientErrUnsupportClienttype,
                                this.copsClientErrUnsupportedVersion,
                                this.copsClientErrLengthMismatch,
                                this.copsClientErrUnknownOpcode,
                                this.copsClientErrUnknownCnum,
                                this.copsClientErrBadCtype,
                                this.copsClientErrBadSends,
                                this.copsClientErrWrongObjects,
                                this.copsClientErrWrongOpcode,
                                this.copsClientKaTimedoutClients,
                                this.copsClientErrAuthFailures,
                                this.copsClientErrAuthMissing
                            };
                        }
                        public static final class CopsClientServerAddressTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerAddressTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerAddressType", "1.3.6.1.2.1.89.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerAddressEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerAddressEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerAddress", "1.3.6.1.2.1.89.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerClientTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerClientTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerClientType", "1.3.6.1.2.1.89.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerTcpPortEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerTcpPortEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerTcpPort", "1.3.6.1.2.1.89.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerType", "1.3.6.1.2.1.89.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerAuthTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerAuthTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerAuthType", "1.3.6.1.2.1.89.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerLastConnAttemptEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerLastConnAttemptEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerLastConnAttempt", "1.3.6.1.2.1.89.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientStateEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientStateEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientState", "1.3.6.1.2.1.89.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerKeepaliveTimeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerKeepaliveTimeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerKeepaliveTime", "1.3.6.1.2.1.89.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerAccountingTimeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerAccountingTimeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerAccountingTime", "1.3.6.1.2.1.89.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientInPktsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientInPktsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientInPkts", "1.3.6.1.2.1.89.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientOutPktsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientOutPktsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientOutPkts", "1.3.6.1.2.1.89.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientInErrsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientInErrsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientInErrs", "1.3.6.1.2.1.89.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientLastErrorEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientLastErrorEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientLastError", "1.3.6.1.2.1.89.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientTcpConnectAttemptsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientTcpConnectAttemptsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientTcpConnectAttempts", "1.3.6.1.2.1.89.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientTcpConnectFailuresEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientTcpConnectFailuresEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientTcpConnectFailures", "1.3.6.1.2.1.89.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientOpenAttemptsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientOpenAttemptsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientOpenAttempts", "1.3.6.1.2.1.89.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientOpenFailuresEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientOpenFailuresEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientOpenFailures", "1.3.6.1.2.1.89.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrUnsupportClienttypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrUnsupportClienttypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrUnsupportClienttype", "1.3.6.1.2.1.89.1.2.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrUnsupportedVersionEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrUnsupportedVersionEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrUnsupportedVersion", "1.3.6.1.2.1.89.1.2.1.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrLengthMismatchEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrLengthMismatchEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrLengthMismatch", "1.3.6.1.2.1.89.1.2.1.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrUnknownOpcodeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrUnknownOpcodeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrUnknownOpcode", "1.3.6.1.2.1.89.1.2.1.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrUnknownCnumEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrUnknownCnumEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrUnknownCnum", "1.3.6.1.2.1.89.1.2.1.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrBadCtypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrBadCtypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrBadCtype", "1.3.6.1.2.1.89.1.2.1.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrBadSendsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrBadSendsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrBadSends", "1.3.6.1.2.1.89.1.2.1.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrWrongObjectsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrWrongObjectsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrWrongObjects", "1.3.6.1.2.1.89.1.2.1.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrWrongOpcodeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrWrongOpcodeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrWrongOpcode", "1.3.6.1.2.1.89.1.2.1.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientKaTimedoutClientsEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientKaTimedoutClientsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientKaTimedoutClients", "1.3.6.1.2.1.89.1.2.1.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrAuthFailuresEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrAuthFailuresEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrAuthFailures", "1.3.6.1.2.1.89.1.2.1.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientErrAuthMissingEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientErrAuthMissingEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientErrAuthMissing", "1.3.6.1.2.1.89.1.2.1.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class CopsClientConfigGroupEnt extends MIBEntry<COPSCLIENTMIBDef>
            {
                /** -------------------------------*/
                public final CopsClientServerConfigTableEnt copsClientServerConfigTable;

                public final CopsClientServerConfigRetryAlgrmEnt copsClientServerConfigRetryAlgrm;

                public final CopsClientServerConfigRetryCountEnt copsClientServerConfigRetryCount;

                public final CopsClientServerConfigRetryIntvlEnt copsClientServerConfigRetryIntvl;

                private CopsClientConfigGroupEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                {
                    super(mib, parent, "copsClientConfigGroup", "1.3.6.1.2.1.89.1.3", false, false, false, false);
                    this.copsClientServerConfigTable = new CopsClientServerConfigTableEnt(mib, this);
                    this.copsClientServerConfigRetryAlgrm = new CopsClientServerConfigRetryAlgrmEnt(mib, this);
                    this.copsClientServerConfigRetryCount = new CopsClientServerConfigRetryCountEnt(mib, this);
                    this.copsClientServerConfigRetryIntvl = new CopsClientServerConfigRetryIntvlEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.copsClientServerConfigTable,
                        this.copsClientServerConfigRetryAlgrm,
                        this.copsClientServerConfigRetryCount,
                        this.copsClientServerConfigRetryIntvl
                    };
                }
                public static final class CopsClientServerConfigTableEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    public final CopsClientServerConfigEntryEnt copsClientServerConfigEntry;

                    private CopsClientServerConfigTableEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientServerConfigTable", "1.3.6.1.2.1.89.1.3.1", false, true, false, false);
                        this.copsClientServerConfigEntry = new CopsClientServerConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.copsClientServerConfigEntry
                        };
                    }
                    public static final class CopsClientServerConfigEntryEnt extends MIBEntry<COPSCLIENTMIBDef>
                    {
                        public final CopsClientServerConfigAddrTypeEnt copsClientServerConfigAddrType;

                        public final CopsClientServerConfigAddressEnt copsClientServerConfigAddress;

                        public final CopsClientServerConfigClientTypeEnt copsClientServerConfigClientType;

                        public final CopsClientServerConfigAuthTypeEnt copsClientServerConfigAuthType;

                        public final CopsClientServerConfigTcpPortEnt copsClientServerConfigTcpPort;

                        public final CopsClientServerConfigPriorityEnt copsClientServerConfigPriority;

                        public final CopsClientServerConfigRowStatusEnt copsClientServerConfigRowStatus;

                        private CopsClientServerConfigEntryEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                        {
                            super(mib, parent, "copsClientServerConfigEntry", "1.3.6.1.2.1.89.1.3.1.1", false, false, false, true);
                            this.copsClientServerConfigAddrType = new CopsClientServerConfigAddrTypeEnt(mib, this);
                            this.copsClientServerConfigAddress = new CopsClientServerConfigAddressEnt(mib, this);
                            this.copsClientServerConfigClientType = new CopsClientServerConfigClientTypeEnt(mib, this);
                            this.copsClientServerConfigAuthType = new CopsClientServerConfigAuthTypeEnt(mib, this);
                            this.copsClientServerConfigTcpPort = new CopsClientServerConfigTcpPortEnt(mib, this);
                            this.copsClientServerConfigPriority = new CopsClientServerConfigPriorityEnt(mib, this);
                            this.copsClientServerConfigRowStatus = new CopsClientServerConfigRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.copsClientServerConfigAddrType,
                                this.copsClientServerConfigAddress,
                                this.copsClientServerConfigClientType,
                                this.copsClientServerConfigAuthType,
                                this.copsClientServerConfigTcpPort,
                                this.copsClientServerConfigPriority,
                                this.copsClientServerConfigRowStatus
                            };
                        }
                        public static final class CopsClientServerConfigAddrTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigAddrTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigAddrType", "1.3.6.1.2.1.89.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerConfigAddressEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigAddressEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigAddress", "1.3.6.1.2.1.89.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerConfigClientTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigClientTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigClientType", "1.3.6.1.2.1.89.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerConfigAuthTypeEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigAuthTypeEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigAuthType", "1.3.6.1.2.1.89.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerConfigTcpPortEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigTcpPortEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigTcpPort", "1.3.6.1.2.1.89.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerConfigPriorityEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigPriorityEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigPriority", "1.3.6.1.2.1.89.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class CopsClientServerConfigRowStatusEnt extends MIBEntry<COPSCLIENTMIBDef>
                        {
                            private CopsClientServerConfigRowStatusEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                            {
                                super(mib, parent, "copsClientServerConfigRowStatus", "1.3.6.1.2.1.89.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class CopsClientServerConfigRetryAlgrmEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsClientServerConfigRetryAlgrmEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientServerConfigRetryAlgrm", "1.3.6.1.2.1.89.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CopsClientServerConfigRetryCountEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsClientServerConfigRetryCountEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientServerConfigRetryCount", "1.3.6.1.2.1.89.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CopsClientServerConfigRetryIntvlEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsClientServerConfigRetryIntvlEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientServerConfigRetryIntvl", "1.3.6.1.2.1.89.1.3.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class CopsClientConformanceEnt extends MIBEntry<COPSCLIENTMIBDef>
        {
            public final CopsClientGroupsEnt copsClientGroups;

            public final CopsClientCompliancesEnt copsClientCompliances;

            private CopsClientConformanceEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
            {
                super(mib, parent, "copsClientConformance", "1.3.6.1.2.1.89.2", false, false, false, false);
                this.copsClientGroups = new CopsClientGroupsEnt(mib, this);
                this.copsClientCompliances = new CopsClientCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.copsClientGroups,
                    this.copsClientCompliances
                };
            }
            public static final class CopsClientGroupsEnt extends MIBEntry<COPSCLIENTMIBDef>
            {
                /** -------------------------------units of conformance-------------------------------*/
                public final CopsDeviceStatusGroupEnt copsDeviceStatusGroup;

                public final CopsDeviceConfigGroupEnt copsDeviceConfigGroup;

                private CopsClientGroupsEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                {
                    super(mib, parent, "copsClientGroups", "1.3.6.1.2.1.89.2.1", false, false, false, false);
                    this.copsDeviceStatusGroup = new CopsDeviceStatusGroupEnt(mib, this);
                    this.copsDeviceConfigGroup = new CopsDeviceConfigGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.copsDeviceStatusGroup,
                        this.copsDeviceConfigGroup
                    };
                }
                public static final class CopsDeviceStatusGroupEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsDeviceStatusGroupEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsDeviceStatusGroup", "1.3.6.1.2.1.89.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CopsDeviceConfigGroupEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsDeviceConfigGroupEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsDeviceConfigGroup", "1.3.6.1.2.1.89.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class CopsClientCompliancesEnt extends MIBEntry<COPSCLIENTMIBDef>
            {
                /** -------------------------------compliance statements-------------------------------*/
                public final CopsClientComplianceEnt copsClientCompliance;

                private CopsClientCompliancesEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                {
                    super(mib, parent, "copsClientCompliances", "1.3.6.1.2.1.89.2.2", false, false, false, false);
                    this.copsClientCompliance = new CopsClientComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.copsClientCompliance
                    };
                }
                public static final class CopsClientComplianceEnt extends MIBEntry<COPSCLIENTMIBDef>
                {
                    private CopsClientComplianceEnt(COPSCLIENTMIBDef mib, MIBEntry<COPSCLIENTMIBDef> parent)
                    {
                        super(mib, parent, "copsClientCompliance", "1.3.6.1.2.1.89.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
