package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

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
MIB for IEEE 802.1p devices
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
public final class PBRIDGEMIBDef extends MIB
{
    public static final PBRIDGEMIBDef PBRIDGEMIB = new PBRIDGEMIBDef();

    static { MIBs.getInstance().registerMIB(PBRIDGEMIBDef.PBRIDGEMIB); }

    public final PBridgeMIBEnt pBridgeMIB;

    /** -------------------------------High-Capacity Port Table for Transparent Bridges-------------------------------*/
    public final Dot1dTpHCPortTableEnt dot1dTpHCPortTable;

    /** --------------------------Upper part of High-Capacity Port Table for Transparent Bridges--------------------------*/
    public final Dot1dTpPortOverflowTableEnt dot1dTpPortOverflowTable;

    private PBRIDGEMIBDef()
    {
        super("P-BRIDGE-MIB");
        this.pBridgeMIB = new PBridgeMIBEnt(this, null);
        this.dot1dTpHCPortTable = new Dot1dTpHCPortTableEnt(this, null);
        this.dot1dTpPortOverflowTable = new Dot1dTpPortOverflowTableEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.pBridgeMIB,
            this.dot1dTpHCPortTable,
            this.dot1dTpPortOverflowTable
        };
    }

    public static final class PBridgeMIBEnt extends MIBEntry<PBRIDGEMIBDef>
    {
        public final PBridgeMIBObjectsEnt pBridgeMIBObjects;

        /** -------------------------------IEEE 802.1p MIB - Conformance Information-------------------------------*/
        public final PBridgeConformanceEnt pBridgeConformance;

        private PBridgeMIBEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
        {
            super(mib, parent, "pBridgeMIB", "1.3.6.1.2.1.17.6", false, false, false, false);
            this.pBridgeMIBObjects = new PBridgeMIBObjectsEnt(mib, this);
            this.pBridgeConformance = new PBridgeConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.pBridgeMIBObjects,
                this.pBridgeConformance
            };
        }
        public static final class PBridgeMIBObjectsEnt extends MIBEntry<PBRIDGEMIBDef>
        {
            /** -------------------------------subtrees in the P-BRIDGE MIB-------------------------------*/
            public final Dot1dExtBaseEnt dot1dExtBase;

            public final Dot1dPriorityEnt dot1dPriority;

            public final Dot1dGarpEnt dot1dGarp;

            public final Dot1dGmrpEnt dot1dGmrp;

            private PBridgeMIBObjectsEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
            {
                super(mib, parent, "pBridgeMIBObjects", "1.3.6.1.2.1.17.6.1", false, false, false, false);
                this.dot1dExtBase = new Dot1dExtBaseEnt(mib, this);
                this.dot1dPriority = new Dot1dPriorityEnt(mib, this);
                this.dot1dGarp = new Dot1dGarpEnt(mib, this);
                this.dot1dGmrp = new Dot1dGmrpEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dExtBase,
                    this.dot1dPriority,
                    this.dot1dGarp,
                    this.dot1dGmrp
                };
            }
            public static final class Dot1dExtBaseEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                /** -------------------------------the dot1dExtBase subtree-------------------------------*/
                public final Dot1dDeviceCapabilitiesEnt dot1dDeviceCapabilities;

                public final Dot1dTrafficClassesEnabledEnt dot1dTrafficClassesEnabled;

                public final Dot1dGmrpStatusEnt dot1dGmrpStatus;

                /** -------------------------------Port Capabilities Table-------------------------------*/
                public final Dot1dPortCapabilitiesTableEnt dot1dPortCapabilitiesTable;

                private Dot1dExtBaseEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dExtBase", "1.3.6.1.2.1.17.6.1.1", false, false, false, false);
                    this.dot1dDeviceCapabilities = new Dot1dDeviceCapabilitiesEnt(mib, this);
                    this.dot1dTrafficClassesEnabled = new Dot1dTrafficClassesEnabledEnt(mib, this);
                    this.dot1dGmrpStatus = new Dot1dGmrpStatusEnt(mib, this);
                    this.dot1dPortCapabilitiesTable = new Dot1dPortCapabilitiesTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dDeviceCapabilities,
                        this.dot1dTrafficClassesEnabled,
                        this.dot1dGmrpStatus,
                        this.dot1dPortCapabilitiesTable
                    };
                }
                public static final class Dot1dDeviceCapabilitiesEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private Dot1dDeviceCapabilitiesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dDeviceCapabilities", "1.3.6.1.2.1.17.6.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dTrafficClassesEnabledEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private Dot1dTrafficClassesEnabledEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTrafficClassesEnabled", "1.3.6.1.2.1.17.6.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dGmrpStatusEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private Dot1dGmrpStatusEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dGmrpStatus", "1.3.6.1.2.1.17.6.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dPortCapabilitiesTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dPortCapabilitiesEntryEnt dot1dPortCapabilitiesEntry;

                    private Dot1dPortCapabilitiesTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortCapabilitiesTable", "1.3.6.1.2.1.17.6.1.1.4", false, true, false, false);
                        this.dot1dPortCapabilitiesEntry = new Dot1dPortCapabilitiesEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dPortCapabilitiesEntry
                        };
                    }
                    public static final class Dot1dPortCapabilitiesEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dPortCapabilitiesEnt dot1dPortCapabilities;

                        private Dot1dPortCapabilitiesEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dPortCapabilitiesEntry", "1.3.6.1.2.1.17.6.1.1.4.1", false, false, false, true);
                            this.dot1dPortCapabilities = new Dot1dPortCapabilitiesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dPortCapabilities
                            };
                        }
                        public static final class Dot1dPortCapabilitiesEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortCapabilitiesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortCapabilities", "1.3.6.1.2.1.17.6.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot1dPriorityEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                /** -------------------------------the dot1dPriority subtree-------------------------------
-------------------------------Port Priority Table-------------------------------*/
                public final Dot1dPortPriorityTableEnt dot1dPortPriorityTable;

                /** -------------------------------User Priority Regeneration Table-------------------------------*/
                public final Dot1dUserPriorityRegenTableEnt dot1dUserPriorityRegenTable;

                /** -------------------------------Traffic Class Table-------------------------------*/
                public final Dot1dTrafficClassTableEnt dot1dTrafficClassTable;

                /** -------------------------------Outbound Access Priority Table-------------------------------*/
                public final Dot1dPortOutboundAccessPriorityTableEnt dot1dPortOutboundAccessPriorityTable;

                private Dot1dPriorityEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dPriority", "1.3.6.1.2.1.17.6.1.2", false, false, false, false);
                    this.dot1dPortPriorityTable = new Dot1dPortPriorityTableEnt(mib, this);
                    this.dot1dUserPriorityRegenTable = new Dot1dUserPriorityRegenTableEnt(mib, this);
                    this.dot1dTrafficClassTable = new Dot1dTrafficClassTableEnt(mib, this);
                    this.dot1dPortOutboundAccessPriorityTable = new Dot1dPortOutboundAccessPriorityTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dPortPriorityTable,
                        this.dot1dUserPriorityRegenTable,
                        this.dot1dTrafficClassTable,
                        this.dot1dPortOutboundAccessPriorityTable
                    };
                }
                public static final class Dot1dPortPriorityTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dPortPriorityEntryEnt dot1dPortPriorityEntry;

                    private Dot1dPortPriorityTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortPriorityTable", "1.3.6.1.2.1.17.6.1.2.1", false, true, false, false);
                        this.dot1dPortPriorityEntry = new Dot1dPortPriorityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dPortPriorityEntry
                        };
                    }
                    public static final class Dot1dPortPriorityEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dPortDefaultUserPriorityEnt dot1dPortDefaultUserPriority;

                        public final Dot1dPortNumTrafficClassesEnt dot1dPortNumTrafficClasses;

                        private Dot1dPortPriorityEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dPortPriorityEntry", "1.3.6.1.2.1.17.6.1.2.1.1", false, false, false, true);
                            this.dot1dPortDefaultUserPriority = new Dot1dPortDefaultUserPriorityEnt(mib, this);
                            this.dot1dPortNumTrafficClasses = new Dot1dPortNumTrafficClassesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dPortDefaultUserPriority,
                                this.dot1dPortNumTrafficClasses
                            };
                        }
                        public static final class Dot1dPortDefaultUserPriorityEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortDefaultUserPriorityEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortDefaultUserPriority", "1.3.6.1.2.1.17.6.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dPortNumTrafficClassesEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortNumTrafficClassesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortNumTrafficClasses", "1.3.6.1.2.1.17.6.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1dUserPriorityRegenTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dUserPriorityRegenEntryEnt dot1dUserPriorityRegenEntry;

                    private Dot1dUserPriorityRegenTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dUserPriorityRegenTable", "1.3.6.1.2.1.17.6.1.2.2", false, true, false, false);
                        this.dot1dUserPriorityRegenEntry = new Dot1dUserPriorityRegenEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dUserPriorityRegenEntry
                        };
                    }
                    public static final class Dot1dUserPriorityRegenEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dUserPriorityEnt dot1dUserPriority;

                        public final Dot1dRegenUserPriorityEnt dot1dRegenUserPriority;

                        private Dot1dUserPriorityRegenEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dUserPriorityRegenEntry", "1.3.6.1.2.1.17.6.1.2.2.1", false, false, false, true);
                            this.dot1dUserPriority = new Dot1dUserPriorityEnt(mib, this);
                            this.dot1dRegenUserPriority = new Dot1dRegenUserPriorityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dUserPriority,
                                this.dot1dRegenUserPriority
                            };
                        }
                        public static final class Dot1dUserPriorityEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dUserPriorityEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dUserPriority", "1.3.6.1.2.1.17.6.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dRegenUserPriorityEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dRegenUserPriorityEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dRegenUserPriority", "1.3.6.1.2.1.17.6.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1dTrafficClassTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dTrafficClassEntryEnt dot1dTrafficClassEntry;

                    private Dot1dTrafficClassTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTrafficClassTable", "1.3.6.1.2.1.17.6.1.2.3", false, true, false, false);
                        this.dot1dTrafficClassEntry = new Dot1dTrafficClassEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dTrafficClassEntry
                        };
                    }
                    public static final class Dot1dTrafficClassEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dTrafficClassPriorityEnt dot1dTrafficClassPriority;

                        public final Dot1dTrafficClassEnt dot1dTrafficClass;

                        private Dot1dTrafficClassEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTrafficClassEntry", "1.3.6.1.2.1.17.6.1.2.3.1", false, false, false, true);
                            this.dot1dTrafficClassPriority = new Dot1dTrafficClassPriorityEnt(mib, this);
                            this.dot1dTrafficClass = new Dot1dTrafficClassEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dTrafficClassPriority,
                                this.dot1dTrafficClass
                            };
                        }
                        public static final class Dot1dTrafficClassPriorityEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dTrafficClassPriorityEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dTrafficClassPriority", "1.3.6.1.2.1.17.6.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dTrafficClassEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dTrafficClassEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dTrafficClass", "1.3.6.1.2.1.17.6.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1dPortOutboundAccessPriorityTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dPortOutboundAccessPriorityEntryEnt dot1dPortOutboundAccessPriorityEntry;

                    private Dot1dPortOutboundAccessPriorityTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortOutboundAccessPriorityTable", "1.3.6.1.2.1.17.6.1.2.4", false, true, false, false);
                        this.dot1dPortOutboundAccessPriorityEntry = new Dot1dPortOutboundAccessPriorityEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dPortOutboundAccessPriorityEntry
                        };
                    }
                    public static final class Dot1dPortOutboundAccessPriorityEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dPortOutboundAccessPriorityEnt dot1dPortOutboundAccessPriority;

                        private Dot1dPortOutboundAccessPriorityEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dPortOutboundAccessPriorityEntry", "1.3.6.1.2.1.17.6.1.2.4.1", false, false, false, true);
                            this.dot1dPortOutboundAccessPriority = new Dot1dPortOutboundAccessPriorityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dPortOutboundAccessPriority
                            };
                        }
                        public static final class Dot1dPortOutboundAccessPriorityEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortOutboundAccessPriorityEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortOutboundAccessPriority", "1.3.6.1.2.1.17.6.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot1dGarpEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                /** -------------------------------the dot1dGarp subtree-------------------------------
-------------------------------The GARP Port Table-------------------------------*/
                public final Dot1dPortGarpTableEnt dot1dPortGarpTable;

                private Dot1dGarpEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dGarp", "1.3.6.1.2.1.17.6.1.3", false, false, false, false);
                    this.dot1dPortGarpTable = new Dot1dPortGarpTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dPortGarpTable
                    };
                }
                public static final class Dot1dPortGarpTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dPortGarpEntryEnt dot1dPortGarpEntry;

                    private Dot1dPortGarpTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortGarpTable", "1.3.6.1.2.1.17.6.1.3.1", false, true, false, false);
                        this.dot1dPortGarpEntry = new Dot1dPortGarpEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dPortGarpEntry
                        };
                    }
                    public static final class Dot1dPortGarpEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dPortGarpJoinTimeEnt dot1dPortGarpJoinTime;

                        public final Dot1dPortGarpLeaveTimeEnt dot1dPortGarpLeaveTime;

                        public final Dot1dPortGarpLeaveAllTimeEnt dot1dPortGarpLeaveAllTime;

                        private Dot1dPortGarpEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dPortGarpEntry", "1.3.6.1.2.1.17.6.1.3.1.1", false, false, false, true);
                            this.dot1dPortGarpJoinTime = new Dot1dPortGarpJoinTimeEnt(mib, this);
                            this.dot1dPortGarpLeaveTime = new Dot1dPortGarpLeaveTimeEnt(mib, this);
                            this.dot1dPortGarpLeaveAllTime = new Dot1dPortGarpLeaveAllTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dPortGarpJoinTime,
                                this.dot1dPortGarpLeaveTime,
                                this.dot1dPortGarpLeaveAllTime
                            };
                        }
                        public static final class Dot1dPortGarpJoinTimeEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortGarpJoinTimeEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortGarpJoinTime", "1.3.6.1.2.1.17.6.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dPortGarpLeaveTimeEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortGarpLeaveTimeEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortGarpLeaveTime", "1.3.6.1.2.1.17.6.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dPortGarpLeaveAllTimeEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortGarpLeaveAllTimeEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortGarpLeaveAllTime", "1.3.6.1.2.1.17.6.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot1dGmrpEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                /** -------------------------------The GMRP Port Configuration and Status Table-------------------------------*/
                public final Dot1dPortGmrpTableEnt dot1dPortGmrpTable;

                private Dot1dGmrpEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dGmrp", "1.3.6.1.2.1.17.6.1.4", false, false, false, false);
                    this.dot1dPortGmrpTable = new Dot1dPortGmrpTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dPortGmrpTable
                    };
                }
                public static final class Dot1dPortGmrpTableEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    public final Dot1dPortGmrpEntryEnt dot1dPortGmrpEntry;

                    private Dot1dPortGmrpTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dPortGmrpTable", "1.3.6.1.2.1.17.6.1.4.1", false, true, false, false);
                        this.dot1dPortGmrpEntry = new Dot1dPortGmrpEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dPortGmrpEntry
                        };
                    }
                    public static final class Dot1dPortGmrpEntryEnt extends MIBEntry<PBRIDGEMIBDef>
                    {
                        public final Dot1dPortGmrpStatusEnt dot1dPortGmrpStatus;

                        public final Dot1dPortGmrpFailedRegistrationsEnt dot1dPortGmrpFailedRegistrations;

                        public final Dot1dPortGmrpLastPduOriginEnt dot1dPortGmrpLastPduOrigin;

                        public final Dot1dPortRestrictedGroupRegistrationEnt dot1dPortRestrictedGroupRegistration;

                        private Dot1dPortGmrpEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dPortGmrpEntry", "1.3.6.1.2.1.17.6.1.4.1.1", false, false, false, true);
                            this.dot1dPortGmrpStatus = new Dot1dPortGmrpStatusEnt(mib, this);
                            this.dot1dPortGmrpFailedRegistrations = new Dot1dPortGmrpFailedRegistrationsEnt(mib, this);
                            this.dot1dPortGmrpLastPduOrigin = new Dot1dPortGmrpLastPduOriginEnt(mib, this);
                            this.dot1dPortRestrictedGroupRegistration = new Dot1dPortRestrictedGroupRegistrationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1dPortGmrpStatus,
                                this.dot1dPortGmrpFailedRegistrations,
                                this.dot1dPortGmrpLastPduOrigin,
                                this.dot1dPortRestrictedGroupRegistration
                            };
                        }
                        public static final class Dot1dPortGmrpStatusEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortGmrpStatusEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortGmrpStatus", "1.3.6.1.2.1.17.6.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dPortGmrpFailedRegistrationsEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortGmrpFailedRegistrationsEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortGmrpFailedRegistrations", "1.3.6.1.2.1.17.6.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dPortGmrpLastPduOriginEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortGmrpLastPduOriginEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortGmrpLastPduOrigin", "1.3.6.1.2.1.17.6.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1dPortRestrictedGroupRegistrationEnt extends MIBEntry<PBRIDGEMIBDef>
                        {
                            private Dot1dPortRestrictedGroupRegistrationEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1dPortRestrictedGroupRegistration", "1.3.6.1.2.1.17.6.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class PBridgeConformanceEnt extends MIBEntry<PBRIDGEMIBDef>
        {
            public final PBridgeGroupsEnt pBridgeGroups;

            public final PBridgeCompliancesEnt pBridgeCompliances;

            private PBridgeConformanceEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
            {
                super(mib, parent, "pBridgeConformance", "1.3.6.1.2.1.17.6.2", false, false, false, false);
                this.pBridgeGroups = new PBridgeGroupsEnt(mib, this);
                this.pBridgeCompliances = new PBridgeCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.pBridgeGroups,
                    this.pBridgeCompliances
                };
            }
            public static final class PBridgeGroupsEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                /** -------------------------------units of conformance-------------------------------*/
                public final PBridgeExtCapGroupEnt pBridgeExtCapGroup;

                public final PBridgeDeviceGmrpGroupEnt pBridgeDeviceGmrpGroup;

                public final PBridgeDevicePriorityGroupEnt pBridgeDevicePriorityGroup;

                public final PBridgeDefaultPriorityGroupEnt pBridgeDefaultPriorityGroup;

                public final PBridgeRegenPriorityGroupEnt pBridgeRegenPriorityGroup;

                public final PBridgePriorityGroupEnt pBridgePriorityGroup;

                public final PBridgeAccessPriorityGroupEnt pBridgeAccessPriorityGroup;

                public final PBridgePortGarpGroupEnt pBridgePortGarpGroup;

                public final PBridgePortGmrpGroupEnt pBridgePortGmrpGroup;

                public final PBridgeHCPortGroupEnt pBridgeHCPortGroup;

                public final PBridgePortOverflowGroupEnt pBridgePortOverflowGroup;

                public final PBridgePortGmrpGroup2Ent pBridgePortGmrpGroup2;

                private PBridgeGroupsEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "pBridgeGroups", "1.3.6.1.2.1.17.6.2.1", false, false, false, false);
                    this.pBridgeExtCapGroup = new PBridgeExtCapGroupEnt(mib, this);
                    this.pBridgeDeviceGmrpGroup = new PBridgeDeviceGmrpGroupEnt(mib, this);
                    this.pBridgeDevicePriorityGroup = new PBridgeDevicePriorityGroupEnt(mib, this);
                    this.pBridgeDefaultPriorityGroup = new PBridgeDefaultPriorityGroupEnt(mib, this);
                    this.pBridgeRegenPriorityGroup = new PBridgeRegenPriorityGroupEnt(mib, this);
                    this.pBridgePriorityGroup = new PBridgePriorityGroupEnt(mib, this);
                    this.pBridgeAccessPriorityGroup = new PBridgeAccessPriorityGroupEnt(mib, this);
                    this.pBridgePortGarpGroup = new PBridgePortGarpGroupEnt(mib, this);
                    this.pBridgePortGmrpGroup = new PBridgePortGmrpGroupEnt(mib, this);
                    this.pBridgeHCPortGroup = new PBridgeHCPortGroupEnt(mib, this);
                    this.pBridgePortOverflowGroup = new PBridgePortOverflowGroupEnt(mib, this);
                    this.pBridgePortGmrpGroup2 = new PBridgePortGmrpGroup2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pBridgeExtCapGroup,
                        this.pBridgeDeviceGmrpGroup,
                        this.pBridgeDevicePriorityGroup,
                        this.pBridgeDefaultPriorityGroup,
                        this.pBridgeRegenPriorityGroup,
                        this.pBridgePriorityGroup,
                        this.pBridgeAccessPriorityGroup,
                        this.pBridgePortGarpGroup,
                        this.pBridgePortGmrpGroup,
                        this.pBridgeHCPortGroup,
                        this.pBridgePortOverflowGroup,
                        this.pBridgePortGmrpGroup2
                    };
                }
                public static final class PBridgeExtCapGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeExtCapGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeExtCapGroup", "1.3.6.1.2.1.17.6.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeDeviceGmrpGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeDeviceGmrpGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeDeviceGmrpGroup", "1.3.6.1.2.1.17.6.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeDevicePriorityGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeDevicePriorityGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeDevicePriorityGroup", "1.3.6.1.2.1.17.6.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeDefaultPriorityGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeDefaultPriorityGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeDefaultPriorityGroup", "1.3.6.1.2.1.17.6.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeRegenPriorityGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeRegenPriorityGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeRegenPriorityGroup", "1.3.6.1.2.1.17.6.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgePriorityGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgePriorityGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgePriorityGroup", "1.3.6.1.2.1.17.6.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeAccessPriorityGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeAccessPriorityGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeAccessPriorityGroup", "1.3.6.1.2.1.17.6.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgePortGarpGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgePortGarpGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgePortGarpGroup", "1.3.6.1.2.1.17.6.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgePortGmrpGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgePortGmrpGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgePortGmrpGroup", "1.3.6.1.2.1.17.6.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeHCPortGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeHCPortGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeHCPortGroup", "1.3.6.1.2.1.17.6.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgePortOverflowGroupEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgePortOverflowGroupEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgePortOverflowGroup", "1.3.6.1.2.1.17.6.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgePortGmrpGroup2Ent extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgePortGmrpGroup2Ent(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgePortGmrpGroup2", "1.3.6.1.2.1.17.6.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class PBridgeCompliancesEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                /** -------------------------------compliance statements-------------------------------*/
                public final PBridgeComplianceEnt pBridgeCompliance;

                public final PBridgeCompliance2Ent pBridgeCompliance2;

                private PBridgeCompliancesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "pBridgeCompliances", "1.3.6.1.2.1.17.6.2.2", false, false, false, false);
                    this.pBridgeCompliance = new PBridgeComplianceEnt(mib, this);
                    this.pBridgeCompliance2 = new PBridgeCompliance2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.pBridgeCompliance,
                        this.pBridgeCompliance2
                    };
                }
                public static final class PBridgeComplianceEnt extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeComplianceEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeCompliance", "1.3.6.1.2.1.17.6.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class PBridgeCompliance2Ent extends MIBEntry<PBRIDGEMIBDef>
                {
                    private PBridgeCompliance2Ent(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "pBridgeCompliance2", "1.3.6.1.2.1.17.6.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class Dot1dTpHCPortTableEnt extends MIBEntry<PBRIDGEMIBDef>
    {
        public final Dot1dTpHCPortEntryEnt dot1dTpHCPortEntry;

        private Dot1dTpHCPortTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
        {
            super(mib, parent, "dot1dTpHCPortTable", "1.3.6.1.2.1.17.4.5", false, true, false, false);
            this.dot1dTpHCPortEntry = new Dot1dTpHCPortEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot1dTpHCPortEntry
            };
        }
        public static final class Dot1dTpHCPortEntryEnt extends MIBEntry<PBRIDGEMIBDef>
        {
            public final Dot1dTpHCPortInFramesEnt dot1dTpHCPortInFrames;

            public final Dot1dTpHCPortOutFramesEnt dot1dTpHCPortOutFrames;

            public final Dot1dTpHCPortInDiscardsEnt dot1dTpHCPortInDiscards;

            private Dot1dTpHCPortEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dTpHCPortEntry", "1.3.6.1.2.1.17.4.5.1", false, false, false, true);
                this.dot1dTpHCPortInFrames = new Dot1dTpHCPortInFramesEnt(mib, this);
                this.dot1dTpHCPortOutFrames = new Dot1dTpHCPortOutFramesEnt(mib, this);
                this.dot1dTpHCPortInDiscards = new Dot1dTpHCPortInDiscardsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dTpHCPortInFrames,
                    this.dot1dTpHCPortOutFrames,
                    this.dot1dTpHCPortInDiscards
                };
            }
            public static final class Dot1dTpHCPortInFramesEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                private Dot1dTpHCPortInFramesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpHCPortInFrames", "1.3.6.1.2.1.17.4.5.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dTpHCPortOutFramesEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                private Dot1dTpHCPortOutFramesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpHCPortOutFrames", "1.3.6.1.2.1.17.4.5.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dTpHCPortInDiscardsEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                private Dot1dTpHCPortInDiscardsEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpHCPortInDiscards", "1.3.6.1.2.1.17.4.5.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class Dot1dTpPortOverflowTableEnt extends MIBEntry<PBRIDGEMIBDef>
    {
        public final Dot1dTpPortOverflowEntryEnt dot1dTpPortOverflowEntry;

        private Dot1dTpPortOverflowTableEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
        {
            super(mib, parent, "dot1dTpPortOverflowTable", "1.3.6.1.2.1.17.4.6", false, true, false, false);
            this.dot1dTpPortOverflowEntry = new Dot1dTpPortOverflowEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot1dTpPortOverflowEntry
            };
        }
        public static final class Dot1dTpPortOverflowEntryEnt extends MIBEntry<PBRIDGEMIBDef>
        {
            public final Dot1dTpPortInOverflowFramesEnt dot1dTpPortInOverflowFrames;

            public final Dot1dTpPortOutOverflowFramesEnt dot1dTpPortOutOverflowFrames;

            public final Dot1dTpPortInOverflowDiscardsEnt dot1dTpPortInOverflowDiscards;

            private Dot1dTpPortOverflowEntryEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dTpPortOverflowEntry", "1.3.6.1.2.1.17.4.6.1", false, false, false, true);
                this.dot1dTpPortInOverflowFrames = new Dot1dTpPortInOverflowFramesEnt(mib, this);
                this.dot1dTpPortOutOverflowFrames = new Dot1dTpPortOutOverflowFramesEnt(mib, this);
                this.dot1dTpPortInOverflowDiscards = new Dot1dTpPortInOverflowDiscardsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dTpPortInOverflowFrames,
                    this.dot1dTpPortOutOverflowFrames,
                    this.dot1dTpPortInOverflowDiscards
                };
            }
            public static final class Dot1dTpPortInOverflowFramesEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                private Dot1dTpPortInOverflowFramesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpPortInOverflowFrames", "1.3.6.1.2.1.17.4.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dTpPortOutOverflowFramesEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                private Dot1dTpPortOutOverflowFramesEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpPortOutOverflowFrames", "1.3.6.1.2.1.17.4.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dTpPortInOverflowDiscardsEnt extends MIBEntry<PBRIDGEMIBDef>
            {
                private Dot1dTpPortInOverflowDiscardsEnt(PBRIDGEMIBDef mib, MIBEntry<PBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpPortInOverflowDiscards", "1.3.6.1.2.1.17.4.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
