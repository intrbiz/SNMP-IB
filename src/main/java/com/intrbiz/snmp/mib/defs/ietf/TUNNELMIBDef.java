package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**[RFC2578]
[RFC2579]
[RFC2580]
[RFC4001]
[RFC3595]
[RFC2863]*/
public final class TUNNELMIBDef extends MIB
{
    public static final TUNNELMIBDef TUNNELMIB = new TUNNELMIBDef();

    /** [IFTYPE]

May 16, 2005*/
    public final TunnelMIBEnt tunnelMIB;

    private TUNNELMIBDef()
    {
        super("TUNNEL-MIB");
        this.tunnelMIB = new TunnelMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.tunnelMIB
        };
    }

    public static final class TunnelMIBEnt extends MIBEntry<TUNNELMIBDef>
    {
        public final TunnelMIBObjectsEnt tunnelMIBObjects;

        /** conformance information*/
        public final TunnelMIBConformanceEnt tunnelMIBConformance;

        private TunnelMIBEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
        {
            super(mib, parent, "tunnelMIB", "1.3.6.1.2.1.10.131", false, false, false, false);
            this.tunnelMIBObjects = new TunnelMIBObjectsEnt(mib, this);
            this.tunnelMIBConformance = new TunnelMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.tunnelMIBObjects,
                this.tunnelMIBConformance
            };
        }
        public static final class TunnelMIBObjectsEnt extends MIBEntry<TUNNELMIBDef>
        {
            public final TunnelEnt tunnel;

            private TunnelMIBObjectsEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
            {
                super(mib, parent, "tunnelMIBObjects", "1.3.6.1.2.1.10.131.1", false, false, false, false);
                this.tunnel = new TunnelEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tunnel
                };
            }
            public static final class TunnelEnt extends MIBEntry<TUNNELMIBDef>
            {
                /** the IP Tunnel MIB-Groupa collection of objects providing information aboutIP Tunnels*/
                public final TunnelIfTableEnt tunnelIfTable;

                public final TunnelConfigTableEnt tunnelConfigTable;

                public final TunnelInetConfigTableEnt tunnelInetConfigTable;

                private TunnelEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                {
                    super(mib, parent, "tunnel", "1.3.6.1.2.1.10.131.1.1", false, false, false, false);
                    this.tunnelIfTable = new TunnelIfTableEnt(mib, this);
                    this.tunnelConfigTable = new TunnelConfigTableEnt(mib, this);
                    this.tunnelInetConfigTable = new TunnelInetConfigTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tunnelIfTable,
                        this.tunnelConfigTable,
                        this.tunnelInetConfigTable
                    };
                }
                public static final class TunnelIfTableEnt extends MIBEntry<TUNNELMIBDef>
                {
                    public final TunnelIfEntryEnt tunnelIfEntry;

                    private TunnelIfTableEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelIfTable", "1.3.6.1.2.1.10.131.1.1.1", false, true, false, false);
                        this.tunnelIfEntry = new TunnelIfEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tunnelIfEntry
                        };
                    }
                    public static final class TunnelIfEntryEnt extends MIBEntry<TUNNELMIBDef>
                    {
                        public final TunnelIfLocalAddressEnt tunnelIfLocalAddress;

                        public final TunnelIfRemoteAddressEnt tunnelIfRemoteAddress;

                        public final TunnelIfEncapsMethodEnt tunnelIfEncapsMethod;

                        public final TunnelIfHopLimitEnt tunnelIfHopLimit;

                        public final TunnelIfSecurityEnt tunnelIfSecurity;

                        public final TunnelIfTOSEnt tunnelIfTOS;

                        public final TunnelIfFlowLabelEnt tunnelIfFlowLabel;

                        public final TunnelIfAddressTypeEnt tunnelIfAddressType;

                        public final TunnelIfLocalInetAddressEnt tunnelIfLocalInetAddress;

                        public final TunnelIfRemoteInetAddressEnt tunnelIfRemoteInetAddress;

                        public final TunnelIfEncapsLimitEnt tunnelIfEncapsLimit;

                        private TunnelIfEntryEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                        {
                            super(mib, parent, "tunnelIfEntry", "1.3.6.1.2.1.10.131.1.1.1.1", false, false, false, true);
                            this.tunnelIfLocalAddress = new TunnelIfLocalAddressEnt(mib, this);
                            this.tunnelIfRemoteAddress = new TunnelIfRemoteAddressEnt(mib, this);
                            this.tunnelIfEncapsMethod = new TunnelIfEncapsMethodEnt(mib, this);
                            this.tunnelIfHopLimit = new TunnelIfHopLimitEnt(mib, this);
                            this.tunnelIfSecurity = new TunnelIfSecurityEnt(mib, this);
                            this.tunnelIfTOS = new TunnelIfTOSEnt(mib, this);
                            this.tunnelIfFlowLabel = new TunnelIfFlowLabelEnt(mib, this);
                            this.tunnelIfAddressType = new TunnelIfAddressTypeEnt(mib, this);
                            this.tunnelIfLocalInetAddress = new TunnelIfLocalInetAddressEnt(mib, this);
                            this.tunnelIfRemoteInetAddress = new TunnelIfRemoteInetAddressEnt(mib, this);
                            this.tunnelIfEncapsLimit = new TunnelIfEncapsLimitEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tunnelIfLocalAddress,
                                this.tunnelIfRemoteAddress,
                                this.tunnelIfEncapsMethod,
                                this.tunnelIfHopLimit,
                                this.tunnelIfSecurity,
                                this.tunnelIfTOS,
                                this.tunnelIfFlowLabel,
                                this.tunnelIfAddressType,
                                this.tunnelIfLocalInetAddress,
                                this.tunnelIfRemoteInetAddress,
                                this.tunnelIfEncapsLimit
                            };
                        }
                        public static final class TunnelIfLocalAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfLocalAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfLocalAddress", "1.3.6.1.2.1.10.131.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfRemoteAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfRemoteAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfRemoteAddress", "1.3.6.1.2.1.10.131.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfEncapsMethodEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfEncapsMethodEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfEncapsMethod", "1.3.6.1.2.1.10.131.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfHopLimitEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfHopLimitEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfHopLimit", "1.3.6.1.2.1.10.131.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfSecurityEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfSecurityEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfSecurity", "1.3.6.1.2.1.10.131.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfTOSEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfTOSEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfTOS", "1.3.6.1.2.1.10.131.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfFlowLabelEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfFlowLabelEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfFlowLabel", "1.3.6.1.2.1.10.131.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfAddressTypeEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfAddressTypeEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfAddressType", "1.3.6.1.2.1.10.131.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfLocalInetAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfLocalInetAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfLocalInetAddress", "1.3.6.1.2.1.10.131.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfRemoteInetAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfRemoteInetAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfRemoteInetAddress", "1.3.6.1.2.1.10.131.1.1.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelIfEncapsLimitEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelIfEncapsLimitEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelIfEncapsLimit", "1.3.6.1.2.1.10.131.1.1.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TunnelConfigTableEnt extends MIBEntry<TUNNELMIBDef>
                {
                    public final TunnelConfigEntryEnt tunnelConfigEntry;

                    private TunnelConfigTableEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelConfigTable", "1.3.6.1.2.1.10.131.1.1.2", false, true, false, false);
                        this.tunnelConfigEntry = new TunnelConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tunnelConfigEntry
                        };
                    }
                    public static final class TunnelConfigEntryEnt extends MIBEntry<TUNNELMIBDef>
                    {
                        public final TunnelConfigLocalAddressEnt tunnelConfigLocalAddress;

                        public final TunnelConfigRemoteAddressEnt tunnelConfigRemoteAddress;

                        public final TunnelConfigEncapsMethodEnt tunnelConfigEncapsMethod;

                        public final TunnelConfigIDEnt tunnelConfigID;

                        public final TunnelConfigIfIndexEnt tunnelConfigIfIndex;

                        public final TunnelConfigStatusEnt tunnelConfigStatus;

                        private TunnelConfigEntryEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                        {
                            super(mib, parent, "tunnelConfigEntry", "1.3.6.1.2.1.10.131.1.1.2.1", false, false, false, true);
                            this.tunnelConfigLocalAddress = new TunnelConfigLocalAddressEnt(mib, this);
                            this.tunnelConfigRemoteAddress = new TunnelConfigRemoteAddressEnt(mib, this);
                            this.tunnelConfigEncapsMethod = new TunnelConfigEncapsMethodEnt(mib, this);
                            this.tunnelConfigID = new TunnelConfigIDEnt(mib, this);
                            this.tunnelConfigIfIndex = new TunnelConfigIfIndexEnt(mib, this);
                            this.tunnelConfigStatus = new TunnelConfigStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tunnelConfigLocalAddress,
                                this.tunnelConfigRemoteAddress,
                                this.tunnelConfigEncapsMethod,
                                this.tunnelConfigID,
                                this.tunnelConfigIfIndex,
                                this.tunnelConfigStatus
                            };
                        }
                        public static final class TunnelConfigLocalAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelConfigLocalAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelConfigLocalAddress", "1.3.6.1.2.1.10.131.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelConfigRemoteAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelConfigRemoteAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelConfigRemoteAddress", "1.3.6.1.2.1.10.131.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelConfigEncapsMethodEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelConfigEncapsMethodEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelConfigEncapsMethod", "1.3.6.1.2.1.10.131.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelConfigIDEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelConfigIDEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelConfigID", "1.3.6.1.2.1.10.131.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelConfigIfIndexEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelConfigIfIndexEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelConfigIfIndex", "1.3.6.1.2.1.10.131.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelConfigStatusEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelConfigStatusEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelConfigStatus", "1.3.6.1.2.1.10.131.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class TunnelInetConfigTableEnt extends MIBEntry<TUNNELMIBDef>
                {
                    public final TunnelInetConfigEntryEnt tunnelInetConfigEntry;

                    private TunnelInetConfigTableEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelInetConfigTable", "1.3.6.1.2.1.10.131.1.1.3", false, true, false, false);
                        this.tunnelInetConfigEntry = new TunnelInetConfigEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.tunnelInetConfigEntry
                        };
                    }
                    public static final class TunnelInetConfigEntryEnt extends MIBEntry<TUNNELMIBDef>
                    {
                        public final TunnelInetConfigAddressTypeEnt tunnelInetConfigAddressType;

                        public final TunnelInetConfigLocalAddressEnt tunnelInetConfigLocalAddress;

                        public final TunnelInetConfigRemoteAddressEnt tunnelInetConfigRemoteAddress;

                        public final TunnelInetConfigEncapsMethodEnt tunnelInetConfigEncapsMethod;

                        public final TunnelInetConfigIDEnt tunnelInetConfigID;

                        public final TunnelInetConfigIfIndexEnt tunnelInetConfigIfIndex;

                        public final TunnelInetConfigStatusEnt tunnelInetConfigStatus;

                        public final TunnelInetConfigStorageTypeEnt tunnelInetConfigStorageType;

                        private TunnelInetConfigEntryEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                        {
                            super(mib, parent, "tunnelInetConfigEntry", "1.3.6.1.2.1.10.131.1.1.3.1", false, false, false, true);
                            this.tunnelInetConfigAddressType = new TunnelInetConfigAddressTypeEnt(mib, this);
                            this.tunnelInetConfigLocalAddress = new TunnelInetConfigLocalAddressEnt(mib, this);
                            this.tunnelInetConfigRemoteAddress = new TunnelInetConfigRemoteAddressEnt(mib, this);
                            this.tunnelInetConfigEncapsMethod = new TunnelInetConfigEncapsMethodEnt(mib, this);
                            this.tunnelInetConfigID = new TunnelInetConfigIDEnt(mib, this);
                            this.tunnelInetConfigIfIndex = new TunnelInetConfigIfIndexEnt(mib, this);
                            this.tunnelInetConfigStatus = new TunnelInetConfigStatusEnt(mib, this);
                            this.tunnelInetConfigStorageType = new TunnelInetConfigStorageTypeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.tunnelInetConfigAddressType,
                                this.tunnelInetConfigLocalAddress,
                                this.tunnelInetConfigRemoteAddress,
                                this.tunnelInetConfigEncapsMethod,
                                this.tunnelInetConfigID,
                                this.tunnelInetConfigIfIndex,
                                this.tunnelInetConfigStatus,
                                this.tunnelInetConfigStorageType
                            };
                        }
                        public static final class TunnelInetConfigAddressTypeEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigAddressTypeEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigAddressType", "1.3.6.1.2.1.10.131.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigLocalAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigLocalAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigLocalAddress", "1.3.6.1.2.1.10.131.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigRemoteAddressEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigRemoteAddressEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigRemoteAddress", "1.3.6.1.2.1.10.131.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigEncapsMethodEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigEncapsMethodEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigEncapsMethod", "1.3.6.1.2.1.10.131.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigIDEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigIDEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigID", "1.3.6.1.2.1.10.131.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigIfIndexEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigIfIndexEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigIfIndex", "1.3.6.1.2.1.10.131.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigStatusEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigStatusEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigStatus", "1.3.6.1.2.1.10.131.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class TunnelInetConfigStorageTypeEnt extends MIBEntry<TUNNELMIBDef>
                        {
                            private TunnelInetConfigStorageTypeEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                            {
                                super(mib, parent, "tunnelInetConfigStorageType", "1.3.6.1.2.1.10.131.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class TunnelMIBConformanceEnt extends MIBEntry<TUNNELMIBDef>
        {
            public final TunnelMIBCompliancesEnt tunnelMIBCompliances;

            public final TunnelMIBGroupsEnt tunnelMIBGroups;

            private TunnelMIBConformanceEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
            {
                super(mib, parent, "tunnelMIBConformance", "1.3.6.1.2.1.10.131.2", false, false, false, false);
                this.tunnelMIBCompliances = new TunnelMIBCompliancesEnt(mib, this);
                this.tunnelMIBGroups = new TunnelMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.tunnelMIBCompliances,
                    this.tunnelMIBGroups
                };
            }
            public static final class TunnelMIBCompliancesEnt extends MIBEntry<TUNNELMIBDef>
            {
                /** compliance statements*/
                public final TunnelMIBComplianceEnt tunnelMIBCompliance;

                public final TunnelMIBInetFullComplianceEnt tunnelMIBInetFullCompliance;

                public final TunnelMIBInetReadOnlyComplianceEnt tunnelMIBInetReadOnlyCompliance;

                private TunnelMIBCompliancesEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                {
                    super(mib, parent, "tunnelMIBCompliances", "1.3.6.1.2.1.10.131.2.1", false, false, false, false);
                    this.tunnelMIBCompliance = new TunnelMIBComplianceEnt(mib, this);
                    this.tunnelMIBInetFullCompliance = new TunnelMIBInetFullComplianceEnt(mib, this);
                    this.tunnelMIBInetReadOnlyCompliance = new TunnelMIBInetReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tunnelMIBCompliance,
                        this.tunnelMIBInetFullCompliance,
                        this.tunnelMIBInetReadOnlyCompliance
                    };
                }
                public static final class TunnelMIBComplianceEnt extends MIBEntry<TUNNELMIBDef>
                {
                    private TunnelMIBComplianceEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelMIBCompliance", "1.3.6.1.2.1.10.131.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TunnelMIBInetFullComplianceEnt extends MIBEntry<TUNNELMIBDef>
                {
                    private TunnelMIBInetFullComplianceEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelMIBInetFullCompliance", "1.3.6.1.2.1.10.131.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TunnelMIBInetReadOnlyComplianceEnt extends MIBEntry<TUNNELMIBDef>
                {
                    private TunnelMIBInetReadOnlyComplianceEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelMIBInetReadOnlyCompliance", "1.3.6.1.2.1.10.131.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class TunnelMIBGroupsEnt extends MIBEntry<TUNNELMIBDef>
            {
                /** units of conformance*/
                public final TunnelMIBBasicGroupEnt tunnelMIBBasicGroup;

                public final TunnelMIBInetGroupEnt tunnelMIBInetGroup;

                private TunnelMIBGroupsEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                {
                    super(mib, parent, "tunnelMIBGroups", "1.3.6.1.2.1.10.131.2.2", false, false, false, false);
                    this.tunnelMIBBasicGroup = new TunnelMIBBasicGroupEnt(mib, this);
                    this.tunnelMIBInetGroup = new TunnelMIBInetGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.tunnelMIBBasicGroup,
                        this.tunnelMIBInetGroup
                    };
                }
                public static final class TunnelMIBBasicGroupEnt extends MIBEntry<TUNNELMIBDef>
                {
                    private TunnelMIBBasicGroupEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelMIBBasicGroup", "1.3.6.1.2.1.10.131.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class TunnelMIBInetGroupEnt extends MIBEntry<TUNNELMIBDef>
                {
                    private TunnelMIBInetGroupEnt(TUNNELMIBDef mib, MIBEntry<TUNNELMIBDef> parent)
                    {
                        super(mib, parent, "tunnelMIBInetGroup", "1.3.6.1.2.1.10.131.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
