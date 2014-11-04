package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

/**RFC 2578
RFC 2579
RFC 2580
RFC 2863
http://www.iana.org/assignments/ianamau-mib*/
public final class MAUMIBDef extends MIB
{
    public static final MAUMIBDef MAUMIB = new MAUMIBDef();

    static { MIBs.getInstance().registerMIB(MAUMIBDef.MAUMIB); }

    public final SnmpDot3MauMgtEnt snmpDot3MauMgt;

    private MAUMIBDef()
    {
        super("MAU-MIB");
        this.snmpDot3MauMgt = new SnmpDot3MauMgtEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpDot3MauMgt
        };
    }

    public static final class SnmpDot3MauMgtEnt extends MIBEntry<MAUMIBDef>
    {
        /** April 21, 2007*/
        public final MauModEnt mauMod;

        public final Dot3RpMauBasicGroupEnt dot3RpMauBasicGroup;

        public final Dot3IfMauBasicGroupEnt dot3IfMauBasicGroup;

        public final Dot3BroadMauBasicGroupEnt dot3BroadMauBasicGroup;

        /** OIDs under the following branch are reserved forthe IANA-MAU-MIB to assign as MAU type values:{ snmpDot3MauMgt 4 }*/
        public final Dot3IfMauAutoNegGroupEnt dot3IfMauAutoNegGroup;

        /** Notifications for use by 802.3 MAUs*/
        public final SnmpDot3MauTrapsEnt snmpDot3MauTraps;

        private SnmpDot3MauMgtEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
        {
            super(mib, parent, "snmpDot3MauMgt", "1.3.6.1.2.1.26", false, false, false, false);
            this.mauMod = new MauModEnt(mib, this);
            this.dot3RpMauBasicGroup = new Dot3RpMauBasicGroupEnt(mib, this);
            this.dot3IfMauBasicGroup = new Dot3IfMauBasicGroupEnt(mib, this);
            this.dot3BroadMauBasicGroup = new Dot3BroadMauBasicGroupEnt(mib, this);
            this.dot3IfMauAutoNegGroup = new Dot3IfMauAutoNegGroupEnt(mib, this);
            this.snmpDot3MauTraps = new SnmpDot3MauTrapsEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mauMod,
                this.dot3RpMauBasicGroup,
                this.dot3IfMauBasicGroup,
                this.dot3BroadMauBasicGroup,
                this.dot3IfMauAutoNegGroup,
                this.snmpDot3MauTraps
            };
        }
        public static final class MauModEnt extends MIBEntry<MAUMIBDef>
        {
            /** Conformance information*/
            public final MauModConfEnt mauModConf;

            private MauModEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
            {
                super(mib, parent, "mauMod", "1.3.6.1.2.1.26.6", false, false, false, false);
                this.mauModConf = new MauModConfEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mauModConf
                };
            }
            public static final class MauModConfEnt extends MIBEntry<MAUMIBDef>
            {
                public final MauModComplsEnt mauModCompls;

                public final MauModObjGrpsEnt mauModObjGrps;

                public final MauModNotGrpsEnt mauModNotGrps;

                private MauModConfEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "mauModConf", "1.3.6.1.2.1.26.6.1", false, false, false, false);
                    this.mauModCompls = new MauModComplsEnt(mib, this);
                    this.mauModObjGrps = new MauModObjGrpsEnt(mib, this);
                    this.mauModNotGrps = new MauModNotGrpsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mauModCompls,
                        this.mauModObjGrps,
                        this.mauModNotGrps
                    };
                }
                public static final class MauModComplsEnt extends MIBEntry<MAUMIBDef>
                {
                    /** Compliances*/
                    public final MauModRpComplEnt mauModRpCompl;

                    public final MauModIfComplEnt mauModIfCompl;

                    public final MauModIfCompl2Ent mauModIfCompl2;

                    public final MauModRpCompl2Ent mauModRpCompl2;

                    public final MauModIfCompl3Ent mauModIfCompl3;

                    private MauModComplsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "mauModCompls", "1.3.6.1.2.1.26.6.1.1", false, false, false, false);
                        this.mauModRpCompl = new MauModRpComplEnt(mib, this);
                        this.mauModIfCompl = new MauModIfComplEnt(mib, this);
                        this.mauModIfCompl2 = new MauModIfCompl2Ent(mib, this);
                        this.mauModRpCompl2 = new MauModRpCompl2Ent(mib, this);
                        this.mauModIfCompl3 = new MauModIfCompl3Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mauModRpCompl,
                            this.mauModIfCompl,
                            this.mauModIfCompl2,
                            this.mauModRpCompl2,
                            this.mauModIfCompl3
                        };
                    }
                    public static final class MauModRpComplEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauModRpComplEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauModRpCompl", "1.3.6.1.2.1.26.6.1.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauModIfComplEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauModIfComplEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauModIfCompl", "1.3.6.1.2.1.26.6.1.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauModIfCompl2Ent extends MIBEntry<MAUMIBDef>
                    {
                        private MauModIfCompl2Ent(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauModIfCompl2", "1.3.6.1.2.1.26.6.1.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauModRpCompl2Ent extends MIBEntry<MAUMIBDef>
                    {
                        private MauModRpCompl2Ent(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauModRpCompl2", "1.3.6.1.2.1.26.6.1.1.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauModIfCompl3Ent extends MIBEntry<MAUMIBDef>
                    {
                        private MauModIfCompl3Ent(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauModIfCompl3", "1.3.6.1.2.1.26.6.1.1.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MauModObjGrpsEnt extends MIBEntry<MAUMIBDef>
                {
                    /** Object groups*/
                    public final MauRpGrpBasicEnt mauRpGrpBasic;

                    public final MauRpGrp100MbsEnt mauRpGrp100Mbs;

                    public final MauRpGrpJackEnt mauRpGrpJack;

                    public final MauIfGrpBasicEnt mauIfGrpBasic;

                    public final MauIfGrp100MbsEnt mauIfGrp100Mbs;

                    public final MauIfGrpJackEnt mauIfGrpJack;

                    public final MauIfGrpAutoNegEnt mauIfGrpAutoNeg;

                    public final MauBroadBasicEnt mauBroadBasic;

                    public final MauIfGrpHighCapacityEnt mauIfGrpHighCapacity;

                    public final MauIfGrpAutoNeg2Ent mauIfGrpAutoNeg2;

                    public final MauIfGrpAutoNeg1000MbpsEnt mauIfGrpAutoNeg1000Mbps;

                    public final MauIfGrpHCStatsEnt mauIfGrpHCStats;

                    private MauModObjGrpsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "mauModObjGrps", "1.3.6.1.2.1.26.6.1.2", false, false, false, false);
                        this.mauRpGrpBasic = new MauRpGrpBasicEnt(mib, this);
                        this.mauRpGrp100Mbs = new MauRpGrp100MbsEnt(mib, this);
                        this.mauRpGrpJack = new MauRpGrpJackEnt(mib, this);
                        this.mauIfGrpBasic = new MauIfGrpBasicEnt(mib, this);
                        this.mauIfGrp100Mbs = new MauIfGrp100MbsEnt(mib, this);
                        this.mauIfGrpJack = new MauIfGrpJackEnt(mib, this);
                        this.mauIfGrpAutoNeg = new MauIfGrpAutoNegEnt(mib, this);
                        this.mauBroadBasic = new MauBroadBasicEnt(mib, this);
                        this.mauIfGrpHighCapacity = new MauIfGrpHighCapacityEnt(mib, this);
                        this.mauIfGrpAutoNeg2 = new MauIfGrpAutoNeg2Ent(mib, this);
                        this.mauIfGrpAutoNeg1000Mbps = new MauIfGrpAutoNeg1000MbpsEnt(mib, this);
                        this.mauIfGrpHCStats = new MauIfGrpHCStatsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.mauRpGrpBasic,
                            this.mauRpGrp100Mbs,
                            this.mauRpGrpJack,
                            this.mauIfGrpBasic,
                            this.mauIfGrp100Mbs,
                            this.mauIfGrpJack,
                            this.mauIfGrpAutoNeg,
                            this.mauBroadBasic,
                            this.mauIfGrpHighCapacity,
                            this.mauIfGrpAutoNeg2,
                            this.mauIfGrpAutoNeg1000Mbps,
                            this.mauIfGrpHCStats
                        };
                    }
                    public static final class MauRpGrpBasicEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauRpGrpBasicEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauRpGrpBasic", "1.3.6.1.2.1.26.6.1.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauRpGrp100MbsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauRpGrp100MbsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauRpGrp100Mbs", "1.3.6.1.2.1.26.6.1.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauRpGrpJackEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauRpGrpJackEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauRpGrpJack", "1.3.6.1.2.1.26.6.1.2.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpBasicEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpBasicEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpBasic", "1.3.6.1.2.1.26.6.1.2.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrp100MbsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrp100MbsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrp100Mbs", "1.3.6.1.2.1.26.6.1.2.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpJackEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpJackEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpJack", "1.3.6.1.2.1.26.6.1.2.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpAutoNegEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpAutoNegEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpAutoNeg", "1.3.6.1.2.1.26.6.1.2.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauBroadBasicEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauBroadBasicEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauBroadBasic", "1.3.6.1.2.1.26.6.1.2.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpHighCapacityEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpHighCapacityEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpHighCapacity", "1.3.6.1.2.1.26.6.1.2.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpAutoNeg2Ent extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpAutoNeg2Ent(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpAutoNeg2", "1.3.6.1.2.1.26.6.1.2.10", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpAutoNeg1000MbpsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpAutoNeg1000MbpsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpAutoNeg1000Mbps", "1.3.6.1.2.1.26.6.1.2.11", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class MauIfGrpHCStatsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private MauIfGrpHCStatsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "mauIfGrpHCStats", "1.3.6.1.2.1.26.6.1.2.12", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class MauModNotGrpsEnt extends MIBEntry<MAUMIBDef>
                {
                    /** Notification groups*/
                    public final RpMauNotificationsEnt rpMauNotifications;

                    public final IfMauNotificationsEnt ifMauNotifications;

                    private MauModNotGrpsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "mauModNotGrps", "1.3.6.1.2.1.26.6.1.3", false, false, false, false);
                        this.rpMauNotifications = new RpMauNotificationsEnt(mib, this);
                        this.ifMauNotifications = new IfMauNotificationsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rpMauNotifications,
                            this.ifMauNotifications
                        };
                    }
                    public static final class RpMauNotificationsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauNotificationsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauNotifications", "1.3.6.1.2.1.26.6.1.3.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauNotificationsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauNotificationsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauNotifications", "1.3.6.1.2.1.26.6.1.3.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot3RpMauBasicGroupEnt extends MIBEntry<MAUMIBDef>
        {
            /** the following OID is the MODULE-IDENTITY valuefor this MIB module:   { snmpDot3MauMgt 6 }
The Basic Repeater MAU Table*/
            public final RpMauTableEnt rpMauTable;

            /** The rpJackTable applies to MAUs attached to repeaterswhich have one or more external jacks (connectors).*/
            public final RpJackTableEnt rpJackTable;

            private Dot3RpMauBasicGroupEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
            {
                super(mib, parent, "dot3RpMauBasicGroup", "1.3.6.1.2.1.26.1", false, false, false, false);
                this.rpMauTable = new RpMauTableEnt(mib, this);
                this.rpJackTable = new RpJackTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rpMauTable,
                    this.rpJackTable
                };
            }
            public static final class RpMauTableEnt extends MIBEntry<MAUMIBDef>
            {
                public final RpMauEntryEnt rpMauEntry;

                private RpMauTableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "rpMauTable", "1.3.6.1.2.1.26.1.1", false, true, false, false);
                    this.rpMauEntry = new RpMauEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rpMauEntry
                    };
                }
                public static final class RpMauEntryEnt extends MIBEntry<MAUMIBDef>
                {
                    /** read-only since originally an
SMIv1 index*/
                    public final RpMauGroupIndexEnt rpMauGroupIndex;

                    /** read-only since originally an
SMIv1 index*/
                    public final RpMauPortIndexEnt rpMauPortIndex;

                    /** read-only since originally an
SMIv1 index*/
                    public final RpMauIndexEnt rpMauIndex;

                    public final RpMauTypeEnt rpMauType;

                    public final RpMauStatusEnt rpMauStatus;

                    public final RpMauMediaAvailableEnt rpMauMediaAvailable;

                    public final RpMauMediaAvailableStateExitsEnt rpMauMediaAvailableStateExits;

                    public final RpMauJabberStateEnt rpMauJabberState;

                    public final RpMauJabberingStateEntersEnt rpMauJabberingStateEnters;

                    public final RpMauFalseCarriersEnt rpMauFalseCarriers;

                    private RpMauEntryEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "rpMauEntry", "1.3.6.1.2.1.26.1.1.1", false, false, false, true);
                        this.rpMauGroupIndex = new RpMauGroupIndexEnt(mib, this);
                        this.rpMauPortIndex = new RpMauPortIndexEnt(mib, this);
                        this.rpMauIndex = new RpMauIndexEnt(mib, this);
                        this.rpMauType = new RpMauTypeEnt(mib, this);
                        this.rpMauStatus = new RpMauStatusEnt(mib, this);
                        this.rpMauMediaAvailable = new RpMauMediaAvailableEnt(mib, this);
                        this.rpMauMediaAvailableStateExits = new RpMauMediaAvailableStateExitsEnt(mib, this);
                        this.rpMauJabberState = new RpMauJabberStateEnt(mib, this);
                        this.rpMauJabberingStateEnters = new RpMauJabberingStateEntersEnt(mib, this);
                        this.rpMauFalseCarriers = new RpMauFalseCarriersEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rpMauGroupIndex,
                            this.rpMauPortIndex,
                            this.rpMauIndex,
                            this.rpMauType,
                            this.rpMauStatus,
                            this.rpMauMediaAvailable,
                            this.rpMauMediaAvailableStateExits,
                            this.rpMauJabberState,
                            this.rpMauJabberingStateEnters,
                            this.rpMauFalseCarriers
                        };
                    }
                    public static final class RpMauGroupIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauGroupIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauGroupIndex", "1.3.6.1.2.1.26.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauPortIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauPortIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauPortIndex", "1.3.6.1.2.1.26.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauIndex", "1.3.6.1.2.1.26.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauTypeEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauTypeEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauType", "1.3.6.1.2.1.26.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauStatusEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauStatusEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauStatus", "1.3.6.1.2.1.26.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauMediaAvailableEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauMediaAvailableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauMediaAvailable", "1.3.6.1.2.1.26.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauMediaAvailableStateExitsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauMediaAvailableStateExitsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauMediaAvailableStateExits", "1.3.6.1.2.1.26.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauJabberStateEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauJabberStateEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauJabberState", "1.3.6.1.2.1.26.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauJabberingStateEntersEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauJabberingStateEntersEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauJabberingStateEnters", "1.3.6.1.2.1.26.1.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpMauFalseCarriersEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpMauFalseCarriersEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpMauFalseCarriers", "1.3.6.1.2.1.26.1.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class RpJackTableEnt extends MIBEntry<MAUMIBDef>
            {
                public final RpJackEntryEnt rpJackEntry;

                private RpJackTableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "rpJackTable", "1.3.6.1.2.1.26.1.2", false, true, false, false);
                    this.rpJackEntry = new RpJackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rpJackEntry
                    };
                }
                public static final class RpJackEntryEnt extends MIBEntry<MAUMIBDef>
                {
                    public final RpJackIndexEnt rpJackIndex;

                    public final RpJackTypeEnt rpJackType;

                    private RpJackEntryEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "rpJackEntry", "1.3.6.1.2.1.26.1.2.1", false, false, false, true);
                        this.rpJackIndex = new RpJackIndexEnt(mib, this);
                        this.rpJackType = new RpJackTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rpJackIndex,
                            this.rpJackType
                        };
                    }
                    public static final class RpJackIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpJackIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpJackIndex", "1.3.6.1.2.1.26.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class RpJackTypeEnt extends MIBEntry<MAUMIBDef>
                    {
                        private RpJackTypeEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "rpJackType", "1.3.6.1.2.1.26.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot3IfMauBasicGroupEnt extends MIBEntry<MAUMIBDef>
        {
            /** The Basic Interface MAU Table*/
            public final IfMauTableEnt ifMauTable;

            /** The ifJackTable applies to MAUs attached to interfaceswhich have one or more external jacks (connectors).*/
            public final IfJackTableEnt ifJackTable;

            private Dot3IfMauBasicGroupEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
            {
                super(mib, parent, "dot3IfMauBasicGroup", "1.3.6.1.2.1.26.2", false, false, false, false);
                this.ifMauTable = new IfMauTableEnt(mib, this);
                this.ifJackTable = new IfJackTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifMauTable,
                    this.ifJackTable
                };
            }
            public static final class IfMauTableEnt extends MIBEntry<MAUMIBDef>
            {
                public final IfMauEntryEnt ifMauEntry;

                private IfMauTableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "ifMauTable", "1.3.6.1.2.1.26.2.1", false, true, false, false);
                    this.ifMauEntry = new IfMauEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifMauEntry
                    };
                }
                public static final class IfMauEntryEnt extends MIBEntry<MAUMIBDef>
                {
                    /** read-only since originally an
SMIv1 index*/
                    public final IfMauIfIndexEnt ifMauIfIndex;

                    /** read-only since originally an
SMIv1 index*/
                    public final IfMauIndexEnt ifMauIndex;

                    public final IfMauTypeEnt ifMauType;

                    public final IfMauStatusEnt ifMauStatus;

                    public final IfMauMediaAvailableEnt ifMauMediaAvailable;

                    public final IfMauMediaAvailableStateExitsEnt ifMauMediaAvailableStateExits;

                    public final IfMauJabberStateEnt ifMauJabberState;

                    public final IfMauJabberingStateEntersEnt ifMauJabberingStateEnters;

                    public final IfMauFalseCarriersEnt ifMauFalseCarriers;

                    public final IfMauTypeListEnt ifMauTypeList;

                    public final IfMauDefaultTypeEnt ifMauDefaultType;

                    public final IfMauAutoNegSupportedEnt ifMauAutoNegSupported;

                    public final IfMauTypeListBitsEnt ifMauTypeListBits;

                    public final IfMauHCFalseCarriersEnt ifMauHCFalseCarriers;

                    private IfMauEntryEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "ifMauEntry", "1.3.6.1.2.1.26.2.1.1", false, false, false, true);
                        this.ifMauIfIndex = new IfMauIfIndexEnt(mib, this);
                        this.ifMauIndex = new IfMauIndexEnt(mib, this);
                        this.ifMauType = new IfMauTypeEnt(mib, this);
                        this.ifMauStatus = new IfMauStatusEnt(mib, this);
                        this.ifMauMediaAvailable = new IfMauMediaAvailableEnt(mib, this);
                        this.ifMauMediaAvailableStateExits = new IfMauMediaAvailableStateExitsEnt(mib, this);
                        this.ifMauJabberState = new IfMauJabberStateEnt(mib, this);
                        this.ifMauJabberingStateEnters = new IfMauJabberingStateEntersEnt(mib, this);
                        this.ifMauFalseCarriers = new IfMauFalseCarriersEnt(mib, this);
                        this.ifMauTypeList = new IfMauTypeListEnt(mib, this);
                        this.ifMauDefaultType = new IfMauDefaultTypeEnt(mib, this);
                        this.ifMauAutoNegSupported = new IfMauAutoNegSupportedEnt(mib, this);
                        this.ifMauTypeListBits = new IfMauTypeListBitsEnt(mib, this);
                        this.ifMauHCFalseCarriers = new IfMauHCFalseCarriersEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifMauIfIndex,
                            this.ifMauIndex,
                            this.ifMauType,
                            this.ifMauStatus,
                            this.ifMauMediaAvailable,
                            this.ifMauMediaAvailableStateExits,
                            this.ifMauJabberState,
                            this.ifMauJabberingStateEnters,
                            this.ifMauFalseCarriers,
                            this.ifMauTypeList,
                            this.ifMauDefaultType,
                            this.ifMauAutoNegSupported,
                            this.ifMauTypeListBits,
                            this.ifMauHCFalseCarriers
                        };
                    }
                    public static final class IfMauIfIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauIfIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauIfIndex", "1.3.6.1.2.1.26.2.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauIndex", "1.3.6.1.2.1.26.2.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauTypeEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauTypeEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauType", "1.3.6.1.2.1.26.2.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauStatusEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauStatusEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauStatus", "1.3.6.1.2.1.26.2.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauMediaAvailableEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauMediaAvailableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauMediaAvailable", "1.3.6.1.2.1.26.2.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauMediaAvailableStateExitsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauMediaAvailableStateExitsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauMediaAvailableStateExits", "1.3.6.1.2.1.26.2.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauJabberStateEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauJabberStateEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauJabberState", "1.3.6.1.2.1.26.2.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauJabberingStateEntersEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauJabberingStateEntersEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauJabberingStateEnters", "1.3.6.1.2.1.26.2.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauFalseCarriersEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauFalseCarriersEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauFalseCarriers", "1.3.6.1.2.1.26.2.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauTypeListEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauTypeListEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauTypeList", "1.3.6.1.2.1.26.2.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauDefaultTypeEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauDefaultTypeEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauDefaultType", "1.3.6.1.2.1.26.2.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegSupportedEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegSupportedEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegSupported", "1.3.6.1.2.1.26.2.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauTypeListBitsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauTypeListBitsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauTypeListBits", "1.3.6.1.2.1.26.2.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauHCFalseCarriersEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauHCFalseCarriersEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauHCFalseCarriers", "1.3.6.1.2.1.26.2.1.1.14", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class IfJackTableEnt extends MIBEntry<MAUMIBDef>
            {
                public final IfJackEntryEnt ifJackEntry;

                private IfJackTableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "ifJackTable", "1.3.6.1.2.1.26.2.2", false, true, false, false);
                    this.ifJackEntry = new IfJackEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifJackEntry
                    };
                }
                public static final class IfJackEntryEnt extends MIBEntry<MAUMIBDef>
                {
                    public final IfJackIndexEnt ifJackIndex;

                    public final IfJackTypeEnt ifJackType;

                    private IfJackEntryEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "ifJackEntry", "1.3.6.1.2.1.26.2.2.1", false, false, false, true);
                        this.ifJackIndex = new IfJackIndexEnt(mib, this);
                        this.ifJackType = new IfJackTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifJackIndex,
                            this.ifJackType
                        };
                    }
                    public static final class IfJackIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfJackIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifJackIndex", "1.3.6.1.2.1.26.2.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfJackTypeEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfJackTypeEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifJackType", "1.3.6.1.2.1.26.2.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot3BroadMauBasicGroupEnt extends MIBEntry<MAUMIBDef>
        {
            /** The Basic Broadband MAU Table*/
            public final BroadMauBasicTableEnt broadMauBasicTable;

            private Dot3BroadMauBasicGroupEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
            {
                super(mib, parent, "dot3BroadMauBasicGroup", "1.3.6.1.2.1.26.3", false, false, false, false);
                this.broadMauBasicTable = new BroadMauBasicTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.broadMauBasicTable
                };
            }
            public static final class BroadMauBasicTableEnt extends MIBEntry<MAUMIBDef>
            {
                public final BroadMauBasicEntryEnt broadMauBasicEntry;

                private BroadMauBasicTableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "broadMauBasicTable", "1.3.6.1.2.1.26.3.1", false, true, false, false);
                    this.broadMauBasicEntry = new BroadMauBasicEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.broadMauBasicEntry
                    };
                }
                public static final class BroadMauBasicEntryEnt extends MIBEntry<MAUMIBDef>
                {
                    /** read-only since originally an
SMIv1 index*/
                    public final BroadMauIfIndexEnt broadMauIfIndex;

                    /** read-only since originally an
SMIv1 index*/
                    public final BroadMauIndexEnt broadMauIndex;

                    public final BroadMauXmtRcvSplitTypeEnt broadMauXmtRcvSplitType;

                    public final BroadMauXmtCarrierFreqEnt broadMauXmtCarrierFreq;

                    public final BroadMauTranslationFreqEnt broadMauTranslationFreq;

                    private BroadMauBasicEntryEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "broadMauBasicEntry", "1.3.6.1.2.1.26.3.1.1", false, false, false, true);
                        this.broadMauIfIndex = new BroadMauIfIndexEnt(mib, this);
                        this.broadMauIndex = new BroadMauIndexEnt(mib, this);
                        this.broadMauXmtRcvSplitType = new BroadMauXmtRcvSplitTypeEnt(mib, this);
                        this.broadMauXmtCarrierFreq = new BroadMauXmtCarrierFreqEnt(mib, this);
                        this.broadMauTranslationFreq = new BroadMauTranslationFreqEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.broadMauIfIndex,
                            this.broadMauIndex,
                            this.broadMauXmtRcvSplitType,
                            this.broadMauXmtCarrierFreq,
                            this.broadMauTranslationFreq
                        };
                    }
                    public static final class BroadMauIfIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private BroadMauIfIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "broadMauIfIndex", "1.3.6.1.2.1.26.3.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BroadMauIndexEnt extends MIBEntry<MAUMIBDef>
                    {
                        private BroadMauIndexEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "broadMauIndex", "1.3.6.1.2.1.26.3.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BroadMauXmtRcvSplitTypeEnt extends MIBEntry<MAUMIBDef>
                    {
                        private BroadMauXmtRcvSplitTypeEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "broadMauXmtRcvSplitType", "1.3.6.1.2.1.26.3.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BroadMauXmtCarrierFreqEnt extends MIBEntry<MAUMIBDef>
                    {
                        private BroadMauXmtCarrierFreqEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "broadMauXmtCarrierFreq", "1.3.6.1.2.1.26.3.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class BroadMauTranslationFreqEnt extends MIBEntry<MAUMIBDef>
                    {
                        private BroadMauTranslationFreqEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "broadMauTranslationFreq", "1.3.6.1.2.1.26.3.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot3IfMauAutoNegGroupEnt extends MIBEntry<MAUMIBDef>
        {
            /** The MAU Auto-Negotiation Table*/
            public final IfMauAutoNegTableEnt ifMauAutoNegTable;

            private Dot3IfMauAutoNegGroupEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
            {
                super(mib, parent, "dot3IfMauAutoNegGroup", "1.3.6.1.2.1.26.5", false, false, false, false);
                this.ifMauAutoNegTable = new IfMauAutoNegTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ifMauAutoNegTable
                };
            }
            public static final class IfMauAutoNegTableEnt extends MIBEntry<MAUMIBDef>
            {
                public final IfMauAutoNegEntryEnt ifMauAutoNegEntry;

                private IfMauAutoNegTableEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "ifMauAutoNegTable", "1.3.6.1.2.1.26.5.1", false, true, false, false);
                    this.ifMauAutoNegEntry = new IfMauAutoNegEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ifMauAutoNegEntry
                    };
                }
                public static final class IfMauAutoNegEntryEnt extends MIBEntry<MAUMIBDef>
                {
                    public final IfMauAutoNegAdminStatusEnt ifMauAutoNegAdminStatus;

                    public final IfMauAutoNegRemoteSignalingEnt ifMauAutoNegRemoteSignaling;

                    public final IfMauAutoNegConfigEnt ifMauAutoNegConfig;

                    public final IfMauAutoNegCapabilityEnt ifMauAutoNegCapability;

                    public final IfMauAutoNegCapAdvertisedEnt ifMauAutoNegCapAdvertised;

                    public final IfMauAutoNegCapReceivedEnt ifMauAutoNegCapReceived;

                    public final IfMauAutoNegRestartEnt ifMauAutoNegRestart;

                    public final IfMauAutoNegCapabilityBitsEnt ifMauAutoNegCapabilityBits;

                    public final IfMauAutoNegCapAdvertisedBitsEnt ifMauAutoNegCapAdvertisedBits;

                    public final IfMauAutoNegCapReceivedBitsEnt ifMauAutoNegCapReceivedBits;

                    public final IfMauAutoNegRemoteFaultAdvertisedEnt ifMauAutoNegRemoteFaultAdvertised;

                    public final IfMauAutoNegRemoteFaultReceivedEnt ifMauAutoNegRemoteFaultReceived;

                    private IfMauAutoNegEntryEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                    {
                        super(mib, parent, "ifMauAutoNegEntry", "1.3.6.1.2.1.26.5.1.1", false, false, false, true);
                        this.ifMauAutoNegAdminStatus = new IfMauAutoNegAdminStatusEnt(mib, this);
                        this.ifMauAutoNegRemoteSignaling = new IfMauAutoNegRemoteSignalingEnt(mib, this);
                        this.ifMauAutoNegConfig = new IfMauAutoNegConfigEnt(mib, this);
                        this.ifMauAutoNegCapability = new IfMauAutoNegCapabilityEnt(mib, this);
                        this.ifMauAutoNegCapAdvertised = new IfMauAutoNegCapAdvertisedEnt(mib, this);
                        this.ifMauAutoNegCapReceived = new IfMauAutoNegCapReceivedEnt(mib, this);
                        this.ifMauAutoNegRestart = new IfMauAutoNegRestartEnt(mib, this);
                        this.ifMauAutoNegCapabilityBits = new IfMauAutoNegCapabilityBitsEnt(mib, this);
                        this.ifMauAutoNegCapAdvertisedBits = new IfMauAutoNegCapAdvertisedBitsEnt(mib, this);
                        this.ifMauAutoNegCapReceivedBits = new IfMauAutoNegCapReceivedBitsEnt(mib, this);
                        this.ifMauAutoNegRemoteFaultAdvertised = new IfMauAutoNegRemoteFaultAdvertisedEnt(mib, this);
                        this.ifMauAutoNegRemoteFaultReceived = new IfMauAutoNegRemoteFaultReceivedEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ifMauAutoNegAdminStatus,
                            this.ifMauAutoNegRemoteSignaling,
                            this.ifMauAutoNegConfig,
                            this.ifMauAutoNegCapability,
                            this.ifMauAutoNegCapAdvertised,
                            this.ifMauAutoNegCapReceived,
                            this.ifMauAutoNegRestart,
                            this.ifMauAutoNegCapabilityBits,
                            this.ifMauAutoNegCapAdvertisedBits,
                            this.ifMauAutoNegCapReceivedBits,
                            this.ifMauAutoNegRemoteFaultAdvertised,
                            this.ifMauAutoNegRemoteFaultReceived
                        };
                    }
                    public static final class IfMauAutoNegAdminStatusEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegAdminStatusEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegAdminStatus", "1.3.6.1.2.1.26.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegRemoteSignalingEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegRemoteSignalingEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegRemoteSignaling", "1.3.6.1.2.1.26.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegConfigEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegConfigEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegConfig", "1.3.6.1.2.1.26.5.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegCapabilityEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegCapabilityEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegCapability", "1.3.6.1.2.1.26.5.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegCapAdvertisedEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegCapAdvertisedEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegCapAdvertised", "1.3.6.1.2.1.26.5.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegCapReceivedEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegCapReceivedEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegCapReceived", "1.3.6.1.2.1.26.5.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegRestartEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegRestartEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegRestart", "1.3.6.1.2.1.26.5.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegCapabilityBitsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegCapabilityBitsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegCapabilityBits", "1.3.6.1.2.1.26.5.1.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegCapAdvertisedBitsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegCapAdvertisedBitsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegCapAdvertisedBits", "1.3.6.1.2.1.26.5.1.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegCapReceivedBitsEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegCapReceivedBitsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegCapReceivedBits", "1.3.6.1.2.1.26.5.1.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegRemoteFaultAdvertisedEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegRemoteFaultAdvertisedEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegRemoteFaultAdvertised", "1.3.6.1.2.1.26.5.1.1.12", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IfMauAutoNegRemoteFaultReceivedEnt extends MIBEntry<MAUMIBDef>
                    {
                        private IfMauAutoNegRemoteFaultReceivedEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                        {
                            super(mib, parent, "ifMauAutoNegRemoteFaultReceived", "1.3.6.1.2.1.26.5.1.1.13", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class SnmpDot3MauTrapsEnt extends MIBEntry<MAUMIBDef>
        {
            public final RpMauJabberTrapEnt rpMauJabberTrap;

            public final IfMauJabberTrapEnt ifMauJabberTrap;

            private SnmpDot3MauTrapsEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
            {
                super(mib, parent, "snmpDot3MauTraps", "1.3.6.1.2.1.26.0", false, false, false, false);
                this.rpMauJabberTrap = new RpMauJabberTrapEnt(mib, this);
                this.ifMauJabberTrap = new IfMauJabberTrapEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rpMauJabberTrap,
                    this.ifMauJabberTrap
                };
            }
            public static final class RpMauJabberTrapEnt extends MIBEntry<MAUMIBDef>
            {
                private RpMauJabberTrapEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "rpMauJabberTrap", "1.3.6.1.2.1.26.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class IfMauJabberTrapEnt extends MIBEntry<MAUMIBDef>
            {
                private IfMauJabberTrapEnt(MAUMIBDef mib, MIBEntry<MAUMIBDef> parent)
                {
                    super(mib, parent, "ifMauJabberTrap", "1.3.6.1.2.1.26.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
