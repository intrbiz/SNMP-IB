package com.intrbiz.snmp.mib.defs.ietf;

import com.intrbiz.snmp.mib.MIB;

public final class HCRMONMIBDef extends MIB
{
    public static final HCRMONMIBDef HCRMONMIB = new HCRMONMIBDef();

    /** Remote Network Monitoring MIB

May 08, 2002*/
    public final HcRMONEnt hcRMON;

    /** { rmon 1 } through { rmon 20 } are defined in RMON [RFC 2819] andthe Token Ring RMON MIB [RFC 1513] and the RMON-2 MIB [RFC 2021].*/
    public final MediaIndependentStatsEnt mediaIndependentStats;

    /** High Capacity extensions for the etherStatsTable*/
    public final EtherStatsHighCapacityTableEnt etherStatsHighCapacityTable;

    /** High Capacity extensions for the etherHistoryTable*/
    public final EtherHistoryHighCapacityTableEnt etherHistoryHighCapacityTable;

    /** High Capacity Extensions for the hostTable*/
    public final HostHighCapacityTableEnt hostHighCapacityTable;

    /** High Capacity extensions for the hostTimeTable*/
    public final HostTimeHighCapacityTableEnt hostTimeHighCapacityTable;

    /** High Capacity Extensions for the hostTopNTable*/
    public final HostTopNHighCapacityTableEnt hostTopNHighCapacityTable;

    /** High Capacity Extensions for the matrixSDTable*/
    public final MatrixSDHighCapacityTableEnt matrixSDHighCapacityTable;

    /** High Capacity extensions for the matrixDSTable*/
    public final MatrixDSHighCapacityTableEnt matrixDSHighCapacityTable;

    /** High Capacity extensions for the captureBufferTable*/
    public final CaptureBufferHighCapacityTableEnt captureBufferHighCapacityTable;

    /** High Capacity extensions for the protocolDistStatsTable*/
    public final ProtocolDistStatsHighCapacityTableEnt protocolDistStatsHighCapacityTable;

    /** High Capacity extensions for the nlHostTable.*/
    public final NlHostHighCapacityTableEnt nlHostHighCapacityTable;

    /** High Capacity extensions for the nlMatrixTable*/
    public final NlMatrixSDHighCapacityTableEnt nlMatrixSDHighCapacityTable;

    /** High Capacity extensions for the nlMatrixDSTable*/
    public final NlMatrixDSHighCapacityTableEnt nlMatrixDSHighCapacityTable;

    /** High Capacity extensions for the nlMatrixTopNTable*/
    public final NlMatrixTopNHighCapacityTableEnt nlMatrixTopNHighCapacityTable;

    /** High Capacity extensions for the alHostTable*/
    public final AlHostHighCapacityTableEnt alHostHighCapacityTable;

    /** High Capacity extensions for the alMatrixSDTable*/
    public final AlMatrixSDHighCapacityTableEnt alMatrixSDHighCapacityTable;

    /** High Capacity extensions for the alMatrixDSTable*/
    public final AlMatrixDSHighCapacityTableEnt alMatrixDSHighCapacityTable;

    public final AlMatrixTopNHighCapacityTableEnt alMatrixTopNHighCapacityTable;

    public final UsrHistoryHighCapacityTableEnt usrHistoryHighCapacityTable;

    /** High Capacity RMON Probe Capabilities*/
    public final HcRMONCapabilitiesEnt hcRMONCapabilities;

    /** Conformance Macros*/
    public final HcRmonMIBCompliancesEnt hcRmonMIBCompliances;

    public final HcRmonMIBGroupsEnt hcRmonMIBGroups;

    private HCRMONMIBDef()
    {
        super("HC-RMON-MIB");
        this.hcRMON = new HcRMONEnt(this, null);
        this.mediaIndependentStats = new MediaIndependentStatsEnt(this, null);
        this.etherStatsHighCapacityTable = new EtherStatsHighCapacityTableEnt(this, null);
        this.etherHistoryHighCapacityTable = new EtherHistoryHighCapacityTableEnt(this, null);
        this.hostHighCapacityTable = new HostHighCapacityTableEnt(this, null);
        this.hostTimeHighCapacityTable = new HostTimeHighCapacityTableEnt(this, null);
        this.hostTopNHighCapacityTable = new HostTopNHighCapacityTableEnt(this, null);
        this.matrixSDHighCapacityTable = new MatrixSDHighCapacityTableEnt(this, null);
        this.matrixDSHighCapacityTable = new MatrixDSHighCapacityTableEnt(this, null);
        this.captureBufferHighCapacityTable = new CaptureBufferHighCapacityTableEnt(this, null);
        this.protocolDistStatsHighCapacityTable = new ProtocolDistStatsHighCapacityTableEnt(this, null);
        this.nlHostHighCapacityTable = new NlHostHighCapacityTableEnt(this, null);
        this.nlMatrixSDHighCapacityTable = new NlMatrixSDHighCapacityTableEnt(this, null);
        this.nlMatrixDSHighCapacityTable = new NlMatrixDSHighCapacityTableEnt(this, null);
        this.nlMatrixTopNHighCapacityTable = new NlMatrixTopNHighCapacityTableEnt(this, null);
        this.alHostHighCapacityTable = new AlHostHighCapacityTableEnt(this, null);
        this.alMatrixSDHighCapacityTable = new AlMatrixSDHighCapacityTableEnt(this, null);
        this.alMatrixDSHighCapacityTable = new AlMatrixDSHighCapacityTableEnt(this, null);
        this.alMatrixTopNHighCapacityTable = new AlMatrixTopNHighCapacityTableEnt(this, null);
        this.usrHistoryHighCapacityTable = new UsrHistoryHighCapacityTableEnt(this, null);
        this.hcRMONCapabilities = new HcRMONCapabilitiesEnt(this, null);
        this.hcRmonMIBCompliances = new HcRmonMIBCompliancesEnt(this, null);
        this.hcRmonMIBGroups = new HcRmonMIBGroupsEnt(this, null);
        this.entries = new MIBEntry<?>[] {
            this.hcRMON,
            this.mediaIndependentStats,
            this.etherStatsHighCapacityTable,
            this.etherHistoryHighCapacityTable,
            this.hostHighCapacityTable,
            this.hostTimeHighCapacityTable,
            this.hostTopNHighCapacityTable,
            this.matrixSDHighCapacityTable,
            this.matrixDSHighCapacityTable,
            this.captureBufferHighCapacityTable,
            this.protocolDistStatsHighCapacityTable,
            this.nlHostHighCapacityTable,
            this.nlMatrixSDHighCapacityTable,
            this.nlMatrixDSHighCapacityTable,
            this.nlMatrixTopNHighCapacityTable,
            this.alHostHighCapacityTable,
            this.alMatrixSDHighCapacityTable,
            this.alMatrixDSHighCapacityTable,
            this.alMatrixTopNHighCapacityTable,
            this.usrHistoryHighCapacityTable,
            this.hcRMONCapabilities,
            this.hcRmonMIBCompliances,
            this.hcRmonMIBGroups
        };
    }

    public static final class HcRMONEnt extends MIBEntry<HCRMONMIBDef>
    {
        private HcRMONEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hcRMON", "1.3.6.1.2.1.16.20.5", false, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class MediaIndependentStatsEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final MediaIndependentTableEnt mediaIndependentTable;

        private MediaIndependentStatsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "mediaIndependentStats", "1.3.6.1.2.1.16.21", false, false, false, false);
            this.mediaIndependentTable = new MediaIndependentTableEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mediaIndependentTable
            };
        }
        public static final class MediaIndependentTableEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final MediaIndependentEntryEnt mediaIndependentEntry;

            private MediaIndependentTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "mediaIndependentTable", "1.3.6.1.2.1.16.21.1", false, true, false, false);
                this.mediaIndependentEntry = new MediaIndependentEntryEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.mediaIndependentEntry
                };
            }
            public static final class MediaIndependentEntryEnt extends MIBEntry<HCRMONMIBDef>
            {
                public final MediaIndependentIndexEnt mediaIndependentIndex;

                public final MediaIndependentDataSourceEnt mediaIndependentDataSource;

                public final MediaIndependentDropEventsEnt mediaIndependentDropEvents;

                public final MediaIndependentDroppedFramesEnt mediaIndependentDroppedFrames;

                public final MediaIndependentInPktsEnt mediaIndependentInPkts;

                public final MediaIndependentInOverflowPktsEnt mediaIndependentInOverflowPkts;

                public final MediaIndependentInHighCapacityPktsEnt mediaIndependentInHighCapacityPkts;

                public final MediaIndependentOutPktsEnt mediaIndependentOutPkts;

                public final MediaIndependentOutOverflowPktsEnt mediaIndependentOutOverflowPkts;

                public final MediaIndependentOutHighCapacityPktsEnt mediaIndependentOutHighCapacityPkts;

                public final MediaIndependentInOctetsEnt mediaIndependentInOctets;

                public final MediaIndependentInOverflowOctetsEnt mediaIndependentInOverflowOctets;

                public final MediaIndependentInHighCapacityOctetsEnt mediaIndependentInHighCapacityOctets;

                public final MediaIndependentOutOctetsEnt mediaIndependentOutOctets;

                public final MediaIndependentOutOverflowOctetsEnt mediaIndependentOutOverflowOctets;

                public final MediaIndependentOutHighCapacityOctetsEnt mediaIndependentOutHighCapacityOctets;

                public final MediaIndependentInNUCastPktsEnt mediaIndependentInNUCastPkts;

                public final MediaIndependentInNUCastOverflowPktsEnt mediaIndependentInNUCastOverflowPkts;

                public final MediaIndependentInNUCastHighCapacityPktsEnt mediaIndependentInNUCastHighCapacityPkts;

                public final MediaIndependentOutNUCastPktsEnt mediaIndependentOutNUCastPkts;

                public final MediaIndependentOutNUCastOverflowPktsEnt mediaIndependentOutNUCastOverflowPkts;

                public final MediaIndependentOutNUCastHighCapacityPktsEnt mediaIndependentOutNUCastHighCapacityPkts;

                public final MediaIndependentInErrorsEnt mediaIndependentInErrors;

                public final MediaIndependentOutErrorsEnt mediaIndependentOutErrors;

                public final MediaIndependentInputSpeedEnt mediaIndependentInputSpeed;

                public final MediaIndependentOutputSpeedEnt mediaIndependentOutputSpeed;

                public final MediaIndependentDuplexModeEnt mediaIndependentDuplexMode;

                public final MediaIndependentDuplexChangesEnt mediaIndependentDuplexChanges;

                public final MediaIndependentDuplexLastChangeEnt mediaIndependentDuplexLastChange;

                public final MediaIndependentOwnerEnt mediaIndependentOwner;

                public final MediaIndependentStatusEnt mediaIndependentStatus;

                private MediaIndependentEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "mediaIndependentEntry", "1.3.6.1.2.1.16.21.1.1", false, false, false, true);
                    this.mediaIndependentIndex = new MediaIndependentIndexEnt(mib, this);
                    this.mediaIndependentDataSource = new MediaIndependentDataSourceEnt(mib, this);
                    this.mediaIndependentDropEvents = new MediaIndependentDropEventsEnt(mib, this);
                    this.mediaIndependentDroppedFrames = new MediaIndependentDroppedFramesEnt(mib, this);
                    this.mediaIndependentInPkts = new MediaIndependentInPktsEnt(mib, this);
                    this.mediaIndependentInOverflowPkts = new MediaIndependentInOverflowPktsEnt(mib, this);
                    this.mediaIndependentInHighCapacityPkts = new MediaIndependentInHighCapacityPktsEnt(mib, this);
                    this.mediaIndependentOutPkts = new MediaIndependentOutPktsEnt(mib, this);
                    this.mediaIndependentOutOverflowPkts = new MediaIndependentOutOverflowPktsEnt(mib, this);
                    this.mediaIndependentOutHighCapacityPkts = new MediaIndependentOutHighCapacityPktsEnt(mib, this);
                    this.mediaIndependentInOctets = new MediaIndependentInOctetsEnt(mib, this);
                    this.mediaIndependentInOverflowOctets = new MediaIndependentInOverflowOctetsEnt(mib, this);
                    this.mediaIndependentInHighCapacityOctets = new MediaIndependentInHighCapacityOctetsEnt(mib, this);
                    this.mediaIndependentOutOctets = new MediaIndependentOutOctetsEnt(mib, this);
                    this.mediaIndependentOutOverflowOctets = new MediaIndependentOutOverflowOctetsEnt(mib, this);
                    this.mediaIndependentOutHighCapacityOctets = new MediaIndependentOutHighCapacityOctetsEnt(mib, this);
                    this.mediaIndependentInNUCastPkts = new MediaIndependentInNUCastPktsEnt(mib, this);
                    this.mediaIndependentInNUCastOverflowPkts = new MediaIndependentInNUCastOverflowPktsEnt(mib, this);
                    this.mediaIndependentInNUCastHighCapacityPkts = new MediaIndependentInNUCastHighCapacityPktsEnt(mib, this);
                    this.mediaIndependentOutNUCastPkts = new MediaIndependentOutNUCastPktsEnt(mib, this);
                    this.mediaIndependentOutNUCastOverflowPkts = new MediaIndependentOutNUCastOverflowPktsEnt(mib, this);
                    this.mediaIndependentOutNUCastHighCapacityPkts = new MediaIndependentOutNUCastHighCapacityPktsEnt(mib, this);
                    this.mediaIndependentInErrors = new MediaIndependentInErrorsEnt(mib, this);
                    this.mediaIndependentOutErrors = new MediaIndependentOutErrorsEnt(mib, this);
                    this.mediaIndependentInputSpeed = new MediaIndependentInputSpeedEnt(mib, this);
                    this.mediaIndependentOutputSpeed = new MediaIndependentOutputSpeedEnt(mib, this);
                    this.mediaIndependentDuplexMode = new MediaIndependentDuplexModeEnt(mib, this);
                    this.mediaIndependentDuplexChanges = new MediaIndependentDuplexChangesEnt(mib, this);
                    this.mediaIndependentDuplexLastChange = new MediaIndependentDuplexLastChangeEnt(mib, this);
                    this.mediaIndependentOwner = new MediaIndependentOwnerEnt(mib, this);
                    this.mediaIndependentStatus = new MediaIndependentStatusEnt(mib, this);
                    this.entries = new MIBEntry<?>[] {
                        this.mediaIndependentIndex,
                        this.mediaIndependentDataSource,
                        this.mediaIndependentDropEvents,
                        this.mediaIndependentDroppedFrames,
                        this.mediaIndependentInPkts,
                        this.mediaIndependentInOverflowPkts,
                        this.mediaIndependentInHighCapacityPkts,
                        this.mediaIndependentOutPkts,
                        this.mediaIndependentOutOverflowPkts,
                        this.mediaIndependentOutHighCapacityPkts,
                        this.mediaIndependentInOctets,
                        this.mediaIndependentInOverflowOctets,
                        this.mediaIndependentInHighCapacityOctets,
                        this.mediaIndependentOutOctets,
                        this.mediaIndependentOutOverflowOctets,
                        this.mediaIndependentOutHighCapacityOctets,
                        this.mediaIndependentInNUCastPkts,
                        this.mediaIndependentInNUCastOverflowPkts,
                        this.mediaIndependentInNUCastHighCapacityPkts,
                        this.mediaIndependentOutNUCastPkts,
                        this.mediaIndependentOutNUCastOverflowPkts,
                        this.mediaIndependentOutNUCastHighCapacityPkts,
                        this.mediaIndependentInErrors,
                        this.mediaIndependentOutErrors,
                        this.mediaIndependentInputSpeed,
                        this.mediaIndependentOutputSpeed,
                        this.mediaIndependentDuplexMode,
                        this.mediaIndependentDuplexChanges,
                        this.mediaIndependentDuplexLastChange,
                        this.mediaIndependentOwner,
                        this.mediaIndependentStatus
                    };
                }
                public static final class MediaIndependentIndexEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentIndexEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentIndex", "1.3.6.1.2.1.16.21.1.1.1", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentDataSourceEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentDataSourceEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentDataSource", "1.3.6.1.2.1.16.21.1.1.2", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentDropEventsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentDropEventsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentDropEvents", "1.3.6.1.2.1.16.21.1.1.3", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentDroppedFramesEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentDroppedFramesEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentDroppedFrames", "1.3.6.1.2.1.16.21.1.1.4", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInPkts", "1.3.6.1.2.1.16.21.1.1.5", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInOverflowPkts", "1.3.6.1.2.1.16.21.1.1.6", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInHighCapacityPkts", "1.3.6.1.2.1.16.21.1.1.7", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutPkts", "1.3.6.1.2.1.16.21.1.1.8", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutOverflowPkts", "1.3.6.1.2.1.16.21.1.1.9", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutHighCapacityPkts", "1.3.6.1.2.1.16.21.1.1.10", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInOctetsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInOctets", "1.3.6.1.2.1.16.21.1.1.11", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInOverflowOctets", "1.3.6.1.2.1.16.21.1.1.12", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInHighCapacityOctets", "1.3.6.1.2.1.16.21.1.1.13", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutOctetsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutOctets", "1.3.6.1.2.1.16.21.1.1.14", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutOverflowOctets", "1.3.6.1.2.1.16.21.1.1.15", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutHighCapacityOctets", "1.3.6.1.2.1.16.21.1.1.16", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInNUCastPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInNUCastPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInNUCastPkts", "1.3.6.1.2.1.16.21.1.1.17", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInNUCastOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInNUCastOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInNUCastOverflowPkts", "1.3.6.1.2.1.16.21.1.1.18", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInNUCastHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInNUCastHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInNUCastHighCapacityPkts", "1.3.6.1.2.1.16.21.1.1.19", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutNUCastPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutNUCastPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutNUCastPkts", "1.3.6.1.2.1.16.21.1.1.20", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutNUCastOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutNUCastOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutNUCastOverflowPkts", "1.3.6.1.2.1.16.21.1.1.21", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutNUCastHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutNUCastHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutNUCastHighCapacityPkts", "1.3.6.1.2.1.16.21.1.1.22", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInErrorsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInErrorsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInErrors", "1.3.6.1.2.1.16.21.1.1.23", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutErrorsEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutErrorsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutErrors", "1.3.6.1.2.1.16.21.1.1.24", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentInputSpeedEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentInputSpeedEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentInputSpeed", "1.3.6.1.2.1.16.21.1.1.25", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOutputSpeedEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOutputSpeedEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOutputSpeed", "1.3.6.1.2.1.16.21.1.1.26", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentDuplexModeEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentDuplexModeEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentDuplexMode", "1.3.6.1.2.1.16.21.1.1.27", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentDuplexChangesEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentDuplexChangesEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentDuplexChanges", "1.3.6.1.2.1.16.21.1.1.28", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentDuplexLastChangeEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentDuplexLastChangeEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentDuplexLastChange", "1.3.6.1.2.1.16.21.1.1.29", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentOwnerEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentOwnerEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentOwner", "1.3.6.1.2.1.16.21.1.1.30", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

                public static final class MediaIndependentStatusEnt extends MIBEntry<HCRMONMIBDef>
                {
                    private MediaIndependentStatusEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                    {
                        super(mib, parent, "mediaIndependentStatus", "1.3.6.1.2.1.16.21.1.1.31", false, false, true, false);
                        this.entries = new MIBEntry<?>[] {

                        };
                    }
                }

            }

        }

    }

    public static final class EtherStatsHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final EtherStatsHighCapacityEntryEnt etherStatsHighCapacityEntry;

        private EtherStatsHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "etherStatsHighCapacityTable", "1.3.6.1.2.1.16.1.7", false, true, false, false);
            this.etherStatsHighCapacityEntry = new EtherStatsHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.etherStatsHighCapacityEntry
            };
        }
        public static final class EtherStatsHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final EtherStatsHighCapacityOverflowPktsEnt etherStatsHighCapacityOverflowPkts;

            public final EtherStatsHighCapacityPktsEnt etherStatsHighCapacityPkts;

            public final EtherStatsHighCapacityOverflowOctetsEnt etherStatsHighCapacityOverflowOctets;

            public final EtherStatsHighCapacityOctetsEnt etherStatsHighCapacityOctets;

            public final EtherStatsHighCapacityOverflowPkts64OctetsEnt etherStatsHighCapacityOverflowPkts64Octets;

            public final EtherStatsHighCapacityPkts64OctetsEnt etherStatsHighCapacityPkts64Octets;

            public final EtherStatsHighCapacityOverflowPkts65to127OctetsEnt etherStatsHighCapacityOverflowPkts65to127Octets;

            public final EtherStatsHighCapacityPkts65to127OctetsEnt etherStatsHighCapacityPkts65to127Octets;

            public final EtherStatsHighCapacityOverflowPkts128to255OctetsEnt etherStatsHighCapacityOverflowPkts128to255Octets;

            public final EtherStatsHighCapacityPkts128to255OctetsEnt etherStatsHighCapacityPkts128to255Octets;

            public final EtherStatsHighCapacityOverflowPkts256to511OctetsEnt etherStatsHighCapacityOverflowPkts256to511Octets;

            public final EtherStatsHighCapacityPkts256to511OctetsEnt etherStatsHighCapacityPkts256to511Octets;

            public final EtherStatsHighCapacityOverflowPkts512to1023OctetsEnt etherStatsHighCapacityOverflowPkts512to1023Octets;

            public final EtherStatsHighCapacityPkts512to1023OctetsEnt etherStatsHighCapacityPkts512to1023Octets;

            public final EtherStatsHighCapacityOverflowPkts1024to1518OctetsEnt etherStatsHighCapacityOverflowPkts1024to1518Octets;

            public final EtherStatsHighCapacityPkts1024to1518OctetsEnt etherStatsHighCapacityPkts1024to1518Octets;

            private EtherStatsHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "etherStatsHighCapacityEntry", "1.3.6.1.2.1.16.1.7.1", false, false, false, true);
                this.etherStatsHighCapacityOverflowPkts = new EtherStatsHighCapacityOverflowPktsEnt(mib, this);
                this.etherStatsHighCapacityPkts = new EtherStatsHighCapacityPktsEnt(mib, this);
                this.etherStatsHighCapacityOverflowOctets = new EtherStatsHighCapacityOverflowOctetsEnt(mib, this);
                this.etherStatsHighCapacityOctets = new EtherStatsHighCapacityOctetsEnt(mib, this);
                this.etherStatsHighCapacityOverflowPkts64Octets = new EtherStatsHighCapacityOverflowPkts64OctetsEnt(mib, this);
                this.etherStatsHighCapacityPkts64Octets = new EtherStatsHighCapacityPkts64OctetsEnt(mib, this);
                this.etherStatsHighCapacityOverflowPkts65to127Octets = new EtherStatsHighCapacityOverflowPkts65to127OctetsEnt(mib, this);
                this.etherStatsHighCapacityPkts65to127Octets = new EtherStatsHighCapacityPkts65to127OctetsEnt(mib, this);
                this.etherStatsHighCapacityOverflowPkts128to255Octets = new EtherStatsHighCapacityOverflowPkts128to255OctetsEnt(mib, this);
                this.etherStatsHighCapacityPkts128to255Octets = new EtherStatsHighCapacityPkts128to255OctetsEnt(mib, this);
                this.etherStatsHighCapacityOverflowPkts256to511Octets = new EtherStatsHighCapacityOverflowPkts256to511OctetsEnt(mib, this);
                this.etherStatsHighCapacityPkts256to511Octets = new EtherStatsHighCapacityPkts256to511OctetsEnt(mib, this);
                this.etherStatsHighCapacityOverflowPkts512to1023Octets = new EtherStatsHighCapacityOverflowPkts512to1023OctetsEnt(mib, this);
                this.etherStatsHighCapacityPkts512to1023Octets = new EtherStatsHighCapacityPkts512to1023OctetsEnt(mib, this);
                this.etherStatsHighCapacityOverflowPkts1024to1518Octets = new EtherStatsHighCapacityOverflowPkts1024to1518OctetsEnt(mib, this);
                this.etherStatsHighCapacityPkts1024to1518Octets = new EtherStatsHighCapacityPkts1024to1518OctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherStatsHighCapacityOverflowPkts,
                    this.etherStatsHighCapacityPkts,
                    this.etherStatsHighCapacityOverflowOctets,
                    this.etherStatsHighCapacityOctets,
                    this.etherStatsHighCapacityOverflowPkts64Octets,
                    this.etherStatsHighCapacityPkts64Octets,
                    this.etherStatsHighCapacityOverflowPkts65to127Octets,
                    this.etherStatsHighCapacityPkts65to127Octets,
                    this.etherStatsHighCapacityOverflowPkts128to255Octets,
                    this.etherStatsHighCapacityPkts128to255Octets,
                    this.etherStatsHighCapacityOverflowPkts256to511Octets,
                    this.etherStatsHighCapacityPkts256to511Octets,
                    this.etherStatsHighCapacityOverflowPkts512to1023Octets,
                    this.etherStatsHighCapacityPkts512to1023Octets,
                    this.etherStatsHighCapacityOverflowPkts1024to1518Octets,
                    this.etherStatsHighCapacityPkts1024to1518Octets
                };
            }
            public static final class EtherStatsHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts", "1.3.6.1.2.1.16.1.7.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts", "1.3.6.1.2.1.16.1.7.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowOctets", "1.3.6.1.2.1.16.1.7.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOctets", "1.3.6.1.2.1.16.1.7.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowPkts64OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPkts64OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts64Octets", "1.3.6.1.2.1.16.1.7.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPkts64OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPkts64OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts64Octets", "1.3.6.1.2.1.16.1.7.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowPkts65to127OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPkts65to127OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts65to127Octets", "1.3.6.1.2.1.16.1.7.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPkts65to127OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPkts65to127OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts65to127Octets", "1.3.6.1.2.1.16.1.7.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowPkts128to255OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPkts128to255OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts128to255Octets", "1.3.6.1.2.1.16.1.7.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPkts128to255OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPkts128to255OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts128to255Octets", "1.3.6.1.2.1.16.1.7.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowPkts256to511OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPkts256to511OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts256to511Octets", "1.3.6.1.2.1.16.1.7.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPkts256to511OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPkts256to511OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts256to511Octets", "1.3.6.1.2.1.16.1.7.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowPkts512to1023OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPkts512to1023OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts512to1023Octets", "1.3.6.1.2.1.16.1.7.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPkts512to1023OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPkts512to1023OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts512to1023Octets", "1.3.6.1.2.1.16.1.7.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityOverflowPkts1024to1518OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityOverflowPkts1024to1518OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityOverflowPkts1024to1518Octets", "1.3.6.1.2.1.16.1.7.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherStatsHighCapacityPkts1024to1518OctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherStatsHighCapacityPkts1024to1518OctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherStatsHighCapacityPkts1024to1518Octets", "1.3.6.1.2.1.16.1.7.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class EtherHistoryHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final EtherHistoryHighCapacityEntryEnt etherHistoryHighCapacityEntry;

        private EtherHistoryHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "etherHistoryHighCapacityTable", "1.3.6.1.2.1.16.2.6", false, true, false, false);
            this.etherHistoryHighCapacityEntry = new EtherHistoryHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.etherHistoryHighCapacityEntry
            };
        }
        public static final class EtherHistoryHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final EtherHistoryHighCapacityOverflowPktsEnt etherHistoryHighCapacityOverflowPkts;

            public final EtherHistoryHighCapacityPktsEnt etherHistoryHighCapacityPkts;

            public final EtherHistoryHighCapacityOverflowOctetsEnt etherHistoryHighCapacityOverflowOctets;

            public final EtherHistoryHighCapacityOctetsEnt etherHistoryHighCapacityOctets;

            private EtherHistoryHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "etherHistoryHighCapacityEntry", "1.3.6.1.2.1.16.2.6.1", false, false, false, true);
                this.etherHistoryHighCapacityOverflowPkts = new EtherHistoryHighCapacityOverflowPktsEnt(mib, this);
                this.etherHistoryHighCapacityPkts = new EtherHistoryHighCapacityPktsEnt(mib, this);
                this.etherHistoryHighCapacityOverflowOctets = new EtherHistoryHighCapacityOverflowOctetsEnt(mib, this);
                this.etherHistoryHighCapacityOctets = new EtherHistoryHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.etherHistoryHighCapacityOverflowPkts,
                    this.etherHistoryHighCapacityPkts,
                    this.etherHistoryHighCapacityOverflowOctets,
                    this.etherHistoryHighCapacityOctets
                };
            }
            public static final class EtherHistoryHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherHistoryHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherHistoryHighCapacityOverflowPkts", "1.3.6.1.2.1.16.2.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherHistoryHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherHistoryHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherHistoryHighCapacityPkts", "1.3.6.1.2.1.16.2.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherHistoryHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherHistoryHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherHistoryHighCapacityOverflowOctets", "1.3.6.1.2.1.16.2.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class EtherHistoryHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private EtherHistoryHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "etherHistoryHighCapacityOctets", "1.3.6.1.2.1.16.2.6.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HostHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final HostHighCapacityEntryEnt hostHighCapacityEntry;

        private HostHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hostHighCapacityTable", "1.3.6.1.2.1.16.4.5", false, true, false, false);
            this.hostHighCapacityEntry = new HostHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hostHighCapacityEntry
            };
        }
        public static final class HostHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final HostHighCapacityInOverflowPktsEnt hostHighCapacityInOverflowPkts;

            public final HostHighCapacityInPktsEnt hostHighCapacityInPkts;

            public final HostHighCapacityOutOverflowPktsEnt hostHighCapacityOutOverflowPkts;

            public final HostHighCapacityOutPktsEnt hostHighCapacityOutPkts;

            public final HostHighCapacityInOverflowOctetsEnt hostHighCapacityInOverflowOctets;

            public final HostHighCapacityInOctetsEnt hostHighCapacityInOctets;

            public final HostHighCapacityOutOverflowOctetsEnt hostHighCapacityOutOverflowOctets;

            public final HostHighCapacityOutOctetsEnt hostHighCapacityOutOctets;

            private HostHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hostHighCapacityEntry", "1.3.6.1.2.1.16.4.5.1", false, false, false, true);
                this.hostHighCapacityInOverflowPkts = new HostHighCapacityInOverflowPktsEnt(mib, this);
                this.hostHighCapacityInPkts = new HostHighCapacityInPktsEnt(mib, this);
                this.hostHighCapacityOutOverflowPkts = new HostHighCapacityOutOverflowPktsEnt(mib, this);
                this.hostHighCapacityOutPkts = new HostHighCapacityOutPktsEnt(mib, this);
                this.hostHighCapacityInOverflowOctets = new HostHighCapacityInOverflowOctetsEnt(mib, this);
                this.hostHighCapacityInOctets = new HostHighCapacityInOctetsEnt(mib, this);
                this.hostHighCapacityOutOverflowOctets = new HostHighCapacityOutOverflowOctetsEnt(mib, this);
                this.hostHighCapacityOutOctets = new HostHighCapacityOutOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostHighCapacityInOverflowPkts,
                    this.hostHighCapacityInPkts,
                    this.hostHighCapacityOutOverflowPkts,
                    this.hostHighCapacityOutPkts,
                    this.hostHighCapacityInOverflowOctets,
                    this.hostHighCapacityInOctets,
                    this.hostHighCapacityOutOverflowOctets,
                    this.hostHighCapacityOutOctets
                };
            }
            public static final class HostHighCapacityInOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityInOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityInOverflowPkts", "1.3.6.1.2.1.16.4.5.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityInPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityInPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityInPkts", "1.3.6.1.2.1.16.4.5.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityOutOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityOutOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityOutOverflowPkts", "1.3.6.1.2.1.16.4.5.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityOutPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityOutPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityOutPkts", "1.3.6.1.2.1.16.4.5.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityInOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityInOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityInOverflowOctets", "1.3.6.1.2.1.16.4.5.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityInOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityInOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityInOctets", "1.3.6.1.2.1.16.4.5.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityOutOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityOutOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityOutOverflowOctets", "1.3.6.1.2.1.16.4.5.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostHighCapacityOutOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostHighCapacityOutOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostHighCapacityOutOctets", "1.3.6.1.2.1.16.4.5.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HostTimeHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final HostTimeHighCapacityEntryEnt hostTimeHighCapacityEntry;

        private HostTimeHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hostTimeHighCapacityTable", "1.3.6.1.2.1.16.4.6", false, true, false, false);
            this.hostTimeHighCapacityEntry = new HostTimeHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hostTimeHighCapacityEntry
            };
        }
        public static final class HostTimeHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final HostTimeHighCapacityInOverflowPktsEnt hostTimeHighCapacityInOverflowPkts;

            public final HostTimeHighCapacityInPktsEnt hostTimeHighCapacityInPkts;

            public final HostTimeHighCapacityOutOverflowPktsEnt hostTimeHighCapacityOutOverflowPkts;

            public final HostTimeHighCapacityOutPktsEnt hostTimeHighCapacityOutPkts;

            public final HostTimeHighCapacityInOverflowOctetsEnt hostTimeHighCapacityInOverflowOctets;

            public final HostTimeHighCapacityInOctetsEnt hostTimeHighCapacityInOctets;

            public final HostTimeHighCapacityOutOverflowOctetsEnt hostTimeHighCapacityOutOverflowOctets;

            public final HostTimeHighCapacityOutOctetsEnt hostTimeHighCapacityOutOctets;

            private HostTimeHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hostTimeHighCapacityEntry", "1.3.6.1.2.1.16.4.6.1", false, false, false, true);
                this.hostTimeHighCapacityInOverflowPkts = new HostTimeHighCapacityInOverflowPktsEnt(mib, this);
                this.hostTimeHighCapacityInPkts = new HostTimeHighCapacityInPktsEnt(mib, this);
                this.hostTimeHighCapacityOutOverflowPkts = new HostTimeHighCapacityOutOverflowPktsEnt(mib, this);
                this.hostTimeHighCapacityOutPkts = new HostTimeHighCapacityOutPktsEnt(mib, this);
                this.hostTimeHighCapacityInOverflowOctets = new HostTimeHighCapacityInOverflowOctetsEnt(mib, this);
                this.hostTimeHighCapacityInOctets = new HostTimeHighCapacityInOctetsEnt(mib, this);
                this.hostTimeHighCapacityOutOverflowOctets = new HostTimeHighCapacityOutOverflowOctetsEnt(mib, this);
                this.hostTimeHighCapacityOutOctets = new HostTimeHighCapacityOutOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostTimeHighCapacityInOverflowPkts,
                    this.hostTimeHighCapacityInPkts,
                    this.hostTimeHighCapacityOutOverflowPkts,
                    this.hostTimeHighCapacityOutPkts,
                    this.hostTimeHighCapacityInOverflowOctets,
                    this.hostTimeHighCapacityInOctets,
                    this.hostTimeHighCapacityOutOverflowOctets,
                    this.hostTimeHighCapacityOutOctets
                };
            }
            public static final class HostTimeHighCapacityInOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityInOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityInOverflowPkts", "1.3.6.1.2.1.16.4.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityInPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityInPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityInPkts", "1.3.6.1.2.1.16.4.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityOutOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityOutOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityOutOverflowPkts", "1.3.6.1.2.1.16.4.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityOutPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityOutPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityOutPkts", "1.3.6.1.2.1.16.4.6.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityInOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityInOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityInOverflowOctets", "1.3.6.1.2.1.16.4.6.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityInOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityInOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityInOctets", "1.3.6.1.2.1.16.4.6.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityOutOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityOutOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityOutOverflowOctets", "1.3.6.1.2.1.16.4.6.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTimeHighCapacityOutOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTimeHighCapacityOutOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTimeHighCapacityOutOctets", "1.3.6.1.2.1.16.4.6.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HostTopNHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final HostTopNHighCapacityEntryEnt hostTopNHighCapacityEntry;

        private HostTopNHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hostTopNHighCapacityTable", "1.3.6.1.2.1.16.5.3", false, true, false, false);
            this.hostTopNHighCapacityEntry = new HostTopNHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hostTopNHighCapacityEntry
            };
        }
        public static final class HostTopNHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final HostTopNHighCapacityAddressEnt hostTopNHighCapacityAddress;

            public final HostTopNHighCapacityBaseRateEnt hostTopNHighCapacityBaseRate;

            public final HostTopNHighCapacityOverflowRateEnt hostTopNHighCapacityOverflowRate;

            public final HostTopNHighCapacityRateEnt hostTopNHighCapacityRate;

            private HostTopNHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hostTopNHighCapacityEntry", "1.3.6.1.2.1.16.5.3.1", false, false, false, true);
                this.hostTopNHighCapacityAddress = new HostTopNHighCapacityAddressEnt(mib, this);
                this.hostTopNHighCapacityBaseRate = new HostTopNHighCapacityBaseRateEnt(mib, this);
                this.hostTopNHighCapacityOverflowRate = new HostTopNHighCapacityOverflowRateEnt(mib, this);
                this.hostTopNHighCapacityRate = new HostTopNHighCapacityRateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.hostTopNHighCapacityAddress,
                    this.hostTopNHighCapacityBaseRate,
                    this.hostTopNHighCapacityOverflowRate,
                    this.hostTopNHighCapacityRate
                };
            }
            public static final class HostTopNHighCapacityAddressEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTopNHighCapacityAddressEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTopNHighCapacityAddress", "1.3.6.1.2.1.16.5.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTopNHighCapacityBaseRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTopNHighCapacityBaseRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTopNHighCapacityBaseRate", "1.3.6.1.2.1.16.5.3.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTopNHighCapacityOverflowRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTopNHighCapacityOverflowRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTopNHighCapacityOverflowRate", "1.3.6.1.2.1.16.5.3.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class HostTopNHighCapacityRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private HostTopNHighCapacityRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "hostTopNHighCapacityRate", "1.3.6.1.2.1.16.5.3.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class MatrixSDHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final MatrixSDHighCapacityEntryEnt matrixSDHighCapacityEntry;

        private MatrixSDHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "matrixSDHighCapacityTable", "1.3.6.1.2.1.16.6.5", false, true, false, false);
            this.matrixSDHighCapacityEntry = new MatrixSDHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.matrixSDHighCapacityEntry
            };
        }
        public static final class MatrixSDHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final MatrixSDHighCapacityOverflowPktsEnt matrixSDHighCapacityOverflowPkts;

            public final MatrixSDHighCapacityPktsEnt matrixSDHighCapacityPkts;

            public final MatrixSDHighCapacityOverflowOctetsEnt matrixSDHighCapacityOverflowOctets;

            public final MatrixSDHighCapacityOctetsEnt matrixSDHighCapacityOctets;

            private MatrixSDHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "matrixSDHighCapacityEntry", "1.3.6.1.2.1.16.6.5.1", false, false, false, true);
                this.matrixSDHighCapacityOverflowPkts = new MatrixSDHighCapacityOverflowPktsEnt(mib, this);
                this.matrixSDHighCapacityPkts = new MatrixSDHighCapacityPktsEnt(mib, this);
                this.matrixSDHighCapacityOverflowOctets = new MatrixSDHighCapacityOverflowOctetsEnt(mib, this);
                this.matrixSDHighCapacityOctets = new MatrixSDHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.matrixSDHighCapacityOverflowPkts,
                    this.matrixSDHighCapacityPkts,
                    this.matrixSDHighCapacityOverflowOctets,
                    this.matrixSDHighCapacityOctets
                };
            }
            public static final class MatrixSDHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixSDHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixSDHighCapacityOverflowPkts", "1.3.6.1.2.1.16.6.5.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixSDHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixSDHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixSDHighCapacityPkts", "1.3.6.1.2.1.16.6.5.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixSDHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixSDHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixSDHighCapacityOverflowOctets", "1.3.6.1.2.1.16.6.5.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixSDHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixSDHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixSDHighCapacityOctets", "1.3.6.1.2.1.16.6.5.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class MatrixDSHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final MatrixDSHighCapacityEntryEnt matrixDSHighCapacityEntry;

        private MatrixDSHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "matrixDSHighCapacityTable", "1.3.6.1.2.1.16.6.6", false, true, false, false);
            this.matrixDSHighCapacityEntry = new MatrixDSHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.matrixDSHighCapacityEntry
            };
        }
        public static final class MatrixDSHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final MatrixDSHighCapacityOverflowPktsEnt matrixDSHighCapacityOverflowPkts;

            public final MatrixDSHighCapacityPktsEnt matrixDSHighCapacityPkts;

            public final MatrixDSHighCapacityOverflowOctetsEnt matrixDSHighCapacityOverflowOctets;

            public final MatrixDSHighCapacityOctetsEnt matrixDSHighCapacityOctets;

            private MatrixDSHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "matrixDSHighCapacityEntry", "1.3.6.1.2.1.16.6.6.1", false, false, false, true);
                this.matrixDSHighCapacityOverflowPkts = new MatrixDSHighCapacityOverflowPktsEnt(mib, this);
                this.matrixDSHighCapacityPkts = new MatrixDSHighCapacityPktsEnt(mib, this);
                this.matrixDSHighCapacityOverflowOctets = new MatrixDSHighCapacityOverflowOctetsEnt(mib, this);
                this.matrixDSHighCapacityOctets = new MatrixDSHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.matrixDSHighCapacityOverflowPkts,
                    this.matrixDSHighCapacityPkts,
                    this.matrixDSHighCapacityOverflowOctets,
                    this.matrixDSHighCapacityOctets
                };
            }
            public static final class MatrixDSHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixDSHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixDSHighCapacityOverflowPkts", "1.3.6.1.2.1.16.6.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixDSHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixDSHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixDSHighCapacityPkts", "1.3.6.1.2.1.16.6.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixDSHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixDSHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixDSHighCapacityOverflowOctets", "1.3.6.1.2.1.16.6.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class MatrixDSHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private MatrixDSHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "matrixDSHighCapacityOctets", "1.3.6.1.2.1.16.6.6.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class CaptureBufferHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final CaptureBufferHighCapacityEntryEnt captureBufferHighCapacityEntry;

        private CaptureBufferHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "captureBufferHighCapacityTable", "1.3.6.1.2.1.16.8.3", false, true, false, false);
            this.captureBufferHighCapacityEntry = new CaptureBufferHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.captureBufferHighCapacityEntry
            };
        }
        public static final class CaptureBufferHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final CaptureBufferPacketHighCapacityTimeEnt captureBufferPacketHighCapacityTime;

            private CaptureBufferHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "captureBufferHighCapacityEntry", "1.3.6.1.2.1.16.8.3.1", false, false, false, true);
                this.captureBufferPacketHighCapacityTime = new CaptureBufferPacketHighCapacityTimeEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.captureBufferPacketHighCapacityTime
                };
            }
            public static final class CaptureBufferPacketHighCapacityTimeEnt extends MIBEntry<HCRMONMIBDef>
            {
                private CaptureBufferPacketHighCapacityTimeEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "captureBufferPacketHighCapacityTime", "1.3.6.1.2.1.16.8.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class ProtocolDistStatsHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final ProtocolDistStatsHighCapacityEntryEnt protocolDistStatsHighCapacityEntry;

        private ProtocolDistStatsHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "protocolDistStatsHighCapacityTable", "1.3.6.1.2.1.16.12.3", false, true, false, false);
            this.protocolDistStatsHighCapacityEntry = new ProtocolDistStatsHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.protocolDistStatsHighCapacityEntry
            };
        }
        public static final class ProtocolDistStatsHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final ProtocolDistStatsHighCapacityOverflowPktsEnt protocolDistStatsHighCapacityOverflowPkts;

            public final ProtocolDistStatsHighCapacityPktsEnt protocolDistStatsHighCapacityPkts;

            public final ProtocolDistStatsHighCapacityOverflowOctetsEnt protocolDistStatsHighCapacityOverflowOctets;

            public final ProtocolDistStatsHighCapacityOctetsEnt protocolDistStatsHighCapacityOctets;

            private ProtocolDistStatsHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "protocolDistStatsHighCapacityEntry", "1.3.6.1.2.1.16.12.3.1", false, false, false, true);
                this.protocolDistStatsHighCapacityOverflowPkts = new ProtocolDistStatsHighCapacityOverflowPktsEnt(mib, this);
                this.protocolDistStatsHighCapacityPkts = new ProtocolDistStatsHighCapacityPktsEnt(mib, this);
                this.protocolDistStatsHighCapacityOverflowOctets = new ProtocolDistStatsHighCapacityOverflowOctetsEnt(mib, this);
                this.protocolDistStatsHighCapacityOctets = new ProtocolDistStatsHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.protocolDistStatsHighCapacityOverflowPkts,
                    this.protocolDistStatsHighCapacityPkts,
                    this.protocolDistStatsHighCapacityOverflowOctets,
                    this.protocolDistStatsHighCapacityOctets
                };
            }
            public static final class ProtocolDistStatsHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private ProtocolDistStatsHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "protocolDistStatsHighCapacityOverflowPkts", "1.3.6.1.2.1.16.12.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolDistStatsHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private ProtocolDistStatsHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "protocolDistStatsHighCapacityPkts", "1.3.6.1.2.1.16.12.3.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolDistStatsHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private ProtocolDistStatsHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "protocolDistStatsHighCapacityOverflowOctets", "1.3.6.1.2.1.16.12.3.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class ProtocolDistStatsHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private ProtocolDistStatsHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "protocolDistStatsHighCapacityOctets", "1.3.6.1.2.1.16.12.3.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class NlHostHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final NlHostHighCapacityEntryEnt nlHostHighCapacityEntry;

        private NlHostHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "nlHostHighCapacityTable", "1.3.6.1.2.1.16.14.3", false, true, false, false);
            this.nlHostHighCapacityEntry = new NlHostHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.nlHostHighCapacityEntry
            };
        }
        public static final class NlHostHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final NlHostHighCapacityInOverflowPktsEnt nlHostHighCapacityInOverflowPkts;

            public final NlHostHighCapacityInPktsEnt nlHostHighCapacityInPkts;

            public final NlHostHighCapacityOutOverflowPktsEnt nlHostHighCapacityOutOverflowPkts;

            public final NlHostHighCapacityOutPktsEnt nlHostHighCapacityOutPkts;

            public final NlHostHighCapacityInOverflowOctetsEnt nlHostHighCapacityInOverflowOctets;

            public final NlHostHighCapacityInOctetsEnt nlHostHighCapacityInOctets;

            public final NlHostHighCapacityOutOverflowOctetsEnt nlHostHighCapacityOutOverflowOctets;

            public final NlHostHighCapacityOutOctetsEnt nlHostHighCapacityOutOctets;

            private NlHostHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlHostHighCapacityEntry", "1.3.6.1.2.1.16.14.3.1", false, false, false, true);
                this.nlHostHighCapacityInOverflowPkts = new NlHostHighCapacityInOverflowPktsEnt(mib, this);
                this.nlHostHighCapacityInPkts = new NlHostHighCapacityInPktsEnt(mib, this);
                this.nlHostHighCapacityOutOverflowPkts = new NlHostHighCapacityOutOverflowPktsEnt(mib, this);
                this.nlHostHighCapacityOutPkts = new NlHostHighCapacityOutPktsEnt(mib, this);
                this.nlHostHighCapacityInOverflowOctets = new NlHostHighCapacityInOverflowOctetsEnt(mib, this);
                this.nlHostHighCapacityInOctets = new NlHostHighCapacityInOctetsEnt(mib, this);
                this.nlHostHighCapacityOutOverflowOctets = new NlHostHighCapacityOutOverflowOctetsEnt(mib, this);
                this.nlHostHighCapacityOutOctets = new NlHostHighCapacityOutOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlHostHighCapacityInOverflowPkts,
                    this.nlHostHighCapacityInPkts,
                    this.nlHostHighCapacityOutOverflowPkts,
                    this.nlHostHighCapacityOutPkts,
                    this.nlHostHighCapacityInOverflowOctets,
                    this.nlHostHighCapacityInOctets,
                    this.nlHostHighCapacityOutOverflowOctets,
                    this.nlHostHighCapacityOutOctets
                };
            }
            public static final class NlHostHighCapacityInOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityInOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityInOverflowPkts", "1.3.6.1.2.1.16.14.3.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityInPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityInPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityInPkts", "1.3.6.1.2.1.16.14.3.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityOutOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityOutOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityOutOverflowPkts", "1.3.6.1.2.1.16.14.3.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityOutPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityOutPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityOutPkts", "1.3.6.1.2.1.16.14.3.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityInOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityInOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityInOverflowOctets", "1.3.6.1.2.1.16.14.3.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityInOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityInOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityInOctets", "1.3.6.1.2.1.16.14.3.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityOutOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityOutOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityOutOverflowOctets", "1.3.6.1.2.1.16.14.3.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlHostHighCapacityOutOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlHostHighCapacityOutOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlHostHighCapacityOutOctets", "1.3.6.1.2.1.16.14.3.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class NlMatrixSDHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final NlMatrixSDHighCapacityEntryEnt nlMatrixSDHighCapacityEntry;

        private NlMatrixSDHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "nlMatrixSDHighCapacityTable", "1.3.6.1.2.1.16.15.6", false, true, false, false);
            this.nlMatrixSDHighCapacityEntry = new NlMatrixSDHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.nlMatrixSDHighCapacityEntry
            };
        }
        public static final class NlMatrixSDHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final NlMatrixSDHighCapacityOverflowPktsEnt nlMatrixSDHighCapacityOverflowPkts;

            public final NlMatrixSDHighCapacityPktsEnt nlMatrixSDHighCapacityPkts;

            public final NlMatrixSDHighCapacityOverflowOctetsEnt nlMatrixSDHighCapacityOverflowOctets;

            public final NlMatrixSDHighCapacityOctetsEnt nlMatrixSDHighCapacityOctets;

            private NlMatrixSDHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlMatrixSDHighCapacityEntry", "1.3.6.1.2.1.16.15.6.1", false, false, false, true);
                this.nlMatrixSDHighCapacityOverflowPkts = new NlMatrixSDHighCapacityOverflowPktsEnt(mib, this);
                this.nlMatrixSDHighCapacityPkts = new NlMatrixSDHighCapacityPktsEnt(mib, this);
                this.nlMatrixSDHighCapacityOverflowOctets = new NlMatrixSDHighCapacityOverflowOctetsEnt(mib, this);
                this.nlMatrixSDHighCapacityOctets = new NlMatrixSDHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixSDHighCapacityOverflowPkts,
                    this.nlMatrixSDHighCapacityPkts,
                    this.nlMatrixSDHighCapacityOverflowOctets,
                    this.nlMatrixSDHighCapacityOctets
                };
            }
            public static final class NlMatrixSDHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixSDHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixSDHighCapacityOverflowPkts", "1.3.6.1.2.1.16.15.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixSDHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixSDHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixSDHighCapacityPkts", "1.3.6.1.2.1.16.15.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixSDHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixSDHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixSDHighCapacityOverflowOctets", "1.3.6.1.2.1.16.15.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixSDHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixSDHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixSDHighCapacityOctets", "1.3.6.1.2.1.16.15.6.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class NlMatrixDSHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final NlMatrixDSHighCapacityEntryEnt nlMatrixDSHighCapacityEntry;

        private NlMatrixDSHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "nlMatrixDSHighCapacityTable", "1.3.6.1.2.1.16.15.7", false, true, false, false);
            this.nlMatrixDSHighCapacityEntry = new NlMatrixDSHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.nlMatrixDSHighCapacityEntry
            };
        }
        public static final class NlMatrixDSHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final NlMatrixDSHighCapacityOverflowPktsEnt nlMatrixDSHighCapacityOverflowPkts;

            public final NlMatrixDSHighCapacityPktsEnt nlMatrixDSHighCapacityPkts;

            public final NlMatrixDSHighCapacityOverflowOctetsEnt nlMatrixDSHighCapacityOverflowOctets;

            public final NlMatrixDSHighCapacityOctetsEnt nlMatrixDSHighCapacityOctets;

            private NlMatrixDSHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlMatrixDSHighCapacityEntry", "1.3.6.1.2.1.16.15.7.1", false, false, false, true);
                this.nlMatrixDSHighCapacityOverflowPkts = new NlMatrixDSHighCapacityOverflowPktsEnt(mib, this);
                this.nlMatrixDSHighCapacityPkts = new NlMatrixDSHighCapacityPktsEnt(mib, this);
                this.nlMatrixDSHighCapacityOverflowOctets = new NlMatrixDSHighCapacityOverflowOctetsEnt(mib, this);
                this.nlMatrixDSHighCapacityOctets = new NlMatrixDSHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixDSHighCapacityOverflowPkts,
                    this.nlMatrixDSHighCapacityPkts,
                    this.nlMatrixDSHighCapacityOverflowOctets,
                    this.nlMatrixDSHighCapacityOctets
                };
            }
            public static final class NlMatrixDSHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixDSHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixDSHighCapacityOverflowPkts", "1.3.6.1.2.1.16.15.7.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixDSHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixDSHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixDSHighCapacityPkts", "1.3.6.1.2.1.16.15.7.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixDSHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixDSHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixDSHighCapacityOverflowOctets", "1.3.6.1.2.1.16.15.7.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixDSHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixDSHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixDSHighCapacityOctets", "1.3.6.1.2.1.16.15.7.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class NlMatrixTopNHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final NlMatrixTopNHighCapacityEntryEnt nlMatrixTopNHighCapacityEntry;

        private NlMatrixTopNHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "nlMatrixTopNHighCapacityTable", "1.3.6.1.2.1.16.15.8", false, true, false, false);
            this.nlMatrixTopNHighCapacityEntry = new NlMatrixTopNHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.nlMatrixTopNHighCapacityEntry
            };
        }
        public static final class NlMatrixTopNHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final NlMatrixTopNHighCapacityProtocolDirLocalIndexEnt nlMatrixTopNHighCapacityProtocolDirLocalIndex;

            public final NlMatrixTopNHighCapacitySourceAddressEnt nlMatrixTopNHighCapacitySourceAddress;

            public final NlMatrixTopNHighCapacityDestAddressEnt nlMatrixTopNHighCapacityDestAddress;

            public final NlMatrixTopNHighCapacityBasePktRateEnt nlMatrixTopNHighCapacityBasePktRate;

            public final NlMatrixTopNHighCapacityOverflowPktRateEnt nlMatrixTopNHighCapacityOverflowPktRate;

            public final NlMatrixTopNHighCapacityPktRateEnt nlMatrixTopNHighCapacityPktRate;

            public final NlMatrixTopNHighCapacityReverseBasePktRateEnt nlMatrixTopNHighCapacityReverseBasePktRate;

            public final NlMatrixTopNHighCapacityReverseOverflowPktRateEnt nlMatrixTopNHighCapacityReverseOverflowPktRate;

            public final NlMatrixTopNHighCapacityReversePktRateEnt nlMatrixTopNHighCapacityReversePktRate;

            public final NlMatrixTopNHighCapacityBaseOctetRateEnt nlMatrixTopNHighCapacityBaseOctetRate;

            public final NlMatrixTopNHighCapacityOverflowOctetRateEnt nlMatrixTopNHighCapacityOverflowOctetRate;

            public final NlMatrixTopNHighCapacityOctetRateEnt nlMatrixTopNHighCapacityOctetRate;

            public final NlMatrixTopNHighCapacityReverseBaseOctetRateEnt nlMatrixTopNHighCapacityReverseBaseOctetRate;

            public final NlMatrixTopNHighCapacityReverseOverflowOctetRateEnt nlMatrixTopNHighCapacityReverseOverflowOctetRate;

            public final NlMatrixTopNHighCapacityReverseOctetRateEnt nlMatrixTopNHighCapacityReverseOctetRate;

            private NlMatrixTopNHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlMatrixTopNHighCapacityEntry", "1.3.6.1.2.1.16.15.8.1", false, false, false, true);
                this.nlMatrixTopNHighCapacityProtocolDirLocalIndex = new NlMatrixTopNHighCapacityProtocolDirLocalIndexEnt(mib, this);
                this.nlMatrixTopNHighCapacitySourceAddress = new NlMatrixTopNHighCapacitySourceAddressEnt(mib, this);
                this.nlMatrixTopNHighCapacityDestAddress = new NlMatrixTopNHighCapacityDestAddressEnt(mib, this);
                this.nlMatrixTopNHighCapacityBasePktRate = new NlMatrixTopNHighCapacityBasePktRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityOverflowPktRate = new NlMatrixTopNHighCapacityOverflowPktRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityPktRate = new NlMatrixTopNHighCapacityPktRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityReverseBasePktRate = new NlMatrixTopNHighCapacityReverseBasePktRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityReverseOverflowPktRate = new NlMatrixTopNHighCapacityReverseOverflowPktRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityReversePktRate = new NlMatrixTopNHighCapacityReversePktRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityBaseOctetRate = new NlMatrixTopNHighCapacityBaseOctetRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityOverflowOctetRate = new NlMatrixTopNHighCapacityOverflowOctetRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityOctetRate = new NlMatrixTopNHighCapacityOctetRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityReverseBaseOctetRate = new NlMatrixTopNHighCapacityReverseBaseOctetRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityReverseOverflowOctetRate = new NlMatrixTopNHighCapacityReverseOverflowOctetRateEnt(mib, this);
                this.nlMatrixTopNHighCapacityReverseOctetRate = new NlMatrixTopNHighCapacityReverseOctetRateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.nlMatrixTopNHighCapacityProtocolDirLocalIndex,
                    this.nlMatrixTopNHighCapacitySourceAddress,
                    this.nlMatrixTopNHighCapacityDestAddress,
                    this.nlMatrixTopNHighCapacityBasePktRate,
                    this.nlMatrixTopNHighCapacityOverflowPktRate,
                    this.nlMatrixTopNHighCapacityPktRate,
                    this.nlMatrixTopNHighCapacityReverseBasePktRate,
                    this.nlMatrixTopNHighCapacityReverseOverflowPktRate,
                    this.nlMatrixTopNHighCapacityReversePktRate,
                    this.nlMatrixTopNHighCapacityBaseOctetRate,
                    this.nlMatrixTopNHighCapacityOverflowOctetRate,
                    this.nlMatrixTopNHighCapacityOctetRate,
                    this.nlMatrixTopNHighCapacityReverseBaseOctetRate,
                    this.nlMatrixTopNHighCapacityReverseOverflowOctetRate,
                    this.nlMatrixTopNHighCapacityReverseOctetRate
                };
            }
            public static final class NlMatrixTopNHighCapacityProtocolDirLocalIndexEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityProtocolDirLocalIndexEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityProtocolDirLocalIndex", "1.3.6.1.2.1.16.15.8.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacitySourceAddressEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacitySourceAddressEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacitySourceAddress", "1.3.6.1.2.1.16.15.8.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityDestAddressEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityDestAddressEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityDestAddress", "1.3.6.1.2.1.16.15.8.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityBasePktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityBasePktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityBasePktRate", "1.3.6.1.2.1.16.15.8.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityOverflowPktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityOverflowPktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityOverflowPktRate", "1.3.6.1.2.1.16.15.8.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityPktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityPktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityPktRate", "1.3.6.1.2.1.16.15.8.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityReverseBasePktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityReverseBasePktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityReverseBasePktRate", "1.3.6.1.2.1.16.15.8.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityReverseOverflowPktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityReverseOverflowPktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityReverseOverflowPktRate", "1.3.6.1.2.1.16.15.8.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityReversePktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityReversePktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityReversePktRate", "1.3.6.1.2.1.16.15.8.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityBaseOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityBaseOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityBaseOctetRate", "1.3.6.1.2.1.16.15.8.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityOverflowOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityOverflowOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityOverflowOctetRate", "1.3.6.1.2.1.16.15.8.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityOctetRate", "1.3.6.1.2.1.16.15.8.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityReverseBaseOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityReverseBaseOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityReverseBaseOctetRate", "1.3.6.1.2.1.16.15.8.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityReverseOverflowOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityReverseOverflowOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityReverseOverflowOctetRate", "1.3.6.1.2.1.16.15.8.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class NlMatrixTopNHighCapacityReverseOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private NlMatrixTopNHighCapacityReverseOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "nlMatrixTopNHighCapacityReverseOctetRate", "1.3.6.1.2.1.16.15.8.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class AlHostHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final AlHostHighCapacityEntryEnt alHostHighCapacityEntry;

        private AlHostHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "alHostHighCapacityTable", "1.3.6.1.2.1.16.16.2", false, true, false, false);
            this.alHostHighCapacityEntry = new AlHostHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alHostHighCapacityEntry
            };
        }
        public static final class AlHostHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final AlHostHighCapacityInOverflowPktsEnt alHostHighCapacityInOverflowPkts;

            public final AlHostHighCapacityInPktsEnt alHostHighCapacityInPkts;

            public final AlHostHighCapacityOutOverflowPktsEnt alHostHighCapacityOutOverflowPkts;

            public final AlHostHighCapacityOutPktsEnt alHostHighCapacityOutPkts;

            public final AlHostHighCapacityInOverflowOctetsEnt alHostHighCapacityInOverflowOctets;

            public final AlHostHighCapacityInOctetsEnt alHostHighCapacityInOctets;

            public final AlHostHighCapacityOutOverflowOctetsEnt alHostHighCapacityOutOverflowOctets;

            public final AlHostHighCapacityOutOctetsEnt alHostHighCapacityOutOctets;

            private AlHostHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alHostHighCapacityEntry", "1.3.6.1.2.1.16.16.2.1", false, false, false, true);
                this.alHostHighCapacityInOverflowPkts = new AlHostHighCapacityInOverflowPktsEnt(mib, this);
                this.alHostHighCapacityInPkts = new AlHostHighCapacityInPktsEnt(mib, this);
                this.alHostHighCapacityOutOverflowPkts = new AlHostHighCapacityOutOverflowPktsEnt(mib, this);
                this.alHostHighCapacityOutPkts = new AlHostHighCapacityOutPktsEnt(mib, this);
                this.alHostHighCapacityInOverflowOctets = new AlHostHighCapacityInOverflowOctetsEnt(mib, this);
                this.alHostHighCapacityInOctets = new AlHostHighCapacityInOctetsEnt(mib, this);
                this.alHostHighCapacityOutOverflowOctets = new AlHostHighCapacityOutOverflowOctetsEnt(mib, this);
                this.alHostHighCapacityOutOctets = new AlHostHighCapacityOutOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alHostHighCapacityInOverflowPkts,
                    this.alHostHighCapacityInPkts,
                    this.alHostHighCapacityOutOverflowPkts,
                    this.alHostHighCapacityOutPkts,
                    this.alHostHighCapacityInOverflowOctets,
                    this.alHostHighCapacityInOctets,
                    this.alHostHighCapacityOutOverflowOctets,
                    this.alHostHighCapacityOutOctets
                };
            }
            public static final class AlHostHighCapacityInOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityInOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityInOverflowPkts", "1.3.6.1.2.1.16.16.2.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityInPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityInPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityInPkts", "1.3.6.1.2.1.16.16.2.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityOutOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityOutOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityOutOverflowPkts", "1.3.6.1.2.1.16.16.2.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityOutPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityOutPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityOutPkts", "1.3.6.1.2.1.16.16.2.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityInOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityInOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityInOverflowOctets", "1.3.6.1.2.1.16.16.2.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityInOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityInOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityInOctets", "1.3.6.1.2.1.16.16.2.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityOutOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityOutOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityOutOverflowOctets", "1.3.6.1.2.1.16.16.2.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlHostHighCapacityOutOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlHostHighCapacityOutOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alHostHighCapacityOutOctets", "1.3.6.1.2.1.16.16.2.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class AlMatrixSDHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final AlMatrixSDHighCapacityEntryEnt alMatrixSDHighCapacityEntry;

        private AlMatrixSDHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "alMatrixSDHighCapacityTable", "1.3.6.1.2.1.16.17.5", false, true, false, false);
            this.alMatrixSDHighCapacityEntry = new AlMatrixSDHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alMatrixSDHighCapacityEntry
            };
        }
        public static final class AlMatrixSDHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final AlMatrixSDHighCapacityOverflowPktsEnt alMatrixSDHighCapacityOverflowPkts;

            public final AlMatrixSDHighCapacityPktsEnt alMatrixSDHighCapacityPkts;

            public final AlMatrixSDHighCapacityOverflowOctetsEnt alMatrixSDHighCapacityOverflowOctets;

            public final AlMatrixSDHighCapacityOctetsEnt alMatrixSDHighCapacityOctets;

            private AlMatrixSDHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alMatrixSDHighCapacityEntry", "1.3.6.1.2.1.16.17.5.1", false, false, false, true);
                this.alMatrixSDHighCapacityOverflowPkts = new AlMatrixSDHighCapacityOverflowPktsEnt(mib, this);
                this.alMatrixSDHighCapacityPkts = new AlMatrixSDHighCapacityPktsEnt(mib, this);
                this.alMatrixSDHighCapacityOverflowOctets = new AlMatrixSDHighCapacityOverflowOctetsEnt(mib, this);
                this.alMatrixSDHighCapacityOctets = new AlMatrixSDHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixSDHighCapacityOverflowPkts,
                    this.alMatrixSDHighCapacityPkts,
                    this.alMatrixSDHighCapacityOverflowOctets,
                    this.alMatrixSDHighCapacityOctets
                };
            }
            public static final class AlMatrixSDHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixSDHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixSDHighCapacityOverflowPkts", "1.3.6.1.2.1.16.17.5.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixSDHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixSDHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixSDHighCapacityPkts", "1.3.6.1.2.1.16.17.5.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixSDHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixSDHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixSDHighCapacityOverflowOctets", "1.3.6.1.2.1.16.17.5.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixSDHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixSDHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixSDHighCapacityOctets", "1.3.6.1.2.1.16.17.5.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class AlMatrixDSHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final AlMatrixDSHighCapacityEntryEnt alMatrixDSHighCapacityEntry;

        private AlMatrixDSHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "alMatrixDSHighCapacityTable", "1.3.6.1.2.1.16.17.6", false, true, false, false);
            this.alMatrixDSHighCapacityEntry = new AlMatrixDSHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alMatrixDSHighCapacityEntry
            };
        }
        public static final class AlMatrixDSHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final AlMatrixDSHighCapacityOverflowPktsEnt alMatrixDSHighCapacityOverflowPkts;

            public final AlMatrixDSHighCapacityPktsEnt alMatrixDSHighCapacityPkts;

            public final AlMatrixDSHighCapacityOverflowOctetsEnt alMatrixDSHighCapacityOverflowOctets;

            public final AlMatrixDSHighCapacityOctetsEnt alMatrixDSHighCapacityOctets;

            private AlMatrixDSHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alMatrixDSHighCapacityEntry", "1.3.6.1.2.1.16.17.6.1", false, false, false, true);
                this.alMatrixDSHighCapacityOverflowPkts = new AlMatrixDSHighCapacityOverflowPktsEnt(mib, this);
                this.alMatrixDSHighCapacityPkts = new AlMatrixDSHighCapacityPktsEnt(mib, this);
                this.alMatrixDSHighCapacityOverflowOctets = new AlMatrixDSHighCapacityOverflowOctetsEnt(mib, this);
                this.alMatrixDSHighCapacityOctets = new AlMatrixDSHighCapacityOctetsEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixDSHighCapacityOverflowPkts,
                    this.alMatrixDSHighCapacityPkts,
                    this.alMatrixDSHighCapacityOverflowOctets,
                    this.alMatrixDSHighCapacityOctets
                };
            }
            public static final class AlMatrixDSHighCapacityOverflowPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixDSHighCapacityOverflowPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixDSHighCapacityOverflowPkts", "1.3.6.1.2.1.16.17.6.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixDSHighCapacityPktsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixDSHighCapacityPktsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixDSHighCapacityPkts", "1.3.6.1.2.1.16.17.6.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixDSHighCapacityOverflowOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixDSHighCapacityOverflowOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixDSHighCapacityOverflowOctets", "1.3.6.1.2.1.16.17.6.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixDSHighCapacityOctetsEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixDSHighCapacityOctetsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixDSHighCapacityOctets", "1.3.6.1.2.1.16.17.6.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class AlMatrixTopNHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final AlMatrixTopNHighCapacityEntryEnt alMatrixTopNHighCapacityEntry;

        private AlMatrixTopNHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "alMatrixTopNHighCapacityTable", "1.3.6.1.2.1.16.17.7", false, true, false, false);
            this.alMatrixTopNHighCapacityEntry = new AlMatrixTopNHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.alMatrixTopNHighCapacityEntry
            };
        }
        public static final class AlMatrixTopNHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final AlMatrixTopNHighCapacityProtocolDirLocalIndexEnt alMatrixTopNHighCapacityProtocolDirLocalIndex;

            public final AlMatrixTopNHighCapacitySourceAddressEnt alMatrixTopNHighCapacitySourceAddress;

            public final AlMatrixTopNHighCapacityDestAddressEnt alMatrixTopNHighCapacityDestAddress;

            public final AlMatrixTopNHighCapacityAppProtocolDirLocalIndexEnt alMatrixTopNHighCapacityAppProtocolDirLocalIndex;

            public final AlMatrixTopNHighCapacityBasePktRateEnt alMatrixTopNHighCapacityBasePktRate;

            public final AlMatrixTopNHighCapacityOverflowPktRateEnt alMatrixTopNHighCapacityOverflowPktRate;

            public final AlMatrixTopNHighCapacityPktRateEnt alMatrixTopNHighCapacityPktRate;

            public final AlMatrixTopNHighCapacityReverseBasePktRateEnt alMatrixTopNHighCapacityReverseBasePktRate;

            public final AlMatrixTopNHighCapacityReverseOverflowPktRateEnt alMatrixTopNHighCapacityReverseOverflowPktRate;

            public final AlMatrixTopNHighCapacityReversePktRateEnt alMatrixTopNHighCapacityReversePktRate;

            public final AlMatrixTopNHighCapacityBaseOctetRateEnt alMatrixTopNHighCapacityBaseOctetRate;

            public final AlMatrixTopNHighCapacityOverflowOctetRateEnt alMatrixTopNHighCapacityOverflowOctetRate;

            public final AlMatrixTopNHighCapacityOctetRateEnt alMatrixTopNHighCapacityOctetRate;

            public final AlMatrixTopNHighCapacityReverseBaseOctetRateEnt alMatrixTopNHighCapacityReverseBaseOctetRate;

            public final AlMatrixTopNHighCapacityReverseOverflowOctetRateEnt alMatrixTopNHighCapacityReverseOverflowOctetRate;

            public final AlMatrixTopNHighCapacityReverseOctetRateEnt alMatrixTopNHighCapacityReverseOctetRate;

            private AlMatrixTopNHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alMatrixTopNHighCapacityEntry", "1.3.6.1.2.1.16.17.7.1", false, false, false, true);
                this.alMatrixTopNHighCapacityProtocolDirLocalIndex = new AlMatrixTopNHighCapacityProtocolDirLocalIndexEnt(mib, this);
                this.alMatrixTopNHighCapacitySourceAddress = new AlMatrixTopNHighCapacitySourceAddressEnt(mib, this);
                this.alMatrixTopNHighCapacityDestAddress = new AlMatrixTopNHighCapacityDestAddressEnt(mib, this);
                this.alMatrixTopNHighCapacityAppProtocolDirLocalIndex = new AlMatrixTopNHighCapacityAppProtocolDirLocalIndexEnt(mib, this);
                this.alMatrixTopNHighCapacityBasePktRate = new AlMatrixTopNHighCapacityBasePktRateEnt(mib, this);
                this.alMatrixTopNHighCapacityOverflowPktRate = new AlMatrixTopNHighCapacityOverflowPktRateEnt(mib, this);
                this.alMatrixTopNHighCapacityPktRate = new AlMatrixTopNHighCapacityPktRateEnt(mib, this);
                this.alMatrixTopNHighCapacityReverseBasePktRate = new AlMatrixTopNHighCapacityReverseBasePktRateEnt(mib, this);
                this.alMatrixTopNHighCapacityReverseOverflowPktRate = new AlMatrixTopNHighCapacityReverseOverflowPktRateEnt(mib, this);
                this.alMatrixTopNHighCapacityReversePktRate = new AlMatrixTopNHighCapacityReversePktRateEnt(mib, this);
                this.alMatrixTopNHighCapacityBaseOctetRate = new AlMatrixTopNHighCapacityBaseOctetRateEnt(mib, this);
                this.alMatrixTopNHighCapacityOverflowOctetRate = new AlMatrixTopNHighCapacityOverflowOctetRateEnt(mib, this);
                this.alMatrixTopNHighCapacityOctetRate = new AlMatrixTopNHighCapacityOctetRateEnt(mib, this);
                this.alMatrixTopNHighCapacityReverseBaseOctetRate = new AlMatrixTopNHighCapacityReverseBaseOctetRateEnt(mib, this);
                this.alMatrixTopNHighCapacityReverseOverflowOctetRate = new AlMatrixTopNHighCapacityReverseOverflowOctetRateEnt(mib, this);
                this.alMatrixTopNHighCapacityReverseOctetRate = new AlMatrixTopNHighCapacityReverseOctetRateEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.alMatrixTopNHighCapacityProtocolDirLocalIndex,
                    this.alMatrixTopNHighCapacitySourceAddress,
                    this.alMatrixTopNHighCapacityDestAddress,
                    this.alMatrixTopNHighCapacityAppProtocolDirLocalIndex,
                    this.alMatrixTopNHighCapacityBasePktRate,
                    this.alMatrixTopNHighCapacityOverflowPktRate,
                    this.alMatrixTopNHighCapacityPktRate,
                    this.alMatrixTopNHighCapacityReverseBasePktRate,
                    this.alMatrixTopNHighCapacityReverseOverflowPktRate,
                    this.alMatrixTopNHighCapacityReversePktRate,
                    this.alMatrixTopNHighCapacityBaseOctetRate,
                    this.alMatrixTopNHighCapacityOverflowOctetRate,
                    this.alMatrixTopNHighCapacityOctetRate,
                    this.alMatrixTopNHighCapacityReverseBaseOctetRate,
                    this.alMatrixTopNHighCapacityReverseOverflowOctetRate,
                    this.alMatrixTopNHighCapacityReverseOctetRate
                };
            }
            public static final class AlMatrixTopNHighCapacityProtocolDirLocalIndexEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityProtocolDirLocalIndexEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityProtocolDirLocalIndex", "1.3.6.1.2.1.16.17.7.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacitySourceAddressEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacitySourceAddressEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacitySourceAddress", "1.3.6.1.2.1.16.17.7.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityDestAddressEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityDestAddressEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityDestAddress", "1.3.6.1.2.1.16.17.7.1.3", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityAppProtocolDirLocalIndexEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityAppProtocolDirLocalIndexEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityAppProtocolDirLocalIndex", "1.3.6.1.2.1.16.17.7.1.4", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityBasePktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityBasePktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityBasePktRate", "1.3.6.1.2.1.16.17.7.1.5", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityOverflowPktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityOverflowPktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityOverflowPktRate", "1.3.6.1.2.1.16.17.7.1.6", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityPktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityPktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityPktRate", "1.3.6.1.2.1.16.17.7.1.7", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityReverseBasePktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityReverseBasePktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityReverseBasePktRate", "1.3.6.1.2.1.16.17.7.1.8", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityReverseOverflowPktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityReverseOverflowPktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityReverseOverflowPktRate", "1.3.6.1.2.1.16.17.7.1.9", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityReversePktRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityReversePktRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityReversePktRate", "1.3.6.1.2.1.16.17.7.1.10", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityBaseOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityBaseOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityBaseOctetRate", "1.3.6.1.2.1.16.17.7.1.11", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityOverflowOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityOverflowOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityOverflowOctetRate", "1.3.6.1.2.1.16.17.7.1.12", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityOctetRate", "1.3.6.1.2.1.16.17.7.1.13", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityReverseBaseOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityReverseBaseOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityReverseBaseOctetRate", "1.3.6.1.2.1.16.17.7.1.14", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityReverseOverflowOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityReverseOverflowOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityReverseOverflowOctetRate", "1.3.6.1.2.1.16.17.7.1.15", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class AlMatrixTopNHighCapacityReverseOctetRateEnt extends MIBEntry<HCRMONMIBDef>
            {
                private AlMatrixTopNHighCapacityReverseOctetRateEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "alMatrixTopNHighCapacityReverseOctetRate", "1.3.6.1.2.1.16.17.7.1.16", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class UsrHistoryHighCapacityTableEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final UsrHistoryHighCapacityEntryEnt usrHistoryHighCapacityEntry;

        private UsrHistoryHighCapacityTableEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "usrHistoryHighCapacityTable", "1.3.6.1.2.1.16.18.4", false, true, false, false);
            this.usrHistoryHighCapacityEntry = new UsrHistoryHighCapacityEntryEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.usrHistoryHighCapacityEntry
            };
        }
        public static final class UsrHistoryHighCapacityEntryEnt extends MIBEntry<HCRMONMIBDef>
        {
            public final UsrHistoryHighCapacityOverflowAbsValueEnt usrHistoryHighCapacityOverflowAbsValue;

            public final UsrHistoryHighCapacityAbsValueEnt usrHistoryHighCapacityAbsValue;

            private UsrHistoryHighCapacityEntryEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "usrHistoryHighCapacityEntry", "1.3.6.1.2.1.16.18.4.1", false, false, false, true);
                this.usrHistoryHighCapacityOverflowAbsValue = new UsrHistoryHighCapacityOverflowAbsValueEnt(mib, this);
                this.usrHistoryHighCapacityAbsValue = new UsrHistoryHighCapacityAbsValueEnt(mib, this);
                this.entries = new MIBEntry<?>[] {
                    this.usrHistoryHighCapacityOverflowAbsValue,
                    this.usrHistoryHighCapacityAbsValue
                };
            }
            public static final class UsrHistoryHighCapacityOverflowAbsValueEnt extends MIBEntry<HCRMONMIBDef>
            {
                private UsrHistoryHighCapacityOverflowAbsValueEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "usrHistoryHighCapacityOverflowAbsValue", "1.3.6.1.2.1.16.18.4.1.1", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

            public static final class UsrHistoryHighCapacityAbsValueEnt extends MIBEntry<HCRMONMIBDef>
            {
                private UsrHistoryHighCapacityAbsValueEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
                {
                    super(mib, parent, "usrHistoryHighCapacityAbsValue", "1.3.6.1.2.1.16.18.4.1.2", false, false, true, false);
                    this.entries = new MIBEntry<?>[] {

                    };
                }
            }

        }

    }

    public static final class HcRMONCapabilitiesEnt extends MIBEntry<HCRMONMIBDef>
    {
        private HcRMONCapabilitiesEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hcRMONCapabilities", "1.3.6.1.2.1.16.19.16", true, false, false, false);
            this.entries = new MIBEntry<?>[] {

            };
        }
    }

    public static final class HcRmonMIBCompliancesEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final HcMediaIndependentComplianceEnt hcMediaIndependentCompliance;

        public final HcRmon1MIBComplianceEnt hcRmon1MIBCompliance;

        public final HcRmon2MIBComplianceEnt hcRmon2MIBCompliance;

        public final HcRmon2MIBApplicationLayerComplianceEnt hcRmon2MIBApplicationLayerCompliance;

        private HcRmonMIBCompliancesEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hcRmonMIBCompliances", "1.3.6.1.2.1.16.20.6", false, false, false, false);
            this.hcMediaIndependentCompliance = new HcMediaIndependentComplianceEnt(mib, this);
            this.hcRmon1MIBCompliance = new HcRmon1MIBComplianceEnt(mib, this);
            this.hcRmon2MIBCompliance = new HcRmon2MIBComplianceEnt(mib, this);
            this.hcRmon2MIBApplicationLayerCompliance = new HcRmon2MIBApplicationLayerComplianceEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.hcMediaIndependentCompliance,
                this.hcRmon1MIBCompliance,
                this.hcRmon2MIBCompliance,
                this.hcRmon2MIBApplicationLayerCompliance
            };
        }
        public static final class HcMediaIndependentComplianceEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HcMediaIndependentComplianceEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hcMediaIndependentCompliance", "1.3.6.1.2.1.16.20.6.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcRmon1MIBComplianceEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HcRmon1MIBComplianceEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hcRmon1MIBCompliance", "1.3.6.1.2.1.16.20.6.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcRmon2MIBComplianceEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HcRmon2MIBComplianceEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hcRmon2MIBCompliance", "1.3.6.1.2.1.16.20.6.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcRmon2MIBApplicationLayerComplianceEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HcRmon2MIBApplicationLayerComplianceEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hcRmon2MIBApplicationLayerCompliance", "1.3.6.1.2.1.16.20.6.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

    public static final class HcRmonMIBGroupsEnt extends MIBEntry<HCRMONMIBDef>
    {
        public final MediaIndependentGroupEnt mediaIndependentGroup;

        public final EtherStatsHighCapacityGroupEnt etherStatsHighCapacityGroup;

        public final EtherHistoryHighCapacityGroupEnt etherHistoryHighCapacityGroup;

        public final HostHighCapacityGroupEnt hostHighCapacityGroup;

        public final HostTopNHighCapacityGroupEnt hostTopNHighCapacityGroup;

        public final MatrixHighCapacityGroupEnt matrixHighCapacityGroup;

        public final CaptureBufferHighCapacityGroupEnt captureBufferHighCapacityGroup;

        public final ProtocolDistributionHighCapacityGroupEnt protocolDistributionHighCapacityGroup;

        public final NlHostHighCapacityGroupEnt nlHostHighCapacityGroup;

        public final NlMatrixHighCapacityGroupEnt nlMatrixHighCapacityGroup;

        public final NlMatrixTopNHighCapacityGroupEnt nlMatrixTopNHighCapacityGroup;

        public final AlHostHighCapacityGroupEnt alHostHighCapacityGroup;

        public final AlMatrixHighCapacityGroupEnt alMatrixHighCapacityGroup;

        public final AlMatrixTopNHighCapacityGroupEnt alMatrixTopNHighCapacityGroup;

        public final UsrHistoryHighCapacityGroupEnt usrHistoryHighCapacityGroup;

        public final HcRMONInformationGroupEnt hcRMONInformationGroup;

        private HcRmonMIBGroupsEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
        {
            super(mib, parent, "hcRmonMIBGroups", "1.3.6.1.2.1.16.20.7", false, false, false, false);
            this.mediaIndependentGroup = new MediaIndependentGroupEnt(mib, this);
            this.etherStatsHighCapacityGroup = new EtherStatsHighCapacityGroupEnt(mib, this);
            this.etherHistoryHighCapacityGroup = new EtherHistoryHighCapacityGroupEnt(mib, this);
            this.hostHighCapacityGroup = new HostHighCapacityGroupEnt(mib, this);
            this.hostTopNHighCapacityGroup = new HostTopNHighCapacityGroupEnt(mib, this);
            this.matrixHighCapacityGroup = new MatrixHighCapacityGroupEnt(mib, this);
            this.captureBufferHighCapacityGroup = new CaptureBufferHighCapacityGroupEnt(mib, this);
            this.protocolDistributionHighCapacityGroup = new ProtocolDistributionHighCapacityGroupEnt(mib, this);
            this.nlHostHighCapacityGroup = new NlHostHighCapacityGroupEnt(mib, this);
            this.nlMatrixHighCapacityGroup = new NlMatrixHighCapacityGroupEnt(mib, this);
            this.nlMatrixTopNHighCapacityGroup = new NlMatrixTopNHighCapacityGroupEnt(mib, this);
            this.alHostHighCapacityGroup = new AlHostHighCapacityGroupEnt(mib, this);
            this.alMatrixHighCapacityGroup = new AlMatrixHighCapacityGroupEnt(mib, this);
            this.alMatrixTopNHighCapacityGroup = new AlMatrixTopNHighCapacityGroupEnt(mib, this);
            this.usrHistoryHighCapacityGroup = new UsrHistoryHighCapacityGroupEnt(mib, this);
            this.hcRMONInformationGroup = new HcRMONInformationGroupEnt(mib, this);
            this.entries = new MIBEntry<?>[] {
                this.mediaIndependentGroup,
                this.etherStatsHighCapacityGroup,
                this.etherHistoryHighCapacityGroup,
                this.hostHighCapacityGroup,
                this.hostTopNHighCapacityGroup,
                this.matrixHighCapacityGroup,
                this.captureBufferHighCapacityGroup,
                this.protocolDistributionHighCapacityGroup,
                this.nlHostHighCapacityGroup,
                this.nlMatrixHighCapacityGroup,
                this.nlMatrixTopNHighCapacityGroup,
                this.alHostHighCapacityGroup,
                this.alMatrixHighCapacityGroup,
                this.alMatrixTopNHighCapacityGroup,
                this.usrHistoryHighCapacityGroup,
                this.hcRMONInformationGroup
            };
        }
        public static final class MediaIndependentGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private MediaIndependentGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "mediaIndependentGroup", "1.3.6.1.2.1.16.20.7.1", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EtherStatsHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private EtherStatsHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "etherStatsHighCapacityGroup", "1.3.6.1.2.1.16.20.7.2", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class EtherHistoryHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private EtherHistoryHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "etherHistoryHighCapacityGroup", "1.3.6.1.2.1.16.20.7.3", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HostHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HostHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hostHighCapacityGroup", "1.3.6.1.2.1.16.20.7.4", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HostTopNHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HostTopNHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hostTopNHighCapacityGroup", "1.3.6.1.2.1.16.20.7.5", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class MatrixHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private MatrixHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "matrixHighCapacityGroup", "1.3.6.1.2.1.16.20.7.6", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class CaptureBufferHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private CaptureBufferHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "captureBufferHighCapacityGroup", "1.3.6.1.2.1.16.20.7.7", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class ProtocolDistributionHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private ProtocolDistributionHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "protocolDistributionHighCapacityGroup", "1.3.6.1.2.1.16.20.7.8", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class NlHostHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private NlHostHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlHostHighCapacityGroup", "1.3.6.1.2.1.16.20.7.9", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class NlMatrixHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private NlMatrixHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlMatrixHighCapacityGroup", "1.3.6.1.2.1.16.20.7.10", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class NlMatrixTopNHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private NlMatrixTopNHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "nlMatrixTopNHighCapacityGroup", "1.3.6.1.2.1.16.20.7.11", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AlHostHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private AlHostHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alHostHighCapacityGroup", "1.3.6.1.2.1.16.20.7.12", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AlMatrixHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private AlMatrixHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alMatrixHighCapacityGroup", "1.3.6.1.2.1.16.20.7.13", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class AlMatrixTopNHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private AlMatrixTopNHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "alMatrixTopNHighCapacityGroup", "1.3.6.1.2.1.16.20.7.14", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class UsrHistoryHighCapacityGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private UsrHistoryHighCapacityGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "usrHistoryHighCapacityGroup", "1.3.6.1.2.1.16.20.7.15", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

        public static final class HcRMONInformationGroupEnt extends MIBEntry<HCRMONMIBDef>
        {
            private HcRMONInformationGroupEnt(HCRMONMIBDef mib, MIBEntry<HCRMONMIBDef> parent)
            {
                super(mib, parent, "hcRMONInformationGroup", "1.3.6.1.2.1.16.20.7.16", false, false, false, false);
                this.entries = new MIBEntry<?>[] {

                };
            }
        }

    }

}
