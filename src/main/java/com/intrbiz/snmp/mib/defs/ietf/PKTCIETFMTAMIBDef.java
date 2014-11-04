package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC4001]
[RFC3418]
[RFC3411]
[RFC4639]
[RFC4131]
[RFC2287]*/
public final class PKTCIETFMTAMIBDef extends MIB
{
    public static final PKTCIETFMTAMIBDef PKTCIETFMTAMIB = new PKTCIETFMTAMIBDef();

    static { MIBs.getInstance().registerMIB(PKTCIETFMTAMIBDef.PKTCIETFMTAMIB); }

    /** [RFC2863]

September 18, 2006*/
    public final PktcIetfMtaMibEnt pktcIetfMtaMib;

    private PKTCIETFMTAMIBDef()
    {
        super("PKTC-IETF-MTA-MIB");
        this.pktcIetfMtaMib = new PktcIetfMtaMibEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pktcIetfMtaMib
        };
    }

    public static final class PktcIetfMtaMibEnt extends MIBEntry<PKTCIETFMTAMIBDef>
    {
        /** =================================================================The MTA MIB module only supports a single Provisioning Server.=================================================================*/
        public final PktcMtaNotificationEnt pktcMtaNotification;

        public final PktcMtaMibObjectsEnt pktcMtaMibObjects;

        public final PktcMtaConformanceEnt pktcMtaConformance;

        private PktcIetfMtaMibEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
        {
            super(mib, parent, "pktcIetfMtaMib", "1.3.6.1.2.1.140", false, false, false, false);
            this.pktcMtaNotification = new PktcMtaNotificationEnt(mib, this);
            this.pktcMtaMibObjects = new PktcMtaMibObjectsEnt(mib, this);
            this.pktcMtaConformance = new PktcMtaConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pktcMtaNotification,
                this.pktcMtaMibObjects,
                this.pktcMtaConformance
            };
        }
        public static final class PktcMtaNotificationEnt extends MIBEntry<PKTCIETFMTAMIBDef>
        {
            public final PktcMtaDevProvisioningEnrollmentEnt pktcMtaDevProvisioningEnrollment;

            public final PktcMtaDevProvisioningStatusEnt pktcMtaDevProvisioningStatus;

            private PktcMtaNotificationEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
            {
                super(mib, parent, "pktcMtaNotification", "1.3.6.1.2.1.140.0", false, false, false, false);
                this.pktcMtaDevProvisioningEnrollment = new PktcMtaDevProvisioningEnrollmentEnt(mib, this);
                this.pktcMtaDevProvisioningStatus = new PktcMtaDevProvisioningStatusEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pktcMtaDevProvisioningEnrollment,
                    this.pktcMtaDevProvisioningStatus
                };
            }
            public static final class PktcMtaDevProvisioningEnrollmentEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                private PktcMtaDevProvisioningEnrollmentEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaDevProvisioningEnrollment", "1.3.6.1.2.1.140.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PktcMtaDevProvisioningStatusEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                private PktcMtaDevProvisioningStatusEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaDevProvisioningStatus", "1.3.6.1.2.1.140.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class PktcMtaMibObjectsEnt extends MIBEntry<PKTCIETFMTAMIBDef>
        {
            public final PktcMtaDevBaseEnt pktcMtaDevBase;

            public final PktcMtaDevServerEnt pktcMtaDevServer;

            public final PktcMtaDevSecurityEnt pktcMtaDevSecurity;

            public final PktcMtaDevErrorsEnt pktcMtaDevErrors;

            private PktcMtaMibObjectsEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
            {
                super(mib, parent, "pktcMtaMibObjects", "1.3.6.1.2.1.140.1", false, false, false, false);
                this.pktcMtaDevBase = new PktcMtaDevBaseEnt(mib, this);
                this.pktcMtaDevServer = new PktcMtaDevServerEnt(mib, this);
                this.pktcMtaDevSecurity = new PktcMtaDevSecurityEnt(mib, this);
                this.pktcMtaDevErrors = new PktcMtaDevErrorsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pktcMtaDevBase,
                    this.pktcMtaDevServer,
                    this.pktcMtaDevSecurity,
                    this.pktcMtaDevErrors
                };
            }
            public static final class PktcMtaDevBaseEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                /** The following pktcMtaDevBase group describes the base MTA objects*/
                public final PktcMtaDevResetNowEnt pktcMtaDevResetNow;

                public final PktcMtaDevSerialNumberEnt pktcMtaDevSerialNumber;

                public final PktcMtaDevSwCurrentVersEnt pktcMtaDevSwCurrentVers;

                public final PktcMtaDevFQDNEnt pktcMtaDevFQDN;

                public final PktcMtaDevEndPntCountEnt pktcMtaDevEndPntCount;

                public final PktcMtaDevEnabledEnt pktcMtaDevEnabled;

                public final PktcMtaDevTypeIdentifierEnt pktcMtaDevTypeIdentifier;

                public final PktcMtaDevProvisioningStateEnt pktcMtaDevProvisioningState;

                public final PktcMtaDevHttpAccessEnt pktcMtaDevHttpAccess;

                public final PktcMtaDevProvisioningTimerEnt pktcMtaDevProvisioningTimer;

                public final PktcMtaDevProvisioningCounterEnt pktcMtaDevProvisioningCounter;

                public final PktcMtaDevErrorOidsTableEnt pktcMtaDevErrorOidsTable;

                private PktcMtaDevBaseEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaDevBase", "1.3.6.1.2.1.140.1.1", false, false, false, false);
                    this.pktcMtaDevResetNow = new PktcMtaDevResetNowEnt(mib, this);
                    this.pktcMtaDevSerialNumber = new PktcMtaDevSerialNumberEnt(mib, this);
                    this.pktcMtaDevSwCurrentVers = new PktcMtaDevSwCurrentVersEnt(mib, this);
                    this.pktcMtaDevFQDN = new PktcMtaDevFQDNEnt(mib, this);
                    this.pktcMtaDevEndPntCount = new PktcMtaDevEndPntCountEnt(mib, this);
                    this.pktcMtaDevEnabled = new PktcMtaDevEnabledEnt(mib, this);
                    this.pktcMtaDevTypeIdentifier = new PktcMtaDevTypeIdentifierEnt(mib, this);
                    this.pktcMtaDevProvisioningState = new PktcMtaDevProvisioningStateEnt(mib, this);
                    this.pktcMtaDevHttpAccess = new PktcMtaDevHttpAccessEnt(mib, this);
                    this.pktcMtaDevProvisioningTimer = new PktcMtaDevProvisioningTimerEnt(mib, this);
                    this.pktcMtaDevProvisioningCounter = new PktcMtaDevProvisioningCounterEnt(mib, this);
                    this.pktcMtaDevErrorOidsTable = new PktcMtaDevErrorOidsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcMtaDevResetNow,
                        this.pktcMtaDevSerialNumber,
                        this.pktcMtaDevSwCurrentVers,
                        this.pktcMtaDevFQDN,
                        this.pktcMtaDevEndPntCount,
                        this.pktcMtaDevEnabled,
                        this.pktcMtaDevTypeIdentifier,
                        this.pktcMtaDevProvisioningState,
                        this.pktcMtaDevHttpAccess,
                        this.pktcMtaDevProvisioningTimer,
                        this.pktcMtaDevProvisioningCounter,
                        this.pktcMtaDevErrorOidsTable
                    };
                }
                public static final class PktcMtaDevResetNowEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevResetNowEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevResetNow", "1.3.6.1.2.1.140.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevSerialNumberEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevSerialNumberEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevSerialNumber", "1.3.6.1.2.1.140.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevSwCurrentVersEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevSwCurrentVersEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevSwCurrentVers", "1.3.6.1.2.1.140.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevFQDNEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevFQDNEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevFQDN", "1.3.6.1.2.1.140.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevEndPntCountEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevEndPntCountEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevEndPntCount", "1.3.6.1.2.1.140.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevEnabledEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevEnabledEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevEnabled", "1.3.6.1.2.1.140.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevTypeIdentifierEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevTypeIdentifierEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevTypeIdentifier", "1.3.6.1.2.1.140.1.1.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvisioningStateEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvisioningStateEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvisioningState", "1.3.6.1.2.1.140.1.1.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevHttpAccessEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevHttpAccessEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevHttpAccess", "1.3.6.1.2.1.140.1.1.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvisioningTimerEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvisioningTimerEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvisioningTimer", "1.3.6.1.2.1.140.1.1.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvisioningCounterEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvisioningCounterEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvisioningCounter", "1.3.6.1.2.1.140.1.1.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevErrorOidsTableEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    public final PktcMtaDevErrorOidsEntryEnt pktcMtaDevErrorOidsEntry;

                    private PktcMtaDevErrorOidsTableEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevErrorOidsTable", "1.3.6.1.2.1.140.1.1.12", false, true, false, false);
                        this.pktcMtaDevErrorOidsEntry = new PktcMtaDevErrorOidsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcMtaDevErrorOidsEntry
                        };
                    }
                    public static final class PktcMtaDevErrorOidsEntryEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                    {
                        public final PktcMtaDevErrorOidIndexEnt pktcMtaDevErrorOidIndex;

                        public final PktcMtaDevErrorOidEnt pktcMtaDevErrorOid;

                        public final PktcMtaDevErrorValueEnt pktcMtaDevErrorValue;

                        public final PktcMtaDevErrorReasonEnt pktcMtaDevErrorReason;

                        private PktcMtaDevErrorOidsEntryEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                        {
                            super(mib, parent, "pktcMtaDevErrorOidsEntry", "1.3.6.1.2.1.140.1.1.12.1", false, false, false, true);
                            this.pktcMtaDevErrorOidIndex = new PktcMtaDevErrorOidIndexEnt(mib, this);
                            this.pktcMtaDevErrorOid = new PktcMtaDevErrorOidEnt(mib, this);
                            this.pktcMtaDevErrorValue = new PktcMtaDevErrorValueEnt(mib, this);
                            this.pktcMtaDevErrorReason = new PktcMtaDevErrorReasonEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcMtaDevErrorOidIndex,
                                this.pktcMtaDevErrorOid,
                                this.pktcMtaDevErrorValue,
                                this.pktcMtaDevErrorReason
                            };
                        }
                        public static final class PktcMtaDevErrorOidIndexEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevErrorOidIndexEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevErrorOidIndex", "1.3.6.1.2.1.140.1.1.12.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevErrorOidEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevErrorOidEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevErrorOid", "1.3.6.1.2.1.140.1.1.12.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevErrorValueEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevErrorValueEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevErrorValue", "1.3.6.1.2.1.140.1.1.12.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevErrorReasonEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevErrorReasonEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevErrorReason", "1.3.6.1.2.1.140.1.1.12.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class PktcMtaDevServerEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                /** The following group describes server access and parameters used


for the initial MTA provisioning and bootstrapping phases.*/
                public final PktcMtaDevDhcpServerAddressTypeEnt pktcMtaDevDhcpServerAddressType;

                public final PktcMtaDevServerDhcp1Ent pktcMtaDevServerDhcp1;

                public final PktcMtaDevServerDhcp2Ent pktcMtaDevServerDhcp2;

                public final PktcMtaDevDnsServerAddressTypeEnt pktcMtaDevDnsServerAddressType;

                public final PktcMtaDevServerDns1Ent pktcMtaDevServerDns1;

                public final PktcMtaDevServerDns2Ent pktcMtaDevServerDns2;

                public final PktcMtaDevTimeServerAddressTypeEnt pktcMtaDevTimeServerAddressType;

                public final PktcMtaDevTimeServerEnt pktcMtaDevTimeServer;

                public final PktcMtaDevConfigFileEnt pktcMtaDevConfigFile;

                public final PktcMtaDevSnmpEntityEnt pktcMtaDevSnmpEntity;

                public final PktcMtaDevProvConfigHashEnt pktcMtaDevProvConfigHash;

                public final PktcMtaDevProvConfigKeyEnt pktcMtaDevProvConfigKey;

                public final PktcMtaDevProvConfigEncryptAlgEnt pktcMtaDevProvConfigEncryptAlg;

                public final PktcMtaDevProvSolicitedKeyTimeoutEnt pktcMtaDevProvSolicitedKeyTimeout;

                /** =================================================================Unsolicited key updates are retransmitted according to anexponential back-off mechanism using two timers and a maximumretry counter for AS replies.The initial retransmission timer value is the nominal timervalue (pktcMtaDevProvUnsolicitedKeyNomTimeout).  Theretransmissions occur with an exponentially increasing intervalthat caps at the maximum timeout value(pktcMtaDevProvUnsolicitedKeyMaxTimeout).Retransmissions stop when the maximum retry counter is reached(pktcMtaDevProvUnsolicitedKeyMaxRetries).For example, with values of 3 seconds for the nominaltimer, 100 seconds for the maximum timeout, and 8 retries max,and with an exponential value of 2, this results inretransmission intervals will be 3 s, 6 s, 12 s, 24 s, 48 s,96 s, 100 s, and 100 s;retransmissions then stop because the maximum number ofretries (8) has been reached.=================================================================Timeouts for unsolicited key management updates are onlypertinent before the first SNMPv3 message is sent between theMTA and the Provisioning Server and before the configurationfile is loaded.=================================================================*/
                public final PktcMtaDevProvUnsolicitedKeyMaxTimeoutEnt pktcMtaDevProvUnsolicitedKeyMaxTimeout;

                public final PktcMtaDevProvUnsolicitedKeyNomTimeoutEnt pktcMtaDevProvUnsolicitedKeyNomTimeout;

                public final PktcMtaDevProvUnsolicitedKeyMaxRetriesEnt pktcMtaDevProvUnsolicitedKeyMaxRetries;

                public final PktcMtaDevProvKerbRealmNameEnt pktcMtaDevProvKerbRealmName;

                public final PktcMtaDevProvStateEnt pktcMtaDevProvState;

                private PktcMtaDevServerEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaDevServer", "1.3.6.1.2.1.140.1.2", false, false, false, false);
                    this.pktcMtaDevDhcpServerAddressType = new PktcMtaDevDhcpServerAddressTypeEnt(mib, this);
                    this.pktcMtaDevServerDhcp1 = new PktcMtaDevServerDhcp1Ent(mib, this);
                    this.pktcMtaDevServerDhcp2 = new PktcMtaDevServerDhcp2Ent(mib, this);
                    this.pktcMtaDevDnsServerAddressType = new PktcMtaDevDnsServerAddressTypeEnt(mib, this);
                    this.pktcMtaDevServerDns1 = new PktcMtaDevServerDns1Ent(mib, this);
                    this.pktcMtaDevServerDns2 = new PktcMtaDevServerDns2Ent(mib, this);
                    this.pktcMtaDevTimeServerAddressType = new PktcMtaDevTimeServerAddressTypeEnt(mib, this);
                    this.pktcMtaDevTimeServer = new PktcMtaDevTimeServerEnt(mib, this);
                    this.pktcMtaDevConfigFile = new PktcMtaDevConfigFileEnt(mib, this);
                    this.pktcMtaDevSnmpEntity = new PktcMtaDevSnmpEntityEnt(mib, this);
                    this.pktcMtaDevProvConfigHash = new PktcMtaDevProvConfigHashEnt(mib, this);
                    this.pktcMtaDevProvConfigKey = new PktcMtaDevProvConfigKeyEnt(mib, this);
                    this.pktcMtaDevProvConfigEncryptAlg = new PktcMtaDevProvConfigEncryptAlgEnt(mib, this);
                    this.pktcMtaDevProvSolicitedKeyTimeout = new PktcMtaDevProvSolicitedKeyTimeoutEnt(mib, this);
                    this.pktcMtaDevProvUnsolicitedKeyMaxTimeout = new PktcMtaDevProvUnsolicitedKeyMaxTimeoutEnt(mib, this);
                    this.pktcMtaDevProvUnsolicitedKeyNomTimeout = new PktcMtaDevProvUnsolicitedKeyNomTimeoutEnt(mib, this);
                    this.pktcMtaDevProvUnsolicitedKeyMaxRetries = new PktcMtaDevProvUnsolicitedKeyMaxRetriesEnt(mib, this);
                    this.pktcMtaDevProvKerbRealmName = new PktcMtaDevProvKerbRealmNameEnt(mib, this);
                    this.pktcMtaDevProvState = new PktcMtaDevProvStateEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcMtaDevDhcpServerAddressType,
                        this.pktcMtaDevServerDhcp1,
                        this.pktcMtaDevServerDhcp2,
                        this.pktcMtaDevDnsServerAddressType,
                        this.pktcMtaDevServerDns1,
                        this.pktcMtaDevServerDns2,
                        this.pktcMtaDevTimeServerAddressType,
                        this.pktcMtaDevTimeServer,
                        this.pktcMtaDevConfigFile,
                        this.pktcMtaDevSnmpEntity,
                        this.pktcMtaDevProvConfigHash,
                        this.pktcMtaDevProvConfigKey,
                        this.pktcMtaDevProvConfigEncryptAlg,
                        this.pktcMtaDevProvSolicitedKeyTimeout,
                        this.pktcMtaDevProvUnsolicitedKeyMaxTimeout,
                        this.pktcMtaDevProvUnsolicitedKeyNomTimeout,
                        this.pktcMtaDevProvUnsolicitedKeyMaxRetries,
                        this.pktcMtaDevProvKerbRealmName,
                        this.pktcMtaDevProvState
                    };
                }
                public static final class PktcMtaDevDhcpServerAddressTypeEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevDhcpServerAddressTypeEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevDhcpServerAddressType", "1.3.6.1.2.1.140.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevServerDhcp1Ent extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevServerDhcp1Ent(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevServerDhcp1", "1.3.6.1.2.1.140.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevServerDhcp2Ent extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevServerDhcp2Ent(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevServerDhcp2", "1.3.6.1.2.1.140.1.2.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevDnsServerAddressTypeEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevDnsServerAddressTypeEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevDnsServerAddressType", "1.3.6.1.2.1.140.1.2.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevServerDns1Ent extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevServerDns1Ent(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevServerDns1", "1.3.6.1.2.1.140.1.2.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevServerDns2Ent extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevServerDns2Ent(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevServerDns2", "1.3.6.1.2.1.140.1.2.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevTimeServerAddressTypeEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevTimeServerAddressTypeEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevTimeServerAddressType", "1.3.6.1.2.1.140.1.2.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevTimeServerEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevTimeServerEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevTimeServer", "1.3.6.1.2.1.140.1.2.8", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevConfigFileEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevConfigFileEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevConfigFile", "1.3.6.1.2.1.140.1.2.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevSnmpEntityEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevSnmpEntityEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevSnmpEntity", "1.3.6.1.2.1.140.1.2.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvConfigHashEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvConfigHashEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvConfigHash", "1.3.6.1.2.1.140.1.2.11", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvConfigKeyEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvConfigKeyEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvConfigKey", "1.3.6.1.2.1.140.1.2.12", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvConfigEncryptAlgEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvConfigEncryptAlgEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvConfigEncryptAlg", "1.3.6.1.2.1.140.1.2.13", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvSolicitedKeyTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvSolicitedKeyTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvSolicitedKeyTimeout", "1.3.6.1.2.1.140.1.2.14", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvUnsolicitedKeyMaxTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvUnsolicitedKeyMaxTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvUnsolicitedKeyMaxTimeout", "1.3.6.1.2.1.140.1.2.15", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvUnsolicitedKeyNomTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvUnsolicitedKeyNomTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvUnsolicitedKeyNomTimeout", "1.3.6.1.2.1.140.1.2.16", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvUnsolicitedKeyMaxRetriesEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvUnsolicitedKeyMaxRetriesEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvUnsolicitedKeyMaxRetries", "1.3.6.1.2.1.140.1.2.17", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvKerbRealmNameEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvKerbRealmNameEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvKerbRealmName", "1.3.6.1.2.1.140.1.2.18", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevProvStateEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevProvStateEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevProvState", "1.3.6.1.2.1.140.1.2.19", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PktcMtaDevSecurityEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                /** The following object group describes the security objects.*/
                public final PktcMtaDevManufacturerCertificateEnt pktcMtaDevManufacturerCertificate;

                public final PktcMtaDevCertificateEnt pktcMtaDevCertificate;

                public final PktcMtaDevCorrelationIdEnt pktcMtaDevCorrelationId;

                public final PktcMtaDevTelephonyRootCertificateEnt pktcMtaDevTelephonyRootCertificate;

                /** =================================================================Informative Procedures for Setting up Security Associations


A Security Association may be set up either via configuration orvia NCS signaling.I.   Security association setup via configuration.The realm must be configured first.  Associated with the realmis a KDC.  The realm table (pktcMtaDevRealmTable) indicatesinformation about the realm (e.g., name, organization name) andparameters associated with KDC communications (e.g., graceperiods, AS Request/AS Reply adaptive back-off parameters).Once the realm is established, one or more CMS(es) may bedefined in the realm.  Associated with each CMSentry in the pktcMtaDevCmsTable is an explicit referenceto a Realm via the realm name (pktcMtaDevCmsKerbRealmName),the FQDN of the CMS, and parameters associated with IPSeckey management with the CMS (e.g., clock skew, AP Request/AP Reply adaptive back-off parameters).II.  Security association setup via NCS signaling.The procedure of establishing the Security Associationsfor NCS signaling is described in the PacketCable Securityspecification.It involves the analysis of the pktcNcsEndPntConfigTable rowfor the corresponding endpoint number and the correlation ofthe CMS FQDN from this row with the CMS Table andconsequently, with the Realm Table.  Both of these tablesare defined below.  The pktcNcsEndPntConfigTable is defined inthe IP over Cable Data Network (IPCDN)NCS Signaling MIB [NCSSIGMIB].III.  When the MTA receives wake-up or re-key messages from aCMS, it performs key management based on the correspondingentry in the CMS table.  If the matching CMS entry does notexist, it must ignore the wake-up or re-key messages.==================================================================================================================================pktcMtaDevRealmTableThe pktcMtaDevRealmTable shows the KDC realms.  The table isindexed with pktcMtaDevRealmIndex.  The Realm Table contains thepktcMtaDevRealmName in conjunction with any server that needsa Security Association with the MTA.  Uppercase must be usedto compare the pktcMtaDevRealmName content.


=================================================================*/
                public final PktcMtaDevRealmAvailSlotEnt pktcMtaDevRealmAvailSlot;

                public final PktcMtaDevRealmTableEnt pktcMtaDevRealmTable;

                /** =================================================================The CMS table, pktcMtaDevCmsTableThe CMS table and the realm table (pktcMtaDevRealmTable) are usedfor managing the MTA signaling security.  The CMS table definesthe CMSes the MTA is allowed to communicate with and containsthe parameters describing the SA establishment between the MTAand a CMS.The CMS table is indexed by pktcMtaDevCmsIndex.  The tablecontains the CMS FQDN (pktcMtaDevCmsFQDN) and the associatedKerberos realm name (pktcMtaDevCmsKerbRealmName) so that the MTAcan find the corresponding Kerberos realm name in thepktcMtaDevRealmTable.=================================================================*/
                public final PktcMtaDevCmsAvailSlotEnt pktcMtaDevCmsAvailSlot;

                public final PktcMtaDevCmsTableEnt pktcMtaDevCmsTable;

                public final PktcMtaDevResetKrbTicketsEnt pktcMtaDevResetKrbTickets;

                private PktcMtaDevSecurityEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaDevSecurity", "1.3.6.1.2.1.140.1.3", false, false, false, false);
                    this.pktcMtaDevManufacturerCertificate = new PktcMtaDevManufacturerCertificateEnt(mib, this);
                    this.pktcMtaDevCertificate = new PktcMtaDevCertificateEnt(mib, this);
                    this.pktcMtaDevCorrelationId = new PktcMtaDevCorrelationIdEnt(mib, this);
                    this.pktcMtaDevTelephonyRootCertificate = new PktcMtaDevTelephonyRootCertificateEnt(mib, this);
                    this.pktcMtaDevRealmAvailSlot = new PktcMtaDevRealmAvailSlotEnt(mib, this);
                    this.pktcMtaDevRealmTable = new PktcMtaDevRealmTableEnt(mib, this);
                    this.pktcMtaDevCmsAvailSlot = new PktcMtaDevCmsAvailSlotEnt(mib, this);
                    this.pktcMtaDevCmsTable = new PktcMtaDevCmsTableEnt(mib, this);
                    this.pktcMtaDevResetKrbTickets = new PktcMtaDevResetKrbTicketsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcMtaDevManufacturerCertificate,
                        this.pktcMtaDevCertificate,
                        this.pktcMtaDevCorrelationId,
                        this.pktcMtaDevTelephonyRootCertificate,
                        this.pktcMtaDevRealmAvailSlot,
                        this.pktcMtaDevRealmTable,
                        this.pktcMtaDevCmsAvailSlot,
                        this.pktcMtaDevCmsTable,
                        this.pktcMtaDevResetKrbTickets
                    };
                }
                public static final class PktcMtaDevManufacturerCertificateEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevManufacturerCertificateEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevManufacturerCertificate", "1.3.6.1.2.1.140.1.3.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevCertificateEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevCertificateEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevCertificate", "1.3.6.1.2.1.140.1.3.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevCorrelationIdEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevCorrelationIdEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevCorrelationId", "1.3.6.1.2.1.140.1.3.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevTelephonyRootCertificateEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevTelephonyRootCertificateEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevTelephonyRootCertificate", "1.3.6.1.2.1.140.1.3.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevRealmAvailSlotEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevRealmAvailSlotEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevRealmAvailSlot", "1.3.6.1.2.1.140.1.3.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevRealmTableEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    public final PktcMtaDevRealmEntryEnt pktcMtaDevRealmEntry;

                    private PktcMtaDevRealmTableEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevRealmTable", "1.3.6.1.2.1.140.1.3.6", false, true, false, false);
                        this.pktcMtaDevRealmEntry = new PktcMtaDevRealmEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcMtaDevRealmEntry
                        };
                    }
                    public static final class PktcMtaDevRealmEntryEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                    {
                        public final PktcMtaDevRealmIndexEnt pktcMtaDevRealmIndex;

                        public final PktcMtaDevRealmNameEnt pktcMtaDevRealmName;

                        public final PktcMtaDevRealmPkinitGracePeriodEnt pktcMtaDevRealmPkinitGracePeriod;

                        public final PktcMtaDevRealmTgsGracePeriodEnt pktcMtaDevRealmTgsGracePeriod;

                        public final PktcMtaDevRealmOrgNameEnt pktcMtaDevRealmOrgName;

                        public final PktcMtaDevRealmUnsolicitedKeyMaxTimeoutEnt pktcMtaDevRealmUnsolicitedKeyMaxTimeout;

                        public final PktcMtaDevRealmUnsolicitedKeyNomTimeoutEnt pktcMtaDevRealmUnsolicitedKeyNomTimeout;

                        public final PktcMtaDevRealmUnsolicitedKeyMaxRetriesEnt pktcMtaDevRealmUnsolicitedKeyMaxRetries;

                        public final PktcMtaDevRealmStatusEnt pktcMtaDevRealmStatus;

                        private PktcMtaDevRealmEntryEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                        {
                            super(mib, parent, "pktcMtaDevRealmEntry", "1.3.6.1.2.1.140.1.3.6.1", false, false, false, true);
                            this.pktcMtaDevRealmIndex = new PktcMtaDevRealmIndexEnt(mib, this);
                            this.pktcMtaDevRealmName = new PktcMtaDevRealmNameEnt(mib, this);
                            this.pktcMtaDevRealmPkinitGracePeriod = new PktcMtaDevRealmPkinitGracePeriodEnt(mib, this);
                            this.pktcMtaDevRealmTgsGracePeriod = new PktcMtaDevRealmTgsGracePeriodEnt(mib, this);
                            this.pktcMtaDevRealmOrgName = new PktcMtaDevRealmOrgNameEnt(mib, this);
                            this.pktcMtaDevRealmUnsolicitedKeyMaxTimeout = new PktcMtaDevRealmUnsolicitedKeyMaxTimeoutEnt(mib, this);
                            this.pktcMtaDevRealmUnsolicitedKeyNomTimeout = new PktcMtaDevRealmUnsolicitedKeyNomTimeoutEnt(mib, this);
                            this.pktcMtaDevRealmUnsolicitedKeyMaxRetries = new PktcMtaDevRealmUnsolicitedKeyMaxRetriesEnt(mib, this);
                            this.pktcMtaDevRealmStatus = new PktcMtaDevRealmStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcMtaDevRealmIndex,
                                this.pktcMtaDevRealmName,
                                this.pktcMtaDevRealmPkinitGracePeriod,
                                this.pktcMtaDevRealmTgsGracePeriod,
                                this.pktcMtaDevRealmOrgName,
                                this.pktcMtaDevRealmUnsolicitedKeyMaxTimeout,
                                this.pktcMtaDevRealmUnsolicitedKeyNomTimeout,
                                this.pktcMtaDevRealmUnsolicitedKeyMaxRetries,
                                this.pktcMtaDevRealmStatus
                            };
                        }
                        public static final class PktcMtaDevRealmIndexEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmIndexEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmIndex", "1.3.6.1.2.1.140.1.3.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmNameEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmNameEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmName", "1.3.6.1.2.1.140.1.3.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmPkinitGracePeriodEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmPkinitGracePeriodEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmPkinitGracePeriod", "1.3.6.1.2.1.140.1.3.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmTgsGracePeriodEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmTgsGracePeriodEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmTgsGracePeriod", "1.3.6.1.2.1.140.1.3.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmOrgNameEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmOrgNameEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmOrgName", "1.3.6.1.2.1.140.1.3.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmUnsolicitedKeyMaxTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmUnsolicitedKeyMaxTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmUnsolicitedKeyMaxTimeout", "1.3.6.1.2.1.140.1.3.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmUnsolicitedKeyNomTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmUnsolicitedKeyNomTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmUnsolicitedKeyNomTimeout", "1.3.6.1.2.1.140.1.3.6.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmUnsolicitedKeyMaxRetriesEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmUnsolicitedKeyMaxRetriesEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmUnsolicitedKeyMaxRetries", "1.3.6.1.2.1.140.1.3.6.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevRealmStatusEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevRealmStatusEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevRealmStatus", "1.3.6.1.2.1.140.1.3.6.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcMtaDevCmsAvailSlotEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevCmsAvailSlotEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevCmsAvailSlot", "1.3.6.1.2.1.140.1.3.7", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaDevCmsTableEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    public final PktcMtaDevCmsEntryEnt pktcMtaDevCmsEntry;

                    private PktcMtaDevCmsTableEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevCmsTable", "1.3.6.1.2.1.140.1.3.8", false, true, false, false);
                        this.pktcMtaDevCmsEntry = new PktcMtaDevCmsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.pktcMtaDevCmsEntry
                        };
                    }
                    public static final class PktcMtaDevCmsEntryEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                    {
                        public final PktcMtaDevCmsIndexEnt pktcMtaDevCmsIndex;

                        public final PktcMtaDevCmsFqdnEnt pktcMtaDevCmsFqdn;

                        public final PktcMtaDevCmsKerbRealmNameEnt pktcMtaDevCmsKerbRealmName;

                        public final PktcMtaDevCmsMaxClockSkewEnt pktcMtaDevCmsMaxClockSkew;

                        public final PktcMtaDevCmsSolicitedKeyTimeoutEnt pktcMtaDevCmsSolicitedKeyTimeout;

                        /** =================================================================Unsolicited key updates are retransmitted according to anexponential back-off mechanism using two timers and a maximumretry counter for AS replies.The initial retransmission timer value is the nominal timervalue (pktcMtaDevCmsUnsolicitedKeyNomTimeout).  Theretransmissions occur with an exponentially increasing intervalthat caps at the maximum timeout value(pktcMtaDevCmsUnsolicitedKeyMaxTimeout).Retransmissions stop when the maximum retry counter is reached(pktcMatDevCmsUnsolicitedMaxRetries).For example, with values of 3 seconds for the nominaltimer, 20 seconds for the maximum timeout, and 5 retries max,retransmission intervals will be 3 s, 6 s, 12 s,


20 s, and 20 s; retransmissions then stop due to themaximum number of retries reached.=================================================================*/
                        public final PktcMtaDevCmsUnsolicitedKeyMaxTimeoutEnt pktcMtaDevCmsUnsolicitedKeyMaxTimeout;

                        public final PktcMtaDevCmsUnsolicitedKeyNomTimeoutEnt pktcMtaDevCmsUnsolicitedKeyNomTimeout;

                        public final PktcMtaDevCmsUnsolicitedKeyMaxRetriesEnt pktcMtaDevCmsUnsolicitedKeyMaxRetries;

                        public final PktcMtaDevCmsIpsecCtrlEnt pktcMtaDevCmsIpsecCtrl;

                        public final PktcMtaDevCmsStatusEnt pktcMtaDevCmsStatus;

                        private PktcMtaDevCmsEntryEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                        {
                            super(mib, parent, "pktcMtaDevCmsEntry", "1.3.6.1.2.1.140.1.3.8.1", false, false, false, true);
                            this.pktcMtaDevCmsIndex = new PktcMtaDevCmsIndexEnt(mib, this);
                            this.pktcMtaDevCmsFqdn = new PktcMtaDevCmsFqdnEnt(mib, this);
                            this.pktcMtaDevCmsKerbRealmName = new PktcMtaDevCmsKerbRealmNameEnt(mib, this);
                            this.pktcMtaDevCmsMaxClockSkew = new PktcMtaDevCmsMaxClockSkewEnt(mib, this);
                            this.pktcMtaDevCmsSolicitedKeyTimeout = new PktcMtaDevCmsSolicitedKeyTimeoutEnt(mib, this);
                            this.pktcMtaDevCmsUnsolicitedKeyMaxTimeout = new PktcMtaDevCmsUnsolicitedKeyMaxTimeoutEnt(mib, this);
                            this.pktcMtaDevCmsUnsolicitedKeyNomTimeout = new PktcMtaDevCmsUnsolicitedKeyNomTimeoutEnt(mib, this);
                            this.pktcMtaDevCmsUnsolicitedKeyMaxRetries = new PktcMtaDevCmsUnsolicitedKeyMaxRetriesEnt(mib, this);
                            this.pktcMtaDevCmsIpsecCtrl = new PktcMtaDevCmsIpsecCtrlEnt(mib, this);
                            this.pktcMtaDevCmsStatus = new PktcMtaDevCmsStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.pktcMtaDevCmsIndex,
                                this.pktcMtaDevCmsFqdn,
                                this.pktcMtaDevCmsKerbRealmName,
                                this.pktcMtaDevCmsMaxClockSkew,
                                this.pktcMtaDevCmsSolicitedKeyTimeout,
                                this.pktcMtaDevCmsUnsolicitedKeyMaxTimeout,
                                this.pktcMtaDevCmsUnsolicitedKeyNomTimeout,
                                this.pktcMtaDevCmsUnsolicitedKeyMaxRetries,
                                this.pktcMtaDevCmsIpsecCtrl,
                                this.pktcMtaDevCmsStatus
                            };
                        }
                        public static final class PktcMtaDevCmsIndexEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsIndexEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsIndex", "1.3.6.1.2.1.140.1.3.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsFqdnEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsFqdnEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsFqdn", "1.3.6.1.2.1.140.1.3.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsKerbRealmNameEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsKerbRealmNameEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsKerbRealmName", "1.3.6.1.2.1.140.1.3.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsMaxClockSkewEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsMaxClockSkewEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsMaxClockSkew", "1.3.6.1.2.1.140.1.3.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsSolicitedKeyTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsSolicitedKeyTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsSolicitedKeyTimeout", "1.3.6.1.2.1.140.1.3.8.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsUnsolicitedKeyMaxTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsUnsolicitedKeyMaxTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsUnsolicitedKeyMaxTimeout", "1.3.6.1.2.1.140.1.3.8.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsUnsolicitedKeyNomTimeoutEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsUnsolicitedKeyNomTimeoutEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsUnsolicitedKeyNomTimeout", "1.3.6.1.2.1.140.1.3.8.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsUnsolicitedKeyMaxRetriesEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsUnsolicitedKeyMaxRetriesEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsUnsolicitedKeyMaxRetries", "1.3.6.1.2.1.140.1.3.8.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsIpsecCtrlEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsIpsecCtrlEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsIpsecCtrl", "1.3.6.1.2.1.140.1.3.8.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class PktcMtaDevCmsStatusEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                        {
                            private PktcMtaDevCmsStatusEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                            {
                                super(mib, parent, "pktcMtaDevCmsStatus", "1.3.6.1.2.1.140.1.3.8.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class PktcMtaDevResetKrbTicketsEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevResetKrbTicketsEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevResetKrbTickets", "1.3.6.1.2.1.140.1.3.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PktcMtaDevErrorsEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                /** The following group, pktcMtaDevErrors, defines an OIDcorresponding to error conditions encountered during the MTAprovisioning.*/
                public final PktcMtaDevErrorsTooManyErrorsEnt pktcMtaDevErrorsTooManyErrors;

                private PktcMtaDevErrorsEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaDevErrors", "1.3.6.1.2.1.140.1.4", false, false, false, false);
                    this.pktcMtaDevErrorsTooManyErrors = new PktcMtaDevErrorsTooManyErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcMtaDevErrorsTooManyErrors
                    };
                }
                public static final class PktcMtaDevErrorsTooManyErrorsEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaDevErrorsTooManyErrorsEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaDevErrorsTooManyErrors", "1.3.6.1.2.1.140.1.4.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PktcMtaConformanceEnt extends MIBEntry<PKTCIETFMTAMIBDef>
        {
            /** Compliance Statements*/
            public final PktcMtaCompliancesEnt pktcMtaCompliances;

            public final PktcMtaGroupsEnt pktcMtaGroups;

            private PktcMtaConformanceEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
            {
                super(mib, parent, "pktcMtaConformance", "1.3.6.1.2.1.140.2", false, false, false, false);
                this.pktcMtaCompliances = new PktcMtaCompliancesEnt(mib, this);
                this.pktcMtaGroups = new PktcMtaGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pktcMtaCompliances,
                    this.pktcMtaGroups
                };
            }
            public static final class PktcMtaCompliancesEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                public final PktcMtaBasicComplianceEnt pktcMtaBasicCompliance;

                public final PktcMtaBasicSmtaComplianceEnt pktcMtaBasicSmtaCompliance;

                private PktcMtaCompliancesEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaCompliances", "1.3.6.1.2.1.140.2.1", false, false, false, false);
                    this.pktcMtaBasicCompliance = new PktcMtaBasicComplianceEnt(mib, this);
                    this.pktcMtaBasicSmtaCompliance = new PktcMtaBasicSmtaComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcMtaBasicCompliance,
                        this.pktcMtaBasicSmtaCompliance
                    };
                }
                public static final class PktcMtaBasicComplianceEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaBasicComplianceEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaBasicCompliance", "1.3.6.1.2.1.140.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaBasicSmtaComplianceEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaBasicSmtaComplianceEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaBasicSmtaCompliance", "1.3.6.1.2.1.140.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PktcMtaGroupsEnt extends MIBEntry<PKTCIETFMTAMIBDef>
            {
                public final PktcMtaGroupEnt pktcMtaGroup;

                public final PktcMtaNotificationGroupEnt pktcMtaNotificationGroup;

                private PktcMtaGroupsEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                {
                    super(mib, parent, "pktcMtaGroups", "1.3.6.1.2.1.140.2.2", false, false, false, false);
                    this.pktcMtaGroup = new PktcMtaGroupEnt(mib, this);
                    this.pktcMtaNotificationGroup = new PktcMtaNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pktcMtaGroup,
                        this.pktcMtaNotificationGroup
                    };
                }
                public static final class PktcMtaGroupEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaGroupEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaGroup", "1.3.6.1.2.1.140.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PktcMtaNotificationGroupEnt extends MIBEntry<PKTCIETFMTAMIBDef>
                {
                    private PktcMtaNotificationGroupEnt(PKTCIETFMTAMIBDef mib, MIBEntry<PKTCIETFMTAMIBDef> parent)
                    {
                        super(mib, parent, "pktcMtaNotificationGroup", "1.3.6.1.2.1.140.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
