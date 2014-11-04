package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNMPREPEATERMIBDef extends MIB
{
    public static final SNMPREPEATERMIBDef SNMPREPEATERMIB = new SNMPREPEATERMIBDef();

    static { MIBs.getInstance().registerMIB(SNMPREPEATERMIBDef.SNMPREPEATERMIB); }

    public final SnmpDot3RptrMgtEnt snmpDot3RptrMgt;

    /** Notifications for use by Repeaters*/
    public final RptrHealthEnt rptrHealth;

    public final RptrGroupChangeEnt rptrGroupChange;

    public final RptrResetEventEnt rptrResetEvent;

    /** Notifications for repeaters in a multiple-repeater implementation.An implementation may send either the single-repeater ORmultiple-repeater version of these notifications (1 or 4; 2 or 5)but not both.*/
    public final RptrInfoHealthEnt rptrInfoHealth;

    public final RptrInfoResetEventEnt rptrInfoResetEvent;

    private SNMPREPEATERMIBDef()
    {
        super("SNMP-REPEATER-MIB");
        this.snmpDot3RptrMgt = new SnmpDot3RptrMgtEnt(this, null);
        this.rptrHealth = new RptrHealthEnt(this, null);
        this.rptrGroupChange = new RptrGroupChangeEnt(this, null);
        this.rptrResetEvent = new RptrResetEventEnt(this, null);
        this.rptrInfoHealth = new RptrInfoHealthEnt(this, null);
        this.rptrInfoResetEvent = new RptrInfoResetEventEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snmpDot3RptrMgt,
            this.rptrHealth,
            this.rptrGroupChange,
            this.rptrResetEvent,
            this.rptrInfoHealth,
            this.rptrInfoResetEvent
        };
    }

    public static final class SnmpDot3RptrMgtEnt extends MIBEntry<SNMPREPEATERMIBDef>
    {
        public final SnmpRptrModEnt snmpRptrMod;

        /** Basic information at the repeater, group, and port level.*/
        public final RptrBasicPackageEnt rptrBasicPackage;

        /** Monitoring information at the repeater, group, and port level.*/
        public final RptrMonitorPackageEnt rptrMonitorPackage;

        /** Address tracking information at the repeater, group,and port level.*/
        public final RptrAddrTrackPackageEnt rptrAddrTrackPackage;

        /** TopN information.*/
        public final RptrTopNPackageEnt rptrTopNPackage;

        private SnmpDot3RptrMgtEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
        {
            super(mib, parent, "snmpDot3RptrMgt", "1.3.6.1.2.1.22", false, false, false, false);
            this.snmpRptrMod = new SnmpRptrModEnt(mib, this);
            this.rptrBasicPackage = new RptrBasicPackageEnt(mib, this);
            this.rptrMonitorPackage = new RptrMonitorPackageEnt(mib, this);
            this.rptrAddrTrackPackage = new RptrAddrTrackPackageEnt(mib, this);
            this.rptrTopNPackage = new RptrTopNPackageEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.snmpRptrMod,
                this.rptrBasicPackage,
                this.rptrMonitorPackage,
                this.rptrAddrTrackPackage,
                this.rptrTopNPackage
            };
        }
        public static final class SnmpRptrModEnt extends MIBEntry<SNMPREPEATERMIBDef>
        {
            /** Conformance information*/
            public final SnmpRptrModConfEnt snmpRptrModConf;

            private SnmpRptrModEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
            {
                super(mib, parent, "snmpRptrMod", "1.3.6.1.2.1.22.5", false, false, false, false);
                this.snmpRptrModConf = new SnmpRptrModConfEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.snmpRptrModConf
                };
            }
            public static final class SnmpRptrModConfEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                public final SnmpRptrModComplsEnt snmpRptrModCompls;

                public final SnmpRptrModObjGrpsEnt snmpRptrModObjGrps;

                public final SnmpRptrModNotGrpsEnt snmpRptrModNotGrps;

                private SnmpRptrModConfEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "snmpRptrModConf", "1.3.6.1.2.1.22.5.1", false, false, false, false);
                    this.snmpRptrModCompls = new SnmpRptrModComplsEnt(mib, this);
                    this.snmpRptrModObjGrps = new SnmpRptrModObjGrpsEnt(mib, this);
                    this.snmpRptrModNotGrps = new SnmpRptrModNotGrpsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.snmpRptrModCompls,
                        this.snmpRptrModObjGrps,
                        this.snmpRptrModNotGrps
                    };
                }
                public static final class SnmpRptrModComplsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    /** Compliances*/
                    public final SnmpRptrModComplRFC1368Ent snmpRptrModComplRFC1368;

                    public final SnmpRptrModComplRFC1516Ent snmpRptrModComplRFC1516;

                    public final SnmpRptrModComplEnt snmpRptrModCompl;

                    private SnmpRptrModComplsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "snmpRptrModCompls", "1.3.6.1.2.1.22.5.1.1", false, false, false, false);
                        this.snmpRptrModComplRFC1368 = new SnmpRptrModComplRFC1368Ent(mib, this);
                        this.snmpRptrModComplRFC1516 = new SnmpRptrModComplRFC1516Ent(mib, this);
                        this.snmpRptrModCompl = new SnmpRptrModComplEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpRptrModComplRFC1368,
                            this.snmpRptrModComplRFC1516,
                            this.snmpRptrModCompl
                        };
                    }
                    public static final class SnmpRptrModComplRFC1368Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrModComplRFC1368Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrModComplRFC1368", "1.3.6.1.2.1.22.5.1.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrModComplRFC1516Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrModComplRFC1516Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrModComplRFC1516", "1.3.6.1.2.1.22.5.1.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrModComplEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrModComplEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrModCompl", "1.3.6.1.2.1.22.5.1.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class SnmpRptrModObjGrpsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    /** Object groups*/
                    public final SnmpRptrGrpBasic1516Ent snmpRptrGrpBasic1516;

                    public final SnmpRptrGrpMonitor1516Ent snmpRptrGrpMonitor1516;

                    public final SnmpRptrGrpAddrTrack1368Ent snmpRptrGrpAddrTrack1368;

                    public final SnmpRptrGrpAddrTrack1516Ent snmpRptrGrpAddrTrack1516;

                    public final SnmpRptrGrpBasicEnt snmpRptrGrpBasic;

                    public final SnmpRptrGrpMonitorEnt snmpRptrGrpMonitor;

                    public final SnmpRptrGrpMonitor100Ent snmpRptrGrpMonitor100;

                    public final SnmpRptrGrpMonitor100w64Ent snmpRptrGrpMonitor100w64;

                    public final SnmpRptrGrpAddrTrackEnt snmpRptrGrpAddrTrack;

                    public final SnmpRptrGrpExtAddrTrackEnt snmpRptrGrpExtAddrTrack;

                    public final SnmpRptrGrpRptrAddrSearchEnt snmpRptrGrpRptrAddrSearch;

                    public final SnmpRptrGrpTopNPortEnt snmpRptrGrpTopNPort;

                    private SnmpRptrModObjGrpsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "snmpRptrModObjGrps", "1.3.6.1.2.1.22.5.1.2", false, false, false, false);
                        this.snmpRptrGrpBasic1516 = new SnmpRptrGrpBasic1516Ent(mib, this);
                        this.snmpRptrGrpMonitor1516 = new SnmpRptrGrpMonitor1516Ent(mib, this);
                        this.snmpRptrGrpAddrTrack1368 = new SnmpRptrGrpAddrTrack1368Ent(mib, this);
                        this.snmpRptrGrpAddrTrack1516 = new SnmpRptrGrpAddrTrack1516Ent(mib, this);
                        this.snmpRptrGrpBasic = new SnmpRptrGrpBasicEnt(mib, this);
                        this.snmpRptrGrpMonitor = new SnmpRptrGrpMonitorEnt(mib, this);
                        this.snmpRptrGrpMonitor100 = new SnmpRptrGrpMonitor100Ent(mib, this);
                        this.snmpRptrGrpMonitor100w64 = new SnmpRptrGrpMonitor100w64Ent(mib, this);
                        this.snmpRptrGrpAddrTrack = new SnmpRptrGrpAddrTrackEnt(mib, this);
                        this.snmpRptrGrpExtAddrTrack = new SnmpRptrGrpExtAddrTrackEnt(mib, this);
                        this.snmpRptrGrpRptrAddrSearch = new SnmpRptrGrpRptrAddrSearchEnt(mib, this);
                        this.snmpRptrGrpTopNPort = new SnmpRptrGrpTopNPortEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.snmpRptrGrpBasic1516,
                            this.snmpRptrGrpMonitor1516,
                            this.snmpRptrGrpAddrTrack1368,
                            this.snmpRptrGrpAddrTrack1516,
                            this.snmpRptrGrpBasic,
                            this.snmpRptrGrpMonitor,
                            this.snmpRptrGrpMonitor100,
                            this.snmpRptrGrpMonitor100w64,
                            this.snmpRptrGrpAddrTrack,
                            this.snmpRptrGrpExtAddrTrack,
                            this.snmpRptrGrpRptrAddrSearch,
                            this.snmpRptrGrpTopNPort
                        };
                    }
                    public static final class SnmpRptrGrpBasic1516Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpBasic1516Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpBasic1516", "1.3.6.1.2.1.22.5.1.2.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpMonitor1516Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpMonitor1516Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpMonitor1516", "1.3.6.1.2.1.22.5.1.2.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpAddrTrack1368Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpAddrTrack1368Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpAddrTrack1368", "1.3.6.1.2.1.22.5.1.2.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpAddrTrack1516Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpAddrTrack1516Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpAddrTrack1516", "1.3.6.1.2.1.22.5.1.2.4", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpBasicEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpBasicEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpBasic", "1.3.6.1.2.1.22.5.1.2.5", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpMonitorEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpMonitorEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpMonitor", "1.3.6.1.2.1.22.5.1.2.6", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpMonitor100Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpMonitor100Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpMonitor100", "1.3.6.1.2.1.22.5.1.2.7", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpMonitor100w64Ent extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpMonitor100w64Ent(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpMonitor100w64", "1.3.6.1.2.1.22.5.1.2.8", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpAddrTrackEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpAddrTrackEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpAddrTrack", "1.3.6.1.2.1.22.5.1.2.9", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpExtAddrTrackEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpExtAddrTrackEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpExtAddrTrack", "1.3.6.1.2.1.22.5.1.2.10", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpRptrAddrSearchEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpRptrAddrSearchEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpRptrAddrSearch", "1.3.6.1.2.1.22.5.1.2.11", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SnmpRptrGrpTopNPortEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        private SnmpRptrGrpTopNPortEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "snmpRptrGrpTopNPort", "1.3.6.1.2.1.22.5.1.2.12", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class SnmpRptrModNotGrpsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private SnmpRptrModNotGrpsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "snmpRptrModNotGrps", "1.3.6.1.2.1.22.5.1.3", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

        public static final class RptrBasicPackageEnt extends MIBEntry<SNMPREPEATERMIBDef>
        {
            public final RptrRptrInfoEnt rptrRptrInfo;

            public final RptrGroupInfoEnt rptrGroupInfo;

            public final RptrPortInfoEnt rptrPortInfo;

            public final RptrAllRptrInfoEnt rptrAllRptrInfo;

            private RptrBasicPackageEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
            {
                super(mib, parent, "rptrBasicPackage", "1.3.6.1.2.1.22.1", false, false, false, false);
                this.rptrRptrInfo = new RptrRptrInfoEnt(mib, this);
                this.rptrGroupInfo = new RptrGroupInfoEnt(mib, this);
                this.rptrPortInfo = new RptrPortInfoEnt(mib, this);
                this.rptrAllRptrInfo = new RptrAllRptrInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rptrRptrInfo,
                    this.rptrGroupInfo,
                    this.rptrPortInfo,
                    this.rptrAllRptrInfo
                };
            }
            public static final class RptrRptrInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** Old version of basic information at the repeater level.In a system containing a single managed repeater,configuration, status, and control objects for the overallrepeater.
The objects contained under the rptrRptrInfo subtree areintended for backwards compatibility with implementations ofRFC 1516 [11].  In newer implementations (both single- andmultiple-repeater implementations) the rptrInfoTable shouldbe implemented.  It is the preferred source of this information,as it contains the values for all repeaters managed by theagent.  In all cases, the objects in the rptrRptrInfo subtreeare duplicates of the corresponding objects in the first entryof the rptrInfoTable.*/
                public final RptrGroupCapacityEnt rptrGroupCapacity;

                public final RptrOperStatusEnt rptrOperStatus;

                public final RptrHealthTextEnt rptrHealthText;

                public final RptrResetEnt rptrReset;

                public final RptrNonDisruptTestEnt rptrNonDisruptTest;

                public final RptrTotalPartitionedPortsEnt rptrTotalPartitionedPorts;

                private RptrRptrInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrRptrInfo", "1.3.6.1.2.1.22.1.1", false, false, false, false);
                    this.rptrGroupCapacity = new RptrGroupCapacityEnt(mib, this);
                    this.rptrOperStatus = new RptrOperStatusEnt(mib, this);
                    this.rptrHealthText = new RptrHealthTextEnt(mib, this);
                    this.rptrReset = new RptrResetEnt(mib, this);
                    this.rptrNonDisruptTest = new RptrNonDisruptTestEnt(mib, this);
                    this.rptrTotalPartitionedPorts = new RptrTotalPartitionedPortsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrGroupCapacity,
                        this.rptrOperStatus,
                        this.rptrHealthText,
                        this.rptrReset,
                        this.rptrNonDisruptTest,
                        this.rptrTotalPartitionedPorts
                    };
                }
                public static final class RptrGroupCapacityEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrGroupCapacityEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrGroupCapacity", "1.3.6.1.2.1.22.1.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RptrOperStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrOperStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrOperStatus", "1.3.6.1.2.1.22.1.1.2", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RptrHealthTextEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrHealthTextEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrHealthText", "1.3.6.1.2.1.22.1.1.3", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RptrResetEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrResetEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrReset", "1.3.6.1.2.1.22.1.1.4", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RptrNonDisruptTestEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrNonDisruptTestEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrNonDisruptTest", "1.3.6.1.2.1.22.1.1.5", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class RptrTotalPartitionedPortsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrTotalPartitionedPortsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrTotalPartitionedPorts", "1.3.6.1.2.1.22.1.1.6", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RptrGroupInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** Basic information at the group level.Configuration and status objects for eachmanaged group in the system, independentof whether there is one or more managedrepeater-units in the system.*/
                public final RptrGroupTableEnt rptrGroupTable;

                private RptrGroupInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrGroupInfo", "1.3.6.1.2.1.22.1.2", false, false, false, false);
                    this.rptrGroupTable = new RptrGroupTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrGroupTable
                    };
                }
                public static final class RptrGroupTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrGroupEntryEnt rptrGroupEntry;

                    private RptrGroupTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrGroupTable", "1.3.6.1.2.1.22.1.2.1", false, true, false, false);
                        this.rptrGroupEntry = new RptrGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrGroupEntry
                        };
                    }
                    public static final class RptrGroupEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrGroupIndexEnt rptrGroupIndex;

                        public final RptrGroupDescrEnt rptrGroupDescr;

                        public final RptrGroupObjectIDEnt rptrGroupObjectID;

                        public final RptrGroupOperStatusEnt rptrGroupOperStatus;

                        public final RptrGroupLastOperStatusChangeEnt rptrGroupLastOperStatusChange;

                        public final RptrGroupPortCapacityEnt rptrGroupPortCapacity;

                        private RptrGroupEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrGroupEntry", "1.3.6.1.2.1.22.1.2.1.1", false, false, false, true);
                            this.rptrGroupIndex = new RptrGroupIndexEnt(mib, this);
                            this.rptrGroupDescr = new RptrGroupDescrEnt(mib, this);
                            this.rptrGroupObjectID = new RptrGroupObjectIDEnt(mib, this);
                            this.rptrGroupOperStatus = new RptrGroupOperStatusEnt(mib, this);
                            this.rptrGroupLastOperStatusChange = new RptrGroupLastOperStatusChangeEnt(mib, this);
                            this.rptrGroupPortCapacity = new RptrGroupPortCapacityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrGroupIndex,
                                this.rptrGroupDescr,
                                this.rptrGroupObjectID,
                                this.rptrGroupOperStatus,
                                this.rptrGroupLastOperStatusChange,
                                this.rptrGroupPortCapacity
                            };
                        }
                        public static final class RptrGroupIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrGroupIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrGroupIndex", "1.3.6.1.2.1.22.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrGroupDescrEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrGroupDescrEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrGroupDescr", "1.3.6.1.2.1.22.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrGroupObjectIDEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrGroupObjectIDEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrGroupObjectID", "1.3.6.1.2.1.22.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrGroupOperStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrGroupOperStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrGroupOperStatus", "1.3.6.1.2.1.22.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrGroupLastOperStatusChangeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrGroupLastOperStatusChangeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrGroupLastOperStatusChange", "1.3.6.1.2.1.22.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrGroupPortCapacityEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrGroupPortCapacityEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrGroupPortCapacity", "1.3.6.1.2.1.22.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RptrPortInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** Basic information at the port level.Configuration and status objects foreach managed repeater port in the system,independent of whether there is one or moremanaged repeater-units in the system.*/
                public final RptrPortTableEnt rptrPortTable;

                private RptrPortInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrPortInfo", "1.3.6.1.2.1.22.1.3", false, false, false, false);
                    this.rptrPortTable = new RptrPortTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrPortTable
                    };
                }
                public static final class RptrPortTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrPortEntryEnt rptrPortEntry;

                    private RptrPortTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrPortTable", "1.3.6.1.2.1.22.1.3.1", false, true, false, false);
                        this.rptrPortEntry = new RptrPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrPortEntry
                        };
                    }
                    public static final class RptrPortEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrPortGroupIndexEnt rptrPortGroupIndex;

                        public final RptrPortIndexEnt rptrPortIndex;

                        public final RptrPortAdminStatusEnt rptrPortAdminStatus;

                        public final RptrPortAutoPartitionStateEnt rptrPortAutoPartitionState;

                        public final RptrPortOperStatusEnt rptrPortOperStatus;

                        public final RptrPortRptrIdEnt rptrPortRptrId;

                        private RptrPortEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrPortEntry", "1.3.6.1.2.1.22.1.3.1.1", false, false, false, true);
                            this.rptrPortGroupIndex = new RptrPortGroupIndexEnt(mib, this);
                            this.rptrPortIndex = new RptrPortIndexEnt(mib, this);
                            this.rptrPortAdminStatus = new RptrPortAdminStatusEnt(mib, this);
                            this.rptrPortAutoPartitionState = new RptrPortAutoPartitionStateEnt(mib, this);
                            this.rptrPortOperStatus = new RptrPortOperStatusEnt(mib, this);
                            this.rptrPortRptrId = new RptrPortRptrIdEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrPortGroupIndex,
                                this.rptrPortIndex,
                                this.rptrPortAdminStatus,
                                this.rptrPortAutoPartitionState,
                                this.rptrPortOperStatus,
                                this.rptrPortRptrId
                            };
                        }
                        public static final class RptrPortGroupIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrPortGroupIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrPortGroupIndex", "1.3.6.1.2.1.22.1.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrPortIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrPortIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrPortIndex", "1.3.6.1.2.1.22.1.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrPortAdminStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrPortAdminStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrPortAdminStatus", "1.3.6.1.2.1.22.1.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrPortAutoPartitionStateEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrPortAutoPartitionStateEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrPortAutoPartitionState", "1.3.6.1.2.1.22.1.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrPortOperStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrPortOperStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrPortOperStatus", "1.3.6.1.2.1.22.1.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrPortRptrIdEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrPortRptrIdEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrPortRptrId", "1.3.6.1.2.1.22.1.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RptrAllRptrInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** New version of basic information at the repeater level.Configuration, status, and control objects foreach managed repeater in the system.*/
                public final RptrInfoTableEnt rptrInfoTable;

                private RptrAllRptrInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrAllRptrInfo", "1.3.6.1.2.1.22.1.4", false, false, false, false);
                    this.rptrInfoTable = new RptrInfoTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrInfoTable
                    };
                }
                public static final class RptrInfoTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrInfoEntryEnt rptrInfoEntry;

                    private RptrInfoTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrInfoTable", "1.3.6.1.2.1.22.1.4.1", false, true, false, false);
                        this.rptrInfoEntry = new RptrInfoEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrInfoEntry
                        };
                    }
                    public static final class RptrInfoEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrInfoIdEnt rptrInfoId;

                        public final RptrInfoRptrTypeEnt rptrInfoRptrType;

                        public final RptrInfoOperStatusEnt rptrInfoOperStatus;

                        public final RptrInfoResetEnt rptrInfoReset;

                        public final RptrInfoPartitionedPortsEnt rptrInfoPartitionedPorts;

                        public final RptrInfoLastChangeEnt rptrInfoLastChange;

                        private RptrInfoEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrInfoEntry", "1.3.6.1.2.1.22.1.4.1.1", false, false, false, true);
                            this.rptrInfoId = new RptrInfoIdEnt(mib, this);
                            this.rptrInfoRptrType = new RptrInfoRptrTypeEnt(mib, this);
                            this.rptrInfoOperStatus = new RptrInfoOperStatusEnt(mib, this);
                            this.rptrInfoReset = new RptrInfoResetEnt(mib, this);
                            this.rptrInfoPartitionedPorts = new RptrInfoPartitionedPortsEnt(mib, this);
                            this.rptrInfoLastChange = new RptrInfoLastChangeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrInfoId,
                                this.rptrInfoRptrType,
                                this.rptrInfoOperStatus,
                                this.rptrInfoReset,
                                this.rptrInfoPartitionedPorts,
                                this.rptrInfoLastChange
                            };
                        }
                        public static final class RptrInfoIdEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrInfoIdEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrInfoId", "1.3.6.1.2.1.22.1.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrInfoRptrTypeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrInfoRptrTypeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrInfoRptrType", "1.3.6.1.2.1.22.1.4.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrInfoOperStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrInfoOperStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrInfoOperStatus", "1.3.6.1.2.1.22.1.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrInfoResetEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrInfoResetEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrInfoReset", "1.3.6.1.2.1.22.1.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrInfoPartitionedPortsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrInfoPartitionedPortsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrInfoPartitionedPorts", "1.3.6.1.2.1.22.1.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrInfoLastChangeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrInfoLastChangeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrInfoLastChange", "1.3.6.1.2.1.22.1.4.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class RptrMonitorPackageEnt extends MIBEntry<SNMPREPEATERMIBDef>
        {
            public final RptrMonitorRptrInfoEnt rptrMonitorRptrInfo;

            public final RptrMonitorGroupInfoEnt rptrMonitorGroupInfo;

            public final RptrMonitorPortInfoEnt rptrMonitorPortInfo;

            public final RptrMonitorAllRptrInfoEnt rptrMonitorAllRptrInfo;

            private RptrMonitorPackageEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
            {
                super(mib, parent, "rptrMonitorPackage", "1.3.6.1.2.1.22.2", false, false, false, false);
                this.rptrMonitorRptrInfo = new RptrMonitorRptrInfoEnt(mib, this);
                this.rptrMonitorGroupInfo = new RptrMonitorGroupInfoEnt(mib, this);
                this.rptrMonitorPortInfo = new RptrMonitorPortInfoEnt(mib, this);
                this.rptrMonitorAllRptrInfo = new RptrMonitorAllRptrInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rptrMonitorRptrInfo,
                    this.rptrMonitorGroupInfo,
                    this.rptrMonitorPortInfo,
                    this.rptrMonitorAllRptrInfo
                };
            }
            public static final class RptrMonitorRptrInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** Old version of statistics at the repeater level.Performance monitoring statistics for the repeaterIn a system containing a single managed repeater-unit,the statistics object for the repeater-unit.
The objects contained under the rptrMonitorRptrInfo subtree areintended for backwards compatibility with implementations ofRFC 1516 [11].  In newer implementations (both single- andmultiple-repeater implementations), the rptrMonitorTable willbe implemented.  It is the preferred source of this information,as it contains the values for all repeaters managed by theagent.  In all cases, the objects in the rptrMonitorRptrInfosubtree are duplicates of the corresponding objects in thefirst entry of the rptrMonitorTable.*/
                public final RptrMonitorTransmitCollisionsEnt rptrMonitorTransmitCollisions;

                private RptrMonitorRptrInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrMonitorRptrInfo", "1.3.6.1.2.1.22.2.1", false, false, false, false);
                    this.rptrMonitorTransmitCollisions = new RptrMonitorTransmitCollisionsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrMonitorTransmitCollisions
                    };
                }
                public static final class RptrMonitorTransmitCollisionsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    private RptrMonitorTransmitCollisionsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrMonitorTransmitCollisions", "1.3.6.1.2.1.22.2.1.1", true, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class RptrMonitorGroupInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** Statistics at the group level.In a system containing a single managed repeater-unit,the statistics objects for each group.*/
                public final RptrMonitorGroupTableEnt rptrMonitorGroupTable;

                private RptrMonitorGroupInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrMonitorGroupInfo", "1.3.6.1.2.1.22.2.2", false, false, false, false);
                    this.rptrMonitorGroupTable = new RptrMonitorGroupTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrMonitorGroupTable
                    };
                }
                public static final class RptrMonitorGroupTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrMonitorGroupEntryEnt rptrMonitorGroupEntry;

                    private RptrMonitorGroupTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrMonitorGroupTable", "1.3.6.1.2.1.22.2.2.1", false, true, false, false);
                        this.rptrMonitorGroupEntry = new RptrMonitorGroupEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrMonitorGroupEntry
                        };
                    }
                    public static final class RptrMonitorGroupEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrMonitorGroupIndexEnt rptrMonitorGroupIndex;

                        public final RptrMonitorGroupTotalFramesEnt rptrMonitorGroupTotalFrames;

                        public final RptrMonitorGroupTotalOctetsEnt rptrMonitorGroupTotalOctets;

                        public final RptrMonitorGroupTotalErrorsEnt rptrMonitorGroupTotalErrors;

                        private RptrMonitorGroupEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrMonitorGroupEntry", "1.3.6.1.2.1.22.2.2.1.1", false, false, false, true);
                            this.rptrMonitorGroupIndex = new RptrMonitorGroupIndexEnt(mib, this);
                            this.rptrMonitorGroupTotalFrames = new RptrMonitorGroupTotalFramesEnt(mib, this);
                            this.rptrMonitorGroupTotalOctets = new RptrMonitorGroupTotalOctetsEnt(mib, this);
                            this.rptrMonitorGroupTotalErrors = new RptrMonitorGroupTotalErrorsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrMonitorGroupIndex,
                                this.rptrMonitorGroupTotalFrames,
                                this.rptrMonitorGroupTotalOctets,
                                this.rptrMonitorGroupTotalErrors
                            };
                        }
                        public static final class RptrMonitorGroupIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorGroupIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorGroupIndex", "1.3.6.1.2.1.22.2.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorGroupTotalFramesEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorGroupTotalFramesEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorGroupTotalFrames", "1.3.6.1.2.1.22.2.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorGroupTotalOctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorGroupTotalOctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorGroupTotalOctets", "1.3.6.1.2.1.22.2.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorGroupTotalErrorsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorGroupTotalErrorsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorGroupTotalErrors", "1.3.6.1.2.1.22.2.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RptrMonitorPortInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** Statistics at the port level.*/
                public final RptrMonitorPortTableEnt rptrMonitorPortTable;

                public final RptrMonitor100PortTableEnt rptrMonitor100PortTable;

                private RptrMonitorPortInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrMonitorPortInfo", "1.3.6.1.2.1.22.2.3", false, false, false, false);
                    this.rptrMonitorPortTable = new RptrMonitorPortTableEnt(mib, this);
                    this.rptrMonitor100PortTable = new RptrMonitor100PortTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrMonitorPortTable,
                        this.rptrMonitor100PortTable
                    };
                }
                public static final class RptrMonitorPortTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrMonitorPortEntryEnt rptrMonitorPortEntry;

                    private RptrMonitorPortTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrMonitorPortTable", "1.3.6.1.2.1.22.2.3.1", false, true, false, false);
                        this.rptrMonitorPortEntry = new RptrMonitorPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrMonitorPortEntry
                        };
                    }
                    public static final class RptrMonitorPortEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrMonitorPortGroupIndexEnt rptrMonitorPortGroupIndex;

                        public final RptrMonitorPortIndexEnt rptrMonitorPortIndex;

                        public final RptrMonitorPortReadableFramesEnt rptrMonitorPortReadableFrames;

                        public final RptrMonitorPortReadableOctetsEnt rptrMonitorPortReadableOctets;

                        public final RptrMonitorPortFCSErrorsEnt rptrMonitorPortFCSErrors;

                        public final RptrMonitorPortAlignmentErrorsEnt rptrMonitorPortAlignmentErrors;

                        public final RptrMonitorPortFrameTooLongsEnt rptrMonitorPortFrameTooLongs;

                        public final RptrMonitorPortShortEventsEnt rptrMonitorPortShortEvents;

                        public final RptrMonitorPortRuntsEnt rptrMonitorPortRunts;

                        public final RptrMonitorPortCollisionsEnt rptrMonitorPortCollisions;

                        public final RptrMonitorPortLateEventsEnt rptrMonitorPortLateEvents;

                        public final RptrMonitorPortVeryLongEventsEnt rptrMonitorPortVeryLongEvents;

                        public final RptrMonitorPortDataRateMismatchesEnt rptrMonitorPortDataRateMismatches;

                        public final RptrMonitorPortAutoPartitionsEnt rptrMonitorPortAutoPartitions;

                        public final RptrMonitorPortTotalErrorsEnt rptrMonitorPortTotalErrors;

                        public final RptrMonitorPortLastChangeEnt rptrMonitorPortLastChange;

                        private RptrMonitorPortEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrMonitorPortEntry", "1.3.6.1.2.1.22.2.3.1.1", false, false, false, true);
                            this.rptrMonitorPortGroupIndex = new RptrMonitorPortGroupIndexEnt(mib, this);
                            this.rptrMonitorPortIndex = new RptrMonitorPortIndexEnt(mib, this);
                            this.rptrMonitorPortReadableFrames = new RptrMonitorPortReadableFramesEnt(mib, this);
                            this.rptrMonitorPortReadableOctets = new RptrMonitorPortReadableOctetsEnt(mib, this);
                            this.rptrMonitorPortFCSErrors = new RptrMonitorPortFCSErrorsEnt(mib, this);
                            this.rptrMonitorPortAlignmentErrors = new RptrMonitorPortAlignmentErrorsEnt(mib, this);
                            this.rptrMonitorPortFrameTooLongs = new RptrMonitorPortFrameTooLongsEnt(mib, this);
                            this.rptrMonitorPortShortEvents = new RptrMonitorPortShortEventsEnt(mib, this);
                            this.rptrMonitorPortRunts = new RptrMonitorPortRuntsEnt(mib, this);
                            this.rptrMonitorPortCollisions = new RptrMonitorPortCollisionsEnt(mib, this);
                            this.rptrMonitorPortLateEvents = new RptrMonitorPortLateEventsEnt(mib, this);
                            this.rptrMonitorPortVeryLongEvents = new RptrMonitorPortVeryLongEventsEnt(mib, this);
                            this.rptrMonitorPortDataRateMismatches = new RptrMonitorPortDataRateMismatchesEnt(mib, this);
                            this.rptrMonitorPortAutoPartitions = new RptrMonitorPortAutoPartitionsEnt(mib, this);
                            this.rptrMonitorPortTotalErrors = new RptrMonitorPortTotalErrorsEnt(mib, this);
                            this.rptrMonitorPortLastChange = new RptrMonitorPortLastChangeEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrMonitorPortGroupIndex,
                                this.rptrMonitorPortIndex,
                                this.rptrMonitorPortReadableFrames,
                                this.rptrMonitorPortReadableOctets,
                                this.rptrMonitorPortFCSErrors,
                                this.rptrMonitorPortAlignmentErrors,
                                this.rptrMonitorPortFrameTooLongs,
                                this.rptrMonitorPortShortEvents,
                                this.rptrMonitorPortRunts,
                                this.rptrMonitorPortCollisions,
                                this.rptrMonitorPortLateEvents,
                                this.rptrMonitorPortVeryLongEvents,
                                this.rptrMonitorPortDataRateMismatches,
                                this.rptrMonitorPortAutoPartitions,
                                this.rptrMonitorPortTotalErrors,
                                this.rptrMonitorPortLastChange
                            };
                        }
                        public static final class RptrMonitorPortGroupIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortGroupIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortGroupIndex", "1.3.6.1.2.1.22.2.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortIndex", "1.3.6.1.2.1.22.2.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortReadableFramesEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortReadableFramesEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortReadableFrames", "1.3.6.1.2.1.22.2.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortReadableOctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortReadableOctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortReadableOctets", "1.3.6.1.2.1.22.2.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortFCSErrorsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortFCSErrorsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortFCSErrors", "1.3.6.1.2.1.22.2.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortAlignmentErrorsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortAlignmentErrorsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortAlignmentErrors", "1.3.6.1.2.1.22.2.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortFrameTooLongsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortFrameTooLongsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortFrameTooLongs", "1.3.6.1.2.1.22.2.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortShortEventsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortShortEventsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortShortEvents", "1.3.6.1.2.1.22.2.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortRuntsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortRuntsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortRunts", "1.3.6.1.2.1.22.2.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortCollisionsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortCollisionsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortCollisions", "1.3.6.1.2.1.22.2.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortLateEventsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortLateEventsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortLateEvents", "1.3.6.1.2.1.22.2.3.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortVeryLongEventsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortVeryLongEventsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortVeryLongEvents", "1.3.6.1.2.1.22.2.3.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortDataRateMismatchesEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortDataRateMismatchesEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortDataRateMismatches", "1.3.6.1.2.1.22.2.3.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortAutoPartitionsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortAutoPartitionsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortAutoPartitions", "1.3.6.1.2.1.22.2.3.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortTotalErrorsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortTotalErrorsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortTotalErrors", "1.3.6.1.2.1.22.2.3.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortLastChangeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortLastChangeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortLastChange", "1.3.6.1.2.1.22.2.3.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RptrMonitor100PortTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrMonitor100PortEntryEnt rptrMonitor100PortEntry;

                    private RptrMonitor100PortTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrMonitor100PortTable", "1.3.6.1.2.1.22.2.3.2", false, true, false, false);
                        this.rptrMonitor100PortEntry = new RptrMonitor100PortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrMonitor100PortEntry
                        };
                    }
                    public static final class RptrMonitor100PortEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrMonitorPortIsolatesEnt rptrMonitorPortIsolates;

                        public final RptrMonitorPortSymbolErrorsEnt rptrMonitorPortSymbolErrors;

                        public final RptrMonitorPortUpper32OctetsEnt rptrMonitorPortUpper32Octets;

                        public final RptrMonitorPortHCReadableOctetsEnt rptrMonitorPortHCReadableOctets;

                        private RptrMonitor100PortEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrMonitor100PortEntry", "1.3.6.1.2.1.22.2.3.2.1", false, false, false, true);
                            this.rptrMonitorPortIsolates = new RptrMonitorPortIsolatesEnt(mib, this);
                            this.rptrMonitorPortSymbolErrors = new RptrMonitorPortSymbolErrorsEnt(mib, this);
                            this.rptrMonitorPortUpper32Octets = new RptrMonitorPortUpper32OctetsEnt(mib, this);
                            this.rptrMonitorPortHCReadableOctets = new RptrMonitorPortHCReadableOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrMonitorPortIsolates,
                                this.rptrMonitorPortSymbolErrors,
                                this.rptrMonitorPortUpper32Octets,
                                this.rptrMonitorPortHCReadableOctets
                            };
                        }
                        public static final class RptrMonitorPortIsolatesEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortIsolatesEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortIsolates", "1.3.6.1.2.1.22.2.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortSymbolErrorsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortSymbolErrorsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortSymbolErrors", "1.3.6.1.2.1.22.2.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortUpper32OctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortUpper32OctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortUpper32Octets", "1.3.6.1.2.1.22.2.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonitorPortHCReadableOctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonitorPortHCReadableOctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonitorPortHCReadableOctets", "1.3.6.1.2.1.22.2.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RptrMonitorAllRptrInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** New version of statistics at the repeater level.Statistics objects for each managed repeaterin the system.*/
                public final RptrMonTableEnt rptrMonTable;

                public final RptrMon100TableEnt rptrMon100Table;

                private RptrMonitorAllRptrInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrMonitorAllRptrInfo", "1.3.6.1.2.1.22.2.4", false, false, false, false);
                    this.rptrMonTable = new RptrMonTableEnt(mib, this);
                    this.rptrMon100Table = new RptrMon100TableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrMonTable,
                        this.rptrMon100Table
                    };
                }
                public static final class RptrMonTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrMonEntryEnt rptrMonEntry;

                    private RptrMonTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrMonTable", "1.3.6.1.2.1.22.2.4.1", false, true, false, false);
                        this.rptrMonEntry = new RptrMonEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrMonEntry
                        };
                    }
                    public static final class RptrMonEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrMonTxCollisionsEnt rptrMonTxCollisions;

                        public final RptrMonTotalFramesEnt rptrMonTotalFrames;

                        public final RptrMonTotalErrorsEnt rptrMonTotalErrors;

                        public final RptrMonTotalOctetsEnt rptrMonTotalOctets;

                        private RptrMonEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrMonEntry", "1.3.6.1.2.1.22.2.4.1.1", false, false, false, true);
                            this.rptrMonTxCollisions = new RptrMonTxCollisionsEnt(mib, this);
                            this.rptrMonTotalFrames = new RptrMonTotalFramesEnt(mib, this);
                            this.rptrMonTotalErrors = new RptrMonTotalErrorsEnt(mib, this);
                            this.rptrMonTotalOctets = new RptrMonTotalOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrMonTxCollisions,
                                this.rptrMonTotalFrames,
                                this.rptrMonTotalErrors,
                                this.rptrMonTotalOctets
                            };
                        }
                        public static final class RptrMonTxCollisionsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonTxCollisionsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonTxCollisions", "1.3.6.1.2.1.22.2.4.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonTotalFramesEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonTotalFramesEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonTotalFrames", "1.3.6.1.2.1.22.2.4.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonTotalErrorsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonTotalErrorsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonTotalErrors", "1.3.6.1.2.1.22.2.4.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonTotalOctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonTotalOctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonTotalOctets", "1.3.6.1.2.1.22.2.4.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RptrMon100TableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrMon100EntryEnt rptrMon100Entry;

                    private RptrMon100TableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrMon100Table", "1.3.6.1.2.1.22.2.4.2", false, true, false, false);
                        this.rptrMon100Entry = new RptrMon100EntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrMon100Entry
                        };
                    }
                    public static final class RptrMon100EntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrMonUpper32TotalOctetsEnt rptrMonUpper32TotalOctets;

                        public final RptrMonHCTotalOctetsEnt rptrMonHCTotalOctets;

                        private RptrMon100EntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrMon100Entry", "1.3.6.1.2.1.22.2.4.2.1", false, false, false, true);
                            this.rptrMonUpper32TotalOctets = new RptrMonUpper32TotalOctetsEnt(mib, this);
                            this.rptrMonHCTotalOctets = new RptrMonHCTotalOctetsEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrMonUpper32TotalOctets,
                                this.rptrMonHCTotalOctets
                            };
                        }
                        public static final class RptrMonUpper32TotalOctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonUpper32TotalOctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonUpper32TotalOctets", "1.3.6.1.2.1.22.2.4.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrMonHCTotalOctetsEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrMonHCTotalOctetsEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrMonHCTotalOctets", "1.3.6.1.2.1.22.2.4.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class RptrAddrTrackPackageEnt extends MIBEntry<SNMPREPEATERMIBDef>
        {
            public final RptrAddrTrackRptrInfoEnt rptrAddrTrackRptrInfo;

            /** this subtree is currently unused*/
            public final RptrAddrTrackGroupInfoEnt rptrAddrTrackGroupInfo;

            public final RptrAddrTrackPortInfoEnt rptrAddrTrackPortInfo;

            private RptrAddrTrackPackageEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
            {
                super(mib, parent, "rptrAddrTrackPackage", "1.3.6.1.2.1.22.3", false, false, false, false);
                this.rptrAddrTrackRptrInfo = new RptrAddrTrackRptrInfoEnt(mib, this);
                this.rptrAddrTrackGroupInfo = new RptrAddrTrackGroupInfoEnt(mib, this);
                this.rptrAddrTrackPortInfo = new RptrAddrTrackPortInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rptrAddrTrackRptrInfo,
                    this.rptrAddrTrackGroupInfo,
                    this.rptrAddrTrackPortInfo
                };
            }
            public static final class RptrAddrTrackRptrInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** The Repeater Address Search TableThis table provides an active address trackingcapability which can be also used to collect thenecessary information for mapping the topologyof a network.  Note that an NMS is required to haveread-write access to the table in order to accessthis function.  Section 4, "Topology Mapping",contains a description of an algorithm which canmake use of this table, in combination with the
forwarding databases of managed bridges/switchesin the network, to map network topology.*/
                public final RptrAddrSearchTableEnt rptrAddrSearchTable;

                private RptrAddrTrackRptrInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrAddrTrackRptrInfo", "1.3.6.1.2.1.22.3.1", false, false, false, false);
                    this.rptrAddrSearchTable = new RptrAddrSearchTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrAddrSearchTable
                    };
                }
                public static final class RptrAddrSearchTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrAddrSearchEntryEnt rptrAddrSearchEntry;

                    private RptrAddrSearchTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrAddrSearchTable", "1.3.6.1.2.1.22.3.1.1", false, true, false, false);
                        this.rptrAddrSearchEntry = new RptrAddrSearchEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrAddrSearchEntry
                        };
                    }
                    public static final class RptrAddrSearchEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrAddrSearchLockEnt rptrAddrSearchLock;

                        public final RptrAddrSearchStatusEnt rptrAddrSearchStatus;

                        public final RptrAddrSearchAddressEnt rptrAddrSearchAddress;

                        public final RptrAddrSearchStateEnt rptrAddrSearchState;

                        public final RptrAddrSearchGroupEnt rptrAddrSearchGroup;

                        public final RptrAddrSearchPortEnt rptrAddrSearchPort;

                        public final RptrAddrSearchOwnerEnt rptrAddrSearchOwner;

                        private RptrAddrSearchEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrAddrSearchEntry", "1.3.6.1.2.1.22.3.1.1.1", false, false, false, true);
                            this.rptrAddrSearchLock = new RptrAddrSearchLockEnt(mib, this);
                            this.rptrAddrSearchStatus = new RptrAddrSearchStatusEnt(mib, this);
                            this.rptrAddrSearchAddress = new RptrAddrSearchAddressEnt(mib, this);
                            this.rptrAddrSearchState = new RptrAddrSearchStateEnt(mib, this);
                            this.rptrAddrSearchGroup = new RptrAddrSearchGroupEnt(mib, this);
                            this.rptrAddrSearchPort = new RptrAddrSearchPortEnt(mib, this);
                            this.rptrAddrSearchOwner = new RptrAddrSearchOwnerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrAddrSearchLock,
                                this.rptrAddrSearchStatus,
                                this.rptrAddrSearchAddress,
                                this.rptrAddrSearchState,
                                this.rptrAddrSearchGroup,
                                this.rptrAddrSearchPort,
                                this.rptrAddrSearchOwner
                            };
                        }
                        public static final class RptrAddrSearchLockEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchLockEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchLock", "1.3.6.1.2.1.22.3.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrSearchStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchStatus", "1.3.6.1.2.1.22.3.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrSearchAddressEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchAddressEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchAddress", "1.3.6.1.2.1.22.3.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrSearchStateEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchStateEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchState", "1.3.6.1.2.1.22.3.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrSearchGroupEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchGroupEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchGroup", "1.3.6.1.2.1.22.3.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrSearchPortEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchPortEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchPort", "1.3.6.1.2.1.22.3.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrSearchOwnerEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrSearchOwnerEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrSearchOwner", "1.3.6.1.2.1.22.3.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class RptrAddrTrackGroupInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                private RptrAddrTrackGroupInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrAddrTrackGroupInfo", "1.3.6.1.2.1.22.3.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RptrAddrTrackPortInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** The Port Address Tracking TableThis table provides a way for a network managementapplication to passively gather information (usingread-only privileges) about which network addressesare connected to which ports of a repeater.*/
                public final RptrAddrTrackTableEnt rptrAddrTrackTable;

                /** Table for multiple addresses per port*/
                public final RptrExtAddrTrackTableEnt rptrExtAddrTrackTable;

                private RptrAddrTrackPortInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrAddrTrackPortInfo", "1.3.6.1.2.1.22.3.3", false, false, false, false);
                    this.rptrAddrTrackTable = new RptrAddrTrackTableEnt(mib, this);
                    this.rptrExtAddrTrackTable = new RptrExtAddrTrackTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrAddrTrackTable,
                        this.rptrExtAddrTrackTable
                    };
                }
                public static final class RptrAddrTrackTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrAddrTrackEntryEnt rptrAddrTrackEntry;

                    private RptrAddrTrackTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrAddrTrackTable", "1.3.6.1.2.1.22.3.3.1", false, true, false, false);
                        this.rptrAddrTrackEntry = new RptrAddrTrackEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrAddrTrackEntry
                        };
                    }
                    public static final class RptrAddrTrackEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrAddrTrackGroupIndexEnt rptrAddrTrackGroupIndex;

                        public final RptrAddrTrackPortIndexEnt rptrAddrTrackPortIndex;

                        public final RptrAddrTrackLastSourceAddressEnt rptrAddrTrackLastSourceAddress;

                        public final RptrAddrTrackSourceAddrChangesEnt rptrAddrTrackSourceAddrChanges;

                        public final RptrAddrTrackNewLastSrcAddressEnt rptrAddrTrackNewLastSrcAddress;

                        public final RptrAddrTrackCapacityEnt rptrAddrTrackCapacity;

                        private RptrAddrTrackEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrAddrTrackEntry", "1.3.6.1.2.1.22.3.3.1.1", false, false, false, true);
                            this.rptrAddrTrackGroupIndex = new RptrAddrTrackGroupIndexEnt(mib, this);
                            this.rptrAddrTrackPortIndex = new RptrAddrTrackPortIndexEnt(mib, this);
                            this.rptrAddrTrackLastSourceAddress = new RptrAddrTrackLastSourceAddressEnt(mib, this);
                            this.rptrAddrTrackSourceAddrChanges = new RptrAddrTrackSourceAddrChangesEnt(mib, this);
                            this.rptrAddrTrackNewLastSrcAddress = new RptrAddrTrackNewLastSrcAddressEnt(mib, this);
                            this.rptrAddrTrackCapacity = new RptrAddrTrackCapacityEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrAddrTrackGroupIndex,
                                this.rptrAddrTrackPortIndex,
                                this.rptrAddrTrackLastSourceAddress,
                                this.rptrAddrTrackSourceAddrChanges,
                                this.rptrAddrTrackNewLastSrcAddress,
                                this.rptrAddrTrackCapacity
                            };
                        }
                        public static final class RptrAddrTrackGroupIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrTrackGroupIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrTrackGroupIndex", "1.3.6.1.2.1.22.3.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrTrackPortIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrTrackPortIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrTrackPortIndex", "1.3.6.1.2.1.22.3.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrTrackLastSourceAddressEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrTrackLastSourceAddressEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrTrackLastSourceAddress", "1.3.6.1.2.1.22.3.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrTrackSourceAddrChangesEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrTrackSourceAddrChangesEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrTrackSourceAddrChanges", "1.3.6.1.2.1.22.3.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrTrackNewLastSrcAddressEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrTrackNewLastSrcAddressEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrTrackNewLastSrcAddress", "1.3.6.1.2.1.22.3.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrAddrTrackCapacityEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrAddrTrackCapacityEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrAddrTrackCapacity", "1.3.6.1.2.1.22.3.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RptrExtAddrTrackTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrExtAddrTrackEntryEnt rptrExtAddrTrackEntry;

                    private RptrExtAddrTrackTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrExtAddrTrackTable", "1.3.6.1.2.1.22.3.3.2", false, true, false, false);
                        this.rptrExtAddrTrackEntry = new RptrExtAddrTrackEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrExtAddrTrackEntry
                        };
                    }
                    public static final class RptrExtAddrTrackEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrExtAddrTrackMacIndexEnt rptrExtAddrTrackMacIndex;

                        public final RptrExtAddrTrackSourceAddressEnt rptrExtAddrTrackSourceAddress;

                        private RptrExtAddrTrackEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrExtAddrTrackEntry", "1.3.6.1.2.1.22.3.3.2.1", false, false, false, true);
                            this.rptrExtAddrTrackMacIndex = new RptrExtAddrTrackMacIndexEnt(mib, this);
                            this.rptrExtAddrTrackSourceAddress = new RptrExtAddrTrackSourceAddressEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrExtAddrTrackMacIndex,
                                this.rptrExtAddrTrackSourceAddress
                            };
                        }
                        public static final class RptrExtAddrTrackMacIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrExtAddrTrackMacIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrExtAddrTrackMacIndex", "1.3.6.1.2.1.22.3.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrExtAddrTrackSourceAddressEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrExtAddrTrackSourceAddressEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrExtAddrTrackSourceAddress", "1.3.6.1.2.1.22.3.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

        public static final class RptrTopNPackageEnt extends MIBEntry<SNMPREPEATERMIBDef>
        {
            /** this subtree is currently unused*/
            public final RptrTopNRptrInfoEnt rptrTopNRptrInfo;

            /** this subtree is currently unused*/
            public final RptrTopNGroupInfoEnt rptrTopNGroupInfo;

            public final RptrTopNPortInfoEnt rptrTopNPortInfo;

            private RptrTopNPackageEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
            {
                super(mib, parent, "rptrTopNPackage", "1.3.6.1.2.1.22.4", false, false, false, false);
                this.rptrTopNRptrInfo = new RptrTopNRptrInfoEnt(mib, this);
                this.rptrTopNGroupInfo = new RptrTopNGroupInfoEnt(mib, this);
                this.rptrTopNPortInfo = new RptrTopNPortInfoEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.rptrTopNRptrInfo,
                    this.rptrTopNGroupInfo,
                    this.rptrTopNPortInfo
                };
            }
            public static final class RptrTopNRptrInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                private RptrTopNRptrInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrTopNRptrInfo", "1.3.6.1.2.1.22.4.1", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RptrTopNGroupInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                private RptrTopNGroupInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrTopNGroupInfo", "1.3.6.1.2.1.22.4.2", false, false, false, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class RptrTopNPortInfoEnt extends MIBEntry<SNMPREPEATERMIBDef>
            {
                /** The Repeater Top "N" Port Group
The Repeater Top N Port group is used to prepare reports thatdescribe a list of ports ordered by one of the statistics in theRepeater Monitor Port Table.  The statistic chosen by themanagement station is sampled over a managementstation-specified time interval, making the report rate based.The management station also specifies the number of ports thatare reported.The rptrTopNPortControlTable is used to initiate the generationof a report.  The management station may select the parametersof such a report, such as which repeater, which statistic, howmany ports, and the start & stop times of the sampling.  Whenthe report is prepared, entries are created in therptrTopNPortTable associated with the releventrptrTopNControlEntry.  These entries are static foreach report after it has been prepared.
Note that counter discontinuities may appear in someimplementations if ports' assignment to repeaters changesduring the collection of data for a Top "N" report.A management application could read the correspondingrptrMonitorPortLastChange timestamp in order to checkwhether a discontinuity occurred.*/
                public final RptrTopNPortControlTableEnt rptrTopNPortControlTable;

                /** Top "N" reports*/
                public final RptrTopNPortTableEnt rptrTopNPortTable;

                private RptrTopNPortInfoEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                {
                    super(mib, parent, "rptrTopNPortInfo", "1.3.6.1.2.1.22.4.3", false, false, false, false);
                    this.rptrTopNPortControlTable = new RptrTopNPortControlTableEnt(mib, this);
                    this.rptrTopNPortTable = new RptrTopNPortTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.rptrTopNPortControlTable,
                        this.rptrTopNPortTable
                    };
                }
                public static final class RptrTopNPortControlTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrTopNPortControlEntryEnt rptrTopNPortControlEntry;

                    private RptrTopNPortControlTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrTopNPortControlTable", "1.3.6.1.2.1.22.4.3.1", false, true, false, false);
                        this.rptrTopNPortControlEntry = new RptrTopNPortControlEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrTopNPortControlEntry
                        };
                    }
                    public static final class RptrTopNPortControlEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrTopNPortControlIndexEnt rptrTopNPortControlIndex;

                        public final RptrTopNPortRepeaterIdEnt rptrTopNPortRepeaterId;

                        public final RptrTopNPortRateBaseEnt rptrTopNPortRateBase;

                        public final RptrTopNPortTimeRemainingEnt rptrTopNPortTimeRemaining;

                        public final RptrTopNPortDurationEnt rptrTopNPortDuration;

                        public final RptrTopNPortRequestedSizeEnt rptrTopNPortRequestedSize;

                        public final RptrTopNPortGrantedSizeEnt rptrTopNPortGrantedSize;

                        public final RptrTopNPortStartTimeEnt rptrTopNPortStartTime;

                        public final RptrTopNPortOwnerEnt rptrTopNPortOwner;

                        public final RptrTopNPortRowStatusEnt rptrTopNPortRowStatus;

                        private RptrTopNPortControlEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrTopNPortControlEntry", "1.3.6.1.2.1.22.4.3.1.1", false, false, false, true);
                            this.rptrTopNPortControlIndex = new RptrTopNPortControlIndexEnt(mib, this);
                            this.rptrTopNPortRepeaterId = new RptrTopNPortRepeaterIdEnt(mib, this);
                            this.rptrTopNPortRateBase = new RptrTopNPortRateBaseEnt(mib, this);
                            this.rptrTopNPortTimeRemaining = new RptrTopNPortTimeRemainingEnt(mib, this);
                            this.rptrTopNPortDuration = new RptrTopNPortDurationEnt(mib, this);
                            this.rptrTopNPortRequestedSize = new RptrTopNPortRequestedSizeEnt(mib, this);
                            this.rptrTopNPortGrantedSize = new RptrTopNPortGrantedSizeEnt(mib, this);
                            this.rptrTopNPortStartTime = new RptrTopNPortStartTimeEnt(mib, this);
                            this.rptrTopNPortOwner = new RptrTopNPortOwnerEnt(mib, this);
                            this.rptrTopNPortRowStatus = new RptrTopNPortRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrTopNPortControlIndex,
                                this.rptrTopNPortRepeaterId,
                                this.rptrTopNPortRateBase,
                                this.rptrTopNPortTimeRemaining,
                                this.rptrTopNPortDuration,
                                this.rptrTopNPortRequestedSize,
                                this.rptrTopNPortGrantedSize,
                                this.rptrTopNPortStartTime,
                                this.rptrTopNPortOwner,
                                this.rptrTopNPortRowStatus
                            };
                        }
                        public static final class RptrTopNPortControlIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortControlIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortControlIndex", "1.3.6.1.2.1.22.4.3.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortRepeaterIdEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortRepeaterIdEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortRepeaterId", "1.3.6.1.2.1.22.4.3.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortRateBaseEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortRateBaseEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortRateBase", "1.3.6.1.2.1.22.4.3.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortTimeRemainingEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortTimeRemainingEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortTimeRemaining", "1.3.6.1.2.1.22.4.3.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortDurationEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortDurationEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortDuration", "1.3.6.1.2.1.22.4.3.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortRequestedSizeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortRequestedSizeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortRequestedSize", "1.3.6.1.2.1.22.4.3.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortGrantedSizeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortGrantedSizeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortGrantedSize", "1.3.6.1.2.1.22.4.3.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortStartTimeEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortStartTimeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortStartTime", "1.3.6.1.2.1.22.4.3.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortOwnerEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortOwnerEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortOwner", "1.3.6.1.2.1.22.4.3.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortRowStatusEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortRowStatusEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortRowStatus", "1.3.6.1.2.1.22.4.3.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class RptrTopNPortTableEnt extends MIBEntry<SNMPREPEATERMIBDef>
                {
                    public final RptrTopNPortEntryEnt rptrTopNPortEntry;

                    private RptrTopNPortTableEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                    {
                        super(mib, parent, "rptrTopNPortTable", "1.3.6.1.2.1.22.4.3.2", false, true, false, false);
                        this.rptrTopNPortEntry = new RptrTopNPortEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.rptrTopNPortEntry
                        };
                    }
                    public static final class RptrTopNPortEntryEnt extends MIBEntry<SNMPREPEATERMIBDef>
                    {
                        public final RptrTopNPortIndexEnt rptrTopNPortIndex;

                        public final RptrTopNPortGroupIndexEnt rptrTopNPortGroupIndex;

                        public final RptrTopNPortPortIndexEnt rptrTopNPortPortIndex;

                        public final RptrTopNPortRateEnt rptrTopNPortRate;

                        private RptrTopNPortEntryEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                        {
                            super(mib, parent, "rptrTopNPortEntry", "1.3.6.1.2.1.22.4.3.2.1", false, false, false, true);
                            this.rptrTopNPortIndex = new RptrTopNPortIndexEnt(mib, this);
                            this.rptrTopNPortGroupIndex = new RptrTopNPortGroupIndexEnt(mib, this);
                            this.rptrTopNPortPortIndex = new RptrTopNPortPortIndexEnt(mib, this);
                            this.rptrTopNPortRate = new RptrTopNPortRateEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.rptrTopNPortIndex,
                                this.rptrTopNPortGroupIndex,
                                this.rptrTopNPortPortIndex,
                                this.rptrTopNPortRate
                            };
                        }
                        public static final class RptrTopNPortIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortIndex", "1.3.6.1.2.1.22.4.3.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortGroupIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortGroupIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortGroupIndex", "1.3.6.1.2.1.22.4.3.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortPortIndexEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortPortIndexEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortPortIndex", "1.3.6.1.2.1.22.4.3.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class RptrTopNPortRateEnt extends MIBEntry<SNMPREPEATERMIBDef>
                        {
                            private RptrTopNPortRateEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
                            {
                                super(mib, parent, "rptrTopNPortRate", "1.3.6.1.2.1.22.4.3.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

    }

    public static final class RptrHealthEnt extends MIBEntry<SNMPREPEATERMIBDef>
    {
        private RptrHealthEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
        {
            super(mib, parent, "rptrHealth", "1.3.6.1.2.1.22.0.1", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class RptrGroupChangeEnt extends MIBEntry<SNMPREPEATERMIBDef>
    {
        private RptrGroupChangeEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
        {
            super(mib, parent, "rptrGroupChange", "1.3.6.1.2.1.22.0.2", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class RptrResetEventEnt extends MIBEntry<SNMPREPEATERMIBDef>
    {
        private RptrResetEventEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
        {
            super(mib, parent, "rptrResetEvent", "1.3.6.1.2.1.22.0.3", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class RptrInfoHealthEnt extends MIBEntry<SNMPREPEATERMIBDef>
    {
        private RptrInfoHealthEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
        {
            super(mib, parent, "rptrInfoHealth", "1.3.6.1.2.1.22.0.4", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class RptrInfoResetEventEnt extends MIBEntry<SNMPREPEATERMIBDef>
    {
        private RptrInfoResetEventEnt(SNMPREPEATERMIBDef mib, MIBEntry<SNMPREPEATERMIBDef> parent)
        {
            super(mib, parent, "rptrInfoResetEvent", "1.3.6.1.2.1.22.0.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

}
