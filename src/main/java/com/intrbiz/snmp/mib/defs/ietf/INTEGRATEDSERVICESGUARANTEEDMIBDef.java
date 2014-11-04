package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class INTEGRATEDSERVICESGUARANTEEDMIBDef extends MIB
{
    public static final INTEGRATEDSERVICESGUARANTEEDMIBDef INTEGRATEDSERVICESGUARANTEEDMIB = new INTEGRATEDSERVICESGUARANTEEDMIBDef();

    static { MIBs.getInstance().registerMIB(INTEGRATEDSERVICESGUARANTEEDMIBDef.INTEGRATEDSERVICESGUARANTEEDMIB); }

    /** This MIB module uses the extended OBJECT-TYPE macro asdefined in [9].

Thu Aug 28 09:04:22 PDT 1997*/
    public final IntSrvGuaranteedEnt intSrvGuaranteed;

    private INTEGRATEDSERVICESGUARANTEEDMIBDef()
    {
        super("INTEGRATED-SERVICES-GUARANTEED-MIB");
        this.intSrvGuaranteed = new IntSrvGuaranteedEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.intSrvGuaranteed
        };
    }

    public static final class IntSrvGuaranteedEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
    {
        public final IntSrvGuaranteedObjectsEnt intSrvGuaranteedObjects;

        public final IntSrvGuaranteedNotificationsEnt intSrvGuaranteedNotifications;

        public final IntSrvGuaranteedConformanceEnt intSrvGuaranteedConformance;

        private IntSrvGuaranteedEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
        {
            super(mib, parent, "intSrvGuaranteed", "1.3.6.1.2.1.52.5", false, false, false, false);
            this.intSrvGuaranteedObjects = new IntSrvGuaranteedObjectsEnt(mib, this);
            this.intSrvGuaranteedNotifications = new IntSrvGuaranteedNotificationsEnt(mib, this);
            this.intSrvGuaranteedConformance = new IntSrvGuaranteedConformanceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.intSrvGuaranteedObjects,
                this.intSrvGuaranteedNotifications,
                this.intSrvGuaranteedConformance
            };
        }
        public static final class IntSrvGuaranteedObjectsEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
        {
            /** The Integrated Services Interface Attributes Databasecontains information that is shared with other reservationprocedures such as ST-II.*/
            public final IntSrvGuaranteedIfTableEnt intSrvGuaranteedIfTable;

            private IntSrvGuaranteedObjectsEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
            {
                super(mib, parent, "intSrvGuaranteedObjects", "1.3.6.1.2.1.52.5.1", false, false, false, false);
                this.intSrvGuaranteedIfTable = new IntSrvGuaranteedIfTableEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.intSrvGuaranteedIfTable
                };
            }
            public static final class IntSrvGuaranteedIfTableEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
            {
                public final IntSrvGuaranteedIfEntryEnt intSrvGuaranteedIfEntry;

                private IntSrvGuaranteedIfTableEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                {
                    super(mib, parent, "intSrvGuaranteedIfTable", "1.3.6.1.2.1.52.5.1.1", false, true, false, false);
                    this.intSrvGuaranteedIfEntry = new IntSrvGuaranteedIfEntryEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvGuaranteedIfEntry
                    };
                }
                public static final class IntSrvGuaranteedIfEntryEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                {
                    public final IntSrvGuaranteedIfBacklogEnt intSrvGuaranteedIfBacklog;

                    public final IntSrvGuaranteedIfDelayEnt intSrvGuaranteedIfDelay;

                    public final IntSrvGuaranteedIfSlackEnt intSrvGuaranteedIfSlack;

                    public final IntSrvGuaranteedIfStatusEnt intSrvGuaranteedIfStatus;

                    private IntSrvGuaranteedIfEntryEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                    {
                        super(mib, parent, "intSrvGuaranteedIfEntry", "1.3.6.1.2.1.52.5.1.1.1", false, false, false, true);
                        this.intSrvGuaranteedIfBacklog = new IntSrvGuaranteedIfBacklogEnt(mib, this);
                        this.intSrvGuaranteedIfDelay = new IntSrvGuaranteedIfDelayEnt(mib, this);
                        this.intSrvGuaranteedIfSlack = new IntSrvGuaranteedIfSlackEnt(mib, this);
                        this.intSrvGuaranteedIfStatus = new IntSrvGuaranteedIfStatusEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.intSrvGuaranteedIfBacklog,
                            this.intSrvGuaranteedIfDelay,
                            this.intSrvGuaranteedIfSlack,
                            this.intSrvGuaranteedIfStatus
                        };
                    }
                    public static final class IntSrvGuaranteedIfBacklogEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                    {
                        private IntSrvGuaranteedIfBacklogEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                        {
                            super(mib, parent, "intSrvGuaranteedIfBacklog", "1.3.6.1.2.1.52.5.1.1.1.1", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvGuaranteedIfDelayEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                    {
                        private IntSrvGuaranteedIfDelayEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                        {
                            super(mib, parent, "intSrvGuaranteedIfDelay", "1.3.6.1.2.1.52.5.1.1.1.2", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvGuaranteedIfSlackEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                    {
                        private IntSrvGuaranteedIfSlackEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                        {
                            super(mib, parent, "intSrvGuaranteedIfSlack", "1.3.6.1.2.1.52.5.1.1.1.3", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class IntSrvGuaranteedIfStatusEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                    {
                        private IntSrvGuaranteedIfStatusEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                        {
                            super(mib, parent, "intSrvGuaranteedIfStatus", "1.3.6.1.2.1.52.5.1.1.1.4", false, false, true, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

            }

        }

        public static final class IntSrvGuaranteedNotificationsEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
        {
            private IntSrvGuaranteedNotificationsEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
            {
                super(mib, parent, "intSrvGuaranteedNotifications", "1.3.6.1.2.1.52.5.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class IntSrvGuaranteedConformanceEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
        {
            /** No notifications are currently defined
conformance information*/
            public final IntSrvGuaranteedGroupsEnt intSrvGuaranteedGroups;

            public final IntSrvGuaranteedCompliancesEnt intSrvGuaranteedCompliances;

            private IntSrvGuaranteedConformanceEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
            {
                super(mib, parent, "intSrvGuaranteedConformance", "1.3.6.1.2.1.52.5.3", false, false, false, false);
                this.intSrvGuaranteedGroups = new IntSrvGuaranteedGroupsEnt(mib, this);
                this.intSrvGuaranteedCompliances = new IntSrvGuaranteedCompliancesEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.intSrvGuaranteedGroups,
                    this.intSrvGuaranteedCompliances
                };
            }
            public static final class IntSrvGuaranteedGroupsEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
            {
                public final IntSrvGuaranteedIfAttribGroupEnt intSrvGuaranteedIfAttribGroup;

                private IntSrvGuaranteedGroupsEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                {
                    super(mib, parent, "intSrvGuaranteedGroups", "1.3.6.1.2.1.52.5.3.1", false, false, false, false);
                    this.intSrvGuaranteedIfAttribGroup = new IntSrvGuaranteedIfAttribGroupEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvGuaranteedIfAttribGroup
                    };
                }
                public static final class IntSrvGuaranteedIfAttribGroupEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                {
                    private IntSrvGuaranteedIfAttribGroupEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                    {
                        super(mib, parent, "intSrvGuaranteedIfAttribGroup", "1.3.6.1.2.1.52.5.3.1.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class IntSrvGuaranteedCompliancesEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
            {
                /** compliance statements*/
                public final IntSrvGuaranteedComplianceEnt intSrvGuaranteedCompliance;

                private IntSrvGuaranteedCompliancesEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                {
                    super(mib, parent, "intSrvGuaranteedCompliances", "1.3.6.1.2.1.52.5.3.2", false, false, false, false);
                    this.intSrvGuaranteedCompliance = new IntSrvGuaranteedComplianceEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.intSrvGuaranteedCompliance
                    };
                }
                public static final class IntSrvGuaranteedComplianceEnt extends MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef>
                {
                    private IntSrvGuaranteedComplianceEnt(INTEGRATEDSERVICESGUARANTEEDMIBDef mib, MIBEntry<INTEGRATEDSERVICESGUARANTEEDMIBDef> parent)
                    {
                        super(mib, parent, "intSrvGuaranteedCompliance", "1.3.6.1.2.1.52.5.3.2.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

}
