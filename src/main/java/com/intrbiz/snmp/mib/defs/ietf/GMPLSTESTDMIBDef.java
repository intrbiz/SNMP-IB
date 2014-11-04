package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 2578
RFC 2580
RFC 2579
RFC 4001
RFC 3411
RFC3812
RFC 3811*/
public final class GMPLSTESTDMIBDef extends MIB
{
    public static final GMPLSTESTDMIBDef GMPLSTESTDMIB = new GMPLSTESTDMIBDef();

    static { MIBs.getInstance().registerMIB(GMPLSTESTDMIBDef.GMPLSTESTDMIB); }

    /** 27 February 2007 00:00:00 GMT*/
    public final GmplsTeStdMIBEnt gmplsTeStdMIB;

    private GMPLSTESTDMIBDef()
    {
        super("GMPLS-TE-STD-MIB");
        this.gmplsTeStdMIB = new GmplsTeStdMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.gmplsTeStdMIB
        };
    }

    public static final class GmplsTeStdMIBEnt extends MIBEntry<GMPLSTESTDMIBDef>
    {
        public final GmplsTeNotificationsEnt gmplsTeNotifications;

        public final GmplsTeScalarsEnt gmplsTeScalars;

        public final GmplsTeObjectsEnt gmplsTeObjects;

        public final GmplsTeConformanceEnt gmplsTeConformance;

        private GmplsTeStdMIBEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
        {
            super(mib, parent, "gmplsTeStdMIB", "1.3.6.1.2.1.10.166.13", false, false, false, false);
            this.gmplsTeNotifications = new GmplsTeNotificationsEnt(mib, this);
            this.gmplsTeScalars = new GmplsTeScalarsEnt(mib, this);
            this.gmplsTeObjects = new GmplsTeObjectsEnt(mib, this);
            this.gmplsTeConformance = new GmplsTeConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.gmplsTeNotifications,
                this.gmplsTeScalars,
                this.gmplsTeObjects,
                this.gmplsTeConformance
            };
        }
        public static final class GmplsTeNotificationsEnt extends MIBEntry<GMPLSTESTDMIBDef>
        {
            /** Notifications*/
            public final GmplsTunnelDownEnt gmplsTunnelDown;

            private GmplsTeNotificationsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "gmplsTeNotifications", "1.3.6.1.2.1.10.166.13.0", false, false, false, false);
                this.gmplsTunnelDown = new GmplsTunnelDownEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsTunnelDown
                };
            }
            public static final class GmplsTunnelDownEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                private GmplsTunnelDownEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelDown", "1.3.6.1.2.1.10.166.13.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class GmplsTeScalarsEnt extends MIBEntry<GMPLSTESTDMIBDef>
        {
            public final GmplsTunnelsConfiguredEnt gmplsTunnelsConfigured;

            public final GmplsTunnelsActiveEnt gmplsTunnelsActive;

            private GmplsTeScalarsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "gmplsTeScalars", "1.3.6.1.2.1.10.166.13.1", false, false, false, false);
                this.gmplsTunnelsConfigured = new GmplsTunnelsConfiguredEnt(mib, this);
                this.gmplsTunnelsActive = new GmplsTunnelsActiveEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsTunnelsConfigured,
                    this.gmplsTunnelsActive
                };
            }
            public static final class GmplsTunnelsConfiguredEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                private GmplsTunnelsConfiguredEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelsConfigured", "1.3.6.1.2.1.10.166.13.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class GmplsTunnelsActiveEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                private GmplsTunnelsActiveEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelsActive", "1.3.6.1.2.1.10.166.13.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class GmplsTeObjectsEnt extends MIBEntry<GMPLSTESTDMIBDef>
        {
            public final GmplsTunnelTableEnt gmplsTunnelTable;

            public final GmplsTunnelHopTableEnt gmplsTunnelHopTable;

            public final GmplsTunnelARHopTableEnt gmplsTunnelARHopTable;

            public final GmplsTunnelCHopTableEnt gmplsTunnelCHopTable;

            public final GmplsTunnelReversePerfTableEnt gmplsTunnelReversePerfTable;

            public final GmplsTunnelErrorTableEnt gmplsTunnelErrorTable;

            private GmplsTeObjectsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "gmplsTeObjects", "1.3.6.1.2.1.10.166.13.2", false, false, false, false);
                this.gmplsTunnelTable = new GmplsTunnelTableEnt(mib, this);
                this.gmplsTunnelHopTable = new GmplsTunnelHopTableEnt(mib, this);
                this.gmplsTunnelARHopTable = new GmplsTunnelARHopTableEnt(mib, this);
                this.gmplsTunnelCHopTable = new GmplsTunnelCHopTableEnt(mib, this);
                this.gmplsTunnelReversePerfTable = new GmplsTunnelReversePerfTableEnt(mib, this);
                this.gmplsTunnelErrorTable = new GmplsTunnelErrorTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsTunnelTable,
                    this.gmplsTunnelHopTable,
                    this.gmplsTunnelARHopTable,
                    this.gmplsTunnelCHopTable,
                    this.gmplsTunnelReversePerfTable,
                    this.gmplsTunnelErrorTable
                };
            }
            public static final class GmplsTunnelTableEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelEntryEnt gmplsTunnelEntry;

                private GmplsTunnelTableEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelTable", "1.3.6.1.2.1.10.166.13.2.1", false, true, false, false);
                    this.gmplsTunnelEntry = new GmplsTunnelEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelEntry
                    };
                }
                public static final class GmplsTunnelEntryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    public final GmplsTunnelUnnumIfEnt gmplsTunnelUnnumIf;

                    public final GmplsTunnelAttributesEnt gmplsTunnelAttributes;

                    public final GmplsTunnelLSPEncodingEnt gmplsTunnelLSPEncoding;

                    public final GmplsTunnelSwitchingTypeEnt gmplsTunnelSwitchingType;

                    public final GmplsTunnelLinkProtectionEnt gmplsTunnelLinkProtection;

                    public final GmplsTunnelGPidEnt gmplsTunnelGPid;

                    public final GmplsTunnelSecondaryEnt gmplsTunnelSecondary;

                    public final GmplsTunnelDirectionEnt gmplsTunnelDirection;

                    public final GmplsTunnelPathCompEnt gmplsTunnelPathComp;

                    public final GmplsTunnelUpstreamNotifyRecipientTypeEnt gmplsTunnelUpstreamNotifyRecipientType;

                    /** 0.0.0.0*/
                    public final GmplsTunnelUpstreamNotifyRecipientEnt gmplsTunnelUpstreamNotifyRecipient;

                    public final GmplsTunnelSendResvNotifyRecipientTypeEnt gmplsTunnelSendResvNotifyRecipientType;

                    /** 0.0.0.0*/
                    public final GmplsTunnelSendResvNotifyRecipientEnt gmplsTunnelSendResvNotifyRecipient;

                    public final GmplsTunnelDownstreamNotifyRecipientTypeEnt gmplsTunnelDownstreamNotifyRecipientType;

                    /** 0.0.0.0*/
                    public final GmplsTunnelDownstreamNotifyRecipientEnt gmplsTunnelDownstreamNotifyRecipient;

                    public final GmplsTunnelSendPathNotifyRecipientTypeEnt gmplsTunnelSendPathNotifyRecipientType;

                    /** 0.0.0.0*/
                    public final GmplsTunnelSendPathNotifyRecipientEnt gmplsTunnelSendPathNotifyRecipient;

                    public final GmplsTunnelAdminStatusFlagsEnt gmplsTunnelAdminStatusFlags;

                    public final GmplsTunnelExtraParamsPtrEnt gmplsTunnelExtraParamsPtr;

                    private GmplsTunnelEntryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelEntry", "1.3.6.1.2.1.10.166.13.2.1.1", false, false, false, true);
                        this.gmplsTunnelUnnumIf = new GmplsTunnelUnnumIfEnt(mib, this);
                        this.gmplsTunnelAttributes = new GmplsTunnelAttributesEnt(mib, this);
                        this.gmplsTunnelLSPEncoding = new GmplsTunnelLSPEncodingEnt(mib, this);
                        this.gmplsTunnelSwitchingType = new GmplsTunnelSwitchingTypeEnt(mib, this);
                        this.gmplsTunnelLinkProtection = new GmplsTunnelLinkProtectionEnt(mib, this);
                        this.gmplsTunnelGPid = new GmplsTunnelGPidEnt(mib, this);
                        this.gmplsTunnelSecondary = new GmplsTunnelSecondaryEnt(mib, this);
                        this.gmplsTunnelDirection = new GmplsTunnelDirectionEnt(mib, this);
                        this.gmplsTunnelPathComp = new GmplsTunnelPathCompEnt(mib, this);
                        this.gmplsTunnelUpstreamNotifyRecipientType = new GmplsTunnelUpstreamNotifyRecipientTypeEnt(mib, this);
                        this.gmplsTunnelUpstreamNotifyRecipient = new GmplsTunnelUpstreamNotifyRecipientEnt(mib, this);
                        this.gmplsTunnelSendResvNotifyRecipientType = new GmplsTunnelSendResvNotifyRecipientTypeEnt(mib, this);
                        this.gmplsTunnelSendResvNotifyRecipient = new GmplsTunnelSendResvNotifyRecipientEnt(mib, this);
                        this.gmplsTunnelDownstreamNotifyRecipientType = new GmplsTunnelDownstreamNotifyRecipientTypeEnt(mib, this);
                        this.gmplsTunnelDownstreamNotifyRecipient = new GmplsTunnelDownstreamNotifyRecipientEnt(mib, this);
                        this.gmplsTunnelSendPathNotifyRecipientType = new GmplsTunnelSendPathNotifyRecipientTypeEnt(mib, this);
                        this.gmplsTunnelSendPathNotifyRecipient = new GmplsTunnelSendPathNotifyRecipientEnt(mib, this);
                        this.gmplsTunnelAdminStatusFlags = new GmplsTunnelAdminStatusFlagsEnt(mib, this);
                        this.gmplsTunnelExtraParamsPtr = new GmplsTunnelExtraParamsPtrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsTunnelUnnumIf,
                            this.gmplsTunnelAttributes,
                            this.gmplsTunnelLSPEncoding,
                            this.gmplsTunnelSwitchingType,
                            this.gmplsTunnelLinkProtection,
                            this.gmplsTunnelGPid,
                            this.gmplsTunnelSecondary,
                            this.gmplsTunnelDirection,
                            this.gmplsTunnelPathComp,
                            this.gmplsTunnelUpstreamNotifyRecipientType,
                            this.gmplsTunnelUpstreamNotifyRecipient,
                            this.gmplsTunnelSendResvNotifyRecipientType,
                            this.gmplsTunnelSendResvNotifyRecipient,
                            this.gmplsTunnelDownstreamNotifyRecipientType,
                            this.gmplsTunnelDownstreamNotifyRecipient,
                            this.gmplsTunnelSendPathNotifyRecipientType,
                            this.gmplsTunnelSendPathNotifyRecipient,
                            this.gmplsTunnelAdminStatusFlags,
                            this.gmplsTunnelExtraParamsPtr
                        };
                    }
                    public static final class GmplsTunnelUnnumIfEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelUnnumIfEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelUnnumIf", "1.3.6.1.2.1.10.166.13.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelAttributesEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelAttributesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelAttributes", "1.3.6.1.2.1.10.166.13.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelLSPEncodingEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelLSPEncodingEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelLSPEncoding", "1.3.6.1.2.1.10.166.13.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelSwitchingTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelSwitchingTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelSwitchingType", "1.3.6.1.2.1.10.166.13.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelLinkProtectionEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelLinkProtectionEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelLinkProtection", "1.3.6.1.2.1.10.166.13.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelGPidEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelGPidEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelGPid", "1.3.6.1.2.1.10.166.13.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelSecondaryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelSecondaryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelSecondary", "1.3.6.1.2.1.10.166.13.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelDirectionEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelDirectionEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelDirection", "1.3.6.1.2.1.10.166.13.2.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelPathCompEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelPathCompEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelPathComp", "1.3.6.1.2.1.10.166.13.2.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelUpstreamNotifyRecipientTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelUpstreamNotifyRecipientTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelUpstreamNotifyRecipientType", "1.3.6.1.2.1.10.166.13.2.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelUpstreamNotifyRecipientEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelUpstreamNotifyRecipientEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelUpstreamNotifyRecipient", "1.3.6.1.2.1.10.166.13.2.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelSendResvNotifyRecipientTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelSendResvNotifyRecipientTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelSendResvNotifyRecipientType", "1.3.6.1.2.1.10.166.13.2.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelSendResvNotifyRecipientEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelSendResvNotifyRecipientEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelSendResvNotifyRecipient", "1.3.6.1.2.1.10.166.13.2.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelDownstreamNotifyRecipientTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelDownstreamNotifyRecipientTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelDownstreamNotifyRecipientType", "1.3.6.1.2.1.10.166.13.2.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelDownstreamNotifyRecipientEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelDownstreamNotifyRecipientEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelDownstreamNotifyRecipient", "1.3.6.1.2.1.10.166.13.2.1.1.15", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelSendPathNotifyRecipientTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelSendPathNotifyRecipientTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelSendPathNotifyRecipientType", "1.3.6.1.2.1.10.166.13.2.1.1.16", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelSendPathNotifyRecipientEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelSendPathNotifyRecipientEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelSendPathNotifyRecipient", "1.3.6.1.2.1.10.166.13.2.1.1.17", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelAdminStatusFlagsEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelAdminStatusFlagsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelAdminStatusFlags", "1.3.6.1.2.1.10.166.13.2.1.1.18", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelExtraParamsPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelExtraParamsPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelExtraParamsPtr", "1.3.6.1.2.1.10.166.13.2.1.1.19", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsTunnelHopTableEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelHopEntryEnt gmplsTunnelHopEntry;

                private GmplsTunnelHopTableEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelHopTable", "1.3.6.1.2.1.10.166.13.2.2", false, true, false, false);
                    this.gmplsTunnelHopEntry = new GmplsTunnelHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelHopEntry
                    };
                }
                public static final class GmplsTunnelHopEntryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    public final GmplsTunnelHopLabelStatusesEnt gmplsTunnelHopLabelStatuses;

                    public final GmplsTunnelHopExplicitForwardLabelEnt gmplsTunnelHopExplicitForwardLabel;

                    public final GmplsTunnelHopExplicitForwardLabelPtrEnt gmplsTunnelHopExplicitForwardLabelPtr;

                    public final GmplsTunnelHopExplicitReverseLabelEnt gmplsTunnelHopExplicitReverseLabel;

                    public final GmplsTunnelHopExplicitReverseLabelPtrEnt gmplsTunnelHopExplicitReverseLabelPtr;

                    private GmplsTunnelHopEntryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelHopEntry", "1.3.6.1.2.1.10.166.13.2.2.1", false, false, false, true);
                        this.gmplsTunnelHopLabelStatuses = new GmplsTunnelHopLabelStatusesEnt(mib, this);
                        this.gmplsTunnelHopExplicitForwardLabel = new GmplsTunnelHopExplicitForwardLabelEnt(mib, this);
                        this.gmplsTunnelHopExplicitForwardLabelPtr = new GmplsTunnelHopExplicitForwardLabelPtrEnt(mib, this);
                        this.gmplsTunnelHopExplicitReverseLabel = new GmplsTunnelHopExplicitReverseLabelEnt(mib, this);
                        this.gmplsTunnelHopExplicitReverseLabelPtr = new GmplsTunnelHopExplicitReverseLabelPtrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsTunnelHopLabelStatuses,
                            this.gmplsTunnelHopExplicitForwardLabel,
                            this.gmplsTunnelHopExplicitForwardLabelPtr,
                            this.gmplsTunnelHopExplicitReverseLabel,
                            this.gmplsTunnelHopExplicitReverseLabelPtr
                        };
                    }
                    public static final class GmplsTunnelHopLabelStatusesEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelHopLabelStatusesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelHopLabelStatuses", "1.3.6.1.2.1.10.166.13.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelHopExplicitForwardLabelEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelHopExplicitForwardLabelEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelHopExplicitForwardLabel", "1.3.6.1.2.1.10.166.13.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelHopExplicitForwardLabelPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelHopExplicitForwardLabelPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelHopExplicitForwardLabelPtr", "1.3.6.1.2.1.10.166.13.2.2.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelHopExplicitReverseLabelEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelHopExplicitReverseLabelEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelHopExplicitReverseLabel", "1.3.6.1.2.1.10.166.13.2.2.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelHopExplicitReverseLabelPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelHopExplicitReverseLabelPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelHopExplicitReverseLabelPtr", "1.3.6.1.2.1.10.166.13.2.2.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsTunnelARHopTableEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelARHopEntryEnt gmplsTunnelARHopEntry;

                private GmplsTunnelARHopTableEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelARHopTable", "1.3.6.1.2.1.10.166.13.2.3", false, true, false, false);
                    this.gmplsTunnelARHopEntry = new GmplsTunnelARHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelARHopEntry
                    };
                }
                public static final class GmplsTunnelARHopEntryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    public final GmplsTunnelARHopLabelStatusesEnt gmplsTunnelARHopLabelStatuses;

                    public final GmplsTunnelARHopExplicitForwardLabelEnt gmplsTunnelARHopExplicitForwardLabel;

                    public final GmplsTunnelARHopExplicitForwardLabelPtrEnt gmplsTunnelARHopExplicitForwardLabelPtr;

                    public final GmplsTunnelARHopExplicitReverseLabelEnt gmplsTunnelARHopExplicitReverseLabel;

                    public final GmplsTunnelARHopExplicitReverseLabelPtrEnt gmplsTunnelARHopExplicitReverseLabelPtr;

                    public final GmplsTunnelARHopProtectionEnt gmplsTunnelARHopProtection;

                    private GmplsTunnelARHopEntryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelARHopEntry", "1.3.6.1.2.1.10.166.13.2.3.1", false, false, false, true);
                        this.gmplsTunnelARHopLabelStatuses = new GmplsTunnelARHopLabelStatusesEnt(mib, this);
                        this.gmplsTunnelARHopExplicitForwardLabel = new GmplsTunnelARHopExplicitForwardLabelEnt(mib, this);
                        this.gmplsTunnelARHopExplicitForwardLabelPtr = new GmplsTunnelARHopExplicitForwardLabelPtrEnt(mib, this);
                        this.gmplsTunnelARHopExplicitReverseLabel = new GmplsTunnelARHopExplicitReverseLabelEnt(mib, this);
                        this.gmplsTunnelARHopExplicitReverseLabelPtr = new GmplsTunnelARHopExplicitReverseLabelPtrEnt(mib, this);
                        this.gmplsTunnelARHopProtection = new GmplsTunnelARHopProtectionEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsTunnelARHopLabelStatuses,
                            this.gmplsTunnelARHopExplicitForwardLabel,
                            this.gmplsTunnelARHopExplicitForwardLabelPtr,
                            this.gmplsTunnelARHopExplicitReverseLabel,
                            this.gmplsTunnelARHopExplicitReverseLabelPtr,
                            this.gmplsTunnelARHopProtection
                        };
                    }
                    public static final class GmplsTunnelARHopLabelStatusesEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelARHopLabelStatusesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelARHopLabelStatuses", "1.3.6.1.2.1.10.166.13.2.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelARHopExplicitForwardLabelEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelARHopExplicitForwardLabelEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelARHopExplicitForwardLabel", "1.3.6.1.2.1.10.166.13.2.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelARHopExplicitForwardLabelPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelARHopExplicitForwardLabelPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelARHopExplicitForwardLabelPtr", "1.3.6.1.2.1.10.166.13.2.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelARHopExplicitReverseLabelEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelARHopExplicitReverseLabelEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelARHopExplicitReverseLabel", "1.3.6.1.2.1.10.166.13.2.3.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelARHopExplicitReverseLabelPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelARHopExplicitReverseLabelPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelARHopExplicitReverseLabelPtr", "1.3.6.1.2.1.10.166.13.2.3.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelARHopProtectionEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelARHopProtectionEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelARHopProtection", "1.3.6.1.2.1.10.166.13.2.3.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsTunnelCHopTableEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelCHopEntryEnt gmplsTunnelCHopEntry;

                private GmplsTunnelCHopTableEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelCHopTable", "1.3.6.1.2.1.10.166.13.2.4", false, true, false, false);
                    this.gmplsTunnelCHopEntry = new GmplsTunnelCHopEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelCHopEntry
                    };
                }
                public static final class GmplsTunnelCHopEntryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    public final GmplsTunnelCHopLabelStatusesEnt gmplsTunnelCHopLabelStatuses;

                    public final GmplsTunnelCHopExplicitForwardLabelEnt gmplsTunnelCHopExplicitForwardLabel;

                    public final GmplsTunnelCHopExplicitForwardLabelPtrEnt gmplsTunnelCHopExplicitForwardLabelPtr;

                    public final GmplsTunnelCHopExplicitReverseLabelEnt gmplsTunnelCHopExplicitReverseLabel;

                    public final GmplsTunnelCHopExplicitReverseLabelPtrEnt gmplsTunnelCHopExplicitReverseLabelPtr;

                    private GmplsTunnelCHopEntryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelCHopEntry", "1.3.6.1.2.1.10.166.13.2.4.1", false, false, false, true);
                        this.gmplsTunnelCHopLabelStatuses = new GmplsTunnelCHopLabelStatusesEnt(mib, this);
                        this.gmplsTunnelCHopExplicitForwardLabel = new GmplsTunnelCHopExplicitForwardLabelEnt(mib, this);
                        this.gmplsTunnelCHopExplicitForwardLabelPtr = new GmplsTunnelCHopExplicitForwardLabelPtrEnt(mib, this);
                        this.gmplsTunnelCHopExplicitReverseLabel = new GmplsTunnelCHopExplicitReverseLabelEnt(mib, this);
                        this.gmplsTunnelCHopExplicitReverseLabelPtr = new GmplsTunnelCHopExplicitReverseLabelPtrEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsTunnelCHopLabelStatuses,
                            this.gmplsTunnelCHopExplicitForwardLabel,
                            this.gmplsTunnelCHopExplicitForwardLabelPtr,
                            this.gmplsTunnelCHopExplicitReverseLabel,
                            this.gmplsTunnelCHopExplicitReverseLabelPtr
                        };
                    }
                    public static final class GmplsTunnelCHopLabelStatusesEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelCHopLabelStatusesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelCHopLabelStatuses", "1.3.6.1.2.1.10.166.13.2.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelCHopExplicitForwardLabelEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelCHopExplicitForwardLabelEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelCHopExplicitForwardLabel", "1.3.6.1.2.1.10.166.13.2.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelCHopExplicitForwardLabelPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelCHopExplicitForwardLabelPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelCHopExplicitForwardLabelPtr", "1.3.6.1.2.1.10.166.13.2.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelCHopExplicitReverseLabelEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelCHopExplicitReverseLabelEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelCHopExplicitReverseLabel", "1.3.6.1.2.1.10.166.13.2.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelCHopExplicitReverseLabelPtrEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelCHopExplicitReverseLabelPtrEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelCHopExplicitReverseLabelPtr", "1.3.6.1.2.1.10.166.13.2.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsTunnelReversePerfTableEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelReversePerfEntryEnt gmplsTunnelReversePerfEntry;

                private GmplsTunnelReversePerfTableEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelReversePerfTable", "1.3.6.1.2.1.10.166.13.2.5", false, true, false, false);
                    this.gmplsTunnelReversePerfEntry = new GmplsTunnelReversePerfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelReversePerfEntry
                    };
                }
                public static final class GmplsTunnelReversePerfEntryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    public final GmplsTunnelReversePerfPacketsEnt gmplsTunnelReversePerfPackets;

                    public final GmplsTunnelReversePerfHCPacketsEnt gmplsTunnelReversePerfHCPackets;

                    public final GmplsTunnelReversePerfErrorsEnt gmplsTunnelReversePerfErrors;

                    public final GmplsTunnelReversePerfBytesEnt gmplsTunnelReversePerfBytes;

                    public final GmplsTunnelReversePerfHCBytesEnt gmplsTunnelReversePerfHCBytes;

                    private GmplsTunnelReversePerfEntryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelReversePerfEntry", "1.3.6.1.2.1.10.166.13.2.5.1", false, false, false, true);
                        this.gmplsTunnelReversePerfPackets = new GmplsTunnelReversePerfPacketsEnt(mib, this);
                        this.gmplsTunnelReversePerfHCPackets = new GmplsTunnelReversePerfHCPacketsEnt(mib, this);
                        this.gmplsTunnelReversePerfErrors = new GmplsTunnelReversePerfErrorsEnt(mib, this);
                        this.gmplsTunnelReversePerfBytes = new GmplsTunnelReversePerfBytesEnt(mib, this);
                        this.gmplsTunnelReversePerfHCBytes = new GmplsTunnelReversePerfHCBytesEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsTunnelReversePerfPackets,
                            this.gmplsTunnelReversePerfHCPackets,
                            this.gmplsTunnelReversePerfErrors,
                            this.gmplsTunnelReversePerfBytes,
                            this.gmplsTunnelReversePerfHCBytes
                        };
                    }
                    public static final class GmplsTunnelReversePerfPacketsEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelReversePerfPacketsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelReversePerfPackets", "1.3.6.1.2.1.10.166.13.2.5.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelReversePerfHCPacketsEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelReversePerfHCPacketsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelReversePerfHCPackets", "1.3.6.1.2.1.10.166.13.2.5.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelReversePerfErrorsEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelReversePerfErrorsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelReversePerfErrors", "1.3.6.1.2.1.10.166.13.2.5.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelReversePerfBytesEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelReversePerfBytesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelReversePerfBytes", "1.3.6.1.2.1.10.166.13.2.5.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelReversePerfHCBytesEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelReversePerfHCBytesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelReversePerfHCBytes", "1.3.6.1.2.1.10.166.13.2.5.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class GmplsTunnelErrorTableEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelErrorEntryEnt gmplsTunnelErrorEntry;

                private GmplsTunnelErrorTableEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTunnelErrorTable", "1.3.6.1.2.1.10.166.13.2.6", false, true, false, false);
                    this.gmplsTunnelErrorEntry = new GmplsTunnelErrorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelErrorEntry
                    };
                }
                public static final class GmplsTunnelErrorEntryEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    public final GmplsTunnelErrorLastErrorTypeEnt gmplsTunnelErrorLastErrorType;

                    public final GmplsTunnelErrorLastTimeEnt gmplsTunnelErrorLastTime;

                    public final GmplsTunnelErrorReporterTypeEnt gmplsTunnelErrorReporterType;

                    public final GmplsTunnelErrorReporterEnt gmplsTunnelErrorReporter;

                    public final GmplsTunnelErrorCodeEnt gmplsTunnelErrorCode;

                    public final GmplsTunnelErrorSubcodeEnt gmplsTunnelErrorSubcode;

                    public final GmplsTunnelErrorTLVsEnt gmplsTunnelErrorTLVs;

                    public final GmplsTunnelErrorHelpStringEnt gmplsTunnelErrorHelpString;

                    private GmplsTunnelErrorEntryEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelErrorEntry", "1.3.6.1.2.1.10.166.13.2.6.1", false, false, false, true);
                        this.gmplsTunnelErrorLastErrorType = new GmplsTunnelErrorLastErrorTypeEnt(mib, this);
                        this.gmplsTunnelErrorLastTime = new GmplsTunnelErrorLastTimeEnt(mib, this);
                        this.gmplsTunnelErrorReporterType = new GmplsTunnelErrorReporterTypeEnt(mib, this);
                        this.gmplsTunnelErrorReporter = new GmplsTunnelErrorReporterEnt(mib, this);
                        this.gmplsTunnelErrorCode = new GmplsTunnelErrorCodeEnt(mib, this);
                        this.gmplsTunnelErrorSubcode = new GmplsTunnelErrorSubcodeEnt(mib, this);
                        this.gmplsTunnelErrorTLVs = new GmplsTunnelErrorTLVsEnt(mib, this);
                        this.gmplsTunnelErrorHelpString = new GmplsTunnelErrorHelpStringEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.gmplsTunnelErrorLastErrorType,
                            this.gmplsTunnelErrorLastTime,
                            this.gmplsTunnelErrorReporterType,
                            this.gmplsTunnelErrorReporter,
                            this.gmplsTunnelErrorCode,
                            this.gmplsTunnelErrorSubcode,
                            this.gmplsTunnelErrorTLVs,
                            this.gmplsTunnelErrorHelpString
                        };
                    }
                    public static final class GmplsTunnelErrorLastErrorTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorLastErrorTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorLastErrorType", "1.3.6.1.2.1.10.166.13.2.6.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorLastTimeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorLastTimeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorLastTime", "1.3.6.1.2.1.10.166.13.2.6.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorReporterTypeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorReporterTypeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorReporterType", "1.3.6.1.2.1.10.166.13.2.6.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorReporterEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorReporterEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorReporter", "1.3.6.1.2.1.10.166.13.2.6.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorCodeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorCodeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorCode", "1.3.6.1.2.1.10.166.13.2.6.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorSubcodeEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorSubcodeEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorSubcode", "1.3.6.1.2.1.10.166.13.2.6.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorTLVsEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorTLVsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorTLVs", "1.3.6.1.2.1.10.166.13.2.6.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class GmplsTunnelErrorHelpStringEnt extends MIBEntry<GMPLSTESTDMIBDef>
                    {
                        private GmplsTunnelErrorHelpStringEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                        {
                            super(mib, parent, "gmplsTunnelErrorHelpString", "1.3.6.1.2.1.10.166.13.2.6.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class GmplsTeConformanceEnt extends MIBEntry<GMPLSTESTDMIBDef>
        {
            public final GmplsTeGroupsEnt gmplsTeGroups;

            public final GmplsTeCompliancesEnt gmplsTeCompliances;

            private GmplsTeConformanceEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
            {
                super(mib, parent, "gmplsTeConformance", "1.3.6.1.2.1.10.166.13.3", false, false, false, false);
                this.gmplsTeGroups = new GmplsTeGroupsEnt(mib, this);
                this.gmplsTeCompliances = new GmplsTeCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.gmplsTeGroups,
                    this.gmplsTeCompliances
                };
            }
            public static final class GmplsTeGroupsEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                public final GmplsTunnelGroupEnt gmplsTunnelGroup;

                public final GmplsTunnelSignaledGroupEnt gmplsTunnelSignaledGroup;

                public final GmplsTunnelScalarGroupEnt gmplsTunnelScalarGroup;

                public final GmplsTunnelOptionalGroupEnt gmplsTunnelOptionalGroup;

                public final GmplsTeNotificationGroupEnt gmplsTeNotificationGroup;

                private GmplsTeGroupsEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTeGroups", "1.3.6.1.2.1.10.166.13.3.1", false, false, false, false);
                    this.gmplsTunnelGroup = new GmplsTunnelGroupEnt(mib, this);
                    this.gmplsTunnelSignaledGroup = new GmplsTunnelSignaledGroupEnt(mib, this);
                    this.gmplsTunnelScalarGroup = new GmplsTunnelScalarGroupEnt(mib, this);
                    this.gmplsTunnelOptionalGroup = new GmplsTunnelOptionalGroupEnt(mib, this);
                    this.gmplsTeNotificationGroup = new GmplsTeNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTunnelGroup,
                        this.gmplsTunnelSignaledGroup,
                        this.gmplsTunnelScalarGroup,
                        this.gmplsTunnelOptionalGroup,
                        this.gmplsTeNotificationGroup
                    };
                }
                public static final class GmplsTunnelGroupEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTunnelGroupEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelGroup", "1.3.6.1.2.1.10.166.13.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsTunnelSignaledGroupEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTunnelSignaledGroupEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelSignaledGroup", "1.3.6.1.2.1.10.166.13.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsTunnelScalarGroupEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTunnelScalarGroupEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelScalarGroup", "1.3.6.1.2.1.10.166.13.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsTunnelOptionalGroupEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTunnelOptionalGroupEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTunnelOptionalGroup", "1.3.6.1.2.1.10.166.13.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsTeNotificationGroupEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTeNotificationGroupEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTeNotificationGroup", "1.3.6.1.2.1.10.166.13.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class GmplsTeCompliancesEnt extends MIBEntry<GMPLSTESTDMIBDef>
            {
                /** Compliance requirement for fully compliant implementations.

The MPLS-TE-STD-MIB, RFC 3812*/
                public final GmplsTeModuleFullComplianceEnt gmplsTeModuleFullCompliance;

                /** Compliance requirement for read-only compliant implementations.*/
                public final GmplsTeModuleReadOnlyComplianceEnt gmplsTeModuleReadOnlyCompliance;

                private GmplsTeCompliancesEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                {
                    super(mib, parent, "gmplsTeCompliances", "1.3.6.1.2.1.10.166.13.3.2", false, false, false, false);
                    this.gmplsTeModuleFullCompliance = new GmplsTeModuleFullComplianceEnt(mib, this);
                    this.gmplsTeModuleReadOnlyCompliance = new GmplsTeModuleReadOnlyComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.gmplsTeModuleFullCompliance,
                        this.gmplsTeModuleReadOnlyCompliance
                    };
                }
                public static final class GmplsTeModuleFullComplianceEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTeModuleFullComplianceEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTeModuleFullCompliance", "1.3.6.1.2.1.10.166.13.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class GmplsTeModuleReadOnlyComplianceEnt extends MIBEntry<GMPLSTESTDMIBDef>
                {
                    private GmplsTeModuleReadOnlyComplianceEnt(GMPLSTESTDMIBDef mib, MIBEntry<GMPLSTESTDMIBDef> parent)
                    {
                        super(mib, parent, "gmplsTeModuleReadOnlyCompliance", "1.3.6.1.2.1.10.166.13.3.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
