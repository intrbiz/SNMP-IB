package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

/**rfc2571*/
public final class FIBRECHANNELFEMIBDef extends MIB
{
    public static final FIBRECHANNELFEMIBDef FIBRECHANNELFEMIB = new FIBRECHANNELFEMIBDef();

    public final FcFeMIBEnt fcFeMIB;

    private FIBRECHANNELFEMIBDef()
    {
        super("FIBRE-CHANNEL-FE-MIB");
        this.fcFeMIB = new FcFeMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.fcFeMIB
        };
    }

    public static final class FcFeMIBEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
    {
        public final FcFeMIBObjectsEnt fcFeMIBObjects;

        /** conformance information*/
        public final FcFeMIBConformanceEnt fcFeMIBConformance;

        private FcFeMIBEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
        {
            super(mib, parent, "fcFeMIB", "1.3.6.1.2.1.75", false, false, false, false);
            this.fcFeMIBObjects = new FcFeMIBObjectsEnt(mib, this);
            this.fcFeMIBConformance = new FcFeMIBConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.fcFeMIBObjects,
                this.fcFeMIBConformance
            };
        }
        public static final class FcFeMIBObjectsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
        {
            /** Note:fcFeMIBConformance OBJECT IDENTIFIER ::= { fcFeMIB 2 }see at the end of the module
Groups under fcFeMIBObjects*/
            public final FcFeConfigEnt fcFeConfig;

            public final FcFeStatusEnt fcFeStatus;

            public final FcFeErrorEnt fcFeError;

            public final FcFeAccountingEnt fcFeAccounting;

            public final FcFeCapabilitiesEnt fcFeCapabilities;

            private FcFeMIBObjectsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
            {
                super(mib, parent, "fcFeMIBObjects", "1.3.6.1.2.1.75.1", false, false, false, false);
                this.fcFeConfig = new FcFeConfigEnt(mib, this);
                this.fcFeStatus = new FcFeStatusEnt(mib, this);
                this.fcFeError = new FcFeErrorEnt(mib, this);
                this.fcFeAccounting = new FcFeAccountingEnt(mib, this);
                this.fcFeCapabilities = new FcFeCapabilitiesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcFeConfig,
                    this.fcFeStatus,
                    this.fcFeError,
                    this.fcFeAccounting,
                    this.fcFeCapabilities
                };
            }
            public static final class FcFeConfigEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** The Configuration group
This group consists of scalar objects and tables.It contains the configuration and service parametersof the Fabric Element and the FxPorts.The group represents a set of parameters associated withthe Fabric Element  or an FxPort to support its NxPorts.*/
                public final FcFeFabricNameEnt fcFeFabricName;

                public final FcFeElementNameEnt fcFeElementName;

                public final FcFeModuleCapacityEnt fcFeModuleCapacity;

                /** The Module Table.This table contains one entry for each module,information of the modules.*/
                public final FcFeModuleTableEnt fcFeModuleTable;

                /** the FxPort Configuration Table.This table contains, one entry for each FxPort,configuration parameters of the ports.*/
                public final FcFxPortTableEnt fcFxPortTable;

                private FcFeConfigEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeConfig", "1.3.6.1.2.1.75.1.1", false, false, false, false);
                    this.fcFeFabricName = new FcFeFabricNameEnt(mib, this);
                    this.fcFeElementName = new FcFeElementNameEnt(mib, this);
                    this.fcFeModuleCapacity = new FcFeModuleCapacityEnt(mib, this);
                    this.fcFeModuleTable = new FcFeModuleTableEnt(mib, this);
                    this.fcFxPortTable = new FcFxPortTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFeFabricName,
                        this.fcFeElementName,
                        this.fcFeModuleCapacity,
                        this.fcFeModuleTable,
                        this.fcFxPortTable
                    };
                }
                public static final class FcFeFabricNameEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeFabricNameEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeFabricName", "1.3.6.1.2.1.75.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeElementNameEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeElementNameEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeElementName", "1.3.6.1.2.1.75.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeModuleCapacityEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeModuleCapacityEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeModuleCapacity", "1.3.6.1.2.1.75.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeModuleTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFeModuleEntryEnt fcFeModuleEntry;

                    private FcFeModuleTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeModuleTable", "1.3.6.1.2.1.75.1.1.4", false, true, false, false);
                        this.fcFeModuleEntry = new FcFeModuleEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFeModuleEntry
                        };
                    }
                    public static final class FcFeModuleEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFeModuleIndexEnt fcFeModuleIndex;

                        public final FcFeModuleDescrEnt fcFeModuleDescr;

                        public final FcFeModuleObjectIDEnt fcFeModuleObjectID;

                        public final FcFeModuleOperStatusEnt fcFeModuleOperStatus;

                        public final FcFeModuleLastChangeEnt fcFeModuleLastChange;

                        public final FcFeModuleFxPortCapacityEnt fcFeModuleFxPortCapacity;

                        public final FcFeModuleNameEnt fcFeModuleName;

                        private FcFeModuleEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFeModuleEntry", "1.3.6.1.2.1.75.1.1.4.1", false, false, false, true);
                            this.fcFeModuleIndex = new FcFeModuleIndexEnt(mib, this);
                            this.fcFeModuleDescr = new FcFeModuleDescrEnt(mib, this);
                            this.fcFeModuleObjectID = new FcFeModuleObjectIDEnt(mib, this);
                            this.fcFeModuleOperStatus = new FcFeModuleOperStatusEnt(mib, this);
                            this.fcFeModuleLastChange = new FcFeModuleLastChangeEnt(mib, this);
                            this.fcFeModuleFxPortCapacity = new FcFeModuleFxPortCapacityEnt(mib, this);
                            this.fcFeModuleName = new FcFeModuleNameEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFeModuleIndex,
                                this.fcFeModuleDescr,
                                this.fcFeModuleObjectID,
                                this.fcFeModuleOperStatus,
                                this.fcFeModuleLastChange,
                                this.fcFeModuleFxPortCapacity,
                                this.fcFeModuleName
                            };
                        }
                        public static final class FcFeModuleIndexEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleIndexEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleIndex", "1.3.6.1.2.1.75.1.1.4.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFeModuleDescrEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleDescrEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleDescr", "1.3.6.1.2.1.75.1.1.4.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFeModuleObjectIDEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleObjectIDEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleObjectID", "1.3.6.1.2.1.75.1.1.4.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFeModuleOperStatusEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleOperStatusEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleOperStatus", "1.3.6.1.2.1.75.1.1.4.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFeModuleLastChangeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleLastChangeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleLastChange", "1.3.6.1.2.1.75.1.1.4.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFeModuleFxPortCapacityEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleFxPortCapacityEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleFxPortCapacity", "1.3.6.1.2.1.75.1.1.4.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFeModuleNameEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFeModuleNameEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFeModuleName", "1.3.6.1.2.1.75.1.1.4.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcFxPortTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortEntryEnt fcFxPortEntry;

                    private FcFxPortTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortTable", "1.3.6.1.2.1.75.1.1.5", false, true, false, false);
                        this.fcFxPortEntry = new FcFxPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortEntry
                        };
                    }
                    public static final class FcFxPortEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortIndexEnt fcFxPortIndex;

                        public final FcFxPortNameEnt fcFxPortName;

                        /** FxPort common service parameters*/
                        public final FcFxPortFcphVersionHighEnt fcFxPortFcphVersionHigh;

                        public final FcFxPortFcphVersionLowEnt fcFxPortFcphVersionLow;

                        public final FcFxPortBbCreditEnt fcFxPortBbCredit;

                        public final FcFxPortRxBufSizeEnt fcFxPortRxBufSize;

                        public final FcFxPortRatovEnt fcFxPortRatov;

                        public final FcFxPortEdtovEnt fcFxPortEdtov;

                        /** FxPort class service parameters*/
                        public final FcFxPortCosSupportedEnt fcFxPortCosSupported;

                        public final FcFxPortIntermixSupportedEnt fcFxPortIntermixSupported;

                        public final FcFxPortStackedConnModeEnt fcFxPortStackedConnMode;

                        public final FcFxPortClass2SeqDelivEnt fcFxPortClass2SeqDeliv;

                        public final FcFxPortClass3SeqDelivEnt fcFxPortClass3SeqDeliv;

                        /** other FxPort parameters*/
                        public final FcFxPortHoldTimeEnt fcFxPortHoldTime;

                        private FcFxPortEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortEntry", "1.3.6.1.2.1.75.1.1.5.1", false, false, false, true);
                            this.fcFxPortIndex = new FcFxPortIndexEnt(mib, this);
                            this.fcFxPortName = new FcFxPortNameEnt(mib, this);
                            this.fcFxPortFcphVersionHigh = new FcFxPortFcphVersionHighEnt(mib, this);
                            this.fcFxPortFcphVersionLow = new FcFxPortFcphVersionLowEnt(mib, this);
                            this.fcFxPortBbCredit = new FcFxPortBbCreditEnt(mib, this);
                            this.fcFxPortRxBufSize = new FcFxPortRxBufSizeEnt(mib, this);
                            this.fcFxPortRatov = new FcFxPortRatovEnt(mib, this);
                            this.fcFxPortEdtov = new FcFxPortEdtovEnt(mib, this);
                            this.fcFxPortCosSupported = new FcFxPortCosSupportedEnt(mib, this);
                            this.fcFxPortIntermixSupported = new FcFxPortIntermixSupportedEnt(mib, this);
                            this.fcFxPortStackedConnMode = new FcFxPortStackedConnModeEnt(mib, this);
                            this.fcFxPortClass2SeqDeliv = new FcFxPortClass2SeqDelivEnt(mib, this);
                            this.fcFxPortClass3SeqDeliv = new FcFxPortClass3SeqDelivEnt(mib, this);
                            this.fcFxPortHoldTime = new FcFxPortHoldTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortIndex,
                                this.fcFxPortName,
                                this.fcFxPortFcphVersionHigh,
                                this.fcFxPortFcphVersionLow,
                                this.fcFxPortBbCredit,
                                this.fcFxPortRxBufSize,
                                this.fcFxPortRatov,
                                this.fcFxPortEdtov,
                                this.fcFxPortCosSupported,
                                this.fcFxPortIntermixSupported,
                                this.fcFxPortStackedConnMode,
                                this.fcFxPortClass2SeqDeliv,
                                this.fcFxPortClass3SeqDeliv,
                                this.fcFxPortHoldTime
                            };
                        }
                        public static final class FcFxPortIndexEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortIndexEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortIndex", "1.3.6.1.2.1.75.1.1.5.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortNameEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortNameEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortName", "1.3.6.1.2.1.75.1.1.5.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortFcphVersionHighEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortFcphVersionHighEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortFcphVersionHigh", "1.3.6.1.2.1.75.1.1.5.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortFcphVersionLowEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortFcphVersionLowEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortFcphVersionLow", "1.3.6.1.2.1.75.1.1.5.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortBbCreditEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortBbCreditEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortBbCredit", "1.3.6.1.2.1.75.1.1.5.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortRxBufSizeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortRxBufSizeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortRxBufSize", "1.3.6.1.2.1.75.1.1.5.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortRatovEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortRatovEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortRatov", "1.3.6.1.2.1.75.1.1.5.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortEdtovEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortEdtovEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortEdtov", "1.3.6.1.2.1.75.1.1.5.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCosSupportedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCosSupportedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCosSupported", "1.3.6.1.2.1.75.1.1.5.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortIntermixSupportedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortIntermixSupportedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortIntermixSupported", "1.3.6.1.2.1.75.1.1.5.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortStackedConnModeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortStackedConnModeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortStackedConnMode", "1.3.6.1.2.1.75.1.1.5.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortClass2SeqDelivEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortClass2SeqDelivEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortClass2SeqDeliv", "1.3.6.1.2.1.75.1.1.5.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortClass3SeqDelivEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortClass3SeqDelivEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortClass3SeqDeliv", "1.3.6.1.2.1.75.1.1.5.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortHoldTimeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortHoldTimeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortHoldTime", "1.3.6.1.2.1.75.1.1.5.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FcFeStatusEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** the Status group
This group consists of tables that contains operationalstatus and established service parameters for the FabricElement and the attached NxPorts.
The FxPort Status tableThis table contains, one entry for each FxPort,the operational status and parameters of the FxPorts.*/
                public final FcFxPortStatusTableEnt fcFxPortStatusTable;

                /** the FxPort Physical Level tableThis table contains, one entry for each FxPort in theFabric Element, the physical level status and parametersof the FxPorts.*/
                public final FcFxPortPhysTableEnt fcFxPortPhysTable;

                /** The FxPort Fabric Login tableThis table contains, one entry for each FxPort in theFabric Element, the Service Parameters that have beenestablished from the most recent Fabric Login,implicit or explicit.*/
                public final FcFxLoginTableEnt fcFxLoginTable;

                private FcFeStatusEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeStatus", "1.3.6.1.2.1.75.1.2", false, false, false, false);
                    this.fcFxPortStatusTable = new FcFxPortStatusTableEnt(mib, this);
                    this.fcFxPortPhysTable = new FcFxPortPhysTableEnt(mib, this);
                    this.fcFxLoginTable = new FcFxLoginTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFxPortStatusTable,
                        this.fcFxPortPhysTable,
                        this.fcFxLoginTable
                    };
                }
                public static final class FcFxPortStatusTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortStatusEntryEnt fcFxPortStatusEntry;

                    private FcFxPortStatusTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortStatusTable", "1.3.6.1.2.1.75.1.2.1", false, true, false, false);
                        this.fcFxPortStatusEntry = new FcFxPortStatusEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortStatusEntry
                        };
                    }
                    public static final class FcFxPortStatusEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortIDEnt fcFxPortID;

                        public final FcFxPortBbCreditAvailableEnt fcFxPortBbCreditAvailable;

                        public final FcFxPortOperModeEnt fcFxPortOperMode;

                        public final FcFxPortAdminModeEnt fcFxPortAdminMode;

                        private FcFxPortStatusEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortStatusEntry", "1.3.6.1.2.1.75.1.2.1.1", false, false, false, true);
                            this.fcFxPortID = new FcFxPortIDEnt(mib, this);
                            this.fcFxPortBbCreditAvailable = new FcFxPortBbCreditAvailableEnt(mib, this);
                            this.fcFxPortOperMode = new FcFxPortOperModeEnt(mib, this);
                            this.fcFxPortAdminMode = new FcFxPortAdminModeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortID,
                                this.fcFxPortBbCreditAvailable,
                                this.fcFxPortOperMode,
                                this.fcFxPortAdminMode
                            };
                        }
                        public static final class FcFxPortIDEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortIDEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortID", "1.3.6.1.2.1.75.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortBbCreditAvailableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortBbCreditAvailableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortBbCreditAvailable", "1.3.6.1.2.1.75.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortOperModeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortOperModeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortOperMode", "1.3.6.1.2.1.75.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortAdminModeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortAdminModeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortAdminMode", "1.3.6.1.2.1.75.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcFxPortPhysTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortPhysEntryEnt fcFxPortPhysEntry;

                    private FcFxPortPhysTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortPhysTable", "1.3.6.1.2.1.75.1.2.2", false, true, false, false);
                        this.fcFxPortPhysEntry = new FcFxPortPhysEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortPhysEntry
                        };
                    }
                    public static final class FcFxPortPhysEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortPhysAdminStatusEnt fcFxPortPhysAdminStatus;

                        public final FcFxPortPhysOperStatusEnt fcFxPortPhysOperStatus;

                        public final FcFxPortPhysLastChangeEnt fcFxPortPhysLastChange;

                        public final FcFxPortPhysRttovEnt fcFxPortPhysRttov;

                        private FcFxPortPhysEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortPhysEntry", "1.3.6.1.2.1.75.1.2.2.1", false, false, false, true);
                            this.fcFxPortPhysAdminStatus = new FcFxPortPhysAdminStatusEnt(mib, this);
                            this.fcFxPortPhysOperStatus = new FcFxPortPhysOperStatusEnt(mib, this);
                            this.fcFxPortPhysLastChange = new FcFxPortPhysLastChangeEnt(mib, this);
                            this.fcFxPortPhysRttov = new FcFxPortPhysRttovEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortPhysAdminStatus,
                                this.fcFxPortPhysOperStatus,
                                this.fcFxPortPhysLastChange,
                                this.fcFxPortPhysRttov
                            };
                        }
                        public static final class FcFxPortPhysAdminStatusEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortPhysAdminStatusEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortPhysAdminStatus", "1.3.6.1.2.1.75.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortPhysOperStatusEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortPhysOperStatusEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortPhysOperStatus", "1.3.6.1.2.1.75.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortPhysLastChangeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortPhysLastChangeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortPhysLastChange", "1.3.6.1.2.1.75.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortPhysRttovEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortPhysRttovEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortPhysRttov", "1.3.6.1.2.1.75.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcFxLoginTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxLoginEntryEnt fcFxLoginEntry;

                    private FcFxLoginTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxLoginTable", "1.3.6.1.2.1.75.1.2.3", false, true, false, false);
                        this.fcFxLoginEntry = new FcFxLoginEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxLoginEntry
                        };
                    }
                    public static final class FcFxLoginEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortNxLoginIndexEnt fcFxPortNxLoginIndex;

                        public final FcFxPortFcphVersionAgreedEnt fcFxPortFcphVersionAgreed;

                        public final FcFxPortNxPortBbCreditEnt fcFxPortNxPortBbCredit;

                        public final FcFxPortNxPortRxDataFieldSizeEnt fcFxPortNxPortRxDataFieldSize;

                        public final FcFxPortCosSuppAgreedEnt fcFxPortCosSuppAgreed;

                        public final FcFxPortIntermixSuppAgreedEnt fcFxPortIntermixSuppAgreed;

                        public final FcFxPortStackedConnModeAgreedEnt fcFxPortStackedConnModeAgreed;

                        public final FcFxPortClass2SeqDelivAgreedEnt fcFxPortClass2SeqDelivAgreed;

                        public final FcFxPortClass3SeqDelivAgreedEnt fcFxPortClass3SeqDelivAgreed;

                        public final FcFxPortNxPortNameEnt fcFxPortNxPortName;

                        public final FcFxPortConnectedNxPortEnt fcFxPortConnectedNxPort;

                        public final FcFxPortBbCreditModelEnt fcFxPortBbCreditModel;

                        private FcFxLoginEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxLoginEntry", "1.3.6.1.2.1.75.1.2.3.1", false, false, false, true);
                            this.fcFxPortNxLoginIndex = new FcFxPortNxLoginIndexEnt(mib, this);
                            this.fcFxPortFcphVersionAgreed = new FcFxPortFcphVersionAgreedEnt(mib, this);
                            this.fcFxPortNxPortBbCredit = new FcFxPortNxPortBbCreditEnt(mib, this);
                            this.fcFxPortNxPortRxDataFieldSize = new FcFxPortNxPortRxDataFieldSizeEnt(mib, this);
                            this.fcFxPortCosSuppAgreed = new FcFxPortCosSuppAgreedEnt(mib, this);
                            this.fcFxPortIntermixSuppAgreed = new FcFxPortIntermixSuppAgreedEnt(mib, this);
                            this.fcFxPortStackedConnModeAgreed = new FcFxPortStackedConnModeAgreedEnt(mib, this);
                            this.fcFxPortClass2SeqDelivAgreed = new FcFxPortClass2SeqDelivAgreedEnt(mib, this);
                            this.fcFxPortClass3SeqDelivAgreed = new FcFxPortClass3SeqDelivAgreedEnt(mib, this);
                            this.fcFxPortNxPortName = new FcFxPortNxPortNameEnt(mib, this);
                            this.fcFxPortConnectedNxPort = new FcFxPortConnectedNxPortEnt(mib, this);
                            this.fcFxPortBbCreditModel = new FcFxPortBbCreditModelEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortNxLoginIndex,
                                this.fcFxPortFcphVersionAgreed,
                                this.fcFxPortNxPortBbCredit,
                                this.fcFxPortNxPortRxDataFieldSize,
                                this.fcFxPortCosSuppAgreed,
                                this.fcFxPortIntermixSuppAgreed,
                                this.fcFxPortStackedConnModeAgreed,
                                this.fcFxPortClass2SeqDelivAgreed,
                                this.fcFxPortClass3SeqDelivAgreed,
                                this.fcFxPortNxPortName,
                                this.fcFxPortConnectedNxPort,
                                this.fcFxPortBbCreditModel
                            };
                        }
                        public static final class FcFxPortNxLoginIndexEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortNxLoginIndexEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortNxLoginIndex", "1.3.6.1.2.1.75.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortFcphVersionAgreedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortFcphVersionAgreedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortFcphVersionAgreed", "1.3.6.1.2.1.75.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortNxPortBbCreditEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortNxPortBbCreditEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortNxPortBbCredit", "1.3.6.1.2.1.75.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortNxPortRxDataFieldSizeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortNxPortRxDataFieldSizeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortNxPortRxDataFieldSize", "1.3.6.1.2.1.75.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCosSuppAgreedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCosSuppAgreedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCosSuppAgreed", "1.3.6.1.2.1.75.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortIntermixSuppAgreedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortIntermixSuppAgreedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortIntermixSuppAgreed", "1.3.6.1.2.1.75.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortStackedConnModeAgreedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortStackedConnModeAgreedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortStackedConnModeAgreed", "1.3.6.1.2.1.75.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortClass2SeqDelivAgreedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortClass2SeqDelivAgreedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortClass2SeqDelivAgreed", "1.3.6.1.2.1.75.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortClass3SeqDelivAgreedEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortClass3SeqDelivAgreedEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortClass3SeqDelivAgreed", "1.3.6.1.2.1.75.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortNxPortNameEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortNxPortNameEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortNxPortName", "1.3.6.1.2.1.75.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortConnectedNxPortEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortConnectedNxPortEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortConnectedNxPort", "1.3.6.1.2.1.75.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortBbCreditModelEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortBbCreditModelEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortBbCreditModel", "1.3.6.1.2.1.75.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FcFeErrorEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** the Error groupThis group consists of tables that contain information aboutthe various types of errors detected.  The management stationmay use the information in this group to determine thequality of the link between the FxPort and its attached NxPort.
the FxPort Error tableThis table contains, one entry for each FxPort in the FabricElement, counters recording numbers of errors detectedsince the management agent re-initialized.The first 6 columnar objects after the port index correspondsto the counters in the Link Error Status Block.*/
                public final FcFxPortErrorTableEnt fcFxPortErrorTable;

                private FcFeErrorEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeError", "1.3.6.1.2.1.75.1.3", false, false, false, false);
                    this.fcFxPortErrorTable = new FcFxPortErrorTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFxPortErrorTable
                    };
                }
                public static final class FcFxPortErrorTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortErrorEntryEnt fcFxPortErrorEntry;

                    private FcFxPortErrorTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortErrorTable", "1.3.6.1.2.1.75.1.3.1", false, true, false, false);
                        this.fcFxPortErrorEntry = new FcFxPortErrorEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortErrorEntry
                        };
                    }
                    public static final class FcFxPortErrorEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortLinkFailuresEnt fcFxPortLinkFailures;

                        public final FcFxPortSyncLossesEnt fcFxPortSyncLosses;

                        public final FcFxPortSigLossesEnt fcFxPortSigLosses;

                        public final FcFxPortPrimSeqProtoErrorsEnt fcFxPortPrimSeqProtoErrors;

                        public final FcFxPortInvalidTxWordsEnt fcFxPortInvalidTxWords;

                        public final FcFxPortInvalidCrcsEnt fcFxPortInvalidCrcs;

                        public final FcFxPortDelimiterErrorsEnt fcFxPortDelimiterErrors;

                        public final FcFxPortAddressIdErrorsEnt fcFxPortAddressIdErrors;

                        public final FcFxPortLinkResetInsEnt fcFxPortLinkResetIns;

                        public final FcFxPortLinkResetOutsEnt fcFxPortLinkResetOuts;

                        public final FcFxPortOlsInsEnt fcFxPortOlsIns;

                        public final FcFxPortOlsOutsEnt fcFxPortOlsOuts;

                        private FcFxPortErrorEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortErrorEntry", "1.3.6.1.2.1.75.1.3.1.1", false, false, false, true);
                            this.fcFxPortLinkFailures = new FcFxPortLinkFailuresEnt(mib, this);
                            this.fcFxPortSyncLosses = new FcFxPortSyncLossesEnt(mib, this);
                            this.fcFxPortSigLosses = new FcFxPortSigLossesEnt(mib, this);
                            this.fcFxPortPrimSeqProtoErrors = new FcFxPortPrimSeqProtoErrorsEnt(mib, this);
                            this.fcFxPortInvalidTxWords = new FcFxPortInvalidTxWordsEnt(mib, this);
                            this.fcFxPortInvalidCrcs = new FcFxPortInvalidCrcsEnt(mib, this);
                            this.fcFxPortDelimiterErrors = new FcFxPortDelimiterErrorsEnt(mib, this);
                            this.fcFxPortAddressIdErrors = new FcFxPortAddressIdErrorsEnt(mib, this);
                            this.fcFxPortLinkResetIns = new FcFxPortLinkResetInsEnt(mib, this);
                            this.fcFxPortLinkResetOuts = new FcFxPortLinkResetOutsEnt(mib, this);
                            this.fcFxPortOlsIns = new FcFxPortOlsInsEnt(mib, this);
                            this.fcFxPortOlsOuts = new FcFxPortOlsOutsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortLinkFailures,
                                this.fcFxPortSyncLosses,
                                this.fcFxPortSigLosses,
                                this.fcFxPortPrimSeqProtoErrors,
                                this.fcFxPortInvalidTxWords,
                                this.fcFxPortInvalidCrcs,
                                this.fcFxPortDelimiterErrors,
                                this.fcFxPortAddressIdErrors,
                                this.fcFxPortLinkResetIns,
                                this.fcFxPortLinkResetOuts,
                                this.fcFxPortOlsIns,
                                this.fcFxPortOlsOuts
                            };
                        }
                        public static final class FcFxPortLinkFailuresEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortLinkFailuresEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortLinkFailures", "1.3.6.1.2.1.75.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortSyncLossesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortSyncLossesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortSyncLosses", "1.3.6.1.2.1.75.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortSigLossesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortSigLossesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortSigLosses", "1.3.6.1.2.1.75.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortPrimSeqProtoErrorsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortPrimSeqProtoErrorsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortPrimSeqProtoErrors", "1.3.6.1.2.1.75.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortInvalidTxWordsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortInvalidTxWordsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortInvalidTxWords", "1.3.6.1.2.1.75.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortInvalidCrcsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortInvalidCrcsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortInvalidCrcs", "1.3.6.1.2.1.75.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortDelimiterErrorsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortDelimiterErrorsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortDelimiterErrors", "1.3.6.1.2.1.75.1.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortAddressIdErrorsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortAddressIdErrorsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortAddressIdErrors", "1.3.6.1.2.1.75.1.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortLinkResetInsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortLinkResetInsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortLinkResetIns", "1.3.6.1.2.1.75.1.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortLinkResetOutsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortLinkResetOutsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortLinkResetOuts", "1.3.6.1.2.1.75.1.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortOlsInsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortOlsInsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortOlsIns", "1.3.6.1.2.1.75.1.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortOlsOutsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortOlsOutsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortOlsOuts", "1.3.6.1.2.1.75.1.3.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FcFeAccountingEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** Accounting Groups:(1) Class 1 Accounting Group,(2) Class 2 Accounting Group, and(3) Class 3 Accounting Group.Each group consists of a table that contains accountinginformation for the FxPorts in the Fabric Element.
the Class 1 Accounting tableThis table contains, one entry for each FxPort in the Fabric
Element, Counter32s for certain types of events occurred in thethe FxPorts since the the management agent has re-initialized.*/
                public final FcFxPortC1AccountingTableEnt fcFxPortC1AccountingTable;

                /** the Class 2 Accounting tableThis table contains, one entry for each FxPort in the FabricElement, Counter32s for certain types of events occurred in thethe FxPorts since the the management agent has re-initialized.*/
                public final FcFxPortC2AccountingTableEnt fcFxPortC2AccountingTable;

                /** the Class 3 Accounting GroupThis table contains, one entry for each FxPort in the FabricElement, Counter32s for certain types of events occurred in thethe FxPorts since the management agent has re-initialized.*/
                public final FcFxPortC3AccountingTableEnt fcFxPortC3AccountingTable;

                private FcFeAccountingEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeAccounting", "1.3.6.1.2.1.75.1.4", false, false, false, false);
                    this.fcFxPortC1AccountingTable = new FcFxPortC1AccountingTableEnt(mib, this);
                    this.fcFxPortC2AccountingTable = new FcFxPortC2AccountingTableEnt(mib, this);
                    this.fcFxPortC3AccountingTable = new FcFxPortC3AccountingTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFxPortC1AccountingTable,
                        this.fcFxPortC2AccountingTable,
                        this.fcFxPortC3AccountingTable
                    };
                }
                public static final class FcFxPortC1AccountingTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortC1AccountingEntryEnt fcFxPortC1AccountingEntry;

                    private FcFxPortC1AccountingTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortC1AccountingTable", "1.3.6.1.2.1.75.1.4.1", false, true, false, false);
                        this.fcFxPortC1AccountingEntry = new FcFxPortC1AccountingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortC1AccountingEntry
                        };
                    }
                    public static final class FcFxPortC1AccountingEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortC1InFramesEnt fcFxPortC1InFrames;

                        public final FcFxPortC1OutFramesEnt fcFxPortC1OutFrames;

                        public final FcFxPortC1InOctetsEnt fcFxPortC1InOctets;

                        public final FcFxPortC1OutOctetsEnt fcFxPortC1OutOctets;

                        public final FcFxPortC1DiscardsEnt fcFxPortC1Discards;

                        public final FcFxPortC1FbsyFramesEnt fcFxPortC1FbsyFrames;

                        public final FcFxPortC1FrjtFramesEnt fcFxPortC1FrjtFrames;

                        public final FcFxPortC1InConnectionsEnt fcFxPortC1InConnections;

                        public final FcFxPortC1OutConnectionsEnt fcFxPortC1OutConnections;

                        public final FcFxPortC1ConnTimeEnt fcFxPortC1ConnTime;

                        private FcFxPortC1AccountingEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortC1AccountingEntry", "1.3.6.1.2.1.75.1.4.1.1", false, false, false, true);
                            this.fcFxPortC1InFrames = new FcFxPortC1InFramesEnt(mib, this);
                            this.fcFxPortC1OutFrames = new FcFxPortC1OutFramesEnt(mib, this);
                            this.fcFxPortC1InOctets = new FcFxPortC1InOctetsEnt(mib, this);
                            this.fcFxPortC1OutOctets = new FcFxPortC1OutOctetsEnt(mib, this);
                            this.fcFxPortC1Discards = new FcFxPortC1DiscardsEnt(mib, this);
                            this.fcFxPortC1FbsyFrames = new FcFxPortC1FbsyFramesEnt(mib, this);
                            this.fcFxPortC1FrjtFrames = new FcFxPortC1FrjtFramesEnt(mib, this);
                            this.fcFxPortC1InConnections = new FcFxPortC1InConnectionsEnt(mib, this);
                            this.fcFxPortC1OutConnections = new FcFxPortC1OutConnectionsEnt(mib, this);
                            this.fcFxPortC1ConnTime = new FcFxPortC1ConnTimeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortC1InFrames,
                                this.fcFxPortC1OutFrames,
                                this.fcFxPortC1InOctets,
                                this.fcFxPortC1OutOctets,
                                this.fcFxPortC1Discards,
                                this.fcFxPortC1FbsyFrames,
                                this.fcFxPortC1FrjtFrames,
                                this.fcFxPortC1InConnections,
                                this.fcFxPortC1OutConnections,
                                this.fcFxPortC1ConnTime
                            };
                        }
                        public static final class FcFxPortC1InFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1InFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1InFrames", "1.3.6.1.2.1.75.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1OutFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1OutFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1OutFrames", "1.3.6.1.2.1.75.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1InOctetsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1InOctetsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1InOctets", "1.3.6.1.2.1.75.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1OutOctetsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1OutOctetsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1OutOctets", "1.3.6.1.2.1.75.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1DiscardsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1DiscardsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1Discards", "1.3.6.1.2.1.75.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1FbsyFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1FbsyFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1FbsyFrames", "1.3.6.1.2.1.75.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1FrjtFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1FrjtFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1FrjtFrames", "1.3.6.1.2.1.75.1.4.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1InConnectionsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1InConnectionsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1InConnections", "1.3.6.1.2.1.75.1.4.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1OutConnectionsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1OutConnectionsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1OutConnections", "1.3.6.1.2.1.75.1.4.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC1ConnTimeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC1ConnTimeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC1ConnTime", "1.3.6.1.2.1.75.1.4.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcFxPortC2AccountingTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortC2AccountingEntryEnt fcFxPortC2AccountingEntry;

                    private FcFxPortC2AccountingTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortC2AccountingTable", "1.3.6.1.2.1.75.1.4.2", false, true, false, false);
                        this.fcFxPortC2AccountingEntry = new FcFxPortC2AccountingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortC2AccountingEntry
                        };
                    }
                    public static final class FcFxPortC2AccountingEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortC2InFramesEnt fcFxPortC2InFrames;

                        public final FcFxPortC2OutFramesEnt fcFxPortC2OutFrames;

                        public final FcFxPortC2InOctetsEnt fcFxPortC2InOctets;

                        public final FcFxPortC2OutOctetsEnt fcFxPortC2OutOctets;

                        public final FcFxPortC2DiscardsEnt fcFxPortC2Discards;

                        public final FcFxPortC2FbsyFramesEnt fcFxPortC2FbsyFrames;

                        public final FcFxPortC2FrjtFramesEnt fcFxPortC2FrjtFrames;

                        private FcFxPortC2AccountingEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortC2AccountingEntry", "1.3.6.1.2.1.75.1.4.2.1", false, false, false, true);
                            this.fcFxPortC2InFrames = new FcFxPortC2InFramesEnt(mib, this);
                            this.fcFxPortC2OutFrames = new FcFxPortC2OutFramesEnt(mib, this);
                            this.fcFxPortC2InOctets = new FcFxPortC2InOctetsEnt(mib, this);
                            this.fcFxPortC2OutOctets = new FcFxPortC2OutOctetsEnt(mib, this);
                            this.fcFxPortC2Discards = new FcFxPortC2DiscardsEnt(mib, this);
                            this.fcFxPortC2FbsyFrames = new FcFxPortC2FbsyFramesEnt(mib, this);
                            this.fcFxPortC2FrjtFrames = new FcFxPortC2FrjtFramesEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortC2InFrames,
                                this.fcFxPortC2OutFrames,
                                this.fcFxPortC2InOctets,
                                this.fcFxPortC2OutOctets,
                                this.fcFxPortC2Discards,
                                this.fcFxPortC2FbsyFrames,
                                this.fcFxPortC2FrjtFrames
                            };
                        }
                        public static final class FcFxPortC2InFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2InFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2InFrames", "1.3.6.1.2.1.75.1.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC2OutFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2OutFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2OutFrames", "1.3.6.1.2.1.75.1.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC2InOctetsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2InOctetsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2InOctets", "1.3.6.1.2.1.75.1.4.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC2OutOctetsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2OutOctetsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2OutOctets", "1.3.6.1.2.1.75.1.4.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC2DiscardsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2DiscardsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2Discards", "1.3.6.1.2.1.75.1.4.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC2FbsyFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2FbsyFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2FbsyFrames", "1.3.6.1.2.1.75.1.4.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC2FrjtFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC2FrjtFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC2FrjtFrames", "1.3.6.1.2.1.75.1.4.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class FcFxPortC3AccountingTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortC3AccountingEntryEnt fcFxPortC3AccountingEntry;

                    private FcFxPortC3AccountingTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortC3AccountingTable", "1.3.6.1.2.1.75.1.4.3", false, true, false, false);
                        this.fcFxPortC3AccountingEntry = new FcFxPortC3AccountingEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortC3AccountingEntry
                        };
                    }
                    public static final class FcFxPortC3AccountingEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortC3InFramesEnt fcFxPortC3InFrames;

                        public final FcFxPortC3OutFramesEnt fcFxPortC3OutFrames;

                        public final FcFxPortC3InOctetsEnt fcFxPortC3InOctets;

                        public final FcFxPortC3OutOctetsEnt fcFxPortC3OutOctets;

                        public final FcFxPortC3DiscardsEnt fcFxPortC3Discards;

                        private FcFxPortC3AccountingEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortC3AccountingEntry", "1.3.6.1.2.1.75.1.4.3.1", false, false, false, true);
                            this.fcFxPortC3InFrames = new FcFxPortC3InFramesEnt(mib, this);
                            this.fcFxPortC3OutFrames = new FcFxPortC3OutFramesEnt(mib, this);
                            this.fcFxPortC3InOctets = new FcFxPortC3InOctetsEnt(mib, this);
                            this.fcFxPortC3OutOctets = new FcFxPortC3OutOctetsEnt(mib, this);
                            this.fcFxPortC3Discards = new FcFxPortC3DiscardsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortC3InFrames,
                                this.fcFxPortC3OutFrames,
                                this.fcFxPortC3InOctets,
                                this.fcFxPortC3OutOctets,
                                this.fcFxPortC3Discards
                            };
                        }
                        public static final class FcFxPortC3InFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC3InFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC3InFrames", "1.3.6.1.2.1.75.1.4.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC3OutFramesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC3OutFramesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC3OutFrames", "1.3.6.1.2.1.75.1.4.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC3InOctetsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC3InOctetsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC3InOctets", "1.3.6.1.2.1.75.1.4.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC3OutOctetsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC3OutOctetsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC3OutOctets", "1.3.6.1.2.1.75.1.4.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortC3DiscardsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortC3DiscardsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortC3Discards", "1.3.6.1.2.1.75.1.4.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class FcFeCapabilitiesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** The Capability Group - consists of a table describinginformation about what each FxPort is inherently capableof operating or supporting.A capability may be used, as expressed in its respectiveobject value in the Configuration group.*/
                public final FcFxPortCapTableEnt fcFxPortCapTable;

                private FcFeCapabilitiesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeCapabilities", "1.3.6.1.2.1.75.1.5", false, false, false, false);
                    this.fcFxPortCapTable = new FcFxPortCapTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFxPortCapTable
                    };
                }
                public static final class FcFxPortCapTableEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    public final FcFxPortCapEntryEnt fcFxPortCapEntry;

                    private FcFxPortCapTableEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFxPortCapTable", "1.3.6.1.2.1.75.1.5.1", false, true, false, false);
                        this.fcFxPortCapEntry = new FcFxPortCapEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.fcFxPortCapEntry
                        };
                    }
                    public static final class FcFxPortCapEntryEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                    {
                        public final FcFxPortCapFcphVersionHighEnt fcFxPortCapFcphVersionHigh;

                        public final FcFxPortCapFcphVersionLowEnt fcFxPortCapFcphVersionLow;

                        public final FcFxPortCapBbCreditMaxEnt fcFxPortCapBbCreditMax;

                        public final FcFxPortCapBbCreditMinEnt fcFxPortCapBbCreditMin;

                        public final FcFxPortCapRxDataFieldSizeMaxEnt fcFxPortCapRxDataFieldSizeMax;

                        public final FcFxPortCapRxDataFieldSizeMinEnt fcFxPortCapRxDataFieldSizeMin;

                        public final FcFxPortCapCosEnt fcFxPortCapCos;

                        public final FcFxPortCapIntermixEnt fcFxPortCapIntermix;

                        public final FcFxPortCapStackedConnModeEnt fcFxPortCapStackedConnMode;

                        public final FcFxPortCapClass2SeqDelivEnt fcFxPortCapClass2SeqDeliv;

                        public final FcFxPortCapClass3SeqDelivEnt fcFxPortCapClass3SeqDeliv;

                        public final FcFxPortCapHoldTimeMaxEnt fcFxPortCapHoldTimeMax;

                        public final FcFxPortCapHoldTimeMinEnt fcFxPortCapHoldTimeMin;

                        private FcFxPortCapEntryEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                        {
                            super(mib, parent, "fcFxPortCapEntry", "1.3.6.1.2.1.75.1.5.1.1", false, false, false, true);
                            this.fcFxPortCapFcphVersionHigh = new FcFxPortCapFcphVersionHighEnt(mib, this);
                            this.fcFxPortCapFcphVersionLow = new FcFxPortCapFcphVersionLowEnt(mib, this);
                            this.fcFxPortCapBbCreditMax = new FcFxPortCapBbCreditMaxEnt(mib, this);
                            this.fcFxPortCapBbCreditMin = new FcFxPortCapBbCreditMinEnt(mib, this);
                            this.fcFxPortCapRxDataFieldSizeMax = new FcFxPortCapRxDataFieldSizeMaxEnt(mib, this);
                            this.fcFxPortCapRxDataFieldSizeMin = new FcFxPortCapRxDataFieldSizeMinEnt(mib, this);
                            this.fcFxPortCapCos = new FcFxPortCapCosEnt(mib, this);
                            this.fcFxPortCapIntermix = new FcFxPortCapIntermixEnt(mib, this);
                            this.fcFxPortCapStackedConnMode = new FcFxPortCapStackedConnModeEnt(mib, this);
                            this.fcFxPortCapClass2SeqDeliv = new FcFxPortCapClass2SeqDelivEnt(mib, this);
                            this.fcFxPortCapClass3SeqDeliv = new FcFxPortCapClass3SeqDelivEnt(mib, this);
                            this.fcFxPortCapHoldTimeMax = new FcFxPortCapHoldTimeMaxEnt(mib, this);
                            this.fcFxPortCapHoldTimeMin = new FcFxPortCapHoldTimeMinEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.fcFxPortCapFcphVersionHigh,
                                this.fcFxPortCapFcphVersionLow,
                                this.fcFxPortCapBbCreditMax,
                                this.fcFxPortCapBbCreditMin,
                                this.fcFxPortCapRxDataFieldSizeMax,
                                this.fcFxPortCapRxDataFieldSizeMin,
                                this.fcFxPortCapCos,
                                this.fcFxPortCapIntermix,
                                this.fcFxPortCapStackedConnMode,
                                this.fcFxPortCapClass2SeqDeliv,
                                this.fcFxPortCapClass3SeqDeliv,
                                this.fcFxPortCapHoldTimeMax,
                                this.fcFxPortCapHoldTimeMin
                            };
                        }
                        public static final class FcFxPortCapFcphVersionHighEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapFcphVersionHighEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapFcphVersionHigh", "1.3.6.1.2.1.75.1.5.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapFcphVersionLowEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapFcphVersionLowEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapFcphVersionLow", "1.3.6.1.2.1.75.1.5.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapBbCreditMaxEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapBbCreditMaxEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapBbCreditMax", "1.3.6.1.2.1.75.1.5.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapBbCreditMinEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapBbCreditMinEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapBbCreditMin", "1.3.6.1.2.1.75.1.5.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapRxDataFieldSizeMaxEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapRxDataFieldSizeMaxEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapRxDataFieldSizeMax", "1.3.6.1.2.1.75.1.5.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapRxDataFieldSizeMinEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapRxDataFieldSizeMinEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapRxDataFieldSizeMin", "1.3.6.1.2.1.75.1.5.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapCosEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapCosEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapCos", "1.3.6.1.2.1.75.1.5.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapIntermixEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapIntermixEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapIntermix", "1.3.6.1.2.1.75.1.5.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapStackedConnModeEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapStackedConnModeEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapStackedConnMode", "1.3.6.1.2.1.75.1.5.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapClass2SeqDelivEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapClass2SeqDelivEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapClass2SeqDeliv", "1.3.6.1.2.1.75.1.5.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapClass3SeqDelivEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapClass3SeqDelivEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapClass3SeqDeliv", "1.3.6.1.2.1.75.1.5.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapHoldTimeMaxEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapHoldTimeMaxEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapHoldTimeMax", "1.3.6.1.2.1.75.1.5.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class FcFxPortCapHoldTimeMinEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                        {
                            private FcFxPortCapHoldTimeMinEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                            {
                                super(mib, parent, "fcFxPortCapHoldTimeMin", "1.3.6.1.2.1.75.1.5.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class FcFeMIBConformanceEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
        {
            public final FcFeMIBCompliancesEnt fcFeMIBCompliances;

            public final FcFeMIBGroupsEnt fcFeMIBGroups;

            private FcFeMIBConformanceEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
            {
                super(mib, parent, "fcFeMIBConformance", "1.3.6.1.2.1.75.2", false, false, false, false);
                this.fcFeMIBCompliances = new FcFeMIBCompliancesEnt(mib, this);
                this.fcFeMIBGroups = new FcFeMIBGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.fcFeMIBCompliances,
                    this.fcFeMIBGroups
                };
            }
            public static final class FcFeMIBCompliancesEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** compliance statements*/
                public final FcFeMIBMinimumComplianceEnt fcFeMIBMinimumCompliance;

                public final FcFeMIBFullComplianceEnt fcFeMIBFullCompliance;

                private FcFeMIBCompliancesEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeMIBCompliances", "1.3.6.1.2.1.75.2.1", false, false, false, false);
                    this.fcFeMIBMinimumCompliance = new FcFeMIBMinimumComplianceEnt(mib, this);
                    this.fcFeMIBFullCompliance = new FcFeMIBFullComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFeMIBMinimumCompliance,
                        this.fcFeMIBFullCompliance
                    };
                }
                public static final class FcFeMIBMinimumComplianceEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeMIBMinimumComplianceEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeMIBMinimumCompliance", "1.3.6.1.2.1.75.2.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeMIBFullComplianceEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeMIBFullComplianceEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeMIBFullCompliance", "1.3.6.1.2.1.75.2.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class FcFeMIBGroupsEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
            {
                /** units of conformance*/
                public final FcFeConfigGroupEnt fcFeConfigGroup;

                public final FcFeStatusGroupEnt fcFeStatusGroup;

                public final FcFeErrorGroupEnt fcFeErrorGroup;

                public final FcFeClass1AccountingGroupEnt fcFeClass1AccountingGroup;

                public final FcFeClass2AccountingGroupEnt fcFeClass2AccountingGroup;

                public final FcFeClass3AccountingGroupEnt fcFeClass3AccountingGroup;

                public final FcFeCapabilitiesGroupEnt fcFeCapabilitiesGroup;

                private FcFeMIBGroupsEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                {
                    super(mib, parent, "fcFeMIBGroups", "1.3.6.1.2.1.75.2.2", false, false, false, false);
                    this.fcFeConfigGroup = new FcFeConfigGroupEnt(mib, this);
                    this.fcFeStatusGroup = new FcFeStatusGroupEnt(mib, this);
                    this.fcFeErrorGroup = new FcFeErrorGroupEnt(mib, this);
                    this.fcFeClass1AccountingGroup = new FcFeClass1AccountingGroupEnt(mib, this);
                    this.fcFeClass2AccountingGroup = new FcFeClass2AccountingGroupEnt(mib, this);
                    this.fcFeClass3AccountingGroup = new FcFeClass3AccountingGroupEnt(mib, this);
                    this.fcFeCapabilitiesGroup = new FcFeCapabilitiesGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.fcFeConfigGroup,
                        this.fcFeStatusGroup,
                        this.fcFeErrorGroup,
                        this.fcFeClass1AccountingGroup,
                        this.fcFeClass2AccountingGroup,
                        this.fcFeClass3AccountingGroup,
                        this.fcFeCapabilitiesGroup
                    };
                }
                public static final class FcFeConfigGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeConfigGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeConfigGroup", "1.3.6.1.2.1.75.2.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeStatusGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeStatusGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeStatusGroup", "1.3.6.1.2.1.75.2.2.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeErrorGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeErrorGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeErrorGroup", "1.3.6.1.2.1.75.2.2.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeClass1AccountingGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeClass1AccountingGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeClass1AccountingGroup", "1.3.6.1.2.1.75.2.2.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeClass2AccountingGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeClass2AccountingGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeClass2AccountingGroup", "1.3.6.1.2.1.75.2.2.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeClass3AccountingGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeClass3AccountingGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeClass3AccountingGroup", "1.3.6.1.2.1.75.2.2.6", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class FcFeCapabilitiesGroupEnt extends MIBEntry<FIBRECHANNELFEMIBDef>
                {
                    private FcFeCapabilitiesGroupEnt(FIBRECHANNELFEMIBDef mib, MIBEntry<FIBRECHANNELFEMIBDef> parent)
                    {
                        super(mib, parent, "fcFeCapabilitiesGroup", "1.3.6.1.2.1.75.2.2.7", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
