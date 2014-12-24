package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**--
--
--
--
--
--
--
--
--
--
--
--
--
--
--
-
MIB for IEEE 802.1w Rapid Spanning Tree Protocol
--
--
--
--
--
--
--
--
--
--
--
--
--
--
--
-*/
public final class RSTPMIBDef extends MIB
{
    public static final RSTPMIBDef RSTPMIB = new RSTPMIBDef();

    public final RstpMIBEnt rstpMIB;

    /** -------------------------------Addition to the dot1dStp group-------------------------------*/
    public final Dot1dStpVersionEnt dot1dStpVersion;

    public final Dot1dStpTxHoldCountEnt dot1dStpTxHoldCount;

    /** { dot1dStp 18 } was used to represent dot1dStpPathCostDefaultin an earlier version of this MIB.  It has since beenobsoleted, and should not be used.*/
    public final Dot1dStpExtPortTableEnt dot1dStpExtPortTable;

    private RSTPMIBDef()
    {
        super("RSTP-MIB");
        this.rstpMIB = new RstpMIBEnt(this, null);
        this.dot1dStpVersion = new Dot1dStpVersionEnt(this, null);
        this.dot1dStpTxHoldCount = new Dot1dStpTxHoldCountEnt(this, null);
        this.dot1dStpExtPortTable = new Dot1dStpExtPortTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.rstpMIB,
            this.dot1dStpVersion,
            this.dot1dStpTxHoldCount,
            this.dot1dStpExtPortTable
        };
    }

    public static final class RstpMIBEnt extends MIBEntry<RSTPMIBDef>
    {
        /** ------------------------------subtrees in the RSTP-MIB------------------------------*/
        public final RstpNotificationsEnt rstpNotifications;

        public final RstpObjectsEnt rstpObjects;

        public final RstpConformanceEnt rstpConformance;

        private RstpMIBEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
        {
            super(mib, parent, "rstpMIB", "1.3.6.1.2.1.134", false, false, false, false);
            this.rstpNotifications = new RstpNotificationsEnt(mib, this);
            this.rstpObjects = new RstpObjectsEnt(mib, this);
            this.rstpConformance = new RstpConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.rstpNotifications,
                this.rstpObjects,
                this.rstpConformance
            };
        }
        public static final class RstpNotificationsEnt extends MIBEntry<RSTPMIBDef>
        {
            private RstpNotificationsEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
            {
                super(mib, parent, "rstpNotifications", "1.3.6.1.2.1.134.0", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class RstpObjectsEnt extends MIBEntry<RSTPMIBDef>
        {
            private RstpObjectsEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
            {
                super(mib, parent, "rstpObjects", "1.3.6.1.2.1.134.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class RstpConformanceEnt extends MIBEntry<RSTPMIBDef>
        {
            /** -------------------------------rstpMIB - Conformance Information-------------------------------*/
            public final RstpGroupsEnt rstpGroups;

            public final RstpCompliancesEnt rstpCompliances;

            private RstpConformanceEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
            {
                super(mib, parent, "rstpConformance", "1.3.6.1.2.1.134.2", false, false, false, false);
                this.rstpGroups = new RstpGroupsEnt(mib, this);
                this.rstpCompliances = new RstpCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rstpGroups,
                    this.rstpCompliances
                };
            }
            public static final class RstpGroupsEnt extends MIBEntry<RSTPMIBDef>
            {
                /** -------------------------------Units of conformance-------------------------------*/
                public final RstpBridgeGroupEnt rstpBridgeGroup;

                public final RstpPortGroupEnt rstpPortGroup;

                private RstpGroupsEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "rstpGroups", "1.3.6.1.2.1.134.2.1", false, false, false, false);
                    this.rstpBridgeGroup = new RstpBridgeGroupEnt(mib, this);
                    this.rstpPortGroup = new RstpPortGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rstpBridgeGroup,
                        this.rstpPortGroup
                    };
                }
                public static final class RstpBridgeGroupEnt extends MIBEntry<RSTPMIBDef>
                {
                    private RstpBridgeGroupEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                    {
                        super(mib, parent, "rstpBridgeGroup", "1.3.6.1.2.1.134.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RstpPortGroupEnt extends MIBEntry<RSTPMIBDef>
                {
                    private RstpPortGroupEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                    {
                        super(mib, parent, "rstpPortGroup", "1.3.6.1.2.1.134.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RstpCompliancesEnt extends MIBEntry<RSTPMIBDef>
            {
                /** -------------------------------Compliance statements-------------------------------*/
                public final RstpComplianceEnt rstpCompliance;

                private RstpCompliancesEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "rstpCompliances", "1.3.6.1.2.1.134.2.2", false, false, false, false);
                    this.rstpCompliance = new RstpComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rstpCompliance
                    };
                }
                public static final class RstpComplianceEnt extends MIBEntry<RSTPMIBDef>
                {
                    private RstpComplianceEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                    {
                        super(mib, parent, "rstpCompliance", "1.3.6.1.2.1.134.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Dot1dStpVersionEnt extends MIBEntry<RSTPMIBDef>
    {
        private Dot1dStpVersionEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
        {
            super(mib, parent, "dot1dStpVersion", "1.3.6.1.2.1.17.2.16", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Dot1dStpTxHoldCountEnt extends MIBEntry<RSTPMIBDef>
    {
        private Dot1dStpTxHoldCountEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
        {
            super(mib, parent, "dot1dStpTxHoldCount", "1.3.6.1.2.1.17.2.17", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class Dot1dStpExtPortTableEnt extends MIBEntry<RSTPMIBDef>
    {
        public final Dot1dStpExtPortEntryEnt dot1dStpExtPortEntry;

        private Dot1dStpExtPortTableEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
        {
            super(mib, parent, "dot1dStpExtPortTable", "1.3.6.1.2.1.17.2.19", false, true, false, false);
            this.dot1dStpExtPortEntry = new Dot1dStpExtPortEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot1dStpExtPortEntry
            };
        }
        public static final class Dot1dStpExtPortEntryEnt extends MIBEntry<RSTPMIBDef>
        {
            public final Dot1dStpPortProtocolMigrationEnt dot1dStpPortProtocolMigration;

            public final Dot1dStpPortAdminEdgePortEnt dot1dStpPortAdminEdgePort;

            public final Dot1dStpPortOperEdgePortEnt dot1dStpPortOperEdgePort;

            public final Dot1dStpPortAdminPointToPointEnt dot1dStpPortAdminPointToPoint;

            public final Dot1dStpPortOperPointToPointEnt dot1dStpPortOperPointToPoint;

            public final Dot1dStpPortAdminPathCostEnt dot1dStpPortAdminPathCost;

            private Dot1dStpExtPortEntryEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
            {
                super(mib, parent, "dot1dStpExtPortEntry", "1.3.6.1.2.1.17.2.19.1", false, false, false, true);
                this.dot1dStpPortProtocolMigration = new Dot1dStpPortProtocolMigrationEnt(mib, this);
                this.dot1dStpPortAdminEdgePort = new Dot1dStpPortAdminEdgePortEnt(mib, this);
                this.dot1dStpPortOperEdgePort = new Dot1dStpPortOperEdgePortEnt(mib, this);
                this.dot1dStpPortAdminPointToPoint = new Dot1dStpPortAdminPointToPointEnt(mib, this);
                this.dot1dStpPortOperPointToPoint = new Dot1dStpPortOperPointToPointEnt(mib, this);
                this.dot1dStpPortAdminPathCost = new Dot1dStpPortAdminPathCostEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dStpPortProtocolMigration,
                    this.dot1dStpPortAdminEdgePort,
                    this.dot1dStpPortOperEdgePort,
                    this.dot1dStpPortAdminPointToPoint,
                    this.dot1dStpPortOperPointToPoint,
                    this.dot1dStpPortAdminPathCost
                };
            }
            public static final class Dot1dStpPortProtocolMigrationEnt extends MIBEntry<RSTPMIBDef>
            {
                private Dot1dStpPortProtocolMigrationEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortProtocolMigration", "1.3.6.1.2.1.17.2.19.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPortAdminEdgePortEnt extends MIBEntry<RSTPMIBDef>
            {
                private Dot1dStpPortAdminEdgePortEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortAdminEdgePort", "1.3.6.1.2.1.17.2.19.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPortOperEdgePortEnt extends MIBEntry<RSTPMIBDef>
            {
                private Dot1dStpPortOperEdgePortEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortOperEdgePort", "1.3.6.1.2.1.17.2.19.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPortAdminPointToPointEnt extends MIBEntry<RSTPMIBDef>
            {
                private Dot1dStpPortAdminPointToPointEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortAdminPointToPoint", "1.3.6.1.2.1.17.2.19.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPortOperPointToPointEnt extends MIBEntry<RSTPMIBDef>
            {
                private Dot1dStpPortOperPointToPointEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortOperPointToPoint", "1.3.6.1.2.1.17.2.19.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPortAdminPathCostEnt extends MIBEntry<RSTPMIBDef>
            {
                private Dot1dStpPortAdminPathCostEnt(RSTPMIBDef mib, MIBEntry<RSTPMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortAdminPathCost", "1.3.6.1.2.1.17.2.19.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
