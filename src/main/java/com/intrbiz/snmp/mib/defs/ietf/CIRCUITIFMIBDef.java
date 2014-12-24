package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class CIRCUITIFMIBDef extends MIB
{
    public static final CIRCUITIFMIBDef CIRCUITIFMIB = new CIRCUITIFMIBDef();

    /** January 3, 2002*/
    public final CircuitIfMIBEnt circuitIfMIB;

    private CIRCUITIFMIBDef()
    {
        super("CIRCUIT-IF-MIB");
        this.circuitIfMIB = new CircuitIfMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.circuitIfMIB
        };
    }

    public static final class CircuitIfMIBEnt extends MIBEntry<CIRCUITIFMIBDef>
    {
        public final CiObjectsEnt ciObjects;

        public final CiCapabilitiesEnt ciCapabilities;

        public final CiConformanceEnt ciConformance;

        private CircuitIfMIBEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
        {
            super(mib, parent, "circuitIfMIB", "1.3.6.1.2.1.94", false, false, false, false);
            this.ciObjects = new CiObjectsEnt(mib, this);
            this.ciCapabilities = new CiCapabilitiesEnt(mib, this);
            this.ciConformance = new CiConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.ciObjects,
                this.ciCapabilities,
                this.ciConformance
            };
        }
        public static final class CiObjectsEnt extends MIBEntry<CIRCUITIFMIBDef>
        {
            /** The Circuit Interface Circuit TableThis table is used to define and display the circuits thatare added to the ifTable.  It maps circuits to their respectiveifIndex values.*/
            public final CiCircuitTableEnt ciCircuitTable;

            /** The Circuit Interface Map TableThis table maps the ifIndex values that are assigned torows in the circuit table back to the objects that definethe circuits.*/
            public final CiIfMapTableEnt ciIfMapTable;

            /** Change tracking metrics*/
            public final CiIfLastChangeEnt ciIfLastChange;

            public final CiIfNumActiveEnt ciIfNumActive;

            private CiObjectsEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
            {
                super(mib, parent, "ciObjects", "1.3.6.1.2.1.94.1", false, false, false, false);
                this.ciCircuitTable = new CiCircuitTableEnt(mib, this);
                this.ciIfMapTable = new CiIfMapTableEnt(mib, this);
                this.ciIfLastChange = new CiIfLastChangeEnt(mib, this);
                this.ciIfNumActive = new CiIfNumActiveEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ciCircuitTable,
                    this.ciIfMapTable,
                    this.ciIfLastChange,
                    this.ciIfNumActive
                };
            }
            public static final class CiCircuitTableEnt extends MIBEntry<CIRCUITIFMIBDef>
            {
                public final CiCircuitEntryEnt ciCircuitEntry;

                private CiCircuitTableEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                {
                    super(mib, parent, "ciCircuitTable", "1.3.6.1.2.1.94.1.1", false, true, false, false);
                    this.ciCircuitEntry = new CiCircuitEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ciCircuitEntry
                    };
                }
                public static final class CiCircuitEntryEnt extends MIBEntry<CIRCUITIFMIBDef>
                {
                    public final CiCircuitObjectEnt ciCircuitObject;

                    public final CiCircuitFlowEnt ciCircuitFlow;

                    public final CiCircuitStatusEnt ciCircuitStatus;

                    public final CiCircuitIfIndexEnt ciCircuitIfIndex;

                    public final CiCircuitCreateTimeEnt ciCircuitCreateTime;

                    public final CiCircuitStorageTypeEnt ciCircuitStorageType;

                    private CiCircuitEntryEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                    {
                        super(mib, parent, "ciCircuitEntry", "1.3.6.1.2.1.94.1.1.1", false, false, false, true);
                        this.ciCircuitObject = new CiCircuitObjectEnt(mib, this);
                        this.ciCircuitFlow = new CiCircuitFlowEnt(mib, this);
                        this.ciCircuitStatus = new CiCircuitStatusEnt(mib, this);
                        this.ciCircuitIfIndex = new CiCircuitIfIndexEnt(mib, this);
                        this.ciCircuitCreateTime = new CiCircuitCreateTimeEnt(mib, this);
                        this.ciCircuitStorageType = new CiCircuitStorageTypeEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ciCircuitObject,
                            this.ciCircuitFlow,
                            this.ciCircuitStatus,
                            this.ciCircuitIfIndex,
                            this.ciCircuitCreateTime,
                            this.ciCircuitStorageType
                        };
                    }
                    public static final class CiCircuitObjectEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiCircuitObjectEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciCircuitObject", "1.3.6.1.2.1.94.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CiCircuitFlowEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiCircuitFlowEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciCircuitFlow", "1.3.6.1.2.1.94.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CiCircuitStatusEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiCircuitStatusEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciCircuitStatus", "1.3.6.1.2.1.94.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CiCircuitIfIndexEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiCircuitIfIndexEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciCircuitIfIndex", "1.3.6.1.2.1.94.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CiCircuitCreateTimeEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiCircuitCreateTimeEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciCircuitCreateTime", "1.3.6.1.2.1.94.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CiCircuitStorageTypeEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiCircuitStorageTypeEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciCircuitStorageType", "1.3.6.1.2.1.94.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class CiIfMapTableEnt extends MIBEntry<CIRCUITIFMIBDef>
            {
                public final CiIfMapEntryEnt ciIfMapEntry;

                private CiIfMapTableEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                {
                    super(mib, parent, "ciIfMapTable", "1.3.6.1.2.1.94.1.2", false, true, false, false);
                    this.ciIfMapEntry = new CiIfMapEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ciIfMapEntry
                    };
                }
                public static final class CiIfMapEntryEnt extends MIBEntry<CIRCUITIFMIBDef>
                {
                    public final CiIfMapObjectEnt ciIfMapObject;

                    public final CiIfMapFlowEnt ciIfMapFlow;

                    private CiIfMapEntryEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                    {
                        super(mib, parent, "ciIfMapEntry", "1.3.6.1.2.1.94.1.2.1", false, false, false, true);
                        this.ciIfMapObject = new CiIfMapObjectEnt(mib, this);
                        this.ciIfMapFlow = new CiIfMapFlowEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.ciIfMapObject,
                            this.ciIfMapFlow
                        };
                    }
                    public static final class CiIfMapObjectEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiIfMapObjectEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciIfMapObject", "1.3.6.1.2.1.94.1.2.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class CiIfMapFlowEnt extends MIBEntry<CIRCUITIFMIBDef>
                    {
                        private CiIfMapFlowEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                        {
                            super(mib, parent, "ciIfMapFlow", "1.3.6.1.2.1.94.1.2.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

            public static final class CiIfLastChangeEnt extends MIBEntry<CIRCUITIFMIBDef>
            {
                private CiIfLastChangeEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                {
                    super(mib, parent, "ciIfLastChange", "1.3.6.1.2.1.94.1.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class CiIfNumActiveEnt extends MIBEntry<CIRCUITIFMIBDef>
            {
                private CiIfNumActiveEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                {
                    super(mib, parent, "ciIfNumActive", "1.3.6.1.2.1.94.1.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

        public static final class CiCapabilitiesEnt extends MIBEntry<CIRCUITIFMIBDef>
        {
            private CiCapabilitiesEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
            {
                super(mib, parent, "ciCapabilities", "1.3.6.1.2.1.94.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class CiConformanceEnt extends MIBEntry<CIRCUITIFMIBDef>
        {
            /** Conformance Information*/
            public final CiMIBGroupsEnt ciMIBGroups;

            public final CiMIBCompliancesEnt ciMIBCompliances;

            private CiConformanceEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
            {
                super(mib, parent, "ciConformance", "1.3.6.1.2.1.94.3", false, false, false, false);
                this.ciMIBGroups = new CiMIBGroupsEnt(mib, this);
                this.ciMIBCompliances = new CiMIBCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.ciMIBGroups,
                    this.ciMIBCompliances
                };
            }
            public static final class CiMIBGroupsEnt extends MIBEntry<CIRCUITIFMIBDef>
            {
                /** Units of Conformance*/
                public final CiCircuitGroupEnt ciCircuitGroup;

                public final CiIfMapGroupEnt ciIfMapGroup;

                public final CiStatsGroupEnt ciStatsGroup;

                private CiMIBGroupsEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                {
                    super(mib, parent, "ciMIBGroups", "1.3.6.1.2.1.94.3.1", false, false, false, false);
                    this.ciCircuitGroup = new CiCircuitGroupEnt(mib, this);
                    this.ciIfMapGroup = new CiIfMapGroupEnt(mib, this);
                    this.ciStatsGroup = new CiStatsGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ciCircuitGroup,
                        this.ciIfMapGroup,
                        this.ciStatsGroup
                    };
                }
                public static final class CiCircuitGroupEnt extends MIBEntry<CIRCUITIFMIBDef>
                {
                    private CiCircuitGroupEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                    {
                        super(mib, parent, "ciCircuitGroup", "1.3.6.1.2.1.94.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CiIfMapGroupEnt extends MIBEntry<CIRCUITIFMIBDef>
                {
                    private CiIfMapGroupEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                    {
                        super(mib, parent, "ciIfMapGroup", "1.3.6.1.2.1.94.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class CiStatsGroupEnt extends MIBEntry<CIRCUITIFMIBDef>
                {
                    private CiStatsGroupEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                    {
                        super(mib, parent, "ciStatsGroup", "1.3.6.1.2.1.94.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class CiMIBCompliancesEnt extends MIBEntry<CIRCUITIFMIBDef>
            {
                /** Compliance Statements*/
                public final CiComplianceEnt ciCompliance;

                private CiMIBCompliancesEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                {
                    super(mib, parent, "ciMIBCompliances", "1.3.6.1.2.1.94.3.2", false, false, false, false);
                    this.ciCompliance = new CiComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.ciCompliance
                    };
                }
                public static final class CiComplianceEnt extends MIBEntry<CIRCUITIFMIBDef>
                {
                    private CiComplianceEnt(CIRCUITIFMIBDef mib, MIBEntry<CIRCUITIFMIBDef> parent)
                    {
                        super(mib, parent, "ciCompliance", "1.3.6.1.2.1.94.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
