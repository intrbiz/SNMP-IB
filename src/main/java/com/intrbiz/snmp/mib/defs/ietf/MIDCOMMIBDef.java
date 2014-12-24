package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**RFC 2578
RFC 2579
RFC 2580
RFC 3411
RFC 4001
RFC 2863*/
public final class MIDCOMMIBDef extends MIB
{
    public static final MIDCOMMIBDef MIDCOMMIB = new MIDCOMMIBDef();

    /** RFC 4008

August 09, 2007*/
    public final MidcomMIBEnt midcomMIB;

    private MIDCOMMIBDef()
    {
        super("MIDCOM-MIB");
        this.midcomMIB = new MidcomMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.midcomMIB
        };
    }

    public static final class MidcomMIBEnt extends MIBEntry<MIDCOMMIBDef>
    {
        /** main components of this MIB module*/
        public final MidcomNotificationsEnt midcomNotifications;

        public final MidcomObjectsEnt midcomObjects;

        public final MidcomConformanceEnt midcomConformance;

        private MidcomMIBEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
        {
            super(mib, parent, "midcomMIB", "1.3.6.1.2.1.171", false, false, false, false);
            this.midcomNotifications = new MidcomNotificationsEnt(mib, this);
            this.midcomObjects = new MidcomObjectsEnt(mib, this);
            this.midcomConformance = new MidcomConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.midcomNotifications,
                this.midcomObjects,
                this.midcomConformance
            };
        }
        public static final class MidcomNotificationsEnt extends MIBEntry<MIDCOMMIBDef>
        {
            /** Notifications.*/
            public final MidcomUnsolicitedRuleEventEnt midcomUnsolicitedRuleEvent;

            public final MidcomSolicitedRuleEventEnt midcomSolicitedRuleEvent;

            public final MidcomSolicitedGroupEventEnt midcomSolicitedGroupEvent;

            private MidcomNotificationsEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
            {
                super(mib, parent, "midcomNotifications", "1.3.6.1.2.1.171.0", false, false, false, false);
                this.midcomUnsolicitedRuleEvent = new MidcomUnsolicitedRuleEventEnt(mib, this);
                this.midcomSolicitedRuleEvent = new MidcomSolicitedRuleEventEnt(mib, this);
                this.midcomSolicitedGroupEvent = new MidcomSolicitedGroupEventEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.midcomUnsolicitedRuleEvent,
                    this.midcomSolicitedRuleEvent,
                    this.midcomSolicitedGroupEvent
                };
            }
            public static final class MidcomUnsolicitedRuleEventEnt extends MIBEntry<MIDCOMMIBDef>
            {
                private MidcomUnsolicitedRuleEventEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomUnsolicitedRuleEvent", "1.3.6.1.2.1.171.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MidcomSolicitedRuleEventEnt extends MIBEntry<MIDCOMMIBDef>
            {
                private MidcomSolicitedRuleEventEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomSolicitedRuleEvent", "1.3.6.1.2.1.171.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MidcomSolicitedGroupEventEnt extends MIBEntry<MIDCOMMIBDef>
            {
                private MidcomSolicitedGroupEventEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomSolicitedGroupEvent", "1.3.6.1.2.1.171.0.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class MidcomObjectsEnt extends MIBEntry<MIDCOMMIBDef>
        {
            /** Transaction objects required according to the MIDCOMprotocol requirements defined in RFC 3304 and according tothe MIDCOM protocol semantics defined in RFC 3989*/
            public final MidcomTransactionEnt midcomTransaction;

            /** Configuration objects that can be used for retrievingmiddlebox capability information (mandatory) and for


setting parameters of the implementation of transactionobjects (optional)*/
            public final MidcomConfigEnt midcomConfig;

            /** Optional monitoring objects that provide information aboutused resource and statistics*/
            public final MidcomMonitoringEnt midcomMonitoring;

            private MidcomObjectsEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
            {
                super(mib, parent, "midcomObjects", "1.3.6.1.2.1.171.1", false, false, false, false);
                this.midcomTransaction = new MidcomTransactionEnt(mib, this);
                this.midcomConfig = new MidcomConfigEnt(mib, this);
                this.midcomMonitoring = new MidcomMonitoringEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.midcomTransaction,
                    this.midcomConfig,
                    this.midcomMonitoring
                };
            }
            public static final class MidcomTransactionEnt extends MIBEntry<MIDCOMMIBDef>
            {
                /** Transaction ObjectsTransaction objects are structured according to the MIDCOMprotocol semantics into two groups:- objects modeling MIDCOM policy rules in the midcomRuleTable- objects modeling MIDCOM policy rule groups in themidcomGroupTable
Policy rule subtreeThe midcomRuleTable lists policy rulesincluding policy reserve rules and policy enable rules.*/
                public final MidcomRuleTableEnt midcomRuleTable;

                /** Policy rule group subtreeThe midcomGroupTable lists all current policy rule groups.*/
                public final MidcomGroupTableEnt midcomGroupTable;

                private MidcomTransactionEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomTransaction", "1.3.6.1.2.1.171.1.1", false, false, false, false);
                    this.midcomRuleTable = new MidcomRuleTableEnt(mib, this);
                    this.midcomGroupTable = new MidcomGroupTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.midcomRuleTable,
                        this.midcomGroupTable
                    };
                }
                public static final class MidcomRuleTableEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    public final MidcomRuleEntryEnt midcomRuleEntry;

                    private MidcomRuleTableEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomRuleTable", "1.3.6.1.2.1.171.1.1.3", false, true, false, false);
                        this.midcomRuleEntry = new MidcomRuleEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.midcomRuleEntry
                        };
                    }
                    public static final class MidcomRuleEntryEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        public final MidcomRuleOwnerEnt midcomRuleOwner;

                        public final MidcomRuleIndexEnt midcomRuleIndex;

                        public final MidcomRuleAdminStatusEnt midcomRuleAdminStatus;

                        public final MidcomRuleOperStatusEnt midcomRuleOperStatus;

                        public final MidcomRuleStorageTypeEnt midcomRuleStorageType;

                        public final MidcomRuleStorageTimeEnt midcomRuleStorageTime;

                        public final MidcomRuleErrorEnt midcomRuleError;

                        public final MidcomRuleInterfaceEnt midcomRuleInterface;

                        public final MidcomRuleFlowDirectionEnt midcomRuleFlowDirection;

                        public final MidcomRuleMaxIdleTimeEnt midcomRuleMaxIdleTime;

                        public final MidcomRuleTransportProtocolEnt midcomRuleTransportProtocol;

                        public final MidcomRulePortRangeEnt midcomRulePortRange;

                        public final MidcomRuleInternalIpVersionEnt midcomRuleInternalIpVersion;

                        public final MidcomRuleExternalIpVersionEnt midcomRuleExternalIpVersion;

                        public final MidcomRuleInternalIpAddrEnt midcomRuleInternalIpAddr;

                        public final MidcomRuleInternalIpPrefixLengthEnt midcomRuleInternalIpPrefixLength;

                        public final MidcomRuleInternalPortEnt midcomRuleInternalPort;

                        public final MidcomRuleExternalIpAddrEnt midcomRuleExternalIpAddr;

                        public final MidcomRuleExternalIpPrefixLengthEnt midcomRuleExternalIpPrefixLength;

                        public final MidcomRuleExternalPortEnt midcomRuleExternalPort;

                        public final MidcomRuleInsideIpAddrEnt midcomRuleInsideIpAddr;

                        public final MidcomRuleInsidePortEnt midcomRuleInsidePort;

                        public final MidcomRuleOutsideIpAddrEnt midcomRuleOutsideIpAddr;

                        public final MidcomRuleOutsidePortEnt midcomRuleOutsidePort;

                        public final MidcomRuleLifetimeEnt midcomRuleLifetime;

                        public final MidcomRuleRowStatusEnt midcomRuleRowStatus;

                        private MidcomRuleEntryEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomRuleEntry", "1.3.6.1.2.1.171.1.1.3.1", false, false, false, true);
                            this.midcomRuleOwner = new MidcomRuleOwnerEnt(mib, this);
                            this.midcomRuleIndex = new MidcomRuleIndexEnt(mib, this);
                            this.midcomRuleAdminStatus = new MidcomRuleAdminStatusEnt(mib, this);
                            this.midcomRuleOperStatus = new MidcomRuleOperStatusEnt(mib, this);
                            this.midcomRuleStorageType = new MidcomRuleStorageTypeEnt(mib, this);
                            this.midcomRuleStorageTime = new MidcomRuleStorageTimeEnt(mib, this);
                            this.midcomRuleError = new MidcomRuleErrorEnt(mib, this);
                            this.midcomRuleInterface = new MidcomRuleInterfaceEnt(mib, this);
                            this.midcomRuleFlowDirection = new MidcomRuleFlowDirectionEnt(mib, this);
                            this.midcomRuleMaxIdleTime = new MidcomRuleMaxIdleTimeEnt(mib, this);
                            this.midcomRuleTransportProtocol = new MidcomRuleTransportProtocolEnt(mib, this);
                            this.midcomRulePortRange = new MidcomRulePortRangeEnt(mib, this);
                            this.midcomRuleInternalIpVersion = new MidcomRuleInternalIpVersionEnt(mib, this);
                            this.midcomRuleExternalIpVersion = new MidcomRuleExternalIpVersionEnt(mib, this);
                            this.midcomRuleInternalIpAddr = new MidcomRuleInternalIpAddrEnt(mib, this);
                            this.midcomRuleInternalIpPrefixLength = new MidcomRuleInternalIpPrefixLengthEnt(mib, this);
                            this.midcomRuleInternalPort = new MidcomRuleInternalPortEnt(mib, this);
                            this.midcomRuleExternalIpAddr = new MidcomRuleExternalIpAddrEnt(mib, this);
                            this.midcomRuleExternalIpPrefixLength = new MidcomRuleExternalIpPrefixLengthEnt(mib, this);
                            this.midcomRuleExternalPort = new MidcomRuleExternalPortEnt(mib, this);
                            this.midcomRuleInsideIpAddr = new MidcomRuleInsideIpAddrEnt(mib, this);
                            this.midcomRuleInsidePort = new MidcomRuleInsidePortEnt(mib, this);
                            this.midcomRuleOutsideIpAddr = new MidcomRuleOutsideIpAddrEnt(mib, this);
                            this.midcomRuleOutsidePort = new MidcomRuleOutsidePortEnt(mib, this);
                            this.midcomRuleLifetime = new MidcomRuleLifetimeEnt(mib, this);
                            this.midcomRuleRowStatus = new MidcomRuleRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.midcomRuleOwner,
                                this.midcomRuleIndex,
                                this.midcomRuleAdminStatus,
                                this.midcomRuleOperStatus,
                                this.midcomRuleStorageType,
                                this.midcomRuleStorageTime,
                                this.midcomRuleError,
                                this.midcomRuleInterface,
                                this.midcomRuleFlowDirection,
                                this.midcomRuleMaxIdleTime,
                                this.midcomRuleTransportProtocol,
                                this.midcomRulePortRange,
                                this.midcomRuleInternalIpVersion,
                                this.midcomRuleExternalIpVersion,
                                this.midcomRuleInternalIpAddr,
                                this.midcomRuleInternalIpPrefixLength,
                                this.midcomRuleInternalPort,
                                this.midcomRuleExternalIpAddr,
                                this.midcomRuleExternalIpPrefixLength,
                                this.midcomRuleExternalPort,
                                this.midcomRuleInsideIpAddr,
                                this.midcomRuleInsidePort,
                                this.midcomRuleOutsideIpAddr,
                                this.midcomRuleOutsidePort,
                                this.midcomRuleLifetime,
                                this.midcomRuleRowStatus
                            };
                        }
                        public static final class MidcomRuleOwnerEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleOwnerEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleOwner", "1.3.6.1.2.1.171.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleIndexEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleIndexEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleIndex", "1.3.6.1.2.1.171.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleAdminStatusEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleAdminStatusEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleAdminStatus", "1.3.6.1.2.1.171.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleOperStatusEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleOperStatusEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleOperStatus", "1.3.6.1.2.1.171.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleStorageTypeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleStorageTypeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleStorageType", "1.3.6.1.2.1.171.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleStorageTimeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleStorageTimeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleStorageTime", "1.3.6.1.2.1.171.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleErrorEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleErrorEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleError", "1.3.6.1.2.1.171.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInterfaceEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInterfaceEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInterface", "1.3.6.1.2.1.171.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleFlowDirectionEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleFlowDirectionEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleFlowDirection", "1.3.6.1.2.1.171.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleMaxIdleTimeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleMaxIdleTimeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleMaxIdleTime", "1.3.6.1.2.1.171.1.1.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleTransportProtocolEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleTransportProtocolEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleTransportProtocol", "1.3.6.1.2.1.171.1.1.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRulePortRangeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRulePortRangeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRulePortRange", "1.3.6.1.2.1.171.1.1.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInternalIpVersionEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInternalIpVersionEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInternalIpVersion", "1.3.6.1.2.1.171.1.1.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleExternalIpVersionEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleExternalIpVersionEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleExternalIpVersion", "1.3.6.1.2.1.171.1.1.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInternalIpAddrEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInternalIpAddrEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInternalIpAddr", "1.3.6.1.2.1.171.1.1.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInternalIpPrefixLengthEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInternalIpPrefixLengthEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInternalIpPrefixLength", "1.3.6.1.2.1.171.1.1.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInternalPortEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInternalPortEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInternalPort", "1.3.6.1.2.1.171.1.1.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleExternalIpAddrEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleExternalIpAddrEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleExternalIpAddr", "1.3.6.1.2.1.171.1.1.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleExternalIpPrefixLengthEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleExternalIpPrefixLengthEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleExternalIpPrefixLength", "1.3.6.1.2.1.171.1.1.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleExternalPortEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleExternalPortEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleExternalPort", "1.3.6.1.2.1.171.1.1.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInsideIpAddrEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInsideIpAddrEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInsideIpAddr", "1.3.6.1.2.1.171.1.1.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleInsidePortEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleInsidePortEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleInsidePort", "1.3.6.1.2.1.171.1.1.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleOutsideIpAddrEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleOutsideIpAddrEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleOutsideIpAddr", "1.3.6.1.2.1.171.1.1.3.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleOutsidePortEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleOutsidePortEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleOutsidePort", "1.3.6.1.2.1.171.1.1.3.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleLifetimeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleLifetimeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleLifetime", "1.3.6.1.2.1.171.1.1.3.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRuleRowStatusEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRuleRowStatusEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRuleRowStatus", "1.3.6.1.2.1.171.1.1.3.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MidcomGroupTableEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    public final MidcomGroupEntryEnt midcomGroupEntry;

                    private MidcomGroupTableEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomGroupTable", "1.3.6.1.2.1.171.1.1.4", false, true, false, false);
                        this.midcomGroupEntry = new MidcomGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.midcomGroupEntry
                        };
                    }
                    public static final class MidcomGroupEntryEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        public final MidcomGroupIndexEnt midcomGroupIndex;

                        public final MidcomGroupLifetimeEnt midcomGroupLifetime;

                        private MidcomGroupEntryEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomGroupEntry", "1.3.6.1.2.1.171.1.1.4.1", false, false, false, true);
                            this.midcomGroupIndex = new MidcomGroupIndexEnt(mib, this);
                            this.midcomGroupLifetime = new MidcomGroupLifetimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.midcomGroupIndex,
                                this.midcomGroupLifetime
                            };
                        }
                        public static final class MidcomGroupIndexEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomGroupIndexEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomGroupIndex", "1.3.6.1.2.1.171.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomGroupLifetimeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomGroupLifetimeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomGroupLifetime", "1.3.6.1.2.1.171.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MidcomConfigEnt extends MIBEntry<MIDCOMMIBDef>
            {
                /** Configuration ObjectsConfiguration objects that can be used for retrievingmiddlebox capability information (mandatory) and forsetting parameters of the implementation of transactionobjects (optional).Note that typically configuration objects are not intendedto be written by MIDCOM clients.  In general, write accessto these objects needs to be restricted more strictly thanwrite access to transaction objects.
Capabilities subtreeThis subtree contains objects to which MIDCOM clients shouldhave read access.*/
                public final MidcomConfigMaxLifetimeEnt midcomConfigMaxLifetime;

                public final MidcomConfigPersistentRulesEnt midcomConfigPersistentRules;

                public final MidcomConfigIfTableEnt midcomConfigIfTable;

                /** Firewall subtreeThis subtree contains the firewall configuration table*/
                public final MidcomConfigFirewallTableEnt midcomConfigFirewallTable;

                private MidcomConfigEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomConfig", "1.3.6.1.2.1.171.1.2", false, false, false, false);
                    this.midcomConfigMaxLifetime = new MidcomConfigMaxLifetimeEnt(mib, this);
                    this.midcomConfigPersistentRules = new MidcomConfigPersistentRulesEnt(mib, this);
                    this.midcomConfigIfTable = new MidcomConfigIfTableEnt(mib, this);
                    this.midcomConfigFirewallTable = new MidcomConfigFirewallTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.midcomConfigMaxLifetime,
                        this.midcomConfigPersistentRules,
                        this.midcomConfigIfTable,
                        this.midcomConfigFirewallTable
                    };
                }
                public static final class MidcomConfigMaxLifetimeEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomConfigMaxLifetimeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomConfigMaxLifetime", "1.3.6.1.2.1.171.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomConfigPersistentRulesEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomConfigPersistentRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomConfigPersistentRules", "1.3.6.1.2.1.171.1.2.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomConfigIfTableEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    public final MidcomConfigIfEntryEnt midcomConfigIfEntry;

                    private MidcomConfigIfTableEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomConfigIfTable", "1.3.6.1.2.1.171.1.2.3", false, true, false, false);
                        this.midcomConfigIfEntry = new MidcomConfigIfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.midcomConfigIfEntry
                        };
                    }
                    public static final class MidcomConfigIfEntryEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        public final MidcomConfigIfIndexEnt midcomConfigIfIndex;

                        public final MidcomConfigIfBitsEnt midcomConfigIfBits;

                        public final MidcomConfigIfEnabledEnt midcomConfigIfEnabled;

                        private MidcomConfigIfEntryEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomConfigIfEntry", "1.3.6.1.2.1.171.1.2.3.1", false, false, false, true);
                            this.midcomConfigIfIndex = new MidcomConfigIfIndexEnt(mib, this);
                            this.midcomConfigIfBits = new MidcomConfigIfBitsEnt(mib, this);
                            this.midcomConfigIfEnabled = new MidcomConfigIfEnabledEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.midcomConfigIfIndex,
                                this.midcomConfigIfBits,
                                this.midcomConfigIfEnabled
                            };
                        }
                        public static final class MidcomConfigIfIndexEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomConfigIfIndexEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomConfigIfIndex", "1.3.6.1.2.1.171.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomConfigIfBitsEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomConfigIfBitsEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomConfigIfBits", "1.3.6.1.2.1.171.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomConfigIfEnabledEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomConfigIfEnabledEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomConfigIfEnabled", "1.3.6.1.2.1.171.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MidcomConfigFirewallTableEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    public final MidcomConfigFirewallEntryEnt midcomConfigFirewallEntry;

                    private MidcomConfigFirewallTableEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomConfigFirewallTable", "1.3.6.1.2.1.171.1.2.4", false, true, false, false);
                        this.midcomConfigFirewallEntry = new MidcomConfigFirewallEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.midcomConfigFirewallEntry
                        };
                    }
                    public static final class MidcomConfigFirewallEntryEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        public final MidcomConfigFirewallIndexEnt midcomConfigFirewallIndex;

                        public final MidcomConfigFirewallGroupIdEnt midcomConfigFirewallGroupId;

                        public final MidcomConfigFirewallPriorityEnt midcomConfigFirewallPriority;

                        private MidcomConfigFirewallEntryEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomConfigFirewallEntry", "1.3.6.1.2.1.171.1.2.4.1", false, false, false, true);
                            this.midcomConfigFirewallIndex = new MidcomConfigFirewallIndexEnt(mib, this);
                            this.midcomConfigFirewallGroupId = new MidcomConfigFirewallGroupIdEnt(mib, this);
                            this.midcomConfigFirewallPriority = new MidcomConfigFirewallPriorityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.midcomConfigFirewallIndex,
                                this.midcomConfigFirewallGroupId,
                                this.midcomConfigFirewallPriority
                            };
                        }
                        public static final class MidcomConfigFirewallIndexEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomConfigFirewallIndexEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomConfigFirewallIndex", "1.3.6.1.2.1.171.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomConfigFirewallGroupIdEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomConfigFirewallGroupIdEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomConfigFirewallGroupId", "1.3.6.1.2.1.171.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomConfigFirewallPriorityEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomConfigFirewallPriorityEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomConfigFirewallPriority", "1.3.6.1.2.1.171.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class MidcomMonitoringEnt extends MIBEntry<MIDCOMMIBDef>
            {
                /** The MIDCOM resource table*/
                public final MidcomResourceTableEnt midcomResourceTable;

                /** Statistics subtreeThe MIDCOM statistics subtree contains a set of managedobjects providing statistics about the usage of transactionobjects.*/
                public final MidcomStatisticsEnt midcomStatistics;

                private MidcomMonitoringEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomMonitoring", "1.3.6.1.2.1.171.1.3", false, false, false, false);
                    this.midcomResourceTable = new MidcomResourceTableEnt(mib, this);
                    this.midcomStatistics = new MidcomStatisticsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.midcomResourceTable,
                        this.midcomStatistics
                    };
                }
                public static final class MidcomResourceTableEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    public final MidcomResourceEntryEnt midcomResourceEntry;

                    private MidcomResourceTableEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomResourceTable", "1.3.6.1.2.1.171.1.3.1", false, true, false, false);
                        this.midcomResourceEntry = new MidcomResourceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.midcomResourceEntry
                        };
                    }
                    public static final class MidcomResourceEntryEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        public final MidcomRscNatInternalAddrBindModeEnt midcomRscNatInternalAddrBindMode;

                        public final MidcomRscNatInternalAddrBindIdEnt midcomRscNatInternalAddrBindId;

                        public final MidcomRscNatInsideAddrBindModeEnt midcomRscNatInsideAddrBindMode;

                        public final MidcomRscNatInsideAddrBindIdEnt midcomRscNatInsideAddrBindId;

                        public final MidcomRscNatSessionId1Ent midcomRscNatSessionId1;

                        public final MidcomRscNatSessionId2Ent midcomRscNatSessionId2;

                        public final MidcomRscFirewallRuleIdEnt midcomRscFirewallRuleId;

                        private MidcomResourceEntryEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomResourceEntry", "1.3.6.1.2.1.171.1.3.1.1", false, false, false, true);
                            this.midcomRscNatInternalAddrBindMode = new MidcomRscNatInternalAddrBindModeEnt(mib, this);
                            this.midcomRscNatInternalAddrBindId = new MidcomRscNatInternalAddrBindIdEnt(mib, this);
                            this.midcomRscNatInsideAddrBindMode = new MidcomRscNatInsideAddrBindModeEnt(mib, this);
                            this.midcomRscNatInsideAddrBindId = new MidcomRscNatInsideAddrBindIdEnt(mib, this);
                            this.midcomRscNatSessionId1 = new MidcomRscNatSessionId1Ent(mib, this);
                            this.midcomRscNatSessionId2 = new MidcomRscNatSessionId2Ent(mib, this);
                            this.midcomRscFirewallRuleId = new MidcomRscFirewallRuleIdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.midcomRscNatInternalAddrBindMode,
                                this.midcomRscNatInternalAddrBindId,
                                this.midcomRscNatInsideAddrBindMode,
                                this.midcomRscNatInsideAddrBindId,
                                this.midcomRscNatSessionId1,
                                this.midcomRscNatSessionId2,
                                this.midcomRscFirewallRuleId
                            };
                        }
                        public static final class MidcomRscNatInternalAddrBindModeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscNatInternalAddrBindModeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscNatInternalAddrBindMode", "1.3.6.1.2.1.171.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRscNatInternalAddrBindIdEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscNatInternalAddrBindIdEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscNatInternalAddrBindId", "1.3.6.1.2.1.171.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRscNatInsideAddrBindModeEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscNatInsideAddrBindModeEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscNatInsideAddrBindMode", "1.3.6.1.2.1.171.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRscNatInsideAddrBindIdEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscNatInsideAddrBindIdEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscNatInsideAddrBindId", "1.3.6.1.2.1.171.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRscNatSessionId1Ent extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscNatSessionId1Ent(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscNatSessionId1", "1.3.6.1.2.1.171.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRscNatSessionId2Ent extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscNatSessionId2Ent(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscNatSessionId2", "1.3.6.1.2.1.171.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class MidcomRscFirewallRuleIdEnt extends MIBEntry<MIDCOMMIBDef>
                        {
                            private MidcomRscFirewallRuleIdEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                            {
                                super(mib, parent, "midcomRscFirewallRuleId", "1.3.6.1.2.1.171.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class MidcomStatisticsEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    public final MidcomCurrentOwnersEnt midcomCurrentOwners;

                    public final MidcomTotalRejectedRuleEntriesEnt midcomTotalRejectedRuleEntries;

                    public final MidcomCurrentRulesIncompleteEnt midcomCurrentRulesIncomplete;

                    public final MidcomTotalIncorrectReserveRulesEnt midcomTotalIncorrectReserveRules;

                    public final MidcomTotalRejectedReserveRulesEnt midcomTotalRejectedReserveRules;

                    public final MidcomCurrentActiveReserveRulesEnt midcomCurrentActiveReserveRules;

                    public final MidcomTotalExpiredReserveRulesEnt midcomTotalExpiredReserveRules;

                    public final MidcomTotalTerminatedOnRqReserveRulesEnt midcomTotalTerminatedOnRqReserveRules;

                    public final MidcomTotalTerminatedReserveRulesEnt midcomTotalTerminatedReserveRules;

                    public final MidcomTotalIncorrectEnableRulesEnt midcomTotalIncorrectEnableRules;

                    public final MidcomTotalRejectedEnableRulesEnt midcomTotalRejectedEnableRules;

                    public final MidcomCurrentActiveEnableRulesEnt midcomCurrentActiveEnableRules;

                    public final MidcomTotalExpiredEnableRulesEnt midcomTotalExpiredEnableRules;

                    public final MidcomTotalTerminatedOnRqEnableRulesEnt midcomTotalTerminatedOnRqEnableRules;

                    public final MidcomTotalTerminatedEnableRulesEnt midcomTotalTerminatedEnableRules;

                    private MidcomStatisticsEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomStatistics", "1.3.6.1.2.1.171.1.3.2", false, false, false, false);
                        this.midcomCurrentOwners = new MidcomCurrentOwnersEnt(mib, this);
                        this.midcomTotalRejectedRuleEntries = new MidcomTotalRejectedRuleEntriesEnt(mib, this);
                        this.midcomCurrentRulesIncomplete = new MidcomCurrentRulesIncompleteEnt(mib, this);
                        this.midcomTotalIncorrectReserveRules = new MidcomTotalIncorrectReserveRulesEnt(mib, this);
                        this.midcomTotalRejectedReserveRules = new MidcomTotalRejectedReserveRulesEnt(mib, this);
                        this.midcomCurrentActiveReserveRules = new MidcomCurrentActiveReserveRulesEnt(mib, this);
                        this.midcomTotalExpiredReserveRules = new MidcomTotalExpiredReserveRulesEnt(mib, this);
                        this.midcomTotalTerminatedOnRqReserveRules = new MidcomTotalTerminatedOnRqReserveRulesEnt(mib, this);
                        this.midcomTotalTerminatedReserveRules = new MidcomTotalTerminatedReserveRulesEnt(mib, this);
                        this.midcomTotalIncorrectEnableRules = new MidcomTotalIncorrectEnableRulesEnt(mib, this);
                        this.midcomTotalRejectedEnableRules = new MidcomTotalRejectedEnableRulesEnt(mib, this);
                        this.midcomCurrentActiveEnableRules = new MidcomCurrentActiveEnableRulesEnt(mib, this);
                        this.midcomTotalExpiredEnableRules = new MidcomTotalExpiredEnableRulesEnt(mib, this);
                        this.midcomTotalTerminatedOnRqEnableRules = new MidcomTotalTerminatedOnRqEnableRulesEnt(mib, this);
                        this.midcomTotalTerminatedEnableRules = new MidcomTotalTerminatedEnableRulesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.midcomCurrentOwners,
                            this.midcomTotalRejectedRuleEntries,
                            this.midcomCurrentRulesIncomplete,
                            this.midcomTotalIncorrectReserveRules,
                            this.midcomTotalRejectedReserveRules,
                            this.midcomCurrentActiveReserveRules,
                            this.midcomTotalExpiredReserveRules,
                            this.midcomTotalTerminatedOnRqReserveRules,
                            this.midcomTotalTerminatedReserveRules,
                            this.midcomTotalIncorrectEnableRules,
                            this.midcomTotalRejectedEnableRules,
                            this.midcomCurrentActiveEnableRules,
                            this.midcomTotalExpiredEnableRules,
                            this.midcomTotalTerminatedOnRqEnableRules,
                            this.midcomTotalTerminatedEnableRules
                        };
                    }
                    public static final class MidcomCurrentOwnersEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomCurrentOwnersEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomCurrentOwners", "1.3.6.1.2.1.171.1.3.2.1", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalRejectedRuleEntriesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalRejectedRuleEntriesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalRejectedRuleEntries", "1.3.6.1.2.1.171.1.3.2.2", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomCurrentRulesIncompleteEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomCurrentRulesIncompleteEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomCurrentRulesIncomplete", "1.3.6.1.2.1.171.1.3.2.3", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalIncorrectReserveRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalIncorrectReserveRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalIncorrectReserveRules", "1.3.6.1.2.1.171.1.3.2.4", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalRejectedReserveRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalRejectedReserveRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalRejectedReserveRules", "1.3.6.1.2.1.171.1.3.2.5", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomCurrentActiveReserveRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomCurrentActiveReserveRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomCurrentActiveReserveRules", "1.3.6.1.2.1.171.1.3.2.6", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalExpiredReserveRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalExpiredReserveRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalExpiredReserveRules", "1.3.6.1.2.1.171.1.3.2.7", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalTerminatedOnRqReserveRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalTerminatedOnRqReserveRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalTerminatedOnRqReserveRules", "1.3.6.1.2.1.171.1.3.2.8", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalTerminatedReserveRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalTerminatedReserveRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalTerminatedReserveRules", "1.3.6.1.2.1.171.1.3.2.9", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalIncorrectEnableRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalIncorrectEnableRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalIncorrectEnableRules", "1.3.6.1.2.1.171.1.3.2.10", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalRejectedEnableRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalRejectedEnableRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalRejectedEnableRules", "1.3.6.1.2.1.171.1.3.2.11", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomCurrentActiveEnableRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomCurrentActiveEnableRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomCurrentActiveEnableRules", "1.3.6.1.2.1.171.1.3.2.12", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalExpiredEnableRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalExpiredEnableRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalExpiredEnableRules", "1.3.6.1.2.1.171.1.3.2.13", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalTerminatedOnRqEnableRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalTerminatedOnRqEnableRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalTerminatedOnRqEnableRules", "1.3.6.1.2.1.171.1.3.2.14", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MidcomTotalTerminatedEnableRulesEnt extends MIBEntry<MIDCOMMIBDef>
                    {
                        private MidcomTotalTerminatedEnableRulesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                        {
                            super(mib, parent, "midcomTotalTerminatedEnableRules", "1.3.6.1.2.1.171.1.3.2.15", true, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class MidcomConformanceEnt extends MIBEntry<MIDCOMMIBDef>
        {
            /** Conformance information*/
            public final MidcomCompliancesEnt midcomCompliances;

            public final MidcomGroupsEnt midcomGroups;

            private MidcomConformanceEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
            {
                super(mib, parent, "midcomConformance", "1.3.6.1.2.1.171.2", false, false, false, false);
                this.midcomCompliances = new MidcomCompliancesEnt(mib, this);
                this.midcomGroups = new MidcomGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.midcomCompliances,
                    this.midcomGroups
                };
            }
            public static final class MidcomCompliancesEnt extends MIBEntry<MIDCOMMIBDef>
            {
                /** compliance statements
This is the MIDCOM compliance definition ...*/
                public final MidcomComplianceEnt midcomCompliance;

                private MidcomCompliancesEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomCompliances", "1.3.6.1.2.1.171.2.1", false, false, false, false);
                    this.midcomCompliance = new MidcomComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.midcomCompliance
                    };
                }
                public static final class MidcomComplianceEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomComplianceEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomCompliance", "1.3.6.1.2.1.171.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class MidcomGroupsEnt extends MIBEntry<MIDCOMMIBDef>
            {
                public final MidcomRuleGroupEnt midcomRuleGroup;

                public final MidcomCapabilitiesGroupEnt midcomCapabilitiesGroup;

                public final MidcomConfigFirewallGroupEnt midcomConfigFirewallGroup;

                public final MidcomResourceGroupEnt midcomResourceGroup;

                public final MidcomStatisticsGroupEnt midcomStatisticsGroup;

                public final MidcomNotificationsGroupEnt midcomNotificationsGroup;

                private MidcomGroupsEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                {
                    super(mib, parent, "midcomGroups", "1.3.6.1.2.1.171.2.2", false, false, false, false);
                    this.midcomRuleGroup = new MidcomRuleGroupEnt(mib, this);
                    this.midcomCapabilitiesGroup = new MidcomCapabilitiesGroupEnt(mib, this);
                    this.midcomConfigFirewallGroup = new MidcomConfigFirewallGroupEnt(mib, this);
                    this.midcomResourceGroup = new MidcomResourceGroupEnt(mib, this);
                    this.midcomStatisticsGroup = new MidcomStatisticsGroupEnt(mib, this);
                    this.midcomNotificationsGroup = new MidcomNotificationsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.midcomRuleGroup,
                        this.midcomCapabilitiesGroup,
                        this.midcomConfigFirewallGroup,
                        this.midcomResourceGroup,
                        this.midcomStatisticsGroup,
                        this.midcomNotificationsGroup
                    };
                }
                public static final class MidcomRuleGroupEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomRuleGroupEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomRuleGroup", "1.3.6.1.2.1.171.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomCapabilitiesGroupEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomCapabilitiesGroupEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomCapabilitiesGroup", "1.3.6.1.2.1.171.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomConfigFirewallGroupEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomConfigFirewallGroupEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomConfigFirewallGroup", "1.3.6.1.2.1.171.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomResourceGroupEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomResourceGroupEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomResourceGroup", "1.3.6.1.2.1.171.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomStatisticsGroupEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomStatisticsGroupEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomStatisticsGroup", "1.3.6.1.2.1.171.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MidcomNotificationsGroupEnt extends MIBEntry<MIDCOMMIBDef>
                {
                    private MidcomNotificationsGroupEnt(MIDCOMMIBDef mib, MIBEntry<MIDCOMMIBDef> parent)
                    {
                        super(mib, parent, "midcomNotificationsGroup", "1.3.6.1.2.1.171.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
