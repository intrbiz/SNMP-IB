package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class CHARACTERMIBDef extends MIB
{
    public static final CHARACTERMIBDef CHARACTERMIB = new CHARACTERMIBDef();

    static { MIBs.getInstance().registerMIB(CHARACTERMIBDef.CHARACTERMIB); }

    public final CharEntryEnt charEntry;

    private CHARACTERMIBDef()
    {
        super("CHARACTER-MIB");
        this.charEntry = new CharEntryEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.charEntry
        };
    }

    public static final class CharEntryEnt extends MIBEntry<CHARACTERMIBDef>
    {
        /** Generic Character information*/
        public final CharNumberEnt charNumber;

        /** the Character Port table*/
        public final CharPortTableEnt charPortTable;

        /** the Character Session table*/
        public final CharSessTableEnt charSessTable;

        public final WellKnownProtocolsEnt wellKnownProtocols;

        /** conformance information*/
        public final CharConformanceEnt charConformance;

        private CharEntryEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
        {
            super(mib, parent, "char", "1.3.6.1.2.1.19", false, false, false, false);
            this.charNumber = new CharNumberEnt(mib, this);
            this.charPortTable = new CharPortTableEnt(mib, this);
            this.charSessTable = new CharSessTableEnt(mib, this);
            this.wellKnownProtocols = new WellKnownProtocolsEnt(mib, this);
            this.charConformance = new CharConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.charNumber,
                this.charPortTable,
                this.charSessTable,
                this.wellKnownProtocols,
                this.charConformance
            };
        }
        public static final class CharNumberEnt extends MIBEntry<CHARACTERMIBDef>
        {
            private CharNumberEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
            {
                super(mib, parent, "charNumber", "1.3.6.1.2.1.19.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class CharPortTableEnt extends MIBEntry<CHARACTERMIBDef>
        {
            public final CharPortEntryEnt charPortEntry;

            private CharPortTableEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
            {
                super(mib, parent, "charPortTable", "1.3.6.1.2.1.19.2", false, true, false, false);
                this.charPortEntry = new CharPortEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.charPortEntry
                };
            }
            public static final class CharPortEntryEnt extends MIBEntry<CHARACTERMIBDef>
            {
                public final CharPortIndexEnt charPortIndex;

                public final CharPortNameEnt charPortName;

                public final CharPortTypeEnt charPortType;

                public final CharPortHardwareEnt charPortHardware;

                public final CharPortResetEnt charPortReset;

                public final CharPortAdminStatusEnt charPortAdminStatus;

                public final CharPortOperStatusEnt charPortOperStatus;

                public final CharPortLastChangeEnt charPortLastChange;

                /** charPortInFlowType is deprecated in favor ofcharPortInFlowTypes*/
                public final CharPortInFlowTypeEnt charPortInFlowType;

                /** charPortOutFlowType is deprecated in favor ofcharPortOutFlowTypes*/
                public final CharPortOutFlowTypeEnt charPortOutFlowType;

                public final CharPortInFlowStateEnt charPortInFlowState;

                public final CharPortOutFlowStateEnt charPortOutFlowState;

                public final CharPortInCharactersEnt charPortInCharacters;

                public final CharPortOutCharactersEnt charPortOutCharacters;

                public final CharPortAdminOriginEnt charPortAdminOrigin;

                public final CharPortSessionMaximumEnt charPortSessionMaximum;

                public final CharPortSessionNumberEnt charPortSessionNumber;

                public final CharPortSessionIndexEnt charPortSessionIndex;

                public final CharPortInFlowTypesEnt charPortInFlowTypes;

                public final CharPortOutFlowTypesEnt charPortOutFlowTypes;

                public final CharPortLowerIfIndexEnt charPortLowerIfIndex;

                private CharPortEntryEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "charPortEntry", "1.3.6.1.2.1.19.2.1", false, false, false, true);
                    this.charPortIndex = new CharPortIndexEnt(mib, this);
                    this.charPortName = new CharPortNameEnt(mib, this);
                    this.charPortType = new CharPortTypeEnt(mib, this);
                    this.charPortHardware = new CharPortHardwareEnt(mib, this);
                    this.charPortReset = new CharPortResetEnt(mib, this);
                    this.charPortAdminStatus = new CharPortAdminStatusEnt(mib, this);
                    this.charPortOperStatus = new CharPortOperStatusEnt(mib, this);
                    this.charPortLastChange = new CharPortLastChangeEnt(mib, this);
                    this.charPortInFlowType = new CharPortInFlowTypeEnt(mib, this);
                    this.charPortOutFlowType = new CharPortOutFlowTypeEnt(mib, this);
                    this.charPortInFlowState = new CharPortInFlowStateEnt(mib, this);
                    this.charPortOutFlowState = new CharPortOutFlowStateEnt(mib, this);
                    this.charPortInCharacters = new CharPortInCharactersEnt(mib, this);
                    this.charPortOutCharacters = new CharPortOutCharactersEnt(mib, this);
                    this.charPortAdminOrigin = new CharPortAdminOriginEnt(mib, this);
                    this.charPortSessionMaximum = new CharPortSessionMaximumEnt(mib, this);
                    this.charPortSessionNumber = new CharPortSessionNumberEnt(mib, this);
                    this.charPortSessionIndex = new CharPortSessionIndexEnt(mib, this);
                    this.charPortInFlowTypes = new CharPortInFlowTypesEnt(mib, this);
                    this.charPortOutFlowTypes = new CharPortOutFlowTypesEnt(mib, this);
                    this.charPortLowerIfIndex = new CharPortLowerIfIndexEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.charPortIndex,
                        this.charPortName,
                        this.charPortType,
                        this.charPortHardware,
                        this.charPortReset,
                        this.charPortAdminStatus,
                        this.charPortOperStatus,
                        this.charPortLastChange,
                        this.charPortInFlowType,
                        this.charPortOutFlowType,
                        this.charPortInFlowState,
                        this.charPortOutFlowState,
                        this.charPortInCharacters,
                        this.charPortOutCharacters,
                        this.charPortAdminOrigin,
                        this.charPortSessionMaximum,
                        this.charPortSessionNumber,
                        this.charPortSessionIndex,
                        this.charPortInFlowTypes,
                        this.charPortOutFlowTypes,
                        this.charPortLowerIfIndex
                    };
                }
                public static final class CharPortIndexEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortIndexEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortIndex", "1.3.6.1.2.1.19.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortNameEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortNameEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortName", "1.3.6.1.2.1.19.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortTypeEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortTypeEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortType", "1.3.6.1.2.1.19.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortHardwareEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortHardwareEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortHardware", "1.3.6.1.2.1.19.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortResetEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortResetEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortReset", "1.3.6.1.2.1.19.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortAdminStatusEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortAdminStatusEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortAdminStatus", "1.3.6.1.2.1.19.2.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortOperStatusEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortOperStatusEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortOperStatus", "1.3.6.1.2.1.19.2.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortLastChangeEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortLastChangeEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortLastChange", "1.3.6.1.2.1.19.2.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortInFlowTypeEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortInFlowTypeEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortInFlowType", "1.3.6.1.2.1.19.2.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortOutFlowTypeEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortOutFlowTypeEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortOutFlowType", "1.3.6.1.2.1.19.2.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortInFlowStateEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortInFlowStateEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortInFlowState", "1.3.6.1.2.1.19.2.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortOutFlowStateEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortOutFlowStateEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortOutFlowState", "1.3.6.1.2.1.19.2.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortInCharactersEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortInCharactersEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortInCharacters", "1.3.6.1.2.1.19.2.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortOutCharactersEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortOutCharactersEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortOutCharacters", "1.3.6.1.2.1.19.2.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortAdminOriginEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortAdminOriginEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortAdminOrigin", "1.3.6.1.2.1.19.2.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortSessionMaximumEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortSessionMaximumEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortSessionMaximum", "1.3.6.1.2.1.19.2.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortSessionNumberEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortSessionNumberEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortSessionNumber", "1.3.6.1.2.1.19.2.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortSessionIndexEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortSessionIndexEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortSessionIndex", "1.3.6.1.2.1.19.2.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortInFlowTypesEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortInFlowTypesEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortInFlowTypes", "1.3.6.1.2.1.19.2.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortOutFlowTypesEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortOutFlowTypesEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortOutFlowTypes", "1.3.6.1.2.1.19.2.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharPortLowerIfIndexEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharPortLowerIfIndexEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charPortLowerIfIndex", "1.3.6.1.2.1.19.2.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class CharSessTableEnt extends MIBEntry<CHARACTERMIBDef>
        {
            public final CharSessEntryEnt charSessEntry;

            private CharSessTableEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
            {
                super(mib, parent, "charSessTable", "1.3.6.1.2.1.19.3", false, true, false, false);
                this.charSessEntry = new CharSessEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.charSessEntry
                };
            }
            public static final class CharSessEntryEnt extends MIBEntry<CHARACTERMIBDef>
            {
                public final CharSessPortIndexEnt charSessPortIndex;

                public final CharSessIndexEnt charSessIndex;

                public final CharSessKillEnt charSessKill;

                public final CharSessStateEnt charSessState;

                public final CharSessProtocolEnt charSessProtocol;

                public final CharSessOperOriginEnt charSessOperOrigin;

                public final CharSessInCharactersEnt charSessInCharacters;

                public final CharSessOutCharactersEnt charSessOutCharacters;

                public final CharSessConnectionIdEnt charSessConnectionId;

                public final CharSessStartTimeEnt charSessStartTime;

                private CharSessEntryEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "charSessEntry", "1.3.6.1.2.1.19.3.1", false, false, false, true);
                    this.charSessPortIndex = new CharSessPortIndexEnt(mib, this);
                    this.charSessIndex = new CharSessIndexEnt(mib, this);
                    this.charSessKill = new CharSessKillEnt(mib, this);
                    this.charSessState = new CharSessStateEnt(mib, this);
                    this.charSessProtocol = new CharSessProtocolEnt(mib, this);
                    this.charSessOperOrigin = new CharSessOperOriginEnt(mib, this);
                    this.charSessInCharacters = new CharSessInCharactersEnt(mib, this);
                    this.charSessOutCharacters = new CharSessOutCharactersEnt(mib, this);
                    this.charSessConnectionId = new CharSessConnectionIdEnt(mib, this);
                    this.charSessStartTime = new CharSessStartTimeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.charSessPortIndex,
                        this.charSessIndex,
                        this.charSessKill,
                        this.charSessState,
                        this.charSessProtocol,
                        this.charSessOperOrigin,
                        this.charSessInCharacters,
                        this.charSessOutCharacters,
                        this.charSessConnectionId,
                        this.charSessStartTime
                    };
                }
                public static final class CharSessPortIndexEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessPortIndexEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessPortIndex", "1.3.6.1.2.1.19.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessIndexEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessIndexEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessIndex", "1.3.6.1.2.1.19.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessKillEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessKillEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessKill", "1.3.6.1.2.1.19.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessStateEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessStateEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessState", "1.3.6.1.2.1.19.3.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessProtocolEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessProtocolEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessProtocol", "1.3.6.1.2.1.19.3.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessOperOriginEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessOperOriginEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessOperOrigin", "1.3.6.1.2.1.19.3.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessInCharactersEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessInCharactersEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessInCharacters", "1.3.6.1.2.1.19.3.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessOutCharactersEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessOutCharactersEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessOutCharacters", "1.3.6.1.2.1.19.3.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessConnectionIdEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessConnectionIdEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessConnectionId", "1.3.6.1.2.1.19.3.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CharSessStartTimeEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharSessStartTimeEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charSessStartTime", "1.3.6.1.2.1.19.3.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class WellKnownProtocolsEnt extends MIBEntry<CHARACTERMIBDef>
        {
            public final ProtocolOtherEnt protocolOther;

            public final ProtocolTelnetEnt protocolTelnet;

            public final ProtocolRloginEnt protocolRlogin;

            public final ProtocolLatEnt protocolLat;

            public final ProtocolX29Ent protocolX29;

            public final ProtocolVtpEnt protocolVtp;

            private WellKnownProtocolsEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
            {
                super(mib, parent, "wellKnownProtocols", "1.3.6.1.2.1.19.4", false, false, false, false);
                this.protocolOther = new ProtocolOtherEnt(mib, this);
                this.protocolTelnet = new ProtocolTelnetEnt(mib, this);
                this.protocolRlogin = new ProtocolRloginEnt(mib, this);
                this.protocolLat = new ProtocolLatEnt(mib, this);
                this.protocolX29 = new ProtocolX29Ent(mib, this);
                this.protocolVtp = new ProtocolVtpEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.protocolOther,
                    this.protocolTelnet,
                    this.protocolRlogin,
                    this.protocolLat,
                    this.protocolX29,
                    this.protocolVtp
                };
            }
            public static final class ProtocolOtherEnt extends MIBEntry<CHARACTERMIBDef>
            {
                private ProtocolOtherEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "protocolOther", "1.3.6.1.2.1.19.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolTelnetEnt extends MIBEntry<CHARACTERMIBDef>
            {
                private ProtocolTelnetEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "protocolTelnet", "1.3.6.1.2.1.19.4.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolRloginEnt extends MIBEntry<CHARACTERMIBDef>
            {
                private ProtocolRloginEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "protocolRlogin", "1.3.6.1.2.1.19.4.3", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolLatEnt extends MIBEntry<CHARACTERMIBDef>
            {
                private ProtocolLatEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "protocolLat", "1.3.6.1.2.1.19.4.4", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolX29Ent extends MIBEntry<CHARACTERMIBDef>
            {
                private ProtocolX29Ent(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "protocolX29", "1.3.6.1.2.1.19.4.5", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolVtpEnt extends MIBEntry<CHARACTERMIBDef>
            {
                private ProtocolVtpEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "protocolVtp", "1.3.6.1.2.1.19.4.6", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class CharConformanceEnt extends MIBEntry<CHARACTERMIBDef>
        {
            public final CharGroupsEnt charGroups;

            public final CharCompliancesEnt charCompliances;

            private CharConformanceEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
            {
                super(mib, parent, "charConformance", "1.3.6.1.2.1.19.5", false, false, false, false);
                this.charGroups = new CharGroupsEnt(mib, this);
                this.charCompliances = new CharCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.charGroups,
                    this.charCompliances
                };
            }
            public static final class CharGroupsEnt extends MIBEntry<CHARACTERMIBDef>
            {
                /** units of conformance*/
                public final CharGroupEnt charGroup;

                private CharGroupsEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "charGroups", "1.3.6.1.2.1.19.5.1", false, false, false, false);
                    this.charGroup = new CharGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.charGroup
                    };
                }
                public static final class CharGroupEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharGroupEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charGroup", "1.3.6.1.2.1.19.5.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class CharCompliancesEnt extends MIBEntry<CHARACTERMIBDef>
            {
                /** compliance statements*/
                public final CharComplianceEnt charCompliance;

                private CharCompliancesEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                {
                    super(mib, parent, "charCompliances", "1.3.6.1.2.1.19.5.2", false, false, false, false);
                    this.charCompliance = new CharComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.charCompliance
                    };
                }
                public static final class CharComplianceEnt extends MIBEntry<CHARACTERMIBDef>
                {
                    private CharComplianceEnt(CHARACTERMIBDef mib, MIBEntry<CHARACTERMIBDef> parent)
                    {
                        super(mib, parent, "charCompliance", "1.3.6.1.2.1.19.5.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
