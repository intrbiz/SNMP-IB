package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class PPPBRIDGENCPMIBDef extends MIB
{
    public static final PPPBRIDGENCPMIBDef PPPBRIDGENCPMIB = new PPPBRIDGENCPMIBDef();

    static { MIBs.getInstance().registerMIB(PPPBRIDGENCPMIBDef.PPPBRIDGENCPMIB); }

    public final PppBridgeEnt pppBridge;

    private PPPBRIDGENCPMIBDef()
    {
        super("PPP-BRIDGE-NCP-MIB");
        this.pppBridge = new PppBridgeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pppBridge
        };
    }

    public static final class PppBridgeEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
    {
        /** The PPP Bridge NCP Group.Implementation of this group is mandatory for allPPP implementations that support MAC Bridging  overPPP (RFC1220).
The following object reflect the values of the optionparameters used in the PPP Link Control ProtocolpppBridgeLocalToRemoteTinygramCompressionpppBridgeRemoteToLocalTinygramCompressionpppBridgeLocalToRemoteLanIdpppBridgeRemoteToLocalLanIdThese values are not available until after the PPP Option
negotiation has completed, which is indicated by the linkreaching the open state (i.e. pppBridgeOperStatus is set toopened).Therefore, when pppBridgeOperStatus is not openedthe contents of these objects is undefined. The valuereturned when accessing the objects is an implementationdependent issue.*/
        public final PppBridgeTableEnt pppBridgeTable;

        /** The PPP Bridge Configuration table*/
        public final PppBridgeConfigTableEnt pppBridgeConfigTable;

        /** The PPP Bridge Media Status Table*/
        public final PppBridgeMediaTableEnt pppBridgeMediaTable;

        /** The PPP Bridge Media Configuration Table*/
        public final PppBridgeMediaConfigTableEnt pppBridgeMediaConfigTable;

        private PppBridgeEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
        {
            super(mib, parent, "pppBridge", "1.3.6.1.2.1.10.23.4", false, false, false, false);
            this.pppBridgeTable = new PppBridgeTableEnt(mib, this);
            this.pppBridgeConfigTable = new PppBridgeConfigTableEnt(mib, this);
            this.pppBridgeMediaTable = new PppBridgeMediaTableEnt(mib, this);
            this.pppBridgeMediaConfigTable = new PppBridgeMediaConfigTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pppBridgeTable,
                this.pppBridgeConfigTable,
                this.pppBridgeMediaTable,
                this.pppBridgeMediaConfigTable
            };
        }
        public static final class PppBridgeTableEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
        {
            public final PppBridgeEntryEnt pppBridgeEntry;

            private PppBridgeTableEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
            {
                super(mib, parent, "pppBridgeTable", "1.3.6.1.2.1.10.23.4.1", false, true, false, false);
                this.pppBridgeEntry = new PppBridgeEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppBridgeEntry
                };
            }
            public static final class PppBridgeEntryEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
            {
                public final PppBridgeOperStatusEnt pppBridgeOperStatus;

                public final PppBridgeLocalToRemoteTinygramCompressionEnt pppBridgeLocalToRemoteTinygramCompression;

                public final PppBridgeRemoteToLocalTinygramCompressionEnt pppBridgeRemoteToLocalTinygramCompression;

                public final PppBridgeLocalToRemoteLanIdEnt pppBridgeLocalToRemoteLanId;

                public final PppBridgeRemoteToLocalLanIdEnt pppBridgeRemoteToLocalLanId;

                private PppBridgeEntryEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                {
                    super(mib, parent, "pppBridgeEntry", "1.3.6.1.2.1.10.23.4.1.1", false, false, false, true);
                    this.pppBridgeOperStatus = new PppBridgeOperStatusEnt(mib, this);
                    this.pppBridgeLocalToRemoteTinygramCompression = new PppBridgeLocalToRemoteTinygramCompressionEnt(mib, this);
                    this.pppBridgeRemoteToLocalTinygramCompression = new PppBridgeRemoteToLocalTinygramCompressionEnt(mib, this);
                    this.pppBridgeLocalToRemoteLanId = new PppBridgeLocalToRemoteLanIdEnt(mib, this);
                    this.pppBridgeRemoteToLocalLanId = new PppBridgeRemoteToLocalLanIdEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppBridgeOperStatus,
                        this.pppBridgeLocalToRemoteTinygramCompression,
                        this.pppBridgeRemoteToLocalTinygramCompression,
                        this.pppBridgeLocalToRemoteLanId,
                        this.pppBridgeRemoteToLocalLanId
                    };
                }
                public static final class PppBridgeOperStatusEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeOperStatusEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeOperStatus", "1.3.6.1.2.1.10.23.4.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeLocalToRemoteTinygramCompressionEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeLocalToRemoteTinygramCompressionEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeLocalToRemoteTinygramCompression", "1.3.6.1.2.1.10.23.4.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeRemoteToLocalTinygramCompressionEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeRemoteToLocalTinygramCompressionEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeRemoteToLocalTinygramCompression", "1.3.6.1.2.1.10.23.4.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeLocalToRemoteLanIdEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeLocalToRemoteLanIdEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeLocalToRemoteLanId", "1.3.6.1.2.1.10.23.4.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeRemoteToLocalLanIdEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeRemoteToLocalLanIdEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeRemoteToLocalLanId", "1.3.6.1.2.1.10.23.4.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PppBridgeConfigTableEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
        {
            public final PppBridgeConfigEntryEnt pppBridgeConfigEntry;

            private PppBridgeConfigTableEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
            {
                super(mib, parent, "pppBridgeConfigTable", "1.3.6.1.2.1.10.23.4.2", false, true, false, false);
                this.pppBridgeConfigEntry = new PppBridgeConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppBridgeConfigEntry
                };
            }
            public static final class PppBridgeConfigEntryEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
            {
                public final PppBridgeConfigAdminStatusEnt pppBridgeConfigAdminStatus;

                public final PppBridgeConfigTinygramEnt pppBridgeConfigTinygram;

                public final PppBridgeConfigRingIdEnt pppBridgeConfigRingId;

                public final PppBridgeConfigLineIdEnt pppBridgeConfigLineId;

                public final PppBridgeConfigLanIdEnt pppBridgeConfigLanId;

                private PppBridgeConfigEntryEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                {
                    super(mib, parent, "pppBridgeConfigEntry", "1.3.6.1.2.1.10.23.4.2.1", false, false, false, true);
                    this.pppBridgeConfigAdminStatus = new PppBridgeConfigAdminStatusEnt(mib, this);
                    this.pppBridgeConfigTinygram = new PppBridgeConfigTinygramEnt(mib, this);
                    this.pppBridgeConfigRingId = new PppBridgeConfigRingIdEnt(mib, this);
                    this.pppBridgeConfigLineId = new PppBridgeConfigLineIdEnt(mib, this);
                    this.pppBridgeConfigLanId = new PppBridgeConfigLanIdEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppBridgeConfigAdminStatus,
                        this.pppBridgeConfigTinygram,
                        this.pppBridgeConfigRingId,
                        this.pppBridgeConfigLineId,
                        this.pppBridgeConfigLanId
                    };
                }
                public static final class PppBridgeConfigAdminStatusEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeConfigAdminStatusEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeConfigAdminStatus", "1.3.6.1.2.1.10.23.4.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeConfigTinygramEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeConfigTinygramEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeConfigTinygram", "1.3.6.1.2.1.10.23.4.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeConfigRingIdEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeConfigRingIdEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeConfigRingId", "1.3.6.1.2.1.10.23.4.2.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeConfigLineIdEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeConfigLineIdEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeConfigLineId", "1.3.6.1.2.1.10.23.4.2.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeConfigLanIdEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeConfigLanIdEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeConfigLanId", "1.3.6.1.2.1.10.23.4.2.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PppBridgeMediaTableEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
        {
            public final PppBridgeMediaEntryEnt pppBridgeMediaEntry;

            private PppBridgeMediaTableEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
            {
                super(mib, parent, "pppBridgeMediaTable", "1.3.6.1.2.1.10.23.4.3", false, true, false, false);
                this.pppBridgeMediaEntry = new PppBridgeMediaEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppBridgeMediaEntry
                };
            }
            public static final class PppBridgeMediaEntryEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
            {
                public final PppBridgeMediaMacTypeEnt pppBridgeMediaMacType;

                public final PppBridgeMediaLocalStatusEnt pppBridgeMediaLocalStatus;

                public final PppBridgeMediaRemoteStatusEnt pppBridgeMediaRemoteStatus;

                private PppBridgeMediaEntryEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                {
                    super(mib, parent, "pppBridgeMediaEntry", "1.3.6.1.2.1.10.23.4.3.1", false, false, false, true);
                    this.pppBridgeMediaMacType = new PppBridgeMediaMacTypeEnt(mib, this);
                    this.pppBridgeMediaLocalStatus = new PppBridgeMediaLocalStatusEnt(mib, this);
                    this.pppBridgeMediaRemoteStatus = new PppBridgeMediaRemoteStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppBridgeMediaMacType,
                        this.pppBridgeMediaLocalStatus,
                        this.pppBridgeMediaRemoteStatus
                    };
                }
                public static final class PppBridgeMediaMacTypeEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeMediaMacTypeEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeMediaMacType", "1.3.6.1.2.1.10.23.4.3.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeMediaLocalStatusEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeMediaLocalStatusEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeMediaLocalStatus", "1.3.6.1.2.1.10.23.4.3.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeMediaRemoteStatusEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeMediaRemoteStatusEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeMediaRemoteStatus", "1.3.6.1.2.1.10.23.4.3.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PppBridgeMediaConfigTableEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
        {
            public final PppBridgeMediaConfigEntryEnt pppBridgeMediaConfigEntry;

            private PppBridgeMediaConfigTableEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
            {
                super(mib, parent, "pppBridgeMediaConfigTable", "1.3.6.1.2.1.10.23.4.4", false, true, false, false);
                this.pppBridgeMediaConfigEntry = new PppBridgeMediaConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppBridgeMediaConfigEntry
                };
            }
            public static final class PppBridgeMediaConfigEntryEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
            {
                public final PppBridgeMediaConfigMacTypeEnt pppBridgeMediaConfigMacType;

                public final PppBridgeMediaConfigLocalStatusEnt pppBridgeMediaConfigLocalStatus;

                private PppBridgeMediaConfigEntryEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                {
                    super(mib, parent, "pppBridgeMediaConfigEntry", "1.3.6.1.2.1.10.23.4.4.1", false, false, false, true);
                    this.pppBridgeMediaConfigMacType = new PppBridgeMediaConfigMacTypeEnt(mib, this);
                    this.pppBridgeMediaConfigLocalStatus = new PppBridgeMediaConfigLocalStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppBridgeMediaConfigMacType,
                        this.pppBridgeMediaConfigLocalStatus
                    };
                }
                public static final class PppBridgeMediaConfigMacTypeEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeMediaConfigMacTypeEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeMediaConfigMacType", "1.3.6.1.2.1.10.23.4.4.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppBridgeMediaConfigLocalStatusEnt extends MIBEntry<PPPBRIDGENCPMIBDef>
                {
                    private PppBridgeMediaConfigLocalStatusEnt(PPPBRIDGENCPMIBDef mib, MIBEntry<PPPBRIDGENCPMIBDef> parent)
                    {
                        super(mib, parent, "pppBridgeMediaConfigLocalStatus", "1.3.6.1.2.1.10.23.4.4.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
