package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;
import com.intrbiz.snmp.mib.MIBs;

public final class SNASDLCMIBDef extends MIB
{
    public static final SNASDLCMIBDef SNASDLCMIB = new SNASDLCMIBDef();

    static { MIBs.getInstance().registerMIB(SNASDLCMIBDef.SNASDLCMIB); }

    public final SnaDLCEnt snaDLC;

    private SNASDLCMIBDef()
    {
        super("SNA-SDLC-MIB");
        this.snaDLC = new SnaDLCEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.snaDLC
        };
    }

    public static final class SnaDLCEnt extends MIBEntry<SNASDLCMIBDef>
    {
        /** The following data link controls are modelled in this MIB module:1. SDLC*/
        public final SdlcEnt sdlc;

        private SnaDLCEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
        {
            super(mib, parent, "snaDLC", "1.3.6.1.2.1.41", false, false, false, false);
            this.sdlc = new SdlcEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.sdlc
            };
        }
        public static final class SdlcEnt extends MIBEntry<SNASDLCMIBDef>
        {
            /** THE SDLC GROUP==============The following resources are modelled in the SDLC group of thisMIB module:1. PORTS2. LINK STATIONS*/
            public final SdlcPortGroupEnt sdlcPortGroup;

            /** Physical Ports*/
            public final SdlcLSGroupEnt sdlcLSGroup;

            /** TRAP DEFINITIONS
Notifications*/
            public final SdlcTrapsEnt sdlcTraps;

            /** Conformance Information*/
            public final SdlcConformanceEnt sdlcConformance;

            private SdlcEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
            {
                super(mib, parent, "sdlc", "1.3.6.1.2.1.41.1", false, false, false, false);
                this.sdlcPortGroup = new SdlcPortGroupEnt(mib, this);
                this.sdlcLSGroup = new SdlcLSGroupEnt(mib, this);
                this.sdlcTraps = new SdlcTrapsEnt(mib, this);
                this.sdlcConformance = new SdlcConformanceEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.sdlcPortGroup,
                    this.sdlcLSGroup,
                    this.sdlcTraps,
                    this.sdlcConformance
                };
            }
            public static final class SdlcPortGroupEnt extends MIBEntry<SNASDLCMIBDef>
            {
                /** Logical Link Stations
THE SDLC PORT GROUP===================The following classes of information is modelled for each SDLC port:1.  ADMINISTRATIVE ( read/write)2.  OPERATIONAL    ( read-only)3.  STATISTICS     ( read-only)
Information not found in this group is found in tables described inthe following RFCs:1.  RFC1213  - MIB-IITABLE                      INDEX====================       ====================a.  ifTable                    ifIndex2.  RFC1659  - The RS232-like MIBTABLE                      INDEX====================       ====================a.  rs232PortTable             rs232PortIndexb.  rs232SyncPortTable         rs232SyncPortIndexc.  rs232InSigTable            rs232InSigPortIndex,rs232InSigNamed.  rs232OutSigTable           rs232OutSigPortIndex,rs232OutSigName** e.  rs232AsyncPortTable        rs232AsyncPortIndex** rs232AsyncPortTable for ISO 3309.3 ( Start-Stop SDLC).
**************************************************************                                                           **           THE SDLC PORT ADMINISTRATIVE TABLE              **                                                           ***************************************************************/
                public final SdlcPortAdminTableEnt sdlcPortAdminTable;

                /** **************************************************************                                                           **                THE SDLC PORT OPERATIONAL TABLE            **                                                           ***************************************************************/
                public final SdlcPortOperTableEnt sdlcPortOperTable;

                /** **************************************************************                                                           **           THE SDLC PORT STATISTICS TABLE                  **                                                           ***************************************************************/
                public final SdlcPortStatsTableEnt sdlcPortStatsTable;

                private SdlcPortGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                {
                    super(mib, parent, "sdlcPortGroup", "1.3.6.1.2.1.41.1.1", false, false, false, false);
                    this.sdlcPortAdminTable = new SdlcPortAdminTableEnt(mib, this);
                    this.sdlcPortOperTable = new SdlcPortOperTableEnt(mib, this);
                    this.sdlcPortStatsTable = new SdlcPortStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sdlcPortAdminTable,
                        this.sdlcPortOperTable,
                        this.sdlcPortStatsTable
                    };
                }
                public static final class SdlcPortAdminTableEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    public final SdlcPortAdminEntryEnt sdlcPortAdminEntry;

                    private SdlcPortAdminTableEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcPortAdminTable", "1.3.6.1.2.1.41.1.1.1", false, true, false, false);
                        this.sdlcPortAdminEntry = new SdlcPortAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcPortAdminEntry
                        };
                    }
                    public static final class SdlcPortAdminEntryEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcPortAdminNameEnt sdlcPortAdminName;

                        public final SdlcPortAdminRoleEnt sdlcPortAdminRole;

                        public final SdlcPortAdminTypeEnt sdlcPortAdminType;

                        public final SdlcPortAdminTopologyEnt sdlcPortAdminTopology;

                        public final SdlcPortAdminISTATUSEnt sdlcPortAdminISTATUS;

                        public final SdlcPortAdminACTIVTOEnt sdlcPortAdminACTIVTO;

                        public final SdlcPortAdminPAUSEEnt sdlcPortAdminPAUSE;

                        public final SdlcPortAdminSERVLIMEnt sdlcPortAdminSERVLIM;

                        public final SdlcPortAdminSlowPollTimerEnt sdlcPortAdminSlowPollTimer;

                        private SdlcPortAdminEntryEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcPortAdminEntry", "1.3.6.1.2.1.41.1.1.1.1", false, false, false, true);
                            this.sdlcPortAdminName = new SdlcPortAdminNameEnt(mib, this);
                            this.sdlcPortAdminRole = new SdlcPortAdminRoleEnt(mib, this);
                            this.sdlcPortAdminType = new SdlcPortAdminTypeEnt(mib, this);
                            this.sdlcPortAdminTopology = new SdlcPortAdminTopologyEnt(mib, this);
                            this.sdlcPortAdminISTATUS = new SdlcPortAdminISTATUSEnt(mib, this);
                            this.sdlcPortAdminACTIVTO = new SdlcPortAdminACTIVTOEnt(mib, this);
                            this.sdlcPortAdminPAUSE = new SdlcPortAdminPAUSEEnt(mib, this);
                            this.sdlcPortAdminSERVLIM = new SdlcPortAdminSERVLIMEnt(mib, this);
                            this.sdlcPortAdminSlowPollTimer = new SdlcPortAdminSlowPollTimerEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcPortAdminName,
                                this.sdlcPortAdminRole,
                                this.sdlcPortAdminType,
                                this.sdlcPortAdminTopology,
                                this.sdlcPortAdminISTATUS,
                                this.sdlcPortAdminACTIVTO,
                                this.sdlcPortAdminPAUSE,
                                this.sdlcPortAdminSERVLIM,
                                this.sdlcPortAdminSlowPollTimer
                            };
                        }
                        public static final class SdlcPortAdminNameEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminNameEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminName", "1.3.6.1.2.1.41.1.1.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminRoleEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminRoleEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminRole", "1.3.6.1.2.1.41.1.1.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminTypeEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminTypeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminType", "1.3.6.1.2.1.41.1.1.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminTopologyEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminTopologyEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminTopology", "1.3.6.1.2.1.41.1.1.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminISTATUSEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminISTATUSEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminISTATUS", "1.3.6.1.2.1.41.1.1.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminACTIVTOEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminACTIVTOEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminACTIVTO", "1.3.6.1.2.1.41.1.1.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminPAUSEEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminPAUSEEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminPAUSE", "1.3.6.1.2.1.41.1.1.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminSERVLIMEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminSERVLIMEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminSERVLIM", "1.3.6.1.2.1.41.1.1.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortAdminSlowPollTimerEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortAdminSlowPollTimerEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortAdminSlowPollTimer", "1.3.6.1.2.1.41.1.1.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SdlcPortOperTableEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    public final SdlcPortOperEntryEnt sdlcPortOperEntry;

                    private SdlcPortOperTableEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcPortOperTable", "1.3.6.1.2.1.41.1.1.2", false, true, false, false);
                        this.sdlcPortOperEntry = new SdlcPortOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcPortOperEntry
                        };
                    }
                    public static final class SdlcPortOperEntryEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcPortOperNameEnt sdlcPortOperName;

                        public final SdlcPortOperRoleEnt sdlcPortOperRole;

                        public final SdlcPortOperTypeEnt sdlcPortOperType;

                        public final SdlcPortOperTopologyEnt sdlcPortOperTopology;

                        public final SdlcPortOperISTATUSEnt sdlcPortOperISTATUS;

                        public final SdlcPortOperACTIVTOEnt sdlcPortOperACTIVTO;

                        public final SdlcPortOperPAUSEEnt sdlcPortOperPAUSE;

                        public final SdlcPortOperSlowPollMethodEnt sdlcPortOperSlowPollMethod;

                        public final SdlcPortOperSERVLIMEnt sdlcPortOperSERVLIM;

                        public final SdlcPortOperSlowPollTimerEnt sdlcPortOperSlowPollTimer;

                        public final SdlcPortOperLastModifyTimeEnt sdlcPortOperLastModifyTime;

                        public final SdlcPortOperLastFailTimeEnt sdlcPortOperLastFailTime;

                        public final SdlcPortOperLastFailCauseEnt sdlcPortOperLastFailCause;

                        private SdlcPortOperEntryEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcPortOperEntry", "1.3.6.1.2.1.41.1.1.2.1", false, false, false, true);
                            this.sdlcPortOperName = new SdlcPortOperNameEnt(mib, this);
                            this.sdlcPortOperRole = new SdlcPortOperRoleEnt(mib, this);
                            this.sdlcPortOperType = new SdlcPortOperTypeEnt(mib, this);
                            this.sdlcPortOperTopology = new SdlcPortOperTopologyEnt(mib, this);
                            this.sdlcPortOperISTATUS = new SdlcPortOperISTATUSEnt(mib, this);
                            this.sdlcPortOperACTIVTO = new SdlcPortOperACTIVTOEnt(mib, this);
                            this.sdlcPortOperPAUSE = new SdlcPortOperPAUSEEnt(mib, this);
                            this.sdlcPortOperSlowPollMethod = new SdlcPortOperSlowPollMethodEnt(mib, this);
                            this.sdlcPortOperSERVLIM = new SdlcPortOperSERVLIMEnt(mib, this);
                            this.sdlcPortOperSlowPollTimer = new SdlcPortOperSlowPollTimerEnt(mib, this);
                            this.sdlcPortOperLastModifyTime = new SdlcPortOperLastModifyTimeEnt(mib, this);
                            this.sdlcPortOperLastFailTime = new SdlcPortOperLastFailTimeEnt(mib, this);
                            this.sdlcPortOperLastFailCause = new SdlcPortOperLastFailCauseEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcPortOperName,
                                this.sdlcPortOperRole,
                                this.sdlcPortOperType,
                                this.sdlcPortOperTopology,
                                this.sdlcPortOperISTATUS,
                                this.sdlcPortOperACTIVTO,
                                this.sdlcPortOperPAUSE,
                                this.sdlcPortOperSlowPollMethod,
                                this.sdlcPortOperSERVLIM,
                                this.sdlcPortOperSlowPollTimer,
                                this.sdlcPortOperLastModifyTime,
                                this.sdlcPortOperLastFailTime,
                                this.sdlcPortOperLastFailCause
                            };
                        }
                        public static final class SdlcPortOperNameEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperNameEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperName", "1.3.6.1.2.1.41.1.1.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperRoleEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperRoleEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperRole", "1.3.6.1.2.1.41.1.1.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperTypeEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperTypeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperType", "1.3.6.1.2.1.41.1.1.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperTopologyEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperTopologyEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperTopology", "1.3.6.1.2.1.41.1.1.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperISTATUSEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperISTATUSEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperISTATUS", "1.3.6.1.2.1.41.1.1.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperACTIVTOEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperACTIVTOEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperACTIVTO", "1.3.6.1.2.1.41.1.1.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperPAUSEEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperPAUSEEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperPAUSE", "1.3.6.1.2.1.41.1.1.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperSlowPollMethodEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperSlowPollMethodEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperSlowPollMethod", "1.3.6.1.2.1.41.1.1.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperSERVLIMEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperSERVLIMEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperSERVLIM", "1.3.6.1.2.1.41.1.1.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperSlowPollTimerEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperSlowPollTimerEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperSlowPollTimer", "1.3.6.1.2.1.41.1.1.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperLastModifyTimeEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperLastModifyTimeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperLastModifyTime", "1.3.6.1.2.1.41.1.1.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperLastFailTimeEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperLastFailTimeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperLastFailTime", "1.3.6.1.2.1.41.1.1.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortOperLastFailCauseEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortOperLastFailCauseEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortOperLastFailCause", "1.3.6.1.2.1.41.1.1.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SdlcPortStatsTableEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    public final SdlcPortStatsEntryEnt sdlcPortStatsEntry;

                    private SdlcPortStatsTableEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcPortStatsTable", "1.3.6.1.2.1.41.1.1.3", false, true, false, false);
                        this.sdlcPortStatsEntry = new SdlcPortStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcPortStatsEntry
                        };
                    }
                    public static final class SdlcPortStatsEntryEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcPortStatsPhysicalFailuresEnt sdlcPortStatsPhysicalFailures;

                        public final SdlcPortStatsInvalidAddressesEnt sdlcPortStatsInvalidAddresses;

                        public final SdlcPortStatsDwarfFramesEnt sdlcPortStatsDwarfFrames;

                        public final SdlcPortStatsPollsInEnt sdlcPortStatsPollsIn;

                        public final SdlcPortStatsPollsOutEnt sdlcPortStatsPollsOut;

                        public final SdlcPortStatsPollRspsInEnt sdlcPortStatsPollRspsIn;

                        public final SdlcPortStatsPollRspsOutEnt sdlcPortStatsPollRspsOut;

                        public final SdlcPortStatsLocalBusiesEnt sdlcPortStatsLocalBusies;

                        public final SdlcPortStatsRemoteBusiesEnt sdlcPortStatsRemoteBusies;

                        public final SdlcPortStatsIFramesInEnt sdlcPortStatsIFramesIn;

                        public final SdlcPortStatsIFramesOutEnt sdlcPortStatsIFramesOut;

                        public final SdlcPortStatsOctetsInEnt sdlcPortStatsOctetsIn;

                        public final SdlcPortStatsOctetsOutEnt sdlcPortStatsOctetsOut;

                        public final SdlcPortStatsProtocolErrsEnt sdlcPortStatsProtocolErrs;

                        public final SdlcPortStatsActivityTOsEnt sdlcPortStatsActivityTOs;

                        public final SdlcPortStatsRNRLIMITsEnt sdlcPortStatsRNRLIMITs;

                        public final SdlcPortStatsRetriesExpsEnt sdlcPortStatsRetriesExps;

                        public final SdlcPortStatsRetransmitsInEnt sdlcPortStatsRetransmitsIn;

                        public final SdlcPortStatsRetransmitsOutEnt sdlcPortStatsRetransmitsOut;

                        private SdlcPortStatsEntryEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcPortStatsEntry", "1.3.6.1.2.1.41.1.1.3.1", false, false, false, true);
                            this.sdlcPortStatsPhysicalFailures = new SdlcPortStatsPhysicalFailuresEnt(mib, this);
                            this.sdlcPortStatsInvalidAddresses = new SdlcPortStatsInvalidAddressesEnt(mib, this);
                            this.sdlcPortStatsDwarfFrames = new SdlcPortStatsDwarfFramesEnt(mib, this);
                            this.sdlcPortStatsPollsIn = new SdlcPortStatsPollsInEnt(mib, this);
                            this.sdlcPortStatsPollsOut = new SdlcPortStatsPollsOutEnt(mib, this);
                            this.sdlcPortStatsPollRspsIn = new SdlcPortStatsPollRspsInEnt(mib, this);
                            this.sdlcPortStatsPollRspsOut = new SdlcPortStatsPollRspsOutEnt(mib, this);
                            this.sdlcPortStatsLocalBusies = new SdlcPortStatsLocalBusiesEnt(mib, this);
                            this.sdlcPortStatsRemoteBusies = new SdlcPortStatsRemoteBusiesEnt(mib, this);
                            this.sdlcPortStatsIFramesIn = new SdlcPortStatsIFramesInEnt(mib, this);
                            this.sdlcPortStatsIFramesOut = new SdlcPortStatsIFramesOutEnt(mib, this);
                            this.sdlcPortStatsOctetsIn = new SdlcPortStatsOctetsInEnt(mib, this);
                            this.sdlcPortStatsOctetsOut = new SdlcPortStatsOctetsOutEnt(mib, this);
                            this.sdlcPortStatsProtocolErrs = new SdlcPortStatsProtocolErrsEnt(mib, this);
                            this.sdlcPortStatsActivityTOs = new SdlcPortStatsActivityTOsEnt(mib, this);
                            this.sdlcPortStatsRNRLIMITs = new SdlcPortStatsRNRLIMITsEnt(mib, this);
                            this.sdlcPortStatsRetriesExps = new SdlcPortStatsRetriesExpsEnt(mib, this);
                            this.sdlcPortStatsRetransmitsIn = new SdlcPortStatsRetransmitsInEnt(mib, this);
                            this.sdlcPortStatsRetransmitsOut = new SdlcPortStatsRetransmitsOutEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcPortStatsPhysicalFailures,
                                this.sdlcPortStatsInvalidAddresses,
                                this.sdlcPortStatsDwarfFrames,
                                this.sdlcPortStatsPollsIn,
                                this.sdlcPortStatsPollsOut,
                                this.sdlcPortStatsPollRspsIn,
                                this.sdlcPortStatsPollRspsOut,
                                this.sdlcPortStatsLocalBusies,
                                this.sdlcPortStatsRemoteBusies,
                                this.sdlcPortStatsIFramesIn,
                                this.sdlcPortStatsIFramesOut,
                                this.sdlcPortStatsOctetsIn,
                                this.sdlcPortStatsOctetsOut,
                                this.sdlcPortStatsProtocolErrs,
                                this.sdlcPortStatsActivityTOs,
                                this.sdlcPortStatsRNRLIMITs,
                                this.sdlcPortStatsRetriesExps,
                                this.sdlcPortStatsRetransmitsIn,
                                this.sdlcPortStatsRetransmitsOut
                            };
                        }
                        public static final class SdlcPortStatsPhysicalFailuresEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsPhysicalFailuresEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsPhysicalFailures", "1.3.6.1.2.1.41.1.1.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsInvalidAddressesEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsInvalidAddressesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsInvalidAddresses", "1.3.6.1.2.1.41.1.1.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsDwarfFramesEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsDwarfFramesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsDwarfFrames", "1.3.6.1.2.1.41.1.1.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsPollsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsPollsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsPollsIn", "1.3.6.1.2.1.41.1.1.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsPollsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsPollsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsPollsOut", "1.3.6.1.2.1.41.1.1.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsPollRspsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsPollRspsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsPollRspsIn", "1.3.6.1.2.1.41.1.1.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsPollRspsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsPollRspsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsPollRspsOut", "1.3.6.1.2.1.41.1.1.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsLocalBusiesEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsLocalBusiesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsLocalBusies", "1.3.6.1.2.1.41.1.1.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsRemoteBusiesEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsRemoteBusiesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsRemoteBusies", "1.3.6.1.2.1.41.1.1.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsIFramesInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsIFramesInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsIFramesIn", "1.3.6.1.2.1.41.1.1.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsIFramesOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsIFramesOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsIFramesOut", "1.3.6.1.2.1.41.1.1.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsOctetsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsOctetsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsOctetsIn", "1.3.6.1.2.1.41.1.1.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsOctetsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsOctetsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsOctetsOut", "1.3.6.1.2.1.41.1.1.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsProtocolErrsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsProtocolErrsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsProtocolErrs", "1.3.6.1.2.1.41.1.1.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsActivityTOsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsActivityTOsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsActivityTOs", "1.3.6.1.2.1.41.1.1.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsRNRLIMITsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsRNRLIMITsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsRNRLIMITs", "1.3.6.1.2.1.41.1.1.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsRetriesExpsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsRetriesExpsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsRetriesExps", "1.3.6.1.2.1.41.1.1.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsRetransmitsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsRetransmitsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsRetransmitsIn", "1.3.6.1.2.1.41.1.1.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPortStatsRetransmitsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPortStatsRetransmitsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPortStatsRetransmitsOut", "1.3.6.1.2.1.41.1.1.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SdlcLSGroupEnt extends MIBEntry<SNASDLCMIBDef>
            {
                /** THE SDLC LINK STATION GROUP===========================
The following classes of information is modelled for each SDLC linkstation:1.  ADMINISTRATIVE ( read-write)2.  OPERATIONAL    ( read-only)3.  STATISTICS     ( read-only)
**************************************************************                                                           **        THE SDLC LINK STATION ADMINISTRATIVE TABLE         **                                                           ***************************************************************/
                public final SdlcLSAdminTableEnt sdlcLSAdminTable;

                /** **************************************************************                                                           **           THE SDLC LINK STATION OPERATIONAL TABLE         **                                                           ***************************************************************/
                public final SdlcLSOperTableEnt sdlcLSOperTable;

                /** **************************************************************                                                           **           THE SDLC LINK STATION STATISTICS TABLE          **                                                           ***************************************************************/
                public final SdlcLSStatsTableEnt sdlcLSStatsTable;

                private SdlcLSGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                {
                    super(mib, parent, "sdlcLSGroup", "1.3.6.1.2.1.41.1.2", false, false, false, false);
                    this.sdlcLSAdminTable = new SdlcLSAdminTableEnt(mib, this);
                    this.sdlcLSOperTable = new SdlcLSOperTableEnt(mib, this);
                    this.sdlcLSStatsTable = new SdlcLSStatsTableEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sdlcLSAdminTable,
                        this.sdlcLSOperTable,
                        this.sdlcLSStatsTable
                    };
                }
                public static final class SdlcLSAdminTableEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    public final SdlcLSAdminEntryEnt sdlcLSAdminEntry;

                    private SdlcLSAdminTableEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcLSAdminTable", "1.3.6.1.2.1.41.1.2.1", false, true, false, false);
                        this.sdlcLSAdminEntry = new SdlcLSAdminEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcLSAdminEntry
                        };
                    }
                    public static final class SdlcLSAdminEntryEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcLSAddressEnt sdlcLSAddress;

                        public final SdlcLSAdminNameEnt sdlcLSAdminName;

                        public final SdlcLSAdminStateEnt sdlcLSAdminState;

                        public final SdlcLSAdminISTATUSEnt sdlcLSAdminISTATUS;

                        public final SdlcLSAdminMAXDATASendEnt sdlcLSAdminMAXDATASend;

                        public final SdlcLSAdminMAXDATARcvEnt sdlcLSAdminMAXDATARcv;

                        public final SdlcLSAdminREPLYTOEnt sdlcLSAdminREPLYTO;

                        public final SdlcLSAdminMAXINEnt sdlcLSAdminMAXIN;

                        public final SdlcLSAdminMAXOUTEnt sdlcLSAdminMAXOUT;

                        public final SdlcLSAdminMODULOEnt sdlcLSAdminMODULO;

                        public final SdlcLSAdminRETRIESmEnt sdlcLSAdminRETRIESm;

                        public final SdlcLSAdminRETRIEStEnt sdlcLSAdminRETRIESt;

                        public final SdlcLSAdminRETRIESnEnt sdlcLSAdminRETRIESn;

                        public final SdlcLSAdminRNRLIMITEnt sdlcLSAdminRNRLIMIT;

                        public final SdlcLSAdminDATMODEEnt sdlcLSAdminDATMODE;

                        public final SdlcLSAdminGPollEnt sdlcLSAdminGPoll;

                        public final SdlcLSAdminSimRimEnt sdlcLSAdminSimRim;

                        public final SdlcLSAdminXmitRcvCapEnt sdlcLSAdminXmitRcvCap;

                        public final SdlcLSAdminRowStatusEnt sdlcLSAdminRowStatus;

                        private SdlcLSAdminEntryEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcLSAdminEntry", "1.3.6.1.2.1.41.1.2.1.1", false, false, false, true);
                            this.sdlcLSAddress = new SdlcLSAddressEnt(mib, this);
                            this.sdlcLSAdminName = new SdlcLSAdminNameEnt(mib, this);
                            this.sdlcLSAdminState = new SdlcLSAdminStateEnt(mib, this);
                            this.sdlcLSAdminISTATUS = new SdlcLSAdminISTATUSEnt(mib, this);
                            this.sdlcLSAdminMAXDATASend = new SdlcLSAdminMAXDATASendEnt(mib, this);
                            this.sdlcLSAdminMAXDATARcv = new SdlcLSAdminMAXDATARcvEnt(mib, this);
                            this.sdlcLSAdminREPLYTO = new SdlcLSAdminREPLYTOEnt(mib, this);
                            this.sdlcLSAdminMAXIN = new SdlcLSAdminMAXINEnt(mib, this);
                            this.sdlcLSAdminMAXOUT = new SdlcLSAdminMAXOUTEnt(mib, this);
                            this.sdlcLSAdminMODULO = new SdlcLSAdminMODULOEnt(mib, this);
                            this.sdlcLSAdminRETRIESm = new SdlcLSAdminRETRIESmEnt(mib, this);
                            this.sdlcLSAdminRETRIESt = new SdlcLSAdminRETRIEStEnt(mib, this);
                            this.sdlcLSAdminRETRIESn = new SdlcLSAdminRETRIESnEnt(mib, this);
                            this.sdlcLSAdminRNRLIMIT = new SdlcLSAdminRNRLIMITEnt(mib, this);
                            this.sdlcLSAdminDATMODE = new SdlcLSAdminDATMODEEnt(mib, this);
                            this.sdlcLSAdminGPoll = new SdlcLSAdminGPollEnt(mib, this);
                            this.sdlcLSAdminSimRim = new SdlcLSAdminSimRimEnt(mib, this);
                            this.sdlcLSAdminXmitRcvCap = new SdlcLSAdminXmitRcvCapEnt(mib, this);
                            this.sdlcLSAdminRowStatus = new SdlcLSAdminRowStatusEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcLSAddress,
                                this.sdlcLSAdminName,
                                this.sdlcLSAdminState,
                                this.sdlcLSAdminISTATUS,
                                this.sdlcLSAdminMAXDATASend,
                                this.sdlcLSAdminMAXDATARcv,
                                this.sdlcLSAdminREPLYTO,
                                this.sdlcLSAdminMAXIN,
                                this.sdlcLSAdminMAXOUT,
                                this.sdlcLSAdminMODULO,
                                this.sdlcLSAdminRETRIESm,
                                this.sdlcLSAdminRETRIESt,
                                this.sdlcLSAdminRETRIESn,
                                this.sdlcLSAdminRNRLIMIT,
                                this.sdlcLSAdminDATMODE,
                                this.sdlcLSAdminGPoll,
                                this.sdlcLSAdminSimRim,
                                this.sdlcLSAdminXmitRcvCap,
                                this.sdlcLSAdminRowStatus
                            };
                        }
                        public static final class SdlcLSAddressEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAddressEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAddress", "1.3.6.1.2.1.41.1.2.1.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminNameEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminNameEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminName", "1.3.6.1.2.1.41.1.2.1.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminStateEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminStateEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminState", "1.3.6.1.2.1.41.1.2.1.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminISTATUSEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminISTATUSEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminISTATUS", "1.3.6.1.2.1.41.1.2.1.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminMAXDATASendEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminMAXDATASendEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminMAXDATASend", "1.3.6.1.2.1.41.1.2.1.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminMAXDATARcvEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminMAXDATARcvEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminMAXDATARcv", "1.3.6.1.2.1.41.1.2.1.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminREPLYTOEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminREPLYTOEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminREPLYTO", "1.3.6.1.2.1.41.1.2.1.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminMAXINEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminMAXINEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminMAXIN", "1.3.6.1.2.1.41.1.2.1.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminMAXOUTEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminMAXOUTEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminMAXOUT", "1.3.6.1.2.1.41.1.2.1.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminMODULOEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminMODULOEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminMODULO", "1.3.6.1.2.1.41.1.2.1.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminRETRIESmEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminRETRIESmEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminRETRIESm", "1.3.6.1.2.1.41.1.2.1.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminRETRIEStEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminRETRIEStEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminRETRIESt", "1.3.6.1.2.1.41.1.2.1.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminRETRIESnEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminRETRIESnEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminRETRIESn", "1.3.6.1.2.1.41.1.2.1.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminRNRLIMITEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminRNRLIMITEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminRNRLIMIT", "1.3.6.1.2.1.41.1.2.1.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminDATMODEEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminDATMODEEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminDATMODE", "1.3.6.1.2.1.41.1.2.1.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminGPollEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminGPollEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminGPoll", "1.3.6.1.2.1.41.1.2.1.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminSimRimEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminSimRimEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminSimRim", "1.3.6.1.2.1.41.1.2.1.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminXmitRcvCapEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminXmitRcvCapEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminXmitRcvCap", "1.3.6.1.2.1.41.1.2.1.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSAdminRowStatusEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSAdminRowStatusEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSAdminRowStatus", "1.3.6.1.2.1.41.1.2.1.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SdlcLSOperTableEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    public final SdlcLSOperEntryEnt sdlcLSOperEntry;

                    private SdlcLSOperTableEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcLSOperTable", "1.3.6.1.2.1.41.1.2.2", false, true, false, false);
                        this.sdlcLSOperEntry = new SdlcLSOperEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcLSOperEntry
                        };
                    }
                    public static final class SdlcLSOperEntryEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcLSOperNameEnt sdlcLSOperName;

                        public final SdlcLSOperRoleEnt sdlcLSOperRole;

                        public final SdlcLSOperStateEnt sdlcLSOperState;

                        public final SdlcLSOperMAXDATASendEnt sdlcLSOperMAXDATASend;

                        public final SdlcLSOperREPLYTOEnt sdlcLSOperREPLYTO;

                        public final SdlcLSOperMAXINEnt sdlcLSOperMAXIN;

                        public final SdlcLSOperMAXOUTEnt sdlcLSOperMAXOUT;

                        public final SdlcLSOperMODULOEnt sdlcLSOperMODULO;

                        public final SdlcLSOperRETRIESmEnt sdlcLSOperRETRIESm;

                        public final SdlcLSOperRETRIEStEnt sdlcLSOperRETRIESt;

                        public final SdlcLSOperRETRIESnEnt sdlcLSOperRETRIESn;

                        public final SdlcLSOperRNRLIMITEnt sdlcLSOperRNRLIMIT;

                        public final SdlcLSOperDATMODEEnt sdlcLSOperDATMODE;

                        public final SdlcLSOperLastModifyTimeEnt sdlcLSOperLastModifyTime;

                        public final SdlcLSOperLastFailTimeEnt sdlcLSOperLastFailTime;

                        public final SdlcLSOperLastFailCauseEnt sdlcLSOperLastFailCause;

                        public final SdlcLSOperLastFailCtrlInEnt sdlcLSOperLastFailCtrlIn;

                        public final SdlcLSOperLastFailCtrlOutEnt sdlcLSOperLastFailCtrlOut;

                        public final SdlcLSOperLastFailFRMRInfoEnt sdlcLSOperLastFailFRMRInfo;

                        public final SdlcLSOperLastFailREPLYTOsEnt sdlcLSOperLastFailREPLYTOs;

                        public final SdlcLSOperEchoEnt sdlcLSOperEcho;

                        public final SdlcLSOperGPollEnt sdlcLSOperGPoll;

                        public final SdlcLSOperSimRimEnt sdlcLSOperSimRim;

                        public final SdlcLSOperXmitRcvCapEnt sdlcLSOperXmitRcvCap;

                        private SdlcLSOperEntryEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcLSOperEntry", "1.3.6.1.2.1.41.1.2.2.1", false, false, false, true);
                            this.sdlcLSOperName = new SdlcLSOperNameEnt(mib, this);
                            this.sdlcLSOperRole = new SdlcLSOperRoleEnt(mib, this);
                            this.sdlcLSOperState = new SdlcLSOperStateEnt(mib, this);
                            this.sdlcLSOperMAXDATASend = new SdlcLSOperMAXDATASendEnt(mib, this);
                            this.sdlcLSOperREPLYTO = new SdlcLSOperREPLYTOEnt(mib, this);
                            this.sdlcLSOperMAXIN = new SdlcLSOperMAXINEnt(mib, this);
                            this.sdlcLSOperMAXOUT = new SdlcLSOperMAXOUTEnt(mib, this);
                            this.sdlcLSOperMODULO = new SdlcLSOperMODULOEnt(mib, this);
                            this.sdlcLSOperRETRIESm = new SdlcLSOperRETRIESmEnt(mib, this);
                            this.sdlcLSOperRETRIESt = new SdlcLSOperRETRIEStEnt(mib, this);
                            this.sdlcLSOperRETRIESn = new SdlcLSOperRETRIESnEnt(mib, this);
                            this.sdlcLSOperRNRLIMIT = new SdlcLSOperRNRLIMITEnt(mib, this);
                            this.sdlcLSOperDATMODE = new SdlcLSOperDATMODEEnt(mib, this);
                            this.sdlcLSOperLastModifyTime = new SdlcLSOperLastModifyTimeEnt(mib, this);
                            this.sdlcLSOperLastFailTime = new SdlcLSOperLastFailTimeEnt(mib, this);
                            this.sdlcLSOperLastFailCause = new SdlcLSOperLastFailCauseEnt(mib, this);
                            this.sdlcLSOperLastFailCtrlIn = new SdlcLSOperLastFailCtrlInEnt(mib, this);
                            this.sdlcLSOperLastFailCtrlOut = new SdlcLSOperLastFailCtrlOutEnt(mib, this);
                            this.sdlcLSOperLastFailFRMRInfo = new SdlcLSOperLastFailFRMRInfoEnt(mib, this);
                            this.sdlcLSOperLastFailREPLYTOs = new SdlcLSOperLastFailREPLYTOsEnt(mib, this);
                            this.sdlcLSOperEcho = new SdlcLSOperEchoEnt(mib, this);
                            this.sdlcLSOperGPoll = new SdlcLSOperGPollEnt(mib, this);
                            this.sdlcLSOperSimRim = new SdlcLSOperSimRimEnt(mib, this);
                            this.sdlcLSOperXmitRcvCap = new SdlcLSOperXmitRcvCapEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcLSOperName,
                                this.sdlcLSOperRole,
                                this.sdlcLSOperState,
                                this.sdlcLSOperMAXDATASend,
                                this.sdlcLSOperREPLYTO,
                                this.sdlcLSOperMAXIN,
                                this.sdlcLSOperMAXOUT,
                                this.sdlcLSOperMODULO,
                                this.sdlcLSOperRETRIESm,
                                this.sdlcLSOperRETRIESt,
                                this.sdlcLSOperRETRIESn,
                                this.sdlcLSOperRNRLIMIT,
                                this.sdlcLSOperDATMODE,
                                this.sdlcLSOperLastModifyTime,
                                this.sdlcLSOperLastFailTime,
                                this.sdlcLSOperLastFailCause,
                                this.sdlcLSOperLastFailCtrlIn,
                                this.sdlcLSOperLastFailCtrlOut,
                                this.sdlcLSOperLastFailFRMRInfo,
                                this.sdlcLSOperLastFailREPLYTOs,
                                this.sdlcLSOperEcho,
                                this.sdlcLSOperGPoll,
                                this.sdlcLSOperSimRim,
                                this.sdlcLSOperXmitRcvCap
                            };
                        }
                        public static final class SdlcLSOperNameEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperNameEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperName", "1.3.6.1.2.1.41.1.2.2.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperRoleEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperRoleEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperRole", "1.3.6.1.2.1.41.1.2.2.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperStateEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperStateEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperState", "1.3.6.1.2.1.41.1.2.2.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperMAXDATASendEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperMAXDATASendEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperMAXDATASend", "1.3.6.1.2.1.41.1.2.2.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperREPLYTOEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperREPLYTOEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperREPLYTO", "1.3.6.1.2.1.41.1.2.2.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperMAXINEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperMAXINEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperMAXIN", "1.3.6.1.2.1.41.1.2.2.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperMAXOUTEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperMAXOUTEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperMAXOUT", "1.3.6.1.2.1.41.1.2.2.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperMODULOEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperMODULOEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperMODULO", "1.3.6.1.2.1.41.1.2.2.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperRETRIESmEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperRETRIESmEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperRETRIESm", "1.3.6.1.2.1.41.1.2.2.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperRETRIEStEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperRETRIEStEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperRETRIESt", "1.3.6.1.2.1.41.1.2.2.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperRETRIESnEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperRETRIESnEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperRETRIESn", "1.3.6.1.2.1.41.1.2.2.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperRNRLIMITEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperRNRLIMITEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperRNRLIMIT", "1.3.6.1.2.1.41.1.2.2.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperDATMODEEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperDATMODEEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperDATMODE", "1.3.6.1.2.1.41.1.2.2.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastModifyTimeEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastModifyTimeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastModifyTime", "1.3.6.1.2.1.41.1.2.2.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastFailTimeEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastFailTimeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastFailTime", "1.3.6.1.2.1.41.1.2.2.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastFailCauseEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastFailCauseEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastFailCause", "1.3.6.1.2.1.41.1.2.2.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastFailCtrlInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastFailCtrlInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastFailCtrlIn", "1.3.6.1.2.1.41.1.2.2.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastFailCtrlOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastFailCtrlOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastFailCtrlOut", "1.3.6.1.2.1.41.1.2.2.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastFailFRMRInfoEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastFailFRMRInfoEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastFailFRMRInfo", "1.3.6.1.2.1.41.1.2.2.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperLastFailREPLYTOsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperLastFailREPLYTOsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperLastFailREPLYTOs", "1.3.6.1.2.1.41.1.2.2.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperEchoEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperEchoEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperEcho", "1.3.6.1.2.1.41.1.2.2.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperGPollEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperGPollEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperGPoll", "1.3.6.1.2.1.41.1.2.2.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperSimRimEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperSimRimEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperSimRim", "1.3.6.1.2.1.41.1.2.2.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSOperXmitRcvCapEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSOperXmitRcvCapEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSOperXmitRcvCap", "1.3.6.1.2.1.41.1.2.2.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

                public static final class SdlcLSStatsTableEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    public final SdlcLSStatsEntryEnt sdlcLSStatsEntry;

                    private SdlcLSStatsTableEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcLSStatsTable", "1.3.6.1.2.1.41.1.2.3", false, true, false, false);
                        this.sdlcLSStatsEntry = new SdlcLSStatsEntryEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcLSStatsEntry
                        };
                    }
                    public static final class SdlcLSStatsEntryEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcLSStatsBLUsInEnt sdlcLSStatsBLUsIn;

                        public final SdlcLSStatsBLUsOutEnt sdlcLSStatsBLUsOut;

                        public final SdlcLSStatsOctetsInEnt sdlcLSStatsOctetsIn;

                        public final SdlcLSStatsOctetsOutEnt sdlcLSStatsOctetsOut;

                        public final SdlcLSStatsPollsInEnt sdlcLSStatsPollsIn;

                        public final SdlcLSStatsPollsOutEnt sdlcLSStatsPollsOut;

                        public final SdlcLSStatsPollRspsOutEnt sdlcLSStatsPollRspsOut;

                        public final SdlcLSStatsPollRspsInEnt sdlcLSStatsPollRspsIn;

                        public final SdlcLSStatsLocalBusiesEnt sdlcLSStatsLocalBusies;

                        public final SdlcLSStatsRemoteBusiesEnt sdlcLSStatsRemoteBusies;

                        public final SdlcLSStatsIFramesInEnt sdlcLSStatsIFramesIn;

                        public final SdlcLSStatsIFramesOutEnt sdlcLSStatsIFramesOut;

                        public final SdlcLSStatsUIFramesInEnt sdlcLSStatsUIFramesIn;

                        public final SdlcLSStatsUIFramesOutEnt sdlcLSStatsUIFramesOut;

                        public final SdlcLSStatsXIDsInEnt sdlcLSStatsXIDsIn;

                        public final SdlcLSStatsXIDsOutEnt sdlcLSStatsXIDsOut;

                        public final SdlcLSStatsTESTsInEnt sdlcLSStatsTESTsIn;

                        public final SdlcLSStatsTESTsOutEnt sdlcLSStatsTESTsOut;

                        public final SdlcLSStatsREJsInEnt sdlcLSStatsREJsIn;

                        public final SdlcLSStatsREJsOutEnt sdlcLSStatsREJsOut;

                        public final SdlcLSStatsFRMRsInEnt sdlcLSStatsFRMRsIn;

                        public final SdlcLSStatsFRMRsOutEnt sdlcLSStatsFRMRsOut;

                        public final SdlcLSStatsSIMsInEnt sdlcLSStatsSIMsIn;

                        public final SdlcLSStatsSIMsOutEnt sdlcLSStatsSIMsOut;

                        public final SdlcLSStatsRIMsInEnt sdlcLSStatsRIMsIn;

                        public final SdlcLSStatsRIMsOutEnt sdlcLSStatsRIMsOut;

                        public final SdlcLSStatsDISCInEnt sdlcLSStatsDISCIn;

                        public final SdlcLSStatsDISCOutEnt sdlcLSStatsDISCOut;

                        public final SdlcLSStatsUAInEnt sdlcLSStatsUAIn;

                        public final SdlcLSStatsUAOutEnt sdlcLSStatsUAOut;

                        public final SdlcLSStatsDMInEnt sdlcLSStatsDMIn;

                        public final SdlcLSStatsDMOutEnt sdlcLSStatsDMOut;

                        public final SdlcLSStatsSNRMInEnt sdlcLSStatsSNRMIn;

                        public final SdlcLSStatsSNRMOutEnt sdlcLSStatsSNRMOut;

                        public final SdlcLSStatsProtocolErrsEnt sdlcLSStatsProtocolErrs;

                        public final SdlcLSStatsActivityTOsEnt sdlcLSStatsActivityTOs;

                        public final SdlcLSStatsRNRLIMITsEnt sdlcLSStatsRNRLIMITs;

                        public final SdlcLSStatsRetriesExpsEnt sdlcLSStatsRetriesExps;

                        public final SdlcLSStatsRetransmitsInEnt sdlcLSStatsRetransmitsIn;

                        public final SdlcLSStatsRetransmitsOutEnt sdlcLSStatsRetransmitsOut;

                        private SdlcLSStatsEntryEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcLSStatsEntry", "1.3.6.1.2.1.41.1.2.3.1", false, false, false, true);
                            this.sdlcLSStatsBLUsIn = new SdlcLSStatsBLUsInEnt(mib, this);
                            this.sdlcLSStatsBLUsOut = new SdlcLSStatsBLUsOutEnt(mib, this);
                            this.sdlcLSStatsOctetsIn = new SdlcLSStatsOctetsInEnt(mib, this);
                            this.sdlcLSStatsOctetsOut = new SdlcLSStatsOctetsOutEnt(mib, this);
                            this.sdlcLSStatsPollsIn = new SdlcLSStatsPollsInEnt(mib, this);
                            this.sdlcLSStatsPollsOut = new SdlcLSStatsPollsOutEnt(mib, this);
                            this.sdlcLSStatsPollRspsOut = new SdlcLSStatsPollRspsOutEnt(mib, this);
                            this.sdlcLSStatsPollRspsIn = new SdlcLSStatsPollRspsInEnt(mib, this);
                            this.sdlcLSStatsLocalBusies = new SdlcLSStatsLocalBusiesEnt(mib, this);
                            this.sdlcLSStatsRemoteBusies = new SdlcLSStatsRemoteBusiesEnt(mib, this);
                            this.sdlcLSStatsIFramesIn = new SdlcLSStatsIFramesInEnt(mib, this);
                            this.sdlcLSStatsIFramesOut = new SdlcLSStatsIFramesOutEnt(mib, this);
                            this.sdlcLSStatsUIFramesIn = new SdlcLSStatsUIFramesInEnt(mib, this);
                            this.sdlcLSStatsUIFramesOut = new SdlcLSStatsUIFramesOutEnt(mib, this);
                            this.sdlcLSStatsXIDsIn = new SdlcLSStatsXIDsInEnt(mib, this);
                            this.sdlcLSStatsXIDsOut = new SdlcLSStatsXIDsOutEnt(mib, this);
                            this.sdlcLSStatsTESTsIn = new SdlcLSStatsTESTsInEnt(mib, this);
                            this.sdlcLSStatsTESTsOut = new SdlcLSStatsTESTsOutEnt(mib, this);
                            this.sdlcLSStatsREJsIn = new SdlcLSStatsREJsInEnt(mib, this);
                            this.sdlcLSStatsREJsOut = new SdlcLSStatsREJsOutEnt(mib, this);
                            this.sdlcLSStatsFRMRsIn = new SdlcLSStatsFRMRsInEnt(mib, this);
                            this.sdlcLSStatsFRMRsOut = new SdlcLSStatsFRMRsOutEnt(mib, this);
                            this.sdlcLSStatsSIMsIn = new SdlcLSStatsSIMsInEnt(mib, this);
                            this.sdlcLSStatsSIMsOut = new SdlcLSStatsSIMsOutEnt(mib, this);
                            this.sdlcLSStatsRIMsIn = new SdlcLSStatsRIMsInEnt(mib, this);
                            this.sdlcLSStatsRIMsOut = new SdlcLSStatsRIMsOutEnt(mib, this);
                            this.sdlcLSStatsDISCIn = new SdlcLSStatsDISCInEnt(mib, this);
                            this.sdlcLSStatsDISCOut = new SdlcLSStatsDISCOutEnt(mib, this);
                            this.sdlcLSStatsUAIn = new SdlcLSStatsUAInEnt(mib, this);
                            this.sdlcLSStatsUAOut = new SdlcLSStatsUAOutEnt(mib, this);
                            this.sdlcLSStatsDMIn = new SdlcLSStatsDMInEnt(mib, this);
                            this.sdlcLSStatsDMOut = new SdlcLSStatsDMOutEnt(mib, this);
                            this.sdlcLSStatsSNRMIn = new SdlcLSStatsSNRMInEnt(mib, this);
                            this.sdlcLSStatsSNRMOut = new SdlcLSStatsSNRMOutEnt(mib, this);
                            this.sdlcLSStatsProtocolErrs = new SdlcLSStatsProtocolErrsEnt(mib, this);
                            this.sdlcLSStatsActivityTOs = new SdlcLSStatsActivityTOsEnt(mib, this);
                            this.sdlcLSStatsRNRLIMITs = new SdlcLSStatsRNRLIMITsEnt(mib, this);
                            this.sdlcLSStatsRetriesExps = new SdlcLSStatsRetriesExpsEnt(mib, this);
                            this.sdlcLSStatsRetransmitsIn = new SdlcLSStatsRetransmitsInEnt(mib, this);
                            this.sdlcLSStatsRetransmitsOut = new SdlcLSStatsRetransmitsOutEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcLSStatsBLUsIn,
                                this.sdlcLSStatsBLUsOut,
                                this.sdlcLSStatsOctetsIn,
                                this.sdlcLSStatsOctetsOut,
                                this.sdlcLSStatsPollsIn,
                                this.sdlcLSStatsPollsOut,
                                this.sdlcLSStatsPollRspsOut,
                                this.sdlcLSStatsPollRspsIn,
                                this.sdlcLSStatsLocalBusies,
                                this.sdlcLSStatsRemoteBusies,
                                this.sdlcLSStatsIFramesIn,
                                this.sdlcLSStatsIFramesOut,
                                this.sdlcLSStatsUIFramesIn,
                                this.sdlcLSStatsUIFramesOut,
                                this.sdlcLSStatsXIDsIn,
                                this.sdlcLSStatsXIDsOut,
                                this.sdlcLSStatsTESTsIn,
                                this.sdlcLSStatsTESTsOut,
                                this.sdlcLSStatsREJsIn,
                                this.sdlcLSStatsREJsOut,
                                this.sdlcLSStatsFRMRsIn,
                                this.sdlcLSStatsFRMRsOut,
                                this.sdlcLSStatsSIMsIn,
                                this.sdlcLSStatsSIMsOut,
                                this.sdlcLSStatsRIMsIn,
                                this.sdlcLSStatsRIMsOut,
                                this.sdlcLSStatsDISCIn,
                                this.sdlcLSStatsDISCOut,
                                this.sdlcLSStatsUAIn,
                                this.sdlcLSStatsUAOut,
                                this.sdlcLSStatsDMIn,
                                this.sdlcLSStatsDMOut,
                                this.sdlcLSStatsSNRMIn,
                                this.sdlcLSStatsSNRMOut,
                                this.sdlcLSStatsProtocolErrs,
                                this.sdlcLSStatsActivityTOs,
                                this.sdlcLSStatsRNRLIMITs,
                                this.sdlcLSStatsRetriesExps,
                                this.sdlcLSStatsRetransmitsIn,
                                this.sdlcLSStatsRetransmitsOut
                            };
                        }
                        public static final class SdlcLSStatsBLUsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsBLUsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsBLUsIn", "1.3.6.1.2.1.41.1.2.3.1.1", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsBLUsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsBLUsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsBLUsOut", "1.3.6.1.2.1.41.1.2.3.1.2", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsOctetsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsOctetsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsOctetsIn", "1.3.6.1.2.1.41.1.2.3.1.3", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsOctetsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsOctetsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsOctetsOut", "1.3.6.1.2.1.41.1.2.3.1.4", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsPollsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsPollsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsPollsIn", "1.3.6.1.2.1.41.1.2.3.1.5", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsPollsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsPollsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsPollsOut", "1.3.6.1.2.1.41.1.2.3.1.6", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsPollRspsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsPollRspsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsPollRspsOut", "1.3.6.1.2.1.41.1.2.3.1.7", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsPollRspsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsPollRspsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsPollRspsIn", "1.3.6.1.2.1.41.1.2.3.1.8", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsLocalBusiesEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsLocalBusiesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsLocalBusies", "1.3.6.1.2.1.41.1.2.3.1.9", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRemoteBusiesEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRemoteBusiesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRemoteBusies", "1.3.6.1.2.1.41.1.2.3.1.10", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsIFramesInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsIFramesInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsIFramesIn", "1.3.6.1.2.1.41.1.2.3.1.11", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsIFramesOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsIFramesOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsIFramesOut", "1.3.6.1.2.1.41.1.2.3.1.12", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsUIFramesInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsUIFramesInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsUIFramesIn", "1.3.6.1.2.1.41.1.2.3.1.13", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsUIFramesOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsUIFramesOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsUIFramesOut", "1.3.6.1.2.1.41.1.2.3.1.14", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsXIDsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsXIDsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsXIDsIn", "1.3.6.1.2.1.41.1.2.3.1.15", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsXIDsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsXIDsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsXIDsOut", "1.3.6.1.2.1.41.1.2.3.1.16", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsTESTsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsTESTsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsTESTsIn", "1.3.6.1.2.1.41.1.2.3.1.17", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsTESTsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsTESTsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsTESTsOut", "1.3.6.1.2.1.41.1.2.3.1.18", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsREJsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsREJsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsREJsIn", "1.3.6.1.2.1.41.1.2.3.1.19", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsREJsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsREJsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsREJsOut", "1.3.6.1.2.1.41.1.2.3.1.20", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsFRMRsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsFRMRsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsFRMRsIn", "1.3.6.1.2.1.41.1.2.3.1.21", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsFRMRsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsFRMRsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsFRMRsOut", "1.3.6.1.2.1.41.1.2.3.1.22", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsSIMsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsSIMsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsSIMsIn", "1.3.6.1.2.1.41.1.2.3.1.23", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsSIMsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsSIMsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsSIMsOut", "1.3.6.1.2.1.41.1.2.3.1.24", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRIMsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRIMsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRIMsIn", "1.3.6.1.2.1.41.1.2.3.1.25", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRIMsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRIMsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRIMsOut", "1.3.6.1.2.1.41.1.2.3.1.26", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsDISCInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsDISCInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsDISCIn", "1.3.6.1.2.1.41.1.2.3.1.27", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsDISCOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsDISCOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsDISCOut", "1.3.6.1.2.1.41.1.2.3.1.28", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsUAInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsUAInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsUAIn", "1.3.6.1.2.1.41.1.2.3.1.29", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsUAOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsUAOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsUAOut", "1.3.6.1.2.1.41.1.2.3.1.30", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsDMInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsDMInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsDMIn", "1.3.6.1.2.1.41.1.2.3.1.31", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsDMOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsDMOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsDMOut", "1.3.6.1.2.1.41.1.2.3.1.32", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsSNRMInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsSNRMInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsSNRMIn", "1.3.6.1.2.1.41.1.2.3.1.33", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsSNRMOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsSNRMOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsSNRMOut", "1.3.6.1.2.1.41.1.2.3.1.34", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsProtocolErrsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsProtocolErrsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsProtocolErrs", "1.3.6.1.2.1.41.1.2.3.1.35", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsActivityTOsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsActivityTOsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsActivityTOs", "1.3.6.1.2.1.41.1.2.3.1.36", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRNRLIMITsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRNRLIMITsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRNRLIMITs", "1.3.6.1.2.1.41.1.2.3.1.37", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRetriesExpsEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRetriesExpsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRetriesExps", "1.3.6.1.2.1.41.1.2.3.1.38", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRetransmitsInEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRetransmitsInEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRetransmitsIn", "1.3.6.1.2.1.41.1.2.3.1.39", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcLSStatsRetransmitsOutEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcLSStatsRetransmitsOutEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcLSStatsRetransmitsOut", "1.3.6.1.2.1.41.1.2.3.1.40", false, false, true, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

            public static final class SdlcTrapsEnt extends MIBEntry<SNASDLCMIBDef>
            {
                public final SdlcPortStatusChangeEnt sdlcPortStatusChange;

                public final SdlcLSStatusChangeEnt sdlcLSStatusChange;

                private SdlcTrapsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                {
                    super(mib, parent, "sdlcTraps", "1.3.6.1.2.1.41.1.3", false, false, false, false);
                    this.sdlcPortStatusChange = new SdlcPortStatusChangeEnt(mib, this);
                    this.sdlcLSStatusChange = new SdlcLSStatusChangeEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sdlcPortStatusChange,
                        this.sdlcLSStatusChange
                    };
                }
                public static final class SdlcPortStatusChangeEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    private SdlcPortStatusChangeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcPortStatusChange", "1.3.6.1.2.1.41.1.3.1", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class SdlcLSStatusChangeEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    private SdlcLSStatusChangeEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcLSStatusChange", "1.3.6.1.2.1.41.1.3.2", false, false, false, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

            public static final class SdlcConformanceEnt extends MIBEntry<SNASDLCMIBDef>
            {
                public final SdlcCompliancesEnt sdlcCompliances;

                public final SdlcGroupsEnt sdlcGroups;

                private SdlcConformanceEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                {
                    super(mib, parent, "sdlcConformance", "1.3.6.1.2.1.41.1.4", false, false, false, false);
                    this.sdlcCompliances = new SdlcCompliancesEnt(mib, this);
                    this.sdlcGroups = new SdlcGroupsEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.sdlcCompliances,
                        this.sdlcGroups
                    };
                }
                public static final class SdlcCompliancesEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    /** Compliance Statements*/
                    public final SdlcCoreComplianceEnt sdlcCoreCompliance;

                    public final SdlcPrimaryComplianceEnt sdlcPrimaryCompliance;

                    public final SdlcPrimaryMultipointComplianceEnt sdlcPrimaryMultipointCompliance;

                    private SdlcCompliancesEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcCompliances", "1.3.6.1.2.1.41.1.4.1", false, false, false, false);
                        this.sdlcCoreCompliance = new SdlcCoreComplianceEnt(mib, this);
                        this.sdlcPrimaryCompliance = new SdlcPrimaryComplianceEnt(mib, this);
                        this.sdlcPrimaryMultipointCompliance = new SdlcPrimaryMultipointComplianceEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcCoreCompliance,
                            this.sdlcPrimaryCompliance,
                            this.sdlcPrimaryMultipointCompliance
                        };
                    }
                    public static final class SdlcCoreComplianceEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        private SdlcCoreComplianceEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcCoreCompliance", "1.3.6.1.2.1.41.1.4.1.1", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SdlcPrimaryComplianceEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        private SdlcPrimaryComplianceEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcPrimaryCompliance", "1.3.6.1.2.1.41.1.4.1.2", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                    public static final class SdlcPrimaryMultipointComplianceEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        private SdlcPrimaryMultipointComplianceEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcPrimaryMultipointCompliance", "1.3.6.1.2.1.41.1.4.1.3", false, false, false, false);
                            this.entries = new MIBEntry<?>[] {

                            };
                        }
                    }

                }

                public static final class SdlcGroupsEnt extends MIBEntry<SNASDLCMIBDef>
                {
                    /** Core Conformance Groups for All Link Stations*/
                    public final SdlcCoreGroupsEnt sdlcCoreGroups;

                    /** Conformance Groups for Primary Link Stations*/
                    public final SdlcPrimaryGroupsEnt sdlcPrimaryGroups;

                    private SdlcGroupsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                    {
                        super(mib, parent, "sdlcGroups", "1.3.6.1.2.1.41.1.4.2", false, false, false, false);
                        this.sdlcCoreGroups = new SdlcCoreGroupsEnt(mib, this);
                        this.sdlcPrimaryGroups = new SdlcPrimaryGroupsEnt(mib, this);
                        this.entries = new MIBEntry<?>[] {
                            this.sdlcCoreGroups,
                            this.sdlcPrimaryGroups
                        };
                    }
                    public static final class SdlcCoreGroupsEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcCorePortAdminGroupEnt sdlcCorePortAdminGroup;

                        public final SdlcCorePortOperGroupEnt sdlcCorePortOperGroup;

                        public final SdlcCorePortStatsGroupEnt sdlcCorePortStatsGroup;

                        public final SdlcCoreLSAdminGroupEnt sdlcCoreLSAdminGroup;

                        public final SdlcCoreLSOperGroupEnt sdlcCoreLSOperGroup;

                        public final SdlcCoreLSStatsGroupEnt sdlcCoreLSStatsGroup;

                        private SdlcCoreGroupsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcCoreGroups", "1.3.6.1.2.1.41.1.4.2.1", false, false, false, false);
                            this.sdlcCorePortAdminGroup = new SdlcCorePortAdminGroupEnt(mib, this);
                            this.sdlcCorePortOperGroup = new SdlcCorePortOperGroupEnt(mib, this);
                            this.sdlcCorePortStatsGroup = new SdlcCorePortStatsGroupEnt(mib, this);
                            this.sdlcCoreLSAdminGroup = new SdlcCoreLSAdminGroupEnt(mib, this);
                            this.sdlcCoreLSOperGroup = new SdlcCoreLSOperGroupEnt(mib, this);
                            this.sdlcCoreLSStatsGroup = new SdlcCoreLSStatsGroupEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcCorePortAdminGroup,
                                this.sdlcCorePortOperGroup,
                                this.sdlcCorePortStatsGroup,
                                this.sdlcCoreLSAdminGroup,
                                this.sdlcCoreLSOperGroup,
                                this.sdlcCoreLSStatsGroup
                            };
                        }
                        public static final class SdlcCorePortAdminGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcCorePortAdminGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcCorePortAdminGroup", "1.3.6.1.2.1.41.1.4.2.1.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcCorePortOperGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcCorePortOperGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcCorePortOperGroup", "1.3.6.1.2.1.41.1.4.2.1.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcCorePortStatsGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcCorePortStatsGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcCorePortStatsGroup", "1.3.6.1.2.1.41.1.4.2.1.3", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcCoreLSAdminGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcCoreLSAdminGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcCoreLSAdminGroup", "1.3.6.1.2.1.41.1.4.2.1.4", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcCoreLSOperGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcCoreLSOperGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcCoreLSOperGroup", "1.3.6.1.2.1.41.1.4.2.1.5", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcCoreLSStatsGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcCoreLSStatsGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcCoreLSStatsGroup", "1.3.6.1.2.1.41.1.4.2.1.6", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                    public static final class SdlcPrimaryGroupsEnt extends MIBEntry<SNASDLCMIBDef>
                    {
                        public final SdlcPrimaryGroupEnt sdlcPrimaryGroup;

                        public final SdlcPrimaryMultipointGroupEnt sdlcPrimaryMultipointGroup;

                        private SdlcPrimaryGroupsEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                        {
                            super(mib, parent, "sdlcPrimaryGroups", "1.3.6.1.2.1.41.1.4.2.2", false, false, false, false);
                            this.sdlcPrimaryGroup = new SdlcPrimaryGroupEnt(mib, this);
                            this.sdlcPrimaryMultipointGroup = new SdlcPrimaryMultipointGroupEnt(mib, this);
                            this.entries = new MIBEntry<?>[] {
                                this.sdlcPrimaryGroup,
                                this.sdlcPrimaryMultipointGroup
                            };
                        }
                        public static final class SdlcPrimaryGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPrimaryGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPrimaryGroup", "1.3.6.1.2.1.41.1.4.2.2.1", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                        public static final class SdlcPrimaryMultipointGroupEnt extends MIBEntry<SNASDLCMIBDef>
                        {
                            private SdlcPrimaryMultipointGroupEnt(SNASDLCMIBDef mib, MIBEntry<SNASDLCMIBDef> parent)
                            {
                                super(mib, parent, "sdlcPrimaryMultipointGroup", "1.3.6.1.2.1.41.1.4.2.2.2", false, false, false, false);
                                this.entries = new MIBEntry<?>[] {

                                };
                            }
                        }

                    }

                }

            }

        }

    }

}
