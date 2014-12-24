package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class ENTITYSENSORMIBDef extends MIB
{
    public static final ENTITYSENSORMIBDef ENTITYSENSORMIB = new ENTITYSENSORMIBDef();

    public final EntitySensorMIBEnt entitySensorMIB;

    private ENTITYSENSORMIBDef()
    {
        super("ENTITY-SENSOR-MIB");
        this.entitySensorMIB = new EntitySensorMIBEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.entitySensorMIB
        };
    }

    public static final class EntitySensorMIBEnt extends MIBEntry<ENTITYSENSORMIBDef>
    {
        public final EntitySensorObjectsEnt entitySensorObjects;

        /** entitySensorNotifications        OBJECT IDENTIFIER::= { entitySensorMIB 2 }*/
        public final EntitySensorConformanceEnt entitySensorConformance;

        private EntitySensorMIBEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
        {
            super(mib, parent, "entitySensorMIB", "1.3.6.1.2.1.99", false, false, false, false);
            this.entitySensorObjects = new EntitySensorObjectsEnt(mib, this);
            this.entitySensorConformance = new EntitySensorConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.entitySensorObjects,
                this.entitySensorConformance
            };
        }
        public static final class EntitySensorObjectsEnt extends MIBEntry<ENTITYSENSORMIBDef>
        {
            /** Entity Sensor Table*/
            public final EntPhySensorTableEnt entPhySensorTable;

            private EntitySensorObjectsEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
            {
                super(mib, parent, "entitySensorObjects", "1.3.6.1.2.1.99.1", false, false, false, false);
                this.entPhySensorTable = new EntPhySensorTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entPhySensorTable
                };
            }
            public static final class EntPhySensorTableEnt extends MIBEntry<ENTITYSENSORMIBDef>
            {
                /** SPARSE-AUGMENTS*/
                public final EntPhySensorEntryEnt entPhySensorEntry;

                private EntPhySensorTableEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                {
                    super(mib, parent, "entPhySensorTable", "1.3.6.1.2.1.99.1.1", false, true, false, false);
                    this.entPhySensorEntry = new EntPhySensorEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entPhySensorEntry
                    };
                }
                public static final class EntPhySensorEntryEnt extends MIBEntry<ENTITYSENSORMIBDef>
                {
                    public final EntPhySensorTypeEnt entPhySensorType;

                    public final EntPhySensorScaleEnt entPhySensorScale;

                    public final EntPhySensorPrecisionEnt entPhySensorPrecision;

                    public final EntPhySensorValueEnt entPhySensorValue;

                    public final EntPhySensorOperStatusEnt entPhySensorOperStatus;

                    public final EntPhySensorUnitsDisplayEnt entPhySensorUnitsDisplay;

                    public final EntPhySensorValueTimeStampEnt entPhySensorValueTimeStamp;

                    public final EntPhySensorValueUpdateRateEnt entPhySensorValueUpdateRate;

                    private EntPhySensorEntryEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                    {
                        super(mib, parent, "entPhySensorEntry", "1.3.6.1.2.1.99.1.1.1", false, false, false, true);
                        this.entPhySensorType = new EntPhySensorTypeEnt(mib, this);
                        this.entPhySensorScale = new EntPhySensorScaleEnt(mib, this);
                        this.entPhySensorPrecision = new EntPhySensorPrecisionEnt(mib, this);
                        this.entPhySensorValue = new EntPhySensorValueEnt(mib, this);
                        this.entPhySensorOperStatus = new EntPhySensorOperStatusEnt(mib, this);
                        this.entPhySensorUnitsDisplay = new EntPhySensorUnitsDisplayEnt(mib, this);
                        this.entPhySensorValueTimeStamp = new EntPhySensorValueTimeStampEnt(mib, this);
                        this.entPhySensorValueUpdateRate = new EntPhySensorValueUpdateRateEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.entPhySensorType,
                            this.entPhySensorScale,
                            this.entPhySensorPrecision,
                            this.entPhySensorValue,
                            this.entPhySensorOperStatus,
                            this.entPhySensorUnitsDisplay,
                            this.entPhySensorValueTimeStamp,
                            this.entPhySensorValueUpdateRate
                        };
                    }
                    public static final class EntPhySensorTypeEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorTypeEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorType", "1.3.6.1.2.1.99.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorScaleEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorScaleEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorScale", "1.3.6.1.2.1.99.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorPrecisionEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorPrecisionEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorPrecision", "1.3.6.1.2.1.99.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorValueEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorValueEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorValue", "1.3.6.1.2.1.99.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorOperStatusEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorOperStatusEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorOperStatus", "1.3.6.1.2.1.99.1.1.1.5", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorUnitsDisplayEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorUnitsDisplayEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorUnitsDisplay", "1.3.6.1.2.1.99.1.1.1.6", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorValueTimeStampEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorValueTimeStampEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorValueTimeStamp", "1.3.6.1.2.1.99.1.1.1.7", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class EntPhySensorValueUpdateRateEnt extends MIBEntry<ENTITYSENSORMIBDef>
                    {
                        private EntPhySensorValueUpdateRateEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                        {
                            super(mib, parent, "entPhySensorValueUpdateRate", "1.3.6.1.2.1.99.1.1.1.8", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class EntitySensorConformanceEnt extends MIBEntry<ENTITYSENSORMIBDef>
        {
            /** Conformance Section*/
            public final EntitySensorCompliancesEnt entitySensorCompliances;

            public final EntitySensorGroupsEnt entitySensorGroups;

            private EntitySensorConformanceEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
            {
                super(mib, parent, "entitySensorConformance", "1.3.6.1.2.1.99.3", false, false, false, false);
                this.entitySensorCompliances = new EntitySensorCompliancesEnt(mib, this);
                this.entitySensorGroups = new EntitySensorGroupsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.entitySensorCompliances,
                    this.entitySensorGroups
                };
            }
            public static final class EntitySensorCompliancesEnt extends MIBEntry<ENTITYSENSORMIBDef>
            {
                public final EntitySensorComplianceEnt entitySensorCompliance;

                private EntitySensorCompliancesEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                {
                    super(mib, parent, "entitySensorCompliances", "1.3.6.1.2.1.99.3.1", false, false, false, false);
                    this.entitySensorCompliance = new EntitySensorComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entitySensorCompliance
                    };
                }
                public static final class EntitySensorComplianceEnt extends MIBEntry<ENTITYSENSORMIBDef>
                {
                    private EntitySensorComplianceEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                    {
                        super(mib, parent, "entitySensorCompliance", "1.3.6.1.2.1.99.3.1.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class EntitySensorGroupsEnt extends MIBEntry<ENTITYSENSORMIBDef>
            {
                /** Object Groups*/
                public final EntitySensorValueGroupEnt entitySensorValueGroup;

                private EntitySensorGroupsEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                {
                    super(mib, parent, "entitySensorGroups", "1.3.6.1.2.1.99.3.2", false, false, false, false);
                    this.entitySensorValueGroup = new EntitySensorValueGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.entitySensorValueGroup
                    };
                }
                public static final class EntitySensorValueGroupEnt extends MIBEntry<ENTITYSENSORMIBDef>
                {
                    private EntitySensorValueGroupEnt(ENTITYSENSORMIBDef mib, MIBEntry<ENTITYSENSORMIBDef> parent)
                    {
                        super(mib, parent, "entitySensorValueGroup", "1.3.6.1.2.1.99.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
