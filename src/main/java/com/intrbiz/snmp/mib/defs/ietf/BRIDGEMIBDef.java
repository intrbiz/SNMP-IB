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

MIB for IEEE 802.1D devices
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
--*/
public final class BRIDGEMIBDef extends MIB
{
    public static final BRIDGEMIBDef BRIDGEMIB = new BRIDGEMIBDef();

    public final Dot1dBridgeEnt dot1dBridge;

    private BRIDGEMIBDef()
    {
        super("BRIDGE-MIB");
        this.dot1dBridge = new Dot1dBridgeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.dot1dBridge
        };
    }

    public static final class Dot1dBridgeEnt extends MIBEntry<BRIDGEMIBDef>
    {
        /** ------------------------------subtrees in the Bridge MIB------------------------------*/
        public final Dot1dNotificationsEnt dot1dNotifications;

        public final Dot1dBaseEnt dot1dBase;

        public final Dot1dStpEnt dot1dStp;

        public final Dot1dSrEnt dot1dSr;

        /** documented in RFC 1525*/
        public final Dot1dTpEnt dot1dTp;

        public final Dot1dStaticEnt dot1dStatic;

        /** Subtrees used by Bridge MIB Extensions:pBridgeMIB  MODULE-IDENTITY   ::= { dot1dBridge 6 }qBridgeMIB  MODULE-IDENTITY   ::= { dot1dBridge 7 }Note that the practice of registering related MIB modulesbelow dot1dBridge has been discouraged since there is norobust mechanism to track such registrations.*/
        public final Dot1dConformanceEnt dot1dConformance;

        private Dot1dBridgeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
        {
            super(mib, parent, "dot1dBridge", "1.3.6.1.2.1.17", false, false, false, false);
            this.dot1dNotifications = new Dot1dNotificationsEnt(mib, this);
            this.dot1dBase = new Dot1dBaseEnt(mib, this);
            this.dot1dStp = new Dot1dStpEnt(mib, this);
            this.dot1dSr = new Dot1dSrEnt(mib, this);
            this.dot1dTp = new Dot1dTpEnt(mib, this);
            this.dot1dStatic = new Dot1dStaticEnt(mib, this);
            this.dot1dConformance = new Dot1dConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.dot1dNotifications,
                this.dot1dBase,
                this.dot1dStp,
                this.dot1dSr,
                this.dot1dTp,
                this.dot1dStatic,
                this.dot1dConformance
            };
        }
        public static final class Dot1dNotificationsEnt extends MIBEntry<BRIDGEMIBDef>
        {
            /** ------------------------------Notifications for use by Bridges------------------------------Notifications for the Spanning Tree Protocol------------------------------

OBJECTS     { }*/
            public final NewRootEnt newRoot;

            /** OBJECTS     { }*/
            public final TopologyChangeEnt topologyChange;

            private Dot1dNotificationsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dNotifications", "1.3.6.1.2.1.17.0", false, false, false, false);
                this.newRoot = new NewRootEnt(mib, this);
                this.topologyChange = new TopologyChangeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.newRoot,
                    this.topologyChange
                };
            }
            public static final class NewRootEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private NewRootEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "newRoot", "1.3.6.1.2.1.17.0.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class TopologyChangeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private TopologyChangeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "topologyChange", "1.3.6.1.2.1.17.0.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class Dot1dBaseEnt extends MIBEntry<BRIDGEMIBDef>
        {
            /** ------------------------------the dot1dBase subtree------------------------------Implementation of the dot1dBase subtree is mandatory for allbridges.------------------------------*/
            public final Dot1dBaseBridgeAddressEnt dot1dBaseBridgeAddress;

            public final Dot1dBaseNumPortsEnt dot1dBaseNumPorts;

            public final Dot1dBaseTypeEnt dot1dBaseType;

            /** ------------------------------The Generic Bridge Port Table------------------------------*/
            public final Dot1dBasePortTableEnt dot1dBasePortTable;

            private Dot1dBaseEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dBase", "1.3.6.1.2.1.17.1", false, false, false, false);
                this.dot1dBaseBridgeAddress = new Dot1dBaseBridgeAddressEnt(mib, this);
                this.dot1dBaseNumPorts = new Dot1dBaseNumPortsEnt(mib, this);
                this.dot1dBaseType = new Dot1dBaseTypeEnt(mib, this);
                this.dot1dBasePortTable = new Dot1dBasePortTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dBaseBridgeAddress,
                    this.dot1dBaseNumPorts,
                    this.dot1dBaseType,
                    this.dot1dBasePortTable
                };
            }
            public static final class Dot1dBaseBridgeAddressEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dBaseBridgeAddressEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dBaseBridgeAddress", "1.3.6.1.2.1.17.1.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dBaseNumPortsEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dBaseNumPortsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dBaseNumPorts", "1.3.6.1.2.1.17.1.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dBaseTypeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dBaseTypeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dBaseType", "1.3.6.1.2.1.17.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dBasePortTableEnt extends MIBEntry<BRIDGEMIBDef>
            {
                public final Dot1dBasePortEntryEnt dot1dBasePortEntry;

                private Dot1dBasePortTableEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dBasePortTable", "1.3.6.1.2.1.17.1.4", false, true, false, false);
                    this.dot1dBasePortEntry = new Dot1dBasePortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dBasePortEntry
                    };
                }
                public static final class Dot1dBasePortEntryEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    public final Dot1dBasePortEnt dot1dBasePort;

                    public final Dot1dBasePortIfIndexEnt dot1dBasePortIfIndex;

                    public final Dot1dBasePortCircuitEnt dot1dBasePortCircuit;

                    public final Dot1dBasePortDelayExceededDiscardsEnt dot1dBasePortDelayExceededDiscards;

                    public final Dot1dBasePortMtuExceededDiscardsEnt dot1dBasePortMtuExceededDiscards;

                    private Dot1dBasePortEntryEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dBasePortEntry", "1.3.6.1.2.1.17.1.4.1", false, false, false, true);
                        this.dot1dBasePort = new Dot1dBasePortEnt(mib, this);
                        this.dot1dBasePortIfIndex = new Dot1dBasePortIfIndexEnt(mib, this);
                        this.dot1dBasePortCircuit = new Dot1dBasePortCircuitEnt(mib, this);
                        this.dot1dBasePortDelayExceededDiscards = new Dot1dBasePortDelayExceededDiscardsEnt(mib, this);
                        this.dot1dBasePortMtuExceededDiscards = new Dot1dBasePortMtuExceededDiscardsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dBasePort,
                            this.dot1dBasePortIfIndex,
                            this.dot1dBasePortCircuit,
                            this.dot1dBasePortDelayExceededDiscards,
                            this.dot1dBasePortMtuExceededDiscards
                        };
                    }
                    public static final class Dot1dBasePortEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dBasePortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dBasePort", "1.3.6.1.2.1.17.1.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dBasePortIfIndexEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dBasePortIfIndexEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dBasePortIfIndex", "1.3.6.1.2.1.17.1.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dBasePortCircuitEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dBasePortCircuitEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dBasePortCircuit", "1.3.6.1.2.1.17.1.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dBasePortDelayExceededDiscardsEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dBasePortDelayExceededDiscardsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dBasePortDelayExceededDiscards", "1.3.6.1.2.1.17.1.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dBasePortMtuExceededDiscardsEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dBasePortMtuExceededDiscardsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dBasePortMtuExceededDiscards", "1.3.6.1.2.1.17.1.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot1dStpEnt extends MIBEntry<BRIDGEMIBDef>
        {
            /** ------------------------------the dot1dStp subtree------------------------------Implementation of the dot1dStp subtree is optional.  It isimplemented by those bridges that support the Spanning TreeProtocol.------------------------------*/
            public final Dot1dStpProtocolSpecificationEnt dot1dStpProtocolSpecification;

            public final Dot1dStpPriorityEnt dot1dStpPriority;

            public final Dot1dStpTimeSinceTopologyChangeEnt dot1dStpTimeSinceTopologyChange;

            public final Dot1dStpTopChangesEnt dot1dStpTopChanges;

            public final Dot1dStpDesignatedRootEnt dot1dStpDesignatedRoot;

            public final Dot1dStpRootCostEnt dot1dStpRootCost;

            public final Dot1dStpRootPortEnt dot1dStpRootPort;

            public final Dot1dStpMaxAgeEnt dot1dStpMaxAge;

            public final Dot1dStpHelloTimeEnt dot1dStpHelloTime;

            public final Dot1dStpHoldTimeEnt dot1dStpHoldTime;

            public final Dot1dStpForwardDelayEnt dot1dStpForwardDelay;

            public final Dot1dStpBridgeMaxAgeEnt dot1dStpBridgeMaxAge;

            public final Dot1dStpBridgeHelloTimeEnt dot1dStpBridgeHelloTime;

            public final Dot1dStpBridgeForwardDelayEnt dot1dStpBridgeForwardDelay;

            /** ------------------------------The Spanning Tree Port Table------------------------------*/
            public final Dot1dStpPortTableEnt dot1dStpPortTable;

            private Dot1dStpEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dStp", "1.3.6.1.2.1.17.2", false, false, false, false);
                this.dot1dStpProtocolSpecification = new Dot1dStpProtocolSpecificationEnt(mib, this);
                this.dot1dStpPriority = new Dot1dStpPriorityEnt(mib, this);
                this.dot1dStpTimeSinceTopologyChange = new Dot1dStpTimeSinceTopologyChangeEnt(mib, this);
                this.dot1dStpTopChanges = new Dot1dStpTopChangesEnt(mib, this);
                this.dot1dStpDesignatedRoot = new Dot1dStpDesignatedRootEnt(mib, this);
                this.dot1dStpRootCost = new Dot1dStpRootCostEnt(mib, this);
                this.dot1dStpRootPort = new Dot1dStpRootPortEnt(mib, this);
                this.dot1dStpMaxAge = new Dot1dStpMaxAgeEnt(mib, this);
                this.dot1dStpHelloTime = new Dot1dStpHelloTimeEnt(mib, this);
                this.dot1dStpHoldTime = new Dot1dStpHoldTimeEnt(mib, this);
                this.dot1dStpForwardDelay = new Dot1dStpForwardDelayEnt(mib, this);
                this.dot1dStpBridgeMaxAge = new Dot1dStpBridgeMaxAgeEnt(mib, this);
                this.dot1dStpBridgeHelloTime = new Dot1dStpBridgeHelloTimeEnt(mib, this);
                this.dot1dStpBridgeForwardDelay = new Dot1dStpBridgeForwardDelayEnt(mib, this);
                this.dot1dStpPortTable = new Dot1dStpPortTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dStpProtocolSpecification,
                    this.dot1dStpPriority,
                    this.dot1dStpTimeSinceTopologyChange,
                    this.dot1dStpTopChanges,
                    this.dot1dStpDesignatedRoot,
                    this.dot1dStpRootCost,
                    this.dot1dStpRootPort,
                    this.dot1dStpMaxAge,
                    this.dot1dStpHelloTime,
                    this.dot1dStpHoldTime,
                    this.dot1dStpForwardDelay,
                    this.dot1dStpBridgeMaxAge,
                    this.dot1dStpBridgeHelloTime,
                    this.dot1dStpBridgeForwardDelay,
                    this.dot1dStpPortTable
                };
            }
            public static final class Dot1dStpProtocolSpecificationEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpProtocolSpecificationEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpProtocolSpecification", "1.3.6.1.2.1.17.2.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPriorityEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpPriorityEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPriority", "1.3.6.1.2.1.17.2.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpTimeSinceTopologyChangeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpTimeSinceTopologyChangeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpTimeSinceTopologyChange", "1.3.6.1.2.1.17.2.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpTopChangesEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpTopChangesEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpTopChanges", "1.3.6.1.2.1.17.2.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpDesignatedRootEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpDesignatedRootEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpDesignatedRoot", "1.3.6.1.2.1.17.2.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpRootCostEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpRootCostEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpRootCost", "1.3.6.1.2.1.17.2.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpRootPortEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpRootPortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpRootPort", "1.3.6.1.2.1.17.2.7", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpMaxAgeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpMaxAgeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpMaxAge", "1.3.6.1.2.1.17.2.8", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpHelloTimeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpHelloTimeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpHelloTime", "1.3.6.1.2.1.17.2.9", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpHoldTimeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpHoldTimeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpHoldTime", "1.3.6.1.2.1.17.2.10", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpForwardDelayEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpForwardDelayEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpForwardDelay", "1.3.6.1.2.1.17.2.11", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpBridgeMaxAgeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpBridgeMaxAgeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpBridgeMaxAge", "1.3.6.1.2.1.17.2.12", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpBridgeHelloTimeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpBridgeHelloTimeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpBridgeHelloTime", "1.3.6.1.2.1.17.2.13", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpBridgeForwardDelayEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dStpBridgeForwardDelayEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpBridgeForwardDelay", "1.3.6.1.2.1.17.2.14", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dStpPortTableEnt extends MIBEntry<BRIDGEMIBDef>
            {
                public final Dot1dStpPortEntryEnt dot1dStpPortEntry;

                private Dot1dStpPortTableEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStpPortTable", "1.3.6.1.2.1.17.2.15", false, true, false, false);
                    this.dot1dStpPortEntry = new Dot1dStpPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dStpPortEntry
                    };
                }
                public static final class Dot1dStpPortEntryEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    public final Dot1dStpPortEnt dot1dStpPort;

                    public final Dot1dStpPortPriorityEnt dot1dStpPortPriority;

                    public final Dot1dStpPortStateEnt dot1dStpPortState;

                    public final Dot1dStpPortEnableEnt dot1dStpPortEnable;

                    public final Dot1dStpPortPathCostEnt dot1dStpPortPathCost;

                    public final Dot1dStpPortDesignatedRootEnt dot1dStpPortDesignatedRoot;

                    public final Dot1dStpPortDesignatedCostEnt dot1dStpPortDesignatedCost;

                    public final Dot1dStpPortDesignatedBridgeEnt dot1dStpPortDesignatedBridge;

                    public final Dot1dStpPortDesignatedPortEnt dot1dStpPortDesignatedPort;

                    public final Dot1dStpPortForwardTransitionsEnt dot1dStpPortForwardTransitions;

                    public final Dot1dStpPortPathCost32Ent dot1dStpPortPathCost32;

                    private Dot1dStpPortEntryEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStpPortEntry", "1.3.6.1.2.1.17.2.15.1", false, false, false, true);
                        this.dot1dStpPort = new Dot1dStpPortEnt(mib, this);
                        this.dot1dStpPortPriority = new Dot1dStpPortPriorityEnt(mib, this);
                        this.dot1dStpPortState = new Dot1dStpPortStateEnt(mib, this);
                        this.dot1dStpPortEnable = new Dot1dStpPortEnableEnt(mib, this);
                        this.dot1dStpPortPathCost = new Dot1dStpPortPathCostEnt(mib, this);
                        this.dot1dStpPortDesignatedRoot = new Dot1dStpPortDesignatedRootEnt(mib, this);
                        this.dot1dStpPortDesignatedCost = new Dot1dStpPortDesignatedCostEnt(mib, this);
                        this.dot1dStpPortDesignatedBridge = new Dot1dStpPortDesignatedBridgeEnt(mib, this);
                        this.dot1dStpPortDesignatedPort = new Dot1dStpPortDesignatedPortEnt(mib, this);
                        this.dot1dStpPortForwardTransitions = new Dot1dStpPortForwardTransitionsEnt(mib, this);
                        this.dot1dStpPortPathCost32 = new Dot1dStpPortPathCost32Ent(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dStpPort,
                            this.dot1dStpPortPriority,
                            this.dot1dStpPortState,
                            this.dot1dStpPortEnable,
                            this.dot1dStpPortPathCost,
                            this.dot1dStpPortDesignatedRoot,
                            this.dot1dStpPortDesignatedCost,
                            this.dot1dStpPortDesignatedBridge,
                            this.dot1dStpPortDesignatedPort,
                            this.dot1dStpPortForwardTransitions,
                            this.dot1dStpPortPathCost32
                        };
                    }
                    public static final class Dot1dStpPortEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPort", "1.3.6.1.2.1.17.2.15.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortPriorityEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortPriorityEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortPriority", "1.3.6.1.2.1.17.2.15.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortStateEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortStateEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortState", "1.3.6.1.2.1.17.2.15.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortEnableEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortEnableEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortEnable", "1.3.6.1.2.1.17.2.15.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortPathCostEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortPathCostEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortPathCost", "1.3.6.1.2.1.17.2.15.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortDesignatedRootEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortDesignatedRootEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortDesignatedRoot", "1.3.6.1.2.1.17.2.15.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortDesignatedCostEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortDesignatedCostEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortDesignatedCost", "1.3.6.1.2.1.17.2.15.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortDesignatedBridgeEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortDesignatedBridgeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortDesignatedBridge", "1.3.6.1.2.1.17.2.15.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortDesignatedPortEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortDesignatedPortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortDesignatedPort", "1.3.6.1.2.1.17.2.15.1.9", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortForwardTransitionsEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortForwardTransitionsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortForwardTransitions", "1.3.6.1.2.1.17.2.15.1.10", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStpPortPathCost32Ent extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStpPortPathCost32Ent(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStpPortPathCost32", "1.3.6.1.2.1.17.2.15.1.11", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot1dSrEnt extends MIBEntry<BRIDGEMIBDef>
        {
            private Dot1dSrEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dSr", "1.3.6.1.2.1.17.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class Dot1dTpEnt extends MIBEntry<BRIDGEMIBDef>
        {
            /** ------------------------------the dot1dTp subtree------------------------------Implementation of the dot1dTp subtree is optional.  It isimplemented by those bridges that support the transparentbridging mode.  A transparent or SRT bridge will implementthis subtree.------------------------------*/
            public final Dot1dTpLearnedEntryDiscardsEnt dot1dTpLearnedEntryDiscards;

            public final Dot1dTpAgingTimeEnt dot1dTpAgingTime;

            /** ------------------------------The Forwarding Database for Transparent Bridges------------------------------*/
            public final Dot1dTpFdbTableEnt dot1dTpFdbTable;

            /** ------------------------------Port Table for Transparent Bridges------------------------------*/
            public final Dot1dTpPortTableEnt dot1dTpPortTable;

            private Dot1dTpEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dTp", "1.3.6.1.2.1.17.4", false, false, false, false);
                this.dot1dTpLearnedEntryDiscards = new Dot1dTpLearnedEntryDiscardsEnt(mib, this);
                this.dot1dTpAgingTime = new Dot1dTpAgingTimeEnt(mib, this);
                this.dot1dTpFdbTable = new Dot1dTpFdbTableEnt(mib, this);
                this.dot1dTpPortTable = new Dot1dTpPortTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dTpLearnedEntryDiscards,
                    this.dot1dTpAgingTime,
                    this.dot1dTpFdbTable,
                    this.dot1dTpPortTable
                };
            }
            public static final class Dot1dTpLearnedEntryDiscardsEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dTpLearnedEntryDiscardsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpLearnedEntryDiscards", "1.3.6.1.2.1.17.4.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dTpAgingTimeEnt extends MIBEntry<BRIDGEMIBDef>
            {
                private Dot1dTpAgingTimeEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpAgingTime", "1.3.6.1.2.1.17.4.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class Dot1dTpFdbTableEnt extends MIBEntry<BRIDGEMIBDef>
            {
                public final Dot1dTpFdbEntryEnt dot1dTpFdbEntry;

                private Dot1dTpFdbTableEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpFdbTable", "1.3.6.1.2.1.17.4.3", false, true, false, false);
                    this.dot1dTpFdbEntry = new Dot1dTpFdbEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dTpFdbEntry
                    };
                }
                public static final class Dot1dTpFdbEntryEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    public final Dot1dTpFdbAddressEnt dot1dTpFdbAddress;

                    public final Dot1dTpFdbPortEnt dot1dTpFdbPort;

                    public final Dot1dTpFdbStatusEnt dot1dTpFdbStatus;

                    private Dot1dTpFdbEntryEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTpFdbEntry", "1.3.6.1.2.1.17.4.3.1", false, false, false, true);
                        this.dot1dTpFdbAddress = new Dot1dTpFdbAddressEnt(mib, this);
                        this.dot1dTpFdbPort = new Dot1dTpFdbPortEnt(mib, this);
                        this.dot1dTpFdbStatus = new Dot1dTpFdbStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dTpFdbAddress,
                            this.dot1dTpFdbPort,
                            this.dot1dTpFdbStatus
                        };
                    }
                    public static final class Dot1dTpFdbAddressEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpFdbAddressEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpFdbAddress", "1.3.6.1.2.1.17.4.3.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dTpFdbPortEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpFdbPortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpFdbPort", "1.3.6.1.2.1.17.4.3.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dTpFdbStatusEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpFdbStatusEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpFdbStatus", "1.3.6.1.2.1.17.4.3.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class Dot1dTpPortTableEnt extends MIBEntry<BRIDGEMIBDef>
            {
                public final Dot1dTpPortEntryEnt dot1dTpPortEntry;

                private Dot1dTpPortTableEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dTpPortTable", "1.3.6.1.2.1.17.4.4", false, true, false, false);
                    this.dot1dTpPortEntry = new Dot1dTpPortEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dTpPortEntry
                    };
                }
                public static final class Dot1dTpPortEntryEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    public final Dot1dTpPortEnt dot1dTpPort;

                    /** It would be nice if we could use ifMtu as the size of thelargest INFO field, but we can't because ifMtu is definedto be the size that the (inter-)network layer can use, whichcan differ from the MAC layer (especially if several layersof encapsulation are used).*/
                    public final Dot1dTpPortMaxInfoEnt dot1dTpPortMaxInfo;

                    public final Dot1dTpPortInFramesEnt dot1dTpPortInFrames;

                    public final Dot1dTpPortOutFramesEnt dot1dTpPortOutFrames;

                    public final Dot1dTpPortInDiscardsEnt dot1dTpPortInDiscards;

                    private Dot1dTpPortEntryEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTpPortEntry", "1.3.6.1.2.1.17.4.4.1", false, false, false, true);
                        this.dot1dTpPort = new Dot1dTpPortEnt(mib, this);
                        this.dot1dTpPortMaxInfo = new Dot1dTpPortMaxInfoEnt(mib, this);
                        this.dot1dTpPortInFrames = new Dot1dTpPortInFramesEnt(mib, this);
                        this.dot1dTpPortOutFrames = new Dot1dTpPortOutFramesEnt(mib, this);
                        this.dot1dTpPortInDiscards = new Dot1dTpPortInDiscardsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dTpPort,
                            this.dot1dTpPortMaxInfo,
                            this.dot1dTpPortInFrames,
                            this.dot1dTpPortOutFrames,
                            this.dot1dTpPortInDiscards
                        };
                    }
                    public static final class Dot1dTpPortEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpPortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpPort", "1.3.6.1.2.1.17.4.4.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dTpPortMaxInfoEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpPortMaxInfoEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpPortMaxInfo", "1.3.6.1.2.1.17.4.4.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dTpPortInFramesEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpPortInFramesEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpPortInFrames", "1.3.6.1.2.1.17.4.4.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dTpPortOutFramesEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpPortOutFramesEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpPortOutFrames", "1.3.6.1.2.1.17.4.4.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dTpPortInDiscardsEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dTpPortInDiscardsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dTpPortInDiscards", "1.3.6.1.2.1.17.4.4.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot1dStaticEnt extends MIBEntry<BRIDGEMIBDef>
        {
            /** ------------------------------


The Static (Destination-Address Filtering) Database------------------------------Implementation of this subtree is optional.------------------------------*/
            public final Dot1dStaticTableEnt dot1dStaticTable;

            private Dot1dStaticEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dStatic", "1.3.6.1.2.1.17.5", false, false, false, false);
                this.dot1dStaticTable = new Dot1dStaticTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dStaticTable
                };
            }
            public static final class Dot1dStaticTableEnt extends MIBEntry<BRIDGEMIBDef>
            {
                public final Dot1dStaticEntryEnt dot1dStaticEntry;

                private Dot1dStaticTableEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dStaticTable", "1.3.6.1.2.1.17.5.1", false, true, false, false);
                    this.dot1dStaticEntry = new Dot1dStaticEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dStaticEntry
                    };
                }
                public static final class Dot1dStaticEntryEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    public final Dot1dStaticAddressEnt dot1dStaticAddress;

                    public final Dot1dStaticReceivePortEnt dot1dStaticReceivePort;

                    public final Dot1dStaticAllowedToGoToEnt dot1dStaticAllowedToGoTo;

                    public final Dot1dStaticStatusEnt dot1dStaticStatus;

                    private Dot1dStaticEntryEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStaticEntry", "1.3.6.1.2.1.17.5.1.1", false, false, false, true);
                        this.dot1dStaticAddress = new Dot1dStaticAddressEnt(mib, this);
                        this.dot1dStaticReceivePort = new Dot1dStaticReceivePortEnt(mib, this);
                        this.dot1dStaticAllowedToGoTo = new Dot1dStaticAllowedToGoToEnt(mib, this);
                        this.dot1dStaticStatus = new Dot1dStaticStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1dStaticAddress,
                            this.dot1dStaticReceivePort,
                            this.dot1dStaticAllowedToGoTo,
                            this.dot1dStaticStatus
                        };
                    }
                    public static final class Dot1dStaticAddressEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStaticAddressEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStaticAddress", "1.3.6.1.2.1.17.5.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStaticReceivePortEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStaticReceivePortEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStaticReceivePort", "1.3.6.1.2.1.17.5.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStaticAllowedToGoToEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStaticAllowedToGoToEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStaticAllowedToGoTo", "1.3.6.1.2.1.17.5.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class Dot1dStaticStatusEnt extends MIBEntry<BRIDGEMIBDef>
                    {
                        private Dot1dStaticStatusEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1dStaticStatus", "1.3.6.1.2.1.17.5.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class Dot1dConformanceEnt extends MIBEntry<BRIDGEMIBDef>
        {
            /** ------------------------------IEEE 802.1D MIB - Conformance Information------------------------------*/
            public final Dot1dGroupsEnt dot1dGroups;

            public final Dot1dCompliancesEnt dot1dCompliances;

            private Dot1dConformanceEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
            {
                super(mib, parent, "dot1dConformance", "1.3.6.1.2.1.17.8", false, false, false, false);
                this.dot1dGroups = new Dot1dGroupsEnt(mib, this);
                this.dot1dCompliances = new Dot1dCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1dGroups,
                    this.dot1dCompliances
                };
            }
            public static final class Dot1dGroupsEnt extends MIBEntry<BRIDGEMIBDef>
            {
                /** ------------------------------units of conformance------------------------------
------------------------------the dot1dBase group------------------------------*/
                public final Dot1dBaseBridgeGroupEnt dot1dBaseBridgeGroup;

                public final Dot1dBasePortGroupEnt dot1dBasePortGroup;

                /** ------------------------------the dot1dStp group------------------------------*/
                public final Dot1dStpBridgeGroupEnt dot1dStpBridgeGroup;

                public final Dot1dStpPortGroupEnt dot1dStpPortGroup;

                public final Dot1dStpPortGroup2Ent dot1dStpPortGroup2;

                public final Dot1dStpPortGroup3Ent dot1dStpPortGroup3;

                /** ------------------------------the dot1dTp group------------------------------*/
                public final Dot1dTpBridgeGroupEnt dot1dTpBridgeGroup;

                public final Dot1dTpFdbGroupEnt dot1dTpFdbGroup;

                public final Dot1dTpGroupEnt dot1dTpGroup;

                /** ------------------------------The Static (Destination-Address Filtering) Database------------------------------*/
                public final Dot1dStaticGroupEnt dot1dStaticGroup;

                /** ------------------------------The Trap Notification Group------------------------------*/
                public final Dot1dNotificationGroupEnt dot1dNotificationGroup;

                private Dot1dGroupsEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dGroups", "1.3.6.1.2.1.17.8.1", false, false, false, false);
                    this.dot1dBaseBridgeGroup = new Dot1dBaseBridgeGroupEnt(mib, this);
                    this.dot1dBasePortGroup = new Dot1dBasePortGroupEnt(mib, this);
                    this.dot1dStpBridgeGroup = new Dot1dStpBridgeGroupEnt(mib, this);
                    this.dot1dStpPortGroup = new Dot1dStpPortGroupEnt(mib, this);
                    this.dot1dStpPortGroup2 = new Dot1dStpPortGroup2Ent(mib, this);
                    this.dot1dStpPortGroup3 = new Dot1dStpPortGroup3Ent(mib, this);
                    this.dot1dTpBridgeGroup = new Dot1dTpBridgeGroupEnt(mib, this);
                    this.dot1dTpFdbGroup = new Dot1dTpFdbGroupEnt(mib, this);
                    this.dot1dTpGroup = new Dot1dTpGroupEnt(mib, this);
                    this.dot1dStaticGroup = new Dot1dStaticGroupEnt(mib, this);
                    this.dot1dNotificationGroup = new Dot1dNotificationGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1dBaseBridgeGroup,
                        this.dot1dBasePortGroup,
                        this.dot1dStpBridgeGroup,
                        this.dot1dStpPortGroup,
                        this.dot1dStpPortGroup2,
                        this.dot1dStpPortGroup3,
                        this.dot1dTpBridgeGroup,
                        this.dot1dTpFdbGroup,
                        this.dot1dTpGroup,
                        this.dot1dStaticGroup,
                        this.dot1dNotificationGroup
                    };
                }
                public static final class Dot1dBaseBridgeGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dBaseBridgeGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dBaseBridgeGroup", "1.3.6.1.2.1.17.8.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dBasePortGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dBasePortGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dBasePortGroup", "1.3.6.1.2.1.17.8.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dStpBridgeGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dStpBridgeGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStpBridgeGroup", "1.3.6.1.2.1.17.8.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dStpPortGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dStpPortGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStpPortGroup", "1.3.6.1.2.1.17.8.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dStpPortGroup2Ent extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dStpPortGroup2Ent(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStpPortGroup2", "1.3.6.1.2.1.17.8.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dStpPortGroup3Ent extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dStpPortGroup3Ent(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStpPortGroup3", "1.3.6.1.2.1.17.8.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dTpBridgeGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dTpBridgeGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTpBridgeGroup", "1.3.6.1.2.1.17.8.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dTpFdbGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dTpFdbGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTpFdbGroup", "1.3.6.1.2.1.17.8.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dTpGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dTpGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dTpGroup", "1.3.6.1.2.1.17.8.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dStaticGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dStaticGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dStaticGroup", "1.3.6.1.2.1.17.8.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1dNotificationGroupEnt extends MIBEntry<BRIDGEMIBDef>
                {
                    private Dot1dNotificationGroupEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1dNotificationGroup", "1.3.6.1.2.1.17.8.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot1dCompliancesEnt extends MIBEntry<BRIDGEMIBDef>
            {
                /** ------------------------------compliance statements------------------------------*/
                public final BridgeCompliance1493Ent bridgeCompliance1493;

                public final BridgeCompliance4188Ent bridgeCompliance4188;

                private Dot1dCompliancesEnt(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1dCompliances", "1.3.6.1.2.1.17.8.2", false, false, false, false);
                    this.bridgeCompliance1493 = new BridgeCompliance1493Ent(mib, this);
                    this.bridgeCompliance4188 = new BridgeCompliance4188Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.bridgeCompliance1493,
                        this.bridgeCompliance4188
                    };
                }
                public static final class BridgeCompliance1493Ent extends MIBEntry<BRIDGEMIBDef>
                {
                    private BridgeCompliance1493Ent(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "bridgeCompliance1493", "1.3.6.1.2.1.17.8.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class BridgeCompliance4188Ent extends MIBEntry<BRIDGEMIBDef>
                {
                    private BridgeCompliance4188Ent(BRIDGEMIBDef mib, MIBEntry<BRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "bridgeCompliance4188", "1.3.6.1.2.1.17.8.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
