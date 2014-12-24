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
MIB for IEEE 802.1Q Devices
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
public final class QBRIDGEMIBDef extends MIB
{
    public static final QBRIDGEMIBDef QBRIDGEMIB = new QBRIDGEMIBDef();

    public final QBridgeMIBEnt qBridgeMIB;

    private QBRIDGEMIBDef()
    {
        super("Q-BRIDGE-MIB");
        this.qBridgeMIB = new QBridgeMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.qBridgeMIB
        };
    }

    public static final class QBridgeMIBEnt extends MIBEntry<QBRIDGEMIBDef>
    {
        public final QBridgeMIBObjectsEnt qBridgeMIBObjects;

        /** -------------------------------IEEE 802.1Q MIB - Conformance Information-------------------------------*/
        public final QBridgeConformanceEnt qBridgeConformance;

        private QBridgeMIBEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
        {
            super(mib, parent, "qBridgeMIB", "1.3.6.1.2.1.17.7", false, false, false, false);
            this.qBridgeMIBObjects = new QBridgeMIBObjectsEnt(mib, this);
            this.qBridgeConformance = new QBridgeConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.qBridgeMIBObjects,
                this.qBridgeConformance
            };
        }
        public static final class QBridgeMIBObjectsEnt extends MIBEntry<QBRIDGEMIBDef>
        {
            /** -------------------------------subtrees in the Q-BRIDGE MIB-------------------------------*/
            public final Dot1qBaseEnt dot1qBase;

            public final Dot1qTpEnt dot1qTp;

            public final Dot1qStaticEnt dot1qStatic;

            public final Dot1qVlanEnt dot1qVlan;

            public final Dot1vProtocolEnt dot1vProtocol;

            private QBridgeMIBObjectsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
            {
                super(mib, parent, "qBridgeMIBObjects", "1.3.6.1.2.1.17.7.1", false, false, false, false);
                this.dot1qBase = new Dot1qBaseEnt(mib, this);
                this.dot1qTp = new Dot1qTpEnt(mib, this);
                this.dot1qStatic = new Dot1qStaticEnt(mib, this);
                this.dot1qVlan = new Dot1qVlanEnt(mib, this);
                this.dot1vProtocol = new Dot1vProtocolEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.dot1qBase,
                    this.dot1qTp,
                    this.dot1qStatic,
                    this.dot1qVlan,
                    this.dot1vProtocol
                };
            }
            public static final class Dot1qBaseEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------dot1qBase subtree-------------------------------*/
                public final Dot1qVlanVersionNumberEnt dot1qVlanVersionNumber;

                public final Dot1qMaxVlanIdEnt dot1qMaxVlanId;

                public final Dot1qMaxSupportedVlansEnt dot1qMaxSupportedVlans;

                public final Dot1qNumVlansEnt dot1qNumVlans;

                public final Dot1qGvrpStatusEnt dot1qGvrpStatus;

                private Dot1qBaseEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1qBase", "1.3.6.1.2.1.17.7.1.1", false, false, false, false);
                    this.dot1qVlanVersionNumber = new Dot1qVlanVersionNumberEnt(mib, this);
                    this.dot1qMaxVlanId = new Dot1qMaxVlanIdEnt(mib, this);
                    this.dot1qMaxSupportedVlans = new Dot1qMaxSupportedVlansEnt(mib, this);
                    this.dot1qNumVlans = new Dot1qNumVlansEnt(mib, this);
                    this.dot1qGvrpStatus = new Dot1qGvrpStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1qVlanVersionNumber,
                        this.dot1qMaxVlanId,
                        this.dot1qMaxSupportedVlans,
                        this.dot1qNumVlans,
                        this.dot1qGvrpStatus
                    };
                }
                public static final class Dot1qVlanVersionNumberEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qVlanVersionNumberEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qVlanVersionNumber", "1.3.6.1.2.1.17.7.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qMaxVlanIdEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qMaxVlanIdEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qMaxVlanId", "1.3.6.1.2.1.17.7.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qMaxSupportedVlansEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qMaxSupportedVlansEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qMaxSupportedVlans", "1.3.6.1.2.1.17.7.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qNumVlansEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qNumVlansEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qNumVlans", "1.3.6.1.2.1.17.7.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qGvrpStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qGvrpStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qGvrpStatus", "1.3.6.1.2.1.17.7.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot1qTpEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------


the dot1qTp subtree-------------------------------
-------------------------------the current Filtering Database Table-------------------------------*/
                public final Dot1qFdbTableEnt dot1qFdbTable;

                /** -------------------------------Multiple Forwarding Databases for 802.1Q Transparent DevicesThis table is an alternative to the dot1dTpFdbTable,previously defined for 802.1D devices that only support asingle Forwarding Database.-------------------------------*/
                public final Dot1qTpFdbTableEnt dot1qTpFdbTable;

                /** -------------------------------Dynamic Group Registration Table-------------------------------*/
                public final Dot1qTpGroupTableEnt dot1qTpGroupTable;

                /** -------------------------------Service Requirements subtree-------------------------------*/
                public final Dot1qForwardAllTableEnt dot1qForwardAllTable;

                public final Dot1qForwardUnregisteredTableEnt dot1qForwardUnregisteredTable;

                private Dot1qTpEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1qTp", "1.3.6.1.2.1.17.7.1.2", false, false, false, false);
                    this.dot1qFdbTable = new Dot1qFdbTableEnt(mib, this);
                    this.dot1qTpFdbTable = new Dot1qTpFdbTableEnt(mib, this);
                    this.dot1qTpGroupTable = new Dot1qTpGroupTableEnt(mib, this);
                    this.dot1qForwardAllTable = new Dot1qForwardAllTableEnt(mib, this);
                    this.dot1qForwardUnregisteredTable = new Dot1qForwardUnregisteredTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1qFdbTable,
                        this.dot1qTpFdbTable,
                        this.dot1qTpGroupTable,
                        this.dot1qForwardAllTable,
                        this.dot1qForwardUnregisteredTable
                    };
                }
                public static final class Dot1qFdbTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qFdbEntryEnt dot1qFdbEntry;

                    private Dot1qFdbTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qFdbTable", "1.3.6.1.2.1.17.7.1.2.1", false, true, false, false);
                        this.dot1qFdbEntry = new Dot1qFdbEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qFdbEntry
                        };
                    }
                    public static final class Dot1qFdbEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qFdbIdEnt dot1qFdbId;

                        public final Dot1qFdbDynamicCountEnt dot1qFdbDynamicCount;

                        private Dot1qFdbEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qFdbEntry", "1.3.6.1.2.1.17.7.1.2.1.1", false, false, false, true);
                            this.dot1qFdbId = new Dot1qFdbIdEnt(mib, this);
                            this.dot1qFdbDynamicCount = new Dot1qFdbDynamicCountEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qFdbId,
                                this.dot1qFdbDynamicCount
                            };
                        }
                        public static final class Dot1qFdbIdEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qFdbIdEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qFdbId", "1.3.6.1.2.1.17.7.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qFdbDynamicCountEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qFdbDynamicCountEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qFdbDynamicCount", "1.3.6.1.2.1.17.7.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qTpFdbTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qTpFdbEntryEnt dot1qTpFdbEntry;

                    private Dot1qTpFdbTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qTpFdbTable", "1.3.6.1.2.1.17.7.1.2.2", false, true, false, false);
                        this.dot1qTpFdbEntry = new Dot1qTpFdbEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qTpFdbEntry
                        };
                    }
                    public static final class Dot1qTpFdbEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qTpFdbAddressEnt dot1qTpFdbAddress;

                        public final Dot1qTpFdbPortEnt dot1qTpFdbPort;

                        public final Dot1qTpFdbStatusEnt dot1qTpFdbStatus;

                        private Dot1qTpFdbEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qTpFdbEntry", "1.3.6.1.2.1.17.7.1.2.2.1", false, false, false, true);
                            this.dot1qTpFdbAddress = new Dot1qTpFdbAddressEnt(mib, this);
                            this.dot1qTpFdbPort = new Dot1qTpFdbPortEnt(mib, this);
                            this.dot1qTpFdbStatus = new Dot1qTpFdbStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qTpFdbAddress,
                                this.dot1qTpFdbPort,
                                this.dot1qTpFdbStatus
                            };
                        }
                        public static final class Dot1qTpFdbAddressEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpFdbAddressEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpFdbAddress", "1.3.6.1.2.1.17.7.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpFdbPortEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpFdbPortEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpFdbPort", "1.3.6.1.2.1.17.7.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpFdbStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpFdbStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpFdbStatus", "1.3.6.1.2.1.17.7.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qTpGroupTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qTpGroupEntryEnt dot1qTpGroupEntry;

                    private Dot1qTpGroupTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qTpGroupTable", "1.3.6.1.2.1.17.7.1.2.3", false, true, false, false);
                        this.dot1qTpGroupEntry = new Dot1qTpGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qTpGroupEntry
                        };
                    }
                    public static final class Dot1qTpGroupEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qTpGroupAddressEnt dot1qTpGroupAddress;

                        public final Dot1qTpGroupEgressPortsEnt dot1qTpGroupEgressPorts;

                        public final Dot1qTpGroupLearntEnt dot1qTpGroupLearnt;

                        private Dot1qTpGroupEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qTpGroupEntry", "1.3.6.1.2.1.17.7.1.2.3.1", false, false, false, true);
                            this.dot1qTpGroupAddress = new Dot1qTpGroupAddressEnt(mib, this);
                            this.dot1qTpGroupEgressPorts = new Dot1qTpGroupEgressPortsEnt(mib, this);
                            this.dot1qTpGroupLearnt = new Dot1qTpGroupLearntEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qTpGroupAddress,
                                this.dot1qTpGroupEgressPorts,
                                this.dot1qTpGroupLearnt
                            };
                        }
                        public static final class Dot1qTpGroupAddressEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpGroupAddressEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpGroupAddress", "1.3.6.1.2.1.17.7.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpGroupEgressPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpGroupEgressPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpGroupEgressPorts", "1.3.6.1.2.1.17.7.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpGroupLearntEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpGroupLearntEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpGroupLearnt", "1.3.6.1.2.1.17.7.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qForwardAllTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qForwardAllEntryEnt dot1qForwardAllEntry;

                    private Dot1qForwardAllTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qForwardAllTable", "1.3.6.1.2.1.17.7.1.2.4", false, true, false, false);
                        this.dot1qForwardAllEntry = new Dot1qForwardAllEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qForwardAllEntry
                        };
                    }
                    public static final class Dot1qForwardAllEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qForwardAllPortsEnt dot1qForwardAllPorts;

                        public final Dot1qForwardAllStaticPortsEnt dot1qForwardAllStaticPorts;

                        public final Dot1qForwardAllForbiddenPortsEnt dot1qForwardAllForbiddenPorts;

                        private Dot1qForwardAllEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qForwardAllEntry", "1.3.6.1.2.1.17.7.1.2.4.1", false, false, false, true);
                            this.dot1qForwardAllPorts = new Dot1qForwardAllPortsEnt(mib, this);
                            this.dot1qForwardAllStaticPorts = new Dot1qForwardAllStaticPortsEnt(mib, this);
                            this.dot1qForwardAllForbiddenPorts = new Dot1qForwardAllForbiddenPortsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qForwardAllPorts,
                                this.dot1qForwardAllStaticPorts,
                                this.dot1qForwardAllForbiddenPorts
                            };
                        }
                        public static final class Dot1qForwardAllPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qForwardAllPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qForwardAllPorts", "1.3.6.1.2.1.17.7.1.2.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qForwardAllStaticPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qForwardAllStaticPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qForwardAllStaticPorts", "1.3.6.1.2.1.17.7.1.2.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qForwardAllForbiddenPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qForwardAllForbiddenPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qForwardAllForbiddenPorts", "1.3.6.1.2.1.17.7.1.2.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qForwardUnregisteredTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qForwardUnregisteredEntryEnt dot1qForwardUnregisteredEntry;

                    private Dot1qForwardUnregisteredTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qForwardUnregisteredTable", "1.3.6.1.2.1.17.7.1.2.5", false, true, false, false);
                        this.dot1qForwardUnregisteredEntry = new Dot1qForwardUnregisteredEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qForwardUnregisteredEntry
                        };
                    }
                    public static final class Dot1qForwardUnregisteredEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qForwardUnregisteredPortsEnt dot1qForwardUnregisteredPorts;

                        public final Dot1qForwardUnregisteredStaticPortsEnt dot1qForwardUnregisteredStaticPorts;

                        public final Dot1qForwardUnregisteredForbiddenPortsEnt dot1qForwardUnregisteredForbiddenPorts;

                        private Dot1qForwardUnregisteredEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qForwardUnregisteredEntry", "1.3.6.1.2.1.17.7.1.2.5.1", false, false, false, true);
                            this.dot1qForwardUnregisteredPorts = new Dot1qForwardUnregisteredPortsEnt(mib, this);
                            this.dot1qForwardUnregisteredStaticPorts = new Dot1qForwardUnregisteredStaticPortsEnt(mib, this);
                            this.dot1qForwardUnregisteredForbiddenPorts = new Dot1qForwardUnregisteredForbiddenPortsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qForwardUnregisteredPorts,
                                this.dot1qForwardUnregisteredStaticPorts,
                                this.dot1qForwardUnregisteredForbiddenPorts
                            };
                        }
                        public static final class Dot1qForwardUnregisteredPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qForwardUnregisteredPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qForwardUnregisteredPorts", "1.3.6.1.2.1.17.7.1.2.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qForwardUnregisteredStaticPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qForwardUnregisteredStaticPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qForwardUnregisteredStaticPorts", "1.3.6.1.2.1.17.7.1.2.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qForwardUnregisteredForbiddenPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qForwardUnregisteredForbiddenPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qForwardUnregisteredForbiddenPorts", "1.3.6.1.2.1.17.7.1.2.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot1qStaticEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------The Static (Destination-Address Filtering) Database-------------------------------*/
                public final Dot1qStaticUnicastTableEnt dot1qStaticUnicastTable;

                public final Dot1qStaticMulticastTableEnt dot1qStaticMulticastTable;

                private Dot1qStaticEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1qStatic", "1.3.6.1.2.1.17.7.1.3", false, false, false, false);
                    this.dot1qStaticUnicastTable = new Dot1qStaticUnicastTableEnt(mib, this);
                    this.dot1qStaticMulticastTable = new Dot1qStaticMulticastTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1qStaticUnicastTable,
                        this.dot1qStaticMulticastTable
                    };
                }
                public static final class Dot1qStaticUnicastTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qStaticUnicastEntryEnt dot1qStaticUnicastEntry;

                    private Dot1qStaticUnicastTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qStaticUnicastTable", "1.3.6.1.2.1.17.7.1.3.1", false, true, false, false);
                        this.dot1qStaticUnicastEntry = new Dot1qStaticUnicastEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qStaticUnicastEntry
                        };
                    }
                    public static final class Dot1qStaticUnicastEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qStaticUnicastAddressEnt dot1qStaticUnicastAddress;

                        public final Dot1qStaticUnicastReceivePortEnt dot1qStaticUnicastReceivePort;

                        public final Dot1qStaticUnicastAllowedToGoToEnt dot1qStaticUnicastAllowedToGoTo;

                        public final Dot1qStaticUnicastStatusEnt dot1qStaticUnicastStatus;

                        private Dot1qStaticUnicastEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qStaticUnicastEntry", "1.3.6.1.2.1.17.7.1.3.1.1", false, false, false, true);
                            this.dot1qStaticUnicastAddress = new Dot1qStaticUnicastAddressEnt(mib, this);
                            this.dot1qStaticUnicastReceivePort = new Dot1qStaticUnicastReceivePortEnt(mib, this);
                            this.dot1qStaticUnicastAllowedToGoTo = new Dot1qStaticUnicastAllowedToGoToEnt(mib, this);
                            this.dot1qStaticUnicastStatus = new Dot1qStaticUnicastStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qStaticUnicastAddress,
                                this.dot1qStaticUnicastReceivePort,
                                this.dot1qStaticUnicastAllowedToGoTo,
                                this.dot1qStaticUnicastStatus
                            };
                        }
                        public static final class Dot1qStaticUnicastAddressEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticUnicastAddressEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticUnicastAddress", "1.3.6.1.2.1.17.7.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticUnicastReceivePortEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticUnicastReceivePortEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticUnicastReceivePort", "1.3.6.1.2.1.17.7.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticUnicastAllowedToGoToEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticUnicastAllowedToGoToEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticUnicastAllowedToGoTo", "1.3.6.1.2.1.17.7.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticUnicastStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticUnicastStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticUnicastStatus", "1.3.6.1.2.1.17.7.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qStaticMulticastTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qStaticMulticastEntryEnt dot1qStaticMulticastEntry;

                    private Dot1qStaticMulticastTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qStaticMulticastTable", "1.3.6.1.2.1.17.7.1.3.2", false, true, false, false);
                        this.dot1qStaticMulticastEntry = new Dot1qStaticMulticastEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qStaticMulticastEntry
                        };
                    }
                    public static final class Dot1qStaticMulticastEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qStaticMulticastAddressEnt dot1qStaticMulticastAddress;

                        public final Dot1qStaticMulticastReceivePortEnt dot1qStaticMulticastReceivePort;

                        public final Dot1qStaticMulticastStaticEgressPortsEnt dot1qStaticMulticastStaticEgressPorts;

                        public final Dot1qStaticMulticastForbiddenEgressPortsEnt dot1qStaticMulticastForbiddenEgressPorts;

                        public final Dot1qStaticMulticastStatusEnt dot1qStaticMulticastStatus;

                        private Dot1qStaticMulticastEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qStaticMulticastEntry", "1.3.6.1.2.1.17.7.1.3.2.1", false, false, false, true);
                            this.dot1qStaticMulticastAddress = new Dot1qStaticMulticastAddressEnt(mib, this);
                            this.dot1qStaticMulticastReceivePort = new Dot1qStaticMulticastReceivePortEnt(mib, this);
                            this.dot1qStaticMulticastStaticEgressPorts = new Dot1qStaticMulticastStaticEgressPortsEnt(mib, this);
                            this.dot1qStaticMulticastForbiddenEgressPorts = new Dot1qStaticMulticastForbiddenEgressPortsEnt(mib, this);
                            this.dot1qStaticMulticastStatus = new Dot1qStaticMulticastStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qStaticMulticastAddress,
                                this.dot1qStaticMulticastReceivePort,
                                this.dot1qStaticMulticastStaticEgressPorts,
                                this.dot1qStaticMulticastForbiddenEgressPorts,
                                this.dot1qStaticMulticastStatus
                            };
                        }
                        public static final class Dot1qStaticMulticastAddressEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticMulticastAddressEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticMulticastAddress", "1.3.6.1.2.1.17.7.1.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticMulticastReceivePortEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticMulticastReceivePortEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticMulticastReceivePort", "1.3.6.1.2.1.17.7.1.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticMulticastStaticEgressPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticMulticastStaticEgressPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticMulticastStaticEgressPorts", "1.3.6.1.2.1.17.7.1.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticMulticastForbiddenEgressPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticMulticastForbiddenEgressPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticMulticastForbiddenEgressPorts", "1.3.6.1.2.1.17.7.1.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qStaticMulticastStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qStaticMulticastStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qStaticMulticastStatus", "1.3.6.1.2.1.17.7.1.3.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class Dot1qVlanEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------The Current VLAN Database-------------------------------*/
                public final Dot1qVlanNumDeletesEnt dot1qVlanNumDeletes;

                public final Dot1qVlanCurrentTableEnt dot1qVlanCurrentTable;

                /** -------------------------------The Static VLAN Database-------------------------------*/
                public final Dot1qVlanStaticTableEnt dot1qVlanStaticTable;

                public final Dot1qNextFreeLocalVlanIndexEnt dot1qNextFreeLocalVlanIndex;

                /** -------------------------------The VLAN Port Configuration Table-------------------------------*/
                public final Dot1qPortVlanTableEnt dot1qPortVlanTable;

                /** -------------------------------Per port VLAN Statistics Table-------------------------------*/
                public final Dot1qPortVlanStatisticsTableEnt dot1qPortVlanStatisticsTable;

                public final Dot1qPortVlanHCStatisticsTableEnt dot1qPortVlanHCStatisticsTable;

                /** -------------------------------The VLAN Learning Constraints Table-------------------------------*/
                public final Dot1qLearningConstraintsTableEnt dot1qLearningConstraintsTable;

                public final Dot1qConstraintSetDefaultEnt dot1qConstraintSetDefault;

                public final Dot1qConstraintTypeDefaultEnt dot1qConstraintTypeDefault;

                private Dot1qVlanEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1qVlan", "1.3.6.1.2.1.17.7.1.4", false, false, false, false);
                    this.dot1qVlanNumDeletes = new Dot1qVlanNumDeletesEnt(mib, this);
                    this.dot1qVlanCurrentTable = new Dot1qVlanCurrentTableEnt(mib, this);
                    this.dot1qVlanStaticTable = new Dot1qVlanStaticTableEnt(mib, this);
                    this.dot1qNextFreeLocalVlanIndex = new Dot1qNextFreeLocalVlanIndexEnt(mib, this);
                    this.dot1qPortVlanTable = new Dot1qPortVlanTableEnt(mib, this);
                    this.dot1qPortVlanStatisticsTable = new Dot1qPortVlanStatisticsTableEnt(mib, this);
                    this.dot1qPortVlanHCStatisticsTable = new Dot1qPortVlanHCStatisticsTableEnt(mib, this);
                    this.dot1qLearningConstraintsTable = new Dot1qLearningConstraintsTableEnt(mib, this);
                    this.dot1qConstraintSetDefault = new Dot1qConstraintSetDefaultEnt(mib, this);
                    this.dot1qConstraintTypeDefault = new Dot1qConstraintTypeDefaultEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1qVlanNumDeletes,
                        this.dot1qVlanCurrentTable,
                        this.dot1qVlanStaticTable,
                        this.dot1qNextFreeLocalVlanIndex,
                        this.dot1qPortVlanTable,
                        this.dot1qPortVlanStatisticsTable,
                        this.dot1qPortVlanHCStatisticsTable,
                        this.dot1qLearningConstraintsTable,
                        this.dot1qConstraintSetDefault,
                        this.dot1qConstraintTypeDefault
                    };
                }
                public static final class Dot1qVlanNumDeletesEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qVlanNumDeletesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qVlanNumDeletes", "1.3.6.1.2.1.17.7.1.4.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qVlanCurrentTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qVlanCurrentEntryEnt dot1qVlanCurrentEntry;

                    private Dot1qVlanCurrentTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qVlanCurrentTable", "1.3.6.1.2.1.17.7.1.4.2", false, true, false, false);
                        this.dot1qVlanCurrentEntry = new Dot1qVlanCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qVlanCurrentEntry
                        };
                    }
                    public static final class Dot1qVlanCurrentEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qVlanTimeMarkEnt dot1qVlanTimeMark;

                        public final Dot1qVlanIndexEnt dot1qVlanIndex;

                        public final Dot1qVlanFdbIdEnt dot1qVlanFdbId;

                        public final Dot1qVlanCurrentEgressPortsEnt dot1qVlanCurrentEgressPorts;

                        public final Dot1qVlanCurrentUntaggedPortsEnt dot1qVlanCurrentUntaggedPorts;

                        public final Dot1qVlanStatusEnt dot1qVlanStatus;

                        public final Dot1qVlanCreationTimeEnt dot1qVlanCreationTime;

                        private Dot1qVlanCurrentEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qVlanCurrentEntry", "1.3.6.1.2.1.17.7.1.4.2.1", false, false, false, true);
                            this.dot1qVlanTimeMark = new Dot1qVlanTimeMarkEnt(mib, this);
                            this.dot1qVlanIndex = new Dot1qVlanIndexEnt(mib, this);
                            this.dot1qVlanFdbId = new Dot1qVlanFdbIdEnt(mib, this);
                            this.dot1qVlanCurrentEgressPorts = new Dot1qVlanCurrentEgressPortsEnt(mib, this);
                            this.dot1qVlanCurrentUntaggedPorts = new Dot1qVlanCurrentUntaggedPortsEnt(mib, this);
                            this.dot1qVlanStatus = new Dot1qVlanStatusEnt(mib, this);
                            this.dot1qVlanCreationTime = new Dot1qVlanCreationTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qVlanTimeMark,
                                this.dot1qVlanIndex,
                                this.dot1qVlanFdbId,
                                this.dot1qVlanCurrentEgressPorts,
                                this.dot1qVlanCurrentUntaggedPorts,
                                this.dot1qVlanStatus,
                                this.dot1qVlanCreationTime
                            };
                        }
                        public static final class Dot1qVlanTimeMarkEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanTimeMarkEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanTimeMark", "1.3.6.1.2.1.17.7.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanIndexEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanIndexEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanIndex", "1.3.6.1.2.1.17.7.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanFdbIdEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanFdbIdEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanFdbId", "1.3.6.1.2.1.17.7.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanCurrentEgressPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanCurrentEgressPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanCurrentEgressPorts", "1.3.6.1.2.1.17.7.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanCurrentUntaggedPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanCurrentUntaggedPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanCurrentUntaggedPorts", "1.3.6.1.2.1.17.7.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanStatus", "1.3.6.1.2.1.17.7.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanCreationTimeEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanCreationTimeEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanCreationTime", "1.3.6.1.2.1.17.7.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qVlanStaticTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qVlanStaticEntryEnt dot1qVlanStaticEntry;

                    private Dot1qVlanStaticTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qVlanStaticTable", "1.3.6.1.2.1.17.7.1.4.3", false, true, false, false);
                        this.dot1qVlanStaticEntry = new Dot1qVlanStaticEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qVlanStaticEntry
                        };
                    }
                    public static final class Dot1qVlanStaticEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qVlanStaticNameEnt dot1qVlanStaticName;

                        public final Dot1qVlanStaticEgressPortsEnt dot1qVlanStaticEgressPorts;

                        public final Dot1qVlanForbiddenEgressPortsEnt dot1qVlanForbiddenEgressPorts;

                        public final Dot1qVlanStaticUntaggedPortsEnt dot1qVlanStaticUntaggedPorts;

                        public final Dot1qVlanStaticRowStatusEnt dot1qVlanStaticRowStatus;

                        private Dot1qVlanStaticEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qVlanStaticEntry", "1.3.6.1.2.1.17.7.1.4.3.1", false, false, false, true);
                            this.dot1qVlanStaticName = new Dot1qVlanStaticNameEnt(mib, this);
                            this.dot1qVlanStaticEgressPorts = new Dot1qVlanStaticEgressPortsEnt(mib, this);
                            this.dot1qVlanForbiddenEgressPorts = new Dot1qVlanForbiddenEgressPortsEnt(mib, this);
                            this.dot1qVlanStaticUntaggedPorts = new Dot1qVlanStaticUntaggedPortsEnt(mib, this);
                            this.dot1qVlanStaticRowStatus = new Dot1qVlanStaticRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qVlanStaticName,
                                this.dot1qVlanStaticEgressPorts,
                                this.dot1qVlanForbiddenEgressPorts,
                                this.dot1qVlanStaticUntaggedPorts,
                                this.dot1qVlanStaticRowStatus
                            };
                        }
                        public static final class Dot1qVlanStaticNameEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanStaticNameEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanStaticName", "1.3.6.1.2.1.17.7.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanStaticEgressPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanStaticEgressPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanStaticEgressPorts", "1.3.6.1.2.1.17.7.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanForbiddenEgressPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanForbiddenEgressPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanForbiddenEgressPorts", "1.3.6.1.2.1.17.7.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanStaticUntaggedPortsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanStaticUntaggedPortsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanStaticUntaggedPorts", "1.3.6.1.2.1.17.7.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qVlanStaticRowStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qVlanStaticRowStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qVlanStaticRowStatus", "1.3.6.1.2.1.17.7.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qNextFreeLocalVlanIndexEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qNextFreeLocalVlanIndexEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qNextFreeLocalVlanIndex", "1.3.6.1.2.1.17.7.1.4.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qPortVlanTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qPortVlanEntryEnt dot1qPortVlanEntry;

                    private Dot1qPortVlanTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qPortVlanTable", "1.3.6.1.2.1.17.7.1.4.5", false, true, false, false);
                        this.dot1qPortVlanEntry = new Dot1qPortVlanEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qPortVlanEntry
                        };
                    }
                    public static final class Dot1qPortVlanEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qPvidEnt dot1qPvid;

                        public final Dot1qPortAcceptableFrameTypesEnt dot1qPortAcceptableFrameTypes;

                        public final Dot1qPortIngressFilteringEnt dot1qPortIngressFiltering;

                        public final Dot1qPortGvrpStatusEnt dot1qPortGvrpStatus;

                        public final Dot1qPortGvrpFailedRegistrationsEnt dot1qPortGvrpFailedRegistrations;

                        public final Dot1qPortGvrpLastPduOriginEnt dot1qPortGvrpLastPduOrigin;

                        public final Dot1qPortRestrictedVlanRegistrationEnt dot1qPortRestrictedVlanRegistration;

                        private Dot1qPortVlanEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qPortVlanEntry", "1.3.6.1.2.1.17.7.1.4.5.1", false, false, false, true);
                            this.dot1qPvid = new Dot1qPvidEnt(mib, this);
                            this.dot1qPortAcceptableFrameTypes = new Dot1qPortAcceptableFrameTypesEnt(mib, this);
                            this.dot1qPortIngressFiltering = new Dot1qPortIngressFilteringEnt(mib, this);
                            this.dot1qPortGvrpStatus = new Dot1qPortGvrpStatusEnt(mib, this);
                            this.dot1qPortGvrpFailedRegistrations = new Dot1qPortGvrpFailedRegistrationsEnt(mib, this);
                            this.dot1qPortGvrpLastPduOrigin = new Dot1qPortGvrpLastPduOriginEnt(mib, this);
                            this.dot1qPortRestrictedVlanRegistration = new Dot1qPortRestrictedVlanRegistrationEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qPvid,
                                this.dot1qPortAcceptableFrameTypes,
                                this.dot1qPortIngressFiltering,
                                this.dot1qPortGvrpStatus,
                                this.dot1qPortGvrpFailedRegistrations,
                                this.dot1qPortGvrpLastPduOrigin,
                                this.dot1qPortRestrictedVlanRegistration
                            };
                        }
                        public static final class Dot1qPvidEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPvidEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPvid", "1.3.6.1.2.1.17.7.1.4.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qPortAcceptableFrameTypesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPortAcceptableFrameTypesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPortAcceptableFrameTypes", "1.3.6.1.2.1.17.7.1.4.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qPortIngressFilteringEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPortIngressFilteringEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPortIngressFiltering", "1.3.6.1.2.1.17.7.1.4.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qPortGvrpStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPortGvrpStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPortGvrpStatus", "1.3.6.1.2.1.17.7.1.4.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qPortGvrpFailedRegistrationsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPortGvrpFailedRegistrationsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPortGvrpFailedRegistrations", "1.3.6.1.2.1.17.7.1.4.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qPortGvrpLastPduOriginEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPortGvrpLastPduOriginEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPortGvrpLastPduOrigin", "1.3.6.1.2.1.17.7.1.4.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qPortRestrictedVlanRegistrationEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qPortRestrictedVlanRegistrationEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qPortRestrictedVlanRegistration", "1.3.6.1.2.1.17.7.1.4.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qPortVlanStatisticsTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qPortVlanStatisticsEntryEnt dot1qPortVlanStatisticsEntry;

                    private Dot1qPortVlanStatisticsTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qPortVlanStatisticsTable", "1.3.6.1.2.1.17.7.1.4.6", false, true, false, false);
                        this.dot1qPortVlanStatisticsEntry = new Dot1qPortVlanStatisticsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qPortVlanStatisticsEntry
                        };
                    }
                    public static final class Dot1qPortVlanStatisticsEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qTpVlanPortInFramesEnt dot1qTpVlanPortInFrames;

                        public final Dot1qTpVlanPortOutFramesEnt dot1qTpVlanPortOutFrames;

                        public final Dot1qTpVlanPortInDiscardsEnt dot1qTpVlanPortInDiscards;

                        public final Dot1qTpVlanPortInOverflowFramesEnt dot1qTpVlanPortInOverflowFrames;

                        public final Dot1qTpVlanPortOutOverflowFramesEnt dot1qTpVlanPortOutOverflowFrames;

                        public final Dot1qTpVlanPortInOverflowDiscardsEnt dot1qTpVlanPortInOverflowDiscards;

                        private Dot1qPortVlanStatisticsEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qPortVlanStatisticsEntry", "1.3.6.1.2.1.17.7.1.4.6.1", false, false, false, true);
                            this.dot1qTpVlanPortInFrames = new Dot1qTpVlanPortInFramesEnt(mib, this);
                            this.dot1qTpVlanPortOutFrames = new Dot1qTpVlanPortOutFramesEnt(mib, this);
                            this.dot1qTpVlanPortInDiscards = new Dot1qTpVlanPortInDiscardsEnt(mib, this);
                            this.dot1qTpVlanPortInOverflowFrames = new Dot1qTpVlanPortInOverflowFramesEnt(mib, this);
                            this.dot1qTpVlanPortOutOverflowFrames = new Dot1qTpVlanPortOutOverflowFramesEnt(mib, this);
                            this.dot1qTpVlanPortInOverflowDiscards = new Dot1qTpVlanPortInOverflowDiscardsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qTpVlanPortInFrames,
                                this.dot1qTpVlanPortOutFrames,
                                this.dot1qTpVlanPortInDiscards,
                                this.dot1qTpVlanPortInOverflowFrames,
                                this.dot1qTpVlanPortOutOverflowFrames,
                                this.dot1qTpVlanPortInOverflowDiscards
                            };
                        }
                        public static final class Dot1qTpVlanPortInFramesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortInFramesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortInFrames", "1.3.6.1.2.1.17.7.1.4.6.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortOutFramesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortOutFramesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortOutFrames", "1.3.6.1.2.1.17.7.1.4.6.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortInDiscardsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortInDiscardsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortInDiscards", "1.3.6.1.2.1.17.7.1.4.6.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortInOverflowFramesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortInOverflowFramesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortInOverflowFrames", "1.3.6.1.2.1.17.7.1.4.6.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortOutOverflowFramesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortOutOverflowFramesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortOutOverflowFrames", "1.3.6.1.2.1.17.7.1.4.6.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortInOverflowDiscardsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortInOverflowDiscardsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortInOverflowDiscards", "1.3.6.1.2.1.17.7.1.4.6.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qPortVlanHCStatisticsTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qPortVlanHCStatisticsEntryEnt dot1qPortVlanHCStatisticsEntry;

                    private Dot1qPortVlanHCStatisticsTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qPortVlanHCStatisticsTable", "1.3.6.1.2.1.17.7.1.4.7", false, true, false, false);
                        this.dot1qPortVlanHCStatisticsEntry = new Dot1qPortVlanHCStatisticsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qPortVlanHCStatisticsEntry
                        };
                    }
                    public static final class Dot1qPortVlanHCStatisticsEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qTpVlanPortHCInFramesEnt dot1qTpVlanPortHCInFrames;

                        public final Dot1qTpVlanPortHCOutFramesEnt dot1qTpVlanPortHCOutFrames;

                        public final Dot1qTpVlanPortHCInDiscardsEnt dot1qTpVlanPortHCInDiscards;

                        private Dot1qPortVlanHCStatisticsEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qPortVlanHCStatisticsEntry", "1.3.6.1.2.1.17.7.1.4.7.1", false, false, false, true);
                            this.dot1qTpVlanPortHCInFrames = new Dot1qTpVlanPortHCInFramesEnt(mib, this);
                            this.dot1qTpVlanPortHCOutFrames = new Dot1qTpVlanPortHCOutFramesEnt(mib, this);
                            this.dot1qTpVlanPortHCInDiscards = new Dot1qTpVlanPortHCInDiscardsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qTpVlanPortHCInFrames,
                                this.dot1qTpVlanPortHCOutFrames,
                                this.dot1qTpVlanPortHCInDiscards
                            };
                        }
                        public static final class Dot1qTpVlanPortHCInFramesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortHCInFramesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortHCInFrames", "1.3.6.1.2.1.17.7.1.4.7.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortHCOutFramesEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortHCOutFramesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortHCOutFrames", "1.3.6.1.2.1.17.7.1.4.7.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qTpVlanPortHCInDiscardsEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qTpVlanPortHCInDiscardsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qTpVlanPortHCInDiscards", "1.3.6.1.2.1.17.7.1.4.7.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qLearningConstraintsTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1qLearningConstraintsEntryEnt dot1qLearningConstraintsEntry;

                    private Dot1qLearningConstraintsTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qLearningConstraintsTable", "1.3.6.1.2.1.17.7.1.4.8", false, true, false, false);
                        this.dot1qLearningConstraintsEntry = new Dot1qLearningConstraintsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1qLearningConstraintsEntry
                        };
                    }
                    public static final class Dot1qLearningConstraintsEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1qConstraintVlanEnt dot1qConstraintVlan;

                        public final Dot1qConstraintSetEnt dot1qConstraintSet;

                        public final Dot1qConstraintTypeEnt dot1qConstraintType;

                        public final Dot1qConstraintStatusEnt dot1qConstraintStatus;

                        private Dot1qLearningConstraintsEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1qLearningConstraintsEntry", "1.3.6.1.2.1.17.7.1.4.8.1", false, false, false, true);
                            this.dot1qConstraintVlan = new Dot1qConstraintVlanEnt(mib, this);
                            this.dot1qConstraintSet = new Dot1qConstraintSetEnt(mib, this);
                            this.dot1qConstraintType = new Dot1qConstraintTypeEnt(mib, this);
                            this.dot1qConstraintStatus = new Dot1qConstraintStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1qConstraintVlan,
                                this.dot1qConstraintSet,
                                this.dot1qConstraintType,
                                this.dot1qConstraintStatus
                            };
                        }
                        public static final class Dot1qConstraintVlanEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qConstraintVlanEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qConstraintVlan", "1.3.6.1.2.1.17.7.1.4.8.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qConstraintSetEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qConstraintSetEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qConstraintSet", "1.3.6.1.2.1.17.7.1.4.8.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qConstraintTypeEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qConstraintTypeEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qConstraintType", "1.3.6.1.2.1.17.7.1.4.8.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1qConstraintStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1qConstraintStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1qConstraintStatus", "1.3.6.1.2.1.17.7.1.4.8.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1qConstraintSetDefaultEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qConstraintSetDefaultEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qConstraintSetDefault", "1.3.6.1.2.1.17.7.1.4.9", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class Dot1qConstraintTypeDefaultEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private Dot1qConstraintTypeDefaultEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1qConstraintTypeDefault", "1.3.6.1.2.1.17.7.1.4.10", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class Dot1vProtocolEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------dot1vProtocol subtree-------------------------------*/
                public final Dot1vProtocolGroupTableEnt dot1vProtocolGroupTable;

                public final Dot1vProtocolPortTableEnt dot1vProtocolPortTable;

                private Dot1vProtocolEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "dot1vProtocol", "1.3.6.1.2.1.17.7.1.5", false, false, false, false);
                    this.dot1vProtocolGroupTable = new Dot1vProtocolGroupTableEnt(mib, this);
                    this.dot1vProtocolPortTable = new Dot1vProtocolPortTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.dot1vProtocolGroupTable,
                        this.dot1vProtocolPortTable
                    };
                }
                public static final class Dot1vProtocolGroupTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1vProtocolGroupEntryEnt dot1vProtocolGroupEntry;

                    private Dot1vProtocolGroupTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1vProtocolGroupTable", "1.3.6.1.2.1.17.7.1.5.1", false, true, false, false);
                        this.dot1vProtocolGroupEntry = new Dot1vProtocolGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1vProtocolGroupEntry
                        };
                    }
                    public static final class Dot1vProtocolGroupEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1vProtocolTemplateFrameTypeEnt dot1vProtocolTemplateFrameType;

                        public final Dot1vProtocolTemplateProtocolValueEnt dot1vProtocolTemplateProtocolValue;

                        public final Dot1vProtocolGroupIdEnt dot1vProtocolGroupId;

                        public final Dot1vProtocolGroupRowStatusEnt dot1vProtocolGroupRowStatus;

                        private Dot1vProtocolGroupEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1vProtocolGroupEntry", "1.3.6.1.2.1.17.7.1.5.1.1", false, false, false, true);
                            this.dot1vProtocolTemplateFrameType = new Dot1vProtocolTemplateFrameTypeEnt(mib, this);
                            this.dot1vProtocolTemplateProtocolValue = new Dot1vProtocolTemplateProtocolValueEnt(mib, this);
                            this.dot1vProtocolGroupId = new Dot1vProtocolGroupIdEnt(mib, this);
                            this.dot1vProtocolGroupRowStatus = new Dot1vProtocolGroupRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1vProtocolTemplateFrameType,
                                this.dot1vProtocolTemplateProtocolValue,
                                this.dot1vProtocolGroupId,
                                this.dot1vProtocolGroupRowStatus
                            };
                        }
                        public static final class Dot1vProtocolTemplateFrameTypeEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolTemplateFrameTypeEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolTemplateFrameType", "1.3.6.1.2.1.17.7.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1vProtocolTemplateProtocolValueEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolTemplateProtocolValueEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolTemplateProtocolValue", "1.3.6.1.2.1.17.7.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1vProtocolGroupIdEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolGroupIdEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolGroupId", "1.3.6.1.2.1.17.7.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1vProtocolGroupRowStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolGroupRowStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolGroupRowStatus", "1.3.6.1.2.1.17.7.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class Dot1vProtocolPortTableEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    public final Dot1vProtocolPortEntryEnt dot1vProtocolPortEntry;

                    private Dot1vProtocolPortTableEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "dot1vProtocolPortTable", "1.3.6.1.2.1.17.7.1.5.2", false, true, false, false);
                        this.dot1vProtocolPortEntry = new Dot1vProtocolPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.dot1vProtocolPortEntry
                        };
                    }
                    public static final class Dot1vProtocolPortEntryEnt extends MIBEntry<QBRIDGEMIBDef>
                    {
                        public final Dot1vProtocolPortGroupIdEnt dot1vProtocolPortGroupId;

                        public final Dot1vProtocolPortGroupVidEnt dot1vProtocolPortGroupVid;

                        public final Dot1vProtocolPortRowStatusEnt dot1vProtocolPortRowStatus;

                        private Dot1vProtocolPortEntryEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                        {
                            super(mib, parent, "dot1vProtocolPortEntry", "1.3.6.1.2.1.17.7.1.5.2.1", false, false, false, true);
                            this.dot1vProtocolPortGroupId = new Dot1vProtocolPortGroupIdEnt(mib, this);
                            this.dot1vProtocolPortGroupVid = new Dot1vProtocolPortGroupVidEnt(mib, this);
                            this.dot1vProtocolPortRowStatus = new Dot1vProtocolPortRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.dot1vProtocolPortGroupId,
                                this.dot1vProtocolPortGroupVid,
                                this.dot1vProtocolPortRowStatus
                            };
                        }
                        public static final class Dot1vProtocolPortGroupIdEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolPortGroupIdEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolPortGroupId", "1.3.6.1.2.1.17.7.1.5.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1vProtocolPortGroupVidEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolPortGroupVidEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolPortGroupVid", "1.3.6.1.2.1.17.7.1.5.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class Dot1vProtocolPortRowStatusEnt extends MIBEntry<QBRIDGEMIBDef>
                        {
                            private Dot1vProtocolPortRowStatusEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                            {
                                super(mib, parent, "dot1vProtocolPortRowStatus", "1.3.6.1.2.1.17.7.1.5.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class QBridgeConformanceEnt extends MIBEntry<QBRIDGEMIBDef>
        {
            public final QBridgeGroupsEnt qBridgeGroups;

            public final QBridgeCompliancesEnt qBridgeCompliances;

            private QBridgeConformanceEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
            {
                super(mib, parent, "qBridgeConformance", "1.3.6.1.2.1.17.7.2", false, false, false, false);
                this.qBridgeGroups = new QBridgeGroupsEnt(mib, this);
                this.qBridgeCompliances = new QBridgeCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.qBridgeGroups,
                    this.qBridgeCompliances
                };
            }
            public static final class QBridgeGroupsEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------units of conformance-------------------------------*/
                public final QBridgeBaseGroupEnt qBridgeBaseGroup;

                public final QBridgeFdbUnicastGroupEnt qBridgeFdbUnicastGroup;

                public final QBridgeFdbMulticastGroupEnt qBridgeFdbMulticastGroup;

                public final QBridgeServiceRequirementsGroupEnt qBridgeServiceRequirementsGroup;

                public final QBridgeFdbStaticGroupEnt qBridgeFdbStaticGroup;

                public final QBridgeVlanGroupEnt qBridgeVlanGroup;

                public final QBridgeVlanStaticGroupEnt qBridgeVlanStaticGroup;

                public final QBridgePortGroupEnt qBridgePortGroup;

                public final QBridgeVlanStatisticsGroupEnt qBridgeVlanStatisticsGroup;

                public final QBridgeVlanStatisticsOverflowGroupEnt qBridgeVlanStatisticsOverflowGroup;

                public final QBridgeVlanHCStatisticsGroupEnt qBridgeVlanHCStatisticsGroup;

                public final QBridgeLearningConstraintsGroupEnt qBridgeLearningConstraintsGroup;

                public final QBridgeLearningConstraintDefaultGroupEnt qBridgeLearningConstraintDefaultGroup;

                public final QBridgeClassificationDeviceGroupEnt qBridgeClassificationDeviceGroup;

                public final QBridgeClassificationPortGroupEnt qBridgeClassificationPortGroup;

                public final QBridgePortGroup2Ent qBridgePortGroup2;

                private QBridgeGroupsEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "qBridgeGroups", "1.3.6.1.2.1.17.7.2.1", false, false, false, false);
                    this.qBridgeBaseGroup = new QBridgeBaseGroupEnt(mib, this);
                    this.qBridgeFdbUnicastGroup = new QBridgeFdbUnicastGroupEnt(mib, this);
                    this.qBridgeFdbMulticastGroup = new QBridgeFdbMulticastGroupEnt(mib, this);
                    this.qBridgeServiceRequirementsGroup = new QBridgeServiceRequirementsGroupEnt(mib, this);
                    this.qBridgeFdbStaticGroup = new QBridgeFdbStaticGroupEnt(mib, this);
                    this.qBridgeVlanGroup = new QBridgeVlanGroupEnt(mib, this);
                    this.qBridgeVlanStaticGroup = new QBridgeVlanStaticGroupEnt(mib, this);
                    this.qBridgePortGroup = new QBridgePortGroupEnt(mib, this);
                    this.qBridgeVlanStatisticsGroup = new QBridgeVlanStatisticsGroupEnt(mib, this);
                    this.qBridgeVlanStatisticsOverflowGroup = new QBridgeVlanStatisticsOverflowGroupEnt(mib, this);
                    this.qBridgeVlanHCStatisticsGroup = new QBridgeVlanHCStatisticsGroupEnt(mib, this);
                    this.qBridgeLearningConstraintsGroup = new QBridgeLearningConstraintsGroupEnt(mib, this);
                    this.qBridgeLearningConstraintDefaultGroup = new QBridgeLearningConstraintDefaultGroupEnt(mib, this);
                    this.qBridgeClassificationDeviceGroup = new QBridgeClassificationDeviceGroupEnt(mib, this);
                    this.qBridgeClassificationPortGroup = new QBridgeClassificationPortGroupEnt(mib, this);
                    this.qBridgePortGroup2 = new QBridgePortGroup2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.qBridgeBaseGroup,
                        this.qBridgeFdbUnicastGroup,
                        this.qBridgeFdbMulticastGroup,
                        this.qBridgeServiceRequirementsGroup,
                        this.qBridgeFdbStaticGroup,
                        this.qBridgeVlanGroup,
                        this.qBridgeVlanStaticGroup,
                        this.qBridgePortGroup,
                        this.qBridgeVlanStatisticsGroup,
                        this.qBridgeVlanStatisticsOverflowGroup,
                        this.qBridgeVlanHCStatisticsGroup,
                        this.qBridgeLearningConstraintsGroup,
                        this.qBridgeLearningConstraintDefaultGroup,
                        this.qBridgeClassificationDeviceGroup,
                        this.qBridgeClassificationPortGroup,
                        this.qBridgePortGroup2
                    };
                }
                public static final class QBridgeBaseGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeBaseGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeBaseGroup", "1.3.6.1.2.1.17.7.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeFdbUnicastGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeFdbUnicastGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeFdbUnicastGroup", "1.3.6.1.2.1.17.7.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeFdbMulticastGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeFdbMulticastGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeFdbMulticastGroup", "1.3.6.1.2.1.17.7.2.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeServiceRequirementsGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeServiceRequirementsGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeServiceRequirementsGroup", "1.3.6.1.2.1.17.7.2.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeFdbStaticGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeFdbStaticGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeFdbStaticGroup", "1.3.6.1.2.1.17.7.2.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeVlanGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeVlanGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeVlanGroup", "1.3.6.1.2.1.17.7.2.1.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeVlanStaticGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeVlanStaticGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeVlanStaticGroup", "1.3.6.1.2.1.17.7.2.1.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgePortGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgePortGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgePortGroup", "1.3.6.1.2.1.17.7.2.1.8", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeVlanStatisticsGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeVlanStatisticsGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeVlanStatisticsGroup", "1.3.6.1.2.1.17.7.2.1.9", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeVlanStatisticsOverflowGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeVlanStatisticsOverflowGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeVlanStatisticsOverflowGroup", "1.3.6.1.2.1.17.7.2.1.10", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeVlanHCStatisticsGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeVlanHCStatisticsGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeVlanHCStatisticsGroup", "1.3.6.1.2.1.17.7.2.1.11", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeLearningConstraintsGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeLearningConstraintsGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeLearningConstraintsGroup", "1.3.6.1.2.1.17.7.2.1.12", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeLearningConstraintDefaultGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeLearningConstraintDefaultGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeLearningConstraintDefaultGroup", "1.3.6.1.2.1.17.7.2.1.13", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeClassificationDeviceGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeClassificationDeviceGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeClassificationDeviceGroup", "1.3.6.1.2.1.17.7.2.1.14", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeClassificationPortGroupEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeClassificationPortGroupEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeClassificationPortGroup", "1.3.6.1.2.1.17.7.2.1.15", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgePortGroup2Ent extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgePortGroup2Ent(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgePortGroup2", "1.3.6.1.2.1.17.7.2.1.16", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class QBridgeCompliancesEnt extends MIBEntry<QBRIDGEMIBDef>
            {
                /** -------------------------------compliance statements-------------------------------*/
                public final QBridgeComplianceEnt qBridgeCompliance;

                public final QBridgeCompliance2Ent qBridgeCompliance2;

                private QBridgeCompliancesEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                {
                    super(mib, parent, "qBridgeCompliances", "1.3.6.1.2.1.17.7.2.2", false, false, false, false);
                    this.qBridgeCompliance = new QBridgeComplianceEnt(mib, this);
                    this.qBridgeCompliance2 = new QBridgeCompliance2Ent(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.qBridgeCompliance,
                        this.qBridgeCompliance2
                    };
                }
                public static final class QBridgeComplianceEnt extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeComplianceEnt(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeCompliance", "1.3.6.1.2.1.17.7.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class QBridgeCompliance2Ent extends MIBEntry<QBRIDGEMIBDef>
                {
                    private QBridgeCompliance2Ent(QBRIDGEMIBDef mib, MIBEntry<QBRIDGEMIBDef> parent)
                    {
                        super(mib, parent, "qBridgeCompliance2", "1.3.6.1.2.1.17.7.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
