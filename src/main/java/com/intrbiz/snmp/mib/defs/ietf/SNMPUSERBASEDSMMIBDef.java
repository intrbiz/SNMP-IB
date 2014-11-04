package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPUSERBASEDSMMIBDef extends MIB
{
    public static final SNMPUSERBASEDSMMIBDef SNMPUSERBASEDSMMIB = new SNMPUSERBASEDSMMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPUSERBASEDSMMIBDef.SNMPUSERBASEDSMMIB); }

    /** 16 Oct 2002, midnight*/
    public final SnmpUsmMIBEnt snmpUsmMIB;

    /** Identification of Authentication and Privacy Protocols *************/
    public final UsmNoAuthProtocolEnt usmNoAuthProtocol;

    public final UsmHMACMD5AuthProtocolEnt usmHMACMD5AuthProtocol;

    public final UsmHMACSHAAuthProtocolEnt usmHMACSHAAuthProtocol;

    public final UsmNoPrivProtocolEnt usmNoPrivProtocol;

    public final UsmDESPrivProtocolEnt usmDESPrivProtocol;

    private SNMPUSERBASEDSMMIBDef()
    {
        super("SNMP-USER-BASED-SM-MIB");
        this.snmpUsmMIB = new SnmpUsmMIBEnt(this, null);
        this.usmNoAuthProtocol = new UsmNoAuthProtocolEnt(this, null);
        this.usmHMACMD5AuthProtocol = new UsmHMACMD5AuthProtocolEnt(this, null);
        this.usmHMACSHAAuthProtocol = new UsmHMACSHAAuthProtocolEnt(this, null);
        this.usmNoPrivProtocol = new UsmNoPrivProtocolEnt(this, null);
        this.usmDESPrivProtocol = new UsmDESPrivProtocolEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpUsmMIB,
            this.usmNoAuthProtocol,
            this.usmHMACMD5AuthProtocol,
            this.usmHMACSHAAuthProtocol,
            this.usmNoPrivProtocol,
            this.usmDESPrivProtocol
        };
    }

    public static final class SnmpUsmMIBEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
    {
        /** Administrative assignments *****************************************/
        public final UsmMIBObjectsEnt usmMIBObjects;

        public final UsmMIBConformanceEnt usmMIBConformance;

        private SnmpUsmMIBEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
        {
            super(mib, parent, "snmpUsmMIB", "1.3.6.1.6.3.15", false, false, false, false);
            this.usmMIBObjects = new UsmMIBObjectsEnt(mib, this);
            this.usmMIBConformance = new UsmMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.usmMIBObjects,
                this.usmMIBConformance
            };
        }
        public static final class UsmMIBObjectsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
        {
            /** Statistics for the User-based Security Model ***********************/
            public final UsmStatsEnt usmStats;

            /** The usmUser Group *************************************************/
            public final UsmUserEnt usmUser;

            private UsmMIBObjectsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
            {
                super(mib, parent, "usmMIBObjects", "1.3.6.1.6.3.15.1", false, false, false, false);
                this.usmStats = new UsmStatsEnt(mib, this);
                this.usmUser = new UsmUserEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usmStats,
                    this.usmUser
                };
            }
            public static final class UsmStatsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
            {
                public final UsmStatsUnsupportedSecLevelsEnt usmStatsUnsupportedSecLevels;

                public final UsmStatsNotInTimeWindowsEnt usmStatsNotInTimeWindows;

                public final UsmStatsUnknownUserNamesEnt usmStatsUnknownUserNames;

                public final UsmStatsUnknownEngineIDsEnt usmStatsUnknownEngineIDs;

                public final UsmStatsWrongDigestsEnt usmStatsWrongDigests;

                public final UsmStatsDecryptionErrorsEnt usmStatsDecryptionErrors;

                private UsmStatsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                {
                    super(mib, parent, "usmStats", "1.3.6.1.6.3.15.1.1", false, false, false, false);
                    this.usmStatsUnsupportedSecLevels = new UsmStatsUnsupportedSecLevelsEnt(mib, this);
                    this.usmStatsNotInTimeWindows = new UsmStatsNotInTimeWindowsEnt(mib, this);
                    this.usmStatsUnknownUserNames = new UsmStatsUnknownUserNamesEnt(mib, this);
                    this.usmStatsUnknownEngineIDs = new UsmStatsUnknownEngineIDsEnt(mib, this);
                    this.usmStatsWrongDigests = new UsmStatsWrongDigestsEnt(mib, this);
                    this.usmStatsDecryptionErrors = new UsmStatsDecryptionErrorsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmStatsUnsupportedSecLevels,
                        this.usmStatsNotInTimeWindows,
                        this.usmStatsUnknownUserNames,
                        this.usmStatsUnknownEngineIDs,
                        this.usmStatsWrongDigests,
                        this.usmStatsDecryptionErrors
                    };
                }
                public static final class UsmStatsUnsupportedSecLevelsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmStatsUnsupportedSecLevelsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmStatsUnsupportedSecLevels", "1.3.6.1.6.3.15.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmStatsNotInTimeWindowsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmStatsNotInTimeWindowsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmStatsNotInTimeWindows", "1.3.6.1.6.3.15.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmStatsUnknownUserNamesEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmStatsUnknownUserNamesEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmStatsUnknownUserNames", "1.3.6.1.6.3.15.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmStatsUnknownEngineIDsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmStatsUnknownEngineIDsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmStatsUnknownEngineIDs", "1.3.6.1.6.3.15.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmStatsWrongDigestsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmStatsWrongDigestsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmStatsWrongDigests", "1.3.6.1.6.3.15.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmStatsDecryptionErrorsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmStatsDecryptionErrorsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmStatsDecryptionErrors", "1.3.6.1.6.3.15.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UsmUserEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
            {
                public final UsmUserSpinLockEnt usmUserSpinLock;

                /** The table of valid users for the User-based Security Model *********/
                public final UsmUserTableEnt usmUserTable;

                private UsmUserEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                {
                    super(mib, parent, "usmUser", "1.3.6.1.6.3.15.1.2", false, false, false, false);
                    this.usmUserSpinLock = new UsmUserSpinLockEnt(mib, this);
                    this.usmUserTable = new UsmUserTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmUserSpinLock,
                        this.usmUserTable
                    };
                }
                public static final class UsmUserSpinLockEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmUserSpinLockEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmUserSpinLock", "1.3.6.1.6.3.15.1.2.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class UsmUserTableEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    public final UsmUserEntryEnt usmUserEntry;

                    private UsmUserTableEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmUserTable", "1.3.6.1.6.3.15.1.2.2", false, true, false, false);
                        this.usmUserEntry = new UsmUserEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.usmUserEntry
                        };
                    }
                    public static final class UsmUserEntryEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                    {
                        public final UsmUserEngineIDEnt usmUserEngineID;

                        public final UsmUserNameEnt usmUserName;

                        public final UsmUserSecurityNameEnt usmUserSecurityName;

                        public final UsmUserCloneFromEnt usmUserCloneFrom;

                        public final UsmUserAuthProtocolEnt usmUserAuthProtocol;

                        /** the empty string*/
                        public final UsmUserAuthKeyChangeEnt usmUserAuthKeyChange;

                        /** the empty string*/
                        public final UsmUserOwnAuthKeyChangeEnt usmUserOwnAuthKeyChange;

                        public final UsmUserPrivProtocolEnt usmUserPrivProtocol;

                        /** the empty string*/
                        public final UsmUserPrivKeyChangeEnt usmUserPrivKeyChange;

                        /** the empty string*/
                        public final UsmUserOwnPrivKeyChangeEnt usmUserOwnPrivKeyChange;

                        /** the empty string*/
                        public final UsmUserPublicEnt usmUserPublic;

                        public final UsmUserStorageTypeEnt usmUserStorageType;

                        public final UsmUserStatusEnt usmUserStatus;

                        private UsmUserEntryEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                        {
                            super(mib, parent, "usmUserEntry", "1.3.6.1.6.3.15.1.2.2.1", false, false, false, true);
                            this.usmUserEngineID = new UsmUserEngineIDEnt(mib, this);
                            this.usmUserName = new UsmUserNameEnt(mib, this);
                            this.usmUserSecurityName = new UsmUserSecurityNameEnt(mib, this);
                            this.usmUserCloneFrom = new UsmUserCloneFromEnt(mib, this);
                            this.usmUserAuthProtocol = new UsmUserAuthProtocolEnt(mib, this);
                            this.usmUserAuthKeyChange = new UsmUserAuthKeyChangeEnt(mib, this);
                            this.usmUserOwnAuthKeyChange = new UsmUserOwnAuthKeyChangeEnt(mib, this);
                            this.usmUserPrivProtocol = new UsmUserPrivProtocolEnt(mib, this);
                            this.usmUserPrivKeyChange = new UsmUserPrivKeyChangeEnt(mib, this);
                            this.usmUserOwnPrivKeyChange = new UsmUserOwnPrivKeyChangeEnt(mib, this);
                            this.usmUserPublic = new UsmUserPublicEnt(mib, this);
                            this.usmUserStorageType = new UsmUserStorageTypeEnt(mib, this);
                            this.usmUserStatus = new UsmUserStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.usmUserEngineID,
                                this.usmUserName,
                                this.usmUserSecurityName,
                                this.usmUserCloneFrom,
                                this.usmUserAuthProtocol,
                                this.usmUserAuthKeyChange,
                                this.usmUserOwnAuthKeyChange,
                                this.usmUserPrivProtocol,
                                this.usmUserPrivKeyChange,
                                this.usmUserOwnPrivKeyChange,
                                this.usmUserPublic,
                                this.usmUserStorageType,
                                this.usmUserStatus
                            };
                        }
                        public static final class UsmUserEngineIDEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserEngineIDEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserEngineID", "1.3.6.1.6.3.15.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserNameEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserNameEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserName", "1.3.6.1.6.3.15.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserSecurityNameEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserSecurityNameEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserSecurityName", "1.3.6.1.6.3.15.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserCloneFromEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserCloneFromEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserCloneFrom", "1.3.6.1.6.3.15.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserAuthProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserAuthProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserAuthProtocol", "1.3.6.1.6.3.15.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserAuthKeyChangeEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserAuthKeyChangeEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserAuthKeyChange", "1.3.6.1.6.3.15.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserOwnAuthKeyChangeEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserOwnAuthKeyChangeEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserOwnAuthKeyChange", "1.3.6.1.6.3.15.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserPrivProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserPrivProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserPrivProtocol", "1.3.6.1.6.3.15.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserPrivKeyChangeEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserPrivKeyChangeEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserPrivKeyChange", "1.3.6.1.6.3.15.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserOwnPrivKeyChangeEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserOwnPrivKeyChangeEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserOwnPrivKeyChange", "1.3.6.1.6.3.15.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserPublicEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserPublicEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserPublic", "1.3.6.1.6.3.15.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserStorageTypeEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserStorageTypeEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserStorageType", "1.3.6.1.6.3.15.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class UsmUserStatusEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                        {
                            private UsmUserStatusEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                            {
                                super(mib, parent, "usmUserStatus", "1.3.6.1.6.3.15.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class UsmMIBConformanceEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
        {
            /** Conformance Information ********************************************/
            public final UsmMIBCompliancesEnt usmMIBCompliances;

            public final UsmMIBGroupsEnt usmMIBGroups;

            private UsmMIBConformanceEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
            {
                super(mib, parent, "usmMIBConformance", "1.3.6.1.6.3.15.2", false, false, false, false);
                this.usmMIBCompliances = new UsmMIBCompliancesEnt(mib, this);
                this.usmMIBGroups = new UsmMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usmMIBCompliances,
                    this.usmMIBGroups
                };
            }
            public static final class UsmMIBCompliancesEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
            {
                /** Compliance statements*/
                public final UsmMIBComplianceEnt usmMIBCompliance;

                private UsmMIBCompliancesEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                {
                    super(mib, parent, "usmMIBCompliances", "1.3.6.1.6.3.15.2.1", false, false, false, false);
                    this.usmMIBCompliance = new UsmMIBComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmMIBCompliance
                    };
                }
                public static final class UsmMIBComplianceEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmMIBComplianceEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmMIBCompliance", "1.3.6.1.6.3.15.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class UsmMIBGroupsEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
            {
                /** Units of compliance*/
                public final UsmMIBBasicGroupEnt usmMIBBasicGroup;

                private UsmMIBGroupsEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                {
                    super(mib, parent, "usmMIBGroups", "1.3.6.1.6.3.15.2.2", false, false, false, false);
                    this.usmMIBBasicGroup = new UsmMIBBasicGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.usmMIBBasicGroup
                    };
                }
                public static final class UsmMIBBasicGroupEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
                {
                    private UsmMIBBasicGroupEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
                    {
                        super(mib, parent, "usmMIBBasicGroup", "1.3.6.1.6.3.15.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class UsmNoAuthProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
    {
        private UsmNoAuthProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
        {
            super(mib, parent, "usmNoAuthProtocol", "1.3.6.1.6.3.10.1.1.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UsmHMACMD5AuthProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
    {
        private UsmHMACMD5AuthProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
        {
            super(mib, parent, "usmHMACMD5AuthProtocol", "1.3.6.1.6.3.10.1.1.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UsmHMACSHAAuthProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
    {
        private UsmHMACSHAAuthProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
        {
            super(mib, parent, "usmHMACSHAAuthProtocol", "1.3.6.1.6.3.10.1.1.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UsmNoPrivProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
    {
        private UsmNoPrivProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
        {
            super(mib, parent, "usmNoPrivProtocol", "1.3.6.1.6.3.10.1.2.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class UsmDESPrivProtocolEnt extends MIBEntry<SNMPUSERBASEDSMMIBDef>
    {
        private UsmDESPrivProtocolEnt(SNMPUSERBASEDSMMIBDef mib, MIBEntry<SNMPUSERBASEDSMMIBDef> parent)
        {
            super(mib, parent, "usmDESPrivProtocol", "1.3.6.1.6.3.10.1.2.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
