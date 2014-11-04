package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class COFFEEPOTMIBDef extends MIB
{
    public static final COFFEEPOTMIBDef COFFEEPOTMIB = new COFFEEPOTMIBDef();

    static { MIBs.getInstance().registerMIB(COFFEEPOTMIBDef.COFFEEPOTMIB); }

    public final CoffeeEnt coffee;

    private COFFEEPOTMIBDef()
    {
        super("COFFEE-POT-MIB");
        this.coffee = new CoffeeEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.coffee
        };
    }

    public static final class CoffeeEnt extends MIBEntry<COFFEEPOTMIBDef>
    {
        public final PotNameEnt potName;

        public final PotCapacityEnt potCapacity;

        public final PotTypeEnt potType;

        public final PotLocationEnt potLocation;

        public final PotMonitorEnt potMonitor;

        private CoffeeEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
        {
            super(mib, parent, "coffee", "1.3.6.1.2.1.10.132", false, false, false, false);
            this.potName = new PotNameEnt(mib, this);
            this.potCapacity = new PotCapacityEnt(mib, this);
            this.potType = new PotTypeEnt(mib, this);
            this.potLocation = new PotLocationEnt(mib, this);
            this.potMonitor = new PotMonitorEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.potName,
                this.potCapacity,
                this.potType,
                this.potLocation,
                this.potMonitor
            };
        }
        public static final class PotNameEnt extends MIBEntry<COFFEEPOTMIBDef>
        {
            private PotNameEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
            {
                super(mib, parent, "potName", "1.3.6.1.2.1.10.132.1", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PotCapacityEnt extends MIBEntry<COFFEEPOTMIBDef>
        {
            private PotCapacityEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
            {
                super(mib, parent, "potCapacity", "1.3.6.1.2.1.10.132.2", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PotTypeEnt extends MIBEntry<COFFEEPOTMIBDef>
        {
            private PotTypeEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
            {
                super(mib, parent, "potType", "1.3.6.1.2.1.10.132.3", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PotLocationEnt extends MIBEntry<COFFEEPOTMIBDef>
        {
            private PotLocationEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
            {
                super(mib, parent, "potLocation", "1.3.6.1.2.1.10.132.4", true, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class PotMonitorEnt extends MIBEntry<COFFEEPOTMIBDef>
        {
            public final PotOperStatusEnt potOperStatus;

            public final PotLevelEnt potLevel;

            public final PotMetricEnt potMetric;

            public final PotStartTimeEnt potStartTime;

            public final LastStartTimeEnt lastStartTime;

            public final PotTemperatureEnt potTemperature;

            private PotMonitorEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
            {
                super(mib, parent, "potMonitor", "1.3.6.1.2.1.10.132.6", false, false, false, false);
                this.potOperStatus = new PotOperStatusEnt(mib, this);
                this.potLevel = new PotLevelEnt(mib, this);
                this.potMetric = new PotMetricEnt(mib, this);
                this.potStartTime = new PotStartTimeEnt(mib, this);
                this.lastStartTime = new LastStartTimeEnt(mib, this);
                this.potTemperature = new PotTemperatureEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.potOperStatus,
                    this.potLevel,
                    this.potMetric,
                    this.potStartTime,
                    this.lastStartTime,
                    this.potTemperature
                };
            }
            public static final class PotOperStatusEnt extends MIBEntry<COFFEEPOTMIBDef>
            {
                private PotOperStatusEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
                {
                    super(mib, parent, "potOperStatus", "1.3.6.1.2.1.10.132.6.1", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PotLevelEnt extends MIBEntry<COFFEEPOTMIBDef>
            {
                private PotLevelEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
                {
                    super(mib, parent, "potLevel", "1.3.6.1.2.1.10.132.6.2", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PotMetricEnt extends MIBEntry<COFFEEPOTMIBDef>
            {
                private PotMetricEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
                {
                    super(mib, parent, "potMetric", "1.3.6.1.2.1.10.132.6.3", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PotStartTimeEnt extends MIBEntry<COFFEEPOTMIBDef>
            {
                private PotStartTimeEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
                {
                    super(mib, parent, "potStartTime", "1.3.6.1.2.1.10.132.6.4", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class LastStartTimeEnt extends MIBEntry<COFFEEPOTMIBDef>
            {
                private LastStartTimeEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
                {
                    super(mib, parent, "lastStartTime", "1.3.6.1.2.1.10.132.6.5", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class PotTemperatureEnt extends MIBEntry<COFFEEPOTMIBDef>
            {
                private PotTemperatureEnt(COFFEEPOTMIBDef mib, MIBEntry<COFFEEPOTMIBDef> parent)
                {
                    super(mib, parent, "potTemperature", "1.3.6.1.2.1.10.132.6.6", true, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

}
