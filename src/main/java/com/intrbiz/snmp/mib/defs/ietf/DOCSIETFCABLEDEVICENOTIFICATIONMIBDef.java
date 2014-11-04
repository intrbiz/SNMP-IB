package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 2578
RFC 2580
RFC 2669
RFC 4546*/
public final class DOCSIETFCABLEDEVICENOTIFICATIONMIBDef extends MIB
{
    public static final DOCSIETFCABLEDEVICENOTIFICATIONMIBDef DOCSIETFCABLEDEVICENOTIFICATIONMIB = new DOCSIETFCABLEDEVICENOTIFICATIONMIBDef();

    static { MIBs.getInstance().registerMIB(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef.DOCSIETFCABLEDEVICENOTIFICATIONMIB); }

    /** RFC 2863

May 24, 2006*/
    public final DocsDevNotifMIBEnt docsDevNotifMIB;

    public final DocsDevCmNotifsEnt docsDevCmNotifs;

    public final DocsDevCmtsNotifsEnt docsDevCmtsNotifs;

    private DOCSIETFCABLEDEVICENOTIFICATIONMIBDef()
    {
        super("DOCS-IETF-CABLE-DEVICE-NOTIFICATION-MIB");
        this.docsDevNotifMIB = new DocsDevNotifMIBEnt(this, null);
        this.docsDevCmNotifs = new DocsDevCmNotifsEnt(this, null);
        this.docsDevCmtsNotifs = new DocsDevCmtsNotifsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.docsDevNotifMIB,
            this.docsDevCmNotifs,
            this.docsDevCmtsNotifs
        };
    }

    public static final class DocsDevNotifMIBEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
    {
        public final DocsDevNotifControlEnt docsDevNotifControl;

        /** Conformance definitions*/
        public final DocsDevNotifConformanceEnt docsDevNotifConformance;

        private DocsDevNotifMIBEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
        {
            super(mib, parent, "docsDevNotifMIB", "1.3.6.1.2.1.132", false, false, false, false);
            this.docsDevNotifControl = new DocsDevNotifControlEnt(mib, this);
            this.docsDevNotifConformance = new DocsDevNotifConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsDevNotifControl,
                this.docsDevNotifConformance
            };
        }
        public static final class DocsDevNotifControlEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            public final DocsDevCmNotifControlEnt docsDevCmNotifControl;

            public final DocsDevCmtsNotifControlEnt docsDevCmtsNotifControl;

            private DocsDevNotifControlEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevNotifControl", "1.3.6.1.2.1.132.1", false, false, false, false);
                this.docsDevCmNotifControl = new DocsDevCmNotifControlEnt(mib, this);
                this.docsDevCmtsNotifControl = new DocsDevCmtsNotifControlEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsDevCmNotifControl,
                    this.docsDevCmtsNotifControl
                };
            }
            public static final class DocsDevCmNotifControlEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
            {
                private DocsDevCmNotifControlEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "docsDevCmNotifControl", "1.3.6.1.2.1.132.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class DocsDevCmtsNotifControlEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
            {
                private DocsDevCmtsNotifControlEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "docsDevCmtsNotifControl", "1.3.6.1.2.1.132.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class DocsDevNotifConformanceEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            public final DocsDevNotifGroupsEnt docsDevNotifGroups;

            public final DocsDevNotifCompliancesEnt docsDevNotifCompliances;

            private DocsDevNotifConformanceEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevNotifConformance", "1.3.6.1.2.1.132.4", false, false, false, false);
                this.docsDevNotifGroups = new DocsDevNotifGroupsEnt(mib, this);
                this.docsDevNotifCompliances = new DocsDevNotifCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.docsDevNotifGroups,
                    this.docsDevNotifCompliances
                };
            }
            public static final class DocsDevNotifGroupsEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
            {
                public final DocsDevCmNotifControlGroupEnt docsDevCmNotifControlGroup;

                public final DocsDevCmNotificationGroupEnt docsDevCmNotificationGroup;

                public final DocsDevCmtsNotifControlGroupEnt docsDevCmtsNotifControlGroup;

                public final DocsDevCmtsNotificationGroupEnt docsDevCmtsNotificationGroup;

                private DocsDevNotifGroupsEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "docsDevNotifGroups", "1.3.6.1.2.1.132.4.1", false, false, false, false);
                    this.docsDevCmNotifControlGroup = new DocsDevCmNotifControlGroupEnt(mib, this);
                    this.docsDevCmNotificationGroup = new DocsDevCmNotificationGroupEnt(mib, this);
                    this.docsDevCmtsNotifControlGroup = new DocsDevCmtsNotifControlGroupEnt(mib, this);
                    this.docsDevCmtsNotificationGroup = new DocsDevCmtsNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevCmNotifControlGroup,
                        this.docsDevCmNotificationGroup,
                        this.docsDevCmtsNotifControlGroup,
                        this.docsDevCmtsNotificationGroup
                    };
                }
                public static final class DocsDevCmNotifControlGroupEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
                {
                    private DocsDevCmNotifControlGroupEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmNotifControlGroup", "1.3.6.1.2.1.132.4.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCmNotificationGroupEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
                {
                    private DocsDevCmNotificationGroupEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmNotificationGroup", "1.3.6.1.2.1.132.4.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCmtsNotifControlGroupEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
                {
                    private DocsDevCmtsNotifControlGroupEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmtsNotifControlGroup", "1.3.6.1.2.1.132.4.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCmtsNotificationGroupEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
                {
                    private DocsDevCmtsNotificationGroupEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmtsNotificationGroup", "1.3.6.1.2.1.132.4.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class DocsDevNotifCompliancesEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
            {
                public final DocsDevCmNotifComplianceEnt docsDevCmNotifCompliance;

                public final DocsDevCmtsNotifComplianceEnt docsDevCmtsNotifCompliance;

                private DocsDevNotifCompliancesEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                {
                    super(mib, parent, "docsDevNotifCompliances", "1.3.6.1.2.1.132.4.2", false, false, false, false);
                    this.docsDevCmNotifCompliance = new DocsDevCmNotifComplianceEnt(mib, this);
                    this.docsDevCmtsNotifCompliance = new DocsDevCmtsNotifComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.docsDevCmNotifCompliance,
                        this.docsDevCmtsNotifCompliance
                    };
                }
                public static final class DocsDevCmNotifComplianceEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
                {
                    private DocsDevCmNotifComplianceEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmNotifCompliance", "1.3.6.1.2.1.132.4.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class DocsDevCmtsNotifComplianceEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
                {
                    private DocsDevCmtsNotifComplianceEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
                    {
                        super(mib, parent, "docsDevCmtsNotifCompliance", "1.3.6.1.2.1.132.4.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class DocsDevCmNotifsEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
    {
        public final DocsDevCmInitTLVUnknownNotifEnt docsDevCmInitTLVUnknownNotif;

        public final DocsDevCmDynServReqFailNotifEnt docsDevCmDynServReqFailNotif;

        public final DocsDevCmDynServRspFailNotifEnt docsDevCmDynServRspFailNotif;

        public final DocsDevCmDynServAckFailNotifEnt docsDevCmDynServAckFailNotif;

        public final DocsDevCmBpiInitNotifEnt docsDevCmBpiInitNotif;

        public final DocsDevCmBPKMNotifEnt docsDevCmBPKMNotif;

        public final DocsDevCmDynamicSANotifEnt docsDevCmDynamicSANotif;

        public final DocsDevCmDHCPFailNotifEnt docsDevCmDHCPFailNotif;

        public final DocsDevCmSwUpgradeInitNotifEnt docsDevCmSwUpgradeInitNotif;

        public final DocsDevCmSwUpgradeFailNotifEnt docsDevCmSwUpgradeFailNotif;

        public final DocsDevCmSwUpgradeSuccessNotifEnt docsDevCmSwUpgradeSuccessNotif;

        public final DocsDevCmSwUpgradeCVCFailNotifEnt docsDevCmSwUpgradeCVCFailNotif;

        public final DocsDevCmTODFailNotifEnt docsDevCmTODFailNotif;

        public final DocsDevCmDCCReqFailNotifEnt docsDevCmDCCReqFailNotif;

        public final DocsDevCmDCCRspFailNotifEnt docsDevCmDCCRspFailNotif;

        public final DocsDevCmDCCAckFailNotifEnt docsDevCmDCCAckFailNotif;

        private DocsDevCmNotifsEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
        {
            super(mib, parent, "docsDevCmNotifs", "1.3.6.1.2.1.132.2.0", false, false, false, false);
            this.docsDevCmInitTLVUnknownNotif = new DocsDevCmInitTLVUnknownNotifEnt(mib, this);
            this.docsDevCmDynServReqFailNotif = new DocsDevCmDynServReqFailNotifEnt(mib, this);
            this.docsDevCmDynServRspFailNotif = new DocsDevCmDynServRspFailNotifEnt(mib, this);
            this.docsDevCmDynServAckFailNotif = new DocsDevCmDynServAckFailNotifEnt(mib, this);
            this.docsDevCmBpiInitNotif = new DocsDevCmBpiInitNotifEnt(mib, this);
            this.docsDevCmBPKMNotif = new DocsDevCmBPKMNotifEnt(mib, this);
            this.docsDevCmDynamicSANotif = new DocsDevCmDynamicSANotifEnt(mib, this);
            this.docsDevCmDHCPFailNotif = new DocsDevCmDHCPFailNotifEnt(mib, this);
            this.docsDevCmSwUpgradeInitNotif = new DocsDevCmSwUpgradeInitNotifEnt(mib, this);
            this.docsDevCmSwUpgradeFailNotif = new DocsDevCmSwUpgradeFailNotifEnt(mib, this);
            this.docsDevCmSwUpgradeSuccessNotif = new DocsDevCmSwUpgradeSuccessNotifEnt(mib, this);
            this.docsDevCmSwUpgradeCVCFailNotif = new DocsDevCmSwUpgradeCVCFailNotifEnt(mib, this);
            this.docsDevCmTODFailNotif = new DocsDevCmTODFailNotifEnt(mib, this);
            this.docsDevCmDCCReqFailNotif = new DocsDevCmDCCReqFailNotifEnt(mib, this);
            this.docsDevCmDCCRspFailNotif = new DocsDevCmDCCRspFailNotifEnt(mib, this);
            this.docsDevCmDCCAckFailNotif = new DocsDevCmDCCAckFailNotifEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsDevCmInitTLVUnknownNotif,
                this.docsDevCmDynServReqFailNotif,
                this.docsDevCmDynServRspFailNotif,
                this.docsDevCmDynServAckFailNotif,
                this.docsDevCmBpiInitNotif,
                this.docsDevCmBPKMNotif,
                this.docsDevCmDynamicSANotif,
                this.docsDevCmDHCPFailNotif,
                this.docsDevCmSwUpgradeInitNotif,
                this.docsDevCmSwUpgradeFailNotif,
                this.docsDevCmSwUpgradeSuccessNotif,
                this.docsDevCmSwUpgradeCVCFailNotif,
                this.docsDevCmTODFailNotif,
                this.docsDevCmDCCReqFailNotif,
                this.docsDevCmDCCRspFailNotif,
                this.docsDevCmDCCAckFailNotif
            };
        }
        public static final class DocsDevCmInitTLVUnknownNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmInitTLVUnknownNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmInitTLVUnknownNotif", "1.3.6.1.2.1.132.2.0.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDynServReqFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDynServReqFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDynServReqFailNotif", "1.3.6.1.2.1.132.2.0.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDynServRspFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDynServRspFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDynServRspFailNotif", "1.3.6.1.2.1.132.2.0.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDynServAckFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDynServAckFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDynServAckFailNotif", "1.3.6.1.2.1.132.2.0.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmBpiInitNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmBpiInitNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmBpiInitNotif", "1.3.6.1.2.1.132.2.0.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmBPKMNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmBPKMNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmBPKMNotif", "1.3.6.1.2.1.132.2.0.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDynamicSANotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDynamicSANotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDynamicSANotif", "1.3.6.1.2.1.132.2.0.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDHCPFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDHCPFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDHCPFailNotif", "1.3.6.1.2.1.132.2.0.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmSwUpgradeInitNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmSwUpgradeInitNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmSwUpgradeInitNotif", "1.3.6.1.2.1.132.2.0.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmSwUpgradeFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmSwUpgradeFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmSwUpgradeFailNotif", "1.3.6.1.2.1.132.2.0.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmSwUpgradeSuccessNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmSwUpgradeSuccessNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmSwUpgradeSuccessNotif", "1.3.6.1.2.1.132.2.0.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmSwUpgradeCVCFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmSwUpgradeCVCFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmSwUpgradeCVCFailNotif", "1.3.6.1.2.1.132.2.0.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmTODFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmTODFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmTODFailNotif", "1.3.6.1.2.1.132.2.0.13", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDCCReqFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDCCReqFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDCCReqFailNotif", "1.3.6.1.2.1.132.2.0.14", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDCCRspFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDCCRspFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDCCRspFailNotif", "1.3.6.1.2.1.132.2.0.15", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmDCCAckFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmDCCAckFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmDCCAckFailNotif", "1.3.6.1.2.1.132.2.0.16", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class DocsDevCmtsNotifsEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
    {
        public final DocsDevCmtsInitRegReqFailNotifEnt docsDevCmtsInitRegReqFailNotif;

        public final DocsDevCmtsInitRegRspFailNotifEnt docsDevCmtsInitRegRspFailNotif;

        public final DocsDevCmtsInitRegAckFailNotifEnt docsDevCmtsInitRegAckFailNotif;

        public final DocsDevCmtsDynServReqFailNotifEnt docsDevCmtsDynServReqFailNotif;

        public final DocsDevCmtsDynServRspFailNotifEnt docsDevCmtsDynServRspFailNotif;

        public final DocsDevCmtsDynServAckFailNotifEnt docsDevCmtsDynServAckFailNotif;

        public final DocsDevCmtsBpiInitNotifEnt docsDevCmtsBpiInitNotif;

        public final DocsDevCmtsBPKMNotifEnt docsDevCmtsBPKMNotif;

        public final DocsDevCmtsDynamicSANotifEnt docsDevCmtsDynamicSANotif;

        public final DocsDevCmtsDCCReqFailNotifEnt docsDevCmtsDCCReqFailNotif;

        public final DocsDevCmtsDCCRspFailNotifEnt docsDevCmtsDCCRspFailNotif;

        public final DocsDevCmtsDCCAckFailNotifEnt docsDevCmtsDCCAckFailNotif;

        private DocsDevCmtsNotifsEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
        {
            super(mib, parent, "docsDevCmtsNotifs", "1.3.6.1.2.1.132.3.0", false, false, false, false);
            this.docsDevCmtsInitRegReqFailNotif = new DocsDevCmtsInitRegReqFailNotifEnt(mib, this);
            this.docsDevCmtsInitRegRspFailNotif = new DocsDevCmtsInitRegRspFailNotifEnt(mib, this);
            this.docsDevCmtsInitRegAckFailNotif = new DocsDevCmtsInitRegAckFailNotifEnt(mib, this);
            this.docsDevCmtsDynServReqFailNotif = new DocsDevCmtsDynServReqFailNotifEnt(mib, this);
            this.docsDevCmtsDynServRspFailNotif = new DocsDevCmtsDynServRspFailNotifEnt(mib, this);
            this.docsDevCmtsDynServAckFailNotif = new DocsDevCmtsDynServAckFailNotifEnt(mib, this);
            this.docsDevCmtsBpiInitNotif = new DocsDevCmtsBpiInitNotifEnt(mib, this);
            this.docsDevCmtsBPKMNotif = new DocsDevCmtsBPKMNotifEnt(mib, this);
            this.docsDevCmtsDynamicSANotif = new DocsDevCmtsDynamicSANotifEnt(mib, this);
            this.docsDevCmtsDCCReqFailNotif = new DocsDevCmtsDCCReqFailNotifEnt(mib, this);
            this.docsDevCmtsDCCRspFailNotif = new DocsDevCmtsDCCRspFailNotifEnt(mib, this);
            this.docsDevCmtsDCCAckFailNotif = new DocsDevCmtsDCCAckFailNotifEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.docsDevCmtsInitRegReqFailNotif,
                this.docsDevCmtsInitRegRspFailNotif,
                this.docsDevCmtsInitRegAckFailNotif,
                this.docsDevCmtsDynServReqFailNotif,
                this.docsDevCmtsDynServRspFailNotif,
                this.docsDevCmtsDynServAckFailNotif,
                this.docsDevCmtsBpiInitNotif,
                this.docsDevCmtsBPKMNotif,
                this.docsDevCmtsDynamicSANotif,
                this.docsDevCmtsDCCReqFailNotif,
                this.docsDevCmtsDCCRspFailNotif,
                this.docsDevCmtsDCCAckFailNotif
            };
        }
        public static final class DocsDevCmtsInitRegReqFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsInitRegReqFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsInitRegReqFailNotif", "1.3.6.1.2.1.132.3.0.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsInitRegRspFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsInitRegRspFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsInitRegRspFailNotif", "1.3.6.1.2.1.132.3.0.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsInitRegAckFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsInitRegAckFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsInitRegAckFailNotif", "1.3.6.1.2.1.132.3.0.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDynServReqFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDynServReqFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDynServReqFailNotif", "1.3.6.1.2.1.132.3.0.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDynServRspFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDynServRspFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDynServRspFailNotif", "1.3.6.1.2.1.132.3.0.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDynServAckFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDynServAckFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDynServAckFailNotif", "1.3.6.1.2.1.132.3.0.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsBpiInitNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsBpiInitNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsBpiInitNotif", "1.3.6.1.2.1.132.3.0.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsBPKMNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsBPKMNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsBPKMNotif", "1.3.6.1.2.1.132.3.0.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDynamicSANotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDynamicSANotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDynamicSANotif", "1.3.6.1.2.1.132.3.0.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDCCReqFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDCCReqFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDCCReqFailNotif", "1.3.6.1.2.1.132.3.0.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDCCRspFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDCCRspFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDCCRspFailNotif", "1.3.6.1.2.1.132.3.0.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class DocsDevCmtsDCCAckFailNotifEnt extends MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef>
        {
            private DocsDevCmtsDCCAckFailNotifEnt(DOCSIETFCABLEDEVICENOTIFICATIONMIBDef mib, MIBEntry<DOCSIETFCABLEDEVICENOTIFICATIONMIBDef> parent)
            {
                super(mib, parent, "docsDevCmtsDCCAckFailNotif", "1.3.6.1.2.1.132.3.0.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
