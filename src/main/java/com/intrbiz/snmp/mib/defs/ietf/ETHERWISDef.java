package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ETHERWISDef extends MIB
{
    public static final ETHERWISDef ETHERWIS = new ETHERWISDef();

    /** September 19, 2003*/
    public final EtherWisMIBEnt etherWisMIB;

    private ETHERWISDef()
    {
        super("ETHER-WIS");
        this.etherWisMIB = new EtherWisMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.etherWisMIB
        };
    }

    public static final class EtherWisMIBEnt extends MIBEntry<ETHERWISDef>
    {
        /** The main sections of the module*/
        public final EtherWisObjectsEnt etherWisObjects;

        public final EtherWisObjectsPathEnt etherWisObjectsPath;

        public final EtherWisConformanceEnt etherWisConformance;

        private EtherWisMIBEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
        {
            super(mib, parent, "etherWisMIB", "1.3.6.1.2.1.10.134", false, false, false, false);
            this.etherWisObjects = new EtherWisObjectsEnt(mib, this);
            this.etherWisObjectsPath = new EtherWisObjectsPathEnt(mib, this);
            this.etherWisConformance = new EtherWisConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.etherWisObjects,
                this.etherWisObjectsPath,
                this.etherWisConformance
            };
        }
        public static final class EtherWisObjectsEnt extends MIBEntry<ETHERWISDef>
        {
            /** groups in the Ethernet WIS MIB module*/
            public final EtherWisDeviceEnt etherWisDevice;

            public final EtherWisSectionEnt etherWisSection;

            private EtherWisObjectsEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
            {
                super(mib, parent, "etherWisObjects", "1.3.6.1.2.1.10.134.1", false, false, false, false);
                this.etherWisDevice = new EtherWisDeviceEnt(mib, this);
                this.etherWisSection = new EtherWisSectionEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherWisDevice,
                    this.etherWisSection
                };
            }
            public static final class EtherWisDeviceEnt extends MIBEntry<ETHERWISDef>
            {
                /** The Device group
These objects provide WIS extensions tothe SONET-MIB Medium Group.*/
                public final EtherWisDeviceTableEnt etherWisDeviceTable;

                private EtherWisDeviceEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                {
                    super(mib, parent, "etherWisDevice", "1.3.6.1.2.1.10.134.1.1", false, false, false, false);
                    this.etherWisDeviceTable = new EtherWisDeviceTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherWisDeviceTable
                    };
                }
                public static final class EtherWisDeviceTableEnt extends MIBEntry<ETHERWISDef>
                {
                    public final EtherWisDeviceEntryEnt etherWisDeviceEntry;

                    private EtherWisDeviceTableEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisDeviceTable", "1.3.6.1.2.1.10.134.1.1.1", false, true, false, false);
                        this.etherWisDeviceEntry = new EtherWisDeviceEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.etherWisDeviceEntry
                        };
                    }
                    public static final class EtherWisDeviceEntryEnt extends MIBEntry<ETHERWISDef>
                    {
                        public final EtherWisDeviceTxTestPatternModeEnt etherWisDeviceTxTestPatternMode;

                        public final EtherWisDeviceRxTestPatternModeEnt etherWisDeviceRxTestPatternMode;

                        public final EtherWisDeviceRxTestPatternErrorsEnt etherWisDeviceRxTestPatternErrors;

                        private EtherWisDeviceEntryEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                        {
                            super(mib, parent, "etherWisDeviceEntry", "1.3.6.1.2.1.10.134.1.1.1.1", false, false, false, true);
                            this.etherWisDeviceTxTestPatternMode = new EtherWisDeviceTxTestPatternModeEnt(mib, this);
                            this.etherWisDeviceRxTestPatternMode = new EtherWisDeviceRxTestPatternModeEnt(mib, this);
                            this.etherWisDeviceRxTestPatternErrors = new EtherWisDeviceRxTestPatternErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.etherWisDeviceTxTestPatternMode,
                                this.etherWisDeviceRxTestPatternMode,
                                this.etherWisDeviceRxTestPatternErrors
                            };
                        }
                        public static final class EtherWisDeviceTxTestPatternModeEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisDeviceTxTestPatternModeEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisDeviceTxTestPatternMode", "1.3.6.1.2.1.10.134.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EtherWisDeviceRxTestPatternModeEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisDeviceRxTestPatternModeEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisDeviceRxTestPatternMode", "1.3.6.1.2.1.10.134.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EtherWisDeviceRxTestPatternErrorsEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisDeviceRxTestPatternErrorsEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisDeviceRxTestPatternErrors", "1.3.6.1.2.1.10.134.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EtherWisSectionEnt extends MIBEntry<ETHERWISDef>
            {
                /** The Section group
These objects provide WIS extensions tothe SONET-MIB Section Group.*/
                public final EtherWisSectionCurrentTableEnt etherWisSectionCurrentTable;

                private EtherWisSectionEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                {
                    super(mib, parent, "etherWisSection", "1.3.6.1.2.1.10.134.1.2", false, false, false, false);
                    this.etherWisSectionCurrentTable = new EtherWisSectionCurrentTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherWisSectionCurrentTable
                    };
                }
                public static final class EtherWisSectionCurrentTableEnt extends MIBEntry<ETHERWISDef>
                {
                    public final EtherWisSectionCurrentEntryEnt etherWisSectionCurrentEntry;

                    private EtherWisSectionCurrentTableEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisSectionCurrentTable", "1.3.6.1.2.1.10.134.1.2.1", false, true, false, false);
                        this.etherWisSectionCurrentEntry = new EtherWisSectionCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.etherWisSectionCurrentEntry
                        };
                    }
                    public static final class EtherWisSectionCurrentEntryEnt extends MIBEntry<ETHERWISDef>
                    {
                        public final EtherWisSectionCurrentJ0TransmittedEnt etherWisSectionCurrentJ0Transmitted;

                        public final EtherWisSectionCurrentJ0ReceivedEnt etherWisSectionCurrentJ0Received;

                        private EtherWisSectionCurrentEntryEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                        {
                            super(mib, parent, "etherWisSectionCurrentEntry", "1.3.6.1.2.1.10.134.1.2.1.1", false, false, false, true);
                            this.etherWisSectionCurrentJ0Transmitted = new EtherWisSectionCurrentJ0TransmittedEnt(mib, this);
                            this.etherWisSectionCurrentJ0Received = new EtherWisSectionCurrentJ0ReceivedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.etherWisSectionCurrentJ0Transmitted,
                                this.etherWisSectionCurrentJ0Received
                            };
                        }
                        public static final class EtherWisSectionCurrentJ0TransmittedEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisSectionCurrentJ0TransmittedEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisSectionCurrentJ0Transmitted", "1.3.6.1.2.1.10.134.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EtherWisSectionCurrentJ0ReceivedEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisSectionCurrentJ0ReceivedEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisSectionCurrentJ0Received", "1.3.6.1.2.1.10.134.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class EtherWisObjectsPathEnt extends MIBEntry<ETHERWISDef>
        {
            public final EtherWisPathEnt etherWisPath;

            public final EtherWisFarEndPathEnt etherWisFarEndPath;

            private EtherWisObjectsPathEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
            {
                super(mib, parent, "etherWisObjectsPath", "1.3.6.1.2.1.10.134.2", false, false, false, false);
                this.etherWisPath = new EtherWisPathEnt(mib, this);
                this.etherWisFarEndPath = new EtherWisFarEndPathEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherWisPath,
                    this.etherWisFarEndPath
                };
            }
            public static final class EtherWisPathEnt extends MIBEntry<ETHERWISDef>
            {
                /** The Path group
These objects provide WIS extensions tothe SONET-MIB Path Group.*/
                public final EtherWisPathCurrentTableEnt etherWisPathCurrentTable;

                private EtherWisPathEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                {
                    super(mib, parent, "etherWisPath", "1.3.6.1.2.1.10.134.2.1", false, false, false, false);
                    this.etherWisPathCurrentTable = new EtherWisPathCurrentTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherWisPathCurrentTable
                    };
                }
                public static final class EtherWisPathCurrentTableEnt extends MIBEntry<ETHERWISDef>
                {
                    public final EtherWisPathCurrentEntryEnt etherWisPathCurrentEntry;

                    private EtherWisPathCurrentTableEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisPathCurrentTable", "1.3.6.1.2.1.10.134.2.1.1", false, true, false, false);
                        this.etherWisPathCurrentEntry = new EtherWisPathCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.etherWisPathCurrentEntry
                        };
                    }
                    public static final class EtherWisPathCurrentEntryEnt extends MIBEntry<ETHERWISDef>
                    {
                        public final EtherWisPathCurrentStatusEnt etherWisPathCurrentStatus;

                        public final EtherWisPathCurrentJ1TransmittedEnt etherWisPathCurrentJ1Transmitted;

                        public final EtherWisPathCurrentJ1ReceivedEnt etherWisPathCurrentJ1Received;

                        private EtherWisPathCurrentEntryEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                        {
                            super(mib, parent, "etherWisPathCurrentEntry", "1.3.6.1.2.1.10.134.2.1.1.1", false, false, false, true);
                            this.etherWisPathCurrentStatus = new EtherWisPathCurrentStatusEnt(mib, this);
                            this.etherWisPathCurrentJ1Transmitted = new EtherWisPathCurrentJ1TransmittedEnt(mib, this);
                            this.etherWisPathCurrentJ1Received = new EtherWisPathCurrentJ1ReceivedEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.etherWisPathCurrentStatus,
                                this.etherWisPathCurrentJ1Transmitted,
                                this.etherWisPathCurrentJ1Received
                            };
                        }
                        public static final class EtherWisPathCurrentStatusEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisPathCurrentStatusEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisPathCurrentStatus", "1.3.6.1.2.1.10.134.2.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EtherWisPathCurrentJ1TransmittedEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisPathCurrentJ1TransmittedEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisPathCurrentJ1Transmitted", "1.3.6.1.2.1.10.134.2.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class EtherWisPathCurrentJ1ReceivedEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisPathCurrentJ1ReceivedEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisPathCurrentJ1Received", "1.3.6.1.2.1.10.134.2.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class EtherWisFarEndPathEnt extends MIBEntry<ETHERWISDef>
            {
                /** The Far End Path group
These objects provide WIS extensions tothe SONET-MIB Far End Path Group.*/
                public final EtherWisFarEndPathCurrentTableEnt etherWisFarEndPathCurrentTable;

                private EtherWisFarEndPathEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                {
                    super(mib, parent, "etherWisFarEndPath", "1.3.6.1.2.1.10.134.2.2", false, false, false, false);
                    this.etherWisFarEndPathCurrentTable = new EtherWisFarEndPathCurrentTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherWisFarEndPathCurrentTable
                    };
                }
                public static final class EtherWisFarEndPathCurrentTableEnt extends MIBEntry<ETHERWISDef>
                {
                    public final EtherWisFarEndPathCurrentEntryEnt etherWisFarEndPathCurrentEntry;

                    private EtherWisFarEndPathCurrentTableEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisFarEndPathCurrentTable", "1.3.6.1.2.1.10.134.2.2.1", false, true, false, false);
                        this.etherWisFarEndPathCurrentEntry = new EtherWisFarEndPathCurrentEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.etherWisFarEndPathCurrentEntry
                        };
                    }
                    public static final class EtherWisFarEndPathCurrentEntryEnt extends MIBEntry<ETHERWISDef>
                    {
                        public final EtherWisFarEndPathCurrentStatusEnt etherWisFarEndPathCurrentStatus;

                        private EtherWisFarEndPathCurrentEntryEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                        {
                            super(mib, parent, "etherWisFarEndPathCurrentEntry", "1.3.6.1.2.1.10.134.2.2.1.1", false, false, false, true);
                            this.etherWisFarEndPathCurrentStatus = new EtherWisFarEndPathCurrentStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.etherWisFarEndPathCurrentStatus
                            };
                        }
                        public static final class EtherWisFarEndPathCurrentStatusEnt extends MIBEntry<ETHERWISDef>
                        {
                            private EtherWisFarEndPathCurrentStatusEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                            {
                                super(mib, parent, "etherWisFarEndPathCurrentStatus", "1.3.6.1.2.1.10.134.2.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class EtherWisConformanceEnt extends MIBEntry<ETHERWISDef>
        {
            /** Conformance Statements*/
            public final EtherWisGroupsEnt etherWisGroups;

            public final EtherWisCompliancesEnt etherWisCompliances;

            private EtherWisConformanceEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
            {
                super(mib, parent, "etherWisConformance", "1.3.6.1.2.1.10.134.3", false, false, false, false);
                this.etherWisGroups = new EtherWisGroupsEnt(mib, this);
                this.etherWisCompliances = new EtherWisCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherWisGroups,
                    this.etherWisCompliances
                };
            }
            public static final class EtherWisGroupsEnt extends MIBEntry<ETHERWISDef>
            {
                /** Object Groups*/
                public final EtherWisDeviceGroupBasicEnt etherWisDeviceGroupBasic;

                public final EtherWisDeviceGroupExtraEnt etherWisDeviceGroupExtra;

                public final EtherWisSectionGroupEnt etherWisSectionGroup;

                public final EtherWisPathGroupEnt etherWisPathGroup;

                public final EtherWisFarEndPathGroupEnt etherWisFarEndPathGroup;

                private EtherWisGroupsEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                {
                    super(mib, parent, "etherWisGroups", "1.3.6.1.2.1.10.134.3.1", false, false, false, false);
                    this.etherWisDeviceGroupBasic = new EtherWisDeviceGroupBasicEnt(mib, this);
                    this.etherWisDeviceGroupExtra = new EtherWisDeviceGroupExtraEnt(mib, this);
                    this.etherWisSectionGroup = new EtherWisSectionGroupEnt(mib, this);
                    this.etherWisPathGroup = new EtherWisPathGroupEnt(mib, this);
                    this.etherWisFarEndPathGroup = new EtherWisFarEndPathGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherWisDeviceGroupBasic,
                        this.etherWisDeviceGroupExtra,
                        this.etherWisSectionGroup,
                        this.etherWisPathGroup,
                        this.etherWisFarEndPathGroup
                    };
                }
                public static final class EtherWisDeviceGroupBasicEnt extends MIBEntry<ETHERWISDef>
                {
                    private EtherWisDeviceGroupBasicEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisDeviceGroupBasic", "1.3.6.1.2.1.10.134.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherWisDeviceGroupExtraEnt extends MIBEntry<ETHERWISDef>
                {
                    private EtherWisDeviceGroupExtraEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisDeviceGroupExtra", "1.3.6.1.2.1.10.134.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherWisSectionGroupEnt extends MIBEntry<ETHERWISDef>
                {
                    private EtherWisSectionGroupEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisSectionGroup", "1.3.6.1.2.1.10.134.3.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherWisPathGroupEnt extends MIBEntry<ETHERWISDef>
                {
                    private EtherWisPathGroupEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisPathGroup", "1.3.6.1.2.1.10.134.3.1.4", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class EtherWisFarEndPathGroupEnt extends MIBEntry<ETHERWISDef>
                {
                    private EtherWisFarEndPathGroupEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisFarEndPathGroup", "1.3.6.1.2.1.10.134.3.1.5", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EtherWisCompliancesEnt extends MIBEntry<ETHERWISDef>
            {
                /** Compliance Statements*/
                public final EtherWisComplianceEnt etherWisCompliance;

                private EtherWisCompliancesEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                {
                    super(mib, parent, "etherWisCompliances", "1.3.6.1.2.1.10.134.3.2", false, false, false, false);
                    this.etherWisCompliance = new EtherWisComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.etherWisCompliance
                    };
                }
                public static final class EtherWisComplianceEnt extends MIBEntry<ETHERWISDef>
                {
                    private EtherWisComplianceEnt(ETHERWISDef mib, MIBEntry<ETHERWISDef> parent)
                    {
                        super(mib, parent, "etherWisCompliance", "1.3.6.1.2.1.10.134.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
