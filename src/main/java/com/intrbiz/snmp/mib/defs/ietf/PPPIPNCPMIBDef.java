package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class PPPIPNCPMIBDef extends MIB
{
    public static final PPPIPNCPMIBDef PPPIPNCPMIB = new PPPIPNCPMIBDef();

    /** The PPP IP Group.Implementation of this group is mandatory for allPPP implementations that support operating IP over PPP.*/
    public final PppIpEnt pppIp;

    private PPPIPNCPMIBDef()
    {
        super("PPP-IP-NCP-MIB");
        this.pppIp = new PppIpEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pppIp
        };
    }

    public static final class PppIpEnt extends MIBEntry<PPPIPNCPMIBDef>
    {
        public final PppIpTableEnt pppIpTable;

        /** The PPP IP Configuration table.This is a separate table in order to facilitateplacing these variables in a separate MIB view.*/
        public final PppIpConfigTableEnt pppIpConfigTable;

        private PppIpEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
        {
            super(mib, parent, "pppIp", "1.3.6.1.2.1.10.23.3", false, false, false, false);
            this.pppIpTable = new PppIpTableEnt(mib, this);
            this.pppIpConfigTable = new PppIpConfigTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pppIpTable,
                this.pppIpConfigTable
            };
        }
        public static final class PppIpTableEnt extends MIBEntry<PPPIPNCPMIBDef>
        {
            public final PppIpEntryEnt pppIpEntry;

            private PppIpTableEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
            {
                super(mib, parent, "pppIpTable", "1.3.6.1.2.1.10.23.3.1", false, true, false, false);
                this.pppIpEntry = new PppIpEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppIpEntry
                };
            }
            public static final class PppIpEntryEnt extends MIBEntry<PPPIPNCPMIBDef>
            {
                /** The following object reflect the values of the optionparameters used in the PPP IP Control ProtocolpppIpLocalToRemoteCompressionProtocolpppIpRemoteToLocalCompressionProtocolpppIpRemoteMaxSlotIdpppIpLocalMaxSlotIdThese values are not available until after the PPP Optionnegotiation has completed, which is indicated by the linkreaching the open state (i.e., pppIpOperStatus is set toopened).Therefore, when pppIpOperStatus is not openedthe contents of these objects is undefined. The valuereturned when accessing the objects is an implementationdependent issue.*/
                public final PppIpOperStatusEnt pppIpOperStatus;

                public final PppIpLocalToRemoteCompressionProtocolEnt pppIpLocalToRemoteCompressionProtocol;

                public final PppIpRemoteToLocalCompressionProtocolEnt pppIpRemoteToLocalCompressionProtocol;

                public final PppIpRemoteMaxSlotIdEnt pppIpRemoteMaxSlotId;

                public final PppIpLocalMaxSlotIdEnt pppIpLocalMaxSlotId;

                private PppIpEntryEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                {
                    super(mib, parent, "pppIpEntry", "1.3.6.1.2.1.10.23.3.1.1", false, false, false, true);
                    this.pppIpOperStatus = new PppIpOperStatusEnt(mib, this);
                    this.pppIpLocalToRemoteCompressionProtocol = new PppIpLocalToRemoteCompressionProtocolEnt(mib, this);
                    this.pppIpRemoteToLocalCompressionProtocol = new PppIpRemoteToLocalCompressionProtocolEnt(mib, this);
                    this.pppIpRemoteMaxSlotId = new PppIpRemoteMaxSlotIdEnt(mib, this);
                    this.pppIpLocalMaxSlotId = new PppIpLocalMaxSlotIdEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppIpOperStatus,
                        this.pppIpLocalToRemoteCompressionProtocol,
                        this.pppIpRemoteToLocalCompressionProtocol,
                        this.pppIpRemoteMaxSlotId,
                        this.pppIpLocalMaxSlotId
                    };
                }
                public static final class PppIpOperStatusEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpOperStatusEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpOperStatus", "1.3.6.1.2.1.10.23.3.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppIpLocalToRemoteCompressionProtocolEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpLocalToRemoteCompressionProtocolEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpLocalToRemoteCompressionProtocol", "1.3.6.1.2.1.10.23.3.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppIpRemoteToLocalCompressionProtocolEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpRemoteToLocalCompressionProtocolEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpRemoteToLocalCompressionProtocol", "1.3.6.1.2.1.10.23.3.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppIpRemoteMaxSlotIdEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpRemoteMaxSlotIdEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpRemoteMaxSlotId", "1.3.6.1.2.1.10.23.3.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppIpLocalMaxSlotIdEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpLocalMaxSlotIdEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpLocalMaxSlotId", "1.3.6.1.2.1.10.23.3.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class PppIpConfigTableEnt extends MIBEntry<PPPIPNCPMIBDef>
        {
            public final PppIpConfigEntryEnt pppIpConfigEntry;

            private PppIpConfigTableEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
            {
                super(mib, parent, "pppIpConfigTable", "1.3.6.1.2.1.10.23.3.2", false, true, false, false);
                this.pppIpConfigEntry = new PppIpConfigEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pppIpConfigEntry
                };
            }
            public static final class PppIpConfigEntryEnt extends MIBEntry<PPPIPNCPMIBDef>
            {
                public final PppIpConfigAdminStatusEnt pppIpConfigAdminStatus;

                public final PppIpConfigCompressionEnt pppIpConfigCompression;

                private PppIpConfigEntryEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                {
                    super(mib, parent, "pppIpConfigEntry", "1.3.6.1.2.1.10.23.3.2.1", false, false, false, true);
                    this.pppIpConfigAdminStatus = new PppIpConfigAdminStatusEnt(mib, this);
                    this.pppIpConfigCompression = new PppIpConfigCompressionEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pppIpConfigAdminStatus,
                        this.pppIpConfigCompression
                    };
                }
                public static final class PppIpConfigAdminStatusEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpConfigAdminStatusEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpConfigAdminStatus", "1.3.6.1.2.1.10.23.3.2.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PppIpConfigCompressionEnt extends MIBEntry<PPPIPNCPMIBDef>
                {
                    private PppIpConfigCompressionEnt(PPPIPNCPMIBDef mib, MIBEntry<PPPIPNCPMIBDef> parent)
                    {
                        super(mib, parent, "pppIpConfigCompression", "1.3.6.1.2.1.10.23.3.2.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
